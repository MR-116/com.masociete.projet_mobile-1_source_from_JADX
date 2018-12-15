package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;

/* renamed from: fr.pcsoft.wdjava.api.a */
final class C0543a implements Runnable {
    final WDContexte val$ctx;
    final int val$nCodeErreur;
    final String val$strMessageErreur;

    C0543a(WDContexte wDContexte, String str, int i) {
        this.val$ctx = wDContexte;
        this.val$strMessageErreur = str;
        this.val$nCodeErreur = i;
    }

    public void run() {
        WDErreurManager.m2887b(this.val$ctx, this.val$strMessageErreur, this.val$nCodeErreur);
    }
}
