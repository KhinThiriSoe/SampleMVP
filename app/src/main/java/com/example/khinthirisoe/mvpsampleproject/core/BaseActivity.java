package com.example.khinthirisoe.mvpsampleproject.core;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.khinthirisoe.mvpsampleproject.R;

import butterknife.internal.Utils;

/**
 * Created by khinthirisoe on 8/2/16.
 */
public abstract class BaseActivity extends AppCompatActivity implements BaseView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupComponent();
    }

    protected abstract void setupComponent();

    @Override
    public void toast(String message, int duration) {
        Toast.makeText(this,message, duration).show();
    }
}
