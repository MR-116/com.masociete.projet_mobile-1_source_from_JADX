package fr.pcsoft.wdjava.ui.champs.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;

/* renamed from: fr.pcsoft.wdjava.ui.champs.image.k */
class C1218k extends C1217j {
    final WDChampImage this$0;

    C1218k(WDChampImage wDChampImage, Context context) {
        this.this$0 = wDChampImage;
        super(context);
    }

    /* renamed from: c */
    protected RectF mo3481c() {
        return new RectF((float) this.this$0.Ic, (float) this.this$0.Lc, (float) (this.this$0.Ic + this.this$0.Dc), (float) (this.this$0.Lc + this.this$0.Rc));
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.this$0.kc != null && this.this$0.kc.mo3379k() && !kb.m3965a(C0657a.JELLY_BEAN_MR2) && isHardwareAccelerated()) {
            C1014a.m7327b().mo3294c(this);
        }
    }

    protected void onDraw(Canvas canvas) {
        if (!this.this$0.onDrawInternal(canvas)) {
            if ((this.this$0.Ec & 256) > 0) {
                WDChampImage wDChampImage = this.this$0;
                wDChampImage.Ec &= -257;
                Drawable drawable = getDrawable();
                if (drawable instanceof BitmapDrawable) {
                    Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                    int height = bitmap.getHeight();
                    int width = bitmap.getWidth();
                    int maximumBitmapWidth = canvas.getMaximumBitmapWidth();
                    int maximumBitmapHeight = canvas.getMaximumBitmapHeight();
                    if (bitmap.getWidth() > maximumBitmapWidth || bitmap.getHeight() > maximumBitmapHeight) {
                        if (width > height) {
                            maximumBitmapHeight = (height * maximumBitmapWidth) / width;
                        } else {
                            maximumBitmapWidth = (width * maximumBitmapHeight) / height;
                        }
                        this.this$0.m1453a(new BitmapDrawable(this.this$0.od.getContext().getResources(), Bitmap.createScaledBitmap(bitmap, maximumBitmapWidth, maximumBitmapHeight, true)));
                        wDChampImage = this.this$0;
                        wDChampImage.Ec &= -257;
                    }
                }
            }
            super.onDraw(canvas);
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.this$0.Zb != null && !this.this$0.Zb.getTable().getRenderingMode().isDoubleBufferedRendering()) {
            if (i4 != i2 || i3 != i) {
                this.this$0.updateTailleChamp();
            }
        }
    }

    /* renamed from: r */
    protected RectF mo3482r() {
        return new RectF(0.0f, 0.0f, (float) this.this$0.Pc, (float) this.this$0.ed);
    }
}
