package fr.pcsoft.wdjava.ui.p065b.p067a;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.support.v4.media.session.PlaybackStateCompat;
import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.j */
final class C1071j implements Cloneable {
    /* renamed from: z */
    private static final String[] f3132z = new String[]{C1071j.m7699z(C1071j.m7700z("JVHGc")), C1071j.m7699z(C1071j.m7700z("ZFH]lOV")), C1071j.m7699z(C1071j.m7700z("T\\TAvIRYK")), C1071j.m7699z(C1071j.m7700z("JRT](JVHGc")), C1071j.m7699z(C1071j.m7700z("_RTZdJJ")), C1071j.m7699z(C1071j.m7700z("p^JAvJZXB`\u0019W_\u000efU\\TKw\u0019__\u000efV]NK}MV\u001aIwXCRGtLV\u0014"))};
    /* renamed from: a */
    public boolean f3133a = false;
    /* renamed from: b */
    public C1084x f3134b;
    /* renamed from: c */
    public Paint f3135c = null;
    /* renamed from: d */
    public RectF f3136d;
    /* renamed from: e */
    public Paint f3137e = null;
    /* renamed from: f */
    public boolean f3138f = false;
    /* renamed from: g */
    public RectF f3139g;
    final C1070i this$0;

    public C1071j(C1070i c1070i) {
        this.this$0 = c1070i;
        m7701a();
    }

    /* renamed from: a */
    private Typeface m7697a(String str, int i, int i2) {
        int i3 = (i2 & 2) > 0 ? 1 : 0;
        int i4 = (i > 500 ? 1 : 0) != 0 ? i3 != 0 ? 3 : 1 : i3 != 0 ? 2 : 0;
        return str.equals(f3132z[0]) ? Typeface.create(Typeface.SERIF, i4) : str.equals(f3132z[3]) ? Typeface.create(Typeface.SANS_SERIF, i4) : str.equals(f3132z[2]) ? Typeface.create(Typeface.MONOSPACE, i4) : str.equals(f3132z[1]) ? Typeface.create(Typeface.SANS_SERIF, i4) : str.equals(f3132z[4]) ? Typeface.create(Typeface.SANS_SERIF, i4) : null;
    }

    /* renamed from: a */
    private void m7698a(boolean z, C1064c c1064c) {
        C1064c c1064c2 = c1064c == C1064c.f3082b ? this.f3134b.f3285i : c1064c;
        if (c1064c2 instanceof C1079s) {
            int access$100 = C1070i.m7655a(((C1079s) c1064c2).m7788b(), z ? this.f3134b.f3288p : this.f3134b.f3292x);
            if (z) {
                this.f3137e.setColor(access$100);
            } else {
                this.f3135c.setColor(access$100);
            }
        }
    }

    static void access$000(C1071j c1071j, boolean z, C1064c c1064c) {
        c1071j.m7698a(z, c1064c);
    }

    /* renamed from: z */
    private static String m7699z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 57;
                    break;
                case 1:
                    i2 = 51;
                    break;
                case 2:
                    i2 = 58;
                    break;
                case 3:
                    i2 = 46;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7700z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 5);
        }
        return toCharArray;
    }

    /* renamed from: a */
    final void m7701a() {
        this.f3138f = false;
        if (this.f3137e == null) {
            this.f3137e = new Paint();
        } else {
            this.f3137e.reset();
        }
        this.f3137e.setFlags(385);
        this.f3137e.setStyle(Style.FILL);
        this.f3137e.setTypeface(Typeface.DEFAULT);
        this.f3133a = false;
        if (this.f3135c == null) {
            this.f3135c = new Paint();
        } else {
            this.f3135c.reset();
        }
        this.f3135c.setFlags(385);
        this.f3135c.setStyle(Style.STROKE);
        this.f3135c.setTypeface(Typeface.DEFAULT);
        this.f3134b = C1084x.m7861c();
        this.f3139g = null;
        this.f3136d = null;
    }

    /* renamed from: a */
    final void m7702a(C1084x c1084x) {
        float a;
        int i = 0;
        if (c1084x.m7875a((long) PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
            this.f3134b.f3285i = c1084x.f3285i;
        }
        if (c1084x.m7875a((long) PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)) {
            this.f3134b.f3293z = c1084x.f3293z;
            this.f3134b.f3288p = c1084x.f3293z;
            this.f3134b.f3292x = c1084x.f3293z;
        }
        if (c1084x.m7875a(1)) {
            this.f3134b.f3280T = c1084x.f3280T;
            this.f3138f = c1084x.f3280T != null;
        }
        if (c1084x.m7875a(2)) {
            this.f3134b.f3288p = c1084x.f3288p;
        }
        if (c1084x.m7875a(3075)) {
            m7698a(true, this.f3134b.f3280T);
        }
        if (c1084x.m7875a(4)) {
            this.f3134b.f3279S = c1084x.f3279S;
            this.f3133a = c1084x.f3279S != null;
        }
        if (c1084x.m7875a(8)) {
            this.f3134b.f3292x = c1084x.f3292x;
        }
        if (c1084x.m7875a(3084)) {
            m7698a(false, this.f3134b.f3279S);
        }
        if (c1084x.m7875a(16)) {
            this.f3134b.f3290v = c1084x.f3290v;
            this.f3135c.setStrokeWidth(this.this$0.m7689a(c1084x.f3290v));
        }
        if (c1084x.m7875a(32)) {
            this.f3134b.f3286l = c1084x.f3286l;
            switch (C1078r.f3212a[c1084x.f3286l.ordinal()]) {
                case 1:
                    this.f3135c.setStrokeCap(Cap.BUTT);
                    break;
                case 2:
                    this.f3135c.setStrokeCap(Cap.ROUND);
                    break;
                case 3:
                    this.f3135c.setStrokeCap(Cap.SQUARE);
                    break;
            }
        }
        if (c1084x.m7875a(64)) {
            this.f3134b.f3278Q = c1084x.f3278Q;
            switch (C1078r.f3214c[c1084x.f3278Q.ordinal()]) {
                case 1:
                    this.f3135c.setStrokeJoin(Join.MITER);
                    break;
                case 2:
                    this.f3135c.setStrokeJoin(Join.ROUND);
                    break;
                case 3:
                    this.f3135c.setStrokeJoin(Join.BEVEL);
                    break;
            }
        }
        if (c1084x.m7875a(128)) {
            this.f3134b.f3272A = c1084x.f3272A;
            this.f3135c.setStrokeMiter(c1084x.f3272A);
        }
        if (c1084x.m7875a(256)) {
            this.f3134b.f3273B = c1084x.f3273B;
        }
        if (c1084x.m7875a(512)) {
            this.f3134b.f3281U = c1084x.f3281U;
        }
        if (c1084x.m7875a(768)) {
            if (this.f3134b.f3273B == null) {
                this.f3135c.setPathEffect(null);
            } else {
                int length = this.f3134b.f3273B.length;
                if (length % 2 != 0) {
                    length *= 2;
                }
                float[] fArr = new float[length];
                float f = 0.0f;
                while (i < length) {
                    fArr[i] = this.this$0.m7689a(this.f3134b.f3273B[i % length]);
                    f += fArr[i];
                    i++;
                }
                if (f == 0.0f) {
                    this.f3135c.setPathEffect(null);
                } else {
                    a = this.this$0.m7689a(this.f3134b.f3281U);
                    if (a < 0.0f) {
                        a = (a % f) + f;
                    }
                    this.f3135c.setPathEffect(new DashPathEffect(fArr, a));
                }
            }
        }
        if (c1084x.m7875a((long) PlaybackStateCompat.ACTION_PLAY_FROM_URI)) {
            a = this.f3137e.getTextSize();
            this.f3134b.f3276K = c1084x.f3276K;
            this.f3137e.setTextSize(this.this$0.m7690a(c1084x.f3276K, a));
            this.f3135c.setTextSize(this.this$0.m7690a(c1084x.f3276K, a));
        }
        if (c1084x.m7875a((long) PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
            this.f3134b.f3275D = c1084x.f3275D;
        }
        if (c1084x.m7875a((long) PlaybackStateCompat.ACTION_PREPARE)) {
            C1084x c1084x2;
            if (c1084x.f3287m == -1 && this.f3134b.f3287m > 100) {
                c1084x2 = this.f3134b;
                c1084x2.f3287m -= 100;
            } else if (c1084x.f3287m != 1 || this.f3134b.f3287m >= 900) {
                this.f3134b.f3287m = c1084x.f3287m;
            } else {
                c1084x2 = this.f3134b;
                c1084x2.f3287m += 100;
            }
        }
        if (c1084x.m7875a((long) PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
            this.f3134b.f3291w = c1084x.f3291w;
        }
        if (c1084x.m7875a(53248)) {
            Typeface typeface;
            if (this.f3134b.f3275D != null) {
                typeface = null;
                for (String a2 : this.f3134b.f3275D) {
                    typeface = m7697a(a2, this.f3134b.f3287m, this.f3134b.f3291w);
                    if (typeface != null) {
                    }
                }
            } else {
                typeface = null;
            }
            if (typeface == null) {
                typeface = m7697a(f3132z[3], this.f3134b.f3287m, this.f3134b.f3291w);
            }
            this.f3137e.setTypeface(typeface);
            this.f3135c.setTypeface(typeface);
        }
        if (c1084x.m7875a((long) PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) {
            this.f3134b.f3277P = c1084x.f3277P;
        }
        if (c1084x.m7875a((long) PlaybackStateCompat.ACTION_PREPARE_FROM_URI)) {
            this.f3134b.f3289q = c1084x.f3289q;
        }
        if (c1084x.m7875a((long) PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
            this.f3134b.f3274C = c1084x.f3274C;
        }
        if (c1084x.m7875a((long) PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
            this.f3134b.f3282V = c1084x.f3282V;
        }
        if (c1084x.m7875a((long) PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
            this.f3134b.f3283b = c1084x.f3283b;
        }
    }

    /* renamed from: a */
    final void m7703a(C1061z c1061z) {
        this.f3134b.m7886d();
        C1084x h = c1061z.m7591h();
        if (h != null) {
            m7702a(h);
        }
    }

    /* renamed from: b */
    public void m7704b() {
        this.f3134b = null;
        this.f3137e = null;
        this.f3135c = null;
        this.f3136d = null;
        this.f3139g = null;
    }

    protected Object clone() {
        try {
            C1071j c1071j = (C1071j) super.clone();
            c1071j.f3134b = (C1084x) this.f3134b.clone();
            c1071j.f3137e = new Paint(this.f3137e);
            c1071j.f3135c = new Paint(this.f3135c);
            return c1071j;
        } catch (Exception e) {
            C0691a.m2857a(f3132z[5], e);
            return new C1071j(this.this$0);
        }
    }
}
