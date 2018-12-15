package fr.pcsoft.wdjava.ui.champs.libelle;

import android.animation.FloatEvaluator;

/* renamed from: fr.pcsoft.wdjava.ui.champs.libelle.b */
class C1227b extends FloatEvaluator {
    /* renamed from: a */
    private boolean f3668a = false;
    final WDLibelle this$0;

    C1227b(WDLibelle wDLibelle) {
        this.this$0 = wDLibelle;
    }

    public Float evaluate(float f, Number number, Number number2) {
        if (f == 0.0f) {
            this.f3668a = false;
        }
        float floatValue = super.evaluate(f, number, number2).floatValue();
        if (((double) f) >= 0.5d) {
            floatValue = floatValue > 0.0f ? (180.0f - floatValue) * -1.0f : floatValue + 180.0f;
            if (!this.f3668a) {
                this.this$0.m1473c();
                this.f3668a = true;
            }
        }
        return Float.valueOf(floatValue);
    }
}
