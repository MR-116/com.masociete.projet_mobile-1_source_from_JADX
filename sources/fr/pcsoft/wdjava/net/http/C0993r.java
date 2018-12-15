package fr.pcsoft.wdjava.net.http;

import fr.pcsoft.wdjava.core.C0607n;

/* renamed from: fr.pcsoft.wdjava.net.http.r */
enum C0993r {
    STRICT,
    BROWSER_COMPATIBLE;
    
    /* renamed from: a */
    private static final C0993r[] f2842a = null;

    static {
        STRICT = new C0993r(C0993r.m7232z(C0993r.m7233z("/q/\u0016f(")), 0);
        BROWSER_COMPATIBLE = new C0993r(C0993r.m7232z(C0993r.m7233z(">w2\bv9w\"\u001cj1u<\u000bl>i8")), 1);
        f2842a = new C0993r[]{STRICT, BROWSER_COMPATIBLE};
    }

    /* renamed from: z */
    private static String m7232z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = C0607n.Hn;
                    break;
                case 1:
                    i2 = 37;
                    break;
                case 2:
                    i2 = 125;
                    break;
                case 3:
                    i2 = 95;
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
    private static char[] m7233z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 37);
        }
        return toCharArray;
    }
}
