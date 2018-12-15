package fr.pcsoft.wdjava.core.p047f;

import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;

/* renamed from: fr.pcsoft.wdjava.core.f.k */
class C0721k implements C0710j {
    /* renamed from: a */
    private EWDPropriete f1830a;

    C0721k(EWDPropriete eWDPropriete) {
        this.f1830a = eWDPropriete;
    }

    /* renamed from: a */
    public WDObjet mo2595a(WDObjet wDObjet) {
        return wDObjet.getProp(this.f1830a);
    }

    /* renamed from: a */
    public void mo2596a() {
        this.f1830a = null;
    }
}
