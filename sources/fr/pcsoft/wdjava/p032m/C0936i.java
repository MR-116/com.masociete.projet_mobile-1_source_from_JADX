package fr.pcsoft.wdjava.p032m;

import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.utils.gb;

/* renamed from: fr.pcsoft.wdjava.m.i */
final class C0936i extends gb<WDObjet> {
    final WDCallback val$callback;
    final WDObjet[] val$params;

    C0936i(WDCallback wDCallback, WDObjet[] wDObjetArr) {
        this.val$callback = wDCallback;
        this.val$params = wDObjetArr;
    }

    /* renamed from: b */
    public WDObjet m6804b() throws Exception {
        return this.val$callback.execute(this.val$params);
    }

    public /* bridge */ /* synthetic */ Object call() throws Exception {
        return m6804b();
    }
}
