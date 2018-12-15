package p000a.p001a.p002a.p007b.p009b;

import java.util.Map;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0214u;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p007b.p008a.C0049r;
import p000a.p001a.p002a.p019g.C0139c;
import p000a.p001a.p002a.p019g.C0183d;
import p000a.p001a.p002a.p019g.C0192l;
import p000a.p001a.p002a.p019g.C0194n;
import p000a.p001a.p002a.p019g.p028a.C0175a;

/* renamed from: a.a.a.b.b.e */
public class C0056e {
    /* renamed from: a */
    private final C0194n f157a;
    /* renamed from: b */
    private C0214u f158b;

    public C0056e(C0194n c0194n) {
        this.f157a = c0194n;
    }

    /* renamed from: a */
    private float m294a(int i, int i2, int i3, int i4) {
        float f;
        int i5;
        int i6 = 0;
        float b = m299b(i, i2, i3, i4);
        int i7 = i - (i3 - i);
        if (i7 < 0) {
            f = ((float) i) / ((float) (i - i7));
            i5 = 0;
        } else if (i7 >= this.f157a.m1208a()) {
            f = ((float) ((this.f157a.m1208a() - 1) - i)) / ((float) (i7 - i));
            i5 = this.f157a.m1208a() - 1;
        } else {
            i5 = i7;
            f = 1.0f;
        }
        i7 = (int) (((float) i2) - (f * ((float) (i4 - i2))));
        if (i7 < 0) {
            f = ((float) i2) / ((float) (i2 - i7));
        } else if (i7 >= this.f157a.m1226i()) {
            f = ((float) ((this.f157a.m1226i() - 1) - i2)) / ((float) (i7 - i2));
            i6 = this.f157a.m1226i() - 1;
        } else {
            i6 = i7;
            f = 1.0f;
        }
        return (m299b(i, i2, (int) ((f * ((float) (i5 - i))) + ((float) i)), i6) + b) - 1.0f;
    }

    /* renamed from: a */
    private float m295a(eb ebVar, eb ebVar2) {
        float a = m294a((int) ebVar.m312b(), (int) ebVar.m311a(), (int) ebVar2.m312b(), (int) ebVar2.m311a());
        float a2 = m294a((int) ebVar2.m312b(), (int) ebVar2.m311a(), (int) ebVar.m312b(), (int) ebVar.m311a());
        return Float.isNaN(a) ? a2 / 7.0f : Float.isNaN(a2) ? a / 7.0f : (a + a2) / 14.0f;
    }

    /* renamed from: a */
    private static int m296a(eb ebVar, eb ebVar2, eb ebVar3, float f) throws C0213t {
        int a = ((C0175a.m1082a(eb.m308a(ebVar, ebVar2) / f) + C0175a.m1082a(eb.m308a(ebVar, ebVar3) / f)) / 2) + 7;
        switch (a & 3) {
            case 0:
                return a + 1;
            case 2:
                return a - 1;
            case 3:
                throw C0213t.m1269a();
            default:
                return a;
        }
    }

    /* renamed from: a */
    private static C0192l m297a(eb ebVar, eb ebVar2, eb ebVar3, eb ebVar4, int i) {
        float b;
        float a;
        float f;
        float f2;
        float f3 = ((float) i) - 3.5f;
        if (ebVar4 != null) {
            b = ebVar4.m312b();
            a = ebVar4.m311a();
            f = f3 - 3.0f;
            f2 = f;
        } else {
            b = (ebVar2.m312b() - ebVar.m312b()) + ebVar3.m312b();
            a = (ebVar2.m311a() - ebVar.m311a()) + ebVar3.m311a();
            f = f3;
            f2 = f3;
        }
        return C0192l.m1194a(3.5f, 3.5f, f3, 3.5f, f2, f, 3.5f, f3, ebVar.m312b(), ebVar.m311a(), ebVar2.m312b(), ebVar2.m311a(), b, a, ebVar3.m312b(), ebVar3.m311a());
    }

    /* renamed from: a */
    private static C0194n m298a(C0194n c0194n, C0192l c0192l, int i) throws C0213t {
        return C0183d.m1125a().mo33a(c0194n, i, i, c0192l);
    }

    /* renamed from: b */
    private float m299b(int i, int i2, int i3, int i4) {
        Object obj = Math.abs(i4 - i2) > Math.abs(i3 - i) ? 1 : null;
        if (obj == null) {
            int i5 = i4;
            i4 = i3;
            i3 = i5;
            int i6 = i2;
            i2 = i;
            i = i6;
        }
        int abs = Math.abs(i4 - i2);
        int abs2 = Math.abs(i3 - i);
        int i7 = (-abs) / 2;
        int i8 = i2 < i4 ? 1 : -1;
        int i9 = i < i3 ? 1 : -1;
        int i10 = 0;
        int i11 = i4 + i8;
        int i12 = i2;
        int i13 = i7;
        i7 = i;
        while (i12 != i11) {
            int i14;
            int i15;
            if ((i10 == 1) != this.f157a.m1221d(obj != null ? i7 : i12, obj != null ? i12 : i7)) {
                i14 = i10;
            } else if (i10 == 2) {
                return C0175a.m1081a(i12, i7, i2, i);
            } else {
                i14 = i10 + 1;
            }
            i10 = i13 + abs2;
            if (i10 <= 0) {
                i15 = i7;
                i7 = i10;
            } else if (i7 == i3) {
                i9 = i14;
                break;
            } else {
                i15 = i7 + i9;
                i7 = i10 - abs;
            }
            i12 += i8;
            i10 = i14;
            i13 = i7;
            i7 = i15;
        }
        i9 = i10;
        return i9 == 2 ? C0175a.m1081a(i4 + i8, i3, i2, i) : Float.NaN;
    }

    /* renamed from: a */
    protected final float m300a(eb ebVar, eb ebVar2, eb ebVar3) {
        return (m295a(ebVar, ebVar2) + m295a(ebVar, ebVar3)) / 2.0f;
    }

    /* renamed from: a */
    protected final C0058g m301a(float f, int i, int i2, float f2) throws C0213t {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f157a.m1208a() - 1, i + i3);
        if (((float) (min - max)) < f * 3.0f) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e) {
                throw e;
            }
        }
        int max2 = Math.max(0, i2 - i3);
        int min2 = Math.min(this.f157a.m1226i() - 1, i3 + i2);
        if (((float) (min2 - max2)) < f * 3.0f) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e2) {
                throw e2;
            }
        }
        return new C0055d(this.f157a, max, max2, min - max, min2 - max2, f, this.f158b).m293a();
    }

    /* renamed from: a */
    public C0139c m302a() throws C0213t, C0212s {
        return m304a(null);
    }

    /* renamed from: a */
    protected final C0139c m303a(C0060i c0060i) throws C0213t, C0212s {
        eb a = c0060i.m319a();
        eb c = c0060i.m321c();
        eb b = c0060i.m320b();
        float a2 = m300a(a, c, b);
        if (a2 < 1.0f) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e) {
                throw e;
            }
        }
        eb[] ebVarArr;
        int a3 = C0056e.m296a(a, c, b, a2);
        C0049r b2 = C0049r.m253b(a3);
        int f = b2.m261f() - 7;
        eb ebVar = null;
        if (b2.m259c().length > 0) {
            float b3 = (c.m312b() - a.m312b()) + b.m312b();
            float a4 = (c.m311a() - a.m311a()) + b.m311a();
            float f2 = 1.0f - (3.0f / ((float) f));
            int b4 = (int) (((b3 - a.m312b()) * f2) + a.m312b());
            f = (int) (a.m311a() + (f2 * (a4 - a.m311a())));
            int i = 4;
            while (i <= 16) {
                try {
                    ebVar = m301a(a2, b4, f, (float) i);
                    break;
                } catch (C0213t e2) {
                    i <<= 1;
                }
            }
        }
        C0194n a5 = C0056e.m298a(this.f157a, C0056e.m297a(a, c, b, ebVar, a3), a3);
        if (ebVar == null) {
            ebVarArr = new eb[]{b, a, c};
        } else {
            ebVarArr = new eb[]{b, a, c, ebVar};
        }
        return new C0139c(a5, ebVarArr);
    }

    /* renamed from: a */
    public final C0139c m304a(Map<C0216w, ?> map) throws C0213t, C0212s {
        this.f158b = map == null ? null : (C0214u) map.get(C0216w.NEED_RESULT_POINT_CALLBACK);
        return m303a(new C0054c(this.f157a, this.f158b).m285a((Map) map));
    }

    /* renamed from: b */
    protected final C0194n m305b() {
        return this.f157a;
    }

    /* renamed from: c */
    protected final C0214u m306c() {
        return this.f158b;
    }
}
