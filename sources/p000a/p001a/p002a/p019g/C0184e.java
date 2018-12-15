package p000a.p001a.p002a.p019g;

import p000a.p001a.p002a.C0213t;

/* renamed from: a.a.a.g.e */
public final class C0184e extends C0183d {
    /* renamed from: a */
    public C0194n mo32a(C0194n c0194n, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws C0213t {
        return mo33a(c0194n, i, i2, C0192l.m1194a(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    /* renamed from: a */
    public C0194n mo33a(C0194n c0194n, int i, int i2, C0192l c0192l) throws C0213t {
        if (i <= 0 || i2 <= 0) {
            try {
                throw C0213t.m1269a();
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        C0194n c0194n2 = new C0194n(i, i2);
        float[] fArr = new float[(i * 2)];
        for (int i3 = 0; i3 < i2; i3++) {
            int length = fArr.length;
            float f = ((float) i3) + 0.5f;
            int i4 = 0;
            while (i4 < length) {
                try {
                    fArr[i4] = ((float) (i4 / 2)) + 0.5f;
                    fArr[i4 + 1] = f;
                    i4 += 2;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw e2;
                }
            }
            c0192l.m1198a(fArr);
            C0183d.m1127a(c0194n, fArr);
            i4 = 0;
            while (i4 < length) {
                try {
                    if (c0194n.m1221d((int) fArr[i4], (int) fArr[i4 + 1])) {
                        c0194n2.m1215b(i4 / 2, i3);
                    }
                    i4 += 2;
                } catch (ArrayIndexOutOfBoundsException e22) {
                    throw e22;
                } catch (ArrayIndexOutOfBoundsException e3) {
                    throw C0213t.m1269a();
                }
            }
        }
        return c0194n2;
    }
}
