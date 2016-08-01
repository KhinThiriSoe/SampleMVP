package com.example.khinthirisoe.mvpsampleproject.detail;

import com.example.khinthirisoe.mvpsampleproject.login.LoginActivity;
import com.example.khinthirisoe.mvpsampleproject.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by khinthirisoe on 7/29/16.
 */
@Singleton
@Component(modules = {DetailModule.class})
public interface DetailComponent {
    void inject(DetailActivity activity);
}

