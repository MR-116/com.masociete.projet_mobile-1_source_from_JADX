package fr.pcsoft.wdjava.ui.p079e;

import fr.pcsoft.wdjava.core.C0727l;
import fr.pcsoft.wdjava.ui.style.C1494g;

/* renamed from: fr.pcsoft.wdjava.ui.e.a */
public class C1398a implements C1397c {
    /* renamed from: h */
    private static final int f4127h = 0;
    /* renamed from: i */
    private static final int f4128i = 2;
    /* renamed from: j */
    private static final int f4129j = 3;
    /* renamed from: m */
    private static final int f4130m = 1;
    /* renamed from: f */
    private int f4131f = 0;
    /* renamed from: g */
    private int f4132g = 0;
    /* renamed from: k */
    private int f4133k = 0;
    /* renamed from: l */
    private String f4134l = "";

    public C1398a(String str, double d, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.f4134l = str;
        this.f4132g = (int) d;
        this.f4133k = C0727l.m3090a(this.f4133k, 0, z);
        this.f4133k = C0727l.m3090a(this.f4133k, 1, z2);
        this.f4133k = C0727l.m3090a(this.f4133k, 2, z3);
        this.f4133k = C0727l.m3090a(this.f4133k, 3, z4);
        this.f4131f = i;
    }

    /* renamed from: a */
    public final int mo3760a() {
        return this.f4132g;
    }

    /* renamed from: a */
    public C1399b m9923a(C1494g c1494g) {
        if (this.f4131f == 63) {
            return C1400d.m9965a(mo3763d(), (float) mo3760a(), mo3764e());
        }
        String str = this.f4134l;
        float f = (float) this.f4132g;
        int i = this.f4133k;
        int i2 = this.f4131f;
        C1494g b = c1494g.mo3800b();
        while (true) {
            C1494g b2;
            C1397c i3 = b != null ? (C1397c) b.mo3801b(4, false) : C1399b.m9944i();
            if (i3 != null) {
                if (!i3.mo3765f()) {
                    break;
                }
                C1398a c1398a = (C1398a) i3;
                if (!C0727l.m3091a(i2, 1) && c1398a.m9938j()) {
                    str = c1398a.mo3763d();
                    i2++;
                }
                if (!C0727l.m3091a(i2, 32) && c1398a.m9941m()) {
                    f = (float) c1398a.mo3760a();
                    i2 += 32;
                }
                if (!C0727l.m3091a(i2, 2) && c1398a.m9937i()) {
                    i = C0727l.m3090a(i, 0, c1398a.mo3762c());
                    i2 += 2;
                }
                if (!C0727l.m3091a(i2, 4) && c1398a.m9939k()) {
                    i = C0727l.m3090a(i, 1, c1398a.mo3761b());
                    i2 += 4;
                }
                if (!C0727l.m3091a(i2, 8) && c1398a.m9942n()) {
                    i = C0727l.m3090a(i, 2, c1398a.mo3766g());
                    i2 += 8;
                }
                if (!C0727l.m3091a(i2, 16) && c1398a.m9940l()) {
                    i = C0727l.m3090a(i, 3, c1398a.mo3767h());
                    i2 += 16;
                }
                if (i2 == 63) {
                    return C1400d.m9965a(str, f, mo3764e());
                }
                b2 = b.mo3800b();
            } else {
                b2 = b.mo3800b();
            }
            b = b2;
        }
        if (i2 == 0) {
            return (C1399b) i3;
        }
        if (!C0727l.m3091a(i2, 1)) {
            str = i3.mo3763d();
        }
        if (!C0727l.m3091a(i2, 32)) {
            f = (float) i3.mo3760a();
        }
        if (!C0727l.m3091a(i2, 2)) {
            i = C0727l.m3090a(i, 0, i3.mo3762c());
        }
        if (!C0727l.m3091a(i2, 4)) {
            i = C0727l.m3090a(i, 1, i3.mo3761b());
        }
        if (!C0727l.m3091a(i2, 16)) {
            i = C0727l.m3090a(i, 3, i3.mo3767h());
        }
        if (!C0727l.m3091a(i2, 8)) {
            C0727l.m3090a(i, 2, i3.mo3766g());
        }
        return C1400d.m9965a(str, f, mo3764e());
    }

    /* renamed from: a */
    public final void m9924a(float f) {
        this.f4132g = (int) f;
        if (!m9941m()) {
            this.f4131f += 32;
        }
    }

    /* renamed from: a */
    public final void m9925a(String str) {
        this.f4134l = str;
        if (!m9938j()) {
            this.f4131f++;
        }
    }

    /* renamed from: a */
    public final void m9926a(boolean z) {
        this.f4133k = C0727l.m3090a(this.f4133k, 3, z);
        if (!m9940l()) {
            this.f4131f += 16;
        }
    }

    /* renamed from: b */
    public final void m9927b(boolean z) {
        this.f4133k = C0727l.m3090a(this.f4133k, 2, z);
        if (!m9942n()) {
            this.f4131f += 8;
        }
    }

    /* renamed from: b */
    public final boolean mo3761b() {
        return C0727l.m3092b(this.f4133k, 1);
    }

    /* renamed from: c */
    public final void m9929c(boolean z) {
        this.f4133k = C0727l.m3090a(this.f4133k, 1, z);
        if (!m9939k()) {
            this.f4131f += 4;
        }
    }

    /* renamed from: c */
    public final boolean mo3762c() {
        return C0727l.m3092b(this.f4133k, 0);
    }

    /* renamed from: d */
    public final String mo3763d() {
        return this.f4134l;
    }

    /* renamed from: d */
    public final void m9932d(boolean z) {
        this.f4133k = C0727l.m3090a(this.f4133k, 0, z);
        if (!m9941m()) {
            this.f4131f += 2;
        }
    }

    /* renamed from: e */
    public final int mo3764e() {
        int i = 0;
        if (mo3762c()) {
            i = 1;
        }
        if (mo3761b()) {
            i += 2;
        }
        if (mo3766g()) {
            i += 4;
        }
        return mo3767h() ? i + 8 : i;
    }

    /* renamed from: f */
    public boolean mo3765f() {
        return true;
    }

    /* renamed from: g */
    public final boolean mo3766g() {
        return C0727l.m3092b(this.f4133k, 2);
    }

    /* renamed from: h */
    public final boolean mo3767h() {
        return C0727l.m3092b(this.f4133k, 3);
    }

    /* renamed from: i */
    public final boolean m9937i() {
        return C0727l.m3091a(this.f4131f, 2);
    }

    /* renamed from: j */
    public final boolean m9938j() {
        return C0727l.m3091a(this.f4131f, 1);
    }

    /* renamed from: k */
    public final boolean m9939k() {
        return C0727l.m3091a(this.f4131f, 4);
    }

    /* renamed from: l */
    public final boolean m9940l() {
        return C0727l.m3091a(this.f4131f, 16);
    }

    /* renamed from: m */
    public final boolean m9941m() {
        return C0727l.m3091a(this.f4131f, 32);
    }

    /* renamed from: n */
    public final boolean m9942n() {
        return C0727l.m3091a(this.f4131f, 8);
    }
}
