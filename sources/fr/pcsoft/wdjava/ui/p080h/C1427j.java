package fr.pcsoft.wdjava.ui.p080h;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* renamed from: fr.pcsoft.wdjava.ui.h.j */
public final class C1427j extends ImageSpan {
    /* renamed from: a */
    private WeakReference<Drawable> f4238a;

    public C1427j(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: a */
    private Drawable m10045a() {
        WeakReference weakReference = this.f4238a;
        Drawable drawable = null;
        if (weakReference != null) {
            drawable = (Drawable) weakReference.get();
        }
        if (drawable != null) {
            return drawable;
        }
        drawable = getDrawable();
        this.f4238a = new WeakReference(drawable);
        return drawable;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable a = m10045a();
        canvas.save();
        FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        canvas.translate(f, (float) Math.abs(fontMetricsInt.top - fontMetricsInt.ascent));
        a.draw(canvas);
        canvas.restore();
    }
}
