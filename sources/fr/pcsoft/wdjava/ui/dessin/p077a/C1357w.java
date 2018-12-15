package fr.pcsoft.wdjava.ui.dessin.p077a;

import fr.pcsoft.wdjava.ui.dessin.p078b.C1362a;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.a.w */
class C1357w extends C1356v {
    /* renamed from: b */
    private C1362a f4033b = null;
    final C1344h this$0;

    public C1357w(C1344h c1344h, C1362a c1362a) {
        this.this$0 = c1344h;
        super(c1344h);
        this.f4033b = c1362a;
    }

    /* renamed from: a */
    public void mo3733a() {
        if (this.f4033b != null) {
            this.f4033b.mo3737a();
            this.f4033b = null;
        }
    }

    /* renamed from: c */
    public boolean mo3734c() {
        return false;
    }

    /* renamed from: d */
    public void mo3735d() {
        this.this$0.f4000f.setShader(this.f4033b);
        this.this$0.f4000f.setAlpha(this.a);
    }
}
