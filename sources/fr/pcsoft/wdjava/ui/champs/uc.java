package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDEntier4;

public interface uc extends wc {
    void _tableAffiche(int i);

    void _tableAffiche(String str);

    WDBooleen _tableAjoute(String str);

    WDEntier4 _tableAjouteLigne(Object[] objArr);

    WDEntier4 _tableDeplaceLigne(int i, WDObjet wDObjet, int i2) throws bd;

    void _tableEnregistre();

    WDBooleen _tableInsere(String str, int i);

    void _tableInsereLigne(int i, Object[] objArr);

    void _tableModifie(String str, int i);

    void _tableModifieLigne(int i, Object[] objArr);

    WDEntier4 _tableOccurrence(int i);

    WDEntier4 _tablePosition();

    void _tablePosition(int i);

    WDBooleen _tableRafraichissementVisible();

    void _tableRafraichissementVisible(boolean z);

    WDEntier4 _tableSelect();

    WDEntier4 _tableSelect(int i);

    void _tableSelectMoins();

    void _tableSelectMoins(int[] iArr);

    WDEntier4 _tableSelectOccurrence();

    void _tableSelectPlus();

    void _tableSelectPlus(int[] iArr);

    void _tableSupprime(int i, boolean z);

    void _tableSupprimeTout();
}
