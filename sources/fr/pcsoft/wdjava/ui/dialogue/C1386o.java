package fr.pcsoft.wdjava.ui.dialogue;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import fr.pcsoft.wdjava.core.types.WDBooleen;

/* renamed from: fr.pcsoft.wdjava.ui.dialogue.o */
class C1386o implements OnClickListener {
    final WDMsgBoxManagerImpl this$0;
    final WDBooleen val$resultat;

    C1386o(WDMsgBoxManagerImpl wDMsgBoxManagerImpl, WDBooleen wDBooleen) {
        this.this$0 = wDMsgBoxManagerImpl;
        this.val$resultat = wDBooleen;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.val$resultat.setValeur(true);
        dialogInterface.dismiss();
    }
}
