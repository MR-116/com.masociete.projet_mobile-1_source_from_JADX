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
import fr.pcsoft.wdjava.core.types.C0782g;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.media.ib;
import fr.pcsoft.wdjava.ui.champs.multimedia.WDChampMultimedia;
import fr.pcsoft.wdjava.ui.utils.C1502a;

public class WDAPIMediaPlayer {
    /* renamed from: a */
    private static final int f1216a = 5;
    /* renamed from: z */
    private static final String[] f1217z = new String[]{m1652z(m1653z("z.#FU\u0010.3NH\u0018<:KS\u001e&#X")), m1652z(m1653z("z.#FU\u0010.3NH\u0018<5EO\r19FD\u00065?YH\u001b/3")), m1652z(m1653z("z.#FU\u0010.3NH\u0018<2_S\u001c&")), m1652z(m1653z("z.#FU\u0010.3NH\u0018<&ER\u00107?EO")), m1652z(m1653z("z&$XD\f1)Z@\n07MD\u000637X@\u0014")), m1652z(m1653z("z.#FU\u0010.3NH\u0018<0CO")), m1652z(m1653z("z.#FU\u0010.3NH\u0018< EM\f.3")), m1652z(m1653z("z.#FU\u0010.3NH\u0018<9_W\u000b&")), m1652z(m1653z("z.#FU\u0010.3NH\u0018<2OC\f7")), m1652z(m1653z("z.#FU\u0010.3NH\u0018<3^@\r")), m1652z(m1653z("z.#FU\u0010.3NH\u0018<&KT\n&")), m1652z(m1653z("z.#FU\u0010.3NH\u0018<<ET\u001c")), m1652z(m1653z("z.#FU\u0010.3NH\u0018<0OS\u0014&")), m1652z(m1653z("z.#FU\u0010.3NH\u0018<>KT\r&#X")), m1652z(m1653z("z.#FU\u0010.3NH\u0018<7XS\u001c7"))};

    /* renamed from: a */
    protected static final WDChampMultimedia m1651a(WDObjet wDObjet, int i) {
        String[] strArr;
        try {
            return (WDChampMultimedia) C1502a.m10417a(wDObjet, WDChampMultimedia.class);
        } catch (C0666h e) {
            strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1217z[4], String.valueOf(i));
            strArr[1] = e.getMessage();
            WDErreurManager.m2886a(strArr);
            return null;
        } catch (C0663e e2) {
            strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1217z[4], String.valueOf(i));
            strArr[1] = e2.m2671a(C0607n.Ok);
            WDErreurManager.m2886a(strArr);
            return null;
        }
    }

    public static final WDBooleen multimediaArret(WDObjet wDObjet) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1217z[14], 5);
        try {
            m1651a(wDObjet, 1).arreter();
            wDBooleen = new WDBooleen(true);
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static WDBooleen multimediaControleVisible(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1217z[1], 5);
        try {
            WDBooleen wDBooleen = new WDBooleen(m1651a(wDObjet, 1).isControleVisible());
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen multimediaControleVisible(WDObjet wDObjet, boolean z) {
        return multimediaControleVisible(wDObjet, z, new WDEntier4(3));
    }

    public static WDBooleen multimediaControleVisible(WDObjet wDObjet, boolean z, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2776a(f1217z[1], 5);
        try {
            WDBooleen wDBooleen = new WDBooleen(m1651a(wDObjet, 1).setControleVisible(z, C0725i.m3013a(wDObjet2, C0782g.SECOND)));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen multimediaDebut(WDObjet wDObjet) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1217z[8], 5);
        try {
            m1651a(wDObjet, 1).setPositionLectureDebut();
            wDBooleen = new WDBooleen(true);
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final WDEntier4 multimediaDuree(WDObjet wDObjet) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2776a(f1217z[2], 5);
        try {
            wDEntier4 = new WDEntier4(m1651a(wDObjet, 1).getDureeLecture());
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier4 = new WDEntier4(0);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static final WDEntier4 multimediaEtat(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1217z[9], 5);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(m1651a(wDObjet, 1).getEtatLecture());
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen multimediaFerme(WDObjet wDObjet) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1217z[12], 5);
        try {
            m1651a(wDObjet, 1).arreter();
            wDBooleen = new WDBooleen(true);
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final WDBooleen multimediaFin(WDObjet wDObjet) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1217z[5], 5);
        try {
            m1651a(wDObjet, 1).setPositionLectureFin();
            wDBooleen = new WDBooleen(true);
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final WDEntier4 multimediaHauteur(WDObjet wDObjet) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2776a(f1217z[13], 5);
        try {
            wDEntier4 = new WDEntier4(m1651a(wDObjet, 1).getHauteurVideo());
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier4 = new WDEntier4(0);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static final WDBooleen multimediaJoue(WDObjet wDObjet) {
        return multimediaJoue(wDObjet, null, 0);
    }

    public static final WDBooleen multimediaJoue(WDObjet wDObjet, String str) {
        return multimediaJoue(wDObjet, str, 0);
    }

    public static final WDBooleen multimediaJoue(WDObjet wDObjet, String str, int i) {
        WDBooleen wDBooleen;
        boolean z = true;
        WDContexte a = C0677k.m2776a(f1217z[11], 5);
        try {
            WDChampMultimedia a2 = m1651a(wDObjet, 1);
            if ((i & 1) != 1) {
                z = false;
            }
            a2.lire(str, z);
            wDBooleen = new WDBooleen(true);
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final WDEntier4 multimediaLargeur(WDObjet wDObjet) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2776a(f1217z[0], 5);
        try {
            wDEntier4 = new WDEntier4(m1651a(wDObjet, 1).getLargeurVideo());
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier4 = new WDEntier4(0);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static final WDBooleen multimediaOuvre(WDObjet wDObjet, String str) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1217z[7], 5);
        try {
            m1651a(wDObjet, 1).charger(str, false, false);
            wDBooleen = new WDBooleen(true);
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final WDBooleen multimediaPause(WDObjet wDObjet) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1217z[10], 5);
        try {
            m1651a(wDObjet, 1).interrompre();
            wDBooleen = new WDBooleen(true);
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final WDBooleen multimediaPosition(WDObjet wDObjet, int i) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2776a(f1217z[3], 5);
        try {
            m1651a(wDObjet, 1).setPositionLecture(i);
            wDBooleen = new WDBooleen(true);
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final WDEntier4 multimediaPosition(WDObjet wDObjet) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2776a(f1217z[3], 5);
        try {
            wDEntier4 = new WDEntier4(m1651a(wDObjet, 1).getPositionLecture());
        } catch (ib e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDEntier4 = new WDEntier4(0);
        } finally {
            a.m2735v();
        }
        return wDEntier4;
    }

    public static final WDEntier4 multimediaVolume(WDObjet wDObjet) {
        WDContexte a = C0677k.m2776a(f1217z[6], 5);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(m1651a(wDObjet, 1).getVolume());
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final WDEntier4 multimediaVolume(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2776a(f1217z[6], 5);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(m1651a(wDObjet, 1).setVolume(i));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    /* renamed from: z */
    private static String m1652z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 89;
                    break;
                case 1:
                    i2 = 99;
                    break;
                case 2:
                    i2 = 118;
                    break;
                case 3:
                    i2 = 10;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1653z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 1);
        }
        return toCharArray;
    }
}
