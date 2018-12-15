package fr.pcsoft.wdjava.ui.actionbar;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

/* renamed from: fr.pcsoft.wdjava.ui.actionbar.e */
class C1038e implements Callback {
    final WDActionBar this$0;

    C1038e(WDActionBar wDActionBar) {
        this.this$0 = wDActionBar;
    }

    public void invalidateDrawable(Drawable drawable) {
        this.this$0.n.setBackgroundDrawable(drawable);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }
}
