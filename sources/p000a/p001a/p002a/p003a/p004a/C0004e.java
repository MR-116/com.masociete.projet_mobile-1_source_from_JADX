package p000a.p001a.p002a.p003a.p004a;

import fr.pcsoft.wdjava.core.C0607n;

/* renamed from: a.a.a.a.a.e */
public enum C0004e {
    FORCE_NONE,
    FORCE_SQUARE,
    FORCE_RECTANGLE;

    /* renamed from: z */
    private static String m42z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = C0607n.bx;
                    break;
                case 1:
                    i2 = 58;
                    break;
                case 2:
                    i2 = 45;
                    break;
                case 3:
                    i2 = 116;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m43z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 55);
        }
        return toCharArray;
    }
}
