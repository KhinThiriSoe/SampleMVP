package com.example.khinthirisoe.mvpsampleproject.detail;

import java.util.List;

/**
 * Created by khinthirisoe on 7/29/16.
 */
public interface DetailInteractor {
    void onGetItemDetail(int item, OnGetItemDetailListener listener);
    interface OnGetItemDetailListener {
        void onGetItemDetailListenerSuccess(int item);
        void onGetItemDetailListenerFailed();
    }
}
