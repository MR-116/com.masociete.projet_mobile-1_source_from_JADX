package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer.AbstractRepetitionView;
import fr.pcsoft.wdjava.ui.utils.C1299d;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.j */
class C1300j extends C1299d {
    final WDZoneRepetee this$0;

    C1300j(WDZoneRepetee wDZoneRepetee, Context context) {
        this.this$0 = wDZoneRepetee;
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.this$0.m1505a(motionEvent) ? true : super.dispatchTouchEvent(motionEvent);
    }

    public void draw(Canvas canvas) {
        int selectedItemPosition;
        if (this.this$0.isAvecRupture() && !isInTouchMode()) {
            selectedItemPosition = getSelectedItemPosition() - getFirstVisiblePosition();
            if (selectedItemPosition >= 0 && selectedItemPosition < getChildCount()) {
                AbstractRepetitionView abstractRepetitionView = (AbstractRepetitionView) getChildAt(selectedItemPosition);
                if (abstractRepetitionView != null) {
                    Drawable selector = this.this$0.fe.getSelector();
                    if (selector != null && (selector instanceof yb)) {
                        ((yb) selector).m9275a(abstractRepetitionView);
                    }
                }
            }
        }
        this.this$0.Vd.mo3559h();
        if (this.this$0.ld) {
            selectedItemPosition = this.this$0.getLastVisibleElement();
            if (selectedItemPosition < 0 || selectedItemPosition + 1 >= getCount()) {
                this.this$0.Vd.m8979c(canvas, getWidth(), getHeight());
            }
        }
        super.draw(canvas);
    }

    public int getMaxScrollAmount() {
        return Integer.MAX_VALUE;
    }
}
