package p000a.p001a.p002a.p007b;

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
import p000a.p001a.p002a.p007b.p008a.C0045n;
import p000a.p001a.p002a.p007b.p008a.C0051t;
import p000a.p001a.p002a.p007b.p009b.C0056e;
import p000a.p001a.p002a.p019g.C0139c;
import p000a.p001a.p002a.p019g.C0187h;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.b.e */
public class C0069e implements C0029o {
    /* renamed from: b */
    private static final eb[] f200b = new eb[0];
    /* renamed from: a */
    private final C0051t f201a = new C0051t();

    /* renamed from: a */
    private static float m409a(int[] iArr, C0194n c0194n) throws C0213t {
        int i = c0194n.m1226i();
        int a = c0194n.m1208a();
        int i2 = iArr[0];
        boolean z = true;
        int i3 = iArr[1];
        int i4 = i2;
        int i5 = 0;
        while (i4 < a && i3 < i) {
            try {
                boolean z2;
                if (z != c0194n.m1221d(i4, i3)) {
                    i2 = i5 + 1;
                    if (i2 == 5) {
                        break;
                    }
                    int i6 = i2;
                    z2 = !z;
                    i5 = i6;
                } else {
                    z2 = z;
                }
                i4++;
                i3++;
                z = z2;
            } catch (C0213t e) {
                throw e;
            } catch (C0213t e2) {
                throw e2;
            }
        }
        if (i4 != a && i3 != i) {
            return ((float) (i4 - iArr[0])) / 7.0f;
        }
        try {
            throw C0213t.m1269a();
        } catch (C0213t e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    private static C0194n m410a(C0194n c0194n) throws C0213t {
        int[] c = c0194n.m1219c();
        int[] e = c0194n.m1222e();
        if (c == null || e == null) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e2) {
                throw e2;
            }
        }
        float a = C0069e.m409a(c, c0194n);
        int i = c[1];
        int i2 = e[1];
        int i3 = c[0];
        int i4 = e[0];
        if (i3 >= i4 || i >= i2) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e22) {
                throw e22;
            }
        }
        if (i2 - i != i4 - i3) {
            i4 = (i2 - i) + i3;
            try {
                if (i4 >= c0194n.m1208a()) {
                    throw C0213t.m1269a();
                }
            } catch (C0213t e222) {
                throw e222;
            }
        }
        int round = Math.round(((float) ((i4 - i3) + 1)) / a);
        int round2 = Math.round(((float) ((i2 - i) + 1)) / a);
        if (round <= 0 || round2 <= 0) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e2222) {
                throw e2222;
            }
        } else if (round2 != round) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e22222) {
                throw e22222;
            }
        } else {
            int i5 = (int) (a / 2.0f);
            i += i5;
            int i6 = i3 + i5;
            i4 = (((int) (((float) (round - 1)) * a)) + i6) - i4;
            if (i4 <= 0) {
                i4 = i6;
            } else if (i4 > i5) {
                try {
                    throw C0213t.m1269a();
                } catch (C0213t e222222) {
                    throw e222222;
                }
            } else {
                i4 = i6 - i4;
            }
            i6 = (((int) (((float) (round2 - 1)) * a)) + i) - i2;
            if (i6 <= 0) {
                i6 = i;
            } else if (i6 > i5) {
                try {
                    throw C0213t.m1269a();
                } catch (C0213t e2222222) {
                    throw e2222222;
                }
            } else {
                i6 = i - i6;
            }
            C0194n c0194n2 = new C0194n(round, round2);
            for (i2 = 0; i2 < round2; i2++) {
                i5 = i6 + ((int) (((float) i2) * a));
                i = 0;
                while (i < round) {
                    try {
                        if (c0194n.m1221d(((int) (((float) i) * a)) + i4, i5)) {
                            c0194n2.m1215b(i, i2);
                        }
                        i++;
                    } catch (C0213t e22222222) {
                        throw e22222222;
                    }
                }
            }
            return c0194n2;
        }
    }

    /* renamed from: a */
    public void mo9a() {
    }

    /* renamed from: b */
    protected final C0051t m412b() {
        return this.f201a;
    }

    /* renamed from: b */
    public C0208m mo10b(db dbVar) throws C0213t, C0211r, C0212s {
        return mo11b(dbVar, null);
    }

    /* renamed from: b */
    public final C0208m mo11b(db dbVar, Map<C0216w, ?> map) throws C0213t, C0211r, C0212s {
        C0187h a;
        eb[] ebVarArr;
        C0208m c0208m;
        List e;
        String i;
        if (map != null) {
            try {
                if (map.containsKey(C0216w.PURE_BARCODE)) {
                    a = this.f201a.m272a(C0069e.m410a(dbVar.m836f()), (Map) map);
                    ebVarArr = f200b;
                    if (a.m1161b() instanceof C0045n) {
                        ((C0045n) a.m1161b()).m245a(ebVarArr);
                    }
                    c0208m = new C0208m(a.m1168h(), a.m1167g(), ebVarArr, C0217x.QR_CODE);
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
                    if (a.m1170j()) {
                        c0208m.m1252a(C0206k.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(a.m1163c()));
                        c0208m.m1252a(C0206k.STRUCTURED_APPEND_PARITY, Integer.valueOf(a.m1171k()));
                    }
                    return c0208m;
                }
            } catch (C0213t e222) {
                throw e222;
            }
        }
        C0139c a2 = new C0056e(dbVar.m836f()).m304a((Map) map);
        a = this.f201a.m272a(a2.m819a(), (Map) map);
        ebVarArr = a2.m820b();
        try {
            if (a.m1161b() instanceof C0045n) {
                ((C0045n) a.m1161b()).m245a(ebVarArr);
            }
            c0208m = new C0208m(a.m1168h(), a.m1167g(), ebVarArr, C0217x.QR_CODE);
            e = a.m1165e();
            if (e != null) {
                c0208m.m1252a(C0206k.BYTE_SEGMENTS, e);
            }
            i = a.m1169i();
            if (i != null) {
                c0208m.m1252a(C0206k.ERROR_CORRECTION_LEVEL, i);
            }
            try {
                if (a.m1170j()) {
                    c0208m.m1252a(C0206k.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(a.m1163c()));
                    c0208m.m1252a(C0206k.STRUCTURED_APPEND_PARITY, Integer.valueOf(a.m1171k()));
                }
                return c0208m;
            } catch (C0213t e2222) {
                throw e2222;
            }
        } catch (C0213t e22222) {
            throw e22222;
        }
    }
}
