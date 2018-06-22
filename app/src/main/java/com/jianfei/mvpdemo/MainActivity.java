package com.jianfei.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.jianfei.mvpdemo.bean.Gril;
import com.jianfei.mvpdemo.bean.User;
import com.jianfei.mvpdemo.dagger.GirlPresenterModule;
import com.jianfei.mvpdemo.databus.RxBus;
import com.jianfei.mvpdemo.presenter.DaggerGrilComponent;
import com.jianfei.mvpdemo.presenter.GrilPresenter;
import com.jianfei.mvpdemo.view.IGrilView;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements IGrilView {

//    private GrilPresenter<MainActivity> presenter;

    @Inject
     GrilPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        presenter = new GrilPresenter<>(MainActivity.this);

        DaggerGrilComponent.builder()
                .girlPresenterModule(new GirlPresenterModule(this))
                .build()
                .inject(this);

        RxBus.getInstance().register(presenter);


        findViewById(R.id.textview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.send();
            }
        });

    }

    @Override
    public void showGirls(List<Gril> girls) {
        Log.i("test", "girls  " + girls.toString());
    }

    @Override
    public void showGirlsTo(List<User> users) {
        Log.i("test", "users " + users.toString());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        RxBus.getInstance().unRegister(presenter);
    }
}
