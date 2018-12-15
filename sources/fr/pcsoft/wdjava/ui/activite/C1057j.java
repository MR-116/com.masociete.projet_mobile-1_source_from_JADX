package fr.pcsoft.wdjava.ui.activite;

import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.gc;

/* renamed from: fr.pcsoft.wdjava.ui.activite.j */
final class C1057j implements Runnable {
    final WDFenetre val$fenetre;

    C1057j(WDFenetre wDFenetre) {
        this.val$fenetre = wDFenetre;
    }

    public void run() {
        gc boutonAbandon = this.val$fenetre.getBoutonAbandon();
        if (boutonAbandon == null || boutonAbandon.isReleased() || !boutonAbandon.getCompPrincipal().isShown() || boutonAbandon._getEtat() != 0) {
            this.val$fenetre.ferme(true, true, null);
        } else {
            boutonAbandon.appelPCode(18);
        }
    }
}
