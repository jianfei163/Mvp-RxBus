package com.jianfei.mvpdemo.bean;

public class Gril {
    private int i;
    private String t;
    private  String th;

    public Gril(int i, String t, String th) {
        this.i = i;
        this.t = t;
        this.th = th;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getTh() {
        return th;
    }

    public void setTh(String th) {
        this.th = th;
    }

    @Override
    public String toString() {
        return "Gril{" +
                "i=" + i +
                ", t='" + t + '\'' +
                ", th='" + th + '\'' +
                '}';
    }
}
