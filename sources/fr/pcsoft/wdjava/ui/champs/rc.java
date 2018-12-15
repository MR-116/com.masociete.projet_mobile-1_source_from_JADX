package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.core.C0822v;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.ui.champs.zr.bb;

class rc extends C0822v {
    final gc this$0;
    final bb val$zr;

    rc(gc gcVar, bb bbVar) {
        this.this$0 = gcVar;
        this.val$zr = bbVar;
    }

    /* renamed from: a */
    public void mo3506a(EWDPropriete eWDPropriete, WDObjet wDObjet, boolean z) {
        if (z && (this.this$0.N & 8) == 0 && this.this$0.wc == null) {
            this.val$zr.onChampPropertyValueChanged(this.this$0, eWDPropriete, wDObjet);
        }
    }
}
