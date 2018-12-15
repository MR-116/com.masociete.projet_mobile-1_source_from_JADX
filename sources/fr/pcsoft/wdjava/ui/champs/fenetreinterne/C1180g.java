package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import fr.pcsoft.wdjava.core.WDObjet;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetreinterne.g */
class C1180g implements Runnable {
    final WDChampFenetreInterneExt this$0;
    final WDFenetreInterne val$fenetreInterne;
    final WDObjet[] val$params;

    C1180g(WDChampFenetreInterneExt wDChampFenetreInterneExt, WDFenetreInterne wDFenetreInterne, WDObjet[] wDObjetArr) {
        this.this$0 = wDChampFenetreInterneExt;
        this.val$fenetreInterne = wDFenetreInterne;
        this.val$params = wDObjetArr;
    }

    public void run() {
        if (!this.val$fenetreInterne.isReleased()) {
            super.initialiserFenetreInterne(this.val$fenetreInterne, this.val$params);
        }
    }
}
