package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.ui.C0489p;

class ob implements Runnable {
    final C1153s this$0;
    final C0489p val$objAPCode;

    ob(C1153s c1153s, C0489p c0489p) {
        this.this$0 = c1153s;
        this.val$objAPCode = c0489p;
    }

    public void run() {
        this.val$objAPCode.release();
    }
}
