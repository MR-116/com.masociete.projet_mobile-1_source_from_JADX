package fr.pcsoft.wdjava.ui.dessin.p077a;

import fr.pcsoft.wdjava.ui.p064a.C1031a;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.a.x */
class C1358x extends C1356v implements C1342f {
    /* renamed from: b */
    private int f4034b = 0;
    final C1344h this$0;

    public C1358x(C1344h c1344h, int i) {
        this.this$0 = c1344h;
        super(c1344h);
        this.f4034b = i;
    }

    public C1358x(C1344h c1344h, int i, int i2) {
        this.this$0 = c1344h;
        super(c1344h);
        this.f4034b = i;
        this.a = i2;
    }

    /* renamed from: a */
    public void mo3733a() {
    }

    /* renamed from: c */
    public boolean mo3734c() {
        return C1031a.m7448a(this.f4034b) == 0 || this.a == 0;
    }

    /* renamed from: d */
    public void mo3735d() {
        this.this$0.f4000f.setColor(this.f4034b);
        this.this$0.f4000f.setAlpha(this.a);
        this.this$0.f4000f.setShader(null);
    }

    /* renamed from: e */
    public int mo3736e() {
        return this.f4034b;
    }
}
