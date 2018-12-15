package fr.pcsoft.wdjava.ui.champs.fenetre;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.champs.C1151p;
import fr.pcsoft.wdjava.ui.utils.C1521w;
import java.util.Iterator;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetre.f */
class C1152f extends C1151p {
    final WDFenetre this$0;

    C1152f(WDFenetre wDFenetre, Context context) {
        this.this$0 = wDFenetre;
        super(context);
    }

    /* renamed from: a */
    protected void m8338a(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.this$0.Fd != null && this.this$0.isMaximisee()) {
            C1521w visibleDisplayArea = this.this$0.getVisibleDisplayArea();
            int i3 = visibleDisplayArea.f4666a;
            int i4 = visibleDisplayArea.f4667b;
            if (this.this$0.isAvecAscenseurAuto()) {
                i4 = this.this$0.Q;
                i3 = Math.max(this.this$0.T, visibleDisplayArea.f4666a);
                i4 = Math.max(i4, visibleDisplayArea.f4667b);
            }
            setMeasuredDimension(i3, i4);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.this$0.Wd ? true : super.dispatchTouchEvent(motionEvent);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.this$0.Dd = true;
        int i7 = this.this$0.Td != null ? i5 - this.this$0.Td.f4666a : 0;
        int i8 = this.this$0.Td != null ? i6 - this.this$0.Td.f4667b : 0;
        boolean z2 = (i7 == 0 && i8 == 0) ? false : true;
        if (z2) {
            if (this.this$0.isAncrageActif()) {
                this.this$0.Xd = true;
                this.this$0.appliquerAncrage(i7, i8, 0, 0, 0);
                this.this$0.Xd = false;
                if (this.this$0.Sd != null) {
                    Iterator it = this.this$0.Sd.iterator();
                    while (it.hasNext()) {
                        ((C1139c) it.next()).mo3415a(this.this$0);
                    }
                }
            }
            C0938m.m6814b(new C1174z(this));
            this.this$0.Td.f4666a = i5;
            this.this$0.Td.f4667b = i6;
            measureChildren(0, 0);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    protected void onMeasure(int i, int i2) {
        if (this.this$0.isMaximisee()) {
            measureChildren(0, 0);
            int size = MeasureSpec.getSize(i);
            int size2 = MeasureSpec.getSize(i2);
            if (this.this$0.isAvecAscenseurAuto()) {
                if (this.this$0.Eb > this.this$0.ld) {
                    size += this.this$0.Eb - this.this$0.ld;
                }
                if (size < this.this$0.Eb) {
                    size = this.this$0.Eb;
                }
                if (this.this$0.Tb > this.this$0.xd) {
                    size2 += this.this$0.Tb - this.this$0.xd;
                }
                if (size2 < this.this$0.Tb) {
                    size2 = this.this$0.Tb;
                }
            }
            setMeasuredDimension(size, size2);
        } else {
            super.onMeasure(i, i2);
        }
        if (this.this$0.Id != null) {
            this.this$0.Id.mo3511a(this.this$0);
        }
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        return super.onRequestFocusInDescendants(i, rect);
    }
}
