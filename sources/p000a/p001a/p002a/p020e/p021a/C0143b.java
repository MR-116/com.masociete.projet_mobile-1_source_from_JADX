package p000a.p001a.p002a.p020e.p021a;

import fr.pcsoft.wdjava.core.types.WDDateHeure;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import p000a.p001a.p002a.p019g.C0187h;

/* renamed from: a.a.a.e.a.b */
final class C0143b {
    /* renamed from: a */
    private static final String[] f490a = new String[]{C0143b.m850z(C0143b.m851z("#_9\u00162lX<\u001d?cU7\u00188fN*\u0007%}K-\u0002.pDﾁIk7￥[ﾩT\n:^sQ\u00017Q~Z\u00040TeG\u001b-O`@\u001e&Boﾇￛ￭ﾏﾭ")), C0143b.m850z(C0143b.m851z("I\u00196\u0012Lx\u001c=\u001fCu\u00178\u0018Fn\n'\u0005]k\r\"\u000ePdﾁIk7￥\u0000ﾩ\u000bWa@iK\u0017! \t+wA[yX\u0006$;t\nￕ￫ﾍﾩﾆￛ￭ﾏﾢ")), C0143b.m850z(C0143b.m851z("éß¹²ìØ¼¿ãÕ·¸æÎª¥ýË­®ðÄﾁIk7Å§¨ö´×äÄ«ÂïÊ ûÔôªþÓñ¡ﾌuﾏￚ￪ﾃ")), C0143b.m850z(C0143b.m851z("Éÿ¶Ìø½Ãõ¸Æî§Ýë¢ÐäﾁIk7￥©×áÚýÝ®ÏâÎ¡ñÞú¤ôÅç»ïﾢVￛ￧ﾏﾭ")), C0143b.m850z(C0143b.m851z(")\u001fyVr,\u0018|]#\u0015wXx&\u000ejGe=\u000bmBn0\u0004ﾁﾩﾊ2￥gHh6Û÷Õ»Ýòß°ÍÀà¾âÏíµåﾢVￛ￭ﾂﾭ")), C0143b.m850z(C0143b.m851z(")\u001fyVr,\u0018|]#\u0015wXx&\u000ejGe=\u000bmBn0\u0004`Ik7\u0001[tT\n:^sQ\u00017Q~Z\u00040TeG\u001b-O`@\u001e&BoM\u0015#Ej"))};
    /* renamed from: b */
    private static final char f491b = '￷';
    /* renamed from: c */
    private static final char f492c = '￸';
    /* renamed from: d */
    private static final char f493d = '￳';
    /* renamed from: e */
    private static final char f494e = '￻';
    /* renamed from: f */
    private static final char f495f = '\u001d';
    /* renamed from: g */
    private static final char f496g = '￺';
    /* renamed from: h */
    private static final char f497h = '\u001e';
    /* renamed from: i */
    private static final char f498i = '￲';
    /* renamed from: j */
    private static final char f499j = '￹';
    /* renamed from: k */
    private static final char f500k = '￼';
    /* renamed from: l */
    private static final char f501l = '￰';
    /* renamed from: m */
    private static final char f502m = '￴';
    /* renamed from: n */
    private static final char f503n = '￶';
    /* renamed from: o */
    private static final char f504o = '\u001c';
    /* renamed from: p */
    private static final char f505p = '￵';
    /* renamed from: q */
    private static final char f506q = '￱';
    /* renamed from: z */
    private static final String[] f507z = new String[]{C0143b.m850z(C0143b.m851z("\u0019.KeF\u0019.Ke")), C0143b.m850z(C0143b.m851z("r7EKF\u0018\u0003")), C0143b.m850z(C0143b.m851z("\u0019.K")), C0143b.m850z(C0143b.m851z("\u0019.KeF\u0019.KeF"))};

    private C0143b() {
    }

    /* renamed from: a */
    private static int m841a(int i, byte[] bArr) {
        int i2 = i - 1;
        try {
            return ((1 << (5 - (i2 % 6))) & bArr[i2 / 6]) == 0 ? 0 : 1;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: a */
    private static int m842a(byte[] bArr) {
        return C0143b.m843a(bArr, new byte[]{(byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 13, (byte) 14, (byte) 15, (byte) 16, WDDateHeure.f1518B, (byte) 18, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 1, (byte) 2});
    }

    /* renamed from: a */
    private static int m843a(byte[] bArr, byte[] bArr2) {
        int i = 0;
        try {
            if (bArr2.length == 0) {
                throw new IllegalArgumentException();
            }
            int i2 = 0;
            while (i < bArr2.length) {
                i2 += C0143b.m841a(bArr2[i], bArr) << ((bArr2.length - i) - 1);
                i++;
            }
            return i2;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: a */
    static C0187h m844a(byte[] bArr, int i) {
        StringBuilder stringBuilder = new StringBuilder(C0538a.Lb);
        switch (i) {
            case 2:
            case 3:
                String format;
                if (i == 2) {
                    format = new DecimalFormat(f507z[3].substring(0, C0143b.m846b(bArr))).format((long) C0143b.m842a(bArr));
                } else {
                    format = C0143b.m847c(bArr);
                }
                NumberFormat decimalFormat = new DecimalFormat(f507z[2]);
                String format2 = decimalFormat.format((long) C0143b.m848d(bArr));
                String format3 = decimalFormat.format((long) C0143b.m849e(bArr));
                try {
                    stringBuilder.append(C0143b.m845a(bArr, 10, 84));
                    if (!stringBuilder.toString().startsWith(f507z[1])) {
                        stringBuilder.insert(0, format + f495f + format2 + f495f + format3 + f495f);
                        break;
                    }
                    stringBuilder.insert(9, format + f495f + format2 + f495f + format3 + f495f);
                    break;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case 4:
                stringBuilder.append(C0143b.m845a(bArr, 1, 93));
                break;
            case 5:
                stringBuilder.append(C0143b.m845a(bArr, 1, 77));
                break;
        }
        return new C0187h(bArr, stringBuilder.toString(), null, String.valueOf(i));
    }

    /* renamed from: a */
    private static String m845a(byte[] bArr, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        int i3 = i;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        while (i3 < i + i2) {
            int i7;
            char charAt = f490a[i5].charAt(bArr[i3]);
            switch (charAt) {
                case '￰':
                case '￱':
                case '￲':
                case '￳':
                case '￴':
                    i6 = 1;
                    i7 = i5;
                    i5 = i3;
                    i3 = charAt - 65520;
                    i4 = i7;
                    break;
                case '￵':
                    i6 = 2;
                    i4 = i5;
                    i5 = i3;
                    i3 = 0;
                    break;
                case '￶':
                    i6 = 3;
                    i4 = i5;
                    i5 = i3;
                    i3 = 0;
                    break;
                case '￷':
                    i5 = i3;
                    i6 = -1;
                    i3 = 0;
                    break;
                case '￸':
                    i5 = i3;
                    i6 = -1;
                    i3 = 1;
                    break;
                case '￹':
                    i6 = -1;
                    i7 = i5;
                    i5 = i3;
                    i3 = i7;
                    break;
                case '￻':
                    i3++;
                    i3++;
                    i3++;
                    i3++;
                    i3++;
                    stringBuilder.append(new DecimalFormat(f507z[0]).format((long) (((((bArr[i3] << 24) + (bArr[i3] << 18)) + (bArr[i3] << 12)) + (bArr[i3] << 6)) + bArr[i3])));
                    i7 = i3;
                    i3 = i5;
                    i5 = i7;
                    break;
                default:
                    stringBuilder.append(charAt);
                    i7 = i3;
                    i3 = i5;
                    i5 = i7;
                    break;
            }
            int i8 = i6 - 1;
            if (i6 == 0) {
                i3 = i4;
            }
            i6 = i8;
            i7 = i3;
            i3 = i5 + 1;
            i5 = i7;
        }
        while (stringBuilder.length() > 0) {
            try {
                if (stringBuilder.charAt(stringBuilder.length() - 1) != f500k) {
                    return stringBuilder.toString();
                }
                stringBuilder.setLength(stringBuilder.length() - 1);
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private static int m846b(byte[] bArr) {
        return C0143b.m843a(bArr, new byte[]{(byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 31, (byte) 32});
    }

    /* renamed from: c */
    private static String m847c(byte[] bArr) {
        return String.valueOf(new char[]{f490a[0].charAt(C0143b.m843a(bArr, new byte[]{(byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 31, (byte) 32})), f490a[0].charAt(C0143b.m843a(bArr, new byte[]{(byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 25, (byte) 26})), f490a[0].charAt(C0143b.m843a(bArr, new byte[]{(byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 19, (byte) 20})), f490a[0].charAt(C0143b.m843a(bArr, new byte[]{(byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 13, (byte) 14})), f490a[0].charAt(C0143b.m843a(bArr, new byte[]{(byte) 15, (byte) 16, WDDateHeure.f1518B, (byte) 18, (byte) 7, (byte) 8})), f490a[0].charAt(C0143b.m843a(bArr, new byte[]{(byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 1, (byte) 2}))});
    }

    /* renamed from: d */
    private static int m848d(byte[] bArr) {
        return C0143b.m843a(bArr, new byte[]{(byte) 53, (byte) 54, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 37, (byte) 38});
    }

    /* renamed from: e */
    private static int m849e(byte[] bArr) {
        return C0143b.m843a(bArr, new byte[]{(byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 49, (byte) 50, (byte) 51, (byte) 52});
    }

    /* renamed from: z */
    private static String m850z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 41;
                    break;
                case 1:
                    i2 = 30;
                    break;
                case 2:
                    i2 = 123;
                    break;
                case 3:
                    i2 = 85;
                    break;
                default:
                    i2 = 118;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m851z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 118);
        }
        return toCharArray;
    }
}
