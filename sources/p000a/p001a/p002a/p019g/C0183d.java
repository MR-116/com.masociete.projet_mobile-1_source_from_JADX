package p000a.p001a.p002a.p019g;

import p000a.p001a.p002a.C0213t;

/* renamed from: a.a.a.g.d */
public abstract class C0183d {
    /* renamed from: a */
    private static C0183d f703a = new C0184e();

    /* renamed from: a */
    public static C0183d m1125a() {
        return f703a;
    }

    /* renamed from: a */
    public static void m1126a(C0183d c0183d) {
        f703a = c0183d;
    }

    /* renamed from: a */
    protected static void m1127a(C0194n c0194n, float[] fArr) throws C0213t {
        int a = c0194n.m1208a();
        int i = c0194n.m1226i();
        int i2 = 0;
        Object obj = 1;
        while (i2 < fArr.length && r0 != null) {
            int i3;
            int i4;
            try {
                i3 = (int) fArr[i2];
                i4 = (int) fArr[i2 + 1];
                if (i3 < -1 || i3 > a || i4 < -1 || i4 > i) {
                    try {
                        throw C0213t.m1269a();
                    } catch (C0213t e) {
                        throw e;
                    }
                }
                if (i3 == -1) {
                    fArr[i2] = 0.0f;
                    obj = 1;
                } else if (i3 == a) {
                    fArr[i2] = (float) (a - 1);
                    i3 = 1;
                } else {
                    obj = null;
                }
                if (i4 == -1) {
                    fArr[i2 + 1] = 0.0f;
                    obj = 1;
                } else if (i4 == i) {
                    fArr[i2 + 1] = (float) (i - 1);
                    i3 = 1;
                }
                i2 += 2;
            } catch (C0213t e2) {
                throw e2;
            }
        }
        obj = 1;
        for (i2 = fArr.length - 2; i2 >= 0 && r0 != null; i2 -= 2) {
            i3 = (int) fArr[i2];
            i4 = (int) fArr[i2 + 1];
            if (i3 < -1 || i3 > a || i4 < -1 || i4 > i) {
                try {
                    throw C0213t.m1269a();
                } catch (C0213t e22) {
                    throw e22;
                }
            }
            if (i3 == -1) {
                fArr[i2] = 0.0f;
                obj = 1;
            } else if (i3 == a) {
                fArr[i2] = (float) (a - 1);
                i3 = 1;
            } else {
                obj = null;
            }
            if (i4 == -1) {
                fArr[i2 + 1] = 0.0f;
                obj = 1;
            } else if (i4 == i) {
                fArr[i2 + 1] = (float) (i - 1);
                i3 = 1;
            }
        }
    }

    /* renamed from: a */
    public abstract C0194n mo32a(C0194n c0194n, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws C0213t;

    /* renamed from: a */
    public abstract C0194n mo33a(C0194n c0194n, int i, int i2, C0192l c0192l) throws C0213t;
}
