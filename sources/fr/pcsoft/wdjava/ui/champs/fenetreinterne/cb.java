package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.C0546j;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.nb;

class cb implements C0546j {
    final hb this$0;
    final int val$nPlan;

    cb(hb hbVar, int i) {
        this.this$0 = hbVar;
        this.val$nPlan = i;
    }

    /* renamed from: a */
    public boolean mo2352a(nb nbVar) {
        ((gc) nbVar).majPlan(this.val$nPlan);
        return true;
    }

    /* renamed from: a */
    public boolean mo2353a(C0489p c0489p) {
        return true;
    }
}
