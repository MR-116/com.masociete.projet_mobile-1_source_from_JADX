package fr.pcsoft.wdjava.ui.utils;

import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.p035c.C0667i;
import fr.pcsoft.wdjava.core.utils.C0806j;
import fr.pcsoft.wdjava.p032m.C0933a;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;

/* renamed from: fr.pcsoft.wdjava.ui.utils.p */
public class C1515p {
    /* renamed from: a */
    public static boolean f4650a = true;

    /* renamed from: a */
    public static final void m10541a() {
        C1515p.m10542a(-1);
    }

    /* renamed from: a */
    public static final void m10542a(int i) {
        try {
            if (f4650a && i != 0) {
                int abs = i == -1 ? 1 : Math.abs(i * 10);
                if (Thread.currentThread() instanceof C0933a) {
                    try {
                        Thread.sleep((long) abs);
                        return;
                    } catch (InterruptedException e) {
                        return;
                    }
                }
                C0489p o = WDAppelContexte.getContexte().m2728o();
                try {
                    C0806j.m3950a((long) abs, C0806j.m3952b(), 0, null);
                    if (o == null) {
                        return;
                    }
                    if (o.isReleased()) {
                        throw new C0667i(o);
                    }
                    try {
                        C0508h fenetreMere = o.isFenetre() ? (C0508h) o : o.getFenetreMere();
                        if (fenetreMere != null) {
                            try {
                                if (!fenetreMere.estOuverte()) {
                                    throw new C0667i((C0489p) fenetreMere);
                                }
                            } catch (InterruptedException e2) {
                                throw e2;
                            }
                        }
                    } catch (InterruptedException e22) {
                        throw e22;
                    }
                } catch (InterruptedException e222) {
                    throw e222;
                } catch (InterruptedException e2222) {
                    throw e2222;
                }
            }
        } catch (InterruptedException e22222) {
            throw e22222;
        }
    }
}
