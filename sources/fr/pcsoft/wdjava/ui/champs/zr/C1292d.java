package fr.pcsoft.wdjava.ui.champs.zr;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import fr.pcsoft.wdjava.ui.p069g.C1402b;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.d */
class C1292d extends AnimatorListenerAdapter {
    final WDZoneRepetee this$0;
    final int val$nFinalIndex;

    C1292d(WDZoneRepetee wDZoneRepetee, int i) {
        this.this$0 = wDZoneRepetee;
        this.val$nFinalIndex = i;
    }

    public void onAnimationEnd(Animator animator) {
        if ((animator instanceof C1402b) && !((C1402b) animator).mo3768a()) {
            this.this$0.supprimerElementA(this.val$nFinalIndex, false);
        }
    }
}
