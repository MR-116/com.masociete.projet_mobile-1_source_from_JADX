package fr.pcsoft.wdjava.core;

import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

public class WDVarNonAllouee extends C0550t {
    public static WDVarNonAllouee ref = new WDVarNonAllouee();
    /* renamed from: z */
    private static final String f1487z = m2271z(m2272z("Y\u0014a\u0018\b;\u0000l\u000f\u001e4\rn\u0015\u0005?\u0001l\u000b\u0013?\u0007"));

    private WDVarNonAllouee() {
    }

    /* renamed from: z */
    private static String m2271z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 122;
                    break;
                case 1:
                    i2 = 66;
                    break;
                case 2:
                    i2 = 32;
                    break;
                case 3:
                    i2 = 74;
                    break;
                default:
                    i2 = 65;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2272z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 65);
        }
        return toCharArray;
    }

    public WDObjet getRefProxy() {
        WDErreurManager.m2883a(C0745b.m3222b(f1487z, new String[0]));
        return null;
    }

    public void release() {
    }
}
