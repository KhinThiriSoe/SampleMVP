package com.example.khinthirisoe.mvpsampleproject.main;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by khinthirisoe on 7/28/16.
 */
public class MainInteractorImpl implements MainInteractor {

    @Override
    public void onLoadItems(OnLoadItemsListener listener) {
        List<String> arrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            arrayList.add(i, "Item " + i);
        }
        listener.onLoadItemsSuccess(arrayList);
    }
}
