package p000a.p001a.p002a.p007b.p009b;

import java.util.ArrayList;
import java.util.List;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0214u;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.b.b.d */
final class C0055d {
    /* renamed from: a */
    private final C0214u f148a;
    /* renamed from: b */
    private final int f149b;
    /* renamed from: c */
    private final List<C0058g> f150c = new ArrayList(5);
    /* renamed from: d */
    private final float f151d;
    /* renamed from: e */
    private final int f152e;
    /* renamed from: f */
    private final int f153f;
    /* renamed from: g */
    private final int[] f154g;
    /* renamed from: h */
    private final C0194n f155h;
    /* renamed from: i */
    private final int f156i;

    C0055d(C0194n c0194n, int i, int i2, int i3, int i4, float f, C0214u c0214u) {
        this.f155h = c0194n;
        this.f149b = i;
        this.f153f = i2;
        this.f152e = i3;
        this.f156i = i4;
        this.f151d = f;
        this.f154g = new int[3];
        this.f148a = c0214u;
    }

    /* renamed from: a */
    private float m289a(int i, int i2, int i3, int i4) {
        C0194n c0194n = this.f155h;
        int i5 = c0194n.m1226i();
        int[] iArr = this.f154g;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i6 = i;
        while (i6 >= 0 && c0194n.m1221d(i2, i6) && iArr[1] <= i3) {
            iArr[1] = iArr[1] + 1;
            i6--;
        }
        if (i6 < 0 || iArr[1] > i3) {
            return Float.NaN;
        }
        while (i6 >= 0 && !c0194n.m1221d(i2, i6) && iArr[0] <= i3) {
            iArr[0] = iArr[0] + 1;
            i6--;
        }
        if (iArr[0] > i3) {
            return Float.NaN;
        }
        i6 = i + 1;
        while (i6 < i5 && c0194n.m1221d(i2, i6) && iArr[1] <= i3) {
            iArr[1] = iArr[1] + 1;
            i6++;
        }
        if (i6 == i5 || iArr[1] > i3) {
            return Float.NaN;
        }
        while (i6 < i5 && !c0194n.m1221d(i2, i6) && iArr[2] <= i3) {
            iArr[2] = iArr[2] + 1;
            i6++;
        }
        return (iArr[2] > i3 || Math.abs(((iArr[0] + iArr[1]) + iArr[2]) - i4) * 5 >= i4 * 2 || !m292a(iArr)) ? Float.NaN : C0055d.m290a(iArr, i6);
    }

    /* renamed from: a */
    private static float m290a(int[] iArr, int i) {
        return ((float) (i - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    /* renamed from: a */
    private C0058g m291a(int[] iArr, int i, int i2) {
        int i3 = (iArr[0] + iArr[1]) + iArr[2];
        float a = C0055d.m290a(iArr, i2);
        float a2 = m289a(i, (int) a, iArr[1] * 2, i3);
        if (!Float.isNaN(a2)) {
            float f = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
            for (C0058g c0058g : this.f150c) {
                if (c0058g.m314b(f, a2, a)) {
                    return c0058g.m313a(a2, a, f);
                }
            }
            eb c0058g2 = new C0058g(a, a2, f);
            this.f150c.add(c0058g2);
            if (this.f148a != null) {
                this.f148a.m1270a(c0058g2);
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m292a(int[] iArr) {
        float f = this.f151d;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - ((float) iArr[i])) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    C0058g m293a() throws C0213t {
        int i = this.f149b;
        int i2 = this.f156i;
        int i3 = i + this.f152e;
        int i4 = this.f153f + (i2 / 2);
        int[] iArr = new int[3];
        loop0:
        for (int i5 = 0; i5 < i2; i5++) {
            int i6;
            if ((i5 & 1) == 0) {
                try {
                    i6 = (i5 + 1) / 2;
                } catch (C0213t e) {
                    throw e;
                }
            }
            i6 = -((i5 + 1) / 2);
            int i7 = i4 + i6;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            i6 = i;
            while (i6 < i3) {
                try {
                    if (this.f155h.m1221d(i6, i7)) {
                        break;
                    }
                    i6++;
                } catch (C0213t e2) {
                    throw e2;
                }
            }
            int i8 = i6;
            i6 = 0;
            while (i8 < i3) {
                C0058g a;
                try {
                    if (!this.f155h.m1221d(i8, i7)) {
                        if (i6 == 1) {
                            i6++;
                        }
                        iArr[i6] = iArr[i6] + 1;
                    } else if (i6 == 1) {
                        iArr[1] = iArr[1] + 1;
                    } else if (i6 == 2) {
                        try {
                            if (m292a(iArr)) {
                                a = m291a(iArr, i7, i8);
                                if (a != null) {
                                    break loop0;
                                }
                            }
                            iArr[0] = iArr[2];
                            iArr[1] = 1;
                            iArr[2] = 0;
                            i6 = 1;
                        } catch (C0213t e22) {
                            throw e22;
                        }
                    } else {
                        i6++;
                        iArr[i6] = iArr[i6] + 1;
                    }
                    i8++;
                } catch (C0213t e222) {
                    throw e222;
                } catch (C0213t e2222) {
                    throw e2222;
                }
            }
            if (m292a(iArr)) {
                a = m291a(iArr, i7, i3);
                if (a != null) {
                    break;
                }
            }
        }
        try {
            if (this.f150c.isEmpty()) {
                throw C0213t.m1269a();
            }
            a = (C0058g) this.f150c.get(0);
            return a;
        } catch (C0213t e22222) {
            throw e22222;
        }
    }
}
