package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v4.view.ViewPager.PageTransformer;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetreinterne.r */
public interface C1188r {
    /* renamed from: a */
    void mo3450a(PageTransformer pageTransformer);

    /* renamed from: a */
    void mo3451a(boolean z);

    /* renamed from: a */
    boolean mo3452a();

    int getCurrentItem();

    void setAdapter(PagerAdapter pagerAdapter);

    void setCurrentItem(int i, boolean z);

    void setOffscreenPageLimit(int i);

    void setOnPageChangeListener(OnPageChangeListener onPageChangeListener);
}
