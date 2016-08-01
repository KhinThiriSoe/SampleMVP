package com.example.khinthirisoe.mvpsampleproject.main;

import java.util.List;

/**
 * Created by khinthirisoe on 7/28/16.
 */
public interface MainView {
    void setItems(List<String> items);
    void startDetailActivity(int position);
}
