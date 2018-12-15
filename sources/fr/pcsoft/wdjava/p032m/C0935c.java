package fr.pcsoft.wdjava.p032m;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDParametre;
import fr.pcsoft.wdjava.ui.champs.nb;

/* renamed from: fr.pcsoft.wdjava.m.c */
final class C0935c implements Runnable {
    /* renamed from: a */
    private WDObjet[] f2559a = null;
    /* renamed from: b */
    private nb f2560b = null;

    C0935c(nb nbVar, WDObjet... wDObjetArr) {
        this.f2560b = nbVar;
        WDParametre.traiterParametreTraitementNonBloquant(wDObjetArr);
        this.f2559a = wDObjetArr;
    }

    static nb access$000(C0935c c0935c) {
        return c0935c.f2560b;
    }

    static WDObjet[] access$100(C0935c c0935c) {
        return c0935c.f2559a;
    }

    /* renamed from: a */
    public void m6803a() {
        this.f2560b = null;
        this.f2559a = null;
    }

    public void run() {
        try {
            if (!this.f2560b.isReleased()) {
                this.f2560b.updateUI_WL(this.f2559a);
                C0938m.f2563c.remove(this);
                m6803a();
            }
        } finally {
            C0938m.f2563c.remove(this);
            m6803a();
        }
    }
}
