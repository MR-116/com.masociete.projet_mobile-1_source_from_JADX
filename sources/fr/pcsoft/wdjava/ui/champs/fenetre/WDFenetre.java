package fr.pcsoft.wdjava.ui.champs.fenetre;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDIndirection;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.C0695c;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p035c.C0667i;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.poo.C0735q;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0806j;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.jni.WDJNIException;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.p055g.C0908g;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import fr.pcsoft.wdjava.tlm.C1029b;
import fr.pcsoft.wdjava.tlm.WDTelemetrie;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.actionbar.C0491d;
import fr.pcsoft.wdjava.ui.actionbar.C0511c;
import fr.pcsoft.wdjava.ui.actionbar.C0512g;
import fr.pcsoft.wdjava.ui.actionbar.C1048o;
import fr.pcsoft.wdjava.ui.activite.C0492a;
import fr.pcsoft.wdjava.ui.activite.C0502g;
import fr.pcsoft.wdjava.ui.activite.C1054f;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.activite.WDActivite;
import fr.pcsoft.wdjava.ui.champs.C1151p;
import fr.pcsoft.wdjava.ui.champs.fc;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.fb;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.jauge.C1225d;
import fr.pcsoft.wdjava.ui.champs.nb;
import fr.pcsoft.wdjava.ui.champs.p034b.C0513b;
import fr.pcsoft.wdjava.ui.champs.p034b.C1124a;
import fr.pcsoft.wdjava.ui.champs.p034b.C1125c;
import fr.pcsoft.wdjava.ui.champs.slidingmenu.C0526d;
import fr.pcsoft.wdjava.ui.champs.slidingmenu.C1269c;
import fr.pcsoft.wdjava.ui.champs.zml.C0532f;
import fr.pcsoft.wdjava.ui.gesture.C1171d;
import fr.pcsoft.wdjava.ui.menu.C0495i;
import fr.pcsoft.wdjava.ui.menu.C0497c;
import fr.pcsoft.wdjava.ui.p033c.C0510b;
import fr.pcsoft.wdjava.ui.p033c.C1105c;
import fr.pcsoft.wdjava.ui.p033c.C1108e;
import fr.pcsoft.wdjava.ui.p033c.C1109f;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p065b.C1093d;
import fr.pcsoft.wdjava.ui.p065b.C1094e;
import fr.pcsoft.wdjava.ui.p065b.C1104o;
import fr.pcsoft.wdjava.ui.p065b.p066b.C1089d;
import fr.pcsoft.wdjava.ui.p069g.C1404d;
import fr.pcsoft.wdjava.ui.p080h.C1424g;
import fr.pcsoft.wdjava.ui.p080h.C1426i;
import fr.pcsoft.wdjava.ui.p081j.C1437c;
import fr.pcsoft.wdjava.ui.p082k.C1439b;
import fr.pcsoft.wdjava.ui.pulltorefresh.C0514j;
import fr.pcsoft.wdjava.ui.pulltorefresh.C1156d;
import fr.pcsoft.wdjava.ui.pulltorefresh.C1157f;
import fr.pcsoft.wdjava.ui.pulltorefresh.C1488u;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import fr.pcsoft.wdjava.ui.utils.C1504c;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import fr.pcsoft.wdjava.ui.utils.C1515p;
import fr.pcsoft.wdjava.ui.utils.C1521w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public abstract class WDFenetre extends C0509v implements C0510b, C0511c, C0512g, C0513b, C0514j {
    public static final int Bd = 0;
    public static final int Cd = C1511l.m10517a();
    public static final int Jd = 2;
    public static final int Md = 2;
    public static final int Pd = 0;
    public static final int Rd = 1;
    private static final int Yd = 2;
    private static final String[] ce = new String[]{m1422z(m1423z("\u0002=vJ\u000f89dI\u0019k4!D\u000e9ºr@\u000ek<!D\u0012*<V\u0019k4c\u0005\u0010l1eQ\u0015=9rÌ\\/5&I\u001dk6cK?\"c")), m1422z(m1423z("h\u0016Ck9\u001f\u0002C")), m1422z(m1423z("h\u0013Ih1\n\u001eB`#\r\u0015Hz1\n\bOh5\u0018\u0015C")), m1422z(m1423z("h\u0003Jl8\u0002\u001eAz1\u000e\u001eSz2\u0004\u001eYa9\r\u0019Hl")), m1422z(m1423z("o\u0007Bd\u001f?9pL\b.\u0016cK\u0019?\"c")), m1422z(m1423z("h\u0016Ik?\u001f\u0019Ik2\n\u001cOq9\u0014\u0019Hq9\u0019\u0014Oq9\u0014\u0015Kp0\n\u0004Cp.")), m1422z(m1423z("h\u0013Nd1\u001b\u000fEd.\u001f\u0015Yd,\u0002\u000fP\u0017")), m1422z(m1423z("h\u0015Tw#\u001d\u0015Tv5\u0004\u001eYl2\b\u001fKu=\u001f\u0019Di9\u0014\u0011Eq5\u0004\u001eYg=\u0019")), m1422z(m1423z("h\u001cOg#\f\u001fIb0\u000e\u000fKd,\u0018\u000fHj2\u0014\u0004Tj)\u001d\u0015C")), m1422z(m1423z("\f\u0007Bc")), m1422z(m1423z("\u001d\u0015Tv5\u0004\u001eYl2\b\u001fKu=\u001f\u0019Di9\u0014\u0011Ha.\u0004\u0019B")), m1422z(m1423z("\u00075&U\u001d91kÍ\b95&V\f¢3oC\u0015¢ph@\\,¸t@\\;1u\u0005\u0010.peJ\u0012?\"òI\u0019k4c\u0005\u0010*ppL\u000f\"2oI\u0015?¹&A\u0019k<!d\u001f?9iK>*\"")), m1422z(m1423z("h\u001eOs9\n\u0005Yv3\u001e\u0003Yh9\u0005\u0005Yd,\u001b\u000fGk8\u0019\u001fOa")), m1422z(m1423z("\u0007wGF\b\"?h\u0005>*\"&A\u0019k<g\u0005\u001a.>ìQ\u000e.ph\u0002\u001dk gV\\¢$ï\u0005\u001f9¹ï\u000b")), m1422z(m1423z("\u000e3n@\u001fk4c\u0005\u0010l1vU\u0019'pb@\\'1&H?8iA\u0019k9hS\u001d'9bD\b.\u001fvQ\u0015$>uh\u0019%%&U\u001d9poK\b9?uU\u0019($oJ\u0012e")), m1422z(m1423z("\">pD\u0010\"4gQ\u0019\u0004 rL\u0013%#K@\u0012>")), m1422z(m1423z("\u00071&H?8iA\u0019k#cQ+\">bJ\u000b\u00071J\t?ph@\\/?oQ\\;1u\u0005?\"c\u0005\u001d; cI.puP\u000ek%h@\\-5hÏ\b95&H\u001d39kL\u000f¢5")), m1422z(m1423z("\u000e3n@\u001fk4c\u0005\u0010*puP\f;\"cV\u000f\"?h\u0005\u0018.pj\u0002(?sQ\u0019>\"&A[*>eW\u001d,5(")), m1422z(m1423z("\u0002=vJ\u000f89dI\u0019k4c\u0005\u001f9¹cW\\'5&H\u0013%9r@\t9pb@\\?¹jÌ\u0011¢$tL\u0019k4c\u0005\u0010*p`@\u0012¡$t@R"))};
    private static final int md = C1511l.m10532d(25.0f, 2);
    public static final int nd = 1;
    public static final int sd = C1511l.m10531d();
    private static boolean zd = false;
    private boolean Ad = false;
    private boolean Dd = false;
    private C1156d Ed = null;
    private Activity Fd = null;
    private C1105c Gd = null;
    private boolean Hd = false;
    private C1269c Id = null;
    private boolean Kd = false;
    private String Ld = "";
    private boolean Nd = false;
    private int Od = 0;
    private C1125c Qd = null;
    private ArrayList<C1139c> Sd = null;
    private C1521w Td = null;
    protected C1151p Ud = null;
    private boolean Vd = false;
    private boolean Wd = false;
    private boolean Xd = false;
    private int Zd = 0;
    private int ae = 0;
    private boolean be = false;
    private int ld;
    boolean od = false;
    private ArrayList<C0492a> pd = null;
    private HashMap<C1147a, gc> qd = null;
    private int rd = -2;
    private int td = 100;
    private long ud = C1094e.m7939a();
    private Rect vd = null;
    private C0491d wd = null;
    private int xd = 0;
    boolean yd = false;

    public WDFenetre() {
        this.Cb = isUniteAffichageLogique() ? 2 : 1;
    }

    /* renamed from: a */
    private final void m1410a(int i) {
        Context a;
        Intent intent;
        Throwable e;
        try {
            if (isAvecChampCarteV1()) {
                if (!kb.m3969b()) {
                    WDErreurManager.m2883a(C0745b.m3222b(ce[8], new String[0]));
                    try {
                        if (isAvecActionBar()) {
                            if (!WDProjet.getInstance().isVersionCompatible(C0657a.HONEYCOMB.getNumero())) {
                                WDErreurManager.m2883a(C0745b.m3222b(ce[7], getName(), kb.m3987q()));
                            }
                        }
                        a = C1056i.m7562a();
                        try {
                            intent = new Intent(a, C0735q.m3130e(ce[9] + C0725i.m3031a(getName(), false) + ce[4]));
                            if (i != 0) {
                                try {
                                    intent.setFlags(i);
                                } catch (ClassNotFoundException e2) {
                                    throw e2;
                                } catch (ClassNotFoundException e3) {
                                    e = e3;
                                }
                            }
                        } catch (Throwable e4) {
                            Throwable th = e4;
                            intent = null;
                            e = th;
                            WDErreurManager.m2885a(e);
                            a.startActivity(intent);
                        }
                        a.startActivity(intent);
                    } catch (ClassNotFoundException e5) {
                        throw e5;
                    } catch (ClassNotFoundException e52) {
                        throw e52;
                    }
                }
            }
            try {
                if (isAvecChampCarteV2()) {
                    if (WDProjet.getInstance().isExecDansEmulateur()) {
                        WDErreurManager.m2886a(C0745b.m3222b(ce[6], new String[0]), C0745b.m3222b(ce[5], new String[0]));
                    }
                    try {
                        if (!WDProjet.getInstance().isVersionCompatible(C0657a.FROYO.getNumero())) {
                            WDErreurManager.m2886a(C0745b.m3222b(ce[6], new String[0]), C0745b.m3222b(ce[10], new String[0]));
                        }
                    } catch (ClassNotFoundException e522) {
                        throw e522;
                    }
                }
                if (isAvecActionBar()) {
                    if (WDProjet.getInstance().isVersionCompatible(C0657a.HONEYCOMB.getNumero())) {
                        WDErreurManager.m2883a(C0745b.m3222b(ce[7], getName(), kb.m3987q()));
                    }
                }
                a = C1056i.m7562a();
                intent = new Intent(a, C0735q.m3130e(ce[9] + C0725i.m3031a(getName(), false) + ce[4]));
                if (i != 0) {
                    intent.setFlags(i);
                }
                a.startActivity(intent);
            } catch (ClassNotFoundException e5222) {
                throw e5222;
            } catch (ClassNotFoundException e52222) {
                throw e52222;
            }
        } catch (ClassNotFoundException e522222) {
            throw e522222;
        } catch (ClassNotFoundException e5222222) {
            throw e5222222;
        }
    }

    /* renamed from: a */
    private void m1411a(int i, int i2) {
        try {
            C0691a.m2860a(isMaximisee(), ce[16]);
            Window window = this.Fd != null ? this.Fd.getWindow() : null;
            if (window != null) {
                try {
                    if (this.Hd) {
                        View decorView = window.getDecorView();
                        try {
                            if (this.vd == null) {
                                this.vd = new Rect();
                            }
                            this.vd.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                            window.setLayout((this.vd.left + i) + this.vd.right, (this.vd.top + i2) + this.vd.bottom);
                            return;
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                    window.setLayout(i, i2);
                } catch (WDException e2) {
                    throw e2;
                }
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    private final void m1412a(View view) {
        try {
            if (this.Ed != null) {
                if (view != this.Ed) {
                    try {
                        if (this.Ed.mo3429b() != view) {
                            this.Ed.mo3426a(view);
                        }
                        if (((View) this.Ed).getParent() == null) {
                            view = (View) this.Ed;
                        } else {
                            return;
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
            try {
                if (this.Id != null) {
                    this.Id.mo3510a(this.Fd, view, C1031a.m7467k(this.L));
                    return;
                }
                try {
                    this.Fd.setContentView(view);
                    if (!isMaximisee()) {
                        if (!C1031a.m7473q(this.L)) {
                            appliquerCouleurFond(this.L);
                        }
                    }
                } catch (WDException e2) {
                    throw e2;
                } catch (WDException e22) {
                    throw e22;
                }
            } catch (WDException e222) {
                throw e222;
            }
        } catch (WDException e2222) {
            throw e2222;
        } catch (WDException e22222) {
            throw e22222;
        }
    }

    /* renamed from: a */
    private final void m1413a(C1054f c1054f, Object... objArr) {
        try {
            if (this.pd == null) {
                return;
            }
            if (this.pd.size() != 0) {
                try {
                    if (this.Fd != null) {
                        int size = this.pd.size() - 1;
                        while (size >= 0) {
                            C0492a c0492a = (C0492a) this.pd.get(size);
                            try {
                                switch (C1167s.f3525a[c1054f.ordinal()]) {
                                    case 1:
                                        c0492a.onPause(this.Fd);
                                        break;
                                    case 2:
                                        c0492a.onResume(this.Fd);
                                        break;
                                    case 3:
                                        c0492a.onStart(this.Fd);
                                        break;
                                    case 4:
                                        c0492a.onSelectOption(this.Fd, (MenuItem) objArr[0]);
                                        break;
                                    case 5:
                                        c0492a.onCreate(this.Fd, (Bundle) objArr[0]);
                                        break;
                                    case 6:
                                        c0492a.onStop(this.Fd);
                                        break;
                                    case 7:
                                        c0492a.onFinish(this.Fd);
                                        break;
                                    case 8:
                                        c0492a.onNewIntent(this.Fd, (Intent) objArr[0]);
                                        break;
                                    case 9:
                                        c0492a.onConfigurationChanged(this.Fd, (Configuration) objArr[0]);
                                        break;
                                    case 10:
                                        c0492a.onSaveInstanceState(this.Fd, (Bundle) objArr[0]);
                                        break;
                                    case 11:
                                        c0492a.onLowMemory(this.Fd);
                                        break;
                                    case 12:
                                        c0492a.onDestroy(this.Fd);
                                        break;
                                    case 13:
                                        c0492a.onActivityResult(this.Fd, ((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), (Intent) objArr[2]);
                                        break;
                                    default:
                                        break;
                                }
                                size--;
                            } catch (WDException e) {
                                throw e;
                            }
                        }
                    }
                } catch (WDException e2) {
                    throw e2;
                }
            }
        } catch (WDException e22) {
            throw e22;
        } catch (WDException e222) {
            throw e222;
        }
    }

    /* renamed from: c */
    private View m1414c() {
        return this.Fd.findViewById(16908290);
    }

    /* renamed from: d */
    private final View m1415d() {
        this.Od = 0;
        return this.Ud;
    }

    /* renamed from: e */
    private final Activity m1416e() {
        this.Nd = true;
        return this.Fd;
    }

    /* renamed from: f */
    private void m1417f() {
        try {
            if (this.Fd != null && !this.Fd.isFinishing()) {
                Window window = this.Fd.getWindow();
                LayoutParams attributes = window.getAttributes();
                int i = attributes.softInputMode;
                try {
                    i = (getScrollableView() == null || this.Ad) ? (i & -241) | 32 : (i & -241) | 16;
                    try {
                        if (attributes.softInputMode != i) {
                            window.setSoftInputMode(i);
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                } catch (WDException e2) {
                    throw e2;
                }
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    /* renamed from: g */
    private final boolean m1418g() {
        try {
            return this.dd == C1155i.MODALE;
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: h */
    private final void m1419h() {
        try {
            int k;
            if (this.rd != C0607n.Kw || this.wd == null) {
                k = this.rd != -2 ? C1031a.m7467k(this.rd) : -2;
            } else {
                k = this.wd.getBackgroundColor();
                if (k != -2) {
                    try {
                        if (isMaterialDesign()) {
                            k = C1031a.m7466j(k).mo3315b();
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
            C1014a.m7327b().mo3305a(this.Fd.getWindow(), k);
        } catch (WDException e2) {
            throw e2;
        }
    }

    /* renamed from: i */
    private ViewGroup m1420i() {
        View view = this.Ud;
        try {
            ViewGroup viewGroup;
            if (isMaximisee() && isAvecAscenseurAuto()) {
                C1521w visibleDisplayArea = getVisibleDisplayArea();
                int i = this.Eb;
                int i2 = this.Tb;
                try {
                    View c1164p;
                    Object obj;
                    ViewParent parent;
                    ViewParent parent2;
                    if (i > visibleDisplayArea.f4666a) {
                        if (i2 > visibleDisplayArea.f4667b) {
                            c1164p = !(this.Gd instanceof C1109f) ? new C1164p(this, this.Fd) : (ViewGroup) this.Gd;
                            try {
                                if (c1164p == this.Ud) {
                                    obj = this.Gd == c1164p ? 1 : null;
                                } else {
                                    parent = this.Ud.getParent();
                                    if (parent != null) {
                                        try {
                                            if (parent != this.Gd) {
                                                obj = null;
                                            }
                                        } catch (WDException e) {
                                            throw e;
                                        }
                                    }
                                    i = 1;
                                }
                                if (obj != null) {
                                    parent2 = this.Ud.getParent();
                                    if (parent2 != null) {
                                        try {
                                            if (parent2 instanceof ViewGroup) {
                                                parent = (ViewGroup) this.Gd;
                                                if (parent2 == parent) {
                                                    try {
                                                        if (parent.getParent() != null) {
                                                            ((ViewGroup) parent.getParent()).removeView(parent);
                                                        }
                                                    } catch (WDException e2) {
                                                        throw e2;
                                                    }
                                                }
                                                ((ViewGroup) parent2).removeView(this.Ud);
                                            }
                                        } catch (WDException e22) {
                                            throw e22;
                                        }
                                    }
                                    try {
                                        if (this.Gd != null) {
                                            if (this.Gd != c1164p) {
                                                this.Gd.mo3359d();
                                                this.Gd = null;
                                            }
                                        }
                                        try {
                                            if (c1164p != this.Ud) {
                                                c1164p.addView(this.Ud);
                                                this.Gd = (C1105c) c1164p;
                                                this.Gd.mo3351a((C0510b) this);
                                            }
                                            try {
                                                if (isActionBarVisiblityControlEnabled()) {
                                                    requestActionBarVisibilityControlOnScroll(this);
                                                }
                                                m1412a(c1164p);
                                            } catch (WDException e222) {
                                                throw e222;
                                            }
                                        } catch (WDException e2222) {
                                            throw e2222;
                                        }
                                    } catch (WDException e22222) {
                                        throw e22222;
                                    } catch (WDException e222222) {
                                        throw e222222;
                                    }
                                }
                                viewGroup = c1164p;
                            } catch (WDException e2222222) {
                                throw e2222222;
                            } catch (WDException e22222222) {
                                throw e22222222;
                            }
                        }
                    }
                    try {
                        if (i > visibleDisplayArea.f4666a) {
                            c1164p = !(this.Gd instanceof HorizontalScrollView) ? new C1149d(this, this.Fd) : (ViewGroup) this.Gd;
                        } else {
                            try {
                                if (this.Ad) {
                                    if (i2 <= visibleDisplayArea.f4667b) {
                                        c1164p = view;
                                    }
                                }
                                view = !(this.Gd instanceof C1108e) ? new C1163o(this, this.Fd) : (ViewGroup) this.Gd;
                                try {
                                    if (i2 < visibleDisplayArea.f4667b) {
                                        if (view instanceof C1105c) {
                                            ((C1105c) view).setFillViewport(true);
                                            c1164p = view;
                                        }
                                    }
                                    c1164p = view;
                                } catch (WDException e222222222) {
                                    throw e222222222;
                                } catch (WDException e2222222222) {
                                    throw e2222222222;
                                }
                            } catch (WDException e22222222222) {
                                throw e22222222222;
                            } catch (WDException e222222222222) {
                                throw e222222222222;
                            }
                        }
                        if (c1164p == this.Ud) {
                            parent = this.Ud.getParent();
                            if (parent != null) {
                                if (parent != this.Gd) {
                                    obj = null;
                                }
                            }
                            i = 1;
                        } else if (this.Gd == c1164p) {
                        }
                        if (obj != null) {
                            parent2 = this.Ud.getParent();
                            if (parent2 != null) {
                                if (parent2 instanceof ViewGroup) {
                                    parent = (ViewGroup) this.Gd;
                                    if (parent2 == parent) {
                                        if (parent.getParent() != null) {
                                            ((ViewGroup) parent.getParent()).removeView(parent);
                                        }
                                    }
                                    ((ViewGroup) parent2).removeView(this.Ud);
                                }
                            }
                            if (this.Gd != null) {
                                if (this.Gd != c1164p) {
                                    this.Gd.mo3359d();
                                    this.Gd = null;
                                }
                            }
                            if (c1164p != this.Ud) {
                                c1164p.addView(this.Ud);
                                this.Gd = (C1105c) c1164p;
                                this.Gd.mo3351a((C0510b) this);
                            }
                            if (isActionBarVisiblityControlEnabled()) {
                                requestActionBarVisibilityControlOnScroll(this);
                            }
                            m1412a(c1164p);
                        }
                        viewGroup = c1164p;
                    } catch (WDException e2222222222222) {
                        throw e2222222222222;
                    }
                } catch (WDException e22222222222222) {
                    throw e22222222222222;
                } catch (WDException e222222222222222) {
                    throw e222222222222222;
                }
            }
            try {
                if (this.Ud.getParent() == null) {
                    m1412a(this.Ud);
                }
            } catch (WDException e2222222222222222) {
                throw e2222222222222222;
            }
            m1417f();
            return viewGroup;
        } catch (WDException e22222222222222222) {
            throw e22222222222222222;
        }
    }

    /* renamed from: j */
    private final void m1421j() {
        Drawable drawable = null;
        if (!C0808l.m4053k(this.Ld)) {
            C1104o c1104o = new C1104o();
            c1104o.f3341c = C1094e.m7936a(this.ud, 0);
            c1104o.f3342d = C1094e.m7936a(this.ud, 8);
            c1104o.f3344g = true;
            drawable = C1093d.m7925a(this.Ld, c1104o);
        }
        if (drawable != null) {
            try {
                if (drawable instanceof C1089d) {
                    ((C1089d) drawable).m7916a(this.ud);
                }
            } catch (WDException e) {
                throw e;
            }
        }
        try {
            if (!isMaximisee()) {
                if (C1031a.m7473q(this.L)) {
                    try {
                        this.Fd.getWindow().setBackgroundDrawable(drawable);
                        if (drawable != null) {
                            try {
                                if (C1437c.m10096a(this.Zd)) {
                                    C1014a.m7327b().mo3303a(this.Fd);
                                }
                            } catch (WDException e2) {
                                throw e2;
                            }
                        }
                        this.Hd = false;
                        return;
                    } catch (WDException e22) {
                        throw e22;
                    }
                }
            }
            try {
                this.Ud.setBackgroundDrawable(drawable);
                if (!isMaximisee()) {
                    this.Hd = true;
                    m1411a(this.ld, this.xd);
                }
            } catch (WDException e222) {
                throw e222;
            }
        } catch (WDException e2222) {
            throw e2222;
        } catch (WDException e22222) {
            throw e22222;
        }
    }

    public static final void setIndeterminateProgressBarVisible(boolean z) {
        try {
            if (z != zd) {
                zd = z;
                WDFenetre wDFenetre = (WDFenetre) WDAppelContexte.getContexte().m2722h();
                if (wDFenetre == null) {
                    Activity a = C1056i.m7563a(true);
                    if (a instanceof WDActivite) {
                        wDFenetre = ((WDActivite) a).mo1766b();
                    }
                }
                if (wDFenetre != null) {
                    try {
                        if (wDFenetre.estOuverte()) {
                            wDFenetre.getActivite().setProgressBarIndeterminateVisibility(z);
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

    /* renamed from: z */
    private static String m1422z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 75;
                    break;
                case 1:
                    i2 = 80;
                    break;
                case 2:
                    i2 = 6;
                    break;
                case 3:
                    i2 = 37;
                    break;
                default:
                    i2 = C0607n.Hn;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1423z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.Hn);
        }
        return toCharArray;
    }

    public int _getHauteur() {
        try {
            if (isMaximisee()) {
                try {
                    if (!this.Dd) {
                        return this.Q;
                    }
                    try {
                        return this.Ud != null ? this.Ud.getMeasuredHeight() : 0;
                    } catch (WDException e) {
                        throw e;
                    }
                } catch (WDException e2) {
                    throw e2;
                }
            }
            if (this.Dd) {
                try {
                    Window window = this.Fd != null ? this.Fd.getWindow() : null;
                    if (window != null) {
                        try {
                            return window.getAttributes().height;
                        } catch (WDException e22) {
                            throw e22;
                        }
                    }
                } catch (WDException e222) {
                    throw e222;
                }
            }
            return this.xd;
        } catch (WDException e2222) {
            throw e2222;
        } catch (WDException e22222) {
            throw e22222;
        }
    }

    public int _getHauteurMax() {
        try {
            int i;
            int _getHauteurMax = super._getHauteurMax();
            if (this.Hd) {
                if (this.vd != null) {
                    i = this.vd.top + this.vd.bottom;
                    return i + _getHauteurMax;
                }
            }
            i = 0;
            return i + _getHauteurMax;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public int _getHauteurMin() {
        try {
            int i;
            int _getHauteurMin = super._getHauteurMin();
            if (this.Hd) {
                if (this.vd != null) {
                    i = this.vd.top + this.vd.bottom;
                    return i + _getHauteurMin;
                }
            }
            i = 0;
            return i + _getHauteurMin;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public int _getLargeur() {
        try {
            if (isMaximisee()) {
                try {
                    if (!this.Dd) {
                        return this.T;
                    }
                    try {
                        return this.Ud != null ? this.Ud.getMeasuredWidth() : 0;
                    } catch (WDException e) {
                        throw e;
                    }
                } catch (WDException e2) {
                    throw e2;
                }
            }
            if (this.Dd) {
                try {
                    Window window = this.Fd != null ? this.Fd.getWindow() : null;
                    if (window != null) {
                        try {
                            return window.getAttributes().width;
                        } catch (WDException e22) {
                            throw e22;
                        }
                    }
                } catch (WDException e222) {
                    throw e222;
                }
            }
            return this.ld;
        } catch (WDException e2222) {
            throw e2222;
        } catch (WDException e22222) {
            throw e22222;
        }
    }

    public int _getLargeurMax() {
        try {
            int i;
            int _getLargeurMax = super._getLargeurMax();
            if (this.Hd) {
                if (this.vd != null) {
                    i = this.vd.left + this.vd.right;
                    return i + _getLargeurMax;
                }
            }
            i = 0;
            return i + _getLargeurMax;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public int _getLargeurMin() {
        try {
            int i;
            int _getLargeurMin = super._getLargeurMin();
            if (this.Hd) {
                if (this.vd != null) {
                    i = this.vd.left + this.vd.right;
                    return i + _getLargeurMin;
                }
            }
            i = 0;
            return i + _getLargeurMin;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public int _getLocalX() {
        return this.Ud.getLeft();
    }

    public int _getLocalY() {
        return this.Ud.getTop();
    }

    protected void activationApplication() {
        initialiserAction();
    }

    public void activerGFI() {
    }

    public void activity_OnConfigurationChanged(Configuration configuration) {
        try {
            if (estOuverte()) {
                try {
                    if (this.Qd != null) {
                        this.Qd.m8253d();
                    }
                    m1420i();
                    m1413a(C1054f.CONFIGURATION_CHANGED, configuration);
                    this.Vd = true;
                } catch (WDException e) {
                    throw e;
                }
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void activity_onActivityResult(Activity activity, int i, int i2, Intent intent) {
        m1413a(C1054f.ACTIVITY_RESULT, Integer.valueOf(i), Integer.valueOf(i2), intent);
    }

    public void activity_onCreate(Activity activity, Bundle bundle) {
        this.Fd = activity;
        try {
            super.ouvre(this.dd);
            if (WDProjet.getInstance().isVersionCompatible(C0657a.ECLAIR_0_1.getNumero())) {
                C1404d.m9972a((C0502g) activity, getAnimationFenetre());
            }
            try {
                activity.setProgressBarVisibility(false);
                m1413a(C1054f.CREATE, bundle);
                if (!isMaximisee()) {
                    if (this.yc == 0) {
                        setPositionChamp(this.db, this.B, 0);
                    }
                }
                m1420i();
                this.Ud.setKeepScreenOn(!WDAppManager.m2589p());
                if (getFenetreMere() == null) {
                    WDFenetre wDFenetre = (WDFenetre) WDAppelContexte.getContexte().m2722h();
                    if (wDFenetre != null) {
                        if (wDFenetre.getFenetreMere() != null) {
                            setFenetre(wDFenetre.getFenetreMere());
                        }
                    }
                }
                appliquerAncrage(0, 0, 0, 0, 0);
                boolean z = this.Nd;
                onCreateWindow();
                if (estOuverte()) {
                    appliquerTitreFenetre(this.id);
                    this.gd = true;
                    try {
                        initFenetreInterne();
                        this.Mc.m8365g();
                        this.Mc.m8362d();
                        this.Mc.m8366h();
                    } catch (WDException e) {
                        ferme(false, false, e);
                    }
                    if (estOuverte()) {
                        restaurerValeur();
                        this.od = true;
                        if (this.yd) {
                            activity_onStart(this.Fd);
                        }
                    }
                }
            } catch (WDException e2) {
                throw e2;
            } catch (WDException e22) {
                throw e22;
            }
        } catch (WDException e222) {
            throw e222;
        } catch (WDException e2222) {
            throw e2222;
        } catch (WDException e22222) {
            throw e22222;
        } catch (C0667i e3) {
        } catch (Throwable th) {
            WDErreurManager.m2888b(th);
        }
    }

    public void activity_onCreateOptionsMenu(Activity activity, Menu menu) {
        try {
            if (this.Cc == null) {
                if (this.wd == null) {
                    return;
                }
            }
            creerMenu(menu, this.Cc);
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void activity_onDestroy(Activity activity) {
        m1413a(C1054f.DESTROY, new Object[0]);
        WDIndirection.notifFermetureFenetre(this);
        if (m1418g()) {
            Message.obtain(C0806j.m3954d(), 5182).sendToTarget();
        }
    }

    public void activity_onLowMemory(Activity activity) {
        m1413a(C1054f.LOW_MEMORY, new Object[0]);
    }

    public void activity_onNewIntent(Activity activity, Intent intent) {
        m1413a(C1054f.NEW_INTENT, intent);
    }

    public void activity_onOptionsItemSelected(Activity activity, MenuItem menuItem) {
        m1413a(C1054f.SELECT_OPTION, menuItem);
    }

    public void activity_onPause(Activity activity) {
        try {
            if (this.Sc != null) {
                this.Sc.m7428c();
            }
            m1413a(C1054f.PAUSE, new Object[0]);
        } catch (WDException e) {
            throw e;
        }
    }

    public void activity_onPrepareOptionsMenu(Activity activity, Menu menu) {
    }

    public void activity_onResume(Activity activity) {
        try {
            if (this.Sc != null) {
                this.Sc.m7432g();
            }
            if (this.Fd != null) {
                View currentFocus = this.Fd.getCurrentFocus();
                if (currentFocus == null) {
                    try {
                        C1439b.m10105d().m10102a((C0489p) this);
                    } catch (WDException e) {
                        throw e;
                    }
                }
                Object tag = currentFocus.getTag();
                try {
                    if (tag instanceof gc) {
                        C1439b.m10105d().m10102a((C0489p) (gc) tag);
                    } else {
                        C1439b.m10105d().m10102a(null);
                    }
                } catch (WDException e2) {
                    throw e2;
                }
            }
            activity.setProgressBarIndeterminateVisibility(zd);
            C0938m.m6814b(new C1165q(this));
            m1413a(C1054f.RESUME, new Object[0]);
        } catch (WDException e22) {
            throw e22;
        }
    }

    public void activity_onSaveInstanceState(Activity activity, Bundle bundle) {
        m1413a(C1054f.SAVE_INSTANCE_STATE, bundle);
    }

    public void activity_onStart(Activity activity) {
        try {
            if (this.od) {
                try {
                    this.yd = false;
                    ouvertureFenetre();
                    C0938m.m6814b(new C1159k(this));
                    if (estOuverte()) {
                        try {
                            this.Ud.setOnTouchListener(this);
                            if (isAvecActionBarExt()) {
                                actualiserOptionsMenu();
                            }
                            m1413a(C1054f.START, new Object[0]);
                            updateUI_WL(new WDObjet[0]);
                            return;
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                    return;
                } catch (WDException e2) {
                    throw e2;
                }
            }
            this.yd = true;
        } catch (WDException e22) {
            throw e22;
        }
    }

    public void activity_onStop(Activity activity) {
        m1413a(C1054f.STOP, new Object[0]);
        appelPCode(12);
    }

    public final void actualiserOptionsMenu() {
        if (kb.m3986p() >= C0657a.HONEYCOMB.getNumero()) {
            try {
                Activity.class.getMethod(ce[15], new Class[0]).invoke(this.Fd, new Object[0]);
            } catch (Exception e) {
                C0691a.m2857a(ce[14], e);
            }
        }
    }

    protected void adaptSizeFromChildSizeChange(int i, int i2) {
        setTailleChamp(this.Eb + i, this.Tb + i2, 2);
        C0806j.m3953c();
    }

    public void adapterHauteurPourZML(C0532f c0532f, int i) {
        try {
            if (this.Dd) {
                int i2 = this.xd;
                if (i <= this.xd) {
                    i = Math.max(i, this.Q);
                }
                if (i != this.xd) {
                    boolean isAncrageActif = isAncrageActif();
                    try {
                        setAncrageActif(false);
                        this.Tb = i;
                        this.xd = i;
                        m1420i();
                        if (isAncrageActif) {
                            enableAnchorAfterLayout();
                            return;
                        }
                        return;
                    } catch (WDException e) {
                        throw e;
                    }
                }
                return;
            }
            C0938m.m6816c().post(new C1169u(this, c0532f, i));
        } catch (WDException e2) {
            throw e2;
        }
    }

    public int adjustChildHeightChange(fc fcVar, int i) {
        int adjustChildHeightChange = super.adjustChildHeightChange(fcVar, i);
        try {
            if (isMaximisee()) {
                if (adjustChildHeightChange < 0) {
                    C1521w visibleDisplayArea = getVisibleDisplayArea();
                    int _getHauteur = _getHauteur();
                    if (_getHauteur + adjustChildHeightChange < visibleDisplayArea.m10572b()) {
                        adjustChildHeightChange = visibleDisplayArea.m10572b() - _getHauteur;
                    }
                    if (adjustChildHeightChange > 0) {
                        return 0;
                    }
                } else if (adjustChildHeightChange > 0) {
                    try {
                        if (!isAvecAscenseurAuto()) {
                            return 0;
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
            } else if (adjustChildHeightChange > 0) {
                int _getHauteur2 = _getHauteur();
                C1521w visibleDisplayArea2 = getVisibleDisplayArea();
                if (_getHauteur2 + adjustChildHeightChange > visibleDisplayArea2.m10572b()) {
                    adjustChildHeightChange = visibleDisplayArea2.m10572b() - _getHauteur2;
                }
                if (adjustChildHeightChange < 0) {
                    return 0;
                }
            }
            return adjustChildHeightChange;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public int adjustChildWidthChange(fc fcVar, int i) {
        int adjustChildWidthChange = super.adjustChildWidthChange(fcVar, i);
        try {
            if (isMaximisee()) {
                if (adjustChildWidthChange < 0) {
                    C1521w visibleDisplayArea = getVisibleDisplayArea();
                    int _getLargeur = _getLargeur();
                    if (_getLargeur + adjustChildWidthChange < visibleDisplayArea.m10571a()) {
                        adjustChildWidthChange = visibleDisplayArea.m10571a() - _getLargeur;
                    }
                    if (adjustChildWidthChange > 0) {
                        return 0;
                    }
                } else if (adjustChildWidthChange > 0) {
                    try {
                        if (!isAvecAscenseurAuto()) {
                            return 0;
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
            } else if (adjustChildWidthChange > 0) {
                int _getLargeur2 = _getLargeur();
                C1521w visibleDisplayArea2 = getVisibleDisplayArea();
                if (_getLargeur2 + adjustChildWidthChange > visibleDisplayArea2.m10571a()) {
                    adjustChildWidthChange = visibleDisplayArea2.m10571a() - _getLargeur2;
                }
                if (adjustChildWidthChange < 0) {
                    return 0;
                }
            }
            return adjustChildWidthChange;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void afficherJauge(String str, int i, int i2) {
        if (this.Fd != null) {
            setProgressBarVisible(true);
            this.td = Math.max(0, Math.min(i, 10000));
            this.Fd.getWindow().setFeatureInt(10000, this.td);
            this.Fd.setProgress((int) Math.ceil(((double) Math.max(0, Math.min(i2, this.td))) * (10000.0d / ((double) this.td))));
            C1515p.m10541a();
        }
    }

    public void afficherPremierPlan() {
        try {
            if (this.Fd == null) {
                return;
            }
            if (!this.Fd.isFinishing()) {
                m1410a(131072);
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void ajouterActionBar(C0491d c0491d) {
        try {
            this.wd = c0491d;
            ajouter(this.wd.getName(), (C0489p) this.wd);
            this.wd.setActionBarListener(this);
            if (!isMasquageAutomatiqueActionBar()) {
                return;
            }
            if (getModeActionBar() == 2) {
                this.wd.enableHideOnContentScroll();
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public final void ajouterEcouteurActivite(C0492a c0492a) {
        try {
            if (this.pd == null) {
                this.pd = new ArrayList(5);
            }
            this.pd.add(c0492a);
        } catch (WDException e) {
            throw e;
        }
    }

    public void ajouterEcouteurAncrageFenetre(C1139c c1139c) {
        try {
            if (this.Sd == null) {
                this.Sd = new ArrayList(5);
            }
            this.Sd.add(c1139c);
        } catch (WDException e) {
            throw e;
        }
    }

    public void ajouterFenetreInterne(fb fbVar) {
        super.ajouterFenetreInterne(fbVar);
        C0938m.m6814b(new C1168t(this, fbVar));
    }

    public final void ajouterLettreAppel(int i, int i2, gc gcVar) {
        try {
            if (this.qd == null) {
                this.qd = new HashMap(5);
            }
            this.qd.put(new C1147a(i, i2, true), gcVar);
        } catch (WDException e) {
            throw e;
        }
    }

    protected final void ajouterSlidingMenu(C0526d c0526d, int i) {
        try {
            if (!isMaximisee()) {
                return;
            }
            if (kb.m3980j()) {
                try {
                    if (this.Id == null) {
                        this.Id = c0526d.createLayout(i, this);
                    }
                    ((gc) c0526d).setPere(this);
                    this.Id.mo3515b(c0526d);
                } catch (WDException e) {
                    throw e;
                }
            }
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    protected void appliquerCouleur(int i) {
        if (this.Fd == null) {
        }
    }

    protected void appliquerCouleurFond(int i) {
        try {
            if (isMaximisee()) {
                this.Fd.getWindow().setBackgroundDrawable(new ColorDrawable(C1031a.m7467k(i)));
            } else if (isFenetreCree()) {
                int k = C1031a.m7467k(i);
                if (k == -15132391) {
                    try {
                        if (!isFenetreCree()) {
                            return;
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
                View view = (View) this.Ud.getParent();
                if (view != null) {
                    try {
                        view.setBackgroundColor(k);
                    } catch (WDException e2) {
                        throw e2;
                    }
                }
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    protected void appliquerCouleurFondTransparent() {
        this.Ud.setBackgroundDrawable(null);
        Window window = this.Fd.getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            if (decorView != null) {
                try {
                    decorView.setBackgroundDrawable(null);
                } catch (WDException e) {
                    throw e;
                }
            }
            window.setBackgroundDrawable(null);
        }
    }

    protected void appliquerTitreFenetre(String str) {
        try {
            if (isFenetreCree()) {
                CharSequence a;
                Activity activity = this.Fd;
                if (C1426i.m10042c(str)) {
                    a = C1424g.m10030a(str);
                }
                activity.setTitle(a);
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    protected void appliquerTransparent() {
        if (this.Fd == null) {
        }
    }

    public boolean captureEcran() {
        return false;
    }

    protected void changementOrientation() {
        initialiserAction();
    }

    public void changerCouleurJauge(int i) {
    }

    public C0495i chercherOptionMenu(String str) {
        return null;
    }

    protected void creerFenetre(C1155i c1155i) {
        try {
            this.Ud = new C1152f(this, this.Fd);
            this.Dd = false;
            this.Wd = false;
            this.Td = null;
            this.yd = false;
            super.creerFenetre(c1155i);
            this.od = false;
            this.Ld = "";
            this.Id = null;
            this.ud = C1094e.m7939a();
            this.td = 100;
            if (this.Qd != null) {
                this.Qd.m8252c();
                this.Qd = null;
            }
            try {
                if (WDTelemetrie.m7399e().mo3313h()) {
                    try {
                        this.Sc = new C1029b(WDTelemetrie.m7399e().m7413b(getName()));
                    } catch (Exception e) {
                        C0691a.m2857a(ce[18], e);
                    }
                }
                this.xd = 0;
                this.ld = 0;
                this.Gd = null;
            } catch (WDException e2) {
                throw e2;
            }
        } catch (WDJNIException e3) {
            throw e3;
        }
    }

    public void creerMenu(Menu menu, C0497c c0497c) {
        if (this.Oc != null) {
            Iterator iterateurOptionMenu = getIterateurOptionMenu();
            MenuItem menuItem = null;
            C0495i c0495i = null;
            while (iterateurOptionMenu.hasNext()) {
                C0495i c0495i2 = (C0495i) iterateurOptionMenu.next();
                try {
                    if (c0495i2.getConteneurMenu() == c0497c) {
                        C0495i optionMenuParente;
                        Menu subMenu;
                        if (c0495i2.getOptionMenuParente() != c0495i) {
                            optionMenuParente = c0495i2.getOptionMenuParente();
                            menuItem = null;
                        } else {
                            optionMenuParente = c0495i;
                        }
                        if (optionMenuParente != null) {
                            try {
                                if (optionMenuParente.getOptionMenuParente() != null) {
                                    WDErreurManager.m2883a(C0745b.m3222b(ce[12], new String[0]));
                                }
                                if (menuItem != null) {
                                    try {
                                        if (menuItem.getSubMenu() != null) {
                                            subMenu = menuItem.getSubMenu();
                                        }
                                    } catch (WDException e) {
                                        throw e;
                                    }
                                }
                                subMenu = menu.addSubMenu("");
                                menuItem = subMenu.getItem();
                                optionMenuParente.initOptionMenu(menuItem);
                            } catch (WDException e2) {
                                throw e2;
                            }
                        }
                        subMenu = menu;
                        if (!c0495i2.isAvecSousOption()) {
                            c0495i2.initOptionMenu(subMenu.add(""));
                        }
                        c0495i2 = optionMenuParente;
                    } else {
                        c0495i2 = c0495i;
                    }
                    c0495i = c0495i2;
                } catch (WDException e22) {
                    throw e22;
                }
            }
        }
        try {
            if (this.wd != null) {
                this.wd.onCreateMenu(menu);
            }
        } catch (WDException e222) {
            throw e222;
        }
    }

    protected final void declarerAgencement(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        try {
            if (this.Qd == null) {
                this.Qd = new C1125c(this);
            }
            this.Qd.m8248a(i, i2, i3, i4, i5, i6, i7);
        } catch (WDException e) {
            throw e;
        }
    }

    protected void desactivationApplication() {
        initialiserAction();
    }

    public void desactiverGFI() {
    }

    public boolean estOuverte() {
        try {
            return this.Fd != null;
        } catch (WDException e) {
            throw e;
        }
    }

    protected WDObjet executerPCode(int i) {
        switch (i) {
            case C0607n.Tv /*220*/:
                activationApplication();
                return null;
            case C0607n.Qt /*221*/:
                desactivationApplication();
                return null;
            case 238:
                modifPositionAscenseur();
                return null;
            case C0607n.Fn /*264*/:
                trtChangementAgencement();
                return null;
            case C0607n.f1435S /*1130*/:
                try {
                    changementOrientation();
                    return null;
                } catch (WDException e) {
                    throw e;
                }
            case C0607n.Vh /*1141*/:
                return raffraichissementPTR();
            default:
                return super.executerPCode(i);
        }
    }

    public boolean ferme(boolean z, boolean z2, WDException wDException) {
        try {
            if (estOuverte()) {
                if (WDProjet.getInstance().isFenetreOuverte(this)) {
                    WDFenetre wDFenetre = (WDFenetre) WDAppelContexte.getContexte().m2722h();
                    try {
                        if (!super.ferme(z, z2, wDException)) {
                            return false;
                        }
                        try {
                            this.Gc = false;
                            if (WDTelemetrie.m7399e().mo3313h()) {
                                try {
                                    if (this.Sc != null) {
                                        try {
                                            WDTelemetrie.m7399e().m7416b(this.Sc.m7441i(), this.Sc.m7429d());
                                            this.Sc.mo3309f();
                                            this.Sc = null;
                                        } catch (Exception e) {
                                            C0691a.m2857a(ce[0], e);
                                        }
                                    }
                                } catch (WDException e2) {
                                    throw e2;
                                }
                            }
                            try {
                                this.Wd = true;
                                if (wDException != null) {
                                    if (WDProjet.getInstance().getNbFenetreOuverte() == 0 && WDProjet.getInstance().isApplicationChargee()) {
                                        C0695c.m2911a().m2915a(wDException, null);
                                        wDException = null;
                                    }
                                }
                                try {
                                    if (this.Fd != null) {
                                        if (!((C0502g) this.Fd).mo1770d()) {
                                            try {
                                                if (this.Fd.getCurrentFocus() instanceof EditText) {
                                                    C1503b.m10425a();
                                                }
                                                ((C0502g) this.Fd).mo1769c();
                                                m1413a(C1054f.FINISH, new Object[0]);
                                            } catch (WDJNIException e3) {
                                                throw e3;
                                            }
                                        }
                                    }
                                    try {
                                        this.Fd = null;
                                        if (z) {
                                            WDProjet.getInstance().checkFinApplication(wDException);
                                        }
                                        if (wDException != null) {
                                            try {
                                                throw wDException;
                                            } catch (WDJNIException e32) {
                                                throw e32;
                                            }
                                        }
                                        if (!m1418g()) {
                                            Message.obtain(C0806j.m3954d(), 5182).sendToTarget();
                                        }
                                        if (!z || wDFenetre != this) {
                                            return true;
                                        }
                                        try {
                                            throw new C0667i(this);
                                        } catch (WDJNIException e322) {
                                            throw e322;
                                        }
                                    } catch (WDJNIException e3222) {
                                        throw e3222;
                                    }
                                } catch (WDJNIException e32222) {
                                    throw e32222;
                                } catch (WDJNIException e322222) {
                                    throw e322222;
                                }
                            } catch (WDJNIException e3222222) {
                                throw e3222222;
                            } catch (WDJNIException e32222222) {
                                throw e32222222;
                            }
                        } catch (WDJNIException e322222222) {
                            throw e322222222;
                        }
                    } catch (WDJNIException e3222222222) {
                        throw e3222222222;
                    }
                }
            }
            return false;
        } catch (WDJNIException e32222222222) {
            throw e32222222222;
        } catch (WDJNIException e322222222222) {
            throw e322222222222;
        }
    }

    protected void focusInitial() {
        super.focusInitial();
        if (this.be) {
            gc gcVar = (gc) C1439b.m10105d().m10104b();
            if (gcVar != null) {
                try {
                    if (gcVar.getCompPrincipal().isShown()) {
                        if (gcVar.getCompPrincipal() instanceof EditText) {
                            C0938m.m6816c().postDelayed(new ab(this), 500);
                        }
                    }
                } catch (WDException e) {
                    throw e;
                } catch (WDException e2) {
                    throw e2;
                }
            }
            this.be = false;
        }
    }

    public final C0491d getActionBar() {
        try {
            if (this.wd != null) {
                return this.wd;
            }
            try {
                if (!isAvecActionBarExt()) {
                    return null;
                }
                this.wd = new C1048o(this);
                return this.wd;
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public Activity getActivite() {
        return this.Fd;
    }

    public int getAgencementComparisonFlags() {
        return C1014a.m7327b().mo3306b(this.Fd) ? 1 : 2;
    }

    public final C1125c getAgencementManager() {
        return this.Qd;
    }

    public final int getAnimationFenetre() {
        return this.ae;
    }

    public View getCompConteneur() {
        return this.Ud;
    }

    public View getCompPrincipal() {
        return this.Ud;
    }

    public WDObjet getCouleurBarreSysteme() {
        return new WDEntier4(this.rd);
    }

    public void getDisplaySize(Point point) {
        this.Fd.getWindow().getWindowManager().getDefaultDisplay().getSize(point);
    }

    public fb getFenetreCoulissanteDroite() {
        if (this.Id != null) {
            C0526d a = this.Id.mo3509a(1);
            if (a != null) {
                try {
                    return a.getFenetreInterneChargee();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return null;
    }

    public fb getFenetreCoulissanteGauche() {
        if (this.Id != null) {
            C0526d a = this.Id.mo3509a(0);
            if (a != null) {
                try {
                    return a.getFenetreInterneChargee();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return null;
    }

    public boolean getGFI() {
        return false;
    }

    public final int getHauteurBarreDeTitre() {
        int i = 0;
        if (isAvecActionBarExt()) {
            C0491d actionBar = getActionBar();
            try {
                C0691a.m2860a(actionBar != null, ce[13]);
                if (actionBar != null) {
                    i = actionBar.getHauteurBarre();
                }
            } catch (WDException e) {
                throw e;
            }
        }
        try {
            if (isAvecBarreDeTitre()) {
                i = md;
            }
        } catch (WDException e2) {
            throw e2;
        }
        return i;
    }

    public final int getHauteurBarreSysteme() {
        try {
            return isAvecBarreSystemeExt() ? Cd : 0;
        } catch (WDException e) {
            throw e;
        }
    }

    public WDEntier4 getHauteurUtile() {
        return new WDEntier4((double) C1511l.m10515a((float) _getHauteur(), 1, getDisplayUnit()));
    }

    public final int getIdPCodeEnCours() {
        return this.Od;
    }

    public final int getIdThemeActivity() {
        return this.Zd;
    }

    public WDChaine getImageFond() {
        return new WDChaine(C1094e.m7941a(this.Ld));
    }

    public int getIndexAgencement() {
        try {
            return this.Qd != null ? this.Qd.m8250b() : 0;
        } catch (WDException e) {
            throw e;
        }
    }

    public abstract int getModeActionBar();

    public abstract int getModeBarreSysteme();

    public String getNomGabarit() {
        return "";
    }

    public String getNomType() {
        return C0745b.m3220a(ce[1], new String[0]);
    }

    public gc getPremierChamp() {
        try {
            if (!(this.bd == null || this.bd.isEmpty())) {
                int i = this.Od;
                Iterator it = this.bd.iterator();
                while (it.hasNext()) {
                    gc gcVar = (gc) it.next();
                    if (gcVar != null) {
                        View compPrincipal = gcVar.getCompPrincipal();
                        if (compPrincipal != null && compPrincipal.isEnabled() && compPrincipal.isShown()) {
                            try {
                                if (gcVar.estNavigable(true)) {
                                    return gcVar;
                                }
                            } catch (WDException e) {
                                throw e;
                            }
                        }
                    }
                }
            }
            return null;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public C1225d getProgressBar() {
        return null;
    }

    public View getScrollableView() {
        return (View) this.Gd;
    }

    public final C1269c getSlidingMenuLayout() {
        return this.Id;
    }

    public Object getSupport() {
        return getActivite();
    }

    public Object getUIComp() {
        return this.Fd;
    }

    public WDBooleen getVisible() {
        return new WDBooleen(true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fr.pcsoft.wdjava.ui.utils.C1521w getVisibleDisplayArea() {
        /*
        r10 = this;
        r1 = 1;
        r2 = 0;
        r5 = r10.getHauteurBarreDeTitre();
        r0 = r10.Fd;	 Catch:{ WDException -> 0x007a }
        if (r0 == 0) goto L_0x00c0;
    L_0x000a:
        r0 = r10.Fd;	 Catch:{ WDException -> 0x007a }
        r0 = r0.getWindowManager();	 Catch:{ WDException -> 0x007a }
        if (r0 == 0) goto L_0x00c0;
    L_0x0012:
        r0 = r10.Fd;
        r0 = r0.getWindowManager();
        r0 = r0.getDefaultDisplay();
        r3 = r0.getWidth();
        r6 = r0.getHeight();
        r0 = r10.Fd;
        r0 = r0.getWindow();
        r7 = r0.getDecorView();
        if (r7 == 0) goto L_0x0080;
    L_0x0030:
        r0 = r7.getWidth();	 Catch:{ WDException -> 0x007c }
        if (r0 <= 0) goto L_0x0080;
    L_0x0036:
        r0 = r7.getHeight();	 Catch:{ WDException -> 0x007e }
        if (r0 <= 0) goto L_0x0080;
    L_0x003c:
        r0 = r1;
    L_0x003d:
        if (r0 == 0) goto L_0x0088;
    L_0x003f:
        if (r3 >= r6) goto L_0x0082;
    L_0x0041:
        r4 = r1;
    L_0x0042:
        r0 = r7.getWidth();	 Catch:{ WDException -> 0x0084 }
        r8 = r7.getHeight();	 Catch:{ WDException -> 0x0084 }
        if (r0 >= r8) goto L_0x0086;
    L_0x004c:
        r0 = r1;
    L_0x004d:
        if (r4 != r0) goto L_0x0088;
    L_0x004f:
        if (r1 == 0) goto L_0x008a;
    L_0x0051:
        r1 = new android.graphics.Rect;
        r1.<init>();
        r7.getWindowVisibleDisplayFrame(r1);
        r0 = r1.width();
        r1 = r1.height();
        r2 = r1 - r5;
        r9 = r2;
        r2 = r0;
        r0 = r9;
    L_0x0066:
        r1 = r10.getModeActionBar();	 Catch:{ WDException -> 0x00bb }
        r3 = 2;
        if (r1 != r3) goto L_0x0074;
    L_0x006d:
        r1 = r10.isAvecActionBarExt();	 Catch:{ WDException -> 0x00bb }
        if (r1 == 0) goto L_0x0074;
    L_0x0073:
        r0 = r0 + r5;
    L_0x0074:
        r1 = new fr.pcsoft.wdjava.ui.utils.w;
        r1.<init>(r2, r0);
        return r1;
    L_0x007a:
        r0 = move-exception;
        throw r0;
    L_0x007c:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x007e }
    L_0x007e:
        r0 = move-exception;
        throw r0;
    L_0x0080:
        r0 = r2;
        goto L_0x003d;
    L_0x0082:
        r4 = r2;
        goto L_0x0042;
    L_0x0084:
        r0 = move-exception;
        throw r0;
    L_0x0086:
        r0 = r2;
        goto L_0x004d;
    L_0x0088:
        r1 = r2;
        goto L_0x004f;
    L_0x008a:
        r2 = r6 - r5;
        r0 = r10.isAvecBarreSystemeExt();	 Catch:{ WDException -> 0x00b5 }
        if (r0 == 0) goto L_0x009b;
    L_0x0092:
        r0 = r10.isSystemBarTransparent();	 Catch:{ WDException -> 0x00b5 }
        if (r0 != 0) goto L_0x009b;
    L_0x0098:
        r0 = Cd;
        r2 = r2 - r0;
    L_0x009b:
        r0 = fr.pcsoft.wdjava.core.utils.kb.m3986p();	 Catch:{ WDException -> 0x00b7 }
        r1 = fr.pcsoft.wdjava.core.p042b.C0657a.ICE_CREAM_SANDWICH;	 Catch:{ WDException -> 0x00b7 }
        r1 = r1.getNumero();	 Catch:{ WDException -> 0x00b7 }
        if (r0 < r1) goto L_0x00af;
    L_0x00a7:
        if (r6 >= r3) goto L_0x00af;
    L_0x00a9:
        r0 = fr.pcsoft.wdjava.core.utils.kb.m3981k();	 Catch:{ WDException -> 0x00b9 }
        if (r0 == 0) goto L_0x00bd;
    L_0x00af:
        r0 = sd;
        r2 = r2 - r0;
        r0 = r2;
        r2 = r3;
        goto L_0x0066;
    L_0x00b5:
        r0 = move-exception;
        throw r0;
    L_0x00b7:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00b9 }
    L_0x00b9:
        r0 = move-exception;
        throw r0;
    L_0x00bb:
        r0 = move-exception;
        throw r0;
    L_0x00bd:
        r0 = r2;
        r2 = r3;
        goto L_0x0066;
    L_0x00c0:
        r0 = r2;
        goto L_0x0066;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre.getVisibleDisplayArea():fr.pcsoft.wdjava.ui.utils.w");
    }

    public void iconise() {
    }

    public void installerChamp(nb nbVar) {
        gc gcVar = (gc) nbVar;
        try {
            if (gcVar._getNumTab() == 1) {
                if (gcVar.isChampFocusable()) {
                    gcVar.getCompPrincipal().requestFocus();
                }
            }
            this.Ud.addView(gcVar.getCompConteneur());
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public final boolean isAncrageEnCours() {
        return this.Xd;
    }

    public final boolean isAppelPCodeAutorise(int i) {
        return true;
    }

    public boolean isAvecActionBar() {
        try {
            return getModeActionBar() != 0;
        } catch (WDException e) {
            throw e;
        }
    }

    public final boolean isAvecActionBarExt() {
        try {
            if (isAvecActionBar()) {
                if (isMaximisee()) {
                    try {
                        if (isAvecBarreDeTitre()) {
                            try {
                                if (kb.m3986p() >= C0657a.HONEYCOMB.getNumero()) {
                                    return true;
                                }
                            } catch (WDException e) {
                                throw e;
                            }
                        }
                    } catch (WDException e2) {
                        throw e2;
                    }
                }
            }
            return false;
        } catch (WDException e22) {
            throw e22;
        } catch (WDException e222) {
            throw e222;
        }
    }

    protected boolean isAvecAscenseurAuto() {
        return true;
    }

    public boolean isAvecBarreDeTitre() {
        return true;
    }

    public boolean isAvecBarreSysteme() {
        try {
            return getModeBarreSysteme() != 0;
        } catch (WDException e) {
            throw e;
        }
    }

    public final boolean isAvecBarreSystemeExt() {
        try {
            if (isAvecBarreSysteme()) {
                if (sd != Cd) {
                    return true;
                }
            }
            return false;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    protected boolean isAvecChampCarteV1() {
        return false;
    }

    protected boolean isAvecChampCarteV2() {
        return false;
    }

    public final boolean isBloqueTouchEvent() {
        return this.Wd;
    }

    public boolean isChampFocusable() {
        return true;
    }

    public final boolean isHardwareAccelerated() {
        return this.Kd;
    }

    public boolean isMasquageAutomatiqueActionBar() {
        return false;
    }

    public final boolean isMaterialDesign() {
        return C1437c.m10096a(getIdThemeActivity());
    }

    public boolean isMaximisee() {
        return true;
    }

    public boolean isRefreshViewVisible() {
        try {
            return this.Ed != null ? this.Ed.isRefreshing() : false;
        } catch (WDException e) {
            throw e;
        }
    }

    public final boolean isSlidingMenuVisible(int i) {
        try {
            if (isMaximisee()) {
                try {
                    C0526d a = this.Id != null ? this.Id.mo3509a(i) : null;
                    if (a != null) {
                        try {
                            return this.Id.mo3519d(a);
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                    WDErreurManager.m2883a(C0745b.m3222b(ce[3], new String[0]));
                    return false;
                } catch (WDException e2) {
                    throw e2;
                }
            }
            WDErreurManager.m2883a(C0745b.m3222b(ce[2], new String[0]));
            return false;
        } catch (WDException e22) {
            throw e22;
        }
    }

    public final boolean isSystemBarTransparent() {
        try {
            if (getModeBarreSysteme() == 2) {
                if (WDAppManager.m2592s()) {
                    return true;
                }
            }
            return false;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public final boolean isTailleInitialeFixee() {
        return this.Dd;
    }

    public boolean isThemeDark() {
        return false;
    }

    public void masquerJauge() {
        try {
            if (this.Fd != null) {
                setProgressBarVisible(false);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void maximise() {
    }

    protected void modifPositionAscenseur() {
        initialiserAction();
    }

    public void notifSuppressionChamp(gc gcVar) {
        super.notifSuppressionChamp(gcVar);
        if (this.qd != null) {
            do {
                try {
                } catch (WDException e) {
                    throw e;
                }
            } while (this.qd.values().remove(gcVar));
        }
    }

    public void onAgencementChanged(C1124a c1124a, C1124a c1124a2, int i) {
        int b;
        int c;
        if (c1124a == null) {
            C1124a e = this.Qd.m8254e();
            b = e.m8242b();
            c = e.m8243c();
        } else {
            b = this.Td.m10571a();
            c = this.Td.m10572b();
        }
        b = c1124a2.m8242b() - b;
        int c2 = c1124a2.m8243c() - c;
        if (!(b == 0 && c2 == 0)) {
            try {
                appliquerAncrage(b, c2, 0, 0, 0);
            } catch (WDException e2) {
                throw e2;
            }
        }
        C1521w c1521w = this.Td;
        b = c1124a2.m8242b();
        c1521w.f4666a = b;
        this.Eb = b;
        this.ld = b;
        c1521w = this.Td;
        b = c1124a2.m8243c();
        c1521w.f4667b = b;
        this.Tb = b;
        this.xd = b;
        boolean isFenetreCree = isFenetreCree();
        setFenetreCree(false);
        try {
            setAgencement(i);
        } finally {
            setFenetreCree(isFenetreCree);
        }
    }

    public void onBackgroundColorChanged() {
        try {
            if (this.rd == C0607n.Kw) {
                m1419h();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    @TargetApi(11)
    public void onHideOffsetChanged(ActionBar actionBar, int i) {
        if (getModeActionBar() == 1) {
            View c = m1414c();
            if (c != null) {
                int height = actionBar.getHeight() - i;
                this.Mc.mo3422a(0, c.getPaddingTop() - height);
                c.setPadding(0, height, 0, 0);
            }
        }
    }

    public void onRefresh() {
        appelPCode(C0607n.Vh);
    }

    public void onScrollChanged(C1105c c1105c, int i, int i2, boolean z) {
        try {
            this.Mc.mo3422a(i, i2);
            if (!z) {
                appelPCode(238);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ouvre(fr.pcsoft.wdjava.ui.champs.fenetre.C1155i r9) {
        /*
        r8 = this;
        r2 = 0;
        r8.dd = r9;
        r4 = fr.pcsoft.wdjava.core.application.WDProjet.getInstance();
        r4.notifDemandeOuvertureFenetre();
        r3 = fr.pcsoft.wdjava.core.context.WDAppelContexte.getContexte();
        r3 = r3.m2722h();
        r5 = fr.pcsoft.wdjava.ui.champs.fenetre.C1155i.MODALE;	 Catch:{ WDException -> 0x0051 }
        if (r9 != r5) goto L_0x002f;
    L_0x0016:
        r5 = fr.pcsoft.wdjava.tlm.WDTelemetrie.m7399e();	 Catch:{ WDException -> 0x0053 }
        r5 = r5.mo3313h();	 Catch:{ WDException -> 0x0053 }
        if (r5 == 0) goto L_0x002f;
    L_0x0020:
        if (r3 == 0) goto L_0x002a;
    L_0x0022:
        r0 = r3;
        r0 = (fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre) r0;	 Catch:{ WDException -> 0x0055 }
        r2 = r0;
        r2 = r2.getMonitor();	 Catch:{ WDException -> 0x0055 }
    L_0x002a:
        if (r2 == 0) goto L_0x002f;
    L_0x002c:
        r2.m7440h();	 Catch:{ WDException -> 0x0057 }
    L_0x002f:
        r5 = 0;
        r8.m1410a(r5);	 Catch:{ WDException -> 0x0059 }
        r5 = r4.getNbFenetreOuverte();	 Catch:{ WDException -> 0x0059 }
        if (r5 > 0) goto L_0x003f;
    L_0x0039:
        r4 = r4.isApplicationChargee();	 Catch:{ WDException -> 0x005b }
        if (r4 != 0) goto L_0x0047;
    L_0x003f:
        r4 = 0;
        r6 = 5182; // 0x143e float:7.262E-42 double:2.5602E-320;
        r7 = 1;
        fr.pcsoft.wdjava.core.utils.C0806j.m3950a(r4, r6, r7, r3);	 Catch:{ WDException -> 0x005b }
    L_0x0047:
        if (r2 == 0) goto L_0x0050;
    L_0x0049:
        r3 = fr.pcsoft.wdjava.ui.champs.fenetre.C1155i.MODALE;	 Catch:{ WDException -> 0x005d }
        if (r9 != r3) goto L_0x0050;
    L_0x004d:
        r2.m7442j();	 Catch:{ WDException -> 0x005d }
    L_0x0050:
        return;
    L_0x0051:
        r2 = move-exception;
        throw r2;	 Catch:{ WDException -> 0x0053 }
    L_0x0053:
        r2 = move-exception;
        throw r2;	 Catch:{ WDException -> 0x0055 }
    L_0x0055:
        r2 = move-exception;
        throw r2;
    L_0x0057:
        r2 = move-exception;
        throw r2;
    L_0x0059:
        r2 = move-exception;
        throw r2;	 Catch:{ WDException -> 0x005b }
    L_0x005b:
        r2 = move-exception;
        throw r2;
    L_0x005d:
        r2 = move-exception;
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre.ouvre(fr.pcsoft.wdjava.ui.champs.fenetre.i):void");
    }

    public final void ouvrirMenuPrincipal() {
        try {
            if (this.Fd == null) {
                return;
            }
            if (!this.Fd.isFinishing()) {
                this.Fd.openOptionsMenu();
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public boolean positionner() {
        return false;
    }

    protected WDObjet raffraichissementPTR() {
        initialiserAction();
        return null;
    }

    public void release() {
        try {
            super.release();
            this.Ud = null;
            this.Fd = null;
            this.Ld = null;
            if (this.qd != null) {
                this.qd.clear();
                this.qd = null;
            }
            try {
                if (this.pd != null) {
                    this.pd.clear();
                    this.pd = null;
                }
                try {
                    if (this.Sd != null) {
                        this.Sd.clear();
                        this.Sd = null;
                    }
                    try {
                        if (this.wd != null) {
                            this.wd.release();
                            this.wd = null;
                        }
                        try {
                            this.Td = null;
                            if (this.Id != null) {
                                this.Id.mo3514b();
                                this.Id = null;
                            }
                            try {
                                if (this.Qd != null) {
                                    this.Qd.m8252c();
                                    this.Qd = null;
                                }
                                try {
                                    if (this.Gd != null) {
                                        this.Gd.mo3359d();
                                        this.Gd = null;
                                    }
                                    try {
                                        if (this.Ed != null) {
                                            this.Ed.mo3425a();
                                            this.Ed = null;
                                        }
                                    } catch (WDException e) {
                                        throw e;
                                    }
                                } catch (WDException e2) {
                                    throw e2;
                                }
                            } catch (WDException e22) {
                                throw e22;
                            }
                        } catch (WDException e222) {
                            throw e222;
                        }
                    } catch (WDException e2222) {
                        throw e2222;
                    }
                } catch (WDException e22222) {
                    throw e22222;
                }
            } catch (WDException e222222) {
                throw e222222;
            }
        } catch (WDException e2222222) {
            throw e2222222;
        }
    }

    @TargetApi(21)
    public boolean requestActionBarVisibilityControlOnScroll(Object obj) {
        try {
            if (isAvecActionBarExt()) {
                if (isMasquageAutomatiqueActionBar()) {
                    try {
                        if (kb.m3965a(C0657a.LOLLIPOP)) {
                            if (getModeActionBar() == 1) {
                                C1171d c1172x = new C1172x(this, null);
                                try {
                                    if (obj instanceof C0512g) {
                                        ((C0512g) obj).setHideActionBarOnScrollGestureDetector(c1172x);
                                        return true;
                                    }
                                    try {
                                        if (obj instanceof C1105c) {
                                            ((C1105c) obj).mo3353a(c1172x);
                                            return true;
                                        }
                                        C0691a.m2856a(ce[11]);
                                        return false;
                                    } catch (WDException e) {
                                        throw e;
                                    }
                                } catch (WDException e2) {
                                    throw e2;
                                }
                            }
                            try {
                                if (obj instanceof C0512g) {
                                    ((C0512g) obj).setNestedScrollingEnabled(true);
                                    return true;
                                }
                                try {
                                    if (obj instanceof C1105c) {
                                        ((View) obj).setNestedScrollingEnabled(true);
                                        return true;
                                    }
                                    C0691a.m2856a(ce[11]);
                                    return false;
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
            }
            return false;
        } catch (WDException e22222) {
            throw e22222;
        } catch (WDException e222222) {
            throw e222222;
        }
    }

    public void restaure() {
    }

    public void sauverValeur() {
        super.sauverValeur();
        C0908g.m6434b();
    }

    public final void setAfficheClavierEnOuverture(boolean z) {
        this.be = z;
    }

    protected final void setAgencementEnEdition(int i) {
        try {
            if (this.Qd == null) {
                this.Qd = new C1125c(this);
            }
            this.Qd.m8251b(i);
        } catch (WDException e) {
            throw e;
        }
    }

    protected final void setAnimationFenetre(int i) {
        this.ae = i;
    }

    public final void setBloqueTouchEvent(boolean z) {
        this.Wd = z;
    }

    public void setCouleurBarreSysteme(int i) {
        try {
            this.rd = i;
            if (isFenetreCree()) {
                m1419h();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean setGFI(boolean z) {
        return false;
    }

    public final void setHardwareAccelerated() {
        this.Kd = true;
    }

    public void setHauteurUtile(int i) {
        setTailleUtile(this.ld, C1511l.m10532d((float) i, getDisplayUnit()));
    }

    public void setHideActionBarOnScrollGestureDetector(C1171d c1171d) {
        try {
            if (!isAvecAscenseurAuto()) {
                return;
            }
            if (this.Gd != null) {
                this.Gd.mo3353a(c1171d);
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public final void setIdPCodeEnCours(int i) {
        this.Od = i;
    }

    public final void setIdThemeActivity(int i) {
        this.Zd = i;
    }

    public void setImageFond(String str) {
        setImageFond(str, C1094e.m7938a(C1094e.m7936a(this.ud, 24), C1094e.m7936a(this.ud, 16)), C1094e.m7936a(this.ud, 8), C1094e.m7936a(this.ud, 0));
    }

    public void setImageFond(String str, int i, int i2, int i3) {
        try {
            this.Ld = str;
            this.ud = C1094e.m7940a(this.ud, 0, (byte) i3);
            this.ud = C1094e.m7940a(this.ud, 8, (byte) i2);
            this.ud = C1094e.m7940a(this.ud, 16, (byte) C1094e.m7942b(i));
            this.ud = C1094e.m7940a(this.ud, 24, (byte) C1094e.m7937a(i));
            if (isFenetreCree()) {
                m1421j();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected void setMode9Images(int[] iArr, int i, int i2, int i3, int i4) {
    }

    protected final void setModeClavierCompat22() {
        this.Ad = true;
    }

    @TargetApi(21)
    public void setNestedScrollingEnabled(boolean z) {
        try {
            if (!isAvecAscenseurAuto()) {
                return;
            }
            if (this.Gd != null) {
                ((View) this.Gd).setNestedScrollingEnabled(z);
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public boolean setPositionChamp(int i, int i2, int i3) {
        try {
            if (isMaximisee()) {
                return false;
            }
            Window window = this.Fd.getWindow();
            LayoutParams attributes = window.getAttributes();
            try {
                if (i == attributes.x) {
                    if (i2 == attributes.y) {
                        try {
                            if (attributes.gravity == 51) {
                                return false;
                            }
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                }
                attributes.gravity = 51;
                int d = C1511l.m10532d((float) i, getDisplayUnit());
                attributes.x = d;
                this.nb = d;
                d = C1511l.m10532d((float) i2, getDisplayUnit());
                attributes.y = d;
                this.bb = d;
                window.setAttributes(attributes);
                return true;
            } catch (WDException e2) {
                throw e2;
            } catch (WDException e22) {
                throw e22;
            }
        } catch (WDException e222) {
            throw e222;
        }
    }

    public void setPositionInitiale(int i, int i2) {
        try {
            if (!isMaximisee()) {
                this.db = C1511l.m10532d((float) i, 2);
                this.B = C1511l.m10532d((float) i2, 2);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void setProgressBarVisible(boolean z) {
        try {
            if (isAvecBarreDeTitre()) {
                try {
                    this.Fd.setProgressBarVisibility(z);
                    if (!z) {
                        return;
                    }
                    if (!zd) {
                        this.Fd.setProgressBarIndeterminateVisibility(false);
                    }
                } catch (WDException e) {
                    throw e;
                } catch (WDException e2) {
                    throw e2;
                }
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    protected final void setPullToRefresh(String str, int i) {
        try {
            if (!C0808l.m4053k(str)) {
                if (WDProjet.getInstance().getNomLogiqueFenetreInterne(str) != null) {
                    this.Ed = new C1158j(this, this.Fd, str);
                    ((C1157f) this.Ed).m8391b(true);
                    return;
                }
            }
            this.Ed = new C1488u(this.Fd, C1031a.m7467k(i));
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void setRefreshViewVisible(boolean z) {
        try {
            if (this.Ed != null) {
                this.Ed.mo3428a(z);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public final void setSlidingMenuVisible(int i, boolean z) {
        try {
            if (isMaximisee()) {
                try {
                    C0526d a = this.Id != null ? this.Id.mo3509a(i) : null;
                    if (a == null) {
                        WDErreurManager.m2883a(C0745b.m3222b(ce[3], new String[0]));
                        return;
                    } else if (z) {
                        try {
                            this.Id.mo3512a(a);
                            return;
                        } catch (WDException e) {
                            throw e;
                        }
                    } else {
                        this.Id.mo3517c(a);
                        return;
                    }
                } catch (WDException e2) {
                    throw e2;
                }
            }
            WDErreurManager.m2883a(C0745b.m3222b(ce[2], new String[0]));
        } catch (WDException e22) {
            throw e22;
        }
    }

    public boolean setTailleChamp(int i, int i2, int i3) {
        try {
            this.Eb = i;
            this.Tb = i2;
            if ((i3 & 2) == 0) {
                this.ld = i;
                this.xd = i2;
            }
            boolean isFenetreCree = isFenetreCree();
            Runnable c1148b = new C1148b(this, i, i2, i3, isFenetreCree);
            if (isFenetreCree) {
                try {
                    if (!this.Dd) {
                        C1504c.m10454a(c1148b);
                        return true;
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
            c1148b.run();
            return true;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void setTailleInitiale(int i, int i2) {
        try {
            if (!isFenetreCree()) {
                if (!isMaximisee()) {
                    i -= 4;
                    i2 -= 4;
                }
            }
            super.setTailleInitiale(i, i2);
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void setTailleUtile(int i, int i2) {
        try {
            if (this.Dd) {
                boolean isAncrageActif = isAncrageActif();
                try {
                    setAncrageActif(false);
                    setTailleChamp(i, i2, 0);
                    if (isAncrageActif) {
                        enableAnchorAfterLayout();
                        return;
                    }
                    return;
                } catch (WDException e) {
                    throw e;
                }
            }
            C0938m.m6816c().post(new C1166r(this, i, i2));
        } catch (WDException e2) {
            throw e2;
        }
    }

    public final void setVeilleActive(boolean z) {
        try {
            this.Ud.setKeepScreenOn(!z);
        } catch (WDException e) {
            throw e;
        }
    }

    public void setVisible(boolean z) {
    }

    @TargetApi(21)
    public void stopActionBarVisibilityControlOnScroll(Object obj) {
        try {
            if (!isAvecActionBarExt()) {
                return;
            }
            if (isMasquageAutomatiqueActionBar()) {
                try {
                    if (kb.m3965a(C0657a.LOLLIPOP)) {
                        try {
                            if (getModeActionBar() == 1) {
                                try {
                                    if (obj instanceof C0512g) {
                                        ((C0512g) obj).setHideActionBarOnScrollGestureDetector(null);
                                        return;
                                    }
                                    try {
                                        if (obj instanceof C1105c) {
                                            ((C1105c) obj).mo3353a(null);
                                            return;
                                        }
                                        return;
                                    } catch (WDException e) {
                                        throw e;
                                    }
                                } catch (WDException e2) {
                                    throw e2;
                                }
                            }
                            try {
                                if (obj instanceof C0512g) {
                                    ((C0512g) obj).setNestedScrollingEnabled(false);
                                    return;
                                }
                                try {
                                    if (obj instanceof C1105c) {
                                        ((View) obj).setNestedScrollingEnabled(false);
                                    }
                                } catch (WDException e22) {
                                    throw e22;
                                }
                            } catch (WDException e222) {
                                throw e222;
                            }
                        } catch (WDException e2222) {
                            throw e2222;
                        }
                    }
                } catch (WDException e22222) {
                    throw e22222;
                }
            }
        } catch (WDException e222222) {
            throw e222222;
        } catch (WDException e2222222) {
            throw e2222222;
        }
    }

    public final void supprimerEcouteurActivite(C0492a c0492a) {
        try {
            if (this.pd != null) {
                this.pd.remove(c0492a);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void supprimerEcouteurAncrageFenetre(C1139c c1139c) {
        if (this.Sd != null) {
            C0691a.m2860a(this.Sd.remove(c1139c), ce[17]);
        }
    }

    public void terminerInitialisation() {
        try {
            super.terminerInitialisation();
            if (getModeActionBar() == 1 && kb.m3965a(C0657a.LOLLIPOP)) {
                View c = m1414c();
                if (c != null) {
                    try {
                        if (this.wd != null) {
                            c.setPadding(0, this.wd.getHauteurBarre(), 0, 0);
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
            try {
                if (this.rd != -2) {
                    m1419h();
                }
                try {
                    if (this.Ed != null) {
                        this.Ed.mo3427a((C0514j) this);
                        this.Ud.setClickable(true);
                    }
                    try {
                        m1421j();
                        if (this.Qd != null) {
                            this.Qd.m8253d();
                        }
                    } catch (WDException e2) {
                        throw e2;
                    }
                } catch (WDException e22) {
                    throw e22;
                }
            } catch (WDException e222) {
                throw e222;
            }
        } catch (WDException e2222) {
            throw e2222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean traiterLettreAppel(android.view.KeyEvent r8) {
        /*
        r7 = this;
        r3 = 1;
        r2 = 0;
        r1 = r7.qd;
        if (r1 == 0) goto L_0x005a;
    L_0x0006:
        r1 = r7.qd;
        r4 = new fr.pcsoft.wdjava.ui.champs.fenetre.a;
        r5 = r8.getKeyCode();
        r6 = r8.getMetaState();
        r4.<init>(r5, r6, r2);
        r1 = r1.get(r4);
        r1 = (fr.pcsoft.wdjava.ui.champs.gc) r1;
        if (r1 == 0) goto L_0x005a;
    L_0x001d:
        r4 = r1._getEtat();	 Catch:{ WDException -> 0x0050 }
        if (r4 != 0) goto L_0x005a;
    L_0x0023:
        r4 = r1.getVisible();	 Catch:{ WDException -> 0x0052 }
        r4 = r4.getBoolean();	 Catch:{ WDException -> 0x0052 }
        if (r4 == 0) goto L_0x005a;
    L_0x002d:
        r1.prendreFocus();	 Catch:{ WDException -> 0x0054 }
        r2 = r1.isBouton();	 Catch:{ WDException -> 0x0054 }
        if (r2 != 0) goto L_0x0046;
    L_0x0036:
        r2 = r1.isChampImage();	 Catch:{ WDException -> 0x0056 }
        if (r2 == 0) goto L_0x004e;
    L_0x003c:
        r0 = r1;
        r0 = (fr.pcsoft.wdjava.ui.champs.image.C0520c) r0;	 Catch:{ WDException -> 0x0058 }
        r2 = r0;
        r2 = r2.isClicable();	 Catch:{ WDException -> 0x0058 }
        if (r2 == 0) goto L_0x004e;
    L_0x0046:
        r2 = new fr.pcsoft.wdjava.ui.champs.fenetre.l;	 Catch:{ WDException -> 0x0058 }
        r2.<init>(r7, r1);	 Catch:{ WDException -> 0x0058 }
        fr.pcsoft.wdjava.p032m.C0938m.m6814b(r2);	 Catch:{ WDException -> 0x0058 }
    L_0x004e:
        r1 = r3;
    L_0x004f:
        return r1;
    L_0x0050:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x0052 }
    L_0x0052:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x0054 }
    L_0x0054:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x0056 }
    L_0x0056:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x0058 }
    L_0x0058:
        r1 = move-exception;
        throw r1;
    L_0x005a:
        r1 = r8.getKeyCode();	 Catch:{ WDException -> 0x0077 }
        r4 = 4;
        if (r1 != r4) goto L_0x008f;
    L_0x0061:
        r1 = r7.wd;	 Catch:{ WDException -> 0x0079 }
        if (r1 == 0) goto L_0x007d;
    L_0x0065:
        r1 = r7.wd;	 Catch:{ WDException -> 0x007b }
        r1 = r1.isSearchBarVisible();	 Catch:{ WDException -> 0x007b }
        if (r1 == 0) goto L_0x007d;
    L_0x006d:
        r1 = r7.wd;	 Catch:{ WDException -> 0x007b }
        r2 = 0;
        r4 = "";
        r1.setSearchBarVisible(r2, r4);	 Catch:{ WDException -> 0x007b }
        r1 = r3;
        goto L_0x004f;
    L_0x0077:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x0079 }
    L_0x0079:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x007b }
    L_0x007b:
        r1 = move-exception;
        throw r1;
    L_0x007d:
        r1 = r7.Id;	 Catch:{ WDException -> 0x008b }
        if (r1 == 0) goto L_0x008f;
    L_0x0081:
        r1 = r7.Id;	 Catch:{ WDException -> 0x008d }
        r1 = r1.mo3513a();	 Catch:{ WDException -> 0x008d }
        if (r1 == 0) goto L_0x008f;
    L_0x0089:
        r1 = r3;
        goto L_0x004f;
    L_0x008b:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x008d }
    L_0x008d:
        r1 = move-exception;
        throw r1;
    L_0x008f:
        r1 = r2;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre.traiterLettreAppel(android.view.KeyEvent):boolean");
    }

    protected void trtChangementAgencement() {
        initialiserAction();
    }
}
