package fr.pcsoft.wdjava.ui.cadre;

import android.graphics.Canvas;
import android.graphics.Paint.Style;
import fr.pcsoft.wdjava.ui.style.degrade.IWDDegrade;

/* renamed from: fr.pcsoft.wdjava.ui.cadre.g */
public class C1117g extends C1112b {
    /* renamed from: m */
    private int f3418m = 1;
    /* renamed from: n */
    protected int f3419n = 0;

    public C1117g(int i, int i2) {
        super(i2);
        this.f3419n = i;
    }

    public C1117g(int i, IWDDegrade iWDDegrade) {
        super(iWDDegrade);
        this.f3419n = i;
    }

    /* renamed from: a */
    public void mo3388a(Canvas canvas, int i, int i2, int i3, int i4) {
        if (this.f3419n != 0) {
            this.j.setStyle(Style.STROKE);
            this.j.setColor(this.f3419n);
            this.j.setAlpha(this.h);
            float strokeWidth = this.j.getStrokeWidth();
            canvas.drawRect((float) (((int) Math.floor(((double) strokeWidth) / 2.0d)) + i), (float) (((int) Math.floor(((double) strokeWidth) / 2.0d)) + i2), (float) ((i + i3) - ((int) Math.ceil(((double) strokeWidth) / 2.0d))), (float) ((i2 + i4) - ((int) Math.ceil(((double) strokeWidth) / 2.0d))), this.j);
        }
    }

    /* renamed from: c */
    public void mo3384c(int i) {
        if (i != this.f3418m) {
            this.f3418m = i;
            super.mo3384c(this.f3418m);
        }
    }

    /* renamed from: d */
    public int mo3389d() {
        return this.f3418m;
    }

    /* renamed from: i */
    public int mo3390i() {
        return this.f3419n;
    }
}
