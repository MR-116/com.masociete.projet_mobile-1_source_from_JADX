package fr.pcsoft.wdjava.ui.champs;

import android.view.ViewTreeObserver.OnPreDrawListener;

class yc implements OnPreDrawListener {
    final hc this$0;

    yc(hc hcVar) {
        this.this$0 = hcVar;
    }

    public boolean onPreDraw() {
        if (!this.this$0.isReleased()) {
            this.this$0.Ac.setPadding(this.this$0.Ac.getPaddingLeft(), this.this$0.getCompPrincipal().getPaddingTop(), this.this$0.Ac.getPaddingRight(), this.this$0.getCompPrincipal().getPaddingBottom());
            this.this$0.getCompPrincipal().getViewTreeObserver().removeOnPreDrawListener(this);
        }
        return true;
    }
}
