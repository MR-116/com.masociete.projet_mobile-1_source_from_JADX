package p000a.p001a.p002a.p003a.p004a;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.ui.p065b.p067a.qb;
import java.util.Arrays;
import p000a.p001a.p002a.C0209p;

/* renamed from: a.a.a.a.a.b */
public final class C0001b {
    /* renamed from: a */
    static final char f0a = 'þ';
    /* renamed from: b */
    static final char f1b = 'þ';
    /* renamed from: c */
    static final char f2c = 'î';
    /* renamed from: d */
    static final char f3d = 'ï';
    /* renamed from: e */
    static final int f4e = 2;
    /* renamed from: f */
    private static final char f5f = 'ì';
    /* renamed from: g */
    static final int f6g = 4;
    /* renamed from: h */
    static final int f7h = 1;
    /* renamed from: i */
    private static final char f8i = 'í';
    /* renamed from: j */
    static final int f9j = 0;
    /* renamed from: k */
    static final char f10k = 'æ';
    /* renamed from: l */
    private static final String f11l = C0001b.m18z(C0001b.m19z("^f\u0005iS0R"));
    /* renamed from: m */
    static final int f12m = 5;
    /* renamed from: n */
    private static final String f13n = C0001b.m18z(C0001b.m19z("\u001bK"));
    /* renamed from: o */
    private static final char f14o = '';
    /* renamed from: p */
    static final char f15p = 'ç';
    /* renamed from: q */
    static final int f16q = 3;
    /* renamed from: r */
    private static final String f17r = C0001b.m18z(C0001b.m19z("^f\u0005iS3R"));
    /* renamed from: s */
    static final char f18s = 'ë';
    /* renamed from: t */
    static final char f19t = 'ð';
    /* renamed from: z */
    private static final String[] f20z;

    static {
        String[] strArr = new String[3];
        strArr[0] = C0001b.m18z(C0001b.m19z("L#W\u0012\u0004d#\u001b\u0014\u000bd=Z\u0014\u0017`=\u0001W"));
        strArr[1] = C0001b.m18z(C0001b.m19z("%g\u000b\u000f"));
        strArr[2] = C0001b.m18z(C0001b.m19z("5\u000bG"));
        f20z = strArr;
    }

    private C0001b() {
    }

    /* renamed from: a */
    private static char m2a(char c, int i) {
        int i2 = (((i * 149) % 253) + 1) + c;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }

    /* renamed from: a */
    public static int m3a(CharSequence charSequence, int i) {
        int i2 = 0;
        int length = charSequence.length();
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (C0001b.m9a(charAt) && i < length) {
                try {
                    int i3 = i2 + 1;
                    i++;
                    if (i < length) {
                        charAt = charSequence.charAt(i);
                        i2 = i3;
                    } else {
                        i2 = i3;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    static int m4a(CharSequence charSequence, int i, int i2) {
        try {
            if (i >= charSequence.length()) {
                return i2;
            }
            float[] fArr;
            int i3;
            if (i2 == 0) {
                fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
            } else {
                fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
                fArr[i2] = 0.0f;
            }
            int i4 = 0;
            while (i + i4 != charSequence.length()) {
                char charAt = charSequence.charAt(i + i4);
                i4++;
                try {
                    if (C0001b.m9a(charAt)) {
                        fArr[0] = fArr[0] + 0.5f;
                    } else {
                        try {
                            if (C0001b.m12d(charAt)) {
                                fArr[0] = (float) Math.ceil((double) fArr[0]);
                                fArr[0] = fArr[0] + 2.0f;
                            } else {
                                fArr[0] = (float) Math.ceil((double) fArr[0]);
                                fArr[0] = fArr[0] + 1.0f;
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    try {
                        if (C0001b.m10b(charAt)) {
                            fArr[1] = fArr[1] + 0.6666667f;
                        } else {
                            try {
                                if (C0001b.m12d(charAt)) {
                                    fArr[1] = fArr[1] + 2.6666667f;
                                } else {
                                    fArr[1] = fArr[1] + 1.3333334f;
                                }
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            }
                        }
                        try {
                            if (C0001b.m13e(charAt)) {
                                fArr[2] = fArr[2] + 0.6666667f;
                            } else {
                                try {
                                    if (C0001b.m12d(charAt)) {
                                        fArr[2] = fArr[2] + 2.6666667f;
                                    } else {
                                        fArr[2] = fArr[2] + 1.3333334f;
                                    }
                                } catch (IllegalArgumentException e22) {
                                    throw e22;
                                }
                            }
                            try {
                                if (C0001b.m17i(charAt)) {
                                    fArr[3] = fArr[3] + 0.6666667f;
                                } else {
                                    try {
                                        if (C0001b.m12d(charAt)) {
                                            fArr[3] = fArr[3] + 4.3333335f;
                                        } else {
                                            fArr[3] = fArr[3] + 3.3333333f;
                                        }
                                    } catch (IllegalArgumentException e222) {
                                        throw e222;
                                    }
                                }
                                try {
                                    if (C0001b.m14f(charAt)) {
                                        fArr[4] = fArr[4] + 0.75f;
                                    } else {
                                        try {
                                            if (C0001b.m12d(charAt)) {
                                                fArr[4] = fArr[4] + 4.25f;
                                            } else {
                                                fArr[4] = fArr[4] + 3.25f;
                                            }
                                        } catch (IllegalArgumentException e2222) {
                                            throw e2222;
                                        }
                                    }
                                    try {
                                        if (C0001b.m11c(charAt)) {
                                            fArr[5] = fArr[5] + 4.0f;
                                        } else {
                                            fArr[5] = fArr[5] + 1.0f;
                                        }
                                        if (i4 >= 4) {
                                            int[] iArr = new int[6];
                                            byte[] bArr = new byte[6];
                                            C0001b.m6a(fArr, iArr, Integer.MAX_VALUE, bArr);
                                            int a = C0001b.m5a(bArr);
                                            try {
                                                if (iArr[0] < iArr[5]) {
                                                    if (iArr[0] < iArr[1]) {
                                                        try {
                                                            if (iArr[0] < iArr[2]) {
                                                                try {
                                                                    if (iArr[0] < iArr[3]) {
                                                                        try {
                                                                            if (iArr[0] < iArr[4]) {
                                                                                return 0;
                                                                            }
                                                                        } catch (IllegalArgumentException e22222) {
                                                                            throw e22222;
                                                                        }
                                                                    }
                                                                } catch (IllegalArgumentException e222222) {
                                                                    throw e222222;
                                                                }
                                                            }
                                                        } catch (IllegalArgumentException e2222222) {
                                                            throw e2222222;
                                                        }
                                                    }
                                                }
                                                try {
                                                    if (iArr[5] >= iArr[0]) {
                                                        if (((bArr[1] + bArr[2]) + bArr[3]) + bArr[4] != 0) {
                                                            if (a == 1) {
                                                                try {
                                                                    if (bArr[4] > (byte) 0) {
                                                                        return 4;
                                                                    }
                                                                } catch (IllegalArgumentException e22222222) {
                                                                    throw e22222222;
                                                                }
                                                            }
                                                            if (a == 1) {
                                                                try {
                                                                    if (bArr[2] > (byte) 0) {
                                                                        return 2;
                                                                    }
                                                                } catch (IllegalArgumentException e222222222) {
                                                                    throw e222222222;
                                                                }
                                                            }
                                                            if (a == 1) {
                                                                try {
                                                                    if (bArr[3] > (byte) 0) {
                                                                        return 3;
                                                                    }
                                                                } catch (IllegalArgumentException e2222222222) {
                                                                    throw e2222222222;
                                                                }
                                                            }
                                                            try {
                                                                if (iArr[1] + 1 >= iArr[0]) {
                                                                    continue;
                                                                } else if (iArr[1] + 1 < iArr[5]) {
                                                                    try {
                                                                        if (iArr[1] + 1 < iArr[4]) {
                                                                            try {
                                                                                if (iArr[1] + 1 < iArr[2]) {
                                                                                    try {
                                                                                        if (iArr[1] < iArr[3]) {
                                                                                            return 1;
                                                                                        }
                                                                                        if (iArr[1] == iArr[3]) {
                                                                                            i3 = (i + i4) + 1;
                                                                                            while (i3 < charSequence.length()) {
                                                                                                char charAt2 = charSequence.charAt(i3);
                                                                                                try {
                                                                                                    if (C0001b.m16h(charAt2)) {
                                                                                                        return 3;
                                                                                                    }
                                                                                                    try {
                                                                                                        if (!C0001b.m17i(charAt2)) {
                                                                                                            break;
                                                                                                        }
                                                                                                        i3++;
                                                                                                    } catch (IllegalArgumentException e22222222222) {
                                                                                                        throw e22222222222;
                                                                                                    }
                                                                                                } catch (IllegalArgumentException e222222222222) {
                                                                                                    throw e222222222222;
                                                                                                }
                                                                                            }
                                                                                            return 1;
                                                                                        }
                                                                                    } catch (IllegalArgumentException e2222222222222) {
                                                                                        throw e2222222222222;
                                                                                    }
                                                                                }
                                                                                continue;
                                                                            } catch (IllegalArgumentException e22222222222222) {
                                                                                throw e22222222222222;
                                                                            }
                                                                        } else {
                                                                            continue;
                                                                        }
                                                                    } catch (IllegalArgumentException e222222222222222) {
                                                                        throw e222222222222222;
                                                                    }
                                                                } else {
                                                                    continue;
                                                                }
                                                            } catch (IllegalArgumentException e2222222222222222) {
                                                                throw e2222222222222222;
                                                            } catch (IllegalArgumentException e22222222222222222) {
                                                                throw e22222222222222222;
                                                            }
                                                        }
                                                    }
                                                    return 5;
                                                } catch (IllegalArgumentException e222222222222222222) {
                                                    throw e222222222222222222;
                                                } catch (IllegalArgumentException e2222222222222222222) {
                                                    throw e2222222222222222222;
                                                }
                                            } catch (IllegalArgumentException e22222222222222222222) {
                                                throw e22222222222222222222;
                                            } catch (IllegalArgumentException e222222222222222222222) {
                                                throw e222222222222222222222;
                                            }
                                        }
                                    } catch (IllegalArgumentException e2222222222222222222222) {
                                        throw e2222222222222222222222;
                                    }
                                } catch (IllegalArgumentException e22222222222222222222222) {
                                    throw e22222222222222222222222;
                                }
                            } catch (IllegalArgumentException e222222222222222222222222) {
                                throw e222222222222222222222222;
                            }
                        } catch (IllegalArgumentException e2222222222222222222222222) {
                            throw e2222222222222222222222222;
                        }
                    } catch (IllegalArgumentException e22222222222222222222222222) {
                        throw e22222222222222222222222222;
                    }
                } catch (IllegalArgumentException e222222222222222222222222222) {
                    throw e222222222222222222222222222;
                }
            }
            byte[] bArr2 = new byte[6];
            int[] iArr2 = new int[6];
            i3 = C0001b.m6a(fArr, iArr2, Integer.MAX_VALUE, bArr2);
            i4 = C0001b.m5a(bArr2);
            try {
                if (iArr2[0] == i3) {
                    return 0;
                }
                if (i4 == 1) {
                    try {
                        if (bArr2[5] > (byte) 0) {
                            return 5;
                        }
                    } catch (IllegalArgumentException e2222222222222222222222222222) {
                        throw e2222222222222222222222222222;
                    }
                }
                if (i4 == 1) {
                    try {
                        if (bArr2[4] > (byte) 0) {
                            return 4;
                        }
                    } catch (IllegalArgumentException e22222222222222222222222222222) {
                        throw e22222222222222222222222222222;
                    }
                }
                if (i4 == 1) {
                    try {
                        if (bArr2[2] > (byte) 0) {
                            return 2;
                        }
                    } catch (IllegalArgumentException e222222222222222222222222222222) {
                        throw e222222222222222222222222222222;
                    }
                }
                if (i4 == 1) {
                    try {
                        if (bArr2[3] > (byte) 0) {
                            return 3;
                        }
                    } catch (IllegalArgumentException e2222222222222222222222222222222) {
                        throw e2222222222222222222222222222222;
                    }
                }
                return 1;
            } catch (IllegalArgumentException e22222222222222222222222222222222) {
                throw e22222222222222222222222222222222;
            }
        } catch (IllegalArgumentException e222222222222222222222222222222222) {
            throw e222222222222222222222222222222222;
        }
    }

    /* renamed from: a */
    private static int m5a(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (i < 6) {
            i2 += bArr[i];
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    private static int m6a(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i2 = i;
        for (int i3 = 0; i3 < 6; i3++) {
            iArr[i3] = (int) Math.ceil((double) fArr[i3]);
            int i4 = iArr[i3];
            if (i2 > i4) {
                Arrays.fill(bArr, (byte) 0);
                i2 = i4;
            }
            if (i2 == i4) {
                try {
                    bArr[i3] = (byte) (bArr[i3] + 1);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static String m7a(String str) {
        return C0001b.m8a(str, C0004e.FORCE_NONE, null, null);
    }

    /* renamed from: a */
    public static String m8a(String str, C0004e c0004e, C0209p c0209p, C0209p c0209p2) {
        int i = 0;
        C0000a[] c0000aArr = new C0000a[]{new C0005f(), new C0010k(), new C0011l(), new C0012m(), new C0009j(), new C0007h()};
        C0006g c0006g = new C0006g(str);
        try {
            int h;
            int h2;
            StringBuilder c;
            c0006g.m55a(c0004e);
            c0006g.m56a(c0209p, c0209p2);
            if (str.startsWith(f11l)) {
                if (str.endsWith(f13n)) {
                    c0006g.m53a((char) f5f);
                    c0006g.m61c(2);
                    c0006g.f35a += f11l.length();
                    while (c0006g.m66i()) {
                        try {
                            c0000aArr[i].mo4a(c0006g);
                            if (c0006g.m69l() >= 0) {
                                i = c0006g.m69l();
                                c0006g.m64g();
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    h = c0006g.m65h();
                    c0006g.m63f();
                    h2 = c0006g.m67j().m37h();
                    if (!(h >= h2 || i == 0 || i == 5)) {
                        c0006g.m53a('þ');
                    }
                    c = c0006g.m60c();
                    if (c.length() < h2) {
                        c.append(f14o);
                    }
                    while (c.length() < h2) {
                        try {
                            c.append(C0001b.m2a((char) f14o, c.length() + 1));
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                    return c0006g.m60c().toString();
                }
            }
            try {
                if (str.startsWith(f17r)) {
                    if (str.endsWith(f13n)) {
                        c0006g.m53a((char) f8i);
                        c0006g.m61c(2);
                        c0006g.f35a += f17r.length();
                    }
                }
                while (c0006g.m66i()) {
                    c0000aArr[i].mo4a(c0006g);
                    if (c0006g.m69l() >= 0) {
                        i = c0006g.m69l();
                        c0006g.m64g();
                    }
                }
                h = c0006g.m65h();
                c0006g.m63f();
                h2 = c0006g.m67j().m37h();
                try {
                    c0006g.m53a('þ');
                    c = c0006g.m60c();
                    try {
                        if (c.length() < h2) {
                            c.append(f14o);
                        }
                        while (c.length() < h2) {
                            c.append(C0001b.m2a((char) f14o, c.length() + 1));
                        }
                        return c0006g.m60c().toString();
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                } catch (IllegalArgumentException e222) {
                    throw e222;
                }
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            }
        } catch (IllegalArgumentException e222222) {
            throw e222222;
        } catch (IllegalArgumentException e2222222) {
            throw e2222222;
        }
    }

    /* renamed from: a */
    static boolean m9a(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: b */
    private static boolean m10b(char c) {
        return c == ' ' || ((c >= '0' && c <= '9') || (c >= qb.f3195j && c <= qb.f3192g));
    }

    /* renamed from: c */
    private static boolean m11c(char c) {
        return false;
    }

    /* renamed from: d */
    static boolean m12d(char c) {
        return c >= '' && c <= C0607n.Jt;
    }

    /* renamed from: e */
    private static boolean m13e(char c) {
        return c == ' ' || ((c >= '0' && c <= '9') || (c >= qb.f3206v && c <= qb.f3196k));
    }

    /* renamed from: f */
    private static boolean m14f(char c) {
        return c >= ' ' && c <= '^';
    }

    /* renamed from: g */
    static void m15g(char c) {
        String toHexString = Integer.toHexString(c);
        throw new IllegalArgumentException(f20z[0] + c + f20z[1] + (f20z[2].substring(0, 4 - toHexString.length()) + toHexString) + ')');
    }

    /* renamed from: h */
    private static boolean m16h(char c) {
        return c == '\r' || c == '*' || c == '>';
    }

    /* renamed from: i */
    private static boolean m17i(char c) {
        try {
            return C0001b.m16h(c) || c == ' ' || ((c >= '0' && c <= '9') || (c >= qb.f3195j && c <= qb.f3192g));
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            try {
                throw e2;
            } catch (IllegalArgumentException e22) {
                try {
                    throw e22;
                } catch (IllegalArgumentException e222) {
                    try {
                        throw e222;
                    } catch (IllegalArgumentException e2222) {
                        try {
                            throw e2222;
                        } catch (IllegalArgumentException e22222) {
                            throw e22222;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: z */
    private static String m18z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 5;
                    break;
                case 1:
                    i2 = 79;
                    break;
                case 2:
                    i2 = 59;
                    break;
                case 3:
                    i2 = 119;
                    break;
                default:
                    i2 = 99;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m19z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 99);
        }
        return toCharArray;
    }
}
