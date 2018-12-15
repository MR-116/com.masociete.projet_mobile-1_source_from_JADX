package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0663e;
import fr.pcsoft.wdjava.core.p035c.C0666h;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.ui.champs.combo.C1143b;
import fr.pcsoft.wdjava.ui.champs.ic;
import fr.pcsoft.wdjava.ui.champs.jc;
import fr.pcsoft.wdjava.ui.champs.liste.C1229c;
import fr.pcsoft.wdjava.ui.champs.wc;
import fr.pcsoft.wdjava.ui.utils.C1502a;

public class WDAPIListe_Commun {
    /* renamed from: a */
    protected static final int f1212a = 12;
    /* renamed from: z */
    private static final String[] f1213z = new String[]{m1645z(m1646z("D'X\"E\"4A>B.?X>_")), m1645z(m1646z("D'X\"E\"4B4]\"(E")), m1645z(m1646z("D'X\"E\"4X?B\"9T")), m1645z(m1646z("D'X\"E\"4P;^2?T")), m1645z(m1646z("D.C#T29N!P48P6T8;P#P*")), m1645z(m1646z("D(^<\\&%U4N.%G0]./T.].8E4N*.\\>X5.")), m1645z(m1646z("D'X\"E\"4B4]\"(E.\\(\"_\"")), m1645z(m1646z("D'X\"E\"4P7W.(Y4")), m1645z(m1646z("D'X\"E\"4B$A79X<T")), m1645z(m1646z("D'X\"E\"4R9T5(Y4")), m1645z(m1646z("D'X\"E\"4\\>U.-X4")), m1645z(m1646z("D-^?R3\"^?N.%R>\\7*E8S+.N2Y&&A.E&)]4")), m1645z(m1646z("D,]8T)4P2E.=T")), m1645z(m1646z("D'X\"E\"4^2R29C4_$.")), m1645z(m1646z("D'X\"E\"4X?W(4I(")), m1645z(m1646z("D=P=T29N2^)8E0_3.N8_1*]8U\"")), m1645z(m1646z("D'X\"E\"4B$A79X<T8?^$E")), m1645z(m1646z("D'X\"E\"4B4]\"(E.A+>B")), m1645z(m1646z("D(^?B2'E4C8/^2N7*C0\\")), m1645z(m1646z("D'X\"E\"4U4A+*R4N+\"V?T")), m1645z(m1646z("D;P#P*4X?G&'X5T")), m1645z(m1646z("D'X\"E\"4B4]\"(E.^$(D#C\"%R4"))};

    /* renamed from: a */
    protected static final jc m1643a(WDObjet wDObjet, int i, boolean z) {
        return (jc) m1644a(wDObjet, i, z, jc.class);
    }

    /* renamed from: a */
    protected static final <T extends wc> T m1644a(WDObjet wDObjet, int i, boolean z, Class<T> cls) {
        C0666h e;
        C0663e c0663e;
        int i2;
        String[] strArr;
        T t = null;
        T t2;
        try {
            t2 = (wc) C1502a.m10417a(wDObjet, (Class) cls);
            if (z) {
                return t2;
            }
            try {
                if (t2.isMemoire()) {
                    return t2;
                }
                String[] strArr2 = new String[2];
                strArr2[0] = C0745b.m3222b(f1213z[4], String.valueOf(i));
                strArr2[1] = C0745b.m3222b(f1213z[5], wDObjet.getNom().getString(), t2.getNomType());
                WDErreurManager.m2886a(strArr2);
                return t2;
            } catch (C0666h e2) {
                throw e2;
            } catch (C0663e e3) {
                c0663e = e3;
                t = t2;
                i2 = C0607n.vr;
                if (cls == C1143b.class) {
                    i2 = 1008;
                }
                strArr = new String[2];
                strArr[0] = C0745b.m3222b(f1213z[4], String.valueOf(i));
                strArr[1] = c0663e.m2671a(i2);
                WDErreurManager.m2886a(strArr);
                return t;
            } catch (C0666h e4) {
                e2 = e4;
            }
        } catch (C0666h e5) {
            C0666h c0666h = e5;
            t2 = null;
            e2 = c0666h;
            String[] strArr3 = new String[2];
            strArr3[0] = C0745b.m3222b(f1213z[4], String.valueOf(i));
            strArr3[1] = e2.getMessage();
            WDErreurManager.m2886a(strArr3);
            return t2;
        } catch (C0663e e6) {
            c0663e = e6;
            i2 = C0607n.vr;
            if (cls == C1143b.class) {
                i2 = 1008;
            }
            strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1213z[4], String.valueOf(i));
            strArr[1] = c0663e.m2671a(i2);
            WDErreurManager.m2886a(strArr);
            return t;
        }
    }

    public static synchronized WDBooleen gLienActive(WDObjet wDObjet) {
        WDBooleen wDBooleen;
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2776a(f1213z[12], 12);
            try {
                wDBooleen = new WDBooleen(m1643a(wDObjet, 1, true).getGLienActive());
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static synchronized WDBooleen gLienActive(WDObjet wDObjet, boolean z) {
        WDBooleen wDBooleen;
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2776a(f1213z[12], 12);
            try {
                wDBooleen = new WDBooleen(m1643a(wDObjet, 1, true).setGLienActive(z));
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static void listeAffiche(WDObjet wDObjet) {
        listeAffiche(wDObjet, new WDChaine("I"));
    }

    public static synchronized void listeAffiche(WDObjet wDObjet, WDObjet wDObjet2) {
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2776a(f1213z[7], 12);
            ic icVar = null;
            try {
                icVar = m1643a(wDObjet, 1, true);
                icVar.setSelectionParProgrammation(true);
                if (wDObjet2.isNumerique()) {
                    icVar.listeAffiche(wDObjet2.getInt());
                } else {
                    icVar.listeAffiche(wDObjet2.getString());
                }
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            } catch (Throwable th) {
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            }
        }
    }

    public static WDBooleen listeAjoute(WDObjet wDObjet) {
        return listeAjoute(wDObjet, "");
    }

    public static synchronized WDBooleen listeAjoute(WDObjet wDObjet, String str) {
        WDBooleen wDBooleen;
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2776a(f1213z[3], 12);
            try {
                wDBooleen = new WDBooleen(m1643a(wDObjet, 1, false).ajouterElements(str));
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static WDEntier4 listeCherche(WDObjet wDObjet, String str) {
        return listeCherche(wDObjet, str, true, 1);
    }

    public static WDEntier4 listeCherche(WDObjet wDObjet, String str, boolean z) {
        return listeCherche(wDObjet, str, z, 1);
    }

    public static synchronized WDEntier4 listeCherche(WDObjet wDObjet, String str, boolean z, int i) {
        WDEntier4 wDEntier4;
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2776a(f1213z[9], 12);
            ic icVar = null;
            try {
                icVar = m1643a(wDObjet, 1, true);
                icVar.setSelectionParProgrammation(true);
                wDEntier4 = new WDEntier4(icVar.chercherElement(str, z, i));
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            } catch (Throwable th) {
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            }
        }
        return wDEntier4;
    }

    public static synchronized WDEntier4 listeDeplaceLigne(WDObjet wDObjet, int i, WDObjet wDObjet2) {
        WDEntier4 listeDeplaceLigne;
        synchronized (WDAPIListe_Commun.class) {
            listeDeplaceLigne = listeDeplaceLigne(wDObjet, i, wDObjet2, 0);
        }
        return listeDeplaceLigne;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized fr.pcsoft.wdjava.core.types.WDEntier4 listeDeplaceLigne(fr.pcsoft.wdjava.core.WDObjet r7, int r8, fr.pcsoft.wdjava.core.WDObjet r9, int r10) {
        /*
        r1 = fr.pcsoft.wdjava.api.WDAPIListe_Commun.class;
        monitor-enter(r1);
        r0 = f1213z;	 Catch:{ all -> 0x0073 }
        r2 = 19;
        r0 = r0[r2];	 Catch:{ all -> 0x0073 }
        r2 = 12;
        r2 = fr.pcsoft.wdjava.core.context.C0677k.m2776a(r0, r2);	 Catch:{ all -> 0x0073 }
        r0 = 1;
        r3 = 0;
        r3 = m1643a(r7, r0, r3);	 Catch:{ bd -> 0x00a6 }
        switch(r10) {
            case -2147483648: goto L_0x0086;
            case -2147418112: goto L_0x0096;
            case 0: goto L_0x0063;
            case 65536: goto L_0x0076;
            default: goto L_0x0018;
        };	 Catch:{ bd -> 0x00a6 }
    L_0x0018:
        r0 = new java.lang.StringBuilder;	 Catch:{ bd -> 0x00a6 }
        r0.<init>();	 Catch:{ bd -> 0x00a6 }
        r3 = f1213z;	 Catch:{ bd -> 0x00a6 }
        r4 = 20;
        r3 = r3[r4];	 Catch:{ bd -> 0x00a6 }
        r4 = 2;
        r4 = new java.lang.String[r4];	 Catch:{ bd -> 0x00a6 }
        r5 = 0;
        r6 = "4";
        r4[r5] = r6;	 Catch:{ bd -> 0x00a6 }
        r5 = 1;
        r6 = java.lang.String.valueOf(r10);	 Catch:{ bd -> 0x00a6 }
        r4[r5] = r6;	 Catch:{ bd -> 0x00a6 }
        r3 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r3, r4);	 Catch:{ bd -> 0x00a6 }
        r0 = r0.append(r3);	 Catch:{ bd -> 0x00a6 }
        r3 = "\n";
        r0 = r0.append(r3);	 Catch:{ bd -> 0x00a6 }
        r3 = f1213z;	 Catch:{ bd -> 0x00a6 }
        r4 = 18;
        r3 = r3[r4];	 Catch:{ bd -> 0x00a6 }
        r4 = 0;
        r4 = new java.lang.String[r4];	 Catch:{ bd -> 0x00a6 }
        r3 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r3, r4);	 Catch:{ bd -> 0x00a6 }
        r0 = r0.append(r3);	 Catch:{ bd -> 0x00a6 }
        r0 = r0.toString();	 Catch:{ bd -> 0x00a6 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ bd -> 0x00a6 }
        r0 = new fr.pcsoft.wdjava.core.types.WDEntier4;	 Catch:{ bd -> 0x00a6 }
        r3 = -1;
        r0.<init>(r3);	 Catch:{ bd -> 0x00a6 }
        r2.m2735v();	 Catch:{ all -> 0x0073 }
    L_0x0061:
        monitor-exit(r1);
        return r0;
    L_0x0063:
        r0 = new fr.pcsoft.wdjava.core.types.WDEntier4;	 Catch:{ bd -> 0x00a6 }
        r4 = 0;
        r3 = r3.deplacerLigne(r8, r9, r4);	 Catch:{ bd -> 0x00a6 }
        r3 = r3 + 1;
        r0.<init>(r3);	 Catch:{ bd -> 0x00a6 }
        r2.m2735v();	 Catch:{ all -> 0x0073 }
        goto L_0x0061;
    L_0x0073:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
    L_0x0076:
        r0 = new fr.pcsoft.wdjava.core.types.WDEntier4;	 Catch:{ bd -> 0x00a6 }
        r4 = 1;
        r3 = r3.deplacerLigne(r8, r9, r4);	 Catch:{ bd -> 0x00a6 }
        r3 = r3 + 1;
        r0.<init>(r3);	 Catch:{ bd -> 0x00a6 }
        r2.m2735v();	 Catch:{ all -> 0x0073 }
        goto L_0x0061;
    L_0x0086:
        r0 = new fr.pcsoft.wdjava.core.types.WDEntier4;	 Catch:{ bd -> 0x00a6 }
        r4 = 0;
        r3 = r3.echangerLigne(r8, r9, r4);	 Catch:{ bd -> 0x00a6 }
        r3 = r3 + 1;
        r0.<init>(r3);	 Catch:{ bd -> 0x00a6 }
        r2.m2735v();	 Catch:{ all -> 0x0073 }
        goto L_0x0061;
    L_0x0096:
        r0 = new fr.pcsoft.wdjava.core.types.WDEntier4;	 Catch:{ bd -> 0x00a6 }
        r4 = 1;
        r3 = r3.echangerLigne(r8, r9, r4);	 Catch:{ bd -> 0x00a6 }
        r3 = r3 + 1;
        r0.<init>(r3);	 Catch:{ bd -> 0x00a6 }
        r2.m2735v();	 Catch:{ all -> 0x0073 }
        goto L_0x0061;
    L_0x00a6:
        r0 = move-exception;
        r0 = r0.getMessage();	 Catch:{ all -> 0x00b8 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2877a(r2, r0);	 Catch:{ all -> 0x00b8 }
        r0 = new fr.pcsoft.wdjava.core.types.WDEntier4;	 Catch:{ all -> 0x00b8 }
        r3 = -1;
        r0.<init>(r3);	 Catch:{ all -> 0x00b8 }
        r2.m2735v();	 Catch:{ all -> 0x0073 }
        goto L_0x0061;
    L_0x00b8:
        r0 = move-exception;
        r2.m2735v();	 Catch:{ all -> 0x0073 }
        throw r0;	 Catch:{ all -> 0x0073 }
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.api.WDAPIListe_Commun.listeDeplaceLigne(fr.pcsoft.wdjava.core.WDObjet, int, fr.pcsoft.wdjava.core.WDObjet, int):fr.pcsoft.wdjava.core.types.WDEntier4");
    }

    public static synchronized WDEntier4 listeInfoXY(WDObjet wDObjet, int i, int i2, int i3) {
        WDEntier4 wDEntier4;
        boolean z = true;
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2776a(f1213z[14], 12);
            try {
                C1229c c1229c = (C1229c) m1644a(wDObjet, 1, true, C1229c.class);
                if (i != 65537) {
                    if (i != 1) {
                        WDErreurManager.m2883a(C0745b.m3222b(f1213z[15], String.valueOf(i)));
                    }
                    z = false;
                }
                wDEntier4 = new WDEntier4(c1229c.getInfoXY(i2, i3, z));
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDEntier4;
    }

    public static synchronized WDBooleen listeInsere(WDObjet wDObjet, String str) {
        WDBooleen wDBooleen;
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2776a(f1213z[2], 12);
            ic icVar = null;
            try {
                icVar = m1643a(wDObjet, 1, false);
                icVar.setSelectionParProgrammation(true);
                wDBooleen = new WDBooleen(icVar.insererElement(str));
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            } catch (Throwable th) {
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static synchronized WDBooleen listeInsere(WDObjet wDObjet, String str, WDObjet wDObjet2) {
        WDBooleen wDBooleen;
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2776a(f1213z[2], 12);
            ic icVar = null;
            try {
                icVar = m1643a(wDObjet, 1, false);
                icVar.setSelectionParProgrammation(true);
                wDBooleen = new WDBooleen(icVar.insererElement(str, wDObjet2.getInt()));
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            } catch (Throwable th) {
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static void listeModifie(WDObjet wDObjet, String str) {
        listeModifie(wDObjet, str, new WDEntier4(-1));
    }

    public static synchronized void listeModifie(WDObjet wDObjet, String str, WDObjet wDObjet2) {
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2776a(f1213z[10], 12);
            try {
                ic a2 = m1643a(wDObjet, 1, true);
                if (wDObjet.isTable()) {
                    WDErreurManager.m2883a(C0745b.m3222b(f1213z[11], C0745b.m3221b(f1213z[10]), a2.getName()));
                }
                a2.modifierElement(str, wDObjet2.getInt());
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static synchronized WDEntier4 listeOccurrence(WDObjet wDObjet) {
        WDEntier4 wDEntier4;
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2776a(f1213z[13], 12);
            try {
                wDEntier4 = new WDEntier4(m1643a(wDObjet, 1, true).getNbElement());
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDEntier4;
    }

    public static synchronized WDEntier4 listePosition(WDObjet wDObjet) {
        WDEntier4 wDEntier4;
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2776a(f1213z[0], 12);
            try {
                wDEntier4 = new WDEntier4(m1643a(wDObjet, 1, true).getPosition());
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDEntier4;
    }

    public static synchronized void listePosition(WDObjet wDObjet, int i) {
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2776a(f1213z[0], 12);
            try {
                m1643a(wDObjet, 1, true).getPosition(i);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static synchronized WDEntier4 listeSelect(WDObjet wDObjet) {
        WDEntier4 wDEntier4;
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2775a(f1213z[1]);
            try {
                wDEntier4 = new WDEntier4(m1643a(wDObjet, 1, true).getElementSelectionne());
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDEntier4;
    }

    public static synchronized WDEntier4 listeSelect(WDObjet wDObjet, int i) {
        WDEntier4 wDEntier4;
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2775a(f1213z[1]);
            try {
                wDEntier4 = new WDEntier4(m1643a(wDObjet, 1, true).getElementSelectionne(i));
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDEntier4;
    }

    public static synchronized void listeSelectMoins(WDObjet wDObjet) {
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2775a(f1213z[6]);
            ic icVar = null;
            try {
                icVar = m1643a(wDObjet, 1, true);
                icVar.setSelectionParProgrammation(true);
                icVar.supprimerSelection();
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            } catch (Throwable th) {
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            }
        }
    }

    public static synchronized void listeSelectMoins(WDObjet wDObjet, int[] iArr) {
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2775a(f1213z[6]);
            ic icVar = null;
            try {
                icVar = m1643a(wDObjet, 1, true);
                icVar.setSelectionParProgrammation(true);
                icVar.supprimerSelection(iArr);
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            } catch (Throwable th) {
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            }
        }
    }

    public static synchronized WDEntier4 listeSelectOccurrence(WDObjet wDObjet) {
        WDEntier4 wDEntier4;
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2775a(f1213z[21]);
            try {
                wDEntier4 = new WDEntier4(m1643a(wDObjet, 1, true).getNbElementSelectionne());
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDEntier4;
    }

    public static synchronized void listeSelectPlus(WDObjet wDObjet) {
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2775a(f1213z[17]);
            ic icVar = null;
            try {
                icVar = m1643a(wDObjet, 1, true);
                icVar.setSelectionParProgrammation(true);
                icVar.ajouterSelection();
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            } catch (Throwable th) {
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            }
        }
    }

    public static synchronized void listeSelectPlus(WDObjet wDObjet, int[] iArr) {
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2775a(f1213z[17]);
            ic icVar = null;
            try {
                icVar = m1643a(wDObjet, 1, true);
                icVar.setSelectionParProgrammation(true);
                icVar.ajouterSelection(iArr);
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            } catch (Throwable th) {
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            }
        }
    }

    public static synchronized void listeSupprime(WDObjet wDObjet) {
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2776a(f1213z[8], 12);
            ic icVar = null;
            try {
                icVar = m1643a(wDObjet, 1, false);
                icVar.setSelectionParProgrammation(true);
                icVar.supprimerElementSelectionne(false);
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            } catch (Throwable th) {
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            }
        }
    }

    public static synchronized void listeSupprime(WDObjet wDObjet, int i) {
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2776a(f1213z[8], 12);
            ic icVar = null;
            try {
                icVar = m1643a(wDObjet, 1, false);
                icVar.setSelectionParProgrammation(true);
                icVar.supprimerElementA(i, false);
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            } catch (Throwable th) {
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            }
        }
    }

    public static synchronized void listeSupprimeTout(WDObjet wDObjet) {
        synchronized (WDAPIListe_Commun.class) {
            WDContexte a = C0677k.m2776a(f1213z[16], 12);
            ic icVar = null;
            try {
                icVar = m1643a(wDObjet, 1, false);
                icVar.setSelectionParProgrammation(true);
                icVar.supprimerTout();
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            } catch (Throwable th) {
                if (icVar != null) {
                    icVar.setSelectionParProgrammation(false);
                }
                a.m2735v();
            }
        }
    }

    /* renamed from: z */
    private static String m1645z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 103;
                    break;
                case 1:
                    i2 = 107;
                    break;
                case 2:
                    i2 = 17;
                    break;
                case 3:
                    i2 = 113;
                    break;
                default:
                    i2 = 17;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1646z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 17);
        }
        return toCharArray;
    }
}
