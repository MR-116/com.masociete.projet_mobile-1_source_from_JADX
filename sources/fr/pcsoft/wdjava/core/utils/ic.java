package fr.pcsoft.wdjava.core.utils;

import android.os.Handler;
import android.os.Message;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0664f;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.utils.C1504c;

public abstract class ic<T> {
    /* renamed from: a */
    public static final int f1259a = 1;
    /* renamed from: c */
    public static final int f1260c = 2;
    /* renamed from: z */
    private static final String f1261z = m1782z(m1783z("\u0003]Xv;tQGa+uL"));
    /* renamed from: b */
    private Exception f1262b = null;
    /* renamed from: d */
    private boolean f1263d = false;
    /* renamed from: e */
    private Handler f1264e = null;
    /* renamed from: f */
    private T f1265f = null;
    /* renamed from: g */
    private boolean f1266g = false;
    /* renamed from: h */
    private int f1267h = -1;
    /* renamed from: i */
    private final boolean f1268i = C0938m.m6815b();

    /* renamed from: z */
    private static String m1782z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 32;
                    break;
                case 1:
                    i2 = 24;
                    break;
                case 2:
                    i2 = 10;
                    break;
                case 3:
                    i2 = 36;
                    break;
                default:
                    i2 = 100;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1783z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 100);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void m1784a() {
        if (!m1793e()) {
            if (this.f1266g) {
                if (this.f1262b != null) {
                    WDErreurManager.m2888b(this.f1262b);
                }
                mo3228h();
                return;
            }
            mo3228h();
            Message.obtain(this.f1264e != null ? this.f1264e : C0806j.m3954d(), this.f1267h).sendToTarget();
        }
    }

    /* renamed from: a */
    public final void m1785a(int i, String str, int i2) throws Exception {
        Object obj = null;
        if (i2 < 0) {
            i2 = 0;
        }
        m1788b();
        try {
            if (!this.f1268i) {
                this.f1264e = C0806j.m3954d();
            }
            try {
                mo2434c();
                if (!this.f1263d) {
                    this.f1267h = C0806j.m3952b();
                    if ((i & 1) == 1) {
                        try {
                            if (this.f1268i) {
                                try {
                                    if (!C1504c.m10455a()) {
                                        try {
                                            if (!WDAppManager.m2548G()) {
                                                obj = 1;
                                            }
                                        } catch (Exception e) {
                                            throw e;
                                        }
                                    }
                                } catch (Exception e2) {
                                    throw e2;
                                }
                            }
                        } catch (Exception e22) {
                            throw e22;
                        }
                    }
                    if (obj != null) {
                        String titreSuivant;
                        if (str.equals("")) {
                            titreSuivant = WDProjet.getInstance().getTitreSuivant();
                            if (titreSuivant == null) {
                                titreSuivant = "";
                            }
                        } else {
                            titreSuivant = str;
                        }
                        hc.m3944b().show(titreSuivant);
                    }
                    if (!this.f1263d) {
                        C0806j.m3950a((long) i2, this.f1267h, 3, null);
                    }
                    if (obj != null) {
                        hc.m3944b().hide();
                    }
                }
                try {
                    if (this.f1262b != null) {
                        throw this.f1262b;
                    } else if (this.f1263d || (i & 2) != 2) {
                        try {
                            if (!this.f1263d) {
                                mo3228h();
                            }
                        } catch (Exception e222) {
                            throw e222;
                        }
                    } else {
                        throw new C0664f(C0745b.m3222b(f1261z, new String[0]));
                    }
                } catch (Exception e2222) {
                    throw e2222;
                } catch (Exception e22222) {
                    throw e22222;
                } catch (Throwable th) {
                    try {
                        if (!this.f1263d) {
                            mo3228h();
                        }
                    } catch (Exception e222222) {
                        throw e222222;
                    }
                }
            } catch (Exception e2222222) {
                throw e2222222;
            } catch (Exception e22222222) {
                throw e22222222;
            }
        } catch (Exception e222222222) {
            throw e222222222;
        } catch (Exception e2222222222) {
            throw e2222222222;
        } catch (Exception e22222222222) {
            throw e22222222222;
        } catch (Exception e222222222222) {
            m1786a(e222222222222);
        }
    }

    /* renamed from: a */
    protected void m1786a(Exception exception) {
        this.f1262b = exception;
    }

    /* renamed from: a */
    protected final void m1787a(T t) {
        this.f1265f = t;
    }

    /* renamed from: b */
    protected void m1788b() {
    }

    /* renamed from: b */
    public final void m1789b(Exception exception) {
        m1786a(exception);
        (this.f1264e != null ? this.f1264e : C0938m.m6816c()).post(new C0818v(this));
    }

    /* renamed from: b */
    public void m1790b(T t) {
        m1787a((Object) t);
        (this.f1264e != null ? this.f1264e : C0938m.m6816c()).post(new sb(this));
    }

    /* renamed from: c */
    protected abstract void mo2434c();

    /* renamed from: d */
    public final T m1792d() {
        return this.f1265f;
    }

    /* renamed from: e */
    public boolean m1793e() {
        return this.f1263d;
    }

    /* renamed from: f */
    public final void m1794f() {
        this.f1266g = true;
        m1788b();
        mo2434c();
    }

    /* renamed from: g */
    public final void m1795g() throws Exception {
        m1785a(0, "", 0);
    }

    /* renamed from: h */
    protected void mo3228h() {
        this.f1263d = true;
    }
}
