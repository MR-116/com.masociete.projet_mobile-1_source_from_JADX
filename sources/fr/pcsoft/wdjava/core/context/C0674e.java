package fr.pcsoft.wdjava.core.context;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.erreur.C0673b;
import fr.pcsoft.wdjava.core.erreur.WDErreurNonFatale;
import fr.pcsoft.wdjava.core.p035c.C0660a;
import fr.pcsoft.wdjava.core.types.WDVoid;
import fr.pcsoft.wdjava.ui.dialogue.C1372f;

/* renamed from: fr.pcsoft.wdjava.core.context.e */
class C0674e implements C0673b {
    final WDContexte this$0;
    final int val$nTraitement;
    final Object val$param;
    final C0671c val$pcode;

    C0674e(WDContexte wDContexte, int i, Object obj, C0671c c0671c) {
        this.this$0 = wDContexte;
        this.val$nTraitement = i;
        this.val$param = obj;
        this.val$pcode = c0671c;
    }

    /* renamed from: a */
    public int mo2569a() {
        return this.val$nTraitement;
    }

    /* renamed from: a */
    public void mo2570a(WDErreurNonFatale wDErreurNonFatale) {
        try {
            switch (this.val$nTraitement) {
                case 0:
                    throw wDErreurNonFatale;
                case 1:
                    WDCallback a = WDCallback.m2240a(this.val$param.toString(), 0);
                    if (a != null) {
                        WDObjet execute = a.execute(1, new WDObjet[0]);
                        if (execute != null) {
                            try {
                                if (!(execute instanceof WDVoid)) {
                                    switch (execute.getInt()) {
                                        case -2147483647:
                                            return;
                                        case -2147483645:
                                            throw new C0660a(null);
                                        case C0607n.Ts /*-2147483644*/:
                                            WDProjet.getInstance().terminerApplication();
                                            return;
                                        default:
                                            return;
                                    }
                                }
                                return;
                            } catch (Exception e) {
                                throw e;
                            } catch (Exception e2) {
                                throw e2;
                            }
                        }
                        return;
                    }
                    return;
                case 2:
                    try {
                        C1372f.m9828a().mo3758c(wDErreurNonFatale.getMessage(), 4);
                    } catch (Exception e3) {
                        C1372f.m9828a().m9832a(1, wDErreurNonFatale.getMessage(), new String[0], 0);
                    }
                    WDProjet.getInstance().terminerApplication();
                    return;
                case 3:
                case 4:
                    try {
                        C1372f.m9828a().mo3758c(wDErreurNonFatale.getMessage(), 2);
                    } catch (Exception e4) {
                        C1372f.m9828a().m9832a(1, wDErreurNonFatale.getMessage(), new String[0], 0);
                    }
                    throw new C0660a(null);
                case 5:
                    try {
                        if (this.val$param != null) {
                            if (!(this.val$param instanceof WDObjet)) {
                                return;
                            }
                        }
                        try {
                            if (this.val$param == null) {
                                wDErreurNonFatale.m2893a(new WDVoid(this.val$pcode.f1689f));
                            } else {
                                wDErreurNonFatale.m2893a((WDObjet) this.val$param);
                            }
                            throw wDErreurNonFatale;
                        } catch (Exception e22) {
                            throw e22;
                        }
                    } catch (Exception e222) {
                        throw e222;
                    } catch (Exception e2222) {
                        throw e2222;
                    }
                case 6:
                    try {
                        if (this.val$param != null) {
                            if (!(this.val$param instanceof WDObjet)) {
                                return;
                            }
                        }
                        try {
                            if (this.val$param == null) {
                                wDErreurNonFatale.m2893a(new WDVoid(this.val$pcode.f1689f));
                            } else {
                                wDErreurNonFatale.m2893a((WDObjet) this.val$param);
                            }
                            try {
                                C1372f.m9828a().mo3758c(wDErreurNonFatale.getMessage(), 1);
                            } catch (Exception e5) {
                                C1372f.m9828a().m9832a(1, wDErreurNonFatale.getMessage(), new String[0], 0);
                            }
                            throw wDErreurNonFatale;
                        } catch (Exception e22222) {
                            throw e22222;
                        }
                    } catch (Exception e222222) {
                        throw e222222;
                    } catch (Exception e2222222) {
                        throw e2222222;
                    }
                default:
                    return;
            }
        } catch (Exception e22222222) {
            throw e22222222;
        }
    }
}
