package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.support.v4.view.ViewPager.PageTransformer;
import android.view.View;
import android.view.ViewGroup;
import fr.pcsoft.wdjava.ui.utils.C1511l;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetreinterne.z */
class C1194z implements PageTransformer {
    final WDChampFenetreInterneExt this$0;

    private C1194z(WDChampFenetreInterneExt wDChampFenetreInterneExt) {
        this.this$0 = wDChampFenetreInterneExt;
    }

    C1194z(WDChampFenetreInterneExt wDChampFenetreInterneExt, C1180g c1180g) {
        this(wDChampFenetreInterneExt);
    }

    public void transformPage(View view, float f) {
        if (f >= -1.0f && f <= 1.0f) {
            float abs = 1.0f - Math.abs(f);
            view.setCameraDistance((float) C1511l.m10532d(2000.0f, 2));
            if (((double) f) >= 0.5d || ((double) f) <= -0.5d) {
                view.setVisibility(4);
            } else {
                view.setVisibility(0);
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            float f2;
            if (this.this$0.isBalayageVertical()) {
                view.setTranslationY((float) (viewGroup.getScrollY() - view.getTop()));
                f2 = (f == 0.0f || f == 1.0f) ? 1.0f : abs;
                view.setScaleX(f2);
                view.setScaleY(f2);
                view.setRotationX(f > 0.0f ? (abs + 1.0f) * -180.0f : (abs + 1.0f) * 180.0f);
                return;
            }
            view.setTranslationX((float) (viewGroup.getScrollX() - view.getLeft()));
            f2 = (f == 0.0f || f == 1.0f) ? 1.0f : abs;
            view.setScaleX(f2);
            view.setScaleY(f2);
            view.setRotationY(f > 0.0f ? (abs + 1.0f) * -180.0f : (abs + 1.0f) * 180.0f);
        }
    }
}
