package fr.pcsoft.wdjava.ui.p069g;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.LinearInterpolator;

/* renamed from: fr.pcsoft.wdjava.ui.g.e */
public class C1203e extends LinearInterpolator {
    /* renamed from: b */
    private static final int f3608b = 8;
    /* renamed from: f */
    private static final int f3609f = 1;
    /* renamed from: g */
    private static final int f3610g = 4;
    /* renamed from: h */
    private static final int f3611h = 2;
    /* renamed from: a */
    private Animation f3612a;
    /* renamed from: c */
    private View f3613c = null;
    /* renamed from: d */
    private int f3614d = 0;
    /* renamed from: e */
    private Drawable f3615e;

    public C1203e(int i, View view) {
        this.f3613c = view;
        this.f3612a = new C1405f(this);
        this.f3612a.setDuration((long) Math.max(10, i));
        this.f3612a.setInterpolator(this);
        this.f3614d = 2;
    }

    /* renamed from: a */
    public void m8527a() {
        if (this.f3612a != null) {
            this.f3612a.cancel();
        }
    }

    /* renamed from: a */
    public final void m8528a(int i) {
        this.f3612a.setDuration((long) i);
    }

    /* renamed from: a */
    public final void m8529a(Drawable drawable) {
        this.f3615e = drawable;
        if (this.f3613c != null) {
            this.f3613c.startAnimation(this.f3612a);
        }
    }

    /* renamed from: a */
    public final void m8530a(AnimationListener animationListener) {
        if (this.f3612a != null) {
            this.f3612a.setAnimationListener(animationListener);
        }
    }

    /* renamed from: a */
    public final void m8531a(boolean z) {
        if (z) {
            this.f3614d |= 8;
        } else {
            this.f3614d &= -9;
        }
    }

    /* renamed from: b */
    public final boolean m8532b() {
        return this.f3612a.getDuration() > 0;
    }

    /* renamed from: c */
    protected void mo3467c() {
    }

    /* renamed from: d */
    public void m8534d() {
        this.f3615e = null;
        this.f3612a = null;
        this.f3613c = null;
    }
}
