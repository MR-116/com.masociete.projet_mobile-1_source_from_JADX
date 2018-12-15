package fr.pcsoft.wdjava.net.http;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.poo.C0736s;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.jni.WDJNIHelper;
import fr.pcsoft.wdjava.jni.WDJaugeJNI;

public class WDHTTPAvancement extends C0736s {
    /* renamed from: c */
    public static final EWDPropriete[] f2754c = new EWDPropriete[]{EWDPropriete.PROP_JAUGE, EWDPropriete.PROP_FREQUENCE, EWDPropriete.PROP_PROCEDURE};
    /* renamed from: z */
    private static final String[] f2755z = new String[]{m7056z(m7057z("(\bIi$Y\u0011^r1T\u0011Ur1Y\u001cRr1")), m7056z(m7057z("(\u0010Or$T\u0019Mg:H\u001dVc:_"))};

    public WDHTTPAvancement(long j) {
        super(j);
    }

    /* renamed from: z */
    private static String m7056z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 11;
                    break;
                case 1:
                    i2 = 88;
                    break;
                case 2:
                    i2 = 27;
                    break;
                case 3:
                    i2 = 38;
                    break;
                default:
                    i2 = 116;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7057z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 116);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected int mo3256a() {
        return 10;
    }

    /* renamed from: a */
    protected int mo3257a(EWDPropriete eWDPropriete) {
        switch (C0998w.f2851a[eWDPropriete.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            default:
                WDErreurManager.m2883a(C0745b.m3222b(f2755z[0], new String[0]));
                return 0;
        }
    }

    /* renamed from: b */
    protected int mo3258b() {
        return 32;
    }

    public String getNomType() {
        return C0745b.m3220a(f2755z[1], new String[0]);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        try {
            switch (C0998w.f2851a[eWDPropriete.ordinal()]) {
                case 2:
                    return new WDEntier4(WDJNIHelper.m6724h(this.b, mo3257a(eWDPropriete)));
                case 3:
                    try {
                        WDCallback c = WDJNIHelper.m6678c(this.b, mo3257a(eWDPropriete));
                        return new WDChaine(c != null ? c.m2259a() : "");
                    } catch (Throwable e) {
                        WDErreurManager.m2888b(e);
                        return null;
                    }
                default:
                    WDErreurManager.m2883a(C0745b.m3222b(f2755z[0], new String[0]));
                    return null;
            }
        } catch (C0539d e2) {
            WDErreurManager.m2875a(e2);
            return null;
        }
        WDErreurManager.m2875a(e2);
        return null;
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f2754c;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.fs;
    }

    public void release() {
        super.release();
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0998w.f2851a[eWDPropriete.ordinal()]) {
            case 1:
                try {
                    WDJNIHelper.m6597a(this.b, mo3257a(eWDPropriete), WDJaugeJNI.create(wDObjet));
                    return;
                } catch (Throwable e) {
                    WDErreurManager.m2888b(e);
                    return;
                }
            case 2:
                setPropInt(eWDPropriete, wDObjet.getInt());
                return;
            case 3:
                try {
                    WDJNIHelper.m6596a(this.b, mo3257a(eWDPropriete), WDCallback.m2239a((C0486m) wDObjet, -1, true));
                    return;
                } catch (Throwable e2) {
                    WDErreurManager.m2888b(e2);
                    return;
                }
            default:
                WDErreurManager.m2883a(C0745b.m3222b(f2755z[0], new String[0]));
                return;
        }
    }

    protected void setPropString(EWDPropriete eWDPropriete, String str) {
        switch (C0998w.f2851a[eWDPropriete.ordinal()]) {
            case 1:
            case 3:
                setProp(eWDPropriete, new WDChaine(str));
                return;
            default:
                super.setPropString(eWDPropriete, str);
                return;
        }
    }
}
