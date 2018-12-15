package fr.pcsoft.wdjava.core.allocation;

import fr.pcsoft.wdjava.core.types.WDReel;

final class fc extends WDReel {
    fc(String str) {
        super(str);
    }

    public boolean isVariableInterne() {
        return true;
    }
}
