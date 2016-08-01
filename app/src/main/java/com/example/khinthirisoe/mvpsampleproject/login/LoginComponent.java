package com.example.khinthirisoe.mvpsampleproject.login;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by khinthirisoe on 7/28/16.
 */
@Singleton
@Component(modules = {LoginModule.class})
public interface LoginComponent {
    void inject(LoginActivity activity);
}
