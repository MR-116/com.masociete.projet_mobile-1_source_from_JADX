package fr.pcsoft.wdjava.api;

import android.location.Address;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDReel;
import fr.pcsoft.wdjava.core.types.collection.tableau.C0758k;
import fr.pcsoft.wdjava.geo.C0915d;
import fr.pcsoft.wdjava.geo.C0918i;
import fr.pcsoft.wdjava.geo.WDAdresse;
import fr.pcsoft.wdjava.geo.WDGeoPosition;
import java.util.List;

public class WDAPIGeo {
    /* renamed from: z */
    private static final String[] f1156z = new String[]{m1626z(m1627z("\t\\\u000e~ooM\u0012yvd@\b}ieL\u0012y{fZ")), m1626z(m1627z("\tX\u0004ieL\bdpeQ")), m1626z(m1627z("\tZ\u0013b|M\u001e`xyL\u0000w|uO\u0000bxg")), m1626z(m1627z("\tX\u0004ff^\u000fs|u^\u0011`uc")), m1626z(m1627z("\tX\u0004fxZ\u0002eioM\u0004oxnM\u0004cjo")), m1626z(m1627z("\tX\u0004fkE\b}l~")), m1626z(m1627z("\tX\u0004fnV\u0012dxd\\\u0004")), m1626z(m1627z("\t[\u0004spg^\roooM\u0012ojoG\u0000w|yV\fqu")), m1626z(m1627z("\tL\u0004hxmZ\u0012ytkS\u001ef|xL\u001et|iV\fqu"))};

    /* renamed from: a */
    private static final WDGeoPosition m1625a(WDObjet wDObjet, int i) {
        WDGeoPosition wDGeoPosition = wDObjet != null ? (WDGeoPosition) wDObjet.checkType(WDGeoPosition.class) : null;
        if (wDGeoPosition == null) {
            String[] strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1156z[2], String.valueOf(i));
            String str = f1156z[0];
            String[] strArr2 = new String[2];
            strArr2[0] = wDObjet != null ? wDObjet.getNomType() : "";
            strArr2[1] = C0745b.m3220a(f1156z[1], new String[0]);
            strArr[1] = C0745b.m3222b(str, strArr2);
            WDErreurManager.m2886a(strArr);
        }
        return wDGeoPosition;
    }

    public static final WDObjet decimalVersSexagesimal(double d) {
        WDContexte a = C0677k.m2778a(f1156z[7], false);
        try {
            WDObjet wDChaine = new WDChaine(C0915d.m6519a(d));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDReel geoAzimut(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2775a(f1156z[5]);
        try {
            WDReel wDReel = new WDReel(m1625a(wDObjet, 1).m6470a(m1625a(wDObjet2, 2)));
            return wDReel;
        } finally {
            a.m2735v();
        }
    }

    public static WDReel geoDistance(WDObjet wDObjet, WDObjet wDObjet2) {
        return geoDistance(wDObjet, wDObjet2, 1);
    }

    public static WDReel geoDistance(WDObjet wDObjet, WDObjet wDObjet2, int i) {
        WDContexte a = C0677k.m2775a(f1156z[6]);
        try {
            WDReel wDReel = new WDReel(m1625a(wDObjet, 1).m6471a(m1625a(wDObjet2, 2), i));
            return wDReel;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen geoLanceAppli(WDObjet wDObjet) {
        return geoLanceAppli(wDObjet, 23, 1);
    }

    public static final WDBooleen geoLanceAppli(WDObjet wDObjet, int i, int i2) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2778a(f1156z[3], true);
        try {
            C0915d.m6522a(m1625a(wDObjet, 1), i, i2);
            wDBooleen = new WDBooleen(true);
        } catch (C0918i e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDBooleen = new WDBooleen(false);
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static final WDBooleen geoLanceAppli(WDObjet wDObjet, WDObjet wDObjet2) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2778a(f1156z[3], true);
        try {
            WDGeoPosition a2 = m1625a(wDObjet, 1);
            WDGeoPosition wDGeoPosition = (WDGeoPosition) wDObjet2.checkType(WDGeoPosition.class);
            if (wDGeoPosition != null) {
                C0915d.m6523a(a2, wDGeoPosition);
            } else if (wDObjet2.getValeur().isNumerique()) {
                C0915d.m6522a(a2, wDObjet2.getInt(), 1);
            } else {
                C0915d.m6524a(a2, wDObjet2.getString());
            }
            wDBooleen = new WDBooleen(true);
            a.m2735v();
        } catch (C0918i e) {
            throw e;
        } catch (C0918i e2) {
            try {
                WDErreurManager.m2879a(a, e2.getMessage(), e2.m1561f());
                wDBooleen = new WDBooleen(false);
            } finally {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static final WDBooleen geoRecupereAdresse(String str, WDObjet wDObjet) {
        return geoRecupereAdresse(str, wDObjet, 10);
    }

    public static final WDBooleen geoRecupereAdresse(String str, WDObjet wDObjet, int i) {
        WDBooleen wDBooleen;
        WDContexte a = C0677k.m2778a(f1156z[4], true);
        try {
            List<Address> b = C0915d.m6525b(str, i);
            if (wDObjet instanceof C0758k) {
                ((C0758k) wDObjet).mo2480e();
                for (Address wDAdresse : b) {
                    ((C0758k) wDObjet).mo2475b(new WDAdresse(wDAdresse));
                }
            }
            wDBooleen = new WDBooleen(true);
            a.m2735v();
        } catch (C0918i e) {
            throw e;
        } catch (C0918i e2) {
            try {
                WDErreurManager.m2879a(a, e2.getMessage(), e2.m1561f());
                wDBooleen = new WDBooleen(false);
            } finally {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static final WDAdresse geoRecupereAdresse(String str) {
        WDAdresse wDAdresse;
        WDContexte a = C0677k.m2778a(f1156z[4], true);
        try {
            wDAdresse = new WDAdresse(C0915d.m6518a(str));
        } catch (C0918i e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            wDAdresse = new WDAdresse();
        } finally {
            a.m2735v();
        }
        return wDAdresse;
    }

    public static final WDObjet sexagesimalVersDecimal(String str) {
        WDObjet wDChaine;
        WDContexte a = C0677k.m2778a(f1156z[8], false);
        try {
            wDChaine = new WDChaine(C0915d.m6527c(str));
        } catch (Throwable e) {
            Throwable th = e;
            WDErreurManager.m2888b(th);
            wDChaine = new WDChaine(th.mo3217c());
        } finally {
            a.m2735v();
        }
        return wDChaine;
    }

    /* renamed from: z */
    private static String m1626z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 42;
                    break;
                case 1:
                    i2 = 31;
                    break;
                case 2:
                    i2 = 65;
                    break;
                case 3:
                    i2 = 48;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1627z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 57);
        }
        return toCharArray;
    }
}
