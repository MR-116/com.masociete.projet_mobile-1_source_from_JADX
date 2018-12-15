package fr.pcsoft.wdjava.jni;

import fr.pcsoft.wdjava.core.WDIndirection;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.jauge.C1225d;

public class WDJaugeJNI {
    /* renamed from: a */
    private C1225d f2531a;

    private WDJaugeJNI(C1225d c1225d) {
        this.f2531a = c1225d;
    }

    public static final WDJaugeJNI create(WDObjet wDObjet) {
        C1225d c1225d = (C1225d) wDObjet.checkType(C1225d.class);
        C0508h c0508h = (C0508h) wDObjet.checkType(C0508h.class);
        if (c1225d == null && c0508h == null) {
            String string = wDObjet.getString();
            if (!C0808l.m4053k(string)) {
                WDObjet 2 = WDIndirection.get2(string, 4);
                if (2 != null) {
                    if (2 instanceof C1225d) {
                        c1225d = (C1225d) 2;
                    } else if (2 instanceof C0508h) {
                        c0508h = (C0508h) 2;
                    }
                }
            }
        }
        C1225d progressBar = c0508h != null ? c0508h.getProgressBar() : c1225d;
        return progressBar != null ? new WDJaugeJNI(progressBar) : null;
    }

    public final void setBorneMax(int i) {
        this.f2531a.setMaxProgress(i);
    }

    public final void setBorneMin(int i) {
        this.f2531a.setMinProgress(i);
    }

    public final void setValeur(int i) {
        this.f2531a.setProgressValue(i);
    }
}
