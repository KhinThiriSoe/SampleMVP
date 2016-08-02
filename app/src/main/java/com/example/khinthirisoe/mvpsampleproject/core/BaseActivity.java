package com.example.khinthirisoe.mvpsampleproject.core;

import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.khinthirisoe.mvpsampleproject.R;

import butterknife.internal.Utils;

/**
 * Created by khinthirisoe on 8/2/16.
 */
public abstract class BaseActivity extends AppCompatActivity implements BaseView {

    protected abstract void setupComponent();

}
