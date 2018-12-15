package fr.pcsoft.wdjava.ui.actionbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: fr.pcsoft.wdjava.ui.actionbar.k */
class C1044k extends ValueAnimator implements AnimatorUpdateListener {
    final WDActionBar this$0;

    private C1044k(WDActionBar wDActionBar, int i, int i2) {
        this.this$0 = wDActionBar;
        setDuration(200);
        setIntValues(new int[]{i, i2});
        addUpdateListener(this);
        addListener(wDActionBar);
    }

    C1044k(WDActionBar wDActionBar, int i, int i2, C1045l c1045l) {
        this(wDActionBar, i, i2);
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.this$0.setHideOffset(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
