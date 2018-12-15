package fr.pcsoft.wdjava.net.oauth2;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.poo.C0560r;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.net.oauth2.WDOAuth2Manager.OAuth2Parameters;

public class WDOAuth2Parametres extends C0560r {
    /* renamed from: b */
    public static final EWDPropriete[] f2902b = new EWDPropriete[]{EWDPropriete.PROP_CLIENTID, EWDPropriete.PROP_CLIENTSECRET, EWDPropriete.PROP_SCOPE, EWDPropriete.PROP_URLREDIRECTION, EWDPropriete.PROP_URLTOKEN, EWDPropriete.PROP_URLAUTH, EWDPropriete.PROP_PARAMETRESSUPPLEMENTAIRES};
    /* renamed from: z */
    private static final String[] f2903z = new String[]{m7303z(m7304z("\u0006f$9Cm\u001b:<Vwh()Cwl6")), m7303z(m7304z("\u0006g*3Ade 9E"))};
    /* renamed from: c */
    private OAuth2Parameters f2904c = new OAuth2Parameters();

    /* renamed from: z */
    private static String m7303z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 37;
                    break;
                case 1:
                    i2 = 41;
                    break;
                case 2:
                    i2 = 101;
                    break;
                case 3:
                    i2 = 108;
                    break;
                default:
                    i2 = 23;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7304z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 23);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final OAuth2Parameters m7305a() {
        return this.f2904c;
    }

    public WDObjet getClone() {
        WDOAuth2Parametres wDOAuth2Parametres = (WDOAuth2Parametres) super.getClone();
        wDOAuth2Parametres.f2904c = new OAuth2Parameters(this.f2904c);
        return wDOAuth2Parametres;
    }

    public String getNomType() {
        return C0745b.m3220a(f2903z[0], new String[0]);
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        switch (C1003b.f2906a[eWDPropriete.ordinal()]) {
            case 1:
                return new WDChaine(this.f2904c.m7278j());
            case 2:
                return new WDChaine(this.f2904c.m7264c());
            case 3:
                return new WDChaine(this.f2904c.m7274h());
            case 4:
                return new WDChaine(this.f2904c.m7272g());
            case 5:
                return new WDChaine(this.f2904c.m7270f());
            case 6:
                return new WDChaine(this.f2904c.m7266d());
            case 7:
                return new WDChaine(this.f2904c.m7268e());
            default:
                return super.getProp(eWDPropriete);
        }
    }

    public WDObjet getValeur() {
        WDErreurManager.m2883a(C0745b.m3222b(f2903z[1], getNomType()));
        return null;
    }

    public boolean isEvaluable() {
        return false;
    }

    /* renamed from: k */
    public EWDPropriete[] mo2439k() {
        return f2902b;
    }

    /* renamed from: l */
    protected int mo2440l() {
        return C0607n.ko;
    }

    public void razVariable() {
        this.f2904c = new OAuth2Parameters();
    }

    public void release() {
        if (this.f2904c != null) {
            this.f2904c.m7262b();
            this.f2904c = null;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C1003b.f2906a[eWDPropriete.ordinal()]) {
            case 1:
                this.f2904c.m7275h(wDObjet.getString());
                return;
            case 2:
                this.f2904c.m7269e(wDObjet.getString());
                return;
            case 3:
                this.f2904c.m7267d(wDObjet.getString());
                return;
            case 4:
                this.f2904c.m7277i(wDObjet.getString());
                return;
            case 5:
                this.f2904c.m7265c(wDObjet.getString());
                return;
            case 6:
                this.f2904c.m7261a(wDObjet.getString());
                return;
            case 7:
                this.f2904c.m7263b(wDObjet.getString());
                return;
            default:
                super.setProp(eWDPropriete, wDObjet);
                return;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, String str) {
        switch (C1003b.f2906a[eWDPropriete.ordinal()]) {
            case 1:
                this.f2904c.m7275h(str);
                return;
            case 2:
                this.f2904c.m7269e(str);
                return;
            case 3:
                this.f2904c.m7267d(str);
                return;
            case 4:
                this.f2904c.m7277i(str);
                return;
            case 5:
                this.f2904c.m7265c(str);
                return;
            case 6:
                this.f2904c.m7261a(str);
                return;
            case 7:
                this.f2904c.m7263b(str);
                return;
            default:
                super.setProp(eWDPropriete, str);
                return;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        WDOAuth2Parametres wDOAuth2Parametres = (WDOAuth2Parametres) wDObjet.checkType(WDOAuth2Parametres.class);
        if (wDOAuth2Parametres != null) {
            this.f2904c = new OAuth2Parameters(wDOAuth2Parametres.m7305a());
        } else {
            super.setValeur(wDObjet);
        }
    }
}
