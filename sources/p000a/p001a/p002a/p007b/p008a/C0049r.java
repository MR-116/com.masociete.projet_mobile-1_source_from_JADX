package p000a.p001a.p002a.p007b.p008a;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.application.C0536n;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.b.a.r */
public final class C0049r {
    /* renamed from: c */
    private static final C0049r[] f128c = C0049r.m255d();
    /* renamed from: f */
    private static final int[] f129f = new int[]{31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    /* renamed from: a */
    private final int[] f130a;
    /* renamed from: b */
    private final C0043l[] f131b;
    /* renamed from: d */
    private final int f132d;
    /* renamed from: e */
    private final int f133e;

    private C0049r(int i, int[] iArr, C0043l... c0043lArr) {
        int i2 = 0;
        this.f132d = i;
        this.f130a = iArr;
        this.f131b = c0043lArr;
        int c = c0043lArr[0].m241c();
        C0044m[] a = c0043lArr[0].m239a();
        int length = a.length;
        int i3 = 0;
        while (i2 < length) {
            C0044m c0044m = a[i2];
            i3 += (c0044m.m243a() + c) * c0044m.m244b();
            i2++;
        }
        this.f133e = i3;
    }

    /* renamed from: a */
    public static C0049r m252a(int i) {
        if (i >= 1 && i <= 40) {
            return f128c[i - 1];
        }
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: b */
    public static C0049r m253b(int i) throws C0212s {
        try {
            if (i % 4 != 1) {
                throw C0212s.m1267a();
            }
            try {
                return C0049r.m252a((i - 17) / 4);
            } catch (IllegalArgumentException e) {
                throw C0212s.m1267a();
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* renamed from: c */
    static C0049r m254c(int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        while (i2 < f129f.length) {
            int i5 = f129f[i2];
            if (i5 == i) {
                try {
                    return C0049r.m252a(i2 + 7);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            i5 = C0032a.m214c(i, i5);
            if (i5 < i3) {
                i4 = i2 + 7;
                i3 = i5;
            }
            i2++;
        }
        if (i3 > 3) {
            return null;
        }
        try {
            return C0049r.m252a(i4);
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* renamed from: d */
    private static C0049r[] m255d() {
        r0 = new C0049r[40];
        int[] iArr = new int[0];
        C0043l[] c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(7, new C0044m(1, 19));
        c0043lArr[1] = new C0043l(10, new C0044m(1, 16));
        c0043lArr[2] = new C0043l(13, new C0044m(1, 13));
        c0043lArr[3] = new C0043l(17, new C0044m(1, 9));
        r0[0] = new C0049r(1, iArr, c0043lArr);
        iArr = new int[]{6, 18};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(10, new C0044m(1, 34));
        c0043lArr[1] = new C0043l(16, new C0044m(1, 28));
        c0043lArr[2] = new C0043l(22, new C0044m(1, 22));
        c0043lArr[3] = new C0043l(28, new C0044m(1, 16));
        r0[1] = new C0049r(2, iArr, c0043lArr);
        iArr = new int[]{6, 22};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(15, new C0044m(1, 55));
        c0043lArr[1] = new C0043l(26, new C0044m(1, 44));
        c0043lArr[2] = new C0043l(18, new C0044m(2, 17));
        c0043lArr[3] = new C0043l(22, new C0044m(2, 13));
        r0[2] = new C0049r(3, iArr, c0043lArr);
        iArr = new int[]{6, 26};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(20, new C0044m(1, 80));
        c0043lArr[1] = new C0043l(18, new C0044m(2, 32));
        c0043lArr[2] = new C0043l(26, new C0044m(2, 24));
        c0043lArr[3] = new C0043l(16, new C0044m(4, 9));
        r0[3] = new C0049r(4, iArr, c0043lArr);
        iArr = new int[]{6, 30};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(26, new C0044m(1, 108));
        c0043lArr[1] = new C0043l(24, new C0044m(2, 43));
        c0043lArr[2] = new C0043l(18, new C0044m(2, 15), new C0044m(2, 16));
        c0043lArr[3] = new C0043l(22, new C0044m(2, 11), new C0044m(2, 12));
        r0[4] = new C0049r(5, iArr, c0043lArr);
        iArr = new int[]{6, 34};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(18, new C0044m(2, 68));
        c0043lArr[1] = new C0043l(16, new C0044m(4, 27));
        c0043lArr[2] = new C0043l(24, new C0044m(4, 19));
        c0043lArr[3] = new C0043l(28, new C0044m(4, 15));
        r0[5] = new C0049r(6, iArr, c0043lArr);
        iArr = new int[]{6, 22, 38};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(20, new C0044m(2, 78));
        c0043lArr[1] = new C0043l(18, new C0044m(4, 31));
        c0043lArr[2] = new C0043l(18, new C0044m(2, 14), new C0044m(4, 15));
        c0043lArr[3] = new C0043l(26, new C0044m(4, 13), new C0044m(1, 14));
        r0[6] = new C0049r(7, iArr, c0043lArr);
        iArr = new int[]{6, 24, 42};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(24, new C0044m(2, 97));
        c0043lArr[1] = new C0043l(22, new C0044m(2, 38), new C0044m(2, 39));
        c0043lArr[2] = new C0043l(22, new C0044m(4, 18), new C0044m(2, 19));
        c0043lArr[3] = new C0043l(26, new C0044m(4, 14), new C0044m(2, 15));
        r0[7] = new C0049r(8, iArr, c0043lArr);
        iArr = new int[]{6, 26, 46};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(30, new C0044m(2, 116));
        c0043lArr[1] = new C0043l(22, new C0044m(3, 36), new C0044m(2, 37));
        c0043lArr[2] = new C0043l(20, new C0044m(4, 16), new C0044m(4, 17));
        c0043lArr[3] = new C0043l(24, new C0044m(4, 12), new C0044m(4, 13));
        r0[8] = new C0049r(9, iArr, c0043lArr);
        iArr = new int[]{6, 28, 50};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(18, new C0044m(2, 68), new C0044m(2, 69));
        c0043lArr[1] = new C0043l(26, new C0044m(4, 43), new C0044m(1, 44));
        c0043lArr[2] = new C0043l(24, new C0044m(6, 19), new C0044m(2, 20));
        c0043lArr[3] = new C0043l(28, new C0044m(6, 15), new C0044m(2, 16));
        r0[9] = new C0049r(10, iArr, c0043lArr);
        iArr = new int[]{6, 30, 54};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(20, new C0044m(4, 81));
        c0043lArr[1] = new C0043l(30, new C0044m(1, 50), new C0044m(4, 51));
        c0043lArr[2] = new C0043l(28, new C0044m(4, 22), new C0044m(4, 23));
        c0043lArr[3] = new C0043l(24, new C0044m(3, 12), new C0044m(8, 13));
        r0[10] = new C0049r(11, iArr, c0043lArr);
        iArr = new int[]{6, 32, 58};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(24, new C0044m(2, 92), new C0044m(2, 93));
        c0043lArr[1] = new C0043l(22, new C0044m(6, 36), new C0044m(2, 37));
        c0043lArr[2] = new C0043l(26, new C0044m(4, 20), new C0044m(6, 21));
        c0043lArr[3] = new C0043l(28, new C0044m(7, 14), new C0044m(4, 15));
        r0[11] = new C0049r(12, iArr, c0043lArr);
        iArr = new int[]{6, 34, 62};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(26, new C0044m(4, 107));
        c0043lArr[1] = new C0043l(22, new C0044m(8, 37), new C0044m(1, 38));
        c0043lArr[2] = new C0043l(24, new C0044m(8, 20), new C0044m(4, 21));
        c0043lArr[3] = new C0043l(22, new C0044m(12, 11), new C0044m(4, 12));
        r0[12] = new C0049r(13, iArr, c0043lArr);
        iArr = new int[]{6, 26, 46, 66};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(30, new C0044m(3, 115), new C0044m(1, 116));
        c0043lArr[1] = new C0043l(24, new C0044m(4, 40), new C0044m(5, 41));
        c0043lArr[2] = new C0043l(20, new C0044m(11, 16), new C0044m(5, 17));
        c0043lArr[3] = new C0043l(24, new C0044m(11, 12), new C0044m(5, 13));
        r0[13] = new C0049r(14, iArr, c0043lArr);
        iArr = new int[]{6, 26, 48, 70};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(22, new C0044m(5, 87), new C0044m(1, 88));
        c0043lArr[1] = new C0043l(24, new C0044m(5, 41), new C0044m(5, 42));
        c0043lArr[2] = new C0043l(30, new C0044m(5, 24), new C0044m(7, 25));
        c0043lArr[3] = new C0043l(24, new C0044m(11, 12), new C0044m(7, 13));
        r0[14] = new C0049r(15, iArr, c0043lArr);
        iArr = new int[]{6, 26, 50, 74};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(24, new C0044m(5, 98), new C0044m(1, 99));
        c0043lArr[1] = new C0043l(28, new C0044m(7, 45), new C0044m(3, 46));
        c0043lArr[2] = new C0043l(24, new C0044m(15, 19), new C0044m(2, 20));
        c0043lArr[3] = new C0043l(30, new C0044m(3, 15), new C0044m(13, 16));
        r0[15] = new C0049r(16, iArr, c0043lArr);
        iArr = new int[]{6, 30, 54, 78};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(28, new C0044m(1, 107), new C0044m(5, 108));
        c0043lArr[1] = new C0043l(28, new C0044m(10, 46), new C0044m(1, 47));
        c0043lArr[2] = new C0043l(28, new C0044m(1, 22), new C0044m(15, 23));
        c0043lArr[3] = new C0043l(28, new C0044m(2, 14), new C0044m(17, 15));
        r0[16] = new C0049r(17, iArr, c0043lArr);
        iArr = new int[]{6, 30, 56, 82};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(30, new C0044m(5, C0607n.co), new C0044m(1, 121));
        c0043lArr[1] = new C0043l(26, new C0044m(9, 43), new C0044m(4, 44));
        c0043lArr[2] = new C0043l(28, new C0044m(17, 22), new C0044m(1, 23));
        c0043lArr[3] = new C0043l(28, new C0044m(2, 14), new C0044m(19, 15));
        r0[17] = new C0049r(18, iArr, c0043lArr);
        iArr = new int[]{6, 30, 58, 86};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(28, new C0044m(3, 113), new C0044m(4, 114));
        c0043lArr[1] = new C0043l(26, new C0044m(3, 44), new C0044m(11, 45));
        c0043lArr[2] = new C0043l(26, new C0044m(17, 21), new C0044m(4, 22));
        c0043lArr[3] = new C0043l(26, new C0044m(9, 13), new C0044m(16, 14));
        r0[18] = new C0049r(19, iArr, c0043lArr);
        iArr = new int[]{6, 34, 62, 90};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(28, new C0044m(3, 107), new C0044m(5, 108));
        c0043lArr[1] = new C0043l(26, new C0044m(3, 41), new C0044m(13, 42));
        c0043lArr[2] = new C0043l(30, new C0044m(15, 24), new C0044m(5, 25));
        c0043lArr[3] = new C0043l(28, new C0044m(15, 15), new C0044m(10, 16));
        r0[19] = new C0049r(20, iArr, c0043lArr);
        iArr = new int[]{6, 28, 50, 72, 94};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(28, new C0044m(4, 116), new C0044m(4, 117));
        c0043lArr[1] = new C0043l(26, new C0044m(17, 42));
        c0043lArr[2] = new C0043l(28, new C0044m(17, 22), new C0044m(6, 23));
        c0043lArr[3] = new C0043l(30, new C0044m(19, 16), new C0044m(6, 17));
        r0[20] = new C0049r(21, iArr, c0043lArr);
        iArr = new int[]{6, 26, 50, 74, 98};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(28, new C0044m(2, 111), new C0044m(7, 112));
        c0043lArr[1] = new C0043l(28, new C0044m(17, 46));
        c0043lArr[2] = new C0043l(30, new C0044m(7, 24), new C0044m(16, 25));
        c0043lArr[3] = new C0043l(24, new C0044m(34, 13));
        r0[21] = new C0049r(22, iArr, c0043lArr);
        iArr = new int[]{6, 30, 54, 78, 102};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(30, new C0044m(4, 121), new C0044m(5, 122));
        c0043lArr[1] = new C0043l(28, new C0044m(4, 47), new C0044m(14, 48));
        c0043lArr[2] = new C0043l(30, new C0044m(11, 24), new C0044m(14, 25));
        c0043lArr[3] = new C0043l(30, new C0044m(16, 15), new C0044m(14, 16));
        r0[22] = new C0049r(23, iArr, c0043lArr);
        iArr = new int[]{6, 28, 54, 80, 106};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(30, new C0044m(6, 117), new C0044m(4, 118));
        c0043lArr[1] = new C0043l(28, new C0044m(6, 45), new C0044m(14, 46));
        c0043lArr[2] = new C0043l(30, new C0044m(11, 24), new C0044m(16, 25));
        c0043lArr[3] = new C0043l(30, new C0044m(30, 16), new C0044m(2, 17));
        r0[23] = new C0049r(24, iArr, c0043lArr);
        iArr = new int[]{6, 32, 58, 84, 110};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(26, new C0044m(8, 106), new C0044m(4, 107));
        c0043lArr[1] = new C0043l(28, new C0044m(8, 47), new C0044m(13, 48));
        c0043lArr[2] = new C0043l(30, new C0044m(7, 24), new C0044m(22, 25));
        c0043lArr[3] = new C0043l(30, new C0044m(22, 15), new C0044m(13, 16));
        r0[24] = new C0049r(25, iArr, c0043lArr);
        iArr = new int[]{6, 30, 58, 86, 114};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(28, new C0044m(10, 114), new C0044m(2, 115));
        c0043lArr[1] = new C0043l(28, new C0044m(19, 46), new C0044m(4, 47));
        c0043lArr[2] = new C0043l(28, new C0044m(28, 22), new C0044m(6, 23));
        c0043lArr[3] = new C0043l(30, new C0044m(33, 16), new C0044m(4, 17));
        r0[25] = new C0049r(26, iArr, c0043lArr);
        iArr = new int[]{6, 34, 62, 90, 118};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(30, new C0044m(8, 122), new C0044m(4, 123));
        c0043lArr[1] = new C0043l(28, new C0044m(22, 45), new C0044m(3, 46));
        c0043lArr[2] = new C0043l(30, new C0044m(8, 23), new C0044m(26, 24));
        c0043lArr[3] = new C0043l(30, new C0044m(12, 15), new C0044m(28, 16));
        r0[26] = new C0049r(27, iArr, c0043lArr);
        iArr = new int[]{6, 26, 50, 74, 98, 122};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(30, new C0044m(3, 117), new C0044m(10, 118));
        c0043lArr[1] = new C0043l(28, new C0044m(3, 45), new C0044m(23, 46));
        c0043lArr[2] = new C0043l(30, new C0044m(4, 24), new C0044m(31, 25));
        c0043lArr[3] = new C0043l(30, new C0044m(11, 15), new C0044m(31, 16));
        r0[27] = new C0049r(28, iArr, c0043lArr);
        iArr = new int[]{6, 30, 54, 78, 102, 126};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(30, new C0044m(7, 116), new C0044m(7, 117));
        c0043lArr[1] = new C0043l(28, new C0044m(21, 45), new C0044m(7, 46));
        c0043lArr[2] = new C0043l(30, new C0044m(1, 23), new C0044m(37, 24));
        c0043lArr[3] = new C0043l(30, new C0044m(19, 15), new C0044m(26, 16));
        r0[28] = new C0049r(29, iArr, c0043lArr);
        iArr = new int[]{6, 26, 52, 78, 104, 130};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(30, new C0044m(5, 115), new C0044m(10, 116));
        c0043lArr[1] = new C0043l(28, new C0044m(19, 47), new C0044m(10, 48));
        c0043lArr[2] = new C0043l(30, new C0044m(15, 24), new C0044m(25, 25));
        c0043lArr[3] = new C0043l(30, new C0044m(23, 15), new C0044m(25, 16));
        r0[29] = new C0049r(30, iArr, c0043lArr);
        iArr = new int[]{6, 30, 56, 82, 108, C0607n.Fb};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(30, new C0044m(13, 115), new C0044m(3, 116));
        c0043lArr[1] = new C0043l(28, new C0044m(2, 46), new C0044m(29, 47));
        c0043lArr[2] = new C0043l(30, new C0044m(42, 24), new C0044m(1, 25));
        c0043lArr[3] = new C0043l(30, new C0044m(23, 15), new C0044m(28, 16));
        r0[30] = new C0049r(31, iArr, c0043lArr);
        iArr = new int[]{6, 34, 60, 86, 112, 138};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(30, new C0044m(17, 115));
        c0043lArr[1] = new C0043l(28, new C0044m(10, 46), new C0044m(23, 47));
        c0043lArr[2] = new C0043l(30, new C0044m(10, 24), new C0044m(35, 25));
        c0043lArr[3] = new C0043l(30, new C0044m(19, 15), new C0044m(35, 16));
        r0[31] = new C0049r(32, iArr, c0043lArr);
        iArr = new int[]{6, 30, 58, 86, 114, C0536n.f995G};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(30, new C0044m(17, 115), new C0044m(1, 116));
        c0043lArr[1] = new C0043l(28, new C0044m(14, 46), new C0044m(21, 47));
        c0043lArr[2] = new C0043l(30, new C0044m(29, 24), new C0044m(19, 25));
        c0043lArr[3] = new C0043l(30, new C0044m(11, 15), new C0044m(46, 16));
        r0[32] = new C0049r(33, iArr, c0043lArr);
        iArr = new int[]{6, 34, 62, 90, 118, 146};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(30, new C0044m(13, 115), new C0044m(6, 116));
        c0043lArr[1] = new C0043l(28, new C0044m(14, 46), new C0044m(23, 47));
        c0043lArr[2] = new C0043l(30, new C0044m(44, 24), new C0044m(7, 25));
        c0043lArr[3] = new C0043l(30, new C0044m(59, 16), new C0044m(1, 17));
        r0[33] = new C0049r(34, iArr, c0043lArr);
        iArr = new int[]{6, 30, 54, 78, 102, 126, C0536n.f1006y};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(30, new C0044m(12, 121), new C0044m(7, 122));
        c0043lArr[1] = new C0043l(28, new C0044m(12, 47), new C0044m(26, 48));
        c0043lArr[2] = new C0043l(30, new C0044m(39, 24), new C0044m(14, 25));
        c0043lArr[3] = new C0043l(30, new C0044m(22, 15), new C0044m(41, 16));
        r0[34] = new C0049r(35, iArr, c0043lArr);
        iArr = new int[]{6, 24, 50, 76, 102, 128, 154};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(30, new C0044m(6, 121), new C0044m(14, 122));
        c0043lArr[1] = new C0043l(28, new C0044m(6, 47), new C0044m(34, 48));
        c0043lArr[2] = new C0043l(30, new C0044m(46, 24), new C0044m(10, 25));
        c0043lArr[3] = new C0043l(30, new C0044m(2, 15), new C0044m(64, 16));
        r0[35] = new C0049r(36, iArr, c0043lArr);
        iArr = new int[]{6, 28, 54, 80, 106, C0538a.tb, 158};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(30, new C0044m(17, 122), new C0044m(4, 123));
        c0043lArr[1] = new C0043l(28, new C0044m(29, 46), new C0044m(14, 47));
        c0043lArr[2] = new C0043l(30, new C0044m(49, 24), new C0044m(10, 25));
        c0043lArr[3] = new C0043l(30, new C0044m(24, 15), new C0044m(46, 16));
        r0[36] = new C0049r(37, iArr, c0043lArr);
        iArr = new int[]{6, 32, 58, 84, 110, 136, C0607n.Ru};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(30, new C0044m(4, 122), new C0044m(18, 123));
        c0043lArr[1] = new C0043l(28, new C0044m(13, 46), new C0044m(32, 47));
        c0043lArr[2] = new C0043l(30, new C0044m(48, 24), new C0044m(14, 25));
        c0043lArr[3] = new C0043l(30, new C0044m(42, 15), new C0044m(32, 16));
        r0[37] = new C0049r(38, iArr, c0043lArr);
        iArr = new int[]{6, 26, 54, 82, 110, 138, 166};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(30, new C0044m(20, 117), new C0044m(4, 118));
        c0043lArr[1] = new C0043l(28, new C0044m(40, 47), new C0044m(7, 48));
        c0043lArr[2] = new C0043l(30, new C0044m(43, 24), new C0044m(22, 25));
        c0043lArr[3] = new C0043l(30, new C0044m(10, 15), new C0044m(67, 16));
        r0[38] = new C0049r(39, iArr, c0043lArr);
        iArr = new int[]{6, 30, 58, 86, 114, C0536n.f995G, C0536n.f1002n};
        c0043lArr = new C0043l[4];
        c0043lArr[0] = new C0043l(30, new C0044m(19, 118), new C0044m(6, 119));
        c0043lArr[1] = new C0043l(28, new C0044m(18, 47), new C0044m(31, 48));
        c0043lArr[2] = new C0043l(30, new C0044m(34, 24), new C0044m(34, 25));
        c0043lArr[3] = new C0043l(30, new C0044m(20, 15), new C0044m(61, 16));
        r0[39] = new C0049r(40, iArr, c0043lArr);
        return r0;
    }

    /* renamed from: a */
    public C0043l m256a(C0046o c0046o) {
        return this.f131b[c0046o.ordinal()];
    }

    /* renamed from: a */
    C0194n m257a() {
        int f = m261f();
        C0194n c0194n = new C0194n(f);
        c0194n.m1212a(0, 0, 9, 9);
        c0194n.m1212a(f - 8, 0, 8, 9);
        c0194n.m1212a(0, f - 8, 9, 8);
        int length = this.f130a.length;
        int i = 0;
        while (i < length) {
            int i2 = this.f130a[i] - 2;
            int i3 = 0;
            while (i3 < length) {
                if (!((i == 0 && (i3 == 0 || i3 == length - 1)) || (i == length - 1 && i3 == 0))) {
                    c0194n.m1212a(this.f130a[i3] - 2, i2, 5, 5);
                }
                i3++;
            }
            i++;
        }
        try {
            c0194n.m1212a(6, 9, 1, f - 17);
            c0194n.m1212a(9, 6, f - 17, 1);
            if (this.f132d > 6) {
                c0194n.m1212a(f - 11, 0, 3, 6);
                c0194n.m1212a(0, f - 11, 6, 3);
            }
            return c0194n;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: b */
    public int m258b() {
        return this.f132d;
    }

    /* renamed from: c */
    public int[] m259c() {
        return this.f130a;
    }

    /* renamed from: e */
    public int m260e() {
        return this.f133e;
    }

    /* renamed from: f */
    public int m261f() {
        return (this.f132d * 4) + 17;
    }

    public String toString() {
        return String.valueOf(this.f132d);
    }
}
