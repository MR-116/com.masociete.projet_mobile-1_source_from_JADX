package fr.pcsoft.wdjava.core.context;

import fr.pcsoft.wdjava.core.C0550t;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

/* renamed from: fr.pcsoft.wdjava.core.context.i */
final class C0675i extends C0550t {
    /* renamed from: z */
    private static final String f1693z = C0675i.m2773z(C0675i.m2774z("n\u0015&Ld\u0003\u0011,[p\u000e\u001c6Pt\u0003\u000b0@d\u001f\u0007"));

    C0675i() {
    }

    /* renamed from: z */
    private static String m2773z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 77;
                    break;
                case 1:
                    i2 = 84;
                    break;
                case 2:
                    i2 = 115;
                    break;
                case 3:
                    i2 = 15;
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
    private static char[] m2774z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 49);
        }
        return toCharArray;
    }

    public WDObjet getRefProxy() {
        WDErreurManager.m2883a(C0745b.m3222b(f1693z, new String[0]));
        return null;
    }

    public void release() {
    }
}
