package p000a.p001a.p002a.p027h.p030a.p031a;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000a.p001a.p002a.C0210q;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0214u;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.p007b.p009b.C0056e;
import p000a.p001a.p002a.p007b.p009b.C0060i;
import p000a.p001a.p002a.p019g.C0139c;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.h.a.a.d */
public final class C0198d extends C0056e {
    /* renamed from: c */
    private static final C0139c[] f765c = new C0139c[0];

    public C0198d(C0194n c0194n) {
        super(c0194n);
    }

    /* renamed from: b */
    public C0139c[] m1230b(Map<C0216w, ?> map) throws C0213t {
        C0060i[] b = new C0197c(m305b(), map == null ? null : (C0214u) map.get(C0216w.NEED_RESULT_POINT_CALLBACK)).m1229b(map);
        try {
            if (b.length == 0) {
                throw C0213t.m1269a();
            }
            List arrayList = new ArrayList();
            for (C0060i a : b) {
                try {
                    arrayList.add(m303a(a));
                } catch (C0210q e) {
                }
            }
            try {
                return arrayList.isEmpty() ? f765c : (C0139c[]) arrayList.toArray(new C0139c[arrayList.size()]);
            } catch (C0210q e2) {
                throw e2;
            }
        } catch (C0210q e22) {
            throw e22;
        }
    }
}
