package fr.pcsoft.wdjava.ui.champs.groupeoptions;

import android.widget.CompoundButton;
import fr.pcsoft.wdjava.ui.activite.C1056i;

public class WDBoutonRadio extends C0500n {
    protected CompoundButton creerOption() {
        return new C1199h(this, C1056i.m7562a());
    }

    public void griserOption() {
        super.griserOption();
        if (this.j.isChecked() && this.m._getEtat() != 4) {
            this.m.selectionnerOptionSuivante();
        }
    }
}
