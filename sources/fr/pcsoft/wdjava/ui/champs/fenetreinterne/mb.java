package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.annotation.TargetApi;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.support.v4.view.ViewPager.PageTransformer;
import android.view.View;

@TargetApi(11)
public class mb implements PageTransformer {
    /* renamed from: a */
    private final Matrix f3535a = new Matrix();
    /* renamed from: b */
    private final Camera f3536b = new Camera();
    /* renamed from: c */
    private final float[] f3537c = new float[2];
    final WDChampFenetreInterneExt this$0;

    public mb(WDChampFenetreInterneExt wDChampFenetreInterneExt) {
        this.this$0 = wDChampFenetreInterneExt;
    }

    /* renamed from: a */
    protected final float m8416a(float f, int i, int i2) {
        float f2 = 1.0f;
        this.f3535a.reset();
        this.f3536b.save();
        if (this.this$0.isBalayageVertical()) {
            this.f3536b.rotateX(Math.abs(f));
        } else {
            this.f3536b.rotateY(Math.abs(f));
        }
        this.f3536b.getMatrix(this.f3535a);
        this.f3536b.restore();
        this.f3535a.preTranslate(((float) (-i)) * 0.5f, ((float) (-i2)) * 0.5f);
        this.f3535a.postTranslate(((float) i) * 0.5f, ((float) i2) * 0.5f);
        this.f3537c[0] = (float) i;
        this.f3537c[1] = (float) i2;
        this.f3535a.mapPoints(this.f3537c);
        if (this.this$0.isBalayageVertical()) {
            float f3 = ((float) i2) - this.f3537c[1];
            if (f <= 0.0f) {
                f2 = -1.0f;
            }
            return f2 * f3;
        }
        f3 = ((float) i) - this.f3537c[0];
        if (f <= 0.0f) {
            f2 = -1.0f;
        }
        return f2 * f3;
    }

    public void transformPage(View view, float f) {
        if (f >= -1.0f && f <= 1.0f) {
            float abs = (f < 0.0f ? 30.0f : -30.0f) * Math.abs(f);
            float a = m8416a(abs, view.getWidth(), view.getHeight());
            if (this.this$0.isBalayageVertical()) {
                view.setTranslationY(a);
            } else {
                view.setTranslationX(a);
            }
            view.setPivotX(((float) view.getWidth()) * 0.5f);
            view.setPivotY(((float) view.getHeight()) * 0.5f);
            if (this.this$0.isBalayageVertical()) {
                view.setRotationX(abs);
            } else {
                view.setRotationY(abs);
            }
        }
    }
}
