package p000a.p001a.p002a.p011c.p012a.p013a.p014a;

import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.a.a.a.r */
final class C0087r extends C0086q {
    /* renamed from: z */
    private static final String f252z = C0087r.m498z(C0087r.m499z("Bw=p\u000eC"));

    C0087r(C0185f c0185f) {
        super(c0185f);
    }

    /* renamed from: z */
    private static String m498z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 106;
                    break;
                case 1:
                    i2 = 68;
                    break;
                case 2:
                    i2 = 12;
                    break;
                case 3:
                    i2 = 64;
                    break;
                default:
                    i2 = 61;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m499z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 61);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected int mo18a(int i) {
        return i;
    }

    /* renamed from: c */
    protected void mo19c(StringBuilder stringBuilder, int i) {
        stringBuilder.append(f252z);
    }
}
