package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;

class kb extends jb {
    final tb this$1;
    final int val$nLiaisonIndex;

    kb(tb tbVar, Context context, WDRuptureZR wDRuptureZR, int i) {
        this.this$1 = tbVar;
        this.val$nLiaisonIndex = i;
        super(tbVar.this$0, context, wDRuptureZR);
    }

    /* renamed from: a */
    protected int mo3564a() {
        return this.this$1.e != null ? this.this$1.e[this.val$nLiaisonIndex] : -1;
    }
}
