package fr.pcsoft.wdjava.ui.champs.fenetre;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetre.q */
class C1165q implements Runnable {
    final WDFenetre this$0;

    C1165q(WDFenetre wDFenetre) {
        this.this$0 = wDFenetre;
    }

    public void run() {
        if (this.this$0.estOuverte() && !this.this$0.isReleased()) {
            this.this$0.appelPCode(11);
        }
    }
}
