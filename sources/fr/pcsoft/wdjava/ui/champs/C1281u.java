package fr.pcsoft.wdjava.ui.champs;

/* renamed from: fr.pcsoft.wdjava.ui.champs.u */
class C1281u implements Runnable {
    final gc this$0;

    C1281u(gc gcVar) {
        this.this$0 = gcVar;
    }

    public void run() {
        if (!this.this$0.isReleased()) {
            gc gcVar = this.this$0;
            gcVar.N &= -129;
        }
    }
}
