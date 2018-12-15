package p000a.p001a.p002a.p022f.p025c;

import fr.pcsoft.wdjava.core.C0607n;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.p019g.C0186g;
import p000a.p001a.p002a.p019g.C0187h;
import p000a.p001a.p002a.p022f.C0171e;

/* renamed from: a.a.a.f.c.c */
final class C0159c {
    /* renamed from: a */
    private static final int f591a = 927;
    /* renamed from: b */
    private static final int f592b = 925;
    /* renamed from: c */
    private static final int f593c = 27;
    /* renamed from: d */
    private static final int f594d = 901;
    /* renamed from: e */
    private static final int f595e = 928;
    /* renamed from: f */
    private static final char[] f596f = C0159c.m975z(C0159c.m976z("\u0014@=9:s!\\\u0019\u001f\u000eq\nU[%Q-]N\r\u0000)QH\u0010\u0007~^")).toCharArray();
    /* renamed from: g */
    private static final int f597g = 913;
    /* renamed from: h */
    private static final Charset f598h = Charset.forName(C0159c.m975z(C0159c.m976z("f/LTY\u0017I:TP")));
    /* renamed from: i */
    private static final int f599i = 25;
    /* renamed from: j */
    private static final int f600j = 28;
    /* renamed from: k */
    private static final int f601k = 2;
    /* renamed from: l */
    private static final int f602l = 923;
    /* renamed from: m */
    private static final int f603m = 29;
    /* renamed from: n */
    private static final int f604n = 926;
    /* renamed from: o */
    private static final int f605o = 28;
    /* renamed from: p */
    private static final BigInteger[] f606p = new BigInteger[16];
    /* renamed from: q */
    private static final int f607q = 29;
    /* renamed from: r */
    private static final int f608r = 922;
    /* renamed from: s */
    private static final int f609s = 15;
    /* renamed from: t */
    private static final int f610t = 900;
    /* renamed from: u */
    private static final char[] f611u = C0159c.m975z(C0159c.m976z("\u001fM1JU\u001aJ4AX\tq\nU[\fQ-]N\u0004Y)D?")).toCharArray();
    /* renamed from: v */
    private static final int f612v = 924;
    /* renamed from: w */
    private static final int f613w = 27;
    /* renamed from: x */
    private static final int f614x = 902;

    static {
        f606p[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        f606p[1] = valueOf;
        for (int i = 2; i < f606p.length; i++) {
            f606p[i] = f606p[i - 1].multiply(valueOf);
        }
    }

    private C0159c() {
    }

    /* renamed from: a */
    private static int m968a(int i, int[] iArr, Charset charset, int i2, StringBuilder stringBuilder) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i3;
        long j;
        int i4;
        int i5;
        if (i == f594d) {
            i3 = 0;
            j = 0;
            int[] iArr2 = new int[6];
            Object obj = null;
            i4 = i2 + 1;
            int i6 = iArr[i2];
            int i7 = i4;
            while (i7 < iArr[0] && r3 == null) {
                i4 = i3 + 1;
                iArr2[i3] = i6;
                j = (j * 900) + ((long) i6);
                int i8 = i7 + 1;
                i6 = iArr[i7];
                if (i6 == f610t || i6 == f594d || i6 == f614x || i6 == f612v || i6 == 928 || i6 == f602l || i6 == f608r) {
                    obj = 1;
                    i7 = i8 - 1;
                    i3 = i4;
                } else if (i4 % 5 != 0 || i4 <= 0) {
                    i3 = i4;
                    i7 = i8;
                } else {
                    for (i3 = 0; i3 < 6; i3++) {
                        byteArrayOutputStream.write((byte) ((int) (j >> ((5 - i3) * 8))));
                    }
                    j = 0;
                    i3 = 0;
                    i7 = i8;
                }
            }
            if (i7 == iArr[0] && i6 < f610t) {
                i5 = i3 + 1;
                iArr2[i3] = i6;
                i3 = i5;
            }
            for (i6 = 0; i6 < i3; i6++) {
                byteArrayOutputStream.write((byte) iArr2[i6]);
            }
            i2 = i7;
        } else if (i == f612v) {
            i5 = 0;
            j = 0;
            Object obj2 = null;
            while (i2 < iArr[0] && r2 == null) {
                i3 = i2 + 1;
                i4 = iArr[i2];
                if (i4 < f610t) {
                    i5++;
                    j = (j * 900) + ((long) i4);
                    i2 = i3;
                } else if (i4 == f610t || i4 == f594d || i4 == f614x || i4 == f612v || i4 == 928 || i4 == f602l || i4 == f608r) {
                    i2 = i3 - 1;
                    obj2 = 1;
                } else {
                    i2 = i3;
                }
                if (i5 % 5 == 0 && i5 > 0) {
                    for (i5 = 0; i5 < 6; i5++) {
                        byteArrayOutputStream.write((byte) ((int) (j >> ((5 - i5) * 8))));
                    }
                    j = 0;
                    i5 = 0;
                }
            }
        }
        stringBuilder.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i2;
    }

    /* renamed from: a */
    private static int m969a(int[] iArr, int i, C0171e c0171e) throws C0212s {
        try {
            if (i + 2 > iArr[0]) {
                throw C0212s.m1267a();
            }
            int[] iArr2 = new int[2];
            int i2 = 0;
            while (i2 < 2) {
                try {
                    iArr2[i2] = iArr[i];
                    i2++;
                    i++;
                } catch (C0212s e) {
                    throw e;
                }
            }
            c0171e.m1054a(Integer.parseInt(C0159c.m972a(iArr2, 2)));
            StringBuilder stringBuilder = new StringBuilder();
            i2 = C0159c.m974b(iArr, i, stringBuilder);
            c0171e.m1055a(stringBuilder.toString());
            if (iArr[i2] == f602l) {
                int i3 = i2 + 1;
                int[] iArr3 = new int[(iArr[0] - i3)];
                i2 = 0;
                int i4 = i3;
                i3 = 0;
                while (i4 < iArr[0] && r0 == 0) {
                    try {
                        int i5 = i4 + 1;
                        int i6 = iArr[i4];
                        if (i6 < f610t) {
                            i4 = i3 + 1;
                            try {
                                iArr3[i3] = i6;
                                i3 = i5;
                            } catch (C0212s e2) {
                                throw e2;
                            }
                        }
                        switch (i6) {
                            case f608r /*922*/:
                                c0171e.m1056a(true);
                                i4 = i3;
                                i3 = i5 + 1;
                                boolean z = true;
                                break;
                            default:
                                throw C0212s.m1267a();
                        }
                        int i7 = i4;
                        i4 = i3;
                        i3 = i7;
                    } catch (C0212s e22) {
                        throw e22;
                    }
                }
                c0171e.m1057a(Arrays.copyOf(iArr3, i3));
                return i4;
            }
            try {
                if (iArr[i2] != f608r) {
                    return i2;
                }
                c0171e.m1056a(true);
                return i2 + 1;
            } catch (C0212s e222) {
                throw e222;
            }
        } catch (C0212s e2222) {
            throw e2222;
        }
    }

    /* renamed from: a */
    private static int m970a(int[] iArr, int i, StringBuilder stringBuilder) throws C0212s {
        int[] iArr2 = new int[15];
        int i2 = 0;
        int i3 = 0;
        while (i < iArr[0] && r0 == 0) {
            try {
                int i4;
                int i5 = i + 1;
                int i6 = iArr[i];
                if (i5 == iArr[0]) {
                    i2 = 1;
                }
                if (i6 < f610t) {
                    try {
                        iArr2[i3] = i6;
                        i4 = i2;
                        i2 = i3 + 1;
                        i3 = i4;
                    } catch (C0212s e) {
                        throw e;
                    }
                } else if (i6 == f610t || i6 == f594d || i6 == f612v || i6 == 928 || i6 == f602l || i6 == f608r) {
                    i5--;
                    i2 = i3;
                    i3 = 1;
                } else {
                    i4 = i2;
                    i2 = i3;
                    i3 = i4;
                }
                try {
                    if ((i2 % 15 == 0 || i6 == f614x || i3 != 0) && i2 > 0) {
                        stringBuilder.append(C0159c.m972a(iArr2, i2));
                        i2 = 0;
                    }
                    i = i5;
                    i4 = i2;
                    i2 = i3;
                    i3 = i4;
                } catch (C0212s e2) {
                    throw e2;
                } catch (C0212s e22) {
                    try {
                        throw e22;
                    } catch (C0212s e222) {
                        throw e222;
                    }
                }
            } catch (C0212s e2222) {
                throw e2222;
            }
        }
        return i;
    }

    /* renamed from: a */
    static C0187h m971a(int[] iArr, String str) throws C0212s {
        StringBuilder stringBuilder = new StringBuilder(iArr.length * 2);
        Charset charset = f598h;
        int i = iArr[1];
        Object c0171e = new C0171e();
        Charset charset2 = charset;
        int i2 = 2;
        while (i2 < iArr[0]) {
            try {
                switch (i) {
                    case f610t /*900*/:
                        i = C0159c.m974b(iArr, i2, stringBuilder);
                        break;
                    case f594d /*901*/:
                    case f612v /*924*/:
                        i = C0159c.m968a(i, iArr, charset2, i2, stringBuilder);
                        break;
                    case f614x /*902*/:
                        i = C0159c.m970a(iArr, i2, stringBuilder);
                        break;
                    case f597g /*913*/:
                        i = i2 + 1;
                        stringBuilder.append((char) iArr[i2]);
                        break;
                    case f608r /*922*/:
                    case f602l /*923*/:
                        throw C0212s.m1267a();
                    case f592b /*925*/:
                        i = i2 + 1;
                        break;
                    case f604n /*926*/:
                        i = i2 + 2;
                        break;
                    case f591a /*927*/:
                        i = i2 + 1;
                        charset2 = Charset.forName(C0186g.getCharacterSetECIByValue(iArr[i2]).name());
                        break;
                    case 928:
                        i = C0159c.m969a(iArr, i2, (C0171e) c0171e);
                        break;
                    default:
                        i = C0159c.m974b(iArr, i2 - 1, stringBuilder);
                        break;
                }
                if (i < iArr.length) {
                    i2 = i + 1;
                    i = iArr[i];
                } else {
                    throw C0212s.m1267a();
                }
            } catch (C0212s e) {
                throw e;
            }
        }
        try {
            if (stringBuilder.length() == 0) {
                throw C0212s.m1267a();
            }
            C0187h c0187h = new C0187h(null, stringBuilder.toString(), null, str);
            c0187h.m1160a(c0171e);
            return c0187h;
        } catch (C0212s e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    private static String m972a(int[] iArr, int i) throws C0212s {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(f606p[(i - i2) - 1].multiply(BigInteger.valueOf((long) iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        try {
            if (bigInteger2.charAt(0) == '1') {
                return bigInteger2.substring(1);
            }
            throw C0212s.m1267a();
        } catch (C0212s e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static void m973a(int[] r8, int[] r9, int r10, java.lang.StringBuilder r11) {
        /*
        r2 = p000a.p001a.p002a.p022f.p025c.C0165i.ALPHA;
        r1 = p000a.p001a.p002a.p022f.p025c.C0165i.ALPHA;
        r0 = 0;
        r3 = r0;
    L_0x0006:
        if (r3 >= r10) goto L_0x0146;
    L_0x0008:
        r4 = r8[r3];
        r0 = 0;
        r5 = p000a.p001a.p002a.p022f.p025c.C0166j.f638a;
        r6 = r2.ordinal();
        r5 = r5[r6];
        switch(r5) {
            case 1: goto L_0x001f;
            case 2: goto L_0x0058;
            case 3: goto L_0x0094;
            case 4: goto L_0x00dd;
            case 5: goto L_0x0103;
            case 6: goto L_0x011e;
            default: goto L_0x0016;
        };
    L_0x0016:
        if (r0 == 0) goto L_0x001b;
    L_0x0018:
        r11.append(r0);
    L_0x001b:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0006;
    L_0x001f:
        r5 = 26;
        if (r4 >= r5) goto L_0x0027;
    L_0x0023:
        r0 = r4 + 65;
        r0 = (char) r0;
        goto L_0x0016;
    L_0x0027:
        r5 = 26;
        if (r4 != r5) goto L_0x002e;
    L_0x002b:
        r0 = 32;
        goto L_0x0016;
    L_0x002e:
        r5 = 27;
        if (r4 != r5) goto L_0x0035;
    L_0x0032:
        r2 = p000a.p001a.p002a.p022f.p025c.C0165i.LOWER;
        goto L_0x0016;
    L_0x0035:
        r5 = 28;
        if (r4 != r5) goto L_0x003c;
    L_0x0039:
        r2 = p000a.p001a.p002a.p022f.p025c.C0165i.MIXED;
        goto L_0x0016;
    L_0x003c:
        r5 = 29;
        if (r4 != r5) goto L_0x0046;
    L_0x0040:
        r1 = p000a.p001a.p002a.p022f.p025c.C0165i.PUNCT_SHIFT;
        r7 = r2;
        r2 = r1;
        r1 = r7;
        goto L_0x0016;
    L_0x0046:
        r5 = 913; // 0x391 float:1.28E-42 double:4.51E-321;
        if (r4 != r5) goto L_0x0051;
    L_0x004a:
        r4 = r9[r3];
        r4 = (char) r4;
        r11.append(r4);
        goto L_0x0016;
    L_0x0051:
        r5 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        if (r4 != r5) goto L_0x0016;
    L_0x0055:
        r2 = p000a.p001a.p002a.p022f.p025c.C0165i.ALPHA;
        goto L_0x0016;
    L_0x0058:
        r5 = 26;
        if (r4 >= r5) goto L_0x0060;
    L_0x005c:
        r0 = r4 + 97;
        r0 = (char) r0;
        goto L_0x0016;
    L_0x0060:
        r5 = 26;
        if (r4 != r5) goto L_0x0067;
    L_0x0064:
        r0 = 32;
        goto L_0x0016;
    L_0x0067:
        r5 = 27;
        if (r4 != r5) goto L_0x0071;
    L_0x006b:
        r1 = p000a.p001a.p002a.p022f.p025c.C0165i.ALPHA_SHIFT;
        r7 = r2;
        r2 = r1;
        r1 = r7;
        goto L_0x0016;
    L_0x0071:
        r5 = 28;
        if (r4 != r5) goto L_0x0078;
    L_0x0075:
        r2 = p000a.p001a.p002a.p022f.p025c.C0165i.MIXED;
        goto L_0x0016;
    L_0x0078:
        r5 = 29;
        if (r4 != r5) goto L_0x0082;
    L_0x007c:
        r1 = p000a.p001a.p002a.p022f.p025c.C0165i.PUNCT_SHIFT;
        r7 = r2;
        r2 = r1;
        r1 = r7;
        goto L_0x0016;
    L_0x0082:
        r5 = 913; // 0x391 float:1.28E-42 double:4.51E-321;
        if (r4 != r5) goto L_0x008d;
    L_0x0086:
        r4 = r9[r3];
        r4 = (char) r4;
        r11.append(r4);
        goto L_0x0016;
    L_0x008d:
        r5 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        if (r4 != r5) goto L_0x0016;
    L_0x0091:
        r2 = p000a.p001a.p002a.p022f.p025c.C0165i.ALPHA;
        goto L_0x0016;
    L_0x0094:
        r5 = 25;
        if (r4 >= r5) goto L_0x009e;
    L_0x0098:
        r0 = f611u;
        r0 = r0[r4];
        goto L_0x0016;
    L_0x009e:
        r5 = 25;
        if (r4 != r5) goto L_0x00a6;
    L_0x00a2:
        r2 = p000a.p001a.p002a.p022f.p025c.C0165i.PUNCT;
        goto L_0x0016;
    L_0x00a6:
        r5 = 26;
        if (r4 != r5) goto L_0x00ae;
    L_0x00aa:
        r0 = 32;
        goto L_0x0016;
    L_0x00ae:
        r5 = 27;
        if (r4 != r5) goto L_0x00b6;
    L_0x00b2:
        r2 = p000a.p001a.p002a.p022f.p025c.C0165i.LOWER;
        goto L_0x0016;
    L_0x00b6:
        r5 = 28;
        if (r4 != r5) goto L_0x00be;
    L_0x00ba:
        r2 = p000a.p001a.p002a.p022f.p025c.C0165i.ALPHA;
        goto L_0x0016;
    L_0x00be:
        r5 = 29;
        if (r4 != r5) goto L_0x00c9;
    L_0x00c2:
        r1 = p000a.p001a.p002a.p022f.p025c.C0165i.PUNCT_SHIFT;
        r7 = r2;
        r2 = r1;
        r1 = r7;
        goto L_0x0016;
    L_0x00c9:
        r5 = 913; // 0x391 float:1.28E-42 double:4.51E-321;
        if (r4 != r5) goto L_0x00d5;
    L_0x00cd:
        r4 = r9[r3];
        r4 = (char) r4;
        r11.append(r4);
        goto L_0x0016;
    L_0x00d5:
        r5 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        if (r4 != r5) goto L_0x0016;
    L_0x00d9:
        r2 = p000a.p001a.p002a.p022f.p025c.C0165i.ALPHA;
        goto L_0x0016;
    L_0x00dd:
        r5 = 29;
        if (r4 >= r5) goto L_0x00e7;
    L_0x00e1:
        r0 = f596f;
        r0 = r0[r4];
        goto L_0x0016;
    L_0x00e7:
        r5 = 29;
        if (r4 != r5) goto L_0x00ef;
    L_0x00eb:
        r2 = p000a.p001a.p002a.p022f.p025c.C0165i.ALPHA;
        goto L_0x0016;
    L_0x00ef:
        r5 = 913; // 0x391 float:1.28E-42 double:4.51E-321;
        if (r4 != r5) goto L_0x00fb;
    L_0x00f3:
        r4 = r9[r3];
        r4 = (char) r4;
        r11.append(r4);
        goto L_0x0016;
    L_0x00fb:
        r5 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        if (r4 != r5) goto L_0x0016;
    L_0x00ff:
        r2 = p000a.p001a.p002a.p022f.p025c.C0165i.ALPHA;
        goto L_0x0016;
    L_0x0103:
        r2 = 26;
        if (r4 >= r2) goto L_0x010d;
    L_0x0107:
        r0 = r4 + 65;
        r0 = (char) r0;
        r2 = r1;
        goto L_0x0016;
    L_0x010d:
        r2 = 26;
        if (r4 != r2) goto L_0x0116;
    L_0x0111:
        r0 = 32;
        r2 = r1;
        goto L_0x0016;
    L_0x0116:
        r2 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        if (r4 != r2) goto L_0x0147;
    L_0x011a:
        r2 = p000a.p001a.p002a.p022f.p025c.C0165i.ALPHA;
        goto L_0x0016;
    L_0x011e:
        r2 = 29;
        if (r4 >= r2) goto L_0x0129;
    L_0x0122:
        r0 = f596f;
        r0 = r0[r4];
        r2 = r1;
        goto L_0x0016;
    L_0x0129:
        r2 = 29;
        if (r4 != r2) goto L_0x0131;
    L_0x012d:
        r2 = p000a.p001a.p002a.p022f.p025c.C0165i.ALPHA;
        goto L_0x0016;
    L_0x0131:
        r2 = 913; // 0x391 float:1.28E-42 double:4.51E-321;
        if (r4 != r2) goto L_0x013e;
    L_0x0135:
        r2 = r9[r3];
        r2 = (char) r2;
        r11.append(r2);
        r2 = r1;
        goto L_0x0016;
    L_0x013e:
        r2 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        if (r4 != r2) goto L_0x0147;
    L_0x0142:
        r2 = p000a.p001a.p002a.p022f.p025c.C0165i.ALPHA;
        goto L_0x0016;
    L_0x0146:
        return;
    L_0x0147:
        r2 = r1;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.f.c.c.a(int[], int[], int, java.lang.StringBuilder):void");
    }

    /* renamed from: b */
    private static int m974b(int[] iArr, int i, StringBuilder stringBuilder) {
        int[] iArr2 = new int[((iArr[0] - i) * 2)];
        int[] iArr3 = new int[((iArr[0] - i) * 2)];
        int i2 = 0;
        int i3 = 0;
        while (i < iArr[0] && r0 == 0) {
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i5 >= f610t) {
                switch (i5) {
                    case f610t /*900*/:
                        i5 = i3 + 1;
                        iArr2[i3] = f610t;
                        i3 = i5;
                        i = i4;
                        break;
                    case f594d /*901*/:
                    case f614x /*902*/:
                    case f608r /*922*/:
                    case f602l /*923*/:
                    case f612v /*924*/:
                    case 928:
                        i = i4 - 1;
                        i2 = 1;
                        break;
                    case f597g /*913*/:
                        iArr2[i3] = f597g;
                        i = i4 + 1;
                        iArr3[i3] = iArr[i4];
                        i3++;
                        break;
                    default:
                        i = i4;
                        break;
                }
            }
            iArr2[i3] = i5 / 30;
            iArr2[i3 + 1] = i5 % 30;
            i3 += 2;
            i = i4;
        }
        C0159c.m973a(iArr2, iArr3, i3, stringBuilder);
        return i;
    }

    /* renamed from: z */
    private static String m975z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 47;
                    break;
                case 1:
                    i2 = C0607n.Hn;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 121;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m976z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 97);
        }
        return toCharArray;
    }
}
