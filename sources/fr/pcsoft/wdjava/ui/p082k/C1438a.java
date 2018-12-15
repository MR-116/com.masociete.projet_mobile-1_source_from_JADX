package fr.pcsoft.wdjava.ui.p082k;

import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0509v;

/* renamed from: fr.pcsoft.wdjava.ui.k.a */
public abstract class C1438a {
    /* renamed from: a */
    protected boolean f4267a = true;
    /* renamed from: b */
    private C0489p f4268b = null;

    /* renamed from: a */
    public C0509v m10101a() {
        C0489p b = m10104b();
        return b != null ? b.isFenetre() ? (C0509v) b : (C0509v) b.getFenetreMere() : null;
    }

    /* renamed from: a */
    public final void m10102a(C0489p c0489p) {
        this.f4268b = c0489p;
    }

    /* renamed from: a */
    public void m10103a(boolean z) {
        this.f4267a = z;
    }

    /* renamed from: b */
    public final C0489p m10104b() {
        return this.f4268b;
    }
}
