package com.zhuandian.androidmvpdemo;

/**
 * desc :
 * author：xiedong
 * data：2018/6/25
 */
public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUserNameError();

    void setPassWordError();

    void jump2MainPage();
}
