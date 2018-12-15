package p000a.p001a.p002a.p003a.p006c;

import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.a.c.g */
final class C0024g {
    /* renamed from: z */
    private static final String f78z = C0024g.m157z(C0024g.m158z("\nB\u0019\u0018\f=B\u001b\u0013B!MT\u001f\u000b:f\u0015\u000f\u000b6\u000b\u0019\b\u0011:\u000b\u0019\u001c\u0016-CT\t\n+\u000b\u0002\u0018\u0010=B\u001b\u0013B=B\u000e\u0018"));
    /* renamed from: a */
    private final C0194n f79a;
    /* renamed from: b */
    private final C0020c f80b;
    /* renamed from: c */
    private final C0194n f81c;

    C0024g(C0194n c0194n) throws C0212s {
        int i = c0194n.m1226i();
        if (i < 8 || i > C0538a.Lb || (i & 1) != 0) {
            try {
                throw C0212s.m1267a();
            } catch (C0212s e) {
                throw e;
            }
        }
        this.f80b = C0024g.m154b(c0194n);
        this.f79a = m150a(c0194n);
        this.f81c = new C0194n(this.f79a.m1208a(), this.f79a.m1226i());
    }

    /* renamed from: a */
    private int m149a(int i, int i2) {
        int i3 = (m151a(i + -3, 0, i, i2) ? 1 : 0) << 1;
        if (m151a(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (m151a(i - 1, 0, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (m151a(0, i2 - 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (m151a(0, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (m151a(1, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (m151a(2, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        return m151a(3, i2 + -1, i, i2) ? i3 | 1 : i3;
    }

    /* renamed from: a */
    private C0194n m150a(C0194n c0194n) {
        int e = this.f80b.m138e();
        int a = this.f80b.m134a();
        try {
            if (c0194n.m1226i() != e) {
                throw new IllegalArgumentException(f78z);
            }
            int f = this.f80b.m139f();
            int g = this.f80b.m140g();
            int i = e / f;
            int i2 = a / g;
            C0194n c0194n2 = new C0194n(i2 * g, i * f);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * f;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * g;
                    for (a = 0; a < f; a++) {
                        int i7 = (((f + 2) * i3) + 1) + a;
                        int i8 = i4 + a;
                        for (e = 0; e < g; e++) {
                            if (c0194n.m1221d((((g + 2) * i5) + 1) + e, i7)) {
                                c0194n2.m1215b(i6 + e, i8);
                            }
                        }
                    }
                }
            }
            return c0194n2;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    private boolean m151a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i < 0) {
            i5 = i + i3;
            i6 = (4 - ((i3 + 4) & 7)) + i2;
        } else {
            i6 = i2;
            i5 = i;
        }
        if (i6 < 0) {
            i6 += i4;
            i5 += 4 - ((i4 + 4) & 7);
        }
        this.f81c.m1215b(i6, i5);
        return this.f79a.m1221d(i6, i5);
    }

    /* renamed from: b */
    private int m152b(int i, int i2) {
        int i3 = (m151a(i + -1, 0, i, i2) ? 1 : 0) << 1;
        if (m151a(i - 1, 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (m151a(i - 1, 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (m151a(0, i2 - 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (m151a(0, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (m151a(1, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (m151a(2, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        return m151a(3, i2 + -1, i, i2) ? i3 | 1 : i3;
    }

    /* renamed from: b */
    private int m153b(int i, int i2, int i3, int i4) {
        int i5 = 0;
        if (m151a(i - 2, i2 - 2, i3, i4)) {
            i5 = 1;
        }
        i5 <<= 1;
        if (m151a(i - 2, i2 - 1, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (m151a(i - 1, i2 - 2, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (m151a(i - 1, i2 - 1, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (m151a(i - 1, i2, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (m151a(i, i2 - 2, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (m151a(i, i2 - 1, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        return m151a(i, i2, i3, i4) ? i5 | 1 : i5;
    }

    /* renamed from: b */
    private static C0020c m154b(C0194n c0194n) throws C0212s {
        return C0020c.m132a(c0194n.m1226i(), c0194n.m1208a());
    }

    /* renamed from: c */
    private int m155c(int i, int i2) {
        int i3 = (m151a(i + -1, 0, i, i2) ? 1 : 0) << 1;
        if (m151a(i - 1, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (m151a(0, i2 - 3, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (m151a(0, i2 - 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (m151a(0, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (m151a(1, i2 - 3, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (m151a(1, i2 - 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        return m151a(1, i2 + -1, i, i2) ? i3 | 1 : i3;
    }

    /* renamed from: d */
    private int m156d(int i, int i2) {
        int i3 = (m151a(i + -3, 0, i, i2) ? 1 : 0) << 1;
        if (m151a(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (m151a(i - 1, 0, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (m151a(0, i2 - 4, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (m151a(0, i2 - 3, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (m151a(0, i2 - 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (m151a(0, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        return m151a(1, i2 + -1, i, i2) ? i3 | 1 : i3;
    }

    /* renamed from: z */
    private static String m157z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 78;
                    break;
                case 1:
                    i2 = 43;
                    break;
                case 2:
                    i2 = 116;
                    break;
                case 3:
                    i2 = 125;
                    break;
                default:
                    i2 = 98;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m158z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 98);
        }
        return toCharArray;
    }

    /* renamed from: a */
    C0020c m159a() {
        return this.f80b;
    }

    /* renamed from: b */
    byte[] m160b() throws C0212s {
        Object obj = null;
        byte[] bArr = new byte[this.f80b.m135b()];
        int i = this.f79a.m1226i();
        int a = this.f79a.m1208a();
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        int i2 = 0;
        int i3 = 4;
        int i4 = 0;
        while (true) {
            int i5;
            if (i3 == i && i2 == 0 && r4 == null) {
                i5 = i4 + 1;
                bArr[i4] = (byte) m152b(i, a);
                int i6 = i2 + 2;
                i2 = i5;
                i5 = i3 - 2;
                i3 = i6;
                obj4 = 1;
            } else if (i3 == i - 2 && i2 == 0 && (a & 3) != 0 && r3 == null) {
                i5 = i4 + 1;
                bArr[i4] = (byte) m156d(i, a);
                int i7 = i2 + 2;
                i2 = i5;
                i5 = i3 - 2;
                i3 = i7;
                i7 = 1;
            } else if (i3 == i + 4 && i2 == 2 && (a & 7) == 0 && r2 == null) {
                i5 = i4 + 1;
                bArr[i4] = (byte) m155c(i, a);
                int i8 = i2 + 2;
                i2 = i5;
                i5 = i3 - 2;
                i3 = i8;
                i8 = 1;
            } else if (i3 == i - 2 && i2 == 0 && (a & 7) == 4 && r0 == null) {
                i5 = i4 + 1;
                bArr[i4] = (byte) m149a(i, a);
                int i9 = i2 + 2;
                i2 = i5;
                i5 = i3 - 2;
                i3 = i9;
                i9 = 1;
            } else {
                i5 = i2;
                int i10 = i3;
                i3 = i4;
                i4 = i10;
                while (true) {
                    if (i4 < i && i5 >= 0) {
                        try {
                            if (!this.f81c.m1221d(i5, i4)) {
                                i2 = i3 + 1;
                                bArr[i3] = (byte) m153b(i4, i5, i, a);
                                i4 -= 2;
                                i3 = i5 + 2;
                                if (i4 < 0 || i3 >= a) {
                                    i4++;
                                    i5 = i3 + 3;
                                    i3 = i2;
                                } else {
                                    i5 = i3;
                                    i3 = i2;
                                }
                            }
                        } catch (C0212s e) {
                            throw e;
                        }
                    }
                    i2 = i3;
                    i4 -= 2;
                    i3 = i5 + 2;
                    if (i4 < 0) {
                        break;
                    }
                    break;
                }
                i4++;
                i5 = i3 + 3;
                i3 = i2;
                while (true) {
                    if (i4 >= 0 && i5 < a) {
                        try {
                            if (!this.f81c.m1221d(i5, i4)) {
                                i2 = i3 + 1;
                                bArr[i3] = (byte) m153b(i4, i5, i, a);
                                i4 += 2;
                                i3 = i5 - 2;
                                if (i4 >= i || i3 < 0) {
                                    i5 = i4 + 3;
                                    i3++;
                                } else {
                                    i5 = i3;
                                    i3 = i2;
                                }
                            }
                        } catch (C0212s e2) {
                            throw e2;
                        }
                    }
                    i2 = i3;
                    i4 += 2;
                    i3 = i5 - 2;
                    if (i4 >= i) {
                        break;
                    }
                    break;
                }
                i5 = i4 + 3;
                i3++;
            }
            if (i5 < i || i3 < a) {
                i4 = i2;
                i2 = i3;
                i3 = i5;
            } else {
                try {
                    break;
                } catch (C0212s e22) {
                    throw e22;
                }
            }
        }
        if (i2 == this.f80b.m135b()) {
            return bArr;
        }
        throw C0212s.m1267a();
    }
}
