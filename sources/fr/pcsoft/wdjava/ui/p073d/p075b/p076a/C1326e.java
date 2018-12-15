package fr.pcsoft.wdjava.ui.p073d.p075b.p076a;

import android.support.v4.media.session.PlaybackStateCompat;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p047f.C0715d;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.database.hf.C0849z;
import fr.pcsoft.wdjava.ui.champs.jc;
import fr.pcsoft.wdjava.ui.champs.wc;

/* renamed from: fr.pcsoft.wdjava.ui.d.b.a.e */
public abstract class C1326e extends C1323b {
    /* renamed from: q */
    protected static final boolean f3960q = false;
    /* renamed from: z */
    private static final String[] f3961z = new String[]{C1326e.m9463z(C1326e.m9464z("\u001c\r*ibs\u00135ibm\r.|rm\u00139kh|\u0004?m")), C1326e.m9463z(C1326e.m9464z("\u001c\u00003jsz\u0013,pcz")), C1326e.m9463z(C1326e.m9464z("\u001c\u00054}n|\t%pii\r6pcz\u00139qfr\u001c")), C1326e.m9463z(C1326e.m9464z("\u001c\u001a;ubj\u001e%ofs\u0005>|x|\u0004;tw`~"))};
    /* renamed from: o */
    protected int f3962o = 0;
    /* renamed from: p */
    protected int f3963p = 50;

    public C1326e(wc wcVar) {
        super(wcVar);
    }

    /* renamed from: z */
    private static String m9463z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 63;
                    break;
                case 1:
                    i2 = 76;
                    break;
                case 2:
                    i2 = 122;
                    break;
                case 3:
                    i2 = 57;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9464z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 39);
        }
        return toCharArray;
    }

    /* renamed from: M */
    protected void mo3662M() {
    }

    /* renamed from: Q */
    protected abstract void mo3672Q();

    /* renamed from: R */
    protected void m9467R() {
        try {
            if (mo3632l()) {
                try {
                    boolean z = this.e.m5855l() != null;
                    if (!z) {
                        this.d.m3661a(this.e, this.c, true, (long) PlaybackStateCompat.ACTION_PREPARE);
                        z = false;
                    }
                    int b = m9348B().m3669b(this.e);
                    int itemCount = this.j.getItemCount() - 1;
                    while (itemCount >= 0) {
                        int g = m9415g(itemCount);
                        if (g >= 0) {
                            try {
                                if (m9348B().m3685c(g, 2)) {
                                    break;
                                }
                            } catch (WDException e) {
                                throw e;
                            }
                        }
                        itemCount--;
                    }
                    if (itemCount >= 0) {
                        this.d.m3662a(this.e, this.c, true, 1, 0);
                    } else if (z) {
                        try {
                            this.d.m3661a(this.e, this.c, true, (long) PlaybackStateCompat.ACTION_PREPARE);
                        } catch (WDException e2) {
                            throw e2;
                        }
                    }
                    try {
                        mo3667b(true, true);
                        if (b >= 0) {
                            m9348B().m3685c(b, 0);
                        }
                    } catch (WDException e22) {
                        throw e22;
                    }
                } catch (WDException e222) {
                    throw e222;
                }
            }
        } catch (WDException e2222) {
            throw e2222;
        }
    }

    /* renamed from: S */
    protected abstract void mo3673S();

    /* renamed from: T */
    protected abstract void mo3674T();

    /* renamed from: U */
    protected void m9470U() {
    }

    /* renamed from: a */
    public int mo3665a(C0849z c0849z, String str, int i, int i2) {
        return 0;
    }

    /* renamed from: a */
    public int mo3666a(boolean z, boolean z2) {
        this.j.invalidateDrawCache();
        int b = m9357b(z);
        if (b < 0) {
            try {
                ((jc) this.j).listeAffiche(1);
            } catch (WDException e) {
                throw e;
            }
        }
        mo3617b(b);
        return b;
    }

    /* renamed from: a */
    public Object mo3608a(int i) {
        int itemCount = this.j.getItemCount();
        if (i < 0 || i >= itemCount) {
            try {
                if (this.j.getItemCount() == 0) {
                    WDErreurManager.m2883a(C0745b.m3222b(f3961z[1], new String[0]) + "\n" + C0745b.m3222b(f3961z[2], this.j.getName(), String.valueOf(C0725i.m3069e(i))));
                }
                WDErreurManager.m2883a(C0745b.m3222b(f3961z[0], this.j.getName()) + "\n" + C0745b.m3222b(f3961z[3], "" + C0725i.m3069e(i), this.j.getName(), "1", String.valueOf(itemCount)));
                return null;
            } catch (WDException e) {
                throw e;
            }
        }
        try {
            return this.j.getItemAt(i);
        } catch (WDException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public void mo3611a(int i, boolean z, boolean z2) {
    }

    /* renamed from: a */
    public void mo3612a(String str) {
        try {
            if (str.equalsIgnoreCase(C0607n.rq)) {
                mo3617b(mo3660K());
                return;
            }
            try {
                if (str.equalsIgnoreCase(C0607n.Vc)) {
                    mo3666a(true, true);
                } else {
                    super.mo3612a(str);
                }
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public boolean mo3615a(WDObjet wDObjet) {
        return false;
    }

    /* renamed from: b */
    public C0715d mo3616b() {
        return C0715d.MEMORY;
    }

    /* renamed from: b */
    public void mo3617b(int i) {
        try {
            if (this.d == null) {
                return;
            }
            if (this.e != null) {
                try {
                    this.j.invalidateDrawCache();
                    mo3672Q();
                    mo3624e();
                    if (i >= 0) {
                        try {
                            m9403c(this.j.getItemCount() - i, false);
                            mo3633m();
                            if (i >= 0) {
                                try {
                                    if (i < this.j.getNbElement()) {
                                        ((jc) this.j).getPosition(i + 1);
                                    }
                                } catch (WDException e) {
                                    throw e;
                                }
                            }
                        } catch (WDException e2) {
                            throw e2;
                        }
                    }
                } catch (WDException e22) {
                    throw e22;
                }
            }
        } catch (WDException e222) {
            throw e222;
        } catch (WDException e2222) {
            throw e2222;
        }
    }

    /* renamed from: b */
    public void mo3618b(int i, int i2) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    protected void mo3667b(boolean r13, boolean r14) {
        /*
        r12 = this;
        r3 = 1;
        r0 = r12.d;
        r8 = r0.m3599B();
        if (r8 != 0) goto L_0x0064;
    L_0x0009:
        r10 = java.lang.System.currentTimeMillis();
        r0 = 0;
    L_0x000e:
        r1 = r12.f3962o;	 Catch:{ WDException -> 0x003c }
        if (r0 <= r1) goto L_0x0017;
    L_0x0012:
        r1 = r12.f3962o;	 Catch:{ WDException -> 0x003e }
        r2 = -1;
        if (r1 != r2) goto L_0x0062;
    L_0x0017:
        r1 = r12.d;	 Catch:{ WDException -> 0x003e }
        r1 = r1.m3599B();	 Catch:{ WDException -> 0x003e }
        if (r1 == 0) goto L_0x0040;
    L_0x001f:
        r0 = java.lang.System.currentTimeMillis();
        r0 = r0 - r10;
        r2 = r12.f3963p;	 Catch:{ WDException -> 0x005e }
        r2 = r2 / 2;
        r4 = (long) r2;	 Catch:{ WDException -> 0x005e }
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x0033;
    L_0x002d:
        r0 = r12.f3962o;	 Catch:{ WDException -> 0x005e }
        r0 = r0 * 2;
        r12.f3962o = r0;	 Catch:{ WDException -> 0x005e }
    L_0x0033:
        if (r3 == 0) goto L_0x003b;
    L_0x0035:
        r12.mo3672Q();	 Catch:{ WDException -> 0x0060 }
        r12.m9470U();	 Catch:{ WDException -> 0x0060 }
    L_0x003b:
        return;
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;
    L_0x0040:
        r1 = r12.mo3652t();
        r2 = r12.j;
        r2 = r2.getItemCount();
        r12.m9405c(r2, r1);
        r9 = r0 + 1;
        r0 = r12.d;
        r1 = r12.e;
        r2 = r12.c;
        r4 = 1;
        r6 = 0;
        r0.m3662a(r1, r2, r3, r4, r6);
        r0 = r9;
        goto L_0x000e;
    L_0x005e:
        r0 = move-exception;
        throw r0;
    L_0x0060:
        r0 = move-exception;
        throw r0;
    L_0x0062:
        r3 = r8;
        goto L_0x001f;
    L_0x0064:
        r3 = r8;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.d.b.a.e.b(boolean, boolean):void");
    }

    /* renamed from: c */
    public void mo3621c() {
        mo3672Q();
        this.f = 0;
    }

    /* renamed from: e */
    public boolean mo3644e(String str) throws WDException {
        try {
            if (super.mo3644e(str)) {
                return true;
            }
            m9403c(this.j.getItemCount(), true);
            return false;
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: g */
    public boolean mo3646g(String str) {
        try {
            if (super.mo3646g(str)) {
                return true;
            }
            m9403c(this.j.getItemCount(), true);
            return false;
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: m */
    public void mo3633m() {
        mo3674T();
        mo3673S();
    }

    /* renamed from: w */
    public boolean mo3635w() {
        return true;
    }

    /* renamed from: x */
    public void mo3636x() {
    }
}
