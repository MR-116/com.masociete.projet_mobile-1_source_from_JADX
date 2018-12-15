package fr.pcsoft.wdjava.ui.p073d.p074a;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDIndirection;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p047f.C0712l;
import fr.pcsoft.wdjava.core.p047f.C0713b;
import fr.pcsoft.wdjava.core.p047f.C0715d;
import fr.pcsoft.wdjava.core.p047f.C0722m;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.collection.C0582d;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.wc;
import fr.pcsoft.wdjava.ui.p073d.C1318c;

/* renamed from: fr.pcsoft.wdjava.ui.d.a.a */
public class C1319a implements C1318c<C0582d> {
    /* renamed from: z */
    private static final String[] f3933z = new String[]{C1319a.m9292z(C1319a.m9293z("hfZ|c\u001fvQxp\neQrc\u0014kQxb\u0002g_ip\n{Qwd\u0007l")), C1319a.m9292z(C1319a.m9293z("\u0019LkSR")), C1319a.m9292z(C1319a.m9293z("h`Vro\blGh\u001dhTb\u000ev[~g\u0006y")), C1319a.m9292z(C1319a.m9293z("hhHfc\u0007vWfc\u0019hLss\u0019v[di\ba]b")), C1319a.m9292z(C1319a.m9293z("heQer\u000evNb\u000e")), C1319a.m9292z(C1319a.m9293z("hYzc\u001e{G`g\u0007`\\sy\baY{v\u0014\u001b"))};
    /* renamed from: a */
    private int f3934a = 0;
    /* renamed from: b */
    private boolean f3935b = false;
    /* renamed from: c */
    private wc f3936c;
    /* renamed from: d */
    private String f3937d = null;
    /* renamed from: e */
    private C0582d f3938e = null;
    /* renamed from: f */
    private long f3939f = 0;

    public C1319a(wc wcVar, String str) {
        this.f3936c = wcVar;
        this.f3937d = str;
    }

    /* renamed from: z */
    private static String m9292z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 75;
                    break;
                case 1:
                    i2 = 41;
                    break;
                case 2:
                    i2 = 24;
                    break;
                case 3:
                    i2 = 54;
                    break;
                default:
                    i2 = 38;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9293z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 38);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public WDObjet mo3607a(C0712l c0712l) {
        if (c0712l instanceof C0713b) {
            C0722m a = ((C0713b) c0712l).m2962a(0);
            if (a != null && a.m3005b() == this.f3938e) {
                WDObjet a2 = this.f3938e.mo2469a((long) this.f3934a);
                if (a2 != null) {
                    try {
                        return a.m3003a(a2);
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
        }
        return C0712l.f1821a;
    }

    /* renamed from: a */
    public Object mo3608a(int i) {
        int itemCount = this.f3936c.getItemCount();
        if (i < 0 || i >= itemCount) {
            try {
                if (this.f3936c.getItemCount() == 0) {
                    WDErreurManager.m2883a(C0745b.m3222b(f3933z[4], new String[0]) + "\n" + C0745b.m3222b(f3933z[2], this.f3936c.getName(), String.valueOf(C0725i.m3069e(i))));
                }
                WDErreurManager.m2883a(C0745b.m3222b(f3933z[3], this.f3936c.getName()) + "\n" + C0745b.m3222b(f3933z[5], "" + C0725i.m3069e(i), this.f3936c.getName(), "1", String.valueOf(itemCount)));
                return null;
            } catch (WDException e) {
                throw e;
            }
        }
        try {
            return this.f3936c.getItemAt(i);
        } catch (WDException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public void mo3609a() {
        this.f3938e = null;
        this.f3936c = null;
        this.f3937d = null;
    }

    /* renamed from: a */
    public void mo3610a(int i, int i2, boolean z) {
    }

    /* renamed from: a */
    public void mo3611a(int i, boolean z, boolean z2) {
    }

    /* renamed from: a */
    public void mo3612a(String str) {
        try {
            if (str.equalsIgnoreCase(f3933z[1])) {
                ((C0489p) this.f3936c).appelPCode(14);
            }
            mo3617b(0);
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public void mo3613a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo3614a(int i, int i2) {
        return false;
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
        this.f3936c.removeAllBindingItem();
        mo3624e();
        mo3633m();
    }

    /* renamed from: b */
    public void mo3618b(int i, int i2) {
    }

    /* renamed from: b */
    public void mo3619b(int i, boolean z) {
    }

    /* renamed from: b */
    public void mo3620b(String str) {
        try {
            if (this.f3938e != null) {
                mo3621c();
                this.f3938e = null;
            }
            if (!C0808l.m4053k(str)) {
                String trim = str.trim();
                WDObjet 2 = WDIndirection.get2(trim.startsWith(":") ? trim.substring(1) : trim, 5);
                if (2 != null) {
                    try {
                        this.f3938e = (C0582d) 2.checkType(C0582d.class);
                        if (this.f3938e == null) {
                            WDErreurManager.m2883a(C0745b.m3222b(f3933z[0], r1, this.f3936c.getName()));
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    public final void m9308b(boolean z) {
        this.f3935b = z;
    }

    /* renamed from: c */
    public void mo3621c() {
        this.f3934a = 0;
    }

    /* renamed from: d */
    public boolean mo3622d() {
        return true;
    }

    /* renamed from: d */
    public boolean mo3623d(int i) {
        return false;
    }

    /* renamed from: e */
    public void mo3624e() {
        try {
            if (this.f3938e != null) {
                this.f3939f = this.f3938e.mo2483h();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: e */
    public boolean mo3625e(int i) {
        return false;
    }

    /* renamed from: f */
    public int mo3626f() {
        try {
            return this.f3938e != null ? (int) this.f3938e.mo2483h() : 0;
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: g */
    public void mo3627g() {
    }

    /* renamed from: h */
    public boolean mo3628h() {
        return this.f3935b;
    }

    /* renamed from: i */
    public void mo3629i() throws WDException {
        try {
            mo3620b(this.f3937d);
            if (this.f3938e != null) {
                this.f3936c.initLiaisonsBinding();
                mo3624e();
                mo3633m();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: j */
    public String mo3630j() {
        return this.f3937d;
    }

    /* renamed from: k */
    public int mo3631k() {
        return mo3626f();
    }

    /* renamed from: l */
    public boolean mo3632l() {
        try {
            return this.f3938e != null;
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: m */
    public void mo3633m() {
        if (this.f3938e != null) {
            int itemCount = this.f3936c.getItemCount();
            this.f3934a = 0;
            long j = 0;
            while (j < this.f3939f) {
                int i = itemCount + 1;
                this.f3936c.addBindingItem(itemCount);
                this.f3934a++;
                j++;
                itemCount = i;
            }
        }
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ Object mo3634n() {
        return m9323o();
    }

    /* renamed from: o */
    public C0582d m9323o() {
        return this.f3938e;
    }

    /* renamed from: w */
    public boolean mo3635w() {
        return false;
    }

    /* renamed from: x */
    public void mo3636x() {
    }

    /* renamed from: y */
    public boolean mo3637y() {
        return false;
    }
}
