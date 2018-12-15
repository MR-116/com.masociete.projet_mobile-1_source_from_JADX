package fr.pcsoft.wdjava.ui.cadre;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;

/* renamed from: fr.pcsoft.wdjava.ui.cadre.k */
public class C1121k extends C1111a {
    /* renamed from: j */
    private GradientDrawable f3424j;

    public C1121k(int i) {
        this.f3424j = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{-1, i});
    }

    /* renamed from: a */
    public void mo3381a(int i) {
    }

    /* renamed from: a */
    public void mo3388a(Canvas canvas, int i, int i2, int i3, int i4) {
    }

    /* renamed from: b */
    public int mo3382b() {
        return 0;
    }

    /* renamed from: b */
    public void mo3383b(Canvas canvas, int i, int i2, int i3, int i4, Path path) {
        this.f3424j.setBounds(i, i2, i + i3, i2 + i4);
        this.f3424j.setAlpha(this.h);
        this.f3424j.draw(canvas);
        if (path != null) {
            path.addRect((float) i, (float) i2, (float) (i + i3), (float) (i2 + i4), Direction.CW);
        }
    }

    /* renamed from: c */
    public void mo3384c(int i) {
    }

    /* renamed from: d */
    public int mo3389d() {
        return 0;
    }

    /* renamed from: d */
    public void mo3385d(int i) {
    }

    /* renamed from: e */
    public C1110m mo3375e() {
        C1121k c1121k = (C1121k) super.mo3375e();
        c1121k.f3424j = this.f3424j != null ? (GradientDrawable) this.f3424j.getConstantState().newDrawable() : null;
        return c1121k;
    }

    /* renamed from: f */
    public boolean mo3376f() {
        return true;
    }

    /* renamed from: h */
    public void mo3386h() {
        this.f3424j = null;
    }

    /* renamed from: i */
    public int mo3390i() {
        return 0;
    }

    /* renamed from: l */
    public int mo3387l() {
        return 0;
    }

    /* renamed from: n */
    public C1110m m8193n() {
        return this;
    }
}
