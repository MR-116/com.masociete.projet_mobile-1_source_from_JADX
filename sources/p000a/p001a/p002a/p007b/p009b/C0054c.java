package p000a.p001a.p002a.p007b.p009b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0214u;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.b.b.c */
public class C0054c {
    /* renamed from: a */
    private static final int f140a = 2;
    /* renamed from: e */
    protected static final int f141e = 3;
    /* renamed from: g */
    protected static final int f142g = 57;
    /* renamed from: b */
    private final C0194n f143b;
    /* renamed from: c */
    private final C0214u f144c;
    /* renamed from: d */
    private final int[] f145d;
    /* renamed from: f */
    private final List<C0059h> f146f;
    /* renamed from: h */
    private boolean f147h;

    public C0054c(C0194n c0194n) {
        this(c0194n, null);
    }

    public C0054c(C0194n c0194n, C0214u c0214u) {
        this.f143b = c0194n;
        this.f146f = new ArrayList();
        this.f145d = new int[5];
        this.f144c = c0214u;
    }

    /* renamed from: a */
    private float m276a(int i, int i2, int i3, int i4) {
        C0194n c0194n = this.f143b;
        int a = c0194n.m1208a();
        int[] e = m284e();
        int i5 = i;
        while (i5 >= 0 && c0194n.m1221d(i5, i2)) {
            e[2] = e[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !c0194n.m1221d(i5, i2) && e[1] <= i3) {
            e[1] = e[1] + 1;
            i5--;
        }
        if (i5 < 0 || e[1] > i3) {
            return Float.NaN;
        }
        while (i5 >= 0 && c0194n.m1221d(i5, i2) && e[0] <= i3) {
            e[0] = e[0] + 1;
            i5--;
        }
        if (e[0] > i3) {
            return Float.NaN;
        }
        i5 = i + 1;
        while (i5 < a && c0194n.m1221d(i5, i2)) {
            e[2] = e[2] + 1;
            i5++;
        }
        if (i5 == a) {
            return Float.NaN;
        }
        while (i5 < a && !c0194n.m1221d(i5, i2) && e[3] < i3) {
            e[3] = e[3] + 1;
            i5++;
        }
        if (i5 == a || e[3] >= i3) {
            return Float.NaN;
        }
        while (i5 < a && c0194n.m1221d(i5, i2) && e[4] < i3) {
            e[4] = e[4] + 1;
            i5++;
        }
        return (e[4] >= i3 || Math.abs(((((e[0] + e[1]) + e[2]) + e[3]) + e[4]) - i4) * 5 >= i4 || !C0054c.m278a(e)) ? Float.NaN : C0054c.m277a(e, i5);
    }

    /* renamed from: a */
    private static float m277a(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    /* renamed from: a */
    protected static boolean m278a(int[] iArr) {
        boolean z = true;
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 2.0f;
        if (Math.abs(f - ((float) iArr[0])) >= f2 || Math.abs(f - ((float) iArr[1])) >= f2 || Math.abs((3.0f * f) - ((float) iArr[2])) >= 3.0f * f2 || Math.abs(f - ((float) iArr[3])) >= f2 || Math.abs(f - ((float) iArr[4])) >= f2) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private C0059h[] m279a() throws C0213t {
        float f = 0.0f;
        int size = this.f146f.size();
        if (size < 3) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e) {
                throw e;
            }
        }
        if (size > 3) {
            float c;
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (C0059h c2 : this.f146f) {
                c = c2.m317c();
                f3 += c;
                f2 = (c * c) + f2;
            }
            f3 /= (float) size;
            c = (float) Math.sqrt((double) ((f2 / ((float) size)) - (f3 * f3)));
            Collections.sort(this.f146f, new C0053b(f3, null));
            float max = Math.max(0.2f * f3, c);
            int i = 0;
            while (i < this.f146f.size() && this.f146f.size() > 3) {
                try {
                    try {
                        int i2;
                        if (Math.abs(((C0059h) this.f146f.get(i)).m317c() - f3) > max) {
                            this.f146f.remove(i);
                            i2 = i - 1;
                        } else {
                            i2 = i;
                        }
                        i = i2 + 1;
                    } catch (C0213t e2) {
                        throw e2;
                    }
                } catch (C0213t e22) {
                    throw e22;
                }
            }
        }
        if (this.f146f.size() > 3) {
            for (C0059h c22 : this.f146f) {
                f += c22.m317c();
            }
            Collections.sort(this.f146f, new C0057f(f / ((float) this.f146f.size()), null));
            this.f146f.subList(3, this.f146f.size()).clear();
        }
        return new C0059h[]{(C0059h) this.f146f.get(0), (C0059h) this.f146f.get(1), (C0059h) this.f146f.get(2)};
    }

    /* renamed from: b */
    private boolean m280b(int i, int i2, int i3, int i4) {
        int[] e = m284e();
        int i5 = 0;
        while (i >= i5 && i2 >= i5 && this.f143b.m1221d(i2 - i5, i - i5)) {
            e[2] = e[2] + 1;
            i5++;
        }
        if (i < i5 || i2 < i5) {
            return false;
        }
        while (i >= i5 && i2 >= i5 && !this.f143b.m1221d(i2 - i5, i - i5) && e[1] <= i3) {
            e[1] = e[1] + 1;
            i5++;
        }
        if (i < i5 || i2 < i5 || e[1] > i3) {
            return false;
        }
        while (i >= i5 && i2 >= i5 && this.f143b.m1221d(i2 - i5, i - i5) && e[0] <= i3) {
            e[0] = e[0] + 1;
            i5++;
        }
        if (e[0] > i3) {
            return false;
        }
        int i6 = this.f143b.m1226i();
        int a = this.f143b.m1208a();
        i5 = 1;
        while (i + i5 < i6 && i2 + i5 < a && this.f143b.m1221d(i2 + i5, i + i5)) {
            e[2] = e[2] + 1;
            i5++;
        }
        if (i + i5 >= i6 || i2 + i5 >= a) {
            return false;
        }
        while (i + i5 < i6 && i2 + i5 < a && !this.f143b.m1221d(i2 + i5, i + i5) && e[3] < i3) {
            e[3] = e[3] + 1;
            i5++;
        }
        if (i + i5 >= i6 || i2 + i5 >= a || e[3] >= i3) {
            return false;
        }
        while (i + i5 < i6 && i2 + i5 < a && this.f143b.m1221d(i2 + i5, i + i5) && e[4] < i3) {
            e[4] = e[4] + 1;
            i5++;
        }
        return e[4] >= i3 ? false : Math.abs(((((e[0] + e[1]) + e[2]) + e[3]) + e[4]) - i4) < i4 * 2 && C0054c.m278a(e);
    }

    /* renamed from: c */
    private float m281c(int i, int i2, int i3, int i4) {
        C0194n c0194n = this.f143b;
        int i5 = c0194n.m1226i();
        int[] e = m284e();
        int i6 = i;
        while (i6 >= 0 && c0194n.m1221d(i2, i6)) {
            e[2] = e[2] + 1;
            i6--;
        }
        if (i6 < 0) {
            return Float.NaN;
        }
        while (i6 >= 0 && !c0194n.m1221d(i2, i6) && e[1] <= i3) {
            e[1] = e[1] + 1;
            i6--;
        }
        if (i6 < 0 || e[1] > i3) {
            return Float.NaN;
        }
        while (i6 >= 0 && c0194n.m1221d(i2, i6) && e[0] <= i3) {
            e[0] = e[0] + 1;
            i6--;
        }
        if (e[0] > i3) {
            return Float.NaN;
        }
        i6 = i + 1;
        while (i6 < i5 && c0194n.m1221d(i2, i6)) {
            e[2] = e[2] + 1;
            i6++;
        }
        if (i6 == i5) {
            return Float.NaN;
        }
        while (i6 < i5 && !c0194n.m1221d(i2, i6) && e[3] < i3) {
            e[3] = e[3] + 1;
            i6++;
        }
        if (i6 == i5 || e[3] >= i3) {
            return Float.NaN;
        }
        while (i6 < i5 && c0194n.m1221d(i2, i6) && e[4] < i3) {
            e[4] = e[4] + 1;
            i6++;
        }
        return (e[4] >= i3 || Math.abs(((((e[0] + e[1]) + e[2]) + e[3]) + e[4]) - i4) * 5 >= i4 * 2 || !C0054c.m278a(e)) ? Float.NaN : C0054c.m277a(e, i6);
    }

    /* renamed from: c */
    private int m282c() {
        if (this.f146f.size() <= 1) {
            return 0;
        }
        eb ebVar = null;
        for (eb ebVar2 : this.f146f) {
            eb ebVar22;
            if (ebVar22.m318d() < 2) {
                ebVar22 = ebVar;
            } else if (ebVar != null) {
                this.f147h = true;
                return ((int) (Math.abs(ebVar.m312b() - ebVar22.m312b()) - Math.abs(ebVar.m311a() - ebVar22.m311a()))) / 2;
            }
            ebVar = ebVar22;
        }
        return 0;
    }

    /* renamed from: d */
    private boolean m283d() {
        float f = 0.0f;
        int size = this.f146f.size();
        float f2 = 0.0f;
        int i = 0;
        for (C0059h c0059h : this.f146f) {
            float c;
            int i2;
            if (c0059h.m318d() >= 2) {
                c = c0059h.m317c() + f2;
                i2 = i + 1;
            } else {
                c = f2;
                i2 = i;
            }
            i = i2;
            f2 = c;
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        for (C0059h c0059h2 : this.f146f) {
            f += Math.abs(c0059h2.m317c() - f3);
        }
        return f <= 0.05f * f2;
    }

    /* renamed from: e */
    private int[] m284e() {
        this.f145d[0] = 0;
        this.f145d[1] = 0;
        this.f145d[2] = 0;
        this.f145d[3] = 0;
        this.f145d[4] = 0;
        return this.f145d;
    }

    /* renamed from: a */
    final C0060i m285a(Map<C0216w, ?> map) throws C0213t {
        Object obj;
        boolean z;
        int i;
        int a;
        int i2;
        int i3;
        boolean z2;
        int[] iArr;
        int i4;
        int i5;
        boolean z3;
        eb[] a2;
        if (map != null) {
            try {
                if (map.containsKey(C0216w.TRY_HARDER)) {
                    obj = 1;
                    if (map != null) {
                        try {
                            if (map.containsKey(C0216w.PURE_BARCODE)) {
                                z = true;
                                i = this.f143b.m1226i();
                                a = this.f143b.m1208a();
                                i2 = (i * 3) / 228;
                                i3 = (i2 >= 3 || obj != null) ? 3 : i2;
                                z2 = false;
                                iArr = new int[5];
                                i4 = i3 - 1;
                                i5 = i3;
                                while (i4 < i && !r4) {
                                    iArr[0] = 0;
                                    iArr[1] = 0;
                                    iArr[2] = 0;
                                    iArr[3] = 0;
                                    iArr[4] = 0;
                                    i3 = 0;
                                    i2 = 0;
                                    while (i2 < a) {
                                        try {
                                            if (!this.f143b.m1221d(i2, i4)) {
                                                if ((i3 & 1) == 1) {
                                                    i3++;
                                                }
                                                iArr[i3] = iArr[i3] + 1;
                                            } else if ((i3 & 1) != 0) {
                                                iArr[i3] = iArr[i3] + 1;
                                            } else if (i3 == 4) {
                                                try {
                                                    if (!C0054c.m278a(iArr)) {
                                                        iArr[0] = iArr[2];
                                                        iArr[1] = iArr[3];
                                                        iArr[2] = iArr[4];
                                                        iArr[3] = 1;
                                                        iArr[4] = 0;
                                                        i3 = 3;
                                                    } else if (m286a(iArr, i4, i2, z)) {
                                                        iArr[0] = iArr[2];
                                                        iArr[1] = iArr[3];
                                                        iArr[2] = iArr[4];
                                                        iArr[3] = 1;
                                                        iArr[4] = 0;
                                                        i3 = 3;
                                                    } else {
                                                        i5 = 2;
                                                        if (this.f147h) {
                                                            i3 = m282c();
                                                            if (i3 <= iArr[2]) {
                                                                i2 = i4 + ((i3 - iArr[2]) - 2);
                                                                i3 = a - 1;
                                                            } else {
                                                                i3 = i2;
                                                                i2 = i4;
                                                            }
                                                            i4 = i2;
                                                            i2 = i3;
                                                            z3 = z2;
                                                        } else {
                                                            z3 = m283d();
                                                        }
                                                        iArr[0] = 0;
                                                        iArr[1] = 0;
                                                        iArr[2] = 0;
                                                        iArr[3] = 0;
                                                        iArr[4] = 0;
                                                        z2 = z3;
                                                        i3 = 0;
                                                    }
                                                } catch (C0213t e) {
                                                    throw e;
                                                }
                                            } else {
                                                i3++;
                                                iArr[i3] = iArr[i3] + 1;
                                            }
                                            i2++;
                                        } catch (C0213t e2) {
                                            throw e2;
                                        } catch (C0213t e22) {
                                            throw e22;
                                        }
                                    }
                                    if (C0054c.m278a(iArr) && m286a(iArr, i4, a, z)) {
                                        i5 = iArr[0];
                                        if (!this.f147h) {
                                            z2 = m283d();
                                        }
                                    }
                                    i4 += i5;
                                }
                                a2 = m279a();
                                eb.m310a(a2);
                                return new C0060i(a2);
                            }
                        } catch (C0213t e222) {
                            throw e222;
                        }
                    }
                    z = false;
                    i = this.f143b.m1226i();
                    a = this.f143b.m1208a();
                    i2 = (i * 3) / 228;
                    if (i2 >= 3) {
                    }
                    z2 = false;
                    iArr = new int[5];
                    i4 = i3 - 1;
                    i5 = i3;
                    while (i4 < i) {
                        iArr[0] = 0;
                        iArr[1] = 0;
                        iArr[2] = 0;
                        iArr[3] = 0;
                        iArr[4] = 0;
                        i3 = 0;
                        i2 = 0;
                        while (i2 < a) {
                            if (!this.f143b.m1221d(i2, i4)) {
                                if ((i3 & 1) == 1) {
                                    i3++;
                                }
                                iArr[i3] = iArr[i3] + 1;
                            } else if ((i3 & 1) != 0) {
                                iArr[i3] = iArr[i3] + 1;
                            } else if (i3 == 4) {
                                i3++;
                                iArr[i3] = iArr[i3] + 1;
                            } else if (!C0054c.m278a(iArr)) {
                                iArr[0] = iArr[2];
                                iArr[1] = iArr[3];
                                iArr[2] = iArr[4];
                                iArr[3] = 1;
                                iArr[4] = 0;
                                i3 = 3;
                            } else if (m286a(iArr, i4, i2, z)) {
                                iArr[0] = iArr[2];
                                iArr[1] = iArr[3];
                                iArr[2] = iArr[4];
                                iArr[3] = 1;
                                iArr[4] = 0;
                                i3 = 3;
                            } else {
                                i5 = 2;
                                if (this.f147h) {
                                    i3 = m282c();
                                    if (i3 <= iArr[2]) {
                                        i3 = i2;
                                        i2 = i4;
                                    } else {
                                        i2 = i4 + ((i3 - iArr[2]) - 2);
                                        i3 = a - 1;
                                    }
                                    i4 = i2;
                                    i2 = i3;
                                    z3 = z2;
                                } else {
                                    z3 = m283d();
                                }
                                iArr[0] = 0;
                                iArr[1] = 0;
                                iArr[2] = 0;
                                iArr[3] = 0;
                                iArr[4] = 0;
                                z2 = z3;
                                i3 = 0;
                            }
                            i2++;
                        }
                        i5 = iArr[0];
                        if (!this.f147h) {
                            z2 = m283d();
                        }
                        i4 += i5;
                    }
                    a2 = m279a();
                    eb.m310a(a2);
                    return new C0060i(a2);
                }
            } catch (C0213t e2222) {
                throw e2222;
            }
        }
        obj = null;
        if (map != null) {
            if (map.containsKey(C0216w.PURE_BARCODE)) {
                z = true;
                i = this.f143b.m1226i();
                a = this.f143b.m1208a();
                i2 = (i * 3) / 228;
                if (i2 >= 3) {
                }
                z2 = false;
                iArr = new int[5];
                i4 = i3 - 1;
                i5 = i3;
                while (i4 < i) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    iArr[3] = 0;
                    iArr[4] = 0;
                    i3 = 0;
                    i2 = 0;
                    while (i2 < a) {
                        if (!this.f143b.m1221d(i2, i4)) {
                            if ((i3 & 1) == 1) {
                                i3++;
                            }
                            iArr[i3] = iArr[i3] + 1;
                        } else if ((i3 & 1) != 0) {
                            iArr[i3] = iArr[i3] + 1;
                        } else if (i3 == 4) {
                            i3++;
                            iArr[i3] = iArr[i3] + 1;
                        } else if (!C0054c.m278a(iArr)) {
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                            i3 = 3;
                        } else if (m286a(iArr, i4, i2, z)) {
                            i5 = 2;
                            if (this.f147h) {
                                z3 = m283d();
                            } else {
                                i3 = m282c();
                                if (i3 <= iArr[2]) {
                                    i2 = i4 + ((i3 - iArr[2]) - 2);
                                    i3 = a - 1;
                                } else {
                                    i3 = i2;
                                    i2 = i4;
                                }
                                i4 = i2;
                                i2 = i3;
                                z3 = z2;
                            }
                            iArr[0] = 0;
                            iArr[1] = 0;
                            iArr[2] = 0;
                            iArr[3] = 0;
                            iArr[4] = 0;
                            z2 = z3;
                            i3 = 0;
                        } else {
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                            i3 = 3;
                        }
                        i2++;
                    }
                    i5 = iArr[0];
                    if (!this.f147h) {
                        z2 = m283d();
                    }
                    i4 += i5;
                }
                a2 = m279a();
                eb.m310a(a2);
                return new C0060i(a2);
            }
        }
        z = false;
        i = this.f143b.m1226i();
        a = this.f143b.m1208a();
        i2 = (i * 3) / 228;
        if (i2 >= 3) {
        }
        z2 = false;
        iArr = new int[5];
        i4 = i3 - 1;
        i5 = i3;
        while (i4 < i) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            i3 = 0;
            i2 = 0;
            while (i2 < a) {
                if (!this.f143b.m1221d(i2, i4)) {
                    if ((i3 & 1) == 1) {
                        i3++;
                    }
                    iArr[i3] = iArr[i3] + 1;
                } else if ((i3 & 1) != 0) {
                    iArr[i3] = iArr[i3] + 1;
                } else if (i3 == 4) {
                    i3++;
                    iArr[i3] = iArr[i3] + 1;
                } else if (!C0054c.m278a(iArr)) {
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = iArr[4];
                    iArr[3] = 1;
                    iArr[4] = 0;
                    i3 = 3;
                } else if (m286a(iArr, i4, i2, z)) {
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = iArr[4];
                    iArr[3] = 1;
                    iArr[4] = 0;
                    i3 = 3;
                } else {
                    i5 = 2;
                    if (this.f147h) {
                        i3 = m282c();
                        if (i3 <= iArr[2]) {
                            i3 = i2;
                            i2 = i4;
                        } else {
                            i2 = i4 + ((i3 - iArr[2]) - 2);
                            i3 = a - 1;
                        }
                        i4 = i2;
                        i2 = i3;
                        z3 = z2;
                    } else {
                        z3 = m283d();
                    }
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    iArr[3] = 0;
                    iArr[4] = 0;
                    z2 = z3;
                    i3 = 0;
                }
                i2++;
            }
            i5 = iArr[0];
            if (!this.f147h) {
                z2 = m283d();
            }
            i4 += i5;
        }
        a2 = m279a();
        eb.m310a(a2);
        return new C0060i(a2);
    }

    /* renamed from: a */
    protected final boolean m286a(int[] iArr, int i, int i2, boolean z) {
        boolean z2 = false;
        int i3 = (((iArr[0] + iArr[1]) + iArr[2]) + iArr[3]) + iArr[4];
        float a = C0054c.m277a(iArr, i2);
        float c = m281c(i, (int) a, iArr[2], i3);
        if (Float.isNaN(c)) {
            return false;
        }
        float a2 = m276a((int) a, (int) c, iArr[2], i3);
        if (Float.isNaN(a2)) {
            return false;
        }
        if (z && !m280b((int) c, (int) a2, iArr[2], i3)) {
            return false;
        }
        float f = ((float) i3) / 7.0f;
        for (int i4 = 0; i4 < this.f146f.size(); i4++) {
            C0059h c0059h = (C0059h) this.f146f.get(i4);
            if (c0059h.m316b(f, c, a2)) {
                this.f146f.set(i4, c0059h.m315a(c, a2, f));
                z2 = true;
                break;
            }
        }
        if (!z2) {
            eb c0059h2 = new C0059h(a2, c, f);
            this.f146f.add(c0059h2);
            if (this.f144c != null) {
                this.f144c.m1270a(c0059h2);
            }
        }
        return true;
    }

    /* renamed from: b */
    protected final C0194n m287b() {
        return this.f143b;
    }

    /* renamed from: f */
    protected final List<C0059h> m288f() {
        return this.f146f;
    }
}
