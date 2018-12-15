package fr.pcsoft.wdjava.p041h;

import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDParametre;
import fr.pcsoft.wdjava.core.p035c.C0660a;
import fr.pcsoft.wdjava.core.p035c.C0667i;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0509v;

/* renamed from: fr.pcsoft.wdjava.h.b */
public abstract class C0919b {
    /* renamed from: b */
    public static final int f2505b = Integer.MAX_VALUE;
    /* renamed from: a */
    protected int f2506a = Integer.MAX_VALUE;
    /* renamed from: c */
    protected C0509v f2507c;
    /* renamed from: d */
    protected int f2508d = 0;
    /* renamed from: e */
    protected int f2509e = 0;
    /* renamed from: f */
    protected WDCallback f2510f = null;
    /* renamed from: g */
    protected C0645a f2511g = null;
    /* renamed from: h */
    private WDObjet[] f2512h = null;

    public C0919b(int i, int i2, WDCallback wDCallback, C0509v c0509v, int i3) {
        this.f2508d = i;
        this.f2507c = c0509v;
        this.f2506a = i3;
        this.f2510f = wDCallback;
    }

    /* renamed from: a */
    public WDCallback m6531a() {
        return this.f2510f;
    }

    /* renamed from: a */
    public abstract void mo3211a(int i);

    /* renamed from: a */
    protected void m6533a(WDCallback wDCallback) {
        try {
            if (this.f2507c != null) {
                if (!this.f2507c.estOuverte()) {
                    C0921d.m6545a(this.f2508d);
                    return;
                }
            }
            try {
                if (this.f2506a != Integer.MAX_VALUE) {
                    if (this.f2509e >= this.f2506a) {
                        C0921d.m6545a(this.f2508d);
                        return;
                    }
                }
                C0921d.f2518c = (long) this.f2508d;
                try {
                    if (this.f2512h != null) {
                        if (this.f2512h.length != 0) {
                            wDCallback.execute(this.f2512h);
                            this.f2509e++;
                            C0921d.f2518c = -1;
                        }
                    }
                    wDCallback.execute(1, new WDObjet[0]);
                    this.f2509e++;
                    C0921d.f2518c = -1;
                } catch (C0667i e) {
                    throw e;
                } catch (C0660a e2) {
                    try {
                        e2.m2665a();
                    } finally {
                        C0921d.f2518c = -1;
                    }
                } catch (C0667i e3) {
                    C0921d.f2518c = -1;
                }
            } catch (C0667i e4) {
                throw e4;
            } catch (C0667i e42) {
                throw e42;
            }
        } catch (C0667i e422) {
            throw e422;
        } catch (C0667i e4222) {
            throw e4222;
        }
    }

    /* renamed from: a */
    public final void m6534a(C0645a c0645a) {
        this.f2511g = c0645a;
    }

    /* renamed from: a */
    public final void m6535a(WDObjet... wDObjetArr) {
        this.f2512h = wDObjetArr;
        if (this.f2512h != null) {
            WDParametre.traiterParametreTraitementNonBloquant(this.f2512h);
        }
    }

    /* renamed from: b */
    public void mo3212b() {
        if (this.f2511g != null) {
            this.f2511g.mo2564c(this.f2508d);
        }
        if (this.f2510f != null) {
            this.f2510f.m2261c();
        }
        this.f2507c = null;
        this.f2512h = null;
        this.f2511g = null;
    }

    /* renamed from: c */
    public abstract void mo3213c();

    /* renamed from: d */
    public abstract void mo3214d();

    /* renamed from: e */
    public int m6539e() {
        return this.f2508d;
    }
}
