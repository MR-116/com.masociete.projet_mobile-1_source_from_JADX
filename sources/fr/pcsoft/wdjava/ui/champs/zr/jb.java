package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import fr.pcsoft.wdjava.ui.cadre.C1110m;

public abstract class jb extends hb {
    /* renamed from: d */
    private C1308q f3897d;
    final C1295f this$0;

    public jb(C1295f c1295f, Context context, WDRuptureZR wDRuptureZR) {
        this.this$0 = c1295f;
        super(c1295f, context, wDRuptureZR);
    }

    /* renamed from: a */
    protected void mo3566a(Context context) {
        this.f3897d = new C1310s(this, context);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        addView(this.f3897d, layoutParams);
        super.mo3566a(context);
    }

    /* renamed from: c */
    public C1308q m9161c() {
        return this.f3897d;
    }

    protected void dispatchDraw(Canvas canvas) {
        C1110m cadre = this.b.getCadre();
        if (cadre != null) {
            cadre.mo3373b(canvas, (View) this, null);
        }
        super.dispatchDraw(canvas);
        this.this$0.m8968a(canvas, getWidth(), getHeight());
    }
}
