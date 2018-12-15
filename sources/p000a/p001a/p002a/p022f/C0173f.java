package p000a.p001a.p002a.p022f;

import java.util.ArrayList;
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
import p000a.p001a.p002a.p019g.C0187h;
import p000a.p001a.p002a.p022f.p024b.C0153a;
import p000a.p001a.p002a.p022f.p024b.C0154b;
import p000a.p001a.p002a.p022f.p025c.C0158b;
import p000a.p001a.p002a.p027h.C0172c;

/* renamed from: a.a.a.f.f */
public final class C0173f implements C0029o, C0172c {
    /* renamed from: a */
    private static int m1063a(eb ebVar, eb ebVar2) {
        return (ebVar == null || ebVar2 == null) ? Integer.MAX_VALUE : (int) Math.abs(ebVar.m312b() - ebVar2.m312b());
    }

    /* renamed from: a */
    private static int m1064a(eb[] ebVarArr) {
        return Math.min(Math.min(C0173f.m1063a(ebVarArr[0], ebVarArr[4]), (C0173f.m1063a(ebVarArr[6], ebVarArr[2]) * 17) / 18), Math.min(C0173f.m1063a(ebVarArr[1], ebVarArr[5]), (C0173f.m1063a(ebVarArr[7], ebVarArr[3]) * 17) / 18));
    }

    /* renamed from: a */
    private static C0208m[] m1065a(db dbVar, Map<C0216w, ?> map, boolean z) throws C0213t, C0212s, C0211r {
        List arrayList = new ArrayList();
        C0153a a = C0154b.m909a(dbVar, (Map) map, z);
        for (eb[] ebVarArr : a.m907b()) {
            C0187h a2 = C0158b.m951a(a.m906a(), ebVarArr[4], ebVarArr[5], ebVarArr[6], ebVarArr[7], C0173f.m1064a(ebVarArr), C0173f.m1067b(ebVarArr));
            C0208m c0208m = new C0208m(a2.m1168h(), a2.m1167g(), ebVarArr, C0217x.PDF_417);
            c0208m.m1252a(C0206k.ERROR_CORRECTION_LEVEL, a2.m1169i());
            C0171e c0171e = (C0171e) a2.m1161b();
            if (c0171e != null) {
                try {
                    c0208m.m1252a(C0206k.PDF417_EXTRA_METADATA, c0171e);
                } catch (C0213t e) {
                    throw e;
                }
            }
            arrayList.add(c0208m);
        }
        return (C0208m[]) arrayList.toArray(new C0208m[arrayList.size()]);
    }

    /* renamed from: b */
    private static int m1066b(eb ebVar, eb ebVar2) {
        return (ebVar == null || ebVar2 == null) ? 0 : (int) Math.abs(ebVar.m312b() - ebVar2.m312b());
    }

    /* renamed from: b */
    private static int m1067b(eb[] ebVarArr) {
        return Math.max(Math.max(C0173f.m1066b(ebVarArr[0], ebVarArr[4]), (C0173f.m1066b(ebVarArr[6], ebVarArr[2]) * 17) / 18), Math.max(C0173f.m1066b(ebVarArr[1], ebVarArr[5]), (C0173f.m1066b(ebVarArr[7], ebVarArr[3]) * 17) / 18));
    }

    /* renamed from: a */
    public void mo9a() {
    }

    /* renamed from: a */
    public C0208m[] mo30a(db dbVar) throws C0213t {
        return mo31a(dbVar, null);
    }

    /* renamed from: a */
    public C0208m[] mo31a(db dbVar, Map<C0216w, ?> map) throws C0213t {
        try {
            return C0173f.m1065a(dbVar, map, true);
        } catch (C0212s e) {
            throw C0213t.m1269a();
        } catch (C0211r e2) {
            throw C0213t.m1269a();
        }
    }

    /* renamed from: b */
    public C0208m mo10b(db dbVar) throws C0213t, C0212s, C0211r {
        return mo11b(dbVar, null);
    }

    /* renamed from: b */
    public C0208m mo11b(db dbVar, Map<C0216w, ?> map) throws C0213t, C0212s, C0211r {
        C0208m[] a = C0173f.m1065a(dbVar, map, false);
        if (a != null) {
            try {
                if (a.length != 0) {
                    if (a[0] != null) {
                        return a[0];
                    }
                }
            } catch (C0213t e) {
                throw e;
            } catch (C0213t e2) {
                throw e2;
            }
        }
        throw C0213t.m1269a();
    }
}
