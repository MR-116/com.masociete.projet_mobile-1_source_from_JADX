package fr.pcsoft.wdjava.core.parcours.p039a;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.collection.C0582d;

/* renamed from: fr.pcsoft.wdjava.core.parcours.a.c */
public class C0567c extends C0566b {
    /* renamed from: p */
    protected C0582d f1309p = null;

    public C0567c(C0582d c0582d, WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, boolean z, boolean z2) {
        super(wDObjet, wDObjet2, wDObjet3, null, z, z2);
        this.f1309p = c0582d;
    }

    /* renamed from: b */
    public WDObjet mo2456b(int i) {
        return this.f1309p.mo2469a((long) i);
    }

    public final WDObjet getSource() {
        return (WDObjet) this.f1309p;
    }

    /* renamed from: h */
    public int mo2458h() {
        return (int) this.f1309p.mo2483h();
    }

    public void release() {
        super.release();
        this.f1309p = null;
    }
}
