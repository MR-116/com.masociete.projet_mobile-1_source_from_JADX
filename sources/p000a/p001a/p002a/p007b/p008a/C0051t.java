package p000a.p001a.p002a.p007b.p008a;

import java.util.Map;
import p000a.p001a.p002a.C0210q;
import p000a.p001a.p002a.C0211r;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.p019g.C0187h;
import p000a.p001a.p002a.p019g.C0194n;
import p000a.p001a.p002a.p019g.p029b.C0179b;
import p000a.p001a.p002a.p019g.p029b.C0180c;
import p000a.p001a.p002a.p019g.p029b.C0182e;

/* renamed from: a.a.a.b.a.t */
public final class C0051t {
    /* renamed from: a */
    private final C0182e f138a = new C0182e(C0180c.f687l);

    /* renamed from: a */
    private C0187h m269a(C0050s c0050s, Map<C0216w, ?> map) throws C0212s, C0211r {
        C0049r e = c0050s.m268e();
        C0046o a = c0050s.m263a().m215a();
        C0047p[] a2 = C0047p.m247a(c0050s.m267d(), e, a);
        int i = 0;
        for (C0047p b : a2) {
            i += b.m249b();
        }
        byte[] bArr = new byte[i];
        int length = a2.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C0047p c0047p = a2[i2];
            byte[] a3 = c0047p.m248a();
            int b2 = c0047p.m249b();
            m270a(a3, b2);
            i = i3;
            i3 = 0;
            while (i3 < b2) {
                int i4 = i + 1;
                try {
                    bArr[i] = a3[i3];
                    i3++;
                    i = i4;
                } catch (C0212s e2) {
                    throw e2;
                }
            }
            i2++;
            i3 = i;
        }
        return C0042k.m231a(bArr, e, a, (Map) map);
    }

    /* renamed from: a */
    private void m270a(byte[] bArr, int i) throws C0211r {
        int i2 = 0;
        int length = bArr.length;
        int[] iArr = new int[length];
        int i3 = 0;
        while (i3 < length) {
            try {
                iArr[i3] = bArr[i3] & 255;
                i3++;
            } catch (C0179b e) {
                throw e;
            }
        }
        try {
            this.f138a.m1124a(iArr, bArr.length - i);
            while (i2 < i) {
                try {
                    bArr[i2] = (byte) iArr[i2];
                    i2++;
                } catch (C0179b e2) {
                    throw e2;
                }
            }
        } catch (C0179b e3) {
            throw C0211r.m1265a();
        }
    }

    /* renamed from: a */
    public C0187h m271a(C0194n c0194n) throws C0211r, C0212s {
        return m272a(c0194n, null);
    }

    /* renamed from: a */
    public C0187h m272a(C0194n c0194n, Map<C0216w, ?> map) throws C0212s, C0211r {
        C0187h a;
        C0211r c0211r;
        C0212s e;
        C0210q c0210q = null;
        C0050s c0050s = new C0050s(c0194n);
        try {
            a = m269a(c0050s, (Map) map);
        } catch (C0212s e2) {
            C0212s c0212s = e2;
            c0211r = c0210q;
            try {
                c0050s.m266c();
                c0050s.m264a(true);
                c0050s.m268e();
                c0050s.m263a();
                c0050s.m265b();
                a = m269a(c0050s, (Map) map);
                a.m1160a(new C0045n(true));
                return a;
            } catch (C0212s e3) {
                e = e3;
                if (c0212s != null) {
                    try {
                        throw c0212s;
                    } catch (C0212s e4) {
                        throw e4;
                    }
                } else if (c0211r == null) {
                    try {
                        throw c0211r;
                    } catch (C0212s e42) {
                        throw e42;
                    }
                } else {
                    throw e42;
                }
            } catch (C0211r e5) {
                e42 = e5;
                if (c0212s != null) {
                    throw c0212s;
                } else if (c0211r == null) {
                    throw e42;
                } else {
                    throw c0211r;
                }
            }
        } catch (C0211r e6) {
            c0211r = e6;
            C0210q c0210q2 = c0210q;
            c0050s.m266c();
            c0050s.m264a(true);
            c0050s.m268e();
            c0050s.m263a();
            c0050s.m265b();
            a = m269a(c0050s, (Map) map);
            a.m1160a(new C0045n(true));
            return a;
        }
        return a;
    }

    /* renamed from: a */
    public C0187h m273a(boolean[][] zArr) throws C0211r, C0212s {
        return m274a(zArr, null);
    }

    /* renamed from: a */
    public C0187h m274a(boolean[][] zArr, Map<C0216w, ?> map) throws C0211r, C0212s {
        int length = zArr.length;
        C0194n c0194n = new C0194n(length);
        for (int i = 0; i < length; i++) {
            int i2 = 0;
            while (i2 < length) {
                try {
                    if (zArr[i][i2]) {
                        c0194n.m1215b(i2, i);
                    }
                    i2++;
                } catch (C0211r e) {
                    throw e;
                }
            }
        }
        return m272a(c0194n, (Map) map);
    }
}
