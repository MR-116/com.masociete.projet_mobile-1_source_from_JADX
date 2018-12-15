package p000a.p001a.p002a.p027h;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000a.p001a.p002a.C0029o;
import p000a.p001a.p002a.C0208m;
import p000a.p001a.p002a.C0210q;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.db;
import p000a.p001a.p002a.eb;

/* renamed from: a.a.a.h.b */
public final class C0202b implements C0172c {
    /* renamed from: b */
    private static final int f768b = 100;
    /* renamed from: c */
    private static final int f769c = 4;
    /* renamed from: a */
    private final C0029o f770a;

    public C0202b(C0029o c0029o) {
        this.f770a = c0029o;
    }

    /* renamed from: a */
    private static C0208m m1235a(C0208m c0208m, int i, int i2) {
        eb[] c = c0208m.m1256c();
        if (c == null) {
            return c0208m;
        }
        eb[] ebVarArr = new eb[c.length];
        for (int i3 = 0; i3 < c.length; i3++) {
            eb ebVar = c[i3];
            if (ebVar != null) {
                ebVarArr[i3] = new eb(ebVar.m312b() + ((float) i), ebVar.m311a() + ((float) i2));
            }
        }
        C0208m c0208m2 = new C0208m(c0208m.m1257d(), c0208m.m1259f(), c0208m.m1255b(), ebVarArr, c0208m.m1260g(), c0208m.m1251a());
        c0208m2.m1253a(c0208m.m1258e());
        return c0208m2;
    }

    /* renamed from: a */
    private void m1236a(db dbVar, Map<C0216w, ?> map, List<C0208m> list, int i, int i2, int i3) {
        if (i3 <= 4) {
            try {
                Object obj;
                C0208m b = this.f770a.mo11b(dbVar, map);
                for (C0208m d : list) {
                    if (d.m1257d().equals(b.m1257d())) {
                        obj = 1;
                        break;
                    }
                }
                obj = null;
                if (obj == null) {
                    try {
                        list.add(C0202b.m1235a(b, i, i2));
                    } catch (C0210q e) {
                        throw e;
                    }
                }
                eb[] c = b.m1256c();
                if (c != null) {
                    try {
                        if (c.length != 0) {
                            int d2 = dbVar.m834d();
                            int b2 = dbVar.m832b();
                            float f = (float) d2;
                            float f2 = (float) b2;
                            float f3 = 0.0f;
                            float f4 = 0.0f;
                            int length = c.length;
                            int i4 = 0;
                            while (i4 < length) {
                                float f5;
                                float f6;
                                float f7;
                                eb ebVar = c[i4];
                                if (ebVar == null) {
                                    f5 = f4;
                                    f6 = f2;
                                    f7 = f;
                                    f = f3;
                                } else {
                                    float b3 = ebVar.m312b();
                                    f5 = ebVar.m311a();
                                    f7 = b3 < f ? b3 : f;
                                    f6 = f5 < f2 ? f5 : f2;
                                    f = b3 > f3 ? b3 : f3;
                                    if (f5 <= f4) {
                                        f5 = f4;
                                    }
                                }
                                i4++;
                                f4 = f5;
                                f3 = f;
                                f2 = f6;
                                f = f7;
                            }
                            if (f > 100.0f) {
                                try {
                                    m1236a(dbVar.m829a(0, 0, (int) f, b2), map, list, i, i2, i3 + 1);
                                } catch (C0210q e2) {
                                    throw e2;
                                }
                            }
                            if (f2 > 100.0f) {
                                try {
                                    m1236a(dbVar.m829a(0, 0, d2, (int) f2), map, list, i, i2, i3 + 1);
                                } catch (C0210q e22) {
                                    throw e22;
                                }
                            }
                            if (f3 < ((float) (d2 - 100))) {
                                try {
                                    m1236a(dbVar.m829a((int) f3, 0, d2 - ((int) f3), b2), map, list, i + ((int) f3), i2, i3 + 1);
                                } catch (C0210q e222) {
                                    throw e222;
                                }
                            }
                            if (f4 < ((float) (b2 - 100))) {
                                try {
                                    m1236a(dbVar.m829a(0, (int) f4, d2, b2 - ((int) f4)), map, list, i, i2 + ((int) f4), i3 + 1);
                                } catch (C0210q e2222) {
                                    throw e2222;
                                }
                            }
                        }
                    } catch (C0210q e22222) {
                        throw e22222;
                    }
                }
            } catch (C0210q e3) {
            }
        }
    }

    /* renamed from: a */
    public C0208m[] mo30a(db dbVar) throws C0213t {
        return mo31a(dbVar, null);
    }

    /* renamed from: a */
    public C0208m[] mo31a(db dbVar, Map<C0216w, ?> map) throws C0213t {
        List arrayList = new ArrayList();
        try {
            m1236a(dbVar, map, arrayList, 0, 0, 0);
            if (!arrayList.isEmpty()) {
                return (C0208m[]) arrayList.toArray(new C0208m[arrayList.size()]);
            }
            throw C0213t.m1269a();
        } catch (C0213t e) {
            throw e;
        }
    }
}
