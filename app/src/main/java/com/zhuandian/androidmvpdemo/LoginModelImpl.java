package com.zhuandian.androidmvpdemo;


import android.os.Handler;
import android.text.TextUtils;

/**
 * desc :
 * author：xiedong
 * data：2018/6/25
 */
public class LoginModelImpl implements LoginModel {
    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (TextUtils.isEmpty(username)) {
                    listener.onUserNameError(); //model层里面回调listener
                } else if (TextUtils.isEmpty(password)) {
                    listener.onPassWordError();
                } else {
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}
