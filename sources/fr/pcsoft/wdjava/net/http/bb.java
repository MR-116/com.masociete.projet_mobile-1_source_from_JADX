package fr.pcsoft.wdjava.net.http;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0670b;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.types.WDEntier4;

final class bb extends WDEntier4 {
    bb() {
    }

    public WDObjet getValeur() {
        return new WDEntier4(((C0670b) WDAppelContexte.m2679a(C0670b.class)).m2754b());
    }

    public void setValeur(double d) {
        setValeur((int) d);
    }

    public void setValeur(int i) {
        ((C0670b) WDAppelContexte.m2679a(C0670b.class)).m2749a(i);
    }

    public void setValeur(long j) {
        setValeur((int) j);
    }

    public void setValeur(WDObjet wDObjet) {
        setValeur(wDObjet.getInt());
    }

    public void setValeur(boolean z) {
        setValeur(z ? 1 : 0);
    }
}
