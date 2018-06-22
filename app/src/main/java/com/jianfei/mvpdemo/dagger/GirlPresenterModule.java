package com.jianfei.mvpdemo.dagger;


import com.jianfei.mvpdemo.MainActivity;
import com.jianfei.mvpdemo.presenter.GrilPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class GirlPresenterModule {

    private MainActivity mMainActivity;
    public GirlPresenterModule(MainActivity mainActivity) {
        this.mMainActivity = mainActivity;
    }

    @Provides
    public GrilPresenter provideGrilPresenter() {
        return new GrilPresenter(mMainActivity);
    }
}
