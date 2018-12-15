package p000a.p001a.p002a.p022f.p023a;

import fr.pcsoft.wdjava.ui.p065b.p067a.qb;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import p000a.p001a.p002a.fb;
import p000a.p001a.p002a.p019g.C0186g;

/* renamed from: a.a.a.f.a.a */
final class C0146a {
    /* renamed from: a */
    private static final byte[] f514a = new byte[128];
    /* renamed from: b */
    private static final byte[] f515b = new byte[128];
    /* renamed from: c */
    private static final byte[] f516c = new byte[]{(byte) 59, (byte) 60, (byte) 62, (byte) 64, (byte) 91, (byte) 92, (byte) 93, (byte) 95, (byte) 96, (byte) 126, (byte) 33, (byte) 13, (byte) 9, (byte) 44, (byte) 58, (byte) 10, (byte) 45, (byte) 46, (byte) 36, (byte) 47, (byte) 34, (byte) 124, (byte) 42, (byte) 40, (byte) 41, (byte) 63, (byte) 123, (byte) 125, (byte) 39, (byte) 0};
    /* renamed from: d */
    private static final Charset f517d = Charset.forName(C0146a.m871z(C0146a.m872z("FLy\u000427*\u000f\u0004;")));
    /* renamed from: e */
    private static final int f518e = 3;
    /* renamed from: f */
    private static final int f519f = 1;
    /* renamed from: g */
    private static final int f520g = 927;
    /* renamed from: h */
    private static final int f521h = 913;
    /* renamed from: i */
    private static final int f522i = 901;
    /* renamed from: j */
    private static final int f523j = 926;
    /* renamed from: k */
    private static final int f524k = 0;
    /* renamed from: l */
    private static final int f525l = 0;
    /* renamed from: m */
    private static final int f526m = 2;
    /* renamed from: n */
    private static final int f527n = 900;
    /* renamed from: o */
    private static final int f528o = 925;
    /* renamed from: p */
    private static final int f529p = 924;
    /* renamed from: q */
    private static final int f530q = 2;
    /* renamed from: r */
    private static final byte[] f531r = new byte[]{(byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 38, (byte) 13, (byte) 9, (byte) 44, (byte) 58, (byte) 35, (byte) 45, (byte) 46, (byte) 36, (byte) 47, (byte) 43, (byte) 37, (byte) 42, (byte) 61, (byte) 94, (byte) 0, (byte) 32, (byte) 0, (byte) 0, (byte) 0};
    /* renamed from: s */
    private static final int f532s = 1;
    /* renamed from: t */
    private static final int f533t = 902;
    /* renamed from: z */
    private static final String[] f534z = new String[]{C0146a.m871z(C0146a.m872z("ApX\u0004oa|YMkmsS\tig~DHi{zD\tnjkSJ~j{\f\t")), C0146a.m871z(C0146a.m872z("/7cGclpRL0/")), C0146a.m871z(C0146a.m872z("J\\\tdzrTLx/qY]*fq\u0016_kcvR\txnqQL*imYD*?1\u0018\u0011;>(\u000f\u0010&/}C]*x~E\t"))};

    static {
        int i = 0;
        Arrays.fill(f514a, (byte) -1);
        for (int i2 = 0; i2 < f531r.length; i2++) {
            byte b = f531r[i2];
            if (b > (byte) 0) {
                f514a[b] = (byte) i2;
            }
        }
        Arrays.fill(f515b, (byte) -1);
        while (i < f516c.length) {
            byte b2 = f516c[i];
            if (b2 > (byte) 0) {
                f515b[b2] = (byte) i;
            }
            i++;
        }
    }

    private C0146a() {
    }

    /* renamed from: a */
    private static int m857a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = i;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            int i3 = 0;
            while (i3 < 13 && C0146a.m869e(r2) && i2 < length) {
                i3++;
                int i4 = i2 + 1;
                if (i4 < length) {
                    charAt = charSequence.charAt(i4);
                    i2 = i4;
                } else {
                    i2 = i4;
                }
            }
            if (i3 >= 13) {
                return (i2 - i) - i3;
            }
            if (i3 <= 0) {
                if (!C0146a.m867c(charSequence.charAt(i2))) {
                    break;
                }
                i2++;
            }
        }
        return i2 - i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static int m858a(java.lang.CharSequence r9, int r10, int r11, java.lang.StringBuilder r12, int r13) {
        /*
        r8 = 28;
        r7 = 27;
        r2 = 1;
        r6 = 29;
        r1 = 0;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r11);
        r0 = r1;
    L_0x000e:
        r3 = r10 + r0;
        r3 = r9.charAt(r3);
        switch(r13) {
            case 0: goto L_0x0047;
            case 1: goto L_0x0080;
            case 2: goto L_0x00c1;
            default: goto L_0x0017;
        };
    L_0x0017:
        r4 = p000a.p001a.p002a.p022f.p023a.C0146a.m866b(r3);
        if (r4 == 0) goto L_0x0112;
    L_0x001d:
        r4 = f515b;
        r3 = r4[r3];
        r3 = (char) r3;
        r5.append(r3);
    L_0x0025:
        r0 = r0 + 1;
        if (r0 < r11) goto L_0x000e;
    L_0x0029:
        r6 = r5.length();
        r3 = r1;
        r4 = r1;
    L_0x002f:
        if (r3 >= r6) goto L_0x0121;
    L_0x0031:
        r0 = r3 % 2;
        if (r0 == 0) goto L_0x0118;
    L_0x0035:
        r0 = r2;
    L_0x0036:
        if (r0 == 0) goto L_0x011b;
    L_0x0038:
        r0 = r4 * 30;
        r4 = r5.charAt(r3);
        r0 = r0 + r4;
        r0 = (char) r0;
        r12.append(r0);
    L_0x0043:
        r3 = r3 + 1;
        r4 = r0;
        goto L_0x002f;
    L_0x0047:
        r4 = p000a.p001a.p002a.p022f.p023a.C0146a.m868d(r3);
        if (r4 == 0) goto L_0x005e;
    L_0x004d:
        r4 = 32;
        if (r3 != r4) goto L_0x0057;
    L_0x0051:
        r3 = 26;
        r5.append(r3);
        goto L_0x0025;
    L_0x0057:
        r3 = r3 + -65;
        r3 = (char) r3;
        r5.append(r3);
        goto L_0x0025;
    L_0x005e:
        r4 = p000a.p001a.p002a.p022f.p023a.C0146a.m870f(r3);
        if (r4 == 0) goto L_0x0069;
    L_0x0064:
        r5.append(r7);
        r13 = r2;
        goto L_0x000e;
    L_0x0069:
        r4 = p000a.p001a.p002a.p022f.p023a.C0146a.m864a(r3);
        if (r4 == 0) goto L_0x0074;
    L_0x006f:
        r13 = 2;
        r5.append(r8);
        goto L_0x000e;
    L_0x0074:
        r5.append(r6);
        r4 = f515b;
        r3 = r4[r3];
        r3 = (char) r3;
        r5.append(r3);
        goto L_0x0025;
    L_0x0080:
        r4 = p000a.p001a.p002a.p022f.p023a.C0146a.m870f(r3);
        if (r4 == 0) goto L_0x0097;
    L_0x0086:
        r4 = 32;
        if (r3 != r4) goto L_0x0090;
    L_0x008a:
        r3 = 26;
        r5.append(r3);
        goto L_0x0025;
    L_0x0090:
        r3 = r3 + -97;
        r3 = (char) r3;
        r5.append(r3);
        goto L_0x0025;
    L_0x0097:
        r4 = p000a.p001a.p002a.p022f.p023a.C0146a.m868d(r3);
        if (r4 == 0) goto L_0x00a8;
    L_0x009d:
        r5.append(r7);
        r3 = r3 + -65;
        r3 = (char) r3;
        r5.append(r3);
        goto L_0x0025;
    L_0x00a8:
        r4 = p000a.p001a.p002a.p022f.p023a.C0146a.m864a(r3);
        if (r4 == 0) goto L_0x00b4;
    L_0x00ae:
        r13 = 2;
        r5.append(r8);
        goto L_0x000e;
    L_0x00b4:
        r5.append(r6);
        r4 = f515b;
        r3 = r4[r3];
        r3 = (char) r3;
        r5.append(r3);
        goto L_0x0025;
    L_0x00c1:
        r4 = p000a.p001a.p002a.p022f.p023a.C0146a.m864a(r3);
        if (r4 == 0) goto L_0x00d1;
    L_0x00c7:
        r4 = f514a;
        r3 = r4[r3];
        r3 = (char) r3;
        r5.append(r3);
        goto L_0x0025;
    L_0x00d1:
        r4 = p000a.p001a.p002a.p022f.p023a.C0146a.m868d(r3);
        if (r4 == 0) goto L_0x00dd;
    L_0x00d7:
        r5.append(r8);
        r13 = r1;
        goto L_0x000e;
    L_0x00dd:
        r4 = p000a.p001a.p002a.p022f.p023a.C0146a.m870f(r3);
        if (r4 == 0) goto L_0x00e9;
    L_0x00e3:
        r5.append(r7);
        r13 = r2;
        goto L_0x000e;
    L_0x00e9:
        r4 = r10 + r0;
        r4 = r4 + 1;
        if (r4 >= r11) goto L_0x0105;
    L_0x00ef:
        r4 = r10 + r0;
        r4 = r4 + 1;
        r4 = r9.charAt(r4);
        r4 = p000a.p001a.p002a.p022f.p023a.C0146a.m866b(r4);
        if (r4 == 0) goto L_0x0105;
    L_0x00fd:
        r13 = 3;
        r3 = 25;
        r5.append(r3);
        goto L_0x000e;
    L_0x0105:
        r5.append(r6);
        r4 = f515b;
        r3 = r4[r3];
        r3 = (char) r3;
        r5.append(r3);
        goto L_0x0025;
    L_0x0112:
        r5.append(r6);
        r13 = r1;
        goto L_0x000e;
    L_0x0118:
        r0 = r1;
        goto L_0x0036;
    L_0x011b:
        r0 = r5.charAt(r3);
        goto L_0x0043;
    L_0x0121:
        r0 = r6 % 2;
        if (r0 == 0) goto L_0x012d;
    L_0x0125:
        r0 = r4 * 30;
        r0 = r0 + 29;
        r0 = (char) r0;
        r12.append(r0);
    L_0x012d:
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.f.a.a.a(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    /* renamed from: a */
    private static int m859a(String str, int i, Charset charset) throws fb {
        CharsetEncoder newEncoder = charset.newEncoder();
        int length = str.length();
        int i2 = i;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            int i3 = 0;
            while (i3 < 13) {
                try {
                    if (!C0146a.m869e(charAt)) {
                        break;
                    }
                    i3++;
                    int i4 = i2 + i3;
                    if (i4 >= length) {
                        break;
                    }
                    charAt = str.charAt(i4);
                } catch (fb e) {
                    throw e;
                }
            }
            if (i3 >= 13) {
                return i2 - i;
            }
            char charAt2 = str.charAt(i2);
            try {
                if (newEncoder.canEncode(charAt2)) {
                    i2++;
                } else {
                    throw new fb(f534z[0] + charAt2 + f534z[1] + charAt2 + ')');
                }
            } catch (fb e2) {
                throw e2;
            }
        }
        return i2 - i;
    }

    /* renamed from: a */
    static String m860a(String str, C0147b c0147b, Charset charset) throws fb {
        StringBuilder stringBuilder = new StringBuilder(str.length());
        if (charset == null) {
            charset = f517d;
        } else if (!f517d.equals(charset)) {
            C0186g characterSetECIByName = C0186g.getCharacterSetECIByName(charset.name());
            if (characterSetECIByName != null) {
                try {
                    C0146a.m861a(characterSetECIByName.getValue(), stringBuilder);
                } catch (fb e) {
                    throw e;
                }
            }
        }
        int length = str.length();
        try {
            if (c0147b == C0147b.TEXT) {
                C0146a.m858a((CharSequence) str, 0, length, stringBuilder, 0);
            } else if (c0147b == C0147b.BYTE) {
                byte[] bytes = str.getBytes(charset);
                C0146a.m863a(bytes, 0, bytes.length, 1, stringBuilder);
            } else {
                try {
                    if (c0147b == C0147b.NUMERIC) {
                        stringBuilder.append('Ά');
                        C0146a.m862a(str, 0, length, stringBuilder);
                    } else {
                        int i = 0;
                        int i2 = 0;
                        int i3 = 0;
                        while (i3 < length) {
                            int b = C0146a.m865b(str, i3);
                            if (b >= 13) {
                                stringBuilder.append('Ά');
                                i = 2;
                                C0146a.m862a(str, i3, b, stringBuilder);
                                b = i3 + b;
                                i2 = 0;
                            } else {
                                int a = C0146a.m857a((CharSequence) str, i3);
                                if (a >= 5 || b == length) {
                                    if (i != 0) {
                                        stringBuilder.append('΄');
                                        i = 0;
                                        i2 = 0;
                                    }
                                    i2 = C0146a.m858a((CharSequence) str, i3, a, stringBuilder, i2);
                                    b = i3 + a;
                                } else {
                                    b = C0146a.m859a(str, i3, charset);
                                    if (b == 0) {
                                        b = 1;
                                    }
                                    byte[] bytes2 = str.substring(i3, i3 + b).getBytes(charset);
                                    try {
                                        if (bytes2.length == 1 && i == 0) {
                                            C0146a.m863a(bytes2, 0, 1, 0, stringBuilder);
                                        } else {
                                            C0146a.m863a(bytes2, 0, bytes2.length, i, stringBuilder);
                                            i = 1;
                                            i2 = 0;
                                        }
                                        b += i3;
                                    } catch (fb e2) {
                                        throw e2;
                                    } catch (fb e22) {
                                        throw e22;
                                    }
                                }
                            }
                            i3 = b;
                        }
                    }
                } catch (fb e222) {
                    throw e222;
                }
            }
            return stringBuilder.toString();
        } catch (fb e2222) {
            throw e2222;
        }
    }

    /* renamed from: a */
    private static void m861a(int i, StringBuilder stringBuilder) throws fb {
        if (i >= 0 && i < f527n) {
            try {
                stringBuilder.append('Ο');
                stringBuilder.append((char) i);
            } catch (fb e) {
                throw e;
            }
        } else if (i < 810900) {
            try {
                stringBuilder.append('Ξ');
                stringBuilder.append((char) ((i / f527n) - 1));
                stringBuilder.append((char) (i % f527n));
            } catch (fb e2) {
                throw e2;
            }
        } else if (i < 811800) {
            try {
                stringBuilder.append('Ν');
                stringBuilder.append((char) (810900 - i));
            } catch (fb e22) {
                throw e22;
            }
        } else {
            throw new fb(f534z[2] + i);
        }
    }

    /* renamed from: a */
    private static void m862a(String str, int i, int i2, StringBuilder stringBuilder) {
        StringBuilder stringBuilder2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i3 = 0;
        while (i3 < i2) {
            stringBuilder2.setLength(0);
            int min = Math.min(44, i2 - i3);
            BigInteger bigInteger = new BigInteger('1' + str.substring(i + i3, (i + i3) + min));
            do {
                stringBuilder2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = stringBuilder2.length() - 1; length >= 0; length--) {
                stringBuilder.append(stringBuilder2.charAt(length));
            }
            i3 += min;
        }
    }

    /* renamed from: a */
    private static void m863a(byte[] bArr, int i, int i2, int i3, StringBuilder stringBuilder) {
        int i4;
        if (i2 == 1 && i3 == 0) {
            stringBuilder.append('Α');
        } else if (i2 % 6 == 0) {
            stringBuilder.append('Μ');
        } else {
            stringBuilder.append('΅');
        }
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                int i5;
                long j = 0;
                for (i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + ((long) (bArr[i4 + i5] & 255));
                }
                for (i5 = 0; i5 < 5; i5++) {
                    cArr[i5] = (char) ((int) (j % 900));
                    j /= 900;
                }
                for (i5 = cArr.length - 1; i5 >= 0; i5--) {
                    stringBuilder.append(cArr[i5]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            stringBuilder.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    /* renamed from: a */
    private static boolean m864a(char c) {
        return f514a[c] != (byte) -1;
    }

    /* renamed from: b */
    private static int m865b(CharSequence charSequence, int i) {
        int i2 = 0;
        int length = charSequence.length();
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (C0146a.m869e(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* renamed from: b */
    private static boolean m866b(char c) {
        return f515b[c] != (byte) -1;
    }

    /* renamed from: c */
    private static boolean m867c(char c) {
        return c == '\t' || c == '\n' || c == '\r' || (c >= ' ' && c <= '~');
    }

    /* renamed from: d */
    private static boolean m868d(char c) {
        return c == ' ' || (c >= qb.f3195j && c <= qb.f3192g);
    }

    /* renamed from: e */
    private static boolean m869e(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: f */
    private static boolean m870f(char c) {
        return c == ' ' || (c >= qb.f3206v && c <= qb.f3196k);
    }

    /* renamed from: z */
    private static String m871z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 15;
                    break;
                case 1:
                    i2 = 31;
                    break;
                case 2:
                    i2 = 54;
                    break;
                case 3:
                    i2 = 41;
                    break;
                default:
                    i2 = 10;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m872z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 10);
        }
        return toCharArray;
    }
}
