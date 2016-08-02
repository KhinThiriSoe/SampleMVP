package com.example.khinthirisoe.mvpsampleproject.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.khinthirisoe.mvpsampleproject.R;
import com.example.khinthirisoe.mvpsampleproject.core.BaseActivity;
import com.example.khinthirisoe.mvpsampleproject.detail.DetailActivity;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends BaseActivity implements MainView, AdapterView.OnItemClickListener {

    @BindView(R.id.listview)
    ListView listView;

    @Inject
    MainPresenter presenter;

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setupComponent();

        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        listView.setOnItemClickListener(this);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);

        listView.setAdapter(adapter);

        presenter.getItems();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        presenter.clickItem(i);
    }

    @Override
    public void setItems(List<String> items) {
        adapter.clear();
        adapter.addAll(items);
    }

    @Override
    public void startDetailActivity(int position) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("item", position);
        startActivity(intent);
    }

    @Override
    protected void setupComponent() {
        DaggerMainComponent.builder()
                .mainModule(new MainModule(this))
                .build().inject(this);
    }

    @Override
    public void toast(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}
