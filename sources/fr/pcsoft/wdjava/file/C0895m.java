package fr.pcsoft.wdjava.file;

/* renamed from: fr.pcsoft.wdjava.file.m */
public final class C0895m extends C0894l {
    /* renamed from: c */
    public static final C0895m f2393c = new C0895m(new byte[]{(byte) -17, (byte) -69, (byte) -65}, C0895m.m6226z(C0895m.m6227z("%\u000150H")));
    /* renamed from: d */
    public static final C0895m f2394d = new C0895m(new byte[]{(byte) 0, (byte) 0, (byte) -2, (byte) -1}, C0895m.m6226z(C0895m.m6227z("%\u000150CB\u00176")));
    /* renamed from: e */
    public static final C0895m f2395e = new C0895m(new byte[]{(byte) -2, (byte) -1}, C0895m.m6226z(C0895m.m6227z("%\u000150AF\u00176")));
    /* renamed from: f */
    public static final C0895m f2396f = new C0895m(new byte[]{(byte) -1, (byte) -2, (byte) 0, (byte) 0}, C0895m.m6226z(C0895m.m6227z("%\u000150CB\u00196")));
    /* renamed from: g */
    public static final C0895m f2397g = new C0895m(new byte[]{(byte) -1, (byte) -2}, C0895m.m6226z(C0895m.m6227z("%\u000150AF\u00196")));
    /* renamed from: h */
    private static int f2398h = 0;
    /* renamed from: b */
    private final String f2399b;

    private C0895m(byte[] bArr, String str) {
        super(bArr);
        f2398h = Math.max(f2398h, bArr.length);
        this.f2399b = str;
    }

    /* renamed from: a */
    public static final C0895m m6224a(String str) {
        String toUpperCase = str.toUpperCase();
        return toUpperCase.equals(f2393c.f2399b) ? f2393c : toUpperCase.equals(f2395e.f2399b) ? f2395e : toUpperCase.equals(f2397g.f2399b) ? f2397g : toUpperCase.equals(f2394d.f2399b) ? f2394d : toUpperCase.equals(f2396f.f2399b) ? f2396f : null;
    }

    /* renamed from: d */
    public static final int m6225d() {
        return f2398h;
    }

    /* renamed from: z */
    private static String m6226z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 112;
                    break;
                case 1:
                    i2 = 85;
                    break;
                case 2:
                    i2 = 115;
                    break;
                case 3:
                    i2 = 29;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6227z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 112);
        }
        return toCharArray;
    }

    /* renamed from: c */
    public final String m6228c() {
        return this.f2399b;
    }

    public final String toString() {
        return m6228c();
    }
}
