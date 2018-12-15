package fr.pcsoft.wdjava.core.types.collection.tableau;

import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;

/* renamed from: fr.pcsoft.wdjava.core.types.collection.tableau.f */
class C0763f implements C0761b {
    final C0759o this$0;
    final EWDPropriete val$propriete;

    C0763f(C0759o c0759o, EWDPropriete eWDPropriete) {
        this.this$0 = c0759o;
        this.val$propriete = eWDPropriete;
    }

    /* renamed from: a */
    public WDObjet mo2671a(WDObjet wDObjet) {
        return wDObjet.getProp(this.val$propriete);
    }
}
