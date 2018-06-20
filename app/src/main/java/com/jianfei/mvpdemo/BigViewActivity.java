package com.jianfei.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jianfei.mvpdemo.view.BigView;

import java.io.IOException;
import java.io.InputStream;

public class BigViewActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_view);


        final BigView bigView = findViewById(R.id.bigview);


        InputStream inputStream = null;
        try {
            inputStream = getAssets().open("length.png");
            bigView.setImage(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
