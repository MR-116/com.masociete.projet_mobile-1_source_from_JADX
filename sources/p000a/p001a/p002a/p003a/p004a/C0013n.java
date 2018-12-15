package p000a.p001a.p002a.p003a.p004a;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.application.C0536n;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;

/* renamed from: a.a.a.a.a.n */
public final class C0013n {
    /* renamed from: a */
    private static final int[] f52a = new int[]{5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    /* renamed from: b */
    private static final int[] f53b = new int[256];
    /* renamed from: c */
    private static final int[] f54c = new int[255];
    /* renamed from: d */
    private static final int[][] f55d = new int[][]{new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, C0538a.Lb, C0607n.Fb, 240, 92, 254}, new int[]{28, 24, 185, 166, 223, 248, 116, 255, 110, 61}, new int[]{C0607n.hu, 138, C0607n.f1441Y, 12, C0607n.nn, 168, 39, 245, 60, 97, C0607n.co}, new int[]{41, 153, 158, 91, 61, 42, C0536n.f995G, 213, 97, C0607n.Gk, 100, 242}, new int[]{156, 97, 192, 252, 95, 9, 157, 119, 138, 45, 18, C0607n.pw, 83, 185}, new int[]{83, C0607n.oq, 100, 39, 188, 75, 66, 61, C0607n.bh, 213, 109, C0607n.Wj, 94, 254, 225, 48, 90, 188}, new int[]{15, C0607n.oq, C0607n.uw, 9, 233, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, C0607n.pw, 172}, new int[]{52, 190, 88, C0607n.f1441Y, 109, 39, C0607n.aw, 21, 155, C0607n.Eg, 251, 223, 155, 21, 5, 172, 254, C0607n.Hn, 12, 181, 184, 96, 50, 193}, new int[]{C0607n.lh, 231, 43, 97, 71, 96, 103, 174, 37, 151, C0536n.f1002n, 53, 75, 34, 249, 121, 17, 138, 110, 213, 141, 136, C0607n.co, 151, 233, 168, 93, 255}, new int[]{245, C0607n.bx, 242, 218, 130, C0607n.Ux, C0607n.Ru, 181, 102, C0607n.co, 84, C0607n.yt, C0607n.Tv, 251, 80, 182, C0607n.Yw, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, C0607n.hu, 184, 59, 25, 225, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, 105, 122, 2, 245, 133, 242, 8, C0607n.hu, 95, 100, 9, 167, 105, 214, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, C0607n.Ug, 69, 50, C0536n.f1006y, C0607n.Nr, 226, 5, 9, 5}, new int[]{245, C0538a.tb, 172, 223, 96, 32, 117, 22, 238, 133, 238, 231, C0607n.f1441Y, 188, C0607n.yk, 87, 191, 106, 16, 147, 118, 23, 37, 90, C0536n.f1002n, C0607n.f1441Y, 131, 88, C0607n.co, 100, 66, 138, C0607n.pw, 240, 82, 44, C0607n.aw, 87, 187, 147, 160, C0607n.hu, 69, 213, 92, 253, 225, 19}, new int[]{C0607n.hu, 9, 223, 238, 12, 17, C0607n.Tv, C0607n.qj, 100, 29, C0607n.hu, C0536n.f1002n, C0607n.no, 192, 215, 235, C0536n.f1006y, 159, 36, 223, 38, C0607n.Dt, C0538a.tb, 54, 228, 146, 218, C0607n.Jn, 117, C0607n.f1465w, 29, 232, C0538a.Lb, 238, 22, C0536n.f1006y, C0607n.Bf, 117, 62, C0607n.Px, 164, 13, 137, 245, C0607n.bx, 67, 247, 28, 155, 43, C0607n.f1465w, 107, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, C0538a.Lb, C0607n.Bs, 39, 118, C0607n.Ug, 188, C0607n.Bf, 189, 143, 108, C0607n.Uk, 37, 185, 112, C0607n.Fb, C0607n.no, 245, 63, C0607n.Eg, 190, C0607n.Ux, 106, 185, C0607n.Qt, C0607n.hu, 64, 114, 71, C0607n.kh, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, C0607n.Ao, 31, C0607n.aw, C0536n.f1002n, 4, 107, 232, 7, 94, 166, 224, C0607n.Hn, 86, 47, 11, 204}, new int[]{C0607n.Tv, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, C0607n.uw, 154, 36, 73, C0607n.bx, 213, 136, 248, 180, C0607n.Jn, C0607n.Eg, 158, C0607n.Nr, 68, 122, 93, 213, 15, 160, 227, 236, 66, 139, 153, 185, C0607n.Ug, 167, C0607n.yt, 25, C0607n.Tv, 232, 96, C0607n.Bs, 231, 136, 223, C0607n.Au, 181, C0607n.bh, 59, 52, 172, 25, 49, 232, C0607n.lh, 189, 64, 54, 108, 153, C0538a.tb, 63, 96, 103, 82, C0607n.pw}};
    /* renamed from: e */
    private static final int f56e = 301;
    /* renamed from: z */
    private static final String[] f57z = new String[]{C0013n.m116z(C0013n.m117z("M?\u001e\u001bse?R\u0010ai1\u0017\f4k5R\u001bfv<\u0000^wk!\u0000\u001bwp:\u001d\u00104g<\u0016\u001bck!\u0016\r4w#\u0017\u001d}b:\u0017\u001a.$")), C0013n.m116z(C0013n.m117z("P;\u0017^zq>\u0010\u001bf$<\u0014^wk7\u0017\t{v7\u0001^pk6\u0001^zk'R\u0013up0\u001a^`l6R\rqh6\u0011\nq`s\u0001\u0007yf<\u001e"))};

    static {
        int i = 1;
        for (int i2 = 0; i2 < 255; i2++) {
            f54c[i2] = i;
            f53b[i] = i2;
            i *= 2;
            if (i >= 256) {
                i ^= f56e;
            }
        }
    }

    private C0013n() {
    }

    /* renamed from: a */
    private static String m113a(CharSequence charSequence, int i) {
        return C0013n.m114a(charSequence, 0, charSequence.length(), i);
    }

    /* renamed from: a */
    private static String m114a(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        while (i5 < f52a.length) {
            try {
                if (f52a[i5] == i3) {
                    break;
                }
                i5++;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        i5 = -1;
        if (i5 < 0) {
            try {
                throw new IllegalArgumentException(f57z[0] + i3);
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        int[] iArr = f55d[i5];
        char[] cArr = new char[i3];
        i5 = 0;
        while (i5 < i3) {
            try {
                cArr[i5] = '\u0000';
                i5++;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        for (int i6 = i; i6 < i + i2; i6++) {
            int charAt = charSequence.charAt(i6) ^ cArr[i3 - 1];
            for (i5 = i3 - 1; i5 > 0; i5--) {
                if (charAt != 0) {
                    try {
                        if (iArr[i5] != 0) {
                            cArr[i5] = (char) (cArr[i5 - 1] ^ f54c[(f53b[charAt] + f53b[iArr[i5]]) % 255]);
                        }
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    }
                }
                cArr[i5] = cArr[i5 - 1];
            }
            if (charAt != 0) {
                try {
                    if (iArr[0] != 0) {
                        cArr[0] = (char) f54c[(f53b[charAt] + f53b[iArr[0]]) % 255];
                    }
                } catch (IllegalArgumentException e2222) {
                    throw e2222;
                }
            }
            cArr[0] = '\u0000';
        }
        char[] cArr2 = new char[i3];
        while (i4 < i3) {
            try {
                cArr2[i4] = cArr[(i3 - i4) - 1];
                i4++;
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            }
        }
        return String.valueOf(cArr2);
    }

    /* renamed from: a */
    public static String m115a(String str, C0002c c0002c) {
        try {
            if (str.length() != c0002c.m37h()) {
                throw new IllegalArgumentException(f57z[1]);
            }
            StringBuilder stringBuilder = new StringBuilder(c0002c.m37h() + c0002c.m30a());
            stringBuilder.append(str);
            int j = c0002c.mo2j();
            if (j == 1) {
                stringBuilder.append(C0013n.m113a((CharSequence) str, c0002c.m30a()));
            } else {
                stringBuilder.setLength(stringBuilder.capacity());
                int[] iArr = new int[j];
                int[] iArr2 = new int[j];
                int[] iArr3 = new int[j];
                int i = 0;
                while (i < j) {
                    try {
                        iArr[i] = c0002c.mo1c(i + 1);
                        iArr2[i] = c0002c.m31a(i + 1);
                        iArr3[i] = 0;
                        if (i > 0) {
                            iArr3[i] = iArr3[i - 1] + iArr[i];
                        }
                        i++;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                for (int i2 = 0; i2 < j; i2++) {
                    StringBuilder stringBuilder2 = new StringBuilder(iArr[i2]);
                    for (i = i2; i < c0002c.m37h(); i += j) {
                        stringBuilder2.append(str.charAt(i));
                    }
                    String a = C0013n.m113a(stringBuilder2.toString(), iArr2[i2]);
                    i = i2;
                    int i3 = 0;
                    while (i < iArr2[i2] * j) {
                        int i4 = i3 + 1;
                        stringBuilder.setCharAt(c0002c.m37h() + i, a.charAt(i3));
                        i += j;
                        i3 = i4;
                    }
                }
            }
            return stringBuilder.toString();
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* renamed from: z */
    private static String m116z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 4;
                    break;
                case 1:
                    i2 = 83;
                    break;
                case 2:
                    i2 = 114;
                    break;
                case 3:
                    i2 = 126;
                    break;
                default:
                    i2 = 20;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m117z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 20);
        }
        return toCharArray;
    }
}
