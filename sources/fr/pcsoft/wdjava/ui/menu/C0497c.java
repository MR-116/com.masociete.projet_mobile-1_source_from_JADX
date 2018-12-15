package fr.pcsoft.wdjava.ui.menu;

import fr.pcsoft.wdjava.ui.p064a.C1034d;
import fr.pcsoft.wdjava.ui.p079e.C1399b;

/* renamed from: fr.pcsoft.wdjava.ui.menu.c */
public interface C0497c extends C0494e {
    void ajouterMenu(C0495i c0495i);

    C1034d getCouleurFondRepos();

    C1034d getCouleurFondSurvol();

    C1034d getCouleurRepos();

    C1034d getCouleurSurvol();

    int getNumeroOptionMenuMax();

    C1399b getPoliceRepos();

    C1399b getPoliceSurvol();

    boolean isThemeXPActif();

    void notifAjoutOptionMenu(C0495i c0495i);
}
