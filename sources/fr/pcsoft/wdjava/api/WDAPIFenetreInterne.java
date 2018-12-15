package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0663e;
import fr.pcsoft.wdjava.core.p035c.C0666h;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.fb;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.gb;
import fr.pcsoft.wdjava.ui.utils.C1502a;

public class WDAPIFenetreInterne {
    /* renamed from: a */
    protected static final int f1150a = 4;
    /* renamed from: z */
    private static final String[] f1151z = new String[]{m1616z(m1617z("xbY\u0017\u0012\u0012wD\r\u0001\u000bkC\u0001\n\u0012k^")), m1616z(m1617z("xbY\u0017\u0012\u0012wD\r\u0001\u000bvU\u000b\u001b\u001fa^\u001c")), m1616z(m1617z("xbY\u0017\u0012\u0012wD\r\u0001\u001abV\u0001\u001d\u0013a")), m1616z(m1617z("xbY\u0017\u0012\u0012wD\r\u0001\u001an_\u001d\n\u001e")), m1616z(m1617z("xbY\u0017\u0012\u0012wD\r\u0001\bq@\u0018\f\u0012iU")), m1616z(m1617z("xbY\u0017\u0012\u0012wD\r\u0001\bqY\u001e\u001f\u0015p")), m1616z(m1617z("xbY\u0017\u0012\u0012wD\r\u0001\u0014gS\u001d\f\ta^\u000b\u001b")), m1616z(m1617z("xbY\u0017\u0012\u0012wD\r\u0001\u0012jC\r\f\u001e")), m1616z(m1617z("xaB\u001a\u001b\u000evO\u0018\u001f\bwQ\u000f\u001b\u0004tQ\u001a\u001f\u0016")), m1616z(m1617z("xgX\t\u0010\u001caO\u000e\u001b\u0015aD\u001a\u001b\u0004w_\u001d\f\u0018a")), m1616z(m1617z("xbY\u0017\u0012\u0012wD\r\u0001\bq@\u0018\f\u0012iU\u0017\n\u0014qD"))};

    /* renamed from: a */
    private static final gb m1615a(WDObjet wDObjet, int i) {
        String[] strArr;
        fb fbVar = (fb) wDObjet.checkType(fb.class);
        if (fbVar != null) {
            wDObjet = fbVar.getChampFenetreInterne();
        }
        try {
            return (gb) C1502a.m10417a(wDObjet, gb.class);
        } catch (C0666h e) {
            strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1151z[8], String.valueOf(i));
            strArr[1] = e.getMessage();
            WDErreurManager.m2886a(strArr);
            return null;
        } catch (C0663e e2) {
            strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1151z[8], String.valueOf(i));
            strArr[1] = e2.m2671a(1018);
            WDErreurManager.m2886a(strArr);
            return null;
        }
    }

    public static void changeFenetreSource(WDObjet wDObjet, WDObjet wDObjet2) {
        changeFenetreSource(wDObjet, wDObjet2, null);
    }

    public static synchronized void changeFenetreSource(WDObjet wDObjet, WDObjet wDObjet2, WDObjet[] wDObjetArr) {
        synchronized (WDAPIFenetreInterne.class) {
            WDContexte a = C0677k.m2776a(f1151z[9], 4);
            try {
                m1615a(wDObjet, 1).setFenetreInterne(C1502a.m10418a(wDObjet2), wDObjetArr);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static void fiListeAffiche(WDObjet wDObjet) {
        fiListeAffiche(wDObjet, new WDChaine(C0607n.rq));
    }

    public static void fiListeAffiche(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2776a(f1151z[2], 4);
        try {
            m1615a(wDObjet, 1).majParcoursAuto(wDObjet2.getString());
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 fiListeAjoute(WDObjet wDObjet, WDObjet wDObjet2) {
        return fiListeAjoute(wDObjet, wDObjet2, new WDObjet[0]);
    }

    public static WDEntier4 fiListeAjoute(WDObjet wDObjet, WDObjet wDObjet2, WDObjet... wDObjetArr) {
        WDContexte a = C0677k.m2776a(f1151z[3], 4);
        try {
            int ajouterFenetreInterne = m1615a(wDObjet, 1).ajouterFenetreInterne(C1502a.m10418a(wDObjet2), wDObjetArr);
            WDEntier4 wDEntier4 = new WDEntier4(ajouterFenetreInterne >= 0 ? C0725i.m3069e(ajouterFenetreInterne) : 0);
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static void fiListeInsere(WDObjet wDObjet, int i, WDObjet wDObjet2) {
        fiListeInsere(wDObjet, i, wDObjet2, new WDObjet[0]);
    }

    public static void fiListeInsere(WDObjet wDObjet, int i, WDObjet wDObjet2, WDObjet... wDObjetArr) {
        WDContexte a = C0677k.m2776a(f1151z[7], 4);
        try {
            m1615a(wDObjet, 1).insererFenetreInterne(C1502a.m10418a(wDObjet2), C0725i.m3011a(i), wDObjetArr);
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 fiListeOccurrence(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1151z[6], 4);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(m1615a(wDObjet, 1).getNbFenetreInterne());
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 fiListePosition(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1151z[0], 4);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(C0725i.m3069e(m1615a(wDObjet, 1).getPositionFenetreInterne()));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static void fiListePosition(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2776a(f1151z[0], 4);
        try {
            m1615a(wDObjet, 1).setPositionFenetreInterne(C0725i.m3011a(i), false, false);
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen fiListePrecedent(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1151z[1], 4);
        try {
            WDBooleen wDBooleen = new WDBooleen(m1615a(wDObjet, 1).afficherFenetreInternePrecedente());
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen fiListeSuivant(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1151z[5], 4);
        try {
            WDBooleen wDBooleen = new WDBooleen(m1615a(wDObjet, 1).afficherFenetreInterneSuivante());
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen fiListeSupprime(WDObjet wDObjet) {
        return fiListeSupprime(wDObjet, -1);
    }

    public static WDBooleen fiListeSupprime(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2776a(f1151z[4], 4);
        try {
            WDBooleen wDBooleen = new WDBooleen(m1615a(wDObjet, 1).supprimerFenetreInterne(C0725i.m3011a(i)));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static void fiListeSupprimeTout(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1151z[10], 4);
        try {
            m1615a(wDObjet, 1).supprimerTout();
        } finally {
            a.m2735v();
        }
    }

    /* renamed from: z */
    private static String m1616z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 91;
                    break;
                case 1:
                    i2 = 36;
                    break;
                case 2:
                    i2 = 16;
                    break;
                case 3:
                    i2 = 72;
                    break;
                default:
                    i2 = 94;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1617z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 94);
        }
        return toCharArray;
    }
}
