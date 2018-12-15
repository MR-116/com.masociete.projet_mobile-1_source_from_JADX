package fr.pcsoft.wdjava.ui.champs.saisie;

import fr.pcsoft.wdjava.ui.champs.table.colonne.C1278a;
import fr.pcsoft.wdjava.ui.utils.C1503b;

public class WDChampSaisieSimple extends C0517i implements C0518k {
    public WDChampSaisieSimple() {
        m1437l();
    }

    public WDChampSaisieSimple(C1278a c1278a) {
        super(c1278a);
        m1437l();
    }

    /* renamed from: l */
    private final void m1437l() {
        this.Yc.setSingleLine();
        C1503b.m10446b(this.Yc, 1);
    }

    public void afficherPopupCalendrier() {
    }
}
