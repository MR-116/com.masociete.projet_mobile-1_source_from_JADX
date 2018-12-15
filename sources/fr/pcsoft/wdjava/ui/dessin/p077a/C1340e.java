package fr.pcsoft.wdjava.ui.dessin.p077a;

import android.graphics.DashPathEffect;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.PathEffect;
import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.a.e */
class C1340e extends C1339d {
    /* renamed from: z */
    private static final String f3990z = C1340e.m9623z(C1340e.m9624z("RH\rh\"iW\u0013'#hÎM"));
    /* renamed from: b */
    protected C1359y f3991b = C1359y.MITER;
    /* renamed from: c */
    protected double f3992c = 1.0d;
    /* renamed from: d */
    protected PathEffect f3993d = null;
    /* renamed from: e */
    protected C1355u f3994e = C1355u.CONTINUOUS;
    /* renamed from: f */
    protected C1343g f3995f = C1343g.SQUARE;
    /* renamed from: g */
    protected float f3996g = 10.0f;
    final C1344h this$0;

    public C1340e(C1344h c1344h, double d) {
        this.this$0 = c1344h;
        super(c1344h);
        this.f3992c = d;
    }

    public C1340e(C1344h c1344h, double d, C1343g c1343g, C1359y c1359y, float f, C1355u c1355u) {
        this.this$0 = c1344h;
        super(c1344h);
        this.f3992c = d;
        this.f3995f = c1343g;
        this.f3991b = c1359y;
        this.f3996g = f;
        this.f3994e = c1355u;
        switch (C1335a.f3981a[this.f3994e.ordinal()]) {
            case 1:
                this.f3993d = new DashPathEffect(new float[]{18.0f, 6.0f}, 0.0f);
                return;
            case 2:
                this.f3993d = new DashPathEffect(new float[]{3.0f, 6.0f}, 0.0f);
                return;
            case 3:
                this.f3993d = new DashPathEffect(new float[]{3.0f, 3.0f}, 0.0f);
                return;
            case 4:
                this.f3993d = new DashPathEffect(new float[]{9.0f, 6.0f, 3.0f, 6.0f}, 0.0f);
                return;
            case 5:
                this.f3993d = new DashPathEffect(new float[]{9.0f, 3.0f, 3.0f, 3.0f, 3.0f, 3.0f}, 0.0f);
                return;
            case 6:
            case 7:
                return;
            default:
                C0691a.m2856a(f3990z);
                return;
        }
    }

    /* renamed from: z */
    private static String m9623z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 28;
                    break;
                case 1:
                    i2 = 39;
                    break;
                case 2:
                    i2 = 99;
                    break;
                case 3:
                    i2 = 72;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9624z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 81);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3683a() {
        this.f3993d = null;
    }

    /* renamed from: c */
    public double mo3684c() {
        return this.f3992c;
    }

    /* renamed from: d */
    public void mo3685d() {
        switch (C1335a.f3982b[this.f3995f.ordinal()]) {
            case 1:
                this.this$0.f4000f.setStrokeCap(Cap.BUTT);
                break;
            case 2:
                this.this$0.f4000f.setStrokeCap(Cap.ROUND);
                break;
            default:
                this.this$0.f4000f.setStrokeCap(Cap.SQUARE);
                break;
        }
        switch (C1335a.f3983c[this.f3991b.ordinal()]) {
            case 1:
                this.this$0.f4000f.setStrokeJoin(Join.BEVEL);
                break;
            case 2:
                this.this$0.f4000f.setStrokeJoin(Join.ROUND);
                break;
            default:
                this.this$0.f4000f.setStrokeJoin(Join.MITER);
                break;
        }
        this.this$0.f4000f.setStrokeWidth((float) this.this$0.m9641a(this.f3992c <= 1.0d ? 0.0d : this.f3992c));
        this.this$0.f4000f.setStrokeMiter(this.f3996g);
        this.this$0.f4000f.setPathEffect(this.f3993d);
        this.this$0.f4000f.setShader(null);
        this.this$0.f4000f.setAlpha(this.a);
    }

    /* renamed from: e */
    public C1343g mo3686e() {
        return this.f3995f;
    }

    /* renamed from: f */
    public C1359y mo3687f() {
        return this.f3991b;
    }

    /* renamed from: g */
    public C1355u mo3688g() {
        return this.f3994e;
    }
}
