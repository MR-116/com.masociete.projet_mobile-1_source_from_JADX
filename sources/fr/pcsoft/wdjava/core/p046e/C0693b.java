package fr.pcsoft.wdjava.core.p046e;

import fr.pcsoft.wdjava.core.application.C0638a;
import fr.pcsoft.wdjava.core.application.C0651k;

/* renamed from: fr.pcsoft.wdjava.core.e.b */
public final class C0693b {
    /* renamed from: z */
    private static final String[] f1755z = new String[]{C0693b.m2868z(C0693b.m2869z("LIx\b4ZB")), C0693b.m2868z(C0693b.m2869z("KDa\u00165\u0007_}\u00173LC")), C0693b.m2868z(C0693b.m2869z("DPb\u0015#\u0007_}\u00173LC")), C0693b.m2868z(C0693b.m2869z("DXf\u0015#\u0007_}\u00173LC")), C0693b.m2868z(C0693b.m2869z("\ttp\n#LB{")), C0693b.m2868z(C0693b.m2869z("[T~\u0013\"@^fT?\\\\j\u001f#"))};

    /* renamed from: a */
    public static String m2867a() {
        String str = C0651k.m2644a(C0638a.BUILD, f1755z[2], "0") + '.' + C0651k.m2644a(C0638a.BUILD, f1755z[3], "0") + '.' + C0651k.m2644a(C0638a.BUILD, f1755z[1], "0") + '.' + C0651k.m2644a(C0638a.BUILD, f1755z[5], "0");
        return C0651k.m2646a(C0638a.BUILD, f1755z[0], false) ? str + f1755z[4] : str;
    }

    /* renamed from: z */
    private static String m2868z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 41;
                    break;
                case 1:
                    i2 = 49;
                    break;
                case 2:
                    i2 = 8;
                    break;
                case 3:
                    i2 = 122;
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
    private static char[] m2869z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 81);
        }
        return toCharArray;
    }
}
