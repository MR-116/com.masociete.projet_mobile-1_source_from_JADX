package fr.pcsoft.wdjava.ui.champs.groupeoptions;

/* renamed from: fr.pcsoft.wdjava.ui.champs.groupeoptions.g */
class C1197g implements Runnable {
    final C0501o this$0;

    C1197g(C0501o c0501o) {
        this.this$0 = c0501o;
    }

    public void run() {
        if (!this.this$0.isReleased()) {
            this.this$0.positionnerOptions(null);
        }
    }
}
