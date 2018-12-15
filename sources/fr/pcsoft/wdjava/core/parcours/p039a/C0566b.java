package fr.pcsoft.wdjava.core.parcours.p039a;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.parcours.IWDParcours;

/* renamed from: fr.pcsoft.wdjava.core.parcours.a.b */
public abstract class C0566b extends C0565a {
    /* renamed from: m */
    private int f1306m = 0;
    /* renamed from: n */
    private int f1307n = 0;
    /* renamed from: o */
    private WDObjet f1308o = null;

    public C0566b(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4, boolean z, boolean z2) {
        super(wDObjet, wDObjet2, wDObjet3, null, z, z2);
    }

    /* renamed from: a */
    public void m1858a(int i) {
        if (i <= this.f1306m) {
            this.f1306m++;
        }
    }

    /* renamed from: a */
    protected boolean mo2446a() {
        int h = mo2458h();
        this.f1307n = h;
        this.f1306m = h - 1;
        WDObjet b = mo2456b(this.f1306m);
        if (this.f && b != null) {
            b = b.getClone();
        }
        if (b == null) {
            return false;
        }
        this.f1308o = b;
        return true;
    }

    /* renamed from: b */
    public abstract WDObjet mo2456b(int i);

    /* renamed from: b */
    protected boolean mo2447b() {
        this.f1307n = 1;
        this.f1306m = 0;
        WDObjet b = mo2456b(this.f1306m);
        if (this.f && b != null) {
            b = b.getClone();
        }
        if (b == null) {
            return false;
        }
        this.f1308o = b;
        return true;
    }

    /* renamed from: c */
    protected boolean mo2448c() {
        this.f1307n--;
        this.f1306m--;
        WDObjet b = mo2456b(this.f1306m);
        if (this.f && b != null) {
            b = b.getClone();
        }
        if (b == null) {
            return false;
        }
        this.f1308o = b;
        return true;
    }

    /* renamed from: d */
    protected void mo2449d() {
    }

    /* renamed from: e */
    protected void mo2450e() {
        WDAppelContexte.getContexte().m2696a((IWDParcours) this);
    }

    /* renamed from: f */
    protected void mo2451f() {
        if (this.j != null) {
            this.j.setValeur(this.f1307n);
        }
        if (this.e != null) {
            this.e.setValeur(this.k);
        }
    }

    public void finParcours() {
        if (this.f1308o != null) {
            this.h.setValeur(this.f1308o);
        }
        WDAppelContexte.getContexte().m2720f();
    }

    /* renamed from: g */
    protected boolean mo2453g() {
        this.f1307n++;
        this.f1306m++;
        WDObjet b = mo2456b(this.f1306m);
        if (this.f && b != null) {
            b = b.getClone();
        }
        if (b == null) {
            return false;
        }
        this.f1308o = b;
        return true;
    }

    public final Object getElementCourant() {
        return getVariableParcours();
    }

    public final int getIndex() {
        return this.f1306m;
    }

    public final WDObjet getVariableParcours() {
        return this.f1308o;
    }

    /* renamed from: h */
    public abstract int mo2458h();

    /* renamed from: i */
    public void m1868i() {
        if (this.g) {
            this.f1306m--;
        }
    }

    public void release() {
        super.release();
        this.f1308o = null;
    }
}
