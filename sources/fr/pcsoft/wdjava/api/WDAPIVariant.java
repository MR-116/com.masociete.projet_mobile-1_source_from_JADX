package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.p043d.C0688c;
import fr.pcsoft.wdjava.core.p043d.p045b.C0684a;
import fr.pcsoft.wdjava.core.p043d.p045b.C0687d;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaineA;
import fr.pcsoft.wdjava.core.types.WDVariant;
import fr.pcsoft.wdjava.core.utils.C0812p;
import fr.pcsoft.wdjava.core.utils.ac;
import org.json.JSONException;

public class WDAPIVariant {
    /* renamed from: z */
    private static final String[] f1234z = new String[]{m1684z(m1685z("hwLq.\noY|$\u0004o[f5\u001fhY")), m1684z(m1685z("hgBq*\nuRi4\u0004oRj)\u001d`Aj#\u000e")), m1684z(m1685z("hk^l)\u0014wHq4\u0014wLq.\noY")), m1684z(m1685z("hwLq.\noY|1\u000es^|-\u0018nC")), m1684z(m1685z("\u0002rB\u000e_s\u00144\u000eV"))};

    public static final WDObjet jsonVersVariant(WDObjet wDObjet) {
        WDObjet a;
        WDContexte a2 = C0677k.m2775a(f1234z[2]);
        try {
            a = new ac(C0812p.m4116a(wDObjet)).m3840a();
        } catch (JSONException e) {
            WDErreurManager.m2883a(C0745b.m3222b(f1234z[1], new String[0]));
            a = null;
        } finally {
            a2.m2735v();
        }
        return a;
    }

    public static final WDBooleen variantConvertit(WDObjet wDObjet, int i) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1234z[0]);
        try {
            WDVariant wDVariant = (WDVariant) wDObjet.checkType(WDVariant.class);
            if (wDVariant != null) {
                wDVariant.setValeur(C0611a.m2293a(i, wDVariant.getValeur()));
            }
            wDBooleen = new WDBooleen(true);
            a.m2735v();
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            try {
                WDErreurManager.m2879a(a, e2.getMessage(), e2.getSystemMessage());
                wDBooleen = new WDBooleen(false);
            } finally {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static final WDObjet variantVersJSON(WDObjet wDObjet) {
        WDObjet wDChaineA;
        WDContexte a = C0677k.m2775a(f1234z[3]);
        try {
            String c0687d;
            C0688c c0688c = (C0688c) wDObjet.checkType(C0688c.class);
            if (c0688c != null) {
                C0684a c0687d2 = new C0687d();
                c0688c.serialize(c0687d2);
                c0687d = c0687d2.toString();
            } else {
                c0687d = C0812p.m4117a(wDObjet.getJSONValue().toString());
            }
            wDChaineA = new WDChaineA(c0687d, f1234z[4]);
        } catch (C0539d e) {
            WDErreurManager.m2875a(e);
            wDChaineA = null;
        } finally {
            a.m2735v();
        }
        return wDChaineA;
    }

    /* renamed from: z */
    private static String m1684z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 75;
                    break;
                case 1:
                    i2 = 33;
                    break;
                case 2:
                    i2 = 13;
                    break;
                case 3:
                    i2 = 35;
                    break;
                default:
                    i2 = 103;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1685z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 103);
        }
        return toCharArray;
    }
}
