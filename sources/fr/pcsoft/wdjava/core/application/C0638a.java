package fr.pcsoft.wdjava.core.application;

/* renamed from: fr.pcsoft.wdjava.core.application.a */
public enum C0638a {
    SYSTEM(""),
    BUILD(C0638a.m2611z(C0638a.m2612z("ca|F^}{Lt/dgEkdfaC~r"))),
    TLM(C0638a.m2611z(C0638a.m2612z("vyJ^~mqxOos}p\u0004ks{eOiu}pY"))),
    APP(C0638a.m2611z(C0638a.m2612z("vyJKkqKzZoh{{Y5qfzZ~s`|Oh")));
    
    /* renamed from: a */
    private static final C0638a[] f1604a = null;
    /* renamed from: b */
    private String f1605b;

    static {
        SYSTEM = new C0638a(C0638a.m2611z(C0638a.m2612z("RMF~^L")), 0, "");
        BUILD = new C0638a(C0638a.m2611z(C0638a.m2612z("CA\\f_")), 1, C0638a.m2611z(C0638a.m2612z("ca|F^}{Lt/dgEkdfaC~r")));
        TLM = new C0638a(C0638a.m2611z(C0638a.m2612z("UXX")), 2, C0638a.m2611z(C0638a.m2612z("vyJ^~mqxOos}p\u0004ks{eOiu}pY")));
        APP = new C0638a(C0638a.m2611z(C0638a.m2612z("@DE")), 3, C0638a.m2611z(C0638a.m2612z("vyJKkqKzZoh{{Y5qfzZ~s`|Oh")));
        f1604a = new C0638a[]{SYSTEM, BUILD, TLM, APP};
    }

    private C0638a(String str) {
        this.f1605b = "";
        this.f1605b = str;
    }

    /* renamed from: z */
    private static String m2611z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 20;
                    break;
                case 2:
                    i2 = 21;
                    break;
                case 3:
                    i2 = 42;
                    break;
                default:
                    i2 = 27;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2612z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 27);
        }
        return toCharArray;
    }

    public final String getFileName() {
        return this.f1605b;
    }
}
