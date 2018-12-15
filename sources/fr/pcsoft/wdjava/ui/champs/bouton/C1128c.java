package fr.pcsoft.wdjava.ui.champs.bouton;

import android.view.View;
import android.view.View.OnClickListener;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0509v;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.utils.C1503b;

/* renamed from: fr.pcsoft.wdjava.ui.champs.bouton.c */
class C1128c implements OnClickListener {
    final WDBouton this$0;

    C1128c(WDBouton wDBouton) {
        this.this$0 = wDBouton;
    }

    public void onClick(View view) {
        if (!this.this$0.isBloqueTouchEvent()) {
            if (this.this$0.Vc && !this.this$0.Kc.hasFocus()) {
                C1503b.m10450d(this.this$0.Kc);
            }
            if (this.this$0.Lc) {
                this.this$0.Sc = !this.this$0.Sc;
                this.this$0.Kc.invalidate();
            }
            this.this$0.appelPCode_TLM(18, 1);
            if (!this.this$0.isReleased() && this.this$0.Kc.isFocused() && !this.this$0.Mb) {
                String champPrecedent = ((C0509v) this.this$0.l).getChampPrecedent();
                if (champPrecedent != null && !champPrecedent.equals("")) {
                    WDObjet fils = this.this$0.l.getFils(champPrecedent);
                    if (fils != null && fils.isChamp()) {
                        ((gc) fils).prendreFocus();
                    }
                }
            }
        }
    }
}
