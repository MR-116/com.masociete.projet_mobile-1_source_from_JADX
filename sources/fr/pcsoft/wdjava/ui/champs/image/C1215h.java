package fr.pcsoft.wdjava.ui.champs.image;

import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import fr.pcsoft.wdjava.ui.champs.ib;
import fr.pcsoft.wdjava.ui.p065b.C1097h;
import fr.pcsoft.wdjava.ui.p065b.C1099j;

/* renamed from: fr.pcsoft.wdjava.ui.champs.image.h */
class C1215h extends C1097h {
    final WDChampImage this$0;

    C1215h(WDChampImage wDChampImage, C1099j c1099j) {
        this.this$0 = wDChampImage;
        super(c1099j);
    }

    /* renamed from: a */
    protected void mo3468a(Drawable drawable) {
        super.mo3468a(drawable);
        if (!isCancelled() && !this.this$0.isReleased()) {
            this.this$0.m1453a(drawable);
        }
    }

    /* renamed from: a */
    public void mo3469a(ProgressBar progressBar) {
        progressBar.measure(0, 0);
        int measuredWidth = progressBar.getMeasuredWidth();
        int measuredHeight = progressBar.getMeasuredHeight();
        ib ibVar = (ib) this.this$0.od.getLayoutParams();
        int i = measuredWidth > ibVar.width ? ibVar.width : measuredWidth;
        if (measuredHeight > ibVar.height) {
            measuredHeight = ibVar.height;
        }
        ib ibVar2 = (ib) progressBar.getLayoutParams();
        ibVar2.x = ibVar.x + ((ibVar.width - i) / 2);
        ibVar2.y = ((ibVar.height - measuredHeight) / 2) + ibVar.y;
        ibVar2.width = i;
        ibVar2.height = measuredHeight;
        progressBar.requestLayout();
    }

    /* renamed from: b */
    protected void mo3470b() {
        super.mo3470b();
        if (this.this$0.nd == this) {
            this.this$0.nd = null;
        }
    }

    /* renamed from: b */
    public void mo3471b(ProgressBar progressBar) {
        this.this$0.Bc.addView(progressBar);
    }

    protected /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        mo3468a((Drawable) obj);
    }
}
