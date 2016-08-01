package com.example.khinthirisoe.mvpsampleproject.login;

/**
 * Created by khinthirisoe on 7/28/16.
 */
public class LoginPresenterImpl implements LoginPresenter, LoginInteractor.OnLoginListener {

    LoginInteractor interactor;
    LoginView view;

    public LoginPresenterImpl(LoginView view, LoginInteractor interactor){
        this.view = view;
        this.interactor = interactor;
    }

    @Override
    public void clickSubmit(String username, String password) {
        interactor.onLogin(username,password,this);
    }

    @Override
    public void onLoginSuccess() {
        if(view != null)
            view.LoginSuccess();

    }

    @Override
    public void onLoginFailed() {
        if(view != null)
            view.LoginFailed();
    }
}
