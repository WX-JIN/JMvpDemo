package com.soubw.jmvp;

/**
 * @author WX_JIN
 * @email wangxiaojin@soubw.com
 * @link http://soubw.com
 */
public abstract class BasePresenter<V extends BaseViewI>{

    protected V baseView;

    public BasePresenter(V v) {
        this.baseView = v;
    }

    public void detachView() {
        this.baseView = null;
    }

}
