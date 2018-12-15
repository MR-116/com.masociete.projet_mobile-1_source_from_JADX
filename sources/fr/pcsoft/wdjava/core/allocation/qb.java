package fr.pcsoft.wdjava.core.allocation;

import fr.pcsoft.wdjava.core.types.WDEntier8;

final class qb extends WDEntier8 {
    qb(long j) {
        super(j);
    }

    public boolean isVariableInterne() {
        return true;
    }
}
