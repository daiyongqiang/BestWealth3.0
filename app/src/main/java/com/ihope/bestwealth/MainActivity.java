package com.ihope.bestwealth;

import android.os.Bundle;

import com.ihope.bestwealth.ui.BaseActivity;

public class MainActivity extends BaseActivity {

    private MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
