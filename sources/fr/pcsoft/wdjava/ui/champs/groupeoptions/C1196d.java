package fr.pcsoft.wdjava.ui.champs.groupeoptions;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import fr.pcsoft.wdjava.ui.C0489p;

/* renamed from: fr.pcsoft.wdjava.ui.champs.groupeoptions.d */
class C1196d implements OnCheckedChangeListener {
    final WDSelecteur this$0;

    C1196d(WDSelecteur wDSelecteur) {
        this.this$0 = wDSelecteur;
    }

    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (!this.this$0.Cc) {
            this.this$0.onModifChamp();
            this.this$0.appelPCode_TLM(17, 3);
            if (this.this$0.l != null) {
                ((C0489p) this.this$0.l).appelPCode(17);
            }
        }
    }
}
