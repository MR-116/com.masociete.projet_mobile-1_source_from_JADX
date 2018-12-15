package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.annotation.TargetApi;
import android.support.v4.view.ViewPager.PageTransformer;
import android.view.View;

@TargetApi(14)
/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetreinterne.a */
class C1175a implements PageTransformer {
    private C1175a() {
    }

    C1175a(C1180g c1180g) {
        this();
    }

    public void transformPage(View view, float f) {
        if (f >= -1.0f && f <= 1.0f) {
            view.setAlpha(1.0f - Math.abs(f));
        }
    }
}
