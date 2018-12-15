package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.types.C0782g;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.net.C0974g;
import fr.pcsoft.wdjava.p059n.C0969g;
import fr.pcsoft.wdjava.p059n.C0971i;
import fr.pcsoft.wdjava.ui.p069g.C1409j;

public class WDAPISocket {
    public static WDEntier4 Option = new C0549e();
    /* renamed from: z */
    private static final String[] f1227z = new String[]{m1668z(m1669z("F4)\u0001\u0014 39\u0001\r \"9\u0017\u001b5")), m1668z(m1669z("UIVloKW")), m1668z(m1669z("F4)\u0001\u0014 39\u000e\u00161")), m1668z(m1669z("F4)\u0001\u0014 39\u0003\u001c&\"6\u0016\u001a")), m1668z(m1669z("F4)\u0001\u0014 39\u0007\u001c7.2")), m1668z(m1669z("F4)\u0001\u0014 39\u0001\u0017$)!\u0007\u0000((\"\u0007\u000015'\f\f(.5\u0011\u0016*)")), m1668z(m1669z("F4)\u0001\u0014 39\u0001\u0013,\"(\u0016\u0000,) \r")), m1668z(m1669z("F4)\u0001\u0014 39\u0003\u000b1\"(\u0006\u0000&((\f\u001a=.)\f")), m1668z(m1669z("F4)\u0001\u0014 39\u0010\u001a#25\u0007")), m1668z(m1669z("F4)\u0001\u0014 39\u0004\u001a7*#")), m1668z(m1669z("Y\")\u0004a")), m1668z(m1669z("F4)\u0001\u0014 39\u0001\u0010+)#\u0001\u000b ")), m1668z(m1669z("F4)\u0001\u0014 39\u0001\r \""))};

    public static WDChaine socketAccepte(String str) {
        WDChaine wDChaine;
        WDContexte a = C0677k.m2775a(f1227z[3]);
        try {
            wDChaine = new WDChaine(C0969g.m7022c(str));
        } catch (C0971i e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDChaine = new WDChaine("");
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static WDBooleen socketAttendConnexion(String str) {
        return socketAttendConnexion(str, null);
    }

    public static WDBooleen socketAttendConnexion(String str, WDObjet wDObjet) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1227z[7]);
        try {
            wDBooleen = new WDBooleen(C0969g.m7016a(str, C0725i.m3013a(wDObjet, C0782g.MILLISECOND)));
        } catch (C0971i e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen socketChangeModeTransmission(String str, int i) {
        return socketChangeModeTransmission(str, i, f1227z[10]);
    }

    public static WDBooleen socketChangeModeTransmission(String str, int i, String str2) {
        WDContexte a = C0677k.m2775a(f1227z[5]);
        try {
            C0969g.m7011a(str, i, str2);
            WDBooleen wDBooleen = new WDBooleen(true);
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine socketClientInfo(String str, int i) {
        WDContexte a = C0677k.m2775a(f1227z[6]);
        try {
            WDChaine wDChaine = new WDChaine(C0969g.m7020b(str, i));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen socketConnecte(String str, int i) {
        return socketConnecte(str, i, C0974g.m7035a(), new WDEntier4((int) C1409j.f4184a));
    }

    public static WDBooleen socketConnecte(String str, int i, String str2) {
        return socketConnecte(str, i, str2, new WDEntier4((int) C1409j.f4184a));
    }

    public static WDBooleen socketConnecte(String str, int i, String str2, WDObjet wDObjet) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1227z[11]);
        try {
            wDBooleen = new WDBooleen(C0969g.m7017a(str, i, str2, C0725i.m3013a(wDObjet, C0782g.MILLISECOND)));
        } catch (C0971i e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen socketCree(String str, int i) {
        return socketCree(str, i, f1227z[1]);
    }

    public static WDBooleen socketCree(String str, int i, String str2) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1227z[12]);
        try {
            wDBooleen = new WDBooleen(C0969g.m7018a(str, str2, i, false));
        } catch (C0971i e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen socketCreeUDP(String str, int i) {
        return socketCreeUDP(str, i, f1227z[1]);
    }

    public static WDBooleen socketCreeUDP(String str, int i, String str2) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1227z[0]);
        try {
            wDBooleen = new WDBooleen(C0969g.m7018a(str, str2, i, true));
        } catch (C0971i e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen socketEcrit(String str, WDObjet wDObjet) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1227z[4]);
        try {
            C0969g.m7013a(str, wDObjet.getDonneeBinaire());
            wDBooleen = new WDBooleen(true);
        } catch (C0971i e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen socketEcrit(String str, WDObjet wDObjet, String str2, int i) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1227z[4]);
        try {
            C0969g.m7014a(str, wDObjet.getDonneeBinaire(), str2, i);
            wDBooleen = new WDBooleen(true);
        } catch (C0971i e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen socketExiste(String str) {
        return new WDBooleen(C0969g.m7015a(str));
    }

    public static void socketFerme(String str) {
        WDContexte a = C0677k.m2775a(f1227z[9]);
        try {
            C0969g.m7023d(str);
        } catch (C0971i e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine socketLit(String str) {
        return socketLit(str, false, new WDEntier4(1000), 4096);
    }

    public static WDChaine socketLit(String str, boolean z) {
        return socketLit(str, z, new WDEntier4(1000), 4096);
    }

    public static WDChaine socketLit(String str, boolean z, WDObjet wDObjet) {
        return socketLit(str, z, wDObjet, 4096);
    }

    public static WDChaine socketLit(String str, boolean z, WDObjet wDObjet, int i) {
        WDChaine wDChaine;
        WDContexte a = C0677k.m2775a(f1227z[2]);
        try {
            wDChaine = new WDChaine(C0969g.m7019a(str, z, C0725i.m3013a(wDObjet, C0782g.MILLISECOND), i));
        } catch (C0971i e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDChaine = new WDChaine("");
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static WDBooleen socketRefuse(String str) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1227z[8]);
        try {
            wDBooleen = new WDBooleen(C0969g.m7024e(str));
        } catch (C0971i e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    /* renamed from: z */
    private static String m1668z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 101;
                    break;
                case 1:
                    i2 = 103;
                    break;
                case 2:
                    i2 = 102;
                    break;
                case 3:
                    i2 = 66;
                    break;
                default:
                    i2 = 95;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1669z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 95);
        }
        return toCharArray;
    }
}
