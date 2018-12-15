package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.C0546j;
import fr.pcsoft.wdjava.ui.champs.image.C0520c;
import fr.pcsoft.wdjava.ui.champs.nb;

/* renamed from: fr.pcsoft.wdjava.api.d */
final class C0547d implements C0546j {
    C0547d() {
    }

    /* renamed from: a */
    public boolean mo2352a(nb nbVar) {
        C0520c c0520c = (C0520c) ((WDObjet) nbVar).checkType(C0520c.class);
        if (c0520c != null) {
            c0520c.libererImageMemoire();
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo2353a(C0489p c0489p) {
        return true;
    }
}
