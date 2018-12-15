package fr.pcsoft.wdjava.ui.champs.fenetre;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.utils.gb;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetre.m */
final class C1161m extends gb<C0508h> {
    final C1155i val$modeOuverture;
    final WDObjet val$obj;
    final WDObjet[] val$params;

    C1161m(WDObjet wDObjet, C1155i c1155i, WDObjet[] wDObjetArr) {
        this.val$obj = wDObjet;
        this.val$modeOuverture = c1155i;
        this.val$params = wDObjetArr;
    }

    /* renamed from: b */
    public C0508h m8395b() throws Exception {
        return C0509v.ouvrirFenetre(this.val$obj, this.val$modeOuverture, this.val$params);
    }

    public /* bridge */ /* synthetic */ Object call() throws Exception {
        return m8395b();
    }
}
