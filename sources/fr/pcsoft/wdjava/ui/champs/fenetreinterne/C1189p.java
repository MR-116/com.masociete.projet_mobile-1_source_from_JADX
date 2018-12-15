package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.KeyEventCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewConfigurationCompat;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v4.view.ViewPager.PageTransformer;
import android.support.v4.widget.EdgeEffectCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import fr.pcsoft.wdjava.core.debug.C0691a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetreinterne.p */
public class C1189p extends ViewGroup implements C1188r {
    /* renamed from: D */
    private static final int f3539D = 2;
    /* renamed from: G */
    private static final Comparator<C1178e> f3540G = new db();
    /* renamed from: H */
    private static final int f3541H = 1;
    /* renamed from: K */
    private static final int f3542K = 2;
    /* renamed from: T */
    private static final int f3543T = 25;
    /* renamed from: W */
    private static final int f3544W = 16;
    private static final int ab = 400;
    /* renamed from: c */
    private static final boolean f3545c = false;
    /* renamed from: d */
    public static final int f3546d = 2;
    private static final Interpolator db = new kb();
    /* renamed from: e */
    private static final int f3547e = 0;
    private static final boolean gb = false;
    /* renamed from: l */
    private static final int[] f3548l = new int[]{16842931};
    private static final int mb = 600;
    public static final int rb = 0;
    /* renamed from: u */
    private static final int f3549u = -1;
    private static final int xb = 1;
    /* renamed from: y */
    private static final C1177d f3550y = new C1177d();
    private static final String yb = C1189p.m8463z(C1189p.m8464z("~<\\c\u0002I2\\f"));
    /* renamed from: z */
    public static final int f3551z = 1;
    private static final String[] zb;
    /* renamed from: A */
    private EdgeEffectCompat f3552A;
    /* renamed from: B */
    private boolean f3553B;
    /* renamed from: C */
    private EdgeEffectCompat f3554C;
    /* renamed from: E */
    private Method f3555E;
    /* renamed from: F */
    private float f3556F = Float.MAX_VALUE;
    /* renamed from: I */
    private PagerAdapter f3557I;
    /* renamed from: J */
    private boolean f3558J;
    /* renamed from: L */
    private int f3559L;
    /* renamed from: M */
    private int f3560M = 0;
    /* renamed from: N */
    private boolean f3561N;
    /* renamed from: O */
    private OnPageChangeListener f3562O;
    /* renamed from: P */
    private Drawable f3563P;
    /* renamed from: Q */
    private final ArrayList<C1178e> f3564Q = new ArrayList();
    /* renamed from: R */
    private boolean f3565R = false;
    /* renamed from: S */
    private boolean f3566S;
    /* renamed from: U */
    private int f3567U;
    /* renamed from: V */
    private int f3568V;
    /* renamed from: X */
    private boolean f3569X;
    /* renamed from: Y */
    private long f3570Y;
    /* renamed from: Z */
    private Parcelable f3571Z = null;
    /* renamed from: a */
    private Scroller f3572a;
    /* renamed from: b */
    private float f3573b;
    private ArrayList<View> bb;
    private boolean cb;
    private PageTransformer eb;
    /* renamed from: f */
    private float f3574f;
    private float fb;
    /* renamed from: g */
    private int f3575g;
    /* renamed from: h */
    private int f3576h;
    private boolean hb;
    /* renamed from: i */
    private boolean f3577i = true;
    private int ib;
    /* renamed from: j */
    private int f3578j;
    private int jb;
    /* renamed from: k */
    private int f3579k;
    private final C1178e kb = new C1178e();
    private ab lb;
    /* renamed from: m */
    private float f3580m = -3.4028235E38f;
    /* renamed from: n */
    private int f3581n;
    private ClassLoader nb = null;
    /* renamed from: o */
    private float f3582o;
    private int ob;
    /* renamed from: p */
    private int f3583p;
    private int pb;
    /* renamed from: q */
    private int f3584q;
    private int qb;
    /* renamed from: r */
    private int f3585r = -1;
    /* renamed from: s */
    private VelocityTracker f3586s;
    private final Rect sb = new Rect();
    /* renamed from: t */
    private bb f3587t;
    private boolean tb = true;
    private OnPageChangeListener ub;
    /* renamed from: v */
    private int f3588v = -1;
    private final Runnable vb = new C1184l(this);
    /* renamed from: w */
    private boolean f3589w;
    private int wb;
    /* renamed from: x */
    private int f3590x = 1;

    static {
        r0 = new String[16];
        r0[0] = C1189p.m8463z(C1189p.m8464z("m'K{ \b6Qu<O<WsrK=Px6Z0W46Z4N}<OuVf6M'"));
        r0[1] = C1189p.m8463z(C1189p.m8464z("[0MW:A9]f7F\u0011Ku%A;^[ L0KQ<I7Uq6"));
        r0[2] = C1189p.m8463z(C1189p.m8464z("k4W3&\b3Pz6\b&\\`\u0011@<Up M;}f3_<Ws\u001dZ1\\f\u0017F4[x7L"));
        r0[3] = C1189p.m8463z(C1189p.m8464z("f:\u0019r3C0\u0019p I2\u0019}<\b%K{5Z0Jg|\b\u0016Xx>\b7\\s;F\u0013X7l'XsrN<Kg&\u0006"));
        r0[4] = C1189p.m8463z(C1189p.m8464z("G;iu5M\u0006Zf=D9\\prL<]4<G!\u0019w3D9\u0019g'X0Kw>I&J4;E%Uq?M;Mu&A:W"));
        r0[5] = C1189p.m8463z(C1189p.m8464z("e<JqrÈuS{'Zu]arE:]ü>MuKq#]<Jq|"));
        r0[6] = C1189p.m8463z(C1189p.m8464z("I'K{%{6K{>DuMf;M1\u0019`=\b3Pz6\b3Vw'[u[u!M1\u0019{<\b;VzK=Px6\b6Lf M;M44G6Lg7LuO}7_u"));
        r0[7] = C1189p.m8463z(C1189p.m8464z("\bh\u00074"));
        r0[8] = C1189p.m8463z(C1189p.m8464z("\b\u0005Xs7ZuZx3[&\u00034"));
        r0[9] = C1189p.m8463z(C1189p.m8464z("\b\u0005K{0D0Tu&A6\u0019u6I%Mq \u0012u"));
        r0[10] = C1189p.m8463z(C1189p.m8464z("\b\u0005Xs7ZuPph\b"));
        r0[11] = C1189p.m8463z(C1189p.m8464z("|=\\43X%U}1I!P{<\u000f&\u0019D3O0KU6I%Mq \b6Qu<O0]4&@0\u0019u6I%Mq \u000f&\u0019w=F!\\z&[uN}&@:L`rK4Ux;F2\u0019D3O0KU6I%Mq \u000b;V`;N,}u&I\u0006\\`\u0011@4Ws7Lt\u0019Q*X0Z`7LuXp3X!\\frA!\\yrK:Lz&\u0012u"));
        r0[12] = C1189p.m8463z(C1189p.m8464z("\u0004u_{'F1\u00034"));
        r0[13] = C1189p.m8463z(C1189p.m8464z("z0Ha7[!\\prG3_g1Z0\\zrX4^qrD<T}&\b"));
        r0[14] = C1189p.m8463z(C1189p.m8464z("\b!V{r[8Xx>\u0013u]q4I U`;F2\u0019`=\b"));
        r0[15] = C1189p.m8463z(C1189p.m8464z("k4Wz=\\uXp6\b%Xs7Zu]q1G'\u0019b;M\"\u0019p'Z<WsrD4@{'\\"));
        zb = r0;
    }

    public C1189p(Context context) {
        super(context);
        m8487d();
    }

    public C1189p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8487d();
    }

    /* renamed from: a */
    private int m8444a(int i, float f, int i2, int i3) {
        try {
            if (Math.abs(i3) > this.qb) {
                if (Math.abs(i2) > this.f3568V) {
                    if (i2 <= 0) {
                        i++;
                    }
                    if (this.f3564Q.size() > 0) {
                        return i;
                    }
                    return Math.max(((C1178e) this.f3564Q.get(0)).f3532d, Math.min(i, ((C1178e) this.f3564Q.get(this.f3564Q.size() - 1)).f3532d));
                }
            }
            try {
                i = (int) ((i >= this.f3579k ? 0.4f : 0.6f) + (((float) i) + f));
                if (this.f3564Q.size() > 0) {
                    return i;
                }
                return Math.max(((C1178e) this.f3564Q.get(0)).f3532d, Math.min(i, ((C1178e) this.f3564Q.get(this.f3564Q.size() - 1)).f3532d));
            } catch (NotFoundException e) {
                throw e;
            }
        } catch (NotFoundException e2) {
            throw e2;
        } catch (NotFoundException e22) {
            try {
                throw e22;
            } catch (NotFoundException e222) {
                throw e222;
            }
        }
    }

    /* renamed from: a */
    private Rect m8445a(Rect rect, View view) {
        Rect rect2 = rect == null ? new Rect() : rect;
        if (view == null) {
            try {
                rect2.set(0, 0, 0, 0);
                return rect2;
            } catch (NotFoundException e) {
                throw e;
            }
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        C1189p parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            try {
                ViewGroup viewGroup = parent;
                rect2.left += viewGroup.getLeft();
                rect2.right += viewGroup.getRight();
                rect2.top += viewGroup.getTop();
                rect2.bottom += viewGroup.getBottom();
                parent = viewGroup.getParent();
            } catch (NotFoundException e2) {
                throw e2;
            }
        }
        return rect2;
    }

    /* renamed from: a */
    private void m8446a(int i, int i2, int i3, int i4) {
        float paddingTop;
        if (i2 > 0) {
            try {
                if (!this.f3564Q.isEmpty()) {
                    paddingTop = (float) (((i - getPaddingTop()) - getPaddingBottom()) + i3);
                    int scrollY = (int) (paddingTop * (((float) getScrollY()) / ((float) (((i2 - getPaddingTop()) - getPaddingBottom()) + i4))));
                    scrollTo(getScrollX(), scrollY);
                    if (!this.f3572a.isFinished()) {
                        int duration = this.f3572a.getDuration() - this.f3572a.timePassed();
                        C1178e h = m8495h(this.f3579k);
                        this.f3572a.startScroll(0, scrollY, 0, (int) (h.f3529a * ((float) i)), duration);
                        return;
                    }
                    return;
                }
            } catch (NotFoundException e) {
                throw e;
            }
        }
        C1178e h2 = m8495h(this.f3579k);
        if (h2 != null) {
            try {
                paddingTop = Math.min(h2.f3529a, this.f3556F);
            } catch (NotFoundException e2) {
                throw e2;
            }
        }
        paddingTop = 0.0f;
        int paddingTop2 = (int) (paddingTop * ((float) ((i - getPaddingTop()) - getPaddingBottom())));
        try {
            if (paddingTop2 != getScrollY()) {
                m8459f(false);
                scrollTo(getScrollX(), paddingTop2);
            }
        } catch (NotFoundException e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    private void m8447a(int i, boolean z, int i2, boolean z2) {
        int max;
        C1178e h = m8495h(i);
        if (h != null) {
            max = (int) (Math.max(this.f3580m, Math.min(h.f3529a, this.f3556F)) * ((float) m8458f()));
        } else {
            max = 0;
        }
        if (z) {
            try {
                m8470a(0, max, i2);
                if (z2) {
                    if (this.f3562O != null) {
                        this.f3562O.onPageSelected(i);
                    }
                }
                if (z2) {
                    try {
                        if (this.ub != null) {
                            this.ub.onPageSelected(i);
                            return;
                        }
                        return;
                    } catch (NotFoundException e) {
                        throw e;
                    }
                }
                return;
            } catch (NotFoundException e2) {
                throw e2;
            } catch (NotFoundException e22) {
                throw e22;
            }
        }
        if (z2) {
            try {
                if (this.f3562O != null) {
                    this.f3562O.onPageSelected(i);
                }
            } catch (NotFoundException e222) {
                throw e222;
            }
        }
        if (z2) {
            try {
                if (this.ub != null) {
                    this.ub.onPageSelected(i);
                }
            } catch (NotFoundException e2222) {
                throw e2222;
            }
        }
        m8459f(false);
        scrollTo(0, max);
        m8453b(max);
    }

    /* renamed from: a */
    private void m8448a(MotionEvent motionEvent) {
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        try {
            if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.f3585r) {
                actionIndex = actionIndex == 0 ? 1 : 0;
                try {
                    this.f3574f = MotionEventCompat.getY(motionEvent, actionIndex);
                    this.f3585r = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                    if (this.f3586s != null) {
                        this.f3586s.clear();
                    }
                } catch (NotFoundException e) {
                    throw e;
                }
            }
        } catch (NotFoundException e2) {
            throw e2;
        } catch (NotFoundException e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    private void m8449a(C1178e c1178e, int i, C1178e c1178e2) {
        int i2;
        float f;
        int count = this.f3557I.getCount();
        int f2 = m8458f();
        if (f2 > 0) {
            try {
                float f3 = ((float) this.f3583p) / ((float) f2);
            } catch (NotFoundException e) {
                throw e;
            }
        }
        f3 = 0.0f;
        if (c1178e2 != null) {
            i2 = c1178e2.f3532d;
            int i3;
            C1178e c1178e3;
            float f4;
            if (i2 < c1178e.f3532d) {
                f = (c1178e2.f3529a + c1178e2.f3533e) + f3;
                i2++;
                i3 = 0;
                while (i2 <= c1178e.f3532d && i3 < this.f3564Q.size()) {
                    try {
                        c1178e3 = (C1178e) this.f3564Q.get(i3);
                        while (i2 > c1178e3.f3532d && i3 < this.f3564Q.size() - 1) {
                            try {
                                i3++;
                                c1178e3 = (C1178e) this.f3564Q.get(i3);
                            } catch (NotFoundException e2) {
                                throw e2;
                            }
                        }
                        f2 = i2;
                        f4 = f;
                        while (f2 < c1178e3.f3532d) {
                            f4 += this.f3557I.getPageWidth(f2) + f3;
                            f2++;
                        }
                        c1178e3.f3529a = f4;
                        f = (c1178e3.f3533e + f3) + f4;
                        i2 = f2 + 1;
                    } catch (NotFoundException e22) {
                        throw e22;
                    }
                }
            } else if (i2 > c1178e.f3532d) {
                f2 = this.f3564Q.size() - 1;
                f = c1178e2.f3529a;
                i2--;
                i3 = f2;
                while (i2 >= c1178e.f3532d && i3 >= 0) {
                    try {
                        c1178e3 = (C1178e) this.f3564Q.get(i3);
                        while (i2 < c1178e3.f3532d && i3 > 0) {
                            try {
                                i3--;
                                c1178e3 = (C1178e) this.f3564Q.get(i3);
                            } catch (NotFoundException e222) {
                                throw e222;
                            }
                        }
                        f2 = i2;
                        f4 = f;
                        while (f2 > c1178e3.f3532d) {
                            f4 -= this.f3557I.getPageWidth(f2) + f3;
                            f2--;
                        }
                        f = f4 - (c1178e3.f3533e + f3);
                        c1178e3.f3529a = f;
                        i2 = f2 - 1;
                    } catch (NotFoundException e2222) {
                        throw e2222;
                    }
                }
            }
        }
        int size = this.f3564Q.size();
        f = c1178e.f3529a;
        i2 = c1178e.f3532d - 1;
        try {
            try {
                C1178e c1178e4;
                float f5;
                this.f3580m = c1178e.f3532d == 0 ? c1178e.f3529a : -3.4028235E38f;
                this.f3556F = c1178e.f3532d == count + -1 ? (c1178e.f3529a + c1178e.f3533e) - 1.0f : Float.MAX_VALUE;
                int i4 = i - 1;
                while (i4 >= 0) {
                    c1178e4 = (C1178e) this.f3564Q.get(i4);
                    f5 = f;
                    while (i2 > c1178e4.f3532d) {
                        f5 -= this.f3557I.getPageWidth(i2) + f3;
                        i2--;
                    }
                    f = f5 - (c1178e4.f3533e + f3);
                    try {
                        c1178e4.f3529a = f;
                        if (c1178e4.f3532d == 0) {
                            this.f3580m = f;
                        }
                        i2--;
                        i4--;
                    } catch (NotFoundException e22222) {
                        throw e22222;
                    }
                }
                f = (c1178e.f3529a + c1178e.f3533e) + f3;
                i2 = c1178e.f3532d + 1;
                i4 = i + 1;
                while (i4 < size) {
                    c1178e4 = (C1178e) this.f3564Q.get(i4);
                    f5 = f;
                    while (i2 < c1178e4.f3532d) {
                        f5 = (this.f3557I.getPageWidth(i2) + f3) + f5;
                        i2++;
                    }
                    try {
                        if (c1178e4.f3532d == count - 1) {
                            this.f3556F = (c1178e4.f3533e + f5) - 1.0f;
                        }
                        c1178e4.f3529a = f5;
                        f = f5 + (c1178e4.f3533e + f3);
                        i2++;
                        i4++;
                    } catch (NotFoundException e222222) {
                        throw e222222;
                    }
                }
                this.f3565R = false;
            } catch (NotFoundException e2222222) {
                throw e2222222;
            }
        } catch (NotFoundException e22222222) {
            throw e22222222;
        }
    }

    /* renamed from: a */
    private boolean m8450a(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        boolean z3 = false;
        float f3 = this.f3574f - f;
        this.f3574f = f;
        float scrollY = ((float) getScrollY()) + f3;
        int f4 = m8458f();
        float f5 = ((float) f4) * this.f3580m;
        float f6 = ((float) f4) * this.f3556F;
        C1178e c1178e = (C1178e) this.f3564Q.get(0);
        C1178e c1178e2 = (C1178e) this.f3564Q.get(this.f3564Q.size() - 1);
        if (c1178e.f3532d != 0) {
            f5 = c1178e.f3529a * ((float) f4);
            z = false;
        } else {
            z = true;
        }
        if (c1178e2.f3532d != this.f3557I.getCount() - 1) {
            f2 = c1178e2.f3529a * ((float) f4);
            z2 = false;
        } else {
            f2 = f6;
        }
        if (scrollY < f5) {
            if (z) {
                z3 = this.f3554C.onPull(Math.abs(f5 - scrollY) / ((float) f4));
            }
        } else if (scrollY > f2) {
            if (z2) {
                z3 = this.f3552A.onPull(Math.abs(scrollY - f2) / ((float) f4));
            }
            f5 = f2;
        } else {
            f5 = scrollY;
        }
        this.f3582o += f5 - ((float) ((int) f5));
        scrollTo(getScrollX(), (int) f5);
        m8453b((int) f5);
        return z3;
    }

    /* renamed from: a */
    private boolean m8451a(float f, float f2) {
        try {
            if (f >= ((float) this.jb) || f2 <= 0.0f) {
                try {
                    if (f <= ((float) (getHeight() - this.jb)) || f2 >= 0.0f) {
                        return false;
                    }
                } catch (NotFoundException e) {
                    try {
                        throw e;
                    } catch (NotFoundException e2) {
                        throw e2;
                    }
                }
            }
            return true;
        } catch (NotFoundException e22) {
            throw e22;
        } catch (NotFoundException e222) {
            throw e222;
        }
    }

    /* renamed from: b */
    private void m8452b(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            try {
                parent.requestDisallowInterceptTouchEvent(z);
            } catch (NotFoundException e) {
                throw e;
            }
        }
    }

    /* renamed from: b */
    private boolean m8453b(int i) {
        try {
            if (this.f3564Q.size() == 0) {
                this.cb = false;
                m8469a(0, 0.0f, 0);
                if (this.cb) {
                    return false;
                }
                throw new IllegalStateException(zb[4]);
            }
            C1178e k = m8461k();
            int f = m8458f();
            int i2 = this.f3583p + f;
            float f2 = ((float) this.f3583p) / ((float) f);
            int i3 = k.f3532d;
            float f3 = ((((float) i) / ((float) f)) - k.f3529a) / (k.f3533e + f2);
            f = (int) (((float) i2) * f3);
            try {
                this.cb = false;
                m8469a(i3, f3, f);
                if (this.cb) {
                    return true;
                }
                throw new IllegalStateException(zb[4]);
            } catch (NotFoundException e) {
                throw e;
            }
        } catch (NotFoundException e2) {
            throw e2;
        } catch (NotFoundException e22) {
            throw e22;
        }
    }

    /* renamed from: c */
    private void m8454c() {
        try {
            this.f3569X = false;
            this.f3561N = false;
            if (this.f3586s != null) {
                this.f3586s.recycle();
                this.f3586s = null;
            }
        } catch (NotFoundException e) {
            throw e;
        }
    }

    /* renamed from: c */
    private void m8455c(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewCompat.setLayerType(getChildAt(i), z ? 2 : 0, null);
        }
    }

    /* renamed from: d */
    private void m8456d(boolean z) {
        try {
            if (this.hb != z) {
                this.hb = z;
            }
        } catch (NotFoundException e) {
            throw e;
        }
    }

    /* renamed from: e */
    private void m8457e(int i) {
        try {
            if (this.f3560M != i) {
                try {
                    this.f3560M = i;
                    if (this.eb != null) {
                        m8455c(i != 0);
                    }
                    try {
                        if (this.f3562O != null) {
                            this.f3562O.onPageScrollStateChanged(i);
                        }
                    } catch (NotFoundException e) {
                        throw e;
                    }
                } catch (NotFoundException e2) {
                    throw e2;
                } catch (NotFoundException e22) {
                    throw e22;
                }
            }
        } catch (NotFoundException e222) {
            throw e222;
        }
    }

    /* renamed from: f */
    private int m8458f() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: f */
    private void m8459f(boolean z) {
        try {
            int scrollX;
            boolean z2 = this.f3560M == 2;
            if (z2) {
                m8456d(false);
                this.f3572a.abortAnimation();
                scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f3572a.getCurrX();
                int currY = this.f3572a.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    try {
                        scrollTo(currX, currY);
                    } catch (NotFoundException e) {
                        throw e;
                    }
                }
            }
            this.f3589w = false;
            boolean z3 = z2;
            for (scrollX = 0; scrollX < this.f3564Q.size(); scrollX++) {
                C1178e c1178e = (C1178e) this.f3564Q.get(scrollX);
                if (c1178e.f3530b) {
                    c1178e.f3530b = false;
                    z3 = true;
                }
            }
            if (!z3) {
                return;
            }
            if (z) {
                try {
                    ViewCompat.postOnAnimation(this, this.vb);
                    return;
                } catch (NotFoundException e2) {
                    throw e2;
                }
            }
            this.vb.run();
        } catch (NotFoundException e22) {
            throw e22;
        }
    }

    /* renamed from: j */
    private void m8460j() {
        try {
            if (this.f3576h != 0) {
                if (this.bb == null) {
                    this.bb = new ArrayList();
                } else {
                    this.bb.clear();
                }
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    this.bb.add(getChildAt(i));
                }
                Collections.sort(this.bb, f3550y);
            }
        } catch (NotFoundException e) {
            throw e;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    /* renamed from: k */
    private C1178e m8461k() {
        int f = m8458f();
        if (f > 0) {
            try {
                float scrollY = ((float) getScrollY()) / ((float) f);
            } catch (NotFoundException e) {
                throw e;
            }
        }
        scrollY = 0.0f;
        if (f > 0) {
            try {
                float f2 = ((float) this.f3583p) / ((float) f);
            } catch (NotFoundException e2) {
                throw e2;
            }
        }
        f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i = -1;
        int i2 = 0;
        Object obj = 1;
        C1178e c1178e = null;
        while (i2 < this.f3564Q.size()) {
            C1178e c1178e2;
            int i3;
            C1178e c1178e3;
            C1178e c1178e4 = (C1178e) this.f3564Q.get(i2);
            if (obj == null) {
                try {
                    if (c1178e4.f3532d != i + 1) {
                        c1178e4 = this.kb;
                        c1178e4.f3529a = (f3 + f4) + f2;
                        c1178e4.f3532d = i + 1;
                        c1178e4.f3533e = this.f3557I.getPageWidth(c1178e4.f3532d);
                        c1178e2 = c1178e4;
                        i3 = i2 - 1;
                        c1178e3 = c1178e2;
                        f3 = c1178e3.f3529a;
                        f4 = (c1178e3.f3533e + f3) + f2;
                        if (obj != null && scrollY < f3) {
                            return c1178e;
                        }
                        if (scrollY >= f4) {
                            try {
                                if (i3 == this.f3564Q.size() - 1) {
                                    f4 = f3;
                                    i = c1178e3.f3532d;
                                    obj = null;
                                    f3 = c1178e3.f3533e;
                                    c1178e = c1178e3;
                                    i2 = i3 + 1;
                                }
                            } catch (NotFoundException e22) {
                                throw e22;
                            }
                        }
                        return c1178e3;
                    }
                } catch (NotFoundException e222) {
                    throw e222;
                }
            }
            c1178e2 = c1178e4;
            i3 = i2;
            c1178e3 = c1178e2;
            f3 = c1178e3.f3529a;
            f4 = (c1178e3.f3533e + f3) + f2;
            if (obj != null) {
            }
            if (scrollY >= f4) {
                if (i3 == this.f3564Q.size() - 1) {
                    f4 = f3;
                    i = c1178e3.f3532d;
                    obj = null;
                    f3 = c1178e3.f3533e;
                    c1178e = c1178e3;
                    i2 = i3 + 1;
                }
            }
            return c1178e3;
        }
        return c1178e;
    }

    /* renamed from: q */
    private void m8462q() {
        int i = 0;
        while (i < getChildCount()) {
            try {
                if (!((C1191s) getChildAt(i).getLayoutParams()).f3604e) {
                    removeViewAt(i);
                    i--;
                }
                i++;
            } catch (NotFoundException e) {
                throw e;
            }
        }
    }

    /* renamed from: z */
    private static String m8463z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 40;
                    break;
                case 1:
                    i2 = 85;
                    break;
                case 2:
                    i2 = 57;
                    break;
                case 3:
                    i2 = 20;
                    break;
                default:
                    i2 = 82;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8464z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 82);
        }
        return toCharArray;
    }

    /* renamed from: a */
    OnPageChangeListener m8465a(OnPageChangeListener onPageChangeListener) {
        OnPageChangeListener onPageChangeListener2 = this.ub;
        this.ub = onPageChangeListener;
        return onPageChangeListener2;
    }

    /* renamed from: a */
    C1178e m8466a(int i, int i2) {
        C1178e c1178e = new C1178e();
        try {
            c1178e.f3532d = i;
            c1178e.f3531c = this.f3557I.instantiateItem((ViewGroup) this, i);
            c1178e.f3533e = this.f3557I.getPageWidth(i);
            if (i2 >= 0) {
                if (i2 < this.f3564Q.size()) {
                    this.f3564Q.add(i2, c1178e);
                    return c1178e;
                }
            }
            this.f3564Q.add(c1178e);
            return c1178e;
        } catch (NotFoundException e) {
            throw e;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    C1178e m8467a(View view) {
        int i = 0;
        while (i < this.f3564Q.size()) {
            C1178e c1178e = (C1178e) this.f3564Q.get(i);
            try {
                if (this.f3557I.isViewFromObject(view, c1178e.f3531c)) {
                    return c1178e;
                }
                i++;
            } catch (NotFoundException e) {
                throw e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m8468a(int i) {
        m8473a(getContext().getResources().getDrawable(i));
    }

    /* renamed from: a */
    protected void m8469a(int i, float f, int i2) {
        int paddingTop;
        int paddingBottom;
        int i3;
        if (this.f3581n > 0) {
            int scrollY = getScrollY();
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
            int height = getHeight();
            int childCount = getChildCount();
            i3 = 0;
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                C1191s c1191s = (C1191s) childAt.getLayoutParams();
                try {
                    int i4;
                    if (c1191s.f3604e) {
                        int max;
                        switch (c1191s.f3600a & 112) {
                            case 16:
                                max = Math.max((height - childAt.getMeasuredHeight()) / 2, paddingTop);
                                i4 = paddingBottom;
                                paddingBottom = paddingTop;
                                paddingTop = i4;
                                break;
                            case 48:
                                max = childAt.getHeight() + paddingTop;
                                i4 = paddingTop;
                                paddingTop = paddingBottom;
                                paddingBottom = max;
                                max = i4;
                                break;
                            case 80:
                                max = (height - paddingBottom) - childAt.getMeasuredHeight();
                                i4 = paddingBottom + childAt.getMeasuredHeight();
                                paddingBottom = paddingTop;
                                paddingTop = i4;
                                break;
                            default:
                                max = paddingTop;
                                i4 = paddingBottom;
                                paddingBottom = paddingTop;
                                paddingTop = i4;
                                break;
                        }
                        max = (max + scrollY) - childAt.getTop();
                        if (max != 0) {
                            try {
                                childAt.offsetTopAndBottom(max);
                            } catch (NotFoundException e) {
                                throw e;
                            }
                        }
                        continue;
                    } else {
                        i4 = paddingBottom;
                        paddingBottom = paddingTop;
                        paddingTop = i4;
                    }
                    i3++;
                    i4 = paddingTop;
                    paddingTop = paddingBottom;
                    paddingBottom = i4;
                } catch (NotFoundException e2) {
                    throw e2;
                }
            }
        }
        try {
            if (this.f3562O != null) {
                this.f3562O.onPageScrolled(i, f, i2);
            }
            try {
                if (this.ub != null) {
                    this.ub.onPageScrolled(i, f, i2);
                }
                if (this.eb != null) {
                    paddingBottom = getScrollY();
                    i3 = getChildCount();
                    paddingTop = 0;
                    while (paddingTop < i3) {
                        View childAt2 = getChildAt(paddingTop);
                        try {
                            if (!((C1191s) childAt2.getLayoutParams()).f3604e) {
                                this.eb.transformPage(childAt2, ((float) (childAt2.getTop() - paddingBottom)) / ((float) m8458f()));
                            }
                            paddingTop++;
                        } catch (NotFoundException e22) {
                            throw e22;
                        }
                    }
                }
                this.cb = true;
            } catch (NotFoundException e222) {
                throw e222;
            }
        } catch (NotFoundException e2222) {
            throw e2222;
        }
    }

    /* renamed from: a */
    void m8470a(int i, int i2, int i3) {
        try {
            if (getChildCount() == 0) {
                m8456d(false);
                return;
            }
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int i4 = i - scrollX;
            int i5 = i2 - scrollY;
            if (i4 == 0 && i5 == 0) {
                try {
                    m8459f(false);
                    m8499m();
                    m8457e(0);
                    return;
                } catch (NotFoundException e) {
                    throw e;
                }
            }
            m8456d(true);
            m8457e(2);
            int f = m8458f();
            int i6 = f / 2;
            float c = (((float) i6) * m8485c(Math.min(1.0f, (((float) Math.abs(i4)) * 1.0f) / ((float) f)))) + ((float) i6);
            int abs = Math.abs(i3);
            if (abs > 0) {
                f = Math.round(1000.0f * Math.abs(c / ((float) abs))) * 4;
            } else {
                f = (int) (((((float) Math.abs(i4)) / ((((float) f) * this.f3557I.getPageWidth(this.f3579k)) + ((float) this.f3583p))) + 1.0f) * 100.0f);
            }
            this.f3572a.startScroll(scrollX, scrollY, i4, i5, Math.min(f, mb));
            ViewCompat.postInvalidateOnAnimation(this);
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    void m8471a(int i, boolean z, boolean z2) {
        m8472a(i, z, z2, 0);
    }

    /* renamed from: a */
    void m8472a(int i, boolean z, boolean z2, int i2) {
        boolean z3 = false;
        try {
            if (this.f3557I != null) {
                if (this.f3557I.getCount() > 0) {
                    if (!z2) {
                        try {
                            if (this.f3579k == i) {
                                if (this.f3564Q.size() != 0) {
                                    m8456d(false);
                                    return;
                                }
                            }
                        } catch (NotFoundException e) {
                            throw e;
                        } catch (NotFoundException e2) {
                            throw e2;
                        }
                    }
                    if (i < 0) {
                        i = 0;
                    } else if (i >= this.f3557I.getCount()) {
                        i = this.f3557I.getCount() - 1;
                    }
                    int i3 = this.f3590x;
                    try {
                        if (i > this.f3579k + i3 || i < this.f3579k - i3) {
                            int i4 = 0;
                            while (i4 < this.f3564Q.size()) {
                                try {
                                    ((C1178e) this.f3564Q.get(i4)).f3530b = true;
                                    i4++;
                                } catch (NotFoundException e22) {
                                    throw e22;
                                }
                            }
                        }
                        try {
                            if (this.f3579k != i) {
                                z3 = true;
                            }
                            try {
                                if (this.tb) {
                                    this.f3579k = i;
                                    if (z3) {
                                        try {
                                            if (this.f3562O != null) {
                                                this.f3562O.onPageSelected(i);
                                            }
                                        } catch (NotFoundException e222) {
                                            throw e222;
                                        }
                                    }
                                    if (z3) {
                                        try {
                                            if (this.ub != null) {
                                                this.ub.onPageSelected(i);
                                            }
                                        } catch (NotFoundException e2222) {
                                            throw e2222;
                                        }
                                    }
                                    requestLayout();
                                    return;
                                }
                                m8491f(i);
                                m8447a(i, z, i2, z3);
                                return;
                            } catch (NotFoundException e22222) {
                                throw e22222;
                            } catch (NotFoundException e222222) {
                                throw e222222;
                            }
                        } catch (NotFoundException e2222222) {
                            throw e2222222;
                        }
                    } catch (NotFoundException e22222222) {
                        throw e22222222;
                    }
                }
            }
            m8456d(false);
        } catch (NotFoundException e222222222) {
            throw e222222222;
        } catch (NotFoundException e2222222222) {
            throw e2222222222;
        }
    }

    /* renamed from: a */
    public void m8473a(Drawable drawable) {
        try {
            this.f3563P = drawable;
            if (drawable != null) {
                refreshDrawableState();
            }
            setWillNotDraw(drawable == null);
            invalidate();
        } catch (NotFoundException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public void mo3450a(PageTransformer pageTransformer) {
        m8477a(true, pageTransformer);
    }

    /* renamed from: a */
    void m8475a(ab abVar) {
        this.lb = abVar;
    }

    /* renamed from: a */
    public void mo3451a(boolean z) {
        this.f3577i = z;
    }

    /* renamed from: a */
    public void m8477a(boolean z, PageTransformer pageTransformer) {
        int i = 1;
        try {
            if (VERSION.SDK_INT >= 11) {
                boolean z2 = pageTransformer != null;
                try {
                    int i2 = z2 != (this.eb != null) ? 1 : 0;
                    try {
                        this.eb = pageTransformer;
                        m8489e(z2);
                        if (z2) {
                            if (z) {
                                i = 2;
                            }
                            this.f3576h = i;
                        } else {
                            this.f3576h = 0;
                        }
                        if (i2 != 0) {
                            try {
                                m8499m();
                            } catch (NotFoundException e) {
                                throw e;
                            }
                        }
                    } catch (NotFoundException e2) {
                        throw e2;
                    } catch (NotFoundException e22) {
                        throw e22;
                    }
                } catch (NotFoundException e222) {
                    throw e222;
                }
            }
        } catch (NotFoundException e2222) {
            throw e2222;
        } catch (NotFoundException e22222) {
            throw e22222;
        }
    }

    /* renamed from: a */
    public boolean mo3452a() {
        return this.f3577i;
    }

    /* renamed from: a */
    public boolean m8479a(KeyEvent keyEvent) {
        try {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            switch (keyEvent.getKeyCode()) {
                case 21:
                    return m8486c(17);
                case 22:
                    return m8486c(66);
                case 61:
                    try {
                        return VERSION.SDK_INT >= 11 ? KeyEventCompat.hasNoModifiers(keyEvent) ? m8486c(2) : KeyEventCompat.hasModifiers(keyEvent, 1) ? m8486c(1) : false : false;
                    } catch (NotFoundException e) {
                        throw e;
                    }
                default:
                    return false;
            }
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    protected boolean m8480a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount() - 1;
            while (childCount >= 0) {
                View childAt = viewGroup.getChildAt(childCount);
                try {
                    if (i3 + scrollY >= childAt.getTop()) {
                        if (i3 + scrollY < childAt.getBottom()) {
                            try {
                                if (i2 + scrollX >= childAt.getLeft()) {
                                    try {
                                        if (i2 + scrollX < childAt.getRight()) {
                                            try {
                                                if (m8480a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                                                    return true;
                                                }
                                            } catch (NotFoundException e) {
                                                throw e;
                                            }
                                        }
                                        continue;
                                    } catch (NotFoundException e2) {
                                        throw e2;
                                    }
                                } else {
                                    continue;
                                }
                            } catch (NotFoundException e22) {
                                throw e22;
                            }
                        } else {
                            continue;
                        }
                    }
                    childCount--;
                } catch (NotFoundException e222) {
                    throw e222;
                } catch (NotFoundException e2222) {
                    throw e2222;
                }
            }
        }
        if (z) {
            try {
                if (ViewCompat.canScrollVertically(view, -i)) {
                    return true;
                }
            } catch (NotFoundException e22222) {
                throw e22222;
            }
        }
        return false;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C1178e a = m8467a(childAt);
                    if (a != null) {
                        try {
                            if (a.f3532d == this.f3579k) {
                                childAt.addFocusables(arrayList, i, i2);
                            }
                        } catch (NotFoundException e) {
                            throw e;
                        }
                    }
                    continue;
                }
            }
        }
        if (descendantFocusability == 262144) {
            try {
                if (size != arrayList.size()) {
                    return;
                }
            } catch (NotFoundException e2) {
                throw e2;
            } catch (NotFoundException e22) {
                throw e22;
            }
        }
        if (isFocusable()) {
            if ((i2 & 1) == 1) {
                try {
                    if (isInTouchMode()) {
                        if (!isFocusableInTouchMode()) {
                            return;
                        }
                    }
                } catch (NotFoundException e222) {
                    throw e222;
                } catch (NotFoundException e2222) {
                    throw e2222;
                }
            }
            if (arrayList != null) {
                try {
                    arrayList.add(this);
                } catch (NotFoundException e22222) {
                    throw e22222;
                }
            }
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C1178e a = m8467a(childAt);
                if (a != null) {
                    try {
                        if (a.f3532d == this.f3579k) {
                            childAt.addTouchables(arrayList);
                        }
                    } catch (NotFoundException e) {
                        throw e;
                    }
                }
                continue;
            }
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        LayoutParams generateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        C1191s c1191s = (C1191s) generateLayoutParams;
        try {
            c1191s.f3604e |= view instanceof jb;
            if (this.f3553B) {
                if (c1191s != null) {
                    try {
                        if (c1191s.f3604e) {
                            throw new IllegalStateException(zb[15]);
                        }
                    } catch (NotFoundException e) {
                        throw e;
                    }
                }
                c1191s.f3603d = true;
                addViewInLayout(view, i, generateLayoutParams);
                return;
            }
            super.addView(view, i, generateLayoutParams);
        } catch (NotFoundException e2) {
            throw e2;
        } catch (NotFoundException e22) {
            throw e22;
        }
    }

    /* renamed from: b */
    C1178e m8481b(View view) {
        while (true) {
            C1189p parent = view.getParent();
            if (parent != this) {
                if (parent == null) {
                    break;
                }
                try {
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = parent;
                } catch (NotFoundException e) {
                    throw e;
                }
            }
            return m8467a(view);
        }
        return null;
    }

    /* renamed from: b */
    public void m8482b(float f) {
        try {
            if (this.f3558J) {
                this.f3574f += f;
                float scrollY = ((float) getScrollY()) - f;
                int f2 = m8458f();
                float f3 = ((float) f2) * this.f3556F;
                C1178e c1178e = (C1178e) this.f3564Q.get(0);
                C1178e c1178e2 = (C1178e) this.f3564Q.get(this.f3564Q.size() - 1);
                float f4 = c1178e.f3532d != 0 ? c1178e.f3529a * ((float) f2) : ((float) f2) * this.f3580m;
                float f5 = c1178e2.f3532d != this.f3557I.getCount() + -1 ? c1178e2.f3529a * ((float) f2) : f3;
                if (scrollY >= f4) {
                    f4 = scrollY > f5 ? f5 : scrollY;
                }
                this.f3574f += f4 - ((float) ((int) f4));
                scrollTo(getScrollX(), (int) f4);
                m8453b((int) f4);
                MotionEvent obtain = MotionEvent.obtain(this.f3570Y, SystemClock.uptimeMillis(), 2, 0.0f, this.f3574f, 0);
                this.f3586s.addMovement(obtain);
                obtain.recycle();
                return;
            }
            throw new IllegalStateException(zb[3]);
        } catch (NotFoundException e) {
            throw e;
        }
    }

    /* renamed from: b */
    void m8483b(int i, int i2) {
        m8470a(i, i2, 0);
    }

    /* renamed from: b */
    boolean m8484b() {
        try {
            if (this.f3557I != null) {
                if (this.f3579k < this.f3557I.getCount() - 1) {
                    setCurrentItem(this.f3579k + 1, true);
                    return true;
                }
            }
            return false;
        } catch (NotFoundException e) {
            throw e;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    /* renamed from: c */
    float m8485c(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    /* renamed from: c */
    public boolean m8486c(int i) {
        boolean e;
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        } else if (findFocus != null) {
            Object obj;
            C1189p parent = findFocus.getParent();
            while (parent instanceof ViewGroup) {
                try {
                    if (parent == this) {
                        obj = 1;
                        break;
                    }
                    parent = parent.getParent();
                } catch (NotFoundException e2) {
                    throw e2;
                }
            }
            obj = null;
            if (obj == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    stringBuilder.append(zb[7]).append(parent2.getClass().getSimpleName());
                }
                Log.e(yb, zb[6] + stringBuilder.toString());
                findFocus = null;
            }
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        if (findNextFocus == null || findNextFocus == findFocus) {
            if (i == 33 || i == 1) {
                e = m8490e();
            } else {
                if (i == 130 || i == 2) {
                    e = m8484b();
                }
                e = false;
            }
        } else if (i == 33) {
            e = (findFocus == null || m8445a(this.sb, findNextFocus).top < m8445a(this.sb, findFocus).top) ? findNextFocus.requestFocus() : m8490e();
        } else {
            if (i == 130) {
                e = (findFocus == null || m8445a(this.sb, findNextFocus).bottom > m8445a(this.sb, findFocus).bottom) ? findNextFocus.requestFocus() : m8484b();
            }
            e = false;
        }
        if (e) {
            try {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
            } catch (NotFoundException e22) {
                throw e22;
            }
        }
        return e;
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        try {
            if (layoutParams instanceof C1191s) {
                if (super.checkLayoutParams(layoutParams)) {
                    return true;
                }
            }
            return false;
        } catch (NotFoundException e) {
            throw e;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    public void computeScroll() {
        try {
            if (this.f3572a.isFinished() || !this.f3572a.computeScrollOffset()) {
                m8459f(true);
                return;
            }
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f3572a.getCurrX();
            int currY = this.f3572a.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                try {
                    scrollTo(currX, currY);
                    if (!m8453b(currY)) {
                        this.f3572a.abortAnimation();
                        scrollTo(currX, 0);
                    }
                } catch (NotFoundException e) {
                    throw e;
                }
            }
            ViewCompat.postInvalidateOnAnimation(this);
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    /* renamed from: d */
    void m8487d() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f3572a = new Scroller(context, db);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        try {
            this.pb = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
            this.f3568V = (int) (400.0f * f);
            this.f3578j = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f3554C = new EdgeEffectCompat(context);
            this.f3552A = new EdgeEffectCompat(context);
            this.qb = (int) (25.0f * f);
            this.f3584q = (int) (2.0f * f);
            this.f3575g = (int) (16.0f * f);
            ViewCompat.setAccessibilityDelegate(this, new C1183k(this));
            if (ViewCompat.getImportantForAccessibility(this) == 0) {
                ViewCompat.setImportantForAccessibility(this, 1);
            }
        } catch (NotFoundException e) {
            throw e;
        }
    }

    /* renamed from: d */
    public boolean m8488d(int i) {
        boolean z = true;
        try {
            if (this.f3557I == null) {
                return false;
            }
            int f = m8458f();
            int scrollY = getScrollY();
            if (i < 0) {
                try {
                    if (scrollY <= ((int) (((float) f) * this.f3580m))) {
                        z = false;
                    }
                    return z;
                } catch (NotFoundException e) {
                    throw e;
                }
            } else if (i <= 0) {
                return false;
            } else {
                try {
                    if (scrollY >= ((int) (((float) f) * this.f3556F))) {
                        z = false;
                    }
                    return z;
                } catch (NotFoundException e2) {
                    throw e2;
                }
            }
        } catch (NotFoundException e22) {
            throw e22;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            if (!super.dispatchKeyEvent(keyEvent)) {
                if (!m8479a(keyEvent)) {
                    return false;
                }
            }
            return true;
        } catch (NotFoundException e) {
            throw e;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        try {
            if (accessibilityEvent.getEventType() == 4096) {
                return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    C1178e a = m8467a(childAt);
                    if (a != null) {
                        try {
                            if (a.f3532d != this.f3579k) {
                                continue;
                            } else if (childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                                return true;
                            }
                        } catch (NotFoundException e) {
                            throw e;
                        } catch (NotFoundException e2) {
                            throw e2;
                        }
                    }
                    continue;
                }
            }
            return false;
        } catch (NotFoundException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r8) {
        /*
        r7 = this;
        r2 = 1;
        super.draw(r8);
        r0 = 0;
        r1 = android.support.v4.view.ViewCompat.getOverScrollMode(r7);
        if (r1 == 0) goto L_0x0019;
    L_0x000b:
        if (r1 != r2) goto L_0x00a0;
    L_0x000d:
        r1 = r7.f3557I;	 Catch:{ NotFoundException -> 0x009c }
        if (r1 == 0) goto L_0x00a0;
    L_0x0011:
        r1 = r7.f3557I;	 Catch:{ NotFoundException -> 0x009e }
        r1 = r1.getCount();	 Catch:{ NotFoundException -> 0x009e }
        if (r1 <= r2) goto L_0x00a0;
    L_0x0019:
        r1 = r7.f3554C;	 Catch:{ NotFoundException -> 0x009e }
        r1 = r1.isFinished();	 Catch:{ NotFoundException -> 0x009e }
        if (r1 != 0) goto L_0x0052;
    L_0x0021:
        r1 = r8.save();
        r2 = r7.getHeight();
        r3 = r7.getWidth();
        r4 = r7.getPaddingLeft();
        r3 = r3 - r4;
        r4 = r7.getPaddingRight();
        r3 = r3 - r4;
        r4 = r7.getPaddingLeft();
        r4 = (float) r4;
        r5 = r7.f3580m;
        r6 = (float) r2;
        r5 = r5 * r6;
        r8.translate(r4, r5);
        r4 = r7.f3554C;
        r4.setSize(r3, r2);
        r2 = r7.f3554C;
        r2 = r2.draw(r8);
        r0 = r0 | r2;
        r8.restoreToCount(r1);
    L_0x0052:
        r1 = r7.f3552A;
        r1 = r1.isFinished();
        if (r1 != 0) goto L_0x0096;
    L_0x005a:
        r1 = r8.save();
        r2 = r7.getHeight();
        r3 = r7.getWidth();
        r4 = r7.getPaddingLeft();
        r3 = r3 - r4;
        r4 = r7.getPaddingRight();
        r3 = r3 - r4;
        r4 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        r8.rotate(r4);
        r4 = -r3;
        r5 = r7.getPaddingLeft();
        r4 = r4 - r5;
        r4 = (float) r4;
        r5 = r7.f3556F;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = r5 + r6;
        r5 = -r5;
        r6 = (float) r2;
        r5 = r5 * r6;
        r8.translate(r4, r5);
        r4 = r7.f3552A;
        r4.setSize(r3, r2);
        r2 = r7.f3552A;
        r2 = r2.draw(r8);
        r0 = r0 | r2;
        r8.restoreToCount(r1);
    L_0x0096:
        if (r0 == 0) goto L_0x009b;
    L_0x0098:
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(r7);	 Catch:{ NotFoundException -> 0x00ab }
    L_0x009b:
        return;
    L_0x009c:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x009e }
    L_0x009e:
        r0 = move-exception;
        throw r0;
    L_0x00a0:
        r1 = r7.f3554C;
        r1.finish();
        r1 = r7.f3552A;
        r1.finish();
        goto L_0x0096;
    L_0x00ab:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.fenetreinterne.p.draw(android.graphics.Canvas):void");
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3563P;
        if (drawable != null) {
            try {
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
            } catch (NotFoundException e) {
                throw e;
            }
        }
    }

    /* renamed from: e */
    void m8489e(boolean z) {
        try {
            if (VERSION.SDK_INT >= 7) {
                try {
                    if (this.f3555E == null) {
                        try {
                            this.f3555E = ViewGroup.class.getDeclaredMethod(zb[1], new Class[]{Boolean.TYPE});
                        } catch (Throwable e) {
                            Log.e(yb, zb[2], e);
                        }
                    }
                    try {
                        this.f3555E.invoke(this, new Object[]{Boolean.valueOf(z)});
                    } catch (Throwable e2) {
                        Log.e(yb, zb[0], e2);
                    }
                } catch (NotFoundException e3) {
                    throw e3;
                }
            }
        } catch (NoSuchMethodException e4) {
            throw e4;
        }
    }

    /* renamed from: e */
    boolean m8490e() {
        try {
            if (this.f3579k <= 0) {
                return false;
            }
            setCurrentItem(this.f3579k - 1, true);
            return true;
        } catch (NotFoundException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: f */
    void m8491f(int r19) {
        /*
        r18 = this;
        r3 = 0;
        r2 = 2;
        r0 = r18;
        r4 = r0.f3579k;	 Catch:{ NotFoundException -> 0x0030 }
        r0 = r19;
        if (r4 == r0) goto L_0x0386;
    L_0x000a:
        r0 = r18;
        r2 = r0.f3579k;	 Catch:{ NotFoundException -> 0x0032 }
        r0 = r19;
        if (r2 >= r0) goto L_0x0034;
    L_0x0012:
        r2 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
    L_0x0014:
        r0 = r18;
        r3 = r0.f3579k;
        r0 = r18;
        r3 = r0.m8495h(r3);
        r0 = r19;
        r1 = r18;
        r1.f3579k = r0;
        r9 = r2;
        r10 = r3;
    L_0x0026:
        r0 = r18;
        r2 = r0.f3557I;	 Catch:{ NotFoundException -> 0x0037 }
        if (r2 != 0) goto L_0x0039;
    L_0x002c:
        r18.m8460j();	 Catch:{ NotFoundException -> 0x0037 }
    L_0x002f:
        return;
    L_0x0030:
        r2 = move-exception;
        throw r2;	 Catch:{ NotFoundException -> 0x0032 }
    L_0x0032:
        r2 = move-exception;
        throw r2;
    L_0x0034:
        r2 = 33;
        goto L_0x0014;
    L_0x0037:
        r2 = move-exception;
        throw r2;
    L_0x0039:
        r0 = r18;
        r2 = r0.f3589w;	 Catch:{ NotFoundException -> 0x0043 }
        if (r2 == 0) goto L_0x0045;
    L_0x003f:
        r18.m8460j();	 Catch:{ NotFoundException -> 0x0043 }
        goto L_0x002f;
    L_0x0043:
        r2 = move-exception;
        throw r2;
    L_0x0045:
        r2 = r18.getWindowToken();	 Catch:{ NotFoundException -> 0x00ec }
        if (r2 == 0) goto L_0x002f;
    L_0x004b:
        r0 = r18;
        r2 = r0.f3557I;
        r0 = r18;
        r2.startUpdate(r0);
        r0 = r18;
        r2 = r0.f3590x;
        r3 = 0;
        r0 = r18;
        r4 = r0.f3579k;
        r4 = r4 - r2;
        r11 = java.lang.Math.max(r3, r4);
        r0 = r18;
        r3 = r0.f3557I;
        r12 = r3.getCount();
        r3 = r12 + -1;
        r0 = r18;
        r4 = r0.f3579k;
        r2 = r2 + r4;
        r13 = java.lang.Math.min(r3, r2);
        r0 = r18;
        r2 = r0.wb;
        if (r12 == r2) goto L_0x00f8;
    L_0x007b:
        r2 = r18.getResources();	 Catch:{ NotFoundException -> 0x00ee }
        r3 = r18.getId();	 Catch:{ NotFoundException -> 0x00ee }
        r2 = r2.getResourceName(r3);	 Catch:{ NotFoundException -> 0x00ee }
    L_0x0087:
        r3 = new java.lang.IllegalStateException;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = zb;
        r6 = 11;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r18;
        r5 = r0.wb;
        r4 = r4.append(r5);
        r5 = zb;
        r6 = 12;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r12);
        r5 = zb;
        r6 = 10;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r2 = r4.append(r2);
        r4 = zb;
        r5 = 8;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = r18.getClass();
        r2 = r2.append(r4);
        r4 = zb;
        r5 = 9;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r0 = r18;
        r4 = r0.f3557I;
        r4 = r4.getClass();
        r2 = r2.append(r4);
        r2 = r2.toString();
        r3.<init>(r2);
        throw r3;
    L_0x00ec:
        r2 = move-exception;
        throw r2;
    L_0x00ee:
        r2 = move-exception;
        r2 = r18.getId();
        r2 = java.lang.Integer.toHexString(r2);
        goto L_0x0087;
    L_0x00f8:
        r4 = 0;
        r2 = 0;
        r3 = r2;
    L_0x00fb:
        r0 = r18;
        r2 = r0.f3564Q;
        r2 = r2.size();
        if (r3 >= r2) goto L_0x0383;
    L_0x0105:
        r0 = r18;
        r2 = r0.f3564Q;
        r2 = r2.get(r3);
        r2 = (fr.pcsoft.wdjava.ui.champs.fenetreinterne.C1178e) r2;
        r5 = r2.f3532d;	 Catch:{ NotFoundException -> 0x01eb }
        r0 = r18;
        r6 = r0.f3579k;	 Catch:{ NotFoundException -> 0x01eb }
        if (r5 < r6) goto L_0x01ed;
    L_0x0117:
        r5 = r2.f3532d;	 Catch:{ NotFoundException -> 0x01eb }
        r0 = r18;
        r6 = r0.f3579k;	 Catch:{ NotFoundException -> 0x01eb }
        if (r5 != r6) goto L_0x0383;
    L_0x011f:
        if (r2 != 0) goto L_0x0380;
    L_0x0121:
        if (r12 <= 0) goto L_0x0380;
    L_0x0123:
        r0 = r18;
        r2 = r0.f3579k;
        r0 = r18;
        r2 = r0.m8466a(r2, r3);
        r8 = r2;
    L_0x012e:
        if (r8 == 0) goto L_0x019c;
    L_0x0130:
        r7 = 0;
        r6 = r3 + -1;
        if (r6 < 0) goto L_0x01f4;
    L_0x0135:
        r0 = r18;
        r2 = r0.f3564Q;	 Catch:{ NotFoundException -> 0x01f2 }
        r2 = r2.get(r6);	 Catch:{ NotFoundException -> 0x01f2 }
        r2 = (fr.pcsoft.wdjava.ui.champs.fenetreinterne.C1178e) r2;	 Catch:{ NotFoundException -> 0x01f2 }
    L_0x013f:
        r14 = r18.m8458f();
        if (r14 > 0) goto L_0x01f7;
    L_0x0145:
        r4 = 0;
    L_0x0146:
        r0 = r18;
        r5 = r0.f3579k;
        r5 = r5 + -1;
        r16 = r5;
        r5 = r7;
        r7 = r16;
        r17 = r6;
        r6 = r3;
        r3 = r17;
    L_0x0156:
        if (r7 < 0) goto L_0x0160;
    L_0x0158:
        r15 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1));
        if (r15 < 0) goto L_0x023c;
    L_0x015c:
        if (r7 >= r11) goto L_0x023c;
    L_0x015e:
        if (r2 != 0) goto L_0x0206;
    L_0x0160:
        r5 = r8.f3533e;
        r7 = r6 + 1;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x0197;
    L_0x016a:
        r0 = r18;
        r2 = r0.f3564Q;	 Catch:{ NotFoundException -> 0x0278 }
        r2 = r2.size();	 Catch:{ NotFoundException -> 0x0278 }
        if (r7 >= r2) goto L_0x027a;
    L_0x0174:
        r0 = r18;
        r2 = r0.f3564Q;	 Catch:{ NotFoundException -> 0x0278 }
        r2 = r2.get(r7);	 Catch:{ NotFoundException -> 0x0278 }
        r2 = (fr.pcsoft.wdjava.ui.champs.fenetreinterne.C1178e) r2;	 Catch:{ NotFoundException -> 0x0278 }
    L_0x017e:
        if (r14 > 0) goto L_0x027d;
    L_0x0180:
        r3 = 0;
    L_0x0181:
        r0 = r18;
        r4 = r0.f3579k;
        r4 = r4 + 1;
        r16 = r4;
        r4 = r5;
        r5 = r7;
        r7 = r16;
    L_0x018d:
        if (r7 >= r12) goto L_0x0197;
    L_0x018f:
        r11 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1));
        if (r11 < 0) goto L_0x02cd;
    L_0x0193:
        if (r7 <= r13) goto L_0x02cd;
    L_0x0195:
        if (r2 != 0) goto L_0x0289;
    L_0x0197:
        r0 = r18;
        r0.m8449a(r8, r6, r10);
    L_0x019c:
        r0 = r18;
        r3 = r0.f3557I;	 Catch:{ NotFoundException -> 0x0321 }
        r0 = r18;
        r4 = r0.f3579k;	 Catch:{ NotFoundException -> 0x0321 }
        if (r8 == 0) goto L_0x0323;
    L_0x01a6:
        r2 = r8.f3531c;	 Catch:{ NotFoundException -> 0x0321 }
    L_0x01a8:
        r0 = r18;
        r3.setPrimaryItem(r0, r4, r2);
        r0 = r18;
        r2 = r0.f3557I;
        r0 = r18;
        r2.finishUpdate(r0);
        r4 = r18.getChildCount();
        r2 = 0;
        r3 = r2;
    L_0x01bc:
        if (r3 >= r4) goto L_0x032a;
    L_0x01be:
        r0 = r18;
        r5 = r0.getChildAt(r3);
        r2 = r5.getLayoutParams();
        r2 = (fr.pcsoft.wdjava.ui.champs.fenetreinterne.C1191s) r2;
        r2.f3605f = r3;	 Catch:{ NotFoundException -> 0x0326 }
        r6 = r2.f3604e;	 Catch:{ NotFoundException -> 0x0326 }
        if (r6 != 0) goto L_0x01e7;
    L_0x01d0:
        r6 = r2.f3601b;	 Catch:{ NotFoundException -> 0x0326 }
        r7 = 0;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 != 0) goto L_0x01e7;
    L_0x01d7:
        r0 = r18;
        r5 = r0.m8467a(r5);
        if (r5 == 0) goto L_0x01e7;
    L_0x01df:
        r6 = r5.f3533e;	 Catch:{ NotFoundException -> 0x0328 }
        r2.f3601b = r6;	 Catch:{ NotFoundException -> 0x0328 }
        r5 = r5.f3532d;	 Catch:{ NotFoundException -> 0x0328 }
        r2.f3602c = r5;	 Catch:{ NotFoundException -> 0x0328 }
    L_0x01e7:
        r2 = r3 + 1;
        r3 = r2;
        goto L_0x01bc;
    L_0x01eb:
        r2 = move-exception;
        throw r2;
    L_0x01ed:
        r2 = r3 + 1;
        r3 = r2;
        goto L_0x00fb;
    L_0x01f2:
        r2 = move-exception;
        throw r2;
    L_0x01f4:
        r2 = 0;
        goto L_0x013f;
    L_0x01f7:
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = r8.f3533e;
        r4 = r4 - r5;
        r5 = r18.getPaddingLeft();
        r5 = (float) r5;
        r15 = (float) r14;
        r5 = r5 / r15;
        r4 = r4 + r5;
        goto L_0x0146;
    L_0x0206:
        r15 = r2.f3532d;	 Catch:{ NotFoundException -> 0x0234 }
        if (r7 != r15) goto L_0x0230;
    L_0x020a:
        r15 = r2.f3530b;	 Catch:{ NotFoundException -> 0x0236 }
        if (r15 != 0) goto L_0x0230;
    L_0x020e:
        r0 = r18;
        r15 = r0.f3564Q;	 Catch:{ NotFoundException -> 0x0238 }
        r15.remove(r3);	 Catch:{ NotFoundException -> 0x0238 }
        r0 = r18;
        r15 = r0.f3557I;	 Catch:{ NotFoundException -> 0x0238 }
        r2 = r2.f3531c;	 Catch:{ NotFoundException -> 0x0238 }
        r0 = r18;
        r15.destroyItem(r0, r7, r2);	 Catch:{ NotFoundException -> 0x0238 }
        r3 = r3 + -1;
        r6 = r6 + -1;
        if (r3 < 0) goto L_0x023a;
    L_0x0226:
        r0 = r18;
        r2 = r0.f3564Q;	 Catch:{ NotFoundException -> 0x0238 }
        r2 = r2.get(r3);	 Catch:{ NotFoundException -> 0x0238 }
        r2 = (fr.pcsoft.wdjava.ui.champs.fenetreinterne.C1178e) r2;	 Catch:{ NotFoundException -> 0x0238 }
    L_0x0230:
        r7 = r7 + -1;
        goto L_0x0156;
    L_0x0234:
        r2 = move-exception;
        throw r2;	 Catch:{ NotFoundException -> 0x0236 }
    L_0x0236:
        r2 = move-exception;
        throw r2;	 Catch:{ NotFoundException -> 0x0238 }
    L_0x0238:
        r2 = move-exception;
        throw r2;
    L_0x023a:
        r2 = 0;
        goto L_0x0230;
    L_0x023c:
        if (r2 == 0) goto L_0x025a;
    L_0x023e:
        r15 = r2.f3532d;	 Catch:{ NotFoundException -> 0x0254 }
        if (r7 != r15) goto L_0x025a;
    L_0x0242:
        r2 = r2.f3533e;
        r5 = r5 + r2;
        r3 = r3 + -1;
        if (r3 < 0) goto L_0x0258;
    L_0x0249:
        r0 = r18;
        r2 = r0.f3564Q;	 Catch:{ NotFoundException -> 0x0256 }
        r2 = r2.get(r3);	 Catch:{ NotFoundException -> 0x0256 }
        r2 = (fr.pcsoft.wdjava.ui.champs.fenetreinterne.C1178e) r2;	 Catch:{ NotFoundException -> 0x0256 }
        goto L_0x0230;
    L_0x0254:
        r2 = move-exception;
        throw r2;
    L_0x0256:
        r2 = move-exception;
        throw r2;
    L_0x0258:
        r2 = 0;
        goto L_0x0230;
    L_0x025a:
        r2 = r3 + 1;
        r0 = r18;
        r2 = r0.m8466a(r7, r2);
        r2 = r2.f3533e;
        r5 = r5 + r2;
        r6 = r6 + 1;
        if (r3 < 0) goto L_0x0276;
    L_0x0269:
        r0 = r18;
        r2 = r0.f3564Q;	 Catch:{ NotFoundException -> 0x0274 }
        r2 = r2.get(r3);	 Catch:{ NotFoundException -> 0x0274 }
        r2 = (fr.pcsoft.wdjava.ui.champs.fenetreinterne.C1178e) r2;	 Catch:{ NotFoundException -> 0x0274 }
        goto L_0x0230;
    L_0x0274:
        r2 = move-exception;
        throw r2;
    L_0x0276:
        r2 = 0;
        goto L_0x0230;
    L_0x0278:
        r2 = move-exception;
        throw r2;
    L_0x027a:
        r2 = 0;
        goto L_0x017e;
    L_0x027d:
        r3 = r18.getPaddingRight();
        r3 = (float) r3;
        r4 = (float) r14;
        r3 = r3 / r4;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = r3 + r4;
        goto L_0x0181;
    L_0x0289:
        r11 = r2.f3532d;	 Catch:{ NotFoundException -> 0x02c5 }
        if (r7 != r11) goto L_0x0379;
    L_0x028d:
        r11 = r2.f3530b;	 Catch:{ NotFoundException -> 0x02c7 }
        if (r11 != 0) goto L_0x0379;
    L_0x0291:
        r0 = r18;
        r11 = r0.f3564Q;	 Catch:{ NotFoundException -> 0x02c9 }
        r11.remove(r5);	 Catch:{ NotFoundException -> 0x02c9 }
        r0 = r18;
        r11 = r0.f3557I;	 Catch:{ NotFoundException -> 0x02c9 }
        r2 = r2.f3531c;	 Catch:{ NotFoundException -> 0x02c9 }
        r0 = r18;
        r11.destroyItem(r0, r7, r2);	 Catch:{ NotFoundException -> 0x02c9 }
        r0 = r18;
        r2 = r0.f3564Q;	 Catch:{ NotFoundException -> 0x02c9 }
        r2 = r2.size();	 Catch:{ NotFoundException -> 0x02c9 }
        if (r5 >= r2) goto L_0x02cb;
    L_0x02ad:
        r0 = r18;
        r2 = r0.f3564Q;	 Catch:{ NotFoundException -> 0x02c9 }
        r2 = r2.get(r5);	 Catch:{ NotFoundException -> 0x02c9 }
        r2 = (fr.pcsoft.wdjava.ui.champs.fenetreinterne.C1178e) r2;	 Catch:{ NotFoundException -> 0x02c9 }
    L_0x02b7:
        r16 = r4;
        r4 = r2;
        r2 = r16;
    L_0x02bc:
        r7 = r7 + 1;
        r16 = r2;
        r2 = r4;
        r4 = r16;
        goto L_0x018d;
    L_0x02c5:
        r2 = move-exception;
        throw r2;	 Catch:{ NotFoundException -> 0x02c7 }
    L_0x02c7:
        r2 = move-exception;
        throw r2;	 Catch:{ NotFoundException -> 0x02c9 }
    L_0x02c9:
        r2 = move-exception;
        throw r2;
    L_0x02cb:
        r2 = 0;
        goto L_0x02b7;
    L_0x02cd:
        if (r2 == 0) goto L_0x02f8;
    L_0x02cf:
        r11 = r2.f3532d;	 Catch:{ NotFoundException -> 0x02f2 }
        if (r7 != r11) goto L_0x02f8;
    L_0x02d3:
        r2 = r2.f3533e;
        r4 = r4 + r2;
        r5 = r5 + 1;
        r0 = r18;
        r2 = r0.f3564Q;	 Catch:{ NotFoundException -> 0x02f4 }
        r2 = r2.size();	 Catch:{ NotFoundException -> 0x02f4 }
        if (r5 >= r2) goto L_0x02f6;
    L_0x02e2:
        r0 = r18;
        r2 = r0.f3564Q;	 Catch:{ NotFoundException -> 0x02f4 }
        r2 = r2.get(r5);	 Catch:{ NotFoundException -> 0x02f4 }
        r2 = (fr.pcsoft.wdjava.ui.champs.fenetreinterne.C1178e) r2;	 Catch:{ NotFoundException -> 0x02f4 }
    L_0x02ec:
        r16 = r4;
        r4 = r2;
        r2 = r16;
        goto L_0x02bc;
    L_0x02f2:
        r2 = move-exception;
        throw r2;
    L_0x02f4:
        r2 = move-exception;
        throw r2;
    L_0x02f6:
        r2 = 0;
        goto L_0x02ec;
    L_0x02f8:
        r0 = r18;
        r2 = r0.m8466a(r7, r5);
        r5 = r5 + 1;
        r2 = r2.f3533e;
        r4 = r4 + r2;
        r0 = r18;
        r2 = r0.f3564Q;	 Catch:{ NotFoundException -> 0x031d }
        r2 = r2.size();	 Catch:{ NotFoundException -> 0x031d }
        if (r5 >= r2) goto L_0x031f;
    L_0x030d:
        r0 = r18;
        r2 = r0.f3564Q;	 Catch:{ NotFoundException -> 0x031d }
        r2 = r2.get(r5);	 Catch:{ NotFoundException -> 0x031d }
        r2 = (fr.pcsoft.wdjava.ui.champs.fenetreinterne.C1178e) r2;	 Catch:{ NotFoundException -> 0x031d }
    L_0x0317:
        r16 = r4;
        r4 = r2;
        r2 = r16;
        goto L_0x02bc;
    L_0x031d:
        r2 = move-exception;
        throw r2;
    L_0x031f:
        r2 = 0;
        goto L_0x0317;
    L_0x0321:
        r2 = move-exception;
        throw r2;
    L_0x0323:
        r2 = 0;
        goto L_0x01a8;
    L_0x0326:
        r2 = move-exception;
        throw r2;
    L_0x0328:
        r2 = move-exception;
        throw r2;
    L_0x032a:
        r18.m8460j();
        r2 = r18.hasFocus();
        if (r2 == 0) goto L_0x002f;
    L_0x0333:
        r2 = r18.findFocus();
        if (r2 == 0) goto L_0x0371;
    L_0x0339:
        r0 = r18;
        r2 = r0.m8481b(r2);	 Catch:{ NotFoundException -> 0x036f }
    L_0x033f:
        if (r2 == 0) goto L_0x0349;
    L_0x0341:
        r2 = r2.f3532d;	 Catch:{ NotFoundException -> 0x0373 }
        r0 = r18;
        r3 = r0.f3579k;	 Catch:{ NotFoundException -> 0x0373 }
        if (r2 == r3) goto L_0x002f;
    L_0x0349:
        r2 = 0;
    L_0x034a:
        r3 = r18.getChildCount();
        if (r2 >= r3) goto L_0x002f;
    L_0x0350:
        r0 = r18;
        r3 = r0.getChildAt(r2);
        r0 = r18;
        r4 = r0.m8467a(r3);
        if (r4 == 0) goto L_0x036c;
    L_0x035e:
        r4 = r4.f3532d;	 Catch:{ NotFoundException -> 0x0375 }
        r0 = r18;
        r5 = r0.f3579k;	 Catch:{ NotFoundException -> 0x0375 }
        if (r4 != r5) goto L_0x036c;
    L_0x0366:
        r3 = r3.requestFocus(r9);	 Catch:{ NotFoundException -> 0x0377 }
        if (r3 != 0) goto L_0x002f;
    L_0x036c:
        r2 = r2 + 1;
        goto L_0x034a;
    L_0x036f:
        r2 = move-exception;
        throw r2;
    L_0x0371:
        r2 = 0;
        goto L_0x033f;
    L_0x0373:
        r2 = move-exception;
        throw r2;
    L_0x0375:
        r2 = move-exception;
        throw r2;	 Catch:{ NotFoundException -> 0x0377 }
    L_0x0377:
        r2 = move-exception;
        throw r2;
    L_0x0379:
        r16 = r4;
        r4 = r2;
        r2 = r16;
        goto L_0x02bc;
    L_0x0380:
        r8 = r2;
        goto L_0x012e;
    L_0x0383:
        r2 = r4;
        goto L_0x011f;
    L_0x0386:
        r9 = r2;
        r10 = r3;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.fenetreinterne.p.f(int):void");
    }

    /* renamed from: g */
    public int m8492g() {
        return this.f3590x;
    }

    /* renamed from: g */
    public void m8493g(int i) {
        int i2 = this.f3583p;
        this.f3583p = i;
        int height = getHeight();
        m8446a(height, height, i, i2);
        requestLayout();
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new C1191s();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1191s(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    protected int getChildDrawingOrder(int i, int i2) {
        try {
            if (this.f3576h == 2) {
                i2 = (i - 1) - i2;
            }
            return ((C1191s) ((View) this.bb.get(i2)).getLayoutParams()).f3605f;
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public int getCurrentItem() {
        return this.f3579k;
    }

    /* renamed from: h */
    public PagerAdapter m8494h() {
        return this.f3557I;
    }

    /* renamed from: h */
    C1178e m8495h(int i) {
        int i2 = 0;
        while (i2 < this.f3564Q.size()) {
            C1178e c1178e = (C1178e) this.f3564Q.get(i2);
            try {
                if (c1178e.f3532d == i) {
                    return c1178e;
                }
                i2++;
            } catch (NotFoundException e) {
                throw e;
            }
        }
        return null;
    }

    /* renamed from: i */
    public int m8496i() {
        return this.f3583p;
    }

    /* renamed from: i */
    public void m8497i(int i) {
        try {
            this.f3589w = false;
            m8471a(i, !this.tb, false);
        } catch (NotFoundException e) {
            throw e;
        }
    }

    /* renamed from: l */
    void m8498l() {
        int count = this.f3557I.getCount();
        try {
            boolean z;
            boolean z2;
            int i;
            boolean z3;
            int i2;
            C1178e c1178e;
            int itemPosition;
            int i3;
            boolean z4;
            int i4;
            boolean z5;
            C1191s c1191s;
            this.wb = count;
            if (this.f3564Q.size() < (this.f3590x * 2) + 1) {
                if (this.f3564Q.size() < count) {
                    z = true;
                    z2 = false;
                    i = this.f3579k;
                    z3 = z;
                    i2 = 0;
                    while (i2 < this.f3564Q.size()) {
                        c1178e = (C1178e) this.f3564Q.get(i2);
                        itemPosition = this.f3557I.getItemPosition(c1178e.f3531c);
                        if (itemPosition == -1) {
                            i3 = i2;
                            z4 = z2;
                            i4 = i;
                            z5 = z3;
                        } else if (itemPosition == -2) {
                            try {
                                this.f3564Q.remove(i2);
                                i2--;
                                if (!z2) {
                                    this.f3557I.startUpdate((ViewGroup) this);
                                    z2 = true;
                                }
                                this.f3557I.destroyItem((ViewGroup) this, c1178e.f3532d, c1178e.f3531c);
                                if (this.f3579k != c1178e.f3532d) {
                                    i3 = i2;
                                    z4 = z2;
                                    i4 = Math.max(0, Math.min(this.f3579k, count - 1));
                                    z5 = true;
                                } else {
                                    i3 = i2;
                                    z4 = z2;
                                    i4 = i;
                                    z5 = true;
                                }
                            } catch (NotFoundException e) {
                                throw e;
                            }
                        } else {
                            try {
                                if (c1178e.f3532d == itemPosition) {
                                    if (c1178e.f3532d == this.f3579k) {
                                        i = itemPosition;
                                    }
                                    c1178e.f3532d = itemPosition;
                                    i3 = i2;
                                    z4 = z2;
                                    i4 = i;
                                    z5 = true;
                                } else {
                                    i3 = i2;
                                    z4 = z2;
                                    i4 = i;
                                    z5 = z3;
                                }
                            } catch (NotFoundException e2) {
                                throw e2;
                            }
                        }
                        z3 = z5;
                        i = i4;
                        z2 = z4;
                        i2 = i3 + 1;
                    }
                    if (z2) {
                        try {
                            this.f3557I.finishUpdate((ViewGroup) this);
                        } catch (NotFoundException e22) {
                            throw e22;
                        }
                    }
                    Collections.sort(this.f3564Q, f3540G);
                    if (z3) {
                        i4 = getChildCount();
                        while (i2 < i4) {
                            c1191s = (C1191s) getChildAt(i2).getLayoutParams();
                            try {
                                if (!c1191s.f3604e) {
                                    c1191s.f3601b = 0.0f;
                                }
                            } catch (NotFoundException e222) {
                                throw e222;
                            }
                        }
                        m8471a(i, false, true);
                        requestLayout();
                    }
                }
            }
            z = false;
            z2 = false;
            i = this.f3579k;
            z3 = z;
            i2 = 0;
            while (i2 < this.f3564Q.size()) {
                c1178e = (C1178e) this.f3564Q.get(i2);
                itemPosition = this.f3557I.getItemPosition(c1178e.f3531c);
                if (itemPosition == -1) {
                    i3 = i2;
                    z4 = z2;
                    i4 = i;
                    z5 = z3;
                } else if (itemPosition == -2) {
                    this.f3564Q.remove(i2);
                    i2--;
                    if (z2) {
                        this.f3557I.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.f3557I.destroyItem((ViewGroup) this, c1178e.f3532d, c1178e.f3531c);
                    if (this.f3579k != c1178e.f3532d) {
                        i3 = i2;
                        z4 = z2;
                        i4 = i;
                        z5 = true;
                    } else {
                        i3 = i2;
                        z4 = z2;
                        i4 = Math.max(0, Math.min(this.f3579k, count - 1));
                        z5 = true;
                    }
                } else if (c1178e.f3532d == itemPosition) {
                    i3 = i2;
                    z4 = z2;
                    i4 = i;
                    z5 = z3;
                } else {
                    if (c1178e.f3532d == this.f3579k) {
                        i = itemPosition;
                    }
                    c1178e.f3532d = itemPosition;
                    i3 = i2;
                    z4 = z2;
                    i4 = i;
                    z5 = true;
                }
                z3 = z5;
                i = i4;
                z2 = z4;
                i2 = i3 + 1;
            }
            if (z2) {
                this.f3557I.finishUpdate((ViewGroup) this);
            }
            Collections.sort(this.f3564Q, f3540G);
            if (z3) {
                i4 = getChildCount();
                for (i2 = 0; i2 < i4; i2++) {
                    c1191s = (C1191s) getChildAt(i2).getLayoutParams();
                    if (!c1191s.f3604e) {
                        c1191s.f3601b = 0.0f;
                    }
                }
                m8471a(i, false, true);
                requestLayout();
            }
        } catch (NotFoundException e2222) {
            throw e2222;
        } catch (NotFoundException e22222) {
            throw e22222;
        }
    }

    /* renamed from: m */
    void m8499m() {
        m8491f(this.f3579k);
    }

    /* renamed from: n */
    public boolean m8500n() {
        return this.f3558J;
    }

    /* renamed from: o */
    public boolean m8501o() {
        try {
            if (this.f3569X) {
                return false;
            }
            try {
                this.f3558J = true;
                m8457e(1);
                this.f3574f = 0.0f;
                this.fb = 0.0f;
                if (this.f3586s == null) {
                    this.f3586s = VelocityTracker.obtain();
                } else {
                    this.f3586s.clear();
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                this.f3586s.addMovement(obtain);
                obtain.recycle();
                this.f3570Y = uptimeMillis;
                return true;
            } catch (NotFoundException e) {
                throw e;
            }
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.tb = true;
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.vb);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            if (this.f3583p <= 0) {
                return;
            }
            if (this.f3563P != null) {
                try {
                    if (this.f3564Q.size() > 0 && this.f3557I != null) {
                        int scrollY = getScrollY();
                        int height = getHeight();
                        float f = ((float) this.f3583p) / ((float) height);
                        C1178e c1178e = (C1178e) this.f3564Q.get(0);
                        float f2 = c1178e.f3529a;
                        int size = this.f3564Q.size();
                        int i = c1178e.f3532d;
                        int i2 = ((C1178e) this.f3564Q.get(size - 1)).f3532d;
                        float f3 = f2;
                        int i3 = 0;
                        int i4 = i;
                        while (i4 < i2) {
                            float f4;
                            float f5;
                            C1178e c1178e2 = c1178e;
                            int i5 = i3;
                            while (i4 > c1178e2.f3532d && i5 < size) {
                                try {
                                    i3 = i5 + 1;
                                    c1178e2 = (C1178e) this.f3564Q.get(i3);
                                    i5 = i3;
                                } catch (NotFoundException e) {
                                    throw e;
                                } catch (NotFoundException e2) {
                                    throw e2;
                                }
                            }
                            if (i4 == c1178e2.f3532d) {
                                f4 = (c1178e2.f3529a + c1178e2.f3533e) * ((float) height);
                                f5 = (c1178e2.f3529a + c1178e2.f3533e) + f;
                            } else {
                                f5 = this.f3557I.getPageWidth(i4);
                                f4 = (f3 + f5) * ((float) height);
                                f5 = (f5 + f) + f3;
                            }
                            try {
                                if (((float) this.f3583p) + f4 > ((float) scrollY)) {
                                    this.f3563P.setBounds(this.f3559L, (int) f4, this.ib, (int) ((((float) this.f3583p) + f4) + 0.5f));
                                    this.f3563P.draw(canvas);
                                }
                                if (f4 <= ((float) (scrollY + height))) {
                                    i4++;
                                    f3 = f5;
                                    c1178e = c1178e2;
                                    i3 = i5;
                                } else {
                                    return;
                                }
                            } catch (NotFoundException e22) {
                                throw e22;
                            }
                        }
                    }
                } catch (NotFoundException e222) {
                    throw e222;
                }
            }
        } catch (NotFoundException e2222) {
            throw e2222;
        } catch (NotFoundException e22222) {
            throw e22222;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (!this.f3577i) {
                return false;
            }
            int action = motionEvent.getAction() & 255;
            if (action == 3 || action == 1) {
                try {
                    this.f3569X = false;
                    this.f3561N = false;
                    this.f3585r = -1;
                    if (this.f3586s != null) {
                        this.f3586s.recycle();
                        this.f3586s = null;
                    }
                    return false;
                } catch (NotFoundException e) {
                    throw e;
                }
            }
            if (action != 0) {
                try {
                    if (this.f3569X) {
                        return true;
                    }
                    try {
                        if (this.f3561N) {
                            return false;
                        }
                    } catch (NotFoundException e2) {
                        throw e2;
                    }
                } catch (NotFoundException e22) {
                    throw e22;
                }
            }
            switch (action) {
                case 0:
                    try {
                        float x = motionEvent.getX();
                        this.f3573b = x;
                        this.f3582o = x;
                        x = motionEvent.getY();
                        this.fb = x;
                        this.f3574f = x;
                        this.f3585r = MotionEventCompat.getPointerId(motionEvent, 0);
                        this.f3561N = false;
                        this.f3572a.computeScrollOffset();
                        if (this.f3560M == 2) {
                            if (Math.abs(this.f3572a.getFinalY() - this.f3572a.getCurrY()) > this.f3584q) {
                                this.f3572a.abortAnimation();
                                this.f3589w = false;
                                m8499m();
                                this.f3569X = true;
                                m8452b(true);
                                m8457e(1);
                                break;
                            }
                        }
                        m8459f(false);
                        this.f3569X = false;
                        break;
                    } catch (NotFoundException e222) {
                        throw e222;
                    } catch (NotFoundException e2222) {
                        throw e2222;
                    }
                case 2:
                    action = this.f3585r;
                    if (action != -1) {
                        action = MotionEventCompat.findPointerIndex(motionEvent, action);
                        float y = MotionEventCompat.getY(motionEvent, action);
                        float f = y - this.f3574f;
                        float abs = Math.abs(f);
                        float x2 = MotionEventCompat.getX(motionEvent, action);
                        float abs2 = Math.abs(x2 - this.f3573b);
                        if (f != 0.0f) {
                            try {
                                if (!m8451a(this.f3574f, f)) {
                                    if (m8480a(this, false, (int) f, (int) x2, (int) y)) {
                                        this.f3582o = x2;
                                        this.f3574f = y;
                                        this.f3561N = true;
                                        return false;
                                    }
                                }
                            } catch (NotFoundException e22222) {
                                throw e22222;
                            } catch (NotFoundException e222222) {
                                throw e222222;
                            }
                        }
                        try {
                            if (abs <= ((float) this.pb) || 0.5f * abs <= abs2) {
                                try {
                                    if (abs2 > ((float) this.pb)) {
                                        this.f3561N = true;
                                    }
                                } catch (NotFoundException e2222222) {
                                    throw e2222222;
                                }
                            }
                            try {
                                this.f3569X = true;
                                m8452b(true);
                                m8457e(1);
                                this.f3574f = f > 0.0f ? this.fb + ((float) this.pb) : this.fb - ((float) this.pb);
                                this.f3582o = x2;
                                m8456d(true);
                            } catch (NotFoundException e22222222) {
                                throw e22222222;
                            }
                            try {
                                if (this.f3569X) {
                                    if (m8450a(y)) {
                                        ViewCompat.postInvalidateOnAnimation(this);
                                        break;
                                    }
                                }
                            } catch (NotFoundException e222222222) {
                                throw e222222222;
                            } catch (NotFoundException e2222222222) {
                                throw e2222222222;
                            }
                        } catch (NotFoundException e22222222222) {
                            throw e22222222222;
                        } catch (NotFoundException e222222222222) {
                            throw e222222222222;
                        }
                    }
                    break;
                case 6:
                    m8448a(motionEvent);
                    break;
            }
            try {
                if (this.f3586s == null) {
                    this.f3586s = VelocityTracker.obtain();
                }
                this.f3586s.addMovement(motionEvent);
                return this.f3569X;
            } catch (NotFoundException e2222222222222) {
                throw e2222222222222;
            }
        } catch (NotFoundException e22222222222222) {
            throw e22222222222222;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int max;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollY = getScrollY();
        int i7 = 0;
        int i8 = 0;
        while (i8 < childCount) {
            C1191s c1191s;
            int measuredWidth;
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                c1191s = (C1191s) childAt.getLayoutParams();
                if (c1191s.f3604e) {
                    int i9 = c1191s.f3600a & 112;
                    switch (c1191s.f3600a & 7) {
                        case 1:
                            max = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 3:
                            max = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case 5:
                            measuredWidth = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            max = measuredWidth;
                            break;
                        default:
                            max = paddingLeft;
                            break;
                    }
                    int i10;
                    switch (i9) {
                        case 16:
                            measuredWidth = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        case 48:
                            measuredWidth = childAt.getMeasuredHeight() + paddingTop;
                            i10 = paddingTop;
                            paddingTop = paddingBottom;
                            paddingBottom = measuredWidth;
                            measuredWidth = i10;
                            break;
                        case 80:
                            measuredWidth = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            i10 = paddingBottom + childAt.getMeasuredHeight();
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        default:
                            measuredWidth = paddingTop;
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                    }
                    measuredWidth += scrollY;
                    childAt.layout(max, measuredWidth, childAt.getMeasuredWidth() + max, childAt.getMeasuredHeight() + measuredWidth);
                    measuredWidth = i7 + 1;
                    i7 = paddingBottom;
                    paddingBottom = paddingTop;
                    paddingTop = paddingRight;
                    paddingRight = paddingLeft;
                    i8++;
                    paddingLeft = paddingRight;
                    paddingRight = paddingTop;
                    paddingTop = i7;
                    i7 = measuredWidth;
                }
            }
            measuredWidth = i7;
            i7 = paddingTop;
            paddingTop = paddingRight;
            paddingRight = paddingLeft;
            i8++;
            paddingLeft = paddingRight;
            paddingRight = paddingTop;
            paddingTop = i7;
            i7 = measuredWidth;
        }
        max = (i6 - paddingTop) - paddingBottom;
        for (paddingBottom = 0; paddingBottom < childCount; paddingBottom++) {
            View childAt2 = getChildAt(paddingBottom);
            if (childAt2.getVisibility() != 8) {
                c1191s = (C1191s) childAt2.getLayoutParams();
                if (!c1191s.f3604e) {
                    C1178e a = m8467a(childAt2);
                    if (a != null) {
                        i6 = ((int) (a.f3529a * ((float) max))) + paddingTop;
                        if (c1191s.f3603d) {
                            c1191s.f3603d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((i5 - paddingLeft) - paddingRight, 1073741824), MeasureSpec.makeMeasureSpec((int) (c1191s.f3601b * ((float) max)), 1073741824));
                        }
                        childAt2.layout(paddingLeft, i6, childAt2.getMeasuredWidth() + paddingLeft, childAt2.getMeasuredHeight() + i6);
                    }
                }
            }
        }
        try {
            this.f3559L = paddingLeft;
            this.ib = i5 - paddingRight;
            this.f3581n = i7;
            if (this.tb) {
                m8447a(this.f3579k, false, 0, false);
            }
            this.tb = false;
        } catch (NotFoundException e) {
            throw e;
        }
    }

    protected void onMeasure(int i, int i2) {
        C1191s c1191s;
        setMeasuredDimension(C1189p.getDefaultSize(0, i), C1189p.getDefaultSize(0, i2));
        int measuredHeight = getMeasuredHeight();
        this.jb = Math.min(measuredHeight / 10, this.f3575g);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (measuredHeight - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            int i4;
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                c1191s = (C1191s) childAt.getLayoutParams();
                if (c1191s != null) {
                    try {
                        if (c1191s.f3604e) {
                            int i5 = c1191s.f3600a & 7;
                            i4 = c1191s.f3600a & 112;
                            int i6 = Integer.MIN_VALUE;
                            int i7 = Integer.MIN_VALUE;
                            Object obj = (i4 == 48 || i4 == 80) ? 1 : null;
                            Object obj2 = (i5 == 3 || i5 == 5) ? 1 : null;
                            if (obj != null) {
                                i6 = 1073741824;
                            } else if (obj2 != null) {
                                i7 = 1073741824;
                            }
                            if (c1191s.width != -2) {
                                i5 = 1073741824;
                                i6 = c1191s.width != -1 ? c1191s.width : measuredWidth;
                            } else {
                                i5 = i6;
                                i6 = measuredWidth;
                            }
                            if (c1191s.height != -2) {
                                i7 = 1073741824;
                                if (c1191s.height != -1) {
                                    measuredHeight = c1191s.height;
                                    childAt.measure(MeasureSpec.makeMeasureSpec(i6, i5), MeasureSpec.makeMeasureSpec(measuredHeight, i7));
                                    if (obj != null) {
                                        measuredHeight = paddingTop - childAt.getMeasuredHeight();
                                        i4 = measuredWidth;
                                    } else if (obj2 != null) {
                                        i4 = measuredWidth - childAt.getMeasuredWidth();
                                        measuredHeight = paddingTop;
                                    }
                                    i3++;
                                    measuredWidth = i4;
                                    paddingTop = measuredHeight;
                                }
                            }
                            measuredHeight = paddingTop;
                            childAt.measure(MeasureSpec.makeMeasureSpec(i6, i5), MeasureSpec.makeMeasureSpec(measuredHeight, i7));
                            if (obj != null) {
                                measuredHeight = paddingTop - childAt.getMeasuredHeight();
                                i4 = measuredWidth;
                            } else if (obj2 != null) {
                                i4 = measuredWidth - childAt.getMeasuredWidth();
                                measuredHeight = paddingTop;
                            }
                            i3++;
                            measuredWidth = i4;
                            paddingTop = measuredHeight;
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    } catch (IllegalStateException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        C0691a.m2857a(zb[5], e3);
                        return;
                    }
                }
            }
            measuredHeight = paddingTop;
            i4 = measuredWidth;
            i3++;
            measuredWidth = i4;
            paddingTop = measuredHeight;
        }
        this.f3567U = MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        this.ob = MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
        this.f3553B = true;
        m8499m();
        this.f3553B = false;
        measuredWidth = getChildCount();
        for (i4 = 0; i4 < measuredWidth; i4++) {
            View childAt2 = getChildAt(i4);
            if (childAt2.getVisibility() != 8) {
                c1191s = (C1191s) childAt2.getLayoutParams();
                if (c1191s != null) {
                    if (c1191s.f3604e) {
                        continue;
                    }
                }
                childAt2.measure(this.f3567U, MeasureSpec.makeMeasureSpec((int) (c1191s.f3601b * ((float) paddingTop)), 1073741824));
            }
        }
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                C1178e a = m8467a(childAt);
                if (a != null) {
                    try {
                        if (a.f3532d != this.f3579k) {
                            continue;
                        } else if (childAt.requestFocus(i, rect)) {
                            return true;
                        }
                    } catch (NotFoundException e) {
                        throw e;
                    } catch (NotFoundException e2) {
                        throw e2;
                    }
                }
                continue;
            }
            i2 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        try {
            if (parcelable instanceof C1190q) {
                C1190q c1190q = (C1190q) parcelable;
                try {
                    super.onRestoreInstanceState(c1190q.getSuperState());
                    if (this.f3557I != null) {
                        this.f3557I.restoreState(c1190q.f3599d, c1190q.f3598b);
                        m8471a(c1190q.f3597a, false, true);
                        return;
                    }
                    this.f3588v = c1190q.f3597a;
                    this.f3571Z = c1190q.f3599d;
                    this.nb = c1190q.f3598b;
                    return;
                } catch (NotFoundException e) {
                    throw e;
                }
            }
            super.onRestoreInstanceState(parcelable);
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable c1190q = new C1190q(super.onSaveInstanceState());
        try {
            c1190q.f3597a = this.f3579k;
            if (this.f3557I != null) {
                c1190q.f3599d = this.f3557I.saveState();
            }
            return c1190q;
        } catch (NotFoundException e) {
            throw e;
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        try {
            super.onSizeChanged(i, i2, i3, i4);
            if (i2 != i4) {
                m8446a(i2, i4, this.f3583p, this.f3583p);
            }
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        try {
            if (!this.f3577i) {
                return false;
            }
            try {
                if (this.f3558J) {
                    return true;
                }
                try {
                    if (motionEvent.getAction() == 0) {
                        if (motionEvent.getEdgeFlags() != 0) {
                            return false;
                        }
                    }
                    try {
                        if (this.f3557I != null) {
                            if (this.f3557I.getCount() != 0) {
                                try {
                                    if (this.f3586s == null) {
                                        this.f3586s = VelocityTracker.obtain();
                                    }
                                    this.f3586s.addMovement(motionEvent);
                                    float x;
                                    int yVelocity;
                                    switch (motionEvent.getAction() & 255) {
                                        case 0:
                                            try {
                                                this.f3572a.abortAnimation();
                                                this.f3589w = false;
                                                m8499m();
                                                x = motionEvent.getX();
                                                this.f3573b = x;
                                                this.f3582o = x;
                                                x = motionEvent.getY();
                                                this.fb = x;
                                                this.f3574f = x;
                                                this.f3585r = MotionEventCompat.getPointerId(motionEvent, 0);
                                                break;
                                            } catch (NotFoundException e) {
                                                throw e;
                                            }
                                        case 1:
                                            if (this.f3569X) {
                                                VelocityTracker velocityTracker = this.f3586s;
                                                velocityTracker.computeCurrentVelocity(1000, (float) this.f3578j);
                                                yVelocity = (int) VelocityTrackerCompat.getYVelocity(velocityTracker, this.f3585r);
                                                this.f3589w = true;
                                                int f = m8458f();
                                                int scrollY = getScrollY();
                                                C1178e k = m8461k();
                                                m8472a(m8444a(k.f3532d, ((((float) scrollY) / ((float) f)) - k.f3529a) / k.f3533e, yVelocity, (int) (MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.f3585r)) - this.fb)), true, true, yVelocity);
                                                this.f3585r = -1;
                                                m8454c();
                                                z = this.f3552A.onRelease() | this.f3554C.onRelease();
                                                break;
                                            }
                                            break;
                                        case 2:
                                            if (!this.f3569X) {
                                                yVelocity = MotionEventCompat.findPointerIndex(motionEvent, this.f3585r);
                                                float y = MotionEventCompat.getY(motionEvent, yVelocity);
                                                float abs = Math.abs(y - this.f3574f);
                                                float x2 = MotionEventCompat.getX(motionEvent, yVelocity);
                                                x = Math.abs(x2 - this.f3582o);
                                                try {
                                                    if (abs > ((float) this.pb) && abs > x) {
                                                        try {
                                                            this.f3569X = true;
                                                            m8452b(true);
                                                            this.f3574f = y - this.fb > 0.0f ? this.fb + ((float) this.pb) : this.fb - ((float) this.pb);
                                                            this.f3582o = x2;
                                                            m8457e(1);
                                                            m8456d(true);
                                                            ViewParent parent = getParent();
                                                            if (parent != null) {
                                                                try {
                                                                    parent.requestDisallowInterceptTouchEvent(true);
                                                                } catch (NotFoundException e2) {
                                                                    throw e2;
                                                                }
                                                            }
                                                        } catch (NotFoundException e22) {
                                                            throw e22;
                                                        }
                                                    }
                                                } catch (NotFoundException e222) {
                                                    throw e222;
                                                } catch (NotFoundException e2222) {
                                                    throw e2222;
                                                }
                                            }
                                            if (this.f3569X) {
                                                z = false | m8450a(MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.f3585r)));
                                                break;
                                            }
                                            break;
                                        case 3:
                                            if (this.f3569X) {
                                                m8447a(this.f3579k, true, 0, false);
                                                this.f3585r = -1;
                                                m8454c();
                                                z = this.f3552A.onRelease() | this.f3554C.onRelease();
                                                break;
                                            }
                                            break;
                                        case 5:
                                            yVelocity = MotionEventCompat.getActionIndex(motionEvent);
                                            this.f3574f = MotionEventCompat.getY(motionEvent, yVelocity);
                                            this.f3585r = MotionEventCompat.getPointerId(motionEvent, yVelocity);
                                            break;
                                        case 6:
                                            m8448a(motionEvent);
                                            this.f3574f = MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.f3585r));
                                            break;
                                    }
                                    if (z) {
                                        try {
                                            ViewCompat.postInvalidateOnAnimation(this);
                                        } catch (NotFoundException e22222) {
                                            throw e22222;
                                        }
                                    }
                                    return true;
                                } catch (NotFoundException e222222) {
                                    throw e222222;
                                }
                            }
                        }
                        return false;
                    } catch (NotFoundException e2222222) {
                        throw e2222222;
                    } catch (NotFoundException e22222222) {
                        throw e22222222;
                    }
                } catch (NotFoundException e222222222) {
                    throw e222222222;
                } catch (NotFoundException e2222222222) {
                    throw e2222222222;
                }
            } catch (NotFoundException e22222222222) {
                throw e22222222222;
            }
        } catch (NotFoundException e222222222222) {
            throw e222222222222;
        }
    }

    /* renamed from: p */
    public void m8502p() {
        try {
            if (this.f3558J) {
                VelocityTracker velocityTracker = this.f3586s;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f3578j);
                int yVelocity = (int) VelocityTrackerCompat.getYVelocity(velocityTracker, this.f3585r);
                this.f3589w = true;
                int f = m8458f();
                int scrollY = getScrollY();
                C1178e k = m8461k();
                m8472a(m8444a(k.f3532d, ((((float) scrollY) / ((float) f)) - k.f3529a) / k.f3533e, yVelocity, (int) (this.f3574f - this.fb)), true, true, yVelocity);
                m8454c();
                this.f3558J = false;
                return;
            }
            throw new IllegalStateException(zb[3]);
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public void removeView(View view) {
        try {
            if (this.f3553B) {
                removeViewInLayout(view);
            } else {
                super.removeView(view);
            }
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        if (this.f3557I != null) {
            this.f3557I.unregisterDataSetObserver(this.f3587t);
            this.f3557I.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.f3564Q.size(); i++) {
                C1178e c1178e = (C1178e) this.f3564Q.get(i);
                this.f3557I.destroyItem((ViewGroup) this, c1178e.f3532d, c1178e.f3531c);
            }
            this.f3557I.finishUpdate((ViewGroup) this);
            this.f3564Q.clear();
            m8462q();
            this.f3579k = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter2 = this.f3557I;
        try {
            this.f3557I = pagerAdapter;
            this.wb = 0;
            if (this.f3557I != null) {
                if (this.f3587t == null) {
                    this.f3587t = new bb(this, null);
                }
                this.f3557I.registerDataSetObserver(this.f3587t);
                this.f3589w = false;
                boolean z = this.tb;
                try {
                    this.tb = true;
                    this.wb = this.f3557I.getCount();
                    if (this.f3588v >= 0) {
                        this.f3557I.restoreState(this.f3571Z, this.nb);
                        m8471a(this.f3588v, false, true);
                        this.f3588v = -1;
                        this.f3571Z = null;
                        this.nb = null;
                    } else if (z) {
                        requestLayout();
                    } else {
                        try {
                            m8499m();
                        } catch (NotFoundException e) {
                            throw e;
                        }
                    }
                } catch (NotFoundException e2) {
                    throw e2;
                }
            }
            try {
                if (this.lb != null && pagerAdapter2 != pagerAdapter) {
                    this.lb.m8405a(pagerAdapter2, pagerAdapter);
                }
            } catch (NotFoundException e22) {
                throw e22;
            } catch (NotFoundException e222) {
                throw e222;
            }
        } catch (NotFoundException e2222) {
            throw e2222;
        } catch (NotFoundException e22222) {
            throw e22222;
        }
    }

    public void setCurrentItem(int i, boolean z) {
        this.f3589w = false;
        m8471a(i, z, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w(yb, zb[13] + i + zb[14] + 1);
            i = 1;
        }
        try {
            if (i != this.f3590x) {
                this.f3590x = i;
                m8499m();
            }
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.f3562O = onPageChangeListener;
    }

    protected boolean verifyDrawable(Drawable drawable) {
        try {
            if (!super.verifyDrawable(drawable)) {
                if (drawable != this.f3563P) {
                    return false;
                }
            }
            return true;
        } catch (NotFoundException e) {
            throw e;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }
}
