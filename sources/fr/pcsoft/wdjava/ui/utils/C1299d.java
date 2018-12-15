package fr.pcsoft.wdjava.ui.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.ListView;
import android.widget.SectionIndexer;

/* renamed from: fr.pcsoft.wdjava.ui.utils.d */
public class C1299d extends ListView {
    /* renamed from: a */
    private C1505e f3896a = null;

    public C1299d(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void m9157a() {
        if (this.f3896a != null) {
            this.f3896a.m10469c();
            this.f3896a = null;
        }
    }

    /* renamed from: a */
    public final void m9158a(SectionIndexer sectionIndexer) {
        if (this.f3896a == null) {
            this.f3896a = new C1505e(this, sectionIndexer);
        }
    }

    /* renamed from: b */
    public final void m9159b() {
        m9157a();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f3896a != null) {
            this.f3896a.m10466a(canvas);
        }
    }

    public boolean isFastScrollEnabled() {
        return this.f3896a != null ? this.f3896a.m10468b() != (byte) -1 : super.isFastScrollEnabled();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (this.f3896a == null || !C1505e.access$100(this.f3896a, motionEvent)) ? super.onInterceptTouchEvent(motionEvent) : true;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f3896a != null) {
            this.f3896a.m10465a(i, i2, i3, i4);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3896a != null) {
            if (this.f3896a.m10467a(motionEvent)) {
                return true;
            }
            if (this.f3896a.m10468b() != (byte) -1 && (motionEvent.getAction() & 255) == 0) {
                this.f3896a.m10464a();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setFastScrollEnabled(boolean z) {
        if (this.f3896a == null) {
            super.setFastScrollEnabled(z);
        } else if (z) {
            C1505e.access$000(this.f3896a, (byte) 0);
        } else {
            C1505e.access$000(this.f3896a, (byte) -1);
        }
    }
}
