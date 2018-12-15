package fr.pcsoft.wdjava.ui.champs.image;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: fr.pcsoft.wdjava.ui.champs.image.m */
class C1221m implements OnClickListener {
    final WDChampImage this$0;

    C1221m(WDChampImage wDChampImage) {
        this.this$0 = wDChampImage;
    }

    public void onClick(View view) {
        if (!this.this$0.isBloqueTouchEvent() && this.this$0.d == 0) {
            this.this$0.appelPCode_TLM(18, 11);
        }
    }
}
