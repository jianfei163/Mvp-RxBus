package com.jianfei.mvpdemo.model;

import com.jianfei.mvpdemo.R;
import com.jianfei.mvpdemo.bean.Gril;
import com.jianfei.mvpdemo.bean.User;
import com.jianfei.mvpdemo.databus.RxBus;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import io.reactivex.functions.Function;

public class IGrilModelImpl implements IGrilModel {

    @Override
    public void loadGirlData() {
        RxBus.getInstance().chainProcess(new Function() {
            @Override
            public Object apply(Object o) throws Exception {
                /**
                 * 返回数据类型 ArrayList
                 */
                List<Gril> data = new ArrayList<>();
                data.add(new Gril(R.drawable.ic_launcher_background, "girl", "123潮流女个性字母印花无袖露脐上衣"));
                return data;
            }
        });
    }

    @Override
    public void loadUserData() {
        RxBus.getInstance().chainProcess(new Function() {
            @Override
            public Object apply(Object o) throws Exception {
                /**
                 * 返回数据类型 LinkedList
                 */
                List<User> data = new LinkedList<>();
                data.add(new User(R.drawable.ic_launcher_background, "user", "123潮流女个性字母印花无袖露脐上衣"));
                return data;
            }
        });
    }
}
