package fr.pcsoft.wdjava.ui.dessin;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1336b;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1337c;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1338n;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1341l;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1343g;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1344h;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1346j;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1347k;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1353s;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1355u;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1359y;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p064a.C1032b;
import fr.pcsoft.wdjava.ui.p064a.C1034d;
import fr.pcsoft.wdjava.ui.p079e.C1400d;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.h */
public class C1367h implements C0544g {
    /* renamed from: z */
    private static final String[] f4052z = new String[]{C1367h.m9764z(C1367h.m9765z("k4YN\u0002\u0018$E\u0002\u0013J!IVGV/N\u0002\u0015]#OL\tMn")), C1367h.m9764z(C1367h.m9765z("\u001b\u000eb}7w\tnv8q\u000ecm5j\u0005cv"))};
    /* renamed from: g */
    private C1347k f4053g = null;
    /* renamed from: h */
    private C1337c f4054h = null;
    /* renamed from: i */
    private C0519e f4055i = null;
    /* renamed from: j */
    private boolean f4056j = false;

    public C1367h(C0519e c0519e, C1353s c1353s) {
        this.f4055i = c0519e;
        boolean z = this.f4055i instanceof gc ? ((gc) this.f4055i).getDisplayUnit() == 2 : true;
        this.f4054h = new C1344h(c1353s, z);
        this.f4053g = new C1347k();
    }

    /* renamed from: a */
    private final C1355u m9762a(int i) {
        switch (i) {
            case 0:
                break;
            case 1:
                return C1355u.DASH;
            case 2:
                return C1355u.DASH_AND_DOT;
            case 3:
                return C1355u.DOT_AND_DASH;
            case 4:
                return C1355u.DASH_AND_DOUBLE_DOT;
            case 5:
                return C1355u.INVISIBLE;
            default:
                C0691a.m2856a(f4052z[0]);
                break;
        }
        return C1355u.CONTINUOUS;
    }

    /* renamed from: a */
    private final void m9763a(int i, int i2) {
        C1338n a;
        if (i != C1032b.f2968a) {
            a = this.f4054h.mo3692a((int) (this.f4053g.m9683b() != null ? this.f4053g.m9683b().mo3684c() : 1.0d));
        } else {
            a = null;
        }
        C1341l b = i2 != C1032b.f2968a ? this.f4054h.mo3708b(C1031a.m7467k(i2), 255) : null;
        if (i != C1032b.f2968a) {
            this.f4053g.m9684b(C1031a.m7467k(i));
        }
        if (a != null) {
            this.f4053g.m9681a(a);
        }
        if (b != null) {
            this.f4053g.m9680a(b);
        }
    }

    /* renamed from: z */
    private static String m9764z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 56;
                    break;
                case 1:
                    i2 = 64;
                    break;
                case 2:
                    i2 = 32;
                    break;
                case 3:
                    i2 = 34;
                    break;
                default:
                    i2 = 103;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9765z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 103);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final void mo2327a(int i, int i2, int i3, int i4) {
        int k = C1031a.m7467k(i);
        if (this.f4053g != null) {
            C1341l b;
            switch (i2) {
                case 0:
                    b = this.f4054h.mo3708b(k, 255);
                    break;
                case 1:
                    b = null;
                    break;
                case 2:
                    b = this.f4054h.mo3690a(k, i3);
                    break;
                default:
                    return;
            }
            if (this.f4056j && b != null) {
                b.mo3731a(i4);
            }
            this.f4053g.m9680a(b);
        }
    }

    /* renamed from: a */
    public final void mo2328a(int i, int i2, int i3, int i4, int i5, int i6) {
        int min = Math.min(i, i3);
        int min2 = Math.min(i2, i4);
        int abs = Math.abs(i - i3) - 1;
        int abs2 = Math.abs(i2 - i4) - 1;
        this.f4053g.m9678a(7);
        m9763a(i6, i5);
        if (this.f4054h.mo3699a((double) min, (double) min2, (double) abs, (double) abs2, this.f4053g)) {
            int c = (int) (this.f4053g.m9683b() != null ? this.f4053g.m9683b().mo3684c() : 1.0d);
            this.f4055i.majAffichage(min - c, min2 - c, (c * 2) + abs, (c * 2) + abs2);
        }
        this.f4053g.m9686c(7);
    }

    /* renamed from: a */
    public final void mo2329a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int min = Math.min(i, i3);
        int min2 = Math.min(i2, i4);
        int abs = Math.abs(i - i3);
        int abs2 = Math.abs(i2 - i4);
        int abs3 = Math.abs(i7);
        if (abs3 % 90 != 0) {
            abs3 += 90 - (abs3 % 90);
        }
        Object obj = null;
        switch (abs3) {
            case 180:
                abs3 = 0;
                obj = 1;
                break;
            case C0607n.al /*270*/:
                obj = 1;
                break;
            case 360:
                abs3 = 0;
                break;
        }
        double abs4 = Math.abs(((double) (i3 - i)) * Math.cos((6.283185307179586d * ((double) abs3)) / 360.0d));
        double abs5 = Math.abs(((double) (i4 - i2)) * Math.sin((6.283185307179586d * ((double) abs3)) / 360.0d));
        this.f4053g.m9678a(6);
        this.f4053g.m9680a(obj != null ? this.f4054h.mo3689a((double) (((int) abs4) + i), (double) (((int) abs5) + i2), C1031a.m7467k(i5), (double) i, (double) i2, C1031a.m7467k(i6)) : this.f4054h.mo3689a((double) i, (double) i2, C1031a.m7467k(i5), (double) (((int) abs4) + i), (double) (((int) abs5) + i2), C1031a.m7467k(i6)));
        this.f4053g.m9681a(null);
        if (this.f4054h.mo3715c((double) min, (double) min2, (double) abs, (double) abs2, this.f4053g)) {
            this.f4055i.majAffichage(min, min2, abs, abs2);
        }
        this.f4053g.m9686c(6);
    }

    /* renamed from: a */
    public final void mo2330a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int min = Math.min(i, i3);
        int min2 = Math.min(i2, i4);
        int abs = Math.abs(i - i3);
        int abs2 = Math.abs(i2 - i4);
        double d = (double) ((abs / 2) + min);
        double d2 = (double) ((abs2 / 2) + min2);
        double d3 = (double) abs;
        double d4 = (double) abs2;
        double atan2 = Math.atan2((d2 - ((double) i6)) * d3, (((double) i5) - d) * d4);
        d = Math.atan2((d2 - ((double) i8)) * d3, (((double) i7) - d) * d4) - atan2;
        if (d <= 0.0d) {
            d += 6.283185307179586d;
        }
        int toDegrees = (int) Math.toDegrees(atan2);
        int toDegrees2 = (int) Math.toDegrees(d);
        this.f4053g.m9678a(i11 != 1 ? 7 : 3);
        m9763a(i10, i9);
        if (this.f4054h.mo3698a((double) min, (double) min2, (double) abs, (double) abs2, toDegrees, toDegrees2, i11, this.f4053g)) {
            int c = (int) (this.f4053g.m9683b() != null ? this.f4053g.m9683b().mo3684c() : 1.0d);
            this.f4055i.majAffichage(min - c, min2 - c, (c * 2) + abs, (c * 2) + abs2);
        }
        this.f4053g.m9686c(i11 != 1 ? 7 : 3);
    }

    /* renamed from: a */
    public final void mo2331a(int i, int i2, String str, int i3, boolean z) {
        this.f4053g.m9678a(3);
        if (i3 != C1032b.f2968a) {
            this.f4053g.m9684b(C1031a.m7467k(i3));
        } else if (this.f4053g.m9675a() == 0) {
            this.f4053g.m9684b(-16777216);
        }
        int[] iArr = new int[4];
        if (this.f4054h.mo3701a((double) i, (double) i2, str, z, this.f4053g, iArr)) {
            if (this.f4053g.m9689f() == 0.0d) {
                this.f4055i.majAffichage(iArr[0], iArr[1], iArr[2], iArr[3]);
            } else {
                this.f4055i.majAffichage();
            }
        }
        this.f4053g.m9686c(3);
    }

    /* renamed from: a */
    public void mo2332a(int i, double[] dArr, int i2, int i3) {
        int i4 = 0;
        if (i > 1) {
            if (dArr.length < (i - 2) * 2) {
                WDErreurManager.m2883a(C0745b.m3222b(f4052z[1], String.valueOf(i)));
            }
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            int i8 = Integer.MIN_VALUE;
            while (i4 < i * 2) {
                int i9 = i4 + 1;
                i4 = (int) dArr[i4];
                i7 = Math.min(i7, i4);
                i5 = Math.max(i5, i4);
                i4 = (int) dArr[i9];
                i6 = Math.min(i6, i4);
                int max = Math.max(i8, i4);
                i4 = i9 + 1;
                i8 = max;
            }
            this.f4053g.m9678a(7);
            m9763a(i3, i2);
            if (this.f4054h.mo3707a(dArr, this.f4053g)) {
                i4 = (int) (this.f4053g.m9683b() != null ? this.f4053g.m9683b().mo3684c() : 1.0d);
                this.f4055i.majAffichage(i7 - i4, i6 - i4, (i5 + i7) + (i4 * 2), (i4 * 2) + (i8 + i6));
            }
            this.f4053g.m9686c(7);
        }
    }

    /* renamed from: a */
    public void m9772a(C1353s c1353s) {
        if (this.f4054h != null) {
            this.f4054h.mo3693a((C1346j) c1353s);
        }
    }

    /* renamed from: a */
    public void mo2333a(String str, int i, int i2, int i3) {
        this.f4053g.m9682a(C1400d.m9965a(str, C1400d.m9963a(i, this.f4055i instanceof gc ? (gc) this.f4055i : null), ((i2 & 16) > 0 ? 8 : 0) + ((((i2 & 8) > 0 ? 1 : 0) + ((i2 & 4) > 0 ? 2 : 0)) + ((i2 & 2) > 0 ? 4 : 0))));
        if (i3 != 0) {
            if (i3 < 0) {
                i3 += 360;
            }
            this.f4053g.m9676a(Math.toRadians((double) (360 - i3)));
            return;
        }
        this.f4053g.m9676a(0.0d);
    }

    /* renamed from: a */
    public void mo2334a(boolean z) {
        m9793g().mo3695a(z);
    }

    /* renamed from: a */
    public final boolean mo2335a() {
        if (!this.f4054h.mo3714c()) {
            return false;
        }
        this.f4055i.majAffichage();
        return true;
    }

    /* renamed from: a */
    public final boolean mo2336a(int i, int i2, int i3) {
        boolean b = (i == 0 && i2 == 0 && i3 != 0) ? this.f4054h.mo3712b(i3) : this.f4054h.mo3703a(i, i2, i3);
        if (b) {
            this.f4055i.majAffichage();
        }
        return b;
    }

    /* renamed from: a */
    public boolean mo2337a(C1336b c1336b, double d) {
        return m9793g().mo3705a(c1336b, d);
    }

    /* renamed from: a */
    public boolean mo2338a(C1336b c1336b, int i, int i2, int i3, int i4) {
        return m9793g().mo3706a(c1336b, (double) i, (double) i2, (double) i3, (double) i4);
    }

    /* renamed from: b */
    public final int mo2339b() {
        C1353s h = m9794h();
        return h != null ? h.m9724e() : 0;
    }

    /* renamed from: b */
    public void m9780b(int i) {
        mo2341b(0, 0, mo2339b(), mo2344c(), i, -1);
    }

    /* renamed from: b */
    public final void mo2340b(int i, int i2, int i3, int i4) {
        if (this.f4053g != null) {
            C1355u a = m9762a(i2);
            this.f4053g.m9684b(C1031a.m7467k(i));
            C1338n a2 = (this.f4054h.mo3696a() || i3 == 1 || a == C1355u.INVISIBLE) ? this.f4054h.mo3691a((double) i3, a, C1343g.BUTT, C1359y.MITER) : this.f4054h.mo3692a(i3);
            if (this.f4056j && a2 != null) {
                a2.mo3681a(i4);
            }
            this.f4053g.m9681a(a2);
        }
    }

    /* renamed from: b */
    public final void mo2341b(int i, int i2, int i3, int i4, int i5, int i6) {
        int min = Math.min(i, i3);
        int min2 = Math.min(i2, i4);
        int abs = Math.abs(i - i3);
        int abs2 = Math.abs(i2 - i4);
        this.f4053g.m9678a(7);
        m9763a(i6, i5);
        if (this.f4054h.mo3715c((double) min, (double) min2, (double) abs, (double) abs2, this.f4053g)) {
            int c = (int) (this.f4053g.m9683b() != null ? this.f4053g.m9683b().mo3684c() : 1.0d);
            this.f4055i.majAffichage(min - c, min2 - c, (c * 2) + abs, (c * 2) + abs2);
        }
        this.f4053g.m9686c(7);
    }

    /* renamed from: b */
    public void mo2342b(boolean z) {
        m9793g().mo3710b(z);
    }

    /* renamed from: b */
    public boolean mo2343b(C1336b c1336b, int i, int i2, int i3, int i4) {
        return m9793g().mo3713b(c1336b, (double) i, (double) i2, (double) i3, (double) i4);
    }

    /* renamed from: c */
    public final int mo2344c() {
        C1353s h = m9794h();
        return h != null ? h.m9723d() : 0;
    }

    /* renamed from: c */
    public final void mo2345c(int i, int i2, int i3, int i4) {
        if (i3 != C1032b.f2968a) {
            i3 = C1031a.m7467k(i3);
        }
        this.f4053g.m9678a(3);
        if (i3 != C1032b.f2968a) {
            this.f4053g.m9684b(i3);
        }
        C1338n a = this.f4054h.mo3692a(-1);
        if (this.f4056j) {
            a.mo3681a(i4);
        }
        this.f4053g.m9681a(a);
        if (this.f4054h.mo3700a((double) i, (double) i2, this.f4053g)) {
            this.f4055i.majAffichage(i, i2, 1, 1);
        }
        this.f4053g.m9686c(3);
    }

    /* renamed from: c */
    public final void mo2346c(int i, int i2, int i3, int i4, int i5, int i6) {
        C1338n a;
        int c = (int) (this.f4053g.m9683b() != null ? this.f4053g.m9683b().mo3684c() : 1.0d);
        if (i5 != -9999 || i6 > 0) {
            if (i6 <= 0) {
                i6 = c;
            }
            a = this.f4054h.mo3692a(i6);
        } else if (i6 < 0) {
            i6 = c;
            a = null;
        } else {
            a = null;
        }
        this.f4053g.m9678a(3);
        if (i5 != -9999) {
            this.f4053g.m9684b(C1031a.m7467k(i5));
        }
        if (a != null) {
            this.f4053g.m9681a(a);
        }
        if (this.f4054h.mo3711b((double) i, (double) i2, (double) i3, (double) i4, this.f4053g)) {
            this.f4055i.majAffichage(Math.min(i, i3) - i6, Math.min(i2, i4) - i6, Math.abs(i - i3) + (i6 * 2), Math.abs(i2 - i4) + (i6 * 2));
        }
        this.f4053g.m9686c(3);
    }

    /* renamed from: c */
    public final void mo2347c(boolean z) {
        this.f4056j = z;
    }

    /* renamed from: d */
    public final void mo2348d() {
        if (this.f4054h != null) {
            this.f4054h.mo3709b();
            this.f4054h = null;
        }
        if (this.f4053g != null) {
            this.f4053g.m9688e();
            this.f4053g = null;
        }
        this.f4055i = null;
    }

    /* renamed from: d */
    public final void mo2349d(int i, int i2, int i3, int i4) {
        int i5 = -1;
        if (i3 != C1032b.f2968a) {
            i3 = C1031a.m7467k(i3);
        } else if (this.f4053g.m9687d() == null) {
            i3 = C1034d.m7494t().mo3315b();
        }
        if (i4 != -1) {
            i5 = C1031a.m7467k(i4);
        }
        if (this.f4054h.mo3704a(i, i2, i3, i5)) {
            this.f4055i.majAffichage();
        }
    }

    /* renamed from: e */
    public final C0519e mo2350e() {
        return this.f4055i;
    }

    /* renamed from: f */
    public final boolean mo2351f() {
        return this.f4054h == null;
    }

    /* renamed from: g */
    public final C1337c m9793g() {
        return this.f4054h;
    }

    /* renamed from: h */
    public final C1353s m9794h() {
        return this.f4054h != null ? (C1353s) this.f4054h.mo3716d() : null;
    }

    /* renamed from: i */
    public final boolean m9795i() {
        C1353s h = m9794h();
        return h != null ? h.m9722c() : false;
    }

    /* renamed from: j */
    public final int m9796j() {
        C1353s h = m9794h();
        return h != null ? h.m9726g() : -1;
    }
}
