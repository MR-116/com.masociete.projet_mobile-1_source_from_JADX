package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.ui.C0489p;

class vc implements C0546j {
    final C1153s this$0;
    final String val$strSourceName;

    vc(C1153s c1153s, String str) {
        this.this$0 = c1153s;
        this.val$strSourceName = str;
    }

    /* renamed from: a */
    public boolean mo2352a(nb nbVar) {
        ((gc) nbVar).sourceToScreen(this.val$strSourceName);
        return true;
    }

    /* renamed from: a */
    public boolean mo2353a(C0489p c0489p) {
        return true;
    }
}
