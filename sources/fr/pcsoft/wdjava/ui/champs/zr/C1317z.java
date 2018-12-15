package fr.pcsoft.wdjava.ui.champs.zr;

import android.graphics.Rect;
import android.view.View;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer.AbstractRepetitionView;
import java.util.Iterator;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.z */
public class C1317z extends C1315x {
    /* renamed from: g */
    private View f3932g = null;

    public C1317z(WDZoneRepetee wDZoneRepetee) {
        super(wDZoneRepetee);
    }

    /* renamed from: a */
    protected void mo3600a(int i, AbstractRepetitionView abstractRepetitionView, gc gcVar) {
        boolean z = false;
        if (m9256e()) {
            if (i != this.d) {
                m9262k();
            } else if (this.e != gcVar) {
                mo3604c(false);
                this.f3932g = abstractRepetitionView.mo3541c();
                this.d = i;
                this.e = gcVar;
                this.f.getRenderer().mo3550a(z);
                m9263l();
                if (z) {
                    this.f.appelPCode(19);
                }
            } else {
                return;
            }
        }
        z = true;
        this.f3932g = abstractRepetitionView.mo3541c();
        this.d = i;
        this.e = gcVar;
        this.f.getRenderer().mo3550a(z);
        m9263l();
        if (z) {
            this.f.appelPCode(19);
        }
    }

    /* renamed from: a */
    public void mo3601a(Rect rect) {
    }

    /* renamed from: a */
    protected void mo3602a(boolean z) {
        super.mo3602a(z);
        if (this.f3932g != null) {
            View findFocus = this.f3932g.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
        }
        this.f3932g = null;
    }

    /* renamed from: b */
    public View mo3603b() {
        return this.f3932g;
    }

    /* renamed from: h */
    public int mo3605h() {
        return 1;
    }

    /* renamed from: i */
    protected void mo3606i() {
        ec c = m9253c();
        if (c != null) {
            gc a = this.f3932g instanceof C1309r ? ((C1309r) this.f3932g).m9183a(this.e) : null;
            if (this.e.isSauverValeurEnFinEditionZR() && a != null) {
                Iterator iterateurAttributs = this.e.getIterateurAttributs();
                if (iterateurAttributs != null) {
                    while (iterateurAttributs.hasNext()) {
                        WDAttributZR wDAttributZR = (WDAttributZR) iterateurAttributs.next();
                        if (wDAttributZR != null && wDAttributZR.getProprieteAssocie() == EWDPropriete.PROP_VALEUR) {
                            c.m9101a(wDAttributZR.getIndiceAttribut(), a.getValeurPropriete(wDAttributZR.getProprieteAssocie()));
                            return;
                        }
                    }
                }
            }
        }
    }
}
