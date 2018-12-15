package fr.pcsoft.wdjava.ui.champs.saisie;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView.BufferType;
import fr.pcsoft.wdjava.ui.cadre.C1113c;
import fr.pcsoft.wdjava.ui.champs.zr.bb;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.utils.C1503b;

/* renamed from: fr.pcsoft.wdjava.ui.champs.saisie.b */
class C1251b extends EditText {
    /* renamed from: a */
    private boolean f3678a = false;
    final C0517i this$0;

    C1251b(C0517i c0517i, Context context) {
        this.this$0 = c0517i;
        super(context);
    }

    public void draw(Canvas canvas) {
        if (!(C1031a.m7473q(this.this$0.L) || !(this.this$0.Oc instanceof C1113c) || (getBackground() instanceof ColorDrawable))) {
            int s = ((C1113c) this.this$0.Oc).m8143s();
            if (s != 0) {
                canvas.save(2);
                int scrollX = getScrollX() + s;
                int scrollY = getScrollY() + s;
                canvas.clipRect(scrollX, scrollY, (getWidth() + scrollX) - (s * 2), (getHeight() + scrollY) - (s * 2));
                canvas.drawColor(C1031a.m7467k(this.this$0.L));
                canvas.restore();
            } else {
                canvas.drawColor(C1031a.m7467k(this.this$0.L));
            }
        }
        super.draw(canvas);
    }

    public boolean onCheckIsTextEditor() {
        return this.this$0.m1428e() ? super.onCheckIsTextEditor() : false;
    }

    protected void onCreateContextMenu(ContextMenu contextMenu) {
        if (this.this$0.mc) {
            super.onCreateContextMenu(contextMenu);
        }
    }

    protected void onDraw(Canvas canvas) {
        if (getBackground() == null && this.this$0.Oc != null) {
            this.this$0.Oc.mo3373b(canvas, (View) this, null);
        }
        super.onDraw(canvas);
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.f3678a = false;
    }

    protected void onFocusChanged(boolean z, int i, Rect rect) {
        if (!this.this$0.isReleased()) {
            if (this.f3678a) {
                super.onFocusChanged(z, i, rect);
                return;
            }
            if (this.this$0.m1428e()) {
                if (z) {
                    this.this$0.m1431h();
                } else {
                    this.this$0.m1429f();
                }
                this.this$0.m1432i();
                if (this.this$0.getChampParent(bb.class) != null) {
                    if (z && this.this$0.nd && this.this$0._getEtat() == 0) {
                        this.this$0.Yc.selectAll();
                    }
                    this.this$0.Yc.dispatchWindowFocusChanged(z);
                }
            } else {
                C1503b.m10425a();
            }
            super.onFocusChanged(z, i, rect);
        }
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (this.this$0.ld && i == 4) {
            clearFocus();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.f3678a = true;
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        boolean z = this.this$0.hd;
        this.this$0.hd = true;
        try {
            if (charSequence.equals("") && !this.this$0.ad && (this.this$0.Ec == 1 || this.this$0.Ec == 4 || this.this$0.Ec == 7)) {
                charSequence = " ";
            }
            super.setText(charSequence, bufferType);
        } finally {
            this.this$0.hd = z;
        }
    }
}
