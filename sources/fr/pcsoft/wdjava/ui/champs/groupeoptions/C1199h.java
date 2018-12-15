package fr.pcsoft.wdjava.ui.champs.groupeoptions;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.RadioButton;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.ui.utils.C1511l;

/* renamed from: fr.pcsoft.wdjava.ui.champs.groupeoptions.h */
final class C1199h extends RadioButton implements C1198q {
    final WDBoutonRadio this$0;

    public C1199h(WDBoutonRadio wDBoutonRadio, Context context) {
        this.this$0 = wDBoutonRadio;
        super(context);
        setBackgroundDrawable(null);
    }

    /* renamed from: a */
    public void mo3463a(Canvas canvas) {
        super.onDraw(canvas);
    }

    /* renamed from: a */
    public void mo3464a(boolean z) {
        super.setChecked(z);
    }

    /* renamed from: a */
    public boolean mo3465a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: a */
    public boolean mo3466a(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.this$0.dispatchKeyEventEx(this, keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.this$0.dispatchTouchEventEx(this, motionEvent);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return (kb.m3965a(C0657a.JELLY_BEAN) && this.this$0.m.isUseCustomImageForOptions() && !this.this$0.m.isCocheADroite()) ? compoundPaddingLeft + C1511l.f4645s : compoundPaddingLeft;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.this$0.n && this.this$0.i != null) {
            this.this$0.i.m8540c();
        }
    }

    protected void onDraw(Canvas canvas) {
        this.this$0.onDrawEx(this, canvas);
    }

    public void setChecked(boolean z) {
        this.this$0.setCheckedEx(this, z);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (isChecked() && i == 4 && this.this$0.m.getCompPrincipal().getVisibility() == 0) {
            this.this$0.m.selectionnerOptionSuivante();
        }
    }
}
