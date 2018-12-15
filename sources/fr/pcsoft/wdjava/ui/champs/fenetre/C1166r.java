package fr.pcsoft.wdjava.ui.champs.fenetre;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetre.r */
class C1166r implements Runnable {
    final WDFenetre this$0;
    final int val$nHeight;
    final int val$nWidth;

    C1166r(WDFenetre wDFenetre, int i, int i2) {
        this.this$0 = wDFenetre;
        this.val$nWidth = i;
        this.val$nHeight = i2;
    }

    public void run() {
        this.this$0.setTailleUtile(this.val$nWidth, this.val$nHeight);
    }
}
