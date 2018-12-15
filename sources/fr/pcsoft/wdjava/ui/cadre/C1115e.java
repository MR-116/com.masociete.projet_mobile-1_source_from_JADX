package fr.pcsoft.wdjava.ui.cadre;

import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import fr.pcsoft.wdjava.ui.style.degrade.IWDDegrade;

/* renamed from: fr.pcsoft.wdjava.ui.cadre.e */
public class C1115e extends C1112b {
    /* renamed from: m */
    private int f3416m = 1;
    /* renamed from: n */
    protected int f3417n = 0;

    public C1115e(int i, int i2) {
        super(i2);
        this.f3417n = i;
    }

    public C1115e(int i, IWDDegrade iWDDegrade) {
        super(iWDDegrade);
        this.f3417n = i;
    }

    /* renamed from: a */
    public void mo3388a(Canvas canvas, int i, int i2, int i3, int i4) {
        if (this.f3417n != 0 && this.j.getStrokeWidth() > 0.0f) {
            this.j.setStyle(Style.STROKE);
            this.j.setColor(this.f3417n);
            this.j.setAlpha(this.h);
            canvas.drawCircle(((float) i) + (((float) i3) / 2.0f), ((float) i2) + (((float) i4) / 2.0f), Math.min(((float) i3) / 2.0f, ((float) i4) / 2.0f) - (this.j.getStrokeWidth() / 2.0f), this.j);
        }
    }

    /* renamed from: b */
    public void mo3383b(Canvas canvas, int i, int i2, int i3, int i4, Path path) {
        Object obj = 1;
        float f = (((float) i3) / 2.0f) + ((float) i);
        float f2 = (((float) i4) / 2.0f) + ((float) i2);
        float min = Math.min(((float) i3) / 2.0f, ((float) i4) / 2.0f);
        if (this.k != null) {
            this.j.setShader(this.k.mo3806a(i3, i4));
        } else if (this.l != 0) {
            this.j.setShader(null);
            this.j.setColor(this.l);
            this.j.setAlpha(this.h);
        } else {
            obj = null;
        }
        if (obj != null) {
            this.j.setStyle(Style.FILL);
            canvas.drawCircle(f, f2, min, this.j);
        }
        if (this.k != null) {
            this.j.setShader(null);
        }
        if (path != null) {
            path.addCircle(f, f2, min, Direction.CW);
        }
    }

    /* renamed from: c */
    public void mo3384c(int i) {
        if (i != this.f3416m) {
            this.f3416m = i;
            super.mo3384c(this.f3416m);
        }
    }

    /* renamed from: d */
    public int mo3389d() {
        return this.f3416m;
    }

    /* renamed from: e */
    public C1110m mo3375e() {
        return (C1115e) super.mo3375e();
    }

    /* renamed from: h */
    public void mo3386h() {
        super.mo3386h();
    }

    /* renamed from: i */
    public int mo3390i() {
        return this.f3417n;
    }

    /* renamed from: k */
    public boolean mo3379k() {
        return true;
    }

    /* renamed from: p */
    protected void mo3392p() {
        super.mo3392p();
        this.j.setAntiAlias(true);
    }
}
