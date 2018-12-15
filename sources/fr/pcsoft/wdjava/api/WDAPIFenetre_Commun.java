package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p035c.C0663e;
import fr.pcsoft.wdjava.core.p035c.C0666h;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0509v;
import fr.pcsoft.wdjava.ui.champs.fenetre.C1155i;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.p082k.C1439b;
import fr.pcsoft.wdjava.ui.utils.C1502a;

public class WDAPIFenetre_Commun {
    /* renamed from: a */
    protected static final int f1147a = 4;
    /* renamed from: z */
    private static final String[] f1148z = new String[]{m1611z(m1612z("P?O\\6")), m1611z(m1612z("P?O\\6/yVK&\"")), m1611z(m1612z("P9dPZ,6oWK'\"o")), m1611z(m1612z("P3bXC#/zKK>9oK")), m1611z(m1612z("P$cM\\6/oWQ0?K]")), m1611z(m1612z("P6oKC6")), m1611z(m1612z("P1hX@7?dWK")), m1611z(m1612z("P?O\\6/lPB?5")), m1611z(m1612z("P5xKK&\"uIO #k^K, kKO>")), m1611z(m1612z("P3bXC#/zKK05n\\@'")), m1611z(m1612z("P6oWQ08kWI6/kUG2#")), m1611z(m1612z("P6oWQ6$kM")), m1611z(m1612z("P6cZF:5xFX6\"yFK0\"kW")), m1611z(m1612z("P%~PB:#o")), m1611z(m1612z("P5iKO=/|\\\\ /yV[!3o")), m1611z(m1612z("P$cM\\6/yLG%1dM")), m1611z(m1612z("P6oWQ6>uZA&\"y")), m1611z(m1612z("P#eL\\05uOK!#u\\M!1d")), m1611z(m1612z("P6oWQ:>cMG2<cJK6")), m1611z(m1612z("P>eTL!5u_K=5~KK")), m1611z(m1612z("P5iKO=/|\\\\ /lPM;9oK")), m1611z(m1612z("P6oWQ6>u\\V63MG<>"))};

    /* renamed from: a */
    protected static final C0508h m1609a(WDObjet wDObjet, int i, boolean z, boolean z2) {
        C0508h c0508h = null;
        try {
            c0508h = C1502a.m10415a(wDObjet, z, z2);
        } catch (C0666h e) {
            String[] strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1148z[8], String.valueOf(i));
            strArr[1] = e.getMessage();
            WDErreurManager.m2886a(strArr);
        }
        return c0508h;
    }

    /* renamed from: a */
    protected static final <T extends C0489p> T m1610a(WDObjet wDObjet, int i, Class<T> cls) {
        String[] strArr;
        try {
            return (C0489p) C1502a.m10417a(wDObjet, (Class) cls);
        } catch (C0666h e) {
            strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1148z[8], String.valueOf(i));
            strArr[1] = e.getMessage();
            WDErreurManager.m2886a(strArr);
            return null;
        } catch (C0663e e2) {
            strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1148z[8], String.valueOf(i));
            strArr[1] = e2.m2671a(1000);
            WDErreurManager.m2886a(strArr);
            return null;
        }
    }

    public static final void abandonne() {
        WDContexte a = C0677k.m2776a(f1148z[6], 4);
        try {
            m1609a(null, 1, false, true).abandonne();
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine champPrecedent() {
        WDContexte a = C0677k.m2776a(f1148z[9], 4);
        try {
            WDChaine wDChaine;
            C0509v c0509v = (C0509v) a.m2722h();
            if (c0509v != null) {
                String champPrecedent = c0509v.getChampPrecedent();
                if (champPrecedent != null) {
                    wDChaine = new WDChaine(champPrecedent);
                    return wDChaine;
                }
            }
            wDChaine = new WDChaine("");
            a.m2735v();
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine champPremier() {
        return champPremier(null);
    }

    public static WDChaine champPremier(WDObjet wDObjet) {
        C0508h a;
        WDChaine wDChaine;
        WDContexte a2 = C0677k.m2776a(f1148z[3], 4);
        if (wDObjet != null) {
            try {
                a = m1609a(wDObjet, 1, true, true);
            } catch (Throwable th) {
                a2.m2735v();
            }
        } else {
            a = a2.m2722h();
        }
        if (a == null) {
            wDChaine = new WDChaine("");
            a2.m2735v();
        } else {
            gc gcVar = (gc) a.getChampNavigable(0);
            if (gcVar == null) {
                wDChaine = new WDChaine();
                a2.m2735v();
            } else {
                wDChaine = gcVar.getNom();
                a2.m2735v();
            }
        }
        return wDChaine;
    }

    public static void ecranVersFichier() {
        ecranVersFichier(new WDChaine(), new WDChaine());
    }

    public static void ecranVersFichier(WDObjet wDObjet) {
        ecranVersFichier(wDObjet, new WDChaine());
    }

    public static void ecranVersFichier(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2776a(f1148z[20], 3);
        try {
            m1609a(wDObjet, 1, true, true).screenToSource(wDObjet2.getString());
        } finally {
            a.m2735v();
        }
    }

    public static void ecranVersSource() {
        ecranVersSource(new WDChaine(), new WDChaine());
    }

    public static void ecranVersSource(WDObjet wDObjet) {
        ecranVersSource(wDObjet, new WDChaine());
    }

    public static void ecranVersSource(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2776a(f1148z[14], 13);
        try {
            m1609a(wDObjet, 1, true, true).screenToSource(wDObjet2.getString());
        } finally {
            a.m2735v();
        }
    }

    public static synchronized WDBooleen fenChangeAlias(WDObjet wDObjet, String str) {
        WDBooleen wDBooleen;
        synchronized (WDAPIFenetre_Commun.class) {
            WDContexte a = C0677k.m2775a(f1148z[10]);
            try {
                wDBooleen = new WDBooleen(m1609a(wDObjet, 1, true, true).modifAliasFenetre(str, true));
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static synchronized WDChaine fenEnCours() {
        WDChaine wDChaine;
        synchronized (WDAPIFenetre_Commun.class) {
            WDContexte a = C0677k.m2775a(f1148z[16]);
            try {
                C0509v a2 = C1439b.m10105d().m10101a();
                if (a2 != null) {
                    wDChaine = new WDChaine(a2.getName().toUpperCase());
                } else {
                    wDChaine = new WDChaine();
                    a.m2735v();
                }
            } finally {
                a.m2735v();
            }
        }
        return wDChaine;
    }

    public static synchronized WDChaine fenEnExecution() {
        WDChaine wDChaine;
        synchronized (WDAPIFenetre_Commun.class) {
            WDChaine wDChaine2 = 21;
            WDContexte a = C0677k.m2775a(f1148z[21]);
            try {
                C0509v c0509v = (C0509v) a.m2722h();
                if (c0509v != null) {
                    wDChaine2 = new WDChaine(c0509v.getName());
                    wDChaine = wDChaine2;
                } else {
                    wDChaine = new WDChaine();
                    a.m2735v();
                }
            } finally {
                a.m2735v();
            }
        }
        return wDChaine;
    }

    public static WDObjet fenEtat() {
        return fenEtat(new WDChaine(""));
    }

    public static synchronized WDEntier4 fenEtat(WDObjet wDObjet) {
        WDEntier4 wDEntier4;
        synchronized (WDAPIFenetre_Commun.class) {
            WDContexte a = C0677k.m2776a(f1148z[11], 4);
            try {
                if (wDObjet.isFenetre() && !((WDFenetre) wDObjet).estOuverte()) {
                    wDEntier4 = new WDEntier4(8);
                } else if (wDObjet.isEntier() || wDObjet.opEgal(Character.toString('\u0001'))) {
                    wDEntier4 = fenEtat(new WDChaine(""), wDObjet);
                    a.m2735v();
                } else {
                    C0508h a2 = m1609a(wDObjet, 1, true, false);
                    if (a2.estOuverte()) {
                        wDEntier4 = ((WDObjet) a2).getEtat();
                        a.m2735v();
                    } else {
                        wDEntier4 = new WDEntier4(8);
                    }
                }
            } catch (WDException e) {
                wDEntier4 = new WDEntier4(8);
                return wDEntier4;
            } finally {
                a.m2735v();
            }
        }
        return wDEntier4;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized fr.pcsoft.wdjava.core.types.WDEntier4 fenEtat(fr.pcsoft.wdjava.core.WDObjet r7, fr.pcsoft.wdjava.core.WDObjet r8) {
        /*
        r3 = fr.pcsoft.wdjava.api.WDAPIFenetre_Commun.class;
        monitor-enter(r3);
        r1 = f1148z;	 Catch:{ all -> 0x003c }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ all -> 0x003c }
        r2 = 4;
        r4 = fr.pcsoft.wdjava.core.context.C0677k.m2776a(r1, r2);	 Catch:{ all -> 0x003c }
        r1 = 1;
        r2 = 1;
        r5 = 1;
        r2 = m1609a(r7, r1, r2, r5);	 Catch:{ all -> 0x0037 }
        r1 = 1;
        r1 = java.lang.Character.toString(r1);	 Catch:{ WDException -> 0x0035 }
        r1 = r8.opEgal(r1);	 Catch:{ WDException -> 0x0035 }
        if (r1 == 0) goto L_0x003f;
    L_0x0020:
        r2.afficherPremierPlan();	 Catch:{ WDException -> 0x0035 }
    L_0x0023:
        r1 = r2.estOuverte();	 Catch:{ all -> 0x0037 }
        if (r1 != 0) goto L_0x008c;
    L_0x0029:
        r1 = new fr.pcsoft.wdjava.core.types.WDEntier4;	 Catch:{ all -> 0x0037 }
        r2 = 8;
        r1.<init>(r2);	 Catch:{ all -> 0x0037 }
        r4.m2735v();	 Catch:{ all -> 0x003c }
    L_0x0033:
        monitor-exit(r3);
        return r1;
    L_0x0035:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0037 }
    L_0x0037:
        r1 = move-exception;
        r4.m2735v();	 Catch:{ all -> 0x003c }
        throw r1;	 Catch:{ all -> 0x003c }
    L_0x003c:
        r1 = move-exception;
        monitor-exit(r3);
        throw r1;
    L_0x003f:
        r1 = r8.getInt();	 Catch:{ WDException -> 0x0075 }
        switch(r1) {
            case 0: goto L_0x0047;
            case 1: goto L_0x0047;
            case 2: goto L_0x0079;
            case 4: goto L_0x0047;
            case 8: goto L_0x0085;
            case 16: goto L_0x0079;
            case 2048: goto L_0x0069;
            case 16384: goto L_0x0047;
            default: goto L_0x0046;
        };
    L_0x0046:
        goto L_0x0023;
    L_0x0047:
        r0 = r2;
        r0 = (fr.pcsoft.wdjava.core.WDObjet) r0;	 Catch:{ WDException -> 0x0077 }
        r1 = r0;
        r1 = r1.getVisible();	 Catch:{ WDException -> 0x0077 }
        r1 = r1.getBoolean();	 Catch:{ WDException -> 0x0077 }
        if (r1 != 0) goto L_0x005d;
    L_0x0055:
        r0 = r2;
        r0 = (fr.pcsoft.wdjava.core.WDObjet) r0;	 Catch:{ WDException -> 0x0077 }
        r1 = r0;
        r5 = 1;
        r1.setVisible(r5);	 Catch:{ WDException -> 0x0077 }
    L_0x005d:
        r0 = r2;
        r0 = (fr.pcsoft.wdjava.core.WDObjet) r0;	 Catch:{ all -> 0x0037 }
        r1 = r0;
        r5 = r8.getInt();	 Catch:{ all -> 0x0037 }
        r1.setEtat(r5);	 Catch:{ all -> 0x0037 }
        goto L_0x0023;
    L_0x0069:
        r0 = r2;
        r0 = (fr.pcsoft.wdjava.core.WDObjet) r0;	 Catch:{ WDException -> 0x0075 }
        r1 = r0;
        r5 = 0;
        r1.setEtat(r5);	 Catch:{ WDException -> 0x0075 }
        r2.afficherPremierPlan();	 Catch:{ WDException -> 0x0075 }
        goto L_0x0023;
    L_0x0075:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0037 }
    L_0x0077:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0037 }
    L_0x0079:
        r0 = r2;
        r0 = (fr.pcsoft.wdjava.core.WDObjet) r0;	 Catch:{ all -> 0x0037 }
        r1 = r0;
        r5 = r8.getInt();	 Catch:{ all -> 0x0037 }
        r1.setEtat(r5);	 Catch:{ all -> 0x0037 }
        goto L_0x0023;
    L_0x0085:
        r1 = 1;
        r5 = 1;
        r6 = 0;
        r2.ferme(r1, r5, r6);	 Catch:{ all -> 0x0037 }
        goto L_0x0023;
    L_0x008c:
        r2 = (fr.pcsoft.wdjava.core.WDObjet) r2;	 Catch:{ all -> 0x0037 }
        r1 = r2.getEtat();	 Catch:{ all -> 0x0037 }
        r4.m2735v();	 Catch:{ all -> 0x003c }
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.api.WDAPIFenetre_Commun.fenEtat(fr.pcsoft.wdjava.core.WDObjet, fr.pcsoft.wdjava.core.WDObjet):fr.pcsoft.wdjava.core.types.WDEntier4");
    }

    public static final WDBooleen fenInitialisee() {
        WDContexte a = C0677k.m2778a(f1148z[18], false);
        WDBooleen wDBooleen = true;
        try {
            wDBooleen = new WDBooleen(m1609a(null, 1, false, true).isInitialisee());
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static synchronized WDObjet ferme(WDObjet wDObjet, WDObjet wDObjet2) {
        synchronized (WDAPIFenetre_Commun.class) {
            C0508h a;
            WDContexte a2 = C0677k.m2776a(f1148z[5], 4);
            if (wDObjet != null) {
                try {
                    a = m1609a(wDObjet, 1, true, true);
                } catch (WDException e) {
                    throw e;
                } catch (Throwable th) {
                    a2.m2735v();
                }
            } else {
                a = a2.m2722h();
            }
            if (wDObjet2 != null) {
                a.setValeurRenvoyee(wDObjet2);
            }
            a.ferme(true, true, null);
            a2.m2735v();
        }
        return wDObjet2;
    }

    public static void ferme() {
        ferme(null, null);
    }

    public static void ferme(WDObjet wDObjet) {
        ferme(wDObjet, null);
    }

    public static void fichierVersEcran() {
        fichierVersEcran(new WDChaine(), new WDChaine());
    }

    public static void fichierVersEcran(WDObjet wDObjet) {
        fichierVersEcran(wDObjet, new WDChaine());
    }

    public static void fichierVersEcran(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2776a(f1148z[12], 3);
        try {
            m1609a(wDObjet, 1, true, true).sourceToScreen(wDObjet2.getString());
        } finally {
            a.m2735v();
        }
    }

    public static void initFenetre() {
        initFenetre(true);
    }

    public static void initFenetre(boolean z) {
        WDContexte a = C0677k.m2775a(f1148z[2]);
        try {
            C0509v c0509v = (C0509v) a.m2722h();
            if (c0509v != null) {
                if (z) {
                    c0509v.raz(true);
                }
                c0509v.initChamp();
                c0509v.appelPCode(14);
            }
            a.m2735v();
        } catch (WDException e) {
            throw e;
        } catch (Throwable th) {
            a.m2735v();
        }
    }

    public static synchronized WDEntier4 nombreFenetre() {
        WDEntier4 wDEntier4;
        synchronized (WDAPIFenetre_Commun.class) {
            WDContexte a = C0677k.m2775a(f1148z[19]);
            try {
                if (((C0509v) a.m2722h()) != null) {
                    wDEntier4 = new WDEntier4(WDProjet.getInstance().getNbFenetreOuverte());
                } else {
                    wDEntier4 = new WDEntier4(0);
                    a.m2735v();
                }
            } finally {
                a.m2735v();
            }
        }
        return wDEntier4;
    }

    public static WDObjet ouvre(WDObjet wDObjet) {
        return ouvre(wDObjet, null);
    }

    public static synchronized WDObjet ouvre(WDObjet wDObjet, WDObjet[] wDObjetArr) {
        WDObjet valeurRenvoyee;
        synchronized (WDAPIFenetre_Commun.class) {
            WDContexte a = C0677k.m2775a(f1148z[0]);
            try {
                valeurRenvoyee = C0509v.ouvrirFenetre(wDObjet, C1155i.MODALE, wDObjetArr).getValeurRenvoyee();
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return valeurRenvoyee;
    }

    public static void ouvreFille(WDObjet wDObjet) {
        ouvreFille(wDObjet, null);
    }

    public static synchronized void ouvreFille(WDObjet wDObjet, WDObjet[] wDObjetArr) {
        synchronized (WDAPIFenetre_Commun.class) {
            WDContexte a = C0677k.m2776a(f1148z[7], 4);
            try {
                C0509v.ouvrirFenetre(wDObjet, C1155i.FILLE, wDObjetArr);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static void ouvreSoeur(WDObjet wDObjet) {
        ouvreSoeur(wDObjet, null);
    }

    public static synchronized void ouvreSoeur(WDObjet wDObjet, WDObjet[] wDObjetArr) {
        synchronized (WDAPIFenetre_Commun.class) {
            WDContexte a = C0677k.m2776a(f1148z[1], 4);
            try {
                C0509v.ouvrirFenetre(wDObjet, C1155i.NON_MODALE, wDObjetArr);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static void sourceVersEcran() {
        sourceVersEcran(new WDChaine(), new WDChaine());
    }

    public static void sourceVersEcran(WDObjet wDObjet) {
        sourceVersEcran(wDObjet, new WDChaine());
    }

    public static void sourceVersEcran(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2776a(f1148z[17], 13);
        try {
            m1609a(wDObjet, 1, true, true).sourceToScreen(wDObjet2.getString());
        } finally {
            a.m2735v();
        }
    }

    public static synchronized void titreEnCours(String str) {
        synchronized (WDAPIFenetre_Commun.class) {
            WDContexte a = C0677k.m2775a(f1148z[4]);
            try {
                C0509v c0509v = (C0509v) a.m2722h();
                if (c0509v != null) {
                    c0509v.setTitre(str);
                }
                a.m2735v();
            } catch (WDException e) {
                throw e;
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static synchronized void titreSuivant(String str) {
        synchronized (WDAPIFenetre_Commun.class) {
            WDContexte a = C0677k.m2775a(f1148z[15]);
            try {
                WDProjet.getInstance().setTitreSuivant(str);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static synchronized void utilise(WDObjet wDObjet) {
        synchronized (WDAPIFenetre_Commun.class) {
            WDContexte a = C0677k.m2776a(f1148z[13], 4);
            try {
                C0509v.ouvrirFenetre(wDObjet, C1155i.UTILISE, null);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    /* renamed from: z */
    private static String m1611z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 115;
                    break;
                case 1:
                    i2 = 112;
                    break;
                case 2:
                    i2 = 42;
                    break;
                case 3:
                    i2 = 25;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1612z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 14);
        }
        return toCharArray;
    }
}
