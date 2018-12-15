package p000a.p001a.p002a.p011c;

import p000a.p001a.p002a.C0208m;
import p000a.p001a.p002a.C0210q;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.bb */
final class bb {
    /* renamed from: c */
    private static final int[] f311c = new int[]{1, 1, 2};
    /* renamed from: a */
    private final C0124z f312a = new C0124z();
    /* renamed from: b */
    private final db f313b = new db();

    bb() {
    }

    /* renamed from: a */
    C0208m m595a(int i, C0185f c0185f, int i2) throws C0213t {
        int[] a = C0118t.m684a(c0185f, i2, false, f311c);
        try {
            return this.f312a.m724a(i, c0185f, a);
        } catch (C0210q e) {
            return this.f313b.m609a(i, c0185f, a);
        }
    }
}
