package fr.pcsoft.wdjava.core.allocation;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.WDNumerique;

final class wb extends WDNumerique {
    wb(WDObjet wDObjet) {
        super(wDObjet);
    }

    public boolean isVariableInterne() {
        return true;
    }
}
