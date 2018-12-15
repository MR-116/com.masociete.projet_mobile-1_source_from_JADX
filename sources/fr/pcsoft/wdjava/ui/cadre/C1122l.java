package fr.pcsoft.wdjava.ui.cadre;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import fr.pcsoft.wdjava.ui.style.degrade.IWDDegrade;

/* renamed from: fr.pcsoft.wdjava.ui.cadre.l */
public class C1122l extends C1111a {
    /* renamed from: D */
    private static final RectF f3425D = new RectF();
    /* renamed from: A */
    private int f3426A;
    /* renamed from: B */
    private Shader f3427B;
    /* renamed from: C */
    private int f3428C;
    /* renamed from: E */
    private int f3429E;
    /* renamed from: F */
    private Path f3430F;
    /* renamed from: G */
    private int f3431G;
    /* renamed from: H */
    private Shader f3432H;
    /* renamed from: I */
    private int f3433I;
    /* renamed from: J */
    private int f3434J;
    /* renamed from: K */
    private int f3435K;
    /* renamed from: L */
    private Path f3436L;
    /* renamed from: M */
    private int f3437M;
    /* renamed from: N */
    private int f3438N;
    /* renamed from: O */
    private int f3439O;
    /* renamed from: j */
    protected IWDDegrade f3440j;
    /* renamed from: k */
    private Path f3441k;
    /* renamed from: l */
    private int f3442l;
    /* renamed from: m */
    protected int f3443m;
    /* renamed from: n */
    private int f3444n;
    /* renamed from: o */
    private int f3445o;
    /* renamed from: p */
    private Shader f3446p;
    /* renamed from: q */
    private int f3447q;
    /* renamed from: r */
    private int f3448r;
    /* renamed from: s */
    private int f3449s;
    /* renamed from: t */
    private int f3450t;
    /* renamed from: u */
    private int f3451u;
    /* renamed from: v */
    private Path f3452v;
    /* renamed from: w */
    protected Paint f3453w;
    /* renamed from: x */
    private int f3454x;
    /* renamed from: y */
    private Shader f3455y;
    /* renamed from: z */
    private int f3456z;

    public C1122l(int i, int[] iArr, int[] iArr2) {
        this.f3443m = 0;
        this.f3440j = null;
        this.f3453w = null;
        this.f3426A = 0;
        this.f3431G = 0;
        this.f3450t = 0;
        this.f3435K = 0;
        this.f3429E = -16777216;
        this.f3442l = -16777216;
        this.f3438N = -16777216;
        this.f3433I = -16777216;
        this.f3448r = 0;
        this.f3439O = 0;
        this.f3444n = 0;
        this.f3437M = 0;
        this.f3434J = 0;
        this.f3449s = 0;
        this.f3454x = 0;
        this.f3447q = 0;
        this.f3427B = null;
        this.f3446p = null;
        this.f3455y = null;
        this.f3432H = null;
        this.f3430F = null;
        this.f3436L = null;
        this.f3441k = null;
        this.f3452v = null;
        this.f3445o = 0;
        this.f3451u = 0;
        this.f3456z = -1;
        this.f3428C = -1;
        this.f3443m = i;
        this.f3429E = iArr[0];
        this.f3426A = iArr[1];
        this.f3442l = iArr[3];
        this.f3431G = iArr[4];
        this.f3438N = iArr[6];
        this.f3450t = iArr[7];
        this.f3433I = iArr[9];
        this.f3435K = iArr[10];
        this.f3448r = iArr2[0];
        this.f3439O = iArr2[1];
        this.f3444n = iArr2[2];
        this.f3437M = iArr2[3];
        this.f3454x = iArr2[4];
        this.f3447q = iArr2[5];
        this.f3434J = iArr2[6];
        this.f3449s = iArr2[7];
        m8233q();
    }

    public C1122l(IWDDegrade iWDDegrade, int[] iArr, int[] iArr2) {
        this(iWDDegrade.mo3809b(), iArr, iArr2);
        this.f3440j = iWDDegrade;
    }

    /* renamed from: a */
    private void m8194a(Canvas canvas, Paint paint) {
        m8213a(f3425D);
        canvas.save(2);
        canvas.clipRect(f3425D, Op.INTERSECT);
        if (this.f3433I == this.f3438N) {
            paint.setColor(this.f3433I);
            canvas.drawPath(this.f3441k, paint);
        } else if (this.f3449s <= 0 || this.f3434J <= 0) {
            if (this.f3452v == null) {
                this.f3452v = new Path();
            } else {
                this.f3452v.reset();
            }
            this.f3452v.moveTo(f3425D.left, f3425D.top);
            this.f3452v.lineTo(f3425D.right, f3425D.top);
            this.f3452v.lineTo(f3425D.left, f3425D.bottom);
            this.f3452v.close();
            paint.setColor(this.f3433I);
            canvas.drawPath(this.f3452v, paint);
            this.f3452v.reset();
            this.f3452v.moveTo(f3425D.right, f3425D.top);
            this.f3452v.lineTo(f3425D.right, f3425D.bottom);
            this.f3452v.lineTo(f3425D.left, f3425D.bottom);
            this.f3452v.close();
            paint.setColor(this.f3438N);
            canvas.drawPath(this.f3452v, paint);
        } else {
            if (this.f3432H == null) {
                this.f3432H = new LinearGradient(f3425D.left, f3425D.top, f3425D.right, f3425D.top, new int[]{this.f3433I, this.f3438N}, null, TileMode.CLAMP);
            }
            paint.setShader(this.f3432H);
            canvas.drawPath(this.f3441k, paint);
        }
        if (this.f3432H != null) {
            paint.setShader(this.f3432H);
        }
        canvas.restore();
    }

    /* renamed from: b */
    private void m8195b(int i, int i2, int i3, int i4) {
        this.f3445o = i;
        this.f3451u = i2;
        this.f3456z = i3;
        this.f3428C = i4;
        this.f3430F.reset();
        this.f3436L.reset();
        this.f3441k.reset();
        m8209w();
        m8207u();
        m8204o();
        m8210x();
        m8203n();
        m8206t();
        m8208v();
        m8205r();
        this.f3441k.addPath(this.f3430F);
        this.f3441k.addPath(this.f3436L);
        this.f3441k.setFillType(FillType.EVEN_ODD);
    }

    /* renamed from: b */
    private void m8196b(Canvas canvas, Paint paint) {
        m8218b(f3425D);
        canvas.save(2);
        canvas.clipRect(f3425D, Op.INTERSECT);
        if (this.f3433I == this.f3429E) {
            paint.setColor(this.f3429E);
            canvas.drawPath(this.f3441k, paint);
        } else if (this.f3439O <= 0 || this.f3448r <= 0) {
            if (this.f3452v == null) {
                this.f3452v = new Path();
            } else {
                this.f3452v.reset();
            }
            this.f3452v.moveTo(f3425D.left, f3425D.top);
            this.f3452v.lineTo(f3425D.right, f3425D.top);
            this.f3452v.lineTo(f3425D.right, f3425D.bottom);
            this.f3452v.close();
            paint.setColor(this.f3429E);
            canvas.drawPath(this.f3452v, paint);
            this.f3452v.reset();
            this.f3452v.moveTo(f3425D.left, f3425D.top);
            this.f3452v.lineTo(f3425D.left, f3425D.bottom);
            this.f3452v.lineTo(f3425D.right, f3425D.bottom);
            this.f3452v.close();
            paint.setColor(this.f3433I);
            canvas.drawPath(this.f3452v, paint);
        } else {
            if (this.f3455y == null) {
                this.f3455y = new LinearGradient(f3425D.left, f3425D.top, f3425D.right, f3425D.top, new int[]{this.f3433I, this.f3429E}, null, TileMode.CLAMP);
            }
            paint.setShader(this.f3455y);
            canvas.drawPath(this.f3441k, paint);
        }
        if (this.f3455y != null) {
            paint.setShader(null);
        }
        canvas.restore();
    }

    /* renamed from: c */
    private void m8197c(Canvas canvas, Paint paint) {
        m8226f(f3425D);
        paint.setColor(this.f3442l);
        canvas.save(2);
        canvas.clipRect(f3425D, Op.INTERSECT);
        canvas.drawPath(this.f3441k, paint);
        canvas.restore();
    }

    /* renamed from: d */
    private void m8198d(Canvas canvas, Paint paint) {
        m8223d(f3425D);
        paint.setColor(this.f3429E);
        canvas.save(2);
        canvas.clipRect(f3425D, Op.INTERSECT);
        canvas.drawPath(this.f3441k, paint);
        canvas.restore();
    }

    /* renamed from: e */
    private void m8199e(Canvas canvas, Paint paint) {
        m8229h(f3425D);
        paint.setColor(this.f3433I);
        canvas.save(2);
        canvas.clipRect(f3425D, Op.INTERSECT);
        canvas.drawPath(this.f3441k, paint);
        canvas.restore();
    }

    /* renamed from: f */
    private void m8200f(Canvas canvas, Paint paint) {
        m8220c(f3425D);
        canvas.save(2);
        canvas.clipRect(f3425D, Op.INTERSECT);
        if (this.f3429E == this.f3442l) {
            paint.setColor(this.f3442l);
            canvas.drawPath(this.f3441k, paint);
        } else if (this.f3444n <= 0 || this.f3437M <= 0) {
            if (this.f3452v == null) {
                this.f3452v = new Path();
            } else {
                this.f3452v.reset();
            }
            this.f3452v.moveTo(f3425D.left, f3425D.top);
            this.f3452v.lineTo(f3425D.left, f3425D.bottom);
            this.f3452v.lineTo(f3425D.right, f3425D.top);
            this.f3452v.close();
            paint.setColor(this.f3429E);
            canvas.drawPath(this.f3452v, paint);
            this.f3452v.reset();
            this.f3452v.moveTo(f3425D.right, f3425D.top);
            this.f3452v.lineTo(f3425D.right, f3425D.bottom);
            this.f3452v.lineTo(f3425D.left, f3425D.bottom);
            this.f3452v.close();
            paint.setColor(this.f3442l);
            canvas.drawPath(this.f3452v, paint);
        } else {
            if (this.f3427B == null) {
                this.f3427B = new LinearGradient(f3425D.left, f3425D.top, f3425D.right, f3425D.top, new int[]{this.f3429E, this.f3442l}, null, TileMode.CLAMP);
            }
            paint.setShader(this.f3427B);
            canvas.drawPath(this.f3441k, paint);
        }
        if (this.f3427B != null) {
            paint.setShader(null);
        }
        canvas.restore();
    }

    /* renamed from: g */
    private void m8201g(Canvas canvas, Paint paint) {
        m8227g(f3425D);
        canvas.save(2);
        canvas.clipRect(f3425D, Op.INTERSECT);
        if (this.f3442l == this.f3438N) {
            paint.setColor(this.f3438N);
            canvas.drawPath(this.f3441k, paint);
        } else if (this.f3447q <= 0 || this.f3454x <= 0) {
            if (this.f3452v == null) {
                this.f3452v = new Path();
            } else {
                this.f3452v.reset();
            }
            this.f3452v.moveTo(f3425D.left, f3425D.top);
            this.f3452v.lineTo(f3425D.right, f3425D.top);
            this.f3452v.lineTo(f3425D.right, f3425D.bottom);
            this.f3452v.close();
            paint.setColor(this.f3442l);
            canvas.drawPath(this.f3452v, paint);
            this.f3452v.reset();
            this.f3452v.moveTo(f3425D.left, f3425D.top);
            this.f3452v.lineTo(f3425D.left, f3425D.bottom);
            this.f3452v.lineTo(f3425D.right, f3425D.bottom);
            this.f3452v.close();
            paint.setColor(this.f3438N);
            canvas.drawPath(this.f3452v, paint);
        } else {
            if (this.f3446p == null) {
                this.f3446p = new LinearGradient(f3425D.left, f3425D.top, f3425D.left, f3425D.top, new int[]{this.f3438N, this.f3442l}, null, TileMode.CLAMP);
            }
            paint.setShader(this.f3446p);
            canvas.drawPath(this.f3441k, paint);
        }
        if (this.f3446p != null) {
            paint.setShader(null);
        }
        canvas.restore();
    }

    /* renamed from: h */
    private void m8202h(Canvas canvas, Paint paint) {
        m8225e(f3425D);
        paint.setColor(this.f3438N);
        canvas.save(2);
        canvas.clipRect(f3425D, Op.INTERSECT);
        canvas.drawPath(this.f3441k, paint);
        canvas.restore();
    }

    /* renamed from: n */
    private void m8203n() {
        m8227g(f3425D);
        int i = (int) f3425D.left;
        int i2 = (int) f3425D.top;
        int width = (int) f3425D.width();
        int height = (int) f3425D.height();
        if (f3425D.width() > 0.0f && f3425D.height() > 0.0f) {
            if (this.f3447q <= 0 || this.f3454x <= 0) {
                this.f3430F.lineTo(f3425D.right, f3425D.bottom);
                this.f3430F.lineTo(f3425D.left, f3425D.bottom);
                return;
            }
            f3425D.set((float) (i - width), (float) (i2 - height), (float) (i + width), (float) (i2 + height));
            this.f3430F.arcTo(f3425D, 0.0f, 90.0f, false);
            width -= this.f3431G;
            height -= this.f3450t;
            if (width > 0 && height > 0) {
                f3425D.set((float) (i - width), (float) (i2 - height), (float) (i + width), (float) (i2 + height));
                this.f3436L.arcTo(f3425D, 0.0f, 90.0f, false);
            }
        }
    }

    /* renamed from: o */
    private void m8204o() {
        m8220c(f3425D);
        int i = (int) f3425D.left;
        int i2 = (int) f3425D.top;
        int width = (int) f3425D.width();
        int height = (int) f3425D.height();
        if (f3425D.width() > 0.0f && f3425D.height() > 0.0f) {
            if (this.f3437M <= 0 || this.f3444n <= 0) {
                this.f3430F.lineTo(f3425D.right, f3425D.top);
                this.f3430F.lineTo(f3425D.right, f3425D.bottom);
                return;
            }
            f3425D.set((float) (i - width), (float) i2, (float) (i + width), (float) ((height * 2) + i2));
            this.f3430F.arcTo(f3425D, 270.0f, 90.0f, false);
            width -= this.f3431G;
            height -= this.f3426A;
            if (width > 0 && height > 0) {
                i2 += this.f3426A;
                f3425D.set((float) (i - width), (float) i2, (float) (i + width), (float) (i2 + (height * 2)));
                this.f3436L.arcTo(f3425D, 270.0f, 90.0f);
            }
        }
    }

    /* renamed from: r */
    private void m8205r() {
        m8229h(f3425D);
        this.f3430F.lineTo(f3425D.left, f3425D.top);
        this.f3436L.lineTo(f3425D.left + ((float) this.f3435K), f3425D.top);
    }

    /* renamed from: t */
    private void m8206t() {
        m8225e(f3425D);
        this.f3430F.lineTo(f3425D.left, f3425D.bottom);
        this.f3436L.lineTo(f3425D.left, f3425D.bottom - ((float) this.f3450t));
    }

    /* renamed from: u */
    private void m8207u() {
        m8223d(f3425D);
        this.f3430F.lineTo(f3425D.right, f3425D.top);
        this.f3436L.lineTo(f3425D.right, f3425D.top + ((float) this.f3426A));
    }

    /* renamed from: v */
    private void m8208v() {
        m8213a(f3425D);
        int i = (int) f3425D.left;
        int i2 = (int) f3425D.top;
        int width = (int) f3425D.width();
        int height = (int) f3425D.height();
        if (f3425D.width() > 0.0f && f3425D.height() > 0.0f) {
            if (this.f3434J <= 0 || this.f3449s <= 0) {
                this.f3430F.lineTo(f3425D.left, f3425D.bottom);
                this.f3430F.lineTo(f3425D.left, f3425D.top);
                return;
            }
            f3425D.set((float) i, (float) (i2 - height), (float) ((width * 2) + i), (float) (i2 + height));
            this.f3430F.arcTo(f3425D, 90.0f, 90.0f, false);
            width -= this.f3435K;
            height -= this.f3450t;
            if (width > 0 && height > 0) {
                f3425D.set((float) (this.f3435K + i), (float) (i2 - height), (float) (i + (width * 2)), (float) (i2 + height));
                this.f3436L.arcTo(f3425D, 90.0f, 90.0f, false);
            }
        }
    }

    /* renamed from: w */
    private void m8209w() {
        m8218b(f3425D);
        int i = (int) f3425D.left;
        int i2 = (int) f3425D.top;
        int width = (int) f3425D.width();
        int height = (int) f3425D.height();
        this.f3430F.moveTo(f3425D.left, f3425D.bottom);
        this.f3436L.moveTo(f3425D.left + ((float) this.f3435K), f3425D.bottom);
        if (f3425D.width() > 0.0f && f3425D.height() > 0.0f) {
            if (this.f3448r <= 0 || this.f3439O <= 0) {
                this.f3430F.lineTo(f3425D.left, f3425D.top);
                this.f3430F.lineTo(f3425D.right, f3425D.top);
                return;
            }
            f3425D.set((float) i, (float) i2, (float) ((width * 2) + i), (float) ((height * 2) + i2));
            this.f3430F.arcTo(f3425D, 180.0f, 90.0f, false);
            width -= this.f3435K;
            height -= this.f3426A;
            if (width > 0 && height > 0) {
                i += this.f3435K;
                i2 += this.f3426A;
                f3425D.set((float) i, (float) i2, (float) (i + (width * 2)), (float) (i2 + (height * 2)));
                this.f3436L.arcTo(f3425D, 180.0f, 90.0f);
            }
        }
    }

    /* renamed from: x */
    private void m8210x() {
        m8226f(f3425D);
        this.f3430F.lineTo(f3425D.right, f3425D.bottom);
        this.f3436L.lineTo(f3425D.right - ((float) this.f3431G), f3425D.bottom);
    }

    /* renamed from: a */
    public void mo3381a(int i) {
    }

    /* renamed from: a */
    public void mo3388a(Canvas canvas, int i, int i2, int i3, int i4) {
        if (!(i == this.f3445o && i2 == this.f3451u && i3 == this.f3456z && i4 == this.f3428C)) {
            m8195b(i, i2, i3, i4);
        }
        m8196b(canvas, this.f3453w);
        m8198d(canvas, this.f3453w);
        m8200f(canvas, this.f3453w);
        m8197c(canvas, this.f3453w);
        m8201g(canvas, this.f3453w);
        m8202h(canvas, this.f3453w);
        m8194a(canvas, this.f3453w);
        m8199e(canvas, this.f3453w);
    }

    /* renamed from: a */
    public void m8213a(RectF rectF) {
        rectF.left = (float) this.f3445o;
        rectF.top = (float) ((this.f3428C + this.f3451u) - (this.f3449s > 0 ? this.f3449s : this.f3450t));
        rectF.right = (float) ((this.f3434J > 0 ? this.f3434J : this.f3435K) + this.f3445o);
        rectF.bottom = (float) (this.f3451u + this.f3428C);
    }

    /* renamed from: a */
    public void m8214a(IWDDegrade iWDDegrade) {
        this.f3440j = iWDDegrade;
    }

    /* renamed from: b */
    public int mo3382b() {
        int i = this.f3435K;
        if (this.f3426A > i) {
            i = this.f3426A;
        }
        if (this.f3431G > i) {
            i = this.f3431G;
        }
        return this.f3450t > i ? this.f3450t : i;
    }

    /* renamed from: b */
    public void mo3371b(int i) {
        super.mo3371b(i);
        this.f3453w.setAlpha(i);
    }

    /* renamed from: b */
    public void mo3383b(Canvas canvas, int i, int i2, int i3, int i4, Path path) {
        Object obj = 1;
        if (!(i == this.f3445o && i2 == this.f3451u && i3 == this.f3456z && i4 == this.f3428C)) {
            m8195b(i, i2, i3, i4);
        }
        if (this.f3440j != null) {
            this.f3453w.setShader(this.f3440j.mo3806a(i3, i4));
        } else if (this.f3443m != 0) {
            this.f3453w.setShader(null);
            this.f3453w.setColor(this.f3443m);
        } else {
            obj = null;
        }
        if (obj != null) {
            this.f3453w.setStyle(Style.FILL);
            canvas.drawPath(this.f3430F, this.f3453w);
        }
        if (this.f3440j != null) {
            this.f3453w.setShader(null);
        }
        if (path != null) {
            path.addPath(this.f3430F);
        }
    }

    /* renamed from: b */
    public void m8218b(RectF rectF) {
        rectF.left = (float) this.f3445o;
        rectF.top = (float) this.f3451u;
        rectF.right = ((float) (this.f3448r > 0 ? this.f3448r : this.f3435K)) + rectF.left;
        rectF.bottom = (float) ((this.f3439O > 0 ? this.f3439O : this.f3426A) + this.f3451u);
    }

    /* renamed from: c */
    public void mo3384c(int i) {
        if (m8234s()) {
            float strokeWidth = this.f3453w.getStrokeWidth();
            switch (i) {
                case 1:
                    this.f3453w.setPathEffect(null);
                    return;
                case 2:
                    this.f3453w.setPathEffect(new DashPathEffect(new float[]{3.0f * strokeWidth, strokeWidth}, 0.0f));
                    return;
                case 3:
                    this.f3453w.setPathEffect(new DashPathEffect(new float[]{strokeWidth, strokeWidth}, 0.0f));
                    return;
                case 4:
                    this.f3453w.setPathEffect(new DashPathEffect(new float[]{3.0f * strokeWidth, strokeWidth, strokeWidth, strokeWidth}, 0.0f));
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: c */
    public void m8220c(RectF rectF) {
        rectF.left = (float) ((this.f3456z + this.f3445o) - (this.f3444n > 0 ? this.f3444n : this.f3431G));
        rectF.top = (float) this.f3451u;
        rectF.right = (float) (this.f3445o + this.f3456z);
        rectF.bottom = (float) ((this.f3437M > 0 ? this.f3437M : this.f3426A) + this.f3451u);
    }

    /* renamed from: d */
    public int mo3389d() {
        return 1;
    }

    /* renamed from: d */
    public void mo3385d(int i) {
        this.f3443m = i;
        this.f3440j = null;
    }

    /* renamed from: d */
    public void m8223d(RectF rectF) {
        rectF.left = (float) ((this.f3448r > 0 ? this.f3448r : this.f3435K) + this.f3445o);
        rectF.top = (float) this.f3451u;
        rectF.right = (float) ((this.f3456z - (this.f3444n > 0 ? this.f3444n : this.f3431G)) + this.f3445o);
        rectF.bottom = (float) ((this.f3437M > 0 ? this.f3437M : this.f3426A) + this.f3451u);
    }

    /* renamed from: e */
    public C1110m mo3375e() {
        C1122l c1122l = (C1122l) super.mo3375e();
        c1122l.f3453w = this.f3453w != null ? new Paint(this.f3453w) : null;
        c1122l.f3440j = this.f3440j != null ? this.f3440j.mo3811d() : null;
        c1122l.f3455y = null;
        c1122l.f3432H = null;
        c1122l.f3427B = null;
        c1122l.f3446p = null;
        c1122l.f3441k = null;
        c1122l.f3430F = null;
        c1122l.f3436L = null;
        c1122l.f3445o = 0;
        c1122l.f3451u = 0;
        c1122l.f3456z = -1;
        c1122l.f3428C = -1;
        return c1122l;
    }

    /* renamed from: e */
    public void m8225e(RectF rectF) {
        rectF.left = (float) ((this.f3434J > 0 ? this.f3434J : this.f3435K) + this.f3445o);
        rectF.top = (float) ((this.f3428C + this.f3451u) - (this.f3449s > 0 ? this.f3449s : this.f3450t));
        rectF.right = (float) ((this.f3456z + this.f3445o) - (this.f3454x > 0 ? this.f3454x : this.f3431G));
        rectF.bottom = (float) (this.f3451u + this.f3428C);
    }

    /* renamed from: f */
    public void m8226f(RectF rectF) {
        rectF.left = (float) ((this.f3456z + this.f3445o) - (this.f3444n > 0 ? this.f3444n : this.f3431G));
        rectF.top = (float) ((this.f3437M > 0 ? this.f3437M : this.f3426A) + this.f3451u);
        rectF.right = (float) (this.f3445o + this.f3456z);
        rectF.bottom = (float) ((this.f3428C + this.f3451u) - (this.f3447q > 0 ? this.f3447q : this.f3450t));
    }

    /* renamed from: g */
    public void m8227g(RectF rectF) {
        rectF.left = (float) ((this.f3456z + this.f3445o) - (this.f3454x > 0 ? this.f3454x : this.f3431G));
        rectF.top = (float) ((this.f3428C + this.f3451u) - (this.f3447q > 0 ? this.f3447q : this.f3450t));
        rectF.right = (float) (this.f3445o + this.f3456z);
        rectF.bottom = (float) (this.f3451u + this.f3428C);
    }

    /* renamed from: h */
    public void mo3386h() {
        this.f3453w = null;
        if (this.f3440j != null) {
            this.f3440j.mo3810c();
            this.f3440j = null;
        }
        this.f3427B = null;
        this.f3446p = null;
        this.f3455y = null;
        this.f3432H = null;
        this.f3430F = null;
        this.f3436L = null;
        this.f3441k = null;
    }

    /* renamed from: h */
    public void m8229h(RectF rectF) {
        rectF.left = (float) this.f3445o;
        rectF.top = (float) ((this.f3439O > 0 ? this.f3439O : this.f3426A) + this.f3451u);
        rectF.right = (float) ((this.f3448r > 0 ? this.f3448r : this.f3435K) + this.f3445o);
        rectF.bottom = (float) ((this.f3428C + this.f3451u) - (this.f3449s > 0 ? this.f3449s : this.f3450t));
    }

    /* renamed from: i */
    public int mo3390i() {
        return this.f3429E;
    }

    /* renamed from: l */
    public int mo3387l() {
        return this.f3440j != null ? this.f3440j.mo3809b() : this.f3443m;
    }

    /* renamed from: p */
    public IWDDegrade m8232p() {
        return this.f3440j;
    }

    /* renamed from: q */
    protected void m8233q() {
        this.f3453w = new Paint();
        this.f3453w.setAntiAlias(true);
        this.f3453w.setStyle(Style.FILL);
        this.f3430F = new Path();
        this.f3436L = new Path();
        this.f3441k = new Path();
        if (this.f3448r > 0 || this.f3439O > 0) {
            if (this.f3448r < this.f3435K) {
                this.f3448r = this.f3435K;
            }
            if (this.f3439O < this.f3426A) {
                this.f3439O = this.f3426A;
            }
        }
        if (this.f3444n > 0 || this.f3437M > 0) {
            if (this.f3444n < this.f3431G) {
                this.f3444n = this.f3431G;
            }
            if (this.f3437M < this.f3426A) {
                this.f3437M = this.f3426A;
            }
        }
        if (this.f3434J > 0 || this.f3449s > 0) {
            if (this.f3434J < this.f3435K) {
                this.f3434J = this.f3435K;
            }
            if (this.f3449s < this.f3450t) {
                this.f3449s = this.f3450t;
            }
        }
        if (this.f3454x > 0 || this.f3447q > 0) {
            if (this.f3454x < this.f3431G) {
                this.f3454x = this.f3431G;
            }
            if (this.f3447q < this.f3450t) {
                this.f3447q = this.f3450t;
            }
        }
    }

    /* renamed from: s */
    protected boolean m8234s() {
        return true;
    }
}
