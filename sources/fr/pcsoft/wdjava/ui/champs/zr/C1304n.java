package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;
import android.graphics.Canvas;
import fr.pcsoft.wdjava.ui.champs.C1151p;
import fr.pcsoft.wdjava.ui.champs.fb;
import fr.pcsoft.wdjava.ui.p072i.C1431a;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.n */
class C1304n extends C1151p {
    final C1316y this$0;

    C1304n(C1316y c1316y, Context context) {
        this.this$0 = c1316y;
        super(context);
    }

    protected void dispatchDraw(Canvas canvas) {
        WDAbstractZRRenderer renderer = this.this$0.f.getRenderer();
        if (this.this$0.f.getRenderingMode() == fb.DOUBLE_BUFFERING_WITH_CACHE && (renderer instanceof C1294e)) {
            C1431a j = ((C1294e) renderer).m9086j();
            if (j != null && j.m10066e()) {
                return;
            }
        }
        super.dispatchDraw(canvas);
    }
}
