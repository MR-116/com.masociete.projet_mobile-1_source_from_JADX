package fr.pcsoft.wdjava.core.application;

/* renamed from: fr.pcsoft.wdjava.core.application.d */
class C0641d implements Runnable {
    final WDAbstractLanceur this$0;

    C0641d(WDAbstractLanceur wDAbstractLanceur) {
        this.this$0 = wDAbstractLanceur;
    }

    public void run() {
        if (WDProjet.getInstance().demarrer()) {
            WDAppManager.m2598y();
            if (!WDAppManager.m2583j()) {
                this.this$0.run();
            }
        }
        this.this$0.finish();
    }
}
