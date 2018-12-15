package fr.pcsoft.wdjava.ui.pulltorefresh;

/* renamed from: fr.pcsoft.wdjava.ui.pulltorefresh.e */
public enum C1474e {
    IDLE,
    PULL,
    RELEASE,
    REFRESHING,
    REFRESHING_MANUAL;
    
    /* renamed from: a */
    private static final C1474e[] f4479a = null;

    static {
        IDLE = new C1474e(C1474e.m10311z(C1474e.m10312z("\b.\u0018q")), 0);
        PULL = new C1474e(C1474e.m10311z(C1474e.m10312z("\u0011?\u0018x")), 1);
        RELEASE = new C1474e(C1474e.m10311z(C1474e.m10312z("\u0013/\u0018q\u0000\u0012/")), 2);
        REFRESHING = new C1474e(C1474e.m10311z(C1474e.m10312z("\u0013/\u0012f\u0004\u0012\"\u001dz\u0006")), 3);
        REFRESHING_MANUAL = new C1474e(C1474e.m10311z(C1474e.m10312z("\u0013/\u0012f\u0004\u0012\"\u001dz\u0006\u001e'\u0015z\u0014\u0000&")), 4);
        f4479a = new C1474e[]{IDLE, PULL, RELEASE, REFRESHING, REFRESHING_MANUAL};
    }

    /* renamed from: z */
    private static String m10311z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 65;
                    break;
                case 1:
                    i2 = 106;
                    break;
                case 2:
                    i2 = 84;
                    break;
                case 3:
                    i2 = 52;
                    break;
                default:
                    i2 = 65;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10312z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 65);
        }
        return toCharArray;
    }
}
