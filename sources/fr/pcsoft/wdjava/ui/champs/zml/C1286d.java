package fr.pcsoft.wdjava.ui.champs.zml;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import fr.pcsoft.wdjava.ui.champs.C1151p;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zml.d */
class C1286d extends C1151p {
    final WDZoneMultiligne this$0;

    public C1286d(WDZoneMultiligne wDZoneMultiligne, Context context) {
        this.this$0 = wDZoneMultiligne;
        super(context);
    }

    /* renamed from: c */
    final int m8939c() {
        return getSuggestedMinimumHeight();
    }

    protected void dispatchDraw(Canvas canvas) {
        if (isSelected() && this.this$0.Dc != null) {
            this.this$0.Dc.mo3373b(canvas, (View) this, null);
        }
        if (this.this$0.Kc != null && Color.alpha(this.this$0.Kc.getColor()) > 0) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null && viewGroup.indexOfChild(this) < viewGroup.getChildCount() - 1) {
                float max = Math.max(1.0f, this.this$0.Kc.getStrokeWidth());
                int height = getHeight();
                canvas.drawLine(0.0f, ((float) height) - max, (float) getWidth(), ((float) height) - max, this.this$0.Kc);
            }
        }
        super.dispatchDraw(canvas);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), getSuggestedMinimumHeight());
    }
}
