package fr.pcsoft.wdjava.ui.p033c;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.HorizontalScrollView;
import fr.pcsoft.wdjava.ui.cadre.C1110m;
import fr.pcsoft.wdjava.ui.gesture.C1171d;

/* renamed from: fr.pcsoft.wdjava.ui.c.a */
public class C1106a extends HorizontalScrollView implements C1105c {
    /* renamed from: d */
    int f3356d = 0;
    /* renamed from: e */
    private C1171d f3357e = null;
    /* renamed from: f */
    private C1110m f3358f = null;
    /* renamed from: g */
    private boolean f3359g = false;
    /* renamed from: h */
    private boolean f3360h = false;
    /* renamed from: i */
    private C0510b f3361i = null;

    public C1106a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public int mo3349a() {
        return 0;
    }

    /* renamed from: a */
    public void mo3350a(int i) {
        boolean z = this.f3359g;
        this.f3359g = true;
        try {
            scrollTo(i, 0);
        } finally {
            this.f3359g = z;
        }
    }

    /* renamed from: a */
    public void mo3351a(C0510b c0510b) {
        this.f3361i = c0510b;
    }

    /* renamed from: a */
    public final void mo3352a(C1110m c1110m) {
        if (c1110m != null) {
            int b = c1110m.mo3382b();
            if (b > 0) {
                setPadding(getPaddingLeft() + b, getPaddingTop() + b, getPaddingRight() + b, b + getPaddingBottom());
            }
        }
        this.f3358f = c1110m;
    }

    /* renamed from: a */
    public void mo3353a(C1171d c1171d) {
        this.f3357e = c1171d;
    }

    /* renamed from: b */
    public int mo3354b() {
        return 0;
    }

    /* renamed from: b */
    public void mo3355b(int i) {
    }

    /* renamed from: c */
    public int mo3356c() {
        return Math.max(0, getScrollX());
    }

    public boolean canScrollHorizontally(int i) {
        if (getChildCount() == 0) {
            return false;
        }
        int scrollX = getScrollX();
        return (i > 0 && scrollX < ((getChildAt(0).getWidth() + getPaddingLeft()) + getPaddingRight()) - getWidth()) || (i < 0 && scrollX > 0);
    }

    public boolean canScrollVertically(int i) {
        return false;
    }

    /* renamed from: d */
    public void mo3359d() {
        this.f3361i = null;
        if (this.f3357e != null) {
            this.f3357e.mo3433a();
            this.f3357e = null;
        }
        this.f3358f = null;
    }

    protected void dispatchDraw(Canvas canvas) {
        if (this.f3358f != null) {
            this.f3358f.mo3373b(canvas, (View) this, null);
        }
        super.dispatchDraw(canvas);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return (this.f3357e == null || !this.f3357e.mo3434a(this, motionEvent)) ? super.dispatchTouchEvent(motionEvent) : true;
    }

    /* renamed from: e */
    public int mo3360e() {
        return Math.max(0, getChildAt(0).getWidth() - ((getWidth() - getPaddingLeft()) - getPaddingRight()));
    }

    /* renamed from: f */
    public int mo3361f() {
        return 2;
    }

    /* renamed from: g */
    public C0510b mo3362g() {
        return this.f3361i;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getScrollX() != 0 || canScrollHorizontally(1)) ? super.onInterceptTouchEvent(motionEvent) : false;
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        int scrollX = getScrollX();
        int i5 = scrollX - this.f3356d;
        if (!(i5 == 0 || this.f3361i == null)) {
            this.f3361i.onScrollChanged(this, i5, 0, this.f3359g);
        }
        this.f3356d = scrollX;
    }

    public void requestChildFocus(View view, View view2) {
        if (view2 instanceof WebView) {
            boolean z = this.f3360h;
            this.f3360h = true;
            try {
                super.requestChildFocus(view, view2);
            } finally {
                this.f3360h = z;
            }
        } else {
            super.requestChildFocus(view, view2);
        }
    }

    public void scrollBy(int i, int i2) {
        if (!this.f3360h) {
            super.scrollBy(i, i2);
        }
    }

    public void scrollTo(int i, int i2) {
        if (!this.f3360h) {
            super.scrollTo(i, i2);
        }
    }
}
