package p000a.p001a.p002a;

/* renamed from: a.a.a.x */
public enum C0217x {
    AZTEC,
    CODABAR,
    CODE_39,
    CODE_93,
    CODE_128,
    DATA_MATRIX,
    EAN_8,
    EAN_13,
    ITF,
    MAXICODE,
    PDF_417,
    QR_CODE,
    RSS_14,
    RSS_EXPANDED,
    UPC_A,
    UPC_E,
    UPC_EAN_EXTENSION;

    /* renamed from: z */
    private static String m1279z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 71;
                    break;
                case 1:
                    i2 = 96;
                    break;
                case 2:
                    i2 = 80;
                    break;
                case 3:
                    i2 = 70;
                    break;
                default:
                    i2 = 24;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1280z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 24);
        }
        return toCharArray;
    }
}
