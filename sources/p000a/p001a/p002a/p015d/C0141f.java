package p000a.p001a.p002a.p015d;

import java.util.List;
import java.util.Map;
import p000a.p001a.p002a.C0029o;
import p000a.p001a.p002a.C0206k;
import p000a.p001a.p002a.C0208m;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0214u;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.db;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p015d.p016a.C0126b;
import p000a.p001a.p002a.p015d.p017b.C0128b;
import p000a.p001a.p002a.p019g.C0187h;

/* renamed from: a.a.a.d.f */
public final class C0141f implements C0029o {
    /* renamed from: a */
    public void mo9a() {
    }

    /* renamed from: b */
    public C0208m mo10b(db dbVar) throws C0213t, C0212s {
        return mo11b(dbVar, null);
    }

    /* renamed from: b */
    public C0208m mo11b(db dbVar, Map<C0216w, ?> map) throws C0213t, C0212s {
        C0140e a;
        eb[] b;
        C0187h a2;
        eb[] ebVarArr;
        C0213t c0213t;
        C0213t e;
        C0187h c0187h;
        C0212s e2;
        C0214u c0214u;
        C0208m c0208m;
        List e3;
        String i;
        C0212s c0212s;
        C0212s c0212s2 = null;
        C0126b c0126b = new C0126b(dbVar.m836f());
        try {
            a = c0126b.m745a(false);
            b = a.m820b();
            try {
                a2 = new C0128b().m761a(a);
                ebVarArr = b;
                c0213t = null;
            } catch (C0213t e4) {
                e = e4;
                ebVarArr = b;
                c0213t = e;
                a2 = null;
                if (a2 == null) {
                    c0187h = a2;
                } else {
                    try {
                        a = c0126b.m745a(true);
                        ebVarArr = a.m820b();
                        c0187h = new C0128b().m761a(a);
                    } catch (C0213t e5) {
                        e2 = e5;
                        if (c0213t != null) {
                            try {
                                throw c0213t;
                            } catch (C0213t e6) {
                                throw e6;
                            }
                        } else if (c0212s2 == null) {
                            try {
                                throw c0212s2;
                            } catch (C0213t e62) {
                                throw e62;
                            }
                        } else {
                            throw e2;
                        }
                    } catch (C0212s e7) {
                        e2 = e7;
                        if (c0213t != null) {
                            throw c0213t;
                        } else if (c0212s2 == null) {
                            throw e2;
                        } else {
                            throw c0212s2;
                        }
                    }
                }
                if (map != null) {
                    c0214u = (C0214u) map.get(C0216w.NEED_RESULT_POINT_CALLBACK);
                    if (c0214u != null) {
                        for (eb a3 : ebVarArr) {
                            c0214u.m1270a(a3);
                        }
                    }
                }
                c0208m = new C0208m(c0187h.m1168h(), c0187h.m1167g(), c0187h.m1166f(), ebVarArr, C0217x.AZTEC, System.currentTimeMillis());
                e3 = c0187h.m1165e();
                if (e3 != null) {
                    try {
                        c0208m.m1252a(C0206k.BYTE_SEGMENTS, e3);
                    } catch (C0213t e622) {
                        throw e622;
                    }
                }
                i = c0187h.m1169i();
                if (i != null) {
                    try {
                        c0208m.m1252a(C0206k.ERROR_CORRECTION_LEVEL, i);
                    } catch (C0213t e6222) {
                        throw e6222;
                    }
                }
                return c0208m;
            } catch (C0212s e8) {
                e2 = e8;
                ebVarArr = b;
                c0213t = null;
                c0212s = e2;
                a2 = null;
                c0212s2 = c0212s;
                if (a2 == null) {
                    a = c0126b.m745a(true);
                    ebVarArr = a.m820b();
                    c0187h = new C0128b().m761a(a);
                } else {
                    c0187h = a2;
                }
                if (map != null) {
                    c0214u = (C0214u) map.get(C0216w.NEED_RESULT_POINT_CALLBACK);
                    if (c0214u != null) {
                        while (r1 < r2) {
                            c0214u.m1270a(a3);
                        }
                    }
                }
                c0208m = new C0208m(c0187h.m1168h(), c0187h.m1167g(), c0187h.m1166f(), ebVarArr, C0217x.AZTEC, System.currentTimeMillis());
                e3 = c0187h.m1165e();
                if (e3 != null) {
                    c0208m.m1252a(C0206k.BYTE_SEGMENTS, e3);
                }
                i = c0187h.m1169i();
                if (i != null) {
                    c0208m.m1252a(C0206k.ERROR_CORRECTION_LEVEL, i);
                }
                return c0208m;
            }
        } catch (C0213t e9) {
            e6222 = e9;
            b = null;
            ebVarArr = b;
            c0213t = e6222;
            a2 = null;
            if (a2 == null) {
                c0187h = a2;
            } else {
                a = c0126b.m745a(true);
                ebVarArr = a.m820b();
                c0187h = new C0128b().m761a(a);
            }
            if (map != null) {
                c0214u = (C0214u) map.get(C0216w.NEED_RESULT_POINT_CALLBACK);
                if (c0214u != null) {
                    while (r1 < r2) {
                        c0214u.m1270a(a3);
                    }
                }
            }
            c0208m = new C0208m(c0187h.m1168h(), c0187h.m1167g(), c0187h.m1166f(), ebVarArr, C0217x.AZTEC, System.currentTimeMillis());
            e3 = c0187h.m1165e();
            if (e3 != null) {
                c0208m.m1252a(C0206k.BYTE_SEGMENTS, e3);
            }
            i = c0187h.m1169i();
            if (i != null) {
                c0208m.m1252a(C0206k.ERROR_CORRECTION_LEVEL, i);
            }
            return c0208m;
        } catch (C0212s e10) {
            e2 = e10;
            b = null;
            ebVarArr = b;
            c0213t = null;
            c0212s = e2;
            a2 = null;
            c0212s2 = c0212s;
            if (a2 == null) {
                a = c0126b.m745a(true);
                ebVarArr = a.m820b();
                c0187h = new C0128b().m761a(a);
            } else {
                c0187h = a2;
            }
            if (map != null) {
                c0214u = (C0214u) map.get(C0216w.NEED_RESULT_POINT_CALLBACK);
                if (c0214u != null) {
                    while (r1 < r2) {
                        c0214u.m1270a(a3);
                    }
                }
            }
            c0208m = new C0208m(c0187h.m1168h(), c0187h.m1167g(), c0187h.m1166f(), ebVarArr, C0217x.AZTEC, System.currentTimeMillis());
            e3 = c0187h.m1165e();
            if (e3 != null) {
                c0208m.m1252a(C0206k.BYTE_SEGMENTS, e3);
            }
            i = c0187h.m1169i();
            if (i != null) {
                c0208m.m1252a(C0206k.ERROR_CORRECTION_LEVEL, i);
            }
            return c0208m;
        }
        if (a2 == null) {
            a = c0126b.m745a(true);
            ebVarArr = a.m820b();
            c0187h = new C0128b().m761a(a);
        } else {
            c0187h = a2;
        }
        if (map != null) {
            c0214u = (C0214u) map.get(C0216w.NEED_RESULT_POINT_CALLBACK);
            if (c0214u != null) {
                while (r1 < r2) {
                    c0214u.m1270a(a3);
                }
            }
        }
        c0208m = new C0208m(c0187h.m1168h(), c0187h.m1167g(), c0187h.m1166f(), ebVarArr, C0217x.AZTEC, System.currentTimeMillis());
        e3 = c0187h.m1165e();
        if (e3 != null) {
            c0208m.m1252a(C0206k.BYTE_SEGMENTS, e3);
        }
        i = c0187h.m1169i();
        if (i != null) {
            c0208m.m1252a(C0206k.ERROR_CORRECTION_LEVEL, i);
        }
        return c0208m;
    }
}
