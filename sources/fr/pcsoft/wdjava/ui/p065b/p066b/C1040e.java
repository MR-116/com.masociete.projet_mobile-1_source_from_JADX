package fr.pcsoft.wdjava.ui.p065b.p066b;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: fr.pcsoft.wdjava.ui.b.b.e */
public class C1040e extends Drawable {
    /* renamed from: a */
    private Drawable f3000a;
    /* renamed from: b */
    private boolean f3001b;

    public C1040e(Drawable drawable) {
        this.f3000a = drawable;
    }

    /* renamed from: a */
    public Drawable m7532a() {
        return this.f3000a;
    }

    /* renamed from: a */
    public void m7533a(Drawable drawable) {
        if (drawable != this) {
            this.f3000a = drawable;
        }
    }

    public void draw(Canvas canvas) {
        if (this.f3000a != null) {
            this.f3000a.draw(canvas);
        }
    }

    public int getIntrinsicHeight() {
        return this.f3000a != null ? this.f3000a.getIntrinsicHeight() : -1;
    }

    public int getIntrinsicWidth() {
        return this.f3000a != null ? this.f3000a.getIntrinsicWidth() : -1;
    }

    public int getOpacity() {
        return this.f3000a != null ? this.f3000a.getOpacity() : -2;
    }

    public Drawable mutate() {
        if (!(this.f3000a == null || this.f3001b || super.mutate() != this)) {
            this.f3000a.mutate();
            this.f3001b = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        if (this.f3000a != null) {
            this.f3000a.setBounds(rect);
        }
    }

    public void setAlpha(int i) {
        if (this.f3000a != null) {
            this.f3000a.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f3000a != null) {
            this.f3000a.setColorFilter(colorFilter);
        }
    }

    public void setDither(boolean z) {
        if (this.f3000a != null) {
            this.f3000a.setDither(z);
        }
    }

    public void setFilterBitmap(boolean z) {
        if (this.f3000a != null) {
            this.f3000a.setFilterBitmap(z);
        }
    }

    @TargetApi(21)
    public void setTint(int i) {
        if (this.f3000a != null) {
            this.f3000a.setTint(i);
        }
    }
}
