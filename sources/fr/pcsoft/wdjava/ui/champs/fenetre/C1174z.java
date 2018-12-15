package fr.pcsoft.wdjava.ui.champs.fenetre;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.context.C0671c;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.ui.utils.C1515p;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetre.z */
class C1174z implements Runnable {
    final C1152f this$1;

    C1174z(C1152f c1152f) {
        this.this$1 = c1152f;
    }

    public void run() {
        boolean z = C1515p.f4650a;
        C1515p.f4650a = false;
        try {
            if (this.this$1.this$0.Vd) {
                this.this$1.this$0.Vd = false;
                C0671c l = WDAppelContexte.getContexte().m2726l();
                if (l == null || l.m2766b() != C0607n.f1435S) {
                    this.this$1.this$0.appelPCode(C0607n.f1435S);
                }
            }
            this.this$1.this$0.appelPCode(13);
            this.this$1.this$0.appelPCode(5);
        } finally {
            C1515p.f4650a = z;
        }
    }
}
