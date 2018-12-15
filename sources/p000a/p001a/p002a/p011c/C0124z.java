package p000a.p001a.p002a.p011c;

import java.util.EnumMap;
import java.util.Map;
import p000a.p001a.p002a.C0206k;
import p000a.p001a.p002a.C0208m;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.z */
final class C0124z {
    /* renamed from: c */
    private static final int[] f420c = new int[]{24, 20, 18, 17, 12, 6, 3, 10, 9, 5};
    /* renamed from: z */
    private static final String[] f421z = new String[]{C0124z.m722z(C0124z.m723z("]t~wM")), C0124z.m722z(C0124z.m723z("¦ç")), C0124z.m722z(C0124z.m723z("]}w~M")), C0124z.m722z(C0124z.m723z("17+#")), C0124z.m722z(C0124z.m723z("]}w~L")), C0124z.m722z(C0124z.m723z("Tj~w"))};
    /* renamed from: a */
    private final int[] f422a = new int[4];
    /* renamed from: b */
    private final StringBuilder f423b = new StringBuilder();

    C0124z() {
    }

    /* renamed from: a */
    private static int m717a(int i) throws C0213t {
        int i2 = 0;
        while (i2 < 10) {
            try {
                if (i == f420c[i2]) {
                    return i2;
                }
                i2++;
            } catch (C0213t e) {
                throw e;
            }
        }
        throw C0213t.m1269a();
    }

    /* renamed from: a */
    private int m718a(C0185f c0185f, int[] iArr, StringBuilder stringBuilder) throws C0213t {
        int[] iArr2 = this.f422a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int a = c0185f.m1136a();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < a; i3++) {
            int a2 = C0118t.m681a(c0185f, iArr2, i, C0118t.f402d);
            stringBuilder.append((char) ((a2 % 10) + 48));
            int i4 = 0;
            while (i4 < iArr2.length) {
                int i5 = iArr2[i4] + i;
                i4++;
                i = i5;
            }
            if (a2 >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = c0185f.m1152f(c0185f.m1143b(i));
            }
        }
        try {
            if (stringBuilder.length() != 5) {
                throw C0213t.m1269a();
            }
            try {
                if (C0124z.m719a(stringBuilder.toString()) == C0124z.m717a(i2)) {
                    return i;
                }
                throw C0213t.m1269a();
            } catch (C0213t e) {
                throw e;
            }
        } catch (C0213t e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    private static int m719a(CharSequence charSequence) {
        int i;
        int length = charSequence.length();
        int i2 = 0;
        for (i = length - 2; i >= 0; i -= 2) {
            i2 += charSequence.charAt(i) - 48;
        }
        i2 *= 3;
        for (i = length - 1; i >= 0; i -= 2) {
            i2 += charSequence.charAt(i) - 48;
        }
        return (i2 * 3) % 10;
    }

    /* renamed from: a */
    private static String m720a(String str) {
        String str2;
        switch (str.charAt(0)) {
            case '0':
                str2 = f421z[1];
                break;
            case '5':
                str2 = "$";
                break;
            case '9':
                if (!f421z[0].equals(str)) {
                    if (!f421z[4].equals(str)) {
                        if (!f421z[2].equals(str)) {
                            str2 = "";
                            break;
                        }
                        return f421z[3];
                    }
                    return f421z[5];
                }
                return null;
            default:
                str2 = "";
                break;
        }
        int parseInt = Integer.parseInt(str.substring(1));
        String valueOf = String.valueOf(parseInt / 100);
        parseInt %= 100;
        return str2 + valueOf + '.' + (parseInt < 10 ? "0" + parseInt : String.valueOf(parseInt));
    }

    /* renamed from: b */
    private static Map<C0206k, Object> m721b(String str) {
        if (str.length() != 5) {
            return null;
        }
        String a = C0124z.m720a(str);
        if (a == null) {
            return null;
        }
        Map<C0206k, Object> enumMap = new EnumMap(C0206k.class);
        enumMap.put(C0206k.SUGGESTED_PRICE, a);
        return enumMap;
    }

    /* renamed from: z */
    private static String m722z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 100;
                    break;
                case 1:
                    i2 = 68;
                    break;
                case 2:
                    i2 = 78;
                    break;
                case 3:
                    i2 = 71;
                    break;
                default:
                    i2 = 125;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m723z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 125);
        }
        return toCharArray;
    }

    /* renamed from: a */
    C0208m m724a(int i, C0185f c0185f, int[] iArr) throws C0213t {
        StringBuilder stringBuilder = this.f423b;
        stringBuilder.setLength(0);
        int a = m718a(c0185f, iArr, stringBuilder);
        String stringBuilder2 = stringBuilder.toString();
        Map b = C0124z.m721b(stringBuilder2);
        C0208m c0208m = new C0208m(stringBuilder2, null, new eb[]{new eb(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i), new eb((float) a, (float) i)}, C0217x.UPC_EAN_EXTENSION);
        if (b != null) {
            try {
                c0208m.m1253a(b);
            } catch (C0213t e) {
                throw e;
            }
        }
        return c0208m;
    }
}
