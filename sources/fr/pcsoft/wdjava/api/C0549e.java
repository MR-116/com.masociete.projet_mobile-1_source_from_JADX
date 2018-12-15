package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.p059n.C0969g;

/* renamed from: fr.pcsoft.wdjava.api.e */
final class C0549e extends WDEntier4 {
    C0549e() {
    }

    public void setValeur(int i) {
        synchronized (this) {
            super.setValeur(i);
            switch (i) {
                case 0:
                    C0969g.f2717b = true;
                    C0969g.f2716a = true;
                    break;
                case 1:
                    C0969g.f2716a = false;
                    break;
                case 4:
                    C0969g.f2717b = false;
                    break;
            }
        }
    }

    public void setValeur(WDObjet wDObjet) {
        setValeur(wDObjet.getInt());
    }
}
