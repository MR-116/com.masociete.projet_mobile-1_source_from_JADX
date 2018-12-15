package fr.pcsoft.wdjava.ui.p080h;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p064a.C1034d;
import fr.pcsoft.wdjava.ui.p065b.p067a.qb;

/* renamed from: fr.pcsoft.wdjava.ui.h.i */
public class C1426i {
    /* renamed from: A */
    private static final char f4204A = 'H';
    /* renamed from: B */
    public static final String f4205B = C1426i.m10043z(C1426i.m10044z("G\\"));
    /* renamed from: C */
    private static final String f4206C = "K";
    /* renamed from: D */
    public static final String f4207D = C1426i.m10043z(C1426i.m10044z("GJX\u0007[\u0007U"));
    /* renamed from: E */
    private static final char f4208E = 'F';
    /* renamed from: F */
    public static final String f4209F = C1426i.m10043z(C1426i.m10044z("GXE\u000f"));
    /* renamed from: G */
    private static final char f4210G = 'T';
    /* renamed from: H */
    private static final String[] f4211H;
    /* renamed from: a */
    private static final char f4212a = '-';
    /* renamed from: b */
    public static final String f4213b = C1426i.m10043z(C1426i.m10044z("GX_\t"));
    /* renamed from: c */
    public static final String f4214c = C1426i.m10043z(C1426i.m10044z("GXE\t"));
    /* renamed from: d */
    private static final char f4215d = 'I';
    /* renamed from: e */
    public static final String f4216e = C1426i.m10043z(C1426i.m10044z("GNDt(t-'\u000eOn$3\u0011C"));
    /* renamed from: f */
    private static final String f4217f = C1426i.m10043z(C1426i.m10044z("\u000eOT"));
    /* renamed from: g */
    private static final char f4218g = 'G';
    /* renamed from: h */
    public static final String f4219h = C1426i.m10043z(C1426i.m10044z("GXB\u0007[\b"));
    /* renamed from: i */
    private static final char f4220i = 'B';
    /* renamed from: j */
    public static final String f4221j = C1426i.m10043z(C1426i.m10044z("GXU\nOm$6\u0007Xu"));
    /* renamed from: k */
    private static final char f4222k = 'P';
    /* renamed from: l */
    static final char f4223l = '\u001b';
    /* renamed from: m */
    public static final String f4224m = C1426i.m10043z(C1426i.m10044z("GXQ\t"));
    /* renamed from: n */
    private static final char f4225n = 'C';
    /* renamed from: o */
    public static final String f4226o = C1426i.m10043z(C1426i.m10044z("G\\Dt(t-'\u000eOn$3\u0011C"));
    /* renamed from: p */
    private static final char f4227p = 'B';
    /* renamed from: q */
    public static final String f4228q = C1426i.m10043z(C1426i.m10044z("G@3\u0013Fy::\u0007Yp-\"9\""));
    /* renamed from: r */
    public static final String f4229r = C1426i.m10043z(C1426i.m10044z("GC"));
    /* renamed from: s */
    private static final String f4230s = C1426i.m10043z(C1426i.m10044z("\u000e^T"));
    /* renamed from: t */
    private static final char f4231t = '+';
    /* renamed from: u */
    public static final String f4232u = C1426i.m10043z(C1426i.m10044z("GN"));
    /* renamed from: v */
    public static final String f4233v = C1426i.m10043z(C1426i.m10044z("GX_\u000f"));
    /* renamed from: w */
    private static final char f4234w = 'S';
    /* renamed from: x */
    public static final String f4235x = C1426i.m10043z(C1426i.m10044z("GX>\u0007[u"));
    /* renamed from: y */
    private static final char f4236y = 'T';
    /* renamed from: z */
    public static final String f4237z = C1426i.m10043z(C1426i.m10044z("GXQ\u000f"));

    static {
        String[] strArr = new String[2];
        strArr[0] = C1426i.m10043z(C1426i.m10044z("\u001fgcN\u000f)z6K\u0004?gxL\u001f9&"));
        strArr[1] = C1426i.m10043z(C1426i.m10044z("\u0007U"));
        f4211H = strArr;
    }

    /* renamed from: a */
    public static final char m10034a(int i) {
        switch (i) {
            case -16777216:
            case -1:
                return qb.f3204t;
            case 0:
                return 'N';
            case 128:
                return 'r';
            case 255:
                return 'R';
            case 32768:
                return qb.f3203s;
            case C0607n.tr /*32896*/:
                return 'j';
            case 65280:
                return qb.f3199n;
            case 65535:
                return 'J';
            case 8388608:
                return 'b';
            case C0607n.hq /*8388736*/:
                return qb.f3198m;
            case C0607n.mx /*8421376*/:
                return qb.f3191f;
            case C0607n.Xv /*8421504*/:
                return 'g';
            case C0607n.pc /*12632256*/:
                return f4218g;
            case C0607n.Sj /*16711680*/:
                return 'B';
            case C0607n.On /*16711935*/:
                return qb.f3201q;
            case C0607n.Uq /*16776960*/:
                return 'C';
            case 16777215:
                return 'W';
            default:
                return '\u0004';
        }
    }

    /* renamed from: a */
    public static final int m10035a(char c) {
        switch (c) {
            case 'B':
                return C1031a.m7467k(C0607n.Sj);
            case 'C':
                return C1031a.m7467k(C0607n.Uq);
            case 'G':
                return C1031a.m7467k(C0607n.pc);
            case 'J':
                return C1031a.m7467k(65535);
            case 'M':
                return C1031a.m7467k(C0607n.On);
            case 'N':
                return C1031a.m7467k(0);
            case 'R':
                return C1031a.m7467k(255);
            case 'T':
                return C1031a.m7467k(-1);
            case 'V':
                return C1031a.m7467k(65280);
            case 'W':
                try {
                    return C1031a.m7467k(16777215);
                } catch (IndexOutOfBoundsException e) {
                    throw e;
                }
            case 'b':
                return C1031a.m7467k(8388608);
            case 'c':
                return C1031a.m7467k(C0607n.mx);
            case 'g':
                return C1031a.m7467k(C0607n.Xv);
            case 'j':
                return C1031a.m7467k(C0607n.tr);
            case 'm':
                return C1031a.m7467k(C0607n.hq);
            case 'r':
                return C1031a.m7467k(128);
            case 'v':
                return C1031a.m7467k(32768);
            default:
                C0691a.m2856a(f4211H[0]);
                return C1034d.m7492r().mo3315b();
        }
    }

    /* renamed from: a */
    private static final int m10036a(String str, int i, C1418f c1418f) throws C1428k {
        int i2 = i + 1;
        try {
            char charAt = str.charAt(i2);
            switch (charAt) {
                case 'B':
                    int i3 = i2 + 1;
                    if (i3 < str.length() && str.charAt(i3) == 'N') {
                        i3++;
                        i2 = str.indexOf(f4211H[1], i3);
                        if (i2 > 0) {
                            c1418f.mo3775a(C1425h.IMAGE, str.substring(i3, i2));
                            return i2 + 1;
                        }
                    }
                    break;
                case 'F':
                case 'T':
                    C1425h c1425h = charAt == f4208E ? C1425h.BACKGROUND : C1425h.FOREGROUND;
                    i2++;
                    if (str.indexOf(f4230s, i2) == i2 || str.indexOf(f4217f, i2) == i2) {
                        int i4 = i2 + 4;
                        int indexOf = str.indexOf(41, i4);
                        if (indexOf > i2) {
                            String[] j = C0808l.m4052j(str.substring(i4, indexOf));
                            if (j.length == 3) {
                                c1418f.mo3774a(c1425h, ((C0725i.m3064d(j[2]) & 255) << 0) | ((-16777216 | ((C0725i.m3064d(j[0]) & 255) << 16)) | ((C0725i.m3064d(j[1]) & 255) << 8)));
                                return indexOf;
                            }
                        }
                    }
                    c1418f.mo3774a(c1425h, C1426i.m10035a(str.charAt(i2)));
                    return i2;
                    break;
                case 'H':
                    return C1426i.m10039b(str, i2 + 1, c1418f);
                case 'P':
                    return C1426i.m10041c(str, i2 + 1, c1418f);
            }
            throw new C1428k(null);
        } catch (IndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new C1428k(null);
        }
    }

    /* renamed from: a */
    static final void m10037a(String str, C1418f c1418f) {
        try {
            if (!C0808l.m4053k(str)) {
                int length = str.length();
                int i = 0;
                int indexOf = str.indexOf(27);
                while (i < length) {
                    if (indexOf < 0 || indexOf == length - 1) {
                        try {
                            c1418f.mo3778a(str.substring(i));
                            return;
                        } catch (C1428k e) {
                            throw e;
                        }
                    }
                    if (indexOf > i) {
                        try {
                            c1418f.mo3778a(str.substring(i, indexOf));
                        } catch (C1428k e2) {
                            throw e2;
                        }
                    }
                    try {
                        i = C1426i.m10036a(str, indexOf, c1418f) + 1;
                        indexOf = str.indexOf(27, i);
                    } catch (C1428k e3) {
                        i = indexOf;
                        indexOf = str.indexOf(27, indexOf + 1);
                    }
                }
            }
        } catch (C1428k e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    public static final String[] m10038a(String str) {
        Object obj = null;
        if (C1426i.m10042c(str)) {
            int indexOf = str.indexOf(f4229r);
            if (indexOf >= 0) {
                StringBuffer stringBuffer = new StringBuffer("");
                int length = f4229r.length();
                int i = indexOf;
                int i2 = 0;
                String str2 = null;
                while (i != -1) {
                    stringBuffer.append(str.substring(i2, i));
                    i += length;
                    i2 = str.indexOf(f4229r, i);
                    if (i2 != -1) {
                        if (obj == null) {
                            str2 = str.substring(i, i2);
                            obj = 1;
                        }
                        i = i2 + length;
                    }
                    i2 = i;
                    i = str.indexOf(f4229r, i);
                }
                try {
                    stringBuffer.append(str.substring(i2));
                    if (obj != null) {
                        return new String[]{str2, stringBuffer.toString()};
                    }
                } catch (IndexOutOfBoundsException e) {
                    throw e;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private static int m10039b(String str, int i, C1418f c1418f) throws C1428k, IndexOutOfBoundsException {
        String str2 = String.valueOf(f4223l) + 'H';
        int indexOf = str.indexOf(str2, i);
        if (indexOf > i) {
            String[] j = C0808l.m4052j(str.substring(i, indexOf));
            if (j != null) {
                try {
                    if (j.length == 4) {
                        c1418f.mo3777a(C1425h.LINK, j);
                    }
                } catch (C1428k e) {
                    throw e;
                }
            }
            return (str2.length() + indexOf) - 1;
        }
        throw new C1428k(null);
    }

    /* renamed from: b */
    public static final String m10040b(String str) {
        if (!C1426i.m10042c(str)) {
            return str;
        }
        Object c1419a = new C1419a(null);
        C1426i.m10037a(str, c1419a);
        return c1419a.toString();
    }

    /* renamed from: c */
    private static final int m10041c(String str, int i, C1418f c1418f) throws C1428k, IndexOutOfBoundsException {
        int i2;
        Object obj = null;
        char charAt;
        switch (str.charAt(i)) {
            case '(':
                break;
            case 'B':
            case 'G':
                i2 = i + 1;
                charAt = str.charAt(i2);
                if (charAt == f4231t) {
                    try {
                        c1418f.mo3776a(C1425h.BOLD, true);
                        return i2;
                    } catch (C1428k e) {
                        throw e;
                    }
                } else if (charAt == f4212a) {
                    try {
                        c1418f.mo3776a(C1425h.BOLD, false);
                        return i2;
                    } catch (C1428k e2) {
                        throw e2;
                    }
                }
                break;
            case 'C':
                i++;
                obj = 1;
                break;
            case 'I':
                i2 = i + 1;
                charAt = str.charAt(i2);
                if (charAt == f4231t) {
                    try {
                        c1418f.mo3776a(C1425h.ITALIC, true);
                        return i2;
                    } catch (C1428k e22) {
                        throw e22;
                    }
                } else if (charAt == f4212a) {
                    try {
                        c1418f.mo3776a(C1425h.ITALIC, false);
                        return i2;
                    } catch (C1428k e222) {
                        throw e222;
                    }
                }
                break;
            case 'S':
                i2 = i + 1;
                charAt = str.charAt(i2);
                if (charAt == f4231t) {
                    try {
                        c1418f.mo3776a(C1425h.UNDERLINE, true);
                        return i2;
                    } catch (C1428k e2222) {
                        throw e2222;
                    }
                } else if (charAt == f4212a) {
                    try {
                        c1418f.mo3776a(C1425h.UNDERLINE, false);
                        return i2;
                    } catch (C1428k e22222) {
                        throw e22222;
                    }
                }
                break;
            case 'T':
                int i3 = i + 1;
                i2 = str.indexOf(84, i3);
                if (i3 > 0) {
                    c1418f.mo3773a(C1425h.FONT_SIZE, C0725i.m3084m(str.substring(i3, i2)));
                    return i2;
                }
                break;
        }
        i2 = str.indexOf(obj != null ? 44 : 41, i);
        if (i2 > i) {
            try {
                c1418f.mo3775a(C1425h.FONT_NAME, str.substring(i + 1, i2));
                return obj != null ? str.indexOf(41, i2) : i2;
            } catch (C1428k e222222) {
                throw e222222;
            }
        }
        throw new C1428k(null);
    }

    /* renamed from: c */
    public static final boolean m10042c(String str) {
        try {
            return str.indexOf(27) >= 0;
        } catch (IndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: z */
    private static String m10043z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 92;
                    break;
                case 1:
                    i2 = 8;
                    break;
                case 2:
                    i2 = 22;
                    break;
                case 3:
                    i2 = 34;
                    break;
                default:
                    i2 = 106;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10044z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 106);
        }
        return toCharArray;
    }
}
