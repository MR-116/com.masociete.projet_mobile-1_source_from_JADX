package fr.pcsoft.wdjava.ui.p073d.p075b.p076a;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.utils.C0806j;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.champs.wc;

/* renamed from: fr.pcsoft.wdjava.ui.d.b.a.d */
public class C1325d extends C1324c {
    public C1325d(wc wcVar) {
        super(wcVar);
    }

    /* renamed from: R */
    protected int mo3669R() {
        return mo3631k() - mo3660K();
    }

    /* renamed from: a */
    public void mo3611a(int i, boolean z, boolean z2) {
        int f = mo3626f();
        if (i >= 0 && i < f) {
            f = mo3660K();
            if (!z2 || i != f) {
                if (z2 || i < f || i >= f + this.j.getItemCount()) {
                    mo3619b(i, true);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo3617b(int i) {
        super.mo3617b(i);
        C0806j.m3953c();
        this.j.onValueChanged();
    }

    /* renamed from: b */
    public void mo3619b(int i, boolean z) {
        if (z) {
            super.mo3619b(i, z);
            if (!WDAppelContexte.getContexte().m2704a((int) C0607n.Mv, null)) {
                C0806j.m3953c();
                this.j.notifyDataSetChanged();
                return;
            }
            return;
        }
        this.p = false;
        super.mo3619b(i, z);
        C0938m.m6816c().post(new C1329h(this));
    }

    /* renamed from: f */
    public void mo3670f(boolean z) {
        if (!mo3661L() || z) {
            mo3619b(Math.max(0, mo3626f() - 1), true);
        }
    }

    /* renamed from: h */
    public boolean mo3671h(int i) {
        if (i == this.j.getFirstVisibleElement()) {
            return false;
        }
        mo3619b(i, true);
        return true;
    }

    /* renamed from: x */
    public void mo3636x() {
        if (mo3632l()) {
            this.j.invalidateDrawCache();
            boolean isSelectionParProgrammation = this.j.isSelectionParProgrammation();
            this.j.setSelectionParProgrammation(true);
            int b = this.d.m3669b(this.a);
            try {
                int itemCount = this.j.getItemCount();
                int d = mo3668d(mo3661L());
                if (itemCount < d) {
                    itemCount = m9390I();
                    if (itemCount >= 0) {
                        this.d.m3685c(itemCount, 2);
                        this.d.m3662a(this.e, this.c, true, 1, 0);
                    }
                    mo3667b(true, true);
                    mo3659G();
                } else if (itemCount > d) {
                    while (itemCount > d) {
                        if (this.j.getItemCount() <= 1) {
                            break;
                        }
                        m9403c(1, false);
                        itemCount = this.j.getItemCount();
                    }
                }
                if (b > 0) {
                    this.d.m3685c(b, 0);
                }
                this.j.setSelectionParProgrammation(isSelectionParProgrammation);
            } catch (Throwable th) {
                if (b > 0) {
                    this.d.m3685c(b, 0);
                }
                this.j.setSelectionParProgrammation(isSelectionParProgrammation);
            }
        }
    }
}
