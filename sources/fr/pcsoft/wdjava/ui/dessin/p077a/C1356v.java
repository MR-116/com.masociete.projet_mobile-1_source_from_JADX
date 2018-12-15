package fr.pcsoft.wdjava.ui.dessin.p077a;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.a.v */
abstract class C1356v implements C1341l {
    /* renamed from: a */
    protected int f4032a = 255;
    final C1344h this$0;

    C1356v(C1344h c1344h) {
        this.this$0 = c1344h;
    }

    /* renamed from: a */
    public void mo3731a(int i) {
        this.f4032a = Math.min(Math.max(0, i), 255);
    }

    /* renamed from: b */
    public int mo3732b() {
        return this.f4032a;
    }
}
