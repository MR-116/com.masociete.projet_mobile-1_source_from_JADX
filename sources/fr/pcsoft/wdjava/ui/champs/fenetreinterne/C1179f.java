package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.C0546j;
import fr.pcsoft.wdjava.ui.champs.modelechamp.C1231a;
import fr.pcsoft.wdjava.ui.champs.nb;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetreinterne.f */
class C1179f implements C0546j {
    final gb this$0;

    C1179f(gb gbVar) {
        this.this$0 = gbVar;
    }

    /* renamed from: a */
    public boolean mo2352a(nb nbVar) {
        if (nbVar instanceof C1231a) {
            ((C1231a) nbVar).executerDeclarationGlobales();
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo2353a(C0489p c0489p) {
        return true;
    }
}
