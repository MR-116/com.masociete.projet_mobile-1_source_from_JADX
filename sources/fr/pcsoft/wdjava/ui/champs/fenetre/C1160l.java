package fr.pcsoft.wdjava.ui.champs.fenetre;

import fr.pcsoft.wdjava.ui.champs.gc;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetre.l */
class C1160l implements Runnable {
    final WDFenetre this$0;
    final gc val$champ;

    C1160l(WDFenetre wDFenetre, gc gcVar) {
        this.this$0 = wDFenetre;
        this.val$champ = gcVar;
    }

    public void run() {
        this.val$champ.appelPCode(18);
    }
}
