package com.soubw.jmvp;

import android.os.Handler;
import android.os.Looper;

/**
 * @author WX_JIN
 * @email wangxiaojin@soubw.com
 * @link http://soubw.com
 */
public abstract class BaseUICallBackI<T> implements BaseCallBackI<T> {

    private  BaseViewI baseViewI;

    private Handler handler;

    public BaseUICallBackI(BaseViewI baseViewI) {
        this.baseViewI = baseViewI;
        handler = new Handler(Looper.getMainLooper());
    }

    public void postUISuccess(final T t) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                try {
                    onSuccess(t);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void postUIFail(final String msg) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                try {
                    onFail(msg);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
