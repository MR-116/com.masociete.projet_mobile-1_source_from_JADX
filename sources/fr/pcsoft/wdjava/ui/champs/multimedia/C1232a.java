package fr.pcsoft.wdjava.ui.champs.multimedia;

import android.view.View;
import android.view.View.OnClickListener;
import fr.pcsoft.wdjava.core.C0607n;

/* renamed from: fr.pcsoft.wdjava.ui.champs.multimedia.a */
class C1232a implements OnClickListener {
    final WDChampMultimedia this$0;

    C1232a(WDChampMultimedia wDChampMultimedia) {
        this.this$0 = wDChampMultimedia;
    }

    public void onClick(View view) {
        this.this$0.appelPCode(C0607n.Qs);
    }
}
