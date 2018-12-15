package fr.pcsoft.wdjava.ui.activite;

import android.os.Bundle;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;

/* renamed from: fr.pcsoft.wdjava.ui.activite.h */
final class C1055h implements Runnable {
    final C0502g val$activite;
    final WDFenetre val$fen;
    final Bundle val$savedInstanceState;

    C1055h(WDFenetre wDFenetre, C0502g c0502g, Bundle bundle) {
        this.val$fen = wDFenetre;
        this.val$activite = c0502g;
        this.val$savedInstanceState = bundle;
    }

    public void run() {
        this.val$fen.activity_onCreate(this.val$activite.mo1775i(), this.val$savedInstanceState);
    }
}
