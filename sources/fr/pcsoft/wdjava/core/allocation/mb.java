package fr.pcsoft.wdjava.core.allocation;

import fr.pcsoft.wdjava.core.types.WDEntier4;

final class mb extends WDEntier4 {
    mb(int i) {
        super(i);
    }

    public boolean isVariableInterne() {
        return true;
    }
}
