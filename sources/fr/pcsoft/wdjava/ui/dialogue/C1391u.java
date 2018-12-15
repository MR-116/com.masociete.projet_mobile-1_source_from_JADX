package fr.pcsoft.wdjava.ui.dialogue;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import fr.pcsoft.wdjava.core.types.WDDate;

/* renamed from: fr.pcsoft.wdjava.ui.dialogue.u */
class C1391u implements OnDateSetListener {
    final WDMsgBoxManagerImpl this$0;
    final WDDate[] val$resultat;

    C1391u(WDMsgBoxManagerImpl wDMsgBoxManagerImpl, WDDate[] wDDateArr) {
        this.this$0 = wDMsgBoxManagerImpl;
        this.val$resultat = wDDateArr;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.val$resultat[0] = new WDDate(i, i2 + 1, i3);
    }
}
