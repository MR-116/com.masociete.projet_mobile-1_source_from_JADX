package fr.pcsoft.wdjava.ui.champs.zr;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.m */
class C1303m implements Runnable {
    final nc this$1;

    C1303m(nc ncVar) {
        this.this$1 = ncVar;
    }

    public void run() {
        if (!this.this$1.this$0.isReleased() && this.this$1.this$0.ee.isLoadingState()) {
            this.this$1.this$0.onFinishLoading();
        }
    }
}
