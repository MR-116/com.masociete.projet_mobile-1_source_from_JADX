package p000a.p001a.p002a.p022f;

import fr.pcsoft.wdjava.core.C0607n;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
import p000a.p001a.p002a.C0204i;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.cb;
import p000a.p001a.p002a.fb;
import p000a.p001a.p002a.p019g.C0194n;
import p000a.p001a.p002a.p022f.p023a.C0147b;
import p000a.p001a.p002a.p022f.p023a.C0149d;
import p000a.p001a.p002a.p022f.p023a.C0150e;

/* renamed from: a.a.a.f.g */
public final class C0174g implements cb {
    /* renamed from: a */
    static final int f665a = 2;
    /* renamed from: b */
    static final int f666b = 30;
    /* renamed from: z */
    private static final String f667z = C0174g.m1076z(C0174g.m1077z("l5(_\u0007A8?_\rA7)\u001b\r\u000f\u0004\u000297\u001beqSHM!2_\u000f@ f"));

    /* renamed from: a */
    private static C0194n m1073a(C0150e c0150e, String str, int i, int i2, int i3, int i4) throws fb {
        c0150e.m893a(str, i);
        byte[][] a = c0150e.m891a().m877a(1, 4);
        try {
            byte[][] a2;
            int i5;
            if (((a[0].length < a.length ? 1 : 0) ^ (i3 > i2 ? 1 : 0)) != 0) {
                a2 = C0174g.m1075a(a);
                i5 = 1;
            } else {
                a2 = a;
                i5 = 0;
            }
            int length = i2 / a2[0].length;
            int length2 = i3 / a2.length;
            if (length >= length2) {
                length = length2;
            }
            if (length <= 1) {
                return C0174g.m1074a(a2, i4);
            }
            byte[][] a3 = c0150e.m891a().m877a(length, length * 4);
            return C0174g.m1074a(i5 != 0 ? C0174g.m1075a(a3) : a3, i4);
        } catch (fb e) {
            throw e;
        }
    }

    /* renamed from: a */
    private static C0194n m1074a(byte[][] bArr, int i) {
        C0194n c0194n = new C0194n(bArr[0].length + (i * 2), bArr.length + (i * 2));
        c0194n.m1224g();
        int i2 = (c0194n.m1226i() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            int i4 = 0;
            while (i4 < bArr[0].length) {
                try {
                    if (bArr[i3][i4] == (byte) 1) {
                        c0194n.m1215b(i4 + i, i2);
                    }
                    i4++;
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            i3++;
            i2--;
        }
        return c0194n;
    }

    /* renamed from: a */
    private static byte[][] m1075a(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, new int[]{bArr[0].length, bArr.length});
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            int i2 = 0;
            while (i2 < bArr[0].length) {
                try {
                    bArr2[i2][length] = bArr[i][i2];
                    i2++;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        }
        return bArr2;
    }

    /* renamed from: z */
    private static String m1076z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 47;
                    break;
                case 1:
                    i2 = 84;
                    break;
                case 2:
                    i2 = 70;
                    break;
                case 3:
                    i2 = C0607n.bx;
                    break;
                default:
                    i2 = 104;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1077z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 104);
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
            if (c0217x != C0217x.PDF_417) {
                throw new IllegalArgumentException(f667z + c0217x);
            }
            int parseInt;
            int i3;
            C0150e c0150e = new C0150e();
            if (map != null) {
                try {
                    if (map.containsKey(C0204i.PDF417_COMPACT)) {
                        c0150e.m895a(Boolean.valueOf(map.get(C0204i.PDF417_COMPACT).toString()).booleanValue());
                    }
                    try {
                        if (map.containsKey(C0204i.PDF417_COMPACTION)) {
                            c0150e.m892a(C0147b.valueOf(map.get(C0204i.PDF417_COMPACTION).toString()));
                        }
                        if (map.containsKey(C0204i.PDF417_DIMENSIONS)) {
                            C0149d c0149d = (C0149d) map.get(C0204i.PDF417_DIMENSIONS);
                            c0150e.m896b(c0149d.m882c(), c0149d.m883d(), c0149d.m881b(), c0149d.m880a());
                        }
                        int parseInt2 = map.containsKey(C0204i.MARGIN) ? Integer.parseInt(map.get(C0204i.MARGIN).toString()) : 30;
                        parseInt = map.containsKey(C0204i.ERROR_CORRECTION) ? Integer.parseInt(map.get(C0204i.ERROR_CORRECTION).toString()) : 2;
                        if (map.containsKey(C0204i.CHARACTER_SET)) {
                            c0150e.m894a(Charset.forName(map.get(C0204i.CHARACTER_SET).toString()));
                        }
                        i3 = parseInt2;
                    } catch (fb e) {
                        throw e;
                    }
                } catch (fb e2) {
                    throw e2;
                }
            }
            i3 = 30;
            parseInt = 2;
            return C0174g.m1073a(c0150e, str, parseInt, i, i2, i3);
        } catch (fb e22) {
            throw e22;
        }
    }
}
