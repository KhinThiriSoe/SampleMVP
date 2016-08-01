package com.example.khinthirisoe.mvpsampleproject.detail;

/**
 * Created by khinthirisoe on 7/29/16.
 */
public class DetailPresenterImpl implements DetailPresenter, DetailInteractor.OnGetItemDetailListener {

    DetailView view;
    DetailInteractor interactor;
    int position;

    public DetailPresenterImpl(DetailView view, DetailInteractor interactor, int position) {
        this.view = view;
        this.interactor = interactor;
        this.position = position;
    }

    @Override
    public void loadItem() {
        interactor.onGetItemDetail(position, this);
    }

    @Override
    public void onGetItemDetailSuccess(int position) {
        if (view != null)
            view.setPositionText(position);

    }

    @Override
    public void onGetItemDetailFailed() {
        if (view != null)
            view.toast("failed item");

    }
}
