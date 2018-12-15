package fr.pcsoft.wdjava.ui.p069g;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import fr.pcsoft.wdjava.p032m.C0938m;

/* renamed from: fr.pcsoft.wdjava.ui.g.h */
public class C1407h extends ValueAnimator implements AnimatorUpdateListener, C1402b {
    /* renamed from: a */
    private int f4175a = -1;
    /* renamed from: b */
    private boolean f4176b = false;
    /* renamed from: c */
    private AbsListView f4177c;
    /* renamed from: d */
    private View f4178d;
    /* renamed from: e */
    private int f4179e = 0;

    public C1407h(AbsListView absListView, int i) {
        this.f4177c = absListView;
        this.f4178d = absListView.getChildAt(i - absListView.getFirstVisiblePosition());
        if (this.f4178d != null) {
            this.f4179e = this.f4178d.getHeight();
        }
        this.f4175a = i;
        setDuration(300);
        addUpdateListener(this);
        setIntValues(new int[]{this.f4179e, 0});
    }

    /* renamed from: a */
    private void m9982a(int i) {
        if (this.f4178d != null && this.f4178d.getParent() != null) {
            LayoutParams layoutParams = this.f4178d.getLayoutParams();
            layoutParams.height = i;
            this.f4178d.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public boolean mo3768a() {
        return this.f4176b;
    }

    /* renamed from: b */
    public final int mo3769b() {
        return this.f4175a;
    }

    /* renamed from: c */
    public final void m9985c() {
        this.f4178d = null;
        this.f4177c = null;
    }

    public void cancel() {
        this.f4176b = true;
        end();
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        m9982a(intValue);
        if (intValue == 0) {
            C0938m.m6816c().post(new C1403c(this));
        }
    }

    public void start() {
        if (this.f4178d == null || this.f4175a == this.f4177c.getCount() - 1) {
            end();
        } else {
            super.start();
        }
    }
}
