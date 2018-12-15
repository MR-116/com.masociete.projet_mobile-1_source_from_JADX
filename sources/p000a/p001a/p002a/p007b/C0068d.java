package p000a.p001a.p002a.p007b;

import java.util.Map;
import p000a.p001a.p002a.C0204i;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.cb;
import p000a.p001a.p002a.fb;
import p000a.p001a.p002a.p007b.p008a.C0046o;
import p000a.p001a.p002a.p007b.p010c.C0061a;
import p000a.p001a.p002a.p007b.p010c.C0064d;
import p000a.p001a.p002a.p007b.p010c.C0066f;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.b.d */
public final class C0068d implements cb {
    /* renamed from: a */
    private static final int f198a = 4;
    /* renamed from: z */
    private static final String[] f199z = new String[]{C0068d.m405z(C0068d.m406z("J*8,\u0000g'/,\ng(9h\n)\u001a\u0004S,F\u000f\u0013 Ok>\",\bf?v")), C0068d.m405z(C0068d.m406z("[.'y\nz?3hOm\";i\u0001z\"9b\u001c)*$iO}$9,\u001cd*:`U)")), C0068d.m405z(C0068d.m406z("O$#b\u000b).;|\u001bpk5c\u0001}.8x\u001c"))};

    /* renamed from: a */
    private static C0194n m404a(C0066f c0066f, int i, int i2, int i3) {
        C0061a b = c0066f.m400b();
        if (b == null) {
            try {
                throw new IllegalStateException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int c = b.m331c();
        int a = b.m325a();
        int i4 = (i3 * 2) + c;
        int i5 = (i3 * 2) + a;
        int max = Math.max(i, i4);
        int max2 = Math.max(i2, i5);
        int min = Math.min(max / i4, max2 / i5);
        i5 = (max - (c * min)) / 2;
        i4 = (max2 - (a * min)) / 2;
        C0194n c0194n = new C0194n(max, max2);
        max2 = i4;
        for (int i6 = 0; i6 < a; i6++) {
            max = 0;
            i4 = i5;
            while (max < c) {
                try {
                    if (b.m324a(max, i6) == (byte) 1) {
                        c0194n.m1212a(i4, max2, min, min);
                    }
                    max++;
                    i4 += min;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            max2 += min;
        }
        return c0194n;
    }

    /* renamed from: z */
    private static String m405z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 9;
                    break;
                case 1:
                    i2 = 75;
                    break;
                case 2:
                    i2 = 86;
                    break;
                case 3:
                    i2 = 12;
                    break;
                default:
                    i2 = 111;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m406z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 111);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0194n mo7a(String str, C0217x c0217x, int i, int i2) throws fb {
        return mo8a(str, c0217x, i, i2, null);
    }

    /* renamed from: a */
    public C0194n mo8a(String str, C0217x c0217x, int i, int i2, Map<C0204i, ?> map) throws fb {
        try {
            if (str.isEmpty()) {
                throw new IllegalArgumentException(f199z[2]);
            }
            try {
                if (c0217x != C0217x.QR_CODE) {
                    throw new IllegalArgumentException(f199z[0] + c0217x);
                } else if (i < 0 || i2 < 0) {
                    try {
                        throw new IllegalArgumentException(f199z[1] + i + 'x' + i2);
                    } catch (fb e) {
                        throw e;
                    }
                } else {
                    C0046o c0046o;
                    int parseInt;
                    C0046o c0046o2 = C0046o.L;
                    if (map != null) {
                        try {
                            if (map.containsKey(C0204i.ERROR_CORRECTION)) {
                                c0046o2 = C0046o.valueOf(map.get(C0204i.ERROR_CORRECTION).toString());
                            }
                            if (map.containsKey(C0204i.MARGIN)) {
                                c0046o = c0046o2;
                                parseInt = Integer.parseInt(map.get(C0204i.MARGIN).toString());
                                return C0068d.m404a(C0064d.m371a(str, c0046o, (Map) map), i, i2, parseInt);
                            }
                        } catch (fb e2) {
                            throw e2;
                        }
                    }
                    c0046o = c0046o2;
                    parseInt = 4;
                    return C0068d.m404a(C0064d.m371a(str, c0046o, (Map) map), i, i2, parseInt);
                }
            } catch (fb e22) {
                throw e22;
            }
        } catch (fb e222) {
            throw e222;
        }
    }
}
