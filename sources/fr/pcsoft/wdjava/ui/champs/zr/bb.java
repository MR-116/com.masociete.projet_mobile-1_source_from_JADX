package fr.pcsoft.wdjava.ui.champs.zr;

import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.ui.champs.fb;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.image.C0520c;
import fr.pcsoft.wdjava.ui.champs.uc;
import fr.pcsoft.wdjava.ui.p065b.C1099j;

public interface bb extends uc {
    WDObjet[] buildBindingItemData();

    fb getRenderingMode();

    boolean loadImage(C0520c c0520c, C1099j c1099j);

    void notifFinFocus(gc gcVar);

    void onChampPropertyValueChanged(gc gcVar, EWDPropriete eWDPropriete, WDObjet wDObjet);
}
