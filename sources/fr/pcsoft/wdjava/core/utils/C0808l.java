package fr.pcsoft.wdjava.core.utils;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.C0536n;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;
import fr.pcsoft.wdjava.p060p.C1013b;
import fr.pcsoft.wdjava.ui.p065b.p067a.qb;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: fr.pcsoft.wdjava.core.utils.l */
public class C0808l implements C0607n {
    private static Pattern Xx = null;
    private static final char[] Yx = new char[]{'À', 'Á', 'Â', 'Ã', 'Ä', 'Å', 'Ç', 'È', 'É', 'Ê', 'Ë', 'Ì', 'Í', 'Î', 'Ï', 'Ñ', 'Ò', 'Ó', 'Ô', 'Õ', 'Ö', 'Ù', 'Ú', 'Û', 'Ü', 'Ý', 'à', 'á', 'â', 'ã', 'ä', 'å', 'ç', 'è', 'é', 'ê', 'ë', 'ì', 'í', 'î', 'ï', 'ñ', 'ò', 'ó', 'ô', 'õ', 'ö', 'ù', 'ú', 'û', 'ü', C0607n.Jt, 'Š', 'š', 'Ÿ', 'Ž', 'ž'};
    public static final int Zx = 8;
    private static Pattern ay = null;
    public static final int by = 16;
    private static Pattern cy = null;
    private static final int[] dy = new int[]{0, 8, 8, 8, 8, 8, 8, 8, 8, 24, 24, 8, 8, 24, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 24, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 8, 8, 8, 8, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 8, 8, 8, 8, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 8, 8, 8, 8, 8, 8, 8, 8, 0, 8, 8, 8, 8, 8, 8, 4, 8, 0, 8, 4, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 0, 6, 8, 2, 8, 6, 4, 24, 8, 8, 8, 8, 8, 8, 8, 8, 8, 0, 8, 8, 8, 8, 8, 8, 8, 0, 0, 8, 8, 8, 8, 8, 0, 0, 8, 0, 0, 0, 8, 4, 4, 4, 4, 4, 4, 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0, 4, 4, 4, 4, 4, 4, 8, 4, 4, 4, 4, 4, 4, 0, 0, 6, 6, 6, 6, 6, 6, 2, 6, 6, 6, 6, 6, 6, 6, 6, 6, 2, 6, 6, 6, 6, 6, 6, 8, 6, 6, 6, 6, 6, 6, 2, 6};
    public static final int ey = 10;
    private static final char[] fy = new char[]{qb.f3195j, qb.f3195j, qb.f3195j, qb.f3195j, qb.f3195j, qb.f3195j, qb.f3208x, 'E', 'E', 'E', 'E', 'I', 'I', 'I', 'I', 'N', 'O', 'O', 'O', 'O', 'O', 'U', 'U', 'U', 'U', 'Y', qb.f3206v, qb.f3206v, qb.f3206v, qb.f3206v, qb.f3206v, qb.f3206v, qb.f3191f, 'e', 'e', 'e', 'e', 'i', 'i', 'i', 'i', 'n', 'o', 'o', 'o', 'o', 'o', 'u', 'u', 'u', 'u', 'y', qb.f3210z, qb.f3194i, 'Y', qb.f3192g, qb.f3196k};
    private static Pattern gy = null;
    private static final char[] hy = new char[]{'€', '', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '', 'Ž', '', '', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '', 'ž', 'Ÿ', ' ', '¡', '¢', '£', '¤', '¥', '¦', '§', '¨', '©', 'ª', '«', '¬', '­', '®', '¯', '°', '±', '²', '³', '´', 'µ', '¶', '·', '¸', '¹', 'º', '»', '¼', '½', '¾', '¿', 'À', 'Á', 'Â', 'Ã', 'Ä', 'Å', 'Æ', 'Ç', 'È', 'É', 'Ê', 'Ë', 'Ì', 'Í', 'Î', 'Ï', 'Ð', 'Ñ', 'Ò', 'Ó', 'Ô', 'Õ', 'Ö', '×', 'Ø', 'Ù', 'Ú', 'Û', 'Ü', 'Ý', 'Þ', 'ß', 'à', 'á', 'â', 'ã', 'ä', 'å', 'æ', 'ç', 'è', 'é', 'ê', 'ë', 'ì', 'í', 'î', 'ï', 'ð', 'ñ', 'ò', 'ó', 'ô', 'õ', 'ö', '÷', 'ø', 'ù', 'ú', 'û', 'ü', 'ý', 'þ', C0607n.Jt};
    private static final int[] iy = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 40, 41, 42, 43, 44, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 38, 45, 46, 47, 48, 49, 50, 33, 51, 52, 53, 88, 54, 34, 55, 56, 115, 119, 121, 123, 125, 126, C0607n.bx, 128, C0607n.Wj, 130, 57, 58, 89, 90, 91, 59, 60, C0538a.tb, 149, 151, 155, 159, 169, 172, 174, C0607n.aw, C0607n.pw, 188, 190, 192, C0607n.nn, C0607n.jk, 215, 217, 219, C0607n.Qt, 226, 231, C0607n.bh, C0607n.Xn, 245, 247, 252, 61, 62, 63, 64, 66, 67, 131, 148, C0536n.f1006y, 154, 158, 168, 171, 173, C0607n.hu, 185, 187, 189, 191, 193, C0607n.Eg, 214, 216, 218, C0607n.Tv, 225, C0607n.no, 240, 242, C0607n.uw, 246, 251, 68, 69, 70, 71, 27, 114, 28, 82, C0536n.f1002n, 85, 112, 109, 110, 65, 113, 223, 86, 213, 29, 254, 30, 31, 80, 81, 83, 84, 111, 36, 37, 79, C0607n.Yw, C0607n.Cv, 87, C0607n.Ep, 32, 253, C0607n.Ux, 39, 72, 97, 98, 99, 100, 73, 101, 74, 102, 133, 93, 103, 35, 104, 75, 105, 92, 122, C0607n.Hn, 76, 106, 107, 108, 77, C0607n.co, 199, 94, 116, 117, 118, 78, 137, C0538a.Nb, 139, 143, 141, 145, 147, 153, C0607n.Ao, C0607n.kh, 165, 167, 180, C0607n.Gk, 182, 184, 157, C0607n.Uk, C0607n.f1465w, C0607n.Bf, C0607n.f1441Y, C0607n.af, C0607n.Px, 95, C0607n.lh, 235, 233, C0607n.yk, C0607n.Au, 249, 228, 224, 136, C0607n.Fb, 138, C0536n.f995G, C0542t.f1193i, C0538a.Lb, 146, 152, C0607n.Ru, 160, 164, 166, C0607n.yt, C0607n.Nr, 181, 183, 156, C0607n.oq, C0607n.Ug, C0607n.Dt, 204, C0607n.qj, C0607n.me, 96, C0607n.Bs, C0607n.Jn, 232, 236, 238, 248, 227, 255};
    private static final String[] jy = new String[]{C0808l.m4065z(C0808l.m4066z("\u001eo\u0000")), C0808l.m4065z(C0808l.m4066z("\u001co\u0003")), C0808l.m4065z(C0808l.m4066z("\u001ei\u0007&i\u001f")), C0808l.m4065z(C0808l.m4066z("\u001eo\u0000%")), C0808l.m4065z(C0808l.m4066z(";K")), C0808l.m4065z(C0808l.m4066z(",Y`0E(Kc&\u0016%L/0C1Y}*[$[//S2\tl\"D J{«D$Z/\"U\"La7C¨L|cW7LlcZ \tl/W2Zjc\\ _nmB$Q{mx.[b\"Z(Sj1\u0018")), C0808l.m4065z(C0808l.m4066z("j1RF-u.Dm*X(Gh\u0007_ J}*B(Jn/{ [d0Kj")), C0808l.m4065z(C0808l.m4066z("\u0015\u0002fK\u0006i\u0000zL\n\u001e`A\u0015w\r`K\u0006")), C0808l.m4065z(C0808l.m4066z("\u0010-]4")), C0808l.m4065z(C0808l.m4066z("\u0010 Dx")), C0808l.m4065z(C0808l.m4066z("\u0010 Y`0\r")), C0808l.m4065z(C0808l.m4066z("\u0010&]4")), C0808l.m4065z(C0808l.m4066z("\u00100\\`7\r")), C0808l.m4065z(C0808l.m4066z("\u0015\u0015hF\u000fz\u0004v@\u0000b\u0004}\\")), C0808l.m4065z(C0808l.m4066z("\u0015\u0015hF\u000fz\u0004v@\u0000b\u0004}")), C0808l.m4065z(C0808l.m4066z("\u0015\u0015hF\u000fz\u0004vH\nq\u0000v@\u0000b\u0004}")), C0808l.m4065z(C0808l.m4066z("\u0015\u0015hF\u000fz\u0004vD\nz\u000ev@\u0000b\u0004}")), C0808l.m4065z(C0808l.m4066z("\u0015\u0015hF\u000fz\u0004v[\u0006d\u0000v@\u0000b\u0004}")), C0808l.m4065z(C0808l.m4066z("\u0015\u0015hF\u000fz\u0004vB\u0006q\u0000v@\u0000b\u0004}")), C0808l.m4065z(C0808l.m4066z("c/L/&D3Lz1\u00162\u000ej0BaY},R4@{&\u0016%\\}\"X5\tcdS/J`'W&L/'\u00114GjcU)Hf-SaLacT Zju\u0002o")), C0808l.m4065z(C0808l.m4066z("c/L/&D3Lz1\u00162\u000ej0BaY},R4@{&\u0016%\\}\"X5\tc&\u0016%Àl,R NjcRf\\acT4Oi&DaLacT Zju\u0002o"))};

    /* renamed from: a */
    public static int m4007a(char c) {
        if (c >= '\u0000' && c <= '') {
            return dy[c];
        }
        int b = C0808l.m4031b(c);
        return b != -1 ? dy[b] : 16;
    }

    /* renamed from: a */
    public static final int m4008a(String str, String str2, int i) {
        int i2 = 0;
        if (C0808l.m4053k(str) || C0808l.m4053k(str2)) {
            return 0;
        }
        String a = C0808l.m4016a(str, i, 0);
        String a2 = C0808l.m4016a(str2, i, 0);
        if (!a.startsWith(a2)) {
            return 0;
        }
        if ((i & 1) > 0 || (i & 2) > 0) {
            int length = str.length();
            int length2 = a2.length();
            int i3 = 0;
            while (i2 < length2 && i3 < length) {
                if (str.charAt(i3) == a2.charAt(i2)) {
                    i2++;
                }
                i3++;
            }
            if (i2 >= length2) {
                return i3;
            }
        }
        return a2.length();
    }

    /* renamed from: a */
    public static int m4009a(String str, StringBuffer stringBuffer) {
        int i = -1;
        if (!(str == null || str.equals(""))) {
            int i2 = 0;
            while (i2 < str.length()) {
                char charAt = str.charAt(i2);
                if (charAt != '&') {
                    stringBuffer.append(charAt);
                } else if (i2 < str.length() - 1) {
                    i2++;
                    charAt = str.charAt(i2);
                    stringBuffer.append(charAt);
                    if (charAt != '&') {
                        i = stringBuffer.length() - 1;
                    }
                } else {
                    stringBuffer.append(' ');
                    i = stringBuffer.length() - 1;
                }
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static final int m4010a(String str, char[] cArr, int i) {
        int i2 = -1;
        for (char indexOf : cArr) {
            int indexOf2 = str.indexOf(indexOf, i);
            if (indexOf2 >= 0 && (i2 == -1 || indexOf2 < i2)) {
                if (indexOf2 == 0) {
                    return indexOf2;
                }
                i2 = indexOf2;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static final int m4011a(byte[] bArr, byte[] bArr2) {
        int length = bArr2.length;
        if (length > bArr.length) {
            return 0;
        }
        for (int length2 = bArr.length - length; length2 < bArr.length; length2++) {
            if (bArr[length2] != bArr2[length2]) {
                return 0;
            }
        }
        return length;
    }

    /* renamed from: a */
    public static String m4012a(double d, int i) {
        int i2;
        double d2;
        String c;
        String str;
        int i3 = 2;
        String str2 = "";
        if (d < 0.0d) {
            d = Math.abs(d);
            i2 = -1;
        } else {
            i2 = 1;
        }
        if (i == 5182) {
            i = d >= 1.099511627776E12d ? 5 : d >= 1.073741824E9d ? 4 : d >= 1048576.0d ? 3 : d >= 1024.0d ? 2 : 1;
        }
        str2 = WDProjet.getInstance().getUniteTailleFichier();
        String[] b = str2 != null ? C0808l.m4040b(str2) : null;
        switch (i) {
            case 1:
                d2 = (double) ((int) d);
                if (d2 > 1.0d) {
                    c = (b == null || b.length < 1) ? C0745b.m3224c(jy[13], new String[0]) : b[0];
                    str = c;
                    break;
                }
                c = (b == null || b.length < 1) ? C0745b.m3224c(jy[14], new String[0]) : b[0];
                str = c;
                break;
                break;
            case 2:
                d2 = d / 1024.0d;
                c = (b == null || b.length < 2) ? C0745b.m3224c(jy[16], new String[0]) : b[1];
                str = c;
                break;
            case 3:
                d2 = d / 1048576.0d;
                c = (b == null || b.length < 3) ? C0745b.m3224c(jy[18], new String[0]) : b[2];
                str = c;
                break;
            case 4:
                d2 = d / 1.073741824E9d;
                c = (b == null || b.length < 4) ? C0745b.m3224c(jy[15], new String[0]) : b[3];
                str = c;
                break;
            case 5:
                d2 = d / 1.099511627776E12d;
                c = (b == null || b.length < 5) ? C0745b.m3224c(jy[17], new String[0]) : b[4];
                str = c;
                break;
            default:
                return "";
        }
        NumberFormat instance = NumberFormat.getInstance();
        instance.setMaximumFractionDigits(2);
        if (i == 1) {
            i3 = 0;
        }
        instance.setMinimumFractionDigits(i3);
        instance.setGroupingUsed(false);
        if (instance instanceof DecimalFormat) {
            c = WDProjet.getInstance().getSeparateurDecimale();
            if (!C0808l.m4053k(c)) {
                char charAt = c.charAt(0);
                DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) instance).getDecimalFormatSymbols();
                if (decimalFormatSymbols.getDecimalSeparator() != charAt) {
                    decimalFormatSymbols.setDecimalSeparator(charAt);
                    ((DecimalFormat) instance).setDecimalFormatSymbols(decimalFormatSymbols);
                }
            }
        }
        return instance.format(((double) i2) * d2) + " " + str;
    }

    /* renamed from: a */
    public static String m4013a(int i) {
        StringBuffer stringBuffer = new StringBuffer(i);
        int i2 = 0;
        while (i2 < i) {
            int a = C0817u.m4149a(48, 122);
            if (a < 58 || ((a > 64 && a < 91) || a > 96)) {
                stringBuffer.append((char) a);
            } else {
                i2--;
            }
            i2++;
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static final String m4014a(String str, char c) {
        if (str.indexOf(c) < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder stringBuilder = new StringBuilder(length - 1);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (c != charAt) {
                stringBuilder.append(charAt);
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static final String m4015a(String str, int i) {
        int length = str.length();
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[(length - 1) - ((i2 + i) % length)] = str.charAt(i2);
        }
        return String.valueOf(cArr);
    }

    /* renamed from: a */
    public static String m4016a(String str, int i, int i2) {
        Object obj = 1;
        Object obj2 = ((i & 64) == 64 || (i & 16) == 16) ? 1 : null;
        Object obj3 = (i & 32) == 32 ? 1 : null;
        Object obj4 = (i & 4) == 4 ? 1 : null;
        Object obj5 = (i & 1) == 1 ? 1 : null;
        Object obj6 = (i & 8) == 8 ? 1 : null;
        if ((i & 2) != 2) {
            obj = null;
        }
        int length = str.length();
        StringBuilder stringBuilder = new StringBuilder(str);
        int i3 = i2;
        while (i3 < length) {
            int a;
            char c;
            char charAt = stringBuilder.charAt(i3);
            if (obj != null) {
                a = C0808l.m4007a(charAt);
                if ((a & 8) == 8 || (a & 10) == 10) {
                    stringBuilder.deleteCharAt(i3);
                    length--;
                    i3--;
                    i3++;
                }
            }
            if (obj4 != null && charAt >= 'À') {
                a = Arrays.binarySearch(Yx, charAt);
                if (a >= 0) {
                    c = fy[a];
                    if (obj2 != null) {
                        c = Character.toLowerCase(c);
                    } else if (obj3 != null) {
                        c = Character.toUpperCase(c);
                    }
                    if (obj6 != null) {
                        c = C0808l.m4041c(c);
                    }
                    if (c != charAt) {
                        stringBuilder.setCharAt(i3, c);
                    }
                    i3++;
                }
            }
            c = charAt;
            if (obj2 != null) {
                c = Character.toLowerCase(c);
            } else if (obj3 != null) {
                c = Character.toUpperCase(c);
            }
            if (obj6 != null) {
                c = C0808l.m4041c(c);
            }
            if (c != charAt) {
                stringBuilder.setCharAt(i3, c);
            }
            i3++;
        }
        String stringBuilder2 = stringBuilder.toString();
        return (obj5 == null || obj != null) ? stringBuilder2 : stringBuilder2.trim();
    }

    /* renamed from: a */
    public static String m4017a(String str, int i, String str2) {
        if (i < 0) {
            return "";
        }
        if (str.length() >= i) {
            return str.substring(0, i);
        }
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        char charAt = str2.charAt(0);
        StringBuffer stringBuffer = new StringBuffer(str);
        while (stringBuffer.length() < i) {
            stringBuffer.append(charAt);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m4018a(String str, String str2, String str3) {
        return C0808l.m4036b(str, str2, str3, 0);
    }

    /* renamed from: a */
    public static final String m4019a(String str, String str2, String str3, int i) {
        int i2 = 0;
        if (str2.equals("") || str.equals("")) {
            return str;
        }
        String a;
        StringBuffer stringBuffer = new StringBuffer(str.length());
        if (i > 0) {
            a = C0808l.m4016a(str, i, 0);
            str2 = C0808l.m4016a(str2, i, 0);
        } else {
            a = str;
        }
        while (true) {
            int indexOf = a.indexOf(str2, i2);
            if (indexOf != -1) {
                stringBuffer.append(str.substring(i2, indexOf)).append(str3);
                i2 = str2.length() + indexOf;
            } else {
                stringBuffer.append(str.substring(i2));
                return stringBuffer.toString();
            }
        }
    }

    /* renamed from: a */
    public static String m4020a(String str, boolean z) {
        if (z && str.equals(jy[1])) {
            return jy[3];
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 5);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case '$':
                case '(':
                case ')':
                case '+':
                case '.':
                case '[':
                case ']':
                case '^':
                case '{':
                case C0607n.Hn /*124*/:
                case '}':
                    stringBuffer.append("\\").append(charAt);
                    break;
                case '*':
                    if (!z) {
                        stringBuffer.append("\\").append(charAt);
                        break;
                    }
                    stringBuffer.append(jy[2]);
                    break;
                case '?':
                    if (!z) {
                        stringBuffer.append("\\").append(charAt);
                        break;
                    }
                    stringBuffer.append(jy[0]);
                    break;
                default:
                    stringBuffer.append(charAt);
                    break;
            }
        }
        return z ? stringBuffer.insert(0, '(').append(')').toString() : stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m4021a(String str, String... strArr) {
        StringBuffer stringBuffer = new StringBuffer(str.length());
        if (strArr == null) {
            strArr = new String[0];
        }
        int indexOf = str.indexOf(37);
        int i = 0;
        while (indexOf != -1) {
            int parseInt;
            String str2 = "";
            int i2 = indexOf + 1;
            while (i2 < str.length() && Character.isDigit(str.charAt(i2))) {
                str2 = str2 + str.charAt(i2);
                i2++;
            }
            stringBuffer.append(str.substring(i, indexOf));
            if (!str2.equals("")) {
                parseInt = Integer.parseInt(str2);
                if (parseInt > 0 && parseInt <= strArr.length) {
                    if (strArr[parseInt - 1] == null) {
                        for (i2 = parseInt; i2 < strArr.length; i2++) {
                            if (strArr[i2] != null) {
                                stringBuffer.append(strArr[i2]);
                            }
                        }
                        return stringBuffer.toString();
                    }
                    stringBuffer.append(strArr[parseInt - 1]);
                }
                parseInt = i2;
            } else if (i2 >= str.length() || str.charAt(i2) != '%') {
                parseInt = i2 - 1;
            } else {
                stringBuffer.append('%');
                i2++;
                parseInt = i2;
            }
            indexOf = str.indexOf(37, i2);
            i = parseInt;
        }
        stringBuffer.append(str.substring(i, str.length()));
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m4022a(String str, String[] strArr, String str2, int i) {
        if (r5 == 0) {
            return str;
        }
        if (r5 == 1) {
            return C0808l.m4018a(str, strArr[0], str2);
        }
        int i2;
        StringBuilder stringBuilder = new StringBuilder();
        String a;
        if (i > 0) {
            a = C0808l.m4016a(str, i, 0);
            for (i2 = 0; i2 < r5; i2++) {
                strArr[i2] = C0808l.m4016a(strArr[i2], i, 0);
            }
        } else {
            a = str;
        }
        int length = str.length();
        i2 = 0;
        while (i2 < length) {
            int i3;
            char charAt = str.charAt(i2);
            for (String str3 : strArr) {
                if (str3.length() > 0 && r0.indexOf(str3, i2) == i2) {
                    stringBuilder.append(str2);
                    i2 += str3.length();
                    i3 = 1;
                    break;
                }
            }
            i3 = 0;
            if (i3 == 0) {
                stringBuilder.append(charAt);
                i2++;
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static final String m4023a(String... strArr) {
        int i = 0;
        String str = "";
        if (strArr.length <= 1) {
            return strArr.length > 0 ? strArr[0] : str;
        } else {
            StringBuffer stringBuffer = new StringBuffer(80);
            for (String str2 : strArr) {
                if (i > 0) {
                    stringBuffer.append(jy[4]);
                }
                stringBuffer.append(str2);
                i++;
            }
            return stringBuffer.toString();
        }
    }

    /* renamed from: a */
    public static final String m4024a(String[] strArr, String str) {
        if (strArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(strArr[i]);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static final boolean m4025a(char c, char c2, boolean z, boolean z2) {
        char toLowerCase;
        char toLowerCase2;
        if (z) {
            toLowerCase = Character.toLowerCase(c);
            toLowerCase2 = Character.toLowerCase(c2);
        } else {
            toLowerCase2 = c2;
            toLowerCase = c;
        }
        if (z2) {
            int binarySearch;
            if (toLowerCase >= 'À') {
                binarySearch = Arrays.binarySearch(Yx, toLowerCase);
                if (binarySearch >= 0) {
                    toLowerCase = fy[binarySearch];
                }
            }
            if (toLowerCase2 >= 'À') {
                binarySearch = Arrays.binarySearch(Yx, toLowerCase2);
                if (binarySearch >= 0) {
                    toLowerCase2 = fy[binarySearch];
                }
            }
        }
        return toLowerCase == toLowerCase2;
    }

    /* renamed from: a */
    public static final boolean m4026a(WDObjet wDObjet, int i, int i2) {
        return (i == 0 || (C0808l.m4007a(wDObjet.getCharAt(i - 1)) & 10) == 10 || (C0808l.m4007a(wDObjet.getCharAt(i - 1)) & 8) == 8) && (i + i2 == wDObjet.getNbCaractere() || (C0808l.m4007a(wDObjet.getCharAt(i + i2)) & 10) == 10 || (C0808l.m4007a(wDObjet.getCharAt(i + i2)) & 8) == 8);
    }

    /* renamed from: a */
    public static boolean m4027a(byte[] bArr) {
        int length = bArr.length;
        if (length == 0 || length % 4 != 0) {
            return false;
        }
        int i = 0;
        while (i < length) {
            if (yb.m4190a(bArr[i]) < 0 && !C0808l.m4043c(bArr[i])) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: a */
    public static String[] m4028a(String str) {
        if (ay == null) {
            ay = Pattern.compile(C0607n.Gc);
        }
        return ay.split(str, -1);
    }

    /* renamed from: a */
    public static String[] m4029a(String str, String str2) {
        return str2.equals(C0607n.Gc) ? C0808l.m4028a(str) : str2.equals(jy[4]) ? C0808l.m4055m(str) : str.split(C0808l.m4020a(str2, false), -1);
    }

    /* renamed from: b */
    public static final char m4030b(int i) throws C1013b {
        if (i >= 0 && i <= 255) {
            return i < 128 ? (char) i : hy[i - 128];
        } else {
            try {
                throw new C1013b(C0745b.m3222b(jy[7], String.valueOf(i)));
            } catch (C1013b e) {
                throw e;
            }
        }
    }

    /* renamed from: b */
    public static int m4031b(char c) {
        if (c >= '\u0000' && c <= '') {
            return c;
        }
        switch (c) {
            case C0607n.Wj /*129*/:
                return C0607n.Wj;
            case '':
                return 141;
            case '':
                return 143;
            case C0538a.Lb /*144*/:
                return C0538a.Lb;
            case '':
                return 157;
            case ' ':
                return 160;
            case C0607n.kh /*161*/:
                return C0607n.kh;
            case C0607n.Ru /*162*/:
                return C0607n.Ru;
            case C0607n.Ao /*163*/:
                return C0607n.Ao;
            case '¤':
                return 164;
            case '¥':
                return 165;
            case '¦':
                return 166;
            case '§':
                return 167;
            case '¨':
                return 168;
            case '©':
                return 169;
            case C0536n.f1002n /*170*/:
                return C0536n.f1002n;
            case '«':
                return 171;
            case '¬':
                return 172;
            case '­':
                return 173;
            case '®':
                return 174;
            case C0607n.hu /*175*/:
                return C0607n.hu;
            case C0607n.aw /*176*/:
                return C0607n.aw;
            case C0607n.Nr /*177*/:
                return C0607n.Nr;
            case C0607n.Gk /*178*/:
                return C0607n.Gk;
            case C0607n.yt /*179*/:
                return C0607n.yt;
            case '´':
                return 180;
            case 'µ':
                return 181;
            case '¶':
                return 182;
            case '·':
                return 183;
            case '¸':
                return 184;
            case '¹':
                return 185;
            case C0607n.pw /*186*/:
                return C0607n.pw;
            case '»':
                return 187;
            case '¼':
                return 188;
            case '½':
                return 189;
            case '¾':
                return 190;
            case '¿':
                return 191;
            case 'À':
                return 192;
            case 'Á':
                return 193;
            case C0607n.nn /*194*/:
                return C0607n.nn;
            case C0607n.oq /*195*/:
                return C0607n.oq;
            case C0607n.Uk /*196*/:
                return C0607n.Uk;
            case C0607n.Eg /*197*/:
                return C0607n.Eg;
            case C0607n.jk /*198*/:
                return C0607n.jk;
            case 'Ç':
                return 199;
            case C0607n.Dt /*200*/:
                return C0607n.Dt;
            case C0607n.Bf /*201*/:
                return C0607n.Bf;
            case C0607n.Ug /*202*/:
                return C0607n.Ug;
            case C0607n.f1465w /*203*/:
                return C0607n.f1465w;
            case 'Ì':
                return 204;
            case C0607n.f1441Y /*205*/:
                return C0607n.f1441Y;
            case C0607n.me /*206*/:
                return C0607n.me;
            case C0607n.Px /*207*/:
                return C0607n.Px;
            case C0607n.qj /*208*/:
                return C0607n.qj;
            case C0607n.af /*209*/:
                return C0607n.af;
            case C0607n.Bs /*210*/:
                return C0607n.Bs;
            case C0607n.lh /*211*/:
                return C0607n.lh;
            case C0607n.Ep /*212*/:
                return C0607n.Ep;
            case 'Õ':
                return 213;
            case 'Ö':
                return 214;
            case '×':
                return 215;
            case 'Ø':
                return 216;
            case 'Ù':
                return 217;
            case 'Ú':
                return 218;
            case 'Û':
                return 219;
            case C0607n.Tv /*220*/:
                return C0607n.Tv;
            case C0607n.Qt /*221*/:
                return C0607n.Qt;
            case C0607n.Cv /*222*/:
                return C0607n.Cv;
            case 'ß':
                return 223;
            case 'à':
                return 224;
            case 'á':
                return 225;
            case 'â':
                return 226;
            case 'ã':
                return 227;
            case 'ä':
                return 228;
            case C0607n.Yw /*229*/:
                return C0607n.Yw;
            case C0607n.no /*230*/:
                return C0607n.no;
            case 'ç':
                return 231;
            case 'è':
                return 232;
            case 'é':
                return 233;
            case C0607n.Jn /*234*/:
                return C0607n.Jn;
            case 'ë':
                return 235;
            case 'ì':
                return 236;
            case C0607n.yk /*237*/:
                return C0607n.yk;
            case 'î':
                return 238;
            case C0607n.Au /*239*/:
                return C0607n.Au;
            case 'ð':
                return 240;
            case C0607n.bh /*241*/:
                return C0607n.bh;
            case 'ò':
                return 242;
            case C0607n.Xn /*243*/:
                return C0607n.Xn;
            case C0607n.uw /*244*/:
                return C0607n.uw;
            case 'õ':
                return 245;
            case 'ö':
                return 246;
            case '÷':
                return 247;
            case 'ø':
                return 248;
            case 'ù':
                return 249;
            case C0607n.Ux /*250*/:
                return C0607n.Ux;
            case 'û':
                return 251;
            case 'ü':
                return 252;
            case 'ý':
                return 253;
            case 'þ':
                return 254;
            case 'ÿ':
                return 255;
            case 'Œ':
                return C0542t.f1193i;
            case 'œ':
                return 156;
            case 'Š':
                return 138;
            case 'š':
                return 154;
            case 'Ÿ':
                return 159;
            case 'Ž':
                return C0536n.f995G;
            case 'ž':
                return 158;
            case 'ƒ':
                return 131;
            case 'ˆ':
                return 136;
            case '˜':
                return 152;
            case '–':
                return C0536n.f1006y;
            case '—':
                return 151;
            case '‘':
                return 145;
            case '’':
                return 146;
            case '‚':
                return 130;
            case '“':
                return 147;
            case '”':
                return 148;
            case '„':
                return C0538a.tb;
            case '†':
                return C0607n.Fb;
            case '‡':
                return C0538a.Nb;
            case '•':
                return 149;
            case '…':
                return 133;
            case '‰':
                return 137;
            case '‹':
                return 139;
            case '›':
                return 155;
            case '€':
                return 128;
            case '™':
                return 153;
            default:
                return WDProjet.getInstance().isModeAnsi() ? -1 : c;
        }
    }

    /* renamed from: b */
    public static int m4032b(String str, String str2) {
        if (str.compareTo(str2) == 0) {
            return 0;
        }
        int length = str.length();
        int length2 = str2.length();
        int i = 0;
        while (i < Math.min(length, length2)) {
            try {
                if (str.charAt(i) != str2.charAt(i)) {
                    break;
                }
                i++;
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
                throw e2;
            }
        }
        if (i == length) {
            try {
                Integer.parseInt(str);
                i = 0;
            } catch (Exception e3) {
                return -1;
            }
        } else if (i == length2) {
            try {
                Integer.parseInt(str2);
                i = 0;
            } catch (Exception e4) {
                return 1;
            }
        }
        try {
            if (!Character.isDigit(str.charAt(i)) || !Character.isDigit(str2.charAt(i))) {
                return str.compareTo(str2);
            }
            String str3 = "";
            int i2 = i;
            while (i2 < length) {
                try {
                    if (!Character.isDigit(str.charAt(i2))) {
                        break;
                    }
                    i2++;
                    str3 = str3 + str.charAt(i2);
                } catch (Exception e22) {
                    throw e22;
                }
            }
            String str4 = "";
            while (i < length2) {
                try {
                    if (Character.isDigit(str2.charAt(i))) {
                        str4 = str4 + str2.charAt(i);
                        i++;
                    }
                } catch (Exception e222) {
                    throw e222;
                }
            }
            try {
                int parseInt = Integer.parseInt(str3);
                int parseInt2 = Integer.parseInt(str4);
                return parseInt > parseInt2 ? 1 : parseInt >= parseInt2 ? (i2 == length || i == length2) ? str3.length() < str4.length() ? 1 : -1 : C0808l.m4032b(str.substring(i2, length), str2.substring(i, length2)) : -1;
            } catch (Exception e5) {
                throw e5;
            } catch (Exception e6) {
                return -1;
            }
        } catch (Exception e2222) {
            throw e2222;
        }
    }

    /* renamed from: b */
    public static final int m4033b(String str, String str2, int i) {
        if (C0808l.m4053k(str) || C0808l.m4053k(str2)) {
            return 0;
        }
        String a = C0808l.m4016a(str, i, 0);
        String a2 = C0808l.m4016a(str2, i, 0);
        if (!a.endsWith(a2)) {
            return 0;
        }
        if ((i & 1) > 0 || (i & 2) > 0) {
            int length = a2.length() - 1;
            int length2 = str.length() - 1;
            while (length >= 0 && length2 >= 0) {
                if (str.charAt(length2) == a2.charAt(length)) {
                    length--;
                }
                length2--;
            }
            if (length < 0) {
                return (str.length() - length2) - 1;
            }
        }
        return a2.length();
    }

    /* renamed from: b */
    public static final int m4034b(byte[] bArr, byte[] bArr2) {
        int length = bArr2.length;
        if (length > bArr.length) {
            return 0;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return 0;
            }
        }
        return length;
    }

    /* renamed from: b */
    public static String m4035b(String str, String str2, String str3) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        if (!matcher.find()) {
            return str;
        }
        int groupCount = matcher.groupCount();
        String[] strArr = new String[groupCount];
        for (int i = 1; i <= groupCount; i++) {
            strArr[i - 1] = matcher.group(i);
        }
        return C0808l.m4021a(str3, strArr);
    }

    /* renamed from: b */
    public static String m4036b(String str, String str2, String str3, int i) {
        if (C0808l.m4053k(str2)) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        if (i > 0) {
            str = C0808l.m4016a(str, i, 0);
            str2 = C0808l.m4016a(str2, i, 0);
        }
        if (!str2.equals(str3)) {
            for (int lastIndexOf = str.lastIndexOf(str2); lastIndexOf != -1; lastIndexOf = str.lastIndexOf(str2, lastIndexOf - 1)) {
                stringBuffer.replace(lastIndexOf, str2.length() + lastIndexOf, str3);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static final String m4037b(String str, boolean z) {
        StringBuilder stringBuilder = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case '\"':
                case '\'':
                case '\\':
                    if (!z) {
                        stringBuilder.append(charAt);
                        break;
                    }
                case '\b':
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                    stringBuilder.append('\\');
                    stringBuilder.append(charAt);
                    break;
                default:
                    if ((charAt >> 7) <= 0) {
                        stringBuilder.append(charAt);
                        break;
                    }
                    stringBuilder.append('\\').append('u').append(ob.f2140a[(charAt >> 12) & 15]).append(ob.f2140a[(charAt >> 8) & 15]).append(ob.f2140a[(charAt >> 4) & 15]).append(ob.f2140a[charAt & 15]);
                    break;
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public static final boolean m4038b(String str, int i, int i2) {
        return (i == 0 || (C0808l.m4007a(str.charAt(i - 1)) & 10) == 10 || (C0808l.m4007a(str.charAt(i - 1)) & 8) == 8) && (i + i2 == str.length() || (C0808l.m4007a(str.charAt(i + i2)) & 10) == 10 || (C0808l.m4007a(str.charAt(i + i2)) & 8) == 8);
    }

    /* renamed from: b */
    public static byte[] m4039b(byte[] bArr) {
        try {
            return yb.m4192a(bArr);
        } catch (Exception e) {
            C0691a.m2863b(jy[20], e);
            return new byte[0];
        }
    }

    /* renamed from: b */
    public static String[] m4040b(String str) {
        if (cy == null) {
            cy = Pattern.compile(";");
        }
        return cy.split(str, -1);
    }

    /* renamed from: c */
    private static char m4041c(char c) {
        if (c >= '\u0000' && c <= '') {
            return (char) iy[c];
        }
        int b = C0808l.m4031b(c);
        return b != -1 ? (char) iy[b] : c;
    }

    /* renamed from: c */
    public static int m4042c(String str, String str2, int i) {
        if (i > 0) {
            str = C0808l.m4016a(str, i, 0);
            str2 = C0808l.m4016a(str2, i, 0);
        }
        int b = (i & 128) == 128 ? C0808l.m4032b(str, str2) : str.compareTo(str2);
        return b > 0 ? 1 : b < 0 ? -1 : b;
    }

    /* renamed from: c */
    public static final boolean m4043c(int i) {
        switch (i) {
            case 9:
            case 10:
            case 13:
            case 32:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: c */
    public static boolean m4044c(String str) {
        char[] toCharArray = str.toCharArray();
        boolean z = true;
        for (char isDigit : toCharArray) {
            if (!Character.isDigit(isDigit)) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: c */
    public static byte[] m4045c(byte[] bArr) {
        try {
            return fc.m3890a(bArr);
        } catch (Exception e) {
            C0691a.m2863b(jy[19], e);
            return new byte[0];
        }
    }

    /* renamed from: d */
    public static final String m4046d(String str) {
        int i = 0;
        while (i < str.length() && Character.isWhitespace(str.charAt(i))) {
            i++;
        }
        return str.substring(i, str.length());
    }

    /* renamed from: e */
    public static final String m4047e(String str) {
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case '\n':
                case '\r':
                    break;
                default:
                    stringBuffer.append(charAt);
                    break;
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: f */
    public static String m4048f(String str) {
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length);
        for (int i = 0; i < length; i++) {
            stringBuffer.append(C0808l.m4041c(str.charAt(i)));
        }
        return stringBuffer.toString();
    }

    /* renamed from: g */
    public static String m4049g(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        String str2 = "\n";
        int indexOf = stringBuffer.indexOf(str2);
        while (indexOf >= 0) {
            if (indexOf == 0 || stringBuffer.charAt(indexOf - 1) != '\r') {
                stringBuffer.insert(indexOf, '\r');
                indexOf++;
            }
            indexOf = stringBuffer.indexOf(str2, indexOf + 1);
        }
        return stringBuffer.toString();
    }

    /* renamed from: h */
    public static final String m4050h(String str) {
        StringBuffer stringBuffer = new StringBuffer(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case '\"':
                    stringBuffer.append(jy[12]);
                    break;
                case '&':
                    stringBuffer.append(jy[9]);
                    break;
                case '\'':
                    stringBuffer.append(jy[10]);
                    break;
                case '<':
                    stringBuffer.append(jy[8]);
                    break;
                case '>':
                    stringBuffer.append(jy[11]);
                    break;
                default:
                    stringBuffer.append(charAt);
                    break;
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: i */
    public static final String m4051i(String str) {
        int i = 0;
        int length = str.length();
        while (i < length && Character.isWhitespace(str.charAt(i))) {
            i++;
        }
        while (length > i && Character.isWhitespace(str.charAt(length - 1))) {
            length--;
        }
        return i < length ? str.substring(i, length) : "";
    }

    /* renamed from: j */
    public static String[] m4052j(String str) {
        if (gy == null) {
            gy = Pattern.compile(",");
        }
        return gy.split(str, -1);
    }

    /* renamed from: k */
    public static final boolean m4053k(String str) {
        return str == null || str.equals("");
    }

    /* renamed from: l */
    public static final String m4054l(String str) {
        return str.toLowerCase(Locale.FRENCH);
    }

    /* renamed from: m */
    public static String[] m4055m(String str) {
        if (Xx == null) {
            Xx = Pattern.compile(jy[4]);
        }
        return Xx.split(str, -1);
    }

    /* renamed from: n */
    public static final String m4056n(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int indexOf = str.indexOf(38);
        if (indexOf < 0) {
            return str;
        }
        int i = 0;
        do {
            stringBuffer.append(str.substring(i, indexOf));
            str = str.substring(indexOf, str.length());
            if (str.startsWith(jy[9])) {
                stringBuffer.append('&');
                i = 5;
            } else if (str.startsWith(jy[10])) {
                stringBuffer.append('\'');
                i = 6;
            } else if (str.startsWith(jy[11])) {
                stringBuffer.append('>');
                i = 4;
            } else if (str.startsWith(jy[8])) {
                stringBuffer.append('<');
                i = 4;
            } else if (str.startsWith(jy[12])) {
                stringBuffer.append('\"');
                i = 6;
            } else {
                stringBuffer.append('&');
                i = 1;
            }
            indexOf = str.indexOf(38, i);
        } while (indexOf > -1);
        stringBuffer.append(str.substring(i, str.length()));
        return stringBuffer.toString();
    }

    /* renamed from: o */
    public static final String m4057o(String str) {
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int binarySearch = Arrays.binarySearch(Yx, charAt);
            if (binarySearch >= 0) {
                stringBuffer.append(fy[binarySearch]);
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: p */
    public static final int m4058p(String str) {
        if (str.equals("")) {
            return 0;
        }
        char charAt = str.charAt(0);
        return (charAt < '\u0000' || charAt >= '') ? C0808l.m4031b(charAt) : charAt;
    }

    /* renamed from: q */
    public static final String m4059q(String str) {
        int length = str.length() - 1;
        while (length >= 0 && Character.isWhitespace(str.charAt(length))) {
            length--;
        }
        return str.substring(0, length + 1);
    }

    /* renamed from: r */
    public static final int m4060r(String str) {
        int length = str.length();
        int i = length & 1;
        int i2 = 0;
        for (int i3 = length - 1; i3 >= 0; i3--) {
            length = str.charAt(i3) - 48;
            if (i != (i3 & 1)) {
                length *= 2;
                if (length > 9) {
                    length -= 9;
                }
            }
            i2 += length;
        }
        length = i2 % 10;
        return length == 0 ? 0 : 10 - length;
    }

    /* renamed from: s */
    public static String m4061s(String str) {
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int a = C0808l.m4007a(charAt);
            if (!((a & 8) == 8 || (a & 10) == 10)) {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: t */
    public static final String m4062t(String str) {
        return (str == null || str.equals("")) ? "" : Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
    }

    /* renamed from: u */
    public static final String m4063u(String str) {
        if (!cb.access$000()) {
            return C0808l.m4057o(str);
        }
        try {
            return ((String) cb.access$200().invoke(null, new Object[]{str, cb.access$100()})).replaceAll(jy[6], "");
        } catch (Exception e) {
            C0691a.m2857a(jy[5], e);
            return C0808l.m4057o(str);
        }
    }

    /* renamed from: v */
    public static final boolean m4064v(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt < '0' || charAt > '9') && ((charAt < qb.f3195j || charAt > 'F') && (charAt < qb.f3206v || charAt > 'f'))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: z */
    private static String m4065z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 54;
                    break;
                case 1:
                    i2 = 65;
                    break;
                case 2:
                    i2 = 41;
                    break;
                case 3:
                    i2 = 15;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m4066z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 67);
        }
        return toCharArray;
    }
}
