package fr.pcsoft.wdjava.ui.dialogue;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: fr.pcsoft.wdjava.ui.dialogue.b */
class C1374b implements OnClickListener {
    final WDMsgBoxManagerImpl this$0;

    C1374b(WDMsgBoxManagerImpl wDMsgBoxManagerImpl) {
        this.this$0 = wDMsgBoxManagerImpl;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
