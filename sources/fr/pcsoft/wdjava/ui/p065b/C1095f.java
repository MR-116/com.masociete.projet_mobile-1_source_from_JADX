package fr.pcsoft.wdjava.ui.p065b;

import android.graphics.Bitmap;
import fr.pcsoft.wdjava.core.p040a.C0610b;

/* renamed from: fr.pcsoft.wdjava.ui.b.f */
class C1095f extends C0610b<String, Bitmap> {
    final C1103n this$0;

    C1095f(C1103n c1103n, int i) {
        this.this$0 = c1103n;
        super(i);
    }

    /* renamed from: a */
    protected int m7943a(String str, Bitmap bitmap) {
        return bitmap != null ? bitmap.getRowBytes() * bitmap.getHeight() : 0;
    }

    /* renamed from: b */
    protected /* bridge */ /* synthetic */ int mo3345b(Object obj, Object obj2) {
        return m7943a((String) obj, (Bitmap) obj2);
    }
}
