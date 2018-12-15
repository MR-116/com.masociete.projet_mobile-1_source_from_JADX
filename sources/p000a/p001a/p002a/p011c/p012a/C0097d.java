package p000a.p001a.p002a.p011c.p012a;

import fr.pcsoft.wdjava.core.C0607n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p000a.p001a.p002a.C0208m;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0214u;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p011c.C0091l;
import p000a.p001a.p002a.p019g.C0185f;
import p000a.p001a.p002a.p019g.p028a.C0175a;

/* renamed from: a.a.a.c.a.d */
public final class C0097d extends C0092c {
    /* renamed from: k */
    private static final int[] f291k = new int[]{8, 6, 4, 3, 1};
    /* renamed from: m */
    private static final int[] f292m = new int[]{2, 4, 6, 8};
    /* renamed from: n */
    private static final int[] f293n = new int[]{0, 336, 1036, 1516};
    /* renamed from: o */
    private static final int[] f294o = new int[]{0, C0607n.kh, 961, C0607n.Jx, 2715};
    /* renamed from: p */
    private static final int[][] f295p = new int[][]{new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};
    /* renamed from: r */
    private static final int[] f296r = new int[]{1, 10, 34, 70, 126};
    /* renamed from: s */
    private static final int[] f297s = new int[]{4, 20, 48, 81};
    /* renamed from: l */
    private final List<C0099f> f298l = new ArrayList();
    /* renamed from: q */
    private final List<C0099f> f299q = new ArrayList();

    /* renamed from: a */
    private C0098e m564a(C0185f c0185f, C0100g c0100g, boolean z) throws C0213t {
        int[] f = m533f();
        try {
            int i;
            int length;
            int i2;
            f[0] = 0;
            f[1] = 0;
            f[2] = 0;
            f[3] = 0;
            f[4] = 0;
            f[5] = 0;
            f[6] = 0;
            f[7] = 0;
            if (z) {
                C0091l.m518a(c0185f, c0100g.m581c()[0], f);
            } else {
                C0091l.m519b(c0185f, c0100g.m581c()[1] + 1, f);
                i = 0;
                for (length = f.length - 1; i < length; length--) {
                    i2 = f[i];
                    f[i] = f[length];
                    f[length] = i2;
                    i++;
                }
            }
            length = z ? 16 : 15;
            float a = ((float) C0175a.m1083a(f)) / ((float) length);
            int[] g = m534g();
            int[] e = m532e();
            float[] d = m531d();
            float[] b = m529b();
            for (i = 0; i < f.length; i++) {
                float f2 = ((float) f[i]) / a;
                i2 = (int) (0.5f + f2);
                if (i2 < 1) {
                    i2 = 1;
                } else if (i2 > 8) {
                    i2 = 8;
                }
                int i3 = i / 2;
                if ((i & 1) == 0) {
                    try {
                        g[i3] = i2;
                        d[i3] = f2 - ((float) i2);
                    } catch (C0213t e2) {
                        throw e2;
                    }
                }
                e[i3] = i2;
                b[i3] = f2 - ((float) i2);
            }
            m568a(z, length);
            length = g.length - 1;
            int i4 = 0;
            int i5 = 0;
            while (length >= 0) {
                i = (i4 * 9) + g[length];
                length--;
                i4 = i;
                i5 = g[length] + i5;
            }
            i2 = 0;
            i = 0;
            for (length = e.length - 1; length >= 0; length--) {
                i2 = (i2 * 9) + e[length];
                i += e[length];
            }
            i2 = i4 + (i2 * 3);
            if (z) {
                if ((i5 & 1) != 0 || i5 > 12 || i5 < 4) {
                    try {
                        throw C0213t.m1269a();
                    } catch (C0213t e22) {
                        throw e22;
                    }
                }
                length = (12 - i5) / 2;
                i = f291k[length];
                i4 = 9 - i;
                return new C0098e(((C0096b.m563a(g, i, false) * f296r[length]) + C0096b.m563a(e, i4, true)) + f294o[length], i2);
            } else if ((i & 1) != 0 || i > 10 || i < 4) {
                try {
                    throw C0213t.m1269a();
                } catch (C0213t e222) {
                    throw e222;
                }
            } else {
                length = (10 - i) / 2;
                i = f292m[length];
                return new C0098e((C0096b.m563a(g, i, true) + (C0096b.m563a(e, 9 - i, false) * f297s[length])) + f293n[length], i2);
            }
        } catch (C0213t e2222) {
            throw e2222;
        }
    }

    /* renamed from: a */
    private C0099f m565a(C0185f c0185f, boolean z, int i, Map<C0216w, ?> map) {
        try {
            int[] a = m570a(c0185f, 0, z);
            C0100g a2 = m566a(c0185f, i, z, a);
            C0214u c0214u = map == null ? null : (C0214u) map.get(C0216w.NEED_RESULT_POINT_CALLBACK);
            if (c0214u != null) {
                float f = ((float) (a[0] + a[1])) / 2.0f;
                if (z) {
                    f = ((float) (c0185f.m1136a() - 1)) - f;
                }
                c0214u.m1270a(new eb(f, (float) i));
            }
            C0098e a3 = m564a(c0185f, a2, true);
            C0098e a4 = m564a(c0185f, a2, false);
            return new C0099f((a3.m574a() * 1597) + a4.m574a(), a3.m575b() + (a4.m575b() * 4), a2);
        } catch (C0213t e) {
            return null;
        }
    }

    /* renamed from: a */
    private C0100g m566a(C0185f c0185f, int i, boolean z, int[] iArr) throws C0213t {
        int a;
        boolean c = c0185f.m1149c(iArr[0]);
        int i2 = iArr[0] - 1;
        while (i2 >= 0) {
            try {
                if ((c0185f.m1149c(i2) ^ c) == 0) {
                    break;
                }
                i2--;
            } catch (C0213t e) {
                throw e;
            }
        }
        int i3 = i2 + 1;
        i2 = iArr[0] - i3;
        Object c2 = m530c();
        System.arraycopy(c2, 0, c2, 1, c2.length - 1);
        c2[0] = i2;
        int a2 = C0092c.m525a((int[]) c2, f295p);
        int i4 = iArr[1];
        if (z) {
            a = (c0185f.m1136a() - 1) - i3;
            i4 = (c0185f.m1136a() - 1) - i4;
        } else {
            a = i3;
        }
        return new C0100g(a2, new int[]{i3, iArr[1]}, a, i4, i);
    }

    /* renamed from: a */
    private static void m567a(Collection<C0099f> collection, C0099f c0099f) {
        if (c0099f != null) {
            Object obj;
            for (C0099f c0099f2 : collection) {
                if (c0099f2.m574a() == c0099f.m574a()) {
                    c0099f2.m578e();
                    obj = 1;
                    break;
                }
            }
            obj = null;
            if (obj == null) {
                collection.add(c0099f);
            }
        }
    }

    /* renamed from: a */
    private void m568a(boolean z, int i) throws C0213t {
        Object obj;
        Object obj2;
        int i2;
        Object obj3;
        Object obj4;
        Object obj5 = null;
        int a = C0175a.m1083a(m534g());
        int a2 = C0175a.m1083a(m532e());
        if (z) {
            if (a > 12) {
                obj = 1;
                obj2 = null;
            } else if (a < 4) {
                obj = null;
                i2 = 1;
            } else {
                obj = null;
                obj2 = null;
            }
            if (a2 > 12) {
                obj3 = obj;
                obj4 = obj2;
                obj = 1;
                obj2 = null;
            } else {
                if (a2 < 4) {
                    obj3 = obj;
                    obj4 = obj2;
                    obj = null;
                    i2 = 1;
                }
                obj3 = obj;
                obj4 = obj2;
                obj = null;
                obj2 = null;
            }
        } else {
            if (a > 11) {
                obj = 1;
                obj2 = null;
            } else if (a < 5) {
                obj = null;
                i2 = 1;
            } else {
                obj = null;
                obj2 = null;
            }
            if (a2 > 10) {
                obj3 = obj;
                obj4 = obj2;
                int i3 = 1;
                obj2 = null;
            } else {
                if (a2 < 4) {
                    obj3 = obj;
                    obj4 = obj2;
                    obj = null;
                    i2 = 1;
                }
                obj3 = obj;
                obj4 = obj2;
                obj = null;
                obj2 = null;
            }
        }
        int i4 = (a + a2) - i;
        Object obj6 = (a & 1) == (z ? 1 : 0) ? 1 : null;
        if ((a2 & 1) == 1) {
            obj5 = 1;
        }
        if (i4 == 1) {
            if (obj6 != null) {
                if (obj5 != null) {
                    try {
                        throw C0213t.m1269a();
                    } catch (C0213t e) {
                        throw e;
                    }
                }
                obj3 = 1;
            } else if (obj5 == null) {
                try {
                    throw C0213t.m1269a();
                } catch (C0213t e2) {
                    throw e2;
                }
            } else {
                i3 = 1;
            }
        } else if (i4 == -1) {
            if (obj6 != null) {
                if (obj5 != null) {
                    try {
                        throw C0213t.m1269a();
                    } catch (C0213t e22) {
                        throw e22;
                    }
                }
                r5 = 1;
            } else if (obj5 == null) {
                try {
                    throw C0213t.m1269a();
                } catch (C0213t e222) {
                    throw e222;
                }
            } else {
                i2 = 1;
            }
        } else if (i4 != 0) {
            throw C0213t.m1269a();
        } else if (obj6 != null) {
            if (obj5 == null) {
                try {
                    throw C0213t.m1269a();
                } catch (C0213t e2222) {
                    throw e2222;
                }
            } else if (a < a2) {
                i3 = 1;
                r5 = 1;
            } else {
                i2 = 1;
                int i5 = 1;
            }
        } else if (obj5 != null) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e22222) {
                throw e22222;
            }
        }
        if (obj4 != null) {
            if (obj3 != null) {
                try {
                    throw C0213t.m1269a();
                } catch (C0213t e222222) {
                    throw e222222;
                }
            }
            C0092c.m527b(m534g(), m531d());
        }
        if (obj3 != null) {
            try {
                C0092c.m526a(m534g(), m531d());
            } catch (C0213t e2222222) {
                throw e2222222;
            }
        }
        if (obj2 != null) {
            if (obj != null) {
                try {
                    throw C0213t.m1269a();
                } catch (C0213t e22222222) {
                    throw e22222222;
                }
            }
            C0092c.m527b(m532e(), m531d());
        }
        if (obj != null) {
            try {
                C0092c.m526a(m532e(), m529b());
            } catch (C0213t e222222222) {
                throw e222222222;
            }
        }
    }

    /* renamed from: a */
    private static boolean m569a(C0099f c0099f, C0099f c0099f2) {
        int b = (c0099f.m575b() + (c0099f2.m575b() * 16)) % 79;
        int a = (c0099f.m577d().m579a() * 9) + c0099f2.m577d().m579a();
        if (a > 72) {
            a--;
        }
        if (a > 8) {
            a--;
        }
        return b == a;
    }

    /* renamed from: a */
    private int[] m570a(C0185f c0185f, int i, boolean z) throws C0213t {
        int[] c = m530c();
        c[0] = 0;
        c[1] = 0;
        c[2] = 0;
        c[3] = 0;
        int a = c0185f.m1136a();
        boolean z2 = false;
        int i2 = i;
        while (i2 < a) {
            try {
                z2 = !c0185f.m1149c(i2);
                if (z == z2) {
                    break;
                }
                i2++;
            } catch (C0213t e) {
                throw e;
            }
        }
        int i3 = i2;
        int i4 = z2;
        int i5 = i2;
        i2 = 0;
        while (i3 < a) {
            try {
                int i6;
                if ((c0185f.m1149c(i3) ^ i4) != 0) {
                    c[i2] = c[i2] + 1;
                    i6 = i4;
                } else {
                    if (i2 == 3) {
                        try {
                            if (C0092c.m528b(c)) {
                                return new int[]{i5, i3};
                            }
                            i5 += c[0] + c[1];
                            c[0] = c[2];
                            c[1] = c[3];
                            c[2] = 0;
                            c[3] = 0;
                            i6 = i2 - 1;
                            i2 = i5;
                        } catch (C0213t e2) {
                            throw e2;
                        }
                    }
                    i6 = i2 + 1;
                    i2 = i5;
                    try {
                        c[i6] = 1;
                        int i7 = i2;
                        i2 = i6;
                        i6 = i4 == 0 ? 1 : 0;
                        i5 = i7;
                    } catch (C0213t e22) {
                        throw e22;
                    }
                }
                i3++;
                i4 = i6;
            } catch (C0213t e222) {
                throw e222;
            }
        }
        throw C0213t.m1269a();
    }

    /* renamed from: b */
    private static C0208m m571b(C0099f c0099f, C0099f c0099f2) {
        int length;
        String valueOf = String.valueOf((4537077 * ((long) c0099f.m574a())) + ((long) c0099f2.m574a()));
        StringBuilder stringBuilder = new StringBuilder(14);
        for (length = 13 - valueOf.length(); length > 0; length--) {
            stringBuilder.append('0');
        }
        stringBuilder.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            length = stringBuilder.charAt(i2) - 48;
            if ((i2 & 1) == 0) {
                length *= 3;
            }
            i += length;
        }
        length = 10 - (i % 10);
        if (length == 10) {
            length = 0;
        }
        stringBuilder.append(length);
        eb[] b = c0099f.m577d().m580b();
        eb[] b2 = c0099f2.m577d().m580b();
        return new C0208m(String.valueOf(stringBuilder.toString()), null, new eb[]{b[0], b[1], b2[0], b2[1]}, C0217x.RSS_14);
    }

    /* renamed from: a */
    public C0208m mo20a(int i, C0185f c0185f, Map<C0216w, ?> map) throws C0213t {
        C0097d.m567a(this.f298l, m565a(c0185f, false, i, (Map) map));
        c0185f.m1153f();
        C0097d.m567a(this.f299q, m565a(c0185f, true, i, (Map) map));
        c0185f.m1153f();
        for (C0099f c0099f : this.f298l) {
            if (c0099f.m576c() > 1) {
                for (C0099f c0099f2 : this.f299q) {
                    try {
                        if (c0099f2.m576c() > 1) {
                            if (C0097d.m569a(c0099f, c0099f2)) {
                                return C0097d.m571b(c0099f, c0099f2);
                            }
                        }
                    } catch (C0213t e) {
                        throw e;
                    } catch (C0213t e2) {
                        throw e2;
                    }
                }
                continue;
            }
        }
        throw C0213t.m1269a();
    }

    /* renamed from: a */
    public void mo9a() {
        this.f298l.clear();
        this.f299q.clear();
    }
}
