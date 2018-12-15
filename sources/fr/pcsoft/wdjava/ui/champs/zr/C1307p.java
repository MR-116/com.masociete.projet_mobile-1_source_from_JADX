package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.image.C0520c;
import fr.pcsoft.wdjava.ui.p072i.C1434f;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.p */
public class C1307p extends C1305o {
    /* renamed from: a */
    private boolean f3900a = false;
    final C1294e this$0;

    public C1307p(C1294e c1294e, Context context) {
        this.this$0 = c1294e;
        super(c1294e, context);
    }

    /* renamed from: a */
    private void m9177a(Canvas canvas, int i, boolean z, int i2, int i3) {
        boolean z2 = this.this$0.f3849g == null || !this.this$0.f3849g.m10066e();
        if (z2) {
            this.this$0.m8969a(canvas, i, this.this$0.f3852k, z, i2, i3);
        }
        C1434f b = this.this$0.f3849g != null ? this.this$0.f3849g.m10059b(this.this$0.b.convertirIndiceModeleVersVue(i)) : null;
        if (b == null || !b.m10086a()) {
            if (this.this$0.b.isEditing() && this.this$0.b.getEditor().mo3605h() == 1 && this.this$0.b.convertirIndiceVueVersModele(this.this$0.b.getEditor().m9261j()) == i) {
                this.f3900a = true;
                try {
                    draw(canvas);
                } finally {
                    this.f3900a = false;
                }
            } else {
                draw(canvas);
            }
        }
        if (z2) {
            this.this$0.m8968a(canvas, i2, i3);
            this.this$0.m8976b(canvas, i2, i3);
        }
    }

    static void access$000(C1307p c1307p, Canvas canvas, int i, boolean z, int i2, int i3) {
        c1307p.m9177a(canvas, i, z, i2, i3);
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        gc g = this.this$0.b.getEditor().m9258g();
        return (this.f3900a && view == g.getCompConteneur() && !(g instanceof C0520c)) ? false : super.drawChild(canvas, view, j);
    }
}
