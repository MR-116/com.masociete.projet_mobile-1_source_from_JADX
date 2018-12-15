package fr.pcsoft.wdjava.core.allocation;

import fr.pcsoft.wdjava.core.types.WDEntier2;

final class hb extends WDEntier2 {
    hb(String str) {
        super(str);
    }

    public boolean isVariableInterne() {
        return true;
    }
}
