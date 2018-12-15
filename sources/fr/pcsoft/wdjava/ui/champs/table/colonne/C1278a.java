package fr.pcsoft.wdjava.ui.champs.table.colonne;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.ui.C0488r;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.table.C1280o;

/* renamed from: fr.pcsoft.wdjava.ui.champs.table.colonne.a */
public interface C1278a extends C0488r {
    gc createChampForColumn();

    boolean editCell(int i);

    gc getChamp();

    WDObjet getProxy(int i);

    C1280o getTable();

    void initColumnForClone(gc gcVar);

    boolean isEditable();

    boolean isToggleValueOnClick();
}
