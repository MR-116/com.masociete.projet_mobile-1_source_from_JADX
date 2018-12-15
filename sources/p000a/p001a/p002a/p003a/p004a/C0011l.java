package p000a.p001a.p002a.p003a.p004a;

import fr.pcsoft.wdjava.p058k.C0931b;
import fr.pcsoft.wdjava.ui.p065b.p067a.qb;
import fr.pcsoft.wdjava.ui.p083l.C1449i;

/* renamed from: a.a.a.a.a.l */
final class C0011l extends C0010k {
    /* renamed from: z */
    private static final String f51z = C0011l.m105z(C0011l.m106z("VJ"));

    C0011l() {
    }

    /* renamed from: z */
    private static String m105z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 87;
                    break;
                case 1:
                    i2 = 84;
                    break;
                case 2:
                    i2 = 33;
                    break;
                case 3:
                    i2 = 28;
                    break;
                default:
                    i2 = 121;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m106z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 121);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo3a() {
        return 2;
    }

    /* renamed from: a */
    int mo5a(char c, StringBuilder stringBuilder) {
        if (c == ' ') {
            stringBuilder.append('\u0003');
            return 1;
        } else if (c >= '0' && c <= '9') {
            stringBuilder.append((char) ((c - 48) + 4));
            return 1;
        } else if (c >= qb.f3206v && c <= qb.f3196k) {
            stringBuilder.append((char) ((c - 97) + 14));
            return 1;
        } else if (c >= '\u0000' && c <= '\u001f') {
            stringBuilder.append('\u0000');
            stringBuilder.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            stringBuilder.append('\u0001');
            stringBuilder.append((char) (c - 33));
            return 2;
        } else if (c >= ':' && c <= '@') {
            stringBuilder.append('\u0001');
            stringBuilder.append((char) ((c - 58) + 15));
            return 2;
        } else if (c >= C0931b.f2543a && c <= C1449i.hb) {
            stringBuilder.append('\u0001');
            stringBuilder.append((char) ((c - 91) + 22));
            return 2;
        } else if (c == '`') {
            stringBuilder.append('\u0002');
            stringBuilder.append((char) (c - 96));
            return 2;
        } else if (c >= qb.f3195j && c <= qb.f3192g) {
            stringBuilder.append('\u0002');
            stringBuilder.append((char) ((c - 65) + 1));
            return 2;
        } else if (c >= '{' && c <= '') {
            stringBuilder.append('\u0002');
            stringBuilder.append((char) ((c - 123) + 27));
            return 2;
        } else if (c >= '') {
            stringBuilder.append(f51z);
            return mo5a((char) (c - 128), stringBuilder) + 2;
        } else {
            C0001b.m15g(c);
            return -1;
        }
    }
}
