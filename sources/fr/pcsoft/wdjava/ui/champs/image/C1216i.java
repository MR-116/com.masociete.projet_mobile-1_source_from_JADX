package fr.pcsoft.wdjava.ui.champs.image;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.ui.gesture.C0522g;
import fr.pcsoft.wdjava.ui.utils.C1503b;

/* renamed from: fr.pcsoft.wdjava.ui.champs.image.i */
public class C1216i extends ImageView {
    /* renamed from: a */
    private static final int f3622a = 50;
    /* renamed from: c */
    private static final int f3623c = 300;
    /* renamed from: o */
    private static final int f3624o = 300;
    /* renamed from: s */
    private static final int f3625s = 800;
    /* renamed from: z */
    private static final String[] f3626z = new String[]{C1216i.m8560z(C1216i.m8561z("qDZ)lX\f_**UHV-+Y\u000bP#\"\u001cXK<<SYJ¥lPDL?=IN\u001e )\u001cQQ#!\u001cFK 8U_Q9/T\u000b[?8\u001cJ]8%JÂ\u0010")), C1216i.m8560z(C1216i.m8561z("jJR)9N\u000bW\":]GW()\u001c[Q9>\u001cG_l!]_L%/Y\u0005"))};
    /* renamed from: b */
    protected C0522g f3627b = null;
    /* renamed from: d */
    private boolean f3628d = false;
    /* renamed from: e */
    protected float f3629e = 0.9f;
    /* renamed from: f */
    private boolean f3630f = false;
    /* renamed from: g */
    private Matrix f3631g = new Matrix();
    /* renamed from: h */
    protected float f3632h = 0.1f;
    /* renamed from: i */
    private Matrix f3633i = null;
    /* renamed from: j */
    protected float f3634j = 0.9f;
    /* renamed from: k */
    protected float f3635k = 0.1f;
    /* renamed from: l */
    protected Handler f3636l = null;
    /* renamed from: m */
    protected GestureDetector f3637m;
    /* renamed from: n */
    private boolean f3638n = false;
    /* renamed from: p */
    protected float[] f3639p = null;
    /* renamed from: q */
    protected float f3640q = 1.0f;
    /* renamed from: r */
    private Matrix f3641r = new Matrix();
    /* renamed from: t */
    protected float f3642t = 1.0f;
    /* renamed from: u */
    protected C1212e f3643u = C1212e.SIMPLE;

    public C1216i(Context context) {
        super(context);
    }

    /* renamed from: a */
    private float m8550a(float f, float f2, float f3, float f4) {
        float f5 = (f / f4) - 1.0f;
        return (((f5 * (f5 * f5)) + 1.0f) * f3) + f2;
    }

    /* renamed from: a */
    private float m8551a(Matrix matrix, int i) {
        if (this.f3639p == null) {
            this.f3639p = new float[9];
        }
        matrix.getValues(this.f3639p);
        if (i >= 0 && i < this.f3639p.length) {
            return this.f3639p[i];
        }
        C0691a.m2856a(f3626z[1]);
        return 0.0f;
    }

    /* renamed from: a */
    private final PointF m8552a() {
        RectF e = m8581e();
        if (e == null) {
            return null;
        }
        float height = e.height();
        float width = e.width();
        int g = m8583g();
        int width2 = getWidth();
        PointF pointF = new PointF();
        if (height < ((float) g)) {
            pointF.y = ((((float) g) - height) / 2.0f) - e.top;
        } else if (e.top > 0.0f) {
            pointF.y = -e.top;
        } else if (e.bottom < ((float) g)) {
            pointF.y = ((float) g) - e.bottom;
        }
        if (width < ((float) width2)) {
            pointF.x = ((((float) width2) - width) / 2.0f) - e.left;
            return pointF;
        } else if (e.left > 0.0f) {
            pointF.x = -e.left;
            return pointF;
        } else if (e.right >= ((float) width2)) {
            return pointF;
        } else {
            pointF.x = ((float) width2) - e.right;
            return pointF;
        }
    }

    /* renamed from: a */
    private void m8553a(float f, int i) {
        m8566a(f, ((float) m8588n()) / 2.0f, ((float) m8583g()) / 2.0f, i);
    }

    /* renamed from: b */
    private void m8554b(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            if (this.f3641r == null) {
                this.f3641r = new Matrix();
            }
            this.f3641r.postTranslate(f, f2);
            setImageMatrix(m8559s());
        }
    }

    /* renamed from: b */
    private void m8555b(float f, float f2, float f3) {
        if (this.f3641r == null) {
            this.f3641r = new Matrix();
        }
        this.f3641r.postScale(f, f, f2, f3);
        setImageMatrix(m8559s());
    }

    /* renamed from: i */
    private void m8556i() {
        PointF a = m8552a();
        if (a == null) {
            return;
        }
        if (a.x != 0.0f || a.y != 0.0f) {
            m8554b(a.x, a.y);
        }
    }

    /* renamed from: k */
    private final RectF m8557k() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        return new RectF(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
    }

    /* renamed from: q */
    private float m8558q() {
        return this.f3641r != null ? m8551a(this.f3641r, 0) : 1.0f;
    }

    /* renamed from: s */
    private final Matrix m8559s() {
        if (this.f3641r == null) {
            return this.f3631g;
        }
        if (this.f3633i == null) {
            this.f3633i = new Matrix(this.f3631g);
        } else {
            this.f3633i.set(this.f3631g);
        }
        this.f3633i.postConcat(this.f3641r);
        return this.f3633i;
    }

    /* renamed from: z */
    private static String m8560z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 60;
                    break;
                case 1:
                    i2 = 43;
                    break;
                case 2:
                    i2 = 62;
                    break;
                case 3:
                    i2 = 76;
                    break;
                default:
                    i2 = 76;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8561z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 76);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected int mo3473a(MotionEvent motionEvent) {
        return 1;
    }

    /* renamed from: a */
    protected void mo3474a(float f) {
    }

    /* renamed from: a */
    protected void m8564a(float f, float f2) {
        float f3 = 0.0f;
        RectF e = m8581e();
        if (e != null) {
            int g = m8583g();
            int width = getWidth();
            if (e.top >= 0.0f && e.bottom <= ((float) g)) {
                f2 = 0.0f;
            }
            if (e.left >= 0.0f && e.right <= ((float) width)) {
                f = 0.0f;
            }
            if (e.top + f2 >= 0.0f && e.bottom > ((float) g)) {
                f2 = (float) ((int) (0.0f - e.top));
            }
            if (e.bottom + f2 <= ((float) g) && e.top < 0.0f) {
                f2 = (float) ((int) (((float) g) - e.bottom));
            }
            if (e.left + f >= 0.0f) {
                f = (float) ((int) (0.0f - e.left));
            }
            if (e.right + f <= ((float) width)) {
                f = (float) ((int) (((float) width) - e.right));
            }
            if (e.width() <= ((float) width)) {
                f = 0.0f;
            }
            if (e.height() > ((float) g)) {
                f3 = f2;
            }
            m8554b(f, f3);
            if (m8582f()) {
                m8556i();
            }
        }
    }

    /* renamed from: a */
    protected void m8565a(float f, float f2, float f3) {
        float min = Math.min(this.f3640q, Math.max(this.f3634j, f));
        m8555b(min / m8558q(), f2, f3);
        mo3474a(min);
        m8556i();
    }

    /* renamed from: a */
    protected void m8566a(float f, float f2, float f3, int i) {
        float q = m8558q();
        float f4 = (f - q) / ((float) i);
        getHandler().post(new C1223p(this, i, System.currentTimeMillis(), q, f4, f2, f3));
    }

    /* renamed from: a */
    protected void m8567a(float f, float f2, int i) {
        getHandler().post(new C1222n(this, i, System.currentTimeMillis(), f, f2));
    }

    /* renamed from: a */
    public final void m8568a(int i) {
        float f = 1.0f;
        this.f3631g.reset();
        if (this.f3641r != null) {
            this.f3641r.reset();
        }
        if (m8582f()) {
            RectF k = m8557k();
            if (k != null) {
                float n = ((float) m8588n()) / k.width();
                float g = ((float) m8583g()) / k.height();
                switch (i) {
                    case 5:
                    case 72:
                        f = Math.min(n, g);
                        break;
                    case 7:
                    case 8:
                        f = Math.max(n, g);
                        break;
                    case 9:
                    case 10:
                        f = Math.min(1.0f, Math.min(n, g));
                        break;
                    case 67:
                    case 78:
                        break;
                    default:
                        C0691a.m2856a(f3626z[0]);
                        break;
                }
                m8555b(f, 0.0f, 0.0f);
                m8554b((((float) m8588n()) - (k.width() * f)) / 2.0f, (((float) m8583g()) - (k.height() * f)) / 2.0f);
                this.f3642t = f;
                this.f3629e = f;
                this.f3635k = (this.f3634j * 10.0f) / 100.0f;
                this.f3632h = (this.f3640q * 10.0f) / 100.0f;
                this.f3634j = this.f3629e - this.f3635k;
                this.f3640q += this.f3632h;
            }
        } else {
            this.f3631g.setRectToRect(mo3482r(), mo3481c(), ScaleToFit.FILL);
        }
        setImageMatrix(m8559s());
    }

    /* renamed from: a */
    public void mo3475a(C1212e c1212e) {
        this.f3643u = c1212e;
        if (m8582f()) {
            mo3476b();
        }
    }

    /* renamed from: a */
    public final void m8570a(C0522g c0522g) {
        this.f3627b = c0522g;
    }

    /* renamed from: a */
    public void m8571a(boolean z) {
        this.f3630f = z;
        if (z) {
            mo3476b();
        }
    }

    /* renamed from: b */
    public void mo3476b() {
        if (this.f3637m == null) {
            this.f3637m = new GestureDetector(getContext(), new C1209a(this), null);
        }
    }

    /* renamed from: b */
    public void m8573b(float f) {
        RectF e = m8581e();
        if (f < this.f3634j) {
            this.f3634j = f - ((f * 10.0f) / 100.0f);
        } else if (f > this.f3640q) {
            this.f3640q = ((f * 10.0f) / 100.0f) + f;
        }
        m8565a(f, e.centerX(), e.centerY());
    }

    /* renamed from: b */
    public final void m8574b(int i) {
        this.f3640q = (float) (Math.max(100, i) / 100);
    }

    /* renamed from: b */
    public final void m8575b(boolean z) {
        this.f3628d = z;
    }

    /* renamed from: b */
    protected boolean mo3477b(MotionEvent motionEvent) {
        return motionEvent.getAction() == 1;
    }

    /* renamed from: c */
    protected RectF mo3481c() {
        return new RectF(0.0f, 0.0f, (float) m8588n(), (float) m8583g());
    }

    /* renamed from: c */
    public final void m8578c(int i) {
        this.f3634j = (float) (Math.min(100, i) / 100);
    }

    /* renamed from: c */
    public final void m8579c(boolean z) {
        this.f3638n = z;
    }

    public final boolean canScrollHorizontally(int i) {
        if (!this.f3630f) {
            return false;
        }
        RectF e = m8581e();
        return e != null ? (i < 0 && ((int) e.left) < 0) || (i > 0 && ((int) e.right) > getWidth()) : false;
    }

    public final boolean canScrollVertically(int i) {
        if (!this.f3630f) {
            return false;
        }
        RectF e = m8581e();
        return e != null ? (i < 0 && ((int) e.top) < 0) || (i > 0 && ((int) e.bottom) > m8583g()) : false;
    }

    /* renamed from: d */
    public final Handler m8580d() {
        if (this.f3636l == null) {
            this.f3636l = new Handler();
        }
        return this.f3636l;
    }

    /* renamed from: e */
    protected RectF m8581e() {
        RectF k = m8557k();
        if (k == null) {
            return null;
        }
        m8559s().mapRect(k);
        return k;
    }

    /* renamed from: f */
    public final boolean m8582f() {
        return this.f3643u != C1212e.AUCUN;
    }

    /* renamed from: g */
    public final int m8583g() {
        return C1503b.m10449c(this);
    }

    /* renamed from: h */
    public void mo3478h() {
        setImageDrawable(null);
        this.f3631g = null;
        this.f3641r = null;
        this.f3633i = null;
        this.f3639p = null;
        this.f3637m = null;
        this.f3636l = null;
        this.f3627b = null;
    }

    /* renamed from: j */
    public final C1212e m8585j() {
        return this.f3643u;
    }

    /* renamed from: l */
    public void m8586l() {
        this.f3643u = C1212e.AUCUN;
    }

    /* renamed from: m */
    public final C0522g m8587m() {
        return this.f3627b;
    }

    /* renamed from: n */
    public final int m8588n() {
        return C1503b.m10442b((View) this);
    }

    /* renamed from: o */
    protected boolean mo3479o() {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3628d && !C1503b.m10437a((int) motionEvent.getX(), (int) motionEvent.getY(), (View) this)) {
            return false;
        }
        if (!(mo3479o() || this.f3637m == null)) {
            this.f3637m.onTouchEvent(motionEvent);
        }
        if (mo3477b(motionEvent) && m8582f()) {
            if (m8558q() < this.f3634j + this.f3635k) {
                m8553a(this.f3634j + this.f3635k, 50);
            } else if (this.f3642t > this.f3640q - this.f3632h) {
                m8553a(this.f3640q - this.f3632h, 50);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final boolean m8590p() {
        return this.f3630f;
    }

    /* renamed from: r */
    protected RectF mo3482r() {
        return m8557k();
    }

    /* renamed from: t */
    public final float m8592t() {
        return this.f3642t;
    }
}
