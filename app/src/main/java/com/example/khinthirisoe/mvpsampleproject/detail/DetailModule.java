package com.example.khinthirisoe.mvpsampleproject.detail;

import com.example.khinthirisoe.mvpsampleproject.login.LoginInteractor;
import com.example.khinthirisoe.mvpsampleproject.login.LoginInteractorImpl;
import com.example.khinthirisoe.mvpsampleproject.login.LoginPresenter;
import com.example.khinthirisoe.mvpsampleproject.login.LoginPresenterImpl;
import com.example.khinthirisoe.mvpsampleproject.login.LoginView;
import com.example.khinthirisoe.mvpsampleproject.main.MainInteractor;
import com.example.khinthirisoe.mvpsampleproject.main.MainInteractorImpl;
import com.example.khinthirisoe.mvpsampleproject.main.MainPresenter;
import com.example.khinthirisoe.mvpsampleproject.main.MainPresenterImpl;
import com.example.khinthirisoe.mvpsampleproject.main.MainView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by khinthirisoe on 7/29/16.
 */
@Module
public class DetailModule {

    DetailView view;

    public DetailModule(DetailView view) {
        this.view = view;
    }

    @Provides
    public DetailInteractor provideDetailInteractor() {
        return new DetailInteractorImpl();
    }

    @Provides
    public DetailPresenter providerDetailPresenter(DetailInteractor interactor) {
        return new DetailPresenterImpl(view, interactor);
    }
}
