package fr.pcsoft.wdjava.core;

import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.WDEntier8;
import fr.pcsoft.wdjava.core.types.WDReel;

/* renamed from: fr.pcsoft.wdjava.core.v */
public abstract class C0822v {
    /* renamed from: a */
    public void m4212a(EWDPropriete eWDPropriete, double d, boolean z) {
        mo3506a(eWDPropriete, new WDReel(d), z);
    }

    /* renamed from: a */
    public void m4213a(EWDPropriete eWDPropriete, int i, boolean z) {
        mo3506a(eWDPropriete, new WDEntier4(i), z);
    }

    /* renamed from: a */
    public void m4214a(EWDPropriete eWDPropriete, long j, boolean z) {
        mo3506a(eWDPropriete, new WDEntier8(j), z);
    }

    /* renamed from: a */
    public abstract void mo3506a(EWDPropriete eWDPropriete, WDObjet wDObjet, boolean z);

    /* renamed from: a */
    public void m4216a(EWDPropriete eWDPropriete, String str, boolean z) {
        mo3506a(eWDPropriete, C0611a.m2300a(str), z);
    }

    /* renamed from: a */
    public void m4217a(EWDPropriete eWDPropriete, boolean z, boolean z2) {
        mo3506a(eWDPropriete, new WDBooleen(z), z2);
    }
}
