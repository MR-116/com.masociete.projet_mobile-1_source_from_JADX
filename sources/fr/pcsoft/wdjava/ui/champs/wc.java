package fr.pcsoft.wdjava.ui.champs;

import android.widget.AbsListView;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDException;

public interface wc extends nb {
    jb addBindingItem(int i);

    boolean ajouterElement(String str);

    boolean ajouterElements(String str);

    jb createBindingItem();

    void deplacerLigne(int i, int i2, boolean z);

    void echangerLigne(int i, int i2, boolean z);

    int getElementHeight();

    int getFirstVisibleElement();

    jb getItemAt(int i);

    int getItemCount();

    int getLastVisibleElement();

    AbsListView getListView();

    int getMaxItemCountPerRow();

    int getMaxVisibleRowCount();

    int getNbElement();

    int getRowCount();

    int getRowCount(int i);

    ub getSelectionModel();

    void initLiaisonsBinding();

    boolean insererElement(String str);

    boolean insererElement(String str, int i);

    void invalidateDrawCache();

    boolean isChangeSourcePositionOnSelection();

    boolean isMemoire();

    boolean isSelectionParProgrammation();

    boolean isVertical();

    void modifierElement(String str);

    void modifierElement(String str, int i) throws WDException;

    void notifyDataSetChanged();

    void onValueChanged();

    void removeAllBindingItem();

    void removeBindingItemAt(int i);

    void setFirstVisibleElement(int i);

    void setItemStoredValue(int i, WDObjet wDObjet);

    void setSelectionParProgrammation(boolean z);

    void supprimerElementA(int i, boolean z) throws WDException;

    void supprimerElementSelectionne(boolean z);

    void supprimerTout();

    String[] valeurGLien(String str);
}
