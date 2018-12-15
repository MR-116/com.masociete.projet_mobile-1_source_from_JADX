package fr.pcsoft.wdjava.p058k;

import java.util.StringTokenizer;

/* renamed from: fr.pcsoft.wdjava.k.c */
class C0932c {
    /* renamed from: a */
    private static final char f2552a = '=';
    /* renamed from: b */
    private static final String f2553b = C0932c.m6784z(C0932c.m6785z("}/"));
    /* renamed from: c */
    private String f2554c;
    /* renamed from: d */
    private String f2555d;

    public C0932c(String str, String str2) {
        if (!C0932c.m6783a(str)) {
            str = "";
        }
        this.f2554c = str;
        this.f2555d = str2;
        m6788b(str2);
    }

    /* renamed from: a */
    private static boolean m6783a(String str) {
        return !str.trim().equals("") && str.indexOf(61) < 0;
    }

    /* renamed from: z */
    private static String m6784z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 119;
                    break;
                case 1:
                    i2 = 34;
                    break;
                case 2:
                    i2 = 92;
                    break;
                case 3:
                    i2 = 71;
                    break;
                default:
                    i2 = 21;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6785z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 21);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String m6786a() {
        return this.f2555d;
    }

    /* renamed from: b */
    public void m6787b() {
        this.f2554c = null;
        this.f2555d = null;
    }

    /* renamed from: b */
    public boolean m6788b(String str) {
        if (str == null) {
            this.f2555d = str;
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(str.trim(), f2553b);
            StringBuffer stringBuffer = new StringBuffer();
            while (stringTokenizer.hasMoreTokens()) {
                stringBuffer.append(stringTokenizer.nextToken());
            }
            this.f2555d = stringBuffer.toString();
        }
        return true;
    }

    /* renamed from: c */
    public String m6789c() {
        return this.f2554c;
    }

    public String toString() {
        return this.f2554c.trim() + ' ' + f2552a + ' ' + this.f2555d.trim();
    }
}
