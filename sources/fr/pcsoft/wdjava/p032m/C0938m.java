package fr.pcsoft.wdjava.p032m;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0505p;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDVoid;
import fr.pcsoft.wdjava.core.utils.gb;
import fr.pcsoft.wdjava.task.C1027j;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.nb;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: fr.pcsoft.wdjava.m.m */
public class C0938m {
    /* renamed from: a */
    private static C0937l f2561a = null;
    /* renamed from: b */
    private static C1027j f2562b = null;
    /* renamed from: c */
    private static LinkedList<C0935c> f2563c = null;
    /* renamed from: z */
    private static final String f2564z = C0938m.m6818z(C0938m.m6819z("\u001e \u001bc{b,\rzqh?\ryvp2\u0016unh$\u0001oju?\u0017qzb>\u0017sqs)\u0013ylx"));

    /* renamed from: a */
    public static WDObjet m6805a(C0486m c0486m, WDObjet... wDObjetArr) {
        if (C0938m.m6815b()) {
            return WDCallback.m2252a(c0486m, wDObjetArr);
        }
        WDObjet wDObjet = (WDObjet) C0938m.m6807a(new C0936i(WDCallback.m2239a(c0486m, wDObjetArr.length, true), wDObjetArr));
        return wDObjet == null ? new WDVoid(c0486m.toString()) : wDObjet;
    }

    /* renamed from: a */
    private static final nb m6806a() {
        WDContexte contexte = WDAppelContexte.getContexte();
        if (contexte.m2721g() != null) {
            return null;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C0933a) {
            C0503o f = ((C0933a) currentThread).m6798f();
            if (f instanceof nb) {
                return (nb) f;
            }
        }
        C0489p o = contexte.m2728o();
        if (o != null) {
            C0505p c0505p = (C0505p) o.getObjOrParentOfType(C0505p.class);
            if (c0505p != null && (c0505p instanceof nb)) {
                return (nb) c0505p;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static <T> T m6807a(gb<T> gbVar) {
        T t = null;
        try {
            if (C0938m.m6815b()) {
                gbVar.run();
            } else {
                try {
                    synchronized (gbVar) {
                        C0938m.m6816c().postDelayed(gbVar, 50);
                        gbVar.wait();
                    }
                } catch (InterruptedException e) {
                }
            }
            try {
                t = gbVar.m3088a();
            } catch (Throwable e2) {
                WDErreurManager.m2888b(e2);
            }
            return t;
        } catch (InterruptedException e3) {
            throw e3;
        }
    }

    /* renamed from: a */
    public static final void m6808a(C1027j c1027j) {
        f2562b = c1027j;
    }

    /* renamed from: a */
    public static final void m6809a(nb nbVar, WDObjet... wDObjetArr) {
        if (!C0938m.m6815b()) {
            WDErreurManager.m2883a(C0745b.m3222b(f2564z, new String[0]));
        }
        if (nbVar == null) {
            nbVar = C0938m.m6806a();
        }
        if (nbVar != null && !nbVar.isReleased()) {
            nbVar.updateUI_WL(wDObjetArr);
        }
    }

    /* renamed from: a */
    public static void m6810a(Runnable runnable) {
        if (C0938m.m6815b()) {
            runnable.run();
        } else {
            C0938m.m6816c().post(runnable);
        }
    }

    /* renamed from: a */
    public static void m6811a(Runnable runnable, long j) {
        if (j <= 0) {
            C0938m.m6810a(runnable);
        }
        C0938m.m6816c().postDelayed(runnable, j);
    }

    /* renamed from: a */
    public static void m6812a(Runnable runnable, boolean z) {
        Handler c = C0938m.m6816c();
        Message obtain = Message.obtain(c, runnable);
        obtain.what = 1108;
        if (z) {
            c.sendMessageAtFrontOfQueue(obtain);
        } else {
            c.sendMessageDelayed(obtain, 0);
        }
    }

    /* renamed from: b */
    public static final void m6813b(nb nbVar, WDObjet... wDObjetArr) {
        if (nbVar == null) {
            nbVar = C0938m.m6806a();
        }
        if (nbVar != null && !nbVar.isReleased()) {
            Object obj;
            if (f2563c == null) {
                f2563c = new LinkedList();
                obj = 1;
            } else {
                if (!f2563c.isEmpty()) {
                    Iterator it = f2563c.iterator();
                    while (it.hasNext()) {
                        C0935c c0935c = (C0935c) it.next();
                        if (C0935c.access$000(c0935c) == nbVar && C0935c.access$100(c0935c).length == wDObjetArr.length) {
                            int length = wDObjetArr.length;
                            int i = 0;
                            while (i < length) {
                                WDObjet wDObjet = wDObjetArr[i];
                                WDObjet wDObjet2 = C0935c.access$100(c0935c)[i];
                                if (wDObjet == null || wDObjet2 == null || !wDObjet.isEvaluable() || !wDObjet2.isEvaluable() || !wDObjet.opEgal(wDObjet2)) {
                                    break;
                                }
                                i++;
                            }
                            if (i >= length) {
                                obj = null;
                                break;
                            }
                        }
                    }
                }
                int i2 = 1;
            }
            if (obj != null) {
                Runnable c0935c2 = new C0935c(nbVar, wDObjetArr);
                f2563c.add(c0935c2);
                f2561a.post(c0935c2);
            }
        }
    }

    /* renamed from: b */
    public static void m6814b(Runnable runnable) {
        C0938m.m6812a(runnable, false);
    }

    /* renamed from: b */
    public static final boolean m6815b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: c */
    public static final C0937l m6816c() {
        if (f2561a == null) {
            f2561a = new C0937l();
        }
        return f2561a;
    }

    /* renamed from: d */
    public static final C1027j m6817d() {
        return f2562b;
    }

    /* renamed from: z */
    private static String m6818z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 61;
                    break;
                case 1:
                    i2 = 109;
                    break;
                case 2:
                    i2 = 82;
                    break;
                case 3:
                    i2 = 48;
                    break;
                default:
                    i2 = 62;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6819z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 62);
        }
        return toCharArray;
    }
}
