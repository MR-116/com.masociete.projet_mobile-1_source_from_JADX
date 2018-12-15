package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.annotation.TargetApi;
import android.support.v4.view.ViewPager.PageTransformer;
import android.view.View;

@TargetApi(11)
/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetreinterne.h */
public class C1181h implements PageTransformer {
    /* renamed from: a */
    private static final float f3534a = 0.25f;
    final WDChampFenetreInterneExt this$0;

    public C1181h(WDChampFenetreInterneExt wDChampFenetreInterneExt) {
        this.this$0 = wDChampFenetreInterneExt;
    }

    public void transformPage(View view, float f) {
        if (f >= -1.0f || f <= 1.0f) {
            float height = (float) view.getHeight();
            float width = (float) view.getWidth();
            float max = Math.max(f3534a, 1.0f - Math.abs(f));
            view.setPivotX(0.5f * width);
            view.setPivotY(0.5f * height);
            height = (height * (1.0f - max)) / 2.0f;
            width = (width * (1.0f - max)) / 2.0f;
            if (this.this$0.isBalayageVertical()) {
                if (f < 0.0f) {
                    view.setTranslationY(height - (width / 2.0f));
                } else {
                    view.setTranslationY((-height) + (width / 2.0f));
                }
            } else if (f < 0.0f) {
                view.setTranslationX(width - (height / 2.0f));
            } else {
                view.setTranslationX((height / 2.0f) + (-width));
            }
            view.setScaleX(max);
            view.setScaleY(max);
        }
    }
}
