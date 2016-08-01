package com.example.khinthirisoe.mvpsampleproject.detail;

import com.example.khinthirisoe.mvpsampleproject.main.MainInteractor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khinthirisoe on 7/29/16.
 */
public class DetailInteractorImpl implements DetailInteractor {

    @Override
    public void onGetItemDetail(int item, OnGetItemDetailListener listener) {
        listener.onGetItemDetailSuccess(item);
    }
}
