package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.collection.C0582d;
import fr.pcsoft.wdjava.core.types.collection.tableau.C0758k;
import fr.pcsoft.wdjava.core.types.collection.tableau.C0759o;

public class WDAPITableau {
    /* renamed from: z */
    private static final String[] f1229z = new String[]{m1674z(m1675z("\u001af,h`|s8ums}8~i")), m1674z(m1675z("\u001af,h`|s8uewa(xif~$mb|")), m1674z(m1675z("\u001af,h`|s8uewt\"")), m1674z(m1675z("\u001a\"~sow?ysms/fixg")), m1674z(m1675z("\u001af,h`|s8uewd(x|")), m1674z(m1675z("\u001af,h`|s8uoqw?id|m=k~fb?eo|v8xi")), m1674z(m1675z("\u001af,h`|s8uizz,dk|m!ckww")), m1674z(m1675z("\u001af,h`|s8uh|b!ko|")), m1674z(m1675z("\u001af,h`|s8")), m1674z(m1675z("\u001aq\"dz|`>ccwm$g|va>cnuw")), m1674z(m1675z("\u001aw?xil`2zmja,mifb,xmt")), m1674z(m1675z("\u001af,h`|s8uh`|,gehg(ubv|2k`u}8o")), m1674z(m1675z("48")), m1674z(m1675z("\u001af,h`|s8ulb=xetw2~clf")), m1674z(m1675z("\u001af,h`|s8ulb=xetw")), m1674z(m1675z("\u001af,h`|s8uz|`>uoqs$di")), m1674z(m1675z("\u001af,h`|s8uoqw?id|")), m1674z(m1675z("\u001a\"siw|(")), m1674z(m1675z("\u001af,h`|s8uczq8x~||.o")), m1674z(m1675z("\u001af,h`|s8uovb$o")), m1674z(m1675z("\u001aa\"ga|")), m1674z(m1675z("\u001af,h`|s8uað~,dk|")), m1674z(m1675z("\u001af,h`|s8uxk{(")), m1674z(m1675z("\u001af,h`|s8ums}8~if~$mb|")), m1674z(m1675z("\u001af,h`|s8uh|b!ko|m!ckww")), m1674z(m1675z("\u001aq%keww2|ika2~m{~(ky")), m1674z(m1675z("\u001af,h`|s8ulb=xetw2fe~|(")), m1674z(m1675z("\u001af,h`|s8uewa(xi"))};

    /* renamed from: a */
    private static final C0582d m1672a(WDObjet wDObjet, int i, boolean z) {
        C0582d c0582d = wDObjet != null ? (C0582d) wDObjet.checkType(C0582d.class) : null;
        if (c0582d == null) {
            String[] strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1229z[10], String.valueOf(i));
            String str = f1229z[9];
            String[] strArr2 = new String[2];
            strArr2[0] = wDObjet != null ? wDObjet.getNomType() : "";
            strArr2[1] = C0745b.m3220a(f1229z[8], new String[0]);
            strArr[1] = C0745b.m3222b(str, strArr2);
            WDErreurManager.m2886a(strArr);
            return null;
        } else if (!z || c0582d.mo2481f()) {
            return c0582d;
        } else {
            WDErreurManager.m2883a(C0745b.m3222b(f1229z[11], new String[0]));
            return c0582d;
        }
    }

    /* renamed from: a */
    private static final <T extends C0758k> T m1673a(WDObjet wDObjet, int i, Class<T> cls, boolean z) {
        T t = wDObjet != null ? (C0758k) wDObjet.checkType(cls) : null;
        if (t == null) {
            String[] strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1229z[10], String.valueOf(i));
            String str = f1229z[9];
            String[] strArr2 = new String[2];
            strArr2[0] = wDObjet != null ? wDObjet.getNomType() : "";
            strArr2[1] = C0745b.m3220a(f1229z[8], new String[0]);
            strArr[1] = C0745b.m3222b(str, strArr2);
            WDErreurManager.m2886a(strArr);
            return null;
        } else if (!z || t.mo2481f()) {
            return t;
        } else {
            WDErreurManager.m2883a(C0745b.m3222b(f1229z[11], new String[0]));
            return t;
        }
    }

    public static void chaineVersTableau(WDObjet wDObjet, WDObjet wDObjet2) {
        chaineVersTableau(wDObjet, wDObjet2, f1229z[12], C0607n.Gc);
    }

    public static void chaineVersTableau(WDObjet wDObjet, WDObjet wDObjet2, String str) {
        chaineVersTableau(wDObjet, wDObjet2, str, C0607n.Gc);
    }

    public static void chaineVersTableau(WDObjet wDObjet, WDObjet wDObjet2, String str, String str2) {
        WDContexte a = C0677k.m2775a(f1229z[25]);
        try {
            ((C0759o) m1673a(wDObjet2, 1, C0759o.class, true)).mo2656a(wDObjet.getString(), str, str2);
        } finally {
            a.m2735v();
        }
    }

    public static void csvVersTableau(WDObjet wDObjet, WDObjet wDObjet2) {
        csvVersTableau(wDObjet, wDObjet2, ";");
    }

    public static void csvVersTableau(WDObjet wDObjet, WDObjet wDObjet2, String str) {
        chaineVersTableau(wDObjet, wDObjet2, f1229z[12], str);
    }

    public static void motVersTableau(String str, WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1229z[3]);
        try {
            ((C0759o) m1673a(wDObjet, 1, C0759o.class, true)).mo2665c(str);
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet moyenne(WDObjet[] wDObjetArr) {
        WDContexte a = C0677k.m2775a(f1229z[17]);
        try {
            WDObjet wDEntier4;
            int length = wDObjetArr.length;
            if (length == 0) {
                wDEntier4 = new WDEntier4(0);
            } else {
                C0759o c0759o = (C0759o) wDObjetArr[0].checkType(C0759o.class);
                if (c0759o == null || length > 2) {
                    WDObjet wDObjet = wDObjetArr[0];
                    for (int i = 1; i < length; i++) {
                        wDObjet = wDObjet.opPlus(wDObjetArr[1]);
                    }
                    wDEntier4 = wDObjet.opDiv(length);
                    a.m2735v();
                } else {
                    wDEntier4 = c0759o.m3437b(wDObjetArr.length == 2 ? wDObjetArr[1] : null, 2);
                    a.m2735v();
                }
            }
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet somme(WDObjet wDObjet) {
        return somme(wDObjet, null);
    }

    public static final WDObjet somme(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2775a(f1229z[20]);
        try {
            WDObjet b = ((C0759o) m1673a(wDObjet, 1, C0759o.class, true)).m3437b(wDObjet2, 1);
            return b;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 tableauAjoute(WDObjet wDObjet) {
        return tableauAjoute(wDObjet, null);
    }

    public static WDEntier4 tableauAjoute(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2775a(f1229z[0]);
        WDEntier4 wDEntier4 = true;
        try {
            wDEntier4 = new WDEntier4(m1672a(wDObjet, 1, true).mo2475b(wDObjet2));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet tableauAjouteLigne(WDObjet wDObjet, WDObjet... wDObjetArr) {
        WDContexte a = C0677k.m2775a(f1229z[23]);
        WDObjet wDObjet2 = true;
        try {
            wDObjet2 = new WDEntier4(m1672a(wDObjet, 1, true).mo2464a(wDObjetArr));
            return wDObjet2;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 tableauCherche(WDObjet wDObjet, int i, WDObjet[] wDObjetArr) {
        WDContexte a = C0677k.m2775a(f1229z[16]);
        WDEntier4 wDEntier4 = true;
        try {
            wDEntier4 = new WDEntier4(m1672a(wDObjet, 1, true).mo2467a(i, wDObjetArr));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet tableauChercheParProcedure(WDObjet wDObjet, C0486m c0486m, int i) {
        return tableauChercheParProcedure(wDObjet, c0486m, i, 1, new WDObjet[0]);
    }

    public static final WDObjet tableauChercheParProcedure(WDObjet wDObjet, C0486m c0486m, int i, int i2) {
        return tableauChercheParProcedure(wDObjet, c0486m, i, i2, new WDObjet[0]);
    }

    public static final WDObjet tableauChercheParProcedure(WDObjet wDObjet, C0486m c0486m, int i, int i2, WDObjet... wDObjetArr) {
        WDContexte a = C0677k.m2775a(f1229z[5]);
        WDObjet wDObjet2 = true;
        try {
            wDObjet2 = new WDEntier4(m1672a(wDObjet, 1, true).mo2468a(c0486m, i, i2, wDObjetArr));
            return wDObjet2;
        } finally {
            a.m2735v();
        }
    }

    public static void tableauCopie(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2775a(f1229z[19]);
        try {
            C0758k a2 = m1673a(wDObjet, 1, C0758k.class, true);
            C0758k a3 = m1673a(wDObjet2, 2, C0758k.class, false);
            if (a2 != a3) {
                a3.mo2654a(a2);
                a.m2735v();
            }
        } finally {
            a.m2735v();
        }
    }

    public static final void tableauDeplace(WDObjet wDObjet, int i, int i2) {
        tableauDeplace(wDObjet, i, i2, 0);
    }

    public static final void tableauDeplace(WDObjet wDObjet, int i, int i2, int i3) {
        WDContexte a = C0677k.m2775a(f1229z[7]);
        try {
            C0582d a2 = m1672a(wDObjet, 1, true);
            if (i3 == Integer.MIN_VALUE) {
                a2.mo2477b(i, i2);
            } else {
                a2.mo2472a(i, i2);
            }
            a.m2735v();
        } catch (Throwable th) {
            a.m2735v();
        }
    }

    public static final void tableauDeplaceLigne(WDObjet wDObjet, int i, int i2) {
        tableauDeplaceLigne(wDObjet, i, i2, 0);
    }

    public static final void tableauDeplaceLigne(WDObjet wDObjet, int i, int i2, int i3) {
        WDContexte a = C0677k.m2775a(f1229z[24]);
        try {
            C0582d a2 = m1672a(wDObjet, 1, true);
            if (i3 == Integer.MIN_VALUE) {
                a2.mo2477b(i, i2);
            } else {
                a2.mo2472a(i, i2);
            }
            a.m2735v();
        } catch (Throwable th) {
            a.m2735v();
        }
    }

    public static final void tableauEchangeLigne(WDObjet wDObjet, int i, int i2) {
        WDContexte a = C0677k.m2775a(f1229z[6]);
        try {
            m1672a(wDObjet, 1, true).mo2477b(i, i2);
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 tableauInfo(WDObjet wDObjet, int i) {
        return tableauInfo(wDObjet, i, 1);
    }

    public static WDEntier4 tableauInfo(WDObjet wDObjet, int i, int i2) {
        WDContexte a = C0677k.m2775a(f1229z[2]);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(C0759o.m3397a(m1673a(wDObjet, 1, C0758k.class, false), i, i2));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static void tableauInsere(WDObjet wDObjet, WDObjet wDObjet2) {
        tableauInsere(wDObjet, wDObjet2, null);
    }

    public static void tableauInsere(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        WDContexte a = C0677k.m2775a(f1229z[27]);
        try {
            m1672a(wDObjet, 1, true).mo2474a(wDObjet3, wDObjet2);
        } finally {
            a.m2735v();
        }
    }

    public static final void tableauInsereLigne(WDObjet wDObjet, WDObjet wDObjet2, WDObjet... wDObjetArr) {
        WDContexte a = C0677k.m2775a(f1229z[1]);
        try {
            m1672a(wDObjet, 1, true).mo2466a(wDObjet2, wDObjetArr);
        } finally {
            a.m2735v();
        }
    }

    public static final void tableauInverse(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1229z[4]);
        try {
            m1672a(wDObjet, 1, true).mo2476b();
        } finally {
            a.m2735v();
        }
    }

    public static final void tableauMelange(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1229z[21]);
        try {
            m1672a(wDObjet, 1, true).mo2479c();
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 tableauOccurrence(WDObjet wDObjet) {
        WDEntier4 wDEntier4 = 18;
        WDContexte a = C0677k.m2775a(f1229z[18]);
        try {
            C0582d c0582d = (C0582d) wDObjet.checkType(C0582d.class);
            if (c0582d != null) {
                wDEntier4 = c0582d instanceof C0758k;
                if (wDEntier4 == 0) {
                    wDEntier4 = new WDEntier4(c0582d.mo2483h());
                    return wDEntier4;
                }
            }
            wDEntier4 = m1673a(wDObjet, 1, C0758k.class, false);
            WDEntier4 wDEntier42 = new WDEntier4(wDEntier4.mo2644p());
            a.m2735v();
            return wDEntier42;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 tableauSupprime(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2775a(f1229z[14]);
        WDEntier4 wDEntier4 = true;
        try {
            wDEntier4 = new WDEntier4(m1672a(wDObjet, 1, true).mo2478c(wDObjet2));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final void tableauSupprimeLigne(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2775a(f1229z[26]);
        try {
            m1672a(wDObjet, 1, true).mo2465a(wDObjet2);
        } finally {
            a.m2735v();
        }
    }

    public static void tableauSupprimeTout(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1229z[13]);
        try {
            m1672a(wDObjet, 1, true).mo2480e();
        } finally {
            a.m2735v();
        }
    }

    public static void tableauTrie(WDObjet wDObjet) {
        tableauTrie(wDObjet, 1, null);
    }

    public static void tableauTrie(WDObjet wDObjet, int i) {
        tableauTrie(wDObjet, i, null);
    }

    public static void tableauTrie(WDObjet wDObjet, int i, C0486m c0486m) {
        WDContexte a = C0677k.m2775a(f1229z[22]);
        try {
            m1672a(wDObjet, 1, true).mo2473a(i, c0486m);
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine tableauVersCSV(WDObjet wDObjet) {
        return tableauVersCSV(wDObjet, ";");
    }

    public static WDChaine tableauVersCSV(WDObjet wDObjet, String str) {
        return tableauVersChaine(wDObjet, f1229z[12], str);
    }

    public static WDChaine tableauVersCSV(WDObjet wDObjet, String str, String str2) {
        return tableauVersChaine(wDObjet, str, str2);
    }

    public static WDChaine tableauVersChaine(WDObjet wDObjet) {
        return tableauVersChaine(wDObjet, f1229z[12], C0607n.Gc);
    }

    public static WDChaine tableauVersChaine(WDObjet wDObjet, String str) {
        return tableauVersChaine(wDObjet, str, C0607n.Gc);
    }

    public static WDChaine tableauVersChaine(WDObjet wDObjet, String str, String str2) {
        WDContexte a = C0677k.m2775a(f1229z[15]);
        try {
            C0759o c0759o = (C0759o) m1673a(wDObjet, 1, C0759o.class, true);
            StringBuffer stringBuffer = new StringBuffer();
            c0759o.mo2657a(stringBuffer, str, str2);
            WDChaine wDChaine = new WDChaine(stringBuffer.toString());
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    /* renamed from: z */
    private static String m1674z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 57;
                    break;
                case 1:
                    i2 = 50;
                    break;
                case 2:
                    i2 = 109;
                    break;
                case 3:
                    i2 = 42;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1675z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 44);
        }
        return toCharArray;
    }
}
