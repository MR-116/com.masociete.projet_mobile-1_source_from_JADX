package fr.pcsoft.wdjava.ui.champs.image;

/* renamed from: fr.pcsoft.wdjava.ui.champs.image.e */
public enum C1212e {
    AUCUN,
    SIMPLE,
    MULTITOUCH;
    
    /* renamed from: a */
    private static final C1212e[] f3621a = null;

    static {
        AUCUN = new C1212e(C1212e.m8544z(C1212e.m8545z("}_x\u001fE")), 0);
        SIMPLE = new C1212e(C1212e.m8544z(C1212e.m8545z("oCv\u001aGy")), 1);
        MULTITOUCH = new C1212e(C1212e.m8544z(C1212e.m8545z("q_w\u001eBhEn\tC")), 2);
        f3621a = new C1212e[]{AUCUN, SIMPLE, MULTITOUCH};
    }

    /* renamed from: z */
    private static String m8544z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 60;
                    break;
                case 1:
                    i2 = 10;
                    break;
                case 2:
                    i2 = 59;
                    break;
                case 3:
                    i2 = 74;
                    break;
                default:
                    i2 = 11;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8545z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 11);
        }
        return toCharArray;
    }
}
