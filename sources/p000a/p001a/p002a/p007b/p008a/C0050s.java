package p000a.p001a.p002a.p007b.p008a;

import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.b.a.s */
final class C0050s {
    /* renamed from: a */
    private C0049r f134a;
    /* renamed from: b */
    private final C0194n f135b;
    /* renamed from: c */
    private boolean f136c;
    /* renamed from: d */
    private C0032a f137d;

    C0050s(C0194n c0194n) throws C0212s {
        int i = c0194n.m1226i();
        if (i < 21 || (i & 3) != 1) {
            try {
                throw C0212s.m1267a();
            } catch (C0212s e) {
                throw e;
            }
        }
        this.f135b = c0194n;
    }

    /* renamed from: a */
    private int m262a(int i, int i2, int i3) {
        return this.f136c ? this.f135b.m1221d(i2, i) : this.f135b.m1221d(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* renamed from: a */
    C0032a m263a() throws C0212s {
        int i = 0;
        try {
            if (this.f137d != null) {
                return this.f137d;
            }
            int i2;
            int i3 = 0;
            for (i2 = 0; i2 < 6; i2++) {
                i3 = m262a(i2, 8, i3);
            }
            i3 = m262a(8, 7, m262a(8, 8, m262a(7, 8, i3)));
            for (i2 = 5; i2 >= 0; i2--) {
                i3 = m262a(8, i2, i3);
            }
            int i4 = this.f135b.m1226i();
            int i5 = i4 - 7;
            for (i2 = i4 - 1; i2 >= i5; i2--) {
                i = m262a(8, i2, i);
            }
            for (i2 = i4 - 8; i2 < i4; i2++) {
                i = m262a(i2, 8, i);
            }
            try {
                this.f137d = C0032a.m213b(i3, i);
                if (this.f137d != null) {
                    return this.f137d;
                }
                throw C0212s.m1267a();
            } catch (C0212s e) {
                throw e;
            }
        } catch (C0212s e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    void m264a(boolean z) {
        this.f134a = null;
        this.f137d = null;
        this.f136c = z;
    }

    /* renamed from: b */
    void m265b() {
        for (int i = 0; i < this.f135b.m1208a(); i++) {
            for (int i2 = i + 1; i2 < this.f135b.m1226i(); i2++) {
                if (this.f135b.m1221d(i, i2) != this.f135b.m1221d(i2, i)) {
                    this.f135b.m1218c(i2, i);
                    this.f135b.m1218c(i, i2);
                }
            }
        }
    }

    /* renamed from: c */
    void m266c() {
        if (this.f137d != null) {
            C0033b.values()[this.f137d.m216b()].m219a(this.f135b, this.f135b.m1226i());
        }
    }

    /* renamed from: d */
    byte[] m267d() throws C0212s {
        C0032a a = m263a();
        C0049r e = m268e();
        C0033b c0033b = C0033b.values()[a.m216b()];
        int i = this.f135b.m1226i();
        c0033b.m219a(this.f135b, i);
        C0194n a2 = e.m257a();
        byte[] bArr = new byte[e.m260e()];
        int i2 = i - 1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            int i7 = 0;
            while (i7 < i) {
                int i8 = i6 != 0 ? (i - 1) - i7 : i7;
                int i9 = 0;
                while (i9 < 2) {
                    try {
                        if (!a2.m1221d(i2 - i9, i8)) {
                            i3++;
                            i4 <<= 1;
                            if (this.f135b.m1221d(i2 - i9, i8)) {
                                i4 |= 1;
                            }
                            if (i3 == 8) {
                                i3 = i5 + 1;
                                bArr[i5] = (byte) i4;
                                i4 = 0;
                                i5 = i3;
                                i3 = 0;
                            }
                        }
                        i9++;
                    } catch (C0212s e2) {
                        throw e2;
                    }
                }
                i7++;
            }
            i2 -= 2;
            i6 ^= 1;
        }
        try {
            if (i5 == e.m260e()) {
                return bArr;
            }
            throw C0212s.m1267a();
        } catch (C0212s e22) {
            throw e22;
        }
    }

    /* renamed from: e */
    C0049r m268e() throws C0212s {
        try {
            if (this.f134a != null) {
                return this.f134a;
            }
            int i = this.f135b.m1226i();
            int i2 = (i - 17) / 4;
            if (i2 <= 6) {
                try {
                    return C0049r.m252a(i2);
                } catch (C0212s e) {
                    throw e;
                }
            }
            int i3 = i - 11;
            int i4 = 0;
            for (int i5 = 5; i5 >= 0; i5--) {
                for (i2 = i - 9; i2 >= i3; i2--) {
                    i4 = m262a(i2, i5, i4);
                }
            }
            C0049r c = C0049r.m254c(i4);
            if (c != null) {
                try {
                    if (c.m261f() == i) {
                        this.f134a = c;
                        return c;
                    }
                } catch (C0212s e2) {
                    throw e2;
                }
            }
            int i6 = 0;
            for (int i7 = 5; i7 >= 0; i7--) {
                for (i2 = i - 9; i2 >= i3; i2--) {
                    i6 = m262a(i7, i2, i6);
                }
            }
            c = C0049r.m254c(i6);
            if (c != null) {
                try {
                    if (c.m261f() == i) {
                        this.f134a = c;
                        return c;
                    }
                } catch (C0212s e22) {
                    throw e22;
                }
            }
            throw C0212s.m1267a();
        } catch (C0212s e222) {
            throw e222;
        }
    }
}
