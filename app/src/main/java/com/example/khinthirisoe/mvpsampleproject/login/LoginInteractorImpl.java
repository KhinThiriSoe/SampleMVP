package com.example.khinthirisoe.mvpsampleproject.login;

/**
 * Created by khinthirisoe on 7/28/16.
 */
public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void onLogin(String username, String password, OnLoginListener listener) {
        if (username.equals("thiri") && password.equals("123"))
            listener.onLoginSuccess();
        else
            listener.onLoginFailed();
    }
}
