package p000a.p001a.p002a.p011c.p012a.p013a.p014a;

import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.a.a.a.m */
final class C0082m extends C0080k {
    /* renamed from: d */
    private static final int f239d = 10;
    /* renamed from: e */
    private static final int f240e = 8;
    /* renamed from: f */
    private static final int f241f = 2;
    /* renamed from: z */
    private static final String f242z = C0082m.m484z(C0082m.m485z("eh)_"));

    C0082m(C0185f c0185f) {
        super(c0185f);
    }

    /* renamed from: z */
    private static String m484z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 77;
                    break;
                case 1:
                    i2 = 91;
                    break;
                case 2:
                    i2 = 16;
                    break;
                case 3:
                    i2 = 108;
                    break;
                default:
                    i2 = 80;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m485z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 80);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo17a() throws C0213t, C0212s {
        try {
            if (m474b().m1136a() < 48) {
                throw C0213t.m1269a();
            }
            StringBuilder stringBuilder = new StringBuilder();
            m480b(stringBuilder, 8);
            int a = m475c().m465a(48, 2);
            stringBuilder.append(f242z);
            stringBuilder.append(a);
            stringBuilder.append(')');
            a = m475c().m465a(50, 10);
            try {
                if (a / 100 == 0) {
                    stringBuilder.append('0');
                }
                try {
                    if (a / 10 == 0) {
                        stringBuilder.append('0');
                    }
                    stringBuilder.append(a);
                    stringBuilder.append(m475c().m466a(60, null).m433b());
                    return stringBuilder.toString();
                } catch (C0213t e) {
                    throw e;
                }
            } catch (C0213t e2) {
                throw e2;
            }
        } catch (C0213t e22) {
            throw e22;
        }
    }
}
