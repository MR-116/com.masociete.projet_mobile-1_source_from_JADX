package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.content.Context;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0727l;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.champs.C0530v;
import fr.pcsoft.wdjava.ui.champs.C1151p;
import fr.pcsoft.wdjava.ui.champs.fc;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.nb;
import fr.pcsoft.wdjava.ui.champs.p034b.C0513b;
import fr.pcsoft.wdjava.ui.champs.p034b.C1124a;
import fr.pcsoft.wdjava.ui.champs.p034b.C1125c;
import fr.pcsoft.wdjava.ui.champs.slidingmenu.C0526d;
import fr.pcsoft.wdjava.ui.champs.zml.C0532f;
import fr.pcsoft.wdjava.ui.p033c.C1105c;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.pulltorefresh.C0533c;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import fr.pcsoft.wdjava.ui.utils.C1511l;

public abstract class WDFenetreInterne extends hb implements C0533c, C0513b, C0530v {
    private C1125c Fc = null;
    private boolean Gc = false;
    private boolean Hc = false;
    private int Ic = 0;
    private int Jc = 0;
    private int Kc = 0;
    private int Lc = 0;
    private C1151p Mc = null;

    public WDFenetreInterne() {
        Context a = C1056i.m7562a();
        if (a != null) {
            this.Mc = new C1182j(this, a);
        }
    }

    protected void adaptSizeFromChildSizeChange(int i, int i2) {
        if (this.zc != null) {
            boolean b = C0727l.m3092b(this.zc.getAnchorOptions(), 8);
            int _getLargeurUtile = this.zc._getLargeurUtile() + i;
            boolean b2 = C0727l.m3092b(this.zc.getAnchorOptions(), 7);
            int _getHauteurUtile = this.zc._getHauteurUtile() + i2;
            this.zc.setTailleUtile(_getLargeurUtile, _getHauteurUtile);
            appliquerAncrage(i, i2, 0, 0, 0);
            if (b2) {
                this.p = _getHauteurUtile;
                this.zc.wrapSizeToContent();
            } else if (b) {
                this.U = _getLargeurUtile;
                this.zc.wrapSizeToContent();
            }
            View scrollableView;
            if (i2 != 0 && !b2) {
                scrollableView = this.zc.getScrollableView();
                if (scrollableView == null || ((scrollableView instanceof C1105c) && (((C1105c) scrollableView).mo3361f() & 1) == 0)) {
                    this.zc.makeRoom(i, i2);
                }
            } else if (i != 0 && !b) {
                scrollableView = this.zc.getScrollableView();
                if (scrollableView == null || ((scrollableView instanceof C1105c) && (((C1105c) scrollableView).mo3361f() & 2) == 0)) {
                    this.zc.makeRoom(i, i2);
                }
            }
        }
    }

    public void adapterHauteurPourZML(C0532f c0532f, int i) {
        if (this.zc != null) {
            int c = C1503b.m10449c(this.zc.getCompPrincipal());
            if (i < c) {
                i = c;
            }
        }
        super.adapterHauteurPourZML(c0532f, i);
    }

    public int adjustChildHeightChange(fc fcVar, int i) {
        return (this.zc == null || !C0727l.m3092b(this.zc.getAnchorOptions(), 7)) ? super.adjustChildHeightChange(fcVar, i) : i;
    }

    public int adjustChildWidthChange(fc fcVar, int i) {
        return (this.zc == null || !C0727l.m3092b(this.zc.getAnchorOptions(), 8)) ? super.adjustChildWidthChange(fcVar, i) : i;
    }

    public void ajouter(String str, C0489p c0489p) {
        super.ajouter(str, c0489p);
        if (c0489p instanceof gc) {
            ((gc) c0489p).addChampListener(this);
        }
    }

    protected void appliquerCouleur(int i) {
    }

    protected void appliquerCouleurFond(int i) {
        this.Mc.setBackgroundColor(C1031a.m7467k(i));
    }

    protected void appliquerCouleurFondTransparent() {
        this.Mc.setBackgroundDrawable(null);
    }

    protected void appliquerTransparent() {
    }

    protected int computePreferredHeight() {
        int a = C1503b.m10422a(this.Dc.m8360c(), true) + this.p;
        int _getHauteurMax = _getHauteurMax();
        if (a <= _getHauteurMax) {
            _getHauteurMax = a;
        }
        a = _getHauteurMin();
        return _getHauteurMax < a ? a : _getHauteurMax;
    }

    protected int computePreferredWidth() {
        int b = C1503b.m10444b(this.Dc.m8360c(), true) + this.U;
        int _getLargeurMax = _getLargeurMax();
        if (b <= _getLargeurMax) {
            _getLargeurMax = b;
        }
        b = _getLargeurMin();
        return _getLargeurMax < b ? b : _getLargeurMax;
    }

    protected final void declarerAgencement(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.Fc == null) {
            this.Fc = new C1125c(this);
        }
        this.Fc.m8248a(i, i2, i3, 0, 0, 160, 2);
    }

    protected WDObjet executerPCode(int i) {
        switch (i) {
            case C0607n.jk /*198*/:
                trtRafraichissementWidget();
                return null;
            case 238:
                modifPositionAscenseur();
                return null;
            case C0607n.Fn /*264*/:
                trtChangementAgencement();
                return null;
            case C0607n.Pl /*1142*/:
                ptrTirer();
                return null;
            case C0607n.uq /*1143*/:
                ptrRelacher();
                return null;
            case C0607n.vf /*1144*/:
                ptrRafraichissement();
                return null;
            default:
                return super.executerPCode(i);
        }
    }

    public int getAgencementComparisonFlags() {
        return 1;
    }

    public final C1125c getAgencementManager() {
        return this.Fc;
    }

    public View getCompConteneur() {
        return this.Mc;
    }

    public View getCompPrincipal() {
        return this.Mc;
    }

    public void getDisplaySize(Point point) {
        if (this.zc != null) {
            point.x = this.zc._getLargeur();
            point.y = this.zc._getHauteur();
            return;
        }
        point.x = _getLargeur();
        point.y = _getHauteur();
    }

    public int getIndexAgencement() {
        return this.Fc != null ? this.Fc.m8250b() : 0;
    }

    public int getPreferredHeight() {
        this.Tb = computePreferredHeight();
        return this.Tb;
    }

    public int getPreferredWidth() {
        this.Eb = computePreferredWidth();
        return this.Eb;
    }

    public final int getRequestedHeight() {
        return this.Kc;
    }

    public final int getRequestedWidth() {
        return this.Ic;
    }

    public int getScrollPosition(boolean z) {
        return this.zc != null ? this.zc.getScrollPosition(z) : 0;
    }

    public int getStandardViewHeight() {
        return getRequestedHeight();
    }

    public View getView() {
        return getCompConteneur();
    }

    public WDFenetreInterne getWDFenetreInterneThis() {
        return this;
    }

    protected void initConteneurManager() {
        this.Dc = new C1185m(this);
    }

    public void installerChamp(nb nbVar) {
        this.Mc.addView(((gc) nbVar).getCompConteneur());
    }

    public boolean isChampFocusable() {
        return false;
    }

    protected void modifPositionAscenseur() {
        initialiserAction();
    }

    public void onAgencementChanged(C1124a c1124a, C1124a c1124a2, int i) {
        int b;
        int c;
        if (c1124a == null) {
            C1124a e = this.Fc.m8254e();
            b = e.m8242b();
            c = e.m8243c();
        } else {
            b = this.Jc;
            c = this.Lc;
        }
        b = c1124a2.m8242b() - b;
        int c2 = c1124a2.m8243c() - c;
        if (!(b == 0 && c2 == 0)) {
            appliquerAncrage(b, c2, 0, 0, 0);
        }
        this.Ic = c1124a2.m8242b();
        this.Kc = c1124a2.m8243c();
        WDFenetre wDFenetre = (WDFenetre) getFenetreMere();
        boolean isFenetreCree = isFenetreCree();
        wDFenetre.setFenetreCree(false);
        try {
            setAgencement(i);
        } finally {
            wDFenetre.setFenetreCree(isFenetreCree);
        }
    }

    public void onHeightChangedWhilePulling(int i, int i2) {
        int standardViewHeight = getStandardViewHeight();
        int max = Math.max(standardViewHeight, i);
        standardViewHeight = Math.max(standardViewHeight, i2);
        if (max != standardViewHeight) {
            appliquerAncrage(0, max - standardViewHeight, 0, 0, 0);
        }
    }

    public void onModification(fc fcVar) {
    }

    public void onPositionChanged(fc fcVar, int i, int i2, int i3) {
    }

    public boolean onPreferredSizeChanged(fc fcVar, int i, int i2) {
        if (isReleased() || this.zc == null) {
            return false;
        }
        this.zc.wrapSizeToContent();
        return true;
    }

    public void onPullToRefresh() {
        appelPCode(C0607n.Pl);
    }

    public void onRefreshing() {
        C0938m.m6814b(new C1176c(this));
    }

    public void onReleaseToRefresh() {
        appelPCode(C0607n.uq);
    }

    public void onSizeChanged(fc fcVar, int i, int i2, int i3) {
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (super.onTouch(view, motionEvent)) {
            return true;
        }
        gc gcVar = (gc) getChampFenetreInterne();
        if (!(gcVar == null || gcVar.isReleased())) {
            gcVar.handleScroll(motionEvent);
        }
        return false;
    }

    public void onVisibilityChanged(fc fcVar, boolean z) {
    }

    protected void ptrRafraichissement() {
        initialiserAction();
    }

    protected void ptrRelacher() {
        initialiserAction();
    }

    protected void ptrTirer() {
        initialiserAction();
    }

    public void release() {
        super.release();
        this.Mc = null;
    }

    protected final void setAgencementEnEdition(int i) {
        if (this.Fc == null) {
            this.Fc = new C1125c(this);
        }
        this.Fc.m8251b(i);
    }

    public final void setAutoAnchoring(boolean z, boolean z2) {
        this.Hc = z;
        this.Gc = z2;
    }

    public void setHauteur(int i) {
        this.Kc = C1511l.m10532d((float) i, getDisplayUnit());
        setTailleChamp(_getLargeur(), this.Kc, 4);
    }

    public void setLargeur(int i) {
        if (this.zc instanceof C0526d) {
            this.zc.setLargeur(i);
            return;
        }
        this.Ic = C1511l.m10532d((float) i, getDisplayUnit());
        setTailleChamp(this.Ic, _getHauteur(), 4);
    }

    public int setScrollPosition(boolean z, int i) {
        return this.zc != null ? this.zc.setScrollPosition(z, i) : 0;
    }

    public boolean setTailleChamp(int i, int i2, int i3) {
        return isChangementAgencementEnCours() ? false : super.setTailleChamp(i, i2, i3);
    }

    public void terminerInitialisation() {
        super.terminerInitialisation();
        this.Ic = this.T;
        this.Kc = this.Q;
    }

    protected void trtChangementAgencement() {
        initialiserAction();
    }

    protected void trtRafraichissementWidget() {
        initialiserAction();
    }
}
