package fr.pcsoft.wdjava.ui.cadre;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.p065b.C1093d;
import fr.pcsoft.wdjava.ui.style.degrade.IWDDegrade;

/* renamed from: fr.pcsoft.wdjava.ui.cadre.c */
public class C1113c extends C1112b {
    /* renamed from: m */
    private int f3405m = 0;
    /* renamed from: n */
    private String f3406n;
    /* renamed from: o */
    private int f3407o = 0;
    /* renamed from: p */
    private Drawable f3408p = null;

    public C1113c(String str, int i, int i2, int i3) {
        super(i);
        this.f3406n = str;
        this.f3405m = i2;
        this.f3407o = i3;
    }

    public C1113c(String str, IWDDegrade iWDDegrade, int i, int i2) {
        super(iWDDegrade);
        this.f3406n = str;
        this.f3405m = i;
        this.f3407o = i2;
    }

    /* renamed from: a */
    private static final Drawable m8126a(String str, int i) {
        Drawable a = C1093d.m7924a(str);
        if (a != null && i > 1 && (a instanceof StateListDrawable)) {
            ((StateListDrawable) a).selectDrawable(Math.min(3, i - 1));
        }
        return a;
    }

    /* renamed from: a */
    public int mo3364a() {
        return super.mo3364a() + m8143s();
    }

    /* renamed from: a */
    public void mo3388a(Canvas canvas, int i, int i2, int i3, int i4) {
    }

    /* renamed from: a */
    public final void m8129a(String str) {
        this.f3408p = null;
        this.f3406n = str;
    }

    /* renamed from: b */
    public int mo3382b() {
        return m8143s();
    }

    /* renamed from: b */
    public void mo3383b(Canvas canvas, int i, int i2, int i3, int i4, Path path) {
        super.mo3383b(canvas, i, i2, i3, i4, path);
        Drawable r = m8142r();
        if (r != null) {
            r.setBounds(i, i2, i + i3, i2 + i4);
            r.setAlpha(this.h);
            r.draw(canvas);
        }
    }

    /* renamed from: c */
    public int mo3374c() {
        return super.mo3374c() + m8143s();
    }

    /* renamed from: c */
    public void mo3384c(int i) {
    }

    /* renamed from: d */
    public int mo3389d() {
        return 0;
    }

    /* renamed from: e */
    public C1110m mo3375e() {
        C1113c c1113c = (C1113c) super.mo3375e();
        c1113c.f3408p = null;
        return c1113c;
    }

    /* renamed from: g */
    public int mo3377g() {
        return super.mo3377g() + m8143s();
    }

    /* renamed from: h */
    public void mo3386h() {
        this.f3408p = null;
    }

    /* renamed from: i */
    public int mo3390i() {
        return 0;
    }

    /* renamed from: m */
    public int mo3380m() {
        return super.mo3380m() + m8143s();
    }

    /* renamed from: o */
    protected boolean mo3391o() {
        return false;
    }

    /* renamed from: q */
    public final String m8141q() {
        return this.f3406n;
    }

    /* renamed from: r */
    public final Drawable m8142r() {
        if (this.f3408p == null && !C0808l.m4053k(this.f3406n)) {
            this.f3408p = C1113c.m8126a(this.f3406n, this.f3405m);
            if (this.f3408p == null) {
                this.f3406n = null;
            }
        }
        return this.f3408p;
    }

    /* renamed from: s */
    public final int m8143s() {
        return this.f3407o;
    }
}
