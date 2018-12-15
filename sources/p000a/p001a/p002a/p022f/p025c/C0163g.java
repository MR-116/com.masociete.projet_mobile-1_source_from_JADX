package p000a.p001a.p002a.p022f.p025c;

/* renamed from: a.a.a.f.c.g */
final class C0163g {
    /* renamed from: b */
    private static final int f622b = -1;
    /* renamed from: a */
    private final int f623a;
    /* renamed from: c */
    private final int f624c;
    /* renamed from: d */
    private int f625d = -1;
    /* renamed from: e */
    private final int f626e;
    /* renamed from: f */
    private final int f627f;

    C0163g(int i, int i2, int i3, int i4) {
        this.f627f = i;
        this.f623a = i2;
        this.f624c = i3;
        this.f626e = i4;
    }

    /* renamed from: a */
    int m999a() {
        return this.f625d;
    }

    /* renamed from: a */
    void m1000a(int i) {
        this.f625d = i;
    }

    /* renamed from: b */
    int m1001b() {
        return this.f624c;
    }

    /* renamed from: b */
    boolean m1002b(int i) {
        return i != -1 && this.f624c == (i % 3) * 3;
    }

    /* renamed from: c */
    int m1003c() {
        return this.f623a;
    }

    /* renamed from: d */
    int m1004d() {
        return this.f626e;
    }

    /* renamed from: e */
    int m1005e() {
        return this.f623a - this.f627f;
    }

    /* renamed from: f */
    boolean m1006f() {
        return m1002b(this.f625d);
    }

    /* renamed from: g */
    void m1007g() {
        this.f625d = ((this.f626e / 30) * 3) + (this.f624c / 3);
    }

    /* renamed from: h */
    int m1008h() {
        return this.f627f;
    }

    public String toString() {
        return this.f625d + "|" + this.f626e;
    }
}
