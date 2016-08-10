package com.soubw.jmvp;

/**
 * @author WX_JIN
 * @email wangxiaojin@soubw.com
 * @link http://soubw.com
 */
public interface BaseLayoutI <P extends BasePresenter> {

    int getLayoutId();

    void initView();

    P initPresenter();

    void onPrepared();
}
