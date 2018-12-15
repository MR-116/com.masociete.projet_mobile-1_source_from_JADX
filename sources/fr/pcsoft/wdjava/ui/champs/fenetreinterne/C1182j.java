package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.content.Context;
import android.view.ViewParent;
import fr.pcsoft.wdjava.ui.champs.C1151p;
import fr.pcsoft.wdjava.ui.p033c.C1106a;
import fr.pcsoft.wdjava.ui.p033c.C1108e;
import fr.pcsoft.wdjava.ui.p033c.C1109f;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetreinterne.j */
class C1182j extends C1151p {
    final WDFenetreInterne this$0;

    C1182j(WDFenetreInterne wDFenetreInterne, Context context) {
        this.this$0 = wDFenetreInterne;
        super(context);
    }

    protected void onMeasure(int i, int i2) {
        if (!this.this$0.isReleased()) {
            ViewParent parent = getParent();
            if (parent == null || !((parent instanceof C1108e) || (parent instanceof C1106a) || (parent instanceof C1109f))) {
                super.onMeasure(i, i2);
                return;
            }
            super.onMeasure(i, i2);
            setMeasuredDimension(this.this$0._getLargeur(), this.this$0._getHauteur());
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 1;
        int i6 = i != i3 ? 1 : 0;
        int i7 = i4 != i2 ? 1 : 0;
        if ((i6 == 0 && i7 == 0) || this.this$0.Fc == null || this.this$0.isChangementAgencementEnCours()) {
            i5 = 0;
        } else {
            int b = this.this$0.Fc.m8250b();
            this.this$0.Fc.m8253d();
            if (b == this.this$0.Fc.m8250b()) {
                i5 = 0;
            }
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.this$0.Jc = i;
        this.this$0.Lc = i2;
        if ((this.this$0.Hc && i6 != 0) || (this.this$0.Gc && i7 != 0)) {
            if (i3 == 0 || r0 != 0) {
                i3 = this.this$0.getRequestedWidth();
            }
            if (i4 == 0 || r0 != 0) {
                i4 = this.this$0.getRequestedHeight();
            }
            this.this$0.appliquerAncrage(this.this$0.Hc ? i - i3 : 0, this.this$0.Gc ? i2 - i4 : 0, 0, 0, 0);
            measureChildren(0, 0);
        }
    }
}
