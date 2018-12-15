package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import fr.pcsoft.wdjava.core.C0607n;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetreinterne.c */
class C1176c implements Runnable {
    final WDFenetreInterne this$0;

    C1176c(WDFenetreInterne wDFenetreInterne) {
        this.this$0 = wDFenetreInterne;
    }

    public void run() {
        this.this$0.appelPCode(C0607n.vf);
    }
}
