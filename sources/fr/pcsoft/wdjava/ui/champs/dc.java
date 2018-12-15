package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.p047f.C0712l;
import fr.pcsoft.wdjava.core.p047f.C0713b;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.database.hf.bb;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.saisie.C0518k;

public abstract class dc extends C0489p {
    /* renamed from: d */
    public static final String f964d = m1481z(m1482z("O+zL~L0dX~W0"));
    /* renamed from: z */
    private static final String f965z = m1481z(m1482z(";.qYxQ-pY"));
    /* renamed from: e */
    private C0712l f966e = null;
    /* renamed from: f */
    protected EWDPropriete f967f = null;
    /* renamed from: g */
    protected int f968g = 0;
    /* renamed from: h */
    private String f969h = "";
    /* renamed from: i */
    protected gc f970i = null;
    /* renamed from: j */
    private WDObjet f971j = null;

    /* renamed from: z */
    private static String m1481z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 24;
                    break;
                case 1:
                    i2 = 111;
                    break;
                case 2:
                    i2 = 37;
                    break;
                case 3:
                    i2 = 13;
                    break;
                default:
                    i2 = 42;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1482z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 42);
        }
        return toCharArray;
    }

    protected abstract WDObjet _getValeur();

    protected abstract void _setValeur(WDObjet wDObjet);

    public void affecterValeurChampAssocie(gc gcVar, WDObjet wDObjet) {
        if (gcVar == null) {
            return;
        }
        if (wDObjet != null) {
            gcVar.affecterPropriete(getProprieteAssocie(), wDObjet);
        } else if (getValeurDefautAttribut() != null) {
            gcVar.affecterPropriete(getProprieteAssocie(), getValeurDefautAttribut());
        } else {
            gcVar.affecterPropriete(getProprieteAssocie(), new WDChaine());
        }
    }

    public final gc getChampAssocie() {
        return this.f970i;
    }

    public WDObjet getClone() {
        return getValeur().getClone();
    }

    public final int getIndiceAttribut() {
        return this.f968g;
    }

    public C0712l getLiaisonDataBinding() {
        return this.f966e;
    }

    public String getName() {
        return this.f969h;
    }

    public String getNomType() {
        return C0745b.m3220a(f965z, new String[0]);
    }

    public WDChaine getPropLiaisonFichier() {
        return this.f966e == null ? new WDChaine() : new WDChaine(this.f966e.mo2604d());
    }

    public final EWDPropriete getProprieteAssocie() {
        return this.f967f;
    }

    public WDObjet getValeur() {
        return _getValeur();
    }

    public WDObjet getValeurDefautAttribut() {
        if (this.f971j == null) {
            this.f971j = this.f970i != null ? this.f970i.getValeurPropriete(this.f967f) : new WDChaine();
        }
        return this.f971j;
    }

    public boolean isAttributAuto() {
        return getName().startsWith(f964d);
    }

    public final boolean isTriNumerique() {
        gc champAssocie = getChampAssocie();
        if (!(champAssocie == null || champAssocie.checkType(C0518k.class) == null)) {
            int i = champAssocie.getTypeSaisie().getInt();
            if (i == 4 || i == 1 || i == 7) {
                return true;
            }
        }
        return false;
    }

    public abstract void notifModifChamp();

    public void release() {
        super.release();
        if (this.f966e != null) {
            this.f966e.mo2601b();
            this.f966e = null;
        }
        this.f970i = null;
        this.f971j = null;
        this.f969h = null;
    }

    public void setChampAssocie(gc gcVar) {
        this.f970i = gcVar;
        if (this.f970i != null) {
            this.f970i.associerAttribut(this);
        }
    }

    public void setIndiceAttribut(int i) {
        this.f968g = i;
    }

    public void setLiaisonDataBinding(C0712l c0712l) {
        this.f966e = c0712l;
    }

    protected void setLiaisonFichier(String str, String str2) {
        this.f966e = ((bb) WDAppelContexte.m2679a(bb.class)).mo3081a(str, str2);
    }

    protected void setLiaisonFichier(String str, String str2, String str3, String str4, String str5) {
        this.f966e = ((bb) WDAppelContexte.m2679a(bb.class)).mo3082a(str, str2, str3, str4, str5);
    }

    protected void setLiaisonFichier(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f966e = ((bb) WDAppelContexte.m2679a(bb.class)).mo3083a(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public void setLiaisonVariable(String str) {
        this.f966e = new C0713b(str);
    }

    public void setNom(String str) {
        this.f969h = str;
    }

    public void setPropLiaisonFichier(String str) {
        this.f966e = ((bb) WDAppelContexte.m2679a(bb.class)).mo3080a(str);
    }

    public void setProprieteAssocie(EWDPropriete eWDPropriete) {
        this.f967f = eWDPropriete;
    }

    public void setValeur(WDObjet wDObjet) {
        _setValeur(wDObjet);
    }

    public void setValeurDefautAttribut(WDObjet wDObjet) {
        this.f971j = wDObjet;
    }
}
