package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.types.C0782g;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.geo.C0918i;
import fr.pcsoft.wdjava.geo.WDGeoPosition;
import fr.pcsoft.wdjava.geo.p056a.C0911b;

public class WDAPIGPS {
    /* renamed from: a */
    private static final int f1154a = 1;
    /* renamed from: z */
    private static final String[] f1155z = new String[]{m1623z(m1624z("6\u001d2Q]\\\u0014+V]E\u001b0COP\u000e0G")), m1623z(m1624z("6\u001d2Q]P\u000e#V")), m1623z(m1624z("6\u001d2Q]Q\u001f0LKP\b']RZ\t+VKZ\u0014")), m1623z(m1624z("6\u001d2Q]T\b0GVP\u0005&GVP\u00196KM[")), m1623z(m1624z("6\u001d2Q]\\\u0014$M")), m1623z(m1624z("6\u0019-LQA\u001b,VGJ\u0013,TCY\u0013&G]'")), m1623z(m1624z("6\u001d2Q]Q\u001f6GAA\u001f=RMF\u00136KM[")), m1623z(m1624z("6\u001d2Q]F\u000f+V]Q\u001f2NCV\u001f/GLA")), m1623z(m1624z("6\u001d2Q]A\u001f0OK[\u001f")), m1623z(m1624z("6\u001d2Q]G\u001f!WRP\b']RZ\t+VKZ\u0014"))};

    public static void gpsArreteDetection(int i) {
        WDContexte a = C0677k.m2776a(f1155z[3], 1);
        try {
            C0911b.m6489p().m6494a(i);
        } finally {
            a.m2735v();
        }
    }

    public static WDGeoPosition gpsDernierePosition() {
        WDGeoPosition wDGeoPosition;
        WDContexte a = C0677k.m2776a(f1155z[2], 1);
        try {
            wDGeoPosition = new WDGeoPosition(C0911b.m6489p().m6501d());
        } catch (C0539d e) {
            WDErreurManager.m2876a(a, e);
            wDGeoPosition = new WDGeoPosition(null);
        } finally {
            a.m2735v();
        }
        return wDGeoPosition;
    }

    public static WDEntier4 gpsDetectePosition(C0486m c0486m, double d, double d2) {
        return gpsDetectePosition(c0486m, d, d2, 50.0d, new WDEntier4(-1));
    }

    public static WDEntier4 gpsDetectePosition(C0486m c0486m, double d, double d2, double d3) {
        return gpsDetectePosition(c0486m, d, d2, d3, new WDEntier4(-1));
    }

    public static WDEntier4 gpsDetectePosition(C0486m c0486m, double d, double d2, double d3, WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1155z[6], 1);
        WDEntier4 a2;
        try {
            a2 = C0911b.m6489p().m6492a(c0486m, d, d2, d3, C0725i.m3013a(wDObjet, C0782g.CENTISECOND));
            WDEntier4 wDEntier4 = new WDEntier4((int) a2);
            return wDEntier4;
        } catch (C0539d e) {
            WDErreurManager.m2876a(a, e);
            a2 = new WDEntier4(-1);
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 gpsEtat() {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2776a(f1155z[1], 1);
        try {
            wDEntier4 = new WDEntier4(C0911b.m6489p().m6507l());
        } catch (C0539d e) {
            WDErreurManager.m2876a(a, e);
            wDEntier4 = new WDEntier4(0);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static void gpsEtat(C0486m c0486m) {
        WDContexte a = C0677k.m2776a(f1155z[1], 1);
        if (c0486m != null) {
            try {
                if (!c0486m.toString().equals("")) {
                    C0911b.m6489p().m6496a(c0486m);
                    a.m2735v();
                }
            } catch (C0918i e) {
                throw e;
            } catch (C0539d e2) {
                try {
                    WDErreurManager.m2876a(a, e2);
                    return;
                } finally {
                    a.m2735v();
                }
            }
        }
        C0911b.m6489p().m6510o();
        a.m2735v();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static fr.pcsoft.wdjava.core.WDObjet gpsInfo(int r5) {
        /*
        r2 = 1;
        r0 = f1155z;
        r1 = 4;
        r0 = r0[r1];
        r1 = fr.pcsoft.wdjava.core.context.C0677k.m2776a(r0, r2);
        switch(r5) {
            case 1: goto L_0x002d;
            case 2: goto L_0x0071;
            case 4: goto L_0x004f;
            case 8: goto L_0x003e;
            case 16: goto L_0x0060;
            case 64: goto L_0x0082;
            default: goto L_0x000d;
        };
    L_0x000d:
        r0 = f1155z;	 Catch:{ i -> 0x0093 }
        r2 = 5;
        r0 = r0[r2];	 Catch:{ i -> 0x0093 }
        r2 = 1;
        r2 = new java.lang.String[r2];	 Catch:{ i -> 0x0093 }
        r3 = 0;
        r4 = java.lang.String.valueOf(r5);	 Catch:{ i -> 0x0093 }
        r2[r3] = r4;	 Catch:{ i -> 0x0093 }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r2);	 Catch:{ i -> 0x0093 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ i -> 0x0093 }
        r0 = new fr.pcsoft.wdjava.core.types.WDEntier4;	 Catch:{ i -> 0x0093 }
        r2 = 0;
        r0.<init>(r2);	 Catch:{ i -> 0x0093 }
        r1.m2735v();
    L_0x002c:
        return r0;
    L_0x002d:
        r0 = new fr.pcsoft.wdjava.core.types.WDEntier4;	 Catch:{ i -> 0x0093 }
        r2 = fr.pcsoft.wdjava.geo.p056a.C0911b.m6489p();	 Catch:{ i -> 0x0093 }
        r2 = r2.m6504i();	 Catch:{ i -> 0x0093 }
        r0.<init>(r2);	 Catch:{ i -> 0x0093 }
        r1.m2735v();
        goto L_0x002c;
    L_0x003e:
        r0 = new fr.pcsoft.wdjava.core.types.WDBooleen;	 Catch:{ i -> 0x0093 }
        r2 = fr.pcsoft.wdjava.geo.p056a.C0911b.m6489p();	 Catch:{ i -> 0x0093 }
        r2 = r2.m6505j();	 Catch:{ i -> 0x0093 }
        r0.<init>(r2);	 Catch:{ i -> 0x0093 }
        r1.m2735v();
        goto L_0x002c;
    L_0x004f:
        r0 = new fr.pcsoft.wdjava.core.types.WDBooleen;	 Catch:{ i -> 0x0093 }
        r2 = fr.pcsoft.wdjava.geo.p056a.C0911b.m6489p();	 Catch:{ i -> 0x0093 }
        r2 = r2.m6498a();	 Catch:{ i -> 0x0093 }
        r0.<init>(r2);	 Catch:{ i -> 0x0093 }
        r1.m2735v();
        goto L_0x002c;
    L_0x0060:
        r0 = new fr.pcsoft.wdjava.core.types.WDBooleen;	 Catch:{ i -> 0x0093 }
        r2 = fr.pcsoft.wdjava.geo.p056a.C0911b.m6489p();	 Catch:{ i -> 0x0093 }
        r2 = r2.m6506k();	 Catch:{ i -> 0x0093 }
        r0.<init>(r2);	 Catch:{ i -> 0x0093 }
        r1.m2735v();
        goto L_0x002c;
    L_0x0071:
        r0 = new fr.pcsoft.wdjava.core.types.WDEntier4;	 Catch:{ i -> 0x0093 }
        r2 = fr.pcsoft.wdjava.geo.p056a.C0911b.m6489p();	 Catch:{ i -> 0x0093 }
        r2 = r2.m6502f();	 Catch:{ i -> 0x0093 }
        r0.<init>(r2);	 Catch:{ i -> 0x0093 }
        r1.m2735v();
        goto L_0x002c;
    L_0x0082:
        r0 = new fr.pcsoft.wdjava.core.types.WDEntier4;	 Catch:{ i -> 0x0093 }
        r2 = fr.pcsoft.wdjava.geo.p056a.C0911b.m6489p();	 Catch:{ i -> 0x0093 }
        r2 = r2.m6499b();	 Catch:{ i -> 0x0093 }
        r0.<init>(r2);	 Catch:{ i -> 0x0093 }
        r1.m2735v();
        goto L_0x002c;
    L_0x0093:
        r0 = move-exception;
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2876a(r1, r0);	 Catch:{ all -> 0x00a1 }
        r0 = new fr.pcsoft.wdjava.core.types.WDEntier4;	 Catch:{ all -> 0x00a1 }
        r2 = 0;
        r0.<init>(r2);	 Catch:{ all -> 0x00a1 }
        r1.m2735v();
        goto L_0x002c;
    L_0x00a1:
        r0 = move-exception;
        r1.m2735v();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.api.WDAPIGPS.gpsInfo(int):fr.pcsoft.wdjava.core.WDObjet");
    }

    public static void gpsInitParametre() {
        gpsInitParametre(1, 0);
    }

    public static void gpsInitParametre(int i) {
        gpsInitParametre(i, 0);
    }

    public static void gpsInitParametre(int i, int i2) {
        WDContexte a = C0677k.m2776a(f1155z[0], 1);
        try {
            C0911b.m6489p().m6495a(i, i2);
        } catch (C0539d e) {
            WDErreurManager.m2876a(a, e);
        } finally {
            a.m2735v();
        }
    }

    public static WDGeoPosition gpsRecuperePosition() {
        return gpsRecuperePosition(new WDEntier4(6000), "");
    }

    public static WDGeoPosition gpsRecuperePosition(WDObjet wDObjet) {
        return gpsRecuperePosition(wDObjet, "");
    }

    public static WDGeoPosition gpsRecuperePosition(WDObjet wDObjet, String str) {
        WDGeoPosition wDGeoPosition;
        WDContexte a = C0677k.m2776a(f1155z[9], 1);
        try {
            wDGeoPosition = new WDGeoPosition(C0911b.m6489p().m6493a(C0725i.m3013a(wDObjet, C0782g.CENTISECOND), str));
        } catch (C0539d e) {
            WDErreurManager.m2876a(a, e);
            wDGeoPosition = new WDGeoPosition(null);
        } finally {
            a.m2735v();
        }
        return wDGeoPosition;
    }

    public static void gpsSuitDeplacement() {
        gpsSuitDeplacement(null, new WDEntier4(6000), 5.0d);
    }

    public static void gpsSuitDeplacement(C0486m c0486m) {
        gpsSuitDeplacement(c0486m, new WDEntier4(6000), 5.0d);
    }

    public static void gpsSuitDeplacement(C0486m c0486m, WDObjet wDObjet) {
        gpsSuitDeplacement(c0486m, wDObjet, 5.0d);
    }

    public static void gpsSuitDeplacement(C0486m c0486m, WDObjet wDObjet, double d) {
        WDContexte a = C0677k.m2776a(f1155z[7], 1);
        if (c0486m != null) {
            try {
                if (!c0486m.toString().equals("")) {
                    C0911b.m6489p().m6497a(c0486m, C0725i.m3013a(wDObjet, C0782g.CENTISECOND), d);
                    a.m2735v();
                }
            } catch (C0918i e) {
                throw e;
            } catch (C0539d e2) {
                try {
                    WDErreurManager.m2876a(a, e2);
                    return;
                } finally {
                    a.m2735v();
                }
            }
        }
        C0911b.m6489p().m6508m();
        a.m2735v();
    }

    public static void gpsTermine() {
        WDContexte a = C0677k.m2776a(f1155z[8], 1);
        try {
            C0911b.m6489p().m6500c();
        } catch (C0918i e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
        } finally {
            a.m2735v();
        }
    }

    /* renamed from: z */
    private static String m1623z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 21;
                    break;
                case 1:
                    i2 = 90;
                    break;
                case 2:
                    i2 = 98;
                    break;
                case 3:
                    i2 = 2;
                    break;
                default:
                    i2 = 2;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1624z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 2);
        }
        return toCharArray;
    }
}
