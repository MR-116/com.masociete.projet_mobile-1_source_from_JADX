package p000a.p001a.p002a.p011c;

import java.util.Map;
import p000a.p001a.p002a.C0204i;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.fb;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.c.e */
public final class C0104e extends C0101b {
    /* renamed from: z */
    private static final String[] f336z = new String[]{C0104e.m611z(C0104e.m612z("X?>`\u0014]8;k\u0019)LO\u0017e.ID\u001aj#BA\u001do8_^\u0000t=X[\u000by2#\"s\nL!'v")), C0104e.m611z(C0104e.m612z("*ohsC\u0007`x6N\u001c}6s")), C0104e.m611z(C0104e.m612z(":k}&E\u001bzi7\u0000\u000bab'E\u0006zsS\u0000ay?DHlisL\r}sT\u0000obs\u0018X.h:G\u0001zsL\u0007`k\u0000\n{xsG\u0007z,")), C0104e.m611z(C0104e.m612z("+obsO\u0006busE\u0006mc7EHMC\u0017e7=5\u0000\n{xsG\u0007z,"))};

    /* renamed from: a */
    private static void m610a(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            iArr[i2] = ((1 << (8 - i2)) & i) == 0 ? 1 : 2;
        }
    }

    /* renamed from: z */
    private static String m611z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 104;
                    break;
                case 1:
                    i2 = 14;
                    break;
                case 2:
                    i2 = 12;
                    break;
                case 3:
                    i2 = 83;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m612z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 32);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0194n mo8a(String str, C0217x c0217x, int i, int i2, Map<C0204i, ?> map) throws fb {
        try {
            if (c0217x == C0217x.CODE_39) {
                return super.mo8a(str, c0217x, i, i2, map);
            }
            throw new IllegalArgumentException(f336z[3] + c0217x);
        } catch (fb e) {
            throw e;
        }
    }

    /* renamed from: a */
    public boolean[] mo21a(String str) {
        int length = str.length();
        if (length > 80) {
            try {
                throw new IllegalArgumentException(f336z[2] + length);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int indexOf;
        int[] iArr = new int[9];
        int i = length + 25;
        int i2 = 0;
        while (i2 < length) {
            indexOf = f336z[0].indexOf(str.charAt(i2));
            if (indexOf < 0) {
                try {
                    throw new IllegalArgumentException(f336z[1] + str);
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            C0104e.m610a(C0113o.f376d[indexOf], iArr);
            indexOf = i;
            for (int i3 : iArr) {
                indexOf += i3;
            }
            i2++;
            i = indexOf;
        }
        boolean[] zArr = new boolean[i];
        C0104e.m610a(C0113o.f377g, iArr);
        i = C0101b.m587a(zArr, 0, iArr, true);
        int[] iArr2 = new int[]{1};
        indexOf = i + C0101b.m587a(zArr, i, iArr2, false);
        for (i = 0; i < length; i++) {
            C0104e.m610a(C0113o.f376d[f336z[0].indexOf(str.charAt(i))], iArr);
            indexOf += C0101b.m587a(zArr, indexOf, iArr, true);
            indexOf += C0101b.m587a(zArr, indexOf, iArr2, false);
        }
        C0104e.m610a(C0113o.f377g, iArr);
        C0101b.m587a(zArr, indexOf, iArr, true);
        return zArr;
    }
}
