package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.w */
final class C1314w extends FrameLayout implements C1301k {
    final db this$1;

    C1314w(db dbVar, Context context) {
        this.this$1 = dbVar;
        super(context);
    }

    protected void dispatchDraw(Canvas canvas) {
        this.this$1.m9054a(canvas, (ViewGroup) this);
        super.dispatchDraw(canvas);
    }
}
