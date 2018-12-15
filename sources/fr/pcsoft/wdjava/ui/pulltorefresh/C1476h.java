package fr.pcsoft.wdjava.ui.pulltorefresh;

import fr.pcsoft.wdjava.p032m.C0938m;

/* renamed from: fr.pcsoft.wdjava.ui.pulltorefresh.h */
class C1476h implements Runnable {
    final C1157f this$0;

    C1476h(C1157f c1157f) {
        this.this$0 = c1157f;
    }

    public void run() {
        this.this$0.m8378a(this.this$0.f3516e.getStandardViewHeight());
        long currentTimeMillis = System.currentTimeMillis();
        this.this$0.m8379a(C1474e.REFRESHING);
        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis < 500) {
            C0938m.m6816c().postDelayed(new C1487t(this), 500 - currentTimeMillis);
        } else if (this.this$0.f3521m == C1474e.REFRESHING) {
            this.this$0.m8379a(C1474e.IDLE);
        }
    }
}
