package p000a.p001a.p002a.p011c.p012a.p013a.p014a;

import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.a.a.a.s */
final class C0088s extends C0086q {
    /* renamed from: z */
    private static final String[] f253z = new String[]{C0088s.m502z(C0088s.m503z("r\u0018hR\u0017s")), C0088s.m502z(C0088s.m503z("r\u0018hR\u0016s"))};

    C0088s(C0185f c0185f) {
        super(c0185f);
    }

    /* renamed from: z */
    private static String m502z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 90;
                    break;
                case 1:
                    i2 = 43;
                    break;
                case 2:
                    i2 = 90;
                    break;
                case 3:
                    i2 = 98;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m503z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 36);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected int mo18a(int i) {
        return i < 10000 ? i : i - 10000;
    }

    /* renamed from: c */
    protected void mo19c(StringBuilder stringBuilder, int i) {
        if (i < 10000) {
            stringBuilder.append(f253z[1]);
        } else {
            stringBuilder.append(f253z[0]);
        }
    }
}
