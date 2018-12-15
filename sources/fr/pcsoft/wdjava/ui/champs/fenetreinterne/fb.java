package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import fr.pcsoft.wdjava.core.C0506k;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.nb;

public interface fb extends nb, C0506k {
    void addListener(C0525y c0525y);

    void declarerGlobale(WDObjet[] wDObjetArr);

    void execDeclarationGlobales(WDObjet... wDObjetArr);

    C0489p getChampFenetreInterne();

    int getPlanActif();

    boolean isLoaded();

    boolean isUniteAffichageLogique();

    void release();

    void removeListener(C0525y c0525y);
}
