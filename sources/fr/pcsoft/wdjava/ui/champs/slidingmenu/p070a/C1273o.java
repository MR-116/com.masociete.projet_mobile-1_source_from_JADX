package fr.pcsoft.wdjava.ui.champs.slidingmenu.p070a;

import android.view.animation.Interpolator;

/* renamed from: fr.pcsoft.wdjava.ui.champs.slidingmenu.a.o */
final class C1273o implements Interpolator {
    C1273o() {
    }

    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
    }
}
