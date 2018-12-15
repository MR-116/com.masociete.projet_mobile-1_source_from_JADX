package p000a.p001a.p002a.p011c.p012a.p013a.p014a;

import fr.pcsoft.wdjava.core.C0607n;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.a.a.a.k */
abstract class C0080k extends C0079j {
    /* renamed from: c */
    static final int f234c = 40;
    /* renamed from: z */
    private static final String f235z = C0080k.m477z(C0080k.m478z("9MXv"));

    C0080k(C0185f c0185f) {
        super(c0185f);
    }

    /* renamed from: a */
    private static void m476a(StringBuilder stringBuilder, int i) {
        int charAt;
        int i2 = 0;
        for (int i3 = 0; i3 < 13; i3++) {
            charAt = stringBuilder.charAt(i3 + i) - 48;
            if ((i3 & 1) == 0) {
                charAt *= 3;
            }
            i2 += charAt;
        }
        charAt = 10 - (i2 % 10);
        if (charAt == 10) {
            charAt = 0;
        }
        stringBuilder.append(charAt);
    }

    /* renamed from: z */
    private static String m477z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 17;
                    break;
                case 1:
                    i2 = 125;
                    break;
                case 2:
                    i2 = 105;
                    break;
                case 3:
                    i2 = 95;
                    break;
                default:
                    i2 = C0607n.co;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m478z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.co);
        }
        return toCharArray;
    }

    /* renamed from: a */
    final void m479a(StringBuilder stringBuilder, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int a = m475c().m465a((i3 * 10) + i, 10);
            if (a / 100 == 0) {
                stringBuilder.append('0');
            }
            if (a / 10 == 0) {
                stringBuilder.append('0');
            }
            stringBuilder.append(a);
        }
        C0080k.m476a(stringBuilder, i2);
    }

    /* renamed from: b */
    final void m480b(StringBuilder stringBuilder, int i) {
        stringBuilder.append(f235z);
        int length = stringBuilder.length();
        stringBuilder.append('9');
        m479a(stringBuilder, i, length);
    }
}
