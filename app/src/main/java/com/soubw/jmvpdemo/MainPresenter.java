package com.soubw.jmvpdemo;

import com.soubw.jmvp.BasePresenter;

/**
 * @author WX_JIN on 2016/8/4
 * @email wangxiaojin@soubw.com
 * @link http://soubw.com
 */
public class MainPresenter extends BasePresenter<MainViewI> {

    private MainModelI mainModelI;

    public MainPresenter(MainViewI mainViewI) {
        super(mainViewI);
        mainModelI = new MainModel();
    }

    public void showMsg(){
        baseView.onShowText(mainModelI.initData());
    }

}
