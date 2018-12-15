package fr.pcsoft.wdjava.core.allocation;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.WDDuree;

final class cb extends WDDuree {
    cb(WDObjet wDObjet) {
        super(wDObjet);
    }

    public boolean isVariableInterne() {
        return true;
    }
}
