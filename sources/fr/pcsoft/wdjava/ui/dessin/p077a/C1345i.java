package fr.pcsoft.wdjava.ui.dessin.p077a;

import android.graphics.Bitmap;
import fr.pcsoft.wdjava.core.utils.fb;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.a.i */
class C1345i extends fb<Void> {
    final C1344h this$0;
    final Bitmap val$bitmap;
    final int val$nCouleurLimite;
    final int val$nRGB;
    final int val$nStartX;
    final int val$nStartY;

    C1345i(C1344h c1344h, Bitmap bitmap, int i, int i2, int i3, int i4) {
        this.this$0 = c1344h;
        this.val$bitmap = bitmap;
        this.val$nStartX = i;
        this.val$nStartY = i2;
        this.val$nRGB = i3;
        this.val$nCouleurLimite = i4;
    }

    /* renamed from: b */
    protected void mo3346b() {
        new C1351q(null).mo3729a(this.val$bitmap, this.val$nStartX, this.val$nStartY, this.val$nRGB, this.val$nCouleurLimite);
    }

    /* renamed from: c */
    public Void m9673c() throws Exception {
        new C1350p().mo3729a(this.val$bitmap, this.val$nStartX, this.val$nStartY, this.val$nRGB, this.val$nCouleurLimite);
        return null;
    }

    public /* bridge */ /* synthetic */ Object call() throws Exception {
        return m9673c();
    }
}
