package fr.pcsoft.wdjava.net.http;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.poo.C0736s;
import fr.pcsoft.wdjava.core.poo.C0738u;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBuffer;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.jni.WDJNIHelper;

public class WDHTTPReponse extends C0736s {
    /* renamed from: d */
    public static final EWDPropriete[] f2764d = new EWDPropriete[]{EWDPropriete.PROP_CONTENU, EWDPropriete.PROP_ENTETEBRUT, EWDPropriete.PROP_CODEETAT, EWDPropriete.PROP_DESCRIPTIONCODEETAT, EWDPropriete.PROP_CONTENTTYPE, EWDPropriete.PROP_ENTETE};
    /* renamed from: z */
    private static final String[] f2765z = new String[]{m7076z(m7077z("\t\b&(\u001ax\u001113\u000fu\u0011:3\u000fx\u001c=3\u000f")), m7076z(m7077z("\t\u00192!\u000fi\f53\u0003e\u0016+.\u0007z\u0017'4\u0003h\u00141")), m7076z(m7077z("\t\u0010 3\u001au\n17\u0005d\u000b1"))};
    /* renamed from: c */
    private C0738u f2766c = null;

    public WDHTTPReponse(long j) {
        super(j);
    }

    /* renamed from: e */
    private WDObjet m7075e() {
        if (this.f2766c == null) {
            this.f2766c = new C1001z(this);
        }
        return this.f2766c;
    }

    /* renamed from: z */
    private static String m7076z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 42;
                    break;
                case 1:
                    i2 = 88;
                    break;
                case 2:
                    i2 = 116;
                    break;
                case 3:
                    i2 = 103;
                    break;
                default:
                    i2 = 74;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7077z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 74);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected int mo3256a() {
        return 10;
    }

    /* renamed from: a */
    protected int mo3257a(EWDPropriete eWDPropriete) {
        switch (C0996u.f2849a[eWDPropriete.ordinal()]) {
            case 1:
            case 6:
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
                WDErreurManager.m2883a(C0745b.m3222b(f2765z[0], new String[0]));
                return 0;
        }
    }

    /* renamed from: b */
    protected int mo3258b() {
        return 31;
    }

    /* renamed from: d */
    public final int m7081d() {
        try {
            return WDJNIHelper.m6724h(this.b, mo3257a(EWDPropriete.PROP_CODEETAT));
        } catch (C0539d e) {
            WDErreurManager.m2875a(e);
            return 0;
        }
    }

    public String getNomType() {
        return C0745b.m3220a(f2765z[2], new String[0]);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        try {
            switch (C0996u.f2849a[eWDPropriete.ordinal()]) {
                case 1:
                    return new WDBuffer(WDJNIHelper.m6717f(this.b, mo3257a(eWDPropriete)));
                case 2:
                case 4:
                case 5:
                    return new WDChaine(WDJNIHelper.m6707e(this.b, mo3257a(eWDPropriete)));
                case 3:
                    return new WDEntier4(m7081d());
                case 6:
                    return m7075e();
                default:
                    WDErreurManager.m2883a(C0745b.m3222b(f2765z[0], new String[0]));
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
        return f2764d;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.qq;
    }

    public void release() {
        super.release();
        if (this.f2766c != null) {
            this.f2766c.release();
            this.f2766c = null;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0996u.f2849a[eWDPropriete.ordinal()]) {
            case 1:
                mo2611a(eWDPropriete, wDObjet.getDonneeBinaire());
                return;
            case 2:
            case 4:
            case 5:
                setPropString(eWDPropriete, wDObjet.getString());
                return;
            case 3:
                setPropInt(eWDPropriete, wDObjet.getInt());
                return;
            case 6:
                WDErreurManager.m2883a(C0745b.m3222b(f2765z[1], new String[0]));
                return;
            default:
                WDErreurManager.m2883a(C0745b.m3222b(f2765z[0], new String[0]));
                return;
        }
    }
}
