package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.p058k.C0931b;
import fr.pcsoft.wdjava.ui.C0489p;

public abstract class ec extends C0489p {
    /* renamed from: z */
    private static final String[] f3501z = new String[]{m8324z(m8325z("\u0013X6t\u0017dH=p\u0006uE:{")), m8324z(m8325z("m9"))};
    /* renamed from: d */
    protected int f3502d = 0;
    /* renamed from: e */
    protected gc f3503e = null;

    public ec(gc gcVar, int i) {
        this.f3503e = gcVar;
        this.f3502d = i;
    }

    /* renamed from: z */
    private static String m8324z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 48;
                    break;
                case 1:
                    i2 = 23;
                    break;
                case 2:
                    i2 = 116;
                    break;
                case 3:
                    i2 = 62;
                    break;
                default:
                    i2 = 82;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8325z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 82);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected abstract WDObjet mo3530a(EWDPropriete eWDPropriete);

    /* renamed from: a */
    public abstract C0489p mo3531a();

    /* renamed from: a */
    public final void m8328a(int i) {
        this.f3502d = i;
    }

    /* renamed from: a */
    protected abstract void mo3532a(EWDPropriete eWDPropriete, WDObjet wDObjet);

    public <T> T checkType(Class<T> cls) {
        T checkType = super.checkType(cls);
        return checkType == null ? this.f3503e != null ? this.f3503e.checkType(cls) : null : checkType;
    }

    public WDObjet get(int i) {
        return this.f3503e.get(i);
    }

    public WDObjet get(int i, int i2) {
        return this.f3503e.get(i, i2);
    }

    public WDObjet getBorneMax() {
        return mo3530a(EWDPropriete.PROP_BORNEMAX);
    }

    public WDObjet getBorneMin() {
        return mo3530a(EWDPropriete.PROP_BORNEMIN);
    }

    public WDEntier4 getColonne() {
        return (WDEntier4) mo3530a(EWDPropriete.PROP_COLONNE);
    }

    public WDEntier4 getCouleur() {
        return (WDEntier4) mo3530a(EWDPropriete.PROP_COULEUR);
    }

    public WDEntier4 getCouleurFond() {
        return (WDEntier4) mo3530a(EWDPropriete.PROP_COULEURFOND);
    }

    public WDEntier4 getCouleurJauge() {
        return (WDEntier4) mo3530a(EWDPropriete.PROP_COULEURJAUGE);
    }

    public WDObjet getElement(String str) {
        return this.f3503e.getElement(str);
    }

    public WDBooleen getEnfonce() {
        return (WDBooleen) mo3530a(EWDPropriete.PROP_ENFONCE);
    }

    public WDEntier4 getEtat() {
        return (WDEntier4) mo3530a(EWDPropriete.PROP_ETAT);
    }

    public WDEntier4 getHauteur() {
        return (WDEntier4) mo3530a(EWDPropriete.PROP_HAUTEUR);
    }

    public WDChaine getImage() {
        return (WDChaine) mo3530a(EWDPropriete.PROP_IMAGE);
    }

    public WDEntier4 getImageMode() {
        return (WDEntier4) mo3530a(EWDPropriete.PROP_IMAGEMODE);
    }

    public WDEntier4 getLargeur() {
        return (WDEntier4) mo3530a(EWDPropriete.PROP_LARGEUR);
    }

    public WDChaine getLibelle() {
        return (WDChaine) mo3530a(EWDPropriete.PROP_LIBELLE);
    }

    public WDEntier4 getLigne() {
        return (WDEntier4) mo3530a(EWDPropriete.PROP_LIGNE);
    }

    public WDObjet getMasqueAffichage() {
        return mo3530a(EWDPropriete.PROP_MASQUEAFFICHAGE);
    }

    public WDObjet getMasqueSaisie() {
        return mo3530a(EWDPropriete.PROP_MASQUESAISIE);
    }

    public WDObjet getMembre(String str) {
        return this.f3503e.getMembre(str);
    }

    public String getName() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(mo3531a().getName()).append(C0931b.f2543a).append(C0725i.m3069e(this.f3502d)).append(f3501z[1]).append(this.f3503e.getName());
        return stringBuffer.toString();
    }

    public String getNomType() {
        return C0745b.m3220a(f3501z[0], new String[0]);
    }

    public WDObjet getNote() {
        return mo3530a(EWDPropriete.PROP_NOTE);
    }

    public WDBooleen getPoliceBarree() {
        return (WDBooleen) mo3530a(EWDPropriete.PROP_POLICEBARREE);
    }

    public WDBooleen getPoliceGras() {
        return (WDBooleen) mo3530a(EWDPropriete.PROP_POLICEGRAS);
    }

    public WDBooleen getPoliceItalique() {
        return (WDBooleen) mo3530a(EWDPropriete.PROP_POLICEITALIQUE);
    }

    public WDChaine getPoliceNom() {
        return (WDChaine) mo3530a(EWDPropriete.PROP_POLICENOM);
    }

    public WDBooleen getPoliceSoulignee() {
        return (WDBooleen) mo3530a(EWDPropriete.PROP_POLICESOULIGNEE);
    }

    public WDEntier4 getPoliceTaille() {
        return (WDEntier4) mo3530a(EWDPropriete.PROP_POLICETAILLE);
    }

    public WDChaine getPropLiaisonFichier() {
        return (WDChaine) mo3530a(EWDPropriete.PROP_LIAISONFICHIER);
    }

    public WDEntier4 getTypeSaisie() {
        return (WDEntier4) mo3530a(EWDPropriete.PROP_TYPESAISIE);
    }

    public WDObjet getValeur() {
        return mo3530a(EWDPropriete.PROP_VALEUR);
    }

    public WDBooleen getVisible() {
        return (WDBooleen) mo3530a(EWDPropriete.PROP_VISIBLE);
    }

    public WDEntier4 getX() {
        return (WDEntier4) mo3530a(EWDPropriete.PROP_X);
    }

    public WDEntier4 getY() {
        return (WDEntier4) mo3530a(EWDPropriete.PROP_Y);
    }

    public WDObjet invoquerMethode(String str, WDObjet... wDObjetArr) {
        return this.f3503e.invoquerMethode(str, wDObjetArr);
    }

    public void release() {
        super.release();
        this.f3503e = null;
    }

    public void setBorneMax(WDObjet wDObjet) {
        mo3532a(EWDPropriete.PROP_BORNEMAX, wDObjet);
    }

    public void setBorneMin(WDObjet wDObjet) {
        mo3532a(EWDPropriete.PROP_BORNEMIN, wDObjet);
    }

    public void setColonne(int i) {
        mo3532a(EWDPropriete.PROP_COLONNE, new WDEntier4(i));
    }

    public void setCouleur(int i) {
        mo3532a(EWDPropriete.PROP_COULEUR, new WDEntier4(i));
    }

    public void setCouleurFond(int i) {
        mo3532a(EWDPropriete.PROP_COULEURFOND, new WDEntier4(i));
    }

    public void setCouleurJauge(int i) {
        mo3532a(EWDPropriete.PROP_COULEURJAUGE, new WDEntier4(i));
    }

    public void setEnfonce(boolean z) {
        mo3532a(EWDPropriete.PROP_ENFONCE, new WDBooleen(z));
    }

    public void setEtat(int i) {
        mo3532a(EWDPropriete.PROP_ETAT, new WDEntier4(i));
    }

    public void setHauteur(int i) {
        mo3532a(EWDPropriete.PROP_HAUTEUR, new WDEntier4(i));
    }

    public void setImage(String str) {
        mo3532a(EWDPropriete.PROP_IMAGE, new WDChaine(str));
    }

    public void setImageMode(int i) {
        mo3532a(EWDPropriete.PROP_IMAGEMODE, new WDEntier4(i));
    }

    public void setLargeur(int i) {
        mo3532a(EWDPropriete.PROP_LARGEUR, new WDEntier4(i));
    }

    public void setLibelle(String str) {
        mo3532a(EWDPropriete.PROP_LIBELLE, new WDChaine(str));
    }

    public void setLigne(int i) {
        mo3532a(EWDPropriete.PROP_LIGNE, new WDEntier4(i));
    }

    public void setMasqueAffichage(WDObjet wDObjet) {
        mo3532a(EWDPropriete.PROP_MASQUEAFFICHAGE, wDObjet);
    }

    public void setMasqueSaisie(WDObjet wDObjet) {
        mo3532a(EWDPropriete.PROP_MASQUESAISIE, wDObjet);
    }

    public void setNote(String str) {
        mo3532a(EWDPropriete.PROP_NOTE, new WDChaine(str));
    }

    public void setPoliceBarree(boolean z) {
        mo3532a(EWDPropriete.PROP_POLICEBARREE, new WDBooleen(z));
    }

    public void setPoliceGras(boolean z) {
        mo3532a(EWDPropriete.PROP_POLICEGRAS, new WDBooleen(z));
    }

    public void setPoliceItalique(boolean z) {
        mo3532a(EWDPropriete.PROP_POLICEITALIQUE, new WDBooleen(z));
    }

    public void setPoliceNom(String str) {
        mo3532a(EWDPropriete.PROP_POLICENOM, new WDChaine(str));
    }

    public void setPoliceSoulignee(boolean z) {
        mo3532a(EWDPropriete.PROP_POLICESOULIGNEE, new WDBooleen(z));
    }

    public void setPoliceTaille(int i) {
        mo3532a(EWDPropriete.PROP_POLICETAILLE, new WDEntier4(i));
    }

    public void setPropLiaisonFichier(String str) {
        mo3532a(EWDPropriete.PROP_LIAISONFICHIER, new WDChaine(str));
    }

    public void setTypeSaisie(int i) {
        mo3532a(EWDPropriete.PROP_TYPESAISIE, new WDEntier4(i));
    }

    public void setValeur(WDObjet wDObjet) {
        mo3532a(EWDPropriete.PROP_VALEUR, wDObjet);
    }

    public void setVisible(boolean z) {
        mo3532a(EWDPropriete.PROP_VISIBLE, new WDBooleen(z));
    }

    public void setX(int i) {
        mo3532a(EWDPropriete.PROP_X, new WDEntier4(i));
    }

    public void setY(int i) {
        mo3532a(EWDPropriete.PROP_Y, new WDEntier4(i));
    }
}
