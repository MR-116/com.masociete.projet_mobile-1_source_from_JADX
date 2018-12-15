package fr.pcsoft.wdjava.core.utils;

/* renamed from: fr.pcsoft.wdjava.core.utils.t */
public class C0816t {
    /* renamed from: a */
    private boolean f2162a = false;
    /* renamed from: b */
    private int f2163b = 0;
    /* renamed from: c */
    private long f2164c = 0;

    public C0816t(int i) {
        this.f2163b = i;
    }

    /* renamed from: a */
    public final int m4134a() {
        return this.f2163b;
    }

    /* renamed from: b */
    public void m4135b() {
        this.f2162a = false;
        this.f2164c = 0;
    }

    /* renamed from: c */
    public void m4136c() {
        if (!this.f2162a) {
            this.f2162a = true;
            this.f2164c = System.currentTimeMillis() - this.f2164c;
        }
    }

    /* renamed from: d */
    public void m4137d() {
        this.f2162a = true;
        this.f2164c = System.currentTimeMillis();
    }

    /* renamed from: e */
    public void m4138e() {
        this.f2164c = m4139f();
        this.f2162a = false;
    }

    /* renamed from: f */
    public long m4139f() {
        return this.f2162a ? System.currentTimeMillis() - this.f2164c : this.f2164c;
    }
}
