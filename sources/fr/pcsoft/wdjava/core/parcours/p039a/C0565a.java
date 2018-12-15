package fr.pcsoft.wdjava.core.parcours.p039a;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.parcours.IWDParcours;

/* renamed from: fr.pcsoft.wdjava.core.parcours.a.a */
public abstract class C0565a implements IWDParcours {
    /* renamed from: e */
    protected WDObjet f1298e = null;
    /* renamed from: f */
    protected boolean f1299f = false;
    /* renamed from: g */
    protected boolean f1300g = true;
    /* renamed from: h */
    protected WDObjet f1301h = null;
    /* renamed from: i */
    private boolean f1302i = false;
    /* renamed from: j */
    protected WDObjet f1303j = null;
    /* renamed from: k */
    protected long f1304k = 0;
    /* renamed from: l */
    protected WDObjet f1305l = null;

    protected C0565a(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4, boolean z, boolean z2) {
        this.f1301h = wDObjet;
        this.f1303j = wDObjet2;
        this.f1298e = wDObjet3;
        this.f1300g = z;
        this.f1299f = z2;
        this.f1305l = wDObjet4;
        mo2449d();
        mo2450e();
    }

    /* renamed from: a */
    protected abstract boolean mo2446a();

    /* renamed from: b */
    protected abstract boolean mo2447b();

    /* renamed from: c */
    protected abstract boolean mo2448c();

    /* renamed from: d */
    protected abstract void mo2449d();

    /* renamed from: e */
    protected abstract void mo2450e();

    /* renamed from: f */
    protected abstract void mo2451f();

    /* renamed from: g */
    protected abstract boolean mo2453g();

    public int getIndex() {
        throw new UnsupportedOperationException();
    }

    public void release() {
        this.f1301h = null;
        this.f1303j = null;
        this.f1298e = null;
    }

    public void reset() {
        this.f1304k = 0;
        this.f1302i = false;
        mo2450e();
    }

    public boolean testParcours() {
        try {
            boolean g;
            if (this.f1302i) {
                g = this.f1300g ? mo2453g() : mo2448c();
            } else {
                this.f1302i = true;
                g = this.f1300g ? mo2447b() : mo2446a();
            }
            if (g) {
                try {
                    this.f1304k++;
                    mo2451f();
                } catch (UnsupportedOperationException e) {
                    throw e;
                }
            }
            return g;
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }
}
