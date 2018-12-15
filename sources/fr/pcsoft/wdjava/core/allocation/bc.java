package fr.pcsoft.wdjava.core.allocation;

import fr.pcsoft.wdjava.core.types.WDProcedure;

final class bc extends WDProcedure {
    bc(String str) {
        super(str);
    }

    public boolean isVariableInterne() {
        return true;
    }
}
