package fr.pcsoft.wdjava.ui.champs.saisie;

import android.text.method.HideReturnsTransformationMethod;
import fr.pcsoft.wdjava.ui.champs.table.colonne.C1278a;

public class WDChampSaisieMultiLigne extends C0517i {
    public WDChampSaisieMultiLigne() {
        m1529l();
    }

    public WDChampSaisieMultiLigne(C1278a c1278a) {
        super(c1278a);
        m1529l();
    }

    /* renamed from: l */
    private final void m1529l() {
        this.Yc.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
    }

    public boolean isChampSaisieMultiLigne() {
        return true;
    }

    public void setMaxLines(int i) {
        this.Yc.setMaxLines(i);
    }
}
