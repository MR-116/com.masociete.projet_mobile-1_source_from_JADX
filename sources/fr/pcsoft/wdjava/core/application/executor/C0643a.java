package fr.pcsoft.wdjava.core.application.executor;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.poo.C0558c;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.p032m.C0938m;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: fr.pcsoft.wdjava.core.application.executor.a */
public abstract class C0643a {
    /* renamed from: a */
    public static final String f1607a = C0643a.m2620z(C0643a.m2621z("\u001c\u001br\f\u0014\""));
    /* renamed from: b */
    private static LinkedList<C0644b> f1608b = null;

    protected C0643a() {
    }

    /* renamed from: a */
    protected static final C0644b m2615a(WDCallback wDCallback) {
        if (f1608b != null) {
            synchronized (f1608b) {
                Iterator it = f1608b.iterator();
                while (it.hasNext()) {
                    C0644b c0644b = (C0644b) it.next();
                    if (wDCallback.equals(c0644b.mo2563c())) {
                        return c0644b;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static final void m2616a(C0644b c0644b) {
        if (f1608b != null) {
            synchronized (f1608b) {
                f1608b.remove(c0644b);
                c0644b.mo2566f();
            }
        }
    }

    /* renamed from: a */
    public static final void m2617a(C0486m c0486m) {
        String obj = c0486m != null ? c0486m.toString() : null;
        if (C0808l.m4053k(obj)) {
            obj = WDAppelContexte.getContexte().m2730q();
            if (C0808l.m4053k(obj)) {
                return;
            }
        }
        C0644b a = C0643a.m2615a(WDCallback.m2240a(obj + f1607a, -1));
        if (a != null) {
            a.mo2561b();
        }
    }

    /* renamed from: a */
    private final void m2618a(String str, int i, int i2, int i3, int i4, C0558c c0558c, WDObjet... wDObjetArr) {
        C0644b a = mo2559a(WDCallback.m2243a(str + f1607a, wDObjetArr != null ? wDObjetArr.length : 0, (WDObjet) c0558c, true), i, i2, i4, wDObjetArr);
        if (a != null) {
            C0643a.m2619b(a);
            if (i3 != 0) {
                Runnable c0647e = new C0647e(this, a);
                if (i3 == -1) {
                    WDAppelContexte.getContexte().m2698a(c0647e);
                    return;
                } else if (i3 == -2) {
                    WDAppelContexte.getContexte().m2711b(c0647e);
                    return;
                } else {
                    C0938m.m6811a(c0647e, (long) Math.abs(i3));
                    return;
                }
            }
            a.mo2565e();
        }
    }

    /* renamed from: b */
    private static final void m2619b(C0644b c0644b) {
        if (c0644b != null) {
            if (f1608b == null) {
                f1608b = new LinkedList();
            }
            synchronized (f1608b) {
                f1608b.add(c0644b);
            }
        }
    }

    /* renamed from: z */
    private static String m2620z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 67;
                    break;
                case 1:
                    i2 = 122;
                    break;
                case 2:
                    i2 = 7;
                    break;
                case 3:
                    i2 = 11;
                    break;
                default:
                    i2 = 99;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2621z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 99);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected abstract C0644b mo2559a(WDCallback wDCallback, int i, int i2, int i3, WDObjet... wDObjetArr);

    public final void initExecAutoMethode_GEN(String str, int i, long j, int i2, int i3, C0558c c0558c, WDObjet... wDObjetArr) {
        m2618a(str, i == 0 ? Integer.MAX_VALUE : i, ((int) Math.abs(j)) * 10, i2 > 0 ? i2 * 10 : i2, i3, c0558c, wDObjetArr);
    }

    public final void initExecAutoProcedure_GEN(String str, int i, long j, int i2, int i3, WDObjet... wDObjetArr) {
        m2618a(str, i == 0 ? Integer.MAX_VALUE : i, ((int) Math.abs(j)) * 10, i2 > 0 ? i2 * 10 : i2, i3, null, wDObjetArr);
    }
}
