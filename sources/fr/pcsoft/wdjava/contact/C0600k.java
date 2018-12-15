package fr.pcsoft.wdjava.contact;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.IWDAllocateur;

/* renamed from: fr.pcsoft.wdjava.contact.k */
final class C0600k implements IWDAllocateur {
    C0600k() {
    }

    public WDObjet creerInstance() {
        return new WDContactSource();
    }

    public Class getClasseWD() {
        return WDContactSource.class;
    }

    public int getTypeWL() {
        return 111;
    }

    public boolean isDynamique() {
        return false;
    }
}
