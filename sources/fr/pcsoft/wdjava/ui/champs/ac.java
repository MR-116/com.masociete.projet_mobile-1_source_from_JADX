package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.ui.champs.fenetre.C0509v;
import fr.pcsoft.wdjava.ui.champs.zr.bb;

class ac implements Runnable {
    final jc this$0;

    ac(jc jcVar) {
        this.this$0 = jcVar;
    }

    public void run() {
        this.this$0.appelPCode_TLM(33, 5);
        if (this.this$0.checkType(bb.class) == null) {
            C0509v c0509v = (C0509v) this.this$0.getFenetreMere();
            if (c0509v != null) {
                this.this$0.onModifChamp();
                c0509v.appelPCode(17);
            }
        }
    }
}
