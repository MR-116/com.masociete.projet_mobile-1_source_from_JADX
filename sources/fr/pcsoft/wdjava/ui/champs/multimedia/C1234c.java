package fr.pcsoft.wdjava.ui.champs.multimedia;

/* renamed from: fr.pcsoft.wdjava.ui.champs.multimedia.c */
enum C1234c {
    HOMOTHETIQUE_CENTRE,
    ETIRE;
    
    /* renamed from: a */
    private static final C1234c[] f3669a = null;

    static {
        HOMOTHETIQUE_CENTRE = new C1234c(C1234c.m8664z(C1234c.m8665z("\u00142UF!\u00148L@$\t8GJ0\u0012)JL")), 0);
        ETIRE = new C1234c(C1234c.m8664z(C1234c.m8665z("\u0019)Q[0")), 1);
        f3669a = new C1234c[]{HOMOTHETIQUE_CENTRE, ETIRE};
    }

    /* renamed from: z */
    private static String m8664z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 92;
                    break;
                case 1:
                    i2 = 125;
                    break;
                case 2:
                    i2 = 24;
                    break;
                case 3:
                    i2 = 9;
                    break;
                default:
                    i2 = 117;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8665z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 117);
        }
        return toCharArray;
    }
}
