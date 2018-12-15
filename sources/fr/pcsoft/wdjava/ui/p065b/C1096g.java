package fr.pcsoft.wdjava.ui.p065b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import fr.pcsoft.wdjava.ui.p064a.C1034d;
import fr.pcsoft.wdjava.ui.utils.C1511l;

/* renamed from: fr.pcsoft.wdjava.ui.b.g */
class C1096g extends ProgressBar {
    /* renamed from: a */
    private RectF f3322a;
    /* renamed from: b */
    private Paint f3323b = new Paint();
    final C1097h this$0;

    C1096g(C1097h c1097h, Context context, AttributeSet attributeSet, int i) {
        this.this$0 = c1097h;
        super(context, attributeSet, i);
        this.f3323b.setColor(C1034d.f2969b);
        this.f3323b.setAlpha(80);
        this.f3323b.setStyle(Style.FILL);
        this.f3322a = new RectF();
    }

    protected synchronized void onDraw(Canvas canvas) {
        this.f3322a.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        float f = (float) C1511l.f4645s;
        canvas.drawRoundRect(this.f3322a, f, f, this.f3323b);
        super.onDraw(canvas);
    }
}
