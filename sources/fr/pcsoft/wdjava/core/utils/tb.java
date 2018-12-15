package fr.pcsoft.wdjava.core.utils;

import android.os.Handler;

public abstract class tb extends Handler implements Runnable {
    /* renamed from: a */
    private int f2165a = 0;
    /* renamed from: b */
    private boolean f2166b = false;

    public tb(int i) {
        this.f2165a = i;
    }

    /* renamed from: a */
    public final void m4140a() {
        m4143b(0);
    }

    /* renamed from: a */
    public final void m4141a(int i) {
        this.f2165a = i;
    }

    /* renamed from: b */
    public final int m4142b() {
        return this.f2165a;
    }

    /* renamed from: b */
    public final void m4143b(int i) {
        this.f2166b = true;
        if (i == 0) {
            run();
        } else {
            postDelayed(this, (long) i);
        }
    }

    /* renamed from: c */
    public abstract void mo3675c();

    /* renamed from: d */
    protected void mo3676d() {
    }

    /* renamed from: e */
    public final boolean m4146e() {
        return this.f2166b;
    }

    /* renamed from: f */
    public void m4147f() {
        this.f2166b = false;
        mo3676d();
    }

    public void run() {
        if (this.f2166b) {
            mo3675c();
        }
        if (this.f2166b) {
            postDelayed(this, (long) this.f2165a);
        }
    }
}
