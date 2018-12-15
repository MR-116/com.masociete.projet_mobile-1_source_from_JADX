package p000a.p001a.p002a.p027h.p030a;

import java.io.Serializable;
import java.util.Comparator;
import p000a.p001a.p002a.C0206k;
import p000a.p001a.p002a.C0208m;

/* renamed from: a.a.a.h.a.d */
final class C0201d implements Comparator<C0208m>, Serializable {
    private C0201d() {
    }

    C0201d(C0199b c0199b) {
        this();
    }

    /* renamed from: a */
    public int m1234a(C0208m c0208m, C0208m c0208m2) {
        int intValue = ((Integer) c0208m.m1258e().get(C0206k.STRUCTURED_APPEND_SEQUENCE)).intValue();
        int intValue2 = ((Integer) c0208m2.m1258e().get(C0206k.STRUCTURED_APPEND_SEQUENCE)).intValue();
        return intValue < intValue2 ? -1 : intValue > intValue2 ? 1 : 0;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return m1234a((C0208m) obj, (C0208m) obj2);
    }
}
