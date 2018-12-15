package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.p042b.C0658b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.xml.C1537g;
import fr.pcsoft.wdjava.xml.classic.WDXMLManager;

public class WDAPIXmlClassic {
    /* renamed from: z */
    private static final String[] f1236z = new String[]{m1688z(m1689z("\u0001rI\u001b'grP\u00059k~[\u00137aI\u00126v")), m1688z(m1689z("\u0001rI\u001b'gd[\u0013=jeV\u0004")), m1688z(m1689z("\u0001rI\u001b'lkI\u0012+rkG\u0012'wxM")), m1688z(m1689z("\u0001rI\u001b'feG\u00025gdP")), m1688z(m1689z("\u0001rI\u001b'c`K\u0002,guB\u001e4q")), m1688z(m1689z("\u0001rI\u001b'pkG\u001e6g")), m1688z(m1689z("\u0001rI\u001b'reW\u001e,keJ")), m1688z(m1689z("\u0001rI\u001b'cdJ\u00024guV\u0012;joV\u00140g")), m1688z(m1689z("\u0001rI\u001b'oe@\u001e>ko")), m1688z(m1689z("\u0001rI\u001b'qT\u0007*kgA")), m1688z(m1689z("\u0001rI\u001b'rkV\u00126v")), m1688z(m1689z("\u0001rI\u001b'dcH\u0004'grM\u0004,g")), m1688z(m1689z("\u0001rI\u001b'poJ\u00185oo")), m1688z(m1689z("\u0001rI\u001b'feJ\u0019=g")), m1688z(m1689z("\u0001rI\u001b'kdW\u0012*gu@\u0018;wgA\u0019,")), m1688z(m1689z("\u0001rI\u001b'dcH\u0004")), m1688z(m1689z("\u0001rI\u001b'vsT\u0012'gfA\u001a=l~")), m1688z(m1689z("\u0001rI\u001b'grP\u00059k~[\u00140ccJ\u0012")), m1688z(m1689z("\u0001rI\u001b'voV\u001a1lo")), m1688z(m1689z("\u0001rI\u001b'poG\u001f=piL\u0012")), m1688z(m1689z("\u0001rI\u001b'leI\b=noI\u00126v")), m1688z(m1689z("\u0001rI\u001b'vxK\u0002.g")), m1688z(m1689z("\u0001rI\u001b'foV\u00191gx")), m1688z(m1689z("\u0001rI\u001b'qM\u00019l~")), m1688z(m1689z("\u0001rI\u001b'leI\b(cxA\u0019,")), m1688z(m1689z("\u0001rI\u001b'poP\u0018-puT\u0018+k~M\u00186")), m1688z(m1689z("\u0001rI\u001b'rxA\u0014=foJ\u0003")), m1688z(m1689z("\u0001rI\u001b'rxA\u001a1gx")), m1688z(m1689z("\u0001rI\u001b'kdW\u0012*guA\u001b=ooJ\u0003")), m1688z(m1689z("\u0001rI\u001b'qkQ\u0001=}zK\u00041vcK\u0019")), m1688z(m1689z("\u0001rI\u001b'c`K\u0002,guE\u0003,pcF\u0002,")), m1688z(m1689z("\u0001rI\u001b'lkI\u0012+rkG\u0012"))};

    public static WDChaine XMLNomElement(String str) {
        WDChaine wDChaine;
        WDContexte a = C0677k.m2775a(f1236z[20]);
        try {
            wDChaine = new WDChaine(WDXMLManager.m10619e(str));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDChaine = new WDChaine("");
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static WDBooleen XMLParent(String str) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1236z[10]);
        try {
            wDBooleen = new WDBooleen(WDXMLManager.m10632r(str));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen xmlAjouteAttribut(String str, String str2) {
        return xmlAjouteAttribut(str, str2, "", false);
    }

    public static WDBooleen xmlAjouteAttribut(String str, String str2, String str3) {
        return xmlAjouteAttribut(str, str2, str3, false);
    }

    public static WDBooleen xmlAjouteAttribut(String str, String str2, String str3, boolean z) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1236z[30]);
        try {
            wDBooleen = new WDBooleen(WDXMLManager.m10611a(str, str2, str3, z));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen xmlAjouteFils(String str, String str2) {
        return xmlAjouteFils(str, str2, "", false);
    }

    public static WDBooleen xmlAjouteFils(String str, String str2, String str3) {
        return xmlAjouteFils(str, str2, str3, false);
    }

    public static WDBooleen xmlAjouteFils(String str, String str2, String str3, boolean z) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1236z[4]);
        try {
            wDBooleen = new WDBooleen(WDXMLManager.m10615b(str, str2, str3, z));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static void xmlAnnuleRecherche(String str) {
        WDContexte a = C0677k.m2775a(f1236z[7]);
        try {
            WDXMLManager.m10618d(str);
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen xmlDernier(String str) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1236z[22]);
        try {
            wDBooleen = new WDBooleen(WDXMLManager.m10627m(str));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen xmlDocument(String str) {
        return xmlDocument(str, new WDChaine(""));
    }

    public static WDBooleen xmlDocument(String str, WDObjet wDObjet) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1236z[3]);
        try {
            WDXMLManager.m10604a(str, wDObjet);
            wDBooleen = new WDBooleen(true);
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDChaine xmlDonnee(String str) {
        return xmlDonnee(str, "", 1);
    }

    public static WDChaine xmlDonnee(String str, String str2) {
        return xmlDonnee(str, str2, 1);
    }

    public static WDChaine xmlDonnee(String str, String str2, int i) {
        WDChaine wDChaine;
        WDContexte a = C0677k.m2775a(f1236z[13]);
        try {
            wDChaine = new WDChaine(WDXMLManager.m10601a(str, str2, i));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDChaine = new WDChaine("");
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static WDBooleen xmlEnDehors(String str) {
        WDContexte a = C0677k.m2775a(f1236z[1]);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDXMLManager.m10622h(str));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine xmlExtraitChaine(String str, String str2) {
        return xmlExtraitChaine(str, str2, 1, 1);
    }

    public static WDChaine xmlExtraitChaine(String str, String str2, int i) {
        return xmlExtraitChaine(str, str2, i, 1);
    }

    @C0658b(a = C0657a.FROYO)
    public static WDChaine xmlExtraitChaine(String str, String str2, int i, int i2) {
        WDChaine wDChaine;
        WDContexte a = C0677k.m2780a(f1236z[17], true, false, C0657a.FROYO.getNumero());
        try {
            wDChaine = new WDChaine(WDXMLManager.m10602a(str, str2, i, i2));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDChaine = new WDChaine();
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static WDBooleen xmlExtraitDocument(String str, String str2) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1236z[0]);
        try {
            wDBooleen = new WDBooleen(WDXMLManager.m10617c(str, str2));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen xmlFils(String str) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1236z[15]);
        try {
            wDBooleen = new WDBooleen(WDXMLManager.m10633s(str));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen xmlFilsExiste(String str) {
        return xmlFilsExiste(str, 3);
    }

    public static WDBooleen xmlFilsExiste(String str, int i) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1236z[11]);
        try {
            wDBooleen = new WDBooleen(WDXMLManager.m10606a(str, i));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen xmlInsereDocument(String str, String str2) {
        return xmlInsereDocument(str, str2, 16);
    }

    public static WDBooleen xmlInsereDocument(String str, String str2, int i) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1236z[14]);
        try {
            wDBooleen = new WDBooleen(WDXMLManager.m10614b(str, str2, i));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen xmlInsereElement(String str, String str2) {
        return xmlInsereElement(str, str2, "", 2, false);
    }

    public static WDBooleen xmlInsereElement(String str, String str2, String str3) {
        return xmlInsereElement(str, str2, str3, 2, false);
    }

    public static WDBooleen xmlInsereElement(String str, String str2, String str3, int i) {
        return xmlInsereElement(str, str2, str3, i, false);
    }

    public static WDBooleen xmlInsereElement(String str, String str2, String str3, int i, boolean z) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1236z[28]);
        try {
            wDBooleen = new WDBooleen(WDXMLManager.m10610a(str, str2, str3, i, z));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen xmlModifie(String str, String str2) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1236z[8]);
        try {
            wDBooleen = new WDBooleen(WDXMLManager.m10613b(str, str2));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDChaine xmlNamespace(String str) {
        WDChaine wDChaine;
        WDContexte a = C0677k.m2775a(f1236z[31]);
        try {
            wDChaine = new WDChaine(WDXMLManager.m10616c(str));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDChaine = new WDChaine();
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static WDChaine xmlNamespaceURI(String str) {
        WDChaine wDChaine;
        WDContexte a = C0677k.m2775a(f1236z[2]);
        try {
            wDChaine = new WDChaine(WDXMLManager.m10621g(str));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDChaine = new WDChaine();
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static WDChaine xmlNomParent(String str) {
        WDChaine wDChaine;
        WDContexte a = C0677k.m2775a(f1236z[24]);
        try {
            wDChaine = new WDChaine(WDXMLManager.m10626l(str));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDChaine = new WDChaine("");
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static WDChaine xmlPosition(String str) {
        WDChaine wDChaine;
        WDContexte a = C0677k.m2775a(f1236z[6]);
        try {
            wDChaine = new WDChaine(WDXMLManager.m10629o(str));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDChaine = new WDChaine();
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static WDBooleen xmlPrecedent(String str) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1236z[26]);
        try {
            wDBooleen = new WDBooleen(WDXMLManager.m10623i(str));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen xmlPremier(String str) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1236z[27]);
        try {
            wDBooleen = new WDBooleen(WDXMLManager.m10631q(str));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen xmlRacine(String str) {
        WDContexte a = C0677k.m2775a(f1236z[5]);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDXMLManager.m10605a(str));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen xmlRecherche(String str, WDObjet wDObjet) {
        return xmlRecherche(str, wDObjet, 3, 1);
    }

    public static WDBooleen xmlRecherche(String str, WDObjet wDObjet, int i) {
        return xmlRecherche(str, wDObjet, i, 1);
    }

    public static WDBooleen xmlRecherche(String str, WDObjet wDObjet, int i, int i2) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1236z[19]);
        try {
            wDBooleen = new WDBooleen(WDXMLManager.m10608a(str, wDObjet, i, i2));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen xmlRenomme(String str, String str2) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1236z[12]);
        try {
            wDBooleen = new WDBooleen(WDXMLManager.m10609a(str, str2));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen xmlRetourPosition(String str, int i) {
        return xmlRetourPosition(str, i, 4);
    }

    public static WDBooleen xmlRetourPosition(String str, int i, int i2) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1236z[25]);
        try {
            wDBooleen = new WDBooleen(WDXMLManager.m10607a(str, i, i2));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDEntier4 xmlSauvePosition(String str) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2775a(f1236z[29]);
        try {
            wDEntier4 = new WDEntier4(WDXMLManager.m10625k(str));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier4 = new WDEntier4(-1);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static WDBooleen xmlSuivant(String str) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1236z[23]);
        try {
            wDBooleen = new WDBooleen(WDXMLManager.m10624j(str));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen xmlSupprime(String str) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2775a(f1236z[9]);
        try {
            wDBooleen = new WDBooleen(WDXMLManager.m10628n(str));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen xmlTermine(String str) {
        WDContexte a = C0677k.m2775a(f1236z[18]);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDXMLManager.m10612b(str));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen xmlTrouve(String str) {
        WDContexte a = C0677k.m2775a(f1236z[21]);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDXMLManager.m10634t(str));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 xmlTypeElement(String str) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2775a(f1236z[16]);
        try {
            wDEntier4 = new WDEntier4(WDXMLManager.m10630p(str));
        } catch (C1537g e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier4 = new WDEntier4(-1);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    /* renamed from: z */
    private static String m1688z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 34;
                    break;
                case 1:
                    i2 = 42;
                    break;
                case 2:
                    i2 = 4;
                    break;
                case 3:
                    i2 = 87;
                    break;
                default:
                    i2 = C0607n.co;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1689z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.co);
        }
        return toCharArray;
    }
}
