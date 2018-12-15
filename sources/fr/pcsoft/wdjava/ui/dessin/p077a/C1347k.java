package fr.pcsoft.wdjava.ui.dessin.p077a;

import fr.pcsoft.wdjava.ui.p064a.C1032b;
import fr.pcsoft.wdjava.ui.p079e.C1397c;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.a.k */
public class C1347k {
    /* renamed from: a */
    public static final int f4002a = 2;
    /* renamed from: g */
    public static final int f4003g = 1;
    /* renamed from: i */
    public static final int f4004i = 8;
    /* renamed from: j */
    public static final int f4005j = 4;
    /* renamed from: b */
    private C1338n f4006b = null;
    /* renamed from: c */
    private C1397c f4007c = null;
    /* renamed from: d */
    private C1341l f4008d = null;
    /* renamed from: e */
    private double f4009e = 0.0d;
    /* renamed from: f */
    private C1338n f4010f = null;
    /* renamed from: h */
    private C1341l f4011h = null;
    /* renamed from: k */
    private int f4012k = C1032b.f2968a;
    /* renamed from: l */
    private int f4013l = 0;

    /* renamed from: a */
    public final int m9675a() {
        return this.f4013l;
    }

    /* renamed from: a */
    public final void m9676a(double d) {
        this.f4009e = d;
    }

    /* renamed from: a */
    public final void m9677a(double d, C1343g c1343g, C1355u c1355u, C1359y c1359y, C1337c c1337c) {
        double d2 = d <= 0.0d ? 1.0d : d;
        if (c1355u != C1355u.INVISIBLE || this.f4006b != null) {
            if (this.f4006b == null || this.f4006b.mo3684c() != d2 || this.f4006b.mo3686e() != c1343g || this.f4006b.mo3688g() != c1355u || this.f4006b.mo3687f() != c1359y) {
                this.f4006b = c1337c.mo3691a(d2, c1355u, c1343g, c1359y);
            }
        }
    }

    /* renamed from: a */
    public void m9678a(int i) {
        if ((i & 1) == 1) {
            this.f4012k = this.f4013l;
        } else {
            this.f4012k = C1032b.f2968a;
        }
        if ((i & 2) == 2) {
            this.f4010f = this.f4006b;
        } else {
            this.f4010f = null;
        }
        if ((i & 4) == 4) {
            this.f4011h = this.f4008d;
        } else {
            this.f4011h = null;
        }
    }

    /* renamed from: a */
    public final void m9679a(int i, int i2, C1337c c1337c) {
        if (this.f4008d == null || !(this.f4008d instanceof C1342f) || this.f4008d.mo3732b() != i2 || i != ((C1342f) this.f4008d).mo3736e()) {
            this.f4008d = c1337c.mo3708b(i, i2);
        }
    }

    /* renamed from: a */
    public final void m9680a(C1341l c1341l) {
        this.f4008d = c1341l;
    }

    /* renamed from: a */
    public final void m9681a(C1338n c1338n) {
        this.f4006b = c1338n;
    }

    /* renamed from: a */
    public final <T extends C1397c> void m9682a(T t) {
        this.f4007c = t;
    }

    /* renamed from: b */
    public final C1338n m9683b() {
        return this.f4006b;
    }

    /* renamed from: b */
    public void m9684b(int i) {
        this.f4013l = i;
    }

    /* renamed from: c */
    public final <T extends C1397c> T m9685c() {
        return this.f4007c;
    }

    /* renamed from: c */
    public void m9686c(int i) {
        if ((i & 1) == 1) {
            this.f4013l = this.f4012k;
        }
        if ((i & 2) == 2) {
            this.f4006b = this.f4010f;
        }
        if ((i & 4) == 4) {
            this.f4008d = this.f4011h;
        }
    }

    /* renamed from: d */
    public final C1341l m9687d() {
        return this.f4008d;
    }

    /* renamed from: e */
    public void m9688e() {
        this.f4007c = null;
        if (this.f4006b != null) {
            this.f4006b.mo3683a();
            this.f4006b = null;
        }
        if (this.f4008d != null) {
            this.f4008d.mo3733a();
            this.f4008d = null;
        }
        if (this.f4010f != null) {
            this.f4010f.mo3683a();
            this.f4010f = null;
        }
        if (this.f4011h != null) {
            this.f4011h.mo3733a();
            this.f4011h = null;
        }
    }

    /* renamed from: f */
    public final double m9689f() {
        return this.f4009e;
    }
}
