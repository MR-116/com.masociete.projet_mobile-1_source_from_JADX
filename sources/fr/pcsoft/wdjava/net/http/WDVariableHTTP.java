package fr.pcsoft.wdjava.net.http;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.jni.C0928d;

public class WDVariableHTTP {
    /* renamed from: a */
    private static WDObjet f2771a = null;

    public static final WDObjet getIgnoreErreur() {
        if (f2771a == null) {
            if (C0990o.m7216e()) {
                f2771a = new C0928d(10, 38, 8);
            } else {
                f2771a = new bb();
            }
        }
        return f2771a;
    }
}
