package fr.pcsoft.wdjava.core.poo;

import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0487y;
import fr.pcsoft.wdjava.core.utils.C0808l;

/* renamed from: fr.pcsoft.wdjava.core.poo.r */
public abstract class C0560r extends C0487y implements C0559b {
    /* renamed from: z */
    private static final String f1269z = C0560r.m1799z(C0560r.m1800z(".A,WUHP0PLC]*TSBQ0PAAG"));
    /* renamed from: a */
    private boolean f1270a = false;

    public C0560r() {
        if (WDAppelContexte.getContexte().m2723i()) {
            this.f1270a = true;
        }
    }

    /* renamed from: z */
    private static String m1799z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 13;
                    break;
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 99;
                    break;
                case 3:
                    i2 = 25;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1800z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 3);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo2435a(boolean z) {
        this.f1270a = z;
    }

    public WDObjet getClone() {
        return super.getClone();
    }

    public WDObjet getElement(String str) {
        return getElement(str, true);
    }

    public WDObjet getElement(String str, boolean z) {
        EWDPropriete[] k = mo2439k();
        String a = C0808l.m4016a(str, 20, 0);
        for (EWDPropriete eWDPropriete : k) {
            String nom = eWDPropriete.getNom();
            if (nom.length() == a.length() && a.equals(C0808l.m4016a(nom, 20, 0))) {
                return new C0739w(this, eWDPropriete);
            }
        }
        if (z) {
            WDErreurManager.m2883a(getMessageMauvaisePropriete(a));
        }
        return null;
    }

    public abstract String getNomType();

    public int getTypeVar() {
        return 111;
    }

    public int getTypeVarExt() {
        return mo2440l();
    }

    public boolean hasProperty(String str) {
        EWDPropriete propByName = EWDPropriete.getPropByName(str);
        if (propByName == null) {
            return false;
        }
        EWDPropriete[] k = mo2439k();
        for (EWDPropriete eWDPropriete : k) {
            if (eWDPropriete == propByName) {
                return true;
            }
        }
        return false;
    }

    public boolean isVariableInterne() {
        return this.f1270a;
    }

    /* renamed from: k */
    public abstract EWDPropriete[] mo2439k();

    /* renamed from: l */
    protected abstract int mo2440l();

    public void setValeur(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1269z, wDObjet.getNomType(), getNomType()));
    }
}
