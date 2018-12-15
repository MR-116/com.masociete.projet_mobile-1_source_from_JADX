package fr.pcsoft.wdjava.jni;

import fr.pcsoft.wdjava.core.C0550t;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.types.WDBuffer;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.WDEntier8;
import fr.pcsoft.wdjava.core.types.WDReel;
import fr.pcsoft.wdjava.core.types.cb;

/* renamed from: fr.pcsoft.wdjava.jni.d */
public class C0928d extends C0550t {
    /* renamed from: a */
    private int f2534a;
    /* renamed from: b */
    private int f2535b;
    /* renamed from: c */
    private int f2536c;
    /* renamed from: d */
    private int f2537d;

    public C0928d(int i, int i2, int i3) {
        this.f2534a = -1;
        this.f2536c = i;
        this.f2537d = i2;
        this.f2535b = i3;
    }

    public C0928d(int i, int i2, int i3, int i4) {
        this(i, i2, i3);
        this.f2534a = i4;
    }

    public WDObjet get(int i) {
        return new C0928d(this.f2536c, this.f2537d, this.f2535b, i);
    }

    public WDObjet get(WDObjet wDObjet) {
        return get(wDObjet.getInt());
    }

    public WDObjet getRefProxy() {
        return getValeur();
    }

    public WDObjet getValeur() {
        try {
            switch (this.f2535b) {
                case 1:
                    return new WDReel(WDJNIHelper.m6721g(this.f2536c, this.f2537d, this.f2534a));
                case 8:
                    return new WDEntier4(WDJNIHelper.m6704e(this.f2536c, this.f2537d, this.f2534a));
                case 9:
                    return new WDEntier8(WDJNIHelper.m6714f(this.f2536c, this.f2537d, this.f2534a));
                case 12:
                    return new WDReel(WDJNIHelper.m6730j(this.f2536c, this.f2537d, this.f2534a));
                case 30:
                    return new WDBuffer(WDJNIHelper.m6729i(this.f2536c, this.f2537d, this.f2534a));
                default:
                    return new WDChaine(WDJNIHelper.m6732l(this.f2536c, this.f2537d, this.f2534a));
            }
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
            return null;
        }
        WDErreurManager.m2888b(e);
        return null;
    }

    public cb opDec() {
        setValeur(getValeur().opMoins(1));
        return (cb) getValeur();
    }

    public cb opInc() {
        setValeur(getValeur().opPlus(1));
        return (cb) getValeur();
    }

    public void release() {
    }

    public void setValeur(double d) {
        try {
            WDJNIHelper.m6574a(this.f2536c, this.f2537d, this.f2534a, d);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
        }
    }

    public void setValeur(int i) {
        try {
            WDJNIHelper.m6649b(this.f2536c, this.f2537d, this.f2534a, i);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
        }
    }

    public void setValeur(long j) {
        try {
            WDJNIHelper.m6576a(this.f2536c, this.f2537d, this.f2534a, j);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
        }
    }

    public void setValeur(WDObjet wDObjet) {
        try {
            switch (this.f2535b) {
                case 1:
                    WDJNIHelper.m6577a(this.f2536c, this.f2537d, this.f2534a, wDObjet.getBoolean());
                    return;
                case 8:
                    WDJNIHelper.m6649b(this.f2536c, this.f2537d, this.f2534a, wDObjet.getInt());
                    return;
                case 9:
                    WDJNIHelper.m6576a(this.f2536c, this.f2537d, this.f2534a, wDObjet.getLong());
                    return;
                case 12:
                    WDJNIHelper.m6574a(this.f2536c, this.f2537d, this.f2534a, wDObjet.getDouble());
                    return;
                case 30:
                    WDJNIHelper.m6578a(this.f2536c, this.f2537d, this.f2534a, wDObjet.getDonneeBinaire());
                    return;
                default:
                    WDJNIHelper.m6696d(this.f2536c, this.f2537d, this.f2534a, wDObjet.getString());
                    return;
            }
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
        }
        WDErreurManager.m2888b(e);
    }

    public void setValeur(String str) {
        try {
            WDJNIHelper.m6696d(this.f2536c, this.f2537d, this.f2534a, str);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
        }
    }

    public void setValeur(boolean z) {
        try {
            WDJNIHelper.m6577a(this.f2536c, this.f2537d, this.f2534a, z);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
        }
    }
}
