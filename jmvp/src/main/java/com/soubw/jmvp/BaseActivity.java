package com.soubw.jmvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author WX_JIN
 * @email wangxiaojin@soubw.com
 * @link http://soubw.com
 */
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements BaseLayoutI<P> {

    protected P basePresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initView();
        basePresenter = initPresenter();
        onPrepared();
    }

    public final P getPresenter() {
        return basePresenter;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        basePresenter.detachView();
    }
}
