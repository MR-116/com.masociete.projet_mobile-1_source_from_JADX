package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.EWDPropriete;

/* renamed from: fr.pcsoft.wdjava.core.types.x */
/* synthetic */ class C0796x {
    /* renamed from: a */
    static final int[] f2028a = new int[EWDPropriete.values().length];
    /* renamed from: b */
    static final int[] f2029b = new int[C0782g.values().length];

    static {
        try {
            f2028a[EWDPropriete.PROP_JOUR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f2028a[EWDPropriete.PROP_HEURE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f2028a[EWDPropriete.PROP_MINUTE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f2028a[EWDPropriete.PROP_SECONDE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f2028a[EWDPropriete.PROP_MILLISECONDE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f2029b[C0782g.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f2029b[C0782g.HOUR.ordinal()] = 2;
        } catch (NoSuchFieldError e7) {
        }
        try {
            f2029b[C0782g.MINUTE.ordinal()] = 3;
        } catch (NoSuchFieldError e8) {
        }
        try {
            f2029b[C0782g.SECOND.ordinal()] = 4;
        } catch (NoSuchFieldError e9) {
        }
        try {
            f2029b[C0782g.CENTISECOND.ordinal()] = 5;
        } catch (NoSuchFieldError e10) {
        }
        try {
            f2029b[C0782g.MILLISECOND.ordinal()] = 6;
        } catch (NoSuchFieldError e11) {
        }
    }
}
