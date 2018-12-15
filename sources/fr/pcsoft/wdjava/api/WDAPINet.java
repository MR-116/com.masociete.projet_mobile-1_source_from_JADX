package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.types.C0548s;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.net.C0973d;
import fr.pcsoft.wdjava.net.C1011t;

public class WDAPINet extends WDAPINet_Commun {
    /* renamed from: z */
    private static final String[] f1220z = new String[]{m1656z(m1657z("$?j>WU8a>MD9j$WD\"a")), m1656z(m1657z("$8a>MF2v/AT3{'SD")), m1656z(m1657z("$8a>MK?w>WX7`8WT%a5[W")), m1656z(m1657z("$8a>MF2v/AT3{#B"))};

    public static final WDBooleen internetConnecte() {
        WDContexte a = C0677k.m2778a(f1220z[0], false);
        try {
            WDBooleen wDBooleen = new WDBooleen(C0973d.m7031a());
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen internetConnecte(C0486m c0486m) {
        WDContexte a = C0677k.m2778a(f1220z[0], false);
        try {
            WDBooleen wDBooleen = new WDBooleen(C0973d.m7032a(c0486m));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDObjet netAdresseIP() {
        return netAdresseIP("", 0);
    }

    public static WDObjet netAdresseIP(WDObjet wDObjet) {
        return wDObjet.checkType(C0548s.class) != null ? netAdresseIP("", wDObjet.getInt()) : netAdresseIP(wDObjet.getString(), 0);
    }

    public static WDObjet netAdresseIP(String str, int i) {
        WDObjet wDChaine;
        WDContexte a = C0677k.m2775a(f1220z[3]);
        try {
            if (C0808l.m4053k(str)) {
                wDChaine = new WDChaine(C0973d.m7030a(Math.max(0, i), 1));
                a.m2735v();
            } else {
                wDChaine = new WDChaine("");
            }
        } catch (C1011t e) {
            wDChaine = new WDChaine("");
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static WDObjet netAdresseMac() {
        return netAdresseMac(0);
    }

    public static WDObjet netAdresseMac(int i) {
        WDObjet wDChaine;
        WDContexte a = C0677k.m2775a(f1220z[1]);
        try {
            wDChaine = new WDChaine(C0973d.m7029a(Math.max(0, i)));
        } catch (C1011t e) {
            wDChaine = new WDChaine("");
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static WDObjet netListeAdresseIP() {
        return netListeAdresseIP("", 3);
    }

    public static WDObjet netListeAdresseIP(WDObjet wDObjet) {
        return wDObjet.checkType(C0548s.class) != null ? netListeAdresseIP("", wDObjet.getInt()) : netListeAdresseIP(wDObjet.getString(), 3);
    }

    public static WDObjet netListeAdresseIP(String str, int i) {
        WDObjet wDChaine;
        WDContexte a = C0677k.m2775a(f1220z[2]);
        try {
            if (C0808l.m4053k(str)) {
                wDChaine = new WDChaine(C0973d.m7030a(-1, i));
                a.m2735v();
            } else {
                wDChaine = new WDChaine("");
            }
        } catch (C1011t e) {
            wDChaine = new WDChaine("");
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    /* renamed from: z */
    private static String m1656z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 7;
                    break;
                case 1:
                    i2 = 118;
                    break;
                case 2:
                    i2 = 36;
                    break;
                case 3:
                    i2 = 106;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1657z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 18);
        }
        return toCharArray;
    }
}
