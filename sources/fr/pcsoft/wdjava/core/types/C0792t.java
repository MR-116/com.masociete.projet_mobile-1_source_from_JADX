package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.EWDPropriete;

/* renamed from: fr.pcsoft.wdjava.core.types.t */
/* synthetic */ class C0792t {
    /* renamed from: a */
    static final int[] f2027a = new int[EWDPropriete.values().length];

    static {
        try {
            f2027a[EWDPropriete.PROP_ANNEE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f2027a[EWDPropriete.PROP_MOIS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f2027a[EWDPropriete.PROP_JOUR.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
    }
}
