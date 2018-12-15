package p000a.p001a.p002a.p011c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p000a.p001a.p002a.C0029o;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.C0217x;

/* renamed from: a.a.a.c.s */
public final class C0117s extends C0091l {
    /* renamed from: a */
    private final C0118t[] f398a;

    public C0117s(Map<C0216w, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(C0216w.POSSIBLE_FORMATS);
        Collection arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(C0217x.EAN_13)) {
                arrayList.add(new C0119u());
            } else if (collection.contains(C0217x.UPC_A)) {
                arrayList.add(new C0121w());
            }
            if (collection.contains(C0217x.EAN_8)) {
                arrayList.add(new C0120v());
            }
            if (collection.contains(C0217x.UPC_E)) {
                arrayList.add(new C0122x());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C0119u());
            arrayList.add(new C0120v());
            arrayList.add(new C0122x());
        }
        this.f398a = (C0118t[]) arrayList.toArray(new C0118t[arrayList.size()]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public p000a.p001a.p002a.C0208m mo20a(int r8, p000a.p001a.p002a.p019g.C0185f r9, java.util.Map<p000a.p001a.p002a.C0216w, ?> r10) throws p000a.p001a.p002a.C0213t {
        /*
        r7 = this;
        r2 = 1;
        r3 = 0;
        r1 = p000a.p001a.p002a.p011c.C0118t.m683a(r9);
        r4 = r7.f398a;
        r5 = r4.length;
        r0 = r3;
    L_0x000a:
        if (r0 >= r5) goto L_0x0070;
    L_0x000c:
        r6 = r4[r0];
        r4 = r6.mo25a(r8, r9, r1, r10);	 Catch:{ q -> 0x006c }
        r0 = r4.m1260g();	 Catch:{ q -> 0x0059 }
        r1 = p000a.p001a.p002a.C0217x.EAN_13;	 Catch:{ q -> 0x0059 }
        if (r0 != r1) goto L_0x005d;
    L_0x001a:
        r0 = r4.m1257d();	 Catch:{ q -> 0x005b }
        r1 = 0;
        r0 = r0.charAt(r1);	 Catch:{ q -> 0x005b }
        r1 = 48;
        if (r0 != r1) goto L_0x005d;
    L_0x0027:
        r1 = r2;
    L_0x0028:
        if (r10 != 0) goto L_0x005f;
    L_0x002a:
        r0 = 0;
    L_0x002b:
        if (r0 == 0) goto L_0x0035;
    L_0x002d:
        r5 = p000a.p001a.p002a.C0217x.UPC_A;	 Catch:{ q -> 0x0068 }
        r0 = r0.contains(r5);	 Catch:{ q -> 0x0068 }
        if (r0 == 0) goto L_0x0036;
    L_0x0035:
        r3 = r2;
    L_0x0036:
        if (r1 == 0) goto L_0x006a;
    L_0x0038:
        if (r3 == 0) goto L_0x006a;
    L_0x003a:
        r0 = new a.a.a.m;
        r1 = r4.m1257d();
        r1 = r1.substring(r2);
        r2 = r4.m1259f();
        r3 = r4.m1256c();
        r5 = p000a.p001a.p002a.C0217x.UPC_A;
        r0.<init>(r1, r2, r3, r5);
        r1 = r4.m1258e();
        r0.m1253a(r1);
    L_0x0058:
        return r0;
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ q -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        throw r0;
    L_0x005d:
        r1 = r3;
        goto L_0x0028;
    L_0x005f:
        r0 = p000a.p001a.p002a.C0216w.POSSIBLE_FORMATS;
        r0 = r10.get(r0);
        r0 = (java.util.Collection) r0;
        goto L_0x002b;
    L_0x0068:
        r0 = move-exception;
        throw r0;
    L_0x006a:
        r0 = r4;
        goto L_0x0058;
    L_0x006c:
        r6 = move-exception;
        r0 = r0 + 1;
        goto L_0x000a;
    L_0x0070:
        r0 = p000a.p001a.p002a.C0213t.m1269a();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.c.s.a(int, a.a.a.g.f, java.util.Map):a.a.a.m");
    }

    /* renamed from: a */
    public void mo9a() {
        for (C0029o a : this.f398a) {
            a.mo9a();
        }
    }
}
