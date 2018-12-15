package fr.pcsoft.wdjava.ui.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;

public class ab extends BitmapDrawable {
    /* renamed from: a */
    protected Rect f3494a = null;

    public ab(Bitmap bitmap) {
        super(bitmap);
        this.f3494a = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
    }

    /* renamed from: a */
    public void m8299a(int i, int i2, int i3, int i4) {
        if (i <= i3 && i2 <= i4 && i3 - i <= getBitmap().getWidth() && i4 - i2 <= getBitmap().getHeight()) {
            setBounds(0, 0, i3 - i, i4 - i2);
            this.f3494a.set(i, i2, i3, i4);
        }
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(getBitmap(), this.f3494a, getBounds(), null);
    }

    public int getIntrinsicHeight() {
        return this.f3494a.bottom - this.f3494a.top;
    }

    public int getIntrinsicWidth() {
        return this.f3494a.right - this.f3494a.top;
    }
}
