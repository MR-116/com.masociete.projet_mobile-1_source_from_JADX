package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.p042b.C0658b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDChaineA;
import fr.pcsoft.wdjava.core.types.WDChaineU;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.ec;
import fr.pcsoft.wdjava.xml.C1537g;
import fr.pcsoft.wdjava.xml.dino.C1534l;
import java.lang.reflect.InvocationTargetException;

public class WDAPIXml {
    /* renamed from: z */
    private static final String[] f1235z = new String[]{m1686z(m1687z("6_A\u0001oCB^\u001eoABT\u0019u")), m1686z(m1687z("|tcu\b >S|")), m1686z(m1687z("vhb>Dgre?UVom$^p")), m1686z(m1687z("su\"=Sfhj9\u001ebcf,Ft)t \\;d`,CfnocgQ_A\u0001}tim*Ug")), m1686z(m1687z("Vkm>Cp'[\thXKA,^t`i?\u0010{hbmDghy;Ùp',=Qg'e#Dgh=Uvse\"^;")), m1686z(m1687z("Xîx%_qb,#_{'x?_`qå(\u0010ef~mY{s~\"Cebo9Yzi\"")), m1686z(m1687z("Pdd(S5cim\\2f|=Uy'h(\u0010yf, Ùaoc)U5wm?\u0010|ix?_fwi.D|hbc")), m1686z(m1687z("6_A\u0001oVHB\u001edGRE\u0019oVOM\u0004~P"))};

    public static WDChaine texteVersXML(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1235z[0]);
        try {
            WDChaine wDChaine = new WDChaine(C0808l.m4050h(wDObjet.getString()));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine xmlConstruitChaine(WDObjet wDObjet) {
        return xmlConstruitChaine(wDObjet, 0, 1);
    }

    public static WDChaine xmlConstruitChaine(WDObjet wDObjet, int i) {
        return xmlConstruitChaine(wDObjet, i, 1);
    }

    @C0658b(a = C0657a.FROYO)
    public static WDChaine xmlConstruitChaine(WDObjet wDObjet, int i, int i2) {
        WDChaine wDChaineU;
        boolean z = true;
        WDContexte a = C0677k.m2780a(f1235z[7], true, false, C0657a.FROYO.getNumero());
        try {
            C1534l c1534l = (C1534l) wDObjet.checkType(C1534l.class);
            if (c1534l != null) {
                if ((i & 2) == 2) {
                    z = false;
                }
                WDChaine wDChaine = new WDChaine(c1534l.m10721b(z));
                a.m2735v();
                return wDChaine;
            }
            String string = wDObjet.getString();
            try {
                String obj = Class.forName(f1235z[3]).getMethod(f1235z[2], new Class[]{String.class, Integer.TYPE, String.class}).invoke(null, new Object[]{string, Integer.valueOf(i), ec.m3871a(i2, f1235z[1])}).toString();
                wDChaineU = i2 == 3 ? new WDChaineU(obj) : new WDChaineA(obj, ec.m3871a(i2, f1235z[1]));
                a.m2735v();
                return wDChaineU;
            } catch (Exception e) {
                C0691a.m2857a(f1235z[4], e);
                wDChaineU = new WDChaine("");
                a.m2735v();
                return wDChaineU;
            } catch (Exception e2) {
                C0691a.m2857a(f1235z[5], e2);
                wDChaineU = new WDChaine("");
                a.m2735v();
                return wDChaineU;
            } catch (Exception e22) {
                C0691a.m2857a(f1235z[6], e22);
                wDChaineU = new WDChaine("");
                a.m2735v();
                return wDChaineU;
            } catch (InvocationTargetException e3) {
                Throwable targetException = e3.getTargetException();
                if (targetException instanceof C1537g) {
                    throw ((C1537g) targetException);
                }
                WDErreurManager.m2888b(targetException);
                a.m2735v();
                return null;
            } catch (ClassNotFoundException e4) {
                throw e4;
            }
        } catch (ClassNotFoundException e42) {
            throw e42;
        } catch (C1537g e5) {
            try {
                WDErreurManager.m2879a(a, e5.getMessage(), e5.m1561f());
                wDChaineU = new WDChaine();
                return wDChaineU;
            } finally {
                a.m2735v();
            }
        }
    }

    public static WDChaine xmlVersTexte(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1235z[0]);
        try {
            WDChaine wDChaine = new WDChaine(C0808l.m4056n(wDObjet.getString()));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    /* renamed from: z */
    private static String m1686z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 21;
                    break;
                case 1:
                    i2 = 7;
                    break;
                case 2:
                    i2 = 12;
                    break;
                case 3:
                    i2 = 77;
                    break;
                default:
                    i2 = 48;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1687z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 48);
        }
        return toCharArray;
    }
}
