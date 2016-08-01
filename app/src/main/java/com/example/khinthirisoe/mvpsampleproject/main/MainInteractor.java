package com.example.khinthirisoe.mvpsampleproject.main;

import java.util.List;

/**
 * Created by khinthirisoe on 7/28/16.
 */
public interface MainInteractor {
    void onItemLoad(OnItemLoadListener listener);

    interface OnItemLoadListener{
        void onItemLoadSuccess(List<String> items);
    }

}
