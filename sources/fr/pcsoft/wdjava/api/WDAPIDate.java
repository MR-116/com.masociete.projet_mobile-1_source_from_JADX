package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDDate;
import fr.pcsoft.wdjava.core.types.WDHeure;
import fr.pcsoft.wdjava.ui.dialogue.C1372f;

public class WDAPIDate extends WDAPIDate_Commun {
    /* renamed from: z */
    private static final String[] f1138z = new String[]{m1594z(m1595z("4\u0001!rR\u00167olR\n0ouE")), m1594z(m1595z("4\r%~eH\u001a!feT\u001d!r"))};

    public static final WDObjet dateSelecteur() {
        return dateSelecteur(new WDDate(), null);
    }

    public static final WDObjet dateSelecteur(WDObjet wDObjet) {
        return dateSelecteur(wDObjet, null);
    }

    public static final WDObjet dateSelecteur(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2775a(f1138z[1]);
        WDObjet wDObjet2 = true;
        try {
            wDObjet2 = new WDChaine(C1372f.m9828a().mo3746a(C0725i.m3043b(wDObjet, true, true), str));
            return wDObjet2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet heureSelecteur() {
        return heureSelecteur(new WDHeure(), true, null);
    }

    public static final WDObjet heureSelecteur(WDObjet wDObjet) {
        return heureSelecteur(wDObjet, true, null);
    }

    public static final WDObjet heureSelecteur(WDObjet wDObjet, boolean z) {
        return heureSelecteur(wDObjet, z, null);
    }

    public static final WDObjet heureSelecteur(WDObjet wDObjet, boolean z, String str) {
        WDContexte a = C0677k.m2775a(f1138z[0]);
        try {
            WDObjet wDChaine = new WDChaine(C1372f.m9828a().mo3747a(C0725i.m3020a(wDObjet, true), z, str));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    /* renamed from: z */
    private static String m1594z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 23;
                    break;
                case 1:
                    i2 = 73;
                    break;
                case 2:
                    i2 = 100;
                    break;
                case 3:
                    i2 = 42;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1595z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 32);
        }
        return toCharArray;
    }
}
