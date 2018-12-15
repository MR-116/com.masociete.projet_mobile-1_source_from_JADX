package fr.pcsoft.wdjava.ui.dialogue;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import fr.pcsoft.wdjava.core.application.WDProjet;

/* renamed from: fr.pcsoft.wdjava.ui.dialogue.z */
class C1396z implements OnClickListener {
    final WDMsgBoxManagerImpl this$0;

    C1396z(WDMsgBoxManagerImpl wDMsgBoxManagerImpl) {
        this.this$0 = wDMsgBoxManagerImpl;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        WDProjet.getInstance().terminerApplication();
    }
}
