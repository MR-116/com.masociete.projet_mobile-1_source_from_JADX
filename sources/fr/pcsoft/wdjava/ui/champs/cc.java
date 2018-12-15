package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.database.hf.C0849z;
import fr.pcsoft.wdjava.ui.p073d.p075b.C1320c;

public class cc extends bc implements ad {
    /* renamed from: h */
    private int f3497h = -1;
    final ic this$0;

    public cc(ic icVar, String str, C1320c c1320c) {
        this.this$0 = icVar;
        super(icVar, str);
        if (c1320c != null) {
            C0849z o = c1320c.mo3647o();
            if (o != null) {
                this.d = ((WDObjet) o).getString();
            }
        }
    }

    /* renamed from: a */
    public int mo3416a() {
        return this.f3497h;
    }

    /* renamed from: a */
    public void mo3417a(int i) {
        this.f3497h = i;
    }
}
