package p000a.p001a.p002a.p003a.p006c;

/* renamed from: a.a.a.a.c.a */
final class C0018a {
    /* renamed from: a */
    private final int f63a;
    /* renamed from: b */
    private final C0025h[] f64b;

    private C0018a(int i, C0025h c0025h) {
        this.f63a = i;
        this.f64b = new C0025h[]{c0025h};
    }

    private C0018a(int i, C0025h c0025h, C0025h c0025h2) {
        this.f63a = i;
        this.f64b = new C0025h[]{c0025h, c0025h2};
    }

    C0018a(int i, C0025h c0025h, C0025h c0025h2, C0026i c0026i) {
        this(i, c0025h, c0025h2);
    }

    C0018a(int i, C0025h c0025h, C0026i c0026i) {
        this(i, c0025h);
    }

    /* renamed from: a */
    C0025h[] m130a() {
        return this.f64b;
    }

    /* renamed from: b */
    int m131b() {
        return this.f63a;
    }
}
