package fr.pcsoft.wdjava.ui.champs.groupeoptions;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: fr.pcsoft.wdjava.ui.champs.groupeoptions.p */
class C1206p extends ColorDrawable {
    final C0500n this$0;

    C1206p(C0500n c0500n, int i) {
        this.this$0 = c0500n;
        super(i);
    }

    public int getIntrinsicHeight() {
        Drawable e = this.this$0.f905i != null ? this.this$0.f905i.m8541e() : null;
        return e != null ? e.getIntrinsicHeight() : 0;
    }

    public int getIntrinsicWidth() {
        Drawable e = this.this$0.f905i != null ? this.this$0.f905i.m8541e() : null;
        return e != null ? e.getIntrinsicWidth() : 0;
    }
}
