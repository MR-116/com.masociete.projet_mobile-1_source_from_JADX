package p000a.p001a.p002a.p003a;

import java.util.Map;
import p000a.p001a.p002a.C0204i;
import p000a.p001a.p002a.C0209p;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.cb;
import p000a.p001a.p002a.p003a.p004a.C0001b;
import p000a.p001a.p002a.p003a.p004a.C0002c;
import p000a.p001a.p002a.p003a.p004a.C0004e;
import p000a.p001a.p002a.p003a.p004a.C0008i;
import p000a.p001a.p002a.p003a.p004a.C0013n;
import p000a.p001a.p002a.p007b.p010c.C0061a;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.a.d */
public final class C0028d implements cb {
    /* renamed from: z */
    private static final String[] f90z = new String[]{C0028d.m178z(C0028d.m179z("zL%\u0002\u0014[]1\u0013QL@9\u0012\u001f[@;\u0019\u0002\bH&\u0012Q\\F;W\u0002EH8\u001bK\b")), C0028d.m178z(C0028d.m179z("nF!\u0019\u0015\bL9\u0007\u0005Q\t7\u0018\u001f\\L:\u0003\u0002")), C0028d.m178z(C0028d.m179z("kH:W\u001eFE-W\u0014FJ;\u0013\u0014\bm\u0015#0wd\u0015##aqxW\u0013]]t\u0010\u001e\\\t"))};

    /* renamed from: a */
    private static C0194n m176a(C0008i c0008i, C0002c c0002c) {
        int i = c0002c.m38i();
        int c = c0002c.m33c();
        C0061a c0061a = new C0061a(c0002c.m32b(), c0002c.m35d());
        int i2 = 0;
        int i3 = 0;
        while (i2 < c) {
            try {
                int i4;
                int i5;
                int i6;
                if (i2 % c0002c.f24a == 0) {
                    i4 = 0;
                    i5 = 0;
                    while (i4 < c0002c.m32b()) {
                        try {
                            c0061a.m329a(i5, i3, i4 % 2 == 0);
                            i5++;
                            i4++;
                        } catch (IllegalArgumentException e) {
                            throw e;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                    i6 = i3 + 1;
                } else {
                    i6 = i3;
                }
                i5 = 0;
                i3 = 0;
                while (i5 < i) {
                    try {
                        if (i5 % c0002c.f28f == 0) {
                            c0061a.m329a(i3, i6, true);
                            i3++;
                        }
                        try {
                            c0061a.m329a(i3, i6, c0008i.m85a(i5, i2));
                            i4 = i3 + 1;
                            if (i5 % c0002c.f28f == c0002c.f28f - 1) {
                                c0061a.m329a(i4, i6, i2 % 2 == 0);
                                i3 = i4 + 1;
                            } else {
                                i3 = i4;
                            }
                            i5++;
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        } catch (IllegalArgumentException e222) {
                            throw e222;
                        }
                    } catch (IllegalArgumentException e2222) {
                        throw e2222;
                    }
                }
                i6++;
                if (i2 % c0002c.f24a == c0002c.f24a - 1) {
                    i3 = 0;
                    i4 = 0;
                    while (i3 < c0002c.m32b()) {
                        try {
                            c0061a.m329a(i4, i6, true);
                            i4++;
                            i3++;
                        } catch (IllegalArgumentException e22222) {
                            throw e22222;
                        }
                    }
                    i6++;
                }
                i2++;
                i3 = i6;
            } catch (IllegalArgumentException e222222) {
                throw e222222;
            }
        }
        return C0028d.m177a(c0061a);
    }

    /* renamed from: a */
    private static C0194n m177a(C0061a c0061a) {
        int c = c0061a.m331c();
        int a = c0061a.m325a();
        C0194n c0194n = new C0194n(c, a);
        c0194n.m1224g();
        for (int i = 0; i < c; i++) {
            int i2 = 0;
            while (i2 < a) {
                try {
                    if (c0061a.m324a(i, i2) == (byte) 1) {
                        c0194n.m1215b(i, i2);
                    }
                    i2++;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        }
        return c0194n;
    }

    /* renamed from: z */
    private static String m178z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 40;
                    break;
                case 1:
                    i2 = 41;
                    break;
                case 2:
                    i2 = 84;
                    break;
                case 3:
                    i2 = 119;
                    break;
                default:
                    i2 = 113;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m179z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 113);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0194n mo7a(String str, C0217x c0217x, int i, int i2) {
        return mo8a(str, c0217x, i, i2, null);
    }

    /* renamed from: a */
    public C0194n mo8a(String str, C0217x c0217x, int i, int i2, Map<C0204i, ?> map) {
        C0209p c0209p = null;
        try {
            if (str.isEmpty()) {
                throw new IllegalArgumentException(f90z[1]);
            }
            try {
                if (c0217x != C0217x.DATA_MATRIX) {
                    throw new IllegalArgumentException(f90z[2] + c0217x);
                } else if (i < 0 || i2 < 0) {
                    try {
                        throw new IllegalArgumentException(f90z[0] + i + 'x' + i2);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } else {
                    C0209p c0209p2;
                    C0004e c0004e = C0004e.FORCE_NONE;
                    if (map != null) {
                        C0004e c0004e2 = (C0004e) map.get(C0204i.DATA_MATRIX_SHAPE);
                        if (c0004e2 != null) {
                            c0004e = c0004e2;
                        }
                        C0209p c0209p3 = (C0209p) map.get(C0204i.MIN_SIZE);
                        c0209p2 = c0209p3 != null ? c0209p3 : null;
                        c0209p3 = (C0209p) map.get(C0204i.MAX_SIZE);
                        if (c0209p3 != null) {
                            c0209p = c0209p3;
                        }
                    } else {
                        c0209p2 = null;
                    }
                    String a = C0001b.m8a(str, c0004e, c0209p2, c0209p);
                    C0002c a2 = C0002c.m21a(a.length(), c0004e, c0209p2, c0209p, true);
                    C0008i c0008i = new C0008i(C0013n.m115a(a, a2), a2.m38i(), a2.m33c());
                    c0008i.m87c();
                    return C0028d.m176a(c0008i, a2);
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }
}
