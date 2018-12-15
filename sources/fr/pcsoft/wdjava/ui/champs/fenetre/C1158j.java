package fr.pcsoft.wdjava.ui.champs.fenetre;

import android.content.Context;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.hb;
import fr.pcsoft.wdjava.ui.pulltorefresh.C0533c;
import fr.pcsoft.wdjava.ui.pulltorefresh.C1157f;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetre.j */
class C1158j extends C1157f {
    final WDFenetre this$0;
    final String val$strNomFenetreInterne;

    C1158j(WDFenetre wDFenetre, Context context, String str) {
        this.this$0 = wDFenetre;
        this.val$strNomFenetreInterne = str;
        super(context);
    }

    /* renamed from: a */
    protected C0533c mo3431a(Context context) {
        C0533c load = hb.load(this.val$strNomFenetreInterne, this.this$0, null);
        if (load == null) {
            return super.mo3431a(context);
        }
        load.appliquerAncrage(0, 0, 0, 0, 0);
        this.this$0.ajouterFenetreInterne(load);
        load.setAutoAnchoring(true, false);
        return load;
    }
}
