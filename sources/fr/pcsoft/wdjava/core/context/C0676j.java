package fr.pcsoft.wdjava.core.context;

import fr.pcsoft.wdjava.core.C0550t;
import fr.pcsoft.wdjava.core.WDObjet;

/* renamed from: fr.pcsoft.wdjava.core.context.j */
final class C0676j extends C0550t {
    C0676j() {
    }

    public WDObjet getRefProxy() {
        return WDContexte.getMaTacheParallelePrecedente().getValeurRenvoyee();
    }

    public void release() {
    }
}
