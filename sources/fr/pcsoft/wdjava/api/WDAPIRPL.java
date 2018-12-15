package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.database.hf.rpl.C0871b;
import fr.pcsoft.wdjava.database.hf.rpl.WDRPL;

public class WDAPIRPL {
    /* renamed from: a */
    private static final int f1222a = 1;
    /* renamed from: z */
    private static final String[] f1223z = new String[]{m1661z(m1662z("h+V\u001e-\u0007<N\t.\u001f*F\u0002\"\r*J\u00044\u000e1")), m1661z(m1662z("h1L\u001c1\u0002 V\u001f$\u0005 A\u001e2\u0005*Z\t")), m1661z(m1662z("h1L\u001c1\u0002 V\u00053\u00027@\r1\u00020L")), m1661z(m1662z("h+V\u001e-\u0007<Y\r.\u0018&")), m1661z(m1662z("h+V\u000f/\u000e&V\u001e8\u001b/@\u000f<\u0014.H\u0005)\u0019&")), m1661z(m1662z("h+V\u001e8\b1L\t\"\u0019&Y\u00004\b\"V\r?\u0004-G\t")), m1661z(m1662z("h+V\u000b8\u0019&V\u001e8\u001b/@\u000f<\u001f*F\u0002")), m1661z(m1662z("h1L\u001c1\u0002 V\u00053\r,")), m1661z(m1662z("h1L\u001c1\u0002 V\u0003(\u001d1L")), m1661z(m1662z("h+V\u000f/\u000e&V\u001e8\u001b/@\u000f<\u00147[\r3\u00183F\u001e)\n!E\t")), m1661z(m1662z("h1L\u001c1\u0002 V\u001f(\u001b3[\u00050\u000e<H\u000e2\u0005-L\u00018\u00057")), m1661z(m1662z("h+V\u000f/\u000e&V\u001e8\u001b/@\u000f<\u0014\"K\u00033\u0005&")), m1661z(m1662z("h+V\u001f$\u0005 A\u001e2\u0005*Z\t\"\u0019&Y\u00004\b\"")), m1661z(m1662z("h+V\u001e-\u0007<N\t.\u001f*F\u0002\"\u00196K\u001e4\u001a6L")), m1661z(m1662z("h+V\u001e-\u0007<M\t>\u0007\"[\t\"\u0007*H\u0005.\u0004-"))};

    public static final WDEntier4 hCreeReplicaAbonne(String str, String str2) {
        return hCreeReplicaAbonne(str, str2, "", 0, "");
    }

    public static final WDEntier4 hCreeReplicaAbonne(String str, String str2, String str3) {
        return hCreeReplicaAbonne(str, str2, str3, 0, "");
    }

    public static final WDEntier4 hCreeReplicaAbonne(String str, String str2, String str3, int i) {
        return hCreeReplicaAbonne(str, str2, str3, i, "");
    }

    public static final WDEntier4 hCreeReplicaAbonne(String str, String str2, String str3, int i, String str4) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2776a(f1223z[11], 1);
        try {
            wDEntier4 = new WDEntier4(WDRPL.m6141a(str, str2, str3, i, str4));
        } catch (C0871b e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier4 = new WDEntier4(0);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static final WDBooleen hCreeReplicaMaitre() {
        return hCreeReplicaMaitre("");
    }

    public static final WDBooleen hCreeReplicaMaitre(String str) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1223z[4], 1);
        try {
            wDBooleen = new WDBooleen(WDRPL.m6158c(str));
        } catch (C0871b e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final WDBooleen hCreeReplicaTransportable(String str, String str2, String str3) {
        return hCreeReplicaTransportable(str, str2, str3, null);
    }

    public static final WDBooleen hCreeReplicaTransportable(String str, String str2, String str3, C0486m c0486m) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1223z[9], 1);
        try {
            wDBooleen = new WDBooleen(WDRPL.m6151a(str, str2, str3, c0486m));
        } catch (C0871b e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final WDEntier4 hGereReplication(int i) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2776a(f1223z[6], 1);
        try {
            wDEntier4 = new WDEntier4(WDRPL.m6139a(i));
        } catch (C0871b e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier4 = new WDEntier4(0);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static final WDEntier4 hRecreeReplicaAbonne(String str, String str2, String str3) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2776a(f1223z[5], 1);
        try {
            wDEntier4 = new WDEntier4(WDRPL.m6140a(str, str2, str3));
        } catch (C0871b e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier4 = new WDEntier4(0);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static final WDBooleen hRplDeclareLiaison(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1223z[14], 1);
        try {
            wDBooleen = new WDBooleen(WDRPL.m6147a(wDObjet, wDObjet2, wDObjet3, wDObjet4));
        } catch (C0871b e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final void hRplGestionFichier(WDObjet wDObjet, int i) {
        hRplGestionFichier(wDObjet, i, 3);
    }

    public static final void hRplGestionFichier(WDObjet wDObjet, int i, int i2) {
        WDContexte a = C0677k.m2776a(f1223z[0], 1);
        try {
            WDRPL.m6145a(wDObjet, i, i2);
        } catch (C0871b e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
        } finally {
            a.m2735v();
        }
    }

    public static final void hRplGestionRubrique(WDObjet wDObjet, WDObjet wDObjet2, int i) {
        WDContexte a = C0677k.m2776a(f1223z[13], 1);
        try {
            WDRPL.m6146a(wDObjet, wDObjet2, i);
        } catch (C0871b e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
        } finally {
            a.m2735v();
        }
    }

    public static final void hRplPasse() {
        hRplPasse("");
    }

    public static final void hRplPasse(String str) {
        WDContexte a = C0677k.m2776a(f1223z[3], 1);
        try {
            WDRPL.m6155b(str);
        } catch (C0871b e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hSynchroniseReplica(String str, String str2, int i) {
        return hSynchroniseReplica(str, str2, i, 1);
    }

    public static final WDBooleen hSynchroniseReplica(String str, String str2, int i, int i2) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1223z[12], 1);
        try {
            wDBooleen = new WDBooleen(WDRPL.m6150a(str, str2, i, i2));
        } catch (C0871b e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final fr.pcsoft.wdjava.core.WDObjet replicInfo(java.lang.String r3, int r4) {
        /*
        r0 = f1223z;
        r1 = 7;
        r0 = r0[r1];
        r1 = 1;
        r1 = fr.pcsoft.wdjava.core.context.C0677k.m2776a(r0, r1);
        r2 = fr.pcsoft.wdjava.database.hf.rpl.WDRPL.m6143a(r3, r4);	 Catch:{ b -> 0x0022 }
        r0 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r2);	 Catch:{ b -> 0x0020 }
        if (r0 != 0) goto L_0x0017;
    L_0x0014:
        switch(r4) {
            case 1: goto L_0x0038;
            case 2: goto L_0x0041;
            case 3: goto L_0x004a;
            case 4: goto L_0x0053;
            default: goto L_0x0017;
        };
    L_0x0017:
        r0 = new fr.pcsoft.wdjava.core.types.WDChaine;	 Catch:{ b -> 0x0022 }
        r0.<init>(r2);	 Catch:{ b -> 0x0022 }
        r1.m2735v();
    L_0x001f:
        return r0;
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        r2 = r0.getMessage();	 Catch:{ all -> 0x005c }
        r0 = r0.m1561f();	 Catch:{ all -> 0x005c }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2879a(r1, r2, r0);	 Catch:{ all -> 0x005c }
        r0 = new fr.pcsoft.wdjava.core.types.WDBooleen;	 Catch:{ all -> 0x005c }
        r2 = 0;
        r0.<init>(r2);	 Catch:{ all -> 0x005c }
        r1.m2735v();
        goto L_0x001f;
    L_0x0038:
        r0 = new fr.pcsoft.wdjava.core.types.WDBooleen;	 Catch:{ b -> 0x0022 }
        r0.<init>(r2);	 Catch:{ b -> 0x0022 }
        r1.m2735v();
        goto L_0x001f;
    L_0x0041:
        r0 = new fr.pcsoft.wdjava.core.types.WDBooleen;	 Catch:{ b -> 0x0022 }
        r0.<init>(r2);	 Catch:{ b -> 0x0022 }
        r1.m2735v();
        goto L_0x001f;
    L_0x004a:
        r0 = new fr.pcsoft.wdjava.core.types.WDDate;	 Catch:{ b -> 0x0022 }
        r0.<init>(r2);	 Catch:{ b -> 0x0022 }
        r1.m2735v();
        goto L_0x001f;
    L_0x0053:
        r0 = new fr.pcsoft.wdjava.core.types.WDDate;	 Catch:{ b -> 0x0022 }
        r0.<init>(r2);	 Catch:{ b -> 0x0022 }
        r1.m2735v();
        goto L_0x001f;
    L_0x005c:
        r0 = move-exception;
        r1.m2735v();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.api.WDAPIRPL.replicInfo(java.lang.String, int):fr.pcsoft.wdjava.core.WDObjet");
    }

    public static final WDBooleen replicInitialise(String str) {
        return replicInitialise(str, new WDObjet[0]);
    }

    public static final WDBooleen replicInitialise(String str, WDObjet... wDObjetArr) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1223z[2], 1);
        try {
            wDBooleen = new WDBooleen(WDRPL.m6153a(str, wDObjetArr));
        } catch (C0871b e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final WDBooleen replicOuvre(String str) {
        return replicOuvre(str, "");
    }

    public static final WDBooleen replicOuvre(String str, String str2) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1223z[8], 1);
        try {
            wDBooleen = new WDBooleen(WDRPL.m6149a(str, str2));
        } catch (C0871b e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final WDBooleen replicOuvre(String str, String str2, String str3, String str4, String str5) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1223z[8], 1);
        try {
            wDBooleen = new WDBooleen(WDRPL.m6152a(str, str2, str3, str4, str5));
        } catch (C0871b e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final WDObjet replicSupprimeAbonnement(String str) {
        WDObjet wDBooleen;
        WDContexte a = C0677k.m2776a(f1223z[10], 1);
        try {
            wDBooleen = new WDBooleen(WDRPL.m6148a(str));
        } catch (C0871b e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final WDBooleen replicSynchronise(String str) {
        return replicSynchronise(str, 2);
    }

    public static final WDBooleen replicSynchronise(String str, int i) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1223z[1], 1);
        try {
            wDBooleen = new WDBooleen(WDRPL.m6156b(str, i));
        } catch (C0871b e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    /* renamed from: z */
    private static String m1661z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 75;
                    break;
                case 1:
                    i2 = 99;
                    break;
                case 2:
                    i2 = 9;
                    break;
                case 3:
                    i2 = 76;
                    break;
                default:
                    i2 = 125;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1662z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 125);
        }
        return toCharArray;
    }
}
