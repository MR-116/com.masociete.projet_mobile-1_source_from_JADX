package fr.pcsoft.wdjava.ui.p033c;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ScrollView;
import fr.pcsoft.wdjava.ui.cadre.C1110m;
import fr.pcsoft.wdjava.ui.gesture.C1171d;

/* renamed from: fr.pcsoft.wdjava.ui.c.e */
public class C1108e extends ScrollView implements C1105c {
    /* renamed from: d */
    private C1171d f3362d = null;
    /* renamed from: e */
    private C1110m f3363e = null;
    /* renamed from: f */
    private boolean f3364f = false;
    /* renamed from: g */
    private C0510b f3365g = null;
    /* renamed from: h */
    private int f3366h = 0;
    /* renamed from: i */
    private boolean f3367i = false;

    public C1108e(Context context) {
        super(context);
    }

    /* renamed from: a */
    public int mo3349a() {
        return Math.max(0, getScrollY());
    }

    /* renamed from: a */
    public void mo3350a(int i) {
    }

    /* renamed from: a */
    public void mo3351a(C0510b c0510b) {
        this.f3365g = c0510b;
    }

    /* renamed from: a */
    public final void mo3352a(C1110m c1110m) {
        if (c1110m != null) {
            int b = c1110m.mo3382b();
            if (b > 0) {
                setPadding(getPaddingLeft() + b, getPaddingTop() + b, getPaddingRight() + b, b + getPaddingBottom());
            }
        }
        this.f3363e = c1110m;
    }

    /* renamed from: a */
    public void mo3353a(C1171d c1171d) {
        this.f3362d = c1171d;
    }

    /* renamed from: b */
    public int mo3354b() {
        return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* renamed from: b */
    public void mo3355b(int i) {
        boolean z = this.f3364f;
        this.f3364f = true;
        try {
            scrollTo(0, i);
        } finally {
            this.f3364f = z;
        }
    }

    /* renamed from: c */
    public int mo3356c() {
        return 0;
    }

    public boolean canScrollHorizontally(int i) {
        return false;
    }

    public boolean canScrollVertically(int i) {
        if (getChildCount() == 0) {
            return false;
        }
        int scrollY = getScrollY();
        return (i > 0 && scrollY < ((getChildAt(0).getHeight() + getPaddingTop()) + getPaddingBottom()) - getHeight()) || (i < 0 && scrollY > 0);
    }

    /* renamed from: d */
    public void mo3359d() {
        this.f3365g = null;
        if (this.f3362d != null) {
            this.f3362d.mo3433a();
            this.f3362d = null;
        }
        this.f3363e = null;
    }

    protected void dispatchDraw(Canvas canvas) {
        if (this.f3363e != null) {
            this.f3363e.mo3373b(canvas, (View) this, null);
        }
        super.dispatchDraw(canvas);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return (this.f3362d == null || !this.f3362d.mo3434a(this, motionEvent)) ? super.dispatchTouchEvent(motionEvent) : true;
    }

    /* renamed from: e */
    public int mo3360e() {
        return 0;
    }

    /* renamed from: f */
    public int mo3361f() {
        return 1;
    }

    /* renamed from: g */
    public C0510b mo3362g() {
        return this.f3365g;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getScrollY() != 0 || canScrollVertically(1)) ? super.onInterceptTouchEvent(motionEvent) : false;
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        int scrollY = getScrollY();
        int i5 = scrollY - this.f3366h;
        if (!(i5 == 0 || this.f3365g == null)) {
            this.f3365g.onScrollChanged(this, 0, i5, this.f3364f);
        }
        this.f3366h = scrollY;
    }

    public void requestChildFocus(View view, View view2) {
        if (view2 instanceof WebView) {
            boolean z = this.f3367i;
            this.f3367i = true;
            try {
                super.requestChildFocus(view, view2);
            } finally {
                this.f3367i = z;
            }
        } else {
            super.requestChildFocus(view, view2);
        }
    }

    public void scrollBy(int i, int i2) {
        if (!this.f3367i) {
            super.scrollBy(i, i2);
        }
    }

    public void scrollTo(int i, int i2) {
        if (!this.f3367i) {
            super.scrollTo(i, i2);
        }
    }
}
