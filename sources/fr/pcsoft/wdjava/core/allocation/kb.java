package fr.pcsoft.wdjava.core.allocation;

import fr.pcsoft.wdjava.core.types.WDEntier4;

final class kb extends WDEntier4 {
    kb(String str) {
        super(str);
    }

    public boolean isVariableInterne() {
        return true;
    }
}
