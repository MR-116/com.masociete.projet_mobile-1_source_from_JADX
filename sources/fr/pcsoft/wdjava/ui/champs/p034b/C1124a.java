package fr.pcsoft.wdjava.ui.champs.p034b;

/* renamed from: fr.pcsoft.wdjava.ui.champs.b.a */
public class C1124a {
    /* renamed from: b */
    private static final int f3465b = 16;
    /* renamed from: c */
    public static final int f3466c = 1;
    /* renamed from: d */
    public static final int f3467d = 0;
    /* renamed from: e */
    private static final int f3468e = 256;
    /* renamed from: f */
    public static final int f3469f = 2;
    /* renamed from: j */
    private static final int f3470j = 32;
    /* renamed from: k */
    private static final int f3471k = 64;
    /* renamed from: l */
    private static final int f3472l = 512;
    /* renamed from: o */
    public static final int f3473o = 1;
    /* renamed from: p */
    private static final int f3474p = 0;
    /* renamed from: q */
    private static final int f3475q = 128;
    /* renamed from: r */
    public static final int f3476r = 2;
    /* renamed from: a */
    private int f3477a = 0;
    /* renamed from: g */
    private int f3478g = 0;
    /* renamed from: h */
    private int f3479h = 64;
    /* renamed from: i */
    private int f3480i = 0;
    /* renamed from: m */
    private int f3481m = 0;
    /* renamed from: n */
    private int f3482n = 0;

    public C1124a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f3479h = i;
        this.f3482n = i2;
        this.f3480i = i3;
        if (i6 == 1) {
            this.f3478g = i5;
            this.f3477a = i4;
        } else {
            this.f3478g = i4;
            this.f3477a = i5;
        }
        this.f3481m = i6;
    }

    /* renamed from: a */
    public C1124a m8240a(C1124a c1124a, int i, int i2, int i3) {
        Object obj;
        Object obj2;
        Object obj3;
        int i4;
        int i5;
        int i6;
        int i7;
        Object obj4 = 1;
        if (!(this.f3479h == 0 && c1124a.f3479h == 0)) {
            obj = ((this.f3479h & 64) == 64 || this.f3479h == 0) ? 1 : null;
            obj2 = ((c1124a.f3479h & 64) == 64 || c1124a.f3479h == 0) ? 1 : null;
            if (obj != null && obj2 == null) {
                return this;
            }
            if (obj == null && obj2 != null) {
                return c1124a;
            }
        }
        obj2 = i < i2 ? 1 : null;
        if ((i3 & 1) == 0) {
            if (this.f3481m == 2) {
                obj = obj2;
            } else if (this.f3481m == 0) {
                int i8 = 1;
            } else {
                obj = null;
            }
            if (c1124a.f3481m == 2) {
                obj3 = obj2;
            } else if (c1124a.f3481m == 0) {
                int i9 = 1;
            } else {
                obj3 = null;
            }
            if (obj2 == obj3 && obj2 != r0) {
                return c1124a;
            }
            if (obj2 != obj3 && obj2 == r0) {
                return this;
            }
        }
        if ((i3 & 2) == 2) {
            i8 = this.f3478g > 0 ? this.f3478g : this.f3482n;
            i9 = this.f3477a > 0 ? this.f3477a : this.f3480i;
            i4 = c1124a.f3478g > 0 ? c1124a.f3478g : c1124a.f3482n;
            i5 = c1124a.f3477a > 0 ? c1124a.f3477a : c1124a.f3480i;
            i6 = i9;
            i7 = i8;
        } else {
            i8 = this.f3482n;
            i9 = this.f3480i;
            i4 = c1124a.f3482n;
            i5 = c1124a.f3480i;
            i6 = i9;
            i7 = i8;
        }
        obj3 = (i7 > i || i6 > i2) ? null : 1;
        obj = (i4 > i || i5 > i2) ? null : 1;
        if (obj != null && obj3 == null) {
            return c1124a;
        }
        if (obj == null && obj3 != null) {
            return this;
        }
        i9 = i7 * i6;
        int i10 = i4 * i5;
        if (obj != null && i10 > i9) {
            return c1124a;
        }
        if (obj != null && i9 == i10) {
            if (obj2 == (i4 <= i5 ? 1 : null)) {
                if (i7 > i6) {
                    obj4 = null;
                }
                if (obj2 != obj4) {
                    return c1124a;
                }
            }
        }
        return this;
    }

    /* renamed from: a */
    public final void m8241a() {
    }

    /* renamed from: b */
    public final int m8242b() {
        return this.f3482n;
    }

    /* renamed from: c */
    public final int m8243c() {
        return this.f3480i;
    }
}
