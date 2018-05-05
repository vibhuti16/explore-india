package com.udacity.exploreindia.ui.home;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.udacity.exploreindia.R;
import com.udacity.exploreindia.base.BaseActivity;
import com.udacity.exploreindia.databinding.ActivityHomBinding;
import com.udacity.exploreindia.helper.CustomDialog;

public class HomeActivity extends BaseActivity<HomeContract.Presenter, ActivityHomBinding> implements HomeContract.View {



    @Override
    protected int getContentResource() {
        return R.layout.activity_hom;
    }

    @Override
    protected void init(@Nullable Bundle savedInstanceState) {
        CustomDialog customDialog=new CustomDialog(this);
        customDialog.show();

    }

    @Override
    protected void beforeView(@Nullable Bundle savedInstanceState) {

    }
}