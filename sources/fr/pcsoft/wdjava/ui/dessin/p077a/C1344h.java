package fr.pcsoft.wdjava.ui.dessin.p077a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.Xfermode;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.dessin.p078b.C1364c;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p079e.C1399b;
import fr.pcsoft.wdjava.ui.p079e.C1400d;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.a.h */
public class C1344h implements C1337c {
    /* renamed from: d */
    private float f3998d = 1.0f;
    /* renamed from: e */
    private C1340e f3999e;
    /* renamed from: f */
    private Paint f4000f = new Paint();
    /* renamed from: g */
    private C1352r f4001g = null;

    public C1344h(C1346j c1346j, boolean z) {
        this.f4001g = (C1352r) c1346j;
        if (z) {
            this.f3998d = ((float) m9640f().getDensity()) / 160.0f;
        }
    }

    /* renamed from: a */
    private boolean m9639a(int i, C1347k c1347k) {
        return ((i & 2) == 2 && (c1347k.m9683b() == null || c1347k.m9683b().mo3684c() == 0.0d)) ? false : ((i & 1) == 1 && C1031a.m7448a(c1347k.m9675a()) == 0) ? false : ((i & 4) == 4 && (c1347k.m9687d() == null || c1347k.m9687d().mo3734c())) ? false : ((i & 8) == 8 && c1347k.m9685c() == null) ? false : true;
    }

    /* renamed from: f */
    private final Canvas m9640f() {
        return this.f4001g.m9716b();
    }

    /* renamed from: a */
    public int m9641a(double d) {
        return (int) (((double) this.f3998d) * d);
    }

    /* renamed from: a */
    public C1341l mo3689a(double d, double d2, int i, double d3, double d4, int i2) {
        return new C1360z(this, (float) ((int) d), (float) ((int) d2), (float) ((int) d3), (float) ((int) d4), i, i2, TileMode.REPEAT);
    }

    /* renamed from: a */
    public C1341l mo3690a(int i, int i2) {
        return new C1357w(this, C1364c.m9753a(i2, i));
    }

    /* renamed from: a */
    public C1338n mo3691a(double d, C1355u c1355u, C1343g c1343g, C1359y c1359y) {
        return c1355u == C1355u.INVISIBLE ? null : new C1340e(this, d, c1343g, c1359y, 10.0f, c1355u);
    }

    /* renamed from: a */
    public C1338n mo3692a(int i) {
        if (i > 1) {
            return new C1340e(this, (double) i);
        }
        if (this.f3999e == null) {
            this.f3999e = new C1340e(this, 1.0d);
        }
        return this.f3999e;
    }

    /* renamed from: a */
    public final void m9646a(float f) {
        this.f3998d = f;
    }

    /* renamed from: a */
    public void mo3693a(C1346j c1346j) {
        if (this.f4001g != null) {
            this.f4001g.mo3730a();
        }
        this.f4001g = (C1352r) c1346j;
    }

    /* renamed from: a */
    public void mo3694a(C1347k c1347k, int i) {
        if (c1347k != null) {
            if ((i & 2) == 2) {
                C1338n b = c1347k.m9683b();
                if (b != null) {
                    b.mo3685d();
                }
            }
            if ((i & 1) == 1) {
                this.f4000f.setColor(c1347k.m9675a());
            }
            if ((i & 4) == 4) {
                C1341l d = c1347k.m9687d();
                if (d != null) {
                    d.mo3735d();
                }
            }
            if ((i & 8) == 8) {
                this.f4000f.setStrokeWidth(0.0f);
                this.f4000f.setShader(null);
                this.f4000f.setStrokeCap(Cap.SQUARE);
                this.f4000f.setStrokeJoin(Join.MITER);
                this.f4000f.setStrokeMiter(10.0f);
                this.f4000f.setPathEffect(null);
                C1399b c1399b = (C1399b) c1347k.m9685c();
                if (c1399b != null) {
                    this.f4000f.setTypeface(c1399b.m9962j());
                    this.f4000f.setTextSize(((float) c1399b.mo3760a()) * this.f3998d);
                    this.f4000f.setFakeBoldText(c1399b.mo3762c());
                    this.f4000f.setUnderlineText(c1399b.mo3766g());
                    this.f4000f.setStrikeThruText(c1399b.mo3767h());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3695a(boolean z) {
        this.f4000f.setAntiAlias(z);
    }

    /* renamed from: a */
    public boolean mo3696a() {
        return this.f4000f.isAntiAlias();
    }

    /* renamed from: a */
    public boolean mo3697a(double d, double d2, double d3, double d4, double d5, double d6, C1347k c1347k) {
        return false;
    }

    /* renamed from: a */
    public boolean mo3698a(double d, double d2, double d3, double d4, int i, int i2, int i3, C1347k c1347k) {
        boolean z = false;
        int i4 = 360 - (i2 + i);
        RectF rectF = new RectF((float) m9641a(d), (float) m9641a(d2), (float) m9641a(d + d3), (float) m9641a(d2 + d4));
        if (i3 != 1 && m9639a(4, c1347k)) {
            mo3694a(c1347k, 4);
            this.f4000f.setStyle(Style.FILL);
            switch (i3) {
                case 2:
                    m9640f().drawArc(rectF, (float) i4, (float) i2, false, this.f4000f);
                    break;
                case 3:
                    m9640f().drawArc(rectF, (float) i4, (float) i2, true, this.f4000f);
                    break;
            }
            z = true;
        }
        if (!m9639a(3, c1347k)) {
            return z;
        }
        mo3694a(c1347k, 3);
        this.f4000f.setStyle(Style.STROKE);
        switch (i3) {
            case 2:
                break;
            case 3:
                m9640f().drawArc(rectF, (float) i4, (float) i2, true, this.f4000f);
                break;
            default:
                m9640f().drawArc(rectF, (float) i4, (float) i2, false, this.f4000f);
                break;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo3699a(double d, double d2, double d3, double d4, C1347k c1347k) {
        boolean z = false;
        int a = m9641a(d);
        int a2 = m9641a(d2);
        int a3 = m9641a(d + d3);
        int a4 = m9641a(d2 + d4);
        if (m9639a(4, c1347k)) {
            mo3694a(c1347k, 4);
            this.f4000f.setStyle(Style.FILL);
            m9640f().drawOval(new RectF((float) a, (float) a2, (float) a3, (float) a4), this.f4000f);
            z = true;
        }
        if (!m9639a(3, c1347k)) {
            return z;
        }
        mo3694a(c1347k, 3);
        this.f4000f.setStyle(Style.STROKE);
        m9640f().drawOval(new RectF((float) a, (float) a2, (float) a3, (float) a4), this.f4000f);
        return true;
    }

    /* renamed from: a */
    public boolean mo3700a(double d, double d2, C1347k c1347k) {
        int a = m9641a(d);
        int a2 = m9641a(d2);
        if (m9639a(1, c1347k)) {
            if (this.f4001g instanceof C1353s) {
                Bitmap f = ((C1353s) this.f4001g).m9725f();
                int a3 = (c1347k.m9675a() & 16777215) | (c1347k.m9683b().mo3682b() << 24);
                if (a < f.getWidth() && a2 < f.getHeight()) {
                    f.setPixel(a, a2, a3);
                    return true;
                }
            }
            mo3694a(c1347k, 1);
            m9640f().drawPoint((float) a, (float) a2, this.f4000f);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo3701a(double d, double d2, String str, boolean z, C1347k c1347k, int[] iArr) {
        int a = m9641a(d);
        int a2 = m9641a(d2);
        if (((C1399b) c1347k.m9685c()) == null) {
            c1347k.m9682a(C1400d.m9965a("", 13.0f, 1));
        }
        if (!m9639a(9, c1347k)) {
            return false;
        }
        mo3694a(c1347k, 9);
        FontMetrics fontMetrics = this.f4000f.getFontMetrics();
        a2 = (int) (((float) a2) + Math.abs(fontMetrics.ascent));
        double toDegrees = Math.toDegrees(c1347k.m9689f());
        if (toDegrees > 0.0d && toDegrees < 360.0d) {
            m9640f().rotate((float) toDegrees, (float) a, (float) a2);
        }
        boolean isAntiAlias = this.f4000f.isAntiAlias();
        this.f4000f.setAntiAlias(true);
        this.f4000f.setStyle(Style.FILL);
        if (!z) {
            StringBuffer stringBuffer = new StringBuffer();
            C0808l.m4009a(str, stringBuffer);
            str = stringBuffer.toString();
        }
        m9640f().drawText(str, (float) a, (float) a2, this.f4000f);
        if (toDegrees > 0.0d && toDegrees < 360.0d) {
            m9640f().rotate((float) (-toDegrees), (float) a, (float) a2);
        }
        if (!isAntiAlias) {
            this.f4000f.setAntiAlias(false);
        }
        int i = (int) ((fontMetrics.leading - fontMetrics.ascent) + fontMetrics.descent);
        iArr[0] = a;
        iArr[1] = (int) (((float) (a2 - i)) - fontMetrics.ascent);
        iArr[2] = (int) (this.f4000f.measureText(str) + 10.0f);
        iArr[3] = i * 2;
        return true;
    }

    /* renamed from: a */
    public boolean mo3702a(int i, double d) {
        if (!(this.f4001g instanceof C1353s)) {
            return false;
        }
        Bitmap f = ((C1353s) this.f4001g).m9725f();
        double min = Math.min(100.0d, Math.max(0.0d, d));
        Xfermode xfermode = this.f4000f.getXfermode();
        int alpha = this.f4000f.getAlpha();
        try {
            this.f4000f.setXfermode(new PorterDuffXfermode(Mode.SRC_ATOP));
            this.f4000f.setColor(i);
            this.f4000f.setAlpha((int) (min * 2.55d));
            this.f4000f.setStyle(Style.FILL);
            m9640f().drawRect(0.0f, 0.0f, (float) f.getWidth(), (float) f.getHeight(), this.f4000f);
            return true;
        } finally {
            this.f4000f.setXfermode(xfermode);
            this.f4000f.setAlpha(alpha);
        }
    }

    /* renamed from: a */
    public boolean mo3703a(int i, int i2, int i3) {
        if (i3 != 0 && i == 0 && i2 == 0) {
            return mo3712b(i3);
        }
        if (!(this.f4001g instanceof C1353s)) {
            return false;
        }
        if (!(i == 0 && i2 == 0 && i3 == 0)) {
            Bitmap f = ((C1353s) this.f4001g).m9725f();
            int width = f.getWidth();
            int height = f.getHeight();
            if (width == 0 || height == 0) {
                return true;
            }
            int pixel = f.getPixel(0, 0);
            int b = C1031a.m7457b(pixel, i, i2, i3);
            for (int i4 = 0; i4 < width; i4++) {
                int i5 = 0;
                while (i5 < height) {
                    int pixel2 = f.getPixel(i4, i5);
                    if (pixel2 != pixel) {
                        b = C1031a.m7457b(pixel2, i, i2, i3);
                    } else {
                        pixel2 = pixel;
                    }
                    f.setPixel(i4, i5, b);
                    i5++;
                    pixel = pixel2;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo3704a(int i, int i2, int i3, int i4) {
        int a = m9641a((double) i);
        int a2 = m9641a((double) i2);
        if (this.f4001g instanceof C1353s) {
            Bitmap f = ((C1353s) this.f4001g).m9725f();
            if (f != null) {
                new C1345i(this, f, a, a2, i3, i4).run();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo3705a(C1336b c1336b, double d) {
        if (c1336b == null) {
            return false;
        }
        double min = Math.min(100.0d, Math.max(0.0d, d));
        Xfermode xfermode = this.f4000f.getXfermode();
        int alpha = this.f4000f.getAlpha();
        try {
            this.f4000f.setXfermode(new PorterDuffXfermode(Mode.SRC_ATOP));
            this.f4000f.setAlpha((int) (min * 2.55d));
            m9640f().drawBitmap((Bitmap) c1336b.mo3728e(), 0.0f, 0.0f, this.f4000f);
            return true;
        } finally {
            this.f4000f.setXfermode(xfermode);
            this.f4000f.setAlpha(alpha);
        }
    }

    /* renamed from: a */
    public boolean mo3706a(C1336b c1336b, double d, double d2, double d3, double d4) {
        int a = m9641a(d);
        int a2 = m9641a(d2);
        int a3 = m9641a(d + d3);
        int a4 = m9641a(d2 + d4);
        if (c1336b == null) {
            return false;
        }
        Bitmap bitmap = (Bitmap) c1336b.mo3728e();
        m9640f().drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(a, a2, a3, a4), null);
        return true;
    }

    /* renamed from: a */
    public boolean mo3707a(double[] dArr, C1347k c1347k) {
        int i = 2;
        boolean z = true;
        if (dArr.length < 2) {
            return false;
        }
        boolean z2;
        Path path = new Path();
        int a = m9641a(dArr[0]);
        int a2 = m9641a(dArr[1]);
        path.moveTo((float) a, (float) a2);
        while (i < dArr.length) {
            int i2 = i + 1;
            path.lineTo((float) m9641a(dArr[i]), (float) m9641a(dArr[i2]));
            i = i2 + 1;
        }
        path.lineTo((float) a, (float) a2);
        if (m9639a(4, c1347k)) {
            mo3694a(c1347k, 4);
            this.f4000f.setStyle(Style.FILL);
            m9640f().drawPath(path, this.f4000f);
            z2 = true;
        } else {
            z2 = false;
        }
        if (m9639a(3, c1347k)) {
            mo3694a(c1347k, 3);
            this.f4000f.setStyle(Style.STROKE);
            m9640f().drawPath(path, this.f4000f);
        } else {
            z = z2;
        }
        return z;
    }

    /* renamed from: b */
    public C1341l mo3708b(int i, int i2) {
        return new C1358x(this, i, i2);
    }

    /* renamed from: b */
    public void mo3709b() {
        if (this.f3999e != null) {
            this.f3999e.mo3683a();
            this.f3999e = null;
        }
        this.f4000f = null;
        if (this.f4001g != null) {
            this.f4001g.mo3730a();
            this.f4001g = null;
        }
    }

    /* renamed from: b */
    public void mo3710b(boolean z) {
    }

    /* renamed from: b */
    public boolean mo3711b(double d, double d2, double d3, double d4, C1347k c1347k) {
        int a = m9641a(d);
        int a2 = m9641a(d2);
        int a3 = m9641a(d3);
        int a4 = m9641a(d4);
        if (!m9639a(3, c1347k)) {
            return false;
        }
        mo3694a(c1347k, 3);
        m9640f().drawLine((float) a, (float) a2, (float) a3, (float) a4, this.f4000f);
        return true;
    }

    /* renamed from: b */
    public boolean mo3712b(int i) {
        if (!(this.f4001g instanceof C1353s)) {
            return false;
        }
        if (i != 0) {
            Bitmap f = ((C1353s) this.f4001g).m9725f();
            int width = f.getWidth();
            int height = f.getHeight();
            for (int i2 = 0; i2 < width; i2++) {
                for (int i3 = 0; i3 < height; i3++) {
                    f.setPixel(i2, i3, C1031a.m7455b(f.getPixel(i2, i3), i));
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo3713b(C1336b c1336b, double d, double d2, double d3, double d4) {
        double d5 = d3 < 0.0d ? (double) c1336b.mo3727d() : (double) Math.min(m9641a(d3), c1336b.mo3727d());
        double b = d4 < 0.0d ? (double) c1336b.mo3725b() : (double) Math.min(m9641a(d4), c1336b.mo3725b());
        int a = m9641a(d);
        int a2 = m9641a(d2);
        int i = ((int) d5) + a;
        int i2 = ((int) b) + a2;
        if (c1336b == null) {
            return false;
        }
        Canvas f = m9640f();
        f.save();
        f.clipRect(a, a2, i, i2);
        f.drawBitmap((Bitmap) c1336b.mo3728e(), (float) a, (float) a2, null);
        f.restore();
        return true;
    }

    /* renamed from: c */
    public boolean mo3714c() {
        if (!(this.f4001g instanceof C1353s)) {
            return false;
        }
        Bitmap f = ((C1353s) this.f4001g).m9725f();
        int width = f.getWidth();
        int height = f.getHeight();
        for (int i = 0; i < width; i++) {
            for (int i2 = 0; i2 < height; i2++) {
                int pixel = f.getPixel(i, i2);
                f.setPixel(i, i2, ((pixel ^ -1) & 16777215) | (((pixel >> 24) & 255) << 24));
            }
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo3715c(double d, double d2, double d3, double d4, C1347k c1347k) {
        int a = m9641a(d);
        int a2 = m9641a(d2);
        int a3 = m9641a(d + d3);
        int a4 = m9641a(d2 + d4);
        boolean z = false;
        if (m9639a(4, c1347k)) {
            mo3694a(c1347k, 4);
            this.f4000f.setStyle(Style.FILL);
            m9640f().drawRect((float) a, (float) a2, (float) a3, (float) a4, this.f4000f);
            z = true;
        }
        if (!m9639a(3, c1347k)) {
            return z;
        }
        mo3694a(c1347k, 3);
        this.f4000f.setStyle(Style.STROKE);
        m9640f().drawRect((float) a, (float) a2, (float) a3, (float) a4, this.f4000f);
        return true;
    }

    /* renamed from: d */
    public C1346j mo3716d() {
        return this.f4001g;
    }

    /* renamed from: e */
    public final float m9671e() {
        return this.f3998d;
    }
}
