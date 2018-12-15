package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;
import android.widget.ImageButton;

class xb extends ImageButton {
    final hb this$1;

    xb(hb hbVar, Context context) {
        this.this$1 = hbVar;
        super(context);
    }

    public int[] onCreateDrawableState(int i) {
        return hb.access$000(this.this$1) ? mergeDrawableStates(super.onCreateDrawableState(i + 1), WDAbstractZRRenderer.f3783e) : super.onCreateDrawableState(i);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), this.this$1.f3894b.getHauteurRupture());
    }
}
