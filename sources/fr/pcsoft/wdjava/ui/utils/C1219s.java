package fr.pcsoft.wdjava.ui.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import fr.pcsoft.wdjava.ui.p064a.C1034d;

/* renamed from: fr.pcsoft.wdjava.ui.utils.s */
public class C1219s extends Paint {
    /* renamed from: a */
    private RectF f3645a = new RectF();

    public C1219s() {
        setColor(C1034d.f2969b);
        setAlpha(80);
        setStyle(Style.FILL);
    }

    /* renamed from: a */
    public final void m8603a(Canvas canvas, int i, int i2, int i3, int i4) {
        if (i + i3 <= canvas.getWidth() && i2 + i4 <= canvas.getHeight()) {
            this.f3645a.set((float) i, (float) i2, (float) (i + i3), (float) (i2 + i4));
            float f = (float) C1511l.f4645s;
            canvas.drawRoundRect(this.f3645a, f, f, this);
        }
    }
}
