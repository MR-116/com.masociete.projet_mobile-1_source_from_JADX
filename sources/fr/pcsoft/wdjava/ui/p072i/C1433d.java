package fr.pcsoft.wdjava.ui.p072i;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import fr.pcsoft.wdjava.core.utils.fb;

/* renamed from: fr.pcsoft.wdjava.ui.i.d */
class C1433d extends fb<Bitmap> {
    final C1434f this$1;
    final int val$nHauteur;
    final int val$nLargeur;

    C1433d(C1434f c1434f, int i, int i2) {
        this.this$1 = c1434f;
        this.val$nLargeur = i;
        this.val$nHauteur = i2;
    }

    /* renamed from: c */
    public Bitmap m10075c() throws Exception {
        return Bitmap.createBitmap(this.val$nLargeur, this.val$nHauteur, Config.ARGB_8888);
    }

    public /* bridge */ /* synthetic */ Object call() throws Exception {
        return m10075c();
    }
}
