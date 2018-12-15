package fr.pcsoft.wdjava.ui.champs.slidingmenu.p070a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import fr.pcsoft.wdjava.ui.champs.slidingmenu.C0526d;

/* renamed from: fr.pcsoft.wdjava.ui.champs.slidingmenu.a.g */
public class C1264g extends ViewGroup {
    /* renamed from: i */
    static final int f3719i = 48;
    /* renamed from: r */
    private static final String f3720r = C1264g.m8762z(C1264g.m8763z("d-@!\"J\u000eZ0:e=[<#C"));
    /* renamed from: z */
    private static final String f3721z = C1264g.m8762z(C1264g.m8763z("s0Vu\u000fB0Z;)a9W0\tB?A0(\u00075F&9\u0007:Vu/B,D0(Ix\u0003{}AxR;)\u0007i\u001de+"));
    /* renamed from: a */
    private View f3722a;
    /* renamed from: b */
    private int f3723b;
    /* renamed from: c */
    private C1258a f3724c;
    /* renamed from: d */
    private int f3725d;
    /* renamed from: e */
    private C1270l f3726e;
    /* renamed from: f */
    private boolean f3727f;
    /* renamed from: g */
    private int f3728g;
    /* renamed from: h */
    private Bitmap f3729h;
    /* renamed from: j */
    private Drawable f3730j;
    /* renamed from: k */
    private int f3731k;
    /* renamed from: l */
    private float f3732l;
    /* renamed from: m */
    private float f3733m;
    /* renamed from: n */
    private View f3734n;
    /* renamed from: o */
    private int f3735o;
    /* renamed from: p */
    private View f3736p;
    /* renamed from: q */
    private Drawable f3737q;
    /* renamed from: s */
    private int f3738s;
    /* renamed from: t */
    private boolean f3739t;
    /* renamed from: u */
    private boolean f3740u;
    /* renamed from: v */
    private final Paint f3741v;
    /* renamed from: w */
    private C1267j f3742w;

    public C1264g(Context context) {
        this(context, null);
    }

    public C1264g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3735o = 0;
        this.f3726e = null;
        this.f3741v = new Paint();
        this.f3740u = true;
        this.f3725d = (int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    private int m8761a() {
        return this.f3722a.getTop() + ((this.f3722a.getHeight() - this.f3729h.getHeight()) / 2);
    }

    /* renamed from: z */
    private static String m8762z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 39;
                    break;
                case 1:
                    i2 = 88;
                    break;
                case 2:
                    i2 = 51;
                    break;
                case 3:
                    i2 = 85;
                    break;
                default:
                    i2 = 77;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8763z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 77);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void m8764a(int i) {
        this.f3723b = i;
        requestLayout();
    }

    /* renamed from: a */
    public void m8765a(Bitmap bitmap) {
        this.f3729h = bitmap;
        refreshDrawableState();
    }

    /* renamed from: a */
    public void m8766a(Drawable drawable) {
        this.f3730j = drawable;
        invalidate();
    }

    /* renamed from: a */
    public void m8767a(View view) {
    }

    /* renamed from: a */
    public void m8768a(View view, int i, int i2) {
        int i3 = 4;
        try {
            if (this.f3731k == 0) {
                if (i < view.getLeft()) {
                    i3 = 0;
                }
                scrollTo((int) (((float) (m8799f() + i)) * this.f3733m), i2);
            } else {
                try {
                    if (this.f3731k == 1) {
                        if (i > view.getLeft()) {
                            i3 = 0;
                        }
                        scrollTo((int) (((float) (m8804i() - getWidth())) + (((float) (i - m8804i())) * this.f3733m)), i2);
                    } else {
                        try {
                            if (this.f3731k == 2) {
                                try {
                                    this.f3736p.setVisibility(i >= view.getLeft() ? 4 : 0);
                                    try {
                                        this.f3734n.setVisibility(i <= view.getLeft() ? 4 : 0);
                                        if (i != 0) {
                                            i3 = 0;
                                        }
                                        try {
                                            if (i <= view.getLeft()) {
                                                scrollTo((int) (((float) (m8799f() + i)) * this.f3733m), i2);
                                            } else {
                                                scrollTo((int) (((float) (m8804i() - getWidth())) + (((float) (i - m8804i())) * this.f3733m)), i2);
                                            }
                                        } catch (IllegalStateException e) {
                                            throw e;
                                        }
                                    } catch (IllegalStateException e2) {
                                        throw e2;
                                    }
                                } catch (IllegalStateException e22) {
                                    throw e22;
                                }
                            }
                            i3 = 0;
                        } catch (IllegalStateException e222) {
                            throw e222;
                        } catch (IllegalStateException e2222) {
                            throw e2222;
                        }
                    }
                } catch (IllegalStateException e22222) {
                    throw e22222;
                }
            }
            setVisibility(i3);
        } catch (IllegalStateException e222222) {
            throw e222222;
        }
    }

    /* renamed from: a */
    public void m8769a(View view, Canvas canvas) {
        try {
            if (this.f3730j == null) {
                return;
            }
            if (this.f3728g > 0) {
                int left;
                if (this.f3731k == 0) {
                    left = view.getLeft() - this.f3728g;
                } else if (this.f3731k == 1) {
                    left = view.getRight();
                } else {
                    try {
                        if (this.f3731k == 2) {
                            if (this.f3737q != null) {
                                left = view.getRight();
                                this.f3737q.setBounds(left, 0, this.f3728g + left, getHeight());
                                this.f3737q.draw(canvas);
                            }
                            left = view.getLeft() - this.f3728g;
                        } else {
                            left = 0;
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                this.f3730j.setBounds(left, 0, this.f3728g + left, getHeight());
                this.f3730j.draw(canvas);
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    public void m8770a(View view, Canvas canvas, float f) {
    }

    /* renamed from: a */
    public void m8771a(C1258a c1258a) {
        this.f3724c = c1258a;
    }

    /* renamed from: a */
    public void m8772a(C1267j c1267j) {
        this.f3742w = c1267j;
    }

    /* renamed from: a */
    public final void m8773a(C1270l c1270l) {
        this.f3726e = c1270l;
    }

    /* renamed from: a */
    public void m8774a(boolean z) {
        this.f3739t = z;
    }

    /* renamed from: a */
    public boolean m8775a(float f) {
        C0526d h;
        if (this.f3731k == 0) {
            h = this.f3726e.m8874h();
            if (f < 0.0f && h != null) {
                try {
                    if (h.isDisplayedWithGesture()) {
                        return true;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            return false;
        } else if (this.f3731k == 1) {
            h = this.f3726e.m8883l();
            if (f > 0.0f && h != null) {
                try {
                    if (h.isDisplayedWithGesture()) {
                        return true;
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            return false;
        } else {
            try {
                if (this.f3731k != 2) {
                    return false;
                }
                h = f < 0.0f ? this.f3726e.m8874h() : this.f3726e.m8883l();
                if (!(f == 0.0f || h == null)) {
                    try {
                        if (h.isDisplayedWithGesture()) {
                            return true;
                        }
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                }
                return false;
            } catch (IllegalStateException e222) {
                throw e222;
            } catch (IllegalStateException e2222) {
                throw e2222;
            }
        }
    }

    /* renamed from: a */
    public boolean m8776a(View view, int i) {
        int left = view.getLeft();
        int right = view.getRight();
        try {
            if (this.f3731k == 0) {
                if (i >= left) {
                    try {
                        if (i <= left + this.f3725d) {
                            return true;
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                return false;
            }
            try {
                if (this.f3731k == 1) {
                    if (i <= right) {
                        try {
                            if (i >= right - this.f3725d) {
                                return true;
                            }
                        } catch (IllegalStateException e2) {
                            throw e2;
                        }
                    }
                    return false;
                }
                try {
                    if (this.f3731k != 2) {
                        return false;
                    }
                    if (i >= left) {
                        try {
                            if (i <= left + this.f3725d) {
                                return true;
                            }
                        } catch (IllegalStateException e22) {
                            try {
                                throw e22;
                            } catch (IllegalStateException e222) {
                                throw e222;
                            }
                        }
                    }
                    if (i <= right) {
                        try {
                            if (i >= right - this.f3725d) {
                                return true;
                            }
                        } catch (IllegalStateException e2222) {
                            throw e2222;
                        }
                    }
                    return false;
                } catch (IllegalStateException e22222) {
                    throw e22222;
                } catch (IllegalStateException e222222) {
                    throw e222222;
                }
            } catch (IllegalStateException e2222222) {
                throw e2222222;
            } catch (IllegalStateException e22222222) {
                throw e22222222;
            }
        } catch (IllegalStateException e222222222) {
            throw e222222222;
        } catch (IllegalStateException e2222222222) {
            throw e2222222222;
        }
    }

    /* renamed from: a */
    public boolean m8777a(View view, int i, float f) {
        try {
            switch (this.f3735o) {
                case 0:
                    return m8786b(view, i, f);
                case 1:
                    return true;
                default:
                    return false;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* renamed from: b */
    public int m8778b(int i) {
        if (i > 1) {
            i = 2;
        } else if (i < 1) {
            i = 0;
        }
        try {
            if (this.f3731k == 0 && i > 1) {
                return 0;
            }
            try {
                return (this.f3731k != 1 || i >= 1) ? i : 2;
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
    }

    /* renamed from: b */
    public int m8779b(View view) {
        try {
            if (this.f3731k == 0) {
                return view.getLeft();
            }
            try {
                if (this.f3731k != 1) {
                    if (this.f3731k != 2) {
                        return 0;
                    }
                }
                return view.getLeft() + m8804i();
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* renamed from: b */
    public int m8780b(View view, int i) {
        try {
            if (this.f3731k == 0) {
                switch (i) {
                    case 0:
                        return view.getLeft() - m8799f();
                    case 2:
                        return view.getLeft();
                }
            }
            try {
                if (this.f3731k == 1) {
                    switch (i) {
                        case 0:
                            return view.getLeft();
                        case 2:
                            return view.getLeft() + m8804i();
                        default:
                            break;
                    }
                }
                try {
                    if (this.f3731k == 2) {
                        switch (i) {
                            case 0:
                                return view.getLeft() - m8799f();
                            case 2:
                                return view.getLeft() + m8804i();
                            default:
                                break;
                        }
                    }
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
            return view.getLeft();
        } catch (IllegalStateException e2222) {
            throw e2222;
        } catch (IllegalStateException e22222) {
            throw e22222;
        }
    }

    /* renamed from: b */
    public View m8781b() {
        return this.f3734n;
    }

    /* renamed from: b */
    public void m8782b(float f) {
        this.f3733m = f;
    }

    /* renamed from: b */
    public void m8783b(Drawable drawable) {
        this.f3737q = drawable;
        invalidate();
    }

    /* renamed from: b */
    public void m8784b(View view, Canvas canvas, float f) {
        int i = 0;
        try {
            if (this.f3727f) {
                int left;
                this.f3741v.setColor(Color.argb((int) ((this.f3732l * 255.0f) * Math.abs(1.0f - f)), 0, 0, 0));
                if (this.f3731k == 0) {
                    left = view.getLeft() - m8799f();
                    i = view.getLeft();
                } else if (this.f3731k == 1) {
                    left = view.getRight();
                    i = view.getRight() + m8804i();
                } else if (this.f3731k == 2) {
                    Canvas canvas2 = canvas;
                    canvas2.drawRect((float) (view.getLeft() - m8799f()), 0.0f, (float) view.getLeft(), (float) getHeight(), this.f3741v);
                    left = view.getRight();
                    i = view.getRight() + m8804i();
                } else {
                    left = 0;
                }
                canvas.drawRect((float) left, 0.0f, (float) i, (float) getHeight(), this.f3741v);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* renamed from: b */
    public void m8785b(boolean z) {
        this.f3727f = z;
    }

    /* renamed from: b */
    public boolean m8786b(View view, int i, float f) {
        try {
            if (this.f3731k != 0) {
                if (!(this.f3731k == 2 && i == 0)) {
                    try {
                        if (this.f3731k != 1) {
                            if (!(this.f3731k == 2 && i == 2)) {
                                return false;
                            }
                        }
                        try {
                            return f <= ((float) view.getRight());
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    } catch (IllegalStateException e2) {
                        throw e2;
                    } catch (IllegalStateException e22) {
                        try {
                            throw e22;
                        } catch (IllegalStateException e222) {
                            throw e222;
                        }
                    }
                }
            }
            try {
                return f >= ((float) view.getLeft());
            } catch (IllegalStateException e2222) {
                throw e2222;
            }
        } catch (IllegalStateException e22222) {
            throw e22222;
        } catch (IllegalStateException e222222) {
            try {
                throw e222222;
            } catch (IllegalStateException e2222222) {
                throw e2222222;
            }
        }
    }

    /* renamed from: c */
    public View m8787c() {
        return this.f3736p;
    }

    /* renamed from: c */
    public void m8788c(int i) {
        this.f3725d = i;
    }

    /* renamed from: c */
    public void m8789c(View view) {
        try {
            if (this.f3734n != null) {
                removeView(this.f3734n);
            }
            this.f3734n = view;
            addView(this.f3734n);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* renamed from: c */
    public void m8790c(boolean z) {
        this.f3740u = z;
    }

    /* renamed from: c */
    public boolean m8791c(float f) {
        C0526d h;
        if (this.f3731k == 0) {
            h = this.f3726e.m8874h();
            if (f > 0.0f && h != null) {
                try {
                    if (h.isDisplayedWithGesture()) {
                        return true;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            return false;
        } else if (this.f3731k == 1) {
            h = this.f3726e.m8883l();
            if (f < 0.0f && h != null) {
                try {
                    if (h.isDisplayedWithGesture()) {
                        return true;
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            return false;
        } else {
            try {
                if (this.f3731k != 2) {
                    return false;
                }
                h = f > 0.0f ? this.f3726e.m8874h() : this.f3726e.m8883l();
                if (!(f == 0.0f || h == null)) {
                    try {
                        if (h.isDisplayedWithGesture()) {
                            return true;
                        }
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                }
                return false;
            } catch (IllegalStateException e222) {
                throw e222;
            } catch (IllegalStateException e2222) {
                throw e2222;
            }
        }
    }

    /* renamed from: d */
    public int m8792d(View view) {
        try {
            if (this.f3731k != 0) {
                if (this.f3731k != 2) {
                    try {
                        return this.f3731k == 1 ? view.getLeft() : 0;
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
            }
            return view.getLeft() - m8799f();
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* renamed from: d */
    public final void m8793d() {
        this.f3724c = null;
        this.f3736p = null;
        this.f3734n = null;
        this.f3742w = null;
        this.f3726e = null;
    }

    /* renamed from: d */
    public void m8794d(float f) {
        if (f > 1.0f || f < 0.0f) {
            try {
                throw new IllegalStateException(f3721z);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        this.f3732l = f;
    }

    /* renamed from: d */
    public void m8795d(int i) {
        this.f3738s = i;
        requestLayout();
    }

    protected void dispatchDraw(Canvas canvas) {
        try {
            if (this.f3742w != null) {
                canvas.save();
                this.f3742w.m8809a(canvas, this.f3724c.m8754r());
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            }
            super.dispatchDraw(canvas);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* renamed from: e */
    public int m8796e() {
        return this.f3731k;
    }

    /* renamed from: e */
    public void m8797e(int i) {
        this.f3735o = i;
    }

    /* renamed from: e */
    public void m8798e(View view) {
        try {
            if (this.f3736p != null) {
                removeView(this.f3736p);
            }
            this.f3736p = view;
            addView(this.f3736p);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* renamed from: f */
    public int m8799f() {
        return this.f3736p.getWidth();
    }

    /* renamed from: f */
    public void m8800f(int i) {
        if (i == 0 || i == 1) {
            try {
                if (this.f3736p != null) {
                    this.f3736p.setVisibility(0);
                }
                try {
                    if (this.f3734n != null) {
                        this.f3734n.setVisibility(4);
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        this.f3731k = i;
    }

    /* renamed from: g */
    public float m8801g() {
        return this.f3733m;
    }

    /* renamed from: g */
    public void m8802g(int i) {
        this.f3728g = i;
        invalidate();
    }

    /* renamed from: h */
    public int m8803h() {
        return this.f3725d;
    }

    /* renamed from: i */
    public int m8804i() {
        try {
            return this.f3734n != null ? this.f3734n.getWidth() : this.f3736p.getWidth();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return !this.f3739t;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        try {
            this.f3736p.layout(0, getPaddingTop(), i5 - this.f3723b, i6);
            if (this.f3734n != null) {
                this.f3734n.layout(0, getPaddingTop(), i5 - this.f3738s, i6);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    protected void onMeasure(int i, int i2) {
        int defaultSize = C1264g.getDefaultSize(0, i);
        int defaultSize2 = C1264g.getDefaultSize(0, i2);
        setMeasuredDimension(defaultSize, defaultSize2);
        int childMeasureSpec = C1264g.getChildMeasureSpec(i, 0, defaultSize - this.f3723b);
        defaultSize2 = C1264g.getChildMeasureSpec(i2, 0, defaultSize2);
        this.f3736p.measure(childMeasureSpec, defaultSize2);
        if (this.f3734n != null) {
            this.f3734n.measure(C1264g.getChildMeasureSpec(i, 0, defaultSize - this.f3738s), defaultSize2);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return !this.f3739t;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void scrollTo(int i, int i2) {
        try {
            super.scrollTo(i, i2);
            if (this.f3742w != null) {
                invalidate();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }
}
