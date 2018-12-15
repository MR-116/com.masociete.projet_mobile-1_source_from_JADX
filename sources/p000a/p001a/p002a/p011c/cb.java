package p000a.p001a.p002a.p011c;

import fr.pcsoft.wdjava.core.C0607n;

/* renamed from: a.a.a.c.cb */
enum cb {
    UNCODABLE,
    ONE_DIGIT,
    TWO_DIGITS,
    FNC_1;
    
    /* renamed from: a */
    private static final cb[] f319a = null;

    static {
        UNCODABLE = new cb(cb.m599z(cb.m600z("n1\u001d!Mz=\u0012+")), 0);
        ONE_DIGIT = new cb(cb.m599z(cb.m600z("t1\u001b1Mr8\u0017:")), 1);
        TWO_DIGITS = new cb(cb.m599z(cb.m600z("o(\u00111Mr8\u0017:Z")), 2);
        FNC_1 = new cb(cb.m599z(cb.m600z("}1\u001d18")), 3);
        f319a = new cb[]{UNCODABLE, ONE_DIGIT, TWO_DIGITS, FNC_1};
    }

    /* renamed from: z */
    private static String m599z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 59;
                    break;
                case 1:
                    i2 = C0607n.bx;
                    break;
                case 2:
                    i2 = 94;
                    break;
                case 3:
                    i2 = 110;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m600z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 9);
        }
        return toCharArray;
    }
}
