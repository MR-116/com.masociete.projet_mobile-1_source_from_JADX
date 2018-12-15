package fr.pcsoft.wdjava.ui.p069g;

import android.os.Handler;
import android.os.SystemClock;
import android.view.animation.LinearInterpolator;
import fr.pcsoft.wdjava.p032m.C0938m;

/* renamed from: fr.pcsoft.wdjava.ui.g.i */
public abstract class C1408i extends LinearInterpolator implements Runnable {
    /* renamed from: a */
    private int f4180a;
    /* renamed from: b */
    private int f4181b;
    /* renamed from: c */
    private long f4182c;
    /* renamed from: d */
    private Handler f4183d;

    public C1408i() {
        this(C1409j.f4188e);
    }

    public C1408i(int i) {
        this.f4182c = 0;
        this.f4181b = 0;
        this.f4180a = 0;
        this.f4183d = C0938m.m6816c();
        m9990b(i);
    }

    /* renamed from: a */
    public void m9986a() {
        m9995g();
        this.f4183d = null;
    }

    /* renamed from: a */
    public final void m9987a(int i) {
        this.f4180a = i;
        if (!m9992d()) {
            m9993e();
            this.f4182c = SystemClock.uptimeMillis();
            this.f4183d.postDelayed(this, (long) this.f4180a);
        }
    }

    /* renamed from: a */
    protected abstract boolean m9988a(float f);

    /* renamed from: b */
    public final int m9989b() {
        return this.f4181b;
    }

    /* renamed from: b */
    public final void m9990b(int i) {
        if (m9992d()) {
            m9995g();
        }
        this.f4181b = C1410k.m9999a(i);
    }

    /* renamed from: c */
    protected void m9991c() {
        this.f4182c = 0;
        this.f4180a = 0;
    }

    /* renamed from: d */
    public final boolean m9992d() {
        return this.f4182c > 0;
    }

    /* renamed from: e */
    protected void m9993e() {
    }

    /* renamed from: f */
    public final boolean m9994f() {
        return this.f4181b > 0;
    }

    /* renamed from: g */
    public final void m9995g() {
        if (m9992d()) {
            this.f4183d.removeCallbacks(this);
            m9991c();
        }
    }

    public void run() {
        if (this.f4180a > 0) {
            this.f4182c = SystemClock.uptimeMillis() - 16;
            this.f4180a = 0;
        }
        float interpolation = getInterpolation(((float) (SystemClock.uptimeMillis() - this.f4182c)) / ((float) this.f4181b));
        if (((double) interpolation) >= 1.0d) {
            m9991c();
        } else if (m9988a(interpolation)) {
            this.f4183d.postDelayed(this, 16);
        } else {
            m9991c();
        }
    }
}
