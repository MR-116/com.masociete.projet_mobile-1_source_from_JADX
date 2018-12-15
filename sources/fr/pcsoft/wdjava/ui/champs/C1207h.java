package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.ui.C0489p;

/* renamed from: fr.pcsoft.wdjava.ui.champs.h */
class C1207h implements C0546j {
    final gc this$0;
    final int val$nIndexAgencement;

    C1207h(gc gcVar, int i) {
        this.this$0 = gcVar;
        this.val$nIndexAgencement = i;
    }

    /* renamed from: a */
    public boolean mo2352a(nb nbVar) {
        return true;
    }

    /* renamed from: a */
    public boolean mo2353a(C0489p c0489p) {
        c0489p.setAgencement(this.val$nIndexAgencement);
        return true;
    }
}
