package p000a.p001a.p002a.p027h.p030a.p031a;

import java.io.Serializable;
import java.util.Comparator;
import p000a.p001a.p002a.p007b.p009b.C0059h;

/* renamed from: a.a.a.h.a.a.b */
final class C0196b implements Comparator<C0059h>, Serializable {
    private C0196b() {
    }

    C0196b(C0195a c0195a) {
        this();
    }

    /* renamed from: a */
    public int m1227a(C0059h c0059h, C0059h c0059h2) {
        float c = c0059h2.m317c() - c0059h.m317c();
        return ((double) c) < 0.0d ? -1 : ((double) c) > 0.0d ? 1 : 0;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return m1227a((C0059h) obj, (C0059h) obj2);
    }
}
