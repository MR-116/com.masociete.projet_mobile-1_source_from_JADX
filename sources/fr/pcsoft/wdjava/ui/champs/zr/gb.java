package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.GridView;

class gb extends GridView {
    final WDZoneRepetee this$0;

    gb(WDZoneRepetee wDZoneRepetee, Context context) {
        this.this$0 = wDZoneRepetee;
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.this$0.m1505a(motionEvent) ? true : super.dispatchTouchEvent(motionEvent);
    }

    public void draw(Canvas canvas) {
        this.this$0.Vd.mo3559h();
        super.draw(canvas);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure((this.this$0.kd * this.this$0.getNbElement()) + 1073741824, i2);
    }
}
