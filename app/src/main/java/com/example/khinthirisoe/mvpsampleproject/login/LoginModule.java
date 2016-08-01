package com.example.khinthirisoe.mvpsampleproject.login;

import dagger.Module;
import dagger.Provides;

/**
 * Created by khinthirisoe on 7/28/16.
 */
@Module
public class LoginModule {
    LoginView view;

    public LoginModule(LoginView view) {
        this.view = view;
    }

    @Provides
    public LoginInteractor provideLoginInteractor() {
        return new LoginInteractorImpl();
    }

    @Provides
    public LoginPresenter provideLoginPresneter(LoginInteractor interactor) {
        return new LoginPresenterImpl(view, interactor);
    }

}
