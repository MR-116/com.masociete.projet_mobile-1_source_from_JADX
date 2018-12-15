package fr.pcsoft.wdjava.net.oauth2;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.poo.C0560r;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDBuffer;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.net.oauth2.WDOAuth2Manager.OAuth2Token;

public class WDAuthToken extends C0560r {
    /* renamed from: c */
    public static final EWDPropriete[] f2855c = new EWDPropriete[]{EWDPropriete.PROP_VALIDE, EWDPropriete.PROP_VALEUR, EWDPropriete.PROP_REPONSESERVEUR};
    /* renamed from: z */
    private static final String[] f2856z = new String[]{m7251z(m7252z("\u001c}]g\u0014ksCv\u0012")), m7251z(m7252z("\u001clZ|\fmuMg\u0019`pMp\bjnMl\u000fziDv"))};
    /* renamed from: b */
    private OAuth2Token f2857b;

    public WDAuthToken(OAuth2Token oAuth2Token) {
        this.f2857b = oAuth2Token;
    }

    /* renamed from: z */
    private static String m7251z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 63;
                    break;
                case 1:
                    i2 = 60;
                    break;
                case 2:
                    i2 = 8;
                    break;
                case 3:
                    i2 = 51;
                    break;
                default:
                    i2 = 92;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7252z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 92);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final OAuth2Token m7253a() {
        return this.f2857b;
    }

    /* renamed from: a */
    public final void m7254a(OAuth2Token oAuth2Token) {
        this.f2857b = oAuth2Token;
    }

    /* renamed from: b */
    public final boolean m7255b() {
        return (this.f2857b == null || C0808l.m4053k(this.f2857b.m7291f())) ? false : true;
    }

    public WDObjet getClone() {
        WDAuthToken wDAuthToken = (WDAuthToken) super.getClone();
        if (this.f2857b != null) {
            wDAuthToken.f2857b = new OAuth2Token(this.f2857b);
        }
        return wDAuthToken;
    }

    public String getNomType() {
        return C0745b.m3220a(f2856z[0], new String[0]);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        String str = null;
        switch (C1006e.f2909a[eWDPropriete.ordinal()]) {
            case 1:
                return new WDBooleen(m7255b());
            case 2:
                byte[] i;
                if (this.f2857b != null) {
                    i = this.f2857b.m7294i();
                }
                return new WDBuffer(i);
            case 3:
                if (this.f2857b != null) {
                    str = this.f2857b.m7291f();
                }
                return new WDChaine(str);
            default:
                return super.getProp(eWDPropriete);
        }
    }

    public WDObjet getValeur() {
        return this.f2857b != null ? new WDChaine(this.f2857b.m7291f()) : new WDChaine();
    }

    public boolean isEvaluable() {
        return false;
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f2855c;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.Qk;
    }

    public void razVariable() {
        this.f2857b = null;
    }

    public void release() {
        if (this.f2857b != null) {
            this.f2857b.m7290e();
            this.f2857b = null;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C1006e.f2909a[eWDPropriete.ordinal()]) {
            case 1:
            case 2:
                WDErreurManager.m2883a(C0745b.m3222b(f2856z[1], eWDPropriete.getNom()));
                return;
            case 3:
                setValeur(wDObjet);
                return;
            default:
                super.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        WDAuthToken wDAuthToken = (WDAuthToken) wDObjet.checkType(WDAuthToken.class);
        if (wDAuthToken != null) {
            OAuth2Token a = wDAuthToken.m7253a();
            this.f2857b = a != null ? new OAuth2Token(a) : null;
        } else if (this.f2857b != null) {
            this.f2857b.m7289d(wDObjet.getString());
        }
    }
}
