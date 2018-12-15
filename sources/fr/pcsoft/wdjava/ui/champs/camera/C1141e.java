package fr.pcsoft.wdjava.ui.champs.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.support.v4.internal.view.SupportMenu;
import android.view.View;
import fr.pcsoft.wdjava.ui.utils.C1511l;

/* renamed from: fr.pcsoft.wdjava.ui.champs.camera.e */
final class C1141e extends View {
    /* renamed from: a */
    private final Paint f3496a = new Paint();
    final WDChampCamera this$0;

    public C1141e(WDChampCamera wDChampCamera, Context context) {
        this.this$0 = wDChampCamera;
        super(context);
        this.f3496a.setStrokeJoin(Join.MITER);
        this.f3496a.setStrokeCap(Cap.SQUARE);
        this.f3496a.setStrokeWidth((float) C1511l.f4641o);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect decodeFrameRect = this.this$0.getDecodeFrameRect();
        if (decodeFrameRect != null) {
            if (this.this$0.Nc == 3) {
                int width = getWidth();
                int height = getHeight();
                this.f3496a.setStyle(Style.FILL);
                this.f3496a.setColor(1610612736);
                canvas.drawRect(0.0f, 0.0f, (float) width, (float) decodeFrameRect.top, this.f3496a);
                canvas.drawRect(0.0f, (float) decodeFrameRect.top, (float) decodeFrameRect.left, (float) (decodeFrameRect.bottom + 1), this.f3496a);
                canvas.drawRect((float) (decodeFrameRect.right + 1), (float) decodeFrameRect.top, (float) width, (float) (decodeFrameRect.bottom + 1), this.f3496a);
                canvas.drawRect(0.0f, (float) (decodeFrameRect.bottom + 1), (float) width, (float) height, this.f3496a);
            }
            this.f3496a.setStyle(Style.STROKE);
            this.f3496a.setColor(SupportMenu.CATEGORY_MASK);
            int d = C1511l.m10532d(15.0f, 2);
            canvas.drawLine((float) decodeFrameRect.left, (float) decodeFrameRect.top, (float) (decodeFrameRect.left + d), (float) decodeFrameRect.top, this.f3496a);
            canvas.drawLine((float) decodeFrameRect.left, (float) decodeFrameRect.top, (float) decodeFrameRect.left, (float) (decodeFrameRect.top + d), this.f3496a);
            canvas.drawLine((float) (decodeFrameRect.right - d), (float) decodeFrameRect.top, (float) decodeFrameRect.right, (float) decodeFrameRect.top, this.f3496a);
            canvas.drawLine((float) decodeFrameRect.right, (float) decodeFrameRect.top, (float) decodeFrameRect.right, (float) (decodeFrameRect.top + d), this.f3496a);
            canvas.drawLine((float) decodeFrameRect.left, (float) decodeFrameRect.bottom, (float) (decodeFrameRect.left + d), (float) decodeFrameRect.bottom, this.f3496a);
            canvas.drawLine((float) decodeFrameRect.left, (float) (decodeFrameRect.bottom - d), (float) decodeFrameRect.left, (float) decodeFrameRect.bottom, this.f3496a);
            canvas.drawLine((float) (decodeFrameRect.right - d), (float) decodeFrameRect.bottom, (float) decodeFrameRect.right, (float) decodeFrameRect.bottom, this.f3496a);
            canvas.drawLine((float) decodeFrameRect.right, (float) (decodeFrameRect.bottom - d), (float) decodeFrameRect.right, (float) decodeFrameRect.bottom, this.f3496a);
        }
    }
}
