package p000a.p001a.p002a.p027h.p030a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p000a.p001a.p002a.C0206k;
import p000a.p001a.p002a.C0208m;
import p000a.p001a.p002a.C0210q;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.db;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p007b.C0069e;
import p000a.p001a.p002a.p007b.p008a.C0045n;
import p000a.p001a.p002a.p019g.C0139c;
import p000a.p001a.p002a.p019g.C0187h;
import p000a.p001a.p002a.p027h.C0172c;
import p000a.p001a.p002a.p027h.p030a.p031a.C0198d;

/* renamed from: a.a.a.h.a.c */
public final class C0200c extends C0069e implements C0172c {
    /* renamed from: c */
    private static final eb[] f766c = new eb[0];
    /* renamed from: d */
    private static final C0208m[] f767d = new C0208m[0];

    /* renamed from: a */
    private static List<C0208m> m1231a(List<C0208m> list) {
        C0208m c0208m;
        int i;
        for (C0208m c0208m2 : list) {
            if (c0208m2.m1258e().containsKey(C0206k.STRUCTURED_APPEND_SEQUENCE)) {
                i = 1;
                break;
            }
        }
        i = 0;
        if (i == 0) {
            return list;
        }
        List<C0208m> arrayList = new ArrayList();
        List<C0208m> arrayList2 = new ArrayList();
        for (C0208m c0208m22 : list) {
            arrayList.add(c0208m22);
            if (c0208m22.m1258e().containsKey(C0206k.STRUCTURED_APPEND_SEQUENCE)) {
                arrayList2.add(c0208m22);
            }
        }
        Collections.sort(arrayList2, new C0201d(null));
        StringBuilder stringBuilder = new StringBuilder();
        int i2 = 0;
        int i3 = 0;
        for (C0208m c0208m222 : arrayList2) {
            stringBuilder.append(c0208m222.m1257d());
            i3 += c0208m222.m1259f().length;
            if (c0208m222.m1258e().containsKey(C0206k.BYTE_SEGMENTS)) {
                for (byte[] length : (Iterable) c0208m222.m1258e().get(C0206k.BYTE_SEGMENTS)) {
                    i2 += length.length;
                }
            }
            i2 = i2;
        }
        Object obj = new byte[i3];
        Object obj2 = new byte[i2];
        i3 = 0;
        int i4 = 0;
        for (C0208m c0208m2222 : arrayList2) {
            System.arraycopy(c0208m2222.m1259f(), 0, obj, i4, c0208m2222.m1259f().length);
            i4 += c0208m2222.m1259f().length;
            if (c0208m2222.m1258e().containsKey(C0206k.BYTE_SEGMENTS)) {
                for (byte[] length2 : (Iterable) c0208m2222.m1258e().get(C0206k.BYTE_SEGMENTS)) {
                    System.arraycopy(length2, 0, obj2, i3, length2.length);
                    i3 += length2.length;
                }
            }
            i3 = i3;
        }
        c0208m2222 = new C0208m(stringBuilder.toString(), obj, f766c, C0217x.QR_CODE);
        if (i2 > 0) {
            Collection arrayList3 = new ArrayList();
            arrayList3.add(obj2);
            c0208m2222.m1252a(C0206k.BYTE_SEGMENTS, arrayList3);
        }
        arrayList.add(c0208m2222);
        return arrayList;
    }

    /* renamed from: a */
    public C0208m[] mo30a(db dbVar) throws C0213t {
        return mo31a(dbVar, null);
    }

    /* renamed from: a */
    public C0208m[] mo31a(db dbVar, Map<C0216w, ?> map) throws C0213t {
        List arrayList = new ArrayList();
        for (C0139c c0139c : new C0198d(dbVar.m836f()).m1230b(map)) {
            C0187h a = m412b().m272a(c0139c.m819a(), (Map) map);
            eb[] b = c0139c.m820b();
            try {
                if (a.m1161b() instanceof C0045n) {
                    ((C0045n) a.m1161b()).m245a(b);
                }
                C0208m c0208m = new C0208m(a.m1168h(), a.m1167g(), b, C0217x.QR_CODE);
                List e = a.m1165e();
                if (e != null) {
                    c0208m.m1252a(C0206k.BYTE_SEGMENTS, e);
                }
                String i = a.m1169i();
                if (i != null) {
                    c0208m.m1252a(C0206k.ERROR_CORRECTION_LEVEL, i);
                }
                if (a.m1170j()) {
                    c0208m.m1252a(C0206k.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(a.m1163c()));
                    c0208m.m1252a(C0206k.STRUCTURED_APPEND_PARITY, Integer.valueOf(a.m1171k()));
                }
                arrayList.add(c0208m);
            } catch (C0210q e2) {
                throw e2;
            } catch (C0210q e22) {
                throw e22;
            } catch (C0210q e222) {
                throw e222;
            } catch (C0210q e2222) {
                throw e2222;
            } catch (C0210q e3) {
            }
        }
        try {
            if (arrayList.isEmpty()) {
                return f767d;
            }
            List a2 = C0200c.m1231a(arrayList);
            return (C0208m[]) a2.toArray(new C0208m[a2.size()]);
        } catch (C0210q e22222) {
            throw e22222;
        }
    }
}
