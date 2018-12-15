package fr.pcsoft.wdjava.ui.champs;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.champs.zr.bb;
import fr.pcsoft.wdjava.ui.p082k.C1439b;

class eb implements OnFocusChangeListener {
    final gc this$0;

    eb(gc gcVar) {
        this.this$0 = gcVar;
    }

    public void onFocusChange(View view, boolean z) {
        if (!this.this$0.isReleased()) {
            if (z) {
                if (this.this$0.d == 0) {
                    C1439b.m10105d().m10102a(this.this$0);
                    if (this.this$0.l != null && this.this$0.l.getFinOuverture()) {
                        C0938m.m6814b(new cd(this));
                    }
                }
            } else if (this.this$0.l != null && this.this$0.l.getFinOuverture()) {
                bb bbVar = (bb) this.this$0.getChampParent(bb.class);
                if (bbVar != null) {
                    bbVar.notifFinFocus(this.this$0);
                }
                C0938m.m6814b(new tc(this));
            }
        }
    }
}
