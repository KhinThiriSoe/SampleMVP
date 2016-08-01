package com.example.khinthirisoe.mvpsampleproject.main;

import dagger.Module;
import dagger.Provides;

/**
 * Created by khinthirisoe on 7/28/16.
 */
@Module
public class MainModule {
    MainView view;

    public MainModule(MainView view) {
        this.view = view;
    }

    @Provides
    public MainInteractor provideMainInteractor() {
        return new MainInteractorImpl();
    }

    @Provides
    public MainPresenter providerMainPresenter(MainInteractor interactor) {
        return new MainPresenterImpl(view, interactor);
    }
}
