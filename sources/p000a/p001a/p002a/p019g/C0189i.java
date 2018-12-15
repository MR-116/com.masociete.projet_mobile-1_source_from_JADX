package p000a.p001a.p002a.p019g;

import p000a.p001a.p002a.C0031y;
import p000a.p001a.p002a.C0188n;
import p000a.p001a.p002a.C0213t;

/* renamed from: a.a.a.g.i */
public class C0189i extends C0188n {
    /* renamed from: b */
    private static final byte[] f723b = new byte[0];
    /* renamed from: e */
    private static final int f724e = 5;
    /* renamed from: f */
    private static final int f725f = 3;
    /* renamed from: g */
    private static final int f726g = 32;
    /* renamed from: c */
    private byte[] f727c = f723b;
    /* renamed from: d */
    private final int[] f728d = new int[32];

    public C0189i(C0031y c0031y) {
        super(c0031y);
    }

    /* renamed from: a */
    private static int m1178a(int[] iArr) throws C0213t {
        int i;
        int i2 = 0;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < length) {
            try {
                if (iArr[i3] > i4) {
                    i4 = iArr[i3];
                    i5 = i3;
                }
                if (iArr[i3] > i6) {
                    i6 = iArr[i3];
                }
                i3++;
            } catch (C0213t e) {
                throw e;
            }
        }
        i3 = 0;
        int i7 = 0;
        while (i2 < length) {
            i4 = i2 - i5;
            i4 *= iArr[i2] * i4;
            if (i4 > i3) {
                i3 = i2;
            } else {
                i4 = i3;
                i3 = i7;
            }
            i2++;
            i7 = i3;
            i3 = i4;
        }
        if (i5 > i7) {
            i = i7;
            i7 = i5;
        } else {
            i = i5;
        }
        try {
            if (i7 - i <= length / 16) {
                throw C0213t.m1269a();
            }
            i2 = i7 - 1;
            i5 = -1;
            i3 = i7 - 1;
            while (i3 > i) {
                i4 = i3 - i;
                i4 = ((i4 * i4) * (i7 - i3)) * (i6 - iArr[i3]);
                if (i4 > i5) {
                    i5 = i3;
                } else {
                    i4 = i5;
                    i5 = i2;
                }
                i3--;
                i2 = i5;
                i5 = i4;
            }
            return i2 << 3;
        } catch (C0213t e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    private void m1179a(int i) {
        if (this.f727c.length < i) {
            this.f727c = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f728d[i2] = 0;
        }
    }

    /* renamed from: a */
    public C0185f mo34a(int i, C0185f c0185f) throws C0213t {
        byte[] a;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 1;
        C0031y a2 = m1174a();
        int d = a2.m197d();
        if (c0185f != null) {
            try {
                if (c0185f.m1136a() >= d) {
                    c0185f.m1147c();
                    m1179a(d);
                    a = a2.mo13a(i, this.f727c);
                    iArr = this.f728d;
                    while (i2 < d) {
                        try {
                            i3 = (a[i2] & 255) >> 3;
                            iArr[i3] = iArr[i3] + 1;
                        } catch (C0213t e) {
                            throw e;
                        }
                    }
                    i3 = C0189i.m1178a(iArr);
                    if (d >= 3) {
                        while (i6 < d) {
                            try {
                                if ((a[i6] & 255) < i3) {
                                    c0185f.m1154g(i6);
                                }
                            } catch (C0213t e2) {
                                throw e2;
                            }
                        }
                    }
                    i4 = a[1] & 255;
                    i5 = a[0] & 255;
                    while (i6 < d - 1) {
                        i2 = a[i6 + 1] & 255;
                        try {
                            if ((((i4 * 4) - i5) - i2) / 2 < i3) {
                                c0185f.m1154g(i6);
                            }
                            i6++;
                            i5 = i4;
                            i4 = i2;
                        } catch (C0213t e22) {
                            throw e22;
                        }
                    }
                    return c0185f;
                }
            } catch (C0213t e222) {
                throw e222;
            }
        }
        c0185f = new C0185f(d);
        m1179a(d);
        a = a2.mo13a(i, this.f727c);
        iArr = this.f728d;
        for (i2 = 0; i2 < d; i2++) {
            i3 = (a[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        i3 = C0189i.m1178a(iArr);
        if (d >= 3) {
            i4 = a[1] & 255;
            i5 = a[0] & 255;
            while (i6 < d - 1) {
                i2 = a[i6 + 1] & 255;
                if ((((i4 * 4) - i5) - i2) / 2 < i3) {
                    c0185f.m1154g(i6);
                }
                i6++;
                i5 = i4;
                i4 = i2;
            }
        } else {
            for (i6 = 0; i6 < d; i6++) {
                if ((a[i6] & 255) < i3) {
                    c0185f.m1154g(i6);
                }
            }
        }
        return c0185f;
    }

    /* renamed from: a */
    public C0188n mo35a(C0031y c0031y) {
        return new C0189i(c0031y);
    }

    /* renamed from: c */
    public C0194n mo36c() throws C0213t {
        int i;
        C0031y a = m1174a();
        int d = a.m197d();
        int e = a.m198e();
        C0194n c0194n = new C0194n(d, e);
        m1179a(d);
        int[] iArr = this.f728d;
        for (i = 1; i < 5; i++) {
            int i2;
            byte[] a2 = a.mo13a((e * i) / 5, this.f727c);
            int i3 = (d * 4) / 5;
            for (i2 = d / 5; i2 < i3; i2++) {
                int i4 = (a2[i2] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int a3 = C0189i.m1178a(iArr);
        byte[] b = a.mo14b();
        for (i = 0; i < e; i++) {
            int i5 = i * d;
            for (i2 = 0; i2 < d; i2++) {
                if ((b[i5 + i2] & 255) < a3) {
                    try {
                        c0194n.m1215b(i2, i);
                    } catch (C0213t e2) {
                        throw e2;
                    }
                }
            }
        }
        return c0194n;
    }
}
