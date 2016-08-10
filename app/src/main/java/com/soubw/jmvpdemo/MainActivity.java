package com.soubw.jmvpdemo;


import android.view.View;
import android.widget.Toast;

import com.soubw.jmvp.BaseActivity;

/**
 * @author WX_JIN on 2016/8/4
 * @email wangxiaojin@soubw.com
 * @link http://soubw.com
 */
public class MainActivity extends BaseActivity<MainPresenter> implements MainViewI {


    @Override
    public int getLayoutId() {
        return R.layout.main_activity;
    }

    @Override
    public void initView() {

    }

    @Override
    public MainPresenter initPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public void onPrepared() {

    }

    public void clickMsg(View view){
        basePresenter.showMsg();
    }

    @Override
    public void onShowText(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
