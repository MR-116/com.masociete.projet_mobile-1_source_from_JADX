package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0806j;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0509v;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.p034b.C1125c;
import fr.pcsoft.wdjava.ui.utils.C1511l;

public class WDAPIFenetre extends WDAPIFenetre_Commun {
    /* renamed from: z */
    private static final String[] f1149z = new String[]{m1613z(m1614z("4J\u0002\u0012RTC\u0012\u0010DD_\u0006\u0012YRS\u0011\u0015^^N\u000b\u0019")), m1613z(m1614z("4J\u0002\u0012REI\u0017\u0019DYX")), m1613z(m1614z("QI\t\u0003YVE\u000b\u0010H")), m1613z(m1614z("DU\t\bLOI\u0018\u0012BYS\u0014\t]GC\u0015\bHRS\u0006\u0012IEC\u000e\u0018")), m1613z(m1614z("4J\u0002\u0012RTD\u0006\u0012JRS\u0006\u001bHYO\u0002\u0011HYX")), m1613z(m1614z("4J\u0002\u0012HC^\u0002\u0003_VJ\u0015\u001dDTD\u000e\u000f^RA\u0002\u0012YHZ\u000e\u000fDU@\u0002")), m1613z(m1614z("4J\u0002\u0012RX^\u000e\u0019CCM\u0013\u0015BY")), m1613z(m1614z("4J\u0002\u0012RVK\u0002\u0012NRA\u0002\u0012YHI\t\u0003NXY\u0015\u000f")), m1613z(m1614z("4V\b\u0012HH^\u0002\fHCI\u0002\u0003_VJ\u0015\u001dDTD\u000e\u000f^RA\u0002\u0012YHZ\u000e\u000fDU@\u0002")), m1613z(m1614z("4A\u0012\u0010Y^X\u0006\u001fERS\u0015\u0019]RE\t\b"))};

    public static final WDEntier4 fenAgencementEnCours() {
        return fenAgencementEnCours(WDAppelContexte.getContexte().m2728o());
    }

    public static final WDEntier4 fenAgencementEnCours(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1149z[7], 4);
        int i = -1;
        WDEntier4 wDEntier4 = true;
        try {
            C1125c a2 = C1125c.m8245a(WDAPIFenetre_Commun.m1610a(wDObjet, 1, C0489p.class));
            if (a2 != null) {
                i = a2.m8250b();
            }
            wDEntier4 = new WDEntier4(i < 0 ? 0 : C0725i.m3069e(i));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final void fenChangeAgencement(int i) {
        fenChangeAgencement(WDAppelContexte.getContexte().m2728o(), i);
    }

    public static final void fenChangeAgencement(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2776a(f1149z[4], 4);
        try {
            C1125c a2 = C1125c.m8245a(WDAPIFenetre_Commun.m1610a(wDObjet, 1, C0489p.class));
            if (a2 != null) {
                a2.m8249a(C0725i.m3011a(i));
            }
            a.m2735v();
        } catch (Throwable th) {
            a.m2735v();
        }
    }

    public static final WDBooleen fenCoulissanteVisible(int i) {
        WDBooleen wDBooleen = 4;
        WDContexte a = C0677k.m2776a(f1149z[0], 4);
        try {
            WDFenetre wDFenetre = (WDFenetre) WDAppelContexte.getContexte().m2722h();
            if (wDFenetre != null) {
                wDBooleen = new WDBooleen(wDFenetre.isSlidingMenuVisible(i));
                return wDBooleen;
            }
            wDBooleen = 0;
            WDBooleen wDBooleen2 = new WDBooleen(false);
            a.m2735v();
            return wDBooleen2;
        } finally {
            a.m2735v();
        }
    }

    public static final void fenCoulissanteVisible(int i, boolean z) {
        WDContexte a = C0677k.m2776a(f1149z[0], 4);
        try {
            WDFenetre wDFenetre = (WDFenetre) WDAppelContexte.getContexte().m2722h();
            if (wDFenetre != null) {
                wDFenetre.setSlidingMenuVisible(i, z);
            }
            a.m2735v();
        } catch (Throwable th) {
            a.m2735v();
        }
    }

    public static final WDEntier4 fenOrientation() {
        WDContexte a = C0677k.m2776a(f1149z[6], 4);
        try {
            WDFenetre wDFenetre = (WDFenetre) WDAppelContexte.getContexte().m2722h();
            WDEntier4 wDEntier4 = new WDEntier4(wDFenetre != null ? C1511l.m10524b(wDFenetre.getActivite()) : -1);
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final WDEntier4 fenOrientation(int i) {
        WDContexte a = C0677k.m2776a(f1149z[6], 4);
        try {
            WDFenetre wDFenetre = (WDFenetre) WDAppelContexte.getContexte().m2722h();
            WDEntier4 wDEntier4 = new WDEntier4(wDFenetre != null ? C1511l.m10525b(wDFenetre.getActivite(), i) : -1);
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen fenRafraichissementVisible(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1149z[8], 4);
        WDBooleen wDBooleen = true;
        try {
            wDBooleen = new WDBooleen(((WDFenetre) WDAPIFenetre_Commun.m1609a(wDObjet, 1, true, true)).isRefreshViewVisible());
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final void fenRafraichissementVisible(WDObjet wDObjet, boolean z) {
        WDContexte a = C0677k.m2776a(f1149z[5], 4);
        try {
            ((WDFenetre) WDAPIFenetre_Commun.m1609a(wDObjet, 1, true, true)).setRefreshViewVisible(z);
        } finally {
            a.m2735v();
        }
    }

    public static final void fenRepeint() {
        fenRepeint(null);
    }

    public static final void fenRepeint(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1149z[1]);
        try {
            ((C0509v) WDAPIFenetre_Commun.m1609a(wDObjet, 1, true, true)).getCompConteneur().invalidate();
            C0806j.m3950a(1, C0806j.m3952b(), 1, null);
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 fenTaille() {
        return fenTaille(null);
    }

    public static WDEntier4 fenTaille(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1149z[2], 4);
        WDEntier4 wDEntier4 = true;
        try {
            wDEntier4 = new WDEntier4(((WDFenetre) WDAPIFenetre_Commun.m1609a(wDObjet, 1, true, true)).isMaximisee() ? 2 : 0);
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 fenTaille(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2776a(f1149z[2], 4);
        try {
            WDErreurManager.m2883a(C0745b.m3222b(f1149z[3], new String[0]));
            return null;
        } finally {
            a.m2735v();
        }
    }

    public static void fenTaille(WDObjet wDObjet, int i, int i2) {
        fenTaille(wDObjet, -1, -1, i, i2);
    }

    public static void fenTaille(WDObjet wDObjet, int i, int i2, int i3, int i4) {
        WDContexte a = C0677k.m2776a(f1149z[2], 4);
        try {
            WDFenetre wDFenetre = (WDFenetre) WDAPIFenetre_Commun.m1609a(wDObjet, 1, true, true);
            if (!wDFenetre.isMaximisee()) {
                int displayUnit = wDFenetre.getDisplayUnit();
                if (!(i == -1 && i2 == -1)) {
                    if (i == -1) {
                        i = wDFenetre._getX();
                    }
                    if (i2 == -1) {
                        i2 = wDFenetre._getY();
                    }
                    wDFenetre.setPositionChamp(C1511l.m10532d((float) i, displayUnit), C1511l.m10532d((float) i2, displayUnit), 0);
                }
                if (!(i3 == -1 && i4 == -1)) {
                    if (i3 == -1) {
                        i3 = wDFenetre._getLargeur();
                    }
                    if (i4 == -1) {
                        i4 = wDFenetre._getHauteur();
                    }
                    wDFenetre.setTailleChamp(C1511l.m10532d((float) i3, displayUnit), C1511l.m10532d((float) i4, displayUnit), 0);
                }
                a.m2735v();
            }
        } finally {
            a.m2735v();
        }
    }

    public static final void multitacheRepeint() {
        multitacheRepeint(null);
    }

    public static final void multitacheRepeint(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1149z[9]);
        try {
            ((C0509v) WDAPIFenetre_Commun.m1609a(wDObjet, 1, true, true)).getCompConteneur().invalidate();
            C0806j.m3950a(1, C0806j.m3952b(), 1, null);
        } finally {
            a.m2735v();
        }
    }

    /* renamed from: z */
    private static String m1613z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 23;
                    break;
                case 1:
                    i2 = 12;
                    break;
                case 2:
                    i2 = 71;
                    break;
                case 3:
                    i2 = 92;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1614z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 13);
        }
        return toCharArray;
    }
}
