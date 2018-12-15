package fr.pcsoft.wdjava.ui.champs.zr;

import fr.pcsoft.wdjava.p032m.C0938m;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.i */
final class C1298i implements Runnable {
    final WDZoneRepetee this$0;

    private C1298i(WDZoneRepetee wDZoneRepetee) {
        this.this$0 = wDZoneRepetee;
    }

    C1298i(WDZoneRepetee wDZoneRepetee, C1288a c1288a) {
        this(wDZoneRepetee);
    }

    /* renamed from: a */
    final void m9154a() {
        C0938m.m6816c().removeCallbacks(this);
    }

    /* renamed from: b */
    final void m9155b() {
        C0938m.m6816c().post(this);
    }

    public void run() {
        if (this.this$0.ee == ab.IDLE && this.this$0.getBottomLastVisibleCell() < this.this$0.fe.getHeight()) {
            this.this$0.m1504a(ab.LOADING);
        }
    }
}
