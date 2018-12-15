package fr.pcsoft.wdjava.ui.utils;

import android.annotation.TargetApi;
import android.view.View;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.utils.kb;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: fr.pcsoft.wdjava.ui.utils.y */
public final class C1523y {
    /* renamed from: a */
    private static final AtomicInteger f4670a = new AtomicInteger(1);

    @TargetApi(17)
    /* renamed from: a */
    public static final int m10574a() {
        if (kb.m3965a(C0657a.JELLY_BEAN_MR1)) {
            return View.generateViewId();
        }
        int i;
        int i2;
        do {
            i = f4670a.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f4670a.compareAndSet(i, i2));
        return i;
    }
}
