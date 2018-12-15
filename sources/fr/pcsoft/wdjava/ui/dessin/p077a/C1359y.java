package fr.pcsoft.wdjava.ui.dessin.p077a;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.a.y */
public enum C1359y {
    UNDEF,
    MITER,
    ROUND,
    BEVEL;
    
    /* renamed from: a */
    private static final C1359y[] f4035a = null;

    static {
        UNDEF = new C1359y(C1359y.m9738z(C1359y.m9739z("\u000b?^_w")), 0);
        MITER = new C1359y(C1359y.m9738z(C1359y.m9739z("\u00138N_c")), 1);
        ROUND = new C1359y(C1359y.m9738z(C1359y.m9739z("\f>OTu")), 2);
        BEVEL = new C1359y(C1359y.m9738z(C1359y.m9739z("\u001c4L_}")), 3);
        f4035a = new C1359y[]{UNDEF, MITER, ROUND, BEVEL};
    }

    /* renamed from: z */
    private static String m9738z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 94;
                    break;
                case 1:
                    i2 = 113;
                    break;
                case 2:
                    i2 = 26;
                    break;
                case 3:
                    i2 = 26;
                    break;
                default:
                    i2 = 49;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9739z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 49);
        }
        return toCharArray;
    }
}
