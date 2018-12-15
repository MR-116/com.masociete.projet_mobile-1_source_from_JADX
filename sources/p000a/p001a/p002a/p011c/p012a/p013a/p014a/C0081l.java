package p000a.p001a.p002a.p011c.p012a.p013a.p014a;

import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.a.a.a.l */
final class C0081l extends C0080k {
    /* renamed from: d */
    private static final int f236d = 8;
    /* renamed from: e */
    private static final int f237e = 2;
    /* renamed from: z */
    private static final String f238z = C0081l.m481z(C0081l.m482z("2dqo"));

    C0081l(C0185f c0185f) {
        super(c0185f);
    }

    /* renamed from: z */
    private static String m481z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 26;
                    break;
                case 1:
                    i2 = 87;
                    break;
                case 2:
                    i2 = 72;
                    break;
                case 3:
                    i2 = 93;
                    break;
                default:
                    i2 = 110;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m482z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 110);
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
            stringBuilder.append(f238z);
            stringBuilder.append(a);
            stringBuilder.append(')');
            stringBuilder.append(m475c().m466a(50, null).m433b());
            return stringBuilder.toString();
        } catch (C0213t e) {
            throw e;
        }
    }
}
