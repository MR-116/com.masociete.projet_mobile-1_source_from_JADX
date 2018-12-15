package fr.pcsoft.wdjava.ui.p073d.p075b.p076a;

import android.support.v4.media.session.PlaybackStateCompat;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.utils.tb;
import fr.pcsoft.wdjava.database.hf.WDHF_Manager;
import fr.pcsoft.wdjava.database.hf.ab;
import fr.pcsoft.wdjava.database.hf.eb;
import fr.pcsoft.wdjava.database.hf.p049c.C0841b;
import fr.pcsoft.wdjava.jni.WDJNIException;
import fr.pcsoft.wdjava.ui.champs.ad;
import fr.pcsoft.wdjava.ui.champs.jb;
import fr.pcsoft.wdjava.ui.champs.wc;
import fr.pcsoft.wdjava.ui.p069g.C1409j;
import fr.pcsoft.wdjava.ui.p073d.C1318c;
import fr.pcsoft.wdjava.ui.p073d.p075b.C1321b;
import fr.pcsoft.wdjava.ui.utils.C1515p;

/* renamed from: fr.pcsoft.wdjava.ui.d.b.a.a */
public abstract class C1322a extends C1321b implements C1318c<ab> {
    /* renamed from: l */
    protected static final int f3950l = 1;
    /* renamed from: n */
    protected static final int f3951n = 100;
    /* renamed from: j */
    protected wc f3952j;
    /* renamed from: k */
    protected boolean f3953k = false;
    /* renamed from: m */
    private tb f3954m = null;

    public C1322a(wc wcVar) {
        this.f3952j = wcVar;
    }

    /* renamed from: N */
    private void m9384N() {
        try {
            if (this.f3954m != null) {
                if (this.f3954m.m4146e()) {
                    this.f3954m.m4147f();
                }
                this.f3954m = null;
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    static /* synthetic */ int access$1114(C1322a c1322a, long j) {
        int i = (int) (((long) c1322a.f) + j);
        c1322a.f = i;
        return i;
    }

    static /* synthetic */ int access$2712(C1322a c1322a, int i) {
        int i2 = c1322a.f + i;
        c1322a.f = i2;
        return i2;
    }

    static /* synthetic */ int access$2814(C1322a c1322a, long j) {
        int i = (int) (((long) c1322a.f) + j);
        c1322a.f = i;
        return i;
    }

    /* renamed from: C */
    protected long mo3655C() {
        try {
            if (this.d == null) {
                return 0;
            }
            if (!this.d.m3716j()) {
                return super.mo3655C();
            }
            m9384N();
            this.f = 0;
            try {
                long a;
                if (!this.d.isRequete()) {
                    try {
                        if (!this.d.mo2753v().mo2910c(this.d.m3717k(), this.e.m5852i())) {
                            return this.d.m3626a(0, "", null, true);
                        }
                        a = this.d.mo2753v().mo2781a(this.d.m3717k(), this.e.m5852i(), 1000, 2);
                        if (a >= 1000) {
                            this.f3954m = new C1330i(this, C1409j.f4188e);
                            this.f3954m.m4143b(C1409j.f4188e);
                            return a + 1;
                        } else if (a != 0) {
                            return Math.max(0, a + 1);
                        } else {
                            this.d.m3661a(this.e, true, true, (long) PlaybackStateCompat.ACTION_PREPARE);
                            return !this.d.m3599B() ? 1 : 0;
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                } else if (this.d.mo2753v().mo2987j(this.d.m3717k())) {
                    a = this.d.mo2753v().mo3053v(this.d.m3717k());
                    if (a > 0) {
                        a = this.d.m3626a(1, "", null, true);
                        this.f = (int) a;
                    } else {
                        this.f3954m = new C1332k(this, C1409j.f4188e);
                        this.f3954m.m4143b(C1409j.f4188e);
                    }
                    return Math.abs(a);
                } else {
                    this.f3954m = new C1331j(this, 100);
                    this.f3954m.m4140a();
                    return (long) this.f;
                }
            } catch (Exception e2) {
                WDErreurManager.m2882a(e2);
                return 0;
            } catch (WDJNIException e3) {
                WDHF_Manager.m5075a(e3, this.d.mo2753v());
                return 0;
            }
        } catch (C0841b e4) {
            throw e4;
        }
    }

    /* renamed from: E */
    public abstract int mo3657E();

    /* renamed from: F */
    protected abstract void mo3658F();

    /* renamed from: G */
    protected abstract void mo3659G();

    /* renamed from: H */
    protected int m9389H() {
        int maxItemCountPerRow = this.f3952j.getMaxItemCountPerRow();
        int f = mo3626f() % maxItemCountPerRow;
        return f == 0 ? maxItemCountPerRow : f;
    }

    /* renamed from: I */
    protected int m9390I() {
        return m9415g(this.f3952j.getItemCount() - 1);
    }

    /* renamed from: J */
    protected int m9391J() {
        return ((int) Math.ceil(((double) mo3626f()) / ((double) this.f3952j.getMaxItemCountPerRow()))) * this.f3952j.getElementHeight();
    }

    /* renamed from: K */
    public abstract int mo3660K();

    /* renamed from: L */
    protected abstract boolean mo3661L();

    /* renamed from: M */
    protected abstract void mo3662M();

    /* renamed from: O */
    protected int m9395O() {
        return m9415g(0);
    }

    /* renamed from: P */
    protected abstract void mo3663P();

    /* renamed from: a */
    public abstract int mo3666a(boolean z, boolean z2);

    /* renamed from: a */
    public void mo3609a() {
        super.mo3609a();
        m9384N();
        this.f3952j = null;
    }

    /* renamed from: a */
    public void mo3610a(int i, int i2, boolean z) {
        if (this.f3952j.isChangeSourcePositionOnSelection()) {
            int g = m9415g(i);
            if (g >= 0) {
                try {
                    if (this.d != null) {
                        this.d.m3685c(g, 2);
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3613a(boolean z) {
        this.f3953k = z;
    }

    /* renamed from: a */
    public boolean mo3614a(int i, int i2) {
        int g = m9415g(i);
        if (g > 0) {
            try {
                mo3638a(g, false);
                if (i2 != 0) {
                    this.d.m3662a(this.e, i2 > 0, true, (long) Math.abs(i2), 0);
                }
                if (this.d.m3724o()) {
                    eb c = this.d.m3681c();
                    this.d.m3705f(this.e);
                    this.d.m3652a(0, 0);
                    this.d.m3705f(c);
                    this.f--;
                    return true;
                }
            } catch (WDException e) {
                throw e;
            } catch (WDException e2) {
                throw e2;
            }
        }
        return false;
    }

    /* renamed from: b */
    protected abstract void mo3667b(boolean z, boolean z2);

    /* renamed from: c */
    public int m9403c(int i, boolean z) {
        boolean isSelectionParProgrammation = this.f3952j.isSelectionParProgrammation();
        this.f3952j.setSelectionParProgrammation(true);
        int i2 = 0;
        while (i2 < i) {
            try {
                if (this.f3952j.getItemCount() <= 0) {
                    break;
                }
                int itemCount = !z ? this.f3952j.getItemCount() - 1 : 0;
                Integer num = new Integer(m9415g(itemCount));
                if (num.intValue() >= 0) {
                    m9354a(num);
                }
                this.f3952j.removeBindingItemAt(itemCount);
                i2++;
            } catch (WDException e) {
                throw e;
            } catch (WDException e2) {
                throw e2;
            } catch (Throwable th) {
                this.f3952j.setSelectionParProgrammation(isSelectionParProgrammation);
            }
        }
        this.f3952j.setSelectionParProgrammation(isSelectionParProgrammation);
        return i2;
    }

    /* renamed from: c */
    public int mo3656c(boolean z) {
        if (z) {
            try {
                if (this.f3954m != null) {
                    while (this.f3954m != null) {
                        try {
                            if (!this.f3954m.m4146e()) {
                                break;
                            }
                            C1515p.m10542a(-1);
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                }
            } catch (WDException e2) {
                throw e2;
            } catch (WDException e22) {
                throw e22;
            }
        }
        return mo3631k();
    }

    /* renamed from: c */
    protected void m9405c(int i, int i2) {
        jb addBindingItem = this.f3952j.addBindingItem(i);
        if (addBindingItem != null) {
            try {
                ((ad) addBindingItem).mo3417a(i2);
            } catch (WDException e) {
                throw e;
            }
        }
    }

    /* renamed from: c */
    public boolean mo3642c(String str) {
        try {
            if (!super.mo3642c(str)) {
                return false;
            }
            if (this.f3952j.isExecPCodeInit()) {
                mo3612a("I");
            }
            return true;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    /* renamed from: d */
    public int mo3668d(boolean z) {
        int maxItemCountPerRow = this.f3952j.getMaxItemCountPerRow();
        return Math.min(z ? (maxItemCountPerRow * (mo3657E() - 1)) + m9389H() : maxItemCountPerRow * mo3657E(), mo3626f());
    }

    /* renamed from: d */
    public boolean mo3623d(int i) {
        int K = mo3660K();
        if (i >= K) {
            try {
                if (i < K + mo3668d(mo3661L())) {
                    return true;
                }
            } catch (WDException e) {
                throw e;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo3643d(String str) {
        boolean d = super.mo3643d(str);
        if (d) {
            try {
                if (this.f3952j.isExecPCodeInit() && this.a != null) {
                    for (int i = 0; i < this.f3952j.getItemCount(); i++) {
                        int g = m9415g(i);
                        if (g != -1) {
                            try {
                                this.d.m3685c(g, 2);
                                this.f3952j.setItemStoredValue(i, this.a.getValeur());
                            } catch (WDException e) {
                                throw e;
                            }
                        }
                    }
                }
            } catch (WDException e2) {
                throw e2;
            }
        }
        return d;
    }

    /* renamed from: e */
    public void mo3624e() {
        super.mo3624e();
        mo3658F();
    }

    /* renamed from: e */
    public boolean mo3625e(int i) {
        return mo3614a(i, 0);
    }

    /* renamed from: e */
    public boolean mo3644e(String str) throws WDException {
        boolean e = super.mo3644e(str);
        if (e) {
            try {
                this.f3952j.initLiaisonsBinding();
                if (this.f3952j.isExecPCodeInit()) {
                    mo3612a("I");
                }
            } catch (WDException e2) {
                throw e2;
            }
        }
        return e;
    }

    /* renamed from: f */
    public abstract void mo3664f(int i);

    /* renamed from: f */
    public boolean mo3645f(String str) {
        boolean f = super.mo3645f(str);
        mo3658F();
        return f;
    }

    /* renamed from: g */
    protected int m9415g(int i) {
        jb itemAt = this.f3952j.getItemAt(i);
        try {
            return itemAt instanceof ad ? ((ad) itemAt).mo3416a() : -1;
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: g */
    public boolean mo3646g(String str) {
        try {
            if (!super.mo3646g(str)) {
                return false;
            }
            if (this.f3952j.isExecPCodeInit()) {
                mo3612a("I");
            }
            return true;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    /* renamed from: i */
    public void mo3629i() throws WDException {
        try {
            super.mo3629i();
            if (this.d != null) {
                this.f3952j.initLiaisonsBinding();
                mo3659G();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: y */
    public boolean mo3637y() {
        return this.f3953k;
    }
}
