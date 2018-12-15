package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0663e;
import fr.pcsoft.wdjava.core.p035c.C0666h;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.ui.champs.groupeoptions.C0501o;
import fr.pcsoft.wdjava.ui.utils.C1502a;

public class WDAPIGroupeOption {
    /* renamed from: a */
    protected static final int f1157a = 12;
    /* renamed from: z */
    private static final String[] f1158z = new String[]{m1629z(m1630z("\u0005(B\u0019{e/B\u0000ly:M\u001akr>")), m1629z(m1630z("\u00052I\u0001{t)R\u0005jc.U\nms+W\u0007wk>")), m1629z(m1630z("\u00052I\u0001{t)R\u0005jc.U\nwh(B\u0007{")), m1629z(m1630z("\u0005>U\u0007{s)X\u0005u(F\u0012{y+F\u0007k")), m1629z(m1630z("\u00052I\u0001{t)R\u0005jc.U\nqe8R\u0007lc5D\u0010")), m1629z(m1630z("\u0005(B\u0019{e/B\u0000ly(R\u0005nt2J\u0010")), m1629z(m1630z("\u00052I\u0001{t)R\u0005jc.U\nl4R\u0001{")), m1629z(m1630z("\u0005(B\u0019{e/B\u0000ly4D\u0016kt)B\u001b}c")), m1629z(m1630z("\u0005(B\u0019{e/B\u0000ly2I\u0006{t>"))};

    /* renamed from: a */
    protected static final C0501o m1628a(WDObjet wDObjet, int i, int i2) {
        String[] strArr;
        try {
            return (C0501o) C1502a.m10417a(wDObjet, C0501o.class);
        } catch (C0666h e) {
            strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1158z[3], String.valueOf(i));
            strArr[1] = e.getMessage();
            WDErreurManager.m2886a(strArr);
            return null;
        } catch (C0663e e2) {
            strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1158z[3], String.valueOf(i));
            strArr[1] = e2.m2671a(i2);
            WDErreurManager.m2886a(strArr);
            return null;
        }
    }

    public static final WDEntier4 interrupteurAjoute(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2776a(f1158z[6], 12);
        WDEntier4 wDEntier4 = C0607n.Td;
        try {
            wDEntier4 = new WDEntier4(C0725i.m3069e(m1628a(wDObjet, 1, C0607n.Td).addOptionDynamically(str)));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final WDEntier4 interrupteurInsere(WDObjet wDObjet, int i, String str) {
        WDContexte a = C0677k.m2776a(f1158z[2], 12);
        WDEntier4 wDEntier4 = C0607n.Td;
        try {
            wDEntier4 = new WDEntier4(C0725i.m3069e(m1628a(wDObjet, 1, C0607n.Td).insertOptionDynamically(str, C0725i.m3011a(i))));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final WDEntier4 interrupteurOccurrence(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1158z[4], 12);
        try {
            WDEntier4 nombreOption = m1628a(wDObjet, 1, C0607n.Td).getNombreOption();
            return nombreOption;
        } finally {
            a.m2735v();
        }
    }

    public static final void interrupteurSupprime(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2776a(f1158z[1], 12);
        try {
            m1628a(wDObjet, 1, C0607n.Td).removeOptionDynamically(C0725i.m3011a(i));
        } finally {
            a.m2735v();
        }
    }

    public static final WDEntier4 selecteurAjoute(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2776a(f1158z[0], 12);
        WDEntier4 wDEntier4 = 1030;
        try {
            wDEntier4 = new WDEntier4(C0725i.m3069e(m1628a(wDObjet, 1, 1030).addOptionDynamically(str)));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final WDEntier4 selecteurInsere(WDObjet wDObjet, int i, String str) {
        WDContexte a = C0677k.m2776a(f1158z[8], 12);
        WDEntier4 wDEntier4 = 1030;
        try {
            wDEntier4 = new WDEntier4(C0725i.m3069e(m1628a(wDObjet, 1, 1030).insertOptionDynamically(str, C0725i.m3011a(i))));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final WDEntier4 selecteurOccurrence(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1158z[7], 12);
        try {
            WDEntier4 nombreOption = m1628a(wDObjet, 1, 1030).getNombreOption();
            return nombreOption;
        } finally {
            a.m2735v();
        }
    }

    public static final void selecteurSupprime(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2776a(f1158z[5], 12);
        try {
            m1628a(wDObjet, 1, 1030).removeOptionDynamically(C0725i.m3011a(i));
        } finally {
            a.m2735v();
        }
    }

    /* renamed from: z */
    private static String m1629z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 38;
                    break;
                case 1:
                    i2 = 123;
                    break;
                case 2:
                    i2 = 7;
                    break;
                case 3:
                    i2 = 85;
                    break;
                default:
                    i2 = 62;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1630z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 62);
        }
        return toCharArray;
    }
}
