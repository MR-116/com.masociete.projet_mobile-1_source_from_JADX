package fr.pcsoft.wdjava.ui.dialogue;

import android.app.TimePickerDialog.OnTimeSetListener;
import android.widget.TimePicker;
import fr.pcsoft.wdjava.core.types.WDHeure;

/* renamed from: fr.pcsoft.wdjava.ui.dialogue.j */
class C1381j implements OnTimeSetListener {
    final WDMsgBoxManagerImpl this$0;
    final WDHeure[] val$resultat;

    C1381j(WDMsgBoxManagerImpl wDMsgBoxManagerImpl, WDHeure[] wDHeureArr) {
        this.this$0 = wDMsgBoxManagerImpl;
        this.val$resultat = wDHeureArr;
    }

    public void onTimeSet(TimePicker timePicker, int i, int i2) {
        this.val$resultat[0] = new WDHeure(i, i2, 0);
    }
}
