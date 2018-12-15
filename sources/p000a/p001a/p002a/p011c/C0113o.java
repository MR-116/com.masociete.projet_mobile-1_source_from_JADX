package p000a.p001a.p002a.p011c;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.ui.p065b.p067a.C1084x;
import fr.pcsoft.wdjava.ui.p065b.p067a.qb;
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

/* renamed from: a.a.a.c.o */
public final class C0113o extends C0091l {
    /* renamed from: a */
    private static final String f374a = C0113o.m657z(C0113o.m658z("\"k\u00150l'l\u0010;aS\u0018dG\u001dT\u001doJ\u0012Y\u0016jM\u0017B\u000buP\fG\fp[\u0001Hw\t#|=q\u0002"));
    /* renamed from: b */
    static final String f375b = C0113o.m657z(C0113o.m658z("\"k\u00150l'l\u0010;aS\u0018dG\u001dT\u001doJ\u0012Y\u0016jM\u0017B\u000buP\fG\fp[\u0001Hw\t#r6u\f&"));
    /* renamed from: d */
    static final int[] f376d = new int[]{52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, C0607n.vk, 82, 7, 262, 70, 22, 385, 193, 448, 145, C1084x.f3269t, C0607n.qj, 133, 388, C0607n.Uk, 148, 168, C0607n.Ru, 138, 42};
    /* renamed from: g */
    static final int f377g = f376d[39];
    /* renamed from: c */
    private final int[] f378c;
    /* renamed from: e */
    private final StringBuilder f379e;
    /* renamed from: f */
    private final boolean f380f;
    /* renamed from: h */
    private final boolean f381h;

    public C0113o() {
        this(false);
    }

    public C0113o(boolean z) {
        this(z, false);
    }

    public C0113o(boolean z, boolean z2) {
        this.f380f = z;
        this.f381h = z2;
        this.f379e = new StringBuilder(20);
        this.f378c = new int[9];
    }

    /* renamed from: a */
    private static char m653a(int i) throws C0213t {
        int i2 = 0;
        while (i2 < f376d.length) {
            try {
                if (f376d[i2] == i) {
                    return f375b.charAt(i2);
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
    private static int m654a(int[] iArr) {
        int i;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            int i3;
            int i4 = Integer.MAX_VALUE;
            for (int i5 : iArr) {
                if (i5 < i4 && i5 > r0) {
                    i4 = i5;
                }
            }
            i2 = 0;
            int i52 = 0;
            i = 0;
            for (i3 = 0; i3 < length; i3++) {
                int i6 = iArr[i3];
                if (i6 > i4) {
                    i2 |= 1 << ((length - 1) - i3);
                    i++;
                    i52 += i6;
                }
            }
            if (i == 3) {
                break;
            } else if (i <= 3) {
                return -1;
            } else {
                i2 = i4;
            }
        }
        int i7 = i;
        for (i = 0; i < length && i7 > 0; i++) {
            i3 = iArr[i];
            if (i3 > i4) {
                i7--;
                if (i3 * 2 >= i52) {
                    return -1;
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    private static String m655a(CharSequence charSequence) throws C0212s {
        int length = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            int i2;
            char charAt = charSequence.charAt(i);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                char charAt2 = charSequence.charAt(i + 1);
                switch (charAt) {
                    case '$':
                        if (charAt2 >= qb.f3195j && charAt2 <= qb.f3192g) {
                            charAt = (char) (charAt2 - 64);
                            break;
                        }
                        throw C0212s.m1267a();
                        break;
                    case '%':
                        if (charAt2 < qb.f3195j || charAt2 > 'E') {
                            if (charAt2 >= 'F' && charAt2 <= 'W') {
                                charAt = (char) (charAt2 - 11);
                                break;
                            }
                            throw C0212s.m1267a();
                        }
                        charAt = (char) (charAt2 - 38);
                        break;
                        break;
                    case '+':
                        if (charAt2 >= qb.f3195j && charAt2 <= qb.f3192g) {
                            charAt = (char) (charAt2 + 32);
                            break;
                        }
                        throw C0212s.m1267a();
                        break;
                    case '/':
                        if (charAt2 >= qb.f3195j && charAt2 <= 'O') {
                            charAt = (char) (charAt2 - 32);
                            break;
                        } else if (charAt2 == qb.f3192g) {
                            charAt = ':';
                            break;
                        } else {
                            throw C0212s.m1267a();
                        }
                    default:
                        charAt = '\u0000';
                        break;
                }
                stringBuilder.append(charAt);
                i2 = i + 1;
            } else {
                stringBuilder.append(charAt);
                i2 = i;
            }
            i = i2 + 1;
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static int[] m656a(C0185f c0185f, int[] iArr) throws C0213t {
        int a = c0185f.m1136a();
        int b = c0185f.m1143b(0);
        int length = iArr.length;
        int i = b;
        int i2 = b;
        int i3 = 0;
        b = 0;
        while (i < a) {
            try {
                if ((c0185f.m1149c(i) ^ b) != 0) {
                    iArr[i3] = iArr[i3] + 1;
                } else {
                    if (i3 == length - 1) {
                        try {
                            if (C0113o.m654a(iArr) == f377g) {
                                if (c0185f.m1142a(Math.max(0, i2 - ((i - i2) / 2)), i2, false)) {
                                    return new int[]{i2, i};
                                }
                            }
                            i2 += iArr[0] + iArr[1];
                            System.arraycopy(iArr, 2, iArr, 0, length - 2);
                            iArr[length - 2] = 0;
                            iArr[length - 1] = 0;
                            i3--;
                        } catch (C0213t e) {
                            throw e;
                        } catch (C0213t e2) {
                            throw e2;
                        }
                    }
                    i3++;
                    try {
                        iArr[i3] = 1;
                        b = b == 0 ? 1 : 0;
                    } catch (C0213t e22) {
                        throw e22;
                    }
                }
                i++;
            } catch (C0213t e222) {
                throw e222;
            }
        }
        throw C0213t.m1269a();
    }

    /* renamed from: z */
    private static String m657z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 18;
                    break;
                case 1:
                    i2 = 90;
                    break;
                case 2:
                    i2 = 39;
                    break;
                case 3:
                    i2 = 3;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m658z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 88);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0208m mo20a(int i, C0185f c0185f, Map<C0216w, ?> map) throws C0213t, C0211r, C0212s {
        int a;
        int i2;
        int[] iArr = this.f378c;
        Arrays.fill(iArr, 0);
        CharSequence charSequence = this.f379e;
        charSequence.setLength(0);
        int b = c0185f.m1143b(C0113o.m656a(c0185f, iArr)[1]);
        int a2 = c0185f.m1136a();
        while (true) {
            C0091l.m519b(c0185f, b, iArr);
            a = C0113o.m654a(iArr);
            if (a < 0) {
                throw C0213t.m1269a();
            }
            char a3 = C0113o.m653a(a);
            charSequence.append(a3);
            i2 = b;
            for (int i3 : iArr) {
                i2 += i3;
            }
            a = c0185f.m1143b(i2);
            if (a3 == '*') {
                break;
            }
            b = a;
        }
        charSequence.setLength(charSequence.length() - 1);
        int i4 = 0;
        for (int i32 : iArr) {
            i4 += i32;
        }
        i2 = (a - b) - i4;
        if (a == a2 || i2 * 2 >= i4) {
            if (this.f380f) {
                int length = charSequence.length() - 1;
                i2 = 0;
                for (a = 0; a < length; a++) {
                    i2 += f374a.indexOf(this.f379e.charAt(a));
                }
                try {
                    if (charSequence.charAt(length) != f374a.charAt(i2 % 43)) {
                        throw C0211r.m1265a();
                    }
                    charSequence.setLength(length);
                } catch (C0213t e) {
                    throw e;
                }
            }
            try {
                if (charSequence.length() == 0) {
                    throw C0213t.m1269a();
                }
                float f = ((float) b) + (((float) i4) / 2.0f);
                return new C0208m(this.f381h ? C0113o.m655a(charSequence) : charSequence.toString(), null, new eb[]{new eb(((float) (r6[1] + r6[0])) / 2.0f, (float) i), new eb(f, (float) i)}, C0217x.CODE_39);
            } catch (C0213t e2) {
                throw e2;
            }
        }
        try {
            throw C0213t.m1269a();
        } catch (C0213t e22) {
            throw e22;
        }
    }
}
