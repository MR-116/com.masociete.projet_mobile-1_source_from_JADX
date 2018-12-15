package fr.pcsoft.wdjava.core.allocation;

import fr.pcsoft.wdjava.core.types.WDEntier8;

final class ob extends WDEntier8 {
    ob(String str) {
        super(str);
    }

    public boolean isVariableInterne() {
        return true;
    }
}
