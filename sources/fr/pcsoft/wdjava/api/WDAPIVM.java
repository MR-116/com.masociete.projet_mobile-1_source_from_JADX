package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.p032m.C0938m;

public class WDAPIVM extends WDAPIVM_Commun {
    /* renamed from: z */
    private static final String[] f1233z = new String[]{m1682z(m1683z("\r}9\\_{l$FHfj$XXqh3PRmq1XP")), m1682z(m1683z("\r}9\\_{l$FQgk$F]qr.LNqq)T")), m1682z(m1683z("\r|$T]`|$FQgk$F]qr.LNqq)T"))};

    public static final void demandeMiseAJourIHM() {
        demandeMiseAJourIHM(new WDObjet[0]);
    }

    public static final void demandeMiseAJourIHM(WDObjet... wDObjetArr) {
        WDContexte a = C0677k.m2776a(f1233z[2], 4);
        try {
            C0938m.m6813b(null, wDObjetArr);
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet enModeArrierePlan() {
        return new WDBooleen(WDAppManager.m2580g());
    }

    public static WDBooleen enModeEmulateurAndroid() {
        return new WDBooleen(WDProjet.getInstance().isExecDansEmulateur());
    }

    public static WDBooleen enModeVGA() {
        return new WDBooleen(true);
    }

    public static final void executeMiseAJourIHM() {
        executeMiseAJourIHM(new WDObjet[0]);
    }

    public static final void executeMiseAJourIHM(WDObjet... wDObjetArr) {
        WDContexte a = C0677k.m2776a(f1233z[1], 4);
        try {
            C0938m.m6809a(null, wDObjetArr);
        } finally {
            a.m2735v();
        }
    }

    public static WDObjet executeThreadPrincipal(C0486m c0486m) {
        return executeThreadPrincipal(c0486m, new WDObjet[0]);
    }

    public static WDObjet executeThreadPrincipal(C0486m c0486m, WDObjet[] wDObjetArr) {
        WDContexte a = C0677k.m2775a(f1233z[0]);
        try {
            WDObjet a2 = C0938m.m6805a(c0486m, wDObjetArr);
            return a2;
        } finally {
            a.m2735v();
        }
    }

    /* renamed from: z */
    private static String m1682z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 46;
                    break;
                case 1:
                    i2 = 56;
                    break;
                case 2:
                    i2 = 97;
                    break;
                case 3:
                    i2 = 25;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1683z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 28);
        }
        return toCharArray;
    }
}
