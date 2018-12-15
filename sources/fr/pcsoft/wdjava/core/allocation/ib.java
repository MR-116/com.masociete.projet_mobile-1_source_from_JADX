package fr.pcsoft.wdjava.core.allocation;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.WDEntier2;

final class ib extends WDEntier2 {
    ib(WDObjet wDObjet) {
        super(wDObjet);
    }

    public boolean isVariableInterne() {
        return true;
    }
}
