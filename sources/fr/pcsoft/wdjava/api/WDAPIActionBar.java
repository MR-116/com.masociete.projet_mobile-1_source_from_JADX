package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0666h;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.p042b.C0658b;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.ui.actionbar.C0491d;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.searchbar.WDSearchHistory;
import fr.pcsoft.wdjava.ui.utils.C1502a;

public class WDAPIActionBar {
    /* renamed from: a */
    private static final int f1125a = 4;
    /* renamed from: z */
    private static final String[] f1126z = new String[]{m1569z(m1570z("lf\u001c\u00145\f|\u001a\u0004:\u0010j\u0012\u0019")), m1569z(m1570z("li\u0010\u001f=\u0000f\f\t5\u001dw\u0000\u001e$\u001fz\u001a\u00061\u0010`\u001a\u0018 \u0000z\u001a\u001a!\nw\u0001\u000e7\u0007m\u0001\b<\n")), m1569z(m1570z("li\u0006\b!\u0001m\f\r1\u0001m\u0007\u00191\u0010m\u001d\u00147\u0000}\u0001\u0018")), m1569z(m1570z("li\u0010\u001f=\u0000f\f\t5\u001dw\u0001\u000e7\u0007m\u0001\b<\nw\u0005\u0002'\u0006j\u001f\u000e")), m1569z(m1570z("lm\u0001\u00191\u001az\f\u001b5\u001c{\u0012\f1\u0010x\u0012\u00195\u0002"))};

    /* renamed from: a */
    private static final C0491d m1567a() {
        WDFenetre wDFenetre = (WDFenetre) WDAppelContexte.getContexte().m2722h();
        if (wDFenetre == null) {
            WDErreurManager.m2883a(C0745b.m3222b(f1126z[2], new String[0]));
        }
        C0491d actionBar = wDFenetre.getActionBar();
        if (actionBar == null) {
            WDErreurManager.m2883a(C0745b.m3222b(f1126z[0], wDFenetre.getName()));
        }
        return actionBar;
    }

    /* renamed from: a */
    protected static final C0508h m1568a(WDObjet wDObjet, int i, boolean z) {
        C0508h c0508h = null;
        try {
            c0508h = C1502a.m10415a(wDObjet, true, z);
        } catch (C0666h e) {
            String[] strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1126z[4], String.valueOf(i));
            strArr[1] = e.getMessage();
            WDErreurManager.m2886a(strArr);
        }
        return c0508h;
    }

    @C0658b(a = C0657a.ICE_CREAM_SANDWICH)
    public static final WDBooleen actionBarRechercheVisible() {
        WDContexte a = C0677k.m2777a(f1126z[3], 4, C0657a.ICE_CREAM_SANDWICH.getNumero());
        try {
            WDBooleen wDBooleen = new WDBooleen(m1567a().isSearchBarVisible());
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    @C0658b(a = C0657a.ICE_CREAM_SANDWICH)
    public static final void actionBarRechercheVisible(boolean z) {
        actionBarRechercheVisible(z, "");
    }

    @C0658b(a = C0657a.ICE_CREAM_SANDWICH)
    public static final void actionBarRechercheVisible(boolean z, String str) {
        WDContexte a = C0677k.m2777a(f1126z[3], 4, C0657a.ICE_CREAM_SANDWICH.getNumero());
        try {
            m1567a().setSearchBarVisible(z, str);
        } finally {
            a.m2735v();
        }
    }

    @C0658b(a = C0657a.ICE_CREAM_SANDWICH)
    public static final void actionBarSupprimeHistoriqueRecherche() {
        actionBarSupprimeHistoriqueRecherche(null);
    }

    @C0658b(a = C0657a.ICE_CREAM_SANDWICH)
    public static final void actionBarSupprimeHistoriqueRecherche(WDObjet wDObjet) {
        WDContexte a = C0677k.m2777a(f1126z[1], 4, C0657a.ICE_CREAM_SANDWICH.getNumero());
        try {
            C0508h a2 = m1568a(wDObjet, 1, true);
            if (((WDFenetre) a2).getActionBar() == null) {
                WDErreurManager.m2883a(C0745b.m3222b(f1126z[0], a2.getNomFenetre()));
            }
            WDSearchHistory.m10341a(a2.getNomFenetre());
        } finally {
            a.m2735v();
        }
    }

    /* renamed from: z */
    private static String m1569z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 79;
                    break;
                case 1:
                    i2 = 40;
                    break;
                case 2:
                    i2 = 83;
                    break;
                case 3:
                    i2 = 75;
                    break;
                default:
                    i2 = 116;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1570z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 116);
        }
        return toCharArray;
    }
}
