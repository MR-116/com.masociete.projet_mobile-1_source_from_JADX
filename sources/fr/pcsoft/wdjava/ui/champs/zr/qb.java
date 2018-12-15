package fr.pcsoft.wdjava.ui.champs.zr;

import fr.pcsoft.wdjava.core.WDObjet;

public class qb extends pb {
    /* renamed from: c */
    private WDAttributZR f3905c = null;
    final lc this$0;

    public qb(lc lcVar, WDRuptureZR wDRuptureZR, WDRuptureZR wDRuptureZR2, WDAttributZR wDAttributZR) {
        this.this$0 = lcVar;
        super(wDRuptureZR, wDRuptureZR2, null);
        this.f3905c = wDAttributZR;
    }

    /* renamed from: a */
    public void mo3571a() {
        super.mo3571a();
        this.f3905c = null;
    }

    /* renamed from: a */
    public boolean mo3572a(ec ecVar, int i, boolean z) {
        if (i == 0) {
            return true;
        }
        int indiceAttribut = this.f3905c.getIndiceAttribut();
        WDObjet b = ecVar.m9107b(indiceAttribut);
        WDObjet b2 = ((ec) this.this$0.ud.mo3593b(i - 1)).m9107b(indiceAttribut);
        if ((b != null && b2 != null && b.opDiff(b2)) || ((b == null || b2 == null) && b != b2)) {
            return true;
        }
        if (!z) {
            return false;
        }
        int indexOf = this.this$0.ed.indexOf(this);
        return indexOf > 0 ? ((pb) this.this$0.ed.get(indexOf - 1)).mo3572a(ecVar, i, z) : false;
    }

    /* renamed from: b */
    public boolean mo3573b(ec ecVar, int i, boolean z) {
        if (i >= this.this$0.ud.mo3586a() - 1) {
            return true;
        }
        int indiceAttribut = this.f3905c.getIndiceAttribut();
        WDObjet b = ecVar.m9107b(indiceAttribut);
        WDObjet b2 = ((ec) this.this$0.ud.mo3593b(i + 1)).m9107b(indiceAttribut);
        if ((b != null && b2 != null && b.opDiff(b2)) || ((b == null || b2 == null) && b != b2)) {
            return true;
        }
        if (!z) {
            return false;
        }
        int indexOf = this.this$0.ed.indexOf(this);
        return indexOf > 0 ? ((pb) this.this$0.ed.get(indexOf - 1)).mo3573b(ecVar, i, z) : false;
    }

    /* renamed from: d */
    public final int m9192d() {
        return this.f3905c.getIndiceAttribut();
    }
}
