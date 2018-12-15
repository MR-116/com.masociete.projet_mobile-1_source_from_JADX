package fr.pcsoft.wdjava.ui.champs.slidingmenu.p070a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.p035c.C0665g;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.slidingmenu.C0526d;
import fr.pcsoft.wdjava.ui.champs.slidingmenu.C1269c;

/* renamed from: fr.pcsoft.wdjava.ui.champs.slidingmenu.a.l */
public class C1270l extends RelativeLayout implements C1269c {
    /* renamed from: a */
    public static final int f3746a = 0;
    /* renamed from: c */
    public static final int f3747c = 0;
    /* renamed from: h */
    public static final int f3748h = 0;
    /* renamed from: i */
    public static final int f3749i = 2;
    /* renamed from: j */
    public static final int f3750j = 1;
    /* renamed from: l */
    public static final int f3751l = 1;
    /* renamed from: m */
    public static final int f3752m = 2;
    /* renamed from: n */
    public static final int f3753n = 1;
    /* renamed from: p */
    private static final String f3754p = C1270l.m8823z(C1270l.m8824z("\u0011\u0017\u0012O:,\u001c6N=7"));
    /* renamed from: z */
    private static final String[] f3755z;
    /* renamed from: b */
    private Handler f3756b;
    /* renamed from: d */
    private C1264g f3757d;
    /* renamed from: e */
    private C1263f f3758e;
    /* renamed from: f */
    private boolean f3759f;
    /* renamed from: g */
    private C0526d f3760g;
    /* renamed from: k */
    private C1263f f3761k;
    /* renamed from: o */
    private C0526d f3762o;
    /* renamed from: q */
    private C1274p f3763q;
    /* renamed from: r */
    private C1258a f3764r;

    static {
        r0 = new String[9];
        r0[0] = C1270l.m8823z(C1270l.m8824z("\u0011\u0018\tD?.(\u0018J?'[\u0016^ 6[\u0019Ns \u001e\u000f\\6'\u0015[\u001bs#\u0015\u001f\u000bb"));
        r0[1] = C1270l.m8823z(C1270l.m8824z("\u0016\u0014\u000eH;\u000f\u0014\u001fNs/\u000e\b_s \u001e[X66[\u000fDs'\u0012\u000fC60/4~\u0010\n64o\u0016\u001d=.g\u001f\u00118)n\u0016\f[\u0014Ys\u00164.h\u001b\u000f4?n\f\u000f:)l\u001a\f[\u0014Ys\u00164.h\u001b\u000f4?n\f\f45n}"));
        r0[2] = C1270l.m8823z(C1270l.m8824z("\u0016\u0013\u0012Xs\u0011\u0017\u0012O:,\u001c6N=7[\u001a[#'\u001a\tXs6\u0014[J?0\u001e\u001aO*b\u0019\u001e\u000b26\u000f\u001aH;'\u001f"));
        r0[3] = C1270l.m8823z(C1270l.m8824z("1\u0017\u0012O6\u0011\u000f\u0002G6b\u0016\u000eX'b\u0019\u001e\u000b6+\u000f\u0013N!b(7b\u0017\u000b5<t\u0004\u000b5?d\u0004b\u0014\t\u000b\u0000\u000e2?b\u001d\u0005$8d\u001d\u0016>5"));
        r0[4] = C1270l.m8823z(C1270l.m8824z("\u0017\u0015[X?+\u001f\u0012E4b\u0016\u001eE&b\u001f\tD:6\u001e[Js&\u0011Ës«\u000f\u000b21\b\u0014H:«U"));
        r0[5] = C1270l.m8823z(C1270l.m8824z("\u0017\u0015[X?+\u001f\u0012E4b\u0016\u001eE&b\u001c\u001a^0*\u001e[Js&\u0011Ës«\u000f\u000b21\b\u0014H:«U"));
        r0[6] = C1270l.m8823z(C1270l.m8824z("%\u001e\u000fx:8\u001e"));
        r0[7] = C1270l.m8823z(C1270l.m8824z("5\u0012\u0015O<5"));
        r0[8] = C1270l.m8823z(C1270l.m8824z("\u0011\u0017\u0012O:,\u001c6N=7[\u0016D7'[\u0016^ 6[\u0019Ns\u000e>=b)2l\u001b\u0016W[D!b7>m\u0007\u001d)2l\u001b\u0016"));
        f3755z = r0;
    }

    public C1270l(Activity activity, int i) {
        this((Context) activity, null);
    }

    public C1270l(Context context) {
        this(context, null);
    }

    public C1270l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1270l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3759f = false;
        this.f3760g = null;
        this.f3762o = null;
        this.f3756b = new Handler();
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.f3757d = new C1264g(context);
        addView(this.f3757d, layoutParams);
        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.f3764r = new C1258a(context);
        addView(this.f3764r, layoutParams);
        this.f3764r.m8729a(this.f3757d);
        this.f3757d.m8771a(this.f3764r);
        this.f3757d.m8773a(this);
        this.f3764r.m8736b(new C1268k(this));
        m8871g(1);
        m8844b(0);
        m8898s(0);
        m8859d(true);
        m8843b(0.33f);
        m8855c(false);
    }

    public C1270l(WDFenetre wDFenetre) {
        this(wDFenetre.getActivite());
        if (wDFenetre.isAvecBarreSystemeExt()) {
            this.f3757d.setPadding(0, WDFenetre.Cd, 0, 0);
        }
    }

    /* renamed from: z */
    private static String m8823z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 66;
                    break;
                case 1:
                    i2 = 123;
                    break;
                case 2:
                    i2 = 123;
                    break;
                case 3:
                    i2 = 43;
                    break;
                default:
                    i2 = 83;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8824z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 83);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0526d mo3509a(int i) {
        switch (i) {
            case 0:
                try {
                    return this.f3760g;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case 1:
                return this.f3762o;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public void m8826a(float f) {
        int i = 0;
        try {
            if (VERSION.SDK_INT >= 11) {
                int i2 = (f <= 0.0f || f >= 1.0f) ? 0 : 1;
                if (i2 != 0) {
                    i = 2;
                }
                try {
                    if (i != C1014a.m7327b().mo3286a(m8900u())) {
                        this.f3756b.post(new C1261d(this, i));
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (C0665g e2) {
                }
            }
        } catch (C0665g e3) {
            throw e3;
        }
    }

    /* renamed from: a */
    public void m8827a(Activity activity, int i, int i2) {
        m8828a(activity, i, false, i2);
    }

    /* renamed from: a */
    public void m8828a(Activity activity, int i, boolean z, int i2) {
        if (i == 0 || i == 1) {
            try {
                if (getParent() != null) {
                    throw new IllegalStateException(f3755z[2]);
                }
                ViewGroup viewGroup;
                View view;
                switch (i) {
                    case 0:
                        this.f3759f = false;
                        viewGroup = (ViewGroup) activity.getWindow().getDecorView();
                        view = (ViewGroup) viewGroup.getChildAt(0);
                        view.setBackgroundColor(i2);
                        viewGroup.removeView(view);
                        viewGroup.addView(this, view.getLayoutParams());
                        m8846b(view);
                        return;
                    case 1:
                        this.f3759f = z;
                        viewGroup = (ViewGroup) activity.findViewById(16908290);
                        view = viewGroup.getChildAt(0);
                        viewGroup.removeView(view);
                        viewGroup.addView(this);
                        m8846b(view);
                        view.setBackgroundColor(i2);
                        return;
                    default:
                        return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            throw new IllegalArgumentException(f3755z[3]);
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public void mo3510a(Activity activity, View view, int i) {
        try {
            if (getParent() == null) {
                m8827a(activity, 0, i);
            }
            View findViewById = activity.findViewById(16908290);
            if (findViewById != null) {
                try {
                    if (findViewById instanceof ViewGroup) {
                        ((ViewGroup) findViewById).addView(view);
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public void m8830a(Bitmap bitmap) {
        this.f3757d.m8765a(bitmap);
    }

    /* renamed from: a */
    public void m8831a(Drawable drawable) {
        this.f3757d.m8766a(drawable);
    }

    /* renamed from: a */
    public void m8832a(View view) {
        this.f3757d.m8798e(view);
    }

    /* renamed from: a */
    public void mo3511a(WDFenetre wDFenetre) {
        Point a = C1014a.m7327b().mo3295a(false);
        int i = a.x;
        int i2 = a.y;
        if (!wDFenetre.isSystemBarTransparent()) {
            i2 -= wDFenetre.getHauteurBarreSysteme();
        }
        if (this.f3760g != null) {
            m8884l(Math.max(0, i - this.f3760g.onLayout(i, i2)));
        }
        if (this.f3762o != null) {
            i2 = Math.max(0, i - this.f3762o.onLayout(i, i2));
            try {
                if (this.f3760g != null) {
                    m8878i(i2);
                } else {
                    m8884l(i2);
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    /* renamed from: a */
    public void m8834a(C1260c c1260c) {
        this.f3764r.m8728a(c1260c);
    }

    /* renamed from: a */
    public void m8835a(C1263f c1263f) {
        this.f3758e = c1263f;
    }

    /* renamed from: a */
    public void m8836a(C1267j c1267j) {
        this.f3757d.m8772a(c1267j);
    }

    /* renamed from: a */
    public void m8837a(C1271m c1271m) {
        this.f3764r.m8730a(c1271m);
    }

    /* renamed from: a */
    public void m8838a(C1274p c1274p) {
        this.f3763q = c1274p;
    }

    /* renamed from: a */
    public void mo3512a(C0526d c0526d) {
        try {
            switch (c0526d.getPosition()) {
                case 0:
                    m8887n();
                    return;
                case 1:
                    try {
                        if (this.f3757d.m8796e() == 2) {
                            m8893q();
                            return;
                        } else {
                            m8887n();
                            return;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                default:
                    return;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public void m8840a(boolean z) {
        try {
            if (m8890o()) {
                m8865e(z);
            } else {
                m8872g(z);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public boolean mo3513a() {
        try {
            if (!m8890o()) {
                return false;
            }
            m8879j();
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: b */
    public void mo3514b() {
        try {
            if (this.f3760g != null) {
                this.f3760g.release();
                this.f3760g = null;
            }
            try {
                if (this.f3762o != null) {
                    this.f3762o.release();
                    this.f3762o = null;
                }
                try {
                    if (this.f3764r != null) {
                        this.f3764r.m8748i();
                        this.f3764r = null;
                    }
                    try {
                        if (this.f3757d != null) {
                            this.f3757d.m8793d();
                            this.f3757d = null;
                        }
                        this.f3758e = null;
                        this.f3761k = null;
                        this.f3763q = null;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    /* renamed from: b */
    public void m8843b(float f) {
        this.f3757d.m8794d(f);
    }

    /* renamed from: b */
    public void m8844b(int i) {
        if (i == 1 || i == 0 || i == 2) {
            this.f3757d.m8797e(i);
            return;
        }
        try {
            throw new IllegalStateException(f3755z[1]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: b */
    public void m8845b(Drawable drawable) {
        this.f3757d.m8783b(drawable);
    }

    /* renamed from: b */
    public void m8846b(View view) {
        this.f3764r.m8727a(view);
        m8879j();
    }

    /* renamed from: b */
    public void m8847b(C1263f c1263f) {
        this.f3761k = c1263f;
    }

    /* renamed from: b */
    public void mo3515b(C0526d c0526d) {
        try {
            switch (c0526d.getPosition()) {
                case 1:
                    m8864e(c0526d);
                    return;
                default:
                    m8869f(c0526d);
                    return;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: b */
    public void m8849b(boolean z) {
        if (z) {
            try {
                m8870f(false);
                this.f3764r.m8729a(null);
                this.f3764r.m8741d(1);
                return;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.f3764r.m8741d(1);
        this.f3764r.m8729a(this.f3757d);
        m8870f(true);
    }

    /* renamed from: c */
    public void mo3516c() {
        C0526d a = mo3509a(1);
        if (a != null) {
            try {
                mo3512a(a);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    /* renamed from: c */
    public void m8851c(float f) {
        if (f >= 0.0f || f <= 1.0f) {
            this.f3757d.m8782b(f);
            return;
        }
        try {
            throw new IllegalStateException(f3755z[0]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: c */
    public void m8852c(int i) {
        this.f3757d.m8765a(BitmapFactory.decodeResource(getResources(), i));
    }

    /* renamed from: c */
    public void m8853c(View view) {
        this.f3757d.m8767a(view);
    }

    /* renamed from: c */
    public void mo3517c(C0526d c0526d) {
        m8879j();
    }

    /* renamed from: c */
    public void m8855c(boolean z) {
        this.f3757d.m8790c(true);
    }

    /* renamed from: d */
    public void mo3518d() {
        C0526d a = mo3509a(0);
        if (a != null) {
            try {
                mo3512a(a);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    /* renamed from: d */
    public void m8857d(int i) {
        this.f3757d.m8788c(i);
    }

    /* renamed from: d */
    public void m8858d(View view) {
        this.f3764r.m8740c(view);
    }

    /* renamed from: d */
    public void m8859d(boolean z) {
        this.f3757d.m8785b(z);
    }

    /* renamed from: d */
    public boolean mo3519d(C0526d c0526d) {
        try {
            switch (c0526d.getPosition()) {
                case 0:
                    return m8890o();
                case 1:
                    try {
                        return this.f3757d.m8796e() == 2 ? m8882k() : m8890o();
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                default:
                    return false;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* renamed from: e */
    public int m8861e() {
        return this.f3764r.m8755s();
    }

    /* renamed from: e */
    public void m8862e(int i) {
        int i2;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService(f3755z[7])).getDefaultDisplay();
        try {
            Class[] clsArr = new Class[]{Point.class};
            Point point = new Point();
            Display.class.getMethod(f3755z[6], clsArr).invoke(defaultDisplay, new Object[]{point});
            i2 = point.x;
        } catch (Exception e) {
            i2 = defaultDisplay.getWidth();
        }
        m8884l(i2 - i);
    }

    /* renamed from: e */
    public void m8863e(View view) {
        this.f3764r.m8735b(view);
    }

    /* renamed from: e */
    public void m8864e(C0526d c0526d) {
        try {
            try {
                C0691a.m2860a(this.f3762o == null, f3755z[4]);
                this.f3762o = c0526d;
                if (this.f3760g != null) {
                    m8868f((View) this.f3762o.getUIComp());
                    m8875h(2);
                    return;
                }
                m8832a((View) this.f3762o.getUIComp());
                m8875h(1);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* renamed from: e */
    public void m8865e(boolean z) {
        this.f3764r.m8724a(1, z);
    }

    /* renamed from: f */
    public int m8866f() {
        return this.f3757d.m8803h();
    }

    /* renamed from: f */
    public void m8867f(int i) {
        m8831a(getContext().getResources().getDrawable(i));
    }

    /* renamed from: f */
    public void m8868f(View view) {
        this.f3757d.m8789c(view);
    }

    /* renamed from: f */
    public void m8869f(C0526d c0526d) {
        try {
            try {
                C0691a.m2860a(this.f3760g == null, f3755z[5]);
                this.f3760g = c0526d;
                if (this.f3762o != null) {
                    m8868f((View) this.f3762o.getUIComp());
                    m8832a((View) this.f3760g.getUIComp());
                    m8875h(2);
                    return;
                }
                m8832a((View) this.f3760g.getUIComp());
                m8875h(0);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* renamed from: f */
    public void m8870f(boolean z) {
        this.f3764r.m8731a(z);
    }

    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    /* renamed from: g */
    public void m8871g(int i) {
        if (i == 1 || i == 0 || i == 2) {
            this.f3764r.m8745f(i);
            return;
        }
        try {
            throw new IllegalStateException(f3755z[1]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: g */
    public void m8872g(boolean z) {
        this.f3764r.m8724a(0, z);
    }

    /* renamed from: g */
    public boolean m8873g() {
        return this.f3764r.m8747h();
    }

    /* renamed from: h */
    public final C0526d m8874h() {
        return this.f3760g;
    }

    /* renamed from: h */
    public void m8875h(int i) {
        if (i == 0 || i == 1 || i == 2) {
            this.f3757d.m8800f(i);
            return;
        }
        try {
            throw new IllegalStateException(f3755z[8]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: h */
    public void m8876h(boolean z) {
        this.f3764r.m8724a(2, z);
    }

    /* renamed from: i */
    public View m8877i() {
        return this.f3757d.m8787c();
    }

    /* renamed from: i */
    public void m8878i(int i) {
        this.f3757d.m8795d(i);
    }

    /* renamed from: j */
    public void m8879j() {
        m8865e(true);
    }

    /* renamed from: j */
    public void m8880j(int i) {
        m8868f(LayoutInflater.from(getContext()).inflate(i, null));
    }

    /* renamed from: k */
    public void m8881k(int i) {
        this.f3764r.m8739c(i);
    }

    /* renamed from: k */
    public boolean m8882k() {
        try {
            return this.f3764r.m8743e() == 2;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: l */
    public final C0526d m8883l() {
        return this.f3762o;
    }

    /* renamed from: l */
    public void m8884l(int i) {
        this.f3757d.m8764a(i);
    }

    /* renamed from: m */
    public void m8885m() {
        m8840a(true);
    }

    /* renamed from: m */
    public void m8886m(int i) {
        m8881k((int) getContext().getResources().getDimension(i));
    }

    /* renamed from: n */
    public void m8887n() {
        m8872g(true);
    }

    /* renamed from: n */
    public void m8888n(int i) {
        m8845b(getContext().getResources().getDrawable(i));
    }

    /* renamed from: o */
    public void m8889o(int i) {
        m8862e((int) getContext().getResources().getDimension(i));
    }

    /* renamed from: o */
    public boolean m8890o() {
        try {
            if (this.f3764r.m8743e() != 0) {
                if (this.f3764r.m8743e() != 2) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        C1259b c1259b = (C1259b) parcelable;
        super.onRestoreInstanceState(c1259b.getSuperState());
        this.f3764r.m8741d(c1259b.m8756a());
    }

    protected Parcelable onSaveInstanceState() {
        return new C1259b(super.onSaveInstanceState(), this.f3764r.m8743e());
    }

    /* renamed from: p */
    public void m8891p() {
        this.f3764r.m8750k();
    }

    /* renamed from: p */
    public void m8892p(int i) {
        m8884l((int) getContext().getResources().getDimension(i));
    }

    /* renamed from: q */
    public void m8893q() {
        m8876h(true);
    }

    /* renamed from: q */
    public void m8894q(int i) {
        m8846b(LayoutInflater.from(getContext()).inflate(i, null));
    }

    /* renamed from: r */
    public int m8895r() {
        return ((RelativeLayout.LayoutParams) this.f3757d.getLayoutParams()).rightMargin;
    }

    /* renamed from: r */
    public void m8896r(int i) {
        m8898s((int) getResources().getDimension(i));
    }

    /* renamed from: s */
    public View m8897s() {
        return this.f3757d.m8781b();
    }

    /* renamed from: s */
    public void m8898s(int i) {
        this.f3757d.m8802g(i);
    }

    /* renamed from: t */
    public float m8899t() {
        return this.f3757d.m8801g();
    }

    /* renamed from: u */
    public View m8900u() {
        return this.f3764r.m8751m();
    }

    /* renamed from: v */
    public int m8901v() {
        return this.f3757d.m8796e();
    }
}
