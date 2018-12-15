package fr.pcsoft.wdjava.core.application;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.IWDAllocateur;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;

/* renamed from: fr.pcsoft.wdjava.core.application.i */
final class C0650i implements IWDAllocateur {
    final Class val$classe;

    C0650i(Class cls) {
        this.val$classe = cls;
    }

    public WDObjet creerInstance() {
        try {
            return (WDObjet) this.val$classe.newInstance();
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
            return null;
        }
    }

    public Class getClasseWD() {
        return this.val$classe;
    }

    public int getTypeWL() {
        return 111;
    }

    public boolean isDynamique() {
        return false;
    }
}
