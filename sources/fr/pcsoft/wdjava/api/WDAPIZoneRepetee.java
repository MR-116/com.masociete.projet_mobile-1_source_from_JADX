package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.WDIndirection;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0663e;
import fr.pcsoft.wdjava.core.p035c.C0666h;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0548s;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.bd;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.zr.WDAttributZR;
import fr.pcsoft.wdjava.ui.champs.zr.WDRuptureZR;
import fr.pcsoft.wdjava.ui.champs.zr.WDZoneRepetee;
import fr.pcsoft.wdjava.ui.champs.zr.lc;
import fr.pcsoft.wdjava.ui.utils.C1502a;

public class WDAPIZoneRepetee {
    /* renamed from: a */
    protected static final int f1239a = 4;
    /* renamed from: z */
    private static final String[] f1240z = new String[]{m1695z(m1696z("adXzr\u0016~Elq\u0017~Ha")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzz\flXzk\u001b")), m1695z(m1696z("a|Viv\u0017xHf|\fyCd}\u0016oHl}\u0014k[lw\u0007")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRz`\u0007fRfg")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRz`\u0007fRfg\u001dgXl}\u0011")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzr\beBql\u0007dHf|\u0017xD")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRz|\u0001iBwa\u0007dT`")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRz~\rn^cz\u0007u[lt\fo")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzr\beBqv\u001dl^")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzc\ry^qz\rd")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRz`\u0017zGwz\u000foHq|\u0017~")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzv\fxXp\u0007uS`a\r[`")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzg\u0010cR")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzz\fyRwv")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzr\beBqv\u001df^b}\u0007")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRza\u0003lEdz\u0001b^v`\u0007gRkg\u001d|^vz\u0000fR")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzz\fyRwv\u001df^b}\u0007")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRz~\rn^cz\u0007uQl")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzw\u0007xXp\u0007")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzp\noEf{\u0007uGda\u0016eBq")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRz`\u0007fRfg\u001dz[p`")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzw\u0007xXp\u0007uCjf\u0016")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzv\fxXp\u0007uCjf\u0016")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRz`\u0017zGwz\u000fo")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzw\u0007z[dp\u0007u[lt\fo")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRz`\u0007fRfg\u001deTff\u0010xRkp\u0007")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzv\fxRbz\u0011~E`")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzz\fn^fv\u001dxBug\u0017xR")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzr\fdBiv\u001dhVir\u001bkP`")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzr\u0004l^f{\u0007")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzz\fyRwv\u001dl^")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzr\beBqv")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRz~\rn^cz\u0007")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzp\noEf{\u0007")), m1695z(m1696z("aoEwv\u0017xHur\u0011yVbv\u001dzVwr\u000f")), m1695z(m1696z("apXkv\u001dxRuv\u0016oRzv\fxXp\u0007"))};

    /* renamed from: a */
    private static WDBooleen m1693a(lc lcVar, String str) {
        String[] a = C0808l.m4028a(str);
        if (a.length == 0) {
            return new WDBooleen(false);
        }
        boolean z;
        if (a.length == 1) {
            String str2 = a[0];
            if (str2.length() > 0) {
                char charAt = str2.charAt(0);
                String substring = (charAt == '-' || charAt == '+') ? str2.substring(1, str2.length()) : str2;
                String str3 = substring;
                z = charAt != '-';
                str2 = str3;
            } else {
                z = true;
            }
            WDObjet 2 = WDIndirection.get2(str2, 4);
            if (2 != null && 2.isZoneRepetee()) {
                return new WDBooleen(((WDZoneRepetee) 2).trierZR(null, z, true));
            }
        }
        z = true;
        int[] iArr = new int[a.length];
        boolean z2 = z;
        int i = 0;
        while (i < a.length) {
            String str4;
            boolean z3;
            WDAttributZR attributByName;
            String str5 = a[i];
            if (str5.length() > 0) {
                char charAt2 = str5.charAt(0);
                if (charAt2 == '-' || charAt2 == '+') {
                    str5 = str5.substring(1, str5.length());
                }
                str4 = str5;
                z3 = charAt2 != '-';
            } else {
                str4 = str5;
                z3 = z2;
            }
            if (lcVar != null) {
                attributByName = lcVar.getAttributByName(str4);
                if (attributByName == null) {
                    WDErreurManager.m2883a(C0745b.m3222b(f1240z[0], str4, lcVar.getName()));
                }
            } else {
                attributByName = (WDAttributZR) m1694a(new WDChaine(str4), 1, WDAttributZR.class);
            }
            if (lcVar == null) {
                lcVar = attributByName.getZoneRepetee();
            }
            iArr[i] = attributByName.getIndiceAttribut() + 1;
            if (attributByName.isTriNumerique()) {
                iArr[i] = iArr[i] + 4096;
            }
            if (!z3) {
                iArr[i] = iArr[i] * -1;
            }
            i++;
            z2 = z3;
        }
        return new WDBooleen(lcVar.trierZR(iArr, z2, true));
    }

    /* renamed from: a */
    private static final <T extends C0489p> T m1694a(WDObjet wDObjet, int i, Class<T> cls) {
        try {
            return (C0489p) C1502a.m10417a(wDObjet, (Class) cls);
        } catch (C0666h e) {
            String[] strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1240z[34], String.valueOf(i));
            strArr[1] = e.getMessage();
            WDErreurManager.m2886a(strArr);
            return null;
        } catch (C0663e e2) {
            C0663e c0663e = e2;
            String[] strArr2;
            if (cls == WDAttributZR.class) {
                gc gcVar = (gc) wDObjet.checkType(gc.class);
                if (gcVar != null) {
                    T premierAttribut = gcVar.getPremierAttribut();
                    try {
                        if (premierAttribut instanceof WDAttributZR) {
                            return premierAttribut;
                        }
                    } catch (C0666h e3) {
                        throw e3;
                    }
                }
                strArr2 = new String[2];
                strArr2[0] = C0745b.m3222b(f1240z[34], String.valueOf(i));
                strArr2[1] = c0663e.m2671a(1015);
                WDErreurManager.m2886a(strArr2);
                return null;
            }
            strArr2 = new String[2];
            strArr2[0] = C0745b.m3222b(f1240z[34], String.valueOf(i));
            strArr2[1] = c0663e.m2671a(1014);
            WDErreurManager.m2886a(strArr2);
            return null;
        }
    }

    /* renamed from: z */
    private static String m1695z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 66;
                    break;
                case 1:
                    i2 = 42;
                    break;
                case 2:
                    i2 = 23;
                    break;
                case 3:
                    i2 = 37;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1696z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 51);
        }
        return toCharArray;
    }

    public static void zoneRepeteeAffiche(WDObjet wDObjet) {
        zoneRepeteeAffiche(wDObjet, new WDChaine("I"));
    }

    public static synchronized void zoneRepeteeAffiche(WDObjet wDObjet, WDObjet wDObjet2) {
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[29], 4);
            try {
                WDZoneRepetee wDZoneRepetee = (WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class);
                if (wDObjet2.isNumerique()) {
                    wDZoneRepetee._tableAffiche(wDObjet2.getInt());
                } else {
                    wDZoneRepetee._tableAffiche(wDObjet2.getString());
                }
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static final WDBooleen zoneRepeteeAjoutEnCours(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1240z[5], 4);
        try {
            WDBooleen wDBooleen = new WDBooleen(((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class)).isLoadingViewVisible());
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final void zoneRepeteeAjoutEnCours(WDObjet wDObjet, boolean z) {
        WDContexte a = C0677k.m2776a(f1240z[5], 4);
        try {
            ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class)).setLoadingViewVisible(z);
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen zoneRepeteeAjoute(WDObjet wDObjet) {
        return zoneRepeteeAjoute(wDObjet, "");
    }

    public static synchronized WDBooleen zoneRepeteeAjoute(WDObjet wDObjet, String str) {
        WDBooleen _tableAjoute;
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[31], 4);
            try {
                _tableAjoute = ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class))._tableAjoute(str);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return _tableAjoute;
    }

    public static WDEntier4 zoneRepeteeAjouteFI(WDObjet wDObjet, WDObjet wDObjet2) {
        return zoneRepeteeAjouteFI(wDObjet, wDObjet2, new WDObjet[0]);
    }

    public static WDEntier4 zoneRepeteeAjouteFI(WDObjet wDObjet, WDObjet wDObjet2, WDObjet... wDObjetArr) {
        WDContexte a = C0677k.m2776a(f1240z[8], 4);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class)).addFI(C1502a.m10418a(wDObjet2), wDObjetArr));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 zoneRepeteeAjouteLigne(WDObjet wDObjet) {
        return zoneRepeteeAjouteLigne(wDObjet, new WDObjet[0]);
    }

    public static synchronized WDEntier4 zoneRepeteeAjouteLigne(WDObjet wDObjet, WDObjet[] wDObjetArr) {
        WDEntier4 wDEntier4;
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[14], 4);
            try {
                wDEntier4 = new WDEntier4(((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class)).ajouterElement(wDObjetArr));
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDEntier4;
    }

    public static final void zoneRepeteeAnnuleBalayage(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1240z[28], 4);
        try {
            ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class)).cancelSwipe();
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 zoneRepeteeCherche(WDObjet wDObjet, String str) {
        return zoneRepeteeCherche(wDObjet, str, true, 1);
    }

    public static WDEntier4 zoneRepeteeCherche(WDObjet wDObjet, String str, int i) {
        return zoneRepeteeCherche(wDObjet, str, i, 1);
    }

    public static synchronized WDEntier4 zoneRepeteeCherche(WDObjet wDObjet, String str, int i, int i2) {
        WDEntier4 wDEntier4;
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[33], 4);
            try {
                wDEntier4 = new WDEntier4(((WDAttributZR) m1694a(wDObjet, 1, WDAttributZR.class)).chercherElement(str, i, i2));
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDEntier4;
    }

    public static WDEntier4 zoneRepeteeCherche(WDObjet wDObjet, String str, boolean z) {
        return zoneRepeteeCherche(wDObjet, str, z, 1);
    }

    public static synchronized WDEntier4 zoneRepeteeCherche(WDObjet wDObjet, String str, boolean z, int i) {
        WDEntier4 zoneRepeteeCherche;
        synchronized (WDAPIZoneRepetee.class) {
            zoneRepeteeCherche = zoneRepeteeCherche(wDObjet, str, z ? 1 : 0, i);
        }
        return zoneRepeteeCherche;
    }

    public static WDEntier4 zoneRepeteeCherchePartout(WDObjet wDObjet, String str) {
        return zoneRepeteeCherchePartout(wDObjet, str, -1, 1);
    }

    public static WDEntier4 zoneRepeteeCherchePartout(WDObjet wDObjet, String str, int i) {
        return zoneRepeteeCherchePartout(wDObjet, str, i, 1);
    }

    public static WDEntier4 zoneRepeteeCherchePartout(WDObjet wDObjet, String str, int i, int i2) {
        WDContexte a = C0677k.m2776a(f1240z[19], 4);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class)).chercherElementSurAttribut(null, str, i, i2));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static synchronized WDEntier4 zoneRepeteeDeplaceLigne(WDObjet wDObjet, int i, WDObjet wDObjet2) {
        WDEntier4 zoneRepeteeDeplaceLigne;
        synchronized (WDAPIZoneRepetee.class) {
            zoneRepeteeDeplaceLigne = zoneRepeteeDeplaceLigne(wDObjet, i, wDObjet2, 0);
        }
        return zoneRepeteeDeplaceLigne;
    }

    public static synchronized WDEntier4 zoneRepeteeDeplaceLigne(WDObjet wDObjet, int i, WDObjet wDObjet2, int i2) {
        WDEntier4 _tableDeplaceLigne;
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[24], 4);
            try {
                _tableDeplaceLigne = ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class))._tableDeplaceLigne(i, wDObjet2, i2);
                a.m2735v();
            } catch (bd e) {
                WDErreurManager.m2877a(a, e.getMessage());
                _tableDeplaceLigne = new WDEntier4(-1);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return _tableDeplaceLigne;
    }

    public static final void zoneRepeteeDeroule() {
        zoneRepeteeDeroule(null, -1, null);
    }

    public static final void zoneRepeteeDeroule(WDObjet wDObjet) {
        zoneRepeteeDeroule(wDObjet, -1, null);
    }

    public static final void zoneRepeteeDeroule(WDObjet wDObjet, int i) {
        zoneRepeteeDeroule(wDObjet, i, null);
    }

    public static final void zoneRepeteeDeroule(WDObjet wDObjet, int i, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2776a(f1240z[18], 4);
        try {
            ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class)).deroulerRupure(i, wDObjet2 != null ? (WDRuptureZR) m1694a(wDObjet2, 3, WDRuptureZR.class) : null);
        } finally {
            a.m2735v();
        }
    }

    public static final void zoneRepeteeDerouleTout() {
        zoneRepeteeDerouleTout(null);
    }

    public static final void zoneRepeteeDerouleTout(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1240z[21], 4);
        try {
            ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class)).deroulerTout();
        } finally {
            a.m2735v();
        }
    }

    public static synchronized void zoneRepeteeEnregistre(WDObjet wDObjet) {
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[26], 4);
            try {
                ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class))._tableEnregistre();
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static final void zoneRepeteeEnroule() {
        zoneRepeteeEnroule(null, -1, null);
    }

    public static final void zoneRepeteeEnroule(WDObjet wDObjet) {
        zoneRepeteeEnroule(wDObjet, -1, null);
    }

    public static final void zoneRepeteeEnroule(WDObjet wDObjet, int i) {
        zoneRepeteeEnroule(wDObjet, i, null);
    }

    public static final void zoneRepeteeEnroule(WDObjet wDObjet, int i, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2776a(f1240z[35], 4);
        try {
            ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class)).enroulerRupure(i, wDObjet2 != null ? (WDRuptureZR) m1694a(wDObjet2, 3, WDRuptureZR.class) : null);
        } finally {
            a.m2735v();
        }
    }

    public static final void zoneRepeteeEnrouleDeroule() {
        zoneRepeteeEnrouleDeroule(null, -1, null);
    }

    public static final void zoneRepeteeEnrouleDeroule(WDObjet wDObjet) {
        zoneRepeteeEnrouleDeroule(wDObjet, -1, null);
    }

    public static final void zoneRepeteeEnrouleDeroule(WDObjet wDObjet, int i) {
        zoneRepeteeEnrouleDeroule(wDObjet, i, null);
    }

    public static final void zoneRepeteeEnrouleDeroule(WDObjet wDObjet, int i, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2776a(f1240z[11], 4);
        try {
            ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class)).enroulerDeroulerRupure(i, wDObjet2 != null ? (WDRuptureZR) m1694a(wDObjet2, 3, WDRuptureZR.class) : null);
        } finally {
            a.m2735v();
        }
    }

    public static final void zoneRepeteeEnrouleTout() {
        zoneRepeteeEnrouleTout(null);
    }

    public static final void zoneRepeteeEnrouleTout(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1240z[22], 4);
        try {
            ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class)).enroulerTout();
        } finally {
            a.m2735v();
        }
    }

    public static final WDEntier4 zoneRepeteeIndiceRupture(WDObjet wDObjet) {
        return zoneRepeteeIndiceRupture(wDObjet, -1);
    }

    public static final WDEntier4 zoneRepeteeIndiceRupture(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2776a(f1240z[27], 4);
        try {
            WDRuptureZR wDRuptureZR = (WDRuptureZR) m1694a(wDObjet, 1, WDRuptureZR.class);
            WDEntier4 wDEntier4 = new WDEntier4(wDRuptureZR.getZoneRepetee().getIndiceRupture(wDRuptureZR, i));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static synchronized WDObjet zoneRepeteeInfoXY(WDObjet wDObjet, int i, int i2, int i3) {
        WDObjet wDObjet2;
        boolean z = false;
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[1], 4);
            try {
                WDZoneRepetee wDZoneRepetee = (WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class);
                if ((i & 65536) == 65536) {
                    i -= 65536;
                    z = true;
                }
                WDObjet wDEntier4;
                switch (i) {
                    case 1:
                        wDEntier4 = new WDEntier4(wDZoneRepetee.getInfoLigneXY(i2, i3, z));
                        a.m2735v();
                        wDObjet2 = wDEntier4;
                        break;
                    case 4:
                        wDEntier4 = new WDChaine(wDZoneRepetee.getInfoChampXY(i2, i3, z));
                        a.m2735v();
                        wDObjet2 = wDEntier4;
                        break;
                    default:
                        WDErreurManager.m2883a(C0745b.m3222b(f1240z[2], String.valueOf(i)));
                        wDObjet2 = null;
                        a.m2735v();
                        break;
                }
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDObjet2;
    }

    public static WDBooleen zoneRepeteeInsere(WDObjet wDObjet) {
        return zoneRepeteeInsere(wDObjet, "", -1);
    }

    public static WDBooleen zoneRepeteeInsere(WDObjet wDObjet, String str) {
        return zoneRepeteeInsere(wDObjet, str, -1);
    }

    public static synchronized WDBooleen zoneRepeteeInsere(WDObjet wDObjet, String str, int i) {
        WDBooleen _tableInsere;
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[13], 4);
            try {
                _tableInsere = ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class))._tableInsere(str, i);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return _tableInsere;
    }

    public static void zoneRepeteeInsereFI(WDObjet wDObjet, int i, WDObjet wDObjet2, WDObjet... wDObjetArr) {
        WDContexte a = C0677k.m2776a(f1240z[30], 4);
        try {
            ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class)).insertFI(C1502a.m10418a(wDObjet2), i, wDObjetArr);
        } finally {
            a.m2735v();
        }
    }

    public static void zoneRepeteeInsereLigne(WDObjet wDObjet) {
        zoneRepeteeInsereLigne(wDObjet, -1, new WDObjet[0]);
    }

    public static void zoneRepeteeInsereLigne(WDObjet wDObjet, int i) {
        zoneRepeteeInsereLigne(wDObjet, i, new WDObjet[0]);
    }

    public static synchronized void zoneRepeteeInsereLigne(WDObjet wDObjet, int i, WDObjet[] wDObjetArr) {
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[16], 4);
            try {
                ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class)).insererElement(wDObjetArr, i);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static void zoneRepeteeModifie(WDObjet wDObjet) {
        zoneRepeteeModifie(wDObjet, "", -1);
    }

    public static void zoneRepeteeModifie(WDObjet wDObjet, String str) {
        zoneRepeteeModifie(wDObjet, str, -1);
    }

    public static synchronized void zoneRepeteeModifie(WDObjet wDObjet, String str, int i) {
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[32], 4);
            try {
                ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class))._tableModifie(str, i);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static void zoneRepeteeModifieFI(WDObjet wDObjet, int i, WDObjet wDObjet2, WDObjet... wDObjetArr) {
        WDContexte a = C0677k.m2776a(f1240z[17], 4);
        try {
            ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class)).modifyFI(C1502a.m10418a(wDObjet2), i, wDObjetArr);
        } finally {
            a.m2735v();
        }
    }

    public static void zoneRepeteeModifieLigne(WDObjet wDObjet) {
        zoneRepeteeModifieLigne(wDObjet, -1, new WDObjet[0]);
    }

    public static void zoneRepeteeModifieLigne(WDObjet wDObjet, int i) {
        zoneRepeteeModifieLigne(wDObjet, i, new WDObjet[0]);
    }

    public static synchronized void zoneRepeteeModifieLigne(WDObjet wDObjet, int i, WDObjet[] wDObjetArr) {
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[7], 4);
            try {
                ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class)).modifierElement(wDObjetArr, i);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static WDEntier4 zoneRepeteeOccurrence(WDObjet wDObjet) {
        return zoneRepeteeOccurrence(wDObjet, 1);
    }

    public static synchronized WDEntier4 zoneRepeteeOccurrence(WDObjet wDObjet, int i) {
        WDEntier4 _tableOccurrence;
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[6], 4);
            try {
                _tableOccurrence = ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class))._tableOccurrence(i);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return _tableOccurrence;
    }

    public static synchronized WDEntier4 zoneRepeteePosition(WDObjet wDObjet) {
        WDEntier4 _tablePosition;
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[9], 4);
            try {
                _tablePosition = ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class))._tablePosition();
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return _tablePosition;
    }

    public static synchronized void zoneRepeteePosition(WDObjet wDObjet, int i) {
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[9], 4);
            try {
                ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class))._tablePosition(i);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static final WDBooleen zoneRepeteeRafraichissementVisible(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1240z[15], 4);
        try {
            WDBooleen _tableRafraichissementVisible = ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class))._tableRafraichissementVisible();
            return _tableRafraichissementVisible;
        } finally {
            a.m2735v();
        }
    }

    public static final void zoneRepeteeRafraichissementVisible(WDObjet wDObjet, boolean z) {
        WDContexte a = C0677k.m2776a(f1240z[15], 4);
        try {
            ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class))._tableRafraichissementVisible(z);
        } finally {
            a.m2735v();
        }
    }

    public static synchronized WDEntier4 zoneRepeteeSelect(WDObjet wDObjet) {
        WDEntier4 _tableSelect;
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[3], 4);
            try {
                _tableSelect = ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class))._tableSelect();
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return _tableSelect;
    }

    public static synchronized WDEntier4 zoneRepeteeSelect(WDObjet wDObjet, int i) {
        WDEntier4 _tableSelect;
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[3], 4);
            try {
                _tableSelect = ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class))._tableSelect(i);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return _tableSelect;
    }

    public static synchronized void zoneRepeteeSelectMoins(WDObjet wDObjet) {
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[4], 4);
            try {
                ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class))._tableSelectMoins();
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static synchronized void zoneRepeteeSelectMoins(WDObjet wDObjet, int[] iArr) {
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[4], 4);
            try {
                ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class))._tableSelectMoins(iArr);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static synchronized WDEntier4 zoneRepeteeSelectOccurrence(WDObjet wDObjet) {
        WDEntier4 _tableSelectOccurrence;
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[25], 4);
            try {
                _tableSelectOccurrence = ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class))._tableSelectOccurrence();
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return _tableSelectOccurrence;
    }

    public static synchronized void zoneRepeteeSelectPlus(WDObjet wDObjet) {
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[20], 4);
            try {
                ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class))._tableSelectPlus();
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static synchronized void zoneRepeteeSelectPlus(WDObjet wDObjet, int[] iArr) {
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[20], 4);
            try {
                ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class))._tableSelectPlus(iArr);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static void zoneRepeteeSupprime(WDObjet wDObjet) {
        zoneRepeteeSupprime(wDObjet, -1, 0);
    }

    public static void zoneRepeteeSupprime(WDObjet wDObjet, int i) {
        zoneRepeteeSupprime(wDObjet, i, 0);
    }

    public static synchronized void zoneRepeteeSupprime(WDObjet wDObjet, int i, int i2) {
        boolean z = true;
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[23], 4);
            try {
                WDZoneRepetee wDZoneRepetee = (WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class);
                if (i2 != 262144) {
                    z = false;
                }
                wDZoneRepetee._tableSupprime(i, z);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static synchronized void zoneRepeteeSupprimeTout(WDObjet wDObjet) {
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[10], 4);
            try {
                ((WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class))._tableSupprimeTout();
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static WDBooleen zoneRepeteeTri(WDObjet wDObjet, boolean z) {
        return zoneRepeteeTrie(wDObjet, new WDBooleen(z));
    }

    public static WDBooleen zoneRepeteeTri(String str) {
        return zoneRepeteeTrie(str);
    }

    public static synchronized WDBooleen zoneRepeteeTrie(WDObjet wDObjet, WDObjet wDObjet2) {
        WDBooleen wDBooleen;
        WDBooleen wDBooleen2 = null;
        Object obj = true;
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a = C0677k.m2776a(f1240z[12], 4);
            try {
                boolean z;
                if (wDObjet.isChaine()) {
                    String str;
                    String string = wDObjet.getString();
                    if (string.length() > 0) {
                        char charAt = string.charAt(0);
                        if (charAt == '-' || charAt == '+') {
                            string = string.substring(1, string.length());
                        }
                        if (charAt == '-') {
                            obj = null;
                        }
                        str = string;
                    } else {
                        str = string;
                    }
                    wDObjet = new WDChaine(str);
                    z = obj;
                } else {
                    z = true;
                }
                WDZoneRepetee wDZoneRepetee = (WDZoneRepetee) m1694a(wDObjet, 1, WDZoneRepetee.class);
                wDBooleen2 = wDObjet2.checkType(C0548s.class);
                if (wDBooleen2 != null) {
                    wDBooleen2 = new WDBooleen(wDZoneRepetee.trierZR(null, z, wDObjet2.getBoolean()));
                    wDBooleen = wDBooleen2;
                } else {
                    wDBooleen2 = wDObjet2.getString();
                    wDBooleen = m1693a(wDZoneRepetee, wDBooleen2);
                    a.m2735v();
                }
            } finally {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static synchronized WDBooleen zoneRepeteeTrie(String str) {
        WDBooleen a;
        synchronized (WDAPIZoneRepetee.class) {
            WDContexte a2 = C0677k.m2776a(f1240z[12], 4);
            try {
                a = m1693a(null, str);
                a2.m2735v();
            } catch (Throwable th) {
                a2.m2735v();
            }
        }
        return a;
    }
}
