package com.example.khinthirisoe.mvpsampleproject.main;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by khinthirisoe on 7/28/16.
 */
public class MainPresenterImpl implements MainPresenter, MainInteractor.OnLoadItemsListener {

    MainView view;
    MainInteractor interactor;

    List<String> items;

    public MainPresenterImpl(MainView view, MainInteractor interactor) {
        this.view = view;
        this.interactor = interactor;
    }

    @Override
    public void getItems() {
        interactor.onLoadItems(this);
    }

    @Override
    public void clickItem(int position) {
        if (view != null)
            view.startDetailActivity(position);
    }

    @Override
    public void onLoadItemsSuccess(List<String> items) {
        this.items = items;
        if (view != null)
            view.setItems(items);
    }
}
