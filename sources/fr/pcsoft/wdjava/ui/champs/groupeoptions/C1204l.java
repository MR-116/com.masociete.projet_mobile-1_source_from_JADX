package fr.pcsoft.wdjava.ui.champs.groupeoptions;

import android.view.View;
import fr.pcsoft.wdjava.ui.p069g.C1203e;

/* renamed from: fr.pcsoft.wdjava.ui.champs.groupeoptions.l */
class C1204l extends C1203e {
    final C1205m this$1;
    final C0500n val$this$0;

    C1204l(C1205m c1205m, int i, View view, C0500n c0500n) {
        this.this$1 = c1205m;
        this.val$this$0 = c0500n;
        super(i, view);
    }

    /* renamed from: c */
    protected void mo3467c() {
        if (this.this$1.isShowing()) {
            int i = C1205m.access$000(this.this$1)[0];
            int i2 = C1205m.access$000(this.this$1)[1];
            C1205m.access$100(this.this$1);
            if (i != C1205m.access$000(this.this$1)[0] || i2 != C1205m.access$000(this.this$1)[1]) {
                this.this$1.update(C1205m.access$000(this.this$1)[0], C1205m.access$000(this.this$1)[1], -1, -1, false);
            }
        }
    }
}
