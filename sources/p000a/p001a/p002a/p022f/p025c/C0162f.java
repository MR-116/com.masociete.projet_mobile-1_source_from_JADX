package p000a.p001a.p002a.p022f.p025c;

import java.lang.reflect.Array;
import p000a.p001a.p002a.p019g.p028a.C0175a;
import p000a.p001a.p002a.p022f.C0170d;

/* renamed from: a.a.a.f.c.f */
final class C0162f {
    /* renamed from: a */
    private static final float[][] f621a = ((float[][]) Array.newInstance(Float.TYPE, new int[]{C0170d.f659i.length, 8}));

    static {
        for (int i = 0; i < C0170d.f659i.length; i++) {
            int i2 = C0170d.f659i[i];
            int i3 = i2 & 1;
            for (int i4 = 0; i4 < 8; i4++) {
                float f = 0.0f;
                while ((i2 & 1) == i3) {
                    f += 1.0f;
                    i2 >>= 1;
                }
                i3 = i2 & 1;
                f621a[i][(8 - i4) - 1] = f / 17.0f;
            }
        }
    }

    private C0162f() {
    }

    /* renamed from: a */
    private static int[] m994a(int[] iArr) {
        int i = 0;
        float a = (float) C0175a.m1083a(iArr);
        int[] iArr2 = new int[8];
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            if (((float) (iArr[i2] + i)) <= (a / 34.0f) + ((((float) i3) * a) / 17.0f)) {
                i += iArr[i2];
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }

    /* renamed from: b */
    private static int m995b(int[] iArr) {
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            int i2 = 0;
            while (i2 < iArr[i]) {
                i2++;
                j = (j << 1) | ((long) (i % 2 == 0 ? 1 : 0));
            }
        }
        return (int) j;
    }

    /* renamed from: c */
    static int m996c(int[] iArr) {
        int e = C0162f.m998e(C0162f.m994a(iArr));
        return e != -1 ? e : C0162f.m997d(iArr);
    }

    /* renamed from: d */
    private static int m997d(int[] iArr) {
        int i;
        int a = C0175a.m1083a(iArr);
        float[] fArr = new float[8];
        for (i = 0; i < fArr.length; i++) {
            fArr[i] = ((float) iArr[i]) / ((float) a);
        }
        float f = Float.MAX_VALUE;
        a = -1;
        for (i = 0; i < f621a.length; i++) {
            float f2 = 0.0f;
            float[] fArr2 = f621a[i];
            for (int i2 = 0; i2 < 8; i2++) {
                float f3 = fArr2[i2] - fArr[i2];
                f2 += f3 * f3;
                if (f2 >= f) {
                    break;
                }
            }
            if (f2 < f) {
                a = C0170d.f659i[i];
                f = f2;
            }
        }
        return a;
    }

    /* renamed from: e */
    private static int m998e(int[] iArr) {
        int b = C0162f.m995b(iArr);
        return C0170d.m1050a(b) == -1 ? -1 : b;
    }
}
