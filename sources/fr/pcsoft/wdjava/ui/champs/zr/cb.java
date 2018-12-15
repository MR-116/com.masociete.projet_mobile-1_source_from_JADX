package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;
import fr.pcsoft.wdjava.ui.pulltorefresh.C0533c;
import fr.pcsoft.wdjava.ui.pulltorefresh.C1157f;

class cb extends C1157f {
    final WDZoneRepetee this$0;
    final String val$strNomFenetreInterne;

    cb(WDZoneRepetee wDZoneRepetee, Context context, String str) {
        this.this$0 = wDZoneRepetee;
        this.val$strNomFenetreInterne = str;
        super(context);
    }

    /* renamed from: a */
    protected C0533c mo3431a(Context context) {
        C0533c loadFenetreInterne = this.this$0.loadFenetreInterne(this.val$strNomFenetreInterne);
        if (loadFenetreInterne == null) {
            return super.mo3431a(context);
        }
        loadFenetreInterne.setAutoAnchoring(true, false);
        return loadFenetreInterne;
    }
}
