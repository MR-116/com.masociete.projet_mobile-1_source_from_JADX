package p000a.p001a.p002a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p000a.p001a.p002a.p003a.C0030e;
import p000a.p001a.p002a.p007b.C0069e;
import p000a.p001a.p002a.p011c.C0116r;
import p000a.p001a.p002a.p015d.C0141f;
import p000a.p001a.p002a.p020e.C0145b;
import p000a.p001a.p002a.p022f.C0173f;

/* renamed from: a.a.a.v */
public final class C0215v implements C0029o {
    /* renamed from: a */
    private C0029o[] f790a;
    /* renamed from: b */
    private Map<C0216w, ?> f791b;

    /* renamed from: c */
    private C0208m m1271c(db dbVar) throws C0213t {
        if (this.f790a != null) {
            C0029o[] c0029oArr = this.f790a;
            int length = c0029oArr.length;
            int i = 0;
            while (i < length) {
                try {
                    return c0029oArr[i].mo11b(dbVar, this.f791b);
                } catch (C0210q e) {
                    i++;
                }
            }
        }
        throw C0213t.m1269a();
    }

    /* renamed from: a */
    public C0208m m1272a(db dbVar) throws C0213t {
        try {
            if (this.f790a == null) {
                m1274a(null);
            }
            return m1271c(dbVar);
        } catch (C0213t e) {
            throw e;
        }
    }

    /* renamed from: a */
    public void mo9a() {
        if (this.f790a != null) {
            for (C0029o a : this.f790a) {
                a.mo9a();
            }
        }
    }

    /* renamed from: a */
    public void m1274a(Map<C0216w, ?> map) {
        Object obj = null;
        this.f791b = map;
        Object obj2 = (map == null || !map.containsKey(C0216w.TRY_HARDER)) ? null : 1;
        Collection collection = map == null ? null : (Collection) map.get(C0216w.POSSIBLE_FORMATS);
        Collection arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(C0217x.UPC_A) || collection.contains(C0217x.UPC_E) || collection.contains(C0217x.EAN_13) || collection.contains(C0217x.EAN_8) || collection.contains(C0217x.CODABAR) || collection.contains(C0217x.CODE_39) || collection.contains(C0217x.CODE_93) || collection.contains(C0217x.CODE_128) || collection.contains(C0217x.ITF) || collection.contains(C0217x.RSS_14) || collection.contains(C0217x.RSS_EXPANDED)) {
                obj = 1;
            }
            if (obj != null && obj2 == null) {
                arrayList.add(new C0116r(map));
            }
            if (collection.contains(C0217x.QR_CODE)) {
                arrayList.add(new C0069e());
            }
            if (collection.contains(C0217x.DATA_MATRIX)) {
                arrayList.add(new C0030e());
            }
            if (collection.contains(C0217x.AZTEC)) {
                arrayList.add(new C0141f());
            }
            if (collection.contains(C0217x.PDF_417)) {
                arrayList.add(new C0173f());
            }
            if (collection.contains(C0217x.MAXICODE)) {
                arrayList.add(new C0145b());
            }
            if (!(obj == null || obj2 == null)) {
                arrayList.add(new C0116r(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (obj2 == null) {
                arrayList.add(new C0116r(map));
            }
            arrayList.add(new C0069e());
            arrayList.add(new C0030e());
            arrayList.add(new C0141f());
            arrayList.add(new C0173f());
            arrayList.add(new C0145b());
            if (obj2 != null) {
                arrayList.add(new C0116r(map));
            }
        }
        this.f790a = (C0029o[]) arrayList.toArray(new C0029o[arrayList.size()]);
    }

    /* renamed from: b */
    public C0208m mo10b(db dbVar) throws C0213t {
        m1274a(null);
        return m1271c(dbVar);
    }

    /* renamed from: b */
    public C0208m mo11b(db dbVar, Map<C0216w, ?> map) throws C0213t {
        m1274a((Map) map);
        return m1271c(dbVar);
    }
}
