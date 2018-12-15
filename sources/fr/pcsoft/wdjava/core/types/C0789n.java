package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.EWDPropriete;

/* renamed from: fr.pcsoft.wdjava.core.types.n */
/* synthetic */ class C0789n {
    /* renamed from: a */
    static final int[] f2026a = new int[EWDPropriete.values().length];

    static {
        try {
            f2026a[EWDPropriete.PROP_HEURE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f2026a[EWDPropriete.PROP_MINUTE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f2026a[EWDPropriete.PROP_SECONDE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f2026a[EWDPropriete.PROP_MILLISECONDE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
    }
}
