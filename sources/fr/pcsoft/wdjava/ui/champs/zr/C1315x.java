package fr.pcsoft.wdjava.ui.champs.zr;

import android.graphics.Rect;
import android.view.View;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.kb;
import fr.pcsoft.wdjava.ui.champs.table.colonne.C1278a;
import fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer.AbstractRepetitionView;
import java.util.Iterator;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.x */
public abstract class C1315x {
    /* renamed from: b */
    public static final int f3923b = 2;
    /* renamed from: c */
    public static final int f3924c = 1;
    /* renamed from: a */
    private boolean f3925a = false;
    /* renamed from: d */
    protected int f3926d = -1;
    /* renamed from: e */
    protected gc f3927e = null;
    /* renamed from: f */
    protected WDZoneRepetee f3928f = null;

    public C1315x(WDZoneRepetee wDZoneRepetee) {
        this.f3928f = wDZoneRepetee;
    }

    /* renamed from: a */
    public final void m9245a() {
        this.f3925a = true;
        C0938m.m6816c().post(new C1313v(this));
    }

    /* renamed from: a */
    public void mo3599a(int i, int i2) {
    }

    /* renamed from: a */
    protected abstract void mo3600a(int i, AbstractRepetitionView abstractRepetitionView, gc gcVar);

    /* renamed from: a */
    public abstract void mo3601a(Rect rect);

    /* renamed from: a */
    protected void mo3602a(boolean z) {
        if (this.f3927e != null) {
            mo3604c(z);
        }
        if (!m9255d()) {
            this.f3928f.appelPCode(20);
            if (!m9255d() && !m9255d()) {
                this.f3927e = null;
                this.f3926d = -1;
            }
        }
    }

    /* renamed from: b */
    public abstract View mo3603b();

    /* renamed from: b */
    public final void m9251b(int i, AbstractRepetitionView abstractRepetitionView, gc gcVar) {
        mo3600a(i, abstractRepetitionView, gcVar);
    }

    /* renamed from: b */
    public boolean m9252b(boolean z) {
        try {
            if (!m9256e() || m9255d()) {
                this.f3925a = false;
                return false;
            }
            mo3602a(z);
            boolean z2 = !m9255d();
            this.f3925a = false;
            return z2;
        } catch (Throwable th) {
            this.f3925a = false;
        }
    }

    /* renamed from: c */
    protected ec m9253c() {
        ub dataModel = this.f3928f.getDataModel();
        return (this.f3926d < 0 || this.f3926d >= dataModel.mo3586a()) ? null : (ec) dataModel.mo3593b(this.f3928f.convertirIndiceVueVersModele(this.f3926d));
    }

    /* renamed from: c */
    protected void mo3604c(boolean z) {
        if (this.f3927e != null) {
            if (!z && this.f3927e.isSauverValeurEnFinEditionZR()) {
                mo3606i();
            }
            this.f3928f.getRenderer().mo3545a();
            C1278a tableColumn = this.f3927e.getTableColumn();
            if (tableColumn != null) {
                ((C0489p) tableColumn).appelPCode(16);
            }
        }
    }

    /* renamed from: d */
    public final boolean m9255d() {
        return this.f3925a;
    }

    /* renamed from: e */
    public final boolean m9256e() {
        return this.f3926d >= 0;
    }

    /* renamed from: f */
    public void m9257f() {
        this.f3927e = null;
    }

    /* renamed from: g */
    public final gc m9258g() {
        return this.f3927e;
    }

    /* renamed from: h */
    public abstract int mo3605h();

    /* renamed from: i */
    protected void mo3606i() {
        ec c = m9253c();
        if (c != null) {
            gc cloneForEdition = this.f3927e.getCloneForEdition();
            if (this.f3927e.isSauverValeurEnFinEditionZR() && cloneForEdition != null) {
                Iterator iterateurAttributs = this.f3927e.getIterateurAttributs();
                if (iterateurAttributs != null) {
                    while (iterateurAttributs.hasNext()) {
                        WDAttributZR wDAttributZR = (WDAttributZR) iterateurAttributs.next();
                        if (wDAttributZR != null && wDAttributZR.getProprieteAssocie() == EWDPropriete.PROP_VALEUR) {
                            c.m9101a(wDAttributZR.getIndiceAttribut(), cloneForEdition.getValeurPropriete(wDAttributZR.getProprieteAssocie()));
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public final int m9261j() {
        return this.f3926d;
    }

    /* renamed from: k */
    public final boolean m9262k() {
        return m9252b(false);
    }

    /* renamed from: l */
    protected final void m9263l() {
        kb selectionModel = this.f3928f.getSelectionModel();
        if (!selectionModel.mo3485a(this.f3926d)) {
            if (selectionModel.mo3496h() == 99) {
                selectionModel.mo3489c(this.f3926d, this.f3926d);
            } else {
                this.f3928f.onItemClick(this.f3926d);
            }
        }
    }
}
