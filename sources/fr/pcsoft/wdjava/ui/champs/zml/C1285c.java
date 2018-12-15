package fr.pcsoft.wdjava.ui.champs.zml;

import android.view.View;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.C0546j;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.nb;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zml.c */
class C1285c implements C0546j {
    final WDZoneMultiligne this$0;
    final int val$nHauteurLigne;
    final int[] val$nHauteurMinConteneur;
    final View val$parentView;

    C1285c(WDZoneMultiligne wDZoneMultiligne, View view, int i, int[] iArr) {
        this.this$0 = wDZoneMultiligne;
        this.val$parentView = view;
        this.val$nHauteurLigne = i;
        this.val$nHauteurMinConteneur = iArr;
    }

    /* renamed from: a */
    public boolean mo2352a(nb nbVar) {
        gc gcVar = (gc) nbVar;
        if (gcVar != this.this$0 && gcVar._getLocalY() >= this.this$0._getLocalY() + this.this$0._getHauteur() && gcVar.getCompConteneur().getParent() == this.val$parentView && this.this$0.checkCommonPlans(gcVar)) {
            gcVar.setPositionChamp(gcVar._getX(), gcVar._getY() + this.val$nHauteurLigne, 0);
            this.val$nHauteurMinConteneur[0] = Math.max(this.val$nHauteurMinConteneur[0], gcVar._getLocalY() + gcVar._getHauteur());
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo2353a(C0489p c0489p) {
        return true;
    }
}
