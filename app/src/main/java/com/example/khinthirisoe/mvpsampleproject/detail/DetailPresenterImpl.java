package com.example.khinthirisoe.mvpsampleproject.detail;

import android.widget.Toast;

import com.example.khinthirisoe.mvpsampleproject.login.LoginInteractor;
import com.example.khinthirisoe.mvpsampleproject.login.LoginView;
import com.example.khinthirisoe.mvpsampleproject.main.MainInteractor;
import com.example.khinthirisoe.mvpsampleproject.main.MainPresenter;

import java.util.List;

/**
 * Created by khinthirisoe on 7/29/16.
 */
public class DetailPresenterImpl implements DetailPresenter, DetailInteractor.OnGetItemDetailListener {

    DetailView view;
    DetailInteractor interactor;

    DetailPresenterImpl(DetailView view, DetailInteractor interactor) {
        this.view = view;
        this.interactor = interactor;
    }

    @Override
    public void loadItem(int position) {
        interactor.onGetItemDetail(position,this);
    }

    @Override
    public void onGetItemDetailListenerSuccess(int position) {
        if(view != null)
            view.loadItemSuccess(position);

    }

    @Override
    public void onGetItemDetailListenerFailed() {
        if(view != null)
            view.loadItemFailed("failed item");

    }
}
