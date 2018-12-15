package fr.pcsoft.wdjava.net.http;

/* renamed from: fr.pcsoft.wdjava.net.http.c */
abstract class C0979c implements C0978b {
    /* renamed from: z */
    private static final String f2776z = C0979c.m7108z(C0979c.m7109z("Oa\u001bz%vQ&Z%oI/\u001fkm\\v]`\"F#Si"));
    /* renamed from: a */
    private final String f2777a;
    /* renamed from: b */
    private final String f2778b;
    /* renamed from: c */
    private final String f2779c;

    public C0979c(String str) {
        if (str == null) {
            throw new IllegalArgumentException(f2776z);
        }
        this.f2777a = str;
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            try {
                this.f2778b = str.substring(0, indexOf);
                this.f2779c = str.substring(indexOf + 1);
                return;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.f2778b = str;
        this.f2779c = null;
    }

    /* renamed from: z */
    private static String m7108z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 2;
                    break;
                case 1:
                    i2 = 40;
                    break;
                case 2:
                    i2 = 86;
                    break;
                case 3:
                    i2 = 63;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7109z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 5);
        }
        return toCharArray;
    }

    /* renamed from: d */
    public String mo3262d() {
        return this.f2777a;
    }

    /* renamed from: e */
    public String mo3263e() {
        return this.f2778b;
    }

    /* renamed from: g */
    public String mo3264g() {
        return this.f2779c;
    }
}
