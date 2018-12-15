package fr.pcsoft.wdjava.core.application;

import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

/* renamed from: fr.pcsoft.wdjava.core.application.m */
public final class C0653m extends Exception {
    /* renamed from: z */
    private static final String f1634z = C0653m.m2652z(C0653m.m2653z("?\u001f\u0019\u001e7U\u001c\u000f\u00055R\u0010\u000e\t+I\u0006\u000f\t"));

    public C0653m(String str) {
        super(C0745b.m3222b(f1634z, C0653m.m2651a(str)));
    }

    /* renamed from: a */
    private static String m2651a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf >= 0 ? str.substring(lastIndexOf + 1) : str;
    }

    /* renamed from: z */
    private static String m2652z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 28;
                    break;
                case 1:
                    i2 = 79;
                    break;
                case 2:
                    i2 = 92;
                    break;
                case 3:
                    i2 = 76;
                    break;
                default:
                    i2 = 122;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2653z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 122);
        }
        return toCharArray;
    }
}
