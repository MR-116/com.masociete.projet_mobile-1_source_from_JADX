package p000a.p001a.p002a.p015d.p018c;

import p000a.p001a.p002a.p019g.C0185f;
import p000a.p001a.p002a.p019g.C0194n;
import p000a.p001a.p002a.p019g.p029b.C0180c;
import p000a.p001a.p002a.p019g.p029b.C0181d;

/* renamed from: a.a.a.d.c.b */
public final class C0131b {
    /* renamed from: a */
    public static final int f447a = 0;
    /* renamed from: b */
    private static final int[] f448b = new int[]{4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};
    /* renamed from: c */
    public static final int f449c = 33;
    /* renamed from: d */
    private static final int f450d = 4;
    /* renamed from: e */
    private static final int f451e = 32;
    /* renamed from: z */
    private static final String[] f452z = new String[]{C0131b.m782z(C0131b.m783z("E\u001c#\u0000zu\u00128A6`\u000f0\u0004zg\u0012%A;o]\u0016\u001b.d\u001ew\u00025e\u0018")), C0131b.m782z(C0131b.m783z("E\u001c#\u0000zu\u0012w\r;s\u001a2A<n\u000fw\u0014)d\u000fw\u0012*d\u001e>\u00073d\u0019w\r;x\u0018%")), C0131b.m782z(C0131b.m783z("H\u0011;\u0004=`\u0011w\u0017;m\b2Ar]1\u000e(!\u00116\u0018?s\u000e")), C0131b.m782z(C0131b.m783z("T\u0013$\u0014*q\u0012%\u0015?e] \u000e(e]$\b d]"))};

    private C0131b() {
    }

    /* renamed from: a */
    private static int m772a(int i, boolean z) {
        return ((z ? 88 : 112) + (i * 16)) * i;
    }

    /* renamed from: a */
    public static C0130a m773a(byte[] bArr) {
        return C0131b.m774a(bArr, 33, 0);
    }

    /* renamed from: a */
    public static C0130a m774a(byte[] bArr, int i, int i2) {
        int a;
        int i3;
        int i4;
        int i5;
        boolean z;
        C0185f c0185f;
        int i6;
        int i7;
        int i8;
        C0185f a2 = new C0136g(bArr).m800a();
        int a3 = ((a2.m1136a() * i) / 100) + 11;
        int a4 = a2.m1136a() + a3;
        int abs;
        if (i2 != 0) {
            boolean z2 = i2 < 0;
            abs = Math.abs(i2);
            if (abs > (z2 ? 4 : 32)) {
                try {
                    throw new IllegalArgumentException(String.format(f452z[2], new Object[]{Integer.valueOf(i2)}));
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            a = C0131b.m772a(abs, z2);
            i3 = f448b[abs];
            i4 = a - (a % i3);
            C0185f a5 = C0131b.m776a(a2, i3);
            try {
                if (a5.m1136a() + a3 > i4) {
                    throw new IllegalArgumentException(f452z[1]);
                }
                if (z2) {
                    try {
                        if (a5.m1136a() > i3 * 64) {
                            throw new IllegalArgumentException(f452z[1]);
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
                C0185f c0185f2 = a5;
                i5 = i3;
                i3 = a;
                a = abs;
                z = z2;
                c0185f = c0185f2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        i5 = 0;
        c0185f = null;
        abs = 0;
        while (abs <= 32) {
            boolean z3 = abs <= 3;
            a = z3 ? abs + 1 : abs;
            i4 = C0131b.m772a(a, z3);
            if (a4 <= i4) {
                if (i5 != f448b[a]) {
                    i5 = f448b[a];
                    c0185f = C0131b.m776a(a2, i5);
                }
                i6 = i4 - (i4 % i5);
                if (z3) {
                    try {
                        if (c0185f.m1136a() > i5 * 64) {
                            continue;
                        }
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    }
                }
                try {
                    if (c0185f.m1136a() + a3 <= i6) {
                        z = z3;
                        i3 = i4;
                    }
                } catch (IllegalArgumentException e2222) {
                    throw e2222;
                }
            }
            abs++;
        }
        try {
            throw new IllegalArgumentException(f452z[0]);
        } catch (IllegalArgumentException e22222) {
            throw e22222;
        }
        C0185f a6 = C0131b.m777a(c0185f, i3, i5);
        i6 = c0185f.m1136a() / i5;
        C0185f a7 = C0131b.m778a(z, a, i6);
        i5 = (a * 4) + (z ? 11 : 14);
        int[] iArr = new int[i5];
        if (z) {
            i7 = 0;
            while (i7 < iArr.length) {
                try {
                    iArr[i7] = i7;
                    i7++;
                } catch (IllegalArgumentException e222222) {
                    throw e222222;
                }
            }
            i7 = i5;
        } else {
            i7 = (i5 + 1) + ((((i5 / 2) - 1) / 15) * 2);
            i4 = i5 / 2;
            i8 = i7 / 2;
            for (i3 = 0; i3 < i4; i3++) {
                a3 = (i3 / 15) + i3;
                iArr[(i4 - i3) - 1] = (i8 - a3) - 1;
                iArr[i4 + i3] = (a3 + i8) + 1;
            }
        }
        C0194n c0194n = new C0194n(i7);
        i8 = 0;
        for (a3 = 0; a3 < a; a3++) {
            int i9 = ((a - a3) * 4) + (z ? 9 : 12);
            for (i4 = 0; i4 < i9; i4++) {
                int i10 = i4 * 2;
                i3 = 0;
                while (i3 < 2) {
                    try {
                        if (a6.m1149c((i8 + i10) + i3)) {
                            c0194n.m1215b(iArr[(a3 * 2) + i3], iArr[(a3 * 2) + i4]);
                        }
                        try {
                            if (a6.m1149c((((i9 * 2) + i8) + i10) + i3)) {
                                c0194n.m1215b(iArr[(a3 * 2) + i4], iArr[((i5 - 1) - (a3 * 2)) - i3]);
                            }
                            try {
                                if (a6.m1149c((((i9 * 4) + i8) + i10) + i3)) {
                                    c0194n.m1215b(iArr[((i5 - 1) - (a3 * 2)) - i3], iArr[((i5 - 1) - (a3 * 2)) - i4]);
                                }
                                try {
                                    if (a6.m1149c((((i9 * 6) + i8) + i10) + i3)) {
                                        c0194n.m1215b(iArr[((i5 - 1) - (a3 * 2)) - i4], iArr[(a3 * 2) + i3]);
                                    }
                                    i3++;
                                } catch (IllegalArgumentException e2222222) {
                                    throw e2222222;
                                }
                            } catch (IllegalArgumentException e22222222) {
                                throw e22222222;
                            }
                        } catch (IllegalArgumentException e222222222) {
                            throw e222222222;
                        }
                    } catch (IllegalArgumentException e2222222222) {
                        throw e2222222222;
                    }
                }
            }
            i8 = (i9 * 8) + i8;
        }
        try {
            C0131b.m780a(c0194n, z, i7, a7);
            if (z) {
                C0131b.m779a(c0194n, i7 / 2, 5);
            } else {
                C0131b.m779a(c0194n, i7 / 2, 7);
                i4 = 0;
                i3 = 0;
                while (i4 < (i5 / 2) - 1) {
                    i8 = (i7 / 2) & 1;
                    while (i8 < i7) {
                        try {
                            c0194n.m1215b((i7 / 2) - i3, i8);
                            c0194n.m1215b((i7 / 2) + i3, i8);
                            c0194n.m1215b(i8, (i7 / 2) - i3);
                            c0194n.m1215b(i8, (i7 / 2) + i3);
                            i8 += 2;
                        } catch (IllegalArgumentException e22222222222) {
                            throw e22222222222;
                        }
                    }
                    i4 += 15;
                    i3 += 16;
                }
            }
            C0130a c0130a = new C0130a();
            c0130a.m765a(z);
            c0130a.m767b(i7);
            c0130a.m763a(a);
            c0130a.m769c(i6);
            c0130a.m764a(c0194n);
            return c0130a;
        } catch (IllegalArgumentException e222222222222) {
            throw e222222222222;
        }
    }

    /* renamed from: a */
    private static C0180c m775a(int i) {
        switch (i) {
            case 4:
                try {
                    return C0180c.f685j;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case 6:
                return C0180c.f684h;
            case 8:
                return C0180c.f686k;
            case 10:
                return C0180c.f689o;
            case 12:
                return C0180c.f682d;
            default:
                throw new IllegalArgumentException(f452z[3] + i);
        }
    }

    /* renamed from: a */
    static C0185f m776a(C0185f c0185f, int i) {
        C0185f c0185f2 = new C0185f();
        int a = c0185f.m1136a();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < a) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                if (i3 + i5 < a) {
                    try {
                        if (!c0185f.m1149c(i3 + i5)) {
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                i4 |= 1 << ((i - 1) - i5);
            }
            if ((i4 & i2) == i2) {
                try {
                    c0185f2.m1138a(i4 & i2, i);
                    i4 = i3 - 1;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } else if ((i4 & i2) == 0) {
                try {
                    c0185f2.m1138a(i4 | 1, i);
                    i4 = i3 - 1;
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            } else {
                c0185f2.m1138a(i4, i);
                i4 = i3;
            }
            i3 = i4 + i;
        }
        return c0185f2;
    }

    /* renamed from: a */
    private static C0185f m777a(C0185f c0185f, int i, int i2) {
        int i3 = 0;
        int a = c0185f.m1136a() / i2;
        C0181d c0181d = new C0181d(C0131b.m775a(i2));
        int i4 = i / i2;
        int[] b = C0131b.m781b(c0185f, i2, i4);
        c0181d.m1118a(b, i4 - a);
        a = i % i2;
        C0185f c0185f2 = new C0185f();
        c0185f2.m1138a(0, a);
        a = b.length;
        while (i3 < a) {
            c0185f2.m1138a(b[i3], i2);
            i3++;
        }
        return c0185f2;
    }

    /* renamed from: a */
    static C0185f m778a(boolean z, int i, int i2) {
        C0185f c0185f = new C0185f();
        if (z) {
            c0185f.m1138a(i - 1, 2);
            c0185f.m1138a(i2 - 1, 6);
            return C0131b.m777a(c0185f, 28, 4);
        }
        c0185f.m1138a(i - 1, 5);
        c0185f.m1138a(i2 - 1, 11);
        return C0131b.m777a(c0185f, 40, 4);
    }

    /* renamed from: a */
    private static void m779a(C0194n c0194n, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            while (i4 <= i + i3) {
                try {
                    c0194n.m1215b(i4, i - i3);
                    c0194n.m1215b(i4, i + i3);
                    c0194n.m1215b(i - i3, i4);
                    c0194n.m1215b(i + i3, i4);
                    i4++;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        }
        c0194n.m1215b(i - i2, i - i2);
        c0194n.m1215b((i - i2) + 1, i - i2);
        c0194n.m1215b(i - i2, (i - i2) + 1);
        c0194n.m1215b(i + i2, i - i2);
        c0194n.m1215b(i + i2, (i - i2) + 1);
        c0194n.m1215b(i + i2, (i + i2) - 1);
    }

    /* renamed from: a */
    private static void m780a(C0194n c0194n, boolean z, int i, C0185f c0185f) {
        int i2 = 0;
        int i3 = i / 2;
        int i4;
        if (z) {
            while (i2 < 7) {
                i4 = (i3 - 3) + i2;
                try {
                    if (c0185f.m1149c(i2)) {
                        c0194n.m1215b(i4, i3 - 5);
                    }
                    try {
                        if (c0185f.m1149c(i2 + 7)) {
                            c0194n.m1215b(i3 + 5, i4);
                        }
                        try {
                            if (c0185f.m1149c(20 - i2)) {
                                c0194n.m1215b(i4, i3 + 5);
                            }
                            try {
                                if (c0185f.m1149c(27 - i2)) {
                                    c0194n.m1215b(i3 - 5, i4);
                                }
                                i2++;
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                } catch (IllegalArgumentException e222) {
                    throw e222;
                }
            }
            return;
        }
        while (i2 < 10) {
            i4 = ((i3 - 5) + i2) + (i2 / 5);
            try {
                if (c0185f.m1149c(i2)) {
                    c0194n.m1215b(i4, i3 - 7);
                }
                try {
                    if (c0185f.m1149c(i2 + 10)) {
                        c0194n.m1215b(i3 + 7, i4);
                    }
                    try {
                        if (c0185f.m1149c(29 - i2)) {
                            c0194n.m1215b(i4, i3 + 7);
                        }
                        try {
                            if (c0185f.m1149c(39 - i2)) {
                                c0194n.m1215b(i3 - 7, i4);
                            }
                            i2++;
                        } catch (IllegalArgumentException e2222) {
                            throw e2222;
                        }
                    } catch (IllegalArgumentException e22222) {
                        throw e22222;
                    }
                } catch (IllegalArgumentException e222222) {
                    throw e222222;
                }
            } catch (IllegalArgumentException e2222222) {
                throw e2222222;
            }
        }
    }

    /* renamed from: b */
    private static int[] m781b(C0185f c0185f, int i, int i2) {
        int[] iArr = new int[i2];
        int a = c0185f.m1136a() / i;
        for (int i3 = 0; i3 < a; i3++) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i) {
                try {
                    i5 |= c0185f.m1149c((i3 * i) + i4) ? 1 << ((i - i4) - 1) : 0;
                    i4++;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            iArr[i3] = i5;
        }
        return iArr;
    }

    /* renamed from: z */
    private static String m782z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 125;
                    break;
                case 2:
                    i2 = 87;
                    break;
                case 3:
                    i2 = 97;
                    break;
                default:
                    i2 = 90;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m783z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 90);
        }
        return toCharArray;
    }
}
