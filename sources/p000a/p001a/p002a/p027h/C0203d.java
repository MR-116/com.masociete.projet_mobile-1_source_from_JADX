package p000a.p001a.p002a.p027h;

import java.util.Map;
import p000a.p001a.p002a.C0029o;
import p000a.p001a.p002a.C0208m;
import p000a.p001a.p002a.C0211r;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.db;
import p000a.p001a.p002a.eb;

/* renamed from: a.a.a.h.d */
public final class C0203d implements C0029o {
    /* renamed from: a */
    private final C0029o f771a;

    public C0203d(C0029o c0029o) {
        this.f771a = c0029o;
    }

    /* renamed from: a */
    private static void m1239a(eb[] ebVarArr, int i, int i2) {
        if (ebVarArr != null) {
            for (int i3 = 0; i3 < ebVarArr.length; i3++) {
                eb ebVar = ebVarArr[i3];
                ebVarArr[i3] = new eb(ebVar.m312b() + ((float) i), ebVar.m311a() + ((float) i2));
            }
        }
    }

    /* renamed from: a */
    public void mo9a() {
        this.f771a.mo9a();
    }

    /* renamed from: b */
    public C0208m mo10b(db dbVar) throws C0213t, C0211r, C0212s {
        return mo11b(dbVar, null);
    }

    /* renamed from: b */
    public C0208m mo11b(db dbVar, Map<C0216w, ?> map) throws C0213t, C0211r, C0212s {
        int d = dbVar.m834d() / 2;
        int b = dbVar.m832b() / 2;
        try {
            return this.f771a.mo11b(dbVar.m829a(0, 0, d, b), map);
        } catch (C0213t e) {
            C0208m b2;
            try {
                b2 = this.f771a.mo11b(dbVar.m829a(d, 0, d, b), map);
                C0203d.m1239a(b2.m1256c(), d, 0);
                return b2;
            } catch (C0213t e2) {
                try {
                    b2 = this.f771a.mo11b(dbVar.m829a(0, b, d, b), map);
                    C0203d.m1239a(b2.m1256c(), 0, b);
                    return b2;
                } catch (C0213t e3) {
                    try {
                        b2 = this.f771a.mo11b(dbVar.m829a(d, b, d, b), map);
                        C0203d.m1239a(b2.m1256c(), d, b);
                        return b2;
                    } catch (C0213t e4) {
                        int i = d / 2;
                        int i2 = b / 2;
                        b2 = this.f771a.mo11b(dbVar.m829a(i, i2, d, b), map);
                        C0203d.m1239a(b2.m1256c(), i, i2);
                        return b2;
                    }
                }
            }
        }
    }
}
