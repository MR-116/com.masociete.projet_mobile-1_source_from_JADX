package fr.pcsoft.wdjava.ui.champs.fenetre;

import fr.pcsoft.wdjava.ui.champs.zml.C0532f;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetre.u */
class C1169u implements Runnable {
    final WDFenetre this$0;
    final int val$nHauteurMin;
    final C0532f val$zml;

    C1169u(WDFenetre wDFenetre, C0532f c0532f, int i) {
        this.this$0 = wDFenetre;
        this.val$zml = c0532f;
        this.val$nHauteurMin = i;
    }

    public void run() {
        this.this$0.adapterHauteurPourZML(this.val$zml, this.val$nHauteurMin);
    }
}
