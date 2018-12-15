package p000a.p001a.p002a.p022f.p025c;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Formatter;
import java.util.List;
import p000a.p001a.p002a.C0211r;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p019g.C0187h;
import p000a.p001a.p002a.p019g.C0194n;
import p000a.p001a.p002a.p019g.p028a.C0175a;
import p000a.p001a.p002a.p022f.C0170d;
import p000a.p001a.p002a.p022f.p025c.p026a.C0157c;

/* renamed from: a.a.a.f.c.b */
public final class C0158b {
    /* renamed from: a */
    private static final int f586a = 2;
    /* renamed from: b */
    private static final int f587b = 512;
    /* renamed from: c */
    private static final C0157c f588c = new C0157c();
    /* renamed from: d */
    private static final int f589d = 3;
    /* renamed from: z */
    private static final String[] f590z = new String[]{C0158b.m966z(C0158b.m967z("xn'\u0011W\u0018ej\u0011")), C0158b.m966z(C0158b.m967z("\u000f54\u0019W\u0018ey")), C0158b.m966z(C0158b.m967z("\n!p\u0011R\n!p")), C0158b.m966z(C0158b.m967z("\u000fo"))};

    private C0158b() {
    }

    /* renamed from: a */
    private static int m942a(C0167k c0167k, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        C0163g c0163g = null;
        if (C0158b.m957a(c0167k, i - i3)) {
            c0163g = c0167k.m1034a(i - i3).m979a(i2);
        }
        if (c0163g != null) {
            return z ? c0163g.m1003c() : c0163g.m1008h();
        } else {
            c0163g = c0167k.m1034a(i).m982b(i2);
            if (c0163g != null) {
                return z ? c0163g.m1008h() : c0163g.m1003c();
            } else {
                if (C0158b.m957a(c0167k, i - i3)) {
                    c0163g = c0167k.m1034a(i - i3).m982b(i2);
                }
                if (c0163g != null) {
                    return z ? c0163g.m1003c() : c0163g.m1008h();
                } else {
                    int i4 = 0;
                    while (C0158b.m957a(c0167k, i - i3)) {
                        i -= i3;
                        for (C0163g c0163g2 : c0167k.m1034a(i).m981a()) {
                            if (c0163g2 != null) {
                                return ((i3 * i4) * (c0163g2.m1003c() - c0163g2.m1008h())) + (z ? c0163g2.m1003c() : c0163g2.m1008h());
                            }
                        }
                        i4++;
                    }
                    return z ? c0167k.m1035a().m1012a() : c0167k.m1035a().m1015c();
                }
            }
        }
    }

    /* renamed from: a */
    private static int m943a(C0194n c0194n, int i, int i2, boolean z, int i3, int i4) {
        int i5 = 0;
        int i6 = z ? -1 : 1;
        int i7 = i3;
        while (i5 < 2) {
            int i8 = i7;
            while (true) {
                if (!z) {
                    if (i8 >= i2) {
                        break;
                    }
                } else if (i8 < i) {
                    break;
                }
                if (z != c0194n.m1221d(i8, i4)) {
                    break;
                } else if (Math.abs(i3 - i8) > 2) {
                    return i3;
                } else {
                    i8 += i6;
                }
            }
            i6 = -i6;
            i5++;
            z = !z;
            i7 = i8;
        }
        return i7;
    }

    /* renamed from: a */
    private static int m944a(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static int m945a(int[] r2, int[] r3, int r4) throws p000a.p001a.p002a.C0211r {
        /*
        if (r3 == 0) goto L_0x0009;
    L_0x0002:
        r0 = r3.length;	 Catch:{ r -> 0x0016 }
        r1 = r4 / 2;
        r1 = r1 + 3;
        if (r0 > r1) goto L_0x000f;
    L_0x0009:
        if (r4 < 0) goto L_0x000f;
    L_0x000b:
        r0 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        if (r4 <= r0) goto L_0x001a;
    L_0x000f:
        r0 = p000a.p001a.p002a.C0211r.m1265a();	 Catch:{ r -> 0x0014 }
        throw r0;	 Catch:{ r -> 0x0014 }
    L_0x0014:
        r0 = move-exception;
        throw r0;
    L_0x0016:
        r0 = move-exception;
        throw r0;	 Catch:{ r -> 0x0018 }
    L_0x0018:
        r0 = move-exception;
        throw r0;	 Catch:{ r -> 0x0014 }
    L_0x001a:
        r0 = f588c;
        r0 = r0.m941a(r2, r4, r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.f.c.b.a(int[], int[], int):int");
    }

    /* renamed from: a */
    private static C0161e m946a(C0194n c0194n, C0164h c0164h, eb ebVar, boolean z, int i, int i2) {
        C0161e c0161e = new C0161e(c0164h, z);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int b = (int) ebVar.m312b();
            int a = (int) ebVar.m311a();
            while (a <= c0164h.m1016d() && a >= c0164h.m1018g()) {
                C0163g a2 = C0158b.m947a(c0194n, 0, c0194n.m1208a(), z, b, a, i, i2);
                if (a2 != null) {
                    c0161e.m980a(a, a2);
                    b = z ? a2.m1008h() : a2.m1003c();
                }
                a += i4;
            }
            i3++;
        }
        return c0161e;
    }

    /* renamed from: a */
    private static C0163g m947a(C0194n c0194n, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int a = C0158b.m943a(c0194n, i, i2, z, i3, i4);
        int[] b = C0158b.m964b(c0194n, i, i2, z, a, i4);
        if (b == null) {
            return null;
        }
        int i7;
        int a2 = C0175a.m1083a(b);
        if (z) {
            i7 = a;
            a += a2;
        } else {
            for (i7 = 0; i7 < b.length / 2; i7++) {
                int i8 = b[i7];
                b[i7] = b[(b.length - 1) - i7];
                b[(b.length - 1) - i7] = i8;
            }
            i7 = a - a2;
        }
        if (!C0158b.m956a(a2, i5, i6)) {
            return null;
        }
        a2 = C0162f.m996c(b);
        i8 = C0170d.m1050a(a2);
        return i8 == -1 ? null : new C0163g(i7, a, C0158b.m965c(a2), i8);
    }

    /* renamed from: a */
    private static C0164h m948a(C0161e c0161e) throws C0213t {
        if (c0161e == null) {
            return null;
        }
        int[] d = c0161e.m991d();
        if (d == null) {
            return null;
        }
        int b = C0158b.m961b(d);
        int i = 0;
        for (int i2 : d) {
            i += b - i2;
            if (i2 > 0) {
                break;
            }
        }
        C0163g[] a = c0161e.m981a();
        int i3 = i;
        i = 0;
        while (i3 > 0) {
            try {
                if (a[i] != null) {
                    break;
                }
                i3--;
                i++;
            } catch (C0213t e) {
                throw e;
            }
        }
        i = 0;
        int length = d.length - 1;
        while (length >= 0) {
            i += b - d[length];
            try {
                if (d[length] > 0) {
                    break;
                }
                length--;
            } catch (C0213t e2) {
                throw e2;
            }
        }
        length = i;
        i = a.length - 1;
        while (length > 0) {
            try {
                if (a[i] != null) {
                    break;
                }
                length--;
                i--;
            } catch (C0213t e22) {
                throw e22;
            }
        }
        return c0161e.m983b().m1013a(i3, length, c0161e.m992e());
    }

    /* renamed from: a */
    private static C0167k m949a(C0161e c0161e, C0161e c0161e2) throws C0213t {
        if (c0161e == null && c0161e2 == null) {
            return null;
        }
        C0169m b = C0158b.m962b(c0161e, c0161e2);
        return b != null ? new C0167k(b, C0164h.m1009a(C0158b.m948a(c0161e), C0158b.m948a(c0161e2))) : null;
    }

    /* renamed from: a */
    private static C0187h m950a(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws C0212s, C0211r {
        int[] iArr5 = new int[iArr3.length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                i2 = 0;
                while (i2 < iArr5.length) {
                    try {
                        iArr[iArr3[i2]] = iArr4[i2][iArr5[i2]];
                        i2++;
                    } catch (C0211r e) {
                        throw e;
                    }
                }
                try {
                    break;
                } catch (C0211r e2) {
                    if (iArr5.length == 0) {
                        throw C0211r.m1265a();
                    }
                    i2 = 0;
                    while (i2 < iArr5.length) {
                        try {
                            if (iArr5[i2] < iArr4[i2].length - 1) {
                                iArr5[i2] = iArr5[i2] + 1;
                                break;
                            }
                            iArr5[i2] = 0;
                            if (i2 == iArr5.length - 1) {
                                throw C0211r.m1265a();
                            }
                            i2++;
                        } catch (C0211r e3) {
                            throw e3;
                        } catch (C0211r e32) {
                            throw e32;
                        }
                    }
                    i2 = i3;
                } catch (C0211r e322) {
                    throw e322;
                } catch (C0211r e3222) {
                    throw e3222;
                }
            }
            throw C0211r.m1265a();
        }
        return C0158b.m952a(iArr, i, iArr2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static p000a.p001a.p002a.p019g.C0187h m951a(p000a.p001a.p002a.p019g.C0194n r15, p000a.p001a.p002a.eb r16, p000a.p001a.p002a.eb r17, p000a.p001a.p002a.eb r18, p000a.p001a.p002a.eb r19, int r20, int r21) throws p000a.p001a.p002a.C0213t, p000a.p001a.p002a.C0212s, p000a.p001a.p002a.C0211r {
        /*
        r0 = new a.a.a.f.c.h;
        r1 = r15;
        r2 = r16;
        r3 = r17;
        r4 = r18;
        r5 = r19;
        r0.<init>(r1, r2, r3, r4, r5);
        r7 = 0;
        r6 = 0;
        r2 = 0;
        r1 = 0;
        r8 = r1;
        r1 = r0;
        r0 = r2;
        r2 = r7;
    L_0x0016:
        r3 = 2;
        if (r8 >= r3) goto L_0x007c;
    L_0x0019:
        if (r16 == 0) goto L_0x0117;
    L_0x001b:
        r3 = 1;
        r0 = r15;
        r2 = r16;
        r4 = r20;
        r5 = r21;
        r7 = p000a.p001a.p002a.p022f.p025c.C0158b.m946a(r0, r1, r2, r3, r4, r5);
    L_0x0027:
        if (r18 == 0) goto L_0x0114;
    L_0x0029:
        r3 = 0;
        r0 = r15;
        r2 = r18;
        r4 = r20;
        r5 = r21;
        r0 = p000a.p001a.p002a.p022f.p025c.C0158b.m946a(r0, r1, r2, r3, r4, r5);
    L_0x0035:
        r2 = p000a.p001a.p002a.p022f.p025c.C0158b.m949a(r7, r0);
        if (r2 != 0) goto L_0x0042;
    L_0x003b:
        r0 = p000a.p001a.p002a.C0213t.m1269a();	 Catch:{ t -> 0x0040 }
        throw r0;	 Catch:{ t -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        if (r8 != 0) goto L_0x0076;
    L_0x0044:
        r3 = r2.m1035a();	 Catch:{ t -> 0x0072 }
        if (r3 == 0) goto L_0x0076;
    L_0x004a:
        r3 = r2.m1035a();	 Catch:{ t -> 0x0074 }
        r3 = r3.m1018g();	 Catch:{ t -> 0x0074 }
        r4 = r1.m1018g();	 Catch:{ t -> 0x0074 }
        if (r3 < r4) goto L_0x0066;
    L_0x0058:
        r3 = r2.m1035a();	 Catch:{ t -> 0x0074 }
        r3 = r3.m1016d();	 Catch:{ t -> 0x0074 }
        r4 = r1.m1016d();	 Catch:{ t -> 0x0074 }
        if (r3 <= r4) goto L_0x0076;
    L_0x0066:
        r3 = r2.m1035a();
        r1 = r8 + 1;
        r8 = r1;
        r6 = r0;
        r0 = r2;
        r1 = r3;
        r2 = r7;
        goto L_0x0016;
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ t -> 0x0074 }
    L_0x0074:
        r0 = move-exception;
        throw r0;
    L_0x0076:
        r2.m1037a(r1);
        r6 = r0;
        r0 = r2;
        r2 = r7;
    L_0x007c:
        r3 = r0.m1041j();
        r14 = r3 + 1;
        r3 = 0;
        r0.m1036a(r3, r2);	 Catch:{ t -> 0x009f }
        r0.m1036a(r14, r6);	 Catch:{ t -> 0x009f }
        if (r2 == 0) goto L_0x00a1;
    L_0x008b:
        r5 = 1;
    L_0x008c:
        r11 = 1;
        r9 = r21;
        r8 = r20;
    L_0x0091:
        if (r11 > r14) goto L_0x010d;
    L_0x0093:
        if (r5 == 0) goto L_0x00a3;
    L_0x0095:
        r10 = r11;
    L_0x0096:
        r2 = r0.m1034a(r10);	 Catch:{ t -> 0x00a7 }
        if (r2 == 0) goto L_0x00a9;
    L_0x009c:
        r11 = r11 + 1;
        goto L_0x0091;
    L_0x009f:
        r0 = move-exception;
        throw r0;
    L_0x00a1:
        r5 = 0;
        goto L_0x008c;
    L_0x00a3:
        r2 = r14 - r11;
        r10 = r2;
        goto L_0x0096;
    L_0x00a7:
        r0 = move-exception;
        throw r0;
    L_0x00a9:
        if (r10 == 0) goto L_0x00ad;
    L_0x00ab:
        if (r10 != r14) goto L_0x00dd;
    L_0x00ad:
        r3 = new a.a.a.f.c.e;	 Catch:{ t -> 0x00d9 }
        if (r10 != 0) goto L_0x00db;
    L_0x00b1:
        r2 = 1;
    L_0x00b2:
        r3.<init>(r1, r2);
        r12 = r3;
    L_0x00b6:
        r0.m1036a(r10, r12);
        r2 = -1;
        r7 = r1.m1018g();
        r13 = r2;
    L_0x00bf:
        r2 = r1.m1016d();
        if (r7 > r2) goto L_0x009c;
    L_0x00c5:
        r6 = p000a.p001a.p002a.p022f.p025c.C0158b.m942a(r0, r10, r7, r5);
        if (r6 < 0) goto L_0x00d1;
    L_0x00cb:
        r2 = r1.m1015c();	 Catch:{ t -> 0x00e4 }
        if (r6 <= r2) goto L_0x00e9;
    L_0x00d1:
        r2 = -1;
        if (r13 != r2) goto L_0x00e8;
    L_0x00d4:
        r2 = r13;
    L_0x00d5:
        r7 = r7 + 1;
        r13 = r2;
        goto L_0x00bf;
    L_0x00d9:
        r0 = move-exception;
        throw r0;
    L_0x00db:
        r2 = 0;
        goto L_0x00b2;
    L_0x00dd:
        r2 = new a.a.a.f.c.d;
        r2.<init>(r1);
        r12 = r2;
        goto L_0x00b6;
    L_0x00e4:
        r0 = move-exception;
        throw r0;	 Catch:{ t -> 0x00e6 }
    L_0x00e6:
        r0 = move-exception;
        throw r0;
    L_0x00e8:
        r6 = r13;
    L_0x00e9:
        r3 = r1.m1012a();
        r4 = r1.m1015c();
        r2 = r15;
        r2 = p000a.p001a.p002a.p022f.p025c.C0158b.m947a(r2, r3, r4, r5, r6, r7, r8, r9);
        if (r2 == 0) goto L_0x0112;
    L_0x00f8:
        r12.m980a(r7, r2);
        r3 = r2.m1005e();
        r8 = java.lang.Math.min(r8, r3);
        r2 = r2.m1005e();
        r9 = java.lang.Math.max(r9, r2);
        r2 = r6;
        goto L_0x00d5;
    L_0x010d:
        r0 = p000a.p001a.p002a.p022f.p025c.C0158b.m963b(r0);
        return r0;
    L_0x0112:
        r2 = r13;
        goto L_0x00d5;
    L_0x0114:
        r0 = r6;
        goto L_0x0035;
    L_0x0117:
        r7 = r2;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.f.c.b.a(a.a.a.g.n, a.a.a.eb, a.a.a.eb, a.a.a.eb, a.a.a.eb, int, int):a.a.a.g.h");
    }

    /* renamed from: a */
    private static C0187h m952a(int[] iArr, int i, int[] iArr2) throws C0212s, C0211r {
        try {
            if (iArr.length == 0) {
                throw C0212s.m1267a();
            }
            int i2 = 1 << (i + 1);
            int a = C0158b.m945a(iArr, iArr2, i2);
            C0158b.m955a(iArr, i2);
            C0187h a2 = C0159c.m971a(iArr, String.valueOf(i));
            a2.m1162b(Integer.valueOf(a));
            a2.m1159a(Integer.valueOf(iArr2.length));
            return a2;
        } catch (C0212s e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static String m953a(C0168l[][] c0168lArr) {
        Formatter formatter = new Formatter();
        for (int i = 0; i < c0168lArr.length; i++) {
            formatter.format(f590z[0], new Object[]{Integer.valueOf(i)});
            for (C0168l a : c0168lArr[i]) {
                if (a.m1043a().length == 0) {
                    formatter.format(f590z[2], (Object[]) null);
                } else {
                    formatter.format(f590z[1], new Object[]{Integer.valueOf(c0168lArr[i][r3].m1043a()[0]), c0168lArr[i][r3].m1042a(c0168lArr[i][r3].m1043a()[0])});
                }
            }
            formatter.format(f590z[3], new Object[0]);
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }

    /* renamed from: a */
    private static void m954a(C0167k c0167k, C0168l[][] c0168lArr) throws C0213t {
        int[] a = c0168lArr[0][1].m1043a();
        int j = (c0167k.m1041j() * c0167k.m1038b()) - C0158b.m960b(c0167k.m1039f());
        try {
            if (a.length != 0) {
                try {
                    if (a[0] != j) {
                        c0168lArr[0][1].m1044b(j);
                    }
                } catch (C0213t e) {
                    throw e;
                }
            } else if (j < 1 || j > C0170d.f651a) {
                try {
                    throw C0213t.m1269a();
                } catch (C0213t e2) {
                    throw e2;
                }
            } else {
                c0168lArr[0][1].m1044b(j);
            }
        } catch (C0213t e22) {
            throw e22;
        } catch (C0213t e222) {
            throw e222;
        }
    }

    /* renamed from: a */
    private static void m955a(int[] iArr, int i) throws C0212s {
        try {
            if (iArr.length < 4) {
                throw C0212s.m1267a();
            }
            int i2 = iArr[0];
            try {
                if (i2 > iArr.length) {
                    throw C0212s.m1267a();
                } else if (i2 == 0) {
                    try {
                        if (i < iArr.length) {
                            iArr[0] = iArr.length - i;
                            return;
                        }
                        throw C0212s.m1267a();
                    } catch (C0212s e) {
                        throw e;
                    }
                }
            } catch (C0212s e2) {
                throw e2;
            }
        } catch (C0212s e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    private static boolean m956a(int i, int i2, int i3) {
        return i2 + -2 <= i && i <= i3 + 2;
    }

    /* renamed from: a */
    private static boolean m957a(C0167k c0167k, int i) {
        return i >= 0 && i <= c0167k.m1041j() + 1;
    }

    /* renamed from: a */
    private static int[] m958a(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int length = iArr.length - 1;
        while (true) {
            if ((i & 1) != i2) {
                i2 = i & 1;
                length--;
                if (length < 0) {
                    return iArr;
                }
            }
            iArr[length] = iArr[length] + 1;
            i >>= 1;
        }
    }

    /* renamed from: a */
    private static C0168l[][] m959a(C0167k c0167k) {
        C0168l[][] c0168lArr = (C0168l[][]) Array.newInstance(C0168l.class, new int[]{c0167k.m1038b(), c0167k.m1041j() + 2});
        for (int i = 0; i < c0168lArr.length; i++) {
            for (int i2 = 0; i2 < c0168lArr[i].length; i2++) {
                c0168lArr[i][i2] = new C0168l();
            }
        }
        int i3 = 0;
        for (C0160d c0160d : c0167k.m1040h()) {
            if (c0160d != null) {
                for (C0163g c0163g : c0160d.m981a()) {
                    if (c0163g != null) {
                        int a = c0163g.m999a();
                        if (a >= 0 && a < c0168lArr.length) {
                            c0168lArr[a][i3].m1044b(c0163g.m1004d());
                        }
                    }
                }
            }
            i3++;
        }
        return c0168lArr;
    }

    /* renamed from: b */
    private static int m960b(int i) {
        return 2 << i;
    }

    /* renamed from: b */
    private static int m961b(int[] iArr) {
        int i = -1;
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        return i;
    }

    /* renamed from: b */
    private static C0169m m962b(C0161e c0161e, C0161e c0161e2) {
        if (c0161e != null) {
            C0169m f = c0161e.m993f();
            if (f != null) {
                if (c0161e2 != null) {
                    C0169m f2 = c0161e2.m993f();
                    if (f2 != null) {
                        return (f.m1047c() == f2.m1047c() || f.m1048d() == f2.m1048d() || f.m1046b() == f2.m1046b()) ? f : null;
                    }
                }
                return f;
            }
        }
        return c0161e2 == null ? null : c0161e2.m993f();
    }

    /* renamed from: b */
    private static C0187h m963b(C0167k c0167k) throws C0212s, C0211r, C0213t {
        int i = 0;
        C0168l[][] a = C0158b.m959a(c0167k);
        C0158b.m954a(c0167k, a);
        Collection arrayList = new ArrayList();
        int[] iArr = new int[(c0167k.m1038b() * c0167k.m1041j())];
        List arrayList2 = new ArrayList();
        Collection arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < c0167k.m1038b(); i2++) {
            int i3 = 0;
            while (i3 < c0167k.m1041j()) {
                Object a2 = a[i2][i3 + 1].m1043a();
                int j = (c0167k.m1041j() * i2) + i3;
                try {
                    if (a2.length == 0) {
                        arrayList.add(Integer.valueOf(j));
                    } else {
                        try {
                            if (a2.length == 1) {
                                iArr[j] = a2[0];
                            } else {
                                arrayList3.add(Integer.valueOf(j));
                                arrayList2.add(a2);
                            }
                        } catch (C0212s e) {
                            throw e;
                        }
                    }
                    i3++;
                } catch (C0212s e2) {
                    throw e2;
                }
            }
        }
        int[][] iArr2 = new int[arrayList2.size()][];
        while (i < iArr2.length) {
            try {
                iArr2[i] = (int[]) arrayList2.get(i);
                i++;
            } catch (C0212s e22) {
                throw e22;
            }
        }
        return C0158b.m950a(c0167k.m1039f(), iArr, C0170d.m1052a(arrayList), C0170d.m1052a(arrayList3), iArr2);
    }

    /* renamed from: b */
    private static int[] m964b(C0194n c0194n, int i, int i2, boolean z, int i3, int i4) {
        int[] iArr = new int[8];
        int i5 = z ? 1 : -1;
        boolean z2 = z;
        int i6 = 0;
        while (true) {
            if (!z) {
                if (i3 < i) {
                    break;
                }
            } else if (i3 >= i2) {
                break;
            }
            if (i6 >= iArr.length) {
                break;
            } else if (c0194n.m1221d(i3, i4) == z2) {
                iArr[i6] = iArr[i6] + 1;
                i3 += i5;
            } else {
                i6++;
                z2 = !z2;
            }
        }
        if (i6 != iArr.length) {
            if (!z) {
                i2 = i;
            }
            if (!(i3 == i2 && i6 == iArr.length - 1)) {
                return null;
            }
        }
        return iArr;
    }

    /* renamed from: c */
    private static int m965c(int i) {
        return C0158b.m944a(C0158b.m958a(i));
    }

    /* renamed from: z */
    private static String m966z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 42;
                    break;
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 80;
                    break;
                case 3:
                    i2 = 49;
                    break;
                default:
                    i2 = 114;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m967z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 114);
        }
        return toCharArray;
    }
}
