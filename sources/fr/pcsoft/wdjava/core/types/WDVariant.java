package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.api.WDAPIVariant;
import fr.pcsoft.wdjava.core.C0723g;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.allocation.C0613b;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.poo.C0729v;
import fr.pcsoft.wdjava.core.poo.C0733z;
import fr.pcsoft.wdjava.core.poo.C0735q;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.collection.C0582d;
import fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple;
import fr.pcsoft.wdjava.core.utils.C0812p;

@C0723g(a = {WDAPIVariant.class})
public class WDVariant extends C0487y {
    public static final C0613b<WDVariant> CREATOR = new C0781f();
    /* renamed from: z */
    private static final String[] f1940z = new String[]{m3261z(m3262z("oWFiZ\u001aSFrD\u0002FKkD\u001fM[yO\tF")), m3261z(m3262z("oBFtU\u001e[Qo@\u0013^QxQ\u0019@QdV\tGX~"))};
    /* renamed from: a */
    private WDObjet f1941a;

    public WDVariant() {
        this.f1941a = null;
    }

    public WDVariant(WDObjet wDObjet) {
        setValeur(wDObjet);
    }

    /* renamed from: a */
    private final void m3260a(int i, WDObjet wDObjet) {
        if (wDObjet == null || !wDObjet.isAllloue() || wDObjet.isValeurNull()) {
            this.f1941a = null;
            return;
        }
        switch (i) {
            case 2:
                C0729v c0729v = (C0729v) wDObjet.checkType(C0729v.class);
                if (c0729v != null) {
                    this.f1941a = c0729v.creerInstanceNonAllouee();
                    this.f1941a.opPriseReference(c0729v);
                    return;
                }
                C0582d c0582d = (C0582d) wDObjet.checkType(C0582d.class);
                if (c0582d != null) {
                    this.f1941a = (WDObjet) c0582d;
                    return;
                }
                break;
        }
        WDVariant wDVariant = (WDVariant) wDObjet.checkType(WDVariant.class);
        if (wDVariant != null) {
            this.f1941a = wDVariant.f1941a != null ? wDVariant.f1941a.getClone() : null;
            return;
        }
        if (!wDObjet.isVariableInterne()) {
            wDObjet = wDObjet.getClone();
        }
        this.f1941a = wDObjet;
    }

    /* renamed from: z */
    private static String m3261z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 76;
                    break;
                case 1:
                    i2 = 18;
                    break;
                case 2:
                    i2 = 20;
                    break;
                case 3:
                    i2 = 59;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3262z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 5);
        }
        return toCharArray;
    }

    public WDObjet get(int i) {
        if (this.f1941a == null) {
            WDObjet wDTableauSimple = new WDTableauSimple(0, new int[]{0}, 0, 31);
            wDTableauSimple.m3431a(true);
            this.f1941a = wDTableauSimple;
        }
        return this.f1941a.get(i);
    }

    public WDObjet get(WDObjet wDObjet) {
        C0548s c0548s = (C0548s) wDObjet.checkType(C0548s.class);
        return c0548s != null ? get(c0548s.getInt()) : getElement(wDObjet.getString());
    }

    public WDObjet getClasse() {
        String str = "";
        Object obj = this.f1941a != null ? (C0733z) this.f1941a.checkType(C0733z.class) : null;
        return new WDChaine(obj != null ? C0735q.m3117a(obj) : str);
    }

    public WDObjet getClone() {
        return new WDVariant(this.f1941a != null ? this.f1941a.getClone() : null);
    }

    public WDObjet getElement(String str) {
        return getElement(str, true);
    }

    public WDObjet getElement(String str, boolean z) {
        if (this.f1941a == null) {
            this.f1941a = new bb();
        } else if (!(this.f1941a instanceof bb)) {
            if (str.equalsIgnoreCase(EWDPropriete.PROP_OCCURRENCE.getNom())) {
                return getOccurrence();
            }
            if (str.equalsIgnoreCase(EWDPropriete.PROP_CLASSE.getNom())) {
                return getClasse();
            }
            if (str.equalsIgnoreCase(EWDPropriete.PROP_MEMBRE.getNom())) {
                return getMembre();
            }
            if (str.equalsIgnoreCase(EWDPropriete.PROP_EXISTE.getNom())) {
                return new WDBooleen(true);
            }
            if (str.equalsIgnoreCase(EWDPropriete.PROP_TYPE.getNom())) {
                return getType();
            }
            if (z) {
                WDErreurManager.m2883a(C0745b.m3222b(f1940z[0], new String[0]));
            }
            return null;
        }
        return ((bb) this.f1941a).getElement(str);
    }

    public Object getJSONValue() {
        return this.f1941a != null ? this.f1941a.getJSONValue() : C0812p.f2142a;
    }

    public WDObjet getMembre() {
        if (this.f1941a == null) {
            this.f1941a = new bb();
        } else if (!(this.f1941a instanceof bb)) {
            WDErreurManager.m2883a(C0745b.m3222b(f1940z[0], new String[0]));
        }
        return new ab((bb) this.f1941a);
    }

    public String getNomType() {
        return getValeur().getNomType();
    }

    public WDEntier4 getOccurrence() {
        C0582d c0582d = this.f1941a != null ? (C0582d) this.f1941a.checkType(C0582d.class) : null;
        return new WDEntier4(c0582d != null ? (int) c0582d.mo2483h() : 0);
    }

    public WDObjet getType() {
        return this.f1941a != null ? new WDEntier4(this.f1941a.getTypeVar()) : new WDEntier4(0);
    }

    public int getTypeVar() {
        return 31;
    }

    public WDObjet getValeur() {
        return this.f1941a != null ? this.f1941a : WDObjet.NULL;
    }

    public boolean isEvaluable() {
        return true;
    }

    public boolean isNull() {
        return this.f1941a == null;
    }

    public void opCopie(WDObjet wDObjet) {
        m3260a(3, wDObjet);
    }

    public void opPriseReference(WDObjet wDObjet) {
        m3260a(2, wDObjet);
    }

    public void razVariable() {
        setValeur(WDObjet.NULL);
    }

    public void release() {
        if (this.f1941a != null) {
            this.f1941a = null;
        }
    }

    public void setClasse(String str) {
        WDErreurManager.m2883a(C0745b.m3222b(f1940z[1], EWDPropriete.PROP_CLASSE.toString()));
    }

    public void setMembre(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1940z[1], EWDPropriete.PROP_MEMBRE.toString()));
    }

    public void setValeur(double d) {
        m3260a(1, C0611a.m2304a(d));
    }

    public void setValeur(int i) {
        m3260a(1, C0611a.m2308b(i));
    }

    public void setValeur(long j) {
        m3260a(1, C0611a.m2303a(j));
    }

    public void setValeur(WDObjet wDObjet) {
        m3260a(1, wDObjet);
    }

    public void setValeur(String str) {
        m3260a(1, C0611a.m2300a(str));
    }

    public void setValeur(boolean z) {
        m3260a(1, C0611a.m2298a(z));
    }

    public void setValeur(byte[] bArr) {
        m3260a(1, C0611a.m2299a(bArr));
    }
}
