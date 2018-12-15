package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0663e;
import fr.pcsoft.wdjava.core.p035c.C0666h;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.ui.champs.zml.WDZoneMultiligne;
import fr.pcsoft.wdjava.ui.utils.C1502a;

public class WDAPIZoneMultiligne {
    /* renamed from: a */
    protected static final int f1237a = 12;
    /* renamed from: z */
    private static final String[] f1238z = new String[]{m1691z(m1692z(" Q\b5\u0007BA\n,\fFT\t0\u001fMN")), m1691z(m1692z(" Q\b5\u0007P^\u0015)\nJF\u0000&\fL^\u0011")), m1691z(m1692z(" Q\b5\u0007JE\u0016<\nFT\t0\u001fMN")), m1691z(m1692z(" Q\b5\u0007Y^\u0015)\nJF\u0000")), m1691z(m1692z(" N\u0017+\u001dVY\u001a)\u0019PX\u0004>\u001d\\[\u0004+\u0019N"))};

    /* renamed from: a */
    private static final WDZoneMultiligne m1690a(WDObjet wDObjet, int i) {
        String[] strArr;
        try {
            return (WDZoneMultiligne) C1502a.m10417a(wDObjet, WDZoneMultiligne.class);
        } catch (C0666h e) {
            strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1238z[4], String.valueOf(i));
            strArr[1] = e.getMessage();
            WDErreurManager.m2886a(strArr);
            return null;
        } catch (C0663e e2) {
            strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1238z[4], String.valueOf(i));
            strArr[1] = e2.m2671a(1014);
            WDErreurManager.m2886a(strArr);
            return null;
        }
    }

    /* renamed from: z */
    private static String m1691z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 3;
                    break;
                case 1:
                    i2 = 11;
                    break;
                case 2:
                    i2 = 69;
                    break;
                case 3:
                    i2 = 121;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1692z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 88);
        }
        return toCharArray;
    }

    public static final WDEntier4 zmlAjouteLigne(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1238z[0], 12);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(m1690a(wDObjet, 1).ajouterLigneDynamique());
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final void zmlInsereLigne(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2776a(f1238z[2], 12);
        try {
            m1690a(wDObjet, 1).insererLigneDynamique(i);
        } finally {
            a.m2735v();
        }
    }

    public static final void zmlSupprime(WDObjet wDObjet) {
        zmlSupprime(wDObjet, -1);
    }

    public static final void zmlSupprime(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2776a(f1238z[3], 12);
        try {
            m1690a(wDObjet, 1).supprimerLigneDynamique(i);
        } finally {
            a.m2735v();
        }
    }

    public static final void zmlSupprimeTout(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1238z[1], 12);
        try {
            m1690a(wDObjet, 1).supprimerLignesDynamiques();
        } finally {
            a.m2735v();
        }
    }
}
