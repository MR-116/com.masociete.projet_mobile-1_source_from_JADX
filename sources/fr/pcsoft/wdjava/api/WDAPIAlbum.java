package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.media.ib;
import fr.pcsoft.wdjava.p037c.C0554c;
import fr.pcsoft.wdjava.p037c.C0555d;

public class WDAPIAlbum {
    /* renamed from: z */
    private static final String[] f1127z = new String[]{m1571z(m1572z("yLeTS\u0017RzSJ\u001fN}SS\b")), m1571z(m1572z("yLeTS\u0017RzWS\fH"))};

    public static final WDBooleen albumSauve(WDObjet wDObjet) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2780a(f1127z[1], true, false, C0657a.FROYO.getNumero());
        try {
            C0555d.m1777a(wDObjet);
            wDBooleen = new WDBooleen(true);
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final WDObjet albumSelecteur() {
        return albumSelecteur(1);
    }

    public static final WDObjet albumSelecteur(int i) {
        WDObjet wDChaine;
        WDContexte a = C0677k.m2775a(f1127z[0]);
        try {
            wDChaine = new WDChaine(C0554c.m1767a(i));
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDChaine = new WDChaine();
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static final WDObjet albumSelecteur(C0486m c0486m) {
        WDObjet wDBooleen;
        WDContexte a = C0677k.m2775a(f1127z[0]);
        try {
            C0554c.m1774a(1, c0486m);
            wDBooleen = new WDBooleen(true);
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDChaine();
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final WDBooleen albumSelecteur(int i, C0486m c0486m) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1127z[0]);
        try {
            C0554c.m1774a(i, c0486m);
            wDBooleen = new WDBooleen(true);
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    /* renamed from: z */
    private static String m1571z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 90;
                    break;
                case 1:
                    i2 = 13;
                    break;
                case 2:
                    i2 = 41;
                    break;
                case 3:
                    i2 = 22;
                    break;
                default:
                    i2 = 6;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1572z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 6);
        }
        return toCharArray;
    }
}
