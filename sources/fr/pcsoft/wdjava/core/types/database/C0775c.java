package fr.pcsoft.wdjava.core.types.database;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0487y;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;

/* renamed from: fr.pcsoft.wdjava.core.types.database.c */
public abstract class C0775c extends C0487y {
    /* renamed from: z */
    private static final String[] f2016z = new String[]{C0775c.m3559z(C0775c.m3560z("g\u001e] /")), C0775c.m3559z(C0775c.m3560z("g\u001e] /\u001b\u001eV9")), C0775c.m3559z(C0775c.m3560z("g\bE#/\u001b\u000eA/.\u000b\u0004J5/\u0017")), C0775c.m3559z(C0775c.m3560z("g\u001fP9&\r\u0019E$/\u0011\u0018")), C0775c.m3559z(C0775c.m3560z("g\u0018Q28\r\u001bQ55\u000b\u0018M7#\n\u000f")), C0775c.m3559z(C0775c.m3560z("g\bM>+\r\u0018A")), C0775c.m3559z(C0775c.m3560z("g\u001e] /\u001b\tH5")), C0775c.m3559z(C0775c.m3560z("g\u0006M2/\b\u0006A")), C0775c.m3559z(C0775c.m3560z("g\tK>$\u0001\u0012M?$")), C0775c.m3559z(C0775c.m3560z("g\u001cE</\u0011\u0018[4/\u0002\u000bQ$")), C0775c.m3559z(C0775c.m3560z("g\tK>.\r\u001eM?$\u001b\fM<>\u0016\u000f")), C0775c.m3559z(C0775c.m3560z("g\u000bF\"/\u0012\u0003E$#\u000b\u0004")), C0775c.m3559z(C0775c.m3560z("g\u001eA(>\u0001")), C0775c.m3559z(C0775c.m3560z("g\u001aV?<\r\u000eA\"")), C0775c.m3559z(C0775c.m3560z("g\u001eE9&\b\u000f")), C0775c.m3559z(C0775c.m3560z("g\u0007A=%")), C0775c.m3559z(C0775c.m3560z("g\u0004Q<&\u001b\u0019Q :\u000b\u0018P5")), C0775c.m3559z(C0775c.m3560z("g\u0004Q<&")), C0775c.m3559z(C0775c.m3560z("g\u0004Q=/\u0016\u0003U%/")), C0775c.m3559z(C0775c.m3560z("g\u0004F/)\u000b\u0007T?9\u0005\u0004P5")), C0775c.m3559z(C0775c.m3560z("g\u0004F/8\u0011\bV9;\u0011\u000f[3&\u0001")), C0775c.m3559z(C0775c.m3560z("g\u0018Q28\r\u001bQ55\u0002\u0003H$8\u0001\u000f")), C0775c.m3559z(C0775c.m3560z("g\u0004F/8\u0011\bV9;\u0011\u000f[=/\t\u0005")), C0775c.m3559z(C0775c.m3560z("g\u0004F/8\u0011\bV9;\u0011\u000f")), C0775c.m3559z(C0775c.m3560z("g\u0019K%8\u0007\u000f"))};
    /* renamed from: a */
    protected boolean f2017a = false;

    /* renamed from: z */
    private static String m3559z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 68;
                    break;
                case 1:
                    i2 = 74;
                    break;
                case 2:
                    i2 = 4;
                    break;
                case 3:
                    i2 = 112;
                    break;
                default:
                    i2 = 106;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3560z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 106);
        }
        return toCharArray;
    }

    /* renamed from: e */
    public WDChaine mo3069e() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[24])));
        return null;
    }

    public WDChaine getAbreviation() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[11])));
        return null;
    }

    public WDChaine getBaseDeDonnees() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[2])));
        return null;
    }

    public WDBooleen getBinaire() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[5])));
        return null;
    }

    public WDObjet getClone() {
        return getValeur().getClone();
    }

    public WDChaine getConditionFiltre() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[10])));
        return null;
    }

    public WDChaine getConnexion() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[8])));
        return null;
    }

    public WDChaine getLibelle() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[7])));
        return null;
    }

    public WDBooleen getMemo() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[15])));
        return null;
    }

    public abstract String getMessageAccesPropieteInterdite(String str);

    public abstract String getMessageLecturePropieteInterdite(String str);

    public WDEntier4 getNbComposante() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[19])));
        return null;
    }

    public WDEntier4 getNbRubrique() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[23])));
        return null;
    }

    public WDEntier4 getNbRubriqueCle() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[20])));
        return null;
    }

    public WDEntier4 getNbRubriqueMemo() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[22])));
        return null;
    }

    public String getNomType() {
        WDObjet valeur = getValeur();
        return valeur != null ? valeur.getNomType() : "";
    }

    public WDBooleen getNull() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[17])));
        return null;
    }

    public WDBooleen getNullSupporte() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[16])));
        return null;
    }

    public WDBooleen getNumerique() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[18])));
        return null;
    }

    public WDChaine getProvider() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[13])));
        return null;
    }

    public WDChaine getRubriqueFiltree() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[21])));
        return null;
    }

    public WDChaine getRubriqueOrigine() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[4])));
        return null;
    }

    public /* bridge */ /* synthetic */ WDObjet getSource() {
        return mo3069e();
    }

    public WDEntier4 getTaille() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[14])));
        return null;
    }

    public WDObjet getTexte() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[12])));
        return null;
    }

    public WDEntier4 getTypeCle() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[6])));
        return null;
    }

    public WDEntier4 getTypeTri() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[1])));
        return null;
    }

    public int getTypeVar() {
        WDObjet valeur = getValeur();
        return valeur != null ? valeur.getTypeVar() : 0;
    }

    public WDChaine getUtilisateur() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[3])));
        return null;
    }

    public WDObjet getValeurParDefaut() {
        WDErreurManager.m2883a(getMessageLecturePropieteInterdite(C0745b.m3219a(f2016z[9])));
        return null;
    }

    public boolean isEvaluable() {
        return true;
    }

    public final boolean isReleased() {
        return this.f2017a;
    }

    public void razVariable() {
    }

    public void release() {
        this.f2017a = true;
    }

    public void setAbreviation(String str) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[11])));
    }

    public void setBaseDeDonnees(String str) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[2])));
    }

    public void setBinaire(boolean z) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[5])));
    }

    public void setConditionFiltre(String str) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[10])));
    }

    public void setConnexion(String str) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[8])));
    }

    public void setLibelle(String str) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[7])));
    }

    public void setMemo(boolean z) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[15])));
    }

    public void setNbComposante(int i) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[19])));
    }

    public void setNbRubrique(int i) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[23])));
    }

    public void setNbRubriqueCle(int i) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[20])));
    }

    public void setNbRubriqueMemo(int i) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[22])));
    }

    public void setNull(boolean z) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[17])));
    }

    public void setNullSupporte(boolean z) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[16])));
    }

    public void setNumerique(boolean z) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[18])));
    }

    public void setProvider(String str) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[13])));
    }

    public void setRubriqueFiltree(String str) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[21])));
    }

    public void setRubriqueOrigine(String str) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[4])));
    }

    public void setSource(String str) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[24])));
    }

    public void setTaille(int i) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[14])));
    }

    public void setTexte(String str) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[12])));
    }

    public void setType(int i) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[0])));
    }

    public void setTypeCle(int i) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[6])));
    }

    public void setTypeTri(int i) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[1])));
    }

    public void setUtilisateur(String str) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[3])));
    }

    public void setValeurParDefaut(WDObjet wDObjet) {
        WDErreurManager.m2883a(getMessageAccesPropieteInterdite(C0745b.m3219a(f2016z[9])));
    }
}
