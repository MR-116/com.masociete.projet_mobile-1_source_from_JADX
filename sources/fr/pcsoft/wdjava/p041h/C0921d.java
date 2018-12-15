package fr.pcsoft.wdjava.p041h;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0509v;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: fr.pcsoft.wdjava.h.d */
public class C0921d {
    /* renamed from: a */
    static ArrayList f2516a;
    /* renamed from: b */
    static long f2517b = 0;
    /* renamed from: c */
    static long f2518c = -1;

    /* renamed from: a */
    public static final synchronized long m6544a() {
        long j;
        synchronized (C0921d.class) {
            j = f2517b + 1;
            f2517b = j;
        }
        return j;
    }

    /* renamed from: a */
    public static final synchronized C0920c m6545a(int i) {
        C0920c c0920c;
        synchronized (C0921d.class) {
            if (f2516a != null) {
                Iterator it = f2516a.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    c0920c = (C0920c) it.next();
                    if (c0920c.m6539e() == i) {
                        c0920c.mo3213c();
                        f2516a.remove(i2);
                        c0920c.mo3212b();
                        break;
                    }
                    i2++;
                }
            }
            c0920c = null;
        }
        return c0920c;
    }

    /* renamed from: a */
    public static final synchronized C0920c m6546a(WDCallback wDCallback, int i, long j, boolean z, int i2, WDObjet... wDObjetArr) {
        C0920c c0920c;
        synchronized (C0921d.class) {
            if (f2516a == null) {
                f2516a = new ArrayList();
            }
            Iterator it = f2516a.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                c0920c = (C0920c) it.next();
                if (((long) c0920c.m6539e()) == j) {
                    c0920c.mo3213c();
                    break;
                }
                i3++;
            }
            c0920c = new C0920c((int) j, i, wDCallback, (C0509v) WDAppelContexte.getContexte().m2722h(), i2);
            c0920c.m6535a(wDObjetArr);
            f2516a.add(i3, c0920c);
            f2517b = Math.max(f2517b, j);
            if (z) {
                c0920c.mo3214d();
            }
        }
        return c0920c;
    }

    /* renamed from: a */
    public static final C0920c m6547a(C0486m c0486m, int i, long j, boolean z, int i2) {
        return C0921d.m6546a(WDCallback.m2239a(c0486m, 0, true), i, j, z, i2, new WDObjet[0]);
    }

    /* renamed from: b */
    public static final int m6548b() {
        return (int) f2518c;
    }
}
