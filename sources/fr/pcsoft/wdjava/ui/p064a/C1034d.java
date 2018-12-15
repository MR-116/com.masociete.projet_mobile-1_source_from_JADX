package fr.pcsoft.wdjava.ui.p064a;

import android.graphics.Color;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.InputDeviceCompat;
import fr.pcsoft.wdjava.core.C0607n;

/* renamed from: fr.pcsoft.wdjava.ui.a.d */
public class C1034d implements C1032b {
    /* renamed from: b */
    public static final int f2969b = -7829368;
    /* renamed from: c */
    private static C1034d f2970c = null;
    /* renamed from: d */
    private static C1034d f2971d = null;
    /* renamed from: e */
    private static C1034d f2972e = null;
    /* renamed from: f */
    private static C1034d f2973f = null;
    /* renamed from: g */
    private static C1034d f2974g = null;
    /* renamed from: h */
    private static C1034d f2975h = null;
    /* renamed from: i */
    private static C1034d f2976i = null;
    /* renamed from: j */
    private static C1034d f2977j = null;
    /* renamed from: k */
    private static C1034d f2978k = null;
    /* renamed from: l */
    private static C1034d f2979l = null;
    /* renamed from: m */
    private static C1034d f2980m = null;
    /* renamed from: n */
    private static C1034d f2981n = null;
    /* renamed from: o */
    public static final C1034d f2982o = new C1034d(-16777216);
    /* renamed from: q */
    private static C1034d f2983q = null;
    /* renamed from: r */
    private static C1034d f2984r = null;
    /* renamed from: p */
    private int f2985p = -16777216;

    public C1034d(int i) {
        this.f2985p = i;
    }

    public C1034d(int i, int i2, int i3, int i4) {
        this.f2985p = ((((i4 & 255) << 24) | ((i & 255) << 16)) | ((i2 & 255) << 8)) | ((i3 & 255) << 0);
    }

    /* renamed from: a */
    public static final C1034d m7481a(int i) {
        switch (i) {
            case C0607n.Bj /*-251658240*/:
                return C1035e.m7516z();
            case C0607n.iw /*-243269632*/:
                return C1035e.m7516z();
            case C0607n.Xp /*-234881024*/:
                return C1035e.m7514x();
            case C0607n.dq /*-218103808*/:
                return C1035e.m7508F();
            case C0607n.ln /*-209715200*/:
                return C1035e.m7504B();
            case C0607n.xv /*-201326592*/:
                return C1035e.m7507E();
            case C0607n.ag /*-192937984*/:
                return C1035e.m7503A();
            case C0607n.eg /*-184549376*/:
                return C1035e.m7512v();
            case C0607n.au /*-176160768*/:
                return C1035e.m7513w();
            case C0607n.Tg /*-167772160*/:
                return C1035e.m7507E();
            case C0607n.pu /*-159383552*/:
                return C1035e.m7514x();
            case C0607n.Ps /*-150994944*/:
                return C1035e.m7505C();
            case C0607n.Fd /*-150994943*/:
                return C1035e.m7506D();
            case C0607n.Kw /*-16777215*/:
                return f2982o;
            case -1:
                return C1034d.m7495u();
            case 0:
                return C1034d.m7492r();
            case 255:
                return C1034d.m7489o();
            case 65280:
                return C1034d.m7488n();
            case 65535:
                return C1034d.m7490p();
            case C0607n.Xv /*8421504*/:
                return C1034d.m7482f();
            case C0607n.pc /*12632256*/:
                return C1034d.m7485k();
            case C0607n.Sj /*16711680*/:
                return C1034d.m7484h();
            case C0607n.On /*16711935*/:
                return C1034d.m7483g();
            case C0607n.Uq /*16776960*/:
                return C1034d.m7493s();
            case 16777215:
                return C1034d.m7494t();
            default:
                return null;
        }
    }

    /* renamed from: f */
    public static final C1034d m7482f() {
        if (f2977j == null) {
            f2977j = new C1034d(128, 128, 128, 255);
        }
        return f2977j;
    }

    /* renamed from: g */
    public static final C1034d m7483g() {
        if (f2984r == null) {
            f2984r = new C1034d(-65281);
        }
        return f2984r;
    }

    /* renamed from: h */
    public static final C1034d m7484h() {
        if (f2979l == null) {
            f2979l = new C1034d(-16776961);
        }
        return f2979l;
    }

    /* renamed from: k */
    public static final C1034d m7485k() {
        if (f2981n == null) {
            f2981n = new C1034d(192, 192, 192, 255);
        }
        return f2981n;
    }

    /* renamed from: l */
    public static final C1034d m7486l() {
        if (f2983q == null) {
            f2983q = new C1034d(-14336);
        }
        return f2983q;
    }

    /* renamed from: m */
    public static final C1034d m7487m() {
        if (f2975h == null) {
            f2975h = new C1034d(f2969b);
        }
        return f2975h;
    }

    /* renamed from: n */
    public static final C1034d m7488n() {
        if (f2974g == null) {
            f2974g = new C1034d(-16711936);
        }
        return f2974g;
    }

    /* renamed from: o */
    public static final C1034d m7489o() {
        if (f2973f == null) {
            f2973f = new C1034d(SupportMenu.CATEGORY_MASK);
        }
        return f2973f;
    }

    /* renamed from: p */
    public static final C1034d m7490p() {
        if (f2971d == null) {
            f2971d = new C1034d(InputDeviceCompat.SOURCE_ANY);
        }
        return f2971d;
    }

    /* renamed from: q */
    public static final C1034d m7491q() {
        if (f2978k == null) {
            f2978k = new C1034d(-20561);
        }
        return f2978k;
    }

    /* renamed from: r */
    public static final C1034d m7492r() {
        if (f2976i == null) {
            f2976i = new C1034d(-16777216);
        }
        return f2976i;
    }

    /* renamed from: s */
    public static final C1034d m7493s() {
        if (f2980m == null) {
            f2980m = new C1034d(-16711681);
        }
        return f2980m;
    }

    /* renamed from: t */
    public static final C1034d m7494t() {
        if (f2970c == null) {
            f2970c = new C1034d(-1);
        }
        return f2970c;
    }

    /* renamed from: u */
    public static final C1034d m7495u() {
        if (f2972e == null) {
            f2972e = new C1034d(0);
        }
        return f2972e;
    }

    /* renamed from: a */
    public boolean mo3314a() {
        return false;
    }

    /* renamed from: b */
    public int mo3315b() {
        return this.f2985p;
    }

    /* renamed from: c */
    public boolean mo3316c() {
        return C1031a.m7448a(this.f2985p) == 0;
    }

    /* renamed from: d */
    public int mo3317d() {
        return C1031a.m7461e(this.f2985p);
    }

    /* renamed from: e */
    public int m7500e() {
        return Color.green(this.f2985p);
    }

    public int hashCode() {
        return this.f2985p;
    }

    /* renamed from: i */
    public int m7501i() {
        return Color.blue(this.f2985p);
    }

    /* renamed from: j */
    public int m7502j() {
        return Color.red(this.f2985p);
    }
}
