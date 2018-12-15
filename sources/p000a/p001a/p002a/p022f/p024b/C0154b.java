package p000a.p001a.p002a.p022f.p024b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.db;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.f.b.b */
public final class C0154b {
    /* renamed from: a */
    private static final int f565a = 3;
    /* renamed from: b */
    private static final float f566b = 0.42f;
    /* renamed from: c */
    private static final int[] f567c = new int[]{7, 1, 1, 3, 1, 1, 1, 2, 1};
    /* renamed from: d */
    private static final int[] f568d = new int[]{6, 2, 7, 3};
    /* renamed from: e */
    private static final int f569e = 5;
    /* renamed from: f */
    private static final int[] f570f = new int[]{8, 1, 1, 1, 1, 1, 1, 3};
    /* renamed from: g */
    private static final int f571g = 25;
    /* renamed from: h */
    private static final int[] f572h = new int[]{0, 4, 1, 5};
    /* renamed from: i */
    private static final float f573i = 0.8f;
    /* renamed from: j */
    private static final int f574j = 5;
    /* renamed from: k */
    private static final int f575k = 10;

    private C0154b() {
    }

    /* renamed from: a */
    private static float m908a(int[] iArr, int[] iArr2, float f) {
        int i;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        for (i = 0; i < length; i++) {
            i3 += iArr[i];
            i2 += iArr2[i];
        }
        if (i3 < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = ((float) i3) / ((float) i2);
        float f3 = f * f2;
        float f4 = 0.0f;
        for (i = 0; i < length; i++) {
            int i4 = iArr[i];
            float f5 = ((float) iArr2[i]) * f2;
            float f6 = ((float) i4) > f5 ? ((float) i4) - f5 : f5 - ((float) i4);
            if (f6 > f3) {
                return Float.POSITIVE_INFINITY;
            }
            f4 += f6;
        }
        return f4 / ((float) i3);
    }

    /* renamed from: a */
    public static C0153a m909a(db dbVar, Map<C0216w, ?> map, boolean z) throws C0213t {
        C0194n f = dbVar.m836f();
        List a = C0154b.m910a(z, f);
        if (a.isEmpty()) {
            f = f.m1214b();
            f.m1225h();
            a = C0154b.m910a(z, f);
        }
        return new C0153a(f, a);
    }

    /* renamed from: a */
    private static List<eb[]> m910a(boolean z, C0194n c0194n) {
        List<eb[]> arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < c0194n.m1226i()) {
            Object a = C0154b.m913a(c0194n, i3, i2);
            if (a[0] != null || a[3] != null) {
                arrayList.add(a);
                if (!z) {
                    break;
                }
                if (a[2] != null) {
                    i = (int) a[2].m312b();
                    i2 = (int) a[2].m311a();
                } else {
                    i = (int) a[4].m312b();
                    i2 = (int) a[4].m311a();
                }
                i3 = i2;
                i2 = i;
                i = 1;
            } else if (i == 0) {
                break;
            } else {
                for (eb[] ebVarArr : arrayList) {
                    if (ebVarArr[1] != null) {
                        i3 = (int) Math.max((float) i3, ebVarArr[1].m311a());
                    }
                    if (ebVarArr[3] != null) {
                        i3 = Math.max(i3, (int) ebVarArr[3].m311a());
                    }
                }
                i2 = 0;
                i3 += 5;
                i = 0;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m911a(eb[] ebVarArr, eb[] ebVarArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            ebVarArr[iArr[i]] = ebVarArr2[i];
        }
    }

    /* renamed from: a */
    private static int[] m912a(C0194n c0194n, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        int i4;
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i5 = 0;
        while (c0194n.m1221d(i, i2) && i > 0) {
            i4 = i5 + 1;
            if (i5 >= 3) {
                break;
            }
            i--;
            i5 = i4;
        }
        i5 = 0;
        int length = iArr.length;
        int i6 = z;
        i4 = i;
        while (i < i3) {
            if ((c0194n.m1221d(i, i2) ^ i6) != 0) {
                iArr2[i5] = iArr2[i5] + 1;
            } else {
                if (i5 != length - 1) {
                    i5++;
                } else if (C0154b.m908a(iArr2, iArr, (float) f573i) < f566b) {
                    return new int[]{i4, i};
                } else {
                    i4 += iArr2[0] + iArr2[1];
                    System.arraycopy(iArr2, 2, iArr2, 0, length - 2);
                    iArr2[length - 2] = 0;
                    iArr2[length - 1] = 0;
                    i5--;
                }
                iArr2[i5] = 1;
                i6 = i6 == 0 ? 1 : 0;
            }
            i++;
        }
        if (i5 != length - 1 || C0154b.m908a(iArr2, iArr, (float) f573i) >= f566b) {
            return null;
        }
        return new int[]{i4, i - 1};
    }

    /* renamed from: a */
    private static eb[] m913a(C0194n c0194n, int i, int i2) {
        int b;
        int a;
        int i3 = c0194n.m1226i();
        int a2 = c0194n.m1208a();
        eb[] ebVarArr = new eb[8];
        C0154b.m911a(ebVarArr, C0154b.m914a(c0194n, i3, a2, i, i2, f570f), f572h);
        if (ebVarArr[4] != null) {
            b = (int) ebVarArr[4].m312b();
            a = (int) ebVarArr[4].m311a();
        } else {
            b = i2;
            a = i;
        }
        C0154b.m911a(ebVarArr, C0154b.m914a(c0194n, i3, a2, a, b, f567c), f568d);
        return ebVarArr;
    }

    /* renamed from: a */
    private static eb[] m914a(C0194n c0194n, int i, int i2, int i3, int i4, int[] iArr) {
        int[] iArr2;
        int i5;
        Object obj;
        int i6;
        int i7;
        int i8;
        eb[] ebVarArr = new eb[4];
        int[] iArr3 = new int[iArr.length];
        int i9 = i3;
        while (i9 < i) {
            int[] a = C0154b.m912a(c0194n, i4, i9, i2, false, iArr, iArr3);
            if (a != null) {
                iArr2 = a;
                i5 = i9;
                while (i5 > 0) {
                    i9 = i5 - 1;
                    a = C0154b.m912a(c0194n, i4, i9, i2, false, iArr, iArr3);
                    if (a == null) {
                        i5 = i9 + 1;
                        break;
                    }
                    iArr2 = a;
                    i5 = i9;
                }
                ebVarArr[0] = new eb((float) iArr2[0], (float) i5);
                ebVarArr[1] = new eb((float) iArr2[1], (float) i5);
                obj = 1;
                i6 = i5;
                i5 = i6 + 1;
                if (obj != null) {
                    iArr2 = new int[]{(int) ebVarArr[0].m312b(), (int) ebVarArr[1].m312b()};
                    i7 = 0;
                    i9 = i5;
                    while (i9 < i) {
                        a = C0154b.m912a(c0194n, iArr2[0], i9, i2, false, iArr, iArr3);
                        if (a == null && Math.abs(iArr2[0] - a[0]) < 5 && Math.abs(iArr2[1] - a[1]) < 5) {
                            i8 = 0;
                        } else if (i7 > 25) {
                            break;
                        } else {
                            i8 = i7 + 1;
                            a = iArr2;
                        }
                        i9++;
                        iArr2 = a;
                        i7 = i8;
                    }
                    i5 = i9 - (i7 + 1);
                    ebVarArr[2] = new eb((float) iArr2[0], (float) i5);
                    ebVarArr[3] = new eb((float) iArr2[1], (float) i5);
                }
                if (i5 - i6 < 10) {
                    for (i5 = 0; i5 < ebVarArr.length; i5++) {
                        ebVarArr[i5] = null;
                    }
                }
                return ebVarArr;
            }
            i9 += 5;
        }
        obj = null;
        i6 = i9;
        i5 = i6 + 1;
        if (obj != null) {
            iArr2 = new int[]{(int) ebVarArr[0].m312b(), (int) ebVarArr[1].m312b()};
            i7 = 0;
            i9 = i5;
            while (i9 < i) {
                a = C0154b.m912a(c0194n, iArr2[0], i9, i2, false, iArr, iArr3);
                if (a == null) {
                }
                if (i7 > 25) {
                    break;
                }
                i8 = i7 + 1;
                a = iArr2;
                i9++;
                iArr2 = a;
                i7 = i8;
            }
            i5 = i9 - (i7 + 1);
            ebVarArr[2] = new eb((float) iArr2[0], (float) i5);
            ebVarArr[3] = new eb((float) iArr2[1], (float) i5);
        }
        if (i5 - i6 < 10) {
            for (i5 = 0; i5 < ebVarArr.length; i5++) {
                ebVarArr[i5] = null;
            }
        }
        return ebVarArr;
    }
}
