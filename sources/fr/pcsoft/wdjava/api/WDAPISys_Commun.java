package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.types.WDChaine;

public class WDAPISys_Commun {
    public static WDChaine sysVersionWindows() {
        return new WDChaine(WDProjet.getInstance().getVersionOS());
    }
}
