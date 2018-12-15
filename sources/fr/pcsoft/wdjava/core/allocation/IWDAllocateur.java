package fr.pcsoft.wdjava.core.allocation;

import fr.pcsoft.wdjava.core.WDObjet;

public interface IWDAllocateur {
    WDObjet creerInstance();

    Class getClasseWD();

    int getTypeWL();

    boolean isDynamique();
}
