package fr.pcsoft.wdjava.core.context;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.ui.C0489p;

/* renamed from: fr.pcsoft.wdjava.core.context.d */
class C0672d extends C0671c {
    /* renamed from: h */
    private WDObjet f1691h = null;
    /* renamed from: i */
    private String f1692i = "";

    public C0672d(int i, C0489p c0489p) {
        super(i, c0489p);
    }

    static WDObjet access$000(C0672d c0672d) {
        return c0672d.f1691h;
    }

    static WDObjet access$002(C0672d c0672d, WDObjet wDObjet) {
        c0672d.f1691h = wDObjet;
        return wDObjet;
    }

    static String access$100(C0672d c0672d) {
        return c0672d.f1692i;
    }

    static String access$102(C0672d c0672d, String str) {
        c0672d.f1692i = str;
        return str;
    }

    /* renamed from: c */
    public void mo2568c() {
        super.mo2568c();
        this.f1691h = null;
    }
}
