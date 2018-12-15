package fr.pcsoft.wdjava.core.types.collection.tableau;

import fr.pcsoft.wdjava.core.WDObjet;
import java.util.Comparator;

/* renamed from: fr.pcsoft.wdjava.core.types.collection.tableau.u */
class C0772u implements Comparator {
    /* renamed from: a */
    private boolean f2014a = true;

    public C0772u(boolean z) {
        this.f2014a = z;
    }

    public int compare(Object obj, Object obj2) {
        WDObjet wDObjet = (WDObjet) obj;
        WDObjet wDObjet2 = (WDObjet) obj2;
        return wDObjet.opEgal(wDObjet2) ? 0 : wDObjet.opSup(wDObjet2) ? !this.f2014a ? -1 : 1 : this.f2014a ? -1 : 1;
    }
}
