package p000a.p001a.p002a.p011c;

import java.util.Map;
import p000a.p001a.p002a.C0208m;
import p000a.p001a.p002a.C0211r;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.db;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.w */
public final class C0121w extends C0118t {
    /* renamed from: k */
    private final C0118t f412k = new C0119u();

    /* renamed from: a */
    private static C0208m m698a(C0208m c0208m) throws C0212s {
        String d = c0208m.m1257d();
        try {
            if (d.charAt(0) == '0') {
                return new C0208m(d.substring(1), null, c0208m.m1256c(), C0217x.UPC_A);
            }
            throw C0212s.m1267a();
        } catch (C0212s e) {
            throw e;
        }
    }

    /* renamed from: a */
    protected int mo23a(C0185f c0185f, int[] iArr, StringBuilder stringBuilder) throws C0213t {
        return this.f412k.mo23a(c0185f, iArr, stringBuilder);
    }

    /* renamed from: a */
    public C0208m mo20a(int i, C0185f c0185f, Map<C0216w, ?> map) throws C0213t, C0212s, C0211r {
        return C0121w.m698a(this.f412k.mo20a(i, c0185f, (Map) map));
    }

    /* renamed from: a */
    public C0208m mo25a(int i, C0185f c0185f, int[] iArr, Map<C0216w, ?> map) throws C0213t, C0212s, C0211r {
        return C0121w.m698a(this.f412k.mo25a(i, c0185f, iArr, (Map) map));
    }

    /* renamed from: b */
    public C0208m mo10b(db dbVar) throws C0213t, C0212s {
        return C0121w.m698a(this.f412k.mo10b(dbVar));
    }

    /* renamed from: b */
    public C0208m mo11b(db dbVar, Map<C0216w, ?> map) throws C0213t, C0212s {
        return C0121w.m698a(this.f412k.mo11b(dbVar, map));
    }

    /* renamed from: b */
    C0217x mo24b() {
        return C0217x.UPC_A;
    }
}
