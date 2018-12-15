package fr.pcsoft.wdjava.ui.champs.zr;

import fr.pcsoft.wdjava.ui.champs.fenetre.C0509v;
import fr.pcsoft.wdjava.ui.champs.fenetre.C1162n;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;

class mc implements C1162n {
    final WDZoneRepetee this$0;
    final WDFenetre val$fenetreMere;

    mc(WDZoneRepetee wDZoneRepetee, WDFenetre wDFenetre) {
        this.this$0 = wDZoneRepetee;
        this.val$fenetreMere = wDFenetre;
    }

    /* renamed from: a */
    public void mo3567a(C0509v c0509v) {
    }

    /* renamed from: b */
    public void mo3568b(C0509v c0509v) {
    }

    /* renamed from: c */
    public void mo3569c(C0509v c0509v) {
        if (this.this$0.Yd == null) {
            this.this$0.Yd = new C1298i(this.this$0, null);
        }
        this.this$0.Yd.m9155b();
        this.val$fenetreMere.supprimerEcouteurFenetre(this);
    }
}
