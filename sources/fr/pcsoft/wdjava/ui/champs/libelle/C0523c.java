package fr.pcsoft.wdjava.ui.champs.libelle;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.cb;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.table.colonne.C1278a;
import fr.pcsoft.wdjava.ui.p083l.C1443c;
import fr.pcsoft.wdjava.ui.p083l.C1449i;
import fr.pcsoft.wdjava.ui.p083l.C1453n;
import fr.pcsoft.wdjava.ui.p083l.nb;

/* renamed from: fr.pcsoft.wdjava.ui.champs.libelle.c */
public abstract class C0523c extends gc implements C0515x {
    private static final String[] Fc = new String[]{C0523c.m1468z(C0523c.m1469z("f\u0000\\F\u0005 \rOO\u001b2B")), C0523c.m1468z(C0523c.m1469z("E\u000eT@\u001f*\u000eX"))};
    protected nb Ac = new C1453n();
    protected boolean Bc = false;
    private String Cc = "";
    protected WDObjet Dc = new WDChaine("");
    protected String Ec = "";
    protected WDEntier4 xc = new WDEntier4(0);
    private String yc = null;
    private String zc = "";

    protected C0523c() {
    }

    protected C0523c(C1278a c1278a) {
        super(c1278a);
    }

    /* renamed from: a */
    private final String m1467a(String str) {
        StringBuffer stringBuffer = new StringBuffer(str.length());
        C0808l.m4009a(str, stringBuffer);
        String stringBuffer2 = stringBuffer.toString();
        switch (this.xc.getInt()) {
            case 0:
                C1453n c1453n = (C1453n) this.Ac;
                stringBuffer2 = c1453n.mo3782a(this, stringBuffer2, 0, stringBuffer2.length(), true, false, null);
                return (!stringBuffer2.equals(Fc[0]) && c1453n.m10248d(stringBuffer2) && c1453n.m10246c(stringBuffer2)) ? stringBuffer2 : "";
            case 1:
            case 4:
            case 7:
                return ((C1443c) this.Ac).m10134e(stringBuffer2);
            case 2:
            case 3:
                return ((C1449i) this.Ac).m10185a(stringBuffer2, true, null);
            default:
                return stringBuffer2;
        }
    }

    /* renamed from: z */
    private static String m1468z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 102;
                    break;
                case 1:
                    i2 = 66;
                    break;
                case 2:
                    i2 = 29;
                    break;
                case 3:
                    i2 = 2;
                    break;
                default:
                    i2 = 90;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1469z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 90);
        }
        return toCharArray;
    }

    public boolean estAvecMasqueDeSaisieTexte() {
        return this.Dc.getInt() == 0;
    }

    public int getDebutSelection() {
        return -1;
    }

    public int getFinSelection() {
        return -1;
    }

    public WDChaine getFormatMemorise() {
        return new WDChaine(this.Cc);
    }

    public WDChaine getLibelle() {
        return new WDChaine(this.zc);
    }

    public WDObjet getMasqueSaisie() {
        return this.Dc;
    }

    public String getNomType() {
        return C0745b.m3220a(Fc[1], new String[0]);
    }

    public WDEntier4 getTypeSaisie() {
        return this.xc;
    }

    public WDObjet getValeur() {
        return getLibelle();
    }

    public cb getValeurAffichee() {
        return new WDChaine(this.Ec);
    }

    public WDObjet getValeurInitiale() {
        return new WDChaine(this.yc);
    }

    public boolean isChampFocusable() {
        return false;
    }

    public boolean isFinSaisieAutomatique() {
        return false;
    }

    public boolean isLibelle() {
        return true;
    }

    public boolean isMiseABlancSiZero() {
        return false;
    }

    public void modifValeurInterne(String str) {
        this.zc = str;
    }

    public void raz(boolean z) {
        if (this.yc != null) {
            setValeur(this.yc);
        }
    }

    public void release() {
        super.release();
        this.zc = null;
        this.Ec = null;
        this.yc = null;
        if (this.Ac != null) {
            this.Ac.mo3785c();
            this.Ac = null;
        }
        this.xc = null;
        this.Dc = null;
        this.Cc = null;
    }

    public void selectionnerTout() {
    }

    public void setFormatMemorise(String str) {
        if (this.Ac != null && (this.Ac instanceof C1449i)) {
            this.Cc = str;
            ((C1449i) this.Ac).m10193d(str);
        }
    }

    public void setLibelle(String str) {
        if (this.yc == null) {
            this.yc = str;
        }
        this.zc = str;
        this.Ec = m1467a(this.zc);
    }

    public void setMasqueSaisie(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        this.Dc.setValeur(valeur);
        switch (this.xc.getInt()) {
            case 0:
                int i = valeur.getInt();
                if (valeur.opEgal(i)) {
                    ((C1453n) this.Ac).m10241a(i);
                    return;
                } else {
                    ((C1453n) this.Ac).mo3783a(valeur.getString());
                    return;
                }
            case 1:
            case 2:
            case 3:
            case 4:
            case 7:
                this.Ac.mo3783a(valeur.getString());
                return;
            default:
                return;
        }
    }

    public void setTypeSaisie(int i) {
        if (isFenetreCree() && this.Ac != null) {
            this.Ac.mo3785c();
        }
        if (i >= 0) {
            this.xc.setValeur(i);
            switch (i) {
                case 0:
                    if (isFenetreCree()) {
                        this.Ac = new C1453n();
                        break;
                    }
                    break;
                case 1:
                    this.Ac = new C1443c(this, false);
                    break;
                case 2:
                    this.Ac = new C1449i(this, true);
                    break;
                case 3:
                    this.Ac = new C1449i(this, false);
                    break;
                case 4:
                case 7:
                    this.Ac = new C1443c(this, true);
                    break;
            }
            this.xc.setValeur(i);
        }
    }

    public void setValeur(WDObjet wDObjet) {
        setValeur(wDObjet.getString());
    }

    public void setValeur(String str) {
        setLibelle(str);
    }

    public void setValeurInitiale(WDObjet wDObjet) {
        setValeurInitiale(wDObjet.getString());
    }

    public void setValeurInitiale(String str) {
        this.yc = str;
        setLibelle(this.yc);
    }
}
