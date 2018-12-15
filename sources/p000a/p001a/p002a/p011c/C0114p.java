package p000a.p001a.p002a.p011c;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.ui.p065b.p067a.qb;
import fr.pcsoft.wdjava.ui.p069g.C1409j;
import java.util.Arrays;
import java.util.Map;
import p000a.p001a.p002a.C0208m;
import p000a.p001a.p002a.C0211r;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.p */
public final class C0114p extends C0091l {
    /* renamed from: a */
    private static final char[] f382a = f383c.toCharArray();
    /* renamed from: c */
    static final String f383c = C0114p.m666z(C0114p.m667z("\u0012vY*5\u0017q\\!8c\u0005(]Dd\u0000#PKi\u000b&WNr\u00169JUw\u0011<AXxjE9%\rlNxcA#A"));
    /* renamed from: e */
    private static final int f384e = f385f[47];
    /* renamed from: f */
    static final int[] f385f = new int[]{276, 328, 324, 322, 296, 292, 290, 336, C0607n.vk, C0607n.Gu, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, C1409j.f4188e, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
    /* renamed from: b */
    private final StringBuilder f386b = new StringBuilder(20);
    /* renamed from: d */
    private final int[] f387d = new int[6];

    /* renamed from: a */
    private static char m660a(int i) throws C0213t {
        int i2 = 0;
        while (i2 < f385f.length) {
            try {
                if (f385f[i2] == i) {
                    return f382a[i2];
                }
                i2++;
            } catch (C0213t e) {
                throw e;
            } catch (C0213t e2) {
                throw e2;
            }
        }
        throw C0213t.m1269a();
    }

    /* renamed from: a */
    private static int m661a(int[] iArr) {
        int i = 0;
        int i2 = 0;
        while (i < iArr.length) {
            i++;
            i2 = iArr[i] + i2;
        }
        int length = iArr.length;
        i = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int round = Math.round((((float) iArr[i3]) * 9.0f) / ((float) i2));
            if (round < 1 || round > 4) {
                return -1;
            }
            if ((i3 & 1) == 0) {
                int i4 = 0;
                while (i4 < round) {
                    i4++;
                    i = (i << 1) | 1;
                }
            } else {
                i <<= round;
            }
        }
        return i;
    }

    /* renamed from: a */
    private static String m662a(CharSequence charSequence) throws C0212s {
        int length = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            int i2;
            char charAt = charSequence.charAt(i);
            if (charAt < qb.f3206v || charAt > 'd') {
                stringBuilder.append(charAt);
                i2 = i;
            } else if (i >= length - 1) {
                try {
                    throw C0212s.m1267a();
                } catch (C0212s e) {
                    throw e;
                }
            } else {
                char charAt2 = charSequence.charAt(i + 1);
                switch (charAt) {
                    case 'a':
                        if (charAt2 >= qb.f3195j && charAt2 <= qb.f3192g) {
                            charAt = (char) (charAt2 - 64);
                            break;
                        }
                        throw C0212s.m1267a();
                        break;
                    case 'b':
                        if (charAt2 < qb.f3195j || charAt2 > 'E') {
                            if (charAt2 < 'F' || charAt2 > 'J') {
                                if (charAt2 < 'K' || charAt2 > 'O') {
                                    if (charAt2 < 'P' || charAt2 > qb.f3210z) {
                                        if (charAt2 >= qb.f3204t && charAt2 <= qb.f3192g) {
                                            charAt = '';
                                            break;
                                        }
                                        throw C0212s.m1267a();
                                    }
                                    charAt = (char) (charAt2 + 43);
                                    break;
                                }
                                charAt = (char) (charAt2 + 16);
                                break;
                            }
                            charAt = (char) (charAt2 - 11);
                            break;
                        }
                        charAt = (char) (charAt2 - 38);
                        break;
                        break;
                    case 'c':
                        if (charAt2 >= qb.f3195j && charAt2 <= 'O') {
                            charAt = (char) (charAt2 - 32);
                            break;
                        } else if (charAt2 == qb.f3192g) {
                            charAt = ':';
                            break;
                        } else {
                            throw C0212s.m1267a();
                        }
                        break;
                    case 'd':
                        if (charAt2 >= qb.f3195j && charAt2 <= qb.f3192g) {
                            charAt = (char) (charAt2 + 32);
                            break;
                        }
                        throw C0212s.m1267a();
                    default:
                        charAt = '\u0000';
                        break;
                }
                stringBuilder.append(charAt);
                i2 = i + 1;
            }
            i = i2 + 1;
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static void m663a(CharSequence charSequence, int i, int i2) throws C0211r {
        int i3 = 1;
        int i4 = i - 1;
        int i5 = 0;
        while (i4 >= 0) {
            int indexOf = (f383c.indexOf(charSequence.charAt(i4)) * i3) + i5;
            i5 = i3 + 1;
            if (i5 > i2) {
                i5 = 1;
            }
            i4--;
            i3 = i5;
            i5 = indexOf;
        }
        try {
            if (charSequence.charAt(i) != f382a[i5 % 47]) {
                throw C0211r.m1265a();
            }
        } catch (C0211r e) {
            throw e;
        }
    }

    /* renamed from: a */
    private int[] m664a(C0185f c0185f) throws C0213t {
        int a = c0185f.m1136a();
        int b = c0185f.m1143b(0);
        Arrays.fill(this.f387d, 0);
        int[] iArr = this.f387d;
        int length = iArr.length;
        int i = b;
        int i2 = 0;
        int i3 = b;
        b = 0;
        while (i < a) {
            try {
                int i4;
                if ((c0185f.m1149c(i) ^ i2) != 0) {
                    iArr[b] = iArr[b] + 1;
                    i4 = i2;
                    i2 = i3;
                    i3 = i4;
                } else {
                    int i5;
                    if (b == length - 1) {
                        try {
                            if (C0114p.m661a(iArr) == f384e) {
                                return new int[]{i3, i};
                            }
                            i5 = (iArr[0] + iArr[1]) + i3;
                            System.arraycopy(iArr, 2, iArr, 0, length - 2);
                            iArr[length - 2] = 0;
                            iArr[length - 1] = 0;
                            i3 = b - 1;
                        } catch (C0213t e) {
                            throw e;
                        }
                    }
                    i5 = i3;
                    i3 = b + 1;
                    try {
                        iArr[i3] = 1;
                        b = i2 == 0 ? 1 : 0;
                        i2 = i5;
                        i4 = b;
                        b = i3;
                        i3 = i4;
                    } catch (C0213t e2) {
                        throw e2;
                    }
                }
                i++;
                i4 = i3;
                i3 = i2;
                i2 = i4;
            } catch (C0213t e22) {
                throw e22;
            }
        }
        throw C0213t.m1269a();
    }

    /* renamed from: b */
    private static void m665b(CharSequence charSequence) throws C0211r {
        int length = charSequence.length();
        C0114p.m663a(charSequence, length - 2, 20);
        C0114p.m663a(charSequence, length - 1, 15);
    }

    /* renamed from: z */
    private static String m666z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 34;
                    break;
                case 1:
                    i2 = 71;
                    break;
                case 2:
                    i2 = 107;
                    break;
                case 3:
                    i2 = 25;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m667z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 1);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0208m mo20a(int i, C0185f c0185f, Map<C0216w, ?> map) throws C0213t, C0211r, C0212s {
        int b = c0185f.m1143b(m664a(c0185f)[1]);
        int a = c0185f.m1136a();
        int[] iArr = this.f387d;
        Arrays.fill(iArr, 0);
        CharSequence charSequence = this.f386b;
        charSequence.setLength(0);
        while (true) {
            C0091l.m519b(c0185f, b, iArr);
            int a2 = C0114p.m661a(iArr);
            if (a2 < 0) {
                throw C0213t.m1269a();
            }
            char a3 = C0114p.m660a(a2);
            charSequence.append(a3);
            int i2 = b;
            for (int i3 : iArr) {
                i2 += i3;
            }
            a2 = c0185f.m1143b(i2);
            if (a3 == '*') {
                break;
            }
            b = a2;
        }
        charSequence.deleteCharAt(charSequence.length() - 1);
        int i4 = 0;
        for (int i32 : iArr) {
            i4 += i32;
        }
        if (a2 != a) {
            try {
                if (c0185f.m1149c(a2)) {
                    try {
                        if (charSequence.length() < 2) {
                            throw C0213t.m1269a();
                        }
                        C0114p.m665b(charSequence);
                        charSequence.setLength(charSequence.length() - 2);
                        float f = ((float) b) + (((float) i4) / 2.0f);
                        return new C0208m(C0114p.m662a(charSequence), null, new eb[]{new eb(((float) (r4[1] + r4[0])) / 2.0f, (float) i), new eb(f, (float) i)}, C0217x.CODE_93);
                    } catch (C0213t e) {
                        throw e;
                    }
                }
            } catch (C0213t e2) {
                throw e2;
            }
        }
        throw C0213t.m1269a();
    }
}
