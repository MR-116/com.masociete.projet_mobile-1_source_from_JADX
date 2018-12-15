package p000a.p001a.p002a.p011c;

import fr.pcsoft.wdjava.core.C0607n;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import p000a.p001a.p002a.C0029o;
import p000a.p001a.p002a.C0206k;
import p000a.p001a.p002a.C0208m;
import p000a.p001a.p002a.C0210q;
import p000a.p001a.p002a.C0211r;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.db;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.l */
public abstract class C0091l implements C0029o {
    /* renamed from: a */
    protected static float m516a(int[] iArr, int[] iArr2, float f) {
        int i;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        for (i = 0; i < length; i++) {
            i3 += iArr[i];
            i2 += iArr2[i];
        }
        if (i3 < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = ((float) i3) / ((float) i2);
        float f3 = f * f2;
        float f4 = 0.0f;
        for (i = 0; i < length; i++) {
            int i4 = iArr[i];
            float f5 = ((float) iArr2[i]) * f2;
            float f6 = ((float) i4) > f5 ? ((float) i4) - f5 : f5 - ((float) i4);
            if (f6 > f3) {
                return Float.POSITIVE_INFINITY;
            }
            f4 += f6;
        }
        return f4 / ((float) i3);
    }

    /* renamed from: a */
    private C0208m m517a(db dbVar, Map<C0216w, ?> map) throws C0213t {
        Object obj;
        int max;
        int i;
        C0185f c0185f;
        Map map2;
        int i2;
        int i3;
        int i4;
        Map enumMap;
        C0208m a;
        eb[] c;
        int d = dbVar.m834d();
        int b = dbVar.m832b();
        C0185f c0185f2 = new C0185f(d);
        int i5 = b >> 1;
        if (map != null) {
            try {
                if (map.containsKey(C0216w.TRY_HARDER)) {
                    obj = 1;
                    max = Math.max(1, b >> (obj == null ? 8 : 5));
                    i = obj == null ? b : 15;
                    c0185f = c0185f2;
                    map2 = map;
                    for (i2 = 0; i2 < i; i2++) {
                        int i6 = (i2 + 1) / 2;
                        i3 = i5 + ((((i2 & 1) != 0 ? 1 : null) == null ? i6 : -i6) * max);
                        if (i3 < 0 || i3 >= b) {
                            break;
                        }
                        try {
                            c0185f = dbVar.m830a(i3, c0185f);
                            i4 = 0;
                            while (i4 < 2) {
                                if (i4 == 1) {
                                    try {
                                        c0185f.m1153f();
                                        if (map2 != null && map2.containsKey(C0216w.NEED_RESULT_POINT_CALLBACK)) {
                                            enumMap = new EnumMap(C0216w.class);
                                            enumMap.putAll(map2);
                                            enumMap.remove(C0216w.NEED_RESULT_POINT_CALLBACK);
                                            a = mo20a(i3, c0185f, enumMap);
                                            if (i4 != 1) {
                                                a.m1252a(C0206k.ORIENTATION, Integer.valueOf(180));
                                                c = a.m1256c();
                                                if (c == null) {
                                                    c[0] = new eb((((float) d) - c[0].m312b()) - 1.0f, c[0].m311a());
                                                    c[1] = new eb((((float) d) - c[1].m312b()) - 1.0f, c[1].m311a());
                                                }
                                            }
                                            return a;
                                        }
                                    } catch (C0213t e) {
                                        throw e;
                                    }
                                }
                                enumMap = map2;
                                try {
                                    a = mo20a(i3, c0185f, enumMap);
                                    if (i4 != 1) {
                                        a.m1252a(C0206k.ORIENTATION, Integer.valueOf(180));
                                        c = a.m1256c();
                                        if (c == null) {
                                            c[0] = new eb((((float) d) - c[0].m312b()) - 1.0f, c[0].m311a());
                                            c[1] = new eb((((float) d) - c[1].m312b()) - 1.0f, c[1].m311a());
                                        }
                                    }
                                    return a;
                                } catch (C0213t e2) {
                                    throw e2;
                                } catch (C0210q e3) {
                                    i4++;
                                    map2 = enumMap;
                                }
                            }
                            continue;
                        } catch (C0213t e4) {
                        }
                    }
                    throw C0213t.m1269a();
                }
            } catch (C0213t e5) {
                throw e5;
            }
        }
        obj = null;
        if (obj == null) {
        }
        max = Math.max(1, b >> (obj == null ? 8 : 5));
        if (obj == null) {
        }
        c0185f = c0185f2;
        map2 = map;
        for (i2 = 0; i2 < i; i2++) {
            int i62 = (i2 + 1) / 2;
            if ((i2 & 1) != 0) {
            }
            if (((i2 & 1) != 0 ? 1 : null) == null) {
            }
            i3 = i5 + ((((i2 & 1) != 0 ? 1 : null) == null ? i62 : -i62) * max);
            c0185f = dbVar.m830a(i3, c0185f);
            i4 = 0;
            while (i4 < 2) {
                if (i4 == 1) {
                    c0185f.m1153f();
                    enumMap = new EnumMap(C0216w.class);
                    enumMap.putAll(map2);
                    enumMap.remove(C0216w.NEED_RESULT_POINT_CALLBACK);
                    a = mo20a(i3, c0185f, enumMap);
                    if (i4 != 1) {
                        a.m1252a(C0206k.ORIENTATION, Integer.valueOf(180));
                        c = a.m1256c();
                        if (c == null) {
                            c[0] = new eb((((float) d) - c[0].m312b()) - 1.0f, c[0].m311a());
                            c[1] = new eb((((float) d) - c[1].m312b()) - 1.0f, c[1].m311a());
                        }
                    }
                    return a;
                }
                enumMap = map2;
                a = mo20a(i3, c0185f, enumMap);
                if (i4 != 1) {
                    a.m1252a(C0206k.ORIENTATION, Integer.valueOf(180));
                    c = a.m1256c();
                    if (c == null) {
                        c[0] = new eb((((float) d) - c[0].m312b()) - 1.0f, c[0].m311a());
                        c[1] = new eb((((float) d) - c[1].m312b()) - 1.0f, c[1].m311a());
                    }
                }
                return a;
            }
            continue;
        }
        throw C0213t.m1269a();
    }

    /* renamed from: a */
    protected static void m518a(C0185f c0185f, int i, int[] iArr) throws C0213t {
        int length = iArr.length;
        boolean c = c0185f.m1149c(i);
        while (i > 0 && length >= 0) {
            i--;
            try {
                if (c0185f.m1149c(i) != c) {
                    length--;
                    c = !c;
                }
            } catch (C0213t e) {
                throw e;
            }
        }
        if (length >= 0) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e2) {
                throw e2;
            }
        }
        C0091l.m519b(c0185f, i + 1, iArr);
    }

    /* renamed from: b */
    protected static void m519b(C0185f c0185f, int i, int[] iArr) throws C0213t {
        int length = iArr.length;
        Arrays.fill(iArr, 0, length, 0);
        int a = c0185f.m1136a();
        if (i >= a) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e) {
                throw e;
            }
        }
        try {
            int i2;
            int i3 = !c0185f.m1149c(i) ? 1 : 0;
            int i4 = 0;
            while (i < a) {
                try {
                    if ((c0185f.m1149c(i) ^ i3) != 0) {
                        iArr[i4] = iArr[i4] + 1;
                        i2 = i3;
                    } else {
                        i2 = i4 + 1;
                        if (i2 == length) {
                            break;
                        }
                        try {
                            iArr[i2] = 1;
                            int i5 = i2;
                            i2 = i3 == 0 ? 1 : 0;
                            i4 = i5;
                        } catch (C0213t e2) {
                            throw e2;
                        }
                    }
                    i++;
                    i3 = i2;
                } catch (C0213t e22) {
                    throw e22;
                }
            }
            i2 = i4;
            if (i2 == length) {
                return;
            }
            if (i2 != length - 1 || i != a) {
                try {
                    throw C0213t.m1269a();
                } catch (C0213t e222) {
                    throw e222;
                }
            }
        } catch (C0213t e2222) {
            throw e2222;
        }
    }

    /* renamed from: a */
    public abstract C0208m mo20a(int i, C0185f c0185f, Map<C0216w, ?> map) throws C0213t, C0211r, C0212s;

    /* renamed from: a */
    public void mo9a() {
    }

    /* renamed from: b */
    public C0208m mo10b(db dbVar) throws C0213t, C0212s {
        return mo11b(dbVar, null);
    }

    /* renamed from: b */
    public C0208m mo11b(db dbVar, Map<C0216w, ?> map) throws C0213t, C0212s {
        int i;
        db e;
        C0208m a;
        Map e2;
        eb[] c;
        int b;
        int i2 = 0;
        try {
            return m517a(dbVar, map);
        } catch (C0213t e3) {
            if (map != null) {
                try {
                    if (map.containsKey(C0216w.TRY_HARDER)) {
                        i = 1;
                        if (i != 0) {
                            try {
                                if (dbVar.m831a()) {
                                    e = dbVar.m835e();
                                    a = m517a(e, map);
                                    e2 = a.m1258e();
                                    if (e2 != null) {
                                        try {
                                            if (e2.containsKey(C0206k.ORIENTATION)) {
                                                i = (((Integer) e2.get(C0206k.ORIENTATION)).intValue() + C0607n.al) % 360;
                                                a.m1252a(C0206k.ORIENTATION, Integer.valueOf(i));
                                                c = a.m1256c();
                                                if (c != null) {
                                                    b = e.m832b();
                                                    while (i2 < c.length) {
                                                        try {
                                                            c[i2] = new eb((((float) b) - c[i2].m311a()) - 1.0f, c[i2].m312b());
                                                            i2++;
                                                        } catch (C0213t e4) {
                                                            throw e4;
                                                        }
                                                    }
                                                }
                                                return a;
                                            }
                                        } catch (C0213t e42) {
                                            throw e42;
                                        }
                                    }
                                    i = C0607n.al;
                                    a.m1252a(C0206k.ORIENTATION, Integer.valueOf(i));
                                    c = a.m1256c();
                                    if (c != null) {
                                        b = e.m832b();
                                        while (i2 < c.length) {
                                            c[i2] = new eb((((float) b) - c[i2].m311a()) - 1.0f, c[i2].m312b());
                                            i2++;
                                        }
                                    }
                                    return a;
                                }
                            } catch (C0213t e422) {
                                throw e422;
                            }
                        }
                        throw e3;
                    }
                } catch (C0213t e4222) {
                    throw e4222;
                }
            }
            i = 0;
            if (i != 0) {
                if (dbVar.m831a()) {
                    e = dbVar.m835e();
                    a = m517a(e, map);
                    e2 = a.m1258e();
                    if (e2 != null) {
                        if (e2.containsKey(C0206k.ORIENTATION)) {
                            i = (((Integer) e2.get(C0206k.ORIENTATION)).intValue() + C0607n.al) % 360;
                            a.m1252a(C0206k.ORIENTATION, Integer.valueOf(i));
                            c = a.m1256c();
                            if (c != null) {
                                b = e.m832b();
                                while (i2 < c.length) {
                                    c[i2] = new eb((((float) b) - c[i2].m311a()) - 1.0f, c[i2].m312b());
                                    i2++;
                                }
                            }
                            return a;
                        }
                    }
                    i = C0607n.al;
                    a.m1252a(C0206k.ORIENTATION, Integer.valueOf(i));
                    c = a.m1256c();
                    if (c != null) {
                        b = e.m832b();
                        while (i2 < c.length) {
                            c[i2] = new eb((((float) b) - c[i2].m311a()) - 1.0f, c[i2].m312b());
                            i2++;
                        }
                    }
                    return a;
                }
            }
            throw e3;
        }
    }
}
