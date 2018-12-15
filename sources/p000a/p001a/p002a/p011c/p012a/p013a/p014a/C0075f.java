package p000a.p001a.p002a.p011c.p012a.p013a.p014a;

/* renamed from: a.a.a.c.a.a.a.f */
enum C0075f {
    NUMERIC,
    ALPHA,
    ISO_IEC_646;
    
    /* renamed from: a */
    private static final C0075f[] f219a = null;

    static {
        NUMERIC = new C0075f(C0075f.m442z(C0075f.m443z("\u0012?S\u0002_\u0015)")), 0);
        ALPHA = new C0075f(C0075f.m442z(C0075f.m443z("\u001d&N\u000fL")), 1);
        ISO_IEC_646 = new C0075f(C0075f.m442z(C0075f.m443z("\u00159Q\u0018D\u0019)Aq9j")), 2);
        f219a = new C0075f[]{NUMERIC, ALPHA, ISO_IEC_646};
    }

    /* renamed from: z */
    private static String m442z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 92;
                    break;
                case 1:
                    i2 = 106;
                    break;
                case 2:
                    i2 = 30;
                    break;
                case 3:
                    i2 = 71;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m443z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 13);
        }
        return toCharArray;
    }
}
