package fr.pcsoft.wdjava.net.http;

import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.poo.C0736s;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDDateHeure;
import fr.pcsoft.wdjava.jni.WDJNIHelper;

public class WDCookie extends C0736s {
    /* renamed from: c */
    public static final EWDPropriete[] f2752c = new EWDPropriete[]{EWDPropriete.PROP_NOM, EWDPropriete.PROP_VALEUR, EWDPropriete.PROP_DOMAINE, EWDPropriete.PROP_CHEMIN, EWDPropriete.PROP_EXPIRATION};
    /* renamed from: z */
    private static final String[] f2753z = new String[]{m7049z(m7050z("\u0004\u0010fhku\tqs~x\tzs~u\u0004}s~")), m7049z(m7050z("\u0004\b`skx\u0001bfud\u0005ybus"))};

    public WDCookie(long j) {
        super(j);
    }

    /* renamed from: z */
    private static String m7049z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 39;
                    break;
                case 1:
                    i2 = 64;
                    break;
                case 2:
                    i2 = 52;
                    break;
                case 3:
                    i2 = 39;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7050z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 59);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected int mo3256a() {
        return 10;
    }

    /* renamed from: a */
    protected int mo3257a(EWDPropriete eWDPropriete) {
        switch (C0987k.f2803a[eWDPropriete.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            default:
                WDErreurManager.m2883a(C0745b.m3222b(f2753z[0], new String[0]));
                return 0;
        }
    }

    /* renamed from: b */
    protected int mo3258b() {
        return 14;
    }

    public String getNomType() {
        return C0745b.m3220a(f2753z[1], new String[0]);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        try {
            switch (C0987k.f2803a[eWDPropriete.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return new WDChaine(WDJNIHelper.m6707e(this.b, mo3257a(eWDPropriete)));
                case 5:
                    return new WDDateHeure(WDJNIHelper.m6707e(this.b, mo3257a(eWDPropriete)));
                default:
                    WDErreurManager.m2883a(C0745b.m3222b(f2753z[0], new String[0]));
                    return null;
            }
        } catch (C0539d e) {
            WDErreurManager.m2875a(e);
            return null;
        }
        WDErreurManager.m2875a(e);
        return null;
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f2752c;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return 2048;
    }

    public void release() {
        super.release();
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0987k.f2803a[eWDPropriete.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                setPropString(eWDPropriete, wDObjet.getString());
                return;
            default:
                WDErreurManager.m2883a(C0745b.m3222b(f2753z[0], new String[0]));
                return;
        }
    }
}
