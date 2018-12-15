package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0782g;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDBuffer;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple;
import fr.pcsoft.wdjava.net.http.C0990o;
import fr.pcsoft.wdjava.net.http.C0999x;
import fr.pcsoft.wdjava.net.http.WDCookie;
import fr.pcsoft.wdjava.net.http.WDHTTPReponse;
import fr.pcsoft.wdjava.net.http.WDHTTPRequete;
import fr.pcsoft.wdjava.net.http.WDVariableHTTP;

public class WDAPIHttp {
    /* renamed from: z */
    private static final String[] f1211z = new String[]{m1641z(m1642z("\u0005j\u0019^\u001ayc\u0007E\u001frg\u0012Z\u000btc\u0000O\u001etg")), m1641z(m1642z("\u0005j\u0019^\u001ayv\u0004G\u000fiw\u0019")), m1641z(m1642z("\u0005j\u0019^\u001ayp\b[\u001fcv\b")), m1641z(m1642z("\u0005r\u001fE\u0012")), m1641z(m1642z("\u0005o\f_\u001cgk\u001eU\u001agp\fG\u000frp\b")), m1641z(m1642z("\u0005j\u0019^\u001ayf\u0002D\u0004c}\u001fO\u0019sn\u0019K\u001e")), m1641z(m1642z("\u0005j\u0019^\u001ayc\u0003D\u001fjg\u0012L\u0005to\u0018F\u000bop\b")), m1641z(m1642z("\u0005j\u0019^\u001aya\u0002E\u0001og\u0012X\u000fkr\u0001K\tc")), m1641z(m1642z("GR=f#EC9c%H\r\"i>CV`y>TG,g")), m1641z(m1642z("\u0005j\u0019^\u001ayg\u0003\\\u0005og\u0012L\u0005to\u0018F\u000bop\b")), m1641z(m1642z("\u0005g\u001fX\u000fsp\u0012Z\u000buq\fM\u000fyr\fX\u000bk")), m1641z(m1642z("\u0005a\u0002D\u001ccp\u001eC\u0005h}\u0004G\u001aiq\u001eC\bjg")), m1641z(m1642z("\u0005j\u0019^\u001ayp\fP\u0015`m\u001fG\u001fjc\u0004X\u000f")), m1641z(m1642z("\u0005j\u0019^\u001aya\u0002E\u0001og\u0012X\u000few\u001dO\u0018c")), m1641z(m1642z("\u0005j\u0019^\u001ayh\f_\rc")), m1641z(m1642z("\u0005j\u0019^\u001aya\u0002E\u0001og\u0012F\u0003r")), m1641z(m1642z("\u0005j\u0019^\u001ayc\u0007E\u001frg\u0012L\u0003ej\u0004O\u0018")), m1641z(m1642z("\u0005j\u0019^\u001aya\u0002E\u0001og\u0012M\u000ftg")), m1641z(m1642z("\u0005j\u0019^\u001ayq\u0004G\u001fjg\u0012X\u000fug\f_")), m1641z(m1642z("\u0005j\u0019^\u001aya\u0002E\u0001og\u0012X\u000b|")), m1641z(m1642z("\u0005j\u0019^\u001ayg\u0003\\\u0005og")), m1641z(m1642z("\u0005j\u0019^\u001aya\u001fO\u000fyd\u0002X\u0007sn\fC\u0018c")), m1641z(m1642z("\u0005j\u0019^\u001aya\u0002E\u0001og\u0012O\ttk\u0019"))};

    static {
        if (WDProjet.getInstance().isIgnoreErreurCertificatHTTPS()) {
            WDVariableHTTP.getIgnoreErreur().setValeur(39);
        }
    }

    public static WDBooleen HTTPAjouteFichier(String str, String str2, String str3) {
        return HTTPAjouteFichier(str, str2, str3, f1211z[8]);
    }

    public static WDBooleen HTTPAjouteFichier(String str, String str2, String str3, String str4) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1211z[16]);
        try {
            C0990o.m7201a(str, str2, str3, str4);
            wDBooleen = new WDBooleen(true);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen HTTPAjouteParametre(String str, String str2, WDObjet wDObjet) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1211z[0]);
        try {
            C0990o.m7200a(str, str2, wDObjet);
            wDBooleen = new WDBooleen(true);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static void HTTPAnnuleFormulaire(String str) {
        WDContexte a = C0677k.m2775a(f1211z[6]);
        try {
            C0990o.m7210b(str);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
        } finally {
            a.m2735v();
        }
    }

    public static final void HTTPCookieEcrit(WDObjet wDObjet, String str, String str2, String str3) {
        WDHTTPRequete a;
        WDContexte a2 = C0677k.m2775a(f1211z[22]);
        if (wDObjet != null) {
            try {
                a = m1640a(wDObjet, 1);
            } catch (Throwable e) {
                WDErreurManager.m2888b(e);
                return;
            } finally {
                a2.m2735v();
            }
        } else {
            a = null;
        }
        C0990o.m7194a(a, str, str2, str3);
        a2.m2735v();
    }

    public static final void HTTPCookieEcrit(String str, String str2, String str3) {
        HTTPCookieEcrit(null, str, str2, str3);
    }

    public static final void HTTPCookieGere(WDObjet wDObjet, String str, boolean z) {
        WDHTTPRequete a;
        WDContexte a2 = C0677k.m2775a(f1211z[17]);
        if (wDObjet != null) {
            try {
                a = m1640a(wDObjet, 1);
            } catch (Throwable e) {
                WDErreurManager.m2888b(e);
                return;
            } finally {
                a2.m2735v();
            }
        } else {
            a = null;
        }
        C0990o.m7195a(a, str, z);
        a2.m2735v();
    }

    public static final void HTTPCookieGere(WDObjet wDObjet, boolean z) {
        WDHTTPRequete wDHTTPRequete = (WDHTTPRequete) wDObjet.checkType(WDHTTPRequete.class);
        if (wDHTTPRequete != null) {
            HTTPCookieGere(wDHTTPRequete, "", z);
        } else {
            HTTPCookieGere(null, wDObjet.getString(), z);
        }
    }

    public static final void HTTPCookieGere(boolean z) {
        HTTPCookieGere(null, null, z);
    }

    public static final WDObjet HTTPCookieLit(WDObjet wDObjet, String str, String str2) {
        WDObjet wDChaine;
        WDContexte a = C0677k.m2775a(f1211z[15]);
        try {
            wDChaine = new WDChaine(C0990o.m7189a(wDObjet != null ? m1640a(wDObjet, 1) : null, str, str2));
        } catch (Throwable e) {
            Throwable th = e;
            WDErreurManager.m2888b(th);
            wDChaine = new WDChaine(th.mo3217c());
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static final WDObjet HTTPCookieLit(String str, String str2) {
        return HTTPCookieLit(null, str, str2);
    }

    public static final void HTTPCookieRAZ() {
        HTTPCookieRAZ(null, null);
    }

    public static final void HTTPCookieRAZ(WDObjet wDObjet) {
        WDHTTPRequete wDHTTPRequete = (WDHTTPRequete) wDObjet.checkType(WDHTTPRequete.class);
        if (wDHTTPRequete != null) {
            HTTPCookieRAZ(wDHTTPRequete, null);
        } else {
            HTTPCookieRAZ(null, wDObjet.getString());
        }
    }

    public static final void HTTPCookieRAZ(WDObjet wDObjet, String str) {
        WDHTTPRequete a;
        WDContexte a2 = C0677k.m2775a(f1211z[19]);
        if (wDObjet != null) {
            try {
                a = m1640a(wDObjet, 1);
            } catch (Throwable e) {
                WDErreurManager.m2888b(e);
                return;
            } finally {
                a2.m2735v();
            }
        } else {
            a = null;
        }
        C0990o.m7209b(a, str);
        a2.m2735v();
    }

    public static final WDObjet HTTPCookieRecupere(WDObjet wDObjet) {
        WDObjet wDTableauSimple;
        WDContexte a = C0677k.m2775a(f1211z[13]);
        try {
            WDHTTPReponse wDHTTPReponse = (WDHTTPReponse) wDObjet.checkType(WDHTTPReponse.class);
            long[] a2 = wDHTTPReponse != null ? C0990o.m7205a(wDHTTPReponse) : C0990o.m7206a(null, wDObjet.getString());
            wDTableauSimple = new WDTableauSimple(1, new int[]{0}, 0, new C0999x());
            for (long wDCookie : a2) {
                wDTableauSimple.mo2475b(new WDCookie(wDCookie));
            }
            a.m2735v();
        } catch (C0539d e) {
            throw e;
        } catch (Throwable e2) {
            try {
                WDErreurManager.m2888b(e2);
                wDTableauSimple = new WDTableauSimple(1, new int[]{0}, 0, new C0999x());
            } finally {
                a.m2735v();
            }
        }
        return wDTableauSimple;
    }

    public static final WDObjet HTTPCookieRecupere(WDObjet wDObjet, String str) {
        WDHTTPRequete a;
        WDObjet wDTableauSimple;
        WDContexte a2 = C0677k.m2775a(f1211z[13]);
        if (wDObjet != null) {
            try {
                a = m1640a(wDObjet, 1);
            } catch (C0539d e) {
                throw e;
            } catch (Throwable e2) {
                try {
                    WDErreurManager.m2888b(e2);
                    wDTableauSimple = new WDTableauSimple(1, new int[]{0}, 0, new C0999x());
                } finally {
                    a2.m2735v();
                }
            }
        } else {
            a = null;
        }
        long[] a3 = C0990o.m7206a(a, str);
        wDTableauSimple = new WDTableauSimple(1, new int[]{0}, 0, new C0999x());
        for (long wDCookie : a3) {
            wDTableauSimple.mo2475b(new WDCookie(wDCookie));
        }
        a2.m2735v();
        return wDTableauSimple;
    }

    public static final void HTTPCookieRemplace(WDObjet wDObjet, String str, WDObjet wDObjet2) {
        WDHTTPRequete a;
        WDContexte a2 = C0677k.m2775a(f1211z[7]);
        if (wDObjet != null) {
            try {
                a = m1640a(wDObjet, 1);
            } catch (Throwable e) {
                WDErreurManager.m2888b(e);
                return;
            } finally {
                a2.m2735v();
            }
        } else {
            a = null;
        }
        C0990o.m7193a(a, str, wDObjet2);
        a2.m2735v();
    }

    public static final void HTTPCookieRemplace(String str, WDObjet wDObjet) {
        HTTPCookieRemplace(null, str, wDObjet);
    }

    public static void HTTPCreeFormulaire(String str) {
        WDContexte a = C0677k.m2775a(f1211z[21]);
        try {
            C0990o.m7215e(str);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen HTTPDestination(String str) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1211z[2]);
        try {
            C0990o.m7198a(str);
            wDBooleen = new WDBooleen(true);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDObjet HTTPDonneResultat() {
        return HTTPDonneResultat(2);
    }

    public static WDObjet HTTPDonneResultat(int i) {
        WDContexte a = C0677k.m2775a(f1211z[5]);
        WDObjet wDObjet = null;
        if (i == 1) {
            try {
                wDObjet = new WDBuffer();
                wDObjet.setValeur(C0990o.m7207b());
            } catch (Throwable e) {
                WDErreurManager.m2888b(e);
                wDObjet = new WDChaine();
            } finally {
                a.m2735v();
            }
        } else if (i == 2) {
            wDObjet = new WDBuffer();
            wDObjet.setValeur(C0990o.m7214d());
        } else if (i == 5) {
            wDObjet = C0990o.m7219h();
        } else {
            WDErreurManager.m2883a(C0745b.m3222b(f1211z[4], new String[0]));
        }
        a.m2735v();
        return wDObjet;
    }

    public static final WDObjet HTTPEnvoie(WDObjet wDObjet) {
        WDObjet a;
        WDContexte a2 = C0677k.m2775a(f1211z[20]);
        try {
            a = C0990o.m7188a(wDObjet, true);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
            a = new WDHTTPReponse();
        } finally {
            a2.m2735v();
        }
        return a;
    }

    public static WDObjet HTTPEnvoieFormulaire(String str, WDObjet wDObjet) {
        WDObjet wDObjet2 = (WDHTTPRequete) wDObjet.checkType(WDHTTPRequete.class);
        if (wDObjet2 != null) {
            String str2 = f1211z[9];
            WDContexte a = C0677k.m2775a(str2);
            try {
                str2 = new WDHTTPReponse(C0990o.m7187a(str, (WDHTTPRequete) wDObjet2));
                return str2;
            } catch (Throwable e) {
                WDErreurManager.m2888b(e);
                wDObjet2 = new WDHTTPReponse();
                return wDObjet2;
            } finally {
                a.m2735v();
            }
        } else {
            return HTTPEnvoieFormulaire(str, wDObjet.getString(), 2, null, null, null, null, null);
        }
    }

    public static WDBooleen HTTPEnvoieFormulaire(String str, String str2, int i) {
        return HTTPEnvoieFormulaire(str, str2, i, null, null, null, null, null);
    }

    public static WDBooleen HTTPEnvoieFormulaire(String str, String str2, int i, String str3) {
        return HTTPEnvoieFormulaire(str, str2, i, str3, null, null, null, null);
    }

    public static WDBooleen HTTPEnvoieFormulaire(String str, String str2, int i, String str3, String str4) {
        return HTTPEnvoieFormulaire(str, str2, i, str3, str4, null, null, null);
    }

    public static WDBooleen HTTPEnvoieFormulaire(String str, String str2, int i, String str3, String str4, String str5) {
        return HTTPEnvoieFormulaire(str, str2, i, str3, str4, str5, null, null);
    }

    public static WDBooleen HTTPEnvoieFormulaire(String str, String str2, int i, String str3, String str4, String str5, String str6) {
        return HTTPEnvoieFormulaire(str, str2, i, str3, str4, str5, str6, null);
    }

    public static WDBooleen HTTPEnvoieFormulaire(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1211z[9]);
        try {
            wDBooleen = new WDBooleen(C0990o.m7203a(str, str2, i, str3, str4, str5, str6, str7));
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static void HTTPJauge(WDObjet wDObjet) {
        HTTPJauge(wDObjet, 10000);
    }

    public static void HTTPJauge(C0486m c0486m, int i) {
        WDContexte a = C0677k.m2775a(f1211z[14]);
        try {
            C0990o.m7192a(c0486m, i);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
        } finally {
            a.m2735v();
        }
    }

    public static void HTTPRAZFormulaire(String str) {
        WDContexte a = C0677k.m2775a(f1211z[12]);
        try {
            C0990o.m7212c(str);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen HTTPRequete(String str) {
        return HTTPRequete(str, "", null, null, "", "", "");
    }

    public static WDBooleen HTTPRequete(String str, String str2) {
        return HTTPRequete(str, str2, null, null, "", "", "");
    }

    public static WDBooleen HTTPRequete(String str, String str2, WDObjet wDObjet) {
        return HTTPRequete(str, str2, wDObjet, null, "", "", "");
    }

    public static WDBooleen HTTPRequete(String str, String str2, WDObjet wDObjet, WDObjet wDObjet2) {
        return HTTPRequete(str, str2, wDObjet, wDObjet2, "", "", "");
    }

    public static WDBooleen HTTPRequete(String str, String str2, WDObjet wDObjet, WDObjet wDObjet2, String str3) {
        return HTTPRequete(str, str2, wDObjet, wDObjet2, str3, "", "");
    }

    public static WDBooleen HTTPRequete(String str, String str2, WDObjet wDObjet, WDObjet wDObjet2, String str3, String str4) {
        return HTTPRequete(str, str2, wDObjet, wDObjet2, str3, str4, "");
    }

    public static WDBooleen HTTPRequete(String str, String str2, WDObjet wDObjet, WDObjet wDObjet2, String str3, String str4, String str5) {
        WDContexte a = C0677k.m2775a(f1211z[2]);
        WDBooleen a2;
        try {
            a2 = C0990o.m7204a(str, str2, wDObjet != null ? wDObjet.getString() : "", wDObjet2, str3, str4, str5);
            WDBooleen wDBooleen = new WDBooleen((boolean) a2);
            return wDBooleen;
        } catch (Throwable e) {
            Throwable th = e;
            WDErreurManager.m2888b(th);
            a2 = new WDBooleen(th.mo3220i());
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final void HTTPSimuleReseau() {
        HTTPSimuleReseau(0, 0);
    }

    public static final void HTTPSimuleReseau(int i) {
        HTTPSimuleReseau(i, 0);
    }

    public static final void HTTPSimuleReseau(int i, int i2) {
        WDContexte a = C0677k.m2775a(f1211z[18]);
        try {
            C0990o.m7191a(i, i2);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 HTTPTimeout() {
        WDContexte a = C0677k.m2775a(f1211z[1]);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(C0990o.m7186a());
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static void HTTPTimeout(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1211z[1]);
        try {
            C0990o.m7190a(C0725i.m3013a(wDObjet, C0782g.MILLISECOND));
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
        } finally {
            a.m2735v();
        }
    }

    /* renamed from: a */
    private static final WDHTTPRequete m1640a(WDObjet wDObjet, int i) {
        WDHTTPRequete wDHTTPRequete = wDObjet != null ? (WDHTTPRequete) wDObjet.checkType(WDHTTPRequete.class) : null;
        if (wDHTTPRequete == null) {
            String[] strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1211z[10], String.valueOf(i));
            String str = f1211z[11];
            String[] strArr2 = new String[2];
            strArr2[0] = wDObjet != null ? wDObjet.getNomType() : "";
            strArr2[1] = C0745b.m3220a(f1211z[2], new String[0]);
            strArr[1] = C0745b.m3222b(str, strArr2);
            WDErreurManager.m2886a(strArr);
        }
        return wDHTTPRequete;
    }

    public static void proxy(String str) {
        proxy(str, 80, "", "");
    }

    public static void proxy(String str, int i) {
        proxy(str, i, "", "");
    }

    public static void proxy(String str, int i, String str2) {
        proxy(str, i, str2, "");
    }

    public static void proxy(String str, int i, String str2, String str3) {
        WDContexte a = C0677k.m2775a(f1211z[3]);
        try {
            C0990o.m7199a(str, i, str2, str3);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
        } finally {
            a.m2735v();
        }
    }

    /* renamed from: z */
    private static String m1641z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 38;
                    break;
                case 1:
                    i2 = 34;
                    break;
                case 2:
                    i2 = 77;
                    break;
                case 3:
                    i2 = 10;
                    break;
                default:
                    i2 = 74;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1642z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 74);
        }
        return toCharArray;
    }
}
