package fr.pcsoft.wdjava.ui.champs.libelle;

import android.annotation.TargetApi;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.ui.utils.C1511l;

/* renamed from: fr.pcsoft.wdjava.ui.champs.libelle.d */
class C1228d implements OnLayoutChangeListener {
    final WDLibelle this$0;

    C1228d(WDLibelle wDLibelle) {
        this.this$0 = wDLibelle;
    }

    @TargetApi(16)
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i8 - i6 != i4 - i2) {
            float cameraDistance = kb.m3965a(C0657a.JELLY_BEAN) ? this.this$0.Hc.getCameraDistance() : 0.0f;
            int i9 = i4 - i2;
            DisplayMetrics e = C1511l.m10534e();
            float d = (i9 > e.heightPixels / 2 || i9 > e.widthPixels / 2) ? 8000.0f : (float) C1511l.m10532d(1280.0f, 2);
            if (cameraDistance != d) {
                this.this$0.Hc.setCameraDistance(d);
            }
        }
    }
}
