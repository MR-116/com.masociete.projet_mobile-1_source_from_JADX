package fr.pcsoft.wdjava.ui.dialogue;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import fr.pcsoft.wdjava.core.types.WDEntier4;

/* renamed from: fr.pcsoft.wdjava.ui.dialogue.h */
class C1379h implements OnClickListener {
    final WDMsgBoxManagerImpl this$0;
    final WDEntier4 val$resultat;

    C1379h(WDMsgBoxManagerImpl wDMsgBoxManagerImpl, WDEntier4 wDEntier4) {
        this.this$0 = wDMsgBoxManagerImpl;
        this.val$resultat = wDEntier4;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.val$resultat.setValeur(0);
        dialogInterface.dismiss();
    }
}
