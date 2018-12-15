package fr.pcsoft.wdjava.ui;

import fr.pcsoft.wdjava.core.erreur.WDException;

/* renamed from: fr.pcsoft.wdjava.ui.n */
class C1470n implements Runnable {
    final C0490q this$0;
    final int val$nId;

    C1470n(C0490q c0490q, int i) {
        this.this$0 = c0490q;
        this.val$nId = i;
    }

    public void run() {
        try {
            this.this$0.executerPCode(this.val$nId);
        } catch (WDException e) {
            throw e;
        }
    }
}
