package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.GridView;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.a */
class C1288a extends GridView {
    final WDZoneRepetee this$0;

    C1288a(WDZoneRepetee wDZoneRepetee, Context context) {
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
}
