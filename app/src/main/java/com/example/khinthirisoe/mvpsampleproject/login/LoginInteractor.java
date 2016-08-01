package com.example.khinthirisoe.mvpsampleproject.login;

/**
 * Created by khinthirisoe on 7/28/16.
 */
public interface LoginInteractor {
    void onLogin(String username, String password, OnLoginListener listener);

    interface OnLoginListener {
        void onLoginSuccess();

        void onLoginFailed();
    }
}
