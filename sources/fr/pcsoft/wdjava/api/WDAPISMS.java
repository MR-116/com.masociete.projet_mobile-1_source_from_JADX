package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDDateHeure;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.p054e.C0880c;
import fr.pcsoft.wdjava.p054e.C0882e;

public class WDAPISMS {
    public static WDDateHeure DateReception = new WDDateHeure();
    public static WDBooleen Essai = new WDBooleen();
    public static WDEntier4 Indice = new WDEntier4();
    public static WDChaine Message = new WDChaine();
    public static WDChaine Numero = new WDChaine();
    public static WDChaine PrefixeNational = new WDChaine();
    public static WDEntier4 TypeNumero = new WDEntier4();
    /* renamed from: a */
    private static final int f1224a = 1;
    /* renamed from: z */
    private static final String[] f1225z = new String[]{m1664z(m1665z("?#~%3O%c&>U=v")), m1664z(m1665z("?3|8?H1}\")C#z;3U>e7 U4v)-R4a9%X")), m1664z(m1665z("?5p>)_/`#<L\"v%?U?})?Q#")), m1664z(m1665z("?#~%3P1}5)C1c& U")), m1664z(m1665z("?#~%3Y>e9%Y")), m1664z(m1665z("?3|8?H1}\")C#z;3U>e7 U4v)-R4a9%X/\u0001")), m1664z(m1665z("?#~%3R2l;)O#r1)")), m1664z(m1665z("?#~%3L\"v;%Y\"")), m1664z(m1665z("?5p>)_/3/H%a33O=`")), m1664z(m1665z("?#~%3O%z -R$"))};

    static {
        if (WDProjet.getInstance() != null) {
            m1663a();
        }
    }

    /* renamed from: a */
    private static final void m1663a() {
        DateReception.setValeur("");
        Essai = new WDBooleen(true);
        Indice = new WDEntier4(0);
        Message = new WDChaine("");
        Numero = new WDChaine("");
        PrefixeNational = new WDChaine(C0880c.m6183h());
        TypeNumero = new WDEntier4(1);
    }

    public static WDBooleen smsEnvoie() {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1225z[4], 1);
        try {
            C0880c.m6173a();
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

    public static final void smsLanceAppli() {
        WDContexte a = C0677k.m2775a(f1225z[3]);
        try {
            C0880c.m6178c();
        } catch (C0539d e) {
            WDErreurManager.m2876a(a, e);
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 smsNbMessage(int i) {
        return smsNbMessage(i, 1);
    }

    public static WDEntier4 smsNbMessage(int i, int i2) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2776a(f1225z[6], 1);
        if (i == 2) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1225z[1], new String[0]));
            } catch (C0882e e) {
                throw e;
            } catch (C0539d e2) {
                r1 = e2;
                try {
                    C0539d c0539d;
                    WDErreurManager.m2876a(a, c0539d);
                    wDEntier4 = new WDEntier4(c0539d.mo3221j());
                } finally {
                    a.m2735v();
                }
            }
        }
        if (i2 == 2) {
            WDErreurManager.m2883a(C0745b.m3222b(f1225z[5], new String[0]));
        }
        wDEntier4 = new WDEntier4(C0880c.m6181f());
        a.m2735v();
        return wDEntier4;
    }

    public static WDBooleen smsPremier(int i) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1225z[7], 1);
        if (i == 2) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1225z[1], new String[0]));
            } catch (C0882e e) {
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
        boolean b = C0880c.m6177b();
        if (!b) {
            WDErreurManager.m2877a(a, C0745b.m3222b(f1225z[8], new String[0]));
        }
        wDBooleen = new WDBooleen(b);
        a.m2735v();
        return wDBooleen;
    }

    public static void smsRaz() {
        m1663a();
    }

    public static WDBooleen smsSuivant(int i) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1225z[9], 1);
        if (i == 2) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1225z[1], new String[0]));
            } catch (C0882e e) {
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
        boolean i2 = C0880c.m6184i();
        if (!i2) {
            WDErreurManager.m2877a(a, C0745b.m3222b(f1225z[8], new String[0]));
        }
        wDBooleen = new WDBooleen(i2);
        a.m2735v();
        return wDBooleen;
    }

    public static WDBooleen smsSupprime(int i, int i2) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1225z[0], 1);
        if (i == 2) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1225z[1], new String[0]));
            } catch (C0882e e) {
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
        boolean a2 = C0880c.m6175a(i2);
        if (!a2) {
            WDErreurManager.m2877a(a, C0745b.m3222b(f1225z[2], new String[0]));
        }
        wDBooleen = new WDBooleen(a2);
        a.m2735v();
        return wDBooleen;
    }

    /* renamed from: z */
    private static String m1664z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 28;
                    break;
                case 1:
                    i2 = 112;
                    break;
                case 2:
                    i2 = 51;
                    break;
                case 3:
                    i2 = 118;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1665z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 108);
        }
        return toCharArray;
    }
}
