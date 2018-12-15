package fr.pcsoft.wdjava.ui.pulltorefresh;

/* renamed from: fr.pcsoft.wdjava.ui.pulltorefresh.t */
class C1487t implements Runnable {
    final C1476h this$1;

    C1487t(C1476h c1476h) {
        this.this$1 = c1476h;
    }

    public void run() {
        if (this.this$1.this$0.f3521m == C1474e.REFRESHING) {
            this.this$1.this$0.m8379a(C1474e.IDLE);
        }
    }
}
