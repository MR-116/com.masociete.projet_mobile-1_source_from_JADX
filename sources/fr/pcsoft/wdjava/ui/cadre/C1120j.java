package fr.pcsoft.wdjava.ui.cadre;

import android.graphics.Canvas;
import android.graphics.Paint.Style;
import fr.pcsoft.wdjava.ui.style.degrade.IWDDegrade;

/* renamed from: fr.pcsoft.wdjava.ui.cadre.j */
public class C1120j extends C1112b {
    /* renamed from: m */
    private int f3422m = 1;
    /* renamed from: n */
    protected int f3423n = 0;

    public C1120j(int i, int i2) {
        super(i2);
        this.f3423n = i;
    }

    public C1120j(int i, IWDDegrade iWDDegrade) {
        super(iWDDegrade);
        this.f3423n = i;
    }

    /* renamed from: a */
    public void mo3388a(Canvas canvas, int i, int i2, int i3, int i4) {
        if (this.f3423n != 0) {
            this.j.setStyle(Style.STROKE);
            this.j.setColor(this.f3423n);
            this.j.setAlpha(this.h);
            canvas.drawLine(0.0f, (float) i2, (float) (i + i3), (float) i2, this.j);
        }
    }

    /* renamed from: c */
    public void mo3384c(int i) {
        if (i != this.f3422m) {
            this.f3422m = i;
            super.mo3384c(this.f3422m);
        }
    }

    /* renamed from: d */
    public int mo3389d() {
        return this.f3422m;
    }

    /* renamed from: i */
    public int mo3390i() {
        return this.f3423n;
    }
}
