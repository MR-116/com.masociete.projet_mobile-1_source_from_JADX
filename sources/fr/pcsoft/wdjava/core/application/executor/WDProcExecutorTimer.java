package fr.pcsoft.wdjava.core.application.executor;

import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.p041h.C0921d;

public class WDProcExecutorTimer extends C0643a {
    /* renamed from: c */
    protected static WDProcExecutorTimer f1609c = null;
    /* renamed from: d */
    private static final int f1610d = 1;

    private WDProcExecutorTimer() {
    }

    public static final WDProcExecutorTimer getInstance() {
        if (f1609c == null) {
            f1609c = new WDProcExecutorTimer();
        }
        return f1609c;
    }

    /* renamed from: a */
    protected C0644b mo2559a(WDCallback wDCallback, int i, int i2, int i3, WDObjet... wDObjetArr) {
        boolean z = true;
        if (!(i3 == 1 || C0643a.m2615a(wDCallback) == null)) {
            z = false;
        }
        if (z) {
            return new C0646d(this, C0921d.m6546a(wDCallback, i2, C0921d.m6544a(), false, i, wDObjetArr));
        }
        wDCallback.execute(wDObjetArr);
        return null;
    }
}
