package fr.pcsoft.wdjava.core.context;

import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.p032m.C0933a;

public class WDAppelContexte {
    /* renamed from: a */
    private static final C0677k f1654a = new C0677k();

    /* renamed from: a */
    public static final <T extends C0668g> T m2679a(Class<T> cls) {
        return m2680a().m2787b(cls);
    }

    /* renamed from: a */
    private static final C0677k m2680a() {
        WDProjet instance = WDProjet.getInstance();
        if (instance == null || !instance.isMultiThread()) {
            return f1654a;
        }
        Thread currentThread = Thread.currentThread();
        return currentThread instanceof C0933a ? ((C0933a) currentThread).m6794b() : f1654a;
    }

    /* renamed from: b */
    public static final C0677k m2681b() {
        return f1654a;
    }

    public static final WDContexte getContexte() {
        return (WDContexte) m2680a().m2787b(WDContexte.class);
    }

    public static final <T extends C0668g> T getContexte(Class<T> cls) {
        return m2680a().m2784a((Class) cls);
    }
}
