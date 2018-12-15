package fr.pcsoft.wdjava.ui.dialogue;

import fr.pcsoft.wdjava.ui.champs.fenetre.C0509v;
import fr.pcsoft.wdjava.ui.champs.fenetre.C1162n;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;

/* renamed from: fr.pcsoft.wdjava.ui.dialogue.y */
class C1395y implements C1162n {
    final WDMsgBoxManagerImpl this$0;

    C1395y(WDMsgBoxManagerImpl wDMsgBoxManagerImpl) {
        this.this$0 = wDMsgBoxManagerImpl;
    }

    /* renamed from: a */
    public void mo3567a(C0509v c0509v) {
        this.this$0.m9855a(((WDFenetre) c0509v).getActivite());
        c0509v.supprimerEcouteurFenetre(this);
    }

    /* renamed from: b */
    public void mo3568b(C0509v c0509v) {
    }

    /* renamed from: c */
    public void mo3569c(C0509v c0509v) {
    }
}
