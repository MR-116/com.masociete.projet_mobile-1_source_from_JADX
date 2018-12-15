package fr.pcsoft.wdjava.ui.champs.bouton;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import fr.pcsoft.wdjava.ui.cadre.C1110m;
import fr.pcsoft.wdjava.ui.p065b.C1094e;
import fr.pcsoft.wdjava.ui.p065b.p066b.C1085a;
import fr.pcsoft.wdjava.ui.utils.C1503b;

/* renamed from: fr.pcsoft.wdjava.ui.champs.bouton.b */
class C1127b extends Button {
    final WDBouton this$0;

    C1127b(WDBouton wDBouton, Context context) {
        this.this$0 = wDBouton;
        super(context);
    }

    /* renamed from: a */
    private void m8270a() {
        boolean z = false;
        if (this.this$0.Ic != null) {
            boolean state = this.this$0.Ic.setState(getDrawableState());
            Drawable current = this.this$0.Ic instanceof StateListDrawable ? this.this$0.Ic.getCurrent() : this.this$0.Ic;
            if (current instanceof AnimationDrawable) {
                this.this$0.Oc = this.this$0.calculerEtatInterne(this.this$0._getEtat());
                ((C1085a) current).m7897a(false);
                ((C1085a) current).m7896a(null);
                ((AnimationDrawable) current).start();
                state = false;
            }
            z = state;
        } else if (getBackground() == null && this.this$0.Mc != null) {
            z = true;
        }
        if (z && this.this$0.Kc != null) {
            this.this$0.Kc.invalidate();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m8271a(android.graphics.Canvas r13, android.graphics.drawable.Drawable r14, int r15) {
        /*
        r12 = this;
        r2 = r12.getCompoundPaddingLeft();
        r1 = r12.getCompoundPaddingTop();
        r0 = r12.getCompoundPaddingRight();
        r3 = r12.getCompoundPaddingBottom();
        r4 = r12.getScrollX();
        r5 = r12.getScrollY();
        r6 = r12.getRight();
        r7 = r12.getLeft();
        r8 = r12.getBottom();
        r9 = r12.getTop();
        r10 = r8 - r9;
        r3 = r10 - r3;
        r3 = r3 - r1;
        r10 = r6 - r7;
        r0 = r10 - r0;
        r10 = r0 - r2;
        r0 = r12.this$0;
        r0 = r0.S;
        if (r0 == 0) goto L_0x0049;
    L_0x003b:
        r0 = r12.this$0;
        r0 = r0.Xc;
        r11 = "";
        r0 = r0.equals(r11);
        if (r0 == 0) goto L_0x0085;
    L_0x0049:
        r0 = 1;
    L_0x004a:
        if (r0 == 0) goto L_0x004d;
    L_0x004c:
        r15 = 4;
    L_0x004d:
        r13.save();
        switch(r15) {
            case 1: goto L_0x0087;
            case 2: goto L_0x0053;
            case 3: goto L_0x0105;
            case 4: goto L_0x0053;
            case 5: goto L_0x011f;
            case 6: goto L_0x0053;
            case 7: goto L_0x00a6;
            default: goto L_0x0053;
        };
    L_0x0053:
        r6 = r12.this$0;	 Catch:{ all -> 0x00a1 }
        r6 = r6.Gc;	 Catch:{ all -> 0x00a1 }
        if (r6 == 0) goto L_0x016b;
    L_0x005b:
        if (r0 == 0) goto L_0x0145;
    L_0x005d:
        r0 = r14.getBounds();	 Catch:{ all -> 0x00a1 }
        r0 = r0.width();	 Catch:{ all -> 0x00a1 }
    L_0x0065:
        r2 = r2 + r4;
        r0 = r10 - r0;
        r0 = r0 / 2;
        r0 = r0 + r2;
        r0 = (float) r0;	 Catch:{ all -> 0x00a1 }
        r1 = r1 + r5;
        r2 = r14.getBounds();	 Catch:{ all -> 0x00a1 }
        r2 = r2.height();	 Catch:{ all -> 0x00a1 }
        r2 = r3 - r2;
        r2 = r2 / 2;
        r1 = r1 + r2;
        r1 = (float) r1;	 Catch:{ all -> 0x00a1 }
        r13.translate(r0, r1);	 Catch:{ all -> 0x00a1 }
    L_0x007e:
        r14.draw(r13);	 Catch:{ all -> 0x00a1 }
        r13.restore();
        return;
    L_0x0085:
        r0 = 0;
        goto L_0x004a;
    L_0x0087:
        r0 = r4 + r2;
        r1 = r14.getBounds();	 Catch:{ all -> 0x00a1 }
        r1 = r1.width();	 Catch:{ all -> 0x00a1 }
        r1 = r10 - r1;
        r1 = r1 / 2;
        r0 = r0 + r1;
        r0 = (float) r0;	 Catch:{ all -> 0x00a1 }
        r1 = r12.getPaddingTop();	 Catch:{ all -> 0x00a1 }
        r1 = r1 + r5;
        r1 = (float) r1;	 Catch:{ all -> 0x00a1 }
        r13.translate(r0, r1);	 Catch:{ all -> 0x00a1 }
        goto L_0x007e;
    L_0x00a1:
        r0 = move-exception;
        r13.restore();
        throw r0;
    L_0x00a6:
        r0 = r8 - r9;
        r1 = r12.getPaddingBottom();	 Catch:{ all -> 0x00a1 }
        r0 = r0 - r1;
        r1 = r14.getBounds();	 Catch:{ all -> 0x00a1 }
        r1 = r1.height();	 Catch:{ all -> 0x00a1 }
        r1 = r0 - r1;
        r6 = r12.getLayout();	 Catch:{ all -> 0x00a1 }
        if (r6 == 0) goto L_0x0103;
    L_0x00bd:
        r0 = r6.getLineCount();	 Catch:{ all -> 0x00a1 }
    L_0x00c1:
        if (r0 <= 0) goto L_0x018f;
    L_0x00c3:
        r0 = r12.getPaddingTop();	 Catch:{ all -> 0x00a1 }
        r7 = r6.getLineCount();	 Catch:{ all -> 0x00a1 }
        r7 = r7 + -1;
        r6 = r6.getLineBottom(r7);	 Catch:{ all -> 0x00a1 }
        r0 = r0 + r6;
        r6 = fr.pcsoft.wdjava.ui.champs.bouton.WDBouton.Uc;	 Catch:{ all -> 0x00a1 }
        r0 = r0 + r6;
        r6 = r12.getCompoundPaddingTop();	 Catch:{ all -> 0x00a1 }
        r6 = r6 + r0;
        r0 = r3 - r0;
        r3 = r14.getBounds();	 Catch:{ all -> 0x00a1 }
        r3 = r3.height();	 Catch:{ all -> 0x00a1 }
        r0 = r0 - r3;
        r0 = r0 / 2;
        r0 = r0 + r6;
        if (r0 >= r1) goto L_0x018f;
    L_0x00ec:
        r1 = r4 + r2;
        r2 = r14.getBounds();	 Catch:{ all -> 0x00a1 }
        r2 = r2.width();	 Catch:{ all -> 0x00a1 }
        r2 = r10 - r2;
        r2 = r2 / 2;
        r1 = r1 + r2;
        r1 = (float) r1;	 Catch:{ all -> 0x00a1 }
        r0 = r0 + r5;
        r0 = (float) r0;	 Catch:{ all -> 0x00a1 }
        r13.translate(r1, r0);	 Catch:{ all -> 0x00a1 }
        goto L_0x007e;
    L_0x0103:
        r0 = 0;
        goto L_0x00c1;
    L_0x0105:
        r0 = r12.getPaddingLeft();	 Catch:{ all -> 0x00a1 }
        r0 = r0 + r4;
        r0 = (float) r0;	 Catch:{ all -> 0x00a1 }
        r1 = r1 + r5;
        r2 = r14.getBounds();	 Catch:{ all -> 0x00a1 }
        r2 = r2.height();	 Catch:{ all -> 0x00a1 }
        r2 = r3 - r2;
        r2 = r2 / 2;
        r1 = r1 + r2;
        r1 = (float) r1;	 Catch:{ all -> 0x00a1 }
        r13.translate(r0, r1);	 Catch:{ all -> 0x00a1 }
        goto L_0x007e;
    L_0x011f:
        r0 = r4 + r6;
        r0 = r0 - r7;
        r2 = r12.getPaddingRight();	 Catch:{ all -> 0x00a1 }
        r0 = r0 - r2;
        r2 = r14.getBounds();	 Catch:{ all -> 0x00a1 }
        r2 = r2.width();	 Catch:{ all -> 0x00a1 }
        r0 = r0 - r2;
        r0 = (float) r0;	 Catch:{ all -> 0x00a1 }
        r1 = r1 + r5;
        r2 = r14.getBounds();	 Catch:{ all -> 0x00a1 }
        r2 = r2.height();	 Catch:{ all -> 0x00a1 }
        r2 = r3 - r2;
        r2 = r2 / 2;
        r1 = r1 + r2;
        r1 = (float) r1;	 Catch:{ all -> 0x00a1 }
        r13.translate(r0, r1);	 Catch:{ all -> 0x00a1 }
        goto L_0x007e;
    L_0x0145:
        r0 = r12.getPaint();	 Catch:{ all -> 0x00a1 }
        r6 = r12.getText();	 Catch:{ all -> 0x00a1 }
        r6 = r6.toString();	 Catch:{ all -> 0x00a1 }
        r0 = r0.measureText(r6);	 Catch:{ all -> 0x00a1 }
        r6 = (double) r0;	 Catch:{ all -> 0x00a1 }
        r6 = java.lang.Math.ceil(r6);	 Catch:{ all -> 0x00a1 }
        r0 = (int) r6;	 Catch:{ all -> 0x00a1 }
        r6 = fr.pcsoft.wdjava.ui.champs.bouton.WDBouton.Ec;	 Catch:{ all -> 0x00a1 }
        r0 = r0 + r6;
        r6 = r14.getBounds();	 Catch:{ all -> 0x00a1 }
        r6 = r6.width();	 Catch:{ all -> 0x00a1 }
        r0 = r0 + r6;
        goto L_0x0065;
    L_0x016b:
        r0 = r4 + r2;
        r2 = r14.getBounds();	 Catch:{ all -> 0x00a1 }
        r2 = r2.width();	 Catch:{ all -> 0x00a1 }
        r2 = r10 - r2;
        r2 = r2 / 2;
        r0 = r0 + r2;
        r0 = (float) r0;	 Catch:{ all -> 0x00a1 }
        r1 = r1 + r5;
        r2 = r14.getBounds();	 Catch:{ all -> 0x00a1 }
        r2 = r2.height();	 Catch:{ all -> 0x00a1 }
        r2 = r3 - r2;
        r2 = r2 / 2;
        r1 = r1 + r2;
        r1 = (float) r1;	 Catch:{ all -> 0x00a1 }
        r13.translate(r0, r1);	 Catch:{ all -> 0x00a1 }
        goto L_0x007e;
    L_0x018f:
        r0 = r1;
        goto L_0x00ec;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.bouton.b.a(android.graphics.Canvas, android.graphics.drawable.Drawable, int):void");
    }

    /* renamed from: a */
    private void m8272a(C1085a c1085a) {
        c1085a.m7896a(new C1132f(this));
        c1085a.m7897a(true);
        c1085a.start();
    }

    static void access$800(C1127b c1127b, C1085a c1085a) {
        c1127b.m8272a(c1085a);
    }

    static void access$900(C1127b c1127b) {
        c1127b.m8270a();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.this$0._getEtat() == 1 ? false : super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.this$0._getEtat() == 1 ? false : super.dispatchTouchEvent(motionEvent);
    }

    public void draw(Canvas canvas) {
        C1110m access$1600 = this.this$0.kc;
        if ((isPressed() || this.this$0.Sc) && this.this$0.Mc != null) {
            access$1600 = this.this$0.Mc;
        }
        if (!(getBackground() == null || r0 == null || r0.mo3379k())) {
            access$1600 = null;
        }
        if (access$1600 != null) {
            if (this.this$0.yc != null) {
                this.this$0.yc.rewind();
            }
            access$1600.mo3370a(canvas, (View) this, this.this$0.yc);
        }
        if (this.this$0.yc != null) {
            canvas.save(2);
            canvas.clipPath(this.this$0.yc);
            super.draw(canvas);
            canvas.restore();
        } else {
            super.draw(canvas);
        }
        if (access$1600 != null) {
            access$1600.mo3369a(canvas, (View) this);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.this$0.Ic != null) {
            Drawable current = this.this$0.Ic instanceof StateListDrawable ? this.this$0.Ic.getCurrent() : this.this$0.Ic;
            if (current instanceof C1085a) {
                int calculerEtatInterne = this.this$0.calculerEtatInterne(this.this$0._getEtat());
                if (calculerEtatInterne != this.this$0.Oc) {
                    this.this$0.Oc = calculerEtatInterne;
                    C1085a c1085a = (C1085a) current;
                    if (c1085a.m7900d() || !c1085a.isOneShot() || calculerEtatInterne == 3) {
                        c1085a.m7896a(null);
                        c1085a.stop();
                        m8270a();
                        return;
                    } else if (c1085a.isRunning()) {
                        if (!c1085a.m7901e() && c1085a.m7898b() == null) {
                            c1085a.m7896a(new C1131e(this));
                            return;
                        }
                        return;
                    } else if (c1085a.m7901e()) {
                        m8270a();
                        return;
                    } else {
                        m8272a(c1085a);
                        return;
                    }
                }
                return;
            }
            m8270a();
            return;
        }
        m8270a();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (((this.this$0.kc != null && this.this$0.kc.mo3379k()) || (this.this$0.Mc != null && this.this$0.Mc.mo3379k())) && !kb.m3965a(C0657a.JELLY_BEAN_MR2) && isHardwareAccelerated()) {
            C1014a.m7327b().mo3294c(this);
        }
        if (kb.m3965a(C0657a.LOLLIPOP) && this.this$0.isMaterialDesign()) {
            this.this$0.Kc.setStateListAnimator(null);
        }
    }

    protected int[] onCreateDrawableState(int i) {
        return (this.this$0.Lc && this.this$0.Sc && isEnabled()) ? Button.PRESSED_ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET : super.onCreateDrawableState(i);
    }

    protected void onDraw(Canvas canvas) {
        int i = 1;
        if (this.this$0.Ic != null) {
            byte a = C1094e.m7936a(this.this$0.Pc, 16);
            m8271a(canvas, this.this$0.Ic, a);
            if (a != (byte) 3 && a != (byte) 5) {
                if (this.this$0.Gc) {
                    i = (this.this$0.Ic.getBounds().width() / 2) + WDBouton.Ec;
                }
                i = 0;
            } else if ((this.this$0.Kc.getGravity() & 7) == 1) {
                int width = this.this$0.Ic.getBounds().width() / 2;
                if (a == (byte) 5) {
                    i = -1;
                }
                i *= width;
            } else if ((this.this$0.Kc.getGravity() & 7) == 3 && a == (byte) 3) {
                i = this.this$0.Ic.getBounds().width() + 3;
            } else {
                if ((this.this$0.Kc.getGravity() & 7) == 5 && a == (byte) 5) {
                    i = -(this.this$0.Ic.getBounds().width() + 3);
                }
                i = 0;
            }
            if (i != 0) {
                canvas.save();
                try {
                    canvas.translate((float) i, 0.0f);
                    super.onDraw(canvas);
                    return;
                } finally {
                    canvas.restore();
                }
            } else {
                super.onDraw(canvas);
                return;
            }
        }
        super.onDraw(canvas);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.this$0.m1526d()) {
            this.this$0.m1523a();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (!this.this$0.m1526d() || C1503b.m10437a((int) motionEvent.getX(), (int) motionEvent.getY(), (View) this)) ? super.onTouchEvent(motionEvent) : false;
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.this$0.Ic;
    }
}
