package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import fr.pcsoft.wdjava.core.C0727l;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import fr.pcsoft.wdjava.ui.champs.C0530v;
import fr.pcsoft.wdjava.ui.champs.fc;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import java.util.Iterator;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.r */
public class C1309r extends C1308q implements C1301k, C0530v {
    /* renamed from: c */
    private boolean f3906c = false;
    /* renamed from: d */
    private int f3907d = 0;
    /* renamed from: e */
    private boolean f3908e = false;
    final C1295f this$0;

    public C1309r(C1295f c1295f, Context context) {
        this.this$0 = c1295f;
        super(c1295f, context);
        C1014a.m7327b().mo3294c(this);
    }

    /* renamed from: a */
    private int m9193a(ec ecVar, int i) {
        int i2 = 0;
        int cellHeight = this.this$0.b.getCellHeight();
        if (this.this$0.b.isHorizontale()) {
            return cellHeight;
        }
        int i3;
        boolean z = this.f3906c;
        if (ecVar.m9111d()) {
            Integer num = (Integer) ecVar.m9123k(10);
            if (num != null) {
                i2 = num.intValue();
                i3 = 0;
            } else {
                boolean z2 = z;
                i2 = cellHeight;
            }
        } else {
            i3 = 0;
        }
        int d = this.this$0.b.m1512d();
        if (d > 0 && r1 > d) {
            i2 = d;
        }
        m9195a(i, i2);
        if (i3 != 0) {
            i3 = C1503b.m10422a(this.a, true) + this.this$0.b.m1514i();
            if (d <= 0 || i3 <= d) {
                d = i3;
            }
            i3 = this.this$0.b.getMinCellHeight();
            if (d >= i3) {
                i3 = d;
            }
            if (i3 != i2) {
                m9195a(i, i3);
                i2 = i3;
            }
        }
        return i2;
    }

    /* renamed from: b */
    private int m9194b(ec ecVar, int i) {
        int i2 = 0;
        int largeurColonneZR = this.this$0.b.getLargeurColonneZR();
        if (!this.this$0.b.isHorizontale()) {
            return this.this$0.b.getLargeurColonneZR();
        }
        int i3;
        boolean z = this.f3906c;
        if (ecVar.m9111d()) {
            Integer num = (Integer) ecVar.m9123k(10);
            if (num != null) {
                i2 = num.intValue();
                i3 = 0;
            } else {
                boolean z2 = z;
                i2 = largeurColonneZR;
            }
        } else {
            i3 = 0;
        }
        int d = this.this$0.b.m1512d();
        if (d > 0 && i > d) {
            i2 = d;
        }
        m9195a(i2, i);
        if (i3 == 0) {
            return i2;
        }
        i3 = C1503b.m10444b(this.a, true) + this.this$0.b.m1515j();
        if (d <= 0 || i3 <= d) {
            d = i3;
        }
        i3 = this.this$0.b.getMinCellWidth();
        if (d >= i3) {
            i3 = d;
        }
        if (i3 == i2) {
            return i2;
        }
        m9195a(i3, i);
        return i3;
    }

    /* renamed from: a */
    protected void m9195a(int i, int i2) {
        int i3 = this.this$0.b.m1514i();
        int j = this.this$0.b.m1515j();
        if (j != i || i3 != i2) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((gc) it.next()).ancrer(i - j, i2 - i3, 0, 0, 15);
            }
        }
    }

    /* renamed from: a */
    protected void m9196a(ec ecVar) {
        boolean z = this.f3908e;
        this.f3908e = true;
        try {
            int cellHeight;
            int b;
            if (this.this$0.b.isHorizontale()) {
                cellHeight = this.this$0.b.getCellHeight();
                b = m9194b(ecVar, cellHeight);
            } else {
                b = this.this$0.b.getLargeurColonneZR();
                cellHeight = m9193a(ecVar, b);
            }
            LayoutParams layoutParams = getLayoutParams();
            if (!(cellHeight == layoutParams.height && b == layoutParams.width)) {
                layoutParams.height = cellHeight;
                layoutParams.width = b;
                requestLayout();
            }
            this.f3908e = z;
        } catch (Throwable th) {
            this.f3908e = z;
        }
    }

    /* renamed from: a */
    public void mo3574a(ec ecVar, boolean z) {
        super.mo3574a(ecVar, z);
        this.f3907d = ((eb) getParent()).m8950b(ecVar);
        invalidate();
    }

    /* renamed from: b */
    protected void mo3575b(gc gcVar) {
        super.mo3575b(gcVar);
        boolean isHorizontale = this.this$0.b.isHorizontale();
        if ((isHorizontale && C0727l.m3092b(gcVar.getAnchorOptions(), 8)) || (!isHorizontale && C0727l.m3092b(gcVar.getAnchorOptions(), 7))) {
            this.f3906c = true;
            gcVar.addChampListener(this);
        }
    }

    /* renamed from: c */
    protected void mo3576c() {
        m9185a(this.this$0.b.getChampIterator());
    }

    protected void dispatchDraw(Canvas canvas) {
        int width = getWidth() + getScrollX();
        int height = getHeight();
        eb ebVar = (eb) getParent();
        if (ebVar != null) {
            this.this$0.m8969a(canvas, ebVar.m8956d(), this.f3907d, ebVar.m8953b(), width, height);
        }
        super.dispatchDraw(canvas);
        this.this$0.m8968a(canvas, width, height);
        this.this$0.m8976b(canvas, width, height);
    }

    /* renamed from: e */
    protected boolean m9200e() {
        return this.this$0.b._getEtat() != 0;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return m9200e() ? true : super.onInterceptTouchEvent(motionEvent);
    }

    public void onModification(fc fcVar) {
    }

    public void onPositionChanged(fc fcVar, int i, int i2, int i3) {
    }

    public boolean onPreferredSizeChanged(fc fcVar, int i, int i2) {
        if (!(this.f3908e || this.this$0.b.isDessinZREnCours())) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup instanceof eb) {
                m9196a(((eb) viewGroup).m8958e());
            }
        }
        return true;
    }

    public void onSizeChanged(fc fcVar, int i, int i2, int i3) {
    }

    public void onVisibilityChanged(fc fcVar, boolean z) {
    }

    public void setPressed(boolean z) {
        boolean isPressed = isPressed();
        super.setPressed(z);
        if (isPressed != z && this.this$0.b.getSelectionModel().mo3496h() == 99) {
            invalidate();
        }
    }
}
