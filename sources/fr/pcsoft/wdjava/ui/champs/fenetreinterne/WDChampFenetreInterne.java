package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.ui.actionbar.C0512g;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.champs.C1151p;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.gesture.C1171d;
import fr.pcsoft.wdjava.ui.p033c.C0510b;
import fr.pcsoft.wdjava.ui.p033c.C1105c;
import fr.pcsoft.wdjava.ui.p033c.C1106a;
import fr.pcsoft.wdjava.ui.p033c.C1108e;
import fr.pcsoft.wdjava.ui.utils.C1503b;

public class WDChampFenetreInterne extends gb implements C0510b, C0512g {
    private static final String[] Hc = new String[]{m1479z(m1480z("6\u0007\u0011N8Z\u0012\u0017U([\u001d\u0001]+T\u001b\u0002[\"J\f\fR8T\u0001\u0017U1P\u0007")), m1479z(m1480z("6\u0007\u0011N8T\u0001\u0017U1T\u0016\nS)J\u0012\u0011S7G\u000b\u0006H\""))};
    protected ViewGroup Gc;

    /* renamed from: z */
    private static String m1479z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 21;
                    break;
                case 1:
                    i2 = 66;
                    break;
                case 2:
                    i2 = 67;
                    break;
                case 3:
                    i2 = 28;
                    break;
                default:
                    i2 = 103;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1480z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 103);
        }
        return toCharArray;
    }

    public int _getHauteurUtile() {
        return (this.Ec == null || !isAvecAscenseurAuto()) ? C1503b.m10449c(this.Gc) : this.Ec._getHauteur();
    }

    public int _getLargeurUtile() {
        return (this.Ec == null || !isAvecAscenseurAuto()) ? C1503b.m10442b(this.Gc) : this.Ec._getLargeur();
    }

    public final boolean afficherFenetreInternePrecedente() {
        WDErreurManager.m2883a(C0745b.m3222b(Hc[0], getName()));
        return false;
    }

    public final boolean afficherFenetreInterneSuivante() {
        WDErreurManager.m2883a(C0745b.m3222b(Hc[0], getName()));
        return false;
    }

    public final int ajouterFenetreInterne(String str, WDObjet... wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(Hc[0], getName()));
        return 0;
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
        if (!(this.Gc instanceof C1108e)) {
            return false;
        }
        C1108e c1108e = (C1108e) this.Gc;
        if (Math.abs(i) <= Math.abs(i2)) {
            return c1108e.canScrollVertically(i2);
        }
        View childAt = c1108e.getChildAt(0);
        if (!(childAt instanceof C1106a) || !((C1106a) childAt).canScrollHorizontally(i)) {
            return false;
        }
        childAt.getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    protected void creerComposant() {
        if (isAvecAscenseurAuto()) {
            this.Gc = new C1108e(C1056i.m7562a());
            ((C1108e) this.Gc).mo3351a((C0510b) this);
        } else {
            this.Gc = new C1151p(C1056i.m7562a());
        }
        ((ViewGroup) getCompConteneur()).addView(this.Gc);
    }

    protected void desinstallerFenetreInterne(WDFenetreInterne wDFenetreInterne) {
        this.Gc.removeAllViews();
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
        return new WDBooleen(false);
    }

    public View getCompPrincipal() {
        return this.Gc;
    }

    public final int getNbFenetreInterne() {
        return 1;
    }

    public final int getPositionFenetreInterne() {
        return 0;
    }

    public View getScrollableView() {
        return this.Gc;
    }

    public boolean insererFenetreInterne(String str, int i, WDObjet... wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(Hc[0], getName()));
        return false;
    }

    protected void installerFenetreInterne(WDFenetreInterne wDFenetreInterne) {
        if (isAvecAscenseurAuto()) {
            C1503b.m10434a((C1108e) this.Gc, wDFenetreInterne.getCompConteneur(), wDFenetreInterne._getLargeur(), _getLargeur(), isCanScrollHorizontally());
            ((C1108e) this.Gc).scrollTo(0, 0);
            return;
        }
        this.Gc.addView(wDFenetreInterne.getCompConteneur());
        C1503b.m10448b(wDFenetreInterne.getCompConteneur(), this.Gc.getLayoutParams().width, this.Gc.getLayoutParams().height);
    }

    public boolean isChampFocusable() {
        return true;
    }

    protected boolean isInterceptTouchEventForScroll() {
        return super.isInterceptTouchEventForScroll() || (_getEtat() == 0 && isAvecAscenseurAuto() && this.Ec != null);
    }

    public void majParcoursAuto(String str) {
        WDErreurManager.m2883a(C0745b.m3222b(Hc[0], getName()));
    }

    protected int measureContentHeight() {
        return this.Ec != null ? this.Ec.getPreferredHeight() : 0;
    }

    protected int measureContentWidth() {
        return this.Ec != null ? this.Ec.getPreferredWidth() : 0;
    }

    protected void modifPositionAscenseur() {
        initialiserAction();
    }

    public void onScrollChanged(C1105c c1105c, int i, int i2, boolean z) {
        if (!(this.Ec == null || this.Ec.isReleased())) {
            this.Ec.getConteneurManager().mo3422a(i, i2);
        }
        if (!z) {
            appelPCode(238);
            if (this.Ec != null) {
                this.Ec.appelPCode(238);
            }
        }
    }

    protected boolean registerFenetreInterne(WDFenetreInterne wDFenetreInterne) {
        if (super.registerFenetreInterne(wDFenetreInterne)) {
            wrapSizeToContent();
        }
        return false;
    }

    public void release() {
        super.release();
        this.Gc = null;
    }

    public void setBalayageActif(boolean z) {
        if (z) {
            WDErreurManager.m2883a(C0745b.m3222b(Hc[1], new String[0]));
        }
    }

    public void setHideActionBarOnScrollGestureDetector(C1171d c1171d) {
        if (isAvecAscenseurAuto() && (this.Gc instanceof C1105c)) {
            ((C1105c) this.Gc).mo3353a(c1171d);
        }
    }

    protected void setNbFenetreAvantRecyclage(int i) {
    }

    @TargetApi(21)
    public void setNestedScrollingEnabled(boolean z) {
        if (isAvecAscenseurAuto() && (this.Gc instanceof C1105c)) {
            this.Gc.setNestedScrollingEnabled(z);
        }
    }

    public final void setPositionFenetreInterne(int i) {
        WDErreurManager.m2883a(C0745b.m3222b(Hc[0], getName()));
    }

    public void setPositionFenetreInterne(int i, boolean z, boolean z2) {
        WDErreurManager.m2883a(C0745b.m3222b(Hc[0], getName()));
    }

    public boolean setTailleChamp(int i, int i2, int i3) {
        boolean tailleChamp = super.setTailleChamp(i, i2, i3);
        if (tailleChamp && this.Ec != null) {
            if (isAvecAscenseurAuto()) {
                boolean isCanScrollHorizontally = isCanScrollHorizontally();
                if (isCanScrollHorizontally) {
                    i = Math.max(this.Ec.getRequestedWidth(), i);
                }
                this.Ec.setTailleChamp(i, Math.max(this.Ec.getRequestedHeight(), i2), 0);
                C1503b.m10434a((C1108e) this.Gc, this.Ec.getCompConteneur(), i, _getLargeur(), isCanScrollHorizontally);
            } else {
                this.Ec.setTailleChamp(i, i2, 0);
            }
        }
        return tailleChamp;
    }

    public void setTailleUtile(int i, int i2) {
        if (this.Ec == null) {
            return;
        }
        if (isAvecAscenseurAuto()) {
            View compConteneur = getCompConteneur();
            this.Ec.setTailleChamp(Math.max(i, compConteneur.getWidth()), Math.max(i2, compConteneur.getHeight()), 1);
            return;
        }
        setTailleChamp(i, i2, 0);
    }

    public final boolean supprimerFenetreInterne(int i) {
        WDErreurManager.m2883a(C0745b.m3222b(Hc[0], getName()));
        return false;
    }

    public final void supprimerTout() {
        WDErreurManager.m2883a(C0745b.m3222b(Hc[0], getName()));
    }

    public void terminerInitialisation() {
        super.terminerInitialisation();
        if (isAvecAscenseurAuto()) {
            ((WDFenetre) this.l).requestActionBarVisibilityControlOnScroll(this);
        }
    }
}
