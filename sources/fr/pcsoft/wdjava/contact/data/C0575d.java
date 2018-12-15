package fr.pcsoft.wdjava.contact.data;

import fr.pcsoft.wdjava.core.EWDPropriete;

/* renamed from: fr.pcsoft.wdjava.contact.data.d */
/* synthetic */ class C0575d {
    /* renamed from: a */
    static final int[] f1358a = new int[EWDPropriete.values().length];

    static {
        try {
            f1358a[EWDPropriete.PROP_ADRESSE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f1358a[EWDPropriete.PROP_PROTOCOLE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
    }
}
