package fr.pcsoft.wdjava.core.allocation;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.WDEntier1;

final class fb extends WDEntier1 {
    fb(WDObjet wDObjet) {
        super(wDObjet);
    }

    public boolean isVariableInterne() {
        return true;
    }
}
