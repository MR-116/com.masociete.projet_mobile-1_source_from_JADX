package fr.pcsoft.wdjava.ui.p065b.p067a;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import fr.pcsoft.wdjava.core.application.WDAppManager;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.a */
public final class C1059a extends BitmapDrawable {
    public C1059a(wb wbVar, int i, int i2) {
        super(WDAppManager.m2569b(), C1070i.m7656a(wbVar, i, i2));
    }

    /* renamed from: a */
    public final void m7568a() {
        Bitmap bitmap = getBitmap();
        if (bitmap != null) {
            bitmap.recycle();
        }
    }
}
