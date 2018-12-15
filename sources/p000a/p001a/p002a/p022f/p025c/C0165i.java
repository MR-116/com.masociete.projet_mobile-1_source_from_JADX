package p000a.p001a.p002a.p022f.p025c;

/* renamed from: a.a.a.f.c.i */
enum C0165i {
    ALPHA,
    LOWER,
    MIXED,
    PUNCT,
    ALPHA_SHIFT,
    PUNCT_SHIFT;
    
    /* renamed from: a */
    private static final C0165i[] f637a = null;

    static {
        ALPHA = new C0165i(C0165i.m1021z(C0165i.m1022z("YJKrT")), 0);
        LOWER = new C0165i(C0165i.m1021z(C0165i.m1022z("TILG")), 1);
        MIXED = new C0165i(C0165i.m1021z(C0165i.m1022z("UOCQ")), 2);
        PUNCT = new C0165i(C0165i.m1021z(C0165i.m1022z("HSUyA")), 3);
        ALPHA_SHIFT = new C0165i(C0165i.m1021z(C0165i.m1022z("YJKrTGUSsSL")), 4);
        PUNCT_SHIFT = new C0165i(C0165i.m1021z(C0165i.m1022z("HSUyAGUSsSL")), 5);
        f637a = new C0165i[]{ALPHA, LOWER, MIXED, PUNCT, ALPHA_SHIFT, PUNCT_SHIFT};
    }

    /* renamed from: z */
    private static String m1021z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 24;
                    break;
                case 1:
                    i2 = 6;
                    break;
                case 2:
                    i2 = 27;
                    break;
                case 3:
                    i2 = 58;
                    break;
                default:
                    i2 = 21;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1022z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 21);
        }
        return toCharArray;
    }
}
