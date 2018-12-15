package fr.pcsoft.wdjava.ui.champs.image;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: fr.pcsoft.wdjava.ui.champs.image.j */
public class C1217j extends C1216i {
    /* renamed from: v */
    protected ScaleGestureDetector f3644v = null;

    public C1217j(Context context) {
        super(context);
    }

    /* renamed from: a */
    protected int mo3473a(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    /* renamed from: a */
    protected void mo3474a(float f) {
        super.mo3474a(f);
        if (!mo3479o()) {
            this.t = f;
        }
    }

    /* renamed from: a */
    public void mo3475a(C1212e c1212e) {
        super.mo3475a(c1212e);
        if (c1212e == C1212e.MULTITOUCH) {
            m8600u();
        }
    }

    /* renamed from: b */
    public void mo3476b() {
        if (this.m == null) {
            this.m = new GestureDetector(getContext(), new C1209a(this), null, true);
        }
    }

    /* renamed from: b */
    protected final boolean mo3477b(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 255) == 1;
    }

    /* renamed from: h */
    public void mo3478h() {
        super.mo3478h();
        this.f3644v = null;
    }

    /* renamed from: o */
    protected boolean mo3479o() {
        return this.f3644v != null && this.f3644v.isInProgress();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3644v != null) {
            this.f3644v.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: u */
    public final void m8600u() {
        if (this.f3644v == null) {
            this.f3644v = new ScaleGestureDetector(getContext(), new C1210b(this));
        }
    }
}
