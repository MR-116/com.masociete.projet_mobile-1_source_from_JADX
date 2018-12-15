package p000a.p001a.p002a.p015d.p018c;

import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.d.c.f */
final class C0135f extends C0133d {
    /* renamed from: c */
    private final short f458c;
    /* renamed from: d */
    private final short f459d;

    C0135f(C0133d c0133d, int i, int i2) {
        super(c0133d);
        this.f458c = (short) i;
        this.f459d = (short) i2;
    }

    /* renamed from: a */
    void mo28a(C0185f c0185f, byte[] bArr) {
        c0185f.m1138a(this.f458c, this.f459d);
    }

    public String toString() {
        return '<' + Integer.toBinaryString(((this.f458c & ((1 << this.f459d) - 1)) | (1 << this.f459d)) | (1 << this.f459d)).substring(1) + '>';
    }
}
