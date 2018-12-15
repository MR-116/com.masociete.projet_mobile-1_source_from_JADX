package fr.pcsoft.wdjava.ui.dessin.p077a;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.a.g */
public enum C1343g {
    UNDEF,
    BUTT,
    ROUNDED,
    SQUARE;
    
    /* renamed from: a */
    private static final C1343g[] f3997a = null;

    static {
        UNDEF = new C1343g(C1343g.m9637z(C1343g.m9638z("BMNwn")), 0);
        BUTT = new C1343g(C1343g.m9637z(C1343g.m9638z("UV^f")), 1);
        ROUNDED = new C1343g(C1343g.m9637z(C1343g.m9638z("EL_|lRG")), 2);
        SQUARE = new C1343g(C1343g.m9637z(C1343g.m9638z("DR_szR")), 3);
        f3997a = new C1343g[]{UNDEF, BUTT, ROUNDED, SQUARE};
    }

    /* renamed from: z */
    private static String m9637z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 23;
                    break;
                case 1:
                    i2 = 3;
                    break;
                case 2:
                    i2 = 10;
                    break;
                case 3:
                    i2 = 50;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9638z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 40);
        }
        return toCharArray;
    }
}
