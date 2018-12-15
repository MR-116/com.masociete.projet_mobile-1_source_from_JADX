package fr.pcsoft.wdjava.p055g;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.file.C0897o;

/* renamed from: fr.pcsoft.wdjava.g.g */
public class C0908g {
    /* renamed from: a */
    private static int f2465a = 0;
    /* renamed from: b */
    private static C0902f f2466b = C0903a.m6344a(1, WDProjet.getInstance().getNom());
    /* renamed from: z */
    private static final String[] f2467z = new String[]{C0908g.m6435z(C0908g.m6436z("DL\\\u0013")), C0908g.m6435z(C0908g.m6436z("Iw~1b>u+t5})p&}u:")), C0908g.m6435z(C0908g.m6436z("D]_\u0016"))};

    /* renamed from: a */
    public static C0902f m6432a() {
        return f2466b;
    }

    /* renamed from: a */
    public static void m6433a(int i, WDObjet wDObjet) {
        String str = "";
        switch (i) {
            case 0:
                f2465a = i;
                f2466b = C0903a.m6344a(1, WDProjet.getInstance().getNom());
                return;
            case 1:
                f2465a = i;
                f2466b = C0903a.m6344a(3, wDObjet == null ? C0897o.m6242a(WDProjet.getInstance().getRepertoireExecution()) + WDProjet.getInstance().getNom() + f2467z[0] : wDObjet.getString());
                return;
            case 2:
                f2465a = i;
                f2466b = C0903a.m6344a(4, (Object) wDObjet);
                return;
            case 3:
                f2465a = i;
                f2466b = C0903a.m6344a(2, wDObjet == null ? C0897o.m6242a(WDProjet.getInstance().getRepertoireExecution()) + WDProjet.getInstance().getNom() + f2467z[2] : wDObjet.getString());
                return;
            default:
                WDErreurManager.m2883a(C0745b.m3222b(f2467z[1], new String[0]));
                return;
        }
    }

    /* renamed from: b */
    public static void m6434b() {
        if (f2465a == 1 || f2465a == 2) {
            f2466b.mo3190b();
        }
    }

    /* renamed from: z */
    private static String m6435z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 106;
                    break;
                case 1:
                    i2 = 52;
                    break;
                case 2:
                    i2 = 49;
                    break;
                case 3:
                    i2 = C0607n.bx;
                    break;
                default:
                    i2 = 49;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6436z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 49);
        }
        return toCharArray;
    }
}
