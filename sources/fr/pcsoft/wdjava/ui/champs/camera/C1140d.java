package fr.pcsoft.wdjava.ui.champs.camera;

import fr.pcsoft.wdjava.ui.champs.fenetre.C1139c;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.utils.C1504c;

/* renamed from: fr.pcsoft.wdjava.ui.champs.camera.d */
class C1140d implements C1139c {
    final C1137b this$2;

    C1140d(C1137b c1137b) {
        this.this$2 = c1137b;
    }

    /* renamed from: a */
    public void mo3415a(WDFenetre wDFenetre) {
        C1504c.m10454a(new C1142f(this));
        ((WDFenetre) this.this$2.this$1.this$0.l).supprimerEcouteurAncrageFenetre(this);
    }
}
