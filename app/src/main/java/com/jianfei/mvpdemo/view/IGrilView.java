package com.jianfei.mvpdemo.view;

import com.jianfei.mvpdemo.bean.Gril;
import com.jianfei.mvpdemo.bean.User;

import java.util.List;

public interface IGrilView {
    void showGirls(List<Gril> girls);

    void showGirlsTo(List<User> girls);
}
