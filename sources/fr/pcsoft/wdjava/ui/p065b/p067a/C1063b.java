package fr.pcsoft.wdjava.ui.p065b.p067a;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.b */
public final class C1063b {
    /* renamed from: a */
    private float f3073a = 0.0f;
    /* renamed from: b */
    private C1069h f3074b = C1069h.px;

    public C1063b(float f) {
        this.f3073a = f;
    }

    public C1063b(float f, C1069h c1069h) {
        this.f3073a = f;
        this.f3074b = c1069h;
    }

    /* renamed from: a */
    public final float m7604a(float f) {
        switch (C1075o.f3176a[this.f3074b.ordinal()]) {
            case 1:
                return this.f3073a * f;
            case 2:
                return (this.f3073a * f) / 2.54f;
            case 3:
                return (this.f3073a * f) / 25.4f;
            case 4:
                return (this.f3073a * f) / 72.0f;
            case 5:
                return (this.f3073a * f) / 6.0f;
            default:
                return this.f3073a;
        }
    }

    /* renamed from: a */
    public void m7605a() {
        this.f3074b = null;
    }

    /* renamed from: b */
    public final C1069h m7606b() {
        return this.f3074b;
    }

    /* renamed from: c */
    public final float m7607c() {
        return this.f3073a;
    }
}
