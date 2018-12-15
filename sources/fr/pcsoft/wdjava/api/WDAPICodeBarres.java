package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.media.C0959u;
import fr.pcsoft.wdjava.media.WDCodeBarres;
import fr.pcsoft.wdjava.media.ib;

public class WDAPICodeBarres {
    /* renamed from: z */
    private static final String[] f1132z = new String[]{m1580z(m1581z("wM\t\n]\u0011M\u0004\u0011\\")), m1580z(m1581z("wM\t\nZ\u0015^\u001f\u0000K\u0011"))};

    public static WDCodeBarres cbCapture() {
        return cbCapture(0);
    }

    public static WDCodeBarres cbCapture(int i) {
        WDCodeBarres d;
        WDContexte a = C0677k.m2775a(f1132z[1]);
        try {
            d = C0959u.m6923d(i);
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            d = new WDCodeBarres();
        } finally {
            a.m2735v();
        }
        return d;
    }

    public static final WDObjet cbDecode(WDObjet wDObjet) {
        WDObjet a;
        WDContexte a2 = C0677k.m2775a(f1132z[0]);
        try {
            a = C0959u.m6919a(wDObjet);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
            a = new WDCodeBarres();
        } finally {
            a2.m2735v();
        }
        return a;
    }

    /* renamed from: z */
    private static String m1580z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 84;
                    break;
                case 1:
                    i2 = 14;
                    break;
                case 2:
                    i2 = 75;
                    break;
                case 3:
                    i2 = 85;
                    break;
                default:
                    i2 = 25;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1581z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 25);
        }
        return toCharArray;
    }
}
