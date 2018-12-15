package fr.pcsoft.wdjava.ui.champs.zml;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import java.util.Iterator;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zml.b */
class C1284b extends LinearLayout {
    final WDZoneMultiligne this$0;

    C1284b(WDZoneMultiligne wDZoneMultiligne, Context context) {
        this.this$0 = wDZoneMultiligne;
        super(context);
    }

    protected void dispatchDraw(Canvas canvas) {
        if (this.this$0.Fc != null) {
            if (this.this$0.Fc.mo3379k()) {
                if (this.this$0.Lc == null) {
                    this.this$0.Lc = new Path();
                } else {
                    this.this$0.Lc.reset();
                }
                this.this$0.Fc.mo3373b(canvas, (View) this, this.this$0.Lc);
                canvas.clipPath(this.this$0.Lc);
            } else {
                this.this$0.Fc.mo3373b(canvas, (View) this, null);
            }
        }
        super.dispatchDraw(canvas);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.this$0.Fc != null && this.this$0.Fc.mo3379k() && !kb.m3965a(C0657a.JELLY_BEAN_MR2) && isHardwareAccelerated()) {
            C1014a.m7327b().mo3294c(this);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0 && this.this$0.Nc != null && !this.this$0.Nc.isEmpty()) {
            Rect rect = new Rect();
            Iterator it = this.this$0.Nc.iterator();
            int i = 0;
            while (it.hasNext()) {
                C1286d ui = ((C0531g) it.next()).getUI();
                if (ui.getVisibility() == 0) {
                    ui.getHitRect(rect);
                    if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.this$0.Hc = i;
                        break;
                    }
                }
                i++;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
