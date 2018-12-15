package fr.pcsoft.wdjava.ui.utils;

import android.app.Activity;
import fr.pcsoft.wdjava.ui.activite.C1052d;

/* renamed from: fr.pcsoft.wdjava.ui.utils.g */
class C1506g extends C1052d {
    final WDSablierImpl this$0;

    C1506g(WDSablierImpl wDSablierImpl) {
        this.this$0 = wDSablierImpl;
    }

    public void onFinish(Activity activity) {
        if (this.this$0.f4554f == activity) {
            this.this$0.destroy();
        }
    }
}
