package p000a.p001a.p002a.p003a.p006c;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;
import p000a.p001a.p002a.C0212s;

/* renamed from: a.a.a.a.c.c */
public final class C0020c {
    /* renamed from: d */
    private static final C0020c[] f66d = C0020c.m133h();
    /* renamed from: a */
    private final int f67a;
    /* renamed from: b */
    private final int f68b;
    /* renamed from: c */
    private final int f69c;
    /* renamed from: e */
    private final C0018a f70e;
    /* renamed from: f */
    private final int f71f;
    /* renamed from: g */
    private final int f72g;
    /* renamed from: h */
    private final int f73h;

    private C0020c(int i, int i2, int i3, int i4, int i5, C0018a c0018a) {
        int i6 = 0;
        this.f67a = i;
        this.f68b = i2;
        this.f73h = i3;
        this.f72g = i4;
        this.f71f = i5;
        this.f70e = c0018a;
        int b = c0018a.m131b();
        C0025h[] a = c0018a.m130a();
        int length = a.length;
        int i7 = 0;
        while (i6 < length) {
            C0025h c0025h = a[i6];
            i7 += (c0025h.m162b() + b) * c0025h.m161a();
            i6++;
        }
        this.f69c = i7;
    }

    /* renamed from: a */
    public static C0020c m132a(int i, int i2) throws C0212s {
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            C0020c[] c0020cArr = f66d;
            int length = c0020cArr.length;
            int i3 = 0;
            while (i3 < length) {
                C0020c c0020c = c0020cArr[i3];
                try {
                    if (c0020c.f68b == i) {
                        if (c0020c.f73h == i2) {
                            return c0020c;
                        }
                    }
                    i3++;
                } catch (C0212s e) {
                    throw e;
                } catch (C0212s e2) {
                    throw e2;
                }
            }
            throw C0212s.m1267a();
        }
        try {
            throw C0212s.m1267a();
        } catch (C0212s e22) {
            throw e22;
        }
    }

    /* renamed from: h */
    private static C0020c[] m133h() {
        return new C0020c[]{new C0020c(1, 10, 10, 8, 8, new C0018a(5, new C0025h(1, 3, null), null)), new C0020c(2, 12, 12, 10, 10, new C0018a(7, new C0025h(1, 5, null), null)), new C0020c(3, 14, 14, 12, 12, new C0018a(10, new C0025h(1, 8, null), null)), new C0020c(4, 16, 16, 14, 14, new C0018a(12, new C0025h(1, 12, null), null)), new C0020c(5, 18, 18, 16, 16, new C0018a(14, new C0025h(1, 18, null), null)), new C0020c(6, 20, 20, 18, 18, new C0018a(18, new C0025h(1, 22, null), null)), new C0020c(7, 22, 22, 20, 20, new C0018a(20, new C0025h(1, 30, null), null)), new C0020c(8, 24, 24, 22, 22, new C0018a(24, new C0025h(1, 36, null), null)), new C0020c(9, 26, 26, 24, 24, new C0018a(28, new C0025h(1, 44, null), null)), new C0020c(10, 32, 32, 14, 14, new C0018a(36, new C0025h(1, 62, null), null)), new C0020c(11, 36, 36, 16, 16, new C0018a(42, new C0025h(1, 86, null), null)), new C0020c(12, 40, 40, 18, 18, new C0018a(48, new C0025h(1, 114, null), null)), new C0020c(13, 44, 44, 20, 20, new C0018a(56, new C0025h(1, C0538a.Lb, null), null)), new C0020c(14, 48, 48, 22, 22, new C0018a(68, new C0025h(1, 174, null), null)), new C0020c(15, 52, 52, 24, 24, new C0018a(42, new C0025h(2, 102, null), null)), new C0020c(16, 64, 64, 14, 14, new C0018a(56, new C0025h(2, C0542t.f1193i, null), null)), new C0020c(17, 72, 72, 16, 16, new C0018a(36, new C0025h(4, 92, null), null)), new C0020c(18, 80, 80, 18, 18, new C0018a(48, new C0025h(4, 114, null), null)), new C0020c(19, 88, 88, 20, 20, new C0018a(56, new C0025h(4, C0538a.Lb, null), null)), new C0020c(20, 96, 96, 22, 22, new C0018a(68, new C0025h(4, 174, null), null)), new C0020c(21, 104, 104, 24, 24, new C0018a(56, new C0025h(6, 136, null), null)), new C0020c(22, C0607n.co, C0607n.co, 18, 18, new C0018a(68, new C0025h(6, C0607n.hu, null), null)), new C0020c(23, C0538a.tb, C0538a.tb, 20, 20, new C0018a(62, new C0025h(8, C0607n.Ao, null), null)), new C0020c(24, C0538a.Lb, C0538a.Lb, 22, 22, new C0018a(62, new C0025h(8, 156, null), new C0025h(2, 155, null), null)), new C0020c(25, 8, 18, 6, 16, new C0018a(7, new C0025h(1, 5, null), null)), new C0020c(26, 8, 32, 6, 14, new C0018a(11, new C0025h(1, 10, null), null)), new C0020c(27, 12, 26, 10, 24, new C0018a(14, new C0025h(1, 16, null), null)), new C0020c(28, 12, 36, 10, 16, new C0018a(18, new C0025h(1, 22, null), null)), new C0020c(29, 16, 36, 14, 16, new C0018a(24, new C0025h(1, 32, null), null)), new C0020c(30, 16, 48, 14, 22, new C0018a(28, new C0025h(1, 49, null), null))};
    }

    /* renamed from: a */
    public int m134a() {
        return this.f73h;
    }

    /* renamed from: b */
    public int m135b() {
        return this.f69c;
    }

    /* renamed from: c */
    public int m136c() {
        return this.f67a;
    }

    /* renamed from: d */
    C0018a m137d() {
        return this.f70e;
    }

    /* renamed from: e */
    public int m138e() {
        return this.f68b;
    }

    /* renamed from: f */
    public int m139f() {
        return this.f72g;
    }

    /* renamed from: g */
    public int m140g() {
        return this.f71f;
    }

    public String toString() {
        return String.valueOf(this.f67a);
    }
}
