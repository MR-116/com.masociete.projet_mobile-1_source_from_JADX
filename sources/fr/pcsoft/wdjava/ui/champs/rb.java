package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.core.C0607n;

class rb implements Runnable {
    final gc this$0;

    rb(gc gcVar) {
        this.this$0 = gcVar;
    }

    public void run() {
        this.this$0.appelPCode(C0607n.ip);
    }
}
