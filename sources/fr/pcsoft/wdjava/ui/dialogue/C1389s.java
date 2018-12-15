package fr.pcsoft.wdjava.ui.dialogue;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import fr.pcsoft.wdjava.core.types.WDEntier4;

/* renamed from: fr.pcsoft.wdjava.ui.dialogue.s */
class C1389s implements OnClickListener {
    final WDMsgBoxManagerImpl this$0;
    final int val$nValeurRetour;
    final WDEntier4 val$resultat;

    C1389s(WDMsgBoxManagerImpl wDMsgBoxManagerImpl, WDEntier4 wDEntier4, int i) {
        this.this$0 = wDMsgBoxManagerImpl;
        this.val$resultat = wDEntier4;
        this.val$nValeurRetour = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.val$resultat.setValeur(this.val$nValeurRetour);
        dialogInterface.dismiss();
    }
}
