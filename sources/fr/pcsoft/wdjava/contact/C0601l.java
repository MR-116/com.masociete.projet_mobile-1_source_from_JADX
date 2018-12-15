package fr.pcsoft.wdjava.contact;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.IWDAllocateur;

/* renamed from: fr.pcsoft.wdjava.contact.l */
final class C0601l implements IWDAllocateur {
    C0601l() {
    }

    public WDObjet creerInstance() {
        return new WDContact();
    }

    public Class getClasseWD() {
        return WDContact.class;
    }

    public int getTypeWL() {
        return 111;
    }

    public boolean isDynamique() {
        return false;
    }
}
