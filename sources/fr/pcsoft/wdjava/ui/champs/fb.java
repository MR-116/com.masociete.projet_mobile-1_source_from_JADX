package fr.pcsoft.wdjava.ui.champs;

public enum fb {
    DOUBLE_BUFFERING,
    DOUBLE_BUFFERING_WITH_CACHE,
    VIEWS_RECYCLING;

    /* renamed from: z */
    private static String m8330z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 125;
                    break;
                case 1:
                    i2 = 27;
                    break;
                case 2:
                    i2 = 66;
                    break;
                case 3:
                    i2 = 96;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8331z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 32);
        }
        return toCharArray;
    }

    public boolean isDoubleBufferedRendering() {
        return this == DOUBLE_BUFFERING || this == DOUBLE_BUFFERING_WITH_CACHE;
    }
}
