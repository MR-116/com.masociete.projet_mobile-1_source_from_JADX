package fr.pcsoft.wdjava.ui.cadre;

import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import fr.pcsoft.wdjava.ui.style.degrade.IWDDegrade;

/* renamed from: fr.pcsoft.wdjava.ui.cadre.d */
public class C1114d extends C1112b {
    /* renamed from: m */
    private RectF f3409m = new RectF();
    /* renamed from: n */
    private int f3410n = 0;
    /* renamed from: o */
    private int f3411o = 0;
    /* renamed from: p */
    private boolean f3412p = true;
    /* renamed from: q */
    private boolean f3413q;
    /* renamed from: r */
    protected int f3414r = 0;
    /* renamed from: s */
    private int f3415s = 1;

    public C1114d(int i, int i2, int i3, int i4, boolean z) {
        super(i2);
        this.f3414r = i;
        this.f3411o = i3 / 2;
        this.f3410n = i4 / 2;
        this.f3413q = z;
    }

    public C1114d(int i, IWDDegrade iWDDegrade, int i2, int i3, boolean z) {
        super(iWDDegrade);
        this.f3414r = i;
        this.f3411o = i2 / 2;
        this.f3410n = i3 / 2;
        this.f3413q = z;
    }

    /* renamed from: a */
    public void mo3388a(Canvas canvas, int i, int i2, int i3, int i4) {
        if (this.f3414r != 0) {
            this.j.setStyle(Style.STROKE);
            this.j.setColor(this.f3414r);
            this.j.setAlpha(this.h);
            float strokeWidth = this.j.getStrokeWidth();
            this.f3409m.set((float) (((int) Math.floor(((double) strokeWidth) / 2.0d)) + i), (float) (((int) Math.floor(((double) strokeWidth) / 2.0d)) + i2), (float) ((i + i3) - ((int) Math.ceil(((double) strokeWidth) / 2.0d))), (float) ((i2 + i4) - ((int) Math.ceil(((double) strokeWidth) / 2.0d))));
            int i5 = this.f3411o;
            int i6 = this.f3410n;
            if (this.f3412p) {
                i5 = (int) Math.min((float) this.f3411o, this.f3409m.width() / 2.0f);
                i6 = (int) Math.min((float) this.f3410n, this.f3409m.height() / 2.0f);
            }
            canvas.drawRoundRect(this.f3409m, (float) i5, (float) i6, this.j);
        }
    }

    /* renamed from: a */
    public final void m8145a(boolean z) {
        this.f3412p = z;
    }

    /* renamed from: b */
    public void mo3383b(Canvas canvas, int i, int i2, int i3, int i4, Path path) {
        Object obj = 1;
        if (this.f3413q) {
            this.f3409m.set((float) i, (float) i2, (float) (i + i3), (float) (i2 + i4));
            int i5 = this.f3411o;
            int i6 = this.f3410n;
            if (this.f3412p) {
                i5 = (int) Math.min((float) this.f3411o, this.f3409m.width() / 2.0f);
                i6 = (int) Math.min((float) this.f3410n, this.f3409m.height() / 2.0f);
            }
            this.j.setAlpha(this.h);
            if (this.k != null) {
                this.j.setShader(this.k.mo3806a(i3, i4));
            } else if (this.l != 0) {
                this.j.setShader(null);
                this.j.setColor(this.l);
            } else {
                obj = null;
            }
            if (obj != null) {
                this.j.setStyle(Style.FILL);
                canvas.drawRoundRect(this.f3409m, (float) i5, (float) i6, this.j);
            }
            if (this.k != null) {
                this.j.setShader(null);
            }
            if (path != null) {
                path.addRoundRect(this.f3409m, (float) i5, (float) i6, Direction.CW);
                return;
            }
            return;
        }
        super.mo3383b(canvas, i, i2, i3, i4, path);
    }

    /* renamed from: c */
    public void mo3384c(int i) {
        if (i != this.f3415s) {
            this.f3415s = i;
            super.mo3384c(this.f3415s);
        }
    }

    /* renamed from: d */
    public int mo3389d() {
        return this.f3415s;
    }

    /* renamed from: e */
    public C1110m mo3375e() {
        C1114d c1114d = (C1114d) super.mo3375e();
        c1114d.f3409m = this.f3409m != null ? new RectF(this.f3409m) : null;
        return c1114d;
    }

    /* renamed from: h */
    public void mo3386h() {
        super.mo3386h();
        this.f3409m = null;
    }

    /* renamed from: i */
    public int mo3390i() {
        return this.f3414r;
    }

    /* renamed from: k */
    public boolean mo3379k() {
        return this.f3413q;
    }

    /* renamed from: p */
    protected void mo3392p() {
        super.mo3392p();
        this.j.setAntiAlias(true);
    }
}
