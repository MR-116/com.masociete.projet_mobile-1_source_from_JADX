package fr.pcsoft.wdjava.core.types.collection;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0487y;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;

/* renamed from: fr.pcsoft.wdjava.core.types.collection.e */
public abstract class C0583e extends C0487y implements C0582d {
    /* renamed from: z */
    private static final String[] f1364z = new String[]{C0583e.m2036z(C0583e.m2037z("F7 u4&\"'g8*89z<595`8':#")), C0583e.m2036z(C0583e.m2037z("F /w4")), C0583e.m2036z(C0583e.m2037z("F34a.,8\"z2 )5|$6)#4(3(g.W")), C0583e.m2036z(C0583e.m2037z("F34a.,8\"z2 )5|$6)#4(3(g")), C0583e.m2036z(C0583e.m2037z(",\u001b\u0016\\\u0002\u0016\u001f\u0004_\u0014E\u0012\u0003\u0013\u0012\u0017\u0003AQ\u0010\u0018F]\u001e\u0010\u0000\u0003_Q\u001a^\u0014\u000b\u0002FE\u0018\u0001\u0013FW\u0014E\u001a\u0007\u0013\u0012\n\u001a\nV\u0012\u0011\u001f\t]_"))};

    /* renamed from: z */
    private static String m2036z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 101;
                    break;
                case 1:
                    i2 = 118;
                    break;
                case 2:
                    i2 = 102;
                    break;
                case 3:
                    i2 = 51;
                    break;
                default:
                    i2 = 113;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2037z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 113);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo2464a(WDObjet... wDObjetArr) {
        int h = (int) (mo2483h() + 1);
        mo2466a(C0611a.m2308b(h), wDObjetArr);
        return h;
    }

    /* renamed from: a */
    public void mo2465a(WDObjet wDObjet) {
        mo2478c(wDObjet);
    }

    /* renamed from: a */
    public void mo2466a(WDObjet wDObjet, WDObjet... wDObjetArr) {
        try {
            WDObjet wDObjet2 = wDObjetArr.length > 0 ? wDObjetArr[0] : null;
            if (wDObjet2 == null) {
                try {
                    wDObjet2 = (WDObjet) mo2482g().newInstance();
                } catch (Exception e) {
                    C0691a.m2857a(f1364z[4], e);
                    return;
                }
            }
            mo2474a(wDObjet2, wDObjet);
        } catch (Exception e2) {
            throw e2;
        }
    }

    public WDObjet get(int i) {
        if (i < 0) {
            WDErreurManager.m2883a(C0745b.m3222b(f1364z[3], new String[0]));
        }
        WDObjet a = mo2469a((long) C0725i.m3011a(i));
        if (a == null) {
            WDErreurManager.m2883a(C0745b.m3222b(f1364z[2], String.valueOf(i), String.valueOf(mo2483h())));
        }
        return a;
    }

    public WDObjet get(WDObjet wDObjet) {
        return wDObjet.isNumerique() ? get(wDObjet.getInt()) : get(wDObjet.getString());
    }

    public WDObjet getElement(String str) {
        return getElement(str, true);
    }

    public WDObjet getElement(String str, boolean z) {
        return mo2470a(str, z);
    }

    public WDChaine getNom() {
        return new WDChaine("");
    }

    public String getNomType() {
        return C0745b.m3220a(f1364z[1], new String[0]);
    }

    public WDEntier4 getOccurrence() {
        return new WDEntier4(mo2483h());
    }

    public int getTypeVar() {
        return 109;
    }

    public WDObjet getValeur() {
        return this;
    }

    public WDBooleen getVide() {
        return new WDBooleen(mo2483h() == 0);
    }

    public boolean isEvaluable() {
        return false;
    }

    public void setValeur(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1364z[0], new String[0]));
    }
}
