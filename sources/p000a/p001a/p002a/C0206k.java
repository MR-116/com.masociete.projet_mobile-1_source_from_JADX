package p000a.p001a.p002a;

/* renamed from: a.a.a.k */
public enum C0206k {
    OTHER,
    ORIENTATION,
    BYTE_SEGMENTS,
    ERROR_CORRECTION_LEVEL,
    ISSUE_NUMBER,
    SUGGESTED_PRICE,
    POSSIBLE_COUNTRY,
    UPC_EAN_EXTENSION,
    PDF417_EXTRA_METADATA,
    STRUCTURED_APPEND_SEQUENCE,
    STRUCTURED_APPEND_PARITY;

    /* renamed from: z */
    private static String m1249z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 99;
                    break;
                case 1:
                    i2 = 123;
                    break;
                case 2:
                    i2 = 82;
                    break;
                case 3:
                    i2 = 110;
                    break;
                default:
                    i2 = 123;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1250z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 123);
        }
        return toCharArray;
    }
}
