package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.gc;

public class WDAPIMenu {
    /* renamed from: a */
    protected static final int f1218a = 12;
    /* renamed from: z */
    private static final String f1219z = m1654z(m1655z("m}&)+\u000bm>:7\u001bm#-0\u0000q:/8\u0002"));

    public static final void ouvreMenuContextuel() {
        C0489p o = WDAppelContexte.getContexte().m2728o();
        if (o instanceof gc) {
            ((gc) o).showContextMenu();
        }
    }

    public static final void ouvreMenuPrincipal() {
        WDContexte a = C0677k.m2776a(f1219z, 12);
        try {
            WDFenetre wDFenetre = (WDFenetre) WDAppelContexte.getContexte().m2722h();
            if (wDFenetre != null) {
                wDFenetre.ouvrirMenuPrincipal();
            }
            a.m2735v();
        } catch (Throwable th) {
            a.m2735v();
        }
    }

    /* renamed from: z */
    private static String m1654z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 78;
                    break;
                case 1:
                    i2 = 50;
                    break;
                case 2:
                    i2 = 115;
                    break;
                case 3:
                    i2 = C0607n.bx;
                    break;
                default:
                    i2 = 121;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1655z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 121);
        }
        return toCharArray;
    }
}
