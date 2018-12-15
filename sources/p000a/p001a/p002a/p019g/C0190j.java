package p000a.p001a.p002a.p019g;

import java.lang.reflect.Array;
import p000a.p001a.p002a.C0031y;
import p000a.p001a.p002a.C0188n;
import p000a.p001a.p002a.C0213t;

/* renamed from: a.a.a.g.j */
public final class C0190j extends C0189i {
    /* renamed from: h */
    private static final int f729h = 7;
    /* renamed from: j */
    private static final int f730j = 8;
    /* renamed from: k */
    private static final int f731k = 3;
    /* renamed from: l */
    private static final int f732l = 24;
    /* renamed from: m */
    private static final int f733m = 40;
    /* renamed from: i */
    private C0194n f734i;

    public C0190j(C0031y c0031y) {
        super(c0031y);
    }

    /* renamed from: a */
    private static int m1183a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: a */
    private static void m1184a(byte[] bArr, int i, int i2, int i3, int i4, C0194n c0194n) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    c0194n.m1215b(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    /* renamed from: a */
    private static void m1185a(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, C0194n c0194n) {
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i5 << 3;
            int i7 = i4 - 8;
            if (i6 <= i7) {
                i7 = i6;
            }
            for (int i8 = 0; i8 < i; i8++) {
                i6 = i8 << 3;
                int i9 = i3 - 8;
                if (i6 <= i9) {
                    i9 = i6;
                }
                int a = C0190j.m1183a(i8, 2, i - 3);
                int a2 = C0190j.m1183a(i5, 2, i2 - 3);
                int i10 = 0;
                for (i6 = -2; i6 <= 2; i6++) {
                    int[] iArr2 = iArr[a2 + i6];
                    i10 += iArr2[a + 2] + (((iArr2[a - 2] + iArr2[a - 1]) + iArr2[a]) + iArr2[a + 1]);
                }
                C0190j.m1184a(bArr, i9, i7, i10 / 25, i3, c0194n);
            }
        }
    }

    /* renamed from: a */
    private static int[][] m1186a(byte[] bArr, int i, int i2, int i3, int i4) {
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i2, i});
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i5 << 3;
            int i7 = i4 - 8;
            if (i6 <= i7) {
                i7 = i6;
            }
            int i8 = 0;
            while (i8 < i) {
                int i9 = i8 << 3;
                i6 = i3 - 8;
                if (i9 <= i6) {
                    i6 = i9;
                }
                int i10 = 0;
                int i11 = 255;
                i9 = 0;
                int i12 = 0;
                int i13 = (i7 * i3) + i6;
                while (i12 < 8) {
                    int i14 = 0;
                    while (i14 < 8) {
                        i6 = bArr[i13 + i14] & 255;
                        int i15 = i10 + i6;
                        i10 = i6 < i11 ? i6 : i11;
                        if (i6 <= i9) {
                            i6 = i9;
                        }
                        i14++;
                        i11 = i10;
                        i9 = i6;
                        i10 = i15;
                    }
                    if (i9 - i11 > 24) {
                        i6 = i13 + i3;
                        i13 = i12 + 1;
                        i12 = i10;
                        while (i13 < 8) {
                            i10 = i12;
                            for (i12 = 0; i12 < 8; i12++) {
                                i10 += bArr[i6 + i12] & 255;
                            }
                            i13++;
                            i6 += i3;
                            i12 = i10;
                        }
                    } else {
                        i6 = i13;
                        i13 = i12;
                        i12 = i10;
                    }
                    i10 = i13 + 1;
                    i13 = i6 + i3;
                    int i16 = i10;
                    i10 = i12;
                    i12 = i16;
                }
                i6 = i10 >> 6;
                if (i9 - i11 <= 24) {
                    i9 = i11 / 2;
                    if (i5 > 0 && i8 > 0) {
                        i6 = ((iArr[i5 - 1][i8] + (iArr[i5][i8 - 1] * 2)) + iArr[i5 - 1][i8 - 1]) / 4;
                        if (i11 < i6) {
                        }
                    }
                    i6 = i9;
                }
                iArr[i5][i8] = i6;
                i8++;
            }
        }
        return iArr;
    }

    /* renamed from: a */
    public C0188n mo35a(C0031y c0031y) {
        return new C0190j(c0031y);
    }

    /* renamed from: c */
    public C0194n mo36c() throws C0213t {
        try {
            if (this.f734i != null) {
                return this.f734i;
            }
            C0031y a = m1174a();
            int d = a.m197d();
            int e = a.m198e();
            if (d < 40 || e < 40) {
                this.f734i = super.mo36c();
            } else {
                byte[] b = a.mo14b();
                int i = d >> 3;
                if ((d & 7) != 0) {
                    i++;
                }
                int i2 = e >> 3;
                if ((e & 7) != 0) {
                    i2++;
                }
                int[][] a2 = C0190j.m1186a(b, i, i2, d, e);
                C0194n c0194n = new C0194n(d, e);
                C0190j.m1185a(b, i, i2, d, e, a2, c0194n);
                this.f734i = c0194n;
            }
            return this.f734i;
        } catch (C0213t e2) {
            throw e2;
        }
    }
}
