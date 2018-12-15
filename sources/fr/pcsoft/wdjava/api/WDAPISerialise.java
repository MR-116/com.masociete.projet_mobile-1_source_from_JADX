package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p043d.C0688c;
import fr.pcsoft.wdjava.core.p043d.C0689d;
import fr.pcsoft.wdjava.core.p043d.C0690f;
import fr.pcsoft.wdjava.core.p043d.p044a.C0683c;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;

public class WDAPISerialise {
    /* renamed from: z */
    private static final String[] f1226z = new String[]{m1666z(m1667z("()4'8J68&4")), m1666z(m1667z("(<>'<J..&4Y3098X;%<>E%8;2D(#02_")), m1666z(m1667z("(.(%4T3?#0G350.[5$'.X?#<0G3\"4%B5?")), m1666z(m1667z("(>4&4Y3098X?"))};

    public static WDBooleen deserialise(WDObjet wDObjet, WDObjet wDObjet2, int i) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1226z[3]);
        C0683c c0683c = null;
        try {
            C0688c c0688c = (C0688c) wDObjet.checkType(C0688c.class);
            if (c0688c == null) {
                WDErreurManager.m2883a(C0745b.m3222b(f1226z[2], new String[0]));
            }
            C0689d.m2852a(i).mo2584a(wDObjet2, c0688c);
            wDBooleen = new WDBooleen(true);
            if (c0683c != null) {
                try {
                    c0683c.m2822b();
                } catch (C0690f e) {
                    throw e;
                }
            }
            a.m2735v();
        } catch (C0690f e2) {
            throw e2;
        } catch (C0690f e22) {
            try {
                WDErreurManager.m2883a(e22.getMessage());
                wDBooleen = new WDBooleen(false);
                if (c0683c != null) {
                    try {
                        c0683c.m2822b();
                    } catch (C0690f e222) {
                        throw e222;
                    }
                }
                a.m2735v();
            } catch (Throwable th) {
                if (c0683c != null) {
                    try {
                        c0683c.m2822b();
                    } catch (C0690f e2222) {
                        throw e2222;
                    }
                }
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void serialise(fr.pcsoft.wdjava.core.WDObjet r6, fr.pcsoft.wdjava.core.WDObjet r7, int r8) {
        /*
        r1 = 0;
        r0 = f1226z;
        r0 = r0[r1];
        r2 = fr.pcsoft.wdjava.core.context.C0677k.m2775a(r0);
        r3 = 0;
        r0 = fr.pcsoft.wdjava.core.p043d.C0688c.class;
        r0 = r6.checkType(r0);	 Catch:{ f -> 0x0054 }
        r0 = (fr.pcsoft.wdjava.core.p043d.C0688c) r0;	 Catch:{ f -> 0x0054 }
        if (r0 != 0) goto L_0x0023;
    L_0x0014:
        r1 = f1226z;	 Catch:{ f -> 0x0052 }
        r4 = 2;
        r1 = r1[r4];	 Catch:{ f -> 0x0052 }
        r4 = 0;
        r4 = new java.lang.String[r4];	 Catch:{ f -> 0x0052 }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r4);	 Catch:{ f -> 0x0052 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r1);	 Catch:{ f -> 0x0052 }
    L_0x0023:
        r1 = fr.pcsoft.wdjava.core.types.WDChaine.class;
        r1 = r7.checkType(r1);	 Catch:{ f -> 0x0054 }
        r1 = (fr.pcsoft.wdjava.core.types.WDChaine) r1;	 Catch:{ f -> 0x0054 }
        if (r1 == 0) goto L_0x0033;
    L_0x002d:
        r4 = r1.isUnicode();	 Catch:{ f -> 0x0065 }
        if (r4 == 0) goto L_0x0042;
    L_0x0033:
        r4 = f1226z;	 Catch:{ f -> 0x0065 }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ f -> 0x0065 }
        r5 = 0;
        r5 = new java.lang.String[r5];	 Catch:{ f -> 0x0065 }
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);	 Catch:{ f -> 0x0065 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r4);	 Catch:{ f -> 0x0065 }
    L_0x0042:
        r4 = fr.pcsoft.wdjava.core.p043d.C0689d.m2853b(r8);	 Catch:{ f -> 0x0054 }
        r4.mo2573a(r0, r1);	 Catch:{ f -> 0x0054 }
        if (r3 == 0) goto L_0x004e;
    L_0x004b:
        r3.mo2572a();
    L_0x004e:
        r2.m2735v();
    L_0x0051:
        return;
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ f -> 0x0054 }
    L_0x0054:
        r0 = move-exception;
        r0 = r0.getMessage();	 Catch:{ all -> 0x0067 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ all -> 0x0067 }
        if (r3 == 0) goto L_0x0061;
    L_0x005e:
        r3.mo2572a();
    L_0x0061:
        r2.m2735v();
        goto L_0x0051;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ f -> 0x0054 }
    L_0x0067:
        r0 = move-exception;
        if (r3 == 0) goto L_0x006d;
    L_0x006a:
        r3.mo2572a();	 Catch:{ f -> 0x0071 }
    L_0x006d:
        r2.m2735v();
        throw r0;
    L_0x0071:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.api.WDAPISerialise.serialise(fr.pcsoft.wdjava.core.WDObjet, fr.pcsoft.wdjava.core.WDObjet, int):void");
    }

    /* renamed from: z */
    private static String m1666z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 11;
                    break;
                case 1:
                    i2 = 122;
                    break;
                case 2:
                    i2 = 113;
                    break;
                case 3:
                    i2 = 117;
                    break;
                default:
                    i2 = 113;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1667z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 113);
        }
        return toCharArray;
    }
}
