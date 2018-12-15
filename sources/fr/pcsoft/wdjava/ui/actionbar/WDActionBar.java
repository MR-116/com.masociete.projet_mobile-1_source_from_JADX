package fr.pcsoft.wdjava.ui.actionbar;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.ActionBar.OnNavigationListener;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0662c;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import fr.pcsoft.wdjava.ui.activite.C0492a;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0509v;
import fr.pcsoft.wdjava.ui.champs.fenetre.C1155i;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.slidingmenu.C1269c;
import fr.pcsoft.wdjava.ui.menu.C0495i;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p065b.C1093d;
import fr.pcsoft.wdjava.ui.p065b.C1094e;
import fr.pcsoft.wdjava.ui.p065b.C1104o;
import fr.pcsoft.wdjava.ui.p065b.p066b.C1089d;
import fr.pcsoft.wdjava.ui.searchbar.C0493a;
import fr.pcsoft.wdjava.ui.searchbar.C1491c;
import fr.pcsoft.wdjava.ui.searchbar.WDSearchHistory;
import fr.pcsoft.wdjava.ui.utils.C1502a;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import fr.pcsoft.wdjava.ui.utils.C1504c;
import fr.pcsoft.wdjava.ui.utils.C1508i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;

@TargetApi(11)
public class WDActionBar extends WDAbstractActionBar implements C0492a, OnNavigationListener, C0493a, AnimatorListener {
    /* renamed from: A */
    private static final int f828A = 458732;
    /* renamed from: H */
    private static final int f829H = 2;
    /* renamed from: O */
    private static final int f830O = 1;
    /* renamed from: P */
    private static final int f831P = 4;
    /* renamed from: S */
    private static final String[] f832S = new String[]{m1314z(m1315z("\fy\u000e\u0000\u00037cK\r\t,e\u000e\u0006\u001f-7J\u0006¹7O\u0010\u001f6tGL¹7BD-:cG\f\u0002yUO\u0011B")), m1314z(m1315z("4CO\u0001?:eA\u000f\u0000\u000f~K\u0014")), m1314z(m1315z("\u0010z^\f\u001f*~L\u000f\tysKC\u00016sG\u0005\u0005<e\u000e\u000f\rytA\u0016\u0000<b\\C\b<7Z\u0006\u0014-r\u000e\u0007\t*7X\f\u0000<c]C\b<7BD-:cG\f\u0002\u001bv\\M")), m1314z(m1315z("0s")), m1314z(m1315z("8yJ\u0011\u00030s")), m1314z(m1315z("8tZ\n\u00037HL\u0002\u001e\u0006cG\u0017\u0000<")), m1314z(m1315z("\u0010z^\f\u001f*~L\u000f\tysKC\b°dO\u0000\u00180aK\u0011L50O\r\u00054vZ\n\u000377]\u0016\u001ey{\t\u0002\n?~M\u000b\r>r\u0001\u000e\r*f[\u0002\u000b<7J\u0006L50o\u0000\u00180x@!\r+9")), m1314z(m1315z("\u001ctF\u0006\u000fysKC\u0000~v^\u0013\t57^\u0002\u001ey~@\u0017\u001e6d^\u0006\u000f-~A\rL=r\u000e\u000f\ryzÇ\u0017\u00046sKC-:cG\f\u0002\u001bv\\@\u001f<cf\u0002\u001f\u001czL\u0006\b=rJ7\r;d")), m1314z(m1315z(",g")), m1314z(m1315z("*rZ0\u00046`f\n\b<V@\n\u00018cG\f\u0002\u001cyO\u0001\u0000<s")), m1314z(m1315z("*rZ+\r*RC\u0001\t=sK\u000788u]")), m1314z(m1315z("zAo/)\fEq5-\u0015^j&3\u001a_o.<\u0006%")), m1314z(m1315z("\u001ce\\\u0006\u0019+7J\u0016\u001e8yZC\u000087C\f\b0qG\u0000\r-~A\rL=r\u000e\u000fK0tA\r\tysKC\u0000~VM\u0017\u00056yl\u0002\u001ew")), m1314z(m1315z("*rZ*\u000f6y")), m1314z(m1315z("\u0018tZ\n\u000377G\r\u001a8{G\u0007\tw")), m1314z(m1315z("\teK\u000e\u0005±eKC\n<yÄ\u0017\u001e<7J\u0016L)eA\t\t-7G\r\t!~]\u0017\r7cKM")), m1314z(m1315z("zG|,<\u0006X~\"/\u0010Ck<-\u001aCg,\"\u001bV|<\"\u0016Yq'%\nGa")), m1314z(m1315z("\u0010z^\f\u001f*~L\u000f\tysKC\u001e°t[\u0013+r\\C\u0000~~@\u0010\u00188yM\u0006L=r\u000e\"\u000f-~A\r.8ex\n\t.7O\u0010\u001f6tG\ty÷\u000e\u000fK\u0018tZ\n\u00037UO\u0011L)v\\C\u00057c\\\f\u001f)rM\u0017\u00056y\u0000")), m1314z(m1315z("\rxA\u000f\u000e8e")), m1314z(m1315z("4VM\u0017\u00056yl\u0002\u001e\u000f~K\u0014")), m1314z(m1315z("4VM\u0017\u00056yx\n\t.")), m1314z(m1315z("4TA\r\u00188~@\u0006\u001e\u000f~K\u0014")), m1314z(m1315z("4ZK\r\u0019\u000f~K\u0014")), m1314z(m1315z("\u0010z^\f\u001f*~L\u000f\tysKC\u00016sG\u0005\u0005<e\u000e\u000f\rytA\u0016\u0000<b\\C\b<7Z\u0006\u0014-r\u000e\u0007\t*7A\u0013\u00180x@\u0010L=r\u000e\u000e\t7b\u000e\u0007\ty{\t\"\u000f-~A\r.8e\u0000")), m1314z(m1315z("\u0010z^\f\u001f*~L\u000f\tysKC\u001e°t[\u0013+r\\C\u0000~~@\u0010\u00188yM\u0006L=r\u000e'\u001e8`O\u0001\u0000<7M\f\u001e+r]\u0013\u00037sO\r\u0018yv[C\n6yJC\b<7BD-:cG\f\u0002\u001bv\\")), m1314z(m1315z("4UO\u0000\u0007>eA\u0016\u0002="))};
    /* renamed from: u */
    private static final int f833u = 11259375;
    /* renamed from: B */
    private boolean f834B;
    /* renamed from: C */
    private String f835C;
    /* renamed from: D */
    private boolean f836D;
    /* renamed from: E */
    private Drawable f837E;
    /* renamed from: F */
    private int f838F;
    /* renamed from: G */
    private LinkedList<WDVoletActionBar> f839G;
    /* renamed from: I */
    private boolean f840I;
    /* renamed from: J */
    private String f841J;
    /* renamed from: K */
    private String f842K;
    /* renamed from: L */
    private int f843L;
    /* renamed from: M */
    private String f844M;
    /* renamed from: N */
    private Animator f845N;
    /* renamed from: Q */
    private WDZoneActionBar f846Q;
    /* renamed from: R */
    private int f847R;
    /* renamed from: o */
    private String f848o;
    /* renamed from: p */
    private ViewGroup f849p;
    /* renamed from: q */
    private int f850q;
    /* renamed from: r */
    private int f851r;
    /* renamed from: s */
    private boolean f852s;
    /* renamed from: t */
    private boolean f853t;
    /* renamed from: v */
    private String f854v;
    /* renamed from: w */
    private boolean f855w;
    /* renamed from: x */
    private C1491c f856x;
    /* renamed from: y */
    private long f857y;
    /* renamed from: z */
    private int f858z;

    public WDActionBar() {
        this.f838F = 1;
        this.f839G = null;
        this.f846Q = null;
        this.f852s = false;
        this.f834B = true;
        this.f842K = null;
        this.f835C = null;
        this.f853t = false;
        this.f855w = false;
        this.f847R = 1;
        this.f840I = false;
        this.f843L = C0607n.Kw;
        this.f858z = C0607n.Kw;
        this.f848o = "";
        this.f857y = C1094e.m7939a();
        this.f844M = null;
        this.f851r = 0;
        this.f856x = null;
        this.f850q = 100;
        this.f837E = null;
        this.f849p = null;
        this.f836D = false;
        this.f845N = null;
        this.n = C1056i.m7562a().getActionBar();
        if (kb.m3981k()) {
            this.n.setNavigationMode(2);
        } else {
            this.n.setNavigationMode(1);
        }
        try {
            Field declaredField;
            if (kb.m3965a(C0657a.LOLLIPOP)) {
                declaredField = this.n.getClass().getDeclaredField(f832S[21]);
                declaredField.setAccessible(true);
                ViewGroup viewGroup = (ViewGroup) declaredField.get(this.n);
                Field declaredField2 = viewGroup.getClass().getDeclaredField(f832S[19]);
                declaredField2.setAccessible(true);
                this.f849p = (ViewGroup) declaredField2.get(viewGroup);
            } else {
                declaredField = this.n.getClass().getDeclaredField(f832S[20]);
                declaredField.setAccessible(true);
                this.f849p = (ViewGroup) declaredField.get(this.n);
            }
            try {
                if (this.f849p == null) {
                    return;
                }
                if (this.f849p.getClass().getSimpleName().equals(f832S[18])) {
                    this.f836D = true;
                }
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e22) {
            C0691a.m2857a(f832S[17], e22);
        }
    }

    /* renamed from: a */
    private final int m1304a() {
        if (this.f858z != C0607n.Kw) {
            return C1031a.m7467k(this.f858z);
        }
        TextView d = m1309d();
        return d != null ? d.getTextColors().getDefaultColor() : -16777216;
    }

    /* renamed from: a */
    private final void m1305a(Drawable drawable) {
        if (this.f837E != null) {
            this.f837E.setCallback(null);
        }
        this.f837E = drawable;
        if (isFenetreCree()) {
            m1312g();
        }
        this.n.setBackgroundDrawable(this.f837E);
    }

    /* renamed from: a */
    private void m1306a(ViewGroup viewGroup) {
        if (this.f840I) {
            if (viewGroup == null) {
                if (this.f849p != null) {
                    viewGroup = this.f849p;
                } else {
                    return;
                }
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ImageView) {
                    if (childAt.getId() != 16908332) {
                        Drawable drawable = ((ImageView) childAt).getDrawable();
                        if (drawable != null) {
                            transformDrawable(drawable);
                        }
                    }
                } else if (childAt instanceof ViewGroup) {
                    m1306a((ViewGroup) childAt);
                }
            }
        }
    }

    /* renamed from: b */
    private final int m1307b() {
        return this.f839G != null ? this.f839G.size() : 0;
    }

    /* renamed from: c */
    private final void m1308c() {
        try {
            if (this.f858z != C0607n.Kw) {
                try {
                    if (this.f849p != null) {
                        int k = C1031a.m7467k(this.f858z);
                        C1503b.m10428a(this.f849p, k, k);
                    }
                } catch (Exception e) {
                    C0691a.m2857a(f832S[2], e);
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* renamed from: d */
    private final TextView m1309d() {
        int identifier;
        if (this.l == null || !this.f836D) {
            WDFenetre wDFenetre = (WDFenetre) getFenetreMere();
            if (wDFenetre != null) {
                identifier = Resources.getSystem().getIdentifier(f832S[5], f832S[3], f832S[4]);
                if (identifier > 0) {
                    Activity activite = wDFenetre.getActivite();
                    if (activite == null) {
                        activite = C1056i.m7562a();
                    }
                    return (TextView) activite.findViewById(identifier);
                }
            }
        }
        int childCount = this.f849p.getChildCount();
        for (identifier = 0; identifier < childCount; identifier++) {
            View childAt = this.f849p.getChildAt(identifier);
            if (childAt instanceof TextView) {
                return (TextView) childAt;
            }
        }
        return null;
    }

    /* renamed from: e */
    private void m1310e() {
        int round = (int) Math.round(((double) this.f850q) * 2.55d);
        try {
            if (this.f837E != null) {
                this.f837E.setAlpha(round);
            } else if (this.f836D) {
                try {
                    Field declaredField = this.f849p.getParent().getClass().getDeclaredField(f832S[25]);
                    declaredField.setAccessible(true);
                    Drawable drawable = (Drawable) declaredField.get(this.f849p.getParent());
                    if (drawable != null) {
                        drawable.mutate();
                        drawable.setAlpha(round);
                    }
                } catch (Exception e) {
                    throw e;
                } catch (Exception e2) {
                    C0691a.m2857a(f832S[24], e2);
                }
            }
        } catch (Exception e22) {
            throw e22;
        }
    }

    /* renamed from: f */
    private final void m1311f() {
        try {
            if (this.f858z == C0607n.Kw) {
                return;
            }
            if (m1307b() != 0) {
                try {
                    Field declaredField = this.n.getClass().getDeclaredField(f832S[1]);
                    declaredField.setAccessible(true);
                    int k = C1031a.m7467k(this.f858z);
                    C1503b.m10428a((ViewGroup) declaredField.get(this.n), k, k);
                } catch (Exception e) {
                    C0691a.m2857a(f832S[2], e);
                }
            }
        } catch (Exception e2) {
            throw e2;
        } catch (Exception e22) {
            throw e22;
        }
    }

    /* renamed from: g */
    private final void m1312g() {
        if (this.f837E != null && this.f850q < 100) {
            if (!WDProjet.getInstance().isVersionCompatible(C0657a.JELLY_BEAN_MR1.getNumero())) {
                this.f837E.setCallback(new C1038e(this));
            }
            m1310e();
        }
    }

    /* renamed from: h */
    private final void m1313h() {
        try {
            if (this.f858z != C0607n.Kw && this.f849p != null) {
                try {
                    Field declaredField = this.f849p.getClass().getSuperclass().getDeclaredField(f832S[22]);
                    declaredField.setAccessible(true);
                    int k = C1031a.m7467k(this.f858z);
                    C1503b.m10428a((ViewGroup) declaredField.get(this.f849p), k, k);
                } catch (Exception e) {
                    C0691a.m2857a(f832S[23], e);
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* renamed from: z */
    private static String m1314z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 89;
                    break;
                case 1:
                    i2 = 23;
                    break;
                case 2:
                    i2 = 46;
                    break;
                case 3:
                    i2 = 99;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1315z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 108);
        }
        return toCharArray;
    }

    /* renamed from: a */
    final Drawable m1316a(String str) {
        if (C0808l.m4053k(str)) {
            return null;
        }
        Drawable a = C1093d.m7924a(str);
        transformDrawable(a);
        return a;
    }

    /* renamed from: a */
    void m1317a(WDVoletActionBar wDVoletActionBar) {
        if (this.f846Q != null) {
            if (this.f846Q.isSwipeEnbaled()) {
                int indexOf = this.f839G != null ? this.f839G.indexOf(wDVoletActionBar) : -1;
                if (indexOf >= 0 && this.f846Q.getPositionFenetreInterne() != indexOf) {
                    boolean z = !this.f852s && this.f846Q.isAnimationOnTabChanged();
                    this.f846Q.setPositionFenetreInterne(indexOf, false, z);
                }
            } else {
                this.f846Q.setFenetreInterne(wDVoletActionBar.m7523c());
            }
        }
        if (!(this.f852s || this.f834B)) {
            appelPCode(17);
        }
        this.f834B = false;
        this.f852s = false;
    }

    protected void ajouterVolet(WDVoletActionBar wDVoletActionBar) {
        if (this.f839G == null) {
            this.f839G = new LinkedList();
        }
        this.f839G.add(wDVoletActionBar);
        wDVoletActionBar.m7521a(this);
        if (this.n.getNavigationMode() == 2) {
            Tab b = wDVoletActionBar.m7522b();
            b.setTabListener(wDVoletActionBar);
            this.n.addTab(b);
        }
        if (this.f846Q != null && this.f846Q.isSwipeEnbaled()) {
            this.f846Q.ajouterFenetreInterne(wDVoletActionBar.m7523c(), new WDObjet[0]);
        }
    }

    @TargetApi(21)
    public final void enableHideOnContentScroll() {
        if (kb.m3965a(C0657a.LOLLIPOP)) {
            this.n.setHideOnContentScrollEnabled(true);
        }
    }

    protected WDObjet executerPCode(int i) {
        switch (i) {
            case C0607n.Yw /*229*/:
                clicSurBoutonDroit();
                return null;
            case C0607n.Au /*239*/:
                modifRecherche();
                return null;
            case 240:
                validationRecherche();
                return null;
            default:
                return super.executerPCode(i);
        }
    }

    public WDObjet get(int i) {
        int b = m1307b();
        if (i > 0 && i <= b) {
            return (WDObjet) this.f839G.get(i - 1);
        }
        WDErreurManager.m2883a(C0745b.m3222b(f832S[11], String.valueOf(i), getName(), "1", String.valueOf(b)));
        return null;
    }

    public int getActionHome() {
        return this.f838F;
    }

    public int getBackgroundColor() {
        return this.f837E instanceof ColorDrawable ? ((ColorDrawable) this.f837E).getColor() : this.f843L != C0607n.Kw ? C1031a.m7467k(this.f843L) : -2;
    }

    public WDEntier4 getCouleur() {
        int couleurTitre = getCouleurTitre();
        return new WDEntier4(couleurTitre != 0 ? C1031a.m7461e(couleurTitre) : 0);
    }

    public WDEntier4 getCouleurFond() {
        return new WDEntier4(this.f843L);
    }

    public final int getCouleurTitre() {
        TextView d = m1309d();
        return d != null ? d.getTextColors().getDefaultColor() : -16777216;
    }

    @TargetApi(21)
    public final int getHideOffset() {
        return kb.m3965a(C0657a.LOLLIPOP) ? this.n.getHideOffset() : 0;
    }

    public WDChaine getImage() {
        return new WDChaine(this.f844M);
    }

    public WDChaine getImageFond() {
        return new WDChaine(C1094e.m7941a(this.f848o));
    }

    public WDChaine getNote() {
        return this.f842K == null ? new WDChaine() : new WDChaine(this.f842K);
    }

    public WDObjet getOpacite() {
        return new WDEntier4(this.f850q);
    }

    public WDChaine getTitreNote() {
        return this.f835C == null ? new WDChaine() : new WDChaine(this.f835C);
    }

    public WDObjet getValeur() {
        return m1307b() == 0 ? new WDEntier4(0) : new WDEntier4(this.n.getSelectedNavigationIndex() + 1);
    }

    public WDObjet getValeurRecherche() {
        return new WDChaine(this.f856x != null ? this.f856x.m10348a() : "");
    }

    public View getView() {
        return this.f849p;
    }

    public WDBooleen getVisible() {
        return new WDBooleen(isShown());
    }

    @TargetApi(21)
    public void hide() {
        if (kb.m3965a(C0657a.LOLLIPOP)) {
            if (this.f845N != null) {
                this.f845N.cancel();
            }
            int hideOffset = this.n.getHideOffset();
            int height = this.n.getHeight();
            if (hideOffset < height) {
                this.f845N = new C1044k(this, hideOffset, height, null);
                this.f845N.start();
                return;
            }
            return;
        }
        this.n.hide();
    }

    public boolean isActionBarDefaut() {
        return false;
    }

    public boolean isEvaluable() {
        return true;
    }

    public boolean isSearchBarVisible() {
        return this.f856x != null ? this.f856x.m10354d() : false;
    }

    public boolean isSearchHistoryEnabled() {
        return (this.f851r & 2) > 0;
    }

    @TargetApi(21)
    public final boolean isShown() {
        return kb.m3965a(C0657a.LOLLIPOP) ? this.n.getHideOffset() < this.n.getHeight() : this.n.isShowing();
    }

    protected void modifRecherche() {
        initialiserAction();
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
    }

    public void onAnimationCancel(Animator animator) {
        if (animator == this.f845N) {
            this.f845N = null;
        }
    }

    public void onAnimationEnd(Animator animator) {
        if (animator == this.f845N) {
            this.f845N = null;
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onConfigurationChanged(Activity activity, Configuration configuration) {
        if (this.f858z != C0607n.Kw && !this.f836D) {
            TextView d = m1309d();
            if (d != null) {
                d.setTextColor(f833u);
            }
            C1504c.m10454a(new C1047n(this));
        }
    }

    public void onCreate(Activity activity, Bundle bundle) {
    }

    public void onCreateMenu(Menu menu) {
        if (this.f855w) {
            MenuItem add = menu.add(0, f828A, 0, this.f854v);
            Drawable a = m1316a(this.f841J);
            if (a == null && C0808l.m4053k(this.f854v)) {
                a = WDAppManager.m2569b().getDrawable(17301573);
                transformDrawable(a);
            }
            if (a != null) {
                add.setIcon(a);
            }
            add.setShowAsAction(6);
        }
        if (this.f858z != C0607n.Kw) {
            C0938m.m6816c().postAtFrontOfQueue(new C1042i(this));
        }
        if ((this.f851r & 1) > 0) {
            if (this.f856x != null) {
                this.f856x.m10352b();
                this.f856x = null;
            }
            this.f856x = new C1491c(C1056i.m7562a(), menu, this);
            this.f856x.m10350a((C0493a) this);
        }
        this.f851r |= 4;
    }

    public void onDestroy(Activity activity) {
    }

    public void onFinish(Activity activity) {
    }

    public void onInitOptionMenu(C0495i c0495i, MenuItem menuItem, int i) {
        super.onInitOptionMenu(c0495i, menuItem, i);
        boolean z = this.f840I;
        try {
            if (c0495i.isAvecIconePredefinie()) {
            }
            transformDrawable(menuItem.getIcon());
            this.f840I = z;
        } finally {
            this.f840I = z;
        }
    }

    public void onItemVisibilityChanged(C0495i c0495i, MenuItem menuItem, int i, boolean z) {
        if (z && i != 0) {
            CharSequence title = menuItem.getTitle();
            if ((title != null ? title.toString() : null) == null) {
                return;
            }
            if (menuItem.getIcon() == null || i == 4) {
                m1308c();
            }
        }
    }

    public void onLowMemory(Activity activity) {
    }

    public boolean onNavigationItemSelected(int i, long j) {
        WDVoletActionBar wDVoletActionBar = (WDVoletActionBar) this.f839G.get(i);
        if (wDVoletActionBar != null) {
            m1317a(wDVoletActionBar);
        }
        return true;
    }

    public void onNewIntent(Activity activity, Intent intent) {
    }

    public void onPause(Activity activity) {
    }

    public void onQuerySubmit(String str) {
        if (this.l != null) {
            if (isSearchHistoryEnabled() && !C0808l.m4053k(str)) {
                WDSearchHistory.m10342a(this.l.getNomFenetre(), str.trim());
            }
            C0938m.m6814b(new C1039f(this));
        }
    }

    public void onQueryTextChangedFromUser() {
        C0938m.m6814b(new C1046m(this));
    }

    public void onResume(Activity activity) {
        boolean z = true;
        if (this.f838F == 1 && this.f853t) {
            ActionBar actionBar = this.n;
            if (WDProjet.getInstance().getNbFenetreOuverte() <= 1) {
                z = false;
            }
            actionBar.setDisplayHomeAsUpEnabled(z);
        }
    }

    public void onSaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onSearchCancelled(boolean z) {
        if (!z) {
            C0938m.m6814b(new C1036a(this));
        }
    }

    public void onSearchViewShown() {
        m1306a(null);
        if (this.f856x != null && this.f840I) {
            Drawable c = this.f856x.m10353c();
            if (c != null) {
                transformDrawable(c);
            }
        }
    }

    public void onSelectOption(Activity activity, MenuItem menuItem) {
        boolean z = true;
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            itemId = this.f838F;
            appelPCode(18);
        } else if (itemId == f828A) {
            itemId = this.f847R;
            appelPCode(C0607n.Yw);
        } else {
            return;
        }
        WDFenetre wDFenetre;
        switch (itemId) {
            case 1:
                try {
                    if (WDProjet.getInstance().getNbFenetreOuverte() > 1) {
                        wDFenetre = (WDFenetre) getFenetreMere();
                        if (wDFenetre != null) {
                            try {
                                wDFenetre.ferme(true, true, null);
                                return;
                            } catch (C0662c e) {
                                throw e;
                            }
                        }
                        return;
                    }
                    this.n.setDisplayHomeAsUpEnabled(false);
                    return;
                } catch (C0662c e2) {
                    throw e2;
                }
            case 2:
                String nomPremiereFenetre = WDProjet.getInstance().getNomPremiereFenetre();
                if (nomPremiereFenetre != null) {
                    try {
                        if (!nomPremiereFenetre.equals("")) {
                            try {
                                wDFenetre = (WDFenetre) C1502a.m10415a(new WDChaine(nomPremiereFenetre), false, false);
                                if (wDFenetre.estOuverte()) {
                                    if (wDFenetre.getFenetreMere() == null) {
                                        WDProjet.getInstance().fermerToutesFenetres(false, wDFenetre);
                                        return;
                                    }
                                }
                                try {
                                    C0509v.ouvrirFenetre(wDFenetre, C1155i.UTILISE, null);
                                    return;
                                } catch (C0662c e3) {
                                    return;
                                }
                            } catch (C0662c e22) {
                                throw e22;
                            } catch (C0662c e222) {
                                throw e222;
                            } catch (Exception e4) {
                                C0691a.m2857a(f832S[15], e4);
                                return;
                            }
                        }
                        return;
                    } catch (C0662c e2222) {
                        throw e2222;
                    }
                }
                return;
            case 3:
            case 4:
                wDFenetre = (WDFenetre) getFenetreMere();
                if (wDFenetre != null) {
                    C1269c slidingMenuLayout = wDFenetre.getSlidingMenuLayout();
                    if (slidingMenuLayout == null) {
                        return;
                    }
                    if (itemId == 4) {
                        try {
                            slidingMenuLayout.mo3516c();
                            return;
                        } catch (C0662c e22222) {
                            throw e22222;
                        }
                    }
                    slidingMenuLayout.mo3518d();
                    return;
                }
                return;
            default:
                try {
                    if (this.f838F != 0) {
                        z = false;
                    }
                    C0691a.m2860a(z, f832S[14]);
                    return;
                } catch (C0662c e222222) {
                    throw e222222;
                }
        }
    }

    public void onStart(Activity activity) {
    }

    public void onStop(Activity activity) {
    }

    public void release() {
        super.release();
        if (!(this.f839G == null || this.f839G.isEmpty())) {
            Iterator it = this.f839G.iterator();
            while (it.hasNext()) {
                ((WDVoletActionBar) it.next()).release();
            }
            this.f839G.clear();
            this.f839G = null;
        }
        if (this.f846Q != null) {
            this.f846Q.release();
            this.f846Q = null;
        }
        if (this.f856x != null) {
            this.f856x.m10352b();
            this.f856x = null;
        }
        this.f837E = null;
        this.f849p = null;
        if (this.f845N != null) {
            this.f845N.cancel();
        }
    }

    protected final void setActionHome(int i) {
        this.f838F = i;
    }

    public void setCouleur(int i) {
        if ((i != this.f858z ? 1 : 0) != 0) {
            this.f858z = i;
        }
        if (i != C0607n.Kw) {
            TextView d = m1309d();
            if (d != null) {
                if (d.getTextColors().getDefaultColor() == f833u) {
                    C1504c.m10454a(new C1043j(this));
                    return;
                }
                d.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
            if (isFenetreCree()) {
                m1308c();
            }
        }
    }

    public void setCouleurFond(int i) {
        if (i != C0607n.Kw) {
            this.f843L = i;
            if (this.f848o == null || this.f848o.equals("")) {
                m1305a(new ColorDrawable(C1031a.m7467k(i)));
                if (this.m != null) {
                    this.m.onBackgroundColorChanged();
                }
            }
        }
    }

    public void setFenetre(C0508h c0508h) {
        super.setFenetre(c0508h);
        ((WDFenetre) c0508h).ajouterEcouteurActivite(this);
        if (((WDFenetre) c0508h).getModeActionBar() == 2) {
            this.f850q = 0;
        }
    }

    @TargetApi(21)
    public boolean setHideOffset(int i) {
        if (!kb.m3965a(C0657a.LOLLIPOP)) {
            return false;
        }
        if (i < 0) {
            i = 0;
        } else if (i > this.n.getHeight()) {
            i = this.n.getHeight();
        }
        if (this.n.getHideOffset() == i) {
            return false;
        }
        this.n.setHideOffset(i);
        if (this.m != null) {
            this.m.onHideOffsetChanged(this.n, this.n.getHideOffset());
        }
        return true;
    }

    public void setImage(String str) {
        try {
            this.f844M = str;
            Drawable a = !C0808l.m4053k(this.f844M) ? C1093d.m7924a(this.f844M) : null;
            try {
                if (this.f836D) {
                    if (this.f838F != 2) {
                        try {
                            if (this.f838F != 0) {
                                if (a != null) {
                                    try {
                                        this.n.setDisplayShowHomeEnabled(true);
                                    } catch (Exception e) {
                                        throw e;
                                    }
                                }
                                this.f844M = "";
                                return;
                            }
                        } catch (Exception e2) {
                            throw e2;
                        }
                    }
                    Drawable drawable = a == null ? WDAppManager.m2569b().getDrawable(WDProjet.getInstance().getIdIconeApplication()) : a;
                    C1014a.m7327b().mo3304a(this.f849p, drawable != null ? new C1041h(this, drawable) : drawable);
                    return;
                }
                if (a != null) {
                    try {
                        if (WDProjet.getInstance().isVersionCompatible(C0657a.ICE_CREAM_SANDWICH.getNumero())) {
                            try {
                                ActionBar.class.getMethod(f832S[13], new Class[]{Drawable.class}).invoke(this.n, new Object[]{a});
                                return;
                            } catch (Exception e22) {
                                C0691a.m2857a(f832S[12], e22);
                                return;
                            }
                        }
                        return;
                    } catch (Exception e222) {
                        throw e222;
                    }
                }
                this.f844M = "";
                if (WDProjet.getInstance().isVersionCompatible(C0657a.ICE_CREAM_SANDWICH.getNumero())) {
                    try {
                        ActionBar.class.getMethod(f832S[13], new Class[]{Integer.TYPE}).invoke(this.n, new Object[]{Integer.valueOf(WDProjet.getInstance().getIdIconeApplication())});
                    } catch (Exception e2222) {
                        C0691a.m2857a(f832S[12], e2222);
                    }
                }
            } catch (Exception e22222) {
                throw e22222;
            } catch (Exception e222222) {
                throw e222222;
            }
        } catch (Exception e2222222) {
            throw e2222222;
        }
    }

    public void setImageFond(String str) {
        setImageFond(str, C1094e.m7938a(C1094e.m7936a(this.f857y, 24), C1094e.m7936a(this.f857y, 16)), C1094e.m7936a(this.f857y, 8), C1094e.m7936a(this.f857y, 0));
    }

    public void setImageFond(String str, int i, int i2, int i3) {
        Drawable drawable;
        this.f848o = str;
        this.f857y = C1094e.m7940a(this.f857y, 0, (byte) i3);
        this.f857y = C1094e.m7940a(this.f857y, 8, (byte) i2);
        this.f857y = C1094e.m7940a(this.f857y, 16, (byte) C1094e.m7942b(i));
        this.f857y = C1094e.m7940a(this.f857y, 24, (byte) C1094e.m7937a(i));
        if (str.equals("")) {
            drawable = null;
        } else {
            C1104o c1104o = new C1104o();
            c1104o.f3341c = i3;
            c1104o.f3342d = i2;
            c1104o.f3344g = true;
            drawable = C1093d.m7925a(str, c1104o);
        }
        if (drawable != null) {
            if (drawable instanceof C1089d) {
                ((C1089d) drawable).m7916a(this.f857y);
            }
            m1305a(drawable);
            return;
        }
        this.f848o = "";
        if (this.f843L != C0607n.Kw) {
            setCouleurFond(this.f843L);
        } else if (isFenetreCree()) {
            m1305a(null);
        }
    }

    public void setNote(String str) {
        this.f842K = str;
    }

    protected final void setNote(String str, String str2) {
        this.f842K = str2;
        this.f835C = str;
    }

    public void setOpacite(int i) {
        if (this.l == null || ((WDFenetre) this.l).getModeActionBar() != 2) {
            WDErreurManager.m2883a(C0745b.m3222b(f832S[16], new String[0]));
        }
        int min = Math.min(100, Math.max(0, i));
        if (this.f850q != min) {
            this.f850q = min;
            TextView d = m1309d();
            if (d != null) {
                d.setAlpha(((float) this.f850q) / 100.0f);
            }
            m1310e();
        }
    }

    protected final void setParamBoutonDroit(boolean z, int i, String str, String str2) {
        this.f855w = z;
        this.f847R = i;
        this.f841J = str2;
        this.f854v = str;
    }

    protected final void setParamBoutonGauche(boolean z, int i, String str, String str2) {
        this.f853t = z;
        this.f838F = i;
        if (!this.f836D) {
            if (z && !C0808l.m4053k(str2)) {
                setImage(str2);
            }
            this.n.setDisplayShowHomeEnabled(z);
            C1014a.m7327b().mo3297b(((WDFenetre) this.l).getActivite(), true);
        } else if (z) {
            setImage(str2);
        }
    }

    protected final void setParamRecherche(boolean z) {
        if (WDProjet.getInstance().isVersionCompatible(C0657a.ICE_CREAM_SANDWICH.getNumero())) {
            this.f851r |= 1;
            if (z) {
                this.f851r |= 2;
            }
        }
    }

    public void setSearchBarVisible(boolean z, String str) {
        if ((this.f851r & 4) == 0) {
            if (z) {
                C0938m.m6816c().post(new C1049p(this, z, str));
            }
        } else if (this.f856x == null) {
            super.setSearchBarVisible(z, str);
        } else if (z) {
            this.f856x.m10349a(this, str);
        } else {
            this.f856x.m10355e();
        }
    }

    public void setSelectedTab(int i, boolean z) {
        int b = m1307b();
        if (b != 0 && i >= 0 && i < b && i != this.n.getSelectedNavigationIndex()) {
            this.f852s = !z;
            this.n.setSelectedNavigationItem(i);
        }
    }

    protected final void setStyleActionBar(int i, int i2, boolean z) {
        setCouleur(i);
        setCouleurFond(i2);
        this.f840I = z;
    }

    public void setTitreNote(String str) {
        this.f835C = str;
    }

    public void setValeur(int i) {
        setSelectedTab(C0725i.m3011a(i), false);
    }

    public void setValeur(WDObjet wDObjet) {
        setValeur(wDObjet.getInt());
    }

    public void setValeurRecherche(String str) {
        if (this.f856x != null) {
            this.f856x.m10351a(str);
        }
    }

    public void setVisible(boolean z) {
        if (z) {
            show();
        } else {
            hide();
        }
    }

    protected final void setZone(WDZoneActionBar wDZoneActionBar) {
        C0691a.m2860a(this.f846Q == null, f832S[0]);
        this.f846Q = wDZoneActionBar;
        this.f846Q.setActionBar(this);
    }

    @TargetApi(21)
    public void show() {
        if (kb.m3965a(C0657a.LOLLIPOP)) {
            if (this.f845N != null) {
                this.f845N.cancel();
            }
            int hideOffset = this.n.getHideOffset();
            if (hideOffset > 0) {
                this.f845N = new C1044k(this, hideOffset, 0, null);
                this.f845N.start();
                return;
            }
            return;
        }
        this.n.show();
    }

    @TargetApi(18)
    public void terminerInitialisation() {
        super.terminerInitialisation();
        if (!kb.m3965a(C0657a.LOLLIPOP)) {
            try {
                this.n.getClass().getDeclaredMethod(f832S[9], new Class[]{Boolean.TYPE}).invoke(this.n, new Object[]{Boolean.valueOf(false)});
            } catch (Exception e) {
                C0691a.m2857a(f832S[6], e);
            }
        }
        try {
            if (m1307b() > 0) {
                this.n.setDisplayOptions(0, 8);
                if (this.n.getNavigationMode() == 1) {
                    SpinnerAdapter arrayAdapter = new ArrayAdapter(C1056i.m7562a(), 17367048, this.f839G);
                    arrayAdapter.setDropDownViewResource(17367050);
                    this.n.setListNavigationCallbacks(arrayAdapter, this);
                }
                try {
                    Method declaredMethod = this.n.getClass().getDeclaredMethod(f832S[10], new Class[]{Boolean.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.n, new Object[]{Boolean.valueOf(true)});
                } catch (Exception e2) {
                    C0691a.m2857a(f832S[7], e2);
                }
            } else {
                this.n.setNavigationMode(0);
            }
            if (this.f850q < 100) {
                TextView d = m1309d();
                if (d != null) {
                    try {
                        d.setAlpha(((float) this.f850q) / 100.0f);
                    } catch (Exception e22) {
                        throw e22;
                    }
                }
                try {
                    if (this.f837E != null) {
                        m1312g();
                    } else {
                        m1310e();
                    }
                } catch (Exception e222) {
                    throw e222;
                }
            }
            try {
                if (this.f837E != null) {
                    m1312g();
                }
            } catch (Exception e2222) {
                throw e2222;
            }
            try {
                if (this.f838F == 1) {
                    if (this.f840I) {
                        try {
                            if (((WDFenetre) this.l).isMaterialDesign()) {
                                C0938m.m6816c().post(new C1045l(this));
                            } else {
                                int identifier = WDAppManager.m2569b().getIdentifier(f832S[8], f832S[3], f832S[4]);
                                if (identifier > 0) {
                                    ImageView imageView = (ImageView) C1056i.m7562a().findViewById(identifier);
                                    if (imageView != null) {
                                        Drawable drawable = imageView.getDrawable();
                                        drawable.mutate();
                                        transformDrawable(drawable);
                                    }
                                }
                            }
                        } catch (Exception e22222) {
                            throw e22222;
                        }
                    }
                }
                m1308c();
            } catch (Exception e222222) {
                throw e222222;
            } catch (Exception e2222222) {
                throw e2222222;
            }
        } catch (Exception e22222222) {
            throw e22222222;
        }
    }

    public final void transformDrawable(Drawable drawable) {
        if (drawable != null && this.f840I) {
            C1508i.m10488a(drawable, m1304a());
        }
    }

    protected void validationRecherche() {
        initialiserAction();
    }
}
