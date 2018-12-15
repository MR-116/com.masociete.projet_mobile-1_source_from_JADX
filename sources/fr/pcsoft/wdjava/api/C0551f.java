package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0550t;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.WDEntier8;
import fr.pcsoft.wdjava.core.types.WDReel;
import fr.pcsoft.wdjava.database.hf.WDHF_Contexte;
import fr.pcsoft.wdjava.database.hf.WDHF_Manager;
import fr.pcsoft.wdjava.database.hf.p049c.C0832f;
import fr.pcsoft.wdjava.jni.WDJNIException;

/* renamed from: fr.pcsoft.wdjava.api.f */
final class C0551f extends C0550t {
    final int val$nVariable;

    C0551f(int i) {
        this.val$nVariable = i;
    }

    public WDObjet getRefProxy() {
        return getValeur();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fr.pcsoft.wdjava.core.WDObjet getValeur() {
        /*
        r3 = this;
        r0 = 0;
        r1 = fr.pcsoft.wdjava.database.hf.WDHF_Contexte.getInstance();
        r2 = r1.m5043x();	 Catch:{ b -> 0x0010, WDJNIException -> 0x0015 }
        r1 = r3.val$nVariable;	 Catch:{ b -> 0x0010, WDJNIException -> 0x001b }
        r0 = r2.mo2862b(r1);	 Catch:{ b -> 0x0010, WDJNIException -> 0x001b }
    L_0x000f:
        return r0;
    L_0x0010:
        r1 = move-exception;
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2882a(r1);
        goto L_0x000f;
    L_0x0015:
        r1 = move-exception;
        r2 = r0;
    L_0x0017:
        fr.pcsoft.wdjava.database.hf.WDHF_Manager.m5075a(r1, r2);
        goto L_0x000f;
    L_0x001b:
        r1 = move-exception;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.api.f.getValeur():fr.pcsoft.wdjava.core.WDObjet");
    }

    public void release() {
    }

    public void setValeur(double d) {
        setValeur(new WDReel(d));
    }

    public void setValeur(int i) {
        setValeur(new WDEntier4(i));
    }

    public void setValeur(long j) {
        setValeur(new WDEntier8(j));
    }

    public void setValeur(WDObjet wDObjet) {
        C0832f c0832f = null;
        try {
            c0832f = WDHF_Contexte.getInstance().m5043x();
            c0832f.mo2810a(this.val$nVariable, wDObjet);
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
        } catch (WDJNIException e2) {
            WDHF_Manager.m5075a(e2, c0832f);
        }
    }

    public void setValeur(String str) {
        setValeur(new WDChaine(str));
    }

    public void setValeur(boolean z) {
        setValeur(new WDBooleen(z));
    }
}
