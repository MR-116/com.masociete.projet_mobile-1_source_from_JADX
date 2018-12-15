package fr.pcsoft.wdjava.core.allocation;

import fr.pcsoft.wdjava.core.types.WDMonetaire;

final class yb extends WDMonetaire {
    yb(String str) {
        super(str);
    }

    public boolean isVariableInterne() {
        return true;
    }
}
