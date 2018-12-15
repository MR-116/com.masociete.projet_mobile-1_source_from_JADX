package fr.pcsoft.wdjava.api;

import android.app.Activity;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0666h;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.ui.dessin.WDImage;
import fr.pcsoft.wdjava.ui.utils.C1502a;
import fr.pcsoft.wdjava.ui.utils.C1508i;

public class WDAPIDessin extends WDAPIDessin_Commun {
    /* renamed from: z */
    private static final String[] f1144z = new String[]{m1605z(m1606z("\u0013>#\u00146`39\b0};;\u0012&v?2\u0012-b?")), m1605z(m1606z("\u0013?.\u0005<e(#\u00078c)=\u0010<o*=\u00058}"))};

    public static final WDObjet dCopieImageFenetre() {
        return dCopieImageFenetre(null);
    }

    public static final WDObjet dCopieImageFenetre(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1144z[0], 4);
        try {
            WDObjet wDImage = new WDImage(C1508i.m10471a((Activity) C1502a.m10415a(wDObjet, true, true).getSupport()));
            a.m2735v();
            return wDImage;
        } catch (C0666h e) {
            String[] strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1144z[1], String.valueOf(1));
            strArr[1] = e.getMessage();
            WDErreurManager.m2886a(strArr);
            a.m2735v();
            return null;
        } catch (Throwable th) {
            a.m2735v();
            throw th;
        }
    }

    /* renamed from: z */
    private static String m1605z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 48;
                    break;
                case 1:
                    i2 = 122;
                    break;
                case 2:
                    i2 = C0607n.Hn;
                    break;
                case 3:
                    i2 = 87;
                    break;
                default:
                    i2 = 121;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1606z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 121);
        }
        return toCharArray;
    }
}
