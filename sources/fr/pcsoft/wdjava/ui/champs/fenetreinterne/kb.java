package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.view.animation.Interpolator;

final class kb implements Interpolator {
    kb() {
    }

    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
    }
}
