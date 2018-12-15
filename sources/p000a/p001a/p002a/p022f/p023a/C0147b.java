package p000a.p001a.p002a.p022f.p023a;

/* renamed from: a.a.a.f.a.b */
public enum C0147b {
    AUTO,
    TEXT,
    BYTE,
    NUMERIC;

    /* renamed from: z */
    private static String m873z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 26;
                    break;
                case 1:
                    i2 = 116;
                    break;
                case 2:
                    i2 = 97;
                    break;
                case 3:
                    i2 = 73;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m874z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 50);
        }
        return toCharArray;
    }
}
