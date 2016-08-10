package com.soubw.jmvp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author WX_JIN
 * @email wangxiaojin@soubw.com
 * @link http://soubw.com
 */
public abstract class BaseFragment<P extends BasePresenter> extends Fragment implements BaseLayoutI<P> {

    protected P basePresenter;

    protected View contentView;

    @Override
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        onCreateView(inflater, container);
        initView();
        basePresenter = initPresenter();
/*        if (null != basePresenter) {
            basePresenter.setActivity(getActivity());
        }*/
        onPrepared();
        return contentView;
    }
    private View onCreateView(LayoutInflater inflater, ViewGroup container) {
        contentView = inflater.inflate(getLayoutId(), container, false);
        return contentView;
    }

    protected final View findViewById(int id) {
        return contentView.findViewById(id);
    }

    public final P getPresenter() {
        return basePresenter;
    }
}
