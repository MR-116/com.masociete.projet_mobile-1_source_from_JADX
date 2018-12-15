package fr.pcsoft.wdjava.ui.activite;

import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;

/* renamed from: fr.pcsoft.wdjava.ui.activite.e */
final class C1053e implements Runnable {
    final C0502g val$activite;
    final WDFenetre val$fen;

    C1053e(WDFenetre wDFenetre, C0502g c0502g) {
        this.val$fen = wDFenetre;
        this.val$activite = c0502g;
    }

    public void run() {
        this.val$fen.activity_onStart(this.val$activite.mo1775i());
    }
}
