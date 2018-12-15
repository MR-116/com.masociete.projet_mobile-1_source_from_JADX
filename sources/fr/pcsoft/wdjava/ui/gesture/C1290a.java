package fr.pcsoft.wdjava.ui.gesture;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListView;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.p064a.C1034d;
import fr.pcsoft.wdjava.ui.p069g.C1402b;
import fr.pcsoft.wdjava.ui.p069g.C1407h;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: fr.pcsoft.wdjava.ui.gesture.a */
public abstract class C1290a implements C1171d, AnimatorListener {
    /* renamed from: A */
    private static final int f3796A = C1511l.m10532d(16.0f, 2);
    /* renamed from: D */
    public static final int f3797D = 16;
    /* renamed from: F */
    private static final int f3798F = C1511l.f4646t;
    /* renamed from: G */
    public static final byte f3799G = (byte) 2;
    /* renamed from: H */
    public static final byte f3800H = (byte) 1;
    /* renamed from: J */
    public static final byte f3801J = (byte) 0;
    /* renamed from: M */
    public static final int f3802M = 2;
    /* renamed from: N */
    public static final byte f3803N = (byte) 2;
    /* renamed from: O */
    public static final int f3804O = 1;
    /* renamed from: R */
    private static final String[] f3805R = new String[]{C1290a.m9008z(C1290a.m9009z(".\u0012KL*\u0019@UF-\u0018@]L\u0007GXY/\u000e\f\u0019M:K\fX\t2\u0014QF;\u000e@UH&\u0004\u0015Mj7\u0002\f][:\u0005@IH-K\tW]-\u0004\u0013IL<\u001f\tVGq")), C1290a.m9008z(C1290a.m9009z("&MA0\u000f\u0005\u0019E>\u0012\u000fL]\u001c\u0003\tUM-\u000e\u000e\u0019G0\u0005@M[0\u001e\u0016ÐL\u001b\u0001K\t6\u0005\u0014KF,\u001b\u0005Z]6\u0004\u000e\u0017")), C1290a.m9008z(C1290a.m9009z("\u0007\u0001@F*\u001f#Q@3\u000f\u0012\\G"))};
    /* renamed from: g */
    public static final int f3806g = 4;
    /* renamed from: i */
    public static final int f3807i = 8;
    /* renamed from: k */
    public static final int f3808k = 32;
    /* renamed from: n */
    private static final int f3809n = C1511l.f4637k;
    /* renamed from: w */
    public static final byte f3810w = (byte) 1;
    /* renamed from: B */
    private int f3811B = 0;
    /* renamed from: C */
    private int f3812C = -1;
    /* renamed from: E */
    private int f3813E = 0;
    /* renamed from: I */
    private int f3814I = 0;
    /* renamed from: K */
    private C0528b f3815K = null;
    /* renamed from: L */
    private int f3816L = 0;
    /* renamed from: P */
    private int f3817P = 0;
    /* renamed from: Q */
    private int f3818Q = -1;
    /* renamed from: a */
    private AbsListView f3819a = null;
    /* renamed from: b */
    private Method f3820b = null;
    /* renamed from: c */
    private int f3821c = 0;
    /* renamed from: d */
    private Rect f3822d = new Rect();
    /* renamed from: e */
    private Drawable f3823e = null;
    /* renamed from: f */
    private long f3824f = 0;
    /* renamed from: h */
    private Paint f3825h = null;
    /* renamed from: j */
    private byte f3826j = (byte) 0;
    /* renamed from: l */
    private C1417l f3827l = null;
    /* renamed from: m */
    private Drawable f3828m = null;
    /* renamed from: o */
    private int f3829o = 0;
    /* renamed from: p */
    private int f3830p = 0;
    /* renamed from: q */
    private int f3831q = -1;
    /* renamed from: r */
    private List<ValueAnimator> f3832r = null;
    /* renamed from: s */
    private boolean f3833s = false;
    /* renamed from: t */
    private int f3834t = 0;
    /* renamed from: u */
    private byte f3835u = (byte) 1;
    /* renamed from: v */
    private int f3836v = 0;
    /* renamed from: x */
    private C0527h f3837x = null;
    /* renamed from: y */
    private int f3838y = 1;
    /* renamed from: z */
    private int f3839z = -1;

    public C1290a(AbsListView absListView, int i) {
        this.f3819a = absListView;
        this.f3816L = i;
    }

    /* renamed from: a */
    private int m8992a(View view) {
        return view == null ? 0 : (int) view.getTranslationX();
    }

    /* renamed from: a */
    private View m8993a(int i, int i2) {
        View e = mo3529e(i);
        if (e == null) {
            return null;
        }
        int c = mo3528c(i, this.f3838y);
        if ((this.f3838y == 1 && (this.f3817P & 2) == 0) || (this.f3838y == 2 && (this.f3817P & 4) == 0)) {
            i2 = (int) Math.round((((double) i2) * 10.0d) / 100.0d);
        } else if ((this.f3817P & 8) != 0) {
            int i3 = (c * 2) / 3;
            if (i3 > 0) {
                e.setAlpha(((float) ((int) Math.max(0.0d, Math.min(255.0d, (((double) (i3 - Math.abs(i2))) / ((double) i3)) * 255.0d)))) / 255.0f);
            }
        }
        if (this.f3838y == 1 && r14 > c) {
            i2 = c;
        } else if (this.f3838y == 2 && r14 < (-c)) {
            i2 = -c;
        }
        e.setTranslationX((float) i2);
        e.invalidate();
        return e;
    }

    /* renamed from: a */
    private void m8994a(int i, long j) {
        C0938m.m6814b(new C1413f(this, i, j));
    }

    /* renamed from: a */
    private boolean m8995a(MotionEvent motionEvent) {
        boolean z = true;
        if (this.f3826j != (byte) 0) {
            if (this.f3826j == (byte) 1) {
                m9007l();
                return true;
            } else if (this.f3826j == (byte) 2) {
                if (this.f3818Q >= 0 && this.f3818Q < this.f3819a.getCount() && m9033o() != 0) {
                    View e = mo3529e(this.f3818Q);
                    if (e != null) {
                        int a = m8992a(e);
                        int c = mo3528c(this.f3818Q, this.f3838y) / 2;
                        if ((this.f3838y != 1 || a <= c) && (this.f3838y != 2 || a >= (-c))) {
                            m9013a(this.f3818Q, true);
                        } else {
                            m9019c(this.f3818Q);
                        }
                        m9005g();
                        return z;
                    }
                }
                z = false;
                m9005g();
                return z;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m8996b() {
        if (this.f3820b == null) {
            try {
                this.f3820b = AbsListView.class.getDeclaredMethod(f3805R[2], new Class[0]);
                this.f3820b.setAccessible(true);
            } catch (Exception e) {
                C0691a.m2857a(f3805R[1], e);
                return;
            }
        }
        if (this.f3820b != null) {
            try {
                this.f3820b.invoke(this.f3819a, new Object[0]);
            } catch (Exception e2) {
                C0691a.m2857a(f3805R[0], e2);
            }
        }
    }

    /* renamed from: b */
    private void m8997b(int i) {
        if (this.f3815K != null) {
            this.f3815K.onSwipeEnd(i);
        }
        if (this.f3831q == i) {
            this.f3831q = -1;
        }
    }

    /* renamed from: b */
    private void m8998b(int i, int i2) {
        int a = this.f3827l.m10011a();
        int d = this.f3827l.m10015d();
        int min = Math.min(Math.max(0, i2 - this.f3811B) + this.f3834t, (this.f3834t + this.f3819a.getHeight()) - this.f3827l.getHeight());
        if (min != d) {
            this.f3827l.m10014b(a, min);
        }
        a = m9003e(0, i2);
        if (a >= 0) {
            if (a != this.f3839z) {
                this.f3839z = a;
                if (this.f3839z < this.f3819a.getCount() - 1) {
                    a = this.f3839z - this.f3819a.getFirstVisiblePosition();
                    if (this.f3839z > this.f3812C) {
                        a++;
                    }
                    View childAt = this.f3819a.getChildAt(this.f3812C - this.f3819a.getFirstVisiblePosition());
                    int childCount = this.f3819a.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt2 = this.f3819a.getChildAt(i3);
                        min = this.f3816L;
                        if (childAt2.equals(childAt)) {
                            if (this.f3839z == this.f3812C) {
                                d = 4;
                            } else {
                                min = 1;
                                d = 0;
                            }
                        } else if (i3 != a || this.f3839z >= this.f3819a.getCount() - 1) {
                            d = 0;
                        } else {
                            min *= 2;
                            d = 0;
                        }
                        LayoutParams layoutParams = childAt2.getLayoutParams();
                        layoutParams.height = min;
                        childAt2.setLayoutParams(layoutParams);
                        childAt2.setVisibility(d);
                    }
                    m8996b();
                }
            }
            min = this.f3819a.getHeight();
            if (i2 >= min / 3) {
                this.f3813E = min / 3;
            }
            if (i2 <= (min * 2) / 3) {
                this.f3829o = (min * 2) / 3;
            }
            if (i2 > this.f3829o) {
                d = i2 > (this.f3829o + min) / 2 ? f3796A : f3809n;
            } else if (i2 < this.f3813E) {
                d = i2 < this.f3813E / 2 ? -f3796A : -f3809n;
            } else {
                d = 0;
            }
            if (d != 0) {
                int pointToPosition = this.f3819a.pointToPosition(0, min / 2);
                if (pointToPosition != -1) {
                    View childAt3 = this.f3819a.getChildAt(pointToPosition - this.f3819a.getFirstVisiblePosition());
                    if (childAt3 != null && this.f3819a.getFirstVisiblePosition() + this.f3819a.getChildCount() < this.f3819a.getCount() && (this.f3819a instanceof ListView)) {
                        ((ListView) this.f3819a).setSelectionFromTop(pointToPosition, childAt3.getTop() - d);
                    }
                }
            }
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    private boolean m8999b(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (m9036r() == 0) {
            return false;
        }
        if (this.f3826j == (byte) 1 && this.f3827l != null) {
            m8998b(x, y);
            return true;
        } else if (this.f3826j != (byte) 2 || this.f3818Q < 0) {
            return false;
        } else {
            boolean z;
            boolean z2 = m9033o() != 0;
            if (z2) {
                z = true;
            } else {
                View childAt = this.f3819a.getChildAt(this.f3818Q - this.f3819a.getFirstVisiblePosition());
                if (childAt == null || Math.abs((x - childAt.getLeft()) - this.f3830p) <= C1511l.f4643q * 2 || Math.abs((y - childAt.getTop()) - this.f3811B) >= C1511l.f4643q * 2 || this.f3836v != childAt.getTop()) {
                    z = false;
                } else {
                    if (kb.m3965a(C0657a.KIT_KAT)) {
                        this.f3819a.cancelPendingInputEvents();
                    }
                    z = this.f3815K.onPrepareSwipe(this.f3818Q);
                }
            }
            if (!z) {
                return false;
            }
            y = x - this.f3830p;
            if (!z2) {
                if (this.f3823e == null) {
                    this.f3823e = new ColorDrawable(0);
                }
                Drawable selector = this.f3819a.getSelector();
                if (selector != this.f3823e) {
                    this.f3828m = selector;
                    this.f3819a.setSelector(this.f3823e);
                    this.f3819a.invalidate();
                }
                this.f3838y = m9004g(y);
                this.f3815K.onSwipeStart(this.f3818Q, this.f3838y);
            }
            if (m8993a(this.f3818Q, y) == null) {
                return false;
            }
            this.f3821c = Math.max(this.f3821c, Math.abs(y));
            return true;
        }
    }

    /* renamed from: c */
    private boolean m9000c(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (m9035q() || m9030k()) {
            int pointToPosition = this.f3819a.pointToPosition(x, y);
            this.f3824f = System.currentTimeMillis();
            if (this.f3831q >= 0) {
                if (this.f3831q == pointToPosition) {
                    return false;
                }
                m9002d(this.f3831q);
            }
            if (pointToPosition == -1) {
                return false;
            }
            if (!(this.f3832r == null || this.f3832r.isEmpty())) {
                for (ValueAnimator valueAnimator : this.f3832r) {
                    if ((valueAnimator.isStarted() || valueAnimator.isRunning()) && (valueAnimator instanceof C1402b) && ((C1402b) valueAnimator).mo3769b() == pointToPosition) {
                        return true;
                    }
                }
            }
            View childAt = this.f3819a.getChildAt(pointToPosition - this.f3819a.getFirstVisiblePosition());
            this.f3811B = y - childAt.getTop();
            this.f3830p = x - childAt.getLeft();
            this.f3814I = ((int) motionEvent.getRawX()) - x;
            this.f3834t = ((int) motionEvent.getRawY()) - y;
            this.f3836v = childAt.getTop();
            if ((m9035q() && this.f3835u == (byte) 1 && this.f3830p <= f3798F) || (this.f3835u == (byte) 2 && this.f3830p >= childAt.getWidth() - f3798F)) {
                childAt = this.f3819a.getChildAt(pointToPosition - this.f3819a.getFirstVisiblePosition());
                if (childAt == null) {
                    return false;
                }
                this.f3826j = (byte) 1;
                this.f3812C = pointToPosition;
                if (!this.f3837x.onDrag(this.f3812C)) {
                    return false;
                }
                this.f3827l = new C1417l(childAt);
                this.f3827l.m10012a(this.f3814I, childAt.getTop() + this.f3834t);
                float f = (float) C1511l.f4643q;
                int height = this.f3819a.getHeight();
                this.f3813E = (int) Math.min(((float) y) - f, (float) (height / 3));
                this.f3829o = (int) Math.max(f + ((float) y), (float) ((height * 2) / 3));
                return true;
            } else if (m9030k()) {
                this.f3826j = (byte) 2;
                this.f3818Q = pointToPosition;
                this.f3821c = 0;
            }
        }
        return false;
    }

    /* renamed from: d */
    private int m9001d(int i, int i2) {
        for (int childCount = this.f3819a.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f3819a.getChildAt(childCount).getHitRect(this.f3822d);
            if (this.f3822d.contains(i, i2)) {
                return this.f3819a.getFirstVisiblePosition() + childCount;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private void m9002d(int i) {
        if (this.f3831q == i) {
            this.f3831q = -1;
        }
        C0938m.m6814b(new C1412c(this, i));
    }

    /* renamed from: e */
    private int m9003e(int i, int i2) {
        int i3 = (i2 - this.f3811B) - (this.f3816L / 2);
        int d = m9001d(i, i3);
        return d >= 0 ? d <= this.f3812C ? d + 1 : d : i3 < 0 ? 0 : d;
    }

    /* renamed from: g */
    private int m9004g(int i) {
        return i > 0 ? 1 : 2;
    }

    /* renamed from: g */
    private void m9005g() {
        if (this.f3828m != null) {
            this.f3819a.setSelector(this.f3828m);
            this.f3828m = null;
        }
        this.f3818Q = -1;
        this.f3821c = 0;
        this.f3826j = (byte) 0;
    }

    /* renamed from: j */
    private final boolean m9006j(int i) {
        return i == 1 ? (this.f3817P & 16) > 0 : (this.f3817P & 32) > 0;
    }

    /* renamed from: l */
    private void m9007l() {
        if (this.f3826j == (byte) 1 && this.f3827l != null && this.f3812C >= 0) {
            this.f3827l.m10016e();
            if (m9035q() && this.f3812C >= 0 && this.f3812C < this.f3819a.getCount() && this.f3839z >= 0 && this.f3839z < this.f3819a.getCount()) {
                this.f3837x.onDrop(this.f3812C, this.f3839z);
            }
            this.f3839z = -1;
            this.f3812C = -1;
            this.f3826j = (byte) 0;
            int i = 0;
            while (true) {
                View childAt = this.f3819a.getChildAt(i);
                if (childAt == null) {
                    m8996b();
                    childAt = this.f3819a.getChildAt(i);
                    if (childAt == null) {
                        return;
                    }
                }
                LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.height = this.f3816L;
                childAt.setLayoutParams(layoutParams);
                childAt.setVisibility(0);
                i++;
            }
        }
    }

    /* renamed from: z */
    private static String m9008z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 107;
                    break;
                case 1:
                    i2 = 96;
                    break;
                case 2:
                    i2 = 57;
                    break;
                case 3:
                    i2 = 41;
                    break;
                default:
                    i2 = 95;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9009z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 95);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final void mo3433a() {
        this.f3837x = null;
        this.f3822d = null;
        this.f3828m = null;
        this.f3823e = null;
        if (this.f3832r != null) {
            if (!this.f3832r.isEmpty()) {
                Iterator it = this.f3832r.iterator();
                while (it.hasNext()) {
                    ValueAnimator valueAnimator = (ValueAnimator) it.next();
                    it.remove();
                    valueAnimator.cancel();
                }
                this.f3832r.clear();
            }
            this.f3832r = null;
        }
        if (this.f3827l != null) {
            this.f3827l.m10016e();
        }
        this.f3819a = null;
        this.f3825h = null;
        this.f3820b = null;
    }

    /* renamed from: a */
    public final void m9011a(int i, C0528b c0528b) {
        this.f3817P = i;
        this.f3815K = c0528b;
    }

    /* renamed from: a */
    public final void m9012a(int i, C0527h c0527h) {
        if (i >= 1 || i <= 2) {
            this.f3835u = (byte) i;
        }
        this.f3837x = c0527h;
    }

    /* renamed from: a */
    public void m9013a(int i, boolean z) {
        if (i == this.f3831q) {
            this.f3831q = -1;
        }
        if (z) {
            m9027i(i);
            return;
        }
        View e = mo3529e(i);
        if (e != null) {
            e.setTranslationX(0.0f);
            if ((this.f3817P & 8) > 0) {
                e.setAlpha(1.0f);
            }
            m8997b(i);
        }
    }

    /* renamed from: a */
    public final void m9014a(Canvas canvas, int i, int i2) {
        if (i >= f3798F * 2) {
            if (this.f3825h == null) {
                this.f3825h = new Paint();
                this.f3825h.setColor(C1034d.f2969b);
                this.f3825h.setAlpha(96);
            }
            int i3 = this.f3835u == (byte) 2 ? i - f3798F : 0;
            int i4 = f3798F / 5;
            for (int i5 = i4 * 3; i5 < i2 - (i4 * 3); i5 = (i4 * 2) + i5) {
                canvas.drawRect((float) (i3 + i4), (float) i5, (float) ((i4 * 2) + i3), (float) (i5 + i4), this.f3825h);
                canvas.drawRect((float) ((i4 * 3) + i3), (float) i5, (float) ((i4 * 4) + i3), (float) (i5 + i4), this.f3825h);
            }
        }
    }

    /* renamed from: a */
    public final boolean m9015a(int i) {
        if (i == this.f3818Q) {
            return m9033o() != 0;
        }
        if (!(this.f3832r == null || this.f3832r.isEmpty())) {
            for (ValueAnimator valueAnimator : this.f3832r) {
                if ((valueAnimator instanceof C1414i) && ((C1414i) valueAnimator).mo3769b() == i) {
                    return true;
                }
            }
        }
        View e = mo3529e(i);
        return (e == null || m8992a(e) == 0) ? false : true;
    }

    /* renamed from: a */
    public boolean mo3434a(View view, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        x = (int) motionEvent.getY();
        switch (motionEvent.getAction() & 255) {
            case 0:
                return m9000c(motionEvent);
            case 1:
            case 3:
                return m8995a(motionEvent);
            case 2:
                return m8999b(motionEvent);
            default:
                return false;
        }
    }

    /* renamed from: c */
    public abstract int mo3528c(int i, int i2);

    /* renamed from: c */
    public void m9018c() {
        m9032n();
    }

    /* renamed from: c */
    public void m9019c(int i) {
        if (i >= 0) {
            if (this.f3832r == null) {
                this.f3832r = new LinkedList();
            }
            C1416k c1416k = new C1416k(this, i);
            this.f3832r.add(c1416k);
            c1416k.addListener(this);
            c1416k.start();
        }
    }

    /* renamed from: d */
    public final void m9020d() {
        this.f3837x = null;
    }

    /* renamed from: e */
    public final int m9021e() {
        return this.f3818Q;
    }

    /* renamed from: e */
    public abstract View mo3529e(int i);

    /* renamed from: f */
    public final void m9023f() {
        this.f3817P = 0;
        this.f3815K = null;
    }

    /* renamed from: f */
    public final void m9024f(int i) {
        this.f3816L = i;
    }

    /* renamed from: h */
    public final C0527h m9025h() {
        return this.f3837x;
    }

    /* renamed from: h */
    public void m9026h(int i) {
        if (i >= 0) {
            if (this.f3832r == null) {
                this.f3832r = new LinkedList();
            }
            C1407h c1407h = new C1407h(this.f3819a, i);
            this.f3832r.add(c1407h);
            c1407h.addListener(this);
            c1407h.start();
        }
    }

    /* renamed from: i */
    public void m9027i(int i) {
        if (i >= 0) {
            if (this.f3832r == null) {
                this.f3832r = new LinkedList();
            }
            C1415j c1415j = new C1415j(this, i);
            this.f3832r.add(c1415j);
            c1415j.addListener(this);
            c1415j.start();
        }
    }

    /* renamed from: i */
    public final boolean m9028i() {
        return (this.f3817P & 1) != 0;
    }

    /* renamed from: j */
    public final int m9029j() {
        return this.f3831q;
    }

    /* renamed from: k */
    public final boolean m9030k() {
        return ((this.f3817P & 2) == 0 && (this.f3817P & 4) == 0) ? false : true;
    }

    /* renamed from: m */
    public final boolean m9031m() {
        if (!(this.f3832r == null || this.f3832r.isEmpty())) {
            for (Animator animator : this.f3832r) {
                if ((animator instanceof C1414i) && (animator.isStarted() || animator.isRunning())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    public final void m9032n() {
        this.f3833s = true;
        if (!(this.f3832r == null || this.f3832r.isEmpty())) {
            for (int size = this.f3832r.size() - 1; size >= 0; size--) {
                ((ValueAnimator) this.f3832r.get(size)).end();
            }
        }
        if (this.f3831q >= 0) {
            m9013a(this.f3831q, false);
        }
        if (this.f3826j == (byte) 1) {
            this.f3812C = -1;
            this.f3839z = -1;
            if (this.f3827l != null) {
                this.f3827l.m10016e();
            }
        }
    }

    /* renamed from: o */
    public final int m9033o() {
        return this.f3821c;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        if (!(animator instanceof ValueAnimator)) {
            return;
        }
        if (this.f3832r != null && !this.f3832r.remove(animator)) {
            return;
        }
        if (animator instanceof C1416k) {
            int b = ((C1416k) animator).mo3769b();
            if (((C1416k) animator).mo3768a()) {
                m9013a(b, false);
            } else {
                m8994a(b, ((C1416k) animator).m10006c());
            }
        } else if (animator instanceof C1415j) {
            m8997b(((C1415j) animator).mo3769b());
        } else if (animator instanceof C1407h) {
            int b2 = ((C1407h) animator).mo3769b();
            if (!(((C1407h) animator).mo3768a() || this.f3815K == null)) {
                this.f3815K.onPostSwipe(b2, this.f3838y);
            }
            m9013a(b2, false);
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    /* renamed from: p */
    public final C0528b m9034p() {
        return this.f3815K;
    }

    /* renamed from: q */
    public final boolean m9035q() {
        return this.f3837x != null;
    }

    /* renamed from: r */
    public final int m9036r() {
        return this.f3826j;
    }
}
