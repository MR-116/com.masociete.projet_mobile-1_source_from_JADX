package p000a.p001a.p002a.p003a;

import java.util.List;
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
import p000a.p001a.p002a.p003a.p005b.C0015b;
import p000a.p001a.p002a.p003a.p006c.C0021d;
import p000a.p001a.p002a.p019g.C0139c;
import p000a.p001a.p002a.p019g.C0187h;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.a.e */
public final class C0030e implements C0029o {
    /* renamed from: b */
    private static final eb[] f91b = new eb[0];
    /* renamed from: a */
    private final C0021d f92a = new C0021d();

    /* renamed from: a */
    private static int m185a(int[] iArr, C0194n c0194n) throws C0213t {
        int a = c0194n.m1208a();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < a) {
            try {
                if (!c0194n.m1221d(i, i2)) {
                    break;
                }
                i++;
            } catch (C0213t e) {
                throw e;
            }
        }
        if (i == a) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e2) {
                throw e2;
            }
        }
        i -= iArr[0];
        if (i != 0) {
            return i;
        }
        try {
            throw C0213t.m1269a();
        } catch (C0213t e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    private static C0194n m186a(C0194n c0194n) throws C0213t {
        int[] c = c0194n.m1219c();
        int[] e = c0194n.m1222e();
        if (c == null || e == null) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e2) {
                throw e2;
            }
        }
        int a = C0030e.m185a(c, c0194n);
        int i = c[1];
        int i2 = e[1];
        int i3 = c[0];
        int i4 = ((e[0] - i3) + 1) / a;
        i2 = ((i2 - i) + 1) / a;
        if (i4 <= 0 || i2 <= 0) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e22) {
                throw e22;
            }
        }
        int i5 = a / 2;
        i += i5;
        int i6 = i3 + i5;
        C0194n c0194n2 = new C0194n(i4, i2);
        for (i5 = 0; i5 < i2; i5++) {
            int i7 = i + (i5 * a);
            i3 = 0;
            while (i3 < i4) {
                try {
                    if (c0194n.m1221d((i3 * a) + i6, i7)) {
                        c0194n2.m1215b(i3, i5);
                    }
                    i3++;
                } catch (C0213t e222) {
                    throw e222;
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
        C0187h a;
        eb[] ebVarArr;
        C0208m c0208m;
        List e;
        String i;
        if (map != null) {
            try {
                if (map.containsKey(C0216w.PURE_BARCODE)) {
                    a = this.f92a.m142a(C0030e.m186a(dbVar.m836f()));
                    ebVarArr = f91b;
                    c0208m = new C0208m(a.m1168h(), a.m1167g(), ebVarArr, C0217x.DATA_MATRIX);
                    e = a.m1165e();
                    if (e != null) {
                        try {
                            c0208m.m1252a(C0206k.BYTE_SEGMENTS, e);
                        } catch (C0213t e2) {
                            throw e2;
                        }
                    }
                    i = a.m1169i();
                    if (i != null) {
                        try {
                            c0208m.m1252a(C0206k.ERROR_CORRECTION_LEVEL, i);
                        } catch (C0213t e22) {
                            throw e22;
                        }
                    }
                    return c0208m;
                }
            } catch (C0213t e222) {
                throw e222;
            }
        }
        C0139c a2 = new C0015b(dbVar.m836f()).m125a();
        a = this.f92a.m142a(a2.m819a());
        ebVarArr = a2.m820b();
        c0208m = new C0208m(a.m1168h(), a.m1167g(), ebVarArr, C0217x.DATA_MATRIX);
        e = a.m1165e();
        if (e != null) {
            c0208m.m1252a(C0206k.BYTE_SEGMENTS, e);
        }
        i = a.m1169i();
        if (i != null) {
            c0208m.m1252a(C0206k.ERROR_CORRECTION_LEVEL, i);
        }
        return c0208m;
    }
}
