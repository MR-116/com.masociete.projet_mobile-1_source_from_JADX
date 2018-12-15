package fr.pcsoft.wdjava.ui.utils;

import android.support.v4.view.ViewPager.OnPageChangeListener;

/* renamed from: fr.pcsoft.wdjava.ui.utils.q */
class C1516q implements OnPageChangeListener {
    /* renamed from: a */
    private int f4651a = 0;
    final C1510k this$0;

    C1516q(C1510k c1510k) {
        this.this$0 = c1510k;
    }

    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            int access$100 = this.this$0.m10503r();
            if (this.f4651a < access$100) {
                this.this$0.m10512p();
            } else if (this.f4651a > access$100) {
                this.this$0.m10511o();
            } else {
                return;
            }
            this.this$0.setCurrentItem(access$100, false);
            this.this$0.m10510n();
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        this.f4651a = i;
    }
}
