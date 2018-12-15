package fr.pcsoft.wdjava.core.erreur.report;

import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

/* renamed from: fr.pcsoft.wdjava.core.erreur.report.f */
public enum C0702f {
    ERROR,
    SCREENSHOT,
    APPLICATION,
    DEVICE,
    SYSTEM;
    
    /* renamed from: z */
    private static final String[] f1801z = null;

    /* renamed from: z */
    private static String m2927z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 36;
                    break;
                case 1:
                    i2 = 31;
                    break;
                case 2:
                    i2 = 68;
                    break;
                case 3:
                    i2 = 122;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2928z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 31);
        }
        return toCharArray;
    }

    public final String getName() {
        switch (C0707l.f1817a[ordinal()]) {
            case 1:
                return C0745b.m3224c(f1801z[0], new String[0]);
            case 2:
                return C0745b.m3224c(f1801z[1], new String[0]);
            case 3:
                return C0745b.m3224c(f1801z[3], new String[0]);
            case 4:
                return C0745b.m3224c(f1801z[5], new String[0]);
            case 5:
                return C0745b.m3224c(f1801z[2], new String[0]);
            default:
                C0691a.m2856a(f1801z[4]);
                return "";
        }
    }
}
