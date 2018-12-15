package fr.pcsoft.wdjava.core.allocation;

import fr.pcsoft.wdjava.core.types.WDDateHeure;

final class ab extends WDDateHeure {
    ab(String str) {
        super(str);
    }

    public boolean isVariableInterne() {
        return true;
    }
}
