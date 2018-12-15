package fr.pcsoft.wdjava.ui.utils;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import fr.pcsoft.wdjava.core.utils.fb;

/* renamed from: fr.pcsoft.wdjava.ui.utils.m */
final class C1512m extends fb<Bitmap> {
    final Bitmap val$bitmap;
    final Config val$config;

    C1512m(Bitmap bitmap, Config config) {
        this.val$bitmap = bitmap;
        this.val$config = config;
    }

    /* renamed from: c */
    public Bitmap m10537c() throws Exception {
        Bitmap copy = this.val$bitmap.copy(this.val$config, true);
        this.val$bitmap.recycle();
        return copy;
    }

    public /* bridge */ /* synthetic */ Object call() throws Exception {
        return m10537c();
    }
}
