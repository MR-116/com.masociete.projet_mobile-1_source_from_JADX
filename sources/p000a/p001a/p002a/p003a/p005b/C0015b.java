package p000a.p001a.p002a.p003a.p005b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p019g.C0139c;
import p000a.p001a.p002a.p019g.C0183d;
import p000a.p001a.p002a.p019g.C0194n;
import p000a.p001a.p002a.p019g.p028a.C0175a;
import p000a.p001a.p002a.p019g.p028a.C0176b;

/* renamed from: a.a.a.a.b.b */
public final class C0015b {
    /* renamed from: a */
    private final C0194n f58a;
    /* renamed from: b */
    private final C0176b f59b;

    public C0015b(C0194n c0194n) throws C0213t {
        this.f58a = c0194n;
        this.f59b = new C0176b(c0194n);
    }

    /* renamed from: a */
    private static int m118a(eb ebVar, eb ebVar2) {
        return C0175a.m1082a(eb.m308a(ebVar, ebVar2));
    }

    /* renamed from: a */
    private eb m119a(eb ebVar, eb ebVar2, eb ebVar3, eb ebVar4, int i) {
        float a = ((float) C0015b.m118a(ebVar, ebVar2)) / ((float) i);
        int a2 = C0015b.m118a(ebVar3, ebVar4);
        eb ebVar5 = new eb((((ebVar4.m312b() - ebVar3.m312b()) / ((float) a2)) * a) + ebVar4.m312b(), (a * ((ebVar4.m311a() - ebVar3.m311a()) / ((float) a2))) + ebVar4.m311a());
        float a3 = ((float) C0015b.m118a(ebVar, ebVar3)) / ((float) i);
        int a4 = C0015b.m118a(ebVar2, ebVar4);
        eb ebVar6 = new eb((((ebVar4.m312b() - ebVar2.m312b()) / ((float) a4)) * a3) + ebVar4.m312b(), (a3 * ((ebVar4.m311a() - ebVar2.m311a()) / ((float) a4))) + ebVar4.m311a());
        return !m123a(ebVar5) ? m123a(ebVar6) ? ebVar6 : null : (!m123a(ebVar6) || Math.abs(m124b(ebVar3, ebVar5).m126a() - m124b(ebVar2, ebVar5).m126a()) <= Math.abs(m124b(ebVar3, ebVar6).m126a() - m124b(ebVar2, ebVar6).m126a())) ? ebVar5 : ebVar6;
    }

    /* renamed from: a */
    private eb m120a(eb ebVar, eb ebVar2, eb ebVar3, eb ebVar4, int i, int i2) {
        float a = ((float) C0015b.m118a(ebVar, ebVar2)) / ((float) i);
        int a2 = C0015b.m118a(ebVar3, ebVar4);
        eb ebVar5 = new eb((((ebVar4.m312b() - ebVar3.m312b()) / ((float) a2)) * a) + ebVar4.m312b(), (a * ((ebVar4.m311a() - ebVar3.m311a()) / ((float) a2))) + ebVar4.m311a());
        float a3 = ((float) C0015b.m118a(ebVar, ebVar3)) / ((float) i2);
        int a4 = C0015b.m118a(ebVar2, ebVar4);
        eb ebVar6 = new eb((((ebVar4.m312b() - ebVar2.m312b()) / ((float) a4)) * a3) + ebVar4.m312b(), (a3 * ((ebVar4.m311a() - ebVar2.m311a()) / ((float) a4))) + ebVar4.m311a());
        return !m123a(ebVar5) ? m123a(ebVar6) ? ebVar6 : null : !m123a(ebVar6) ? ebVar5 : Math.abs(i - m124b(ebVar3, ebVar5).m126a()) + Math.abs(i2 - m124b(ebVar2, ebVar5).m126a()) <= Math.abs(i - m124b(ebVar3, ebVar6).m126a()) + Math.abs(i2 - m124b(ebVar2, ebVar6).m126a()) ? ebVar5 : ebVar6;
    }

    /* renamed from: a */
    private static C0194n m121a(C0194n c0194n, eb ebVar, eb ebVar2, eb ebVar3, eb ebVar4, int i, int i2) throws C0213t {
        return C0183d.m1125a().mo32a(c0194n, i, i2, 0.5f, 0.5f, ((float) i) - 0.5f, 0.5f, ((float) i) - 0.5f, ((float) i2) - 0.5f, 0.5f, ((float) i2) - 0.5f, ebVar.m312b(), ebVar.m311a(), ebVar4.m312b(), ebVar4.m311a(), ebVar3.m312b(), ebVar3.m311a(), ebVar2.m312b(), ebVar2.m311a());
    }

    /* renamed from: a */
    private static void m122a(Map<eb, Integer> map, eb ebVar) {
        Integer num = (Integer) map.get(ebVar);
        map.put(ebVar, Integer.valueOf(num == null ? 1 : num.intValue() + 1));
    }

    /* renamed from: a */
    private boolean m123a(eb ebVar) {
        return ebVar.m312b() >= 0.0f && ebVar.m312b() < ((float) this.f58a.m1208a()) && ebVar.m311a() > 0.0f && ebVar.m311a() < ((float) this.f58a.m1226i());
    }

    /* renamed from: b */
    private C0016c m124b(eb ebVar, eb ebVar2) {
        int b = (int) ebVar.m312b();
        int a = (int) ebVar.m311a();
        int b2 = (int) ebVar2.m312b();
        int a2 = (int) ebVar2.m311a();
        Object obj = Math.abs(a2 - a) > Math.abs(b2 - b) ? 1 : null;
        if (obj == null) {
            int i = a2;
            a2 = b2;
            b2 = i;
            int i2 = a;
            a = b;
            b = i2;
        }
        int abs = Math.abs(a2 - a);
        int abs2 = Math.abs(b2 - b);
        int i3 = (-abs) / 2;
        int i4 = b < b2 ? 1 : -1;
        int i5 = a < a2 ? 1 : -1;
        int i6 = 0;
        boolean d = this.f58a.m1221d(obj != null ? b : a, obj != null ? a : b);
        int i7 = b;
        int i8 = i3;
        while (a != a2) {
            boolean d2 = this.f58a.m1221d(obj != null ? i7 : a, obj != null ? a : i7);
            if (d2 != d) {
                i6++;
                d = d2;
            }
            b = i8 + abs2;
            if (b > 0) {
                if (i7 == b2) {
                    b2 = i6;
                    break;
                }
                i7 += i4;
                b -= abs;
            }
            a += i5;
            i8 = b;
        }
        b2 = i6;
        return new C0016c(ebVar, ebVar2, b2, null);
    }

    /* renamed from: a */
    public C0139c m125a() throws C0213t {
        eb[] a = this.f59b.m1087a();
        eb ebVar = a[0];
        eb ebVar2 = a[1];
        eb ebVar3 = a[2];
        eb ebVar4 = a[3];
        List arrayList = new ArrayList(4);
        arrayList.add(m124b(ebVar, ebVar2));
        arrayList.add(m124b(ebVar, ebVar3));
        arrayList.add(m124b(ebVar2, ebVar4));
        arrayList.add(m124b(ebVar3, ebVar4));
        Collections.sort(arrayList, new C0017d(null));
        C0016c c0016c = (C0016c) arrayList.get(0);
        C0016c c0016c2 = (C0016c) arrayList.get(1);
        Map hashMap = new HashMap();
        C0015b.m122a(hashMap, c0016c.m127b());
        C0015b.m122a(hashMap, c0016c.m128c());
        C0015b.m122a(hashMap, c0016c2.m127b());
        C0015b.m122a(hashMap, c0016c2.m128c());
        eb ebVar5 = null;
        eb ebVar6 = null;
        eb ebVar7 = null;
        for (Entry entry : hashMap.entrySet()) {
            eb ebVar8;
            eb ebVar9 = (eb) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                ebVar8 = ebVar9;
                ebVar9 = ebVar7;
                ebVar7 = ebVar5;
            } else if (ebVar5 == null) {
                ebVar8 = ebVar6;
                eb ebVar10 = ebVar7;
                ebVar7 = ebVar9;
                ebVar9 = ebVar10;
            } else {
                ebVar8 = ebVar6;
                ebVar7 = ebVar5;
            }
            ebVar6 = ebVar8;
            ebVar5 = ebVar7;
            ebVar7 = ebVar9;
        }
        if (ebVar5 == null || ebVar6 == null || ebVar7 == null) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e) {
                throw e;
            }
        }
        C0194n a2;
        a = new eb[]{ebVar5, ebVar6, ebVar7};
        eb.m310a(a);
        ebVar7 = a[0];
        ebVar9 = a[1];
        ebVar6 = a[2];
        ebVar5 = !hashMap.containsKey(ebVar) ? ebVar : !hashMap.containsKey(ebVar2) ? ebVar2 : !hashMap.containsKey(ebVar3) ? ebVar3 : ebVar4;
        int a3 = m124b(ebVar6, ebVar5).m126a();
        int a4 = m124b(ebVar7, ebVar5).m126a();
        if ((a3 & 1) == 1) {
            a3++;
        }
        a3 += 2;
        if ((a4 & 1) == 1) {
            a4++;
        }
        int i = a4 + 2;
        int a5;
        if (a3 * 4 >= i * 7 || i * 4 >= a3 * 7) {
            ebVar4 = m120a(ebVar9, ebVar7, ebVar6, ebVar5, a3, i);
            if (ebVar4 == null) {
                ebVar4 = ebVar5;
            }
            a5 = m124b(ebVar6, ebVar4).m126a();
            int a6 = m124b(ebVar7, ebVar4).m126a();
            if ((a5 & 1) == 1) {
                a5++;
            }
            if ((a6 & 1) == 1) {
                a6++;
            }
            a2 = C0015b.m121a(this.f58a, ebVar6, ebVar9, ebVar7, ebVar4, a5, a6);
        } else {
            ebVar4 = m119a(ebVar9, ebVar7, ebVar6, ebVar5, Math.min(i, a3));
            if (ebVar4 == null) {
                ebVar4 = ebVar5;
            }
            a5 = Math.max(m124b(ebVar6, ebVar4).m126a(), m124b(ebVar7, ebVar4).m126a()) + 1;
            if ((a5 & 1) == 1) {
                a5++;
            }
            a2 = C0015b.m121a(this.f58a, ebVar6, ebVar9, ebVar7, ebVar4, a5, a5);
        }
        return new C0139c(a2, new eb[]{ebVar6, ebVar9, ebVar7, ebVar4});
    }
}
