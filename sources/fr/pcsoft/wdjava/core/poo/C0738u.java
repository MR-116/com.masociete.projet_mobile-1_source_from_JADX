package fr.pcsoft.wdjava.core.poo;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.parcours.IWDParcours;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.collection.C0583e;
import fr.pcsoft.wdjava.jni.WDJNIException;
import fr.pcsoft.wdjava.jni.WDJNIHelper;

/* renamed from: fr.pcsoft.wdjava.core.poo.u */
public abstract class C0738u extends C0583e {
    /* renamed from: a */
    private static final int f1873a = 6;
    /* renamed from: b */
    private static final int f1874b = 3;
    /* renamed from: c */
    private static final int f1875c = 4;
    /* renamed from: d */
    private static final int f1876d = 2;
    /* renamed from: e */
    private static final int f1877e = 5;
    /* renamed from: f */
    private static final int f1878f = 7;
    /* renamed from: g */
    private static final int f1879g = 1;
    /* renamed from: z */
    private static final String[] f1880z = new String[]{C0738u.m3171z(C0738u.m3172z("=k[\u0013&Jd[\u0013:PbZ\u0002!W~D\u0012")), C0738u.m3171z(C0738u.m3172z("W@d2\u0016mDv1\u0000>Iq}\u0006lÄq/ErH4\u0019,Pb43\u0004jDrs")), C0738u.m3171z(C0738u.m3172z("=hF\u000f KK\t<NhK\u0018)[`Q\u00131AyU\u001f)[lA\u0002W"))};
    final C0736s this$0;

    protected C0738u(C0736s c0736s) {
        this.this$0 = c0736s;
    }

    static int access$000(C0738u c0738u) {
        return c0738u.m3170j();
    }

    static WDObjet access$100(C0738u c0738u, long j) {
        return c0738u.m3168b(j);
    }

    /* renamed from: b */
    private WDObjet m3168b(long j) {
        try {
            return (WDObjet) mo2482g().getConstructor(new Class[]{Long.class}).newInstance(new Object[]{Long.valueOf(j)});
        } catch (Exception e) {
            C0691a.m2857a(f1880z[1], e);
            return null;
        }
    }

    /* renamed from: i */
    private WDObjet m3169i() {
        try {
            return (WDObjet) mo2482g().newInstance();
        } catch (Exception e) {
            C0691a.m2857a(f1880z[1], e);
            return null;
        }
    }

    /* renamed from: j */
    private final int m3170j() {
        switch (mo2487d()) {
            case 1:
                return 4;
            case 4:
            case 8:
            case 14:
                return 2;
            case 5:
            case 9:
                return 3;
            case 12:
                return 5;
            case 16:
            case 17:
            case 19:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 81:
                return 1;
            case 28:
            case 30:
                return 6;
            default:
                return 7;
        }
    }

    /* renamed from: z */
    private static String m3171z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 30;
                    break;
                case 1:
                    i2 = 45;
                    break;
                case 2:
                    i2 = 20;
                    break;
                case 3:
                    i2 = 93;
                    break;
                default:
                    i2 = 101;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3172z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 101);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo2467a(int i, WDObjet[] wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f1880z[0], getNomType()));
        return 0;
    }

    /* renamed from: a */
    public int mo2468a(C0486m c0486m, int i, int i2, WDObjet[] wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f1880z[0], getNomType()));
        return 0;
    }

    /* renamed from: a */
    public WDObjet mo2485a() {
        int d = mo2487d();
        return d == 111 ? m3169i() : C0611a.m2292a(d);
    }

    /* renamed from: a */
    public WDObjet mo2469a(long j) {
        return (j < 0 || j >= mo2483h()) ? null : new C0740x(this, C0725i.m3069e((int) j));
    }

    /* renamed from: a */
    public WDObjet mo2470a(String str, boolean z) {
        return new C0741y(this, str);
    }

    /* renamed from: a */
    public IWDParcours mo2471a(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4, boolean z, boolean z2) {
        return new C0731d(this, this, wDObjet, wDObjet2, wDObjet3, z, z2);
    }

    /* renamed from: a */
    public void mo2472a(int i, int i2) {
        WDErreurManager.m2883a(C0745b.m3222b(f1880z[0], getNomType()));
    }

    /* renamed from: a */
    public void mo2473a(int i, C0486m c0486m) {
        WDErreurManager.m2883a(C0745b.m3222b(f1880z[0], getNomType()));
    }

    /* renamed from: a */
    public void mo2474a(WDObjet wDObjet, WDObjet wDObjet2) {
        int i = wDObjet2.getInt();
        try {
            switch (m3170j()) {
                case 2:
                    WDJNIHelper.m6654b(this.this$0.f1871b, mo3261l(), mo3260k(), i, wDObjet.getInt());
                    return;
                case 3:
                    WDJNIHelper.m6699d(this.this$0.f1871b, mo3261l(), mo3260k(), i, wDObjet.getLong());
                    return;
                case 4:
                    WDJNIHelper.m6604a(this.this$0.f1871b, mo3261l(), mo3260k(), i, wDObjet.getBoolean());
                    return;
                case 5:
                    WDJNIHelper.m6600a(this.this$0.f1871b, mo3261l(), mo3260k(), i, wDObjet.getDouble());
                    return;
                case 6:
                    WDJNIHelper.m6605a(this.this$0.f1871b, mo3261l(), mo3260k(), i, wDObjet.getDonneeBinaire());
                    return;
                case 7:
                    C0736s c0736s = (C0736s) wDObjet.checkType(mo2482g());
                    if (c0736s != null) {
                        WDJNIHelper.m6655b(this.this$0.f1871b, mo3261l(), mo3260k(), i, c0736s.f1871b);
                        return;
                    }
                    WDErreurManager.m2883a(C0745b.m3222b(f1880z[2], wDObjet.getNomType()));
                    return;
                default:
                    WDJNIHelper.m6603a(this.this$0.f1871b, mo3261l(), mo3260k(), i, wDObjet.getString());
                    return;
            }
        } catch (WDJNIException e) {
            throw e;
        } catch (C0539d e2) {
            WDErreurManager.m2875a(e2);
        }
        WDErreurManager.m2875a(e2);
    }

    /* renamed from: b */
    public int mo2475b(WDObjet wDObjet) {
        try {
            switch (m3170j()) {
                case 2:
                    return WDJNIHelper.m6713f(this.this$0.f1871b, mo3261l(), mo3260k(), wDObjet.getInt());
                case 3:
                    return WDJNIHelper.m6641b(this.this$0.f1871b, mo3261l(), mo3260k(), wDObjet.getLong());
                case 4:
                    return WDJNIHelper.m6564a(this.this$0.f1871b, mo3261l(), mo3260k(), wDObjet.getBoolean());
                case 5:
                    return WDJNIHelper.m6562a(this.this$0.f1871b, mo3261l(), mo3260k(), wDObjet.getDouble());
                case 6:
                    return WDJNIHelper.m6565a(this.this$0.f1871b, mo3261l(), mo3260k(), wDObjet.getDonneeBinaire());
                case 7:
                    C0736s c0736s = (C0736s) wDObjet.checkType(mo2482g());
                    if (c0736s != null) {
                        return WDJNIHelper.m6563a(this.this$0.f1871b, mo3261l(), mo3260k(), c0736s.f1871b);
                    }
                    WDErreurManager.m2883a(C0745b.m3222b(f1880z[2], wDObjet.getNomType()));
                    return 0;
                default:
                    return WDJNIHelper.m6718g(this.this$0.f1871b, mo3261l(), mo3260k(), wDObjet.getString());
            }
        } catch (C0539d e) {
            WDErreurManager.m2875a(e);
            return 0;
        }
    }

    /* renamed from: b */
    public void mo2476b() {
        WDErreurManager.m2883a(C0745b.m3222b(f1880z[0], getNomType()));
    }

    /* renamed from: b */
    public void mo2477b(int i, int i2) {
        WDErreurManager.m2883a(C0745b.m3222b(f1880z[0], getNomType()));
    }

    /* renamed from: c */
    public int mo2478c(WDObjet wDObjet) {
        try {
            return WDJNIHelper.m6640b(this.this$0.f1871b, mo3261l(), mo3260k(), wDObjet.getInt());
        } catch (C0539d e) {
            WDErreurManager.m2875a(e);
            return 0;
        }
    }

    /* renamed from: c */
    public void mo2479c() {
        WDErreurManager.m2883a(C0745b.m3222b(f1880z[0], getNomType()));
    }

    /* renamed from: e */
    public void mo2480e() {
        try {
            WDJNIHelper.m6599a(this.this$0.f1871b, mo3261l(), mo3260k());
        } catch (C0539d e) {
            WDErreurManager.m2875a(e);
        }
    }

    /* renamed from: f */
    public boolean mo2481f() {
        return true;
    }

    /* renamed from: h */
    public long mo2483h() {
        try {
            return (long) WDJNIHelper.m6639b(this.this$0.f1871b, mo3261l(), mo3260k());
        } catch (C0539d e) {
            WDErreurManager.m2875a(e);
            return 0;
        }
    }

    /* renamed from: k */
    protected abstract boolean mo3260k();

    /* renamed from: l */
    protected abstract int mo3261l();

    public void razVariable() {
        mo2480e();
    }

    public void release() {
    }
}
