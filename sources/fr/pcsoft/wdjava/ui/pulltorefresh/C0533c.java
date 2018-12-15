package fr.pcsoft.wdjava.ui.pulltorefresh;

import android.view.View;

/* renamed from: fr.pcsoft.wdjava.ui.pulltorefresh.c */
public interface C0533c {
    int getStandardViewHeight();

    View getView();

    void onHeightChangedWhilePulling(int i, int i2);

    void onPullToRefresh();

    void onRefreshing();

    void onReleaseToRefresh();

    void release();
}
