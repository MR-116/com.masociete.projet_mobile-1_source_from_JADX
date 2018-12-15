package p000a.p001a.p002a.p011c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p000a.p001a.p002a.C0029o;
import p000a.p001a.p002a.C0208m;
import p000a.p001a.p002a.C0210q;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.p011c.p012a.C0097d;
import p000a.p001a.p002a.p011c.p012a.p013a.C0093c;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.r */
public final class C0116r extends C0091l {
    /* renamed from: a */
    private final C0091l[] f397a;

    public C0116r(Map<C0216w, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(C0216w.POSSIBLE_FORMATS);
        boolean z = (map == null || map.get(C0216w.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        Collection arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(C0217x.EAN_13) || collection.contains(C0217x.UPC_A) || collection.contains(C0217x.EAN_8) || collection.contains(C0217x.UPC_E)) {
                arrayList.add(new C0117s(map));
            }
            if (collection.contains(C0217x.CODE_39)) {
                arrayList.add(new C0113o(z));
            }
            if (collection.contains(C0217x.CODE_93)) {
                arrayList.add(new C0114p());
            }
            if (collection.contains(C0217x.CODE_128)) {
                arrayList.add(new C0112n());
            }
            if (collection.contains(C0217x.ITF)) {
                arrayList.add(new C0115q());
            }
            if (collection.contains(C0217x.CODABAR)) {
                arrayList.add(new C0111m());
            }
            if (collection.contains(C0217x.RSS_14)) {
                arrayList.add(new C0097d());
            }
            if (collection.contains(C0217x.RSS_EXPANDED)) {
                arrayList.add(new C0093c());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C0117s(map));
            arrayList.add(new C0113o());
            arrayList.add(new C0111m());
            arrayList.add(new C0114p());
            arrayList.add(new C0112n());
            arrayList.add(new C0115q());
            arrayList.add(new C0097d());
            arrayList.add(new C0093c());
        }
        this.f397a = (C0091l[]) arrayList.toArray(new C0091l[arrayList.size()]);
    }

    /* renamed from: a */
    public C0208m mo20a(int i, C0185f c0185f, Map<C0216w, ?> map) throws C0213t {
        C0091l[] c0091lArr = this.f397a;
        int i2 = 0;
        while (i2 < c0091lArr.length) {
            try {
                return c0091lArr[i2].mo20a(i, c0185f, (Map) map);
            } catch (C0210q e) {
                i2++;
            }
        }
        throw C0213t.m1269a();
    }

    /* renamed from: a */
    public void mo9a() {
        for (C0029o a : this.f397a) {
            a.mo9a();
        }
    }
}
