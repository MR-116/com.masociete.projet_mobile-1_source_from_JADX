package fr.pcsoft.wdjava.ui.champs.zr;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.p032m.C0938m;

class nc implements Runnable {
    final WDZoneRepetee this$0;

    nc(WDZoneRepetee wDZoneRepetee) {
        this.this$0 = wDZoneRepetee;
    }

    public void run() {
        if (!this.this$0.isReleased() && this.this$0.ee == ab.LOADING) {
            long currentTimeMillis = System.currentTimeMillis();
            WDObjet appelPCode = this.this$0.appelPCode(C0607n.bh);
            if (appelPCode == null || appelPCode.isVoid() || appelPCode.getBoolean()) {
                currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis < 500) {
                    C0938m.m6816c().postDelayed(new C1303m(this), 500 - currentTimeMillis);
                    return;
                } else if (this.this$0.ee.isLoadingState()) {
                    this.this$0.onFinishLoading();
                    return;
                } else {
                    return;
                }
            }
            this.this$0.m1504a(ab.DISABLED);
        }
    }
}
