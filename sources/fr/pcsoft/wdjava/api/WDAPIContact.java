package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.contact.C0596g;
import fr.pcsoft.wdjava.contact.C0597h;
import fr.pcsoft.wdjava.contact.C0606q;
import fr.pcsoft.wdjava.contact.WDContact;
import fr.pcsoft.wdjava.contact.WDContactSource;
import fr.pcsoft.wdjava.contact.WDStructContact;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;

public class WDAPIContact {
    /* renamed from: a */
    private static final int f1134a = 1;
    /* renamed from: z */
    private static final String[] f1135z = new String[]{m1588z(m1589z("{\u001a\u001f5\u001f\u0019\u001a\u0004$\u000e\u001c\u0010\u0004>")), m1588z(m1589z("{\u001a\u001f5\u001f\u0019\u001a\u0004$\u0018\u001d\u0015\u00158\u001f\u0011\u0016\u001e5\u000e")), m1588z(m1589z("{\u001a\u001f5\u001f\u0019\u001a\u0004$\u0018\r\u0010\u0006:\u0005\f")), m1588z(m1589z("{\u001a\u001f5\u001f\u0019\u001a\u0004$\u0007\u0011\r")), m1588z(m1589z("{\u001a\u001f5\u001f\u0019\u001a\u0004$\u001b\n\u001c\u0013>\u000f\u001d\u0017\u0004")), m1588z(m1589z("{\u001a\u001f5\u001f\u0019\u001a\u0004$\b\u0010\u001c\u00028\u0003\u001d")), m1588z(m1589z("{\u001a\u001f5\u001f\u0019\u001a\u0004$\u001b\n\u001c\u001d2\u000e\n")), m1588z(m1589z("{\u001a\u001f5\u001f\u0019\u001a\u0004$\n\u0012\u0016\u0005/\u000e")), m1588z(m1589z("{\u001a\u001f5\u001f\u0019\u001a\u0004$\u000f\u001d\u000b\u001e2\u000e\n")), m1588z(m1589z("{\u001c\u0002)\u000e\r\u000b\u000f+\n\u000b\n\u0011<\u000e\u0007\t\u0011)\n\u0015")), m1588z(m1589z("{\u001a\u001f5\u001f\u0019\u001a\u0004$\u0018\u0017\f\u00028\u000e")), m1588z(m1589z("{\u001a\u001f5\u001d\u001d\u000b\u00032\u0004\u0016\u0006\u00196\u001b\u0017\n\u00032\t\u0014\u001c")), m1588z(m1589z("{\u001a\u001f5\u001f\u0019\u001a\u0004")), m1588z(m1589z("{\u001a\u001f5\u001f\u0019\u001a\u0004$\u0018\r\t\u0000)\u0002\u0015\u001c")), m1588z(m1589z("{\u001a\u001f5\u001f\u0019\u001a\u0004$\u0006\u0017\u001d\u0019=\u0002\u001d")), m1588z(m1589z("{\u001a\u001f5\u001f\u0019\u001a\u0004$\u0019\u0019\u0003")), m1588z(m1589z("{\u001a\u001f5\u001f\u0019\u001a\u0004$\u0007\u0011\n\u0004>\u0014\u000b\u0016\u0005)\b\u001d")), m1588z(m1589z("{\u001a\u001f5\u001f\u0019\u001a\u0004$\n\u001e\u001f\u00198\u0003\u001d")), m1588z(m1589z("{\u001a\u001f5\u001f\u0019\u001a\u0004$\u0007\u0011\n\u0004>")), m1588z(m1589z("{\u001a\u001f5\u001f\u0019\u001a\u0004$\b\n\u001c\u0015")), m1588z(m1589z("{\u0010\u0014$\u0018\u001d\n\u00032\u0004\u0016\u0006\u00134\u0005\f\u0018\u0013/\u0014\u0011\u0017\u0006:\u0007\u0011\u001d\u0015"))};

    /* renamed from: a */
    private static final WDContactSource m1585a(WDObjet wDObjet, int i) {
        WDContactSource wDContactSource = wDObjet != null ? (WDContactSource) wDObjet.checkType(WDContactSource.class) : null;
        if (wDContactSource == null) {
            String[] strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1135z[9], String.valueOf(i));
            String str = f1135z[11];
            String[] strArr2 = new String[2];
            strArr2[0] = wDObjet != null ? wDObjet.getNomType() : "";
            strArr2[1] = C0745b.m3220a(f1135z[10], new String[0]);
            strArr[1] = C0745b.m3222b(str, strArr2);
            WDErreurManager.m2886a(strArr);
        }
        return wDContactSource;
    }

    /* renamed from: a */
    private static final void m1586a(int i) {
        if (i != 1) {
            WDErreurManager.m2883a(C0745b.m3222b(f1135z[20], String.valueOf(i)));
        }
    }

    /* renamed from: b */
    private static final WDContact m1587b(WDObjet wDObjet, int i) {
        WDContact wDContact = wDObjet != null ? (WDContact) wDObjet.checkType(WDContact.class) : null;
        if (wDContact == null) {
            String[] strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1135z[9], String.valueOf(i));
            String str = f1135z[11];
            String[] strArr2 = new String[2];
            strArr2[0] = wDObjet != null ? wDObjet.getNomType() : "";
            strArr2[1] = C0745b.m3220a(f1135z[12], new String[0]);
            strArr[1] = C0745b.m3222b(str, strArr2);
            WDErreurManager.m2886a(strArr);
        }
        return wDContact;
    }

    public static WDBooleen contactAffiche() {
        return contactAffiche(new WDChaine(""));
    }

    public static WDBooleen contactAffiche(WDObjet wDObjet) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1135z[17], 0);
        try {
            WDContact wDContact = (WDContact) wDObjet.checkType(WDContact.class);
            if (wDContact != null) {
                C0597h.m2190b(wDContact);
            } else {
                C0596g.m2176g(C0725i.m3055c(wDObjet.getString()));
            }
            wDBooleen = new WDBooleen(true);
            a.m2735v();
        } catch (C0606q e) {
            throw e;
        } catch (C0539d e2) {
            C0539d c0539d = e2;
            try {
                WDErreurManager.m2876a(a, c0539d);
                wDBooleen = new WDBooleen(c0539d.mo3220i());
            } finally {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static WDBooleen contactAjoute(WDObjet wDObjet) {
        WDBooleen contactAjoute;
        WDContexte a = C0677k.m2776a(f1135z[7], 1);
        try {
            if (((WDContact) wDObjet.checkType(WDContact.class)) != null) {
                contactAjoute = contactAjoute(wDObjet, null);
            } else {
                m1586a(wDObjet.getInt());
                C0596g.m2177h();
                contactAjoute = new WDBooleen(true);
                a.m2735v();
            }
        } catch (C0539d e) {
            C0539d c0539d = e;
            WDErreurManager.m2876a(a, c0539d);
            contactAjoute = new WDBooleen(c0539d.mo3220i());
        } finally {
            a.m2735v();
        }
        return contactAjoute;
    }

    public static WDBooleen contactAjoute(WDObjet wDObjet, WDObjet wDObjet2) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1135z[7], 1);
        try {
            WDContact b = m1587b(wDObjet, 1);
            WDContactSource wDContactSource = null;
            if (wDObjet2 != null) {
                wDContactSource = m1585a(wDObjet2, 2);
            }
            C0597h.m2186a(b, wDContactSource);
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

    public static WDBooleen contactCherche(int i, WDObjet[] wDObjetArr) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1135z[5], 1);
        try {
            boolean z;
            m1586a(i);
            if (wDObjetArr.length >= 3) {
                if (wDObjetArr.length % 2 == 1) {
                    z = wDObjetArr[wDObjetArr.length - 1].getBoolean();
                    C0596g.m2161a(wDObjetArr, z);
                    wDBooleen = new WDBooleen(true);
                    a.m2735v();
                    return wDBooleen;
                }
            }
            z = false;
            C0596g.m2161a(wDObjetArr, z);
            wDBooleen = new WDBooleen(true);
            a.m2735v();
        } catch (C0606q e) {
            throw e;
        } catch (C0539d e2) {
            C0539d c0539d = e2;
            try {
                WDErreurManager.m2876a(a, c0539d);
                wDBooleen = new WDBooleen(c0539d.mo3220i());
            } finally {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static WDBooleen contactCree() {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1135z[19], 0);
        try {
            wDBooleen = new WDBooleen(C0596g.m2162a(true));
        } catch (C0539d e) {
            C0539d c0539d = e;
            WDErreurManager.m2876a(a, c0539d);
            wDBooleen = new WDBooleen(c0539d.mo3220i());
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen contactCree(WDObjet wDObjet) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2778a(f1135z[1], false);
        try {
            wDBooleen = new WDBooleen(C0597h.m2187a(m1587b(wDObjet, 1), true));
        } catch (C0539d e) {
            C0539d c0539d = e;
            WDErreurManager.m2876a(a, c0539d);
            wDBooleen = new WDBooleen(c0539d.mo3220i());
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen contactDernier(int i) {
        return contactDernier(i, 0);
    }

    public static WDBooleen contactDernier(int i, int i2) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1135z[8], 1);
        try {
            m1586a(i);
            C0596g.m2156a(4, null, i2);
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

    public static WDBooleen contactEdite() {
        return contactEdite(new WDChaine(""));
    }

    public static WDBooleen contactEdite(WDObjet wDObjet) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1135z[0], 0);
        WDBooleen d;
        try {
            WDContact wDContact = (WDContact) wDObjet.checkType(WDContact.class);
            if (wDContact != null) {
                d = C0597h.m2192d(wDContact);
                wDBooleen = new WDBooleen((boolean) d);
                return wDBooleen;
            }
            d = new WDBooleen(C0596g.m2172e(C0725i.m3055c(wDObjet.getString())));
            a.m2735v();
            return d;
        } catch (C0539d e) {
            wDBooleen = e;
            WDErreurManager.m2876a(a, (C0539d) wDBooleen);
            wDBooleen = wDBooleen.mo3220i();
            d = new WDBooleen((boolean) wDBooleen);
            return d;
        } finally {
            a.m2735v();
        }
    }

    public static WDObjet contactListe() {
        return contactListe(WDObjet.NULL, 1, null, null);
    }

    public static WDObjet contactListe(WDObjet wDObjet) {
        return contactListe(wDObjet, 1, null, null);
    }

    public static WDObjet contactListe(WDObjet wDObjet, int i) {
        return contactListe(wDObjet, i, null, null);
    }

    public static WDObjet contactListe(WDObjet wDObjet, int i, String str) {
        return contactListe(wDObjet, i, str, null);
    }

    public static WDObjet contactListe(WDObjet wDObjet, int i, String str, String str2) {
        WDObjet wDBooleen;
        WDContexte a = C0677k.m2776a(f1135z[18], 0);
        WDContactSource wDContactSource = null;
        if (wDObjet != null) {
            try {
                if (!wDObjet.isValeurNull() && wDObjet.checkType(WDChaine.class) == null) {
                    wDContactSource = m1585a(wDObjet, 1);
                }
            } catch (C0606q e) {
                throw e;
            } catch (C0539d e2) {
                r1 = e2;
                try {
                    C0539d c0539d;
                    WDErreurManager.m2876a(a, c0539d);
                    wDBooleen = new WDBooleen(c0539d.mo3220i());
                } finally {
                    a.m2735v();
                }
            }
        }
        wDBooleen = C0597h.m2184a(wDContactSource, i, str, str2);
        a.m2735v();
        return wDBooleen;
    }

    public static WDObjet contactListeSource() {
        WDObjet b;
        WDContexte a = C0677k.m2776a(f1135z[16], 0);
        try {
            b = C0597h.m2189b();
        } catch (C0539d e) {
            WDErreurManager.m2876a(a, e);
            b = new WDBooleen(e.mo3220i());
        } finally {
            a.m2735v();
        }
        return b;
    }

    public static WDBooleen contactLit(int i, String str) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1135z[3], 1);
        try {
            m1586a(i);
            C0596g.m2170d(C0725i.m3055c(str));
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

    public static WDBooleen contactModifie(WDObjet wDObjet) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1135z[14], 1);
        try {
            WDContact wDContact = (WDContact) wDObjet.checkType(WDContact.class);
            if (wDContact != null) {
                C0597h.m2191c(wDContact);
            } else {
                m1586a(wDObjet.getInt());
                C0596g.m2163b();
            }
            wDBooleen = new WDBooleen(true);
            a.m2735v();
        } catch (C0606q e) {
            throw e;
        } catch (C0539d e2) {
            C0539d c0539d = e2;
            try {
                WDErreurManager.m2876a(a, c0539d);
                wDBooleen = new WDBooleen(c0539d.mo3220i());
            } finally {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static WDBooleen contactPrecedent(int i) {
        return contactPrecedent(i, 0);
    }

    public static WDBooleen contactPrecedent(int i, int i2) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1135z[4], 1);
        try {
            m1586a(i);
            C0596g.m2156a(3, null, i2);
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

    public static WDBooleen contactPremier(int i) {
        return contactPremier(i, 0);
    }

    public static WDBooleen contactPremier(int i, int i2) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1135z[6], 1);
        try {
            m1586a(i);
            C0596g.m2156a(1, null, i2);
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

    public static void contactRAZ() {
        WDContexte a = C0677k.m2778a(f1135z[15], true);
        try {
            WDStructContact.m1843a();
        } finally {
            a.m2735v();
        }
    }

    public static void contactRAZ(WDObjet wDObjet) {
        WDContexte a = C0677k.m2778a(f1135z[15], true);
        try {
            WDContact wDContact = (WDContact) wDObjet.checkType(WDContact.class);
            if (wDContact != null) {
                wDContact.razVariable();
            }
            a.m2735v();
        } catch (Throwable th) {
            a.m2735v();
        }
    }

    public static WDBooleen contactSelectionne() {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1135z[1], 0);
        try {
            wDBooleen = new WDBooleen(C0596g.m2162a(false));
        } catch (C0539d e) {
            C0539d c0539d = e;
            WDErreurManager.m2876a(a, c0539d);
            wDBooleen = new WDBooleen(c0539d.mo3220i());
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen contactSelectionne(WDObjet wDObjet) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1135z[1], 0);
        try {
            wDBooleen = new WDBooleen(C0597h.m2187a(m1587b(wDObjet, 1), false));
        } catch (C0539d e) {
            C0539d c0539d = e;
            WDErreurManager.m2876a(a, c0539d);
            wDBooleen = new WDBooleen(c0539d.mo3220i());
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen contactSuivant(int i) {
        return contactSuivant(i, 0);
    }

    public static WDBooleen contactSuivant(int i, int i2) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1135z[2], 1);
        try {
            m1586a(i);
            C0596g.m2156a(2, null, i2);
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

    public static WDBooleen contactSupprime(WDObjet wDObjet) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1135z[13], 1);
        try {
            WDContact wDContact = (WDContact) wDObjet.checkType(WDContact.class);
            if (wDContact != null) {
                C0597h.m2185a(wDContact);
            } else {
                m1586a(wDObjet.getInt());
                C0596g.m2174f();
            }
            wDBooleen = new WDBooleen(true);
            a.m2735v();
        } catch (C0606q e) {
            throw e;
        } catch (C0539d e2) {
            C0539d c0539d = e2;
            try {
                WDErreurManager.m2876a(a, c0539d);
                wDBooleen = new WDBooleen(c0539d.mo3220i());
            } finally {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    /* renamed from: z */
    private static String m1588z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 88;
                    break;
                case 1:
                    i2 = 89;
                    break;
                case 2:
                    i2 = 80;
                    break;
                case 3:
                    i2 = 123;
                    break;
                default:
                    i2 = 75;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1589z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 75);
        }
        return toCharArray;
    }
}
