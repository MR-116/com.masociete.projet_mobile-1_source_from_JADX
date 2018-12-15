package fr.pcsoft.wdjava.ui.dialogue;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Message;
import fr.pcsoft.wdjava.core.utils.C0806j;

/* renamed from: fr.pcsoft.wdjava.ui.dialogue.e */
class C1377e implements OnDismissListener {
    final WDMsgBoxManagerImpl this$0;
    final boolean val$bBloquant;
    final Dialog val$dlgbox;
    final int[] val$idMessage;

    C1377e(WDMsgBoxManagerImpl wDMsgBoxManagerImpl, Dialog dialog, boolean z, int[] iArr) {
        this.this$0 = wDMsgBoxManagerImpl;
        this.val$dlgbox = dialog;
        this.val$bBloquant = z;
        this.val$idMessage = iArr;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.this$0.m9855a(this.val$dlgbox.getContext());
        if (this.val$bBloquant) {
            Message.obtain(C0806j.m3954d(), this.val$idMessage[0]).sendToTarget();
        }
    }
}
