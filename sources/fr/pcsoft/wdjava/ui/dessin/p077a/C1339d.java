package fr.pcsoft.wdjava.ui.dessin.p077a;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.a.d */
abstract class C1339d implements C1338n {
    /* renamed from: a */
    protected int f3989a = 255;
    final C1344h this$0;

    C1339d(C1344h c1344h) {
        this.this$0 = c1344h;
    }

    /* renamed from: a */
    public void mo3681a(int i) {
        this.f3989a = Math.min(Math.max(0, i), 255);
    }

    /* renamed from: b */
    public int mo3682b() {
        return this.f3989a;
    }
}
