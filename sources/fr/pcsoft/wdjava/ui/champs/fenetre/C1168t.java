package fr.pcsoft.wdjava.ui.champs.fenetre;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.fb;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetre.t */
class C1168t implements Runnable {
    final WDFenetre this$0;
    final fb val$fenetre;

    C1168t(WDFenetre wDFenetre, fb fbVar) {
        this.this$0 = wDFenetre;
        this.val$fenetre = fbVar;
    }

    public void run() {
        if (!this.val$fenetre.isReleased()) {
            this.val$fenetre.updateUI_WL(new WDObjet[0]);
        }
    }
}
