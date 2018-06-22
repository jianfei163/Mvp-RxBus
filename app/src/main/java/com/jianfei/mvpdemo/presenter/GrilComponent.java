package com.jianfei.mvpdemo.presenter;

import com.jianfei.mvpdemo.MainActivity;
import com.jianfei.mvpdemo.dagger.GirlPresenterModule;

import dagger.Component;

@Component(modules = {GirlPresenterModule.class})
public interface GrilComponent {
    void inject(MainActivity mainActivity);
}
