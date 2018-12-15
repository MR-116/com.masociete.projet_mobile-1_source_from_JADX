package fr.pcsoft.wdjava.core.allocation;

import fr.pcsoft.wdjava.core.types.WDReel;

final class dc extends WDReel {
    dc(double d) {
        super(d);
    }

    public boolean isVariableInterne() {
        return true;
    }
}
