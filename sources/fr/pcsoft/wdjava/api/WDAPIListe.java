package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.ui.champs.combo.C1143b;

public class WDAPIListe extends WDAPIListe_Commun {
    /* renamed from: z */
    private static final String f1214z = m1647z(m1648z("LD\u00178Q X\u0017 E=B"));

    public static synchronized void comboOuvre(WDObjet wDObjet) {
        synchronized (WDAPIListe.class) {
            WDContexte a = C0677k.m2776a(f1214z, 12);
            try {
                ((C1143b) WDAPIListe_Commun.m1644a(wDObjet, 1, true, C1143b.class)).deroule();
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    /* renamed from: z */
    private static String m1647z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 111;
                    break;
                case 1:
                    i2 = 7;
                    break;
                case 2:
                    i2 = 88;
                    break;
                case 3:
                    i2 = 117;
                    break;
                default:
                    i2 = 19;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1648z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 19);
        }
        return toCharArray;
    }
}
