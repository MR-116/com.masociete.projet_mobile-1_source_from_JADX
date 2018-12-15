package p000a.p001a.p002a.p015d.p017b;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.ui.p065b.p067a.qb;
import java.util.Arrays;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.p015d.C0140e;
import p000a.p001a.p002a.p019g.C0187h;
import p000a.p001a.p002a.p019g.C0194n;
import p000a.p001a.p002a.p019g.p029b.C0179b;
import p000a.p001a.p002a.p019g.p029b.C0180c;
import p000a.p001a.p002a.p019g.p029b.C0182e;

/* renamed from: a.a.a.d.b.b */
public final class C0128b {
    /* renamed from: a */
    private static final String[] f434a = new String[]{C0128b.m759z(C0128b.m760z("\b6\u0007k\u001b1")), " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", C0607n.Gc, "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "", C0128b.m759z(C0128b.m760z("\b6\u0007k\u0007.")), C0128b.m759z(C0128b.m760z("\b6\u0007k\u001e.")), C0128b.m759z(C0128b.m760z("\b6\u0007k\u001b.")), C0128b.m759z(C0128b.m760z("\b6\u0007k\t1"))};
    /* renamed from: b */
    private static final String[] f435b = new String[]{C0128b.m759z(C0128b.m760z("\b6\u0007k\u001b1")), " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", C0128b.m759z(C0128b.m760z("\b6\u0007k\u001e.")), C0128b.m759z(C0128b.m760z("\b6\u0007k\u001e1"))};
    /* renamed from: d */
    private static final String[] f436d = new String[]{"", "\r", C0128b.m759z(C0128b.m760z("Fh")), C0128b.m759z(C0128b.m760z("eB")), C0128b.m759z(C0128b.m760z("gB")), C0128b.m759z(C0128b.m760z("qB")), "!", "\"", "#", "$", "%", "&", "'", "(", ")", C0607n.Vc, C0607n.dm, ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", C0128b.m759z(C0128b.m760z("\b6\u0007k\u001e."))};
    /* renamed from: e */
    private static final String[] f437e = new String[]{C0128b.m759z(C0128b.m760z("\b6\u0007k\u001b1")), " ", C0607n.Zq, C0607n.Eu, C0607n.Yk, C0607n.cf, C0607n.qu, C0607n.Mn, C0607n.Lg, C0607n.Bq, "I", C0607n.xl, "K", "L", "M", "N", "O", C0607n.rq, "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", C0128b.m759z(C0128b.m760z("\b6\u0007k\u0007.")), C0128b.m759z(C0128b.m760z("\b6\u0007k\u0006.")), C0128b.m759z(C0128b.m760z("\b6\u0007k\u000f.")), C0128b.m759z(C0128b.m760z("\b6\u0007k\t1"))};
    /* renamed from: f */
    private static final String[] f438f = new String[]{C0128b.m759z(C0128b.m760z("\b6\u0007k\u001b1")), " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", C0128b.m759z(C0128b.m760z("\b6\u0007k\u001e1")), C0128b.m759z(C0128b.m760z("\b6\u0007k\u0006.")), C0128b.m759z(C0128b.m760z("\b6\u0007k\u000f.")), C0128b.m759z(C0128b.m760z("\b6\u0007k\t1"))};
    /* renamed from: z */
    private static final String[] f439z = new String[]{C0128b.m759z(C0128b.m760z("\t\u0003Ik@*\u0000A.")), C0128b.m759z(C0128b.m760z("\b6\u0007k"))};
    /* renamed from: c */
    private C0140e f440c;

    /* renamed from: a */
    private static byte m749a(boolean[] zArr, int i) {
        int length = zArr.length - i;
        if (length < 8) {
            return (byte) (C0128b.m751a(zArr, i, length) << (8 - length));
        }
        try {
            return (byte) C0128b.m751a(zArr, i, 8);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* renamed from: a */
    private static int m750a(int i, boolean z) {
        return ((z ? 88 : 112) + (i * 16)) * i;
    }

    /* renamed from: a */
    private static int m751a(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private static C0127a m752a(char c) {
        switch (c) {
            case 'B':
                return C0127a.BINARY;
            case 'D':
                return C0127a.DIGIT;
            case 'L':
                try {
                    return C0127a.LOWER;
                } catch (IllegalStateException e) {
                    throw e;
                }
            case 'M':
                return C0127a.MIXED;
            case 'P':
                return C0127a.PUNCT;
            default:
                return C0127a.UPPER;
        }
    }

    /* renamed from: a */
    private static String m753a(C0127a c0127a, int i) {
        try {
            switch (C0129c.f441a[c0127a.ordinal()]) {
                case 1:
                    return f437e[i];
                case 2:
                    return f438f[i];
                case 3:
                    return f434a[i];
                case 4:
                    return f436d[i];
                case 5:
                    return f435b[i];
                default:
                    throw new IllegalStateException(f439z[0]);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
        throw e;
    }

    /* renamed from: a */
    private boolean[] m754a(C0194n c0194n) {
        int i;
        boolean d = this.f440c.m822d();
        int e = this.f440c.m823e();
        int i2 = (d ? 11 : 14) + (e * 4);
        int[] iArr = new int[i2];
        boolean[] zArr = new boolean[C0128b.m750a(e, d)];
        int i3;
        if (d) {
            i3 = 0;
            while (i3 < iArr.length) {
                try {
                    iArr[i3] = i3;
                    i3++;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        }
        int i4 = i2 / 2;
        i = ((i2 + 1) + ((((i2 / 2) - 1) / 15) * 2)) / 2;
        for (i3 = 0; i3 < i4; i3++) {
            int i5 = (i3 / 15) + i3;
            iArr[(i4 - i3) - 1] = (i - i5) - 1;
            iArr[i4 + i3] = (i5 + i) + 1;
        }
        i = 0;
        for (i5 = 0; i5 < e; i5++) {
            int i6 = ((e - i5) * 4) + (d ? 9 : 12);
            int i7 = i5 * 2;
            int i8 = (i2 - 1) - i7;
            for (i4 = 0; i4 < i6; i4++) {
                int i9 = i4 * 2;
                i3 = 0;
                while (i3 < 2) {
                    try {
                        zArr[(i + i9) + i3] = c0194n.m1221d(iArr[i7 + i3], iArr[i7 + i4]);
                        zArr[(((i6 * 2) + i) + i9) + i3] = c0194n.m1221d(iArr[i7 + i4], iArr[i8 - i3]);
                        zArr[(((i6 * 4) + i) + i9) + i3] = c0194n.m1221d(iArr[i8 - i3], iArr[i8 - i4]);
                        zArr[(((i6 * 6) + i) + i9) + i3] = c0194n.m1221d(iArr[i8 - i4], iArr[i7 + i3]);
                        i3++;
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                }
            }
            i = (i6 * 8) + i;
        }
        return zArr;
    }

    /* renamed from: a */
    private boolean[] m755a(boolean[] zArr) throws C0212s {
        C0180c c0180c;
        int i = 8;
        if (this.f440c.m823e() <= 2) {
            i = 6;
            c0180c = C0180c.f684h;
        } else if (this.f440c.m823e() <= 8) {
            c0180c = C0180c.f686k;
        } else if (this.f440c.m823e() <= 22) {
            i = 10;
            c0180c = C0180c.f689o;
        } else {
            i = 12;
            c0180c = C0180c.f682d;
        }
        int c = this.f440c.m821c();
        int length = zArr.length / i;
        if (length < c) {
            try {
                throw C0212s.m1267a();
            } catch (C0179b e) {
                throw e;
            }
        }
        int[] iArr = new int[length];
        int length2 = zArr.length % i;
        int i2 = 0;
        while (i2 < length) {
            iArr[i2] = C0128b.m751a(zArr, length2, i);
            i2++;
            length2 += i;
        }
        try {
            new C0182e(c0180c).m1124a(iArr, length - c);
            int i3 = (1 << i) - 1;
            int i4 = 0;
            for (i2 = 0; i2 < c; i2++) {
                length2 = iArr[i2];
                if (length2 == 0 || length2 == i3) {
                    try {
                        throw C0212s.m1267a();
                    } catch (C0179b e2) {
                        throw e2;
                    }
                }
                if (length2 == 1 || length2 == i3 - 1) {
                    i4++;
                }
            }
            boolean[] zArr2 = new boolean[((c * i) - i4)];
            int i5 = 0;
            i2 = 0;
            while (i5 < c) {
                int i6 = iArr[i5];
                if (i6 == 1 || i6 == i3 - 1) {
                    Arrays.fill(zArr2, i2, (i2 + i) - 1, i6 > 1);
                    i4 = (i - 1) + i2;
                } else {
                    length2 = i - 1;
                    while (length2 >= 0) {
                        length = i2 + 1;
                        zArr2[i2] = ((1 << length2) & i6) != 0;
                        length2--;
                        i2 = length;
                    }
                    i4 = i2;
                }
                i5++;
                i2 = i4;
            }
            return zArr2;
        } catch (Throwable e3) {
            throw C0212s.m1268a(e3);
        }
    }

    /* renamed from: b */
    static byte[] m756b(boolean[] zArr) {
        byte[] bArr = new byte[((zArr.length + 7) / 8)];
        int i = 0;
        while (i < bArr.length) {
            try {
                bArr[i] = C0128b.m749a(zArr, i * 8);
                i++;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return bArr;
    }

    /* renamed from: c */
    private static String m757c(boolean[] zArr) {
        int length = zArr.length;
        C0127a c0127a = C0127a.UPPER;
        C0127a c0127a2 = C0127a.UPPER;
        StringBuilder stringBuilder = new StringBuilder(20);
        int i = 0;
        while (i < length) {
            try {
                int i2;
                if (c0127a2 != C0127a.BINARY) {
                    try {
                        i2 = c0127a2 == C0127a.DIGIT ? 4 : 5;
                        if (length - i < i2) {
                            break;
                        }
                        C0127a a;
                        int a2 = C0128b.m751a(zArr, i, i2);
                        i += i2;
                        String a3 = C0128b.m753a(c0127a2, a2);
                        if (a3.startsWith(f439z[1])) {
                            a = C0128b.m752a(a3.charAt(5));
                            c0127a = a3.charAt(6) == qb.f3197l ? a : c0127a2;
                        } else {
                            stringBuilder.append(a3);
                            a = c0127a;
                        }
                        c0127a2 = a;
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                } else if (length - i < 5) {
                    break;
                } else {
                    i2 = C0128b.m751a(zArr, i, 5);
                    int i3 = i + 5;
                    if (i2 == 0) {
                        if (length - i3 < 11) {
                            break;
                        }
                        i2 = C0128b.m751a(zArr, i3, 11) + 31;
                        i3 += 11;
                    }
                    i = 0;
                    while (i < i2) {
                        if (length - i3 < 8) {
                            i2 = length;
                            break;
                        }
                        stringBuilder.append((char) C0128b.m751a(zArr, i3, 8));
                        i++;
                        i3 += 8;
                    }
                    i2 = i3;
                    i = i2;
                    c0127a2 = c0127a;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: d */
    public static String m758d(boolean[] zArr) {
        return C0128b.m757c(zArr);
    }

    /* renamed from: z */
    private static String m759z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 75;
                    break;
                case 1:
                    i2 = 98;
                    break;
                case 2:
                    i2 = 45;
                    break;
                case 3:
                    i2 = 75;
                    break;
                default:
                    i2 = 52;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m760z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 52);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0187h m761a(C0140e c0140e) throws C0212s {
        this.f440c = c0140e;
        boolean[] a = m755a(m754a(c0140e.m819a()));
        C0187h c0187h = new C0187h(C0128b.m756b(a), C0128b.m757c(a), null, null);
        c0187h.m1158a(a.length);
        return c0187h;
    }
}
