package fr.pcsoft.wdjava.ui.utils;

import fr.pcsoft.wdjava.p032m.C0938m;
import java.lang.reflect.InvocationTargetException;

/* renamed from: fr.pcsoft.wdjava.ui.utils.c */
public class C1504c {
    /* renamed from: a */
    public static void m10454a(Runnable runnable) {
        C0938m.m6816c().post(runnable);
    }

    /* renamed from: a */
    public static final boolean m10455a() {
        return false;
    }

    /* renamed from: a */
    public static final boolean m10456a(int i) {
        return false;
    }

    /* renamed from: b */
    public static void m10457b(Runnable runnable) throws InvocationTargetException, InterruptedException {
        runnable.run();
    }

    /* renamed from: b */
    public static boolean m10458b() {
        return C0938m.m6815b();
    }
}
