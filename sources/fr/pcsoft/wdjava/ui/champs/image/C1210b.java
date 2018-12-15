package fr.pcsoft.wdjava.ui.champs.image;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;

/* renamed from: fr.pcsoft.wdjava.ui.champs.image.b */
class C1210b extends SimpleOnScaleGestureListener {
    final C1217j this$0;

    C1210b(C1217j c1217j) {
        this.this$0 = c1217j;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        boolean z = false;
        if (this.this$0.isEnabled()) {
            try {
                if (this.this$0.u == C1212e.MULTITOUCH) {
                    if (this.this$0.getDrawable() != null) {
                        float min = Math.min(this.this$0.q, Math.max(this.this$0.t * scaleGestureDetector.getScaleFactor(), this.this$0.j));
                        this.this$0.m8565a(min, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                        this.this$0.t = min;
                        this.this$0.invalidate();
                    } else if (this.this$0.b != null) {
                        this.this$0.b.onScale(scaleGestureDetector.getCurrentSpan(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), scaleGestureDetector.getScaleFactor());
                    }
                }
                z = true;
                if (this.this$0.b != null) {
                    this.this$0.b.onScale(scaleGestureDetector.getCurrentSpan(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), scaleGestureDetector.getScaleFactor());
                }
            } catch (Throwable th) {
                if (this.this$0.b != null) {
                    this.this$0.b.onScale(scaleGestureDetector.getCurrentSpan(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), scaleGestureDetector.getScaleFactor());
                }
            }
        }
        return z;
    }
}
