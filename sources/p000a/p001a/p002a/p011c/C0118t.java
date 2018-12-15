package p000a.p001a.p002a.p011c;

import java.util.Arrays;
import java.util.Map;
import p000a.p001a.p002a.C0206k;
import p000a.p001a.p002a.C0208m;
import p000a.p001a.p002a.C0210q;
import p000a.p001a.p002a.C0211r;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0214u;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.t */
public abstract class C0118t extends C0091l {
    /* renamed from: a */
    static final int[][] f399a = new int[][]{new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
    /* renamed from: b */
    private static final float f400b = 0.48f;
    /* renamed from: c */
    static final int[] f401c = new int[]{1, 1, 1};
    /* renamed from: d */
    static final int[][] f402d = new int[20][];
    /* renamed from: f */
    static final int[] f403f = new int[]{1, 1, 1, 1, 1};
    /* renamed from: g */
    private static final float f404g = 0.7f;
    /* renamed from: j */
    static final int[] f405j = new int[]{1, 1, 1, 1, 1, 1};
    /* renamed from: e */
    private final bb f406e = new bb();
    /* renamed from: h */
    private final ab f407h = new ab();
    /* renamed from: i */
    private final StringBuilder f408i = new StringBuilder(20);

    static {
        System.arraycopy(f399a, 0, f402d, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr = f399a[i - 10];
            int[] iArr2 = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                iArr2[i2] = iArr[(iArr.length - i2) - 1];
            }
            f402d[i] = iArr2;
        }
    }

    protected C0118t() {
    }

    /* renamed from: a */
    static int m681a(C0185f c0185f, int[] iArr, int i, int[][] iArr2) throws C0213t {
        C0091l.m519b(c0185f, i, iArr);
        float f = f400b;
        int i2 = -1;
        int length = iArr2.length;
        int i3 = 0;
        while (i3 < length) {
            float a = C0091l.m516a(iArr, iArr2[i3], (float) f404g);
            if (a < f) {
                i2 = i3;
            } else {
                a = f;
            }
            i3++;
            f = a;
        }
        if (i2 >= 0) {
            return i2;
        }
        throw C0213t.m1269a();
    }

    /* renamed from: a */
    static int m682a(CharSequence charSequence) throws C0212s {
        int i;
        int length = charSequence.length();
        int i2 = 0;
        for (i = length - 1; i >= 0; i -= 2) {
            int charAt = charSequence.charAt(i) - 48;
            if (charAt < 0 || charAt > 9) {
                try {
                    throw C0212s.m1267a();
                } catch (C0212s e) {
                    throw e;
                }
            }
            i2 += charAt;
        }
        i2 *= 3;
        for (i = length - 2; i >= 0; i -= 2) {
            length = charSequence.charAt(i) - 48;
            if (length < 0 || length > 9) {
                try {
                    throw C0212s.m1267a();
                } catch (C0212s e2) {
                    throw e2;
                }
            }
            i2 += length;
        }
        return (1000 - i2) % 10;
    }

    /* renamed from: a */
    static int[] m683a(C0185f c0185f) throws C0213t {
        int[] iArr = new int[f401c.length];
        int i = 0;
        int[] iArr2 = null;
        boolean z = false;
        while (!z) {
            Arrays.fill(iArr, 0, f401c.length, 0);
            iArr2 = C0118t.m685a(c0185f, i, false, f401c, iArr);
            int i2 = iArr2[0];
            i = iArr2[1];
            int i3 = i2 - (i - i2);
            if (i3 >= 0) {
                z = c0185f.m1142a(i3, i2, false);
            }
        }
        return iArr2;
    }

    /* renamed from: a */
    static int[] m684a(C0185f c0185f, int i, boolean z, int[] iArr) throws C0213t {
        return C0118t.m685a(c0185f, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: a */
    private static int[] m685a(C0185f c0185f, int i, boolean z, int[] iArr, int[] iArr2) throws C0213t {
        int f;
        int a = c0185f.m1136a();
        if (z) {
            try {
                f = c0185f.m1152f(i);
            } catch (C0213t e) {
                throw e;
            }
        }
        f = c0185f.m1143b(i);
        int length = iArr.length;
        int i2 = f;
        int i3 = f;
        int i4 = 0;
        f = z;
        while (i2 < a) {
            try {
                if ((c0185f.m1149c(i2) ^ f) != 0) {
                    iArr2[i4] = iArr2[i4] + 1;
                } else {
                    if (i4 == length - 1) {
                        try {
                            if (C0091l.m516a(iArr2, iArr, (float) f404g) < f400b) {
                                return new int[]{i3, i2};
                            }
                            i3 += iArr2[0] + iArr2[1];
                            System.arraycopy(iArr2, 2, iArr2, 0, length - 2);
                            iArr2[length - 2] = 0;
                            iArr2[length - 1] = 0;
                            i4--;
                        } catch (C0213t e2) {
                            throw e2;
                        }
                    }
                    i4++;
                    try {
                        iArr2[i4] = 1;
                        f = f == 0 ? 1 : 0;
                    } catch (C0213t e22) {
                        throw e22;
                    }
                }
                i2++;
            } catch (C0213t e222) {
                throw e222;
            }
        }
        throw C0213t.m1269a();
    }

    /* renamed from: b */
    static boolean m686b(CharSequence charSequence) throws C0212s {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        try {
            return C0118t.m682a(charSequence.subSequence(0, length + -1)) == Character.digit(charSequence.charAt(length + -1), 10);
        } catch (C0212s e) {
            throw e;
        }
    }

    /* renamed from: a */
    protected abstract int mo23a(C0185f c0185f, int[] iArr, StringBuilder stringBuilder) throws C0213t;

    /* renamed from: a */
    public C0208m mo20a(int i, C0185f c0185f, Map<C0216w, ?> map) throws C0213t, C0211r, C0212s {
        return mo25a(i, c0185f, C0118t.m683a(c0185f), (Map) map);
    }

    /* renamed from: a */
    public C0208m mo25a(int i, C0185f c0185f, int[] iArr, Map<C0216w, ?> map) throws C0213t, C0211r, C0212s {
        C0214u c0214u = map == null ? null : (C0214u) map.get(C0216w.NEED_RESULT_POINT_CALLBACK);
        if (c0214u != null) {
            try {
                c0214u.m1270a(new eb(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i));
            } catch (C0210q e) {
                throw e;
            }
        }
        StringBuilder stringBuilder = this.f408i;
        stringBuilder.setLength(0);
        int a = mo23a(c0185f, iArr, stringBuilder);
        if (c0214u != null) {
            try {
                c0214u.m1270a(new eb((float) a, (float) i));
            } catch (C0210q e2) {
                throw e2;
            }
        }
        int[] a2 = mo27a(c0185f, a);
        if (c0214u != null) {
            try {
                c0214u.m1270a(new eb(((float) (a2[0] + a2[1])) / 2.0f, (float) i));
            } catch (C0210q e22) {
                throw e22;
            }
        }
        int i2 = a2[1];
        int i3 = (i2 - a2[0]) + i2;
        try {
            if (i3 < c0185f.m1136a()) {
                if (c0185f.m1142a(i2, i3, false)) {
                    String stringBuilder2 = stringBuilder.toString();
                    try {
                        if (stringBuilder2.length() < 8) {
                            throw C0212s.m1267a();
                        }
                        try {
                            if (mo26a(stringBuilder2)) {
                                float f = ((float) (iArr[1] + iArr[0])) / 2.0f;
                                float f2 = ((float) (a2[1] + a2[0])) / 2.0f;
                                C0217x b = mo24b();
                                C0208m c0208m = new C0208m(stringBuilder2, null, new eb[]{new eb(f, (float) i), new eb(f2, (float) i)}, b);
                                i2 = 0;
                                try {
                                    C0208m a3 = this.f406e.m595a(i, c0185f, a2[1]);
                                    c0208m.m1252a(C0206k.UPC_EAN_EXTENSION, a3.m1257d());
                                    c0208m.m1253a(a3.m1258e());
                                    c0208m.m1254a(a3.m1256c());
                                    i3 = a3.m1257d().length();
                                } catch (C0210q e3) {
                                    i3 = i2;
                                }
                                a2 = map == null ? null : (int[]) map.get(C0216w.ALLOWED_EAN_EXTENSIONS);
                                if (a2 != null) {
                                    Object obj = null;
                                    for (int i4 : a2) {
                                        if (i3 == i4) {
                                            obj = 1;
                                            break;
                                        }
                                    }
                                    if (obj == null) {
                                        try {
                                            throw C0213t.m1269a();
                                        } catch (C0210q e222) {
                                            throw e222;
                                        }
                                    }
                                }
                                try {
                                    if (b == C0217x.EAN_13 || b == C0217x.UPC_A) {
                                        String a4 = this.f407h.m586a(stringBuilder2);
                                        if (a4 != null) {
                                            try {
                                                c0208m.m1252a(C0206k.POSSIBLE_COUNTRY, a4);
                                            } catch (C0210q e2222) {
                                                throw e2222;
                                            }
                                        }
                                    }
                                    return c0208m;
                                } catch (C0210q e22222) {
                                    throw e22222;
                                }
                            }
                            throw C0211r.m1265a();
                        } catch (C0210q e222222) {
                            throw e222222;
                        }
                    } catch (C0210q e2222222) {
                        throw e2222222;
                    }
                }
            }
            throw C0213t.m1269a();
        } catch (C0210q e22222222) {
            throw e22222222;
        } catch (C0210q e222222222) {
            throw e222222222;
        }
    }

    /* renamed from: a */
    boolean mo26a(String str) throws C0212s {
        return C0118t.m686b(str);
    }

    /* renamed from: a */
    int[] mo27a(C0185f c0185f, int i) throws C0213t {
        return C0118t.m684a(c0185f, i, false, f401c);
    }

    /* renamed from: b */
    abstract C0217x mo24b();
}
