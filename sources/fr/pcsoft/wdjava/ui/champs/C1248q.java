package fr.pcsoft.wdjava.ui.champs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;

/* renamed from: fr.pcsoft.wdjava.ui.champs.q */
class C1248q extends C1151p {
    final hc this$0;

    C1248q(hc hcVar, Context context) {
        this.this$0 = hcVar;
        super(context);
    }

    protected void dispatchDraw(Canvas canvas) {
        Path borderClipPath = this.this$0.getBorderClipPath();
        if (borderClipPath != null) {
            borderClipPath.rewind();
        }
        if (this.this$0.kc != null) {
            this.this$0.kc.mo3370a(canvas, (View) this, borderClipPath);
        }
        if (borderClipPath != null) {
            canvas.save(2);
            canvas.clipPath(borderClipPath);
            super.dispatchDraw(canvas);
            canvas.restore();
        } else {
            super.dispatchDraw(canvas);
        }
        this.this$0.dessinerContourCadreExterieur(canvas, this.this$0.xc);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.this$0.xc == 2 && !kb.m3965a(C0657a.JELLY_BEAN_MR2) && isHardwareAccelerated()) {
            C1014a.m7327b().mo3294c(this);
        }
        this.this$0.updateLabelTextColor();
    }
}
