package fr.pcsoft.wdjava.ui.champs.image;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.ui.utils.C1219s;
import fr.pcsoft.wdjava.ui.utils.C1511l;

/* renamed from: fr.pcsoft.wdjava.ui.champs.image.l */
final class C1220l extends C1219s {
    /* renamed from: b */
    Drawable f3646b = WDAppManager.m2569b().getDrawable(17301599);

    C1220l() {
    }

    /* renamed from: a */
    public final void m8604a(Canvas canvas, int i, int i2) {
        if (this.f3646b != null) {
            int i3 = C1511l.f4645s;
            int intrinsicWidth = this.f3646b.getIntrinsicWidth() + (i3 * 2);
            int intrinsicHeight = this.f3646b.getIntrinsicHeight() + (i3 * 2);
            if (intrinsicWidth <= i && intrinsicHeight <= i2) {
                int i4 = (i - intrinsicWidth) / 2;
                int i5 = (i2 - intrinsicHeight) / 2;
                m8603a(canvas, i4, i5, intrinsicWidth, intrinsicHeight);
                int i6 = i4 + i3;
                int i7 = i5 + i3;
                this.f3646b.setBounds(i6, i7, this.f3646b.getIntrinsicWidth() + i6, this.f3646b.getIntrinsicHeight() + i7);
                this.f3646b.draw(canvas);
            }
        }
    }
}
