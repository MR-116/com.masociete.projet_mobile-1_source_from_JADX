package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.types.C0782g;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.p041h.C0920c;
import fr.pcsoft.wdjava.p041h.C0921d;

public class WDAPITimer {
    /* renamed from: z */
    private static final String[] f1230z = new String[]{m1676z(m1677z(".d\u0002nt_o\u0018zb")), m1676z(m1677z(".v\u0002mnYy\u0006fcRc\u0012p"))};

    public static void finTimerSys() {
        finTimerSys(C0921d.m6548b());
    }

    public static void finTimerSys(int i) {
        WDContexte a = C0677k.m2775a(f1230z[1]);
        try {
            C0921d.m6545a(i);
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 timerSys() {
        return new WDEntier4(C0921d.m6548b());
    }

    public static WDEntier4 timerSys(C0486m c0486m, WDObjet wDObjet) {
        return timerSys(c0486m, wDObjet, C0921d.m6544a());
    }

    public static WDEntier4 timerSys(C0486m c0486m, WDObjet wDObjet, long j) {
        WDContexte a = C0677k.m2775a(f1230z[0]);
        try {
            C0920c a2 = C0921d.m6547a(c0486m, C0725i.m3013a(wDObjet, C0782g.CENTISECOND) * 10, j, true, Integer.MAX_VALUE);
            WDEntier4 wDEntier4 = new WDEntier4(a2 != null ? a2.m6539e() : 0);
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    /* renamed from: z */
    private static String m1676z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 13;
                    break;
                case 1:
                    i2 = 48;
                    break;
                case 2:
                    i2 = 75;
                    break;
                case 3:
                    i2 = 35;
                    break;
                default:
                    i2 = 49;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1677z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 49);
        }
        return toCharArray;
    }
}
