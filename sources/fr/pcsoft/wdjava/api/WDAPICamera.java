package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.C0653m;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.p035c.C0663e;
import fr.pcsoft.wdjava.core.p035c.C0666h;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.p042b.C0658b;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0782g;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.media.C0957s;
import fr.pcsoft.wdjava.media.C0964z;
import fr.pcsoft.wdjava.media.ib;
import fr.pcsoft.wdjava.ui.champs.camera.WDChampCamera;
import fr.pcsoft.wdjava.ui.utils.C1502a;

public class WDAPICamera {
    /* renamed from: a */
    private static final int f1130a = 5;
    /* renamed from: z */
    private static final String[] f1131z = new String[]{m1578z(m1579z("\r(1hea!9~rk*=")), m1578z(m1579z("\r(1hea!9~rk*=sdk=7hai;")), m1578z(m1579z("\r(1hea!4esz;'|a|?5it|;")), m1578z(m1579z("\r(1hea!4mnm;'mp~21")), m1578z(m1579z("\r(1hea!?ink,=smg01mt{,=")), m1578z(m1579z("\r(1hea!(mro3=xrk")), m1578z(m1579z("\r(1hea!9jfg=0i")), m1578z(m1579z("O\u0010\u001c^OG\u001aV\\E\\\u0013\u0011_SG\u0011\u0016\u0002co3=~a")), m1578z(m1579z("\r(1hea!<imo0<i~;*ai}-1cn")), m1578z(m1579z("\r;*~e{,'|a}-9keq.9~ac")), m1578z(m1579z("\r(1hea!<imo,*ij;;cdo9=")), m1578z(m1579z("\r(1hea!=xaz")), m1578z(m1579z("\r(1hea!;mpz+*i"))};

    /* renamed from: a */
    protected static final WDChampCamera m1577a(WDObjet wDObjet, int i) {
        String[] strArr;
        try {
            return (WDChampCamera) C1502a.m10417a(wDObjet, WDChampCamera.class);
        } catch (C0666h e) {
            strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1131z[9], String.valueOf(i));
            strArr[1] = e.getMessage();
            WDErreurManager.m2886a(strArr);
            return null;
        } catch (C0663e e2) {
            strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1131z[9], String.valueOf(i));
            strArr[1] = e2.m2671a(C0607n.vd);
            WDErreurManager.m2886a(strArr);
            return null;
        }
    }

    public static WDBooleen photoLanceAppli(C0486m c0486m) {
        return videoLanceAppli(2, c0486m);
    }

    public static WDChaine photoLanceAppli() {
        return videoLanceAppli(2);
    }

    public static WDBooleen videoAffiche(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1131z[6], 5);
        try {
            m1577a(wDObjet, 1).demarrerFlux();
            WDBooleen wDBooleen = new WDBooleen(true);
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen videoArrete(WDObjet wDObjet) {
        return videoArrete(wDObjet, 3);
    }

    public static WDBooleen videoArrete(WDObjet wDObjet, int i) {
        boolean z = true;
        WDContexte a = C0677k.m2776a(f1131z[0], 5);
        try {
            WDChampCamera a2 = m1577a(wDObjet, 1);
            boolean z2 = (i & 1) == 1;
            if ((i & 2) != 2) {
                z = false;
            }
            a2.arreterFlux(z2, z);
            WDBooleen wDBooleen = new WDBooleen(true);
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final void videoArreteDecodage(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1131z[1], 5);
        try {
            m1577a(wDObjet, 1).disableBarCodeDecoding();
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen videoCapture(WDObjet wDObjet, String str) {
        return videoCapture(wDObjet, str, 1, null, 0, true);
    }

    public static WDBooleen videoCapture(WDObjet wDObjet, String str, int i) {
        return videoCapture(wDObjet, str, i, null, 0, true);
    }

    public static WDBooleen videoCapture(WDObjet wDObjet, String str, int i, WDObjet wDObjet2) {
        return videoCapture(wDObjet, str, i, wDObjet2, 0, true);
    }

    public static WDBooleen videoCapture(WDObjet wDObjet, String str, int i, WDObjet wDObjet2, int i2) {
        return videoCapture(wDObjet, str, i, wDObjet2, i2, true);
    }

    public static WDBooleen videoCapture(WDObjet wDObjet, String str, int i, WDObjet wDObjet2, int i2, boolean z) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1131z[12], 5);
        try {
            m1577a(wDObjet, 1).capturerFlux(str, i, C0725i.m3013a(wDObjet2, C0782g.SECOND), i2, z);
            wDBooleen = new WDBooleen(true);
        } catch (C0539d e) {
            C0539d c0539d = e;
            WDErreurManager.m2876a(a, c0539d);
            wDBooleen = new WDBooleen(c0539d.mo3220i());
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final WDObjet videoDemandePermission() {
        WDObjet wDBooleen;
        WDContexte a = C0677k.m2776a(f1131z[8], 5);
        try {
            WDAppManager.m2565a(f1131z[7]);
            wDBooleen = new WDBooleen(true);
        } catch (C0653m e) {
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final void videoDemarreDecodage(WDObjet wDObjet) {
        videoDemarreDecodage(wDObjet, -1);
    }

    public static final void videoDemarreDecodage(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2776a(f1131z[10], 5);
        try {
            m1577a(wDObjet, 1).enableBarCodeDecoding(i);
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 videoEtat(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1131z[11], 5);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(m1577a(wDObjet, 1).getEtatAffichageFlux());
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen videoGenereMiniature(String str, String str2) {
        return videoGenereMiniature(str, str2, -1, -1);
    }

    @C0658b(a = C0657a.FROYO)
    public static WDBooleen videoGenereMiniature(String str, String str2, int i, int i2) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2777a(f1131z[4], 5, C0657a.FROYO.getNumero());
        try {
            C0964z.m6942a(str, str2, i, i2);
            wDBooleen = new WDBooleen(true);
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDObjet videoLanceAppli(C0486m c0486m) {
        return videoLanceAppli(1, c0486m);
    }

    public static WDBooleen videoLanceAppli(int i, C0486m c0486m) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1131z[3]);
        try {
            C0957s.m6869c().m6874a(i, c0486m);
            wDBooleen = new WDBooleen(true);
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDChaine videoLanceAppli() {
        return videoLanceAppli(1);
    }

    public static WDChaine videoLanceAppli(int i) {
        WDChaine wDChaine;
        WDContexte a = C0677k.m2775a(f1131z[3]);
        try {
            wDChaine = new WDChaine(C0957s.m6869c().m6874a(i, null));
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDChaine = new WDChaine();
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static WDChaine videoListeParametre(String str) {
        WDChaine wDChaine;
        WDContexte a = C0677k.m2776a(f1131z[2], 5);
        try {
            wDChaine = new WDChaine(C0957s.m6869c().mo3231b(str));
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDChaine = new WDChaine();
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static WDObjet videoParametre(String str) {
        WDObjet a;
        WDContexte a2 = C0677k.m2776a(f1131z[5], 5);
        try {
            a = C0957s.m6869c().m6873a(str);
        } catch (ib e) {
            WDErreurManager.m2879a(a2, e.getMessage(), e.m1561f());
            a = new WDChaine();
        } finally {
            a2.m2735v();
        }
        return a;
    }

    public static WDObjet videoParametre(String str, WDObjet wDObjet) {
        WDObjet wDBooleen;
        WDContexte a = C0677k.m2776a(f1131z[5], 5);
        try {
            wDBooleen = new WDBooleen(C0957s.m6869c().m6884a(str, wDObjet));
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    /* renamed from: z */
    private static String m1578z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 46;
                    break;
                case 1:
                    i2 = 126;
                    break;
                case 2:
                    i2 = C0607n.co;
                    break;
                case 3:
                    i2 = 44;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1579z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 32);
        }
        return toCharArray;
    }
}
