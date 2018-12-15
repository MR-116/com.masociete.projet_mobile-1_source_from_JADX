package fr.pcsoft.wdjava.net.http;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.IWDAllocateur;

/* renamed from: fr.pcsoft.wdjava.net.http.x */
public class C0999x implements IWDAllocateur {
    public WDObjet creerInstance() {
        return new WDCookie();
    }

    public Class getClasseWD() {
        return WDCookie.class;
    }

    public int getTypeWL() {
        return 111;
    }

    public boolean isDynamique() {
        return false;
    }
}
