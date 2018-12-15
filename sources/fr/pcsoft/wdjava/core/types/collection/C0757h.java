package fr.pcsoft.wdjava.core.types.collection;

/* renamed from: fr.pcsoft.wdjava.core.types.collection.h */
public enum C0757h {
    STACK,
    QUEUE,
    LIST;
    
    /* renamed from: a */
    private static final C0757h[] f1968a = null;

    static {
        STACK = new C0757h(C0757h.m3381z(C0757h.m3382z("CV+}Q")), 0);
        QUEUE = new C0757h(C0757h.m3381z(C0757h.m3382z("AW/k_")), 1);
        LIST = new C0757h(C0757h.m3381z(C0757h.m3382z("\\K9j")), 2);
        f1968a = new C0757h[]{STACK, QUEUE, LIST};
    }

    /* renamed from: z */
    private static String m3381z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 16;
                    break;
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 106;
                    break;
                case 3:
                    i2 = 62;
                    break;
                default:
                    i2 = 26;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3382z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 26);
        }
        return toCharArray;
    }
}
