package fr.pcsoft.wdjava.ui.menu;

import android.view.MenuItem;

/* renamed from: fr.pcsoft.wdjava.ui.menu.i */
public interface C0495i extends C0494e {
    C0494e getConteneurMenu();

    String getNomOptionMenu();

    int getNumeroOptionMenu();

    C0495i getOptionMenuParente();

    void initOptionMenu(MenuItem menuItem);

    boolean isAvecIconePredefinie();

    boolean isAvecSousOption();
}
