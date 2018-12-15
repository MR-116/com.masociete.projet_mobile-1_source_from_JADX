package p000a.p001a.p002a.p020e;

import java.util.Map;
import p000a.p001a.p002a.C0029o;
import p000a.p001a.p002a.C0206k;
import p000a.p001a.p002a.C0208m;
import p000a.p001a.p002a.C0211r;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.db;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p019g.C0187h;
import p000a.p001a.p002a.p019g.C0194n;
import p000a.p001a.p002a.p020e.p021a.C0142a;

/* renamed from: a.a.a.e.b */
public final class C0145b implements C0029o {
    /* renamed from: a */
    private static final int f510a = 33;
    /* renamed from: b */
    private static final int f511b = 30;
    /* renamed from: c */
    private static final eb[] f512c = new eb[0];
    /* renamed from: d */
    private final C0142a f513d = new C0142a();

    /* renamed from: a */
    private static C0194n m853a(C0194n c0194n) throws C0213t {
        int[] f = c0194n.m1223f();
        if (f == null) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e) {
                throw e;
            }
        }
        int i = f[0];
        int i2 = f[1];
        int i3 = f[2];
        int i4 = f[3];
        C0194n c0194n2 = new C0194n(30, 33);
        for (int i5 = 0; i5 < 33; i5++) {
            int i6 = i2 + (((i5 * i4) + (i4 / 2)) / 33);
            int i7 = 0;
            while (i7 < 30) {
                try {
                    if (c0194n.m1221d(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                        c0194n2.m1215b(i7, i5);
                    }
                    i7++;
                } catch (C0213t e2) {
                    throw e2;
                }
            }
        }
        return c0194n2;
    }

    /* renamed from: a */
    public void mo9a() {
    }

    /* renamed from: b */
    public C0208m mo10b(db dbVar) throws C0213t, C0211r, C0212s {
        return mo11b(dbVar, null);
    }

    /* renamed from: b */
    public C0208m mo11b(db dbVar, Map<C0216w, ?> map) throws C0213t, C0211r, C0212s {
        if (map != null) {
            try {
                if (map.containsKey(C0216w.PURE_BARCODE)) {
                    C0187h a = this.f513d.m840a(C0145b.m853a(dbVar.m836f()), map);
                    C0208m c0208m = new C0208m(a.m1168h(), a.m1167g(), f512c, C0217x.MAXICODE);
                    String i = a.m1169i();
                    if (i != null) {
                        try {
                            c0208m.m1252a(C0206k.ERROR_CORRECTION_LEVEL, i);
                        } catch (C0213t e) {
                            throw e;
                        }
                    }
                    return c0208m;
                }
            } catch (C0213t e2) {
                throw e2;
            }
        }
        throw C0213t.m1269a();
    }
}
