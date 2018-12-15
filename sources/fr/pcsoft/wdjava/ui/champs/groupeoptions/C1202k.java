package fr.pcsoft.wdjava.ui.champs.groupeoptions;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import fr.pcsoft.wdjava.ui.p082k.C1439b;

/* renamed from: fr.pcsoft.wdjava.ui.champs.groupeoptions.k */
class C1202k implements OnFocusChangeListener {
    final C0501o this$0;

    C1202k(C0501o c0501o) {
        this.this$0 = c0501o;
    }

    public void onFocusChange(View view, boolean z) {
        if (z && !this.this$0.m1346e()) {
            C1439b.m10105d().m10107e();
        }
    }
}
