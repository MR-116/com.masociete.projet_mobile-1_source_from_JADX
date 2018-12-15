package p000a.p001a.p002a.p015d.p017b;

/* renamed from: a.a.a.d.b.a */
enum C0127a {
    UPPER,
    LOWER,
    MIXED,
    DIGIT,
    PUNCT,
    BINARY;
    
    /* renamed from: a */
    private static final C0127a[] f433a = null;

    static {
        UPPER = new C0127a(C0127a.m747z(C0127a.m748z("f-N}w")), 0);
        LOWER = new C0127a(C0127a.m747z(C0127a.m748z("2I}w")), 1);
        MIXED = new C0127a(C0127a.m747z(C0127a.m748z("~4F}a")), 2);
        DIGIT = new C0127a(C0127a.m747z(C0127a.m748z("w4Yqq")), 3);
        PUNCT = new C0127a(C0127a.m747z(C0127a.m748z("c(P{q")), 4);
        BINARY = new C0127a(C0127a.m747z(C0127a.m748z("q4Pywj")), 5);
        f433a = new C0127a[]{UPPER, LOWER, MIXED, DIGIT, PUNCT, BINARY};
    }

    /* renamed from: z */
    private static String m747z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 51;
                    break;
                case 1:
                    i2 = 125;
                    break;
                case 2:
                    i2 = 30;
                    break;
                case 3:
                    i2 = 56;
                    break;
                default:
                    i2 = 37;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m748z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 37);
        }
        return toCharArray;
    }
}
