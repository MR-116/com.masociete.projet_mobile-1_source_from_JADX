package p000a.p001a.p002a.p007b.p008a;

/* renamed from: a.a.a.b.a.l */
public final class C0043l {
    /* renamed from: a */
    private final int f111a;
    /* renamed from: b */
    private final C0044m[] f112b;

    C0043l(int i, C0044m... c0044mArr) {
        this.f111a = i;
        this.f112b = c0044mArr;
    }

    /* renamed from: a */
    public C0044m[] m239a() {
        return this.f112b;
    }

    /* renamed from: b */
    public int m240b() {
        return this.f111a * m242d();
    }

    /* renamed from: c */
    public int m241c() {
        return this.f111a;
    }

    /* renamed from: d */
    public int m242d() {
        int i = 0;
        C0044m[] c0044mArr = this.f112b;
        int i2 = 0;
        while (i < c0044mArr.length) {
            i2 += c0044mArr[i].m244b();
            i++;
        }
        return i2;
    }
}
