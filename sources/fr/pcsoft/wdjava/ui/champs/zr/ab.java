package fr.pcsoft.wdjava.ui.champs.zr;

enum ab {
    IDLE,
    LOADING,
    LOADING_MANUAL,
    DISABLED;
    
    /* renamed from: a */
    private static final ab[] f3795a = null;

    static {
        IDLE = new ab(m8990z(m8991z("4F\u0013\u001f")), 0);
        LOADING = new ab(m8990z(m8991z("1M\u001e\u001eK3E")), 1);
        LOADING_MANUAL = new ab(m8990z(m8991z("1M\u001e\u001eK3E\u0000\u0017C3W\u001e\u0016")), 2);
        DISABLED = new ab(m8990z(m8991z("9K\f\u001b@1G\u001b")), 3);
        f3795a = new ab[]{IDLE, LOADING, LOADING_MANUAL, DISABLED};
    }

    /* renamed from: z */
    private static String m8990z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 125;
                    break;
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 95;
                    break;
                case 3:
                    i2 = 90;
                    break;
                default:
                    i2 = 2;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8991z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 2);
        }
        return toCharArray;
    }

    public boolean isLoadingState() {
        return this == LOADING || this == LOADING_MANUAL;
    }
}
