package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.p063r.C1025a;

public class WDAPIToast {
    /* renamed from: z */
    private static final String f1231z = m1678z(m1679z("@\u0012\u0005c\u00027\u0019\u000bd\u0017*\u0005\u0002g"));

    public static final void toastAffiche(String str) {
        toastAffiche(str, 0, 2, 1);
    }

    public static final void toastAffiche(String str, int i) {
        toastAffiche(str, i, 2, 1);
    }

    public static final void toastAffiche(String str, int i, int i2) {
        toastAffiche(str, i, i2, 1);
    }

    public static final void toastAffiche(String str, int i, int i2, int i3) {
        WDContexte a = C0677k.m2775a(f1231z);
        try {
            C1025a.m7395a(str, i, i2, i3);
        } finally {
            a.m2735v();
        }
    }

    /* renamed from: z */
    private static String m1678z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 99;
                    break;
                case 1:
                    i2 = 70;
                    break;
                case 2:
                    i2 = 74;
                    break;
                case 3:
                    i2 = 34;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1679z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 81);
        }
        return toCharArray;
    }
}
