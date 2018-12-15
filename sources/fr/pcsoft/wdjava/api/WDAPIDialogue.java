package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.annotation.Unexport;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.dialogue.C1372f;

public class WDAPIDialogue {
    /* renamed from: a */
    private static final int f1145a = 4;
    /* renamed from: z */
    private static final String[] f1146z = new String[]{m1607z(m1608z("\u001a\b;\\7w\t%O3k")), m1607z(m1608z("yt")), m1607z(m1608z("\u001a\u00039B:v\u0000%F")), m1607z(m1608z("\u001a\u0004?M0p\u0015=F$")), m1607z(m1608z("\u001a\u00141J%p\u0002")), m1607z(m1608z("\u001a\u0006&F$m\u000e#P3t\u0002>W")), m1607z(m1608z("\u001a\u0002\"Q3l\u0015")), m1607z(m1608z("\u001a\b%J)w\b>")), m1607z(m1608z("\u001a\u000e>E9"))};

    public static void avertissement(String str) {
        avertissement(str, new String[0]);
    }

    public static void avertissement(String str, String[] strArr) {
        WDContexte a = C0677k.m2776a(f1146z[5], 4);
        try {
            C1372f.m9828a().m9832a(4, str, strArr, 0);
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 confirmer(WDObjet wDObjet, String[] strArr) {
        WDContexte a = C0677k.m2776a(f1146z[3], 4);
        try {
            WDEntier4 wDEntier4;
            if (wDObjet.isNumerique()) {
                String[] strArr2;
                String str = strArr[0];
                if (strArr.length > 1) {
                    Object obj = new String[(strArr.length - 1)];
                    System.arraycopy(strArr, 1, obj, 0, obj.length);
                    strArr2 = obj;
                } else {
                    strArr2 = null;
                }
                wDEntier4 = new WDEntier4(C1372f.m9828a().m9832a(3, str, strArr2, wDObjet.getInt()));
            } else {
                wDEntier4 = new WDEntier4(C1372f.m9828a().m9832a(3, wDObjet.getString(), strArr, 1));
                a.m2735v();
            }
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 confirmer(String str) {
        return confirmer(new WDEntier4(1), new String[]{str});
    }

    public static WDObjet dialogue(int i) {
        return dialogue(i, null);
    }

    public static WDObjet dialogue(int i, String[] strArr) {
        return WDProjet.getInstance().afficherDialogue(i, strArr);
    }

    public static final WDEntier4 dialogue(String str, WDObjet wDObjet) {
        return dialogue(str, wDObjet, -1, -1, f1146z[1]);
    }

    public static final WDEntier4 dialogue(String str, WDObjet wDObjet, int i) {
        return dialogue(str, wDObjet, i, -1, f1146z[1]);
    }

    public static final WDEntier4 dialogue(String str, WDObjet wDObjet, int i, int i2) {
        return dialogue(str, wDObjet, i, i2, f1146z[1]);
    }

    public static final WDEntier4 dialogue(String str, WDObjet wDObjet, int i, int i2, String str2) {
        WDContexte a = C0677k.m2776a(f1146z[2], 4);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(C1372f.m9828a().m9835a(str, null, wDObjet, C0725i.m3011a(i), C0725i.m3011a(i2), str2));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    @Unexport
    public static WDEntier4 dialogue(String str, String[] strArr, int[] iArr, int i, int i2, int i3, String str2, int i4, int i5, String[] strArr2) {
        String a;
        WDEntier4 wDEntier4;
        WDContexte a2 = C0677k.m2776a(f1146z[2], 4);
        if (strArr2 != null) {
            try {
                if (strArr2.length > 0) {
                    a = C0808l.m4021a(str, strArr2);
                    wDEntier4 = new WDEntier4(C1372f.m9828a().mo3743a(a, null, strArr, iArr, i, i2, i3, str2, i4, i5));
                    a2.m2735v();
                    return wDEntier4;
                }
            } catch (Throwable th) {
                a2.m2735v();
            }
        }
        a = str;
        wDEntier4 = new WDEntier4(C1372f.m9828a().mo3743a(a, null, strArr, iArr, i, i2, i3, str2, i4, i5));
        a2.m2735v();
        return wDEntier4;
    }

    @Unexport
    public static WDEntier4 dialogue(String str, String[] strArr, int[] iArr, int i, int i2, int i3, String str2, int i4, String[] strArr2) {
        return dialogue(str, strArr, iArr, i, i2, i3, str2, i4, 0, strArr2);
    }

    public static final void erreur() {
        WDContexte a = C0677k.m2776a(f1146z[6], 4);
        try {
            C1372f.m9828a().m9832a(1, WDErreurManager.m2871a(a, 1), null, 0);
        } finally {
            a.m2735v();
        }
    }

    public static void erreur(String str) {
        erreur(str, new String[0]);
    }

    public static void erreur(String str, String[] strArr) {
        WDContexte a = C0677k.m2776a(f1146z[6], 4);
        try {
            C1372f.m9828a().m9832a(1, str, strArr, 0);
        } finally {
            a.m2735v();
        }
    }

    public static final void erreurConstruit(String str) {
        erreurConstruit(str, null);
    }

    public static final void erreurConstruit(String str, String[] strArr) {
        erreur(C0808l.m4021a(str, strArr));
    }

    public static void info(String str) {
        info(str, new String[0]);
    }

    public static void info(String str, String[] strArr) {
        WDContexte a = C0677k.m2776a(f1146z[8], 4);
        try {
            C1372f.m9828a().m9832a(0, str, strArr, 0);
        } finally {
            a.m2735v();
        }
    }

    public static final void infoConstruit(String str) {
        infoConstruit(str, null);
    }

    public static final void infoConstruit(String str, String[] strArr) {
        info(C0808l.m4021a(str, strArr));
    }

    public static WDEntier4 okAnnuler(WDObjet wDObjet, String[] strArr) {
        int i = 0;
        WDContexte a = C0677k.m2776a(f1146z[0], 4);
        try {
            WDEntier4 wDEntier4;
            if (wDObjet.isNumerique()) {
                String[] strArr2;
                String str = strArr[0];
                if (strArr.length > 1) {
                    Object obj = new String[(strArr.length - 1)];
                    System.arraycopy(strArr, 1, obj, 0, obj.length);
                    strArr2 = obj;
                } else {
                    strArr2 = null;
                }
                C1372f a2 = C1372f.m9828a();
                if (wDObjet.getInt() != 0) {
                    i = 1;
                }
                wDEntier4 = new WDEntier4(a2.m9832a(5, str, strArr2, i));
            } else {
                wDEntier4 = new WDEntier4(C1372f.m9828a().m9832a(5, wDObjet.getString(), strArr, 1));
                a.m2735v();
            }
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 okAnnuler(String str) {
        return okAnnuler(new WDEntier4(1), new String[]{str});
    }

    public static WDEntier4 ouiNon(WDObjet wDObjet, String[] strArr) {
        WDContexte a = C0677k.m2776a(f1146z[7], 4);
        try {
            WDEntier4 wDEntier4;
            if (wDObjet.isNumerique()) {
                String[] strArr2;
                String str = strArr[0];
                if (strArr.length > 1) {
                    Object obj = new String[(strArr.length - 1)];
                    System.arraycopy(strArr, 1, obj, 0, obj.length);
                    strArr2 = obj;
                } else {
                    strArr2 = null;
                }
                wDEntier4 = new WDEntier4(C1372f.m9828a().m9832a(2, str, strArr2, wDObjet.getInt()));
            } else {
                wDEntier4 = new WDEntier4(C1372f.m9828a().m9832a(2, wDObjet.getString(), strArr, 1));
                a.m2735v();
            }
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 ouiNon(String str) {
        return ouiNon(new WDEntier4(1), new String[]{str});
    }

    public static WDObjet saisie(int i, WDObjet wDObjet) {
        return saisie(i, wDObjet, null);
    }

    public static WDObjet saisie(int i, WDObjet wDObjet, String[] strArr) {
        return WDProjet.getInstance().afficherSaisie(i, wDObjet, strArr);
    }

    public static final WDEntier4 saisie(String str, WDObjet wDObjet) {
        return new WDEntier4(C1372f.m9828a().m9835a(str, wDObjet, null, -1, -1, f1146z[1]) == 1 ? 1 : 0);
    }

    public static final WDEntier4 saisie(String str, WDObjet wDObjet, WDObjet wDObjet2) {
        return saisie(str, wDObjet, wDObjet2, -1, -1, f1146z[1]);
    }

    public static final WDEntier4 saisie(String str, WDObjet wDObjet, WDObjet wDObjet2, int i) {
        return saisie(str, wDObjet, wDObjet2, i, -1, f1146z[1]);
    }

    public static final WDEntier4 saisie(String str, WDObjet wDObjet, WDObjet wDObjet2, int i, int i2) {
        return saisie(str, wDObjet, wDObjet2, i, i2, f1146z[1]);
    }

    public static final WDEntier4 saisie(String str, WDObjet wDObjet, WDObjet wDObjet2, int i, int i2, String str2) {
        WDContexte a = C0677k.m2776a(f1146z[2], 4);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(C1372f.m9828a().m9835a(str, wDObjet, wDObjet2, C0725i.m3011a(i), C0725i.m3011a(i2), str2));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    @Unexport
    public static WDEntier4 saisie(String str, String[] strArr, int[] iArr, int i, int i2, int i3, String str2, int i4, int i5, WDObjet wDObjet, String[] strArr2) {
        String a;
        WDEntier4 wDEntier4;
        WDContexte a2 = C0677k.m2776a(f1146z[4], 4);
        if (strArr2 != null) {
            try {
                if (strArr2.length > 0) {
                    a = C0808l.m4021a(str, strArr2);
                    wDEntier4 = new WDEntier4(C1372f.m9828a().mo3743a(a, wDObjet, strArr, iArr, i, i2, i3, str2, i4, i5));
                    a2.m2735v();
                    return wDEntier4;
                }
            } catch (Throwable th) {
                a2.m2735v();
            }
        }
        a = str;
        wDEntier4 = new WDEntier4(C1372f.m9828a().mo3743a(a, wDObjet, strArr, iArr, i, i2, i3, str2, i4, i5));
        a2.m2735v();
        return wDEntier4;
    }

    @Unexport
    public static WDEntier4 saisie(String str, String[] strArr, int[] iArr, int i, int i2, int i3, String str2, int i4, WDObjet wDObjet, String[] strArr2) {
        return saisie(str, strArr, iArr, i, i2, i3, str2, i4, 0, wDObjet, strArr2);
    }

    /* renamed from: z */
    private static String m1607z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 57;
                    break;
                case 1:
                    i2 = 71;
                    break;
                case 2:
                    i2 = 112;
                    break;
                case 3:
                    i2 = 3;
                    break;
                default:
                    i2 = 118;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1608z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 118);
        }
        return toCharArray;
    }
}
