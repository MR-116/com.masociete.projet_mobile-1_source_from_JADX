package fr.pcsoft.wdjava.ui.dialogue;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;

/* renamed from: fr.pcsoft.wdjava.ui.dialogue.l */
class C1383l extends DatePickerDialog {
    final WDMsgBoxManagerImpl this$0;
    final String val$strTitre;

    C1383l(WDMsgBoxManagerImpl wDMsgBoxManagerImpl, Context context, OnDateSetListener onDateSetListener, int i, int i2, int i3, String str) {
        this.this$0 = wDMsgBoxManagerImpl;
        this.val$strTitre = str;
        super(context, onDateSetListener, i, i2, i3);
    }

    public void setTitle(CharSequence charSequence) {
        if (this.val$strTitre != null) {
            charSequence = this.val$strTitre;
        }
        super.setTitle(charSequence);
    }
}
