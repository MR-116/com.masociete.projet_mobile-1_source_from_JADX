package p000a.p001a.p002a;

/* renamed from: a.a.a.z */
public final class C0218z extends C0031y {
    /* renamed from: c */
    private final C0031y f795c;

    public C0218z(C0031y c0031y) {
        super(c0031y.m197d(), c0031y.m198e());
        this.f795c = c0031y;
    }

    /* renamed from: a */
    public C0031y mo37a() {
        return new C0218z(this.f795c.mo37a());
    }

    /* renamed from: a */
    public C0031y mo12a(int i, int i2, int i3, int i4) {
        return new C0218z(this.f795c.mo12a(i, i2, i3, i4));
    }

    /* renamed from: a */
    public byte[] mo13a(int i, byte[] bArr) {
        byte[] a = this.f795c.mo13a(i, bArr);
        int d = m197d();
        for (int i2 = 0; i2 < d; i2++) {
            a[i2] = (byte) (255 - (a[i2] & 255));
        }
        return a;
    }

    /* renamed from: b */
    public byte[] mo14b() {
        byte[] b = this.f795c.mo14b();
        int e = m198e() * m197d();
        byte[] bArr = new byte[e];
        for (int i = 0; i < e; i++) {
            bArr[i] = (byte) (255 - (b[i] & 255));
        }
        return bArr;
    }

    /* renamed from: c */
    public boolean mo38c() {
        return this.f795c.mo38c();
    }

    /* renamed from: f */
    public C0031y mo39f() {
        return this.f795c;
    }

    /* renamed from: g */
    public C0031y mo40g() {
        return new C0218z(this.f795c.mo40g());
    }

    /* renamed from: h */
    public boolean mo15h() {
        return this.f795c.mo15h();
    }
}
