package p000a.p001a.p002a.p011c.p012a;

import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.p011c.C0091l;
import p000a.p001a.p002a.p019g.p028a.C0175a;

/* renamed from: a.a.a.c.a.c */
public abstract class C0092c extends C0091l {
    /* renamed from: e */
    private static final float f260e = 0.45f;
    /* renamed from: f */
    private static final float f261f = 0.2f;
    /* renamed from: i */
    private static final float f262i = 0.7916667f;
    /* renamed from: j */
    private static final float f263j = 0.89285713f;
    /* renamed from: a */
    private final int[] f264a = new int[8];
    /* renamed from: b */
    private final float[] f265b = new float[4];
    /* renamed from: c */
    private final int[] f266c = new int[(this.f264a.length / 2)];
    /* renamed from: d */
    private final int[] f267d = new int[4];
    /* renamed from: g */
    private final int[] f268g = new int[(this.f264a.length / 2)];
    /* renamed from: h */
    private final float[] f269h = new float[4];

    protected C0092c() {
    }

    @Deprecated
    /* renamed from: a */
    protected static int m524a(int[] iArr) {
        return C0175a.m1083a(iArr);
    }

    /* renamed from: a */
    protected static int m525a(int[] iArr, int[][] iArr2) throws C0213t {
        int i = 0;
        while (i < iArr2.length) {
            try {
                if (C0091l.m516a(iArr, iArr2[i], (float) f260e) < f261f) {
                    return i;
                }
                i++;
            } catch (C0213t e) {
                throw e;
            } catch (C0213t e2) {
                throw e2;
            }
        }
        throw C0213t.m1269a();
    }

    /* renamed from: a */
    protected static void m526a(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] < f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* renamed from: b */
    protected static void m527b(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] > f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    /* renamed from: b */
    protected static boolean m528b(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f = ((float) i) / ((float) ((iArr[2] + i) + iArr[3]));
        if (f < f262i || f > f263j) {
            return false;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        int length = iArr.length;
        int i4 = 0;
        while (i4 < length) {
            i = iArr[i4];
            if (i > i3) {
                i3 = i;
            }
            if (i >= i2) {
                i = i2;
            }
            i4++;
            i2 = i;
        }
        return i3 < i2 * 10;
    }

    /* renamed from: b */
    protected final float[] m529b() {
        return this.f265b;
    }

    /* renamed from: c */
    protected final int[] m530c() {
        return this.f267d;
    }

    /* renamed from: d */
    protected final float[] m531d() {
        return this.f269h;
    }

    /* renamed from: e */
    protected final int[] m532e() {
        return this.f266c;
    }

    /* renamed from: f */
    protected final int[] m533f() {
        return this.f264a;
    }

    /* renamed from: g */
    protected final int[] m534g() {
        return this.f268g;
    }
}
