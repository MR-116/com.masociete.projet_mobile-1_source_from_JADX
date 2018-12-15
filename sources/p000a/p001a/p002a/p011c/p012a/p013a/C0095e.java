package p000a.p001a.p002a.p011c.p012a.p013a;

import java.util.List;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.a.a.e */
final class C0095e {
    private C0095e() {
    }

    /* renamed from: a */
    static C0185f m561a(List<C0090b> list) {
        int size = (list.size() * 2) - 1;
        C0185f c0185f = new C0185f((((C0090b) list.get(list.size() + -1)).m513c() == null ? size - 1 : size) * 12);
        int a = ((C0090b) list.get(0)).m513c().m574a();
        size = 11;
        int i = 0;
        while (size >= 0) {
            if (((1 << size) & a) != 0) {
                c0185f.m1154g(i);
            }
            size--;
            i++;
        }
        int i2 = i;
        for (size = 1; size < list.size(); size++) {
            C0090b c0090b = (C0090b) list.get(size);
            int a2 = c0090b.m511a().m574a();
            a = 11;
            while (a >= 0) {
                if (((1 << a) & a2) != 0) {
                    c0185f.m1154g(i2);
                }
                a--;
                i2++;
            }
            if (c0090b.m513c() != null) {
                a = c0090b.m513c().m574a();
                for (i = 11; i >= 0; i--) {
                    if (((1 << i) & a) != 0) {
                        c0185f.m1154g(i2);
                    }
                    i2++;
                }
            }
        }
        return c0185f;
    }
}
