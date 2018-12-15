package fr.pcsoft.wdjava.ui.champs.fenetre;

import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.C0546j;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.nb;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetre.e */
class C1150e implements C0546j {
    final C0509v this$0;
    final int val$nPlan;

    C1150e(C0509v c0509v, int i) {
        this.this$0 = c0509v;
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
