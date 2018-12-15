package fr.pcsoft.wdjava.core;

import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.application.C0612h;
import fr.pcsoft.wdjava.core.application.WDProcedureInterne;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.C0695c;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.poo.C0735q;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDVoid;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import java.lang.reflect.Method;

public class WDCallback {
    /* renamed from: a */
    public static final int f1469a = 2;
    /* renamed from: b */
    public static final int f1470b = 1;
    /* renamed from: c */
    public static final int f1471c = 1;
    /* renamed from: e */
    public static final int f1472e = 2;
    /* renamed from: h */
    public static final int f1473h = 4;
    /* renamed from: z */
    private static final String[] f1474z = new String[]{m2257z(m2258z("\u0019j\u0018\u000b")), m2257z(m2258z("d\u0007")), m2257z(m2258z("pm\u000e\u0007Q\u001by\t\u001aWp")), m2257z(m2258z("p\u0013")), m2257z(m2258z("8j\u0018\u0017")), m2257z(m2258z("pm\u000e\u0007Q\u001by\t\u001aW")), m2257z(m2258z("\u0019j\u0018\u000bB")), m2257z(m2258z("\u001fH?=|~^0)a-X|\u001f^~S9hq1O.-a.R2,2?H|&}3\u001dfh")), m2257z(m2258z("\u0001\\)<}\te")), m2257z(m2258z("}x\u000e\u001aM\u000eo\u0013\u000bW\u001ah\u000e\rM\u0019q\u0013\nS\u0012x")), m2257z(m2258z("}m\u000e\u0007Q\u001by\t\u001aW\u0001t\u0012\u000b]\u0010s\t\r")), m2257z(m2258z("}x\u000e\u001aM\u0010\u0003\u0018S\f|\u0011\u0017Q\u001fq\u0010\nS\u001dv"))};
    /* renamed from: d */
    private String f1475d = "";
    /* renamed from: f */
    private Method f1476f = null;
    /* renamed from: g */
    private Object f1477g = null;

    private WDCallback(String str, Method method) {
        this.f1475d = str;
        this.f1476f = method;
        this.f1476f.setAccessible(true);
    }

    public WDCallback(String str, Method method, Object obj) {
        this.f1475d = str;
        this.f1476f = method;
        this.f1477g = obj;
        this.f1476f.setAccessible(true);
    }

    /* renamed from: a */
    private static final WDCallback m2234a(WDObjet wDObjet, String str, int i) {
        if (wDObjet != null) {
            Method a = C0735q.m3122a(wDObjet.getClass(), str, i);
            if (a != null) {
                try {
                    return new WDCallback(str, a, wDObjet);
                } catch (RuntimeException e) {
                    throw e;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final WDCallback m2235a(C0486m c0486m, int i) {
        try {
            return c0486m instanceof C0612h ? ((C0612h) c0486m).getCallback(i) : m2243a(c0486m.toString(), i, null, false);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static final WDCallback m2236a(C0486m c0486m, int i, int i2) {
        try {
            return c0486m instanceof C0612h ? ((C0612h) c0486m).getCallback(i) : m2242a(c0486m.toString(), i, null, i2);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static final WDCallback m2237a(C0486m c0486m, int i, WDObjet wDObjet) {
        try {
            return c0486m instanceof C0612h ? ((C0612h) c0486m).getCallback(i) : m2243a(c0486m.toString(), i, wDObjet, false);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static final WDCallback m2238a(C0486m c0486m, int i, WDObjet wDObjet, boolean z) {
        try {
            return c0486m instanceof C0612h ? ((C0612h) c0486m).getCallback(i) : m2243a(c0486m.toString(), i, wDObjet, z);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static final WDCallback m2239a(C0486m c0486m, int i, boolean z) {
        return m2236a(c0486m, i, z ? 1 : 0);
    }

    /* renamed from: a */
    public static final WDCallback m2240a(String str, int i) {
        return m2243a(str, i, null, false);
    }

    /* renamed from: a */
    private static WDCallback m2241a(String str, int i, WDObjet wDObjet) {
        int indexOf = str.indexOf(f1474z[2]);
        String str2 = indexOf >= 0 ? str.substring(0, indexOf) + str.substring(indexOf + f1474z[5].length(), str.length()) : str;
        try {
            if (str2.indexOf(46) != -1) {
                if (str2.indexOf(f1474z[3]) == -1) {
                    try {
                        if (!str2.startsWith(".")) {
                            try {
                                if (!str2.endsWith(".")) {
                                    int lastIndexOf = str2.lastIndexOf(46);
                                    return m2245a(str2.substring(0, lastIndexOf), str2.substring(lastIndexOf + 1, str2.length()), i);
                                }
                            } catch (ClassNotFoundException e) {
                                throw e;
                            }
                        }
                    } catch (ClassNotFoundException e2) {
                        throw e2;
                    }
                }
                return null;
            } else if (str2.startsWith(f1474z[1])) {
                String str3 = f1474z[4] + C0725i.m3031a(str2.substring(2), true);
                str2 = WDAppelContexte.getContexte().m2709b();
                try {
                    if (!str2.equals("")) {
                        Class e3;
                        if (!str2.startsWith(f1474z[0])) {
                            str2 = f1474z[0] + str2;
                        }
                        try {
                            e3 = C0735q.m3130e(str2);
                        } catch (ClassNotFoundException e4) {
                            e3 = null;
                        }
                        if (e3 != null) {
                            Method a = C0735q.m3122a(e3, str3, i);
                            if (a != null) {
                                try {
                                    return new WDCallback(str3, a);
                                } catch (ClassNotFoundException e22) {
                                    throw e22;
                                }
                            }
                        }
                    }
                    return null;
                } catch (ClassNotFoundException e222) {
                    throw e222;
                }
            } else if (str2.startsWith(":")) {
                return m2234a(WDAppelContexte.getContexte().m2721g(), f1474z[4] + C0725i.m3031a(str2.substring(1), true), i);
            } else {
                WDContexte contexte = WDAppelContexte.getContexte();
                contexte.m2726l();
                WDProcedureInterne b = contexte.m2708b(str2);
                if (b != null) {
                    WDCallback callback = b.getCallback(i);
                    if (callback != null) {
                        return callback;
                    }
                }
                String str4 = !str2.startsWith(f1474z[4]) ? f1474z[4] + C0725i.m3031a(str2, true) : str2;
                C0489p o = contexte.m2728o();
                if (o != null) {
                    try {
                        Method a2;
                        if (o instanceof C0506k) {
                            a2 = C0735q.m3122a(o.getClass(), str4, i);
                            if (a2 != null) {
                                try {
                                    return new WDCallback(str4, a2, o);
                                } catch (ClassNotFoundException e2222) {
                                    throw e2222;
                                }
                            }
                        }
                        o = (C0489p) o.getPere();
                        while (o != null) {
                            try {
                                if (o instanceof C0506k) {
                                    a2 = C0735q.m3122a(o.getClass(), str4, i);
                                    if (a2 != null) {
                                        try {
                                            return new WDCallback(str4, a2, o);
                                        } catch (ClassNotFoundException e22222) {
                                            throw e22222;
                                        }
                                    }
                                }
                                o = (C0489p) o.getPere();
                            } catch (ClassNotFoundException e222222) {
                                throw e222222;
                            }
                        }
                    } catch (ClassNotFoundException e2222222) {
                        throw e2222222;
                    }
                }
                if (wDObjet == null) {
                    wDObjet = contexte.m2721g();
                }
                if (wDObjet != null) {
                    WDCallback a3 = m2234a(wDObjet, str4, i);
                    if (a3 != null) {
                        return a3;
                    }
                }
                return m2255b(str4, i);
            }
        } catch (ClassNotFoundException e22222222) {
            throw e22222222;
        } catch (ClassNotFoundException e222222222) {
            throw e222222222;
        }
    }

    /* renamed from: a */
    public static final WDCallback m2242a(String str, int i, WDObjet wDObjet, int i2) {
        WDCallback a = m2241a(str, i, wDObjet);
        if (a == null) {
            if ((i2 & 1) > 0) {
                try {
                    WDErreurManager.m2883a(C0745b.m3222b(f1474z[10], C0735q.m3133h(str)));
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            return null;
        } else if ((i2 & 2) <= 0) {
            return a;
        } else {
            try {
                if (a.m2263e() == null) {
                    return a;
                }
                WDErreurManager.m2883a(C0745b.m3222b(f1474z[9], new String[0]));
                return a;
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
    }

    /* renamed from: a */
    public static final WDCallback m2243a(String str, int i, WDObjet wDObjet, boolean z) {
        return m2242a(str, i, wDObjet, z ? 1 : 0);
    }

    /* renamed from: a */
    public static final WDCallback m2244a(String str, int i, boolean z) {
        return m2243a(str, i, null, z);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static fr.pcsoft.wdjava.core.WDCallback m2245a(java.lang.String r4, java.lang.String r5, int r6) {
        /*
        r2 = 4;
        r0 = f1474z;
        r0 = r0[r2];
        r0 = r5.startsWith(r0);
        if (r0 != 0) goto L_0x0025;
    L_0x000b:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = f1474z;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = 1;
        r1 = fr.pcsoft.wdjava.core.C0725i.m3031a(r5, r1);
        r0 = r0.append(r1);
        r5 = r0.toString();
    L_0x0025:
        r0 = fr.pcsoft.wdjava.core.WDIndirection.get2(r4, r2);
        r0 = (fr.pcsoft.wdjava.ui.C0489p) r0;
        if (r0 == 0) goto L_0x0066;
    L_0x002d:
        r1 = fr.pcsoft.wdjava.ui.champs.fenetreinterne.C0524x.class;
        r1 = r0.checkType(r1);
        r1 = (fr.pcsoft.wdjava.ui.champs.fenetreinterne.C0524x) r1;
        if (r1 == 0) goto L_0x0166;
    L_0x0037:
        r0 = r1.getFenetreInterneChargee();
        r0 = (fr.pcsoft.wdjava.ui.C0489p) r0;
        r1 = r0;
    L_0x003e:
        if (r1 == 0) goto L_0x0066;
    L_0x0040:
        r0 = r1.isSuperChamp();	 Catch:{ Exception -> 0x0060 }
        if (r0 != 0) goto L_0x0050;
    L_0x0046:
        r0 = r1.isFenetre();	 Catch:{ Exception -> 0x0062 }
        if (r0 != 0) goto L_0x0050;
    L_0x004c:
        r0 = r1 instanceof fr.pcsoft.wdjava.ui.champs.fenetreinterne.fb;	 Catch:{ Exception -> 0x0062 }
        if (r0 == 0) goto L_0x0066;
    L_0x0050:
        r0 = r1.getClass();
        r2 = fr.pcsoft.wdjava.core.poo.C0735q.m3122a(r0, r5, r6);
        if (r2 == 0) goto L_0x0066;
    L_0x005a:
        r0 = new fr.pcsoft.wdjava.core.WDCallback;	 Catch:{ Exception -> 0x0064 }
        r0.<init>(r5, r2, r1);	 Catch:{ Exception -> 0x0064 }
    L_0x005f:
        return r0;
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        throw r0;
    L_0x0064:
        r0 = move-exception;
        throw r0;
    L_0x0066:
        r0 = f1474z;	 Catch:{ Exception -> 0x00bc }
        r1 = 6;
        r0 = r0[r1];	 Catch:{ Exception -> 0x00bc }
        r0 = r4.startsWith(r0);	 Catch:{ Exception -> 0x00bc }
        if (r0 != 0) goto L_0x0163;
    L_0x0071:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00bc }
        r0.<init>();	 Catch:{ Exception -> 0x00bc }
        r1 = f1474z;	 Catch:{ Exception -> 0x00bc }
        r2 = 6;
        r1 = r1[r2];	 Catch:{ Exception -> 0x00bc }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x00bc }
        r1 = 0;
        r1 = fr.pcsoft.wdjava.core.C0725i.m3031a(r4, r1);	 Catch:{ Exception -> 0x00bc }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x00bc }
        r0 = r0.toString();	 Catch:{ Exception -> 0x00bc }
        r1 = r0;
    L_0x008d:
        r0 = fr.pcsoft.wdjava.core.poo.C0735q.m3130e(r1);	 Catch:{ Exception -> 0x00bc }
        r2 = fr.pcsoft.wdjava.core.application.WDCollProc.class;
        r2 = r2.isAssignableFrom(r0);	 Catch:{ Exception -> 0x00bc }
        if (r2 == 0) goto L_0x00bd;
    L_0x0099:
        r2 = fr.pcsoft.wdjava.core.poo.C0735q.m3122a(r0, r5, r6);	 Catch:{ Exception -> 0x00bc }
        if (r2 == 0) goto L_0x0139;
    L_0x009f:
        r0 = new fr.pcsoft.wdjava.core.WDCallback;	 Catch:{ Exception -> 0x00bc }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00bc }
        r3.<init>();	 Catch:{ Exception -> 0x00bc }
        r1 = r3.append(r1);	 Catch:{ Exception -> 0x00bc }
        r3 = ".";
        r1 = r1.append(r3);	 Catch:{ Exception -> 0x00bc }
        r1 = r1.append(r5);	 Catch:{ Exception -> 0x00bc }
        r1 = r1.toString();	 Catch:{ Exception -> 0x00bc }
        r0.<init>(r1, r2);	 Catch:{ Exception -> 0x00bc }
        goto L_0x005f;
    L_0x00bc:
        r0 = move-exception;
    L_0x00bd:
        r0 = f1474z;	 Catch:{ Exception -> 0x011c }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ Exception -> 0x011c }
        r0 = r4.startsWith(r0);	 Catch:{ Exception -> 0x011c }
        if (r0 != 0) goto L_0x0161;
    L_0x00c8:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x011c }
        r0.<init>();	 Catch:{ Exception -> 0x011c }
        r1 = f1474z;	 Catch:{ Exception -> 0x011c }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ Exception -> 0x011c }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x011c }
        r1 = 0;
        r1 = fr.pcsoft.wdjava.core.C0725i.m3031a(r4, r1);	 Catch:{ Exception -> 0x011c }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x011c }
        r0 = r0.toString();	 Catch:{ Exception -> 0x011c }
        r1 = r0;
    L_0x00e4:
        r0 = fr.pcsoft.wdjava.core.poo.C0735q.m3130e(r1);	 Catch:{ Exception -> 0x011c }
        r2 = fr.pcsoft.wdjava.core.poo.C0733z.class;
        r2 = r2.isAssignableFrom(r0);	 Catch:{ Exception -> 0x011c }
        if (r2 == 0) goto L_0x0136;
    L_0x00f0:
        r2 = fr.pcsoft.wdjava.core.poo.C0735q.m3122a(r0, r5, r6);	 Catch:{ Exception -> 0x011c }
        if (r2 == 0) goto L_0x0136;
    L_0x00f6:
        r0 = new fr.pcsoft.wdjava.core.WDCallback;	 Catch:{ Exception -> 0x011c }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x011c }
        r3.<init>();	 Catch:{ Exception -> 0x011c }
        r1 = r3.append(r1);	 Catch:{ Exception -> 0x011c }
        r3 = ".";
        r1 = r1.append(r3);	 Catch:{ Exception -> 0x011c }
        r1 = r1.append(r5);	 Catch:{ Exception -> 0x011c }
        r1 = r1.toString();	 Catch:{ Exception -> 0x011c }
        r3 = fr.pcsoft.wdjava.core.context.WDAppelContexte.getContexte();	 Catch:{ Exception -> 0x011c }
        r3 = r3.m2721g();	 Catch:{ Exception -> 0x011c }
        r0.<init>(r1, r2, r3);	 Catch:{ Exception -> 0x011c }
        goto L_0x005f;
    L_0x011c:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = f1474z;
        r3 = 7;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r4);
        r1 = r1.toString();
        fr.pcsoft.wdjava.core.debug.C0691a.m2857a(r1, r0);
    L_0x0136:
        r0 = 0;
        goto L_0x005f;
    L_0x0139:
        r5 = fr.pcsoft.wdjava.core.poo.C0735q.m3133h(r5);	 Catch:{ Exception -> 0x00bc }
        r2 = fr.pcsoft.wdjava.core.poo.C0735q.m3122a(r0, r5, r6);	 Catch:{ Exception -> 0x00bc }
        if (r2 == 0) goto L_0x00bd;
    L_0x0143:
        r0 = new fr.pcsoft.wdjava.core.WDCallback;	 Catch:{ Exception -> 0x00bc }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00bc }
        r3.<init>();	 Catch:{ Exception -> 0x00bc }
        r1 = r3.append(r1);	 Catch:{ Exception -> 0x00bc }
        r3 = ".";
        r1 = r1.append(r3);	 Catch:{ Exception -> 0x00bc }
        r1 = r1.append(r5);	 Catch:{ Exception -> 0x00bc }
        r1 = r1.toString();	 Catch:{ Exception -> 0x00bc }
        r0.<init>(r1, r2);	 Catch:{ Exception -> 0x00bc }
        goto L_0x005f;
    L_0x0161:
        r1 = r4;
        goto L_0x00e4;
    L_0x0163:
        r1 = r4;
        goto L_0x008d;
    L_0x0166:
        r1 = r0;
        goto L_0x003e;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.WDCallback.a(java.lang.String, java.lang.String, int):fr.pcsoft.wdjava.core.WDCallback");
    }

    /* renamed from: a */
    public static final WDObjet m2246a(double d) {
        WDObjet c = C0611a.m2309c(12);
        c.setValeur(d);
        return c;
    }

    /* renamed from: a */
    public static final WDObjet m2247a(int i) {
        WDObjet c = C0611a.m2309c(8);
        c.setValeur(i);
        return c;
    }

    /* renamed from: a */
    private WDObjet m2248a(int i, WDObjet... wDObjetArr) {
        try {
            Object e = m2263e();
            C0489p c0489p = e instanceof WDObjet ? (C0489p) ((WDObjet) e).checkType(C0489p.class) : null;
            if (c0489p != null) {
                if (c0489p.isReleased()) {
                    return null;
                }
                C0508h c0508h = (C0508h) c0489p.checkType(C0508h.class);
                if (c0508h != null) {
                    if (!c0508h.estOuverte()) {
                        return null;
                    }
                }
            }
            WDObjet wDObjet = (WDObjet) m2262d().invoke(e, (Object[]) wDObjetArr);
            return wDObjet != null ? wDObjet : new WDVoid(m2259a());
        } catch (Exception e2) {
            throw e2;
        } catch (Exception e22) {
            throw e22;
        } catch (Exception e222) {
            throw e222;
        } catch (Throwable e3) {
            try {
                WDErreurManager.m2888b(e3);
                return null;
            } catch (Throwable e32) {
                if ((i & 4) > 0) {
                    try {
                        C0695c.m2911a().m2915a(e32, null);
                        return null;
                    } catch (Exception e2222) {
                        throw e2222;
                    }
                }
                throw e32;
            }
        }
    }

    /* renamed from: a */
    public static final WDObjet m2249a(long j) {
        WDObjet c = C0611a.m2309c(9);
        c.setValeur(j);
        return c;
    }

    /* renamed from: a */
    public static final WDObjet m2250a(WDObjet wDObjet) {
        WDObjet c = C0611a.m2309c(wDObjet.getTypeVar());
        c.setValeur(wDObjet);
        return c;
    }

    /* renamed from: a */
    public static final WDObjet m2251a(C0486m c0486m, int i, int i2, WDObjet... wDObjetArr) {
        WDCallback a = m2236a(c0486m, wDObjetArr.length, i);
        if (a == null) {
            return null;
        }
        try {
            return a.execute(i2, wDObjetArr);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static final WDObjet m2252a(C0486m c0486m, WDObjet... wDObjetArr) {
        return m2251a(c0486m, 1, 0, wDObjetArr);
    }

    /* renamed from: a */
    public static final WDObjet m2253a(String str) {
        WDObjet c = C0611a.m2309c(WDChaine.m2421c());
        c.setValeur(str);
        return c;
    }

    /* renamed from: a */
    public static final WDObjet m2254a(boolean z) {
        WDObjet c = C0611a.m2309c(1);
        c.setValeur(z);
        return c;
    }

    /* renamed from: b */
    private static WDCallback m2255b(String str, int i) {
        String[] nomCollectionProcedure = WDProjet.getInstance().getNomCollectionProcedure();
        if (nomCollectionProcedure != null) {
            int i2 = 0;
            while (i2 < nomCollectionProcedure.length) {
                String str2 = nomCollectionProcedure[i2];
                try {
                    Method a = C0735q.m3122a(C0735q.m3130e(str2), str, i);
                    if (a != null) {
                        return new WDCallback(str2 + "." + str, a);
                    }
                    i2++;
                } catch (Exception e) {
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final WDCallback m2256b(String str, int i, WDObjet wDObjet) {
        return m2243a(str, i, wDObjet, false);
    }

    /* renamed from: z */
    private static String m2257z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 94;
                    break;
                case 1:
                    i2 = 61;
                    break;
                case 2:
                    i2 = 92;
                    break;
                case 3:
                    i2 = 72;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2258z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 18);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final String m2259a() {
        String str = this.f1475d;
        if (str.endsWith(f1474z[8])) {
            str = str.substring(0, str.length() - f1474z[8].length());
        }
        return C0735q.m3133h(str);
    }

    /* renamed from: b */
    public final int m2260b() {
        return this.f1476f.getParameterTypes().length;
    }

    /* renamed from: c */
    public void m2261c() {
        this.f1475d = null;
        this.f1476f = null;
        this.f1477g = null;
    }

    /* renamed from: d */
    public final Method m2262d() {
        return this.f1476f;
    }

    /* renamed from: e */
    public final Object m2263e() {
        return this.f1477g;
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof WDCallback) {
                    try {
                        if (this.f1476f != null) {
                            if (this.f1476f.equals(((WDCallback) obj).f1476f)) {
                                try {
                                    if (this.f1477g == ((WDCallback) obj).f1477g) {
                                        return true;
                                    }
                                } catch (RuntimeException e) {
                                    throw e;
                                }
                            }
                        }
                        return false;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (RuntimeException e22) {
                        throw e22;
                    }
                }
            } catch (RuntimeException e222) {
                throw e222;
            }
        }
        return false;
    }

    public WDObjet execute(int i, WDObjet... wDObjetArr) {
        int b = m2260b();
        if (wDObjetArr != null) {
            try {
                int length = wDObjetArr.length;
            } catch (RuntimeException e) {
                throw e;
            }
        }
        length = 0;
        if (b < length) {
            if ((i & 1) != 1) {
                Object obj = new WDObjet[b];
                System.arraycopy(wDObjetArr, 0, obj, 0, b);
                wDObjetArr = obj;
            }
        } else if (b != length) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1474z[11], m2259a(), String.valueOf(b), String.valueOf(wDObjetArr.length)));
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        if ((i & 2) == 2) {
            try {
                if (!C0938m.m6815b()) {
                    return (WDObjet) C0938m.m6807a(new C0726j(this, i, wDObjetArr));
                }
            } catch (RuntimeException e22) {
                throw e22;
            }
        }
        return m2248a(i, wDObjetArr);
    }

    public WDObjet execute(WDObjet... wDObjetArr) {
        return execute(0, wDObjetArr);
    }

    public final String getName() {
        return this.f1475d;
    }
}
