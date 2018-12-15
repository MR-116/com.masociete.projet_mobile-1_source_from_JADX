package fr.pcsoft.wdjava.p059n;

import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.HashMap;

/* renamed from: fr.pcsoft.wdjava.n.g */
public class C0969g {
    /* renamed from: a */
    public static boolean f2716a = true;
    /* renamed from: b */
    public static boolean f2717b = true;
    /* renamed from: c */
    private static HashMap f2718c = null;
    /* renamed from: z */
    private static final String[] f2719z = new String[]{C0969g.m7025z(C0969g.m7026z("vV=jI\u0016L2gO\u0001F,gS\u0006\\=iI\u0001")), C0969g.m7025z(C0969g.m7026z("vV=jI\u0016L;a^\u001cG+pI\n@1aG\u0010G")), C0969g.m7025z(C0969g.m7026z("vC?pM\u0018L7lZ\u0014_7fI\n@1aG\u0010G!a@\u001cV0vS\u001c]8m")), C0969g.m7025z(C0969g.m7026z("vV=jI\u0016L+vE\u0019Z-cX\u001c\\0}_\u001aP5gX")), C0969g.m7025z(C0969g.m7026z("vV=jI\u0016L=mB\u001bV&kC\u001bL-mO\u001eV*")), C0969g.m7025z(C0969g.m7026z("v@1aG\u0010G!gT\u001c@*cB\u0001V")), C0969g.m7025z(C0969g.m7026z("v]+oS\u0005\\,vS\u001c](c@\u001cW;")), C0969g.m7025z(C0969g.m7026z("v@1aG\u0010G!cH\u0007V-qI\nZ0aC\u001b]+g")), C0969g.m7025z(C0969g.m7026z("v]1oS\u0006\\=iI\u0001L(kH\u0010")), C0969g.m7025z(C0969g.m7026z("vR+aY\u001bV!fI\u0018R0fI\nP1lB\u0010K7mB")), C0969g.m7025z(C0969g.m7026z("v@1aG\u0010G!vU\u0005V!v^\u0014]-oE\u0006@7mB\nZ0tM\u0019Z:g")), C0969g.m7025z(C0969g.m7026z("vV=jI\u0016L=pI\u0014G7mB\n@1aG\u0010G")), C0969g.m7025z(C0969g.m7026z("vV=jI\u0016L?q_\u001aP7cX\u001c\\0}_\u001aP5gX")), C0969g.m7025z(C0969g.m7026z("v@1aG\u0010G!kB\u0010K7qX\u0014]*g"))};

    static {
        WDProjet.getInstance().ajouterEcouteurProjet(new C0970h());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static final synchronized fr.pcsoft.wdjava.p059n.C0965a m7009a(java.lang.String r4, boolean r5) {
        /*
        r1 = fr.pcsoft.wdjava.p059n.C0969g.class;
        monitor-enter(r1);
        r0 = f2718c;	 Catch:{ all -> 0x002a }
        if (r0 == 0) goto L_0x0013;
    L_0x0007:
        r0 = f2718c;	 Catch:{ all -> 0x002a }
        r0 = r0.get(r4);	 Catch:{ all -> 0x002a }
        r0 = (fr.pcsoft.wdjava.p059n.C0965a) r0;	 Catch:{ all -> 0x002a }
        if (r0 == 0) goto L_0x0013;
    L_0x0011:
        monitor-exit(r1);
        return r0;
    L_0x0013:
        if (r5 == 0) goto L_0x0028;
    L_0x0015:
        r0 = f2719z;	 Catch:{ all -> 0x002a }
        r2 = 13;
        r0 = r0[r2];	 Catch:{ all -> 0x002a }
        r2 = 1;
        r2 = new java.lang.String[r2];	 Catch:{ all -> 0x002a }
        r3 = 0;
        r2[r3] = r4;	 Catch:{ all -> 0x002a }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r2);	 Catch:{ all -> 0x002a }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ all -> 0x002a }
    L_0x0028:
        r0 = 0;
        goto L_0x0011;
    L_0x002a:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.n.g.a(java.lang.String, boolean):fr.pcsoft.wdjava.n.a");
    }

    /* renamed from: a */
    private static final synchronized void m7010a() {
        synchronized (C0969g.class) {
            try {
                if (f2718c != null) {
                    for (C0965a g : f2718c.values()) {
                        try {
                            g.mo3249g();
                        } catch (Exception e) {
                        }
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        return;
    }

    /* renamed from: a */
    public static final void m7011a(String str, int i, String str2) {
        C0965a a = C0969g.m7009a(str, true);
        if (i < 0 || i > 3) {
            WDErreurManager.m2883a(C0745b.m3222b(f2719z[10], new String[0]));
        }
        synchronized (a) {
            a.mo3252a(i);
            a.m6952a(str2);
        }
    }

    /* renamed from: a */
    public static final synchronized void m7012a(String str, C0965a c0965a) {
        synchronized (C0969g.class) {
            if (f2718c == null) {
                f2718c = new HashMap();
            }
            f2718c.put(str, c0965a);
        }
    }

    /* renamed from: a */
    public static final void m7013a(String str, byte[] bArr) throws C0971i {
        try {
            C0969g.m7009a(str, true).mo3253a(bArr);
        } catch (IOException e) {
            throw new C0971i(C0745b.m3222b(f2719z[1], new String[0]), e.getMessage());
        }
    }

    /* renamed from: a */
    public static final void m7014a(String str, byte[] bArr, String str2, int i) throws C0971i {
        try {
            C0969g.m7009a(str, true).mo3254a(bArr, str2, i);
        } catch (IOException e) {
            throw new C0971i(C0745b.m3222b(f2719z[1], str), e.getMessage());
        }
    }

    /* renamed from: a */
    public static final synchronized boolean m7015a(String str) {
        boolean containsKey;
        synchronized (C0969g.class) {
            containsKey = f2718c == null ? false : f2718c.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: a */
    public static final boolean m7016a(String str, int i) throws C0971i {
        try {
            return C0969g.m7009a(str, true).mo3246d(Math.max(0, i));
        } catch (IOException e) {
            throw new C0971i(C0745b.m3222b(f2719z[3], str), e.getMessage());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static final boolean m7017a(java.lang.String r6, int r7, java.lang.String r8, int r9) throws fr.pcsoft.wdjava.p059n.C0971i {
        /*
        r0 = 1;
        r1 = 0;
        if (r6 == 0) goto L_0x000c;
    L_0x0004:
        r2 = "";
        r2 = r6.equals(r2);	 Catch:{ IOException -> 0x005c }
        if (r2 == 0) goto L_0x001c;
    L_0x000c:
        r2 = f2719z;	 Catch:{ IOException -> 0x005c }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ IOException -> 0x005c }
        r3 = 0;
        r3 = new java.lang.String[r3];	 Catch:{ IOException -> 0x005c }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);	 Catch:{ IOException -> 0x005c }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r2);	 Catch:{ IOException -> 0x005c }
    L_0x001c:
        if (r7 < r0) goto L_0x0023;
    L_0x001e:
        r2 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r7 <= r2) goto L_0x0039;
    L_0x0023:
        r2 = f2719z;	 Catch:{ IOException -> 0x005e }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ IOException -> 0x005e }
        r3 = 1;
        r3 = new java.lang.String[r3];	 Catch:{ IOException -> 0x005e }
        r4 = 0;
        r5 = java.lang.String.valueOf(r7);	 Catch:{ IOException -> 0x005e }
        r3[r4] = r5;	 Catch:{ IOException -> 0x005e }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);	 Catch:{ IOException -> 0x005e }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r2);	 Catch:{ IOException -> 0x005e }
    L_0x0039:
        r2 = fr.pcsoft.wdjava.p059n.C0969g.m7015a(r6);	 Catch:{ IOException -> 0x0060 }
        if (r2 == 0) goto L_0x0051;
    L_0x003f:
        r2 = f2719z;	 Catch:{ IOException -> 0x0060 }
        r3 = 5;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0060 }
        r3 = 1;
        r3 = new java.lang.String[r3];	 Catch:{ IOException -> 0x0060 }
        r4 = 0;
        r3[r4] = r6;	 Catch:{ IOException -> 0x0060 }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);	 Catch:{ IOException -> 0x0060 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r2);	 Catch:{ IOException -> 0x0060 }
    L_0x0051:
        r2 = new fr.pcsoft.wdjava.n.c;	 Catch:{ IOException -> 0x0064 }
        r2.<init>(r7, r8, r9);	 Catch:{ IOException -> 0x0064 }
        if (r2 == 0) goto L_0x0062;
    L_0x0058:
        fr.pcsoft.wdjava.p059n.C0969g.m7012a(r6, r2);	 Catch:{ IOException -> 0x0064 }
    L_0x005b:
        return r0;
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r0 = move-exception;
        throw r0;
    L_0x0060:
        r0 = move-exception;
        throw r0;
    L_0x0062:
        r0 = r1;
        goto L_0x005b;
    L_0x0064:
        r0 = move-exception;
        r2 = r0;
        r0 = "";
        r0 = r2 instanceof java.net.UnknownHostException;
        if (r0 == 0) goto L_0x0081;
    L_0x006c:
        r0 = f2719z;
        r3 = 7;
        r0 = r0[r3];
        r1 = new java.lang.String[r1];
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);
    L_0x0077:
        r1 = new fr.pcsoft.wdjava.n.i;
        r2 = r2.getMessage();
        r1.<init>(r0, r2);
        throw r1;
    L_0x0081:
        r0 = f2719z;
        r3 = 4;
        r0 = r0[r3];
        r1 = new java.lang.String[r1];
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);
        goto L_0x0077;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.n.g.a(java.lang.String, int, java.lang.String, int):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static final synchronized boolean m7018a(java.lang.String r7, java.lang.String r8, int r9, boolean r10) throws fr.pcsoft.wdjava.p059n.C0971i {
        /*
        r0 = 1;
        r1 = 0;
        r3 = fr.pcsoft.wdjava.p059n.C0969g.class;
        monitor-enter(r3);
        if (r7 == 0) goto L_0x000f;
    L_0x0007:
        r2 = "";
        r2 = r7.equals(r2);	 Catch:{ IOException -> 0x0062 }
        if (r2 == 0) goto L_0x001f;
    L_0x000f:
        r2 = f2719z;	 Catch:{ IOException -> 0x0062 }
        r4 = 8;
        r2 = r2[r4];	 Catch:{ IOException -> 0x0062 }
        r4 = 0;
        r4 = new java.lang.String[r4];	 Catch:{ IOException -> 0x0062 }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r4);	 Catch:{ IOException -> 0x0062 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r2);	 Catch:{ IOException -> 0x0062 }
    L_0x001f:
        if (r9 < r0) goto L_0x0026;
    L_0x0021:
        r2 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r9 <= r2) goto L_0x003c;
    L_0x0026:
        r2 = f2719z;	 Catch:{ IOException -> 0x0067 }
        r4 = 6;
        r2 = r2[r4];	 Catch:{ IOException -> 0x0067 }
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ IOException -> 0x0067 }
        r5 = 0;
        r6 = java.lang.String.valueOf(r9);	 Catch:{ IOException -> 0x0067 }
        r4[r5] = r6;	 Catch:{ IOException -> 0x0067 }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r4);	 Catch:{ IOException -> 0x0067 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r2);	 Catch:{ IOException -> 0x0067 }
    L_0x003c:
        r2 = fr.pcsoft.wdjava.p059n.C0969g.m7015a(r7);	 Catch:{ IOException -> 0x0069 }
        if (r2 == 0) goto L_0x0054;
    L_0x0042:
        r2 = f2719z;	 Catch:{ IOException -> 0x0069 }
        r4 = 5;
        r2 = r2[r4];	 Catch:{ IOException -> 0x0069 }
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ IOException -> 0x0069 }
        r5 = 0;
        r4[r5] = r7;	 Catch:{ IOException -> 0x0069 }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r4);	 Catch:{ IOException -> 0x0069 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r2);	 Catch:{ IOException -> 0x0069 }
    L_0x0054:
        if (r10 == 0) goto L_0x006b;
    L_0x0056:
        r2 = new fr.pcsoft.wdjava.n.f;	 Catch:{ IOException -> 0x0071 }
        r2.<init>(r9, r8);	 Catch:{ IOException -> 0x0071 }
    L_0x005b:
        if (r2 == 0) goto L_0x00be;
    L_0x005d:
        fr.pcsoft.wdjava.p059n.C0969g.m7012a(r7, r2);	 Catch:{ IOException -> 0x0071 }
    L_0x0060:
        monitor-exit(r3);
        return r0;
    L_0x0062:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0064 }
    L_0x0064:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0064 }
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0064 }
    L_0x006b:
        r2 = new fr.pcsoft.wdjava.n.d;	 Catch:{ IOException -> 0x0071 }
        r2.<init>(r9, r8);	 Catch:{ IOException -> 0x0071 }
        goto L_0x005b;
    L_0x0071:
        r0 = move-exception;
        r1 = f2719z;	 Catch:{ all -> 0x0064 }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ all -> 0x0064 }
        r2 = 1;
        r2 = new java.lang.String[r2];	 Catch:{ all -> 0x0064 }
        r4 = 0;
        r2[r4] = r7;	 Catch:{ all -> 0x0064 }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r2);	 Catch:{ all -> 0x0064 }
        r2 = r0 instanceof java.net.UnknownHostException;	 Catch:{ all -> 0x0064 }
        if (r2 == 0) goto L_0x00b4;
    L_0x0086:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0064 }
        r2.<init>();	 Catch:{ all -> 0x0064 }
        r1 = r2.append(r1);	 Catch:{ all -> 0x0064 }
        r2 = "\n";
        r1 = r1.append(r2);	 Catch:{ all -> 0x0064 }
        r2 = f2719z;	 Catch:{ all -> 0x0064 }
        r4 = 12;
        r2 = r2[r4];	 Catch:{ all -> 0x0064 }
        r4 = 2;
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x0064 }
        r5 = 0;
        r6 = java.lang.String.valueOf(r9);	 Catch:{ all -> 0x0064 }
        r4[r5] = r6;	 Catch:{ all -> 0x0064 }
        r5 = 1;
        r4[r5] = r8;	 Catch:{ all -> 0x0064 }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r4);	 Catch:{ all -> 0x0064 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x0064 }
        r1 = r1.toString();	 Catch:{ all -> 0x0064 }
    L_0x00b4:
        r2 = new fr.pcsoft.wdjava.n.i;	 Catch:{ all -> 0x0064 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0064 }
        r2.<init>(r1, r0);	 Catch:{ all -> 0x0064 }
        throw r2;	 Catch:{ all -> 0x0064 }
    L_0x00be:
        r0 = r1;
        goto L_0x0060;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.n.g.a(java.lang.String, java.lang.String, int, boolean):boolean");
    }

    /* renamed from: a */
    public static final byte[] m7019a(String str, boolean z, int i, int i2) throws C0971i {
        try {
            return C0969g.m7009a(str, true).mo3255a(z ? 0 : Math.abs(i), i2);
        } catch (SocketTimeoutException e) {
            return null;
        } catch (IOException e2) {
            throw new C0971i(C0745b.m3222b(f2719z[0], new String[0]), e2.getMessage());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public static final java.lang.String m7020b(java.lang.String r3, int r4) {
        /*
        r2 = 2;
        r0 = 1;
        r1 = fr.pcsoft.wdjava.p059n.C0969g.m7009a(r3, r0);
        monitor-enter(r1);
        if (r4 != r0) goto L_0x000f;
    L_0x0009:
        r0 = r1.mo3247e();	 Catch:{ all -> 0x001d }
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
    L_0x000e:
        return r0;
    L_0x000f:
        if (r4 != r2) goto L_0x0020;
    L_0x0011:
        r0 = r1.mo3248f();	 Catch:{ all -> 0x001d }
        if (r0 < 0) goto L_0x002f;
    L_0x0017:
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x001d }
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        goto L_0x000e;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        throw r0;
    L_0x0020:
        r0 = f2719z;	 Catch:{ all -> 0x001d }
        r2 = 2;
        r0 = r0[r2];	 Catch:{ all -> 0x001d }
        r2 = 0;
        r2 = new java.lang.String[r2];	 Catch:{ all -> 0x001d }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r2);	 Catch:{ all -> 0x001d }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ all -> 0x001d }
    L_0x002f:
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        r0 = "";
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.n.g.b(java.lang.String, int):java.lang.String");
    }

    /* renamed from: b */
    public static final synchronized void m7021b(String str) {
        synchronized (C0969g.class) {
            if (f2718c != null) {
                C0965a c0965a = (C0965a) f2718c.remove(str);
                if (c0965a != null) {
                    c0965a.mo3250h();
                }
            }
        }
    }

    /* renamed from: c */
    public static final String m7022c(String str) throws C0971i {
        String str2 = "";
        try {
            C0965a d = C0969g.m7009a(str, true).mo3245d();
            if (d != null) {
                String a = C0808l.m4013a(16);
                C0969g.m7012a(a, d);
                return a;
            }
            throw new C0971i(C0745b.m3222b(f2719z[9], str));
        } catch (IOException e) {
            throw new C0971i(C0745b.m3222b(f2719z[3], str), e.getMessage());
        }
    }

    /* renamed from: d */
    public static final void m7023d(String str) throws C0971i {
        try {
            C0969g.m7009a(str, true).mo3249g();
            C0969g.m7021b(str);
        } catch (IOException e) {
            throw new C0971i(C0745b.m3222b(f2719z[3], str), e.getMessage());
        }
    }

    /* renamed from: e */
    public static final boolean m7024e(String str) throws C0971i {
        try {
            return C0969g.m7009a(str, true).mo3251j();
        } catch (IOException e) {
            throw new C0971i(C0745b.m3222b(f2719z[3], str), e.getMessage());
        }
    }

    /* renamed from: z */
    private static String m7025z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 85;
                    break;
                case 1:
                    i2 = 19;
                    break;
                case 2:
                    i2 = 126;
                    break;
                case 3:
                    i2 = 34;
                    break;
                default:
                    i2 = 12;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7026z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 12);
        }
        return toCharArray;
    }
}
