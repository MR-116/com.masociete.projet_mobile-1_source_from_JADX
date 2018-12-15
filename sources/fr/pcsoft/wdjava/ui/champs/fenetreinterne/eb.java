package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.support.v4.view.ViewPager.PageTransformer;
import android.view.View;

class eb implements PageTransformer {
    final WDChampFenetreInterneExt this$0;

    private eb(WDChampFenetreInterneExt wDChampFenetreInterneExt) {
        this.this$0 = wDChampFenetreInterneExt;
    }

    eb(WDChampFenetreInterneExt wDChampFenetreInterneExt, C1180g c1180g) {
        this(wDChampFenetreInterneExt);
    }

    public void transformPage(View view, float f) {
        float f2 = 0.0f;
        if (f >= -1.0f && f <= 1.0f) {
            if (this.this$0.isBalayageVertical()) {
                if (f >= 0.0f) {
                    f2 = ((float) (-view.getHeight())) * f;
                }
                view.setTranslationY(f2);
                return;
            }
            if (f >= 0.0f) {
                f2 = ((float) (-view.getWidth())) * f;
            }
            view.setTranslationX(f2);
        }
    }
}
