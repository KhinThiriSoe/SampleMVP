package com.example.khinthirisoe.mvpsampleproject.main;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by khinthirisoe on 7/28/16.
 */
public class MainPresenterImpl implements MainPresenter, MainInteractor.OnItemLoadListener {

    MainView view;
    MainInteractor interactor;

    List<String> items;

    public MainPresenterImpl(MainView view, MainInteractor interactor){
        this.view = view;
        this.interactor = interactor;
    }

    @Override
    public void loadItem() {
        interactor.onItemLoad(this);
    }

    @Override
    public void clickItem(int position) {
        if(view != null)
            view.moveToDetail(position);
    }

    @Override
    public void onItemLoadSuccess(List<String> items) {
        this.items = items;
        if(view != null)
            view.setItem(items);
    }
}
