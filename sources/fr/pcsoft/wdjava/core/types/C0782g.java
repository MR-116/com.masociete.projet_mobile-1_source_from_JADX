package fr.pcsoft.wdjava.core.types;

/* renamed from: fr.pcsoft.wdjava.core.types.g */
public enum C0782g {
    DAY,
    HOUR,
    MINUTE,
    SECOND,
    CENTISECOND,
    MILLISECOND;

    /* renamed from: z */
    private static String m3784z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 54;
                    break;
                case 1:
                    i2 = 48;
                    break;
                case 2:
                    i2 = 67;
                    break;
                case 3:
                    i2 = 115;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3785z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 51);
        }
        return toCharArray;
    }
}
