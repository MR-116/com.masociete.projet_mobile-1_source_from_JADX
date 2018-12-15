package fr.pcsoft.wdjava.ui.champs.slidingmenu.p070a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.KeyEventCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewConfigurationCompat;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fr.pcsoft.wdjava.ui.champs.slidingmenu.a.a */
public class C1258a extends ViewGroup {
    /* renamed from: a */
    private static final Interpolator f3683a = new C1273o();
    /* renamed from: d */
    private static final boolean f3684d = false;
    /* renamed from: h */
    private static final int f3685h = 600;
    /* renamed from: k */
    private static final int f3686k = -1;
    /* renamed from: o */
    private static final String f3687o = C1258a.m8716z(C1258a.m8717z("QO[>4lA/,SXG<>"));
    /* renamed from: q */
    private static final int f3688q = 25;
    /* renamed from: s */
    private static final boolean f3689s = true;
    /* renamed from: A */
    private boolean f3690A;
    /* renamed from: B */
    private C1264g f3691B;
    /* renamed from: C */
    private int f3692C;
    /* renamed from: D */
    private C1271m f3693D;
    /* renamed from: E */
    private int f3694E;
    /* renamed from: F */
    private C1260c f3695F;
    /* renamed from: G */
    private float f3696G;
    /* renamed from: H */
    private int f3697H;
    /* renamed from: b */
    private boolean f3698b;
    /* renamed from: c */
    private boolean f3699c;
    /* renamed from: e */
    protected int f3700e;
    /* renamed from: f */
    private boolean f3701f;
    /* renamed from: g */
    private float f3702g;
    /* renamed from: i */
    private float f3703i;
    /* renamed from: j */
    private C1262e f3704j;
    /* renamed from: l */
    private List<View> f3705l;
    /* renamed from: m */
    protected VelocityTracker f3706m;
    /* renamed from: n */
    private boolean f3707n;
    /* renamed from: p */
    private View f3708p;
    /* renamed from: r */
    private boolean f3709r;
    /* renamed from: t */
    protected int f3710t;
    /* renamed from: u */
    private Scroller f3711u;
    /* renamed from: v */
    protected int f3712v;
    /* renamed from: w */
    private int f3713w;
    /* renamed from: x */
    private C1262e f3714x;
    /* renamed from: y */
    private float f3715y;
    /* renamed from: z */
    private boolean f3716z;

    public C1258a(Context context) {
        this(context, null);
    }

    public C1258a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3700e = -1;
        this.f3716z = true;
        this.f3705l = new ArrayList();
        this.f3707n = true;
        this.f3710t = 0;
        this.f3690A = false;
        this.f3703i = 0.0f;
        m8734b();
    }

    /* renamed from: a */
    private int m8702a(float f, int i, int i2) {
        int i3 = this.f3697H;
        return (Math.abs(i2) <= this.f3692C || Math.abs(i) <= this.f3694E) ? Math.round(((float) this.f3697H) + f) : (i <= 0 || i2 <= 0) ? (i >= 0 || i2 >= 0) ? i3 : i3 + 1 : i3 - 1;
    }

    /* renamed from: a */
    private int m8703a(MotionEvent motionEvent, int i) {
        int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i);
        if (findPointerIndex == -1) {
            this.f3700e = -1;
        }
        return findPointerIndex;
    }

    /* renamed from: a */
    private void m8704a() {
        this.f3701f = true;
        this.f3690A = false;
    }

    /* renamed from: a */
    private boolean m8705a(MotionEvent motionEvent) {
        Rect rect = new Rect();
        for (View hitRect : this.f3705l) {
            hitRect.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m8706b(MotionEvent motionEvent) {
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.f3700e) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.f3715y = MotionEventCompat.getX(motionEvent, actionIndex);
            this.f3700e = MotionEventCompat.getPointerId(motionEvent, actionIndex);
            if (this.f3706m != null) {
                this.f3706m.clear();
            }
        }
    }

    /* renamed from: b */
    private void m8707b(boolean z) {
        if (this.f3709r != z) {
            this.f3709r = z;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    childAt.setDrawingCacheEnabled(z);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m8708b(float f) {
        return m8753o() ? this.f3691B.m8775a(f) : this.f3691B.m8791c(f);
    }

    /* renamed from: c */
    private boolean m8709c(MotionEvent motionEvent) {
        int x = (int) (motionEvent.getX() + this.f3703i);
        if (m8753o()) {
            return this.f3691B.m8777a(this.f3708p, this.f3697H, (float) x);
        }
        switch (this.f3710t) {
            case 0:
                return this.f3691B.m8776a(this.f3708p, x);
            case 1:
                return !m8705a(motionEvent);
            case 2:
                return false;
            default:
                return false;
        }
    }

    /* renamed from: d */
    private void m8710d(MotionEvent motionEvent) {
        int i = this.f3700e;
        int a = m8703a(motionEvent, i);
        if (i != -1) {
            float x = MotionEventCompat.getX(motionEvent, a);
            float f = x - this.f3715y;
            float abs = Math.abs(f);
            float y = MotionEventCompat.getY(motionEvent, a);
            float abs2 = Math.abs(y - this.f3696G);
            if (abs > ((float) (m8753o() ? this.f3713w / 2 : this.f3713w)) && abs > abs2 && m8708b(f)) {
                m8704a();
                this.f3715y = x;
                this.f3696G = y;
                m8707b(true);
            } else if (abs > ((float) this.f3713w)) {
                this.f3698b = true;
            }
        }
    }

    /* renamed from: g */
    private void m8711g() {
        if (this.f3699c) {
            m8707b(false);
            this.f3711u.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f3711u.getCurrX();
            int currY = this.f3711u.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
            if (m8753o()) {
                if (this.f3695F != null) {
                    this.f3695F.m8757a();
                }
            } else if (this.f3693D != null) {
                this.f3693D.m8902a();
            }
        }
        this.f3699c = false;
    }

    /* renamed from: g */
    private void m8712g(int i) {
        int width = getWidth();
        int i2 = i % width;
        m8721a(i / width, ((float) i2) / ((float) width), i2);
    }

    /* renamed from: l */
    private void m8713l() {
        this.f3690A = false;
        this.f3701f = false;
        this.f3698b = false;
        this.f3700e = -1;
        if (this.f3706m != null) {
            this.f3706m.recycle();
            this.f3706m = null;
        }
    }

    /* renamed from: p */
    private int m8714p() {
        return this.f3691B.m8779b(this.f3708p);
    }

    /* renamed from: q */
    private int m8715q() {
        return this.f3691B.m8792d(this.f3708p);
    }

    /* renamed from: z */
    private static String m8716z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 18;
                    break;
                case 1:
                    i2 = 58;
                    break;
                case 2:
                    i2 = 40;
                    break;
                case 3:
                    i2 = 74;
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
    private static char[] m8717z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 91);
        }
        return toCharArray;
    }

    /* renamed from: a */
    float m8718a(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    /* renamed from: a */
    public int m8719a(int i) {
        switch (i) {
            case 0:
                return m8738c();
            case 1:
                return this.f3708p.getWidth();
            default:
                return 0;
        }
    }

    /* renamed from: a */
    C1262e m8720a(C1262e c1262e) {
        C1262e c1262e2 = this.f3704j;
        this.f3704j = c1262e;
        return c1262e2;
    }

    /* renamed from: a */
    protected void m8721a(int i, float f, int i2) {
        if (this.f3714x != null) {
            this.f3714x.mo3508a(i, f, i2);
        }
        if (this.f3704j != null) {
            this.f3704j.mo3508a(i, f, i2);
        }
    }

    /* renamed from: a */
    void m8722a(int i, int i2) {
        m8723a(i, i2, 0);
    }

    /* renamed from: a */
    void m8723a(int i, int i2, int i3) {
        if (getChildCount() == 0) {
            m8707b(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            m8711g();
            if (m8753o()) {
                if (this.f3695F != null) {
                    this.f3695F.m8757a();
                    return;
                }
                return;
            } else if (this.f3693D != null) {
                this.f3693D.m8902a();
                return;
            } else {
                return;
            }
        }
        m8707b(true);
        this.f3699c = true;
        int c = m8738c();
        int i6 = c / 2;
        float a = (((float) i6) * m8718a(Math.min(1.0f, (((float) Math.abs(i4)) * 1.0f) / ((float) c)))) + ((float) i6);
        int abs = Math.abs(i3);
        if (abs > 0) {
            c = Math.round(1000.0f * Math.abs(a / ((float) abs))) * 4;
        } else {
            c = (int) (((((float) Math.abs(i4)) / ((float) c)) + 1.0f) * 100.0f);
            c = f3685h;
        }
        this.f3711u.startScroll(scrollX, scrollY, i4, i5, Math.min(c, f3685h));
        invalidate();
    }

    /* renamed from: a */
    public void m8724a(int i, boolean z) {
        m8725a(i, z, false);
    }

    /* renamed from: a */
    void m8725a(int i, boolean z, boolean z2) {
        m8726a(i, z, z2, 0);
    }

    /* renamed from: a */
    void m8726a(int i, boolean z, boolean z2, int i2) {
        if (z2 || this.f3697H != i) {
            int b = this.f3691B.m8778b(i);
            boolean z3 = this.f3697H != b;
            this.f3697H = b;
            int e = m8744e(this.f3697H);
            if (z3 && this.f3714x != null) {
                this.f3714x.mo3507a(b);
            }
            if (z3 && this.f3704j != null) {
                this.f3704j.mo3507a(b);
            }
            if (z) {
                m8723a(e, 0, i2);
                return;
            }
            m8711g();
            scrollTo(e, 0);
            return;
        }
        m8707b(false);
    }

    /* renamed from: a */
    public void m8727a(View view) {
        if (this.f3708p != null) {
            removeView(this.f3708p);
        }
        this.f3708p = view;
        addView(this.f3708p);
    }

    /* renamed from: a */
    public void m8728a(C1260c c1260c) {
        this.f3695F = c1260c;
    }

    /* renamed from: a */
    public void m8729a(C1264g c1264g) {
        this.f3691B = c1264g;
    }

    /* renamed from: a */
    public void m8730a(C1271m c1271m) {
        this.f3693D = c1271m;
    }

    /* renamed from: a */
    public void m8731a(boolean z) {
        this.f3716z = z;
    }

    /* renamed from: a */
    public boolean m8732a(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                return m8737b(17);
            case 22:
                return m8737b(66);
            case 61:
                return VERSION.SDK_INT >= 11 ? KeyEventCompat.hasNoModifiers(keyEvent) ? m8737b(2) : KeyEventCompat.hasModifiers(keyEvent, 1) ? m8737b(1) : false : false;
            default:
                return false;
        }
    }

    /* renamed from: a */
    protected boolean m8733a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom()) {
                    if (m8733a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && ViewCompat.canScrollHorizontally(view, -i);
    }

    /* renamed from: b */
    void m8734b() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f3711u = new Scroller(context, f3683a);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3713w = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
        this.f3694E = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3712v = viewConfiguration.getScaledMaximumFlingVelocity();
        m8720a(new C1266i(this));
        this.f3692C = (int) (context.getResources().getDisplayMetrics().density * 25.0f);
    }

    /* renamed from: b */
    public void m8735b(View view) {
        this.f3705l.remove(view);
    }

    /* renamed from: b */
    public void m8736b(C1262e c1262e) {
        this.f3714x = c1262e;
    }

    /* renamed from: b */
    public boolean m8737b(int i) {
        boolean d;
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        if (findNextFocus == null || findNextFocus == findFocus) {
            if (i == 17 || i == 1) {
                d = m8742d();
            } else {
                if (i == 66 || i == 2) {
                    d = m8746f();
                }
                d = false;
            }
        } else if (i == 17) {
            d = findNextFocus.requestFocus();
        } else {
            if (i == 66) {
                d = (findFocus == null || findNextFocus.getLeft() > findFocus.getLeft()) ? findNextFocus.requestFocus() : m8746f();
            }
            d = false;
        }
        if (d) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return d;
    }

    /* renamed from: c */
    public int m8738c() {
        return this.f3691B == null ? 0 : this.f3691B.m8799f();
    }

    /* renamed from: c */
    public void m8739c(int i) {
        this.f3708p.setPadding(i, this.f3708p.getPaddingTop(), this.f3708p.getPaddingRight(), this.f3708p.getPaddingBottom());
    }

    /* renamed from: c */
    public void m8740c(View view) {
        if (!this.f3705l.contains(view)) {
            this.f3705l.add(view);
        }
    }

    public void computeScroll() {
        if (this.f3711u.isFinished() || !this.f3711u.computeScrollOffset()) {
            m8711g();
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f3711u.getCurrX();
        int currY = this.f3711u.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            m8712g(currX);
        }
        invalidate();
    }

    /* renamed from: d */
    public void m8741d(int i) {
        m8725a(i, true, false);
    }

    /* renamed from: d */
    boolean m8742d() {
        if (this.f3697H <= 0) {
            return false;
        }
        m8724a(this.f3697H - 1, true);
        return true;
    }

    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f3691B.m8769a(this.f3708p, canvas);
        this.f3691B.m8784b(this.f3708p, canvas, m8754r());
        this.f3691B.m8770a(this.f3708p, canvas, m8754r());
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m8732a(keyEvent);
    }

    /* renamed from: e */
    public int m8743e() {
        return this.f3697H;
    }

    /* renamed from: e */
    public int m8744e(int i) {
        switch (i) {
            case 0:
            case 2:
                return this.f3691B.m8780b(this.f3708p, i);
            case 1:
                return this.f3708p.getLeft();
            default:
                return 0;
        }
    }

    /* renamed from: f */
    public void m8745f(int i) {
        this.f3710t = i;
    }

    /* renamed from: f */
    boolean m8746f() {
        if (this.f3697H >= 1) {
            return false;
        }
        m8724a(this.f3697H + 1, true);
        return true;
    }

    /* renamed from: h */
    public boolean m8747h() {
        return this.f3716z;
    }

    /* renamed from: i */
    public final void m8748i() {
        this.f3708p = null;
        this.f3711u = null;
        this.f3706m = null;
        this.f3691B = null;
        this.f3714x = null;
        this.f3704j = null;
        this.f3693D = null;
        this.f3695F = null;
        if (this.f3705l != null) {
            this.f3705l.clear();
            this.f3705l = null;
        }
    }

    /* renamed from: j */
    public int m8749j() {
        return this.f3691B == null ? 0 : this.f3691B.m8804i();
    }

    /* renamed from: k */
    public void m8750k() {
        this.f3705l.clear();
    }

    /* renamed from: m */
    public View m8751m() {
        return this.f3708p;
    }

    /* renamed from: n */
    public int m8752n() {
        return this.f3708p.getLeft() + this.f3708p.getPaddingLeft();
    }

    /* renamed from: o */
    public boolean m8753o() {
        return this.f3697H == 0 || this.f3697H == 2;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f3716z) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1 || (action != 0 && this.f3698b)) {
            m8713l();
            return false;
        }
        switch (action) {
            case 0:
                this.f3707n = true;
                action = MotionEventCompat.getActionIndex(motionEvent);
                this.f3700e = MotionEventCompat.getPointerId(motionEvent, action);
                if (this.f3700e != -1) {
                    float x = MotionEventCompat.getX(motionEvent, action);
                    this.f3702g = x;
                    this.f3715y = x;
                    this.f3696G = MotionEventCompat.getY(motionEvent, action);
                    if (!m8709c(motionEvent)) {
                        this.f3698b = true;
                        break;
                    }
                    action = this.f3691B.m8796e();
                    int rawX = (int) motionEvent.getRawX();
                    int d = C1511l.m10532d(48.0f, 2);
                    if ((action == 0 || action == 2) && rawX < d) {
                        this.f3707n = false;
                    }
                    if ((action == 1 || action == 2) && rawX > C1014a.m7327b().mo3295a(false).x - d) {
                        this.f3707n = false;
                    }
                    this.f3701f = false;
                    this.f3698b = false;
                    if (m8753o() && this.f3691B.m8786b(this.f3708p, this.f3697H, motionEvent.getX() + this.f3703i)) {
                        this.f3690A = true;
                        break;
                    }
                }
                break;
            case 2:
                m8710d(motionEvent);
                break;
            case 6:
                m8706b(motionEvent);
                break;
        }
        if (!this.f3701f) {
            if (this.f3706m == null) {
                this.f3706m = VelocityTracker.obtain();
            }
            this.f3706m.addMovement(motionEvent);
        }
        return this.f3701f || this.f3690A;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f3708p.layout(0, 0, i3 - i, i4 - i2);
    }

    protected void onMeasure(int i, int i2) {
        int defaultSize = C1258a.getDefaultSize(0, i);
        int defaultSize2 = C1258a.getDefaultSize(0, i2);
        setMeasuredDimension(defaultSize, defaultSize2);
        this.f3708p.measure(C1258a.getChildMeasureSpec(i, 0, defaultSize), C1258a.getChildMeasureSpec(i2, 0, defaultSize2));
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m8711g();
            scrollTo(m8744e(this.f3697H), getScrollY());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f3716z) {
            return false;
        }
        if (!this.f3701f && !m8709c(motionEvent)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (this.f3706m == null) {
            this.f3706m = VelocityTracker.obtain();
        }
        this.f3706m.addMovement(motionEvent);
        float x;
        int xVelocity;
        float scrollX;
        switch (action & 255) {
            case 0:
                m8711g();
                this.f3700e = MotionEventCompat.getPointerId(motionEvent, MotionEventCompat.getActionIndex(motionEvent));
                x = motionEvent.getX();
                this.f3702g = x;
                this.f3715y = x;
                break;
            case 1:
                if (!this.f3701f) {
                    if (this.f3690A && this.f3691B.m8786b(this.f3708p, this.f3697H, motionEvent.getX() + this.f3703i)) {
                        m8741d(1);
                        m8713l();
                        break;
                    }
                }
                VelocityTracker velocityTracker = this.f3706m;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f3712v);
                xVelocity = (int) VelocityTrackerCompat.getXVelocity(velocityTracker, this.f3700e);
                scrollX = ((float) (getScrollX() - m8744e(this.f3697H))) / ((float) m8738c());
                int a = m8703a(motionEvent, this.f3700e);
                if (this.f3700e != -1) {
                    m8726a(m8702a(scrollX, xVelocity, (int) (MotionEventCompat.getX(motionEvent, a) - this.f3702g)), true, true, xVelocity);
                } else {
                    m8726a(this.f3697H, true, true, xVelocity);
                }
                this.f3700e = -1;
                m8713l();
                break;
            case 2:
                if (!this.f3701f) {
                    m8710d(motionEvent);
                    if (this.f3698b) {
                        return false;
                    }
                }
                if (this.f3701f) {
                    xVelocity = m8703a(motionEvent, this.f3700e);
                    if (this.f3700e != -1) {
                        x = MotionEventCompat.getX(motionEvent, xVelocity);
                        scrollX = this.f3715y - x;
                        this.f3715y = x;
                        float scrollX2 = ((float) getScrollX()) + scrollX;
                        x = (float) m8715q();
                        scrollX = (float) m8714p();
                        if (scrollX2 >= x) {
                            x = scrollX2 > scrollX ? scrollX : scrollX2;
                        }
                        this.f3715y += x - ((float) ((int) x));
                        scrollTo((int) x, getScrollY());
                        m8712g((int) x);
                        break;
                    }
                }
                break;
            case 3:
                if (this.f3701f) {
                    m8725a(this.f3697H, true, true);
                    this.f3700e = -1;
                    m8713l();
                    break;
                }
                break;
            case 5:
                xVelocity = MotionEventCompat.getActionIndex(motionEvent);
                this.f3715y = MotionEventCompat.getX(motionEvent, xVelocity);
                this.f3700e = MotionEventCompat.getPointerId(motionEvent, xVelocity);
                break;
            case 6:
                m8706b(motionEvent);
                xVelocity = m8703a(motionEvent, this.f3700e);
                if (this.f3700e != -1) {
                    this.f3715y = MotionEventCompat.getX(motionEvent, xVelocity);
                    break;
                }
                break;
        }
        return true;
    }

    /* renamed from: r */
    protected float m8754r() {
        return Math.abs(this.f3703i - ((float) this.f3708p.getLeft())) / ((float) (this.f3703i > 0.0f ? m8749j() : m8738c()));
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.f3707n) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: s */
    public int m8755s() {
        return this.f3710t;
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        this.f3703i = (float) i;
        this.f3691B.m8768a(this.f3708p, i, i2);
        ((C1270l) getParent()).m8826a(m8754r());
    }
}
