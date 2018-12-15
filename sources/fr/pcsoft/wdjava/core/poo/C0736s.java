package fr.pcsoft.wdjava.core.poo;

import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.jni.WDJNIException;
import fr.pcsoft.wdjava.jni.WDJNIHelper;

/* renamed from: fr.pcsoft.wdjava.core.poo.s */
public abstract class C0736s extends C0560r {
    /* renamed from: z */
    private static final String[] f1870z = new String[]{C0736s.m3137z(C0736s.m3138z("bSev\u0012XWwu\u0004\u000bZp9\rB\\ük\u0004Y\u001ey|Aow[VAE_ap\u0007")), C0736s.m3137z(C0736s.m3138z("\bpZF7jrPL3"))};
    /* renamed from: b */
    protected long f1871b = 0;

    public C0736s() {
        try {
            WDJNIHelper.m6615a(true);
            this.f1871b = WDJNIHelper.m6566a(mo3256a(), mo3258b());
        } catch (C0539d e) {
            WDErreurManager.m2875a(e);
        }
    }

    public C0736s(long j) {
        this.f1871b = j;
    }

    /* renamed from: c */
    private synchronized void m3136c() {
        if (this.f1871b != 0) {
            try {
                WDJNIHelper.m6682c(this.f1871b);
            } catch (Exception e) {
                C0691a.m2857a(f1870z[0], e);
            }
        }
    }

    /* renamed from: z */
    private static String m3137z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 43;
                    break;
                case 1:
                    i2 = 62;
                    break;
                case 2:
                    i2 = 21;
                    break;
                case 3:
                    i2 = 25;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3138z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 97);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected abstract int mo3256a();

    /* renamed from: a */
    protected abstract int mo3257a(EWDPropriete eWDPropriete);

    /* renamed from: a */
    public final void m3141a(long j) {
        m3136c();
        this.f1871b = j;
    }

    /* renamed from: a */
    protected void m3142a(EWDPropriete eWDPropriete, C0736s c0736s) {
        try {
            WDJNIHelper.m6595a(this.f1871b, mo3257a(eWDPropriete), c0736s.getIdentifiantJNI());
        } catch (C0539d e) {
            WDErreurManager.m2875a(e);
        }
    }

    /* renamed from: a */
    protected void mo2610a(EWDPropriete eWDPropriete, boolean z) {
        try {
            WDJNIHelper.m6683c(this.f1871b, mo3257a(eWDPropriete), z);
        } catch (C0539d e) {
            WDErreurManager.m2875a(e);
        }
    }

    /* renamed from: a */
    protected void mo2611a(EWDPropriete eWDPropriete, byte[] bArr) {
        try {
            WDJNIHelper.m6612a(this.f1871b, mo3257a(eWDPropriete), bArr);
        } catch (C0539d e) {
            WDErreurManager.m2875a(e);
        }
    }

    /* renamed from: b */
    protected abstract int mo3258b();

    protected void finalize() throws Throwable {
        try {
            m3136c();
        } finally {
            super.finalize();
        }
    }

    public WDObjet getClone() {
        C0736s c0736s = (C0736s) super.getClone();
        if (this.f1871b != 0) {
            try {
                c0736s.f1871b = WDJNIHelper.m6645b(this.f1871b);
            } catch (C0539d e) {
                WDErreurManager.m2875a(e);
            }
        }
        return c0736s;
    }

    public final long getIdentifiantJNI() {
        return this.f1871b;
    }

    public WDObjet getValeur() {
        WDErreurManager.m2883a(C0745b.m3222b(f1870z[1], getNomType()));
        return null;
    }

    public boolean isEvaluable() {
        return false;
    }

    public void razVariable() {
        if (this.f1871b != 0) {
            try {
                WDJNIHelper.m6592a(this.f1871b);
            } catch (C0539d e) {
                WDErreurManager.m2875a(e);
            }
        }
    }

    public void release() {
        m3136c();
    }

    protected void setPropDouble(EWDPropriete eWDPropriete, double d) {
        try {
            WDJNIHelper.m6593a(this.f1871b, mo3257a(eWDPropriete), d);
        } catch (C0539d e) {
            WDErreurManager.m2875a(e);
        }
    }

    protected void setPropInt(EWDPropriete eWDPropriete, int i) {
        try {
            WDJNIHelper.m6594a(this.f1871b, mo3257a(eWDPropriete), i);
        } catch (C0539d e) {
            WDErreurManager.m2875a(e);
        }
    }

    protected void setPropLong(EWDPropriete eWDPropriete, long j) {
        try {
            WDJNIHelper.m6652b(this.f1871b, mo3257a(eWDPropriete), j);
        } catch (C0539d e) {
            WDErreurManager.m2875a(e);
        }
    }

    protected void setPropString(EWDPropriete eWDPropriete, String str) {
        try {
            WDJNIHelper.m6598a(this.f1871b, mo3257a(eWDPropriete), str);
        } catch (C0539d e) {
            WDErreurManager.m2875a(e);
        }
    }

    public void setValeur(WDObjet wDObjet) {
        C0736s c0736s = (C0736s) wDObjet.checkType(getClass());
        if (c0736s != null) {
            try {
                if (this.f1871b != 0) {
                    try {
                        WDJNIHelper.m6613a(this.f1871b, c0736s.f1871b);
                        return;
                    } catch (C0539d e) {
                        WDErreurManager.m2875a(e);
                        return;
                    }
                }
                return;
            } catch (WDJNIException e2) {
                throw e2;
            }
        }
        super.setValeur(wDObjet);
    }
}
