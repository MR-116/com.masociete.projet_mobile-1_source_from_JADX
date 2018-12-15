package p000a.p001a.p002a.p022f.p025c;

import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.f.c.h */
final class C0164h {
    /* renamed from: a */
    private int f628a;
    /* renamed from: b */
    private int f629b;
    /* renamed from: c */
    private int f630c;
    /* renamed from: d */
    private eb f631d;
    /* renamed from: e */
    private eb f632e;
    /* renamed from: f */
    private C0194n f633f;
    /* renamed from: g */
    private int f634g;
    /* renamed from: h */
    private eb f635h;
    /* renamed from: i */
    private eb f636i;

    C0164h(C0164h c0164h) {
        m1010a(c0164h.f633f, c0164h.f636i, c0164h.f631d, c0164h.f635h, c0164h.f632e);
    }

    C0164h(C0194n c0194n, eb ebVar, eb ebVar2, eb ebVar3, eb ebVar4) throws C0213t {
        if (!(ebVar == null && ebVar3 == null) && (!(ebVar2 == null && ebVar4 == null) && ((ebVar == null || ebVar2 != null) && (ebVar3 == null || ebVar4 != null)))) {
            m1010a(c0194n, ebVar, ebVar2, ebVar3, ebVar4);
            return;
        }
        try {
            throw C0213t.m1269a();
        } catch (C0213t e) {
            throw e;
        }
    }

    /* renamed from: a */
    static C0164h m1009a(C0164h c0164h, C0164h c0164h2) throws C0213t {
        return c0164h == null ? c0164h2 : c0164h2 == null ? c0164h : new C0164h(c0164h.f633f, c0164h.f636i, c0164h.f631d, c0164h2.f635h, c0164h2.f632e);
    }

    /* renamed from: a */
    private void m1010a(C0194n c0194n, eb ebVar, eb ebVar2, eb ebVar3, eb ebVar4) {
        this.f633f = c0194n;
        this.f636i = ebVar;
        this.f631d = ebVar2;
        this.f635h = ebVar3;
        this.f632e = ebVar4;
        m1011f();
    }

    /* renamed from: f */
    private void m1011f() {
        if (this.f636i == null) {
            this.f636i = new eb(0.0f, this.f635h.m311a());
            this.f631d = new eb(0.0f, this.f632e.m311a());
        } else if (this.f635h == null) {
            this.f635h = new eb((float) (this.f633f.m1208a() - 1), this.f636i.m311a());
            this.f632e = new eb((float) (this.f633f.m1208a() - 1), this.f631d.m311a());
        }
        this.f629b = (int) Math.min(this.f636i.m312b(), this.f631d.m312b());
        this.f628a = (int) Math.max(this.f635h.m312b(), this.f632e.m312b());
        this.f634g = (int) Math.min(this.f636i.m311a(), this.f635h.m311a());
        this.f630c = (int) Math.max(this.f631d.m311a(), this.f632e.m311a());
    }

    /* renamed from: a */
    int m1012a() {
        return this.f629b;
    }

    /* renamed from: a */
    C0164h m1013a(int i, int i2, boolean z) throws C0213t {
        eb ebVar;
        int a;
        eb ebVar2;
        eb ebVar3 = this.f636i;
        eb ebVar4 = this.f631d;
        eb ebVar5 = this.f635h;
        eb ebVar6 = this.f632e;
        if (i > 0) {
            if (z) {
                try {
                    ebVar = this.f636i;
                } catch (C0213t e) {
                    throw e;
                }
            }
            ebVar = this.f635h;
            a = ((int) ebVar.m311a()) - i;
            if (a < 0) {
                a = 0;
            }
            ebVar2 = new eb(ebVar.m312b(), (float) a);
            if (!z) {
                ebVar5 = ebVar2;
                ebVar2 = ebVar3;
            }
        } else {
            ebVar2 = ebVar3;
        }
        if (i2 > 0) {
            if (z) {
                try {
                    ebVar = this.f631d;
                } catch (C0213t e2) {
                    throw e2;
                }
            }
            ebVar = this.f632e;
            a = ((int) ebVar.m311a()) + i2;
            if (a >= this.f633f.m1226i()) {
                a = this.f633f.m1226i() - 1;
            }
            ebVar3 = new eb(ebVar.m312b(), (float) a);
            if (!z) {
                ebVar6 = ebVar3;
                ebVar3 = ebVar4;
            }
        } else {
            ebVar3 = ebVar4;
        }
        m1011f();
        return new C0164h(this.f633f, ebVar2, ebVar3, ebVar5, ebVar6);
    }

    /* renamed from: b */
    eb m1014b() {
        return this.f632e;
    }

    /* renamed from: c */
    int m1015c() {
        return this.f628a;
    }

    /* renamed from: d */
    int m1016d() {
        return this.f630c;
    }

    /* renamed from: e */
    eb m1017e() {
        return this.f631d;
    }

    /* renamed from: g */
    int m1018g() {
        return this.f634g;
    }

    /* renamed from: h */
    eb m1019h() {
        return this.f635h;
    }

    /* renamed from: i */
    eb m1020i() {
        return this.f636i;
    }
}
