package fr.pcsoft.wdjava.ui.gesture;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import fr.pcsoft.wdjava.ui.p069g.C1402b;
import java.lang.ref.WeakReference;

/* renamed from: fr.pcsoft.wdjava.ui.gesture.i */
abstract class C1414i extends ValueAnimator implements AnimatorUpdateListener, C1402b {
    /* renamed from: a */
    protected int f4192a = 0;
    /* renamed from: b */
    private WeakReference<View> f4193b = null;
    /* renamed from: c */
    private boolean f4194c = false;
    final C1290a this$0;

    C1414i(C1290a c1290a, int i) {
        this.this$0 = c1290a;
        this.f4192a = i;
        setDuration(300);
        setInterpolator(new DecelerateInterpolator());
        addUpdateListener(this);
    }

    /* renamed from: a */
    public boolean mo3768a() {
        return this.f4194c;
    }

    /* renamed from: b */
    public final int mo3769b() {
        return this.f4192a;
    }

    public void cancel() {
        this.f4194c = true;
        end();
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        View access$800 = this.this$0.m8993a(this.f4192a, ((Integer) valueAnimator.getAnimatedValue()).intValue());
        View view = this.f4193b != null ? (View) this.f4193b.get() : null;
        if (view != access$800) {
            if (view != null) {
                view.setTranslationX(0.0f);
                if ((this.this$0.f3817P & 8) > 0) {
                    view.setAlpha(1.0f);
                }
            }
            this.f4193b = access$800 != null ? new WeakReference(access$800) : null;
        }
    }
}
