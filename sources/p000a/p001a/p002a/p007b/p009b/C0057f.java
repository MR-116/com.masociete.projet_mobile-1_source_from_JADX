package p000a.p001a.p002a.p007b.p009b;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: a.a.a.b.b.f */
final class C0057f implements Comparator<C0059h>, Serializable {
    /* renamed from: a */
    private final float f159a;

    private C0057f(float f) {
        this.f159a = f;
    }

    C0057f(float f, C0052a c0052a) {
        this(f);
    }

    /* renamed from: a */
    public int m307a(C0059h c0059h, C0059h c0059h2) {
        if (c0059h2.m318d() != c0059h.m318d()) {
            return c0059h2.m318d() - c0059h.m318d();
        }
        float abs = Math.abs(c0059h2.m317c() - this.f159a);
        float abs2 = Math.abs(c0059h.m317c() - this.f159a);
        return abs < abs2 ? 1 : abs == abs2 ? 0 : -1;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return m307a((C0059h) obj, (C0059h) obj2);
    }
}
