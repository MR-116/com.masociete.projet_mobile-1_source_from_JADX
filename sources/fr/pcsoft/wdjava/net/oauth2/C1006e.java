package fr.pcsoft.wdjava.net.oauth2;

import fr.pcsoft.wdjava.core.EWDPropriete;

/* renamed from: fr.pcsoft.wdjava.net.oauth2.e */
/* synthetic */ class C1006e {
    /* renamed from: a */
    static final int[] f2909a = new int[EWDPropriete.values().length];

    static {
        try {
            f2909a[EWDPropriete.PROP_VALIDE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f2909a[EWDPropriete.PROP_REPONSESERVEUR.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f2909a[EWDPropriete.PROP_VALEUR.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
    }
}
