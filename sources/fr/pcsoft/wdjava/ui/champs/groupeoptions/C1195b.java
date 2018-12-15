package fr.pcsoft.wdjava.ui.champs.groupeoptions;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.RadioGroup;

/* renamed from: fr.pcsoft.wdjava.ui.champs.groupeoptions.b */
class C1195b extends RadioGroup {
    final WDSelecteur this$0;

    C1195b(WDSelecteur wDSelecteur, Context context) {
        this.this$0 = wDSelecteur;
        super(context);
    }

    protected void dispatchDraw(Canvas canvas) {
        if (getBackground() == null && this.this$0.Qc != null) {
            this.this$0.Qc.mo3373b(canvas, (View) this, null);
        }
        super.dispatchDraw(canvas);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(getLayoutParams().width, getLayoutParams().height);
    }
}
