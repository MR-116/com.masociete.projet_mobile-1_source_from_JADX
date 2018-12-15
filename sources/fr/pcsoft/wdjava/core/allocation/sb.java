package fr.pcsoft.wdjava.core.allocation;

import fr.pcsoft.wdjava.core.types.WDHeure;

final class sb extends WDHeure {
    sb(String str) {
        super(str);
    }

    public boolean isVariableInterne() {
        return true;
    }
}
