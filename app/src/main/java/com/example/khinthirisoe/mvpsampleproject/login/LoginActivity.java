package com.example.khinthirisoe.mvpsampleproject.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.khinthirisoe.mvpsampleproject.BuildConfig;
import com.example.khinthirisoe.mvpsampleproject.R;
import com.example.khinthirisoe.mvpsampleproject.core.BaseActivity;
import com.example.khinthirisoe.mvpsampleproject.core.BaseView;
import com.example.khinthirisoe.mvpsampleproject.main.MainActivity;
import com.example.khinthirisoe.mvpsampleproject.splash.SplashActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends BaseActivity implements LoginView, View.OnClickListener {

    @BindView(R.id.etUserName)
    EditText etUserName;

    @BindView(R.id.etPassword)
    EditText etPassword;

    @BindView(R.id.submit)
    Button btnSubmit;

    @Inject
    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);

        if (BuildConfig.DEBUG) {
            etUserName.setText("thiri");
            etPassword.setText("123");
        }

        btnSubmit.setOnClickListener(this);

    }


    @Override
    protected void setupComponent() {
        DaggerLoginComponent.builder()
                .loginModule(new LoginModule(this))
                .build().inject(this);
    }

    @Override
    public void startMainActivity() {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View view) {
        presenter.clickSubmit(etUserName.getText().toString(), etPassword.getText().toString());
    }

}
