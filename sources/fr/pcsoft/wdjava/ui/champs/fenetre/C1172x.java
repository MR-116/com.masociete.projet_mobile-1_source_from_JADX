package fr.pcsoft.wdjava.ui.champs.fenetre;

import android.annotation.TargetApi;
import android.view.MotionEvent;
import android.view.View;
import fr.pcsoft.wdjava.ui.gesture.C1171d;
import fr.pcsoft.wdjava.ui.utils.C1511l;

@TargetApi(21)
/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetre.x */
class C1172x implements C1171d {
    /* renamed from: a */
    private int f3526a;
    /* renamed from: b */
    boolean f3527b;
    /* renamed from: c */
    private int f3528c;
    final WDFenetre this$0;

    private C1172x(WDFenetre wDFenetre) {
        this.this$0 = wDFenetre;
        this.f3528c = 0;
        this.f3526a = 0;
        this.f3527b = false;
    }

    C1172x(WDFenetre wDFenetre, C1159k c1159k) {
        this(wDFenetre);
    }

    /* renamed from: a */
    public void mo3433a() {
    }

    /* renamed from: a */
    public boolean mo3434a(View view, MotionEvent motionEvent) {
        if (this.this$0.wd == null) {
            return false;
        }
        int x = (int) motionEvent.getX();
        x = (int) motionEvent.getY();
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.f3526a = 0;
                this.f3527b = false;
                this.f3528c = (int) motionEvent.getRawY();
                return false;
            case 1:
            case 3:
                if (!this.this$0.wd.isShown() || this.this$0.wd.getHideOffset() <= 0) {
                    return false;
                }
                if (this.f3526a > 0) {
                    this.this$0.wd.hide();
                    return false;
                }
                this.this$0.wd.show();
                return false;
            case 2:
                int rawY = (int) motionEvent.getRawY();
                x = this.f3528c - rawY;
                if (!this.f3527b && Math.abs(x) >= C1511l.f4643q) {
                    this.f3527b = true;
                    x = 0;
                }
                if (!this.f3527b) {
                    return false;
                }
                this.f3528c = rawY;
                if (x >= 0 && (x <= 0 || !view.canScrollVertically(x))) {
                    return false;
                }
                this.f3526a = x;
                if (!this.this$0.wd.setHideOffset(x + this.this$0.wd.getHideOffset())) {
                    return false;
                }
                view.cancelPendingInputEvents();
                return true;
            default:
                return false;
        }
    }
}
