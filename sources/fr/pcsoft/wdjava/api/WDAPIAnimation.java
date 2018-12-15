package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0663e;
import fr.pcsoft.wdjava.core.p035c.C0666h;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.p042b.C0658b;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0782g;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.image.C0520c;
import fr.pcsoft.wdjava.ui.p069g.C1404d;
import fr.pcsoft.wdjava.ui.utils.C1502a;

public class WDAPIAnimation {
    /* renamed from: a */
    private static final int f1128a = 5;
    /* renamed from: z */
    private static final String[] f1129z = new String[]{m1575z(m1576z("f.lP-\u00109aR)\u00168E-\u001a;P)\b")), m1575z(m1576z("f*pK%\u0004?wM&\u001a;lG8\u00049{")), m1575z(m1576z("f*pK%\u0004?wM&\u001a(vC&\u0002.aR)\u0017*sG<\u0017.")), m1575z(m1576z("f*pK%\u0004?wM&\u001a!qW-")), m1575z(m1576z("f*pK%\u0004?wM&\u001a'wV7\u0015*lC%\u0000?lG"))};

    /* renamed from: a */
    protected static final <T extends gc> T m1573a(WDObjet wDObjet, int i, Class<T> cls) {
        C0489p c0489p;
        String[] strArr;
        try {
            c0489p = (C0489p) C1502a.m10417a(wDObjet, (Class) cls);
        } catch (C0666h e) {
            strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1129z[0], String.valueOf(i));
            strArr[1] = e.getMessage();
            WDErreurManager.m2886a(strArr);
            c0489p = null;
        } catch (C0663e e2) {
            strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1129z[0], String.valueOf(i));
            strArr[1] = e2.m2671a(1000);
            WDErreurManager.m2886a(strArr);
            c0489p = null;
        }
        return (gc) c0489p;
    }

    /* renamed from: a */
    protected static final C0520c m1574a(WDObjet wDObjet, int i) {
        String[] strArr;
        try {
            return (C0520c) C1502a.m10417a(wDObjet, C0520c.class);
        } catch (C0666h e) {
            strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1129z[0], String.valueOf(i));
            strArr[1] = e.getMessage();
            WDErreurManager.m2886a(strArr);
            return null;
        } catch (C0663e e2) {
            strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1129z[0], String.valueOf(i));
            strArr[1] = e2.m2671a(1010);
            WDErreurManager.m2886a(strArr);
            return null;
        }
    }

    public static synchronized void animationChangeParametre(WDObjet wDObjet, String str, WDObjet wDObjet2) {
        synchronized (WDAPIAnimation.class) {
            WDContexte a = C0677k.m2775a(f1129z[2]);
            try {
                m1574a(wDObjet, 1).setParamAnimationImage(str, wDObjet2.getInt());
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static void animationJoue(int i) {
        animationJoue(i, new WDEntier4(25));
    }

    @C0658b(a = C0657a.ECLAIR)
    public static void animationJoue(int i, WDObjet wDObjet) {
        WDContexte a = C0677k.m2777a(f1129z[3], 5, C0657a.ECLAIR.getNumero());
        try {
            C1404d.m9971a(i, C0725i.m3013a(wDObjet, C0782g.CENTISECOND));
        } finally {
            a.m2735v();
        }
    }

    public static synchronized WDObjet animationLitParametre(WDObjet wDObjet, String str) {
        WDObjet wDEntier4;
        synchronized (WDAPIAnimation.class) {
            WDContexte a = C0677k.m2775a(f1129z[4]);
            try {
                wDEntier4 = new WDEntier4(m1574a(wDObjet, 1).getParamAnimationImage(str));
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDEntier4;
    }

    public static final void animationPrepare(WDObjet wDObjet) {
        animationPrepare(wDObjet, -1, -1, -1, -1);
    }

    public static final void animationPrepare(WDObjet wDObjet, int i) {
        animationPrepare(wDObjet, i, 0, 0, 0);
    }

    public static final void animationPrepare(WDObjet wDObjet, int i, int i2) {
        animationPrepare(wDObjet, i, i2, 0, 0);
    }

    public static final void animationPrepare(WDObjet wDObjet, int i, int i2, int i3) {
        animationPrepare(wDObjet, i, i2, i3, 0);
    }

    @C0658b(a = C0657a.ECLAIR)
    public static final void animationPrepare(WDObjet wDObjet, int i, int i2, int i3, int i4) {
        WDContexte a = C0677k.m2777a(f1129z[1], 5, C0657a.ECLAIR.getNumero());
        try {
            C1404d.m9973a(m1573a(wDObjet, 1, gc.class), i, i2, i3, i4);
        } finally {
            a.m2735v();
        }
    }

    /* renamed from: z */
    private static String m1575z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 69;
                    break;
                case 1:
                    i2 = 107;
                    break;
                case 2:
                    i2 = 62;
                    break;
                case 3:
                    i2 = 2;
                    break;
                default:
                    i2 = 104;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1576z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 104);
        }
        return toCharArray;
    }
}
