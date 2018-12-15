package fr.pcsoft.wdjava.ui.cadre;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import fr.pcsoft.wdjava.ui.style.degrade.IWDDegrade;
import fr.pcsoft.wdjava.ui.utils.C1511l;

/* renamed from: fr.pcsoft.wdjava.ui.cadre.b */
public abstract class C1112b extends C1111a {
    /* renamed from: j */
    protected Paint f3402j = null;
    /* renamed from: k */
    protected IWDDegrade f3403k = null;
    /* renamed from: l */
    protected int f3404l = 0;

    public C1112b(int i) {
        this.f3404l = i;
        mo3392p();
    }

    public C1112b(IWDDegrade iWDDegrade) {
        this.f3403k = iWDDegrade;
        mo3392p();
    }

    /* renamed from: a */
    public void mo3381a(int i) {
        if (mo3391o()) {
            this.f3402j.setStrokeWidth((float) i);
        }
    }

    /* renamed from: a */
    public void m8115a(IWDDegrade iWDDegrade) {
        this.f3403k = iWDDegrade;
    }

    /* renamed from: b */
    public int mo3382b() {
        return mo3391o() ? (int) this.f3402j.getStrokeWidth() : 0;
    }

    /* renamed from: b */
    public void mo3383b(Canvas canvas, int i, int i2, int i3, int i4, Path path) {
        Object obj = 1;
        int i5 = i + i3;
        int i6 = i2 + i4;
        if (this.f3403k != null) {
            this.f3402j.setAlpha(this.h);
            this.f3402j.setShader(this.f3403k.mo3806a(i3, i4));
        } else if (this.f3404l != 0) {
            this.f3402j.setShader(null);
            this.f3402j.setColor(this.f3404l);
            this.f3402j.setAlpha(this.h);
        } else {
            obj = null;
        }
        if (obj != null) {
            this.f3402j.setStyle(Style.FILL);
            canvas.drawRect((float) i, (float) i2, (float) i5, (float) i6, this.f3402j);
        }
        if (this.f3403k != null) {
            this.f3402j.setShader(null);
        }
        if (path != null) {
            path.addRect((float) i, (float) i2, (float) i5, (float) i6, Direction.CW);
        }
    }

    /* renamed from: c */
    public void mo3384c(int i) {
        if (mo3391o()) {
            float strokeWidth = this.f3402j.getStrokeWidth();
            switch (i) {
                case 1:
                    this.f3402j.setPathEffect(null);
                    return;
                case 2:
                    this.f3402j.setPathEffect(new DashPathEffect(new float[]{3.0f * strokeWidth, strokeWidth}, 0.0f));
                    return;
                case 3:
                    this.f3402j.setPathEffect(new DashPathEffect(new float[]{strokeWidth, strokeWidth}, 0.0f));
                    return;
                case 4:
                    this.f3402j.setPathEffect(new DashPathEffect(new float[]{3.0f * strokeWidth, strokeWidth, strokeWidth, strokeWidth}, 0.0f));
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: d */
    public void mo3385d(int i) {
        this.f3404l = i;
        this.f3403k = null;
    }

    /* renamed from: e */
    public C1110m mo3375e() {
        IWDDegrade iWDDegrade = null;
        C1112b c1112b = (C1112b) super.mo3375e();
        c1112b.f3402j = this.f3402j != null ? new Paint(this.f3402j) : null;
        if (this.f3403k != null) {
            iWDDegrade = this.f3403k.mo3811d();
        }
        c1112b.f3403k = iWDDegrade;
        return c1112b;
    }

    /* renamed from: h */
    public void mo3386h() {
        this.f3402j = null;
        if (this.f3403k != null) {
            this.f3403k.mo3810c();
            this.f3403k = null;
        }
    }

    /* renamed from: l */
    public int mo3387l() {
        return this.f3403k != null ? this.f3403k.mo3809b() : this.f3404l;
    }

    /* renamed from: n */
    public IWDDegrade m8123n() {
        return this.f3403k;
    }

    /* renamed from: o */
    protected boolean mo3391o() {
        return true;
    }

    /* renamed from: p */
    protected void mo3392p() {
        this.f3402j = new Paint();
        if (mo3391o()) {
            this.f3402j.setStrokeCap(Cap.BUTT);
            this.f3402j.setStrokeJoin(Join.MITER);
            this.f3402j.setStrokeMiter((float) C1511l.f4632f);
            this.f3402j.setStrokeWidth((float) C1511l.f4632f);
        }
    }
}
