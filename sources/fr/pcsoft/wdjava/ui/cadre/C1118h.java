package fr.pcsoft.wdjava.ui.cadre;

import android.graphics.Canvas;
import android.graphics.Paint.Style;
import fr.pcsoft.wdjava.ui.style.degrade.IWDDegrade;

/* renamed from: fr.pcsoft.wdjava.ui.cadre.h */
public class C1118h extends C1117g {
    public C1118h(int i, int i2) {
        super(i, i2);
    }

    public C1118h(int i, IWDDegrade iWDDegrade) {
        super(i, iWDDegrade);
    }

    /* renamed from: a */
    public void mo3388a(Canvas canvas, int i, int i2, int i3, int i4) {
        if (this.n != 0) {
            this.j.setStyle(Style.STROKE);
            this.j.setColor(this.n);
            this.j.setAlpha(this.h);
            float strokeWidth = this.j.getStrokeWidth();
            int ceil = (i2 + i4) - ((int) Math.ceil(((double) strokeWidth) / 2.0d));
            canvas.drawLine((float) i, (float) ceil, (float) (i + i3), (float) ceil, this.j);
            ceil = (i + i3) - ((int) Math.ceil(((double) strokeWidth) / 2.0d));
            canvas.drawLine((float) ceil, (float) i2, (float) ceil, (float) (i2 + i4), this.j);
        }
    }
}
