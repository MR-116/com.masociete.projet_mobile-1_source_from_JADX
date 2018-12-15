package p000a.p001a.p002a.p007b.p008a;

/* renamed from: a.a.a.b.a.p */
final class C0047p {
    /* renamed from: a */
    private final byte[] f123a;
    /* renamed from: b */
    private final int f124b;

    private C0047p(int i, byte[] bArr) {
        this.f124b = i;
        this.f123a = bArr;
    }

    /* renamed from: a */
    static C0047p[] m247a(byte[] bArr, C0049r c0049r, C0046o c0046o) {
        try {
            if (bArr.length != c0049r.m260e()) {
                throw new IllegalArgumentException();
            }
            int i;
            int i2;
            C0043l a = c0049r.m256a(c0046o);
            C0044m[] a2 = a.m239a();
            int i3 = 0;
            for (C0044m b : a2) {
                i3 += b.m244b();
            }
            C0047p[] c0047pArr = new C0047p[i3];
            int length = a2.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                C0044m c0044m = a2[i4];
                i3 = i5;
                i5 = 0;
                while (i5 < c0044m.m244b()) {
                    int a3 = c0044m.m243a();
                    i = i3 + 1;
                    c0047pArr[i3] = new C0047p(a3, new byte[(a.m241c() + a3)]);
                    i5++;
                    i3 = i;
                }
                i4++;
                i5 = i3;
            }
            i = c0047pArr[0].f123a.length;
            i3 = c0047pArr.length - 1;
            while (i3 >= 0 && c0047pArr[i3].f123a.length != i) {
                i3--;
            }
            length = i3 + 1;
            i -= a.m241c();
            int i6 = 0;
            i3 = 0;
            while (i6 < i) {
                i4 = i3;
                i3 = 0;
                while (i3 < i5) {
                    try {
                        i2 = i4 + 1;
                        c0047pArr[i3].f123a[i6] = bArr[i4];
                        i3++;
                        i4 = i2;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                i6++;
                i3 = i4;
            }
            i4 = length;
            while (i4 < i5) {
                try {
                    i2 = i3 + 1;
                    c0047pArr[i4].f123a[i] = bArr[i3];
                    i4++;
                    i3 = i2;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            int length2 = c0047pArr[0].f123a.length;
            while (i < length2) {
                i4 = 0;
                i2 = i3;
                while (i4 < i5) {
                    i6 = i2 + 1;
                    c0047pArr[i4].f123a[i4 < length ? i : i + 1] = bArr[i2];
                    i4++;
                    i2 = i6;
                }
                i++;
                i3 = i2;
            }
            return c0047pArr;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    byte[] m248a() {
        return this.f123a;
    }

    /* renamed from: b */
    int m249b() {
        return this.f124b;
    }
}
