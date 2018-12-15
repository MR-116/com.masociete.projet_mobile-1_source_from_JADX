package p000a.p001a.p002a.p019g.p028a;

/* renamed from: a.a.a.g.a.a */
public final class C0175a {
    private C0175a() {
    }

    /* renamed from: a */
    public static float m1080a(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    /* renamed from: a */
    public static float m1081a(int i, int i2, int i3, int i4) {
        int i5 = i - i3;
        int i6 = i2 - i4;
        return (float) Math.sqrt((double) ((i5 * i5) + (i6 * i6)));
    }

    /* renamed from: a */
    public static int m1082a(float f) {
        return (int) ((f < 0.0f ? -0.5f : 0.5f) + f);
    }

    /* renamed from: a */
    public static int m1083a(int[] iArr) {
        int i = 0;
        int i2 = 0;
        while (i < iArr.length) {
            i2 += iArr[i];
            i++;
        }
        return i2;
    }
}
