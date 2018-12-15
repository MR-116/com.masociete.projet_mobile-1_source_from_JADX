package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import fr.pcsoft.wdjava.ui.cadre.C1110m;

public class ib extends hb {
    final db this$1;

    public ib(db dbVar, Context context, WDRuptureZR wDRuptureZR) {
        this.this$1 = dbVar;
        super(dbVar.this$0, context, wDRuptureZR);
    }

    /* renamed from: a */
    public int mo3564a() {
        return this.this$1.a;
    }

    protected void dispatchDraw(Canvas canvas) {
        View view = (C1305o) this.this$1.this$0.f3850h.get(this.b.getName());
        Object obj = (this.this$1.this$0.f3849g == null || !this.this$1.this$0.f3849g.m10066e()) ? 1 : null;
        C1110m cadre = this.b.getCadre();
        if (!(obj == null || cadre == null)) {
            cadre.mo3373b(canvas, view, null);
        }
        if (this.this$1.this$0.f3849g == null || this.this$1.this$0.f3849g.m10066e()) {
            view.draw(canvas);
        }
        if (obj != null) {
            this.this$1.this$0.m8968a(canvas, view.getWidth(), view.getHeight());
            super.dispatchDraw(canvas);
        }
    }
}
