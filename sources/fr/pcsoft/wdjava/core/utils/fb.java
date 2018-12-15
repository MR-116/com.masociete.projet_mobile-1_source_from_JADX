package fr.pcsoft.wdjava.core.utils;

import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

public abstract class fb<T> extends eb<T> {
    /* renamed from: z */
    private static final String[] f2057z = new String[]{m3886z(m3887z("#ë\u0018XI\u0013k\u0003S\n\u0003%\u0019S\n\u0003ë\u001c\\Y\u0014g\u0001XD\u0013\"\u0001ÔG\bk\u001eX\u0006Gf^F\u0002l\u000fXG\u0002l\u0018\u001dN\u0012\"\u001e\\G\u0006q\u001fX\u0007\nk\tI^\u0002qB")), m3886z(m3887z("DR hy8F)bg\"O#tx\""))};

    /* renamed from: z */
    private static String m3886z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 103;
                    break;
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 108;
                    break;
                case 3:
                    i2 = 61;
                    break;
                default:
                    i2 = 42;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3887z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 42);
        }
        return toCharArray;
    }

    /* renamed from: b */
    protected void mo3346b() {
        super.run();
    }

    public void run() {
        try {
            super.run();
        } catch (OutOfMemoryError e) {
            WDProjet.getInstance().notifSaturationMemoire();
            C0691a.m2856a(f2057z[0]);
            System.gc();
            try {
                mo3346b();
            } catch (OutOfMemoryError e2) {
                WDErreurManager.m2883a(C0745b.m3222b(f2057z[1], new String[0]));
            }
        }
    }
}
