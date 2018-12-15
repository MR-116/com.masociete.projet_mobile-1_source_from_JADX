package p000a.p001a.p002a.p019g;

import java.util.Arrays;

/* renamed from: a.a.a.g.n */
public final class C0194n implements Cloneable {
    /* renamed from: z */
    private static final String[] f755z = new String[]{C0194n.m1206z(C0194n.m1207z("W5")), C0194n.m1206z(C0194n.m1207z("/5")), C0194n.m1206z(C0194n.m1207z("MzlIek|uD+||wO6/xmR1/w}\u0001\"}pyU }5lI$a5(")), C0194n.m1206z(C0194n.m1207z("fytD\"ny8B-ngyB1jg8D+lzmO1jg}E/")), C0194n.m1206z(C0194n.m1207z("}zo\u0001)j{U-|5|Neazl\u0001(na{I")), C0194n.m1206z(C0194n.m1207z("f{hT1/xyU7fm8E,bpvR,`{k\u0001!`5vN1/xyU&g")), C0194n.m1206z(C0194n.m1207z("GpqF-{5yO!/bqE1g5uT6{5zDena8M nfl\u0001t")), C0194n.m1206z(C0194n.m1207z("[}}\u00017jrqN+/xmR1/sqUef{kH!j5lI /xyU7fm")), C0194n.m1206z(C0194n.m1207z("Cp~Uen{|\u00011`e8L0|a8C /{wO+jryU,yp"))};
    /* renamed from: a */
    private final int f756a;
    /* renamed from: b */
    private final int[] f757b;
    /* renamed from: c */
    private final int f758c;
    /* renamed from: d */
    private final int f759d;

    public C0194n(int i) {
        this(i, i);
    }

    public C0194n(int i, int i2) {
        if (i < 1 || i2 < 1) {
            try {
                throw new IllegalArgumentException(f755z[2]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.f759d = i;
        this.f758c = i2;
        this.f756a = (i + 31) / 32;
        this.f757b = new int[(this.f756a * i2)];
    }

    private C0194n(int i, int i2, int i3, int[] iArr) {
        this.f759d = i;
        this.f758c = i2;
        this.f756a = i3;
        this.f757b = iArr;
    }

    /* renamed from: a */
    public static C0194n m1204a(String str, String str2, String str3) {
        if (str == null) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        boolean[] zArr = new boolean[str.length()];
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (i < str.length()) {
            try {
                int i6;
                if (str.charAt(i) != '\n') {
                    try {
                        if (str.charAt(i) != '\r') {
                            if (str.substring(i, str2.length() + i).equals(str2)) {
                                i += str2.length();
                                zArr[i5] = true;
                                i5++;
                            } else if (str.substring(i, str3.length() + i).equals(str3)) {
                                i += str3.length();
                                zArr[i5] = false;
                                i5++;
                            } else {
                                throw new IllegalArgumentException(f755z[3] + str.substring(i));
                            }
                        }
                    } catch (IllegalArgumentException e2) {
                        try {
                            throw e2;
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        }
                    }
                }
                if (i5 > i4) {
                    if (i3 == -1) {
                        i3 = i5 - i4;
                    } else if (i5 - i4 != i3) {
                        try {
                            throw new IllegalArgumentException(f755z[4]);
                        } catch (IllegalArgumentException e222) {
                            throw e222;
                        }
                    }
                    i4 = i5;
                    i6 = i3;
                    i3 = i2 + 1;
                    i2 = i6;
                } else {
                    i6 = i2;
                    i2 = i3;
                    i3 = i6;
                }
                i++;
                i6 = i3;
                i3 = i2;
                i2 = i6;
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            }
        }
        if (i5 > i4) {
            if (i3 == -1) {
                i3 = i5 - i4;
            } else if (i5 - i4 != i3) {
                try {
                    throw new IllegalArgumentException(f755z[4]);
                } catch (IllegalArgumentException e222222) {
                    throw e222222;
                }
            }
            i2++;
        }
        C0194n c0194n = new C0194n(i3, i2);
        i2 = 0;
        while (i2 < i5) {
            try {
                if (zArr[i2]) {
                    c0194n.m1215b(i2 % i3, i2 / i3);
                }
                i2++;
            } catch (IllegalArgumentException e2222222) {
                throw e2222222;
            }
        }
        return c0194n;
    }

    /* renamed from: b */
    private String m1205b(String str, String str2, String str3) {
        StringBuilder stringBuilder = new StringBuilder(this.f758c * (this.f759d + 1));
        for (int i = 0; i < this.f758c; i++) {
            int i2 = 0;
            while (i2 < this.f759d) {
                try {
                    stringBuilder.append(m1221d(i2, i) ? str : str2);
                    i2++;
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            stringBuilder.append(str3);
        }
        return stringBuilder.toString();
    }

    /* renamed from: z */
    private static String m1206z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 15;
                    break;
                case 1:
                    i2 = 21;
                    break;
                case 2:
                    i2 = 24;
                    break;
                case 3:
                    i2 = 33;
                    break;
                default:
                    i2 = 69;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1207z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 69);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int m1208a() {
        return this.f759d;
    }

    /* renamed from: a */
    public C0185f m1209a(int i, C0185f c0185f) {
        int i2;
        int i3;
        if (c0185f != null) {
            try {
                if (c0185f.m1136a() >= this.f759d) {
                    c0185f.m1147c();
                    i2 = i * this.f756a;
                    while (i3 < this.f756a) {
                        try {
                            c0185f.m1144b(i3 * 32, this.f757b[i2 + i3]);
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    return c0185f;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        c0185f = new C0185f(this.f759d);
        i2 = i * this.f756a;
        for (i3 = 0; i3 < this.f756a; i3++) {
            c0185f.m1144b(i3 * 32, this.f757b[i2 + i3]);
        }
        return c0185f;
    }

    /* renamed from: a */
    public String m1210a(String str, String str2) {
        return m1205b(str, str2, "\n");
    }

    /* renamed from: a */
    public void m1211a(int i, int i2) {
        int i3 = (this.f756a * i2) + (i / 32);
        int[] iArr = this.f757b;
        iArr[i3] = iArr[i3] & ((1 << (i & 31)) ^ -1);
    }

    /* renamed from: a */
    public void m1212a(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            try {
                throw new IllegalArgumentException(f755z[8]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i4 < 1 || i3 < 1) {
            try {
                throw new IllegalArgumentException(f755z[6]);
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else {
            int i5 = i + i3;
            int i6 = i2 + i4;
            try {
                if (i6 <= this.f758c) {
                    if (i5 <= this.f759d) {
                        while (i2 < i6) {
                            int i7 = i2 * this.f756a;
                            int i8 = i;
                            while (i8 < i5) {
                                try {
                                    int[] iArr = this.f757b;
                                    int i9 = (i8 / 32) + i7;
                                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                                    i8++;
                                } catch (IllegalArgumentException e22) {
                                    throw e22;
                                }
                            }
                            i2++;
                        }
                        return;
                    }
                }
                throw new IllegalArgumentException(f755z[7]);
            } catch (IllegalArgumentException e222) {
                throw e222;
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        }
    }

    /* renamed from: a */
    public void m1213a(C0194n c0194n) {
        try {
            if (this.f759d == c0194n.m1208a()) {
                if (this.f758c == c0194n.m1226i()) {
                    try {
                        if (this.f756a == c0194n.m1220d()) {
                            C0185f c0185f = new C0185f((this.f759d / 32) + 1);
                            for (int i = 0; i < this.f758c; i++) {
                                int i2 = i * this.f756a;
                                int[] b = c0194n.m1209a(i, c0185f).m1146b();
                                int i3 = 0;
                                while (i3 < this.f756a) {
                                    try {
                                        int[] iArr = this.f757b;
                                        int i4 = i2 + i3;
                                        iArr[i4] = iArr[i4] ^ b[i3];
                                        i3++;
                                    } catch (IllegalArgumentException e) {
                                        throw e;
                                    }
                                }
                            }
                            return;
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
            }
            throw new IllegalArgumentException(f755z[5]);
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    /* renamed from: b */
    public C0194n m1214b() {
        return new C0194n(this.f759d, this.f758c, this.f756a, (int[]) this.f757b.clone());
    }

    /* renamed from: b */
    public void m1215b(int i, int i2) {
        int i3 = (this.f756a * i2) + (i / 32);
        int[] iArr = this.f757b;
        iArr[i3] = iArr[i3] | (1 << (i & 31));
    }

    /* renamed from: b */
    public void m1216b(int i, C0185f c0185f) {
        System.arraycopy(c0185f.m1146b(), 0, this.f757b, this.f756a * i, this.f756a);
    }

    @Deprecated
    /* renamed from: c */
    public String m1217c(String str, String str2, String str3) {
        return m1205b(str, str2, str3);
    }

    /* renamed from: c */
    public void m1218c(int i, int i2) {
        int i3 = (this.f756a * i2) + (i / 32);
        int[] iArr = this.f757b;
        iArr[i3] = iArr[i3] ^ (1 << (i & 31));
    }

    /* renamed from: c */
    public int[] m1219c() {
        int i = 0;
        while (i < this.f757b.length) {
            try {
                if (this.f757b[i] == 0) {
                    i++;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        try {
            if (i == this.f757b.length) {
                return null;
            }
            int i2 = i / this.f756a;
            int i3 = (i % this.f756a) * 32;
            int i4 = this.f757b[i];
            i = 0;
            while ((i4 << (31 - i)) == 0) {
                i++;
            }
            i3 += i;
            return new int[]{i3, i2};
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m1214b();
    }

    /* renamed from: d */
    public int m1220d() {
        return this.f756a;
    }

    /* renamed from: d */
    public boolean m1221d(int i, int i2) {
        try {
            return ((this.f757b[(this.f756a * i2) + (i / 32)] >>> (i & 31)) & 1) != 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: e */
    public int[] m1222e() {
        int length = this.f757b.length - 1;
        while (length >= 0) {
            try {
                if (this.f757b[length] != 0) {
                    break;
                }
                length--;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        if (length < 0) {
            return null;
        }
        int i = length / this.f756a;
        int i2 = (length % this.f756a) * 32;
        int i3 = this.f757b[length];
        length = 31;
        while ((i3 >>> length) == 0) {
            length--;
        }
        i2 += length;
        return new int[]{i2, i};
    }

    public boolean equals(Object obj) {
        try {
            if (!(obj instanceof C0194n)) {
                return false;
            }
            C0194n c0194n = (C0194n) obj;
            try {
                if (this.f759d != c0194n.f759d) {
                    return false;
                }
                if (this.f758c != c0194n.f758c) {
                    return false;
                }
                try {
                    if (this.f756a != c0194n.f756a) {
                        return false;
                    }
                    try {
                        return Arrays.equals(this.f757b, c0194n.f757b);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    /* renamed from: f */
    public int[] m1223f() {
        int i = this.f759d;
        int i2 = this.f758c;
        int i3 = i;
        i = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f758c; i5++) {
            int i6 = 0;
            while (i6 < this.f756a) {
                int i7;
                int i8 = this.f757b[(this.f756a * i5) + i6];
                if (i8 != 0) {
                    if (i5 < i2) {
                        i2 = i5;
                    }
                    if (i5 > i4) {
                        i4 = i5;
                    }
                    if (i6 * 32 < i3) {
                        i7 = 0;
                        while ((i8 << (31 - i7)) == 0) {
                            i7++;
                        }
                        if ((i6 * 32) + i7 < i3) {
                            i7 = (i6 * 32) + i7;
                            if ((i6 * 32) + 31 > i) {
                                i3 = 31;
                                while ((i8 >>> i3) == 0) {
                                    i3--;
                                }
                                if ((i6 * 32) + i3 > i) {
                                    i = (i6 * 32) + i3;
                                    i3 = i2;
                                    i2 = i;
                                    i = i4;
                                }
                            }
                            i3 = i2;
                            i2 = i;
                            i = i4;
                        }
                    }
                    i7 = i3;
                    if ((i6 * 32) + 31 > i) {
                        i3 = 31;
                        while ((i8 >>> i3) == 0) {
                            i3--;
                        }
                        if ((i6 * 32) + i3 > i) {
                            i = (i6 * 32) + i3;
                            i3 = i2;
                            i2 = i;
                            i = i4;
                        }
                    }
                    i3 = i2;
                    i2 = i;
                    i = i4;
                } else {
                    i7 = i3;
                    i3 = i2;
                    i2 = i;
                    i = i4;
                }
                i6++;
                i4 = i;
                i = i2;
                i2 = i3;
                i3 = i7;
            }
        }
        if (i < i3 || i4 < i2) {
            return null;
        }
        return new int[]{i3, i2, (i - i3) + 1, (i4 - i2) + 1};
    }

    /* renamed from: g */
    public void m1224g() {
        int i = 0;
        int length = this.f757b.length;
        while (i < length) {
            try {
                this.f757b[i] = 0;
                i++;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    /* renamed from: h */
    public void m1225h() {
        int a = m1208a();
        int i = m1226i();
        C0185f c0185f = new C0185f(a);
        C0185f c0185f2 = new C0185f(a);
        for (a = 0; a < (i + 1) / 2; a++) {
            c0185f = m1209a(a, c0185f);
            c0185f2 = m1209a((i - 1) - a, c0185f2);
            c0185f.m1153f();
            c0185f2.m1153f();
            m1216b(a, c0185f2);
            m1216b((i - 1) - a, c0185f);
        }
    }

    public int hashCode() {
        return (((((((this.f759d * 31) + this.f759d) * 31) + this.f758c) * 31) + this.f756a) * 31) + Arrays.hashCode(this.f757b);
    }

    /* renamed from: i */
    public int m1226i() {
        return this.f758c;
    }

    public String toString() {
        return m1210a(f755z[0], f755z[1]);
    }
}
