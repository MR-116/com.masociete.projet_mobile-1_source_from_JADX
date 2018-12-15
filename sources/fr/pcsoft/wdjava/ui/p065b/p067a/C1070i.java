package fr.pcsoft.wdjava.ui.p065b.p067a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Picture;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.i */
public class C1070i {
    /* renamed from: d */
    private static final int f3119d = C1511l.m10528c();
    /* renamed from: h */
    private static final float f3120h = 0.5522848f;
    /* renamed from: z */
    private static final String[] f3121z = new String[]{C1070i.m7687z(C1070i.m7688z("64{)>;b")), C1070i.m7687z(C1070i.m7688z("i7n;a")), C1070i.m7687z(C1070i.m7688z("d%ubc8o7k"))};
    /* renamed from: a */
    private Stack<C1062e> f3122a = null;
    /* renamed from: b */
    private Canvas f3123b = null;
    /* renamed from: c */
    private RectF f3124c = null;
    /* renamed from: e */
    private C1071j f3125e = null;
    /* renamed from: f */
    private float f3126f = 0.0f;
    /* renamed from: g */
    private Stack<Matrix> f3127g = null;
    /* renamed from: i */
    private Stack<C1071j> f3128i = null;
    /* renamed from: j */
    private wb f3129j = null;

    private C1070i() {
    }

    /* renamed from: a */
    private final float m7654a(C1063b c1063b, boolean z) {
        switch (C1078r.f3213b[c1063b.m7606b().ordinal()]) {
            case 1:
                return c1063b.m7607c();
            case 2:
                return c1063b.m7607c() * this.f3125e.f3137e.getTextSize();
            case 3:
                return c1063b.m7607c() * (this.f3125e.f3137e.getTextSize() / 2.0f);
            case 4:
                return c1063b.m7607c() * this.f3126f;
            case 5:
                return (c1063b.m7607c() * this.f3126f) / 2.54f;
            case 6:
                return (c1063b.m7607c() * this.f3126f) / 25.4f;
            case 7:
                return (c1063b.m7607c() * this.f3126f) / 72.0f;
            case 8:
                return (c1063b.m7607c() * this.f3126f) / 6.0f;
            case 9:
                RectF rectF = this.f3125e.f3136d;
                if (rectF == null) {
                    return c1063b.m7607c();
                }
                if (z) {
                    return (rectF.width() * c1063b.m7607c()) / 100.0f;
                }
                return (rectF.height() * c1063b.m7607c()) / 100.0f;
            default:
                return c1063b.m7607c();
        }
    }

    /* renamed from: a */
    private static final int m7655a(int i, float f) {
        return (Math.min(Math.max(0, (int) (256.0f * f)), 255) << 24) | i;
    }

    /* renamed from: a */
    public static final Bitmap m7656a(wb wbVar, int i, int i2) {
        RectF rectF;
        RectF b = wbVar.m7851b((float) f3119d);
        if (i2 <= 0 || i <= 0) {
            rectF = b;
        } else {
            float min = Math.min(((float) i) / b.width(), ((float) i2) / b.height());
            rectF = new RectF(0.0f, 0.0f, b.width() * min, b.height() * min);
        }
        Bitmap createBitmap = Bitmap.createBitmap((int) Math.ceil((double) rectF.width()), (int) Math.ceil((double) rectF.height()), Config.ARGB_8888);
        C1070i c1070i = new C1070i();
        c1070i.m7674a(wbVar, new Canvas(createBitmap), rectF, (float) f3119d);
        c1070i.m7691e();
        return createBitmap;
    }

    /* renamed from: a */
    private Matrix m7657a(RectF rectF, RectF rectF2) {
        Matrix matrix = new Matrix();
        if (!rectF.equals(rectF2)) {
            float width = rectF.width() / rectF2.width();
            float height = rectF.height() / rectF2.height();
            float f = -rectF2.left;
            float f2 = -rectF2.top;
            matrix.preTranslate(rectF.left, rectF.top);
            matrix.preScale(width, height);
            matrix.preTranslate(f, f2);
        }
        return matrix;
    }

    /* renamed from: a */
    private final RectF m7658a(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return rectF;
    }

    /* renamed from: a */
    private C1071j m7659a(yb ybVar, C1071j c1071j) {
        if (c1071j == null) {
            c1071j = new C1071j(this);
            c1071j.m7702a(C1084x.m7861c());
        }
        List<C1061z> arrayList = new ArrayList();
        yb ybVar2 = ybVar;
        while (true) {
            if (ybVar2 instanceof C1061z) {
                arrayList.add(0, (C1061z) ybVar2);
            }
            if (ybVar2.mo3329b() == null) {
                break;
            }
            ybVar2 = ybVar2.mo3329b();
        }
        for (C1061z a : arrayList) {
            c1071j.m7703a(a);
        }
        c1071j.f3136d = this.f3129j.m7857e().m7616e();
        if (c1071j.f3136d == null) {
            C1063b c1063b = this.f3129j.m7857e().f3076f;
            C1063b c1063b2 = this.f3129j.m7857e().f3080j;
            if (!(c1063b == null || c1063b2 == null)) {
                c1071j.f3136d = new RectF(0.0f, 0.0f, m7654a(c1063b, true), m7654a(c1063b2, false));
            }
        }
        c1071j.f3139g = this.f3124c;
        return c1071j;
    }

    /* renamed from: a */
    private void m7660a() {
        this.f3122a.pop();
        this.f3127g.pop();
    }

    /* renamed from: a */
    private final void m7661a(bb bbVar) {
        float f = 0.0f;
        C1063b c1063b = bbVar.f3076f;
        C1063b c1063b2 = bbVar.f3080j;
        if (c1063b != null && c1063b.m7607c() == 0.0f) {
            return;
        }
        if (c1063b2 == null || c1063b2.m7607c() != 0.0f) {
            this.f3125e.m7703a((C1061z) bbVar);
            if (this.f3125e.f3134b.f3289q) {
                if (bbVar.m7579f() != null) {
                    float a = bbVar.f3077g != null ? m7654a(bbVar.f3077g, true) : 0.0f;
                    if (bbVar.f3079i != null) {
                        f = m7654a(bbVar.f3079i, false);
                    }
                    this.f3125e.f3139g = new RectF(a, f, (bbVar.f3076f != null ? m7654a(bbVar.f3076f, true) : this.f3125e.f3139g.width()) + a, (bbVar.f3080j != null ? m7654a(bbVar.f3080j, false) : this.f3125e.f3139g.height()) + f);
                }
                this.f3123b.clipRect(this.f3125e.f3139g);
                RectF e = bbVar.m7616e();
                if (e != null) {
                    this.f3123b.concat(m7657a(this.f3125e.f3139g, e));
                    this.f3125e.f3136d = e;
                }
                m7683b((C1062e) bbVar);
                m7684b((C1061z) bbVar);
            }
        }
    }

    /* renamed from: a */
    private final void m7662a(cb cbVar, String str) {
        C1060y e = this.f3129j.m7858e(str);
        if (e != null && (e instanceof cb) && e != cbVar) {
            cb cbVar2 = (cb) e;
            if (cbVar.f3086h == null) {
                cbVar.f3086h = cbVar2.f3086h;
            }
            if (cbVar.f3084f == null) {
                cbVar.f3084f = cbVar2.f3084f;
            }
            if (cbVar.m7603l() == 0) {
                cbVar.m7600a(cbVar2.mo3332d());
            }
            if ((cbVar instanceof db) && (cbVar2 instanceof db)) {
                db dbVar = (db) cbVar;
                db dbVar2 = (db) cbVar2;
                if (dbVar.f3092m == null) {
                    dbVar.f3092m = dbVar2.f3092m;
                }
                if (dbVar.f3090k == null) {
                    dbVar.f3090k = dbVar2.f3090k;
                }
                if (dbVar.f3089j == null) {
                    dbVar.f3089j = dbVar2.f3089j;
                }
                if (dbVar.f3091l == null) {
                    dbVar.f3091l = dbVar2.f3091l;
                }
            } else if ((cbVar instanceof eb) && (cbVar2 instanceof eb)) {
                eb ebVar = (eb) cbVar;
                eb ebVar2 = (eb) cbVar2;
                if (ebVar.f3096l == null) {
                    ebVar.f3096l = ebVar2.f3096l;
                }
                if (ebVar.f3098n == null) {
                    ebVar.f3098n = ebVar2.f3098n;
                }
                if (ebVar.f3094j == null) {
                    ebVar.f3094j = ebVar2.f3094j;
                }
                if (ebVar.f3097m == null) {
                    ebVar.f3097m = ebVar2.f3097m;
                }
                if (ebVar.f3095k == null) {
                    ebVar.f3095k = ebVar2.f3095k;
                }
            }
            if (!C0808l.m4053k(cbVar2.m7627m())) {
                m7662a(cbVar, cbVar2.m7627m());
            }
        }
    }

    /* renamed from: a */
    private void m7663a(C1062e c1062e) {
        this.f3122a.push(c1062e);
        this.f3127g.push(this.f3123b.getMatrix());
    }

    /* renamed from: a */
    private final void m7664a(fb fbVar) {
        this.f3125e.m7703a((C1061z) fbVar);
        if (this.f3125e.f3134b.f3289q) {
            Matrix e = fbVar.mo3337e();
            if (e != null) {
                this.f3123b.concat(e);
            }
            m7683b((C1062e) fbVar);
            m7684b((C1061z) fbVar);
        }
    }

    /* renamed from: a */
    private final void m7665a(hb hbVar) {
        String m = hbVar.m7653m();
        if (!C0808l.m4053k(m)) {
            C1063b c1063b = hbVar.f3114g;
            C1063b c1063b2 = hbVar.f3118k;
            if (c1063b != null && c1063b.m7607c() != 0.0f && c1063b2 != null && c1063b2.m7607c() != 0.0f && m.startsWith(f3121z[1]) && m.length() >= 14) {
                Bitmap bitmap;
                int indexOf = m.indexOf(44);
                if (indexOf < 12 || !m.substring(indexOf - 7, indexOf).equals(f3121z[0])) {
                    bitmap = null;
                } else {
                    byte[] b = C0808l.m4039b(C0725i.m3039a(m.substring(indexOf + 1), f3121z[2]));
                    bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);
                }
                if (bitmap != null) {
                    this.f3125e.m7703a((C1061z) hbVar);
                    if (this.f3125e.f3134b.f3289q && this.f3125e.f3134b.f3274C) {
                        Matrix e = hbVar.mo3337e();
                        if (e != null) {
                            this.f3123b.concat(e);
                        }
                        float a = hbVar.f3116i != null ? m7654a(hbVar.f3116i, true) : 0.0f;
                        float a2 = hbVar.f3117j != null ? m7654a(hbVar.f3117j, false) : 0.0f;
                        this.f3125e.f3139g = new RectF(a, a2, m7654a(c1063b, true) + a, m7654a(c1063b2, false) + a2);
                        this.f3123b.clipRect(this.f3125e.f3139g);
                        hbVar.m7583a(new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight()));
                        this.f3123b.concat(m7657a(this.f3125e.f3139g, hbVar.m7590g()));
                        m7684b((C1061z) hbVar);
                        this.f3123b.drawBitmap(bitmap, 0.0f, 0.0f, this.f3125e.f3137e);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m7666a(jb jbVar, xb xbVar) {
        for (C1060y c1060y : jbVar.mo3332d()) {
            if (this.f3125e.f3134b.f3289q) {
                if (c1060y instanceof ub) {
                    xbVar.mo3338a(((ub) c1060y).m7819d());
                } else if (c1060y instanceof lb) {
                    jb jbVar2 = (lb) c1060y;
                    m7686d();
                    this.f3125e.m7703a((C1061z) jbVar2);
                    if (this.f3125e.f3134b.f3289q) {
                        if (xbVar instanceof C1082v) {
                            float a = (jbVar2.i == null || jbVar2.i.size() == 0) ? ((C1082v) xbVar).m7821a() : m7654a((C1063b) jbVar2.i.get(0), true);
                            float b = (jbVar2.f == null || jbVar2.f.size() == 0) ? ((C1082v) xbVar).m7824b() : m7654a((C1063b) jbVar2.f.get(0), false);
                            float a2 = (jbVar2.g == null || jbVar2.g.size() == 0) ? 0.0f : m7654a((C1063b) jbVar2.g.get(0), true);
                            float a3 = (jbVar2.h == null || jbVar2.h.size() == 0) ? 0.0f : m7654a((C1063b) jbVar2.h.get(0), false);
                            ((C1082v) xbVar).m7822a(a + a2, b + a3);
                        }
                        m7676a(jbVar2.mo3342e());
                        m7666a(jbVar2, xbVar);
                    }
                    m7681b();
                }
            }
        }
    }

    /* renamed from: a */
    private final void m7667a(kb kbVar) {
        this.f3125e.m7703a((C1061z) kbVar);
        if (this.f3125e.f3134b.f3289q) {
            float f;
            C1067f c1067f;
            Matrix e = kbVar.mo3337e();
            if (e != null) {
                this.f3123b.concat(e);
            }
            float a = (kbVar.i == null || kbVar.i.size() == 0) ? 0.0f : m7654a((C1063b) kbVar.i.get(0), true);
            float a2 = (kbVar.f == null || kbVar.f.size() == 0) ? 0.0f : m7654a((C1063b) kbVar.f.get(0), false);
            float a3 = (kbVar.g == null || kbVar.g.size() == 0) ? 0.0f : m7654a((C1063b) kbVar.g.get(0), true);
            float a4 = (kbVar.h == null || kbVar.h.size() == 0) ? 0.0f : m7654a((C1063b) kbVar.h.get(0), false);
            if (this.f3125e.f3134b.f3277P != 0) {
                xb c1067f2 = new C1067f(this, a, a2);
                m7666a((jb) kbVar, c1067f2);
                float a5 = c1067f2.m7637a();
                if (this.f3125e.f3134b.f3277P == 1) {
                    a -= a5 / 2.0f;
                    c1067f2.offset(-(a5 / 2.0f), 0.0f);
                    f = a;
                    c1067f = c1067f2;
                } else {
                    a -= a5;
                    c1067f2.offset(a5, 0.0f);
                    f = a;
                    xb xbVar = c1067f2;
                }
            } else {
                f = a;
                c1067f = null;
            }
            if (kbVar.m7590g() == null) {
                if (c1067f == null) {
                    c1067f = new C1067f(this, f, a2);
                    m7666a((jb) kbVar, (xb) c1067f);
                }
                kbVar.m7583a(new RectF(c1067f.left, c1067f.top, c1067f.right, c1067f.bottom));
            }
            m7684b((C1061z) kbVar);
            m7676a((C1061z) kbVar);
            m7666a((jb) kbVar, new C1082v(this, f + a3, a4 + a2));
        }
    }

    /* renamed from: a */
    private void m7668a(nb nbVar) {
        float a;
        if (nbVar.f3175h != null) {
            a = m7689a(nbVar.f3175h);
        } else {
            a = 0.0f;
        }
        if (a != 0.0f) {
            this.f3125e.m7703a((C1061z) nbVar);
            if (this.f3125e.f3134b.f3289q && this.f3125e.f3134b.f3274C) {
                float a2;
                float a3;
                Matrix e = nbVar.mo3337e();
                if (e != null) {
                    this.f3123b.concat(e);
                }
                if (nbVar.f3173f != null) {
                    a2 = m7654a(nbVar.f3173f, true);
                } else {
                    a2 = 0.0f;
                }
                if (nbVar.f3174g != null) {
                    a3 = m7654a(nbVar.f3174g, false);
                } else {
                    a3 = 0.0f;
                }
                float f = a2 - a;
                float f2 = a3 - a;
                float f3 = a2 + a;
                float f4 = a3 + a;
                if (nbVar.m7590g() == null) {
                    nbVar.m7583a(new RectF(f, f2, (2.0f * a) + f, (2.0f * a) + f2));
                }
                float f5 = a * f3120h;
                Path path = new Path();
                path.moveTo(a2, f2);
                path.cubicTo(a2 + f5, f2, f3, a3 - f5, f3, a3);
                path.cubicTo(f3, a3 + f5, a2 + f5, f4, a2, f4);
                path.cubicTo(a2 - f5, f4, f, a3 + f5, f, a3);
                path.cubicTo(f, a3 - f5, a2 - f5, f2, a2, f2);
                path.close();
                m7684b((C1061z) nbVar);
                m7684b((C1061z) nbVar);
                m7676a((C1061z) nbVar);
                m7682b(path);
            }
        }
    }

    /* renamed from: a */
    private void m7669a(ob obVar) {
        float a;
        float a2;
        if (obVar.f3180g != null) {
            a = m7654a(obVar.f3180g, true);
        } else {
            a = 0.0f;
        }
        if (obVar.f3181h != null) {
            a2 = m7654a(obVar.f3181h, false);
        } else {
            a2 = 0.0f;
        }
        if (a != 0.0f && a2 != 0.0f) {
            this.f3125e.m7703a((C1061z) obVar);
            if (this.f3125e.f3134b.f3289q && this.f3125e.f3134b.f3274C) {
                float a3;
                float a4;
                Matrix e = obVar.mo3337e();
                if (e != null) {
                    this.f3123b.concat(e);
                }
                if (obVar.f3182i != null) {
                    a3 = m7654a(obVar.f3182i, true);
                } else {
                    a3 = 0.0f;
                }
                if (obVar.f3179f != null) {
                    a4 = m7654a(obVar.f3179f, false);
                } else {
                    a4 = 0.0f;
                }
                float f = a3 - a;
                float f2 = a4 - a2;
                float f3 = a3 + a;
                float f4 = a4 + a2;
                if (obVar.m7590g() == null) {
                    obVar.m7583a(new RectF(f, f2, (2.0f * a) + f, (2.0f * a2) + f2));
                }
                float f5 = a * f3120h;
                float f6 = a2 * f3120h;
                Path path = new Path();
                path.moveTo(a3, f2);
                path.cubicTo(a3 + f5, f2, f3, a4 - f6, f3, a4);
                path.cubicTo(f3, a4 + f6, a3 + f5, f4, a3, f4);
                path.cubicTo(a3 - f5, f4, f, a4 + f6, f, a4);
                path.cubicTo(f, a4 - f6, a3 - f5, f2, a3, f2);
                path.close();
                m7684b((C1061z) obVar);
                m7676a((C1061z) obVar);
                m7682b(path);
            }
        }
    }

    /* renamed from: a */
    private void m7670a(pb pbVar) {
        this.f3125e.m7703a((C1061z) pbVar);
        if (this.f3125e.f3134b.f3289q && this.f3125e.f3134b.f3274C && this.f3125e.f3133a) {
            Matrix e = pbVar.mo3337e();
            if (e != null) {
                this.f3123b.concat(e);
            }
            float a = pbVar.f3185g != null ? m7654a(pbVar.f3185g, true) : 0.0f;
            float a2 = pbVar.f3187i != null ? m7654a(pbVar.f3187i, false) : 0.0f;
            float a3 = pbVar.f3184f != null ? m7654a(pbVar.f3184f, true) : 0.0f;
            float a4 = pbVar.f3186h != null ? m7654a(pbVar.f3186h, false) : 0.0f;
            if (pbVar.m7590g() == null) {
                float min = Math.min(a, a3);
                float min2 = Math.min(a2, a4);
                pbVar.m7583a(new RectF(min, min2, Math.max(a, a3) + min, Math.max(a2, a4) + min2));
            }
            m7684b((C1061z) pbVar);
            m7676a((C1061z) pbVar);
            if (a == a3 && a2 == a4) {
                this.f3123b.drawPoint(a, a2, this.f3125e.f3135c);
            } else {
                this.f3123b.drawLine(a, a2, a3, a4, this.f3125e.f3135c);
            }
        }
    }

    /* renamed from: a */
    private final void m7671a(qb qbVar) {
        this.f3125e.m7703a((C1061z) qbVar);
        if (!this.f3125e.f3134b.f3289q || !this.f3125e.f3134b.f3274C) {
            return;
        }
        if (this.f3125e.f3133a || this.f3125e.f3138f) {
            Matrix e = qbVar.mo3337e();
            if (e != null) {
                this.f3123b.concat(e);
            }
            if (qbVar.m7590g() == null) {
                qbVar.m7583a(m7658a(qbVar.m7781d()));
            }
            m7684b((C1061z) qbVar);
            m7676a((C1061z) qbVar);
            Path d = qbVar.m7781d();
            if (this.f3125e.f3138f) {
                d.setFillType(FillType.WINDING);
            }
            m7682b(d);
        }
    }

    /* renamed from: a */
    private final void m7672a(rb rbVar) {
        this.f3125e.m7703a((C1061z) rbVar);
        if (!this.f3125e.f3134b.f3289q || !this.f3125e.f3134b.f3274C) {
            return;
        }
        if (this.f3125e.f3133a || this.f3125e.f3138f) {
            int b = rbVar.f3216f.m3829b();
            if (b >= 2) {
                Matrix e = rbVar.mo3337e();
                if (e != null) {
                    this.f3123b.concat(e);
                }
                Path path = new Path();
                path.moveTo(rbVar.f3216f.m3826a(0), rbVar.f3216f.m3826a(1));
                for (int i = 2; i < b; i += 2) {
                    path.lineTo(rbVar.f3216f.m3826a(i), rbVar.f3216f.m3826a(i + 1));
                }
                if (rbVar instanceof sb) {
                    path.close();
                }
                if (rbVar.m7590g() == null) {
                    RectF rectF = new RectF();
                    path.computeBounds(rectF, true);
                    rbVar.m7583a(rectF);
                }
                path.setFillType(FillType.WINDING);
                m7684b((C1061z) rbVar);
                m7676a((C1061z) rbVar);
                if (this.f3125e.f3133a && b == 2) {
                    this.f3123b.drawPoint(rbVar.f3216f.m3826a(0), rbVar.f3216f.m3826a(1), this.f3125e.f3135c);
                    if (this.f3125e.f3138f) {
                        this.f3123b.drawPath(path, this.f3125e.f3137e);
                        return;
                    }
                    return;
                }
                m7682b(path);
            }
        }
    }

    /* renamed from: a */
    private final void m7673a(tb tbVar) {
        C1063b c1063b = tbVar.f3219f;
        C1063b c1063b2 = tbVar.f3222i;
        if (c1063b != null && c1063b.m7607c() != 0.0f && c1063b2 != null && c1063b2.m7607c() != 0.0f) {
            this.f3125e.m7703a((C1061z) tbVar);
            if (this.f3125e.f3134b.f3289q && this.f3125e.f3134b.f3274C) {
                float f;
                float f2;
                float a;
                float a2;
                Matrix e = tbVar.mo3337e();
                if (e != null) {
                    this.f3123b.concat(e);
                }
                if (tbVar.f3224k == null && tbVar.f3221h == null) {
                    f = 0.0f;
                    f2 = 0.0f;
                } else if (tbVar.f3224k == null) {
                    f = m7654a(tbVar.f3221h, false);
                    f2 = f;
                } else if (tbVar.f3221h == null) {
                    f = m7654a(tbVar.f3224k, true);
                    f2 = f;
                } else {
                    a = m7654a(tbVar.f3224k, true);
                    f = m7654a(tbVar.f3221h, false);
                    f2 = a;
                }
                if (tbVar.f3223j != null) {
                    a = m7654a(tbVar.f3223j, true);
                } else {
                    a = 0.0f;
                }
                if (tbVar.f3220g != null) {
                    a2 = m7654a(tbVar.f3220g, false);
                } else {
                    a2 = 0.0f;
                }
                float a3 = m7654a(tbVar.f3219f, true);
                float a4 = m7654a(tbVar.f3222i, false);
                float min = Math.min(f2, a3 / 2.0f);
                float min2 = Math.min(f, a4 / 2.0f);
                if (tbVar.m7590g() == null) {
                    tbVar.m7583a(new RectF(a, a2, a + a3, a2 + a4));
                }
                float f3 = a + a3;
                float f4 = a2 + a4;
                Path path = new Path();
                if (min == 0.0f || min2 == 0.0f) {
                    path.moveTo(a, a2);
                    path.lineTo(f3, a2);
                    path.lineTo(f3, f4);
                    path.lineTo(a, f4);
                    path.lineTo(a, a2);
                } else {
                    float f5 = min * f3120h;
                    float f6 = min2 * f3120h;
                    path.moveTo(a, a2 + min2);
                    path.cubicTo(a, (a2 + min2) - f6, (a + min) - f5, a2, a + min, a2);
                    path.lineTo(f3 - min, a2);
                    path.cubicTo((f3 - min) + f5, a2, f3, (a2 + min2) - f6, f3, a2 + min2);
                    path.lineTo(f3, f4 - min2);
                    path.cubicTo(f3, (f4 - min2) + f6, (f3 - min) + f5, f4, f3 - min, f4);
                    path.lineTo(a + min, f4);
                    path.cubicTo((a + min) - f5, f4, a, (f4 - min2) + f6, a, f4 - min2);
                    path.lineTo(a, a2 + min2);
                }
                path.close();
                m7684b((C1061z) tbVar);
                m7676a((C1061z) tbVar);
                m7682b(path);
            }
        }
    }

    /* renamed from: a */
    private final void m7674a(wb wbVar, Canvas canvas, RectF rectF, float f) {
        this.f3129j = wbVar;
        this.f3124c = rectF;
        this.f3126f = f;
        this.f3123b = canvas;
        m7685c();
        bb e = wbVar.m7857e();
        if (e != null) {
            RectF e2 = e.m7616e();
            if (e2 == null) {
                e2 = wbVar.m7851b(f);
            }
            if (!(e2 == null || rectF.equals(e2))) {
                this.f3123b.concat(m7657a(this.f3125e.f3139g, e2));
                this.f3125e.f3139g = e2;
            }
            m7661a(e);
        }
    }

    /* renamed from: a */
    private void m7675a(C1060y c1060y) {
        if (!(c1060y instanceof ac)) {
            m7686d();
            if (c1060y instanceof bb) {
                m7661a((bb) c1060y);
            } else if (c1060y instanceof fb) {
                m7664a((fb) c1060y);
            } else if (c1060y instanceof hb) {
                m7665a((hb) c1060y);
            } else if (c1060y instanceof qb) {
                m7671a((qb) c1060y);
            } else if (c1060y instanceof tb) {
                m7673a((tb) c1060y);
            } else if (c1060y instanceof nb) {
                m7668a((nb) c1060y);
            } else if (c1060y instanceof ob) {
                m7669a((ob) c1060y);
            } else if (c1060y instanceof pb) {
                m7670a((pb) c1060y);
            } else if (c1060y instanceof sb) {
                m7672a((sb) c1060y);
            } else if (c1060y instanceof rb) {
                m7672a((rb) c1060y);
            } else if (c1060y instanceof kb) {
                m7667a((kb) c1060y);
            }
            m7681b();
        }
    }

    /* renamed from: a */
    private final void m7676a(C1061z c1061z) {
        if (this.f3125e.f3134b.f3280T instanceof C1073l) {
            m7679a(true, c1061z, (C1073l) this.f3125e.f3134b.f3280T);
        }
        if (this.f3125e.f3134b.f3279S instanceof C1073l) {
            m7679a(false, c1061z, (C1073l) this.f3125e.f3134b.f3279S);
        }
    }

    /* renamed from: a */
    private void m7677a(boolean z, C1061z c1061z, db dbVar) {
        float a;
        float a2;
        float a3;
        float a4;
        if (dbVar.m7627m() != null) {
            m7662a((cb) dbVar, dbVar.m7627m());
        }
        Paint paint = z ? this.f3125e.f3137e : this.f3125e.f3135c;
        if (dbVar.g) {
            RectF rectF = this.f3125e.f3136d;
            a = dbVar.f3091l != null ? m7654a(dbVar.f3091l, false) : 0.0f;
            a2 = dbVar.f3089j != null ? m7654a(dbVar.f3089j, true) : rectF.width();
            a3 = dbVar.f3090k != null ? m7654a(dbVar.f3090k, false) : 0.0f;
            a4 = dbVar.f3092m != null ? m7654a(dbVar.f3092m, true) : 0.0f;
        } else {
            a = dbVar.f3091l != null ? m7690a(dbVar.f3091l, 1.0f) : 0.0f;
            a2 = dbVar.f3089j != null ? m7690a(dbVar.f3089j, 1.0f) : 1.0f;
            a3 = dbVar.f3090k != null ? m7690a(dbVar.f3090k, 1.0f) : 0.0f;
            a4 = dbVar.f3092m != null ? m7690a(dbVar.f3092m, 1.0f) : 0.0f;
        }
        m7686d();
        this.f3125e = m7659a((yb) dbVar, null);
        Matrix matrix = new Matrix();
        if (!dbVar.g) {
            RectF g = c1061z.m7590g();
            matrix.preTranslate(g.left, g.top);
            matrix.preScale(g.width(), g.height());
        }
        Matrix e = dbVar.mo3337e();
        if (e != null) {
            matrix.preConcat(e);
        }
        int l = dbVar.m7603l();
        if (l == 0) {
            m7681b();
            if (z) {
                this.f3125e.f3138f = false;
                return;
            } else {
                this.f3125e.f3133a = false;
                return;
            }
        }
        int[] iArr = new int[l];
        float[] fArr = new float[l];
        int i = 0;
        float f = -1.0f;
        for (C1060y c1060y : dbVar.mo3332d()) {
            C1061z c1061z2 = (ib) c1060y;
            if (i == 0 || c1061z2.f3131f >= f) {
                fArr[i] = c1061z2.f3131f;
                f = c1061z2.f3131f;
            } else {
                fArr[i] = f;
            }
            m7686d();
            this.f3125e.m7703a(c1061z2);
            C1079s c1079s = (C1079s) this.f3125e.f3134b.f3282V;
            if (c1079s == null) {
                c1079s = C1064c.f3081a;
            }
            iArr[i] = C1070i.m7655a(c1079s.m7788b(), this.f3125e.f3134b.f3283b);
            int i2 = i + 1;
            m7681b();
            i = i2;
        }
        if ((a4 == a2 && a3 == a) || l == 1) {
            m7681b();
            paint.setColor(iArr[l - 1]);
            return;
        }
        TileMode tileMode = TileMode.CLAMP;
        if (dbVar.f != null) {
            if (dbVar.f == C1072k.reflect) {
                tileMode = TileMode.MIRROR;
            } else if (dbVar.f == C1072k.repeat) {
                tileMode = TileMode.REPEAT;
            }
        }
        m7681b();
        Shader linearGradient = new LinearGradient(a4, a3, a2, a, iArr, fArr, tileMode);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
    }

    /* renamed from: a */
    private void m7678a(boolean z, C1061z c1061z, eb ebVar) {
        float a;
        float a2;
        float a3;
        if (ebVar.m7627m() != null) {
            m7662a((cb) ebVar, ebVar.m7627m());
        }
        Paint paint = z ? this.f3125e.f3137e : this.f3125e.f3135c;
        if (ebVar.g) {
            a = ebVar.f3095k != null ? m7689a(ebVar.f3095k) : m7689a(new C1063b(50.0f, C1069h.percent));
            a2 = ebVar.f3098n != null ? m7654a(ebVar.f3098n, false) : m7654a(new C1063b(50.0f, C1069h.percent), false);
            a3 = ebVar.f3096l != null ? m7654a(ebVar.f3096l, true) : m7654a(new C1063b(50.0f, C1069h.percent), true);
        } else {
            a = ebVar.f3095k != null ? m7690a(ebVar.f3095k, 1.0f) : 0.5f;
            a2 = ebVar.f3098n != null ? m7690a(ebVar.f3098n, 1.0f) : 0.5f;
            a3 = ebVar.f3096l != null ? m7690a(ebVar.f3096l, 1.0f) : 0.5f;
        }
        m7686d();
        this.f3125e = m7659a((yb) ebVar, null);
        Matrix matrix = new Matrix();
        if (!ebVar.g) {
            RectF g = c1061z.m7590g();
            matrix.preTranslate(g.left, g.top);
            matrix.preScale(g.width(), g.height());
        }
        Matrix e = ebVar.mo3337e();
        if (e != null) {
            matrix.preConcat(e);
        }
        int l = ebVar.m7603l();
        if (l == 0) {
            m7681b();
            if (z) {
                this.f3125e.f3138f = false;
                return;
            } else {
                this.f3125e.f3133a = false;
                return;
            }
        }
        int[] iArr = new int[l];
        float[] fArr = new float[l];
        int i = 0;
        float f = -1.0f;
        for (C1060y c1060y : ebVar.mo3332d()) {
            C1061z c1061z2 = (ib) c1060y;
            if (i == 0 || c1061z2.f3131f >= f) {
                fArr[i] = c1061z2.f3131f;
                f = c1061z2.f3131f;
            } else {
                fArr[i] = f;
            }
            m7686d();
            this.f3125e.m7703a(c1061z2);
            C1079s c1079s = (C1079s) this.f3125e.f3134b.f3282V;
            if (c1079s == null) {
                c1079s = C1064c.f3081a;
            }
            iArr[i] = C1070i.m7655a(c1079s.m7788b(), this.f3125e.f3134b.f3283b);
            int i2 = i + 1;
            m7681b();
            i = i2;
        }
        if (a == 0.0f || l == 1) {
            m7681b();
            paint.setColor(iArr[l - 1]);
            return;
        }
        TileMode tileMode = TileMode.CLAMP;
        if (ebVar.f != null) {
            if (ebVar.f == C1072k.reflect) {
                tileMode = TileMode.MIRROR;
            } else if (ebVar.f == C1072k.repeat) {
                tileMode = TileMode.REPEAT;
            }
        }
        m7681b();
        Shader radialGradient = new RadialGradient(a3, a2, a, iArr, fArr, tileMode);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
    }

    /* renamed from: a */
    private void m7679a(boolean z, C1061z c1061z, C1073l c1073l) {
        C1060y e = this.f3129j.m7858e(c1073l.m7717c());
        if (e == null) {
            if (c1073l.m7716b() != null) {
                C1071j.access$000(this.f3125e, z, c1073l.m7716b());
            } else if (z) {
                this.f3125e.f3138f = false;
            } else {
                this.f3125e.f3133a = false;
            }
        } else if (e instanceof db) {
            m7677a(z, c1061z, (db) e);
        } else if (e instanceof eb) {
            m7678a(z, c1061z, (eb) e);
        }
    }

    /* renamed from: b */
    public static final Picture m7680b(wb wbVar, int i, int i2) {
        RectF rectF;
        RectF b = wbVar.m7851b((float) f3119d);
        if (i <= 0 || i2 <= 0) {
            rectF = b;
        } else {
            float min = Math.min(((float) i) / b.width(), ((float) i2) / b.height());
            rectF = new RectF(0.0f, 0.0f, b.width() * min, b.height() * min);
        }
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording((int) Math.ceil((double) rectF.width()), (int) Math.ceil((double) rectF.height()));
        C1070i c1070i = new C1070i();
        c1070i.m7674a(wbVar, beginRecording, rectF, (float) f3119d);
        picture.endRecording();
        c1070i.m7691e();
        return picture;
    }

    /* renamed from: b */
    private void m7681b() {
        this.f3123b.restore();
        this.f3125e = (C1071j) this.f3128i.pop();
    }

    /* renamed from: b */
    private final void m7682b(Path path) {
        if (this.f3125e.f3138f) {
            this.f3123b.drawPath(path, this.f3125e.f3137e);
        }
        if (this.f3125e.f3133a) {
            this.f3123b.drawPath(path, this.f3125e.f3135c);
        }
    }

    /* renamed from: b */
    private void m7683b(C1062e c1062e) {
        m7663a(c1062e);
        for (C1060y a : c1062e.mo3332d()) {
            m7675a(a);
        }
        m7660a();
    }

    /* renamed from: b */
    private final void m7684b(C1061z c1061z) {
        RectF g = c1061z.m7590g();
        if (c1061z.m7579f() != null && g != null) {
            Matrix matrix = new Matrix();
            if (((Matrix) this.f3127g.peek()).invert(matrix)) {
                float[] fArr = new float[]{g.left, g.top, g.right, g.top, g.right, g.bottom, g.left, g.bottom};
                matrix.preConcat(this.f3123b.getMatrix());
                matrix.mapPoints(fArr);
                g = new RectF(fArr[0], fArr[1], fArr[0] * 2.0f, fArr[1] * 2.0f);
                for (int i = 2; i <= 6; i += 2) {
                    if (fArr[i] < g.left) {
                        g.left = fArr[i];
                    }
                    if (fArr[i] > g.right) {
                        g.right = fArr[i];
                    }
                    if (fArr[i + 1] < g.top) {
                        g.top = fArr[i + 1];
                    }
                    if (fArr[i + 1] > g.bottom) {
                        g.bottom = fArr[i + 1];
                    }
                }
                C1061z c1061z2 = (C1061z) this.f3122a.peek();
                if (c1061z2.m7590g() == null) {
                    c1061z2.m7583a(g);
                } else {
                    c1061z2.m7590g().union(g);
                }
            }
        }
    }

    /* renamed from: c */
    private final void m7685c() {
        if (this.f3125e != null) {
            this.f3125e.m7701a();
        } else {
            this.f3125e = new C1071j(this);
        }
        if (this.f3128i != null) {
            this.f3128i.clear();
        } else {
            this.f3128i = new Stack();
        }
        if (this.f3122a != null) {
            this.f3122a.clear();
        } else {
            this.f3122a = new Stack();
        }
        if (this.f3127g != null) {
            this.f3127g.clear();
        } else {
            this.f3127g = new Stack();
        }
        this.f3125e.m7702a(C1084x.m7861c());
        this.f3125e.f3139g = this.f3124c;
        this.f3128i.push((C1071j) this.f3125e.clone());
    }

    /* renamed from: d */
    private void m7686d() {
        this.f3123b.save();
        this.f3128i.push(this.f3125e);
        this.f3125e = (C1071j) this.f3125e.clone();
    }

    /* renamed from: z */
    private static String m7687z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 13;
                    break;
                case 1:
                    i2 = 86;
                    break;
                case 2:
                    i2 = 26;
                    break;
                case 3:
                    i2 = 90;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7688z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 91);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final float m7689a(C1063b c1063b) {
        if (c1063b.m7606b() != C1069h.percent) {
            return m7654a(c1063b, true);
        }
        RectF rectF = this.f3125e.f3136d;
        if (rectF == null) {
            return c1063b.m7607c();
        }
        float width = rectF.width();
        float height = rectF.height();
        if (width == width) {
            return (c1063b.m7607c() * width) / 100.0f;
        }
        return (((float) (Math.sqrt((double) ((height * height) + (width * width))) / 1.414213562373095d)) * c1063b.m7607c()) / 100.0f;
    }

    /* renamed from: a */
    public final float m7690a(C1063b c1063b, float f) {
        return c1063b.m7606b() == C1069h.percent ? (c1063b.m7607c() * f) / 100.0f : m7689a(c1063b);
    }

    /* renamed from: e */
    public void m7691e() {
        this.f3129j = null;
        this.f3123b = null;
        this.f3124c = null;
        if (this.f3125e != null) {
            this.f3125e.m7704b();
            this.f3125e = null;
        }
        if (this.f3128i != null) {
            Iterator it = this.f3128i.iterator();
            while (it.hasNext()) {
                ((C1071j) it.next()).m7704b();
            }
            this.f3128i.clear();
            this.f3128i = null;
        }
        if (this.f3122a != null) {
            this.f3122a.clear();
            this.f3128i = null;
        }
        if (this.f3127g != null) {
            this.f3127g.clear();
            this.f3128i = null;
        }
    }
}
