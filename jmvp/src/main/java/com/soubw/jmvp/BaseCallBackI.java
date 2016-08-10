package com.soubw.jmvp;

/**
 * @author WX_JIN
 * @email wangxiaojin@soubw.com
 * @link http://soubw.com
 */
public interface BaseCallBackI<T> {

    void onSuccess(T t);

    void onFail(String msg);
}
