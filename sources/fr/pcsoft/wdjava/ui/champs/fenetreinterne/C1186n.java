package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.annotation.TargetApi;
import android.support.v4.view.ViewPager.PageTransformer;
import android.view.View;

@TargetApi(11)
/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetreinterne.n */
public class C1186n implements PageTransformer {
    final WDChampFenetreInterneExt this$0;

    public C1186n(WDChampFenetreInterneExt wDChampFenetreInterneExt) {
        this.this$0 = wDChampFenetreInterneExt;
    }

    public void transformPage(View view, float f) {
        float f2 = 0.0f;
        if (f >= -1.0f && f <= 1.0f) {
            if (this.this$0.isBalayageVertical()) {
                if (f <= 0.0f) {
                    f2 = (float) view.getHeight();
                }
                view.setPivotY(f2);
                view.setPivotX(((float) view.getWidth()) * 0.5f);
                view.setRotationX(-90.0f * f);
                return;
            }
            if (f < 0.0f) {
                f2 = (float) view.getWidth();
            }
            view.setPivotX(f2);
            view.setPivotY(((float) view.getHeight()) * 0.5f);
            view.setRotationY(90.0f * f);
        }
    }
}
