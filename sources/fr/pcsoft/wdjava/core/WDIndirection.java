package fr.pcsoft.wdjava.core;

import fr.pcsoft.wdjava.core.application.WDCollProc;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.types.database.C0776b;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.db;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.menu.C0494e;
import fr.pcsoft.wdjava.ui.menu.C0495i;
import java.lang.ref.WeakReference;
import java.util.StringTokenizer;

public class WDIndirection {
    /* renamed from: a */
    private static String f1478a = "";
    /* renamed from: b */
    private static int f1479b = -1;
    /* renamed from: c */
    private static C0508h f1480c = null;
    /* renamed from: d */
    private static WeakReference<WDObjet> f1481d = null;
    /* renamed from: z */
    private static final String[] f1482z = new String[]{m2265z(m2266z("3m")), m2265z(m2266z(">\n\f[\u001bO\u0006\u0001K\u001bR\r\u001dV\u001cI\u0006\u0010[\u001bI\u0006\u001d\\\u001a\\\n\fZ\rK\n\u0006Z")), m2265z(m2266z(">\u0006\u000eZ\u001fX\r\u0016@\u001bS\u0000\rQ\u001cH"))};

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static fr.pcsoft.wdjava.core.WDObjet m2264a(java.lang.String r14, int r15) {
        /*
        r2 = 2;
        r4 = 7;
        r1 = 6;
        r3 = 0;
        r5 = 0;
        r11 = fr.pcsoft.wdjava.core.context.WDAppelContexte.getContexte();
        r7 = r14.toLowerCase();
        r6 = "]";
        r6 = r7.endsWith(r6);
        if (r6 == 0) goto L_0x0176;
    L_0x0015:
        r6 = 91;
        r8 = r7.indexOf(r6);
        if (r8 <= 0) goto L_0x0176;
    L_0x001d:
        r6 = r8 + 1;
        r9 = r7.length();
        r9 = r9 + -1;
        r6 = r7.substring(r6, r9);
        r7 = r7.substring(r3, r8);
        r9 = r6;
        r10 = r7;
    L_0x002f:
        switch(r15) {
            case 1: goto L_0x006b;
            case 2: goto L_0x0032;
            case 3: goto L_0x006f;
            case 4: goto L_0x0065;
            case 5: goto L_0x0068;
            case 6: goto L_0x0076;
            case 7: goto L_0x0032;
            case 8: goto L_0x0071;
            default: goto L_0x0032;
        };
    L_0x0032:
        r1 = 9;
        r13 = r1;
        r1 = r3;
        r3 = r13;
    L_0x0037:
        r2 = r11.m2728o();
        r7 = r1;
        r6 = r5;
        r1 = r5;
    L_0x003e:
        if (r6 != 0) goto L_0x012b;
    L_0x0040:
        if (r7 >= r3) goto L_0x012b;
    L_0x0042:
        r8 = r7 + 1;
        if (r8 < r4) goto L_0x0173;
    L_0x0046:
        if (r1 != 0) goto L_0x0173;
    L_0x0048:
        r1 = fr.pcsoft.wdjava.core.application.WDProjet.getInstance();	 Catch:{ NumberFormatException -> 0x007d }
        r1 = r1.getNomAnalyseProjet();	 Catch:{ NumberFormatException -> 0x007d }
        r1 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r1);	 Catch:{ NumberFormatException -> 0x007d }
        if (r1 == 0) goto L_0x007f;
    L_0x0056:
        r1 = fr.pcsoft.wdjava.database.hf.bb.class;
        r1 = fr.pcsoft.wdjava.core.context.WDAppelContexte.getContexte(r1);	 Catch:{ NumberFormatException -> 0x007d }
        r1 = (fr.pcsoft.wdjava.database.hf.bb) r1;	 Catch:{ NumberFormatException -> 0x007d }
    L_0x005e:
        r7 = r1;
    L_0x005f:
        switch(r8) {
            case 1: goto L_0x0088;
            case 2: goto L_0x00bb;
            case 3: goto L_0x00c7;
            case 4: goto L_0x00d1;
            case 5: goto L_0x00db;
            case 6: goto L_0x00ef;
            case 7: goto L_0x0107;
            case 8: goto L_0x0113;
            case 9: goto L_0x011f;
            default: goto L_0x0062;
        };
    L_0x0062:
        r1 = r7;
        r7 = r8;
        goto L_0x003e;
    L_0x0065:
        r3 = r1;
        r1 = r2;
        goto L_0x0037;
    L_0x0068:
        r1 = r3;
        r3 = r2;
        goto L_0x0037;
    L_0x006b:
        r2 = 5;
        r3 = r1;
        r1 = r2;
        goto L_0x0037;
    L_0x006f:
        r3 = r4;
        goto L_0x0037;
    L_0x0071:
        r1 = 8;
        r3 = r1;
        r1 = r4;
        goto L_0x0037;
    L_0x0076:
        r2 = 8;
        r1 = 9;
        r3 = r1;
        r1 = r2;
        goto L_0x0037;
    L_0x007d:
        r1 = move-exception;
        throw r1;
    L_0x007f:
        r1 = fr.pcsoft.wdjava.database.hf.bb.class;
        r1 = fr.pcsoft.wdjava.core.context.WDAppelContexte.m2679a(r1);
        r1 = (fr.pcsoft.wdjava.database.hf.bb) r1;
        goto L_0x005e;
    L_0x0088:
        if (r2 == 0) goto L_0x009f;
    L_0x008a:
        r1 = fr.pcsoft.wdjava.core.C0505p.class;
        r1 = r2.getObjOrParentOfType(r1);	 Catch:{ NumberFormatException -> 0x009d }
        r1 = (fr.pcsoft.wdjava.core.C0505p) r1;	 Catch:{ NumberFormatException -> 0x009d }
    L_0x0092:
        if (r1 == 0) goto L_0x016f;
    L_0x0094:
        r6 = r1.chercherVariableGlobale(r10);
        if (r6 == 0) goto L_0x00a1;
    L_0x009a:
        r1 = r7;
        r7 = r8;
        goto L_0x003e;
    L_0x009d:
        r1 = move-exception;
        throw r1;
    L_0x009f:
        r1 = r5;
        goto L_0x0092;
    L_0x00a1:
        r12 = r1 instanceof fr.pcsoft.wdjava.ui.C0489p;
        if (r12 == 0) goto L_0x016f;
    L_0x00a5:
        r12 = r1 instanceof fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
        if (r12 == 0) goto L_0x00b0;
    L_0x00a9:
        r1 = (fr.pcsoft.wdjava.ui.C0489p) r1;
        r1 = r1.getFenetreMere();
        goto L_0x0092;
    L_0x00b0:
        r1 = (fr.pcsoft.wdjava.ui.C0489p) r1;
        r12 = fr.pcsoft.wdjava.core.C0505p.class;
        r1 = r1.getParentOfType(r12);
        r1 = (fr.pcsoft.wdjava.core.C0505p) r1;
        goto L_0x0092;
    L_0x00bb:
        r1 = fr.pcsoft.wdjava.core.application.WDProjet.getInstance();
        r6 = r1.chercherVariableGlobale(r10);
        r1 = r7;
        r7 = r8;
        goto L_0x003e;
    L_0x00c7:
        if (r2 == 0) goto L_0x016f;
    L_0x00c9:
        r6 = r2.getFils(r10);
        r1 = r7;
        r7 = r8;
        goto L_0x003e;
    L_0x00d1:
        if (r2 == 0) goto L_0x016f;
    L_0x00d3:
        r6 = r2.getFrere(r10);
        r1 = r7;
        r7 = r8;
        goto L_0x003e;
    L_0x00db:
        r1 = r11.m2722h();
        if (r1 == 0) goto L_0x016f;
    L_0x00e1:
        r12 = r1.estOuverte();
        if (r12 == 0) goto L_0x016f;
    L_0x00e7:
        r6 = r1.getFils(r10);
        r1 = r7;
        r7 = r8;
        goto L_0x003e;
    L_0x00ef:
        r1 = fr.pcsoft.wdjava.core.application.WDProjet.getInstance();
        r12 = 1;
        r1 = r1.getFenetre(r10, r12);
        if (r1 == 0) goto L_0x016f;
    L_0x00fa:
        r12 = r1.estOuverte();
        if (r12 == 0) goto L_0x016f;
    L_0x0100:
        r1 = (fr.pcsoft.wdjava.core.WDObjet) r1;
        r6 = r1;
        r1 = r7;
        r7 = r8;
        goto L_0x003e;
    L_0x0107:
        if (r7 == 0) goto L_0x016f;
    L_0x0109:
        r1 = fr.pcsoft.wdjava.database.hf.C0873u.FICHIER;
        r6 = r7.mo3079a(r10, r1);
        r1 = r7;
        r7 = r8;
        goto L_0x003e;
    L_0x0113:
        if (r7 == 0) goto L_0x016f;
    L_0x0115:
        r1 = fr.pcsoft.wdjava.database.hf.C0873u.CONNEXION;
        r6 = r7.mo3079a(r10, r1);
        r1 = r7;
        r7 = r8;
        goto L_0x003e;
    L_0x011f:
        if (r7 == 0) goto L_0x016f;
    L_0x0121:
        r1 = fr.pcsoft.wdjava.database.hf.C0873u.RUBRIQUE;
        r6 = r7.mo3079a(r10, r1);
        r1 = r7;
        r7 = r8;
        goto L_0x003e;
    L_0x012b:
        r1 = r6 instanceof fr.pcsoft.wdjava.ui.champs.fenetreinterne.fb;	 Catch:{ NumberFormatException -> 0x0158 }
        if (r1 == 0) goto L_0x016d;
    L_0x012f:
        if (r2 == 0) goto L_0x016d;
    L_0x0131:
        r1 = r2 instanceof fr.pcsoft.wdjava.ui.champs.fenetreinterne.fb;	 Catch:{ NumberFormatException -> 0x015c }
        if (r1 == 0) goto L_0x015e;
    L_0x0135:
        r0 = r2;
        r0 = (fr.pcsoft.wdjava.ui.champs.fenetreinterne.fb) r0;	 Catch:{ NumberFormatException -> 0x015c }
        r1 = r0;
    L_0x0139:
        if (r1 == 0) goto L_0x016d;
    L_0x013b:
        r2 = r1.getClass();	 Catch:{ NumberFormatException -> 0x0163 }
        r3 = r6.getClass();	 Catch:{ NumberFormatException -> 0x0163 }
        if (r2 != r3) goto L_0x016d;
    L_0x0145:
        r1 = (fr.pcsoft.wdjava.core.WDObjet) r1;
    L_0x0147:
        if (r1 == 0) goto L_0x0157;
    L_0x0149:
        r2 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r9);	 Catch:{ NumberFormatException -> 0x0165 }
        if (r2 != 0) goto L_0x0157;
    L_0x014f:
        r2 = java.lang.Integer.parseInt(r9);	 Catch:{ NumberFormatException -> 0x0167 }
        r1 = r1.get(r2);	 Catch:{ NumberFormatException -> 0x0167 }
    L_0x0157:
        return r1;
    L_0x0158:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x015a }
    L_0x015a:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x015c }
    L_0x015c:
        r1 = move-exception;
        throw r1;
    L_0x015e:
        r1 = r2.getFenetreInterne();
        goto L_0x0139;
    L_0x0163:
        r1 = move-exception;
        throw r1;
    L_0x0165:
        r1 = move-exception;
        throw r1;
    L_0x0167:
        r2 = move-exception;
        r1 = r1.get(r9);
        goto L_0x0157;
    L_0x016d:
        r1 = r6;
        goto L_0x0147;
    L_0x016f:
        r1 = r7;
        r7 = r8;
        goto L_0x003e;
    L_0x0173:
        r7 = r1;
        goto L_0x005f;
    L_0x0176:
        r9 = r5;
        r10 = r7;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.WDIndirection.a(java.lang.String, int):fr.pcsoft.wdjava.core.WDObjet");
    }

    public static WDObjet get(String str) {
        return get(str, 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static fr.pcsoft.wdjava.core.WDObjet get(java.lang.String r4, int r5) {
        /*
        if (r4 == 0) goto L_0x000a;
    L_0x0002:
        r0 = "";
        r0 = r4.equals(r0);	 Catch:{ NumberFormatException -> 0x0032 }
        if (r0 == 0) goto L_0x0019;
    L_0x000a:
        r0 = f1482z;	 Catch:{ NumberFormatException -> 0x0032 }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0032 }
        r1 = 0;
        r1 = new java.lang.String[r1];	 Catch:{ NumberFormatException -> 0x0032 }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);	 Catch:{ NumberFormatException -> 0x0032 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ NumberFormatException -> 0x0032 }
    L_0x0019:
        r0 = get2(r4, r5);
        if (r0 != 0) goto L_0x0031;
    L_0x001f:
        r1 = f1482z;	 Catch:{ NumberFormatException -> 0x0034 }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0034 }
        r2 = 1;
        r2 = new java.lang.String[r2];	 Catch:{ NumberFormatException -> 0x0034 }
        r3 = 0;
        r2[r3] = r4;	 Catch:{ NumberFormatException -> 0x0034 }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r2);	 Catch:{ NumberFormatException -> 0x0034 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r1);	 Catch:{ NumberFormatException -> 0x0034 }
    L_0x0031:
        return r0;
    L_0x0032:
        r0 = move-exception;
        throw r0;
    L_0x0034:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.WDIndirection.get(java.lang.String, int):fr.pcsoft.wdjava.core.WDObjet");
    }

    public static WDObjet get2(String str, int i) {
        if (str != null) {
            try {
                if (!str.equals("")) {
                    while (str.charAt(str.length() - 1) == ' ') {
                        str = str.substring(0, str.length() - 1);
                    }
                    try {
                        WDObjet wDObjet;
                        if (str.equalsIgnoreCase(f1478a)) {
                            if (i == f1479b) {
                                try {
                                    if (f1481d != null && WDAppelContexte.getContexte().m2722h() == f1480c) {
                                        wDObjet = (WDObjet) f1481d.get();
                                        if (wDObjet != null) {
                                            try {
                                                if (!wDObjet.isReleased()) {
                                                    return wDObjet;
                                                }
                                            } catch (NumberFormatException e) {
                                                throw e;
                                            }
                                        }
                                        f1481d = null;
                                    }
                                } catch (NumberFormatException e2) {
                                    throw e2;
                                }
                            }
                        }
                        try {
                            if (str.indexOf(46) != -1) {
                                if (str.indexOf(f1482z[0]) == -1) {
                                    try {
                                        if (!str.startsWith(".")) {
                                            try {
                                                if (!str.endsWith(".")) {
                                                    StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
                                                    String nextToken = stringTokenizer.nextToken();
                                                    if (stringTokenizer.countTokens() <= 2) {
                                                        switch (i) {
                                                            case 0:
                                                                wDObjet = m2264a(nextToken, 3);
                                                                if (wDObjet == null) {
                                                                    wDObjet = m2264a(nextToken, 4);
                                                                }
                                                                if (wDObjet == null) {
                                                                    wDObjet = m2264a(nextToken, 5);
                                                                    break;
                                                                }
                                                                break;
                                                            case 4:
                                                                wDObjet = m2264a(nextToken, 4);
                                                                break;
                                                            case 5:
                                                                wDObjet = m2264a(nextToken, 0);
                                                                break;
                                                            case 6:
                                                                wDObjet = m2264a(nextToken, 3);
                                                                break;
                                                            default:
                                                                wDObjet = null;
                                                                break;
                                                        }
                                                    }
                                                    wDObjet = m2264a(nextToken, 4);
                                                    if (wDObjet == null && (i == 0 || i == 5)) {
                                                        wDObjet = WDCollProc.findVariable(nextToken + "." + stringTokenizer.nextToken());
                                                    }
                                                    while (wDObjet != null) {
                                                        try {
                                                            if (stringTokenizer.hasMoreTokens()) {
                                                                wDObjet = rechercherVariableDans(stringTokenizer.nextToken(), wDObjet, i);
                                                            }
                                                        } catch (NumberFormatException e22) {
                                                            throw e22;
                                                        }
                                                    }
                                                }
                                            } catch (NumberFormatException e222) {
                                                throw e222;
                                            }
                                        }
                                    } catch (NumberFormatException e2222) {
                                        throw e2222;
                                    }
                                }
                                return null;
                            }
                            wDObjet = m2264a(str, i);
                            try {
                                if (f1480c == null) {
                                    return wDObjet;
                                }
                                f1478a = str;
                                f1479b = i;
                                f1481d = new WeakReference(wDObjet);
                                f1480c = WDAppelContexte.getContexte().m2722h();
                                return wDObjet;
                            } catch (NumberFormatException e22222) {
                                throw e22222;
                            }
                        } catch (NumberFormatException e222222) {
                            throw e222222;
                        } catch (NumberFormatException e2222222) {
                            throw e2222222;
                        }
                    } catch (NumberFormatException e22222222) {
                        throw e22222222;
                    } catch (NumberFormatException e222222222) {
                        throw e222222222;
                    }
                }
            } catch (NumberFormatException e2222222222) {
                throw e2222222222;
            }
        }
        return null;
    }

    public static final void notifFermetureFenetre(C0508h c0508h) {
        try {
            if (c0508h == f1480c) {
                razDerniereRecherche();
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static final void razDerniereRecherche() {
        f1478a = "";
        f1479b = -1;
        f1481d = null;
        f1480c = null;
    }

    public static WDObjet rechercherVariableDans(String str, WDObjet wDObjet, int i) {
        WDObjet wDObjet2 = null;
        try {
            WDObjet fils;
            if (!wDObjet.isSourceDonnees()) {
                try {
                    if ((wDObjet instanceof C0505p) && (i == 0 || i == 5)) {
                        wDObjet2 = ((C0505p) wDObjet).chercherVariableGlobale(str);
                    }
                } catch (NumberFormatException e) {
                    throw e;
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            } else if (i == 0 || i == 6) {
                wDObjet2 = ((C0776b) wDObjet).chercherSousElement(str);
            }
            if (wDObjet2 == null) {
                try {
                    if (wDObjet.isNoeud()) {
                        if (i == 0 || i == 4 || i == 1) {
                            fils = ((db) wDObjet).getFils(str);
                            return fils != null ? (i != 0 || i == 5) ? wDObjet.getElement(str, false) : fils : fils;
                        }
                        fils = wDObjet2;
                        if (fils != null) {
                        }
                        if (i != 0) {
                        }
                    }
                } catch (NumberFormatException e22) {
                    throw e22;
                } catch (NumberFormatException e222) {
                    try {
                        throw e222;
                    } catch (NumberFormatException e2222) {
                        throw e2222;
                    }
                }
            }
            if (wDObjet2 == null) {
                try {
                    if (wDObjet instanceof C0494e) {
                        C0508h fenetreMere = ((C0489p) wDObjet).getFenetreMere();
                        if (fenetreMere != null) {
                            C0495i[] optionsMenu = fenetreMere.getOptionsMenu(str, (C0494e) wDObjet);
                            if (optionsMenu != null) {
                                try {
                                    if (optionsMenu.length > 0) {
                                        fils = (WDObjet) optionsMenu[0];
                                        if (fils != null) {
                                            if (i != 0) {
                                            }
                                        }
                                    }
                                } catch (NumberFormatException e22222) {
                                    throw e22222;
                                }
                            }
                        }
                    }
                } catch (NumberFormatException e222222) {
                    throw e222222;
                }
            }
            fils = wDObjet2;
            if (fils != null) {
            }
            if (i != 0) {
            }
        } catch (NumberFormatException e2222222) {
            throw e2222222;
        } catch (NumberFormatException e22222222) {
            throw e22222222;
        }
    }

    /* renamed from: z */
    private static String m2265z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 29;
                    break;
                case 1:
                    i2 = 67;
                    break;
                case 2:
                    i2 = 66;
                    break;
                case 3:
                    i2 = 31;
                    break;
                default:
                    i2 = 82;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2266z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 82);
        }
        return toCharArray;
    }
}
