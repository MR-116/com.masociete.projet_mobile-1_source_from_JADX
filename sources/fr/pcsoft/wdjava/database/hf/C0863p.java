package fr.pcsoft.wdjava.database.hf;

import fr.pcsoft.wdjava.core.application.C0535j;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.utils.ec;

/* renamed from: fr.pcsoft.wdjava.database.hf.p */
final class C0863p implements C0535j {
    C0863p() {
    }

    public void onChangementTitre(String str) {
    }

    public void onCharsetChanged(String str) {
        try {
            WDHF.setAlphabet(ec.m3869a(str));
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
        } catch (C0539d e2) {
            WDErreurManager.m2875a(e2);
        }
    }

    public void onFermetureProjet() {
    }

    public void onLowMemory() {
    }
}
