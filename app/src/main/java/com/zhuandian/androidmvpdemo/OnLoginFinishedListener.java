package com.zhuandian.androidmvpdemo;

/**
 * desc :
 * author：xiedong
 * data：2018/6/25
 */
public interface OnLoginFinishedListener {
    void onUserNameError();

    void onPassWordError();

    void onSuccess();
}
