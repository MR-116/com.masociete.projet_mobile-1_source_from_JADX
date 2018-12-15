package fr.pcsoft.wdjava.ui.p080h;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* renamed from: fr.pcsoft.wdjava.ui.h.d */
public final class C1422d extends TypefaceSpan {
    /* renamed from: a */
    private final Typeface f4202a;

    public C1422d(Typeface typeface) {
        super("");
        this.f4202a = typeface;
    }

    /* renamed from: a */
    private final void m10029a(Paint paint, Typeface typeface) {
        Typeface typeface2 = paint.getTypeface();
        int style = (typeface2 == null ? 0 : typeface2.getStyle()) & (typeface.getStyle() ^ -1);
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }

    public void updateDrawState(TextPaint textPaint) {
        m10029a(textPaint, this.f4202a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        m10029a(textPaint, this.f4202a);
    }
}
