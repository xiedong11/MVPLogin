package com.zhuandian.androidmvpdemo;

/**
 * desc :
 * author：xiedong
 * data：2018/6/25
 */
public class LoginPresenterImpl implements LoginPresenter, OnLoginFinishedListener {

    private LoginView loginView;
    private LoginModel loginModel;

    public LoginPresenterImpl(LoginView loginView, LoginModel loginModel) {
        this.loginView = loginView;
        this.loginModel = loginModel;
    }

    @Override
    public void validateCredentials(String username, String password) {

        if (loginView != null) {
            loginView.showProgress();
        }
        loginModel.login(username, password, this);
    }

    @Override
    public void onDestroy() {
        loginView = null;
    }

    @Override
    public void onUserNameError() {
        if (loginView != null) {
            loginView.setUserNameError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onPassWordError() {
        if (loginView != null) {
            loginView.setPassWordError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onSuccess() {
        if (loginView != null) {
            loginView.jump2MainPage();
        }
    }


}
