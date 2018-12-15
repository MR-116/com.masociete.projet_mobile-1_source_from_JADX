package fr.pcsoft.wdjava.ui.champs.saisie;

import android.view.View;
import android.view.View.OnClickListener;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.ui.dialogue.C1372f;
import fr.pcsoft.wdjava.ui.p083l.C1449i;

/* renamed from: fr.pcsoft.wdjava.ui.champs.saisie.c */
class C1252c implements OnClickListener {
    final C0517i this$0;

    C1252c(C0517i c0517i) {
        this.this$0 = c0517i;
    }

    public void onClick(View view) {
        if (this.this$0._getEtat() != 0) {
            return;
        }
        WDObjet a;
        if (this.this$0.Ec == 3) {
            a = C1372f.m9828a().mo3747a(((C1449i) this.this$0.sd).m10198f(), true, "");
            if (a != null) {
                this.this$0.setValeur(a);
                this.this$0.m1430g();
                return;
            }
            return;
        }
        a = C1372f.m9828a().mo3746a(((C1449i) this.this$0.sd).m10207m(), "");
        if (a != null) {
            this.this$0.setValeur(a);
            this.this$0.m1430g();
        }
    }
}
