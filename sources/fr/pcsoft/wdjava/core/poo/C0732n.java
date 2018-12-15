package fr.pcsoft.wdjava.core.poo;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.parcours.IWDParcours;
import fr.pcsoft.wdjava.jni.WDJNIException;
import fr.pcsoft.wdjava.jni.WDJNIHelper;

/* renamed from: fr.pcsoft.wdjava.core.poo.n */
public class C0732n implements IWDParcours {
    /* renamed from: h */
    private static final int f1861h = 2;
    /* renamed from: j */
    private static final int f1862j = 0;
    /* renamed from: k */
    private static final int f1863k = 1;
    /* renamed from: l */
    private static final int f1864l = 3;
    /* renamed from: e */
    private boolean f1865e = false;
    /* renamed from: f */
    private boolean f1866f = false;
    /* renamed from: g */
    private C0736s f1867g = null;
    /* renamed from: i */
    private long f1868i = 0;
    final C0737t this$1;

    C0732n(C0737t c0737t, C0736s c0736s, int i, boolean z) {
        this.this$1 = c0737t;
        this.f1867g = c0736s;
        this.f1866f = z;
        try {
            this.f1868i = WDJNIHelper.m6647b(c0737t.this$0.getIdentifiantJNI(), c0737t.m3167i(), i);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
        }
    }

    /* renamed from: a */
    private void m3111a() {
        if (this.f1868i != 0) {
            try {
                WDJNIHelper.m6698d(this.f1868i);
            } catch (Throwable e) {
                WDErreurManager.m2888b(e);
            }
        }
    }

    public void finParcours() {
        release();
    }

    public Object getElementCourant() {
        return getVariableParcours();
    }

    public int getIndex() {
        return 0;
    }

    public WDObjet getSource() {
        return this.this$1;
    }

    public WDObjet getVariableParcours() {
        return this.f1867g;
    }

    public void release() {
        m3111a();
        this.f1867g = null;
    }

    public void reset() {
        this.f1865e = false;
    }

    public boolean testParcours() {
        try {
            if (this.f1868i != 0) {
                try {
                    long b;
                    if (this.f1865e) {
                        b = WDJNIHelper.m6646b(this.f1868i, this.f1866f ? 1 : 2);
                    } else {
                        b = WDJNIHelper.m6646b(this.f1868i, this.f1866f ? 0 : 3);
                    }
                    if (b != 0) {
                        this.f1865e = true;
                        this.f1867g.m3141a(b);
                        return true;
                    }
                } catch (WDJNIException e) {
                    throw e;
                } catch (WDJNIException e2) {
                    throw e2;
                }
            }
        } catch (WDJNIException e22) {
            throw e22;
        } catch (Throwable e3) {
            WDErreurManager.m2888b(e3);
        }
        return false;
    }
}
