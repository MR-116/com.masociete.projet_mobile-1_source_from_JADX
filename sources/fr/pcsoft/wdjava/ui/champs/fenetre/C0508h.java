package fr.pcsoft.wdjava.ui.champs.fenetre;

import fr.pcsoft.wdjava.core.C0505p;
import fr.pcsoft.wdjava.core.C0506k;
import fr.pcsoft.wdjava.core.C0507r;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.p032m.C0503o;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.C0504y;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.fb;
import fr.pcsoft.wdjava.ui.champs.jauge.C1225d;
import fr.pcsoft.wdjava.ui.menu.C0494e;
import fr.pcsoft.wdjava.ui.menu.C0495i;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetre.h */
public interface C0508h extends C0503o, C0504y, C0505p, C0506k, C0507r {
    void abandonne();

    void activerGFI();

    void afficherPremierPlan();

    C0495i chercherOptionMenu(int i);

    C0495i chercherOptionMenu(String str);

    void desactiverGFI();

    boolean estOuverte();

    boolean estOuverteEtAffichee();

    boolean ferme(boolean z, boolean z2, WDException wDException);

    C0489p getChampNavigable(int i);

    fb getFenetreCoulissanteDroite();

    fb getFenetreCoulissanteGauche();

    fb getFenetreInterne(String str);

    boolean getFinOuverture();

    boolean getGFI();

    String getNomFenetre();

    String getNomGabarit();

    C0495i[] getOptionsMenu(String str, C0494e c0494e);

    int getPlanActif();

    C1225d getProgressBar();

    Object getSupport();

    String getTitreFenetre();

    WDObjet getValeurRenvoyee();

    boolean isBloqueTouchEvent();

    boolean isFenetreCree();

    boolean isHardwareAccelerated();

    boolean isInitialisee();

    boolean isUniteAffichageLogique();

    boolean modifAliasFenetre(String str, boolean z);

    C0508h ouvre(C1155i c1155i, String str, int i, int i2, boolean z, boolean z2, WDObjet[] wDObjetArr);

    C0508h ouvre(C1155i c1155i, WDObjet[] wDObjetArr);

    void setBloqueTouchEvent(boolean z);

    void setFenetreCree(boolean z);

    boolean setGFI(boolean z);

    void setIndiceChampCourant(int i);

    void setNomFenetre(String str);

    void setValeurRenvoyee(WDObjet wDObjet);

    void verifierOuverte();
}
