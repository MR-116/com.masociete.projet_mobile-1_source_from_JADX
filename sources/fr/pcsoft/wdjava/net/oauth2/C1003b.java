package fr.pcsoft.wdjava.net.oauth2;

import fr.pcsoft.wdjava.core.EWDPropriete;

/* renamed from: fr.pcsoft.wdjava.net.oauth2.b */
/* synthetic */ class C1003b {
    /* renamed from: a */
    static final int[] f2906a = new int[EWDPropriete.values().length];

    static {
        try {
            f2906a[EWDPropriete.PROP_CLIENTID.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f2906a[EWDPropriete.PROP_CLIENTSECRET.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f2906a[EWDPropriete.PROP_PARAMETRESSUPPLEMENTAIRES.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f2906a[EWDPropriete.PROP_SCOPE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f2906a[EWDPropriete.PROP_URLAUTH.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f2906a[EWDPropriete.PROP_URLTOKEN.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f2906a[EWDPropriete.PROP_URLREDIRECTION.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
        }
    }
}
