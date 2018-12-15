package fr.pcsoft.wdjava.ui.p080h;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.WDChaine;

/* renamed from: fr.pcsoft.wdjava.ui.h.b */
class C1420b implements Runnable {
    final C1421c this$0;

    C1420b(C1421c c1421c) {
        this.this$0 = c1421c;
    }

    public void run() {
        WDObjet[] wDObjetArr = new WDObjet[C1421c.access$000(this.this$0).m2260b()];
        if (wDObjetArr.length > 0) {
            wDObjetArr[0] = new WDChaine(C1421c.access$100(this.this$0));
        }
        C1421c.access$000(this.this$0).execute(wDObjetArr);
    }
}
