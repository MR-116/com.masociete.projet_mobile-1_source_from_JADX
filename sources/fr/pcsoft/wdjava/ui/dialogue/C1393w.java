package fr.pcsoft.wdjava.ui.dialogue;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import fr.pcsoft.wdjava.core.types.WDEntier4;

/* renamed from: fr.pcsoft.wdjava.ui.dialogue.w */
class C1393w implements OnClickListener {
    final WDMsgBoxManagerImpl this$0;
    final WDEntier4 val$resultat;

    C1393w(WDMsgBoxManagerImpl wDMsgBoxManagerImpl, WDEntier4 wDEntier4) {
        this.this$0 = wDMsgBoxManagerImpl;
        this.val$resultat = wDEntier4;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.val$resultat.setValeur(2);
        dialogInterface.dismiss();
    }
}
