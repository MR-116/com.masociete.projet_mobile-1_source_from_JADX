package fr.pcsoft.wdjava.ui.champs.bouton;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

/* renamed from: fr.pcsoft.wdjava.ui.champs.bouton.h */
class C1134h implements Callback {
    final WDBouton this$0;

    C1134h(WDBouton wDBouton) {
        this.this$0 = wDBouton;
    }

    public void invalidateDrawable(Drawable drawable) {
        this.this$0.Kc.invalidate();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.this$0.Kc.scheduleDrawable(drawable, runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.this$0.Kc.unscheduleDrawable(drawable, runnable);
    }
}
