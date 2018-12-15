package fr.pcsoft.wdjava.ui.menu;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import fr.pcsoft.wdjava.api.WDAPIMenu;
import fr.pcsoft.wdjava.core.C0723g;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.ressources.C0743a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.actionbar.C0491d;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.p065b.C1093d;
import fr.pcsoft.wdjava.ui.p065b.C1104o;

@C0723g(a = {WDAPIMenu.class})
public class WDOptionMenu extends C0496h {
    /* renamed from: A */
    private static final String f866A = m1326z(m1327z("UB\u0003}\u000eHH3r2_N0p\b_U5s\u0003"));
    /* renamed from: C */
    private static final int f867C = 0;
    /* renamed from: D */
    private static final String f868D = m1326z(m1327z("UB\u0003}\u000eHH3r2RD$h"));
    /* renamed from: E */
    private static final String f869E = m1326z(m1327z("UB\u0003}\u000eHH3r2UL,s\u001fH@2h"));
    /* renamed from: F */
    private static final int f870F = 2;
    /* renamed from: G */
    private static final String f871G = m1326z(m1327z("UB\u0003}\u000eHH3r2ND1s\u001bY"));
    /* renamed from: H */
    private static final String f872H = m1326z(m1327z("UB\u0003}\u000eHH3r2RD+"));
    /* renamed from: I */
    private static final String f873I = m1326z(m1327z("UB\u0003}\u000eHH3r2ND:n\bOI"));
    /* renamed from: J */
    private static final String f874J = m1326z(m1327z("UB\u0003}\u000eHH3r2L@)o\b"));
    /* renamed from: K */
    private static final String f875K = m1326z(m1327z("UB\u0003}\u000eHH3r2LS9j\u0004ST/"));
    /* renamed from: L */
    private static final String f876L = m1326z(m1327z("UB\u0003}\u000eHH3r2XH/\fNE"));
    /* renamed from: M */
    private static final String f877M = m1326z(m1327z("UB\u0003}\u000eHH3r2_@1y\u001f]"));
    /* renamed from: N */
    private static final String f878N = m1326z(m1327z("UB\u0003}\u000eHH3r2OD=n\u000eT"));
    /* renamed from: O */
    private static final String f879O = m1326z(m1327z("UB\u0003}\u000eHH3r2LM=e"));
    /* renamed from: Q */
    private static final String[] f880Q;
    /* renamed from: s */
    private static final int f881s = 1;
    /* renamed from: t */
    private static final String f882t = m1326z(m1327z("UB\u0003}\u000eHH3r2YE5h"));
    /* renamed from: u */
    private static final int f883u = 4;
    /* renamed from: y */
    private static final String f884y = m1326z(m1327z("UB\u0003}\u000eHH3r2OD2x2RN+"));
    /* renamed from: z */
    private static final String f885z = m1326z(m1327z("UB\u0003}\u000eHH3r2ND,p\u0014"));
    /* renamed from: B */
    private MenuItem f886B = null;
    /* renamed from: P */
    private boolean f887P = false;
    /* renamed from: v */
    private int f888v = 0;
    /* renamed from: w */
    private int f889w = -1;
    /* renamed from: x */
    private boolean f890x = false;

    static {
        String[] strArr = new String[2];
        strArr[0] = m1326z(m1327z("\u001fl\u0019R8"));
        strArr[1] = m1326z(m1327z("\u001fn\fH$so\u0003Q(rt"));
        f880Q = strArr;
    }

    public WDOptionMenu(boolean z) {
        boolean z2 = false;
        super(z);
        if (!z) {
            z2 = true;
        }
        this.f890x = z2;
    }

    public WDOptionMenu(boolean z, boolean z2) {
        boolean z3 = false;
        super(z, z2);
        if (!z) {
            z3 = true;
        }
        this.f890x = z3;
    }

    /* renamed from: a */
    private void m1320a(MenuItem menuItem, int i) {
        if (menuItem != null) {
            switch (i) {
                case 0:
                    menuItem.setEnabled(true);
                    menuItem.setVisible(true);
                    return;
                case 1:
                    menuItem.setEnabled(true);
                    menuItem.setVisible(true);
                    return;
                case 2:
                    menuItem.setVisible(false);
                    return;
                case 4:
                    menuItem.setEnabled(false);
                    menuItem.setVisible(true);
                    return;
                case 16384:
                    setEtat(0);
                    setVisible(true);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    private final void m1321a(MenuItem menuItem, Drawable drawable) {
        menuItem.setIcon(drawable);
        if (drawable != null && menuItem.getSubMenu() != null) {
            menuItem.getSubMenu().setHeaderIcon(drawable);
        }
    }

    /* renamed from: a */
    private void m1322a(MenuItem menuItem, String str) {
        if (menuItem != null) {
            menuItem.setTitle(str);
            menuItem.setTitleCondensed(str);
        }
    }

    /* renamed from: a */
    private void m1323a(MenuItem menuItem, boolean z) {
        if (menuItem == null) {
            return;
        }
        if (z) {
            menuItem.setCheckable(true);
            menuItem.setChecked(true);
            return;
        }
        menuItem.setChecked(false);
        menuItem.setCheckable(false);
    }

    /* renamed from: b */
    private void m1324b(MenuItem menuItem, String str) {
        if (menuItem == null) {
            return;
        }
        if (this.f889w > 0) {
            m1321a(menuItem, WDAppManager.m2569b().getDrawable(this.f889w));
        } else if (!str.equals("")) {
            C1104o c1104o = new C1104o();
            c1104o.f3340b = false;
            m1321a(menuItem, C1093d.m7925a(str, c1104o));
        } else if (menuItem.getSubMenu() != null) {
            menuItem.setIcon(17301573);
        } else {
            menuItem.setIcon(null);
        }
    }

    /* renamed from: b */
    private void m1325b(MenuItem menuItem, boolean z) {
        if (menuItem != null && menuItem.isVisible() != z) {
            menuItem.setVisible(this.f887P);
            if (this.f886B != null) {
                WDFenetre wDFenetre = (WDFenetre) getFenetreMere();
                C0491d actionBar = wDFenetre != null ? wDFenetre.getActionBar() : null;
                if (actionBar != null) {
                    actionBar.onItemVisibilityChanged(this, menuItem, this.f888v, z);
                }
            }
        }
    }

    /* renamed from: z */
    private static String m1326z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 60;
                    break;
                case 1:
                    i2 = 33;
                    break;
                case 2:
                    i2 = 92;
                    break;
                case 3:
                    i2 = 28;
                    break;
                default:
                    i2 = 109;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1327z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 109);
        }
        return toCharArray;
    }

    public void activerEcouteurSelectionMenu() {
    }

    protected int ajouterOptionMenu(WDOptionMenu wDOptionMenu) {
        wDOptionMenu.setOptionMenuParente(this);
        if (wDOptionMenu.getFenetreMere() != null) {
            ((WDFenetre) wDOptionMenu.getFenetreMere()).ajouterOptionMenu(wDOptionMenu);
        }
        if (this.p != null) {
            this.p.notifAjoutOptionMenu(wDOptionMenu);
        }
        return -1;
    }

    protected void appliquerLibelle(String str, int i) {
        m1322a(null, str);
        if (this.f886B != null) {
            m1322a(this.f886B, str);
        }
    }

    public WDEntier4 getEtat() {
        return !getVisible().getBoolean() ? new WDEntier4(2) : new WDEntier4(this.d);
    }

    public WDChaine getImage() {
        return new WDChaine(this.m);
    }

    public int getNbSousOptions() {
        return 0;
    }

    public String getNomType() {
        return !this.f890x ? C0745b.m3220a(f880Q[1], new String[0]) : C0745b.m3220a(f880Q[0], new String[0]);
    }

    public WDBooleen getVisible() {
        return new WDBooleen(this.f887P);
    }

    public void initOptionMenu(MenuItem menuItem) {
        m1320a(menuItem, this.d);
        m1322a(menuItem, this.q);
        m1324b(menuItem, this.m);
        m1325b(menuItem, this.f887P);
        m1323a(menuItem, this.r);
        menuItem.setOnMenuItemClickListener(new C1468a(this));
        if (this.p != null && (this.p instanceof C0498d)) {
            this.f886B = menuItem;
            WDFenetre wDFenetre = (WDFenetre) getFenetreMere();
            C0491d actionBar = wDFenetre != null ? wDFenetre.getActionBar() : null;
            if (actionBar != null) {
                actionBar.onInitOptionMenu(this, menuItem, this.f888v);
            }
        }
    }

    public boolean isAvecIconePredefinie() {
        return this.f889w > 0;
    }

    public final boolean isAvecSousOption() {
        return this.f890x;
    }

    public void release() {
        super.release();
        this.f886B = null;
    }

    protected final void setAffichageDansActionBar(boolean z) {
        this.f888v = z ? 1 : 0;
    }

    public void setCochee(boolean z) {
        super.setCochee(z);
        if (this.f886B != null) {
            m1323a(this.f886B, z);
        }
    }

    public void setEtat(int i) {
        this.d = i;
        if (this.f886B != null) {
            m1320a(this.f886B, i);
        }
    }

    protected final void setIconePredefinie(int i) {
        String str = null;
        switch (i) {
            case 0:
                setLibelle(WDAppManager.m2569b().getString(17039370));
                return;
            case 4:
                str = f872H;
                break;
            case 5:
                str = f882t;
                break;
            case 6:
                str = f885z;
                break;
            case 7:
                str = f884y;
                break;
            case 8:
                str = f866A;
                break;
            case 9:
                str = f869E;
                break;
            case 10:
                str = f878N;
                break;
            case 11:
                str = f873I;
                break;
            case 12:
                str = f871G;
                break;
            case 13:
                str = f877M;
                break;
            case 14:
                str = f876L;
                break;
            case 15:
                str = f879O;
                break;
            case 16:
                str = f874J;
                break;
            case 17:
                str = f875K;
                break;
            case 18:
                str = f868D;
                break;
        }
        if (!C0808l.m4053k(str)) {
            this.f889w = C0743a.m3206c(str);
        }
    }

    public void setImage(String str) {
        super.setImage(str);
        if (this.f886B != null) {
            m1324b(this.f886B, str);
        }
    }

    protected void setModeAffichageActionBar(int i, boolean z) {
        if (isAvecSousOption()) {
            this.f888v = 0;
            return;
        }
        this.f888v = i;
        if (z) {
            this.f888v |= 4;
        }
    }

    public void setVisible(boolean z) {
        this.f887P = z;
        if (this.f886B != null) {
            m1325b(this.f886B, z);
        }
    }
}
