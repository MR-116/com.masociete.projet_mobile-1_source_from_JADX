package fr.pcsoft.wdjava.ui.p065b.p067a;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.k */
enum C1072k {
    pad,
    reflect,
    repeat;
    
    /* renamed from: a */
    private static final C1072k[] f3145a = null;

    static {
        pad = new C1072k(C1072k.m7710z(C1072k.m7711z("s\u0006}")), 0);
        reflect = new C1072k(C1072k.m7710z(C1072k.m7711z("q\u0002$U`\u0013")), 1);
        repeat = new C1072k(C1072k.m7710z(C1072k.m7711z("q\u0002i-Qw")), 2);
        f3145a = new C1072k[]{pad, reflect, repeat};
    }

    /* renamed from: z */
    private static String m7710z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 3;
                    break;
                case 1:
                    i2 = 103;
                    break;
                case 2:
                    i2 = 25;
                    break;
                case 3:
                    i2 = 72;
                    break;
                default:
                    i2 = 48;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7711z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 48);
        }
        return toCharArray;
    }
}
