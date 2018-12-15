package fr.pcsoft.wdjava.ui.champs.groupeoptions;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import fr.pcsoft.wdjava.ui.p082k.C1439b;

/* renamed from: fr.pcsoft.wdjava.ui.champs.groupeoptions.j */
class C1201j implements OnFocusChangeListener {
    final C0501o this$0;

    C1201j(C0501o c0501o) {
        this.this$0 = c0501o;
    }

    public void onFocusChange(View view, boolean z) {
        Object obj = null;
        if (!z) {
            for (int i = 0; i < this.this$0.Jc; i++) {
                View composant = this.this$0.Pc[i].getComposant();
                if (composant == composant.findFocus()) {
                    obj = 1;
                    break;
                }
            }
            if (obj == null && this.this$0.l != null && this.this$0.l.getFinOuverture()) {
                this.this$0.appelPCode(12);
                this.this$0.appelPCode(16);
                this.this$0.notifPerteFocus();
            }
        } else if (this.this$0._getEtat() == 0) {
            C1439b.m10105d().m10102a(this.this$0);
            if (!this.this$0.hasFocus() && this.this$0.l != null && this.this$0.l.getFinOuverture()) {
                this.this$0.appelPCode(11);
                this.this$0.appelPCode(15);
                this.this$0.notifPriseFocusOption();
            }
        }
    }
}
