package fr.pcsoft.wdjava.ui.champs.fenetre;

import android.content.Context;
import android.graphics.Rect;
import fr.pcsoft.wdjava.ui.p033c.C1108e;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetre.o */
class C1163o extends C1108e {
    final WDFenetre this$0;

    C1163o(WDFenetre wDFenetre, Context context) {
        this.this$0 = wDFenetre;
        super(context);
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if ((i & 2) == 0) {
            return super.onRequestFocusInDescendants(i, rect);
        }
        this.this$0.focusInitial();
        return true;
    }
}
