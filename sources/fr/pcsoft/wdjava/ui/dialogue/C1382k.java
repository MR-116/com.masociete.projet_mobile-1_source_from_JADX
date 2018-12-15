package fr.pcsoft.wdjava.ui.dialogue;

import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.Context;

/* renamed from: fr.pcsoft.wdjava.ui.dialogue.k */
class C1382k extends TimePickerDialog {
    final WDMsgBoxManagerImpl this$0;
    final String val$strTitre;

    C1382k(WDMsgBoxManagerImpl wDMsgBoxManagerImpl, Context context, OnTimeSetListener onTimeSetListener, int i, int i2, boolean z, String str) {
        this.this$0 = wDMsgBoxManagerImpl;
        this.val$strTitre = str;
        super(context, onTimeSetListener, i, i2, z);
    }

    public void setTitle(CharSequence charSequence) {
        if (this.val$strTitre != null) {
            charSequence = this.val$strTitre;
        }
        super.setTitle(charSequence);
    }
}
