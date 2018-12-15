package fr.pcsoft.wdjava.core.context;

import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.database.hf.bb;
import fr.pcsoft.wdjava.jni.WDJNIHelper;
import fr.pcsoft.wdjava.p032m.C0933a;
import fr.pcsoft.wdjava.p032m.C0938m;
import java.util.HashMap;

/* renamed from: fr.pcsoft.wdjava.core.context.k */
public class C0677k {
    /* renamed from: a */
    public static final int f1694a = 4;
    /* renamed from: b */
    public static final int f1695b = 8;
    /* renamed from: c */
    public static final int f1696c = 2;
    /* renamed from: d */
    public static final int f1697d = 16;
    /* renamed from: f */
    public static final int f1698f = 1;
    /* renamed from: z */
    private static final String[] f1699z = new String[]{C0677k.m2782z(C0677k.m2783z("=o,\u001b)Wv'\u00163Pz&\u0004*_m \u000b6[f(\u0007>Lv \r")), C0677k.m2782z(C0677k.m2783z("xKG9\u0019mV\u000f=Ti]\u0003(\f\u0017\r(\u000e[\b:\u001f0Q\u000fg-Zq/\u00169qW\u001d,\u0002j\\")), C0677k.m2782z(C0677k.m2783z("WT\u0019&\tmP\u000b%\u001f>]\fi\u0019lÐ\f;Zr\\I*\u0015pM\f1\u000e{\u0019\r,Zj@\u0019,Z")), C0677k.m2782z(C0677k.m2783z("y\\\u001d\u0000\u0014mM\b'\u0019{")), C0677k.m2782z(C0677k.m2783z("Xv'\n.Wv'\u0016/Wf=\u0001([x-")), C0677k.m2782z(C0677k.m2783z("=&\u00079Jp&\u0007%Ww=\f(Zp=\f%Ip-\u000e?J")), C0677k.m2782z(C0677k.m2783z("=&\u00079Jp&\u0007%Ww=\f(Zp=\f%Jx*\u0001?Ai(\u001b;Ru,\u0005?")), C0677k.m2782z(C0677k.m2783z("R\\I*\u0015pM\f1\u000e{\u0019!\u000fZ\u0019\r \u0010þ\u0019=>]*\u0016Kg"))};
    /* renamed from: e */
    private HashMap<Class<? extends C0668g>, C0668g> f1700e = new HashMap(6);

    /* renamed from: a */
    public static WDContexte m2775a(String str) {
        return C0677k.m2779a(str, true, false);
    }

    /* renamed from: a */
    public static WDContexte m2776a(String str, int i) {
        boolean z = true;
        WDContexte a = C0677k.m2779a(str, (i & 1) > 0, (i & 2) > 0);
        if ((i & 4) > 0) {
            try {
                if (WDAppManager.m2548G()) {
                    WDErreurManager.m2883a(C0745b.m3222b(f1699z[5], new String[0]));
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        if ((i & 8) > 0) {
            try {
                if (!C0938m.m6815b()) {
                    Thread currentThread = Thread.currentThread();
                    try {
                        if (currentThread instanceof C0933a) {
                            if (((C0933a) currentThread).m6797e() != null) {
                                WDErreurManager.m2883a(C0745b.m3222b(f1699z[6], C0745b.m3221b(str)));
                            }
                        }
                        WDErreurManager.m2883a(C0745b.m3222b(f1699z[4], new String[0]));
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        }
        if ((i & 16) > 0) {
            if ((i & 2) != 0) {
                z = false;
            }
            WDJNIHelper.m6615a(z);
        }
        return a;
    }

    /* renamed from: a */
    public static WDContexte m2777a(String str, int i, int i2) {
        WDContexte a = C0677k.m2776a(str, i);
        C0677k.m2781a(i2);
        return a;
    }

    /* renamed from: a */
    public static WDContexte m2778a(String str, boolean z) {
        return C0677k.m2779a(str, z, false);
    }

    /* renamed from: a */
    public static WDContexte m2779a(String str, boolean z, boolean z2) {
        WDContexte contexte = WDAppelContexte.getContexte();
        contexte.m2703a(str, z, z2);
        return contexte;
    }

    /* renamed from: a */
    public static WDContexte m2780a(String str, boolean z, boolean z2, int i) {
        WDContexte a = C0677k.m2779a(str, z, z2);
        C0677k.m2781a(i);
        return a;
    }

    /* renamed from: a */
    private static final void m2781a(int i) {
        if (i != -1) {
            try {
                if (!WDProjet.getInstance().isVersionCompatible(i)) {
                    WDErreurManager.m2883a(C0745b.m3222b(f1699z[0], new String[0]));
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    /* renamed from: z */
    private static String m2782z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 30;
                    break;
                case 1:
                    i2 = 57;
                    break;
                case 2:
                    i2 = 105;
                    break;
                case 3:
                    i2 = 73;
                    break;
                default:
                    i2 = 122;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2783z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 122);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public <T extends C0668g> T m2784a(Class<T> cls) throws IllegalArgumentException {
        return (C0668g) this.f1700e.get(cls);
    }

    /* renamed from: a */
    public void m2785a() {
        if (this.f1700e != null) {
            for (C0668g a : this.f1700e.values()) {
                try {
                    a.mo2567a();
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            this.f1700e.clear();
            this.f1700e = null;
        }
    }

    /* renamed from: a */
    public void m2786a(bb bbVar) {
        try {
            C0691a.m2860a(this.f1700e.get(bb.class) == null, f1699z[7]);
            this.f1700e.put(bb.class, bbVar);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: b */
    public <T extends C0668g> T m2787b(Class<T> cls) throws IllegalArgumentException {
        boolean z = true;
        T t = (C0668g) this.f1700e.get(cls);
        if (t == null) {
            try {
                if (cls == bb.class) {
                    t = (C0668g) Class.forName(f1699z[1]).getMethod(f1699z[3], new Class[]{Boolean.TYPE}).invoke(null, new Object[]{Boolean.TRUE});
                } else {
                    C0668g c0668g = (C0668g) cls.getConstructor((Class[]) null).newInstance((Object[]) null);
                }
                if (t == null) {
                    z = false;
                }
                try {
                    C0691a.m2860a(z, f1699z[2] + cls.getName());
                    if (t != null) {
                        this.f1700e.put(cls, t);
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                C0691a.m2857a(f1699z[2] + cls.getName(), e2);
                throw new IllegalArgumentException();
            }
        }
        return t;
    }
}
