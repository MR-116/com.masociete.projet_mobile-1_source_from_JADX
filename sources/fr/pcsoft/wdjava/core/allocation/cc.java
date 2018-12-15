package fr.pcsoft.wdjava.core.allocation;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.WDProcedure;

final class cc extends WDProcedure {
    cc(WDObjet wDObjet) {
        super(wDObjet);
    }

    public boolean isVariableInterne() {
        return true;
    }
}
