package fr.pcsoft.wdjava.ui.p033c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.Scroller;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.ui.cadre.C1110m;
import fr.pcsoft.wdjava.ui.gesture.C1171d;

/* renamed from: fr.pcsoft.wdjava.ui.c.f */
public class C1109f extends FrameLayout implements C1105c {
    /* renamed from: d */
    static final int f3368d = 250;
    /* renamed from: k */
    static final float f3369k = 0.5f;
    /* renamed from: z */
    private static final String f3370z = C1109f.m8041z(C1109f.m8042z("!$\nm+\u0016!\nE\u0014#:\u0000^X\u00162\u000b\t\u0010\u001a \u0011\t\u0017\u001b?\u001c\t\u0017\u001b6EM\u0011\u00076\u0006]X\u0016;\fE\u001c"));
    /* renamed from: e */
    private int f3371e;
    /* renamed from: f */
    int f3372f = 0;
    /* renamed from: g */
    private int f3373g;
    /* renamed from: h */
    private float f3374h;
    /* renamed from: i */
    private boolean f3375i = false;
    /* renamed from: j */
    private int f3376j;
    /* renamed from: l */
    private boolean f3377l = true;
    /* renamed from: m */
    private long f3378m;
    /* renamed from: n */
    private View f3379n = null;
    /* renamed from: o */
    private C1110m f3380o = null;
    /* renamed from: p */
    int f3381p = 0;
    /* renamed from: q */
    private Scroller f3382q;
    /* renamed from: r */
    private final Rect f3383r = new Rect();
    /* renamed from: s */
    private C0510b f3384s = null;
    /* renamed from: t */
    private VelocityTracker f3385t;
    /* renamed from: u */
    private boolean f3386u;
    /* renamed from: v */
    private boolean f3387v = true;
    /* renamed from: w */
    private boolean f3388w = false;
    /* renamed from: x */
    private float f3389x;
    /* renamed from: y */
    private C1171d f3390y = null;

    public C1109f(Context context) {
        super(context);
        m8039h();
    }

    public C1109f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8039h();
    }

    public C1109f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8039h();
    }

    /* renamed from: a */
    private int m8031a(int i, int i2, int i3) {
        return (i2 >= i3 || i < 0) ? 0 : i2 + i > i3 ? i3 - i2 : i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private android.view.View m8032a(boolean r15, int r16, int r17, boolean r18, int r19, int r20) {
        /*
        r14 = this;
        r1 = 2;
        r8 = r14.getFocusables(r1);
        r4 = 0;
        r3 = 0;
        r9 = r8.size();
        r1 = 0;
        r7 = r1;
    L_0x000d:
        if (r7 >= r9) goto L_0x009e;
    L_0x000f:
        r1 = r8.get(r7);
        r1 = (android.view.View) r1;
        r5 = r1.getTop();
        r6 = r1.getBottom();
        r10 = r1.getLeft();
        r11 = r1.getRight();
        r0 = r16;
        if (r0 >= r6) goto L_0x009f;
    L_0x0029:
        r0 = r17;
        if (r5 >= r0) goto L_0x009f;
    L_0x002d:
        r0 = r19;
        if (r0 >= r11) goto L_0x009f;
    L_0x0031:
        r0 = r20;
        if (r10 >= r0) goto L_0x009f;
    L_0x0035:
        r0 = r16;
        if (r0 >= r5) goto L_0x0051;
    L_0x0039:
        r0 = r17;
        if (r6 >= r0) goto L_0x0051;
    L_0x003d:
        r0 = r19;
        if (r0 >= r10) goto L_0x0051;
    L_0x0041:
        r0 = r20;
        if (r11 >= r0) goto L_0x0051;
    L_0x0045:
        r2 = 1;
    L_0x0046:
        if (r4 != 0) goto L_0x0053;
    L_0x0048:
        r13 = r2;
        r2 = r1;
        r1 = r13;
    L_0x004b:
        r3 = r7 + 1;
        r7 = r3;
        r4 = r2;
        r3 = r1;
        goto L_0x000d;
    L_0x0051:
        r2 = 0;
        goto L_0x0046;
    L_0x0053:
        if (r15 == 0) goto L_0x005b;
    L_0x0055:
        r12 = r4.getTop();	 Catch:{ IllegalStateException -> 0x0080 }
        if (r5 < r12) goto L_0x0063;
    L_0x005b:
        if (r15 != 0) goto L_0x0086;
    L_0x005d:
        r5 = r4.getBottom();	 Catch:{ IllegalStateException -> 0x0084 }
        if (r6 <= r5) goto L_0x0086;
    L_0x0063:
        r5 = 1;
    L_0x0064:
        if (r18 == 0) goto L_0x006c;
    L_0x0066:
        r6 = r4.getLeft();	 Catch:{ IllegalStateException -> 0x0088 }
        if (r10 < r6) goto L_0x0074;
    L_0x006c:
        if (r18 != 0) goto L_0x008e;
    L_0x006e:
        r6 = r4.getRight();	 Catch:{ IllegalStateException -> 0x008c }
        if (r11 <= r6) goto L_0x008e;
    L_0x0074:
        r6 = 1;
    L_0x0075:
        if (r3 == 0) goto L_0x0090;
    L_0x0077:
        if (r2 == 0) goto L_0x009f;
    L_0x0079:
        if (r5 == 0) goto L_0x009f;
    L_0x007b:
        if (r6 == 0) goto L_0x009f;
    L_0x007d:
        r2 = r1;
        r1 = r3;
        goto L_0x004b;
    L_0x0080:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x0082 }
    L_0x0082:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x0084 }
    L_0x0084:
        r1 = move-exception;
        throw r1;
    L_0x0086:
        r5 = 0;
        goto L_0x0064;
    L_0x0088:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x008a }
    L_0x008a:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x008c }
    L_0x008c:
        r1 = move-exception;
        throw r1;
    L_0x008e:
        r6 = 0;
        goto L_0x0075;
    L_0x0090:
        if (r2 == 0) goto L_0x0097;
    L_0x0092:
        r2 = 1;
        r13 = r2;
        r2 = r1;
        r1 = r13;
        goto L_0x004b;
    L_0x0097:
        if (r5 == 0) goto L_0x009f;
    L_0x0099:
        if (r6 == 0) goto L_0x009f;
    L_0x009b:
        r2 = r1;
        r1 = r3;
        goto L_0x004b;
    L_0x009e:
        return r4;
    L_0x009f:
        r1 = r3;
        r2 = r4;
        goto L_0x004b;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.c.f.a(boolean, int, int, boolean, int, int):android.view.View");
    }

    /* renamed from: a */
    private View m8033a(boolean z, int i, boolean z2, int i2, View view) {
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength() / 2;
        int i3 = i + verticalFadingEdgeLength;
        int height = (getHeight() + i) - verticalFadingEdgeLength;
        verticalFadingEdgeLength = getHorizontalFadingEdgeLength() / 2;
        int i4 = i2 + verticalFadingEdgeLength;
        int width = (getWidth() + i2) - verticalFadingEdgeLength;
        if (view != null) {
            try {
                if (view.getTop() < height) {
                    if (view.getBottom() > i3) {
                        try {
                            if (view.getLeft() < width) {
                                try {
                                    if (view.getRight() > i4) {
                                        return view;
                                    }
                                } catch (IllegalStateException e) {
                                    throw e;
                                }
                            }
                        } catch (IllegalStateException e2) {
                            throw e2;
                        }
                    }
                }
            } catch (IllegalStateException e22) {
                throw e22;
            } catch (IllegalStateException e222) {
                throw e222;
            }
        }
        return m8032a(z, i3, height, z2, i4, width);
    }

    /* renamed from: a */
    private void m8034a(int i, int i2) {
        if (i != 0 || i2 != 0) {
            try {
                m8058d(i, i2);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    /* renamed from: a */
    private void m8035a(View view) {
        view.getDrawingRect(this.f3383r);
        offsetDescendantRectToMyCoords(view, this.f3383r);
        int a = m8044a(this.f3383r);
        if (a != 0) {
            try {
                scrollBy(0, a);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    /* renamed from: a */
    private boolean m8036a(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        boolean z2 = i == 33;
        height = getWidth();
        int scrollX = getScrollX();
        int i8 = scrollX + height;
        boolean z3 = i4 == 33;
        View a = m8032a(z2, i2, i3, z3, i5, i6);
        View view = a == null ? this : a;
        if ((i2 < scrollY || i3 > i7) && (i5 < scrollX || i6 > i8)) {
            m8034a(z3 ? i5 - scrollX : i6 - i8, z2 ? i2 - scrollY : i3 - i7);
            z = true;
        } else {
            z = false;
        }
        try {
            if (view != findFocus()) {
                if (view.requestFocus(i)) {
                    this.f3386u = true;
                    this.f3386u = false;
                }
            }
            return z;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    private boolean m8037a(Rect rect, boolean z) {
        int a = m8044a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                try {
                    scrollBy(0, a);
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            m8058d(0, a);
        }
        return z2;
    }

    /* renamed from: a */
    private boolean m8038a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        try {
            boolean z;
            if (parent instanceof ViewGroup) {
                if (m8038a((View) parent, view2)) {
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* renamed from: h */
    private void m8039h() {
        this.f3382q = new Scroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3371e = viewConfiguration.getScaledTouchSlop();
        this.f3376j = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3373g = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: k */
    private boolean m8040k() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return false;
        }
        int height = childAt.getHeight();
        int width = childAt.getWidth();
        try {
            if (getHeight() >= (height + getPaddingTop()) + getPaddingBottom()) {
                if (getWidth() >= (width + getPaddingLeft()) + getPaddingRight()) {
                    return false;
                }
            }
            return true;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* renamed from: z */
    private static String m8041z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 117;
                    break;
                case 1:
                    i2 = 83;
                    break;
                case 2:
                    i2 = 101;
                    break;
                case 3:
                    i2 = 41;
                    break;
                default:
                    i2 = C0607n.co;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8042z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.co);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo3349a() {
        return Math.max(0, getScrollY());
    }

    /* renamed from: a */
    protected int m8044a(Rect rect) {
        try {
            if (getChildCount() == 0) {
                return 0;
            }
            int height = getHeight();
            int scrollY = getScrollY();
            int i = scrollY + height;
            int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
            if (rect.top > 0) {
                scrollY += verticalFadingEdgeLength;
            }
            if (rect.bottom < getChildAt(0).getHeight()) {
                i -= verticalFadingEdgeLength;
            }
            try {
                if (rect.bottom > i) {
                    if (rect.top > scrollY) {
                        scrollY = Math.min(rect.height() > height ? (rect.top - scrollY) + 0 : (rect.bottom - i) + 0, getChildAt(0).getBottom() - i);
                        return scrollY;
                    }
                }
                try {
                    if (rect.top < scrollY) {
                        if (rect.bottom < i) {
                            scrollY = Math.max(rect.height() > height ? 0 - (i - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
                            return scrollY;
                        }
                    }
                    scrollY = 0;
                    return scrollY;
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            } catch (IllegalStateException e22) {
                throw e22;
            } catch (IllegalStateException e222) {
                throw e222;
            }
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    /* renamed from: a */
    public void mo3350a(int i) {
        boolean z = this.f3388w;
        this.f3388w = true;
        try {
            scrollTo(i, mo3349a());
        } finally {
            this.f3388w = z;
        }
    }

    /* renamed from: a */
    public void mo3351a(C0510b c0510b) {
        this.f3384s = c0510b;
    }

    /* renamed from: a */
    public final void mo3352a(C1110m c1110m) {
        if (c1110m != null) {
            int b = c1110m.mo3382b();
            if (b > 0) {
                try {
                    setPadding(getPaddingLeft() + b, getPaddingTop() + b, getPaddingRight() + b, b + getPaddingBottom());
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        }
        this.f3380o = c1110m;
    }

    /* renamed from: a */
    public void mo3353a(C1171d c1171d) {
        this.f3390y = c1171d;
    }

    /* renamed from: a */
    public boolean m8049a(int i, boolean z) {
        int i2 = 1;
        int width;
        if (z) {
            if (i != 130) {
                i2 = 0;
            }
            width = getWidth();
            this.f3383r.left = 0;
            this.f3383r.right = width;
            if (i2 != 0) {
                i2 = getChildCount();
                if (i2 > 0) {
                    View childAt = getChildAt(i2 - 1);
                    this.f3383r.right = childAt.getBottom();
                    this.f3383r.left = this.f3383r.right - width;
                }
            }
            return m8036a(0, 0, 0, i, this.f3383r.top, this.f3383r.bottom);
        }
        if (i != 130) {
            i2 = 0;
        }
        width = getHeight();
        this.f3383r.top = 0;
        this.f3383r.bottom = width;
        if (i2 != 0) {
            i2 = getChildCount();
            if (i2 > 0) {
                childAt = getChildAt(i2 - 1);
                this.f3383r.bottom = childAt.getBottom();
                this.f3383r.top = this.f3383r.bottom - width;
            }
        }
        return m8036a(i, this.f3383r.top, this.f3383r.bottom, 0, 0, 0);
    }

    /* renamed from: a */
    public boolean m8050a(KeyEvent keyEvent) {
        try {
            this.f3383r.setEmpty();
            if (m8040k()) {
                try {
                    if (keyEvent.getAction() != 0) {
                        return false;
                    }
                    switch (keyEvent.getKeyCode()) {
                        case 19:
                            return !keyEvent.isAltPressed() ? m8054b(33, false) : m8049a(33, false);
                        case 20:
                            return !keyEvent.isAltPressed() ? m8054b(130, false) : m8049a(130, false);
                        case 21:
                            return !keyEvent.isAltPressed() ? m8054b(17, true) : m8049a(17, true);
                        case 22:
                            return !keyEvent.isAltPressed() ? m8054b(66, true) : m8049a(66, true);
                        default:
                            return false;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            } else if (!isFocused()) {
                return false;
            } else {
                boolean z;
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                findFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                if (!(findFocus == null || findFocus == this)) {
                    try {
                        if (findFocus.requestFocus(130)) {
                            z = true;
                            return z;
                        }
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                }
                z = false;
                return z;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    public void addView(View view) {
        try {
            if (getChildCount() > 0) {
                throw new IllegalStateException(f3370z);
            }
            super.addView(view);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void addView(View view, int i) {
        try {
            if (getChildCount() > 0) {
                throw new IllegalStateException(f3370z);
            }
            super.addView(view, i);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        try {
            if (getChildCount() > 0) {
                throw new IllegalStateException(f3370z);
            }
            super.addView(view, i, layoutParams);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void addView(View view, LayoutParams layoutParams) {
        try {
            if (getChildCount() > 0) {
                throw new IllegalStateException(f3370z);
            }
            super.addView(view, layoutParams);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* renamed from: b */
    public int mo3354b() {
        return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* renamed from: b */
    public void mo3355b(int i) {
        boolean z = this.f3388w;
        this.f3388w = true;
        try {
            scrollTo(mo3356c(), i);
        } finally {
            this.f3388w = z;
        }
    }

    /* renamed from: b */
    public final void m8053b(int i, int i2) {
        m8058d(i - getScrollX(), i2 - getScrollY());
    }

    /* renamed from: b */
    public boolean m8054b(int i, boolean z) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        if (z) {
            try {
                int j = m8063j();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        j = m8062i();
        int bottom;
        int scrollY;
        if (z) {
            if (findNextFocus != null) {
                findNextFocus.getDrawingRect(this.f3383r);
                offsetDescendantRectToMyCoords(findNextFocus, this.f3383r);
                m8034a(m8044a(this.f3383r), 0);
                findNextFocus.requestFocus(i);
            } else {
                if (i == 33) {
                    try {
                        if (getScrollY() < j) {
                            j = getScrollY();
                            if (j == 0) {
                                return false;
                            }
                            if (i != 130) {
                                j = -j;
                            }
                            m8034a(j, 0);
                        }
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
                if (i == 130) {
                    try {
                        if (getChildCount() > 0) {
                            bottom = getChildAt(0).getBottom();
                            scrollY = getScrollY() + getHeight();
                            if (bottom - scrollY < j) {
                                j = bottom - scrollY;
                            }
                        }
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                }
                if (j == 0) {
                    return false;
                }
                if (i != 130) {
                    j = -j;
                }
                m8034a(j, 0);
            }
        } else if (findNextFocus != null) {
            findNextFocus.getDrawingRect(this.f3383r);
            offsetDescendantRectToMyCoords(findNextFocus, this.f3383r);
            m8034a(0, m8044a(this.f3383r));
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33) {
                try {
                    if (getScrollY() < j) {
                        j = getScrollY();
                        if (j == 0) {
                            return false;
                        }
                        if (i != 130) {
                            j = -j;
                        }
                        m8034a(0, j);
                    }
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            }
            if (i == 130) {
                try {
                    if (getChildCount() > 0) {
                        bottom = getChildAt(0).getBottom();
                        scrollY = getScrollY() + getHeight();
                        if (bottom - scrollY < j) {
                            j = bottom - scrollY;
                        }
                    }
                } catch (IllegalStateException e2222) {
                    throw e2222;
                }
            }
            if (j == 0) {
                return false;
            }
            if (i != 130) {
                j = -j;
            }
            m8034a(0, j);
        }
        return true;
    }

    /* renamed from: c */
    public int mo3356c() {
        return Math.max(0, getScrollX());
    }

    /* renamed from: c */
    public void m8056c(int i, int i2) {
        if (getChildCount() > 0) {
            try {
                this.f3382q.fling(getScrollX(), getScrollY(), i, i2, 0, getChildAt(0).getWidth() - ((getWidth() - getPaddingRight()) - getPaddingLeft()), 0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                boolean z = i2 > 0;
                View a = m8033a(i > 0, this.f3382q.getFinalX(), z, this.f3382q.getFinalY(), findFocus());
                View view = a == null ? this : a;
                try {
                    if (view != findFocus()) {
                        try {
                            if (view.requestFocus(z ? 130 : 33)) {
                                this.f3386u = true;
                                this.f3386u = false;
                            }
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                    invalidate();
                } catch (IllegalStateException e2) {
                    throw e2;
                } catch (IllegalStateException e22) {
                    throw e22;
                }
            } catch (IllegalStateException e222) {
                throw e222;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean canScrollHorizontally(int r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = r4.getChildCount();	 Catch:{ IllegalStateException -> 0x0008 }
        if (r1 != 0) goto L_0x000a;
    L_0x0007:
        return r0;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        r1 = r4.getScrollX();
        r2 = r4.getChildAt(r0);
        r2 = r2.getWidth();
        r3 = r4.getPaddingLeft();
        r2 = r2 + r3;
        r3 = r4.getPaddingRight();
        r2 = r2 + r3;
        if (r5 <= 0) goto L_0x0029;
    L_0x0022:
        r3 = r4.getWidth();	 Catch:{ IllegalStateException -> 0x002f }
        r2 = r2 - r3;
        if (r1 < r2) goto L_0x002d;
    L_0x0029:
        if (r5 >= 0) goto L_0x0007;
    L_0x002b:
        if (r1 <= 0) goto L_0x0007;
    L_0x002d:
        r0 = 1;
        goto L_0x0007;
    L_0x002f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0031 }
    L_0x0031:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0033 }
    L_0x0033:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.c.f.canScrollHorizontally(int):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean canScrollVertically(int r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = r4.getChildCount();	 Catch:{ IllegalStateException -> 0x0008 }
        if (r1 != 0) goto L_0x000a;
    L_0x0007:
        return r0;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        r1 = r4.getScrollY();
        r2 = r4.getChildAt(r0);
        r2 = r2.getHeight();
        r3 = r4.getPaddingTop();
        r2 = r2 + r3;
        r3 = r4.getPaddingBottom();
        r2 = r2 + r3;
        if (r5 <= 0) goto L_0x0029;
    L_0x0022:
        r3 = r4.getHeight();	 Catch:{ IllegalStateException -> 0x002f }
        r2 = r2 - r3;
        if (r1 < r2) goto L_0x002d;
    L_0x0029:
        if (r5 >= 0) goto L_0x0007;
    L_0x002b:
        if (r1 <= 0) goto L_0x0007;
    L_0x002d:
        r0 = 1;
        goto L_0x0007;
    L_0x002f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0031 }
    L_0x0031:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0033 }
    L_0x0033:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.c.f.canScrollVertically(int):boolean");
    }

    protected int computeHorizontalScrollRange() {
        if (getChildCount() != 0) {
            return getChildAt(0).getRight();
        }
        try {
            return getWidth();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void computeScroll() {
        /*
        r7 = this;
        r0 = r7.f3382q;
        r0 = r0.computeScrollOffset();
        if (r0 == 0) goto L_0x0070;
    L_0x0008:
        r0 = r7.getScrollX();
        r1 = r7.getScrollY();
        r2 = r7.f3382q;
        r2 = r2.getCurrX();
        r3 = r7.f3382q;
        r3 = r3.getCurrY();
        r4 = r7.getChildCount();
        if (r4 <= 0) goto L_0x0071;
    L_0x0022:
        r4 = 0;
        r4 = r7.getChildAt(r4);
        r5 = r7.getWidth();
        r6 = r7.getPaddingRight();
        r5 = r5 - r6;
        r6 = r7.getPaddingLeft();
        r5 = r5 - r6;
        r6 = r4.getWidth();
        r2 = r7.m8031a(r2, r5, r6);
        r5 = r7.getHeight();
        r6 = r7.getPaddingBottom();
        r5 = r5 - r6;
        r6 = r7.getPaddingTop();
        r5 = r5 - r6;
        r4 = r4.getHeight();
        r3 = r7.m8031a(r3, r5, r4);
        r7.scrollTo(r2, r3);
    L_0x0056:
        r2 = r7.getScrollX();	 Catch:{ IllegalStateException -> 0x0075 }
        if (r0 != r2) goto L_0x0062;
    L_0x005c:
        r2 = r7.getScrollY();	 Catch:{ IllegalStateException -> 0x0077 }
        if (r1 == r2) goto L_0x006d;
    L_0x0062:
        r2 = r7.getScrollX();	 Catch:{ IllegalStateException -> 0x0077 }
        r3 = r7.getScrollY();	 Catch:{ IllegalStateException -> 0x0077 }
        r7.onScrollChanged(r2, r3, r0, r1);	 Catch:{ IllegalStateException -> 0x0077 }
    L_0x006d:
        r7.postInvalidate();
    L_0x0070:
        return;
    L_0x0071:
        r7.scrollTo(r2, r3);
        goto L_0x0056;
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.c.f.computeScroll():void");
    }

    protected int computeVerticalScrollRange() {
        if (getChildCount() != 0) {
            return getChildAt(0).getBottom();
        }
        try {
            return getHeight();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* renamed from: d */
    public void mo3359d() {
        try {
            this.f3384s = null;
            if (this.f3390y != null) {
                this.f3390y.mo3433a();
                this.f3390y = null;
            }
            this.f3380o = null;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* renamed from: d */
    public final void m8058d(int i, int i2) {
        if (AnimationUtils.currentAnimationTimeMillis() - this.f3378m > 250) {
            try {
                this.f3382q.startScroll(getScrollX(), getScrollY(), i, i2);
                invalidate();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        try {
            if (!this.f3382q.isFinished()) {
                this.f3382q.abortAnimation();
            }
            scrollBy(i, i2);
        } catch (IllegalStateException e2) {
            throw e2;
        }
        this.f3378m = AnimationUtils.currentAnimationTimeMillis();
    }

    protected void dispatchDraw(Canvas canvas) {
        try {
            if (this.f3380o != null) {
                this.f3380o.mo3373b(canvas, (View) this, null);
            }
            super.dispatchDraw(canvas);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) ? true : m8050a(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.f3390y != null) {
                if (this.f3390y.mo3434a(this, motionEvent)) {
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* renamed from: e */
    public int mo3360e() {
        return Math.max(0, getChildAt(0).getWidth() - ((getWidth() - getPaddingLeft()) - getPaddingRight()));
    }

    /* renamed from: f */
    public int mo3361f() {
        return 3;
    }

    /* renamed from: g */
    public C0510b mo3362g() {
        return this.f3384s;
    }

    protected float getBottomFadingEdgeStrength() {
        try {
            if (getChildCount() == 0) {
                return 0.0f;
            }
            int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
            int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
            return bottom < verticalFadingEdgeLength ? ((float) bottom) / ((float) verticalFadingEdgeLength) : 1.0f;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    protected float getLeftFadingEdgeStrength() {
        try {
            if (getChildCount() == 0) {
                return 0.0f;
            }
            int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
            try {
                return getScrollX() < horizontalFadingEdgeLength ? ((float) getScrollX()) / ((float) horizontalFadingEdgeLength) : 1.0f;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    protected float getRightFadingEdgeStrength() {
        try {
            if (getChildCount() == 0) {
                return 0.0f;
            }
            int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
            int right = (getChildAt(0).getRight() - getScrollX()) - (getWidth() - getPaddingRight());
            return right < horizontalFadingEdgeLength ? ((float) right) / ((float) horizontalFadingEdgeLength) : 1.0f;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    protected float getTopFadingEdgeStrength() {
        try {
            if (getChildCount() == 0) {
                return 0.0f;
            }
            int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
            try {
                return getScrollY() < verticalFadingEdgeLength ? ((float) getScrollY()) / ((float) verticalFadingEdgeLength) : 1.0f;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* renamed from: i */
    public int m8062i() {
        return (int) (f3369k * ((float) getHeight()));
    }

    /* renamed from: j */
    public int m8063j() {
        return (int) (f3369k * ((float) getWidth()));
    }

    protected void measureChild(View view, int i, int i2) {
        view.measure(C1109f.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(MeasureSpec.makeMeasureSpec(marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, 0), MeasureSpec.makeMeasureSpec(marginLayoutParams.bottomMargin + marginLayoutParams.topMargin, 0));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
        r5 = this;
        r0 = 1;
        r1 = 0;
        r2 = r6.getAction();
        r3 = 2;
        if (r2 != r3) goto L_0x0011;
    L_0x0009:
        r3 = r5.f3375i;	 Catch:{ IllegalStateException -> 0x000f }
        if (r3 == 0) goto L_0x0011;
    L_0x000d:
        r1 = r0;
    L_0x000e:
        return r1;
    L_0x000f:
        r0 = move-exception;
        throw r0;
    L_0x0011:
        r3 = r5.getScrollY();	 Catch:{ IllegalStateException -> 0x0037 }
        if (r3 != 0) goto L_0x002b;
    L_0x0017:
        r3 = r5.getScrollX();	 Catch:{ IllegalStateException -> 0x0039 }
        if (r3 != 0) goto L_0x002b;
    L_0x001d:
        r3 = 1;
        r3 = r5.canScrollVertically(r3);	 Catch:{ IllegalStateException -> 0x003b }
        if (r3 != 0) goto L_0x002b;
    L_0x0024:
        r3 = 1;
        r3 = r5.canScrollHorizontally(r3);	 Catch:{ IllegalStateException -> 0x003d }
        if (r3 == 0) goto L_0x000e;
    L_0x002b:
        r3 = r5.m8040k();	 Catch:{ IllegalStateException -> 0x0035 }
        if (r3 != 0) goto L_0x003f;
    L_0x0031:
        r0 = 0;
        r5.f3375i = r0;	 Catch:{ IllegalStateException -> 0x0035 }
        goto L_0x000e;
    L_0x0035:
        r0 = move-exception;
        throw r0;
    L_0x0037:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0039 }
    L_0x0039:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x003b }
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;
    L_0x003f:
        r3 = r6.getY();
        r4 = r6.getX();
        switch(r2) {
            case 0: goto L_0x006f;
            case 1: goto L_0x0082;
            case 2: goto L_0x004d;
            case 3: goto L_0x0082;
            default: goto L_0x004a;
        };
    L_0x004a:
        r1 = r5.f3375i;
        goto L_0x000e;
    L_0x004d:
        r0 = r5.f3389x;
        r0 = r3 - r0;
        r0 = java.lang.Math.abs(r0);
        r0 = (int) r0;
        r1 = r5.f3374h;
        r1 = r4 - r1;
        r1 = java.lang.Math.abs(r1);
        r1 = (int) r1;
        r2 = r5.f3371e;	 Catch:{ IllegalStateException -> 0x006d }
        if (r0 > r2) goto L_0x0067;
    L_0x0063:
        r0 = r5.f3371e;	 Catch:{ IllegalStateException -> 0x006b }
        if (r1 <= r0) goto L_0x004a;
    L_0x0067:
        r0 = 1;
        r5.f3375i = r0;	 Catch:{ IllegalStateException -> 0x006b }
        goto L_0x004a;
    L_0x006b:
        r0 = move-exception;
        throw r0;
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006b }
    L_0x006f:
        r5.f3389x = r3;	 Catch:{ IllegalStateException -> 0x007e }
        r5.f3374h = r4;	 Catch:{ IllegalStateException -> 0x007e }
        r2 = r5.f3382q;	 Catch:{ IllegalStateException -> 0x007e }
        r2 = r2.isFinished();	 Catch:{ IllegalStateException -> 0x007e }
        if (r2 != 0) goto L_0x0080;
    L_0x007b:
        r5.f3375i = r0;
        goto L_0x004a;
    L_0x007e:
        r0 = move-exception;
        throw r0;
    L_0x0080:
        r0 = r1;
        goto L_0x007b;
    L_0x0082:
        r5.f3375i = r1;
        goto L_0x004a;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.c.f.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
            this.f3377l = false;
            if (this.f3379n != null) {
                if (m8038a(this.f3379n, (View) this)) {
                    m8035a(this.f3379n);
                }
            }
            this.f3379n = null;
            scrollTo(getScrollX(), getScrollY());
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    protected void onMeasure(int i, int i2) {
        try {
            if (this.f3387v) {
                super.onMeasure(i, i2);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocus;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            try {
                findNextFocus = FocusFinder.getInstance().findNextFocus(this, null, i);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        findNextFocus = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        return findNextFocus == null ? false : findNextFocus.requestFocus(i, rect);
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i5 = scrollX - this.f3381p;
        int i6 = scrollY - this.f3372f;
        if (!(i5 == 0 && i6 == 0)) {
            try {
                if (this.f3384s != null) {
                    this.f3384s.onScrollChanged(this, i5, i6, this.f3388w);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        this.f3381p = scrollX;
        this.f3372f = scrollY;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus) {
            findFocus.getDrawingRect(this.f3383r);
            offsetDescendantRectToMyCoords(findFocus, this.f3383r);
            m8034a(m8044a(this.f3383r), m8044a(this.f3383r));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        r6 = this;
        r0 = 0;
        r1 = r7.getAction();	 Catch:{ IllegalStateException -> 0x000e }
        if (r1 != 0) goto L_0x0012;
    L_0x0007:
        r1 = r7.getEdgeFlags();	 Catch:{ IllegalStateException -> 0x0010 }
        if (r1 == 0) goto L_0x0012;
    L_0x000d:
        return r0;
    L_0x000e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0010 }
    L_0x0010:
        r0 = move-exception;
        throw r0;
    L_0x0012:
        r1 = r6.m8040k();	 Catch:{ IllegalStateException -> 0x0038 }
        if (r1 == 0) goto L_0x000d;
    L_0x0018:
        r1 = r6.f3385t;	 Catch:{ IllegalStateException -> 0x003a }
        if (r1 != 0) goto L_0x0022;
    L_0x001c:
        r1 = android.view.VelocityTracker.obtain();	 Catch:{ IllegalStateException -> 0x003a }
        r6.f3385t = r1;	 Catch:{ IllegalStateException -> 0x003a }
    L_0x0022:
        r1 = r6.f3385t;
        r1.addMovement(r7);
        r1 = r7.getAction();
        r3 = r7.getY();
        r4 = r7.getX();
        switch(r1) {
            case 0: goto L_0x003c;
            case 1: goto L_0x00bf;
            case 2: goto L_0x0050;
            default: goto L_0x0036;
        };
    L_0x0036:
        r0 = 1;
        goto L_0x000d;
    L_0x0038:
        r0 = move-exception;
        throw r0;
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r0 = r6.f3382q;	 Catch:{ IllegalStateException -> 0x004e }
        r0 = r0.isFinished();	 Catch:{ IllegalStateException -> 0x004e }
        if (r0 != 0) goto L_0x0049;
    L_0x0044:
        r0 = r6.f3382q;	 Catch:{ IllegalStateException -> 0x004e }
        r0.abortAnimation();	 Catch:{ IllegalStateException -> 0x004e }
    L_0x0049:
        r6.f3389x = r3;
        r6.f3374h = r4;
        goto L_0x0036;
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r1 = r6.f3374h;
        r1 = r1 - r4;
        r2 = (int) r1;
        r1 = r6.f3389x;
        r1 = r1 - r3;
        r1 = (int) r1;
        r6.f3374h = r4;	 Catch:{ IllegalStateException -> 0x0077 }
        r6.f3389x = r3;	 Catch:{ IllegalStateException -> 0x0077 }
        if (r2 >= 0) goto L_0x0079;
    L_0x005e:
        r3 = r6.getScrollX();	 Catch:{ IllegalStateException -> 0x0077 }
        if (r3 >= 0) goto L_0x0065;
    L_0x0064:
        r2 = r0;
    L_0x0065:
        if (r1 >= 0) goto L_0x009e;
    L_0x0067:
        r3 = r6.getScrollY();	 Catch:{ IllegalStateException -> 0x009c }
        if (r3 >= 0) goto L_0x00ff;
    L_0x006d:
        if (r0 != 0) goto L_0x0071;
    L_0x006f:
        if (r2 == 0) goto L_0x0036;
    L_0x0071:
        r6.scrollBy(r2, r0);	 Catch:{ IllegalStateException -> 0x0075 }
        goto L_0x0036;
    L_0x0075:
        r0 = move-exception;
        throw r0;
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        if (r2 <= 0) goto L_0x0065;
    L_0x007b:
        r3 = r6.getWidth();
        r4 = r6.getPaddingRight();
        r3 = r3 - r4;
        r4 = r6.getChildAt(r0);
        r4 = r4.getRight();
        r5 = r6.getScrollX();
        r4 = r4 - r5;
        r3 = r4 - r3;
        if (r3 <= 0) goto L_0x009a;
    L_0x0095:
        r2 = java.lang.Math.min(r3, r2);
        goto L_0x0065;
    L_0x009a:
        r2 = r0;
        goto L_0x0065;
    L_0x009c:
        r0 = move-exception;
        throw r0;
    L_0x009e:
        if (r1 <= 0) goto L_0x00ff;
    L_0x00a0:
        r3 = r6.getHeight();
        r4 = r6.getPaddingBottom();
        r3 = r3 - r4;
        r4 = r6.getChildAt(r0);
        r4 = r4.getBottom();
        r5 = r6.getScrollY();
        r4 = r4 - r5;
        r3 = r4 - r3;
        if (r3 <= 0) goto L_0x006d;
    L_0x00ba:
        r0 = java.lang.Math.min(r3, r1);
        goto L_0x006d;
    L_0x00bf:
        r0 = r6.f3385t;
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r6.f3373g;
        r2 = (float) r2;
        r0.computeCurrentVelocity(r1, r2);
        r1 = r0.getXVelocity();
        r1 = (int) r1;
        r0 = r0.getYVelocity();
        r0 = (int) r0;
        r2 = java.lang.Math.abs(r1);	 Catch:{ IllegalStateException -> 0x00fb }
        r3 = java.lang.Math.abs(r0);	 Catch:{ IllegalStateException -> 0x00fb }
        r2 = r2 + r3;
        r3 = r6.f3376j;	 Catch:{ IllegalStateException -> 0x00fb }
        if (r2 <= r3) goto L_0x00eb;
    L_0x00e0:
        r2 = r6.getChildCount();	 Catch:{ IllegalStateException -> 0x00fd }
        if (r2 <= 0) goto L_0x00eb;
    L_0x00e6:
        r1 = -r1;
        r0 = -r0;
        r6.m8056c(r1, r0);	 Catch:{ IllegalStateException -> 0x00fd }
    L_0x00eb:
        r0 = r6.f3385t;	 Catch:{ IllegalStateException -> 0x00f9 }
        if (r0 == 0) goto L_0x0036;
    L_0x00ef:
        r0 = r6.f3385t;	 Catch:{ IllegalStateException -> 0x00f9 }
        r0.recycle();	 Catch:{ IllegalStateException -> 0x00f9 }
        r0 = 0;
        r6.f3385t = r0;	 Catch:{ IllegalStateException -> 0x00f9 }
        goto L_0x0036;
    L_0x00f9:
        r0 = move-exception;
        throw r0;
    L_0x00fb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00fd }
    L_0x00fd:
        r0 = move-exception;
        throw r0;
    L_0x00ff:
        r0 = r1;
        goto L_0x006d;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.c.f.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        try {
            if (!(view2 instanceof WebView)) {
                if (!this.f3386u) {
                    try {
                        if (this.f3377l) {
                            this.f3379n = view2;
                        } else {
                            m8035a(view2);
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
            }
            super.requestChildFocus(view, view2);
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m8037a(rect, z);
    }

    public void requestLayout() {
        this.f3377l = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int a = m8031a(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int a2 = m8031a(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            try {
                if (a == getScrollX()) {
                    if (a2 == getScrollY()) {
                        return;
                    }
                }
                super.scrollTo(a, a2);
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
    }

    public void setFillViewport(boolean z) {
        try {
            if (z != this.f3387v) {
                this.f3387v = z;
                requestLayout();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }
}
