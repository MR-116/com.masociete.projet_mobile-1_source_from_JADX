package p000a.p001a.p002a.p007b.p009b;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: a.a.a.b.b.b */
final class C0053b implements Comparator<C0059h>, Serializable {
    /* renamed from: a */
    private final float f139a;

    private C0053b(float f) {
        this.f139a = f;
    }

    C0053b(float f, C0052a c0052a) {
        this(f);
    }

    /* renamed from: a */
    public int m275a(C0059h c0059h, C0059h c0059h2) {
        float abs = Math.abs(c0059h2.m317c() - this.f139a);
        float abs2 = Math.abs(c0059h.m317c() - this.f139a);
        return abs < abs2 ? -1 : abs == abs2 ? 0 : 1;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return m275a((C0059h) obj, (C0059h) obj2);
    }
}
