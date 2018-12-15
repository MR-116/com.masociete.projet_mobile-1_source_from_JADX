package fr.pcsoft.wdjava.ui.dessin.p077a;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.a.u */
public enum C1355u {
    UNDEF,
    CONTINUOUS,
    DASH,
    DOTTED,
    DOT_AND_DASH,
    DASH_AND_DOT,
    DASH_AND_DOUBLE_DOT,
    INVISIBLE;
    
    /* renamed from: a */
    private static final C1355u[] f4031a = null;

    static {
        UNDEF = new C1355u(C1355u.m9727z(C1355u.m9728z("PF''G")), 0);
        CONTINUOUS = new C1355u(C1355u.m9727z(C1355u.m9728z("FG-6HK],7R")), 1);
        DASH = new C1355u(C1355u.m9727z(C1355u.m9728z("AI0*")), 2);
        DOTTED = new C1355u(C1355u.m9727z(C1355u.m9728z("AG76DA")), 3);
        DOT_AND_DASH = new C1355u(C1355u.m9727z(C1355u.m9728z("AG7=@KL<&@V@")), 4);
        DASH_AND_DOT = new C1355u(C1355u.m9727z(C1355u.m9728z("AI0*^DF'=EJ\\")), 5);
        DASH_AND_DOUBLE_DOT = new C1355u(C1355u.m9727z(C1355u.m9728z("AI0*^DF'=EJ]!.DZL,6")), 6);
        INVISIBLE = new C1355u(C1355u.m9727z(C1355u.m9728z("LF5+RLJ/'")), 7);
        f4031a = new C1355u[]{UNDEF, CONTINUOUS, DASH, DOTTED, DOT_AND_DASH, DASH_AND_DOT, DASH_AND_DOUBLE_DOT, INVISIBLE};
    }

    /* renamed from: z */
    private static String m9727z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 5;
                    break;
                case 1:
                    i2 = 8;
                    break;
                case 2:
                    i2 = 99;
                    break;
                case 3:
                    i2 = 98;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9728z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 1);
        }
        return toCharArray;
    }
}
