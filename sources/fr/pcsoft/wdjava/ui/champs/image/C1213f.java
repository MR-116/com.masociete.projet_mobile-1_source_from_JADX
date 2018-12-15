package fr.pcsoft.wdjava.ui.champs.image;

import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: fr.pcsoft.wdjava.ui.champs.image.f */
class C1213f implements AnimationListener {
    final WDChampImage this$0;
    final Drawable val$drawable;
    final Animation val$nextAnimation;

    C1213f(WDChampImage wDChampImage, Drawable drawable, Animation animation) {
        this.this$0 = wDChampImage;
        this.val$drawable = drawable;
        this.val$nextAnimation = animation;
    }

    public void onAnimationEnd(Animation animation) {
        this.this$0.m1455b(this.val$drawable);
        this.this$0.od.startAnimation(this.val$nextAnimation);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
