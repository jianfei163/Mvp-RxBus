package com.jianfei.mvpdemo.presenter;

import com.jianfei.mvpdemo.bean.Gril;
import com.jianfei.mvpdemo.bean.User;
import com.jianfei.mvpdemo.databus.RegisterRxBus;
import com.jianfei.mvpdemo.model.IGrilModel;
import com.jianfei.mvpdemo.model.IGrilModelImpl;
import com.jianfei.mvpdemo.view.IGrilView;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GrilPresenter<T extends IGrilView> {

    WeakReference<T> mView;
    IGrilModel iGrilModel = new IGrilModelImpl();

    public GrilPresenter(T view) {
        this.mView = new WeakReference<T>(view);
    }

    public void send(){
        iGrilModel.loadGirlData();
        iGrilModel.loadUserData();
    }

    /**
     * 接受数据类型 ArrayList
     * @param list
     */
    @RegisterRxBus()
    public void getShowGirlsData(ArrayList<Gril> list) {
        mView.get().showGirls(list);
    }
    /**
     * 接受数据类型 LinkedList    返回接受的数据类型必须一致
     * @param list
     */
    @RegisterRxBus()
    public void getShowGirlsData_to(LinkedList<User> list) {
        mView.get().showGirlsTo(list);
    }
}
