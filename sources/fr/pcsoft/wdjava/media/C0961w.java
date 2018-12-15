package fr.pcsoft.wdjava.media;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: fr.pcsoft.wdjava.media.w */
class C0961w extends OrientationEventListener {
    final C0957s this$0;

    C0961w(C0957s c0957s, Context context) {
        this.this$0 = c0957s;
        super(context);
    }

    public void onOrientationChanged(int i) {
        this.this$0.f2661z = i;
    }
}
