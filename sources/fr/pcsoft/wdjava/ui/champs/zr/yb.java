package fr.pcsoft.wdjava.ui.champs.zr;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.ViewGroup;
import fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer.AbstractRepetitionView;

class yb extends InsetDrawable {
    /* renamed from: a */
    private AbstractRepetitionView f3931a = null;

    public yb(Drawable drawable) {
        super(drawable, 0);
    }

    /* renamed from: a */
    public final void m9275a(AbstractRepetitionView abstractRepetitionView) {
        this.f3931a = abstractRepetitionView;
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        if (this.f3931a != null) {
            ViewGroup c = this.f3931a.mo3541c();
            i2 += c.getTop();
            i4 -= this.f3931a.getHeight() - c.getBottom();
        }
        super.setBounds(i, i2, i3, i4);
    }
}
