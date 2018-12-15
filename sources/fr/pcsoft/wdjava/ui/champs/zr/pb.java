package fr.pcsoft.wdjava.ui.champs.zr;

public abstract class pb {
    /* renamed from: a */
    private WDRuptureZR f3901a;
    /* renamed from: b */
    private WDRuptureZR f3902b;

    private pb(WDRuptureZR wDRuptureZR, WDRuptureZR wDRuptureZR2) {
        this.f3901a = null;
        this.f3902b = null;
        this.f3901a = wDRuptureZR;
        this.f3902b = wDRuptureZR2;
    }

    pb(WDRuptureZR wDRuptureZR, WDRuptureZR wDRuptureZR2, wb wbVar) {
        this(wDRuptureZR, wDRuptureZR2);
    }

    /* renamed from: a */
    public void mo3571a() {
        this.f3901a = null;
        this.f3902b = null;
    }

    /* renamed from: a */
    public abstract boolean mo3572a(ec ecVar, int i, boolean z);

    /* renamed from: b */
    public final WDRuptureZR m9180b() {
        return this.f3902b;
    }

    /* renamed from: b */
    public abstract boolean mo3573b(ec ecVar, int i, boolean z);

    /* renamed from: c */
    public final WDRuptureZR m9182c() {
        return this.f3901a;
    }
}
