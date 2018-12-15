package fr.pcsoft.wdjava.net.http;

/* renamed from: fr.pcsoft.wdjava.net.http.y */
class C1000y {
    /* renamed from: z */
    private static final String f2852z = C1000y.m7243z(C1000y.m7244z("'5"));
    /* renamed from: a */
    private final String f2853a;
    /* renamed from: b */
    private final String f2854b;

    C1000y(String str, String str2) {
        this.f2853a = str;
        this.f2854b = str2;
    }

    /* renamed from: z */
    private static String m7243z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 29;
                    break;
                case 1:
                    i2 = 21;
                    break;
                case 2:
                    i2 = 17;
                    break;
                case 3:
                    i2 = 19;
                    break;
                default:
                    i2 = 17;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7244z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 17);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String m7245a() {
        return this.f2854b;
    }

    /* renamed from: b */
    public String m7246b() {
        return this.f2853a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f2853a);
        stringBuilder.append(f2852z);
        stringBuilder.append(this.f2854b);
        return stringBuilder.toString();
    }
}
