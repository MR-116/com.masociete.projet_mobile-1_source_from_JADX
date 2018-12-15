package fr.pcsoft.wdjava.ui.p069g;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;

/* renamed from: fr.pcsoft.wdjava.ui.g.f */
public class C1405f extends Animation {
    /* renamed from: a */
    private float f4166a;
    /* renamed from: b */
    private float f4167b;
    /* renamed from: c */
    private Camera f4168c;
    /* renamed from: d */
    private boolean f4169d;
    final C1203e this$0;

    public C1405f(C1203e c1203e) {
        this.this$0 = c1203e;
        setFillAfter(true);
    }

    protected void applyTransformation(float f, Transformation transformation) {
        this.this$0.mo3467c();
        double d = 3.141592653589793d * ((double) f);
        float f2 = (float) ((180.0d * d) / 3.141592653589793d);
        boolean z = (this.this$0.f3614d & 8) == 8;
        if (z) {
            f2 = -f2;
        }
        if (f >= 0.5f) {
            f2 = z ? f2 + 180.0f : f2 - 180.0f;
            if (!this.f4169d) {
                this.f4169d = true;
                if (this.this$0.f3613c instanceof ImageView) {
                    ((ImageView) this.this$0.f3613c).setImageDrawable(this.this$0.f3615e);
                }
                if (this.this$0.f3613c instanceof CompoundButton) {
                    ((CompoundButton) this.this$0.f3613c).setButtonDrawable(this.this$0.f3615e);
                } else if (this.this$0.f3613c instanceof ImageButton) {
                    ((ImageButton) this.this$0.f3613c).setImageDrawable(this.this$0.f3615e);
                } else {
                    this.this$0.f3613c.setBackgroundDrawable(this.this$0.f3615e);
                }
            }
        }
        Matrix matrix = transformation.getMatrix();
        this.f4168c.save();
        this.f4168c.translate(0.0f, 0.0f, (float) (Math.sin(d) * 150.0d));
        if ((this.this$0.f3614d & 1) == 1) {
            this.f4168c.rotateX(f2);
        }
        if ((this.this$0.f3614d & 2) == 2) {
            this.f4168c.rotateY(f2);
        }
        if ((this.this$0.f3614d & 4) == 4) {
            this.f4168c.rotateZ(f2);
        }
        this.f4168c.getMatrix(matrix);
        this.f4168c.restore();
        matrix.preTranslate(-this.f4166a, -this.f4167b);
        matrix.postTranslate(this.f4166a, this.f4167b);
    }

    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.f4169d = false;
        this.f4168c = new Camera();
        this.f4166a = (float) (i / 2);
        this.f4167b = (float) (i2 / 2);
    }
}
