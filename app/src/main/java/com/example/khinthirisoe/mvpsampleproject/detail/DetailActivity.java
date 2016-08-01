package com.example.khinthirisoe.mvpsampleproject.detail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.khinthirisoe.mvpsampleproject.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity implements DetailView {

    @BindView(R.id.list_item)
    TextView listItem;

    @Inject
    DetailPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        int position = intent.getIntExtra("item", 0);

        DaggerDetailComponent.builder()
                .detailModule(new DetailModule(this, position))
                .build().inject(this);

        setContentView(R.layout.activity_detail);

        ButterKnife.bind(this);

        presenter.loadItem(position);
    }

    @Override
    public void setPositionText(int position) {
        listItem.setText(String.valueOf(position));
    }

    @Override
    public void toast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }
}
