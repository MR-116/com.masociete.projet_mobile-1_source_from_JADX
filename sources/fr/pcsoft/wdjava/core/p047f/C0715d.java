package fr.pcsoft.wdjava.core.p047f;

/* renamed from: fr.pcsoft.wdjava.core.f.d */
public enum C0715d {
    MEMORY,
    DIRECT_ACCESS;
    
    /* renamed from: a */
    private static final C0715d[] f1825a = null;

    static {
        MEMORY = new C0715d(C0715d.m2990z(C0715d.m2991z("\"dt%:6")), 0);
        DIRECT_ACCESS = new C0715d(C0715d.m2990z(C0715d.m2991z("+hk/+;~x)+*rj")), 1);
        f1825a = new C0715d[]{MEMORY, DIRECT_ACCESS};
    }

    /* renamed from: z */
    private static String m2990z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 111;
                    break;
                case 1:
                    i2 = 33;
                    break;
                case 2:
                    i2 = 57;
                    break;
                case 3:
                    i2 = 106;
                    break;
                default:
                    i2 = 104;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2991z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 104);
        }
        return toCharArray;
    }
}
