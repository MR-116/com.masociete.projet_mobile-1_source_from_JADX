package fr.pcsoft.wdjava.ui.dessin.p078b;

import fr.pcsoft.wdjava.ui.dessin.p077a.C1344h;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1347k;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1353s;
import java.lang.ref.WeakReference;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.b.c */
public class C1364c {
    /* renamed from: a */
    public static final int f4039a = 0;
    /* renamed from: b */
    private static WeakReference[] f4040b = new WeakReference[5];
    /* renamed from: c */
    private static int f4041c = 0;
    /* renamed from: d */
    public static final int f4042d = 5;
    /* renamed from: e */
    public static final int f4043e = 1;
    /* renamed from: f */
    public static final int f4044f = 2;
    /* renamed from: g */
    public static final int f4045g = 3;
    /* renamed from: h */
    public static final int f4046h = 4;
    /* renamed from: i */
    static final int f4047i = 8;
    /* renamed from: j */
    public static final int f4048j = 6;
    /* renamed from: k */
    private static final int f4049k = 5;

    /* renamed from: a */
    private static final long m9752a(int i, int i2, int i3, int i4) {
        return (((((((1 * 31) + ((long) i)) * 29) + ((long) i2)) * 17) + ((long) i3)) * 13) + ((long) i4);
    }

    /* renamed from: a */
    public static final C1362a m9753a(int i, int i2) {
        long b = C1364c.m9757b(i, i2);
        C1361d a = C1364c.m9754a(b);
        if (a != null) {
            return (C1362a) a;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                a = new C1362a(b, i, i2);
                break;
        }
        if (a != null) {
            C1364c.m9756a(a);
        }
        return (C1362a) a;
    }

    /* renamed from: a */
    private static final C1361d m9754a(long j) {
        for (int i = 0; i < 5; i++) {
            WeakReference weakReference = f4040b[(f4041c + i) % 5];
            if (weakReference != null) {
                C1361d c1361d = (C1361d) weakReference.get();
                if (c1361d != null && c1361d.mo3738b() == j) {
                    return c1361d;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final void m9755a(C1353s c1353s, int i, int i2) {
        C1344h c1344h = new C1344h(c1353s, true);
        C1347k c1347k = new C1347k();
        c1347k.m9684b(i2);
        c1347k.m9681a(c1344h.mo3692a(1));
        switch (i) {
            case 0:
                c1344h.mo3711b(0.0d, 4.0d, 8.0d, 4.0d, c1347k);
                return;
            case 1:
                c1344h.mo3711b(4.0d, 0.0d, 4.0d, 8.0d, c1347k);
                return;
            case 2:
                c1344h.mo3711b(0.0d, 0.0d, 8.0d, 8.0d, c1347k);
                return;
            case 3:
                c1344h.mo3711b(0.0d, 7.0d, 7.0d, 0.0d, c1347k);
                return;
            case 4:
                c1344h.mo3711b(0.0d, 4.0d, 8.0d, 4.0d, c1347k);
                c1344h.mo3711b(4.0d, 0.0d, 4.0d, 8.0d, c1347k);
                return;
            case 5:
                c1344h.mo3711b(0.0d, 0.0d, 8.0d, 8.0d, c1347k);
                c1344h.mo3711b(0.0d, 7.0d, 7.0d, 0.0d, c1347k);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private static final void m9756a(C1361d c1361d) {
        f4041c++;
        if (f4041c >= 5) {
            f4041c = 0;
        }
        f4040b[f4041c] = new WeakReference(c1361d);
    }

    /* renamed from: b */
    private static final long m9757b(int i, int i2) {
        return (((1 * 31) + ((long) i)) * 29) + ((long) i2);
    }

    /* renamed from: b */
    public static final C1361d m9758b(int i, int i2, int i3, int i4) {
        long a = C1364c.m9752a(i, i2, i3, i4);
        C1361d a2 = C1364c.m9754a(a);
        if (a2 == null) {
            switch (i) {
                case 6:
                    Object c1363b = new C1363b(a, i4, i2, i3);
                    break;
            }
            if (a2 != null) {
                C1364c.m9756a(a2);
            }
        }
        return a2;
    }
}
