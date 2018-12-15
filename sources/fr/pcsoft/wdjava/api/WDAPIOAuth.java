package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.net.oauth2.WDAuthToken;
import fr.pcsoft.wdjava.net.oauth2.WDOAuth2Manager;
import fr.pcsoft.wdjava.net.oauth2.WDOAuth2Parametres;

public class WDAPIOAuth {
    /* renamed from: z */
    private static final String[] f1221z = new String[]{m1659z(m1660z("fjW'7\u001abF61\u0011bD::")), m1659z(m1660z("fdC&+\r\u0019]#>\u0017jO6+\u0017nQ")), m1659z(m1660z("fnP!:\u0010y]#>\u0016xC4:\u001a{C!>\b")), m1659z(m1660z("fhM=)\u0000yQ:0\u000btK>/\nxQ:=\tn"))};

    /* renamed from: a */
    private static final WDOAuth2Parametres m1658a(WDObjet wDObjet, int i) {
        WDOAuth2Parametres wDOAuth2Parametres = wDObjet != null ? (WDOAuth2Parametres) wDObjet.checkType(WDOAuth2Parametres.class) : null;
        if (wDOAuth2Parametres == null) {
            String[] strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1221z[2], String.valueOf(i));
            String str = f1221z[3];
            String[] strArr2 = new String[2];
            strArr2[0] = wDObjet != null ? wDObjet.getNomType() : "";
            strArr2[1] = C0745b.m3220a(f1221z[1], new String[0]);
            strArr[1] = C0745b.m3222b(str, strArr2);
            WDErreurManager.m2886a(strArr);
        }
        return wDOAuth2Parametres;
    }

    public static final WDObjet authIdentifie(WDObjet wDObjet) {
        WDObjet wDAuthToken;
        WDContexte a = C0677k.m2776a(f1221z[0], 13);
        try {
            wDAuthToken = new WDAuthToken(WDOAuth2Manager.m7299a(m1658a(wDObjet, 1).m7305a()));
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
            wDAuthToken = new WDAuthToken();
        } finally {
            a.m2735v();
        }
        return wDAuthToken;
    }

    /* renamed from: z */
    private static String m1659z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 69;
                    break;
                case 1:
                    i2 = 43;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 115;
                    break;
                default:
                    i2 = C0607n.bx;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1660z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.bx);
        }
        return toCharArray;
    }
}
