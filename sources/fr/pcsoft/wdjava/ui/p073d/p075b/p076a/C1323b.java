package fr.pcsoft.wdjava.ui.p073d.p075b.p076a;

import fr.pcsoft.wdjava.api.WDAPIHF;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.requete.C0778b;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.ub;
import fr.pcsoft.wdjava.ui.champs.wc;

/* renamed from: fr.pcsoft.wdjava.ui.d.b.a.b */
public abstract class C1323b extends C1322a {
    /* renamed from: z */
    private static final String[] f3955z = new String[]{C1323b.m9419z(C1323b.m9420z("'\u001fS\u001f\u001f")), C1323b.m9419z(C1323b.m9420z("'\u001fE\u0002\u000e\u0016\u000fT\u001f")), C1323b.m9419z(C1323b.m9420z("V,a6. (9$;)t;%!?3%#;l3/0"))};

    public C1323b(wc wcVar) {
        super(wcVar);
    }

    /* renamed from: z */
    private static String m9419z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 117;
                    break;
                case 1:
                    i2 = 122;
                    break;
                case 2:
                    i2 = 32;
                    break;
                case 3:
                    i2 = 122;
                    break;
                default:
                    i2 = 107;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9420z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 107);
        }
        return toCharArray;
    }

    /* renamed from: E */
    public int mo3657E() {
        return this.j.getMaxVisibleRowCount() + 1;
    }

    /* renamed from: F */
    protected void mo3658F() {
    }

    /* renamed from: G */
    protected void mo3659G() {
    }

    /* renamed from: K */
    public int mo3660K() {
        return this.j.getFirstVisibleElement();
    }

    /* renamed from: L */
    protected boolean mo3661L() {
        return (mo3660K() + mo3668d(false)) + -1 >= mo3626f();
    }

    /* renamed from: M */
    protected void mo3662M() {
    }

    /* renamed from: P */
    protected void mo3663P() {
    }

    /* renamed from: a */
    public void mo3612a(String str) {
        Throwable th;
        ub selectionModel;
        boolean equalsIgnoreCase;
        int i;
        try {
            equalsIgnoreCase = str.equalsIgnoreCase(f3955z[0]);
            if (equalsIgnoreCase || str.equalsIgnoreCase("I")) {
                if (equalsIgnoreCase) {
                    ((C0489p) this.j).appelPCode(14);
                }
                if (this.d != null && this.d.isRequete() && ((C0778b) this.d).mb()) {
                    mo3612a(f3955z[1]);
                    if (equalsIgnoreCase) {
                        ((C0489p) this.j).appelPCode(35);
                        return;
                    }
                    return;
                }
                mo3617b(0);
                if (equalsIgnoreCase) {
                    try {
                        ((C0489p) this.j).appelPCode(35);
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        i = 1;
                        th = th3;
                        if (i != 0 && mo3626f() > 0) {
                            selectionModel = this.j.getSelectionModel();
                            selectionModel.mo3489c(0, 0);
                            if (selectionModel.mo3496h() != 99 && selectionModel.mo3485a(0)) {
                                ((gc) this.j).appelPCode(33);
                            }
                        }
                        throw th;
                    }
                }
                i = 1;
            } else if (str.equalsIgnoreCase(f3955z[1])) {
                if (this.d.isRequete()) {
                    mo3621c();
                    if (((C0778b) this.d).m3760a("", 0, null, true)) {
                        if (this.b[1].equals("")) {
                            this.e = this.d.mo2739O();
                        }
                        mo3617b(0);
                        i = 1;
                    } else {
                        WDErreurManager.m2884a(WDAPIHF.hErreurInfo(C0542t.Vc).getString(), WDAPIHF.hErreurInfo(C0542t.mb).getString());
                        i = 0;
                    }
                } else {
                    mo3612a("I");
                    return;
                }
            } else if (str.equalsIgnoreCase(C0607n.rq)) {
                mo3617b(mo3660K());
                i = 0;
            } else if (str.equalsIgnoreCase(C0607n.Vc)) {
                mo3624e();
                mo3666a(true, true);
                i = 0;
            } else {
                WDErreurManager.m2883a(C0745b.m3222b(f3955z[2], str));
                i = 0;
            }
            if (i != 0 && mo3626f() > 0) {
                selectionModel = this.j.getSelectionModel();
                selectionModel.mo3489c(0, 0);
                if (selectionModel.mo3496h() != 99 && selectionModel.mo3485a(0)) {
                    ((gc) this.j).appelPCode(33);
                }
            }
        } catch (Throwable th22) {
            th = th22;
            i = 0;
        }
    }

    /* renamed from: b */
    public void mo3619b(int i, boolean z) {
        this.j.setFirstVisibleElement(i);
    }

    /* renamed from: c */
    public int mo3656c(boolean z) {
        return mo3631k();
    }

    /* renamed from: e */
    public void mo3624e() {
        int f = mo3626f();
        super.mo3624e();
        int f2 = mo3626f();
        if (f > f2 && f2 >= 0) {
            ub selectionModel = this.j.getSelectionModel();
            if (f2 == 0) {
                selectionModel.mo3486b();
            } else if (selectionModel.mo3495g() || selectionModel.mo3490d() < f2) {
                selectionModel.mo3484a(f2 - 1, f - 1);
            } else {
                f = f2 - 1;
                selectionModel.mo3489c(f, f);
            }
        }
    }

    /* renamed from: f */
    public void mo3664f(int i) {
    }
}
