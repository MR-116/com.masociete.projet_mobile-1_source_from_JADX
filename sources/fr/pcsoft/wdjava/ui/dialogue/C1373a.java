package fr.pcsoft.wdjava.ui.dialogue;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import fr.pcsoft.wdjava.core.C0728o;

/* renamed from: fr.pcsoft.wdjava.ui.dialogue.a */
class C1373a implements OnCancelListener {
    final WDMsgBoxManagerImpl this$0;
    final C0728o val$result;

    C1373a(WDMsgBoxManagerImpl wDMsgBoxManagerImpl, C0728o c0728o) {
        this.this$0 = wDMsgBoxManagerImpl;
        this.val$result = c0728o;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.val$result.m3094a(Boolean.FALSE);
    }
}
