package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;

/* renamed from: fr.pcsoft.wdjava.ui.champs.y */
public interface C0504y extends db, nb {
    void ajouter(String str, C0489p c0489p);

    void appliquerAncrage(int i, int i2, int i3, int i4, int i5);

    xc getConteneurManager();

    void installerChamp(nb nbVar);

    boolean isConteneur();

    void majOrdreNavigation(C0508h c0508h);

    void majPlan(int i);

    void parcourirChamp(C0546j c0546j, boolean z);

    void parcourirObjetAPCode(C0546j c0546j, boolean z);

    void raz(boolean z);

    boolean restaurerValeur();

    void sauverValeur();

    void screenToSource(String str);

    boolean setPositionChamp(int i, int i2, int i3);

    boolean setTailleChamp(int i, int i2, int i3);

    void sourceToScreen(String str);
}
