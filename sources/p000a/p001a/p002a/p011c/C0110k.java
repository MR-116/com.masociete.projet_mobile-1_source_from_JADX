package p000a.p001a.p002a.p011c;

import java.util.Map;
import p000a.p001a.p002a.C0204i;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.fb;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.c.k */
public final class C0110k extends C0107h {
    /* renamed from: a */
    private static final int f345a = 51;
    /* renamed from: z */
    private static final String[] f346z = new String[]{C0110k.m635z(C0110k.m636z("+)Qnl\u0006$Fnf\u0006+P*fH\u001do\r\\-d\u001f,v\u001chX!wH")), C0110k.m635z(C0110k.m636z(":-N;f\u001b<Z*#\u000b'Q:f\u0006<Lnp\u0000'J\"gH*Zn;H,V)j\u001c;\u001f\"l\u0006/\u0013na\u001d<\u001f)l\u001ch")), C0110k.m635z(C0110k.m636z("+'Q:f\u0006<Lng\u0007hQ!wH8^=pH+W+`\u0003;J#")), C0110k.m635z(C0110k.m636z("!$S+d\t$\u001f-l\u0006<Z w\u001b")), C0110k.m635z(C0110k.m636z("&=R,f\u001ahL7p\u001c-Rnn\u001d;Kna\rh\u000fnl\u001ah\u000e"))};

    /* renamed from: z */
    private static String m635z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 104;
                    break;
                case 1:
                    i2 = 72;
                    break;
                case 2:
                    i2 = 63;
                    break;
                case 3:
                    i2 = 78;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m636z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 3);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0194n mo8a(String str, C0217x c0217x, int i, int i2, Map<C0204i, ?> map) throws fb {
        try {
            if (c0217x == C0217x.UPC_E) {
                return super.mo8a(str, c0217x, i, i2, map);
            }
            throw new IllegalArgumentException(f346z[0] + c0217x);
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
                    str = str + C0118t.m682a(C0122x.m706b(str));
                    break;
                } catch (Throwable e) {
                    throw new IllegalArgumentException(e);
                }
            case 8:
                try {
                    if (!C0118t.m686b(str)) {
                        throw new IllegalArgumentException(f346z[2]);
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                } catch (C0212s e3) {
                    throw new IllegalArgumentException(f346z[3]);
                }
                break;
            default:
                throw new IllegalArgumentException(f346z[1] + length);
        }
        length = Character.digit(str.charAt(0), 10);
        if (length == 0 || length == 1) {
            int i = C0122x.f414l[Character.digit(str.charAt(7), 10)];
            boolean[] zArr = new boolean[51];
            int a = C0101b.m587a(zArr, 0, C0118t.f401c, true) + 0;
            for (int i2 = 1; i2 <= 6; i2++) {
                length = Character.digit(str.charAt(i2), 10);
                if (((i >> (6 - i2)) & 1) == 1) {
                    length += 10;
                }
                a += C0101b.m587a(zArr, a, C0118t.f402d[length], false);
            }
            C0101b.m587a(zArr, a, C0118t.f405j, false);
            return zArr;
        }
        try {
            throw new IllegalArgumentException(f346z[4]);
        } catch (C0212s e4) {
            throw e4;
        }
    }
}
