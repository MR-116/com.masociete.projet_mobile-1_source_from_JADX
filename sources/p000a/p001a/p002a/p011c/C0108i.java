package p000a.p001a.p002a.p011c;

import java.util.Map;
import p000a.p001a.p002a.C0204i;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.fb;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.c.i */
public final class C0108i extends C0107h {
    /* renamed from: a */
    private static final int f341a = 95;
    /* renamed from: z */
    private static final String[] f342z = new String[]{C0108i.m627z(C0108i.m628z("^G>wjvGrqby_7|yd")), C0108i.m627z(C0108i.m628z("TD<fhy_!2ix\u000b<}y7[3a~7H:wn|X'")), C0108i.m627z(C0108i.m628z("EN#ghd_7v-tD<fhy_!2~D'~i7I72<%\u000b=`-&\u0018rvdpB&a-{D<u!7I'f-pD&2")), C0108i.m627z(C0108i.m628z("TJ<2byG+2hyH=vh7n\u0013\\R&\u0018~2ob_rubc\u000b"))};

    /* renamed from: z */
    private static String m627z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 23;
                    break;
                case 1:
                    i2 = 43;
                    break;
                case 2:
                    i2 = 82;
                    break;
                case 3:
                    i2 = 18;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m628z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 13);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0194n mo8a(String str, C0217x c0217x, int i, int i2, Map<C0204i, ?> map) throws fb {
        try {
            if (c0217x == C0217x.EAN_13) {
                return super.mo8a(str, c0217x, i, i2, map);
            }
            throw new IllegalArgumentException(f342z[3] + c0217x);
        } catch (fb e) {
            throw e;
        }
    }

    /* renamed from: a */
    public boolean[] mo21a(String str) {
        int i;
        int length = str.length();
        switch (length) {
            case 12:
                try {
                    str = str + C0118t.m682a((CharSequence) str);
                    break;
                } catch (Throwable e) {
                    throw new IllegalArgumentException(e);
                }
            case 13:
                try {
                    if (!C0118t.m686b(str)) {
                        throw new IllegalArgumentException(f342z[1]);
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                } catch (C0212s e3) {
                    throw new IllegalArgumentException(f342z[0]);
                }
                break;
            default:
                throw new IllegalArgumentException(f342z[2] + length);
        }
        int i2 = C0119u.f409l[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int a = C0101b.m587a(zArr, 0, C0118t.f401c, true) + 0;
        for (i = 1; i <= 6; i++) {
            length = Character.digit(str.charAt(i), 10);
            if (((i2 >> (6 - i)) & 1) == 1) {
                length += 10;
            }
            a += C0101b.m587a(zArr, a, C0118t.f402d[length], false);
        }
        i = a + C0101b.m587a(zArr, a, C0118t.f403f, false);
        for (length = 7; length <= 12; length++) {
            i += C0101b.m587a(zArr, i, C0118t.f399a[Character.digit(str.charAt(length), 10)], true);
        }
        C0101b.m587a(zArr, i, C0118t.f401c, true);
        return zArr;
    }
}
