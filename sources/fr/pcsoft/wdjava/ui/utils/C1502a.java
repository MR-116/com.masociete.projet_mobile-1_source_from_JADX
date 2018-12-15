package fr.pcsoft.wdjava.ui.utils;

import fr.pcsoft.wdjava.core.WDIndirection;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.p035c.C0666h;
import fr.pcsoft.wdjava.core.poo.C0735q;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0509v;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.fb;
import fr.pcsoft.wdjava.ui.menu.C0495i;

/* renamed from: fr.pcsoft.wdjava.ui.utils.a */
public class C1502a {
    /* renamed from: z */
    private static final String[] f4556z = new String[]{C1502a.m10419z(C1502a.m10420z("\"|\u0016C.N}\u0019Z\"Of\u0019^)Dk\u000fD3@}\u0012R")), C1502a.m10419z(C1502a.m10420z("\"|\u0016C.N}\u0019Z\"Of\u0019Y(Ol\u0012E(Te\u0003R")), C1502a.m10419z(C1502a.m10420z("\"p\u000eV*Ql\u000fY$N}\bB")), C1502a.m10419z(C1502a.m10420z("\"u\u0003Y\"Ua\u0003H.Op\tY)Tv"))};

    /* renamed from: a */
    private static final WDObjet m10414a(String str) {
        return str.equals("") ? WDAppelContexte.getContexte().m2728o() : WDIndirection.get2(str, 4);
    }

    /* renamed from: a */
    public static C0508h m10415a(WDObjet wDObjet, boolean z, boolean z2) throws C0666h {
        C0508h c0508h;
        if (wDObjet != null) {
            try {
                c0508h = (C0508h) wDObjet.checkType(C0508h.class);
            } catch (C0666h e) {
                throw e;
            }
        }
        c0508h = null;
        if (c0508h == null) {
            String string;
            if (wDObjet != null) {
                try {
                    string = wDObjet.getString();
                } catch (C0666h e2) {
                    throw e2;
                }
            }
            string = "";
            if (string.equals("")) {
                c0508h = WDAppelContexte.getContexte().m2722h();
            } else {
                C0509v c0509v = (C0509v) WDProjet.getInstance().getFenetre(wDObjet.getString(), z);
            }
            if (c0508h == null) {
                try {
                    throw new C0666h(C0745b.m3222b(f4556z[3], string));
                } catch (C0666h e22) {
                    throw e22;
                }
            }
        }
        if (z2) {
            try {
                c0508h.verifierOuverte();
            } catch (C0666h e222) {
                throw e222;
            }
        }
        return c0508h;
    }

    /* renamed from: a */
    public static final C0495i m10416a(WDObjet wDObjet, C0508h c0508h) throws C0666h {
        C0495i c0495i;
        if (wDObjet != null) {
            try {
                c0495i = (C0495i) wDObjet.checkType(C0495i.class);
            } catch (C0666h e) {
                throw e;
            }
        }
        c0495i = null;
        if (c0495i == null) {
            try {
                if (wDObjet.isNumerique()) {
                    c0495i = c0508h.chercherOptionMenu(wDObjet.getInt());
                    if (c0495i == null) {
                        try {
                            throw new C0666h(C0745b.m3222b(f4556z[0], String.valueOf(r1), c0508h.getNomFenetre()));
                        } catch (C0666h e2) {
                            throw e2;
                        }
                    }
                }
                c0495i = c0508h.chercherOptionMenu(wDObjet.getString());
                if (c0495i == null) {
                    try {
                        throw new C0666h(C0745b.m3222b(f4556z[1], wDObjet.getString(), c0508h.getNomFenetre()));
                    } catch (C0666h e22) {
                        throw e22;
                    }
                }
            } catch (C0666h e222) {
                throw e222;
            }
        }
        return c0495i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static final <T extends fr.pcsoft.wdjava.ui.C0488r> T m10417a(fr.pcsoft.wdjava.core.WDObjet r5, java.lang.Class<T> r6) throws fr.pcsoft.wdjava.core.p035c.C0666h, fr.pcsoft.wdjava.core.p035c.C0663e {
        /*
        if (r5 == 0) goto L_0x0008;
    L_0x0002:
        r0 = r5.isChaine();	 Catch:{ h -> 0x002b }
        if (r0 == 0) goto L_0x0032;
    L_0x0008:
        if (r5 == 0) goto L_0x002f;
    L_0x000a:
        r0 = r5.getString();	 Catch:{ h -> 0x002d }
    L_0x000e:
        r5 = fr.pcsoft.wdjava.ui.utils.C1502a.m10414a(r0);
        if (r5 != 0) goto L_0x0032;
    L_0x0014:
        r1 = new fr.pcsoft.wdjava.core.c.h;	 Catch:{ h -> 0x0029 }
        r2 = f4556z;	 Catch:{ h -> 0x0029 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ h -> 0x0029 }
        r3 = 1;
        r3 = new java.lang.String[r3];	 Catch:{ h -> 0x0029 }
        r4 = 0;
        r3[r4] = r0;	 Catch:{ h -> 0x0029 }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);	 Catch:{ h -> 0x0029 }
        r1.<init>(r0);	 Catch:{ h -> 0x0029 }
        throw r1;	 Catch:{ h -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ h -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = "";
        goto L_0x000e;
    L_0x0032:
        r0 = r5.checkType(r6);
        r0 = (fr.pcsoft.wdjava.ui.C0488r) r0;
        if (r0 == 0) goto L_0x003b;
    L_0x003a:
        return r0;
    L_0x003b:
        r0 = new fr.pcsoft.wdjava.core.c.e;
        r0.<init>(r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.utils.a.a(fr.pcsoft.wdjava.core.WDObjet, java.lang.Class):T");
    }

    /* renamed from: a */
    public static final String m10418a(WDObjet wDObjet) {
        return wDObjet instanceof fb ? C0735q.m3116a(wDObjet.getClass()) : wDObjet.getString();
    }

    /* renamed from: z */
    private static String m10419z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 51;
                    break;
                case 2:
                    i2 = 70;
                    break;
                case 3:
                    i2 = 23;
                    break;
                default:
                    i2 = 103;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10420z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 103);
        }
        return toCharArray;
    }
}
