package fr.pcsoft.wdjava.core.allocation;

import fr.pcsoft.wdjava.core.types.WDEntier1;

final class eb extends WDEntier1 {
    eb(String str) {
        super(str);
    }

    public boolean isVariableInterne() {
        return true;
    }
}
