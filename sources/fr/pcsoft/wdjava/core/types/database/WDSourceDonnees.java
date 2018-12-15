package fr.pcsoft.wdjava.core.types.database;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0613b;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.database.hf.WDHF_Contexte;
import fr.pcsoft.wdjava.database.hf.requete.C0778b;

public class WDSourceDonnees extends C0775c implements C0776b {
    public static final C0613b<WDSourceDonnees> CREATOR = new C0779a();
    /* renamed from: z */
    private static final String[] f2018z = new String[]{m3773z(m3774z("\u001a>\u0014\t&z(\u0004\u0018;w#\u001e\u0019'f$\u0015\u001f;w#\u000e")), m3773z(m3774z("\u001a>\u0014\t&z(\u0004\u0018;w#\u001e\u0019'"))};
    /* renamed from: b */
    private String f2019b = null;
    /* renamed from: c */
    private String f2020c = "";
    /* renamed from: d */
    private boolean f2021d = false;

    public WDSourceDonnees(String str) {
        setNomSource(str);
    }

    /* renamed from: a */
    private C0776b m3772a() {
        String str = this.f2019b;
        return str != null ? this.f2021d ? WDHF_Contexte.getInstance().m5021h(str) : WDHF_Contexte.getInstance().m5004b(str) : null;
    }

    /* renamed from: z */
    private static String m3773z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 57;
                    break;
                case 1:
                    i2 = 109;
                    break;
                case 2:
                    i2 = 91;
                    break;
                case 3:
                    i2 = 92;
                    break;
                default:
                    i2 = 116;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3774z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 116);
        }
        return toCharArray;
    }

    public WDObjet chercherSousElement(String str) {
        C0776b a = m3772a();
        return a != null ? a.chercherSousElement(str) : null;
    }

    public WDChaine getAbreviation() {
        return ((WDObjet) getSourceDonnees()).getAbreviation();
    }

    public WDChaine getBaseDeDonnees() {
        return ((WDObjet) getSourceDonnees()).getBaseDeDonnees();
    }

    public WDObjet getBorneMax() {
        return ((WDObjet) getSourceDonnees()).getBorneMax();
    }

    public WDObjet getBorneMin() {
        return ((WDObjet) getSourceDonnees()).getBorneMin();
    }

    public WDChaine getConditionFiltre() {
        return ((WDObjet) getSourceDonnees()).getConditionFiltre();
    }

    public WDChaine getConnexion() {
        return ((WDObjet) getSourceDonnees()).getConnexion();
    }

    public WDObjet getElement(String str) {
        return ((WDObjet) getSourceDonnees()).getElement(str);
    }

    public WDObjet getElement(String str, boolean z) {
        return ((WDObjet) getSourceDonnees()).getElement(str, z);
    }

    public WDBooleen getFiltreAvecBornes() {
        return ((WDObjet) getSourceDonnees()).getFiltreAvecBornes();
    }

    public String getMessageAccesPropieteInterdite(String str) {
        return ((C0775c) getSourceDonnees()).getMessageAccesPropieteInterdite(str);
    }

    public String getMessageLecturePropieteInterdite(String str) {
        return ((C0775c) getSourceDonnees()).getMessageLecturePropieteInterdite(str);
    }

    public WDEntier4 getNbRubrique() {
        return ((WDObjet) getSourceDonnees()).getNbRubrique();
    }

    public WDEntier4 getNbRubriqueCle() {
        return ((WDObjet) getSourceDonnees()).getNbRubriqueCle();
    }

    public WDEntier4 getNbRubriqueMemo() {
        return ((WDObjet) getSourceDonnees()).getNbRubriqueMemo();
    }

    public WDChaine getNom() {
        return new WDChaine(getNomSourceDonnees());
    }

    public String getNomSourceDonnees() {
        return getSourceDonnees().getNomSourceDonnees();
    }

    public String getNomType() {
        return C0745b.m3220a(f2018z[1], new String[0]);
    }

    public WDBooleen getNullSupporte() {
        return ((WDObjet) getSourceDonnees()).getNullSupporte();
    }

    public WDChaine getRubriqueFiltree() {
        return ((WDObjet) getSourceDonnees()).getRubriqueFiltree();
    }

    public final C0776b getSourceDonnees() {
        C0776b a = m3772a();
        if (a == null) {
            WDErreurManager.m2883a(C0745b.m3222b(f2018z[0], this.f2020c));
        }
        return a;
    }

    public WDObjet getType() {
        return ((WDObjet) getSourceDonnees()).getType();
    }

    public int getTypeVar() {
        return 20;
    }

    public WDObjet getValeur() {
        C0776b a = m3772a();
        return a != null ? ((WDObjet) a).getValeur() : new WDChaine(this.f2020c);
    }

    public boolean isSourceDonnees() {
        return true;
    }

    public void setAbreviation(String str) {
        ((WDObjet) getSourceDonnees()).setAbreviation(str);
    }

    public void setBaseDeDonnees(String str) {
        ((WDObjet) getSourceDonnees()).setBaseDeDonnees(str);
    }

    public void setBorneMax(WDObjet wDObjet) {
        ((WDObjet) getSourceDonnees()).setBorneMax(wDObjet);
    }

    public void setBorneMin(WDObjet wDObjet) {
        ((WDObjet) getSourceDonnees()).setBorneMin(wDObjet);
    }

    public void setConditionFiltre(String str) {
        ((WDObjet) getSourceDonnees()).setConditionFiltre(str);
    }

    public void setConnexion(String str) {
        ((WDObjet) getSourceDonnees()).setConnexion(str);
    }

    public void setFiltreAvecBornes(WDObjet wDObjet) {
        ((WDObjet) getSourceDonnees()).setFiltreAvecBornes(wDObjet);
    }

    public void setNbRubrique(int i) {
        ((WDObjet) getSourceDonnees()).setNbRubrique(i);
    }

    public void setNbRubriqueCle(int i) {
        ((WDObjet) getSourceDonnees()).setNbRubriqueCle(i);
    }

    public void setNbRubriqueMemo(int i) {
        ((WDObjet) getSourceDonnees()).setNbRubriqueMemo(i);
    }

    public void setNom(String str) {
        ((WDObjet) getSourceDonnees()).setNom(str);
    }

    public final void setNomSource(String str) {
        this.f2020c = str;
        setValeur(new WDChaine(str));
    }

    public void setNullSupporte(boolean z) {
        ((WDObjet) getSourceDonnees()).setNullSupporte(z);
    }

    public void setRubriqueFiltree(String str) {
        ((WDObjet) getSourceDonnees()).setRubriqueFiltree(str);
    }

    public void setType(int i) {
        ((WDObjet) getSourceDonnees()).setType(i);
    }

    public void setValeur(WDObjet wDObjet) {
        String str = "";
        if (wDObjet.isSourceDonnees()) {
            C0776b sourceDonnees = ((C0776b) wDObjet).getSourceDonnees();
            this.f2021d = sourceDonnees instanceof C0778b;
            this.f2019b = sourceDonnees.getNomSourceDonnees();
        } else {
            str = wDObjet.getString();
            C0776b a = WDHF_Contexte.getInstance().m4991a(str, false);
            if (a != null) {
                this.f2019b = a.getNomSourceDonnees();
                this.f2021d = a instanceof C0778b;
            } else {
                this.f2020c = str;
                this.f2019b = null;
            }
        }
        if (this.f2019b != null) {
            this.f2019b = C0808l.m4057o(this.f2019b.toLowerCase());
        }
    }
}
