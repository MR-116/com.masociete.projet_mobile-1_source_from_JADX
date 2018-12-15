package p000a.p001a.p002a.p003a.p006c;

/* renamed from: a.a.a.a.c.e */
final class C0022e {
    /* renamed from: a */
    private final byte[] f75a;
    /* renamed from: b */
    private final int f76b;

    private C0022e(int i, byte[] bArr) {
        this.f76b = i;
        this.f75a = bArr;
    }

    /* renamed from: a */
    static C0022e[] m144a(byte[] bArr, C0020c c0020c) {
        C0018a d = c0020c.m137d();
        C0025h[] a = d.m130a();
        int i = 0;
        for (C0025h a2 : a) {
            i += a2.m161a();
        }
        C0022e[] c0022eArr = new C0022e[i];
        int length = a.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C0025h c0025h = a[i2];
            i = i3;
            i3 = 0;
            while (i3 < c0025h.m161a()) {
                int b = c0025h.m162b();
                int i4 = i + 1;
                c0022eArr[i] = new C0022e(b, new byte[(d.m131b() + b)]);
                i3++;
                i = i4;
            }
            i2++;
            i3 = i;
        }
        int length2 = c0022eArr[0].f75a.length - d.m131b();
        int i5 = length2 - 1;
        length = 0;
        for (i2 = 0; i2 < i5; i2++) {
            i = 0;
            while (i < i3) {
                try {
                    i4 = length + 1;
                    c0022eArr[i].f75a[i2] = bArr[length];
                    i++;
                    length = i4;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        }
        try {
            i = c0020c.m136c() == 24 ? 1 : 0;
            i4 = i != 0 ? 8 : i3;
            i2 = 0;
            while (i2 < i4) {
                try {
                    i5 = length + 1;
                    c0022eArr[i2].f75a[length2 - 1] = bArr[length];
                    i2++;
                    length = i5;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            int length3 = c0022eArr[0].f75a.length;
            i4 = length;
            while (length2 < length3) {
                i2 = 0;
                length = i4;
                while (i2 < i3) {
                    if (i != 0) {
                        try {
                            i4 = (i2 + 8) % i3;
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        }
                    }
                    i4 = i2;
                    i5 = (i == 0 || i4 <= 7) ? length2 : length2 - 1;
                    byte[] bArr2 = c0022eArr[i4].f75a;
                    i4 = length + 1;
                    bArr2[i5] = bArr[length];
                    i2++;
                    length = i4;
                }
                length2++;
                i4 = length;
            }
            try {
                if (i4 == bArr.length) {
                    return c0022eArr;
                }
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    /* renamed from: a */
    byte[] m145a() {
        return this.f75a;
    }

    /* renamed from: b */
    int m146b() {
        return this.f76b;
    }
}
