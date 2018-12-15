package fr.pcsoft.wdjava.core.allocation;

import fr.pcsoft.wdjava.core.types.WDNumerique;

final class vb extends WDNumerique {
    vb(String str) {
        super(str);
    }

    public boolean isVariableInterne() {
        return true;
    }
}
