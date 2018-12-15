package fr.pcsoft.wdjava.core.types.collection.tableau;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.IWDAllocateur;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.types.collection.C0582d;

/* renamed from: fr.pcsoft.wdjava.core.types.collection.tableau.k */
public interface C0758k extends C0582d {
    /* renamed from: a */
    long mo2632a(int i);

    /* renamed from: a */
    void mo2654a(C0758k c0758k) throws WDException;

    /* renamed from: a */
    void mo2659a(int[] iArr, int i);

    /* renamed from: b */
    WDObjet mo2633b(long j);

    /* renamed from: d */
    void mo2666d(WDObjet wDObjet);

    /* renamed from: i */
    boolean mo2635i();

    boolean isInstanceLocale();

    boolean isTableau();

    boolean isTableauAssociatif();

    /* renamed from: j */
    boolean mo2667j();

    /* renamed from: k */
    int mo2639k();

    /* renamed from: l */
    int mo2640l();

    /* renamed from: m */
    String mo2641m();

    /* renamed from: n */
    boolean mo2642n();

    /* renamed from: o */
    int mo2643o();

    /* renamed from: p */
    long mo2644p();

    /* renamed from: q */
    IWDAllocateur mo2645q();
}
