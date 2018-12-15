package fr.pcsoft.wdjava.ui.pulltorefresh;

import android.content.Context;
import android.os.SystemClock;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import fr.pcsoft.wdjava.ui.utils.C1511l;

/* renamed from: fr.pcsoft.wdjava.ui.pulltorefresh.f */
public class C1157f extends LinearLayout implements C1156d {
    /* renamed from: h */
    private static final int f3510h = 2;
    /* renamed from: i */
    private static final int f3511i = 1;
    /* renamed from: j */
    private static final String f3512j = C1157f.m8383z(C1157f.m8384z("\u0017KA#w\u0002V\t':\u0006]\u00052b\u0010\u0017\u001a::\u0001L\u0003?`\u001eK\n5f\u0014J\u0007}S&})\u001aR8f?\u0006X=f;\u001cK#|)\u0001Q\"q"));
    /* renamed from: b */
    private int f3513b = 0;
    /* renamed from: c */
    private boolean f3514c = false;
    /* renamed from: d */
    private int f3515d = 0;
    /* renamed from: e */
    private C0533c f3516e;
    /* renamed from: f */
    private boolean f3517f = false;
    /* renamed from: g */
    private long f3518g = 0;
    /* renamed from: k */
    private int f3519k = 0;
    /* renamed from: l */
    private int f3520l = 0;
    /* renamed from: m */
    private C1474e f3521m = C1474e.IDLE;
    /* renamed from: n */
    private C0514j f3522n = null;
    /* renamed from: o */
    private View f3523o;

    public C1157f(Context context) {
        super(context);
        setVerticalFadingEdgeEnabled(false);
        setVerticalScrollBarEnabled(false);
        setOrientation(1);
    }

    /* renamed from: a */
    private final void m8378a(int i) {
        LayoutParams layoutParams = this.f3516e.getView().getLayoutParams();
        if (layoutParams.height != i) {
            this.f3516e.onHeightChangedWhilePulling(i, layoutParams.height);
            layoutParams.height = i;
            requestLayout();
        }
    }

    /* renamed from: a */
    private final void m8379a(C1474e c1474e) {
        if (this.f3521m != c1474e) {
            this.f3521m = c1474e;
            m8380c(c1474e != C1474e.IDLE);
            switch (C1472a.f4478a[this.f3521m.ordinal()]) {
                case 1:
                    this.f3516e.onPullToRefresh();
                    break;
                case 2:
                    this.f3516e.onReleaseToRefresh();
                    break;
                case 3:
                case 4:
                    this.f3516e.onRefreshing();
                    break;
                case 5:
                    this.f3518g = SystemClock.uptimeMillis();
                    break;
            }
            if (this.f3521m == C1474e.REFRESHING && this.f3522n != null) {
                this.f3522n.onRefresh();
            }
        }
    }

    /* renamed from: c */
    private final void m8380c(boolean z) {
        if (this.f3516e != null) {
            View view = this.f3516e.getView();
            if (z && view.getVisibility() != 0) {
                if (this.f3521m == C1474e.REFRESHING_MANUAL) {
                    m8378a(this.f3516e.getStandardViewHeight());
                }
                view.setVisibility(0);
                requestLayout();
            }
            if (!z && view.getVisibility() == 0) {
                view.setVisibility(8);
                requestLayout();
            }
        }
    }

    /* renamed from: c */
    private final boolean m8381c() {
        return (this.f3515d & 2) == 2;
    }

    /* renamed from: d */
    private final boolean m8382d() {
        return (this.f3515d & 1) != 1 && this.f3523o.isEnabled();
    }

    /* renamed from: z */
    private static String m8383z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 113;
                    break;
                case 1:
                    i2 = 57;
                    break;
                case 2:
                    i2 = 111;
                    break;
                case 3:
                    i2 = 83;
                    break;
                default:
                    i2 = 20;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8384z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 20);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected C0533c mo3431a(Context context) {
        return new C1486s(context);
    }

    /* renamed from: a */
    public void mo3425a() {
        if (this.f3516e != null) {
            this.f3516e.release();
            this.f3516e = null;
        }
        this.f3523o = null;
        this.f3522n = null;
    }

    /* renamed from: a */
    public void mo3426a(View view) {
        if (view != this.f3523o) {
            if (this.f3523o != null) {
                removeView(this.f3523o);
            }
            if (this.f3516e == null) {
                this.f3516e = mo3431a(view.getContext());
                m8380c(false);
                addView(this.f3516e.getView(), new LinearLayout.LayoutParams(-1, 0));
            }
            this.f3523o = view;
            C1503b.m10429a((ViewGroup) this, this.f3523o, new LinearLayout.LayoutParams(-1, -1));
        }
    }

    /* renamed from: a */
    public void mo3427a(C0514j c0514j) {
        this.f3522n = c0514j;
    }

    /* renamed from: a */
    public void mo3428a(boolean z) {
        if (!C0938m.m6815b()) {
            C0938m.m6810a(new C1477i(this, z));
        } else if (z) {
            this.f3520l++;
            m8379a(C1474e.REFRESHING_MANUAL);
        } else if (this.f3520l > 0) {
            this.f3520l--;
            if (this.f3520l == 0) {
                m8379a(C1474e.IDLE);
            }
        }
    }

    /* renamed from: b */
    public View mo3429b() {
        return this.f3523o;
    }

    /* renamed from: b */
    public final void m8391b(boolean z) {
        if (z) {
            this.f3515d |= 2;
        } else {
            this.f3515d &= -3;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        int i = 0;
        if (this.f3523o == null) {
            return false;
        }
        if (!m8382d()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (isRefreshing() && !m8381c()) {
            return true;
        }
        switch (actionMasked) {
            case 0:
                if (motionEvent.getEdgeFlags() == 0) {
                    if (ViewCompat.canScrollVertically(this.f3523o, -1)) {
                        z = false;
                    }
                    this.f3514c = z;
                    if (this.f3518g > 0 && motionEvent.getEventTime() < this.f3518g) {
                        this.f3514c = false;
                    }
                    if (this.f3514c) {
                        this.f3519k = (int) motionEvent.getX();
                        this.f3513b = (int) motionEvent.getY();
                        break;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
                break;
            case 1:
            case 3:
                if (this.f3517f) {
                    this.f3517f = false;
                    this.f3514c = false;
                    if (this.f3521m != C1474e.RELEASE) {
                        if (!isRefreshing()) {
                            m8379a(C1474e.IDLE);
                            break;
                        }
                    }
                    C0938m.m6814b(new C1476h(this));
                    break;
                }
                break;
            case 2:
                actionMasked = (int) (((float) this.f3519k) - motionEvent.getX());
                int y = (int) (((float) this.f3513b) - motionEvent.getY());
                int abs = Math.abs(y);
                if (!this.f3517f && this.f3514c && y <= 1 && abs > C1511l.f4643q / 2 && abs > Math.abs(actionMasked)) {
                    this.f3517f = true;
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    super.dispatchTouchEvent(obtain);
                }
                if (this.f3517f) {
                    if (isRefreshing()) {
                        return true;
                    }
                    actionMasked = (int) (motionEvent.getY() - ((float) this.f3513b));
                    if (actionMasked > 0) {
                        i = actionMasked;
                    }
                    actionMasked = this.f3516e.getStandardViewHeight();
                    if (i > actionMasked) {
                        i = ((i - C1503b.m10449c(this.f3516e.getView())) / 2) + actionMasked;
                    }
                    m8378a(i);
                    m8379a(i > actionMasked ? C1474e.RELEASE : C1474e.PULL);
                    return true;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean isRefreshing() {
        return this.f3521m == C1474e.REFRESHING || this.f3521m == C1474e.REFRESHING_MANUAL;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            this.f3515d &= -2;
        } else {
            this.f3515d |= 1;
        }
    }
}
