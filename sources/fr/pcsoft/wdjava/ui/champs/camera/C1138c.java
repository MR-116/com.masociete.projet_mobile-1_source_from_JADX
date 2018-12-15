package fr.pcsoft.wdjava.ui.champs.camera;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: fr.pcsoft.wdjava.ui.champs.camera.c */
class C1138c implements OnClickListener {
    final WDChampCamera this$0;

    C1138c(WDChampCamera wDChampCamera) {
        this.this$0 = wDChampCamera;
    }

    public void onClick(View view) {
        if (!this.this$0.isBloqueTouchEvent() && this.this$0._getEtat() == 0) {
            this.this$0.appelPCode(18);
        }
    }
}
