package p000a.p001a.p002a.p011c.p012a.p013a.p014a;

import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.a.a.a.n */
final class C0083n extends C0080k {
    /* renamed from: d */
    private static final int f243d = 4;
    /* renamed from: z */
    private static final String f244z = C0083n.m487z(C0083n.m488z("c4\\y"));

    C0083n(C0185f c0185f) {
        super(c0185f);
    }

    /* renamed from: z */
    private static String m487z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 75;
                    break;
                case 1:
                    i2 = 4;
                    break;
                case 2:
                    i2 = 109;
                    break;
                case 3:
                    i2 = 80;
                    break;
                default:
                    i2 = 54;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m488z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 54);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo17a() throws C0213t, C0212s {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f244z);
        int length = stringBuilder.length();
        stringBuilder.append(m475c().m465a(4, 4));
        m479a(stringBuilder, 8, length);
        return m475c().m467a(stringBuilder, 48);
    }
}
