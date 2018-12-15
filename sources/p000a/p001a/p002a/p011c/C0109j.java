package p000a.p001a.p002a.p011c;

import java.util.Map;
import p000a.p001a.p002a.C0204i;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.fb;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.c.j */
public final class C0109j extends C0107h {
    /* renamed from: a */
    private static final int f343a = 67;
    /* renamed from: z */
    private static final String[] f344z = new String[]{C0109j.m631z(C0109j.m632z("+668>\u0006;!84\u000647|4H\u0012\u0019V\u000eP{xz$\u001cw?w%H")), C0109j.m631z(C0109j.m632z(":2)m4\u001b#=|q\u000b86l4\u0006#+8\"\u00008-t5H5=8iH318\u001c$xt>\u00060t83\u001d#x>\u001cw")), C0109j.m631z(C0109j.m632z("+86l4\u0006#+85\u0007w6w%H'9k\"H40}2\u0003$-u")), C0109j.m631z(C0109j.m632z("!;4}6\t;x{>\u0006#=v%\u001b"))};

    /* renamed from: z */
    private static String m631z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 104;
                    break;
                case 1:
                    i2 = 87;
                    break;
                case 2:
                    i2 = 88;
                    break;
                case 3:
                    i2 = 24;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m632z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 81);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0194n mo8a(String str, C0217x c0217x, int i, int i2, Map<C0204i, ?> map) throws fb {
        try {
            if (c0217x == C0217x.EAN_8) {
                return super.mo8a(str, c0217x, i, i2, map);
            }
            throw new IllegalArgumentException(f344z[0] + c0217x);
        } catch (fb e) {
            throw e;
        }
    }

    /* renamed from: a */
    public boolean[] mo21a(String str) {
        int length = str.length();
        switch (length) {
            case 7:
                try {
                    str = str + C0118t.m682a((CharSequence) str);
                    break;
                } catch (Throwable e) {
                    throw new IllegalArgumentException(e);
                }
            case 8:
                try {
                    if (!C0118t.m686b(str)) {
                        throw new IllegalArgumentException(f344z[2]);
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                } catch (C0212s e3) {
                    throw new IllegalArgumentException(f344z[3]);
                }
                break;
            default:
                throw new IllegalArgumentException(f344z[1] + length);
        }
        boolean[] zArr = new boolean[67];
        int a = C0101b.m587a(zArr, 0, C0118t.f401c, true) + 0;
        for (length = 0; length <= 3; length++) {
            a += C0101b.m587a(zArr, a, C0118t.f399a[Character.digit(str.charAt(length), 10)], false);
        }
        int a2 = a + C0101b.m587a(zArr, a, C0118t.f403f, false);
        for (length = 4; length <= 7; length++) {
            a2 += C0101b.m587a(zArr, a2, C0118t.f399a[Character.digit(str.charAt(length), 10)], true);
        }
        C0101b.m587a(zArr, a2, C0118t.f401c, true);
        return zArr;
    }
}
