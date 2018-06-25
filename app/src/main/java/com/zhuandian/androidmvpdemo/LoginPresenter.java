package com.zhuandian.androidmvpdemo;

/**
 * desc :
 * author：xiedong
 * data：2018/6/25
 */
public interface LoginPresenter {
    void validateCredentials(String username,String password);
    void onDestroy();
}
