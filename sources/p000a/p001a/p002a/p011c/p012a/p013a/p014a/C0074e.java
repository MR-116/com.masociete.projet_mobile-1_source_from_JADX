package p000a.p001a.p002a.p011c.p012a.p013a.p014a;

import p000a.p001a.p002a.C0212s;

/* renamed from: a.a.a.c.a.a.a.e */
final class C0074e extends C0071b {
    /* renamed from: b */
    static final int f216b = 10;
    /* renamed from: c */
    private final int f217c;
    /* renamed from: d */
    private final int f218d;

    C0074e(int i, int i2, int i3) throws C0212s {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            try {
                throw C0212s.m1267a();
            } catch (C0212s e) {
                throw e;
            }
        }
        this.f217c = i2;
        this.f218d = i3;
    }

    /* renamed from: b */
    boolean m436b() {
        return this.f218d == 10;
    }

    /* renamed from: c */
    boolean m437c() {
        return this.f217c == 10;
    }

    /* renamed from: d */
    int m438d() {
        return this.f218d;
    }

    /* renamed from: e */
    boolean m439e() {
        return this.f217c == 10 || this.f218d == 10;
    }

    /* renamed from: f */
    int m440f() {
        return this.f217c;
    }

    /* renamed from: g */
    int m441g() {
        return (this.f217c * 10) + this.f218d;
    }
}
