package fr.pcsoft.wdjava.ui.champs.fenetre;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDVoid;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetre.w */
final class C1170w extends WDVoid {
    C1170w() {
    }

    public WDObjet getValeur() {
        C0509v c0509v = (C0509v) WDAppelContexte.getContexte().m2722h();
        boolean z = c0509v != null ? !c0509v.hd : false;
        return new WDBooleen(z);
    }
}
