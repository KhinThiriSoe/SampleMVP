package com.example.khinthirisoe.mvpsampleproject.detail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.khinthirisoe.mvpsampleproject.R;
import com.example.khinthirisoe.mvpsampleproject.main.DaggerMainComponent;
import com.example.khinthirisoe.mvpsampleproject.main.MainModule;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity implements DetailView {

    @BindView(R.id.list_item)
    TextView listitem;

    @Inject
    DetailPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        int position = intent.getIntExtra("item",0);

        DaggerDetailComponent.builder()
                .detailModule(new DetailModule(this))
                .build().inject(this);

        setContentView(R.layout.activity_detail);

        ButterKnife.bind(this);

        presenter.loadItem(position);
    }

    @Override
    public void loadItemSuccess(int position) {
        listitem.setText(String.valueOf(position));
    }

    @Override
    public void loadItemFailed(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}
