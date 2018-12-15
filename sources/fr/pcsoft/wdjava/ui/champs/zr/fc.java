package fr.pcsoft.wdjava.ui.champs.zr;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.database.hf.C0849z;
import fr.pcsoft.wdjava.ui.champs.ad;
import fr.pcsoft.wdjava.ui.p073d.p075b.C1320c;

public class fc extends ec implements ad {
    /* renamed from: p */
    private String f3873p = null;
    /* renamed from: q */
    private int f3874q = -1;

    public fc(lc lcVar, WDObjet[] wDObjetArr, C1320c c1320c) {
        super(lcVar, wDObjetArr);
        C0849z o = c1320c.mo3647o();
        if (o != null) {
            this.f3873p = ((WDObjet) o).getString();
        }
    }

    /* renamed from: a */
    public int mo3416a() {
        return this.f3874q;
    }

    /* renamed from: a */
    public void mo3417a(int i) {
        this.f3874q = i;
    }

    public WDObjet getValeurMemorisee() {
        return this.f3873p == null ? new WDChaine(this.g.getValeurItem(this)) : C0611a.m2300a(this.f3873p);
    }

    public void setValeurMemorisee(String str) {
        this.f3873p = str;
    }
}
