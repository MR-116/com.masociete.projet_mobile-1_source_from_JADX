package fr.pcsoft.wdjava.ui.champs.zr;

import android.view.View;
import android.widget.AbsListView;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.WDFenetreInterne;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.fb;
import fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer.AbstractRepetitionView;
import fr.pcsoft.wdjava.ui.gesture.C1290a;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.c */
class C1291c extends C1290a {
    final WDZoneRepetee this$0;

    C1291c(WDZoneRepetee wDZoneRepetee, AbsListView absListView, int i) {
        this.this$0 = wDZoneRepetee;
        super(absListView, i);
    }

    /* renamed from: c */
    public int mo3528c(int i, int i2) {
        if ((i2 == 1 && !this.this$0.Xd) || (i2 == 2 && !this.this$0.he)) {
            return this.this$0.fe.getWidth();
        }
        View childAt = this.this$0.fe.getChildAt(i - this.this$0.fe.getFirstVisiblePosition());
        if (childAt != null) {
            Object tag = childAt.getTag();
            if (tag instanceof fb) {
                return ((WDFenetreInterne) tag).getRequestedWidth();
            }
        }
        return 0;
    }

    /* renamed from: e */
    public View mo3529e(int i) {
        View childAt = this.this$0.fe.getChildAt(i - this.this$0.fe.getFirstVisiblePosition());
        return childAt instanceof AbstractRepetitionView ? ((AbstractRepetitionView) childAt).mo3541c() : null;
    }
}
