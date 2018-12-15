package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDParametre;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.actionbar.C0512g;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.champs.C0546j;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.gesture.C1171d;
import fr.pcsoft.wdjava.ui.p033c.C0510b;
import fr.pcsoft.wdjava.ui.p033c.C1105c;
import fr.pcsoft.wdjava.ui.p033c.C1108e;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import fr.pcsoft.wdjava.ui.utils.C1504c;

public class WDChampFenetreInterneExt extends gb implements OnPageChangeListener, C0510b, C0512g {
    private static final int Hc = 23;
    private static final int Ic = 26;
    private static final int Jc = 24;
    private static final int Kc = 22;
    private static final int Lc = 29;
    private static final int Nc = 25;
    private static final int Oc = 28;
    private static final String[] Pc = new String[]{m7528z(m7529z("^I\b^$/P\u001fE1\"U\u001fR (K\u001fN'8L\u0016T")), m7528z(m7529z("5p³c\u0015\u000fz2x\u0011]p4g\u0015\u0011p>tZ")), m7528z(m7529z("^V\u0018[1)F\u0014^:\"M\b^!+\\")), m7528z(m7529z("<w3|\u0015\tp5T\u0013v41\u0007\bi*~\u0006\tð?"))};
    protected nb Gc = creerModeleDonnees();
    protected C1188r Mc;

    public WDChampFenetreInterneExt() {
        this.Mc.setAdapter((PagerAdapter) this.Gc);
    }

    /* renamed from: a */
    private C1108e m7524a(WDFenetreInterne wDFenetreInterne) {
        if (wDFenetreInterne == null) {
            wDFenetreInterne = this.Ec;
        }
        ViewParent parent = (wDFenetreInterne == null || wDFenetreInterne.getCompConteneur() == null) ? null : wDFenetreInterne.getCompConteneur().getParent();
        while (parent != null && parent != this.Mc) {
            if (parent instanceof C1108e) {
                return (C1108e) parent;
            }
            parent = parent.getParent();
        }
        return null;
    }

    /* renamed from: a */
    private final pb m7525a(String str, int i, WDObjet... wDObjetArr) {
        if (i < 0) {
            i = 0;
        }
        int d = this.Gc.mo3444d();
        if (d == 0 || i >= d) {
            return m7526a(str, wDObjetArr);
        }
        boolean z = i == getPositionFenetreInterne();
        pb pbVar = new pb(str, wDObjetArr);
        this.Gc.mo3439a(pbVar, i);
        if (z) {
            setPositionFenetreInterne(i, false, false);
        }
        return pbVar;
    }

    /* renamed from: a */
    private final pb m7526a(String str, WDObjet... wDObjetArr) {
        pb pbVar = new pb(str, wDObjetArr);
        this.Gc.mo3438a(pbVar);
        return pbVar;
    }

    /* renamed from: a */
    private final void m7527a(int i, String str, WDObjet[] wDObjetArr) {
        this.Gc.mo3437a(i, new pb(str, wDObjetArr));
    }

    /* renamed from: z */
    private static String m7528z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 125;
                    break;
                case 1:
                    i2 = 25;
                    break;
                case 2:
                    i2 = 90;
                    break;
                case 3:
                    i2 = 17;
                    break;
                default:
                    i2 = 116;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7529z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 116);
        }
        return toCharArray;
    }

    public int _getHauteurUtile() {
        return (this.Ec == null || !isAvecAscenseurAuto()) ? ((View) this.Mc).getHeight() : this.Ec._getHauteurInitiale();
    }

    public int _getLargeurUtile() {
        return (this.Ec == null || !isAvecAscenseurAuto()) ? ((View) this.Mc).getWidth() : this.Ec._getLargeurInitiale();
    }

    public final boolean afficherFenetreInternePrecedente() {
        int positionFenetreInterne = getPositionFenetreInterne();
        if (positionFenetreInterne <= 0) {
            return false;
        }
        setPositionFenetreInterne(positionFenetreInterne - 1, false, true);
        return true;
    }

    public final boolean afficherFenetreInterneSuivante() {
        int positionFenetreInterne = getPositionFenetreInterne();
        if (positionFenetreInterne < 0 || positionFenetreInterne >= getNbFenetreInterne() - 1) {
            return false;
        }
        setPositionFenetreInterne(positionFenetreInterne + 1, false, true);
        return true;
    }

    public final int ajouterFenetreInterne(String str, WDObjet... wDObjetArr) {
        if (!C0808l.m4053k(str) && hb.getClasseGenFenetreInterne(str) == null) {
            WDErreurManager.m2883a(C0745b.m3222b(Pc[2], str));
        }
        WDParametre.traiterParametreTraitementNonBloquant(wDObjetArr);
        pb a = m7526a(str, wDObjetArr);
        return a != null ? a.m8506b() : 0;
    }

    protected void appliquerCouleur(int i) {
    }

    protected void appliquerTransparent() {
    }

    protected boolean canScroll(int i, int i2) {
        if (this.Ec == null) {
            return false;
        }
        if (super.canScroll(i, i2)) {
            return true;
        }
        if (!isAvecAscenseurAuto() || Math.abs(i2) <= Math.abs(i)) {
            return Math.abs(i) > Math.abs(i2) ? ((View) this.Mc).canScrollHorizontally(i) : false;
        } else {
            C1105c a = m7524a(null);
            if (a == null || !a.canScrollVertically(i2)) {
                return false;
            }
            ((View) a).getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
    }

    protected void creerComposant() {
        Context a = C1056i.m7562a();
        this.Mc = isBalayageVertical() ? new C1189p(a) : new C1193v(a);
        this.Mc.setOnPageChangeListener(this);
        ((ViewGroup) getCompConteneur()).addView((View) this.Mc);
    }

    protected nb creerModeleDonnees() {
        return new ob(this, null);
    }

    protected void dechargerFenetreInterne(WDFenetreInterne wDFenetreInterne) {
        if (getNbFenetreInterne() <= 1 || this.Ec == wDFenetreInterne) {
            super.dechargerFenetreInterne(wDFenetreInterne);
            return;
        }
        WDFenetreInterne wDFenetreInterne2 = this.Ec;
        try {
            this.Ec = wDFenetreInterne;
            super.dechargerFenetreInterne(wDFenetreInterne);
        } finally {
            this.Ec = wDFenetreInterne2;
        }
    }

    protected void desinstallerFenetreInterne(WDFenetreInterne wDFenetreInterne) {
        View compConteneur = wDFenetreInterne.getCompConteneur();
        if (compConteneur != null) {
            View view = (ViewGroup) this.Mc;
            while (view.indexOfChild(compConteneur) < 0 && view != compConteneur) {
                compConteneur = (View) compConteneur.getParent();
            }
            C0691a.m2860a(view != compConteneur, Pc[1]);
            view.removeView(compConteneur);
            compConteneur.setTag(null);
        }
    }

    protected WDObjet executerPCode(int i) {
        switch (i) {
            case 238:
                modifPositionAscenseur();
                return null;
            default:
                return super.executerPCode(i);
        }
    }

    public WDBooleen getBalayageActif() {
        return new WDBooleen(this.Mc.mo3452a());
    }

    public WDObjet getBalayageVertical() {
        return new WDBooleen(isBalayageVertical());
    }

    public View getCompPrincipal() {
        return (View) this.Mc;
    }

    public int getNbFenetreInterne() {
        return this.Gc.mo3444d();
    }

    public final int getPositionFenetreInterne() {
        return this.Mc.getCurrentItem();
    }

    public int getScrollPosition(boolean z) {
        if (!z) {
            return -1;
        }
        C1108e a = m7524a(null);
        return a != null ? a.mo3349a() : -1;
    }

    public View getScrollableView() {
        return (View) this.Mc;
    }

    protected void initialiserFenetreInterne(WDFenetreInterne wDFenetreInterne, WDObjet[] wDObjetArr) {
        C0938m.m6812a(new C1180g(this, wDFenetreInterne, wDObjetArr), true);
    }

    public boolean insererFenetreInterne(String str, int i, WDObjet... wDObjetArr) {
        if (!C0808l.m4053k(str) && hb.getClasseGenFenetreInterne(str) == null) {
            WDErreurManager.m2883a(C0745b.m3222b(Pc[2], str));
        }
        WDParametre.traiterParametreTraitementNonBloquant(wDObjetArr);
        return m7525a(str, i, wDObjetArr) != null;
    }

    protected void installerFenetreInterne(WDFenetreInterne wDFenetreInterne) {
        if (isFenetreCree()) {
            View view;
            View view2 = (ViewGroup) this.Mc;
            if (isAvecAscenseurAuto()) {
                View c1108e = new C1108e(C1056i.m7562a());
                c1108e.mo3351a((C0510b) this);
                if (isActionBarVisiblityControlEnabled()) {
                    ((WDFenetre) this.l).requestActionBarVisibilityControlOnScroll(c1108e);
                }
                C1503b.m10448b(c1108e, C1503b.m10442b(view2), C1503b.m10449c(view2));
                C1503b.m10434a((C1108e) c1108e, wDFenetreInterne.getCompConteneur(), wDFenetreInterne._getLargeur(), _getLargeur(), isCanScrollHorizontally());
                view = c1108e;
            } else {
                view = wDFenetreInterne.getCompConteneur();
                C1503b.m10448b(wDFenetreInterne.getCompConteneur(), view2.getLayoutParams().width, view2.getLayoutParams().height);
            }
            view2.addView(view);
        }
    }

    protected boolean isAvecParcoursAuto() {
        return false;
    }

    protected boolean isBalayageVertical() {
        return false;
    }

    public boolean isChampFocusable() {
        return true;
    }

    protected boolean isInterceptTouchEventForScroll() {
        return !super.isInterceptTouchEventForScroll() ? _getEtat() == 0 && getNbFenetreInterne() >= 1 : true;
    }

    public void majParcoursAuto(String str) {
    }

    protected void modifPositionAscenseur() {
        initialiserAction();
    }

    public void onFinInit(fb fbVar) {
        if (getNbFenetreInterne() <= 1 || this.Ec == fbVar) {
            super.onFinInit(fbVar);
            return;
        }
        WDFenetreInterne wDFenetreInterne = this.Ec;
        try {
            this.Ec = (WDFenetreInterne) fbVar;
            super.onFinInit(fbVar);
        } finally {
            this.Ec = wDFenetreInterne;
        }
    }

    protected void onPageAffichee(pb pbVar, boolean z) {
        onChangementFenetreInterne(pbVar.m8503a());
        if (z) {
            appelPCode_TLM(33, 13);
        }
    }

    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            C1504c.m10454a(new C1187o(this));
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
    }

    public void onScrollChanged(C1105c c1105c, int i, int i2, boolean z) {
        pb pbVar = (pb) ((View) c1105c).getTag();
        if (pbVar != null) {
            WDFenetreInterne a = pbVar.m8503a();
            if (!(a == null || a.isReleased())) {
                this.Ec.getConteneurManager().mo3422a(i, i2);
            }
        }
        if (!z) {
            appelPCode(238);
            if (this.Ec != null) {
                this.Ec.appelPCode(238);
            }
        }
    }

    public void parcourirChamp(C0546j c0546j, boolean z) {
        int d = this.Gc.mo3444d();
        for (int i = 0; i < d; i++) {
            pb b = this.Gc.mo3442b(i);
            WDFenetreInterne a = b != null ? b.m8503a() : null;
            if (a != null) {
                a.parcourirChamp(c0546j, z);
            }
        }
    }

    public void parcourirObjetAPCode(C0546j c0546j, boolean z) {
        int d = this.Gc.mo3444d();
        for (int i = 0; i < d; i++) {
            pb b = this.Gc.mo3442b(i);
            WDFenetreInterne a = b != null ? b.m8503a() : null;
            if (a != null) {
                a.parcourirObjetAPCode(c0546j, z);
            }
        }
    }

    protected void postInit() {
        super.postInit();
        if (!isAvecParcoursAuto()) {
            this.Gc.mo3445e();
        }
    }

    public void release() {
        super.release();
        if (this.Mc != null) {
            this.Mc = null;
        }
        if (this.Gc != null) {
            this.Gc.mo3447g();
            this.Gc = null;
        }
    }

    public void setBalayageActif(boolean z) {
        this.Mc.mo3451a(z);
    }

    public void setBalayageVertical(boolean z) {
        WDErreurManager.m2883a(C0745b.m3222b(Pc[0], EWDPropriete.PROP_BALAYAGEVERTICAL.getNom()));
    }

    public void setFenetreInterne(String str, WDObjet[] wDObjetArr) {
        WDParametre.traiterParametreTraitementNonBloquant(wDObjetArr);
        if (isFenetreCree() && this.Gc.mo3444d() != 0) {
            m7527a(this.Mc.getCurrentItem(), str, wDObjetArr);
        } else if (!C0808l.m4053k(str)) {
            pb a = m7526a(str, wDObjetArr);
            if (!isFenetreCree()) {
                WDFenetreInterne chargerFenetreInterne = chargerFenetreInterne(str, wDObjetArr);
                if (chargerFenetreInterne != null) {
                    a.m8505a(chargerFenetreInterne);
                }
            }
        }
    }

    public void setHideActionBarOnScrollGestureDetector(C1171d c1171d) {
        if (isAvecAscenseurAuto()) {
            int childCount = ((ViewGroup) this.Mc).getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ((ViewGroup) this.Mc).getChildAt(i);
                if (childAt instanceof C1105c) {
                    ((C1105c) childAt).mo3353a(c1171d);
                }
            }
        }
    }

    protected void setNbFenetreAvantRecyclage(int i) {
        this.Mc.setOffscreenPageLimit(Math.max(3, i) / 2);
    }

    @TargetApi(21)
    public void setNestedScrollingEnabled(boolean z) {
        if (isAvecAscenseurAuto()) {
            int childCount = ((ViewGroup) this.Mc).getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ((ViewGroup) this.Mc).getChildAt(i);
                if (childAt instanceof C1105c) {
                    childAt.setNestedScrollingEnabled(z);
                }
            }
        }
    }

    protected void setParamAnimationChamp(int i, int i2, int i3) {
        if (i == 25) {
            switch (i2) {
                case 22:
                    if (kb.m3965a(C0657a.ICE_CREAM_SANDWICH)) {
                        this.Mc.mo3450a(new C1175a(null));
                        return;
                    }
                    return;
                case 23:
                    if (kb.m3965a(C0657a.HONEYCOMB)) {
                        this.Mc.mo3450a(new C1186n(this));
                        return;
                    }
                    return;
                case 24:
                    if (kb.m3965a(C0657a.HONEYCOMB)) {
                        this.Mc.mo3450a(new C1181h(this));
                        return;
                    }
                    return;
                case 25:
                    if (kb.m3965a(C0657a.HONEYCOMB)) {
                        this.Mc.mo3450a(new mb(this));
                        return;
                    }
                    return;
                case 26:
                    return;
                case 28:
                    this.Mc.mo3450a(new eb(this, null));
                    return;
                case 29:
                    this.Mc.mo3450a(new C1194z(this, null));
                    return;
                default:
                    C0691a.m2856a(Pc[3]);
                    return;
            }
        }
    }

    public void setPositionFenetreInterne(int i, boolean z, boolean z2) {
        int min = Math.min(Math.max(0, i), getNbFenetreInterne() - 1);
        if (min >= 0) {
            pb b = this.Gc.mo3442b(min);
            boolean z3 = (b == null || b.m8503a() == null) ? false : true;
            this.Mc.setCurrentItem(min, z2);
            if (z3) {
                onPageAffichee(b, false);
            }
        }
    }

    public int setScrollPosition(boolean z, int i) {
        if (!z) {
            return -1;
        }
        C1108e a = m7524a(null);
        if (a == null) {
            return -1;
        }
        a.mo3355b(i);
        return a.mo3349a();
    }

    public boolean setTailleChamp(int i, int i2, int i3) {
        boolean tailleChamp = super.setTailleChamp(i, i2, i3);
        if (tailleChamp) {
            int d = this.Gc.mo3444d();
            for (int i4 = 0; i4 < d; i4++) {
                pb b = this.Gc.mo3442b(i4);
                WDFenetreInterne a = b != null ? b.m8503a() : null;
                if (a != null) {
                    if (isAvecAscenseurAuto()) {
                        a.setTailleChamp(Math.max(a.getRequestedWidth(), i), Math.max(a.getRequestedHeight(), i2), 0);
                        C1108e a2 = m7524a(a);
                        if (a2 != null) {
                            C1503b.m10448b((View) a2, i, i2);
                            C1503b.m10434a(a2, a.getCompConteneur(), a._getLargeur(), _getLargeur(), isCanScrollHorizontally());
                        }
                    } else {
                        a.setTailleChamp(i, i2, 0);
                    }
                }
            }
        }
        return tailleChamp;
    }

    public void setTailleUtile(int i, int i2) {
        if (this.Ec != null && isAvecAscenseurAuto()) {
            this.Ec.setTailleInitiale(i, i2);
        }
    }

    public final boolean supprimerFenetreInterne(int i) {
        if (i == -1) {
            i = getPositionFenetreInterne();
        }
        return this.Gc.mo3440a(i);
    }

    public final void supprimerTout() {
        this.Gc.mo3446f();
    }
}
