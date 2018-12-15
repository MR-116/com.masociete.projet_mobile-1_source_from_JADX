package fr.pcsoft.wdjava.net.http;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.poo.C0736s;
import fr.pcsoft.wdjava.core.poo.C0738u;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0782g;
import fr.pcsoft.wdjava.core.types.WDBuffer;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.jni.WDJNIHelper;
import fr.pcsoft.wdjava.net.oauth2.WDAuthToken;

public class WDHTTPRequete extends C0736s {
    /* renamed from: e */
    public static final EWDPropriete[] f2767e = new EWDPropriete[]{EWDPropriete.PROP_URL, EWDPropriete.PROP_AGENTUTILISATEUR, EWDPropriete.PROP_CONTENU, EWDPropriete.PROP_CONTENTTYPE, EWDPropriete.PROP_UTILISATEUR, EWDPropriete.PROP_MOTDEPASSE, EWDPropriete.PROP_METHODE, EWDPropriete.PROP_IGNOREERREUR, EWDPropriete.PROP_DUREENONREPONSE, EWDPropriete.PROP_AVANCEMENTTELECHARGEMENT, EWDPropriete.PROP_AVANCEMENTENVOI, EWDPropriete.PROP_TIMEOUTCONNEXION, EWDPropriete.PROP_ENTETE};
    /* renamed from: z */
    private static final String[] f2768z = new String[]{m7086z(m7087z("iT-is\u0018M:rf\u0015M1rf\u0018@6rf")), m7086z(m7087z("iG0hu\u000fV,ol\u0004[6ks\u0005W,oa\u0006A")), m7086z(m7087z("iE*rk\u001eK4cm")), m7086z(m7087z("iE9`f\tP>rj\u0005J on\u001aK,uj\bH:")), m7086z(m7087z("iL+rs\u0015E)gm\tA2cm\u001e")), m7086z(m7087z("iL+rs\u0015V:wv\u000fP:")), m7086z(m7087z("ow_\u0003P")), m7086z(m7087z("\u001e}\u000fC\u0003.q_LF>k\u0011\u0006l\u000bq\u000bN\u0011jm\u0011EL$j\n\b")), m7086z(m7087z("\u000bq\u000bNL8m\u0005GW#k\u0011"))};
    /* renamed from: c */
    private C0738u f2769c = null;
    /* renamed from: d */
    private WDAuthToken f2770d = null;

    public WDHTTPRequete(long j) {
        super(j);
    }

    /* renamed from: a */
    private void m7084a(WDObjet wDObjet) {
        WDAuthToken wDAuthToken = (WDAuthToken) wDObjet.checkType(WDAuthToken.class);
        if (wDAuthToken != null) {
            this.f2770d = wDAuthToken;
            return;
        }
        WDErreurManager.m2883a(C0745b.m3222b(f2768z[1], wDObjet.getNomType(), C0745b.m3220a(f2768z[2], new String[0])));
    }

    /* renamed from: d */
    private C0738u m7085d() {
        if (this.f2769c == null) {
            this.f2769c = new ab(this);
        }
        return this.f2769c;
    }

    /* renamed from: z */
    private static String m7086z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 74;
                    break;
                case 1:
                    i2 = 4;
                    break;
                case 2:
                    i2 = C0607n.bx;
                    break;
                case 3:
                    i2 = 38;
                    break;
                default:
                    i2 = 35;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7087z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 35);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected int mo3256a() {
        return 10;
    }

    /* renamed from: a */
    protected int mo3257a(EWDPropriete eWDPropriete) {
        switch (C0992q.f2841a[eWDPropriete.ordinal()]) {
            case 1:
            case 13:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            default:
                WDErreurManager.m2883a(C0745b.m3222b(f2768z[0], new String[0]));
                return 0;
        }
    }

    /* renamed from: b */
    protected int mo3258b() {
        return 30;
    }

    /* renamed from: e */
    public WDAuthToken m7091e() {
        if (this.f2770d == null) {
            this.f2770d = new WDAuthToken();
        }
        return this.f2770d;
    }

    /* renamed from: f */
    public final void m7092f() {
        if (this.f2770d != null && this.f2770d.m7255b()) {
            String d = this.f2770d.m7253a().m7288d();
            C0691a.m2860a(C0808l.m4053k(d), f2768z[7]);
            if (!C0808l.m4053k(d)) {
                d = Character.toUpperCase(d.charAt(0)) + d.substring(1);
            }
            m7085d().get(f2768z[8]).setValeur(String.format(f2768z[6], new Object[]{d, r1.m7291f()}));
        }
    }

    /* renamed from: g */
    public final boolean m7093g() {
        return this.f2770d != null;
    }

    public String getNomType() {
        return C0745b.m3220a(f2768z[5], new String[0]);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        try {
            switch (C0992q.f2841a[eWDPropriete.ordinal()]) {
                case 1:
                case 2:
                case 4:
                case 5:
                case 6:
                    return new WDChaine(WDJNIHelper.m6707e(this.b, mo3257a(eWDPropriete)));
                case 3:
                    return new WDBuffer(WDJNIHelper.m6717f(this.b, mo3257a(eWDPropriete)));
                case 7:
                case 8:
                case 9:
                case 12:
                    return new WDEntier4(WDJNIHelper.m6724h(this.b, mo3257a(eWDPropriete)));
                case 10:
                case 11:
                    return new WDHTTPAvancement(WDJNIHelper.m6567a(this.b, mo3257a(eWDPropriete)));
                case 13:
                    return m7085d();
                case 14:
                    return m7091e();
                default:
                    WDErreurManager.m2883a(C0745b.m3222b(f2768z[0], new String[0]));
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
        return f2767e;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.ix;
    }

    public void release() {
        super.release();
        if (this.f2769c != null) {
            this.f2769c.release();
            this.f2769c = null;
        }
        this.f2770d = null;
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0992q.f2841a[eWDPropriete.ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                setPropString(eWDPropriete, wDObjet.getString());
                return;
            case 3:
                mo2611a(eWDPropriete, wDObjet.getDonneeBinaire());
                return;
            case 7:
            case 8:
            case 12:
                setPropInt(eWDPropriete, wDObjet.getInt());
                return;
            case 9:
                setPropInt(eWDPropriete, C0725i.m3013a(wDObjet, C0782g.MILLISECOND));
                return;
            case 10:
            case 11:
                WDHTTPAvancement wDHTTPAvancement = (WDHTTPAvancement) wDObjet.checkType(WDHTTPAvancement.class);
                if (wDHTTPAvancement != null) {
                    m3142a(eWDPropriete, (C0736s) wDHTTPAvancement);
                    return;
                }
                WDErreurManager.m2883a(C0745b.m3222b(f2768z[1], wDObjet.getNomType(), C0745b.m3220a(f2768z[4], new String[0])));
                return;
            case 13:
                WDErreurManager.m2883a(C0745b.m3222b(f2768z[3], new String[0]));
                return;
            case 14:
                m7084a(wDObjet);
                return;
            default:
                WDErreurManager.m2883a(C0745b.m3222b(f2768z[0], new String[0]));
                return;
        }
    }
}
