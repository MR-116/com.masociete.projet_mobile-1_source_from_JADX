package fr.pcsoft.wdjava.api;

import android.os.Build;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.WDEntier8;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.file.C0901s;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.utils.C1511l;

public class WDAPISys extends WDAPISys_Commun {
    /* renamed from: z */
    private static final String[] f1228z = new String[]{m1670z(m1671z("bR7o\u001d\u000eS'y\f\u0015@:u\r\u000f^+\u0010\u0000O")), m1670z(m1671z("bR7o\u001d\u0013D>c\u0001\u0000S:y\u001d\u0012U!\t\u0000F+")), m1670z(m1671z("bR7o\u001d\u000fT#c\u0011\u0004S'y")), m1670z(m1671z("bR7o\u001d\u0004R>}\u0001\u0004")), m1670z(m1671z("bR7o\u001d\bL+u"))};

    public static final WDObjet sysEspace(int i) {
        WDObjet wDEntier4;
        WDContexte a = C0677k.m2775a(f1228z[3]);
        try {
            long a2 = kb.m3959a(i);
            wDEntier4 = a2 <= 2147483647L ? new WDEntier4(a2) : new WDEntier8(a2);
            a.m2735v();
        } catch (C0901s e) {
            throw e;
        } catch (Throwable e2) {
            Throwable th = e2;
            try {
                WDErreurManager.m2888b(th);
                wDEntier4 = new WDEntier4(th.mo3215a());
            } finally {
                a.m2735v();
            }
        }
        return wDEntier4;
    }

    public static final WDEntier4 sysEtatCarteStockage() {
        return new WDEntier4(kb.m3985o());
    }

    public static final WDChaine sysIMEI(String str) {
        WDChaine wDChaine;
        WDContexte a = C0677k.m2775a(f1228z[4]);
        try {
            wDChaine = new WDChaine(kb.m3988r());
        } catch (C0539d e) {
            C0539d c0539d = e;
            WDErreurManager.m2876a(a, c0539d);
            wDChaine = new WDChaine(c0539d.mo3217c());
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static final WDChaine sysIdentifiant() {
        return new WDChaine(kb.m3977g());
    }

    public static final WDObjet sysInfoAppareil() {
        return sysInfoAppareil(1);
    }

    public static final WDObjet sysInfoAppareil(int i) {
        String str = "";
        if (i == 1) {
            str = Build.MODEL;
        } else if (i == 2) {
            str = Build.MANUFACTURER;
        }
        return new WDChaine(str);
    }

    public static final WDChaine sysNumSerie() {
        WDChaine wDChaine;
        WDContexte a = C0677k.m2775a(f1228z[2]);
        try {
            wDChaine = new WDChaine(kb.m3988r());
        } catch (C0539d e) {
            C0539d c0539d = e;
            WDErreurManager.m2876a(a, c0539d);
            wDChaine = new WDChaine(c0539d.mo3217c());
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static final WDEntier4 sysOrientationEcran() {
        WDContexte a = C0677k.m2775a(f1228z[0]);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(C1511l.m10519a(C1056i.m7562a()));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final WDEntier4 sysOrientationEcran(int i) {
        WDContexte a = C0677k.m2775a(f1228z[0]);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(C1511l.m10520a(C1056i.m7562a(), i));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final WDChaine sysRepCarteStockage() {
        WDChaine wDChaine;
        WDContexte a = C0677k.m2775a(f1228z[1]);
        try {
            wDChaine = new WDChaine(kb.m3975e().getPath());
        } catch (Throwable e) {
            Throwable th = e;
            WDErreurManager.m2888b(th);
            wDChaine = new WDChaine(th.mo3217c());
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    public static final WDObjet sysVersionAndroid() {
        return sysVersionAndroid(3);
    }

    public static final WDObjet sysVersionAndroid(int i) {
        switch (i) {
            case 1:
                return new WDChaine(kb.m3987q());
            case 3:
                return new WDChaine(kb.m3973d());
            case 6:
                return new WDChaine(kb.m3986p());
            default:
                return new WDChaine();
        }
    }

    public static WDEntier4 sysXRes() {
        return new WDEntier4((double) C1511l.m10514a((float) C1014a.m7327b().mo3295a(true).x, 1));
    }

    public static WDEntier4 sysYRes() {
        return new WDEntier4((double) C1511l.m10514a((float) C1014a.m7327b().mo3295a(true).y, 1));
    }

    /* renamed from: z */
    private static String m1670z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 65;
                    break;
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 110;
                    break;
                case 3:
                    i2 = 60;
                    break;
                default:
                    i2 = 66;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1671z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 66);
        }
        return toCharArray;
    }
}
