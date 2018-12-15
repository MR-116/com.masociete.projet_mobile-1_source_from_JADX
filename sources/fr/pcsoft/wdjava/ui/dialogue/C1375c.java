package fr.pcsoft.wdjava.ui.dialogue;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: fr.pcsoft.wdjava.ui.dialogue.c */
class C1375c implements OnClickListener {
    final WDMsgBoxManagerImpl this$0;
    final int[] val$nResultat;

    C1375c(WDMsgBoxManagerImpl wDMsgBoxManagerImpl, int[] iArr) {
        this.this$0 = wDMsgBoxManagerImpl;
        this.val$nResultat = iArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.val$nResultat[0] = i;
        dialogInterface.dismiss();
    }
}
