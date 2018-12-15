package fr.pcsoft.wdjava.ui.cadre;

import android.graphics.Canvas;
import android.graphics.Paint.Style;
import fr.pcsoft.wdjava.ui.style.degrade.IWDDegrade;

/* renamed from: fr.pcsoft.wdjava.ui.cadre.i */
public class C1119i extends C1112b {
    /* renamed from: m */
    protected int f3420m = 0;
    /* renamed from: n */
    private int f3421n = 1;

    public C1119i(int i, int i2) {
        super(i2);
        this.f3420m = i;
    }

    public C1119i(int i, IWDDegrade iWDDegrade) {
        super(iWDDegrade);
        this.f3420m = i;
    }

    /* renamed from: a */
    public void mo3388a(Canvas canvas, int i, int i2, int i3, int i4) {
        if (this.f3420m != 0) {
            this.j.setStyle(Style.STROKE);
            this.j.setColor(this.f3420m);
            this.j.setAlpha(this.h);
            int ceil = (i2 + i4) - ((int) Math.ceil(((double) this.j.getStrokeWidth()) / 2.0d));
            canvas.drawLine(0.0f, (float) ceil, (float) (i + i3), (float) ceil, this.j);
        }
    }

    /* renamed from: c */
    public void mo3384c(int i) {
        if (i != this.f3421n) {
            this.f3421n = i;
            super.mo3384c(this.f3421n);
        }
    }

    /* renamed from: d */
    public int mo3389d() {
        return this.f3421n;
    }

    /* renamed from: i */
    public int mo3390i() {
        return this.f3420m;
    }
}
