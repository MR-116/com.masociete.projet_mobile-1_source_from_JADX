package fr.pcsoft.wdjava.ui.actionbar;

import fr.pcsoft.wdjava.core.C0607n;

/* renamed from: fr.pcsoft.wdjava.ui.actionbar.m */
class C1046m implements Runnable {
    final WDActionBar this$0;

    C1046m(WDActionBar wDActionBar) {
        this.this$0 = wDActionBar;
    }

    public void run() {
        this.this$0.appelPCode(C0607n.Au);
    }
}
