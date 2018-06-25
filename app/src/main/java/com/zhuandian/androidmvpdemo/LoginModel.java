package com.zhuandian.androidmvpdemo;

/**
 * desc :
 * author：xiedong
 * data：2018/6/25
 */
public interface LoginModel {
    void login(String username, String password, OnLoginFinishedListener listener);
}
