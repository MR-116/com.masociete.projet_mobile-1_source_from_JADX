package p000a.p001a.p002a.p011c;

import java.util.Map;
import p000a.p001a.p002a.C0204i;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.fb;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.c.f */
public class C0105f extends C0101b {
    /* renamed from: z */
    private static final String[] f337z = new String[]{C0105f.m618z(C0105f.m619z("6?,4 38)?-GL]CQ@IVN^MBSI[V_LT@SXI_M\\#0'0)%;fvej4")), C0105f.m618z(C0105f.m619z("Eop'{hbg'qhmqcq&MQCQY7-+4d{j'siz>")), C0105f.m618z(C0105f.m619z("Tkorquz{c4eapsqhzm'gnakkp&l{'xc}m'`nop',6.znsozm'xi`y+4d{j'siz>"))};

    /* renamed from: a */
    private static int m615a(String str, int i) {
        int length = str.length() - 1;
        int i2 = 1;
        int i3 = 0;
        while (length >= 0) {
            int indexOf = (f337z[0].indexOf(str.charAt(length)) * i2) + i3;
            i3 = i2 + 1;
            if (i3 > i) {
                i3 = 1;
            }
            length--;
            i2 = i3;
            i3 = indexOf;
        }
        return i3 % 47;
    }

    /* renamed from: a */
    private static void m616a(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            iArr[i2] = ((1 << (8 - i2)) & i) == 0 ? 0 : 1;
        }
    }

    /* renamed from: b */
    protected static int m617b(boolean[] zArr, int i, int[] iArr, boolean z) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            zArr[i] = iArr[i2] != 0;
            i2++;
            i = i3;
        }
        return 9;
    }

    /* renamed from: z */
    private static String m618z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 6;
                    break;
                case 1:
                    i2 = 14;
                    break;
                case 2:
                    i2 = 30;
                    break;
                case 3:
                    i2 = 7;
                    break;
                default:
                    i2 = 20;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m619z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 20);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0194n mo8a(String str, C0217x c0217x, int i, int i2, Map<C0204i, ?> map) throws fb {
        try {
            if (c0217x == C0217x.CODE_93) {
                return super.mo8a(str, c0217x, i, i2, map);
            }
            throw new IllegalArgumentException(f337z[1] + c0217x);
        } catch (fb e) {
            throw e;
        }
    }

    /* renamed from: a */
    public boolean[] mo21a(String str) {
        int length = str.length();
        if (length > 80) {
            try {
                throw new IllegalArgumentException(f337z[2] + length);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int i;
        int[] iArr = new int[9];
        boolean[] zArr = new boolean[((((str.length() + 2) + 2) * 9) + 1)];
        C0105f.m616a(C0114p.f385f[47], iArr);
        int b = C0105f.m617b(zArr, 0, iArr, true);
        for (i = 0; i < length; i++) {
            C0105f.m616a(C0114p.f385f[f337z[0].indexOf(str.charAt(i))], iArr);
            b += C0105f.m617b(zArr, b, iArr, true);
        }
        i = C0105f.m615a(str, 20);
        C0105f.m616a(C0114p.f385f[i], iArr);
        b += C0105f.m617b(zArr, b, iArr, true);
        C0105f.m616a(C0114p.f385f[C0105f.m615a(str + f337z[0].charAt(i), 15)], iArr);
        i = C0105f.m617b(zArr, b, iArr, true) + b;
        C0105f.m616a(C0114p.f385f[47], iArr);
        zArr[i + C0105f.m617b(zArr, i, iArr, true)] = true;
        return zArr;
    }
}
