package com.example.khinthirisoe.mvpsampleproject.main;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by khinthirisoe on 7/28/16.
 */
@Singleton
@Component(modules = {MainModule.class})
public interface MainComponent {
    void inject(MainActivity activity);
}
