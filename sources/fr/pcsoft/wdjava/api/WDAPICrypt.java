package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDBuffer;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDChaineA;
import fr.pcsoft.wdjava.core.types.WDChaineU;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.collection.C0582d;
import fr.pcsoft.wdjava.core.utils.xb;
import fr.pcsoft.wdjava.crypto.C0827i;
import fr.pcsoft.wdjava.crypto.C0828j;
import fr.pcsoft.wdjava.crypto.C0829k;

public class WDAPICrypt {
    /* renamed from: z */
    private static final String[] f1136z = new String[]{m1590z(m1591z("\u000f:.q2\n6?d/\u0013)9w2\n69z8\u0004>5k>")), m1590z(m1591z("o9#f)\u0015/(`")), m1590z(m1591z("\u000f:.q2\n6?d/\u0013,5b5\t ?m:\u000519")), m1590z(m1591z("o<.|+\u0018:#v/\r18d)\b")), m1590z(m1591z("o9#a>\u000f-%u/\t")), m1590z(m1591z("o;9f)\u0015/(`$\u001f+=k?\r-8")), m1590z(m1591z("o;9f)\u0015/(`")), m1590z(m1591z("\u0005,3\bCtJE\bJ")), m1590z(m1591z("o<.|+\u0018:"))};

    public static final WDObjet certificatSigneChaine(WDObjet wDObjet, String str, String str2, int i) {
        WDObjet wDBuffer;
        WDContexte a = C0677k.m2776a(f1136z[2], 16);
        try {
            wDBuffer = new WDBuffer(C0827i.m4242a(wDObjet.getDonneeBinaire(), str, str2, i));
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
            wDBuffer = new WDBuffer();
        } finally {
            a.m2735v();
        }
        return wDBuffer;
    }

    public static final WDObjet certificatVerifieChaine(WDObjet wDObjet, WDObjet wDObjet2, String str, int i) {
        return certificatVerifieChaine(wDObjet, wDObjet2, str, "", null, i);
    }

    public static final WDObjet certificatVerifieChaine(WDObjet wDObjet, WDObjet wDObjet2, String str, String str2, int i) {
        return certificatVerifieChaine(wDObjet, wDObjet2, str, str2, null, i);
    }

    public static final WDObjet certificatVerifieChaine(WDObjet wDObjet, WDObjet wDObjet2, String str, String str2, WDObjet wDObjet3, int i) {
        WDContexte a = C0677k.m2776a(f1136z[0], 16);
        String[] strArr = null;
        if (wDObjet3 != null) {
            try {
                C0582d c0582d = (C0582d) wDObjet3.checkType(C0582d.class);
                strArr = c0582d != null ? xb.m4189b(c0582d) : new String[]{wDObjet3.getString()};
            } catch (Throwable e) {
                WDErreurManager.m2888b(e);
                WDObjet wDEntier4 = new WDEntier4();
                return wDEntier4;
            } finally {
                a.m2735v();
            }
        }
        WDObjet wDEntier42 = new WDEntier4(C0827i.m4239a(wDObjet.getDonneeBinaire(), wDObjet2.getDonneeBinaire(), str, str2, strArr, i));
        a.m2735v();
        return wDEntier42;
    }

    public static WDChaine crypte(WDObjet wDObjet, String str) {
        return crypte(wDObjet, str, 2, true);
    }

    public static WDChaine crypte(WDObjet wDObjet, String str, int i) {
        return crypte(wDObjet, str, i, true);
    }

    public static WDChaine crypte(WDObjet wDObjet, String str, int i, boolean z) {
        WDChaine wDChaineA;
        WDContexte a = C0677k.m2775a(f1136z[8]);
        try {
            byte[] a2 = C0828j.m4252a(wDObjet.getDonneeBinaire(), str, i);
            if (WDProjet.getInstance().isModeAnsi()) {
                wDChaineA = new WDChaineA(a2, f1136z[7]);
            } else {
                wDChaineA = new WDChaineU(C0725i.m3035a(a2, f1136z[7]));
                a.m2735v();
            }
        } catch (C0829k e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDChaineA = new WDChaine("");
        } finally {
            a.m2735v();
        }
        return wDChaineA;
    }

    public static final WDObjet crypteStandard(WDObjet wDObjet, WDObjet wDObjet2) {
        return crypteStandard(wDObjet, wDObjet2, 1, 2, 1);
    }

    public static final WDObjet crypteStandard(WDObjet wDObjet, WDObjet wDObjet2, int i) {
        return crypteStandard(wDObjet, wDObjet2, i, 2, 1);
    }

    public static final WDObjet crypteStandard(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2) {
        return crypteStandard(wDObjet, wDObjet2, i, i2, 1);
    }

    public static final WDObjet crypteStandard(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2, int i3) {
        WDObjet wDBuffer;
        WDContexte a = C0677k.m2775a(f1136z[3]);
        try {
            wDBuffer = new WDBuffer(C0827i.m4243a(wDObjet.getDonneeBinaire(), wDObjet2.getDonneeBinaire(), i, i2, i3));
        } catch (C0829k e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBuffer = new WDChaine("");
        } finally {
            a.m2735v();
        }
        return wDBuffer;
    }

    public static WDChaine decrypte(WDObjet wDObjet, String str) {
        return decrypte(wDObjet, str, 2, true);
    }

    public static WDChaine decrypte(WDObjet wDObjet, String str, int i) {
        return decrypte(wDObjet, str, i, true);
    }

    public static WDChaine decrypte(WDObjet wDObjet, String str, int i, boolean z) {
        WDChaine wDBuffer;
        WDContexte a = C0677k.m2775a(f1136z[6]);
        try {
            wDBuffer = new WDBuffer(C0828j.m4255b(wDObjet.getDonneeBinaire(), str, i));
        } catch (C0829k e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBuffer = new WDChaine("");
        } finally {
            a.m2735v();
        }
        return wDBuffer;
    }

    public static final WDObjet decrypteStandard(WDObjet wDObjet, WDObjet wDObjet2) {
        return decrypteStandard(wDObjet, wDObjet2, 1, 2, 1);
    }

    public static final WDObjet decrypteStandard(WDObjet wDObjet, WDObjet wDObjet2, int i) {
        return decrypteStandard(wDObjet, wDObjet2, i, 2, 1);
    }

    public static final WDObjet decrypteStandard(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2) {
        return decrypteStandard(wDObjet, wDObjet2, i, i2, 1);
    }

    public static final WDObjet decrypteStandard(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2, int i3) {
        WDObjet wDBuffer;
        WDContexte a = C0677k.m2775a(f1136z[5]);
        try {
            wDBuffer = new WDBuffer(C0827i.m4245b(wDObjet.getDonneeBinaire(), wDObjet2.getDonneeBinaire(), i, i2, i3));
        } catch (C0829k e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBuffer = new WDChaine("");
        } finally {
            a.m2735v();
        }
        return wDBuffer;
    }

    public static WDBooleen fCrypte(String str, String str2, String str3) {
        return fCrypte(str, str2, str3, 2, true);
    }

    public static WDBooleen fCrypte(String str, String str2, String str3, int i) {
        return fCrypte(str, str2, str3, i, true);
    }

    public static WDBooleen fCrypte(String str, String str2, String str3, int i, boolean z) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1136z[1]);
        try {
            C0828j.m4250a(str, str2, str3, i);
            wDBooleen = new WDBooleen(true);
        } catch (C0539d e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen fDecrypte(String str, String str2, String str3) {
        return fDecrypte(str, str2, str3, 2, true);
    }

    public static WDBooleen fDecrypte(String str, String str2, String str3, int i) {
        return fDecrypte(str, str2, str3, i, true);
    }

    public static WDBooleen fDecrypte(String str, String str2, String str3, int i, boolean z) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1136z[4]);
        try {
            C0828j.m4253b(str, str2, str3, i);
            wDBooleen = new WDBooleen(true);
        } catch (C0539d e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    /* renamed from: z */
    private static String m1590z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 76;
                    break;
                case 1:
                    i2 = C0607n.bx;
                    break;
                case 2:
                    i2 = C0607n.Hn;
                    break;
                case 3:
                    i2 = 37;
                    break;
                default:
                    i2 = 123;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1591z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 123);
        }
        return toCharArray;
    }
}
