package p000a.p001a.p002a.p011c;

import java.util.Map;
import p000a.p001a.p002a.C0208m;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.q */
public final class C0115q extends C0091l {
    /* renamed from: a */
    static final int[][] f388a = new int[][]{new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    /* renamed from: b */
    private static final int f389b = 3;
    /* renamed from: c */
    private static final int[] f390c = new int[]{6, 8, 10, 12, 14};
    /* renamed from: d */
    private static final int[] f391d = new int[]{1, 1, 1, 1};
    /* renamed from: e */
    private static final int f392e = 1;
    /* renamed from: f */
    private static final float f393f = 0.38f;
    /* renamed from: g */
    private static final float f394g = 0.78f;
    /* renamed from: h */
    private static final int[] f395h = new int[]{1, 1, 3};
    /* renamed from: i */
    private int f396i = -1;

    /* renamed from: a */
    private static int m669a(int[] iArr) throws C0213t {
        float f = f393f;
        int i = -1;
        int length = f388a.length;
        int i2 = 0;
        while (i2 < length) {
            float a = C0091l.m516a(iArr, f388a[i2], (float) f394g);
            if (a < f) {
                i = i2;
            } else {
                a = f;
            }
            i2++;
            f = a;
        }
        if (i >= 0) {
            return i;
        }
        throw C0213t.m1269a();
    }

    /* renamed from: a */
    private void m670a(C0185f c0185f, int i) throws C0213t {
        int i2 = this.f396i * 10;
        if (i2 >= i) {
            i2 = i;
        }
        int i3 = i2;
        i2 = i - 1;
        while (i3 > 0 && i2 >= 0) {
            try {
                if (c0185f.m1149c(i2)) {
                    break;
                }
                i3--;
                i2--;
            } catch (C0213t e) {
                throw e;
            }
        }
        if (i3 != 0) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e2) {
                throw e2;
            }
        }
    }

    /* renamed from: a */
    private static void m671a(C0185f c0185f, int i, int i2, StringBuilder stringBuilder) throws C0213t {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        int i3 = i;
        while (i3 < i2) {
            int i4;
            C0091l.m519b(c0185f, i3, iArr);
            for (i4 = 0; i4 < 5; i4++) {
                int i5 = i4 * 2;
                iArr2[i4] = iArr[i5];
                iArr3[i4] = iArr[i5 + 1];
            }
            stringBuilder.append((char) (C0115q.m669a(iArr2) + 48));
            stringBuilder.append((char) (C0115q.m669a(iArr3) + 48));
            i4 = i3;
            for (int i6 : iArr) {
                i4 += i6;
            }
            i3 = i4;
        }
    }

    /* renamed from: a */
    private int[] m672a(C0185f c0185f) throws C0213t {
        c0185f.m1153f();
        try {
            int[] c = C0115q.m675c(c0185f, C0115q.m674c(c0185f), f395h);
            m670a(c0185f, c[0]);
            int i = c[0];
            c[0] = c0185f.m1136a() - c[1];
            c[1] = c0185f.m1136a() - i;
            return c;
        } finally {
            c0185f.m1153f();
        }
    }

    /* renamed from: b */
    private int[] m673b(C0185f c0185f) throws C0213t {
        int[] c = C0115q.m675c(c0185f, C0115q.m674c(c0185f), f391d);
        this.f396i = (c[1] - c[0]) / 4;
        m670a(c0185f, c[0]);
        return c;
    }

    /* renamed from: c */
    private static int m674c(C0185f c0185f) throws C0213t {
        int a = c0185f.m1136a();
        int b = c0185f.m1143b(0);
        if (b != a) {
            return b;
        }
        try {
            throw C0213t.m1269a();
        } catch (C0213t e) {
            throw e;
        }
    }

    /* renamed from: c */
    private static int[] m675c(C0185f c0185f, int i, int[] iArr) throws C0213t {
        int length = iArr.length;
        Object obj = new int[length];
        int a = c0185f.m1136a();
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        while (i < a) {
            try {
                int i5;
                if ((c0185f.m1149c(i) ^ i4) != 0) {
                    obj[i3] = obj[i3] + 1;
                    i5 = i4;
                } else {
                    if (i3 == length - 1) {
                        try {
                            if (C0091l.m516a((int[]) obj, iArr, (float) f394g) < f393f) {
                                return new int[]{i2, i};
                            }
                            i2 += obj[0] + obj[1];
                            System.arraycopy(obj, 2, obj, 0, length - 2);
                            obj[length - 2] = null;
                            obj[length - 1] = null;
                            i5 = i3 - 1;
                            i3 = i2;
                        } catch (C0213t e) {
                            throw e;
                        }
                    }
                    i5 = i3 + 1;
                    i3 = i2;
                    try {
                        obj[i5] = 1;
                        int i6 = i3;
                        i3 = i5;
                        i5 = i4 == 0 ? 1 : 0;
                        i2 = i6;
                    } catch (C0213t e2) {
                        throw e2;
                    }
                }
                i++;
                i4 = i5;
            } catch (C0213t e22) {
                throw e22;
            }
        }
        throw C0213t.m1269a();
    }

    /* renamed from: a */
    public C0208m mo20a(int i, C0185f c0185f, Map<C0216w, ?> map) throws C0212s, C0213t {
        int i2;
        int[] b = m673b(c0185f);
        int[] a = m672a(c0185f);
        StringBuilder stringBuilder = new StringBuilder(20);
        C0115q.m671a(c0185f, b[1], a[0], stringBuilder);
        String stringBuilder2 = stringBuilder.toString();
        int[] iArr = map != null ? (int[]) map.get(C0216w.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f390c;
        }
        int length = stringBuilder2.length();
        int length2 = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length2) {
            int i5 = iArr[i3];
            if (length == i5) {
                i2 = 1;
                break;
            }
            if (i5 <= i4) {
                i5 = i4;
            }
            i3++;
            i4 = i5;
        }
        i2 = 0;
        if (i2 == 0 && length > i4) {
            i2 = 1;
        }
        if (i2 == 0) {
            try {
                throw C0212s.m1267a();
            } catch (C0212s e) {
                throw e;
            }
        }
        return new C0208m(stringBuilder2, null, new eb[]{new eb((float) b[1], (float) i), new eb((float) a[0], (float) i)}, C0217x.ITF);
    }
}
