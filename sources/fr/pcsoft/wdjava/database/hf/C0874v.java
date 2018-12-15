package fr.pcsoft.wdjava.database.hf;

import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.database.hf.p049c.C0832f;
import fr.pcsoft.wdjava.database.hf.p049c.C0841b;
import fr.pcsoft.wdjava.jni.WDJNIException;
import fr.pcsoft.wdjava.ui.dialogue.C1372f;

/* renamed from: fr.pcsoft.wdjava.database.hf.v */
final class C0874v implements Runnable {
    final boolean val$bDeconnexion;
    final WDCallback val$callback;
    final int val$nTypeAction;
    final WDObjet[] val$params;
    final String[] val$tabValeursHClient;

    C0874v(WDCallback wDCallback, String[] strArr, WDObjet[] wDObjetArr, int i, boolean z) {
        this.val$callback = wDCallback;
        this.val$tabValeursHClient = strArr;
        this.val$params = wDObjetArr;
        this.val$nTypeAction = i;
        this.val$bDeconnexion = z;
    }

    public void run() {
        if (this.val$callback != null) {
            C0832f x = WDHF_Contexte.getInstance().m5043x();
            try {
                String[] a = x.mo2858a(this.val$tabValeursHClient);
                Object obj = new WDObjet[(this.val$params.length + 1)];
                obj[0] = C0611a.m2308b(this.val$nTypeAction);
                System.arraycopy(this.val$params, 0, obj, 1, this.val$params.length);
                this.val$callback.execute(obj);
                x.mo2858a(a);
                return;
            } catch (Exception e) {
                WDErreurManager.m2882a(e);
                return;
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, x);
                return;
            }
        }
        try {
            C1372f.m9828a().m9832a(0, this.val$params[0].getString(), null, 0);
            if (this.val$bDeconnexion) {
                WDProjet.getInstance().terminerApplication();
            }
        } catch (C0841b e3) {
            throw e3;
        }
    }
}
