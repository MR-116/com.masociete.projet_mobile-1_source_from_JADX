package fr.pcsoft.wdjava.ui.champs;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.TextView;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0727l;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.poo.C0735q;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.actionbar.C0512g;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.cadre.C1110m;
import fr.pcsoft.wdjava.ui.cadre.C1120j;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.C0524x;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.fb;
import fr.pcsoft.wdjava.ui.champs.jauge.C1225d;
import fr.pcsoft.wdjava.ui.champs.saisie.C0516d;
import fr.pcsoft.wdjava.ui.champs.table.colonne.C1278a;
import fr.pcsoft.wdjava.ui.champs.zr.bb;
import fr.pcsoft.wdjava.ui.menu.C0497c;
import fr.pcsoft.wdjava.ui.menu.C1467b;
import fr.pcsoft.wdjava.ui.p033c.C1105c;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p079e.C1397c;
import fr.pcsoft.wdjava.ui.p079e.C1399b;
import fr.pcsoft.wdjava.ui.p079e.C1400d;
import fr.pcsoft.wdjava.ui.p082k.C1439b;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import fr.pcsoft.wdjava.widget.ui.IWDChampWidget;

public abstract class gc extends fc implements OnTouchListener, OnDoubleTapListener, OnGestureListener, OnLongClickListener {
    protected static final int Yb = 22;
    public static final int ac = 5;
    protected static final int fc = 21;
    protected static final int gc = 20;
    public static final int jc = 255;
    protected static final int lc = 18;
    protected static final int nc = 24;
    protected static final int rc = 19;
    public static final int vc = 6;
    private static final String[] xc = new String[]{m1341z(m1342z("s\u001c5I\u0004\u0000\u001c.,\u001f\u001br7,\t\u001al")), m1341z(m1342z("\u00037Z\n/.?\nI&o6\u0003§o»\u000eg,>\u0015\u0007®")), m1341z(m1342z("\f>\u0015\u0007&(7Z\u0000*?=\t\u001a.->\u001fEg#7Z\n/.?\nI)h3\n\u0019&=&\u0013\f);r\n\b4o²Z\u001c)*r\u001c\f)¥&\b\fi")), m1341z(m1342z("l\u001f5-\u000e\t\u001b9(\u0013\u0006\u001d46\u0006\u0003\u00063=\u0012\u000b\u0017% \t\u001b\u0017(-\u000e\u001b\u0017")), m1341z(m1342z("<7\u000e?.<;\u0018\u0000+&&\u0003")), m1341z(m1342z("\u0006?\n\u00064<;\u0018\u0005\"o6\u001fI$#=\u0014\f5o>\u001fI$'3\u0017\u0019g"))};
    private boolean Vb = false;
    private double Wb = 0.0d;
    private int Xb = 0;
    protected C1278a Zb = null;
    protected GestureDetector bc = null;
    private int cc = -1;
    protected C1467b dc = null;
    private int ec = 0;
    private int hc = 0;
    private Runnable ic = null;
    protected C1110m kc = null;
    protected boolean mc = true;
    protected gc oc = null;
    private boolean pc = false;
    protected Runnable qc = null;
    private WDCallback sc = null;
    protected MotionEvent tc = null;
    private double uc = 0.0d;
    protected gc wc = null;

    protected gc(C1278a c1278a) {
        this.Zb = c1278a;
        this.L = -1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final boolean m1340a(int r4, int r5, int r6, int r7) {
        /*
        r3 = this;
        r0 = r3.getCompConteneur();
        r1 = fr.pcsoft.wdjava.ui.utils.C1503b.m10448b(r0, r6, r7);	 Catch:{ WDException -> 0x0012 }
        if (r1 == 0) goto L_0x0050;
    L_0x000a:
        r1 = r3.isZoneRepetee();	 Catch:{ WDException -> 0x0014 }
        if (r1 == 0) goto L_0x0016;
    L_0x0010:
        r0 = 1;
    L_0x0011:
        return r0;
    L_0x0012:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0014 }
    L_0x0014:
        r0 = move-exception;
        throw r0;
    L_0x0016:
        r1 = r3.getCompPrincipal();
        if (r1 == r0) goto L_0x0010;
    L_0x001c:
        r0 = r1.getLayoutParams();
        r2 = r3.isFenetreCree();	 Catch:{ WDException -> 0x0036 }
        if (r2 != 0) goto L_0x003c;
    L_0x0026:
        if (r0 == 0) goto L_0x0030;
    L_0x0028:
        r2 = r0.width;	 Catch:{ WDException -> 0x003a }
        if (r2 != 0) goto L_0x003c;
    L_0x002c:
        r2 = r0.height;	 Catch:{ WDException -> 0x0034 }
        if (r2 != 0) goto L_0x003c;
    L_0x0030:
        fr.pcsoft.wdjava.ui.utils.C1503b.m10448b(r1, r6, r7);	 Catch:{ WDException -> 0x0034 }
        goto L_0x0010;
    L_0x0034:
        r0 = move-exception;
        throw r0;
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0034 }
    L_0x003c:
        if (r4 != r6) goto L_0x0040;
    L_0x003e:
        if (r5 == r7) goto L_0x0010;
    L_0x0040:
        if (r5 != 0) goto L_0x0044;
    L_0x0042:
        if (r4 == 0) goto L_0x0010;
    L_0x0044:
        r2 = r0.width;
        r2 = r2 + r6;
        r2 = r2 - r4;
        r0 = r0.height;
        r0 = r0 + r7;
        r0 = r0 - r5;
        fr.pcsoft.wdjava.ui.utils.C1503b.m10448b(r1, r2, r0);
        goto L_0x0010;
    L_0x0050:
        r0 = 0;
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.gc.a(int, int, int, int):boolean");
    }

    /* renamed from: z */
    private static String m1341z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 79;
                    break;
                case 1:
                    i2 = 82;
                    break;
                case 2:
                    i2 = 122;
                    break;
                case 3:
                    i2 = 105;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1342z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 71);
        }
        return toCharArray;
    }

    public int _getAltitude() {
        ViewParent parent = getCompConteneur().getParent();
        if (parent != null) {
            try {
                if (parent instanceof ViewGroup) {
                    return ((ViewGroup) parent).indexOfChild(getCompConteneur()) + 1;
                }
            } catch (WDException e) {
                throw e;
            }
        }
        return 0;
    }

    public int _getHauteur() {
        return C1503b.m10449c(getCompConteneur());
    }

    public int _getHauteurUtile() {
        return _getHauteur();
    }

    public int _getLargeur() {
        return C1503b.m10442b(getCompConteneur());
    }

    public int _getLargeurUtile() {
        return _getLargeur();
    }

    public int _getLocalX() {
        LayoutParams layoutParams = getCompConteneur().getLayoutParams();
        if (layoutParams != null) {
            try {
                if (layoutParams instanceof ib) {
                    return ((ib) layoutParams).x;
                }
            } catch (WDException e) {
                throw e;
            }
        }
        return 0;
    }

    public int _getLocalY() {
        LayoutParams layoutParams = getCompConteneur().getLayoutParams();
        if (layoutParams != null) {
            try {
                if (layoutParams instanceof ib) {
                    return ((ib) layoutParams).y;
                }
            } catch (WDException e) {
                throw e;
            }
        }
        return 0;
    }

    protected final void activerDetectionGeste() {
        try {
            if (!WDAppManager.m2548G()) {
                try {
                    if (this.bc == null) {
                        this.bc = new GestureDetector(C1056i.m7562a(), this);
                        this.bc.setIsLongpressEnabled(false);
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void activerEcouteurClic() {
        super.activerEcouteurClic();
        getCompPrincipal().setClickable(true);
    }

    public void activerEcouteurDoubleTape() {
        try {
            if (!WDAppManager.m2548G()) {
                try {
                    getCompPrincipal().setClickable(true);
                    activerDetectionGeste();
                    if (this.bc != null) {
                        this.bc.setOnDoubleTapListener(this);
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    protected void activerEcouteurLongPress() {
        try {
            if (!WDAppManager.m2548G()) {
                getCompPrincipal().setLongClickable(true);
                getCompPrincipal().setOnLongClickListener(this);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void activerEcouteurMouvement() {
        try {
            if (!WDAppManager.m2548G()) {
                super.activerEcouteurMouvement();
                this.Vb = true;
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected void activerEcouteurTouch() {
        try {
            if (!WDAppManager.m2548G()) {
                getCompPrincipal().setOnTouchListener(this);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected void adaptSizeFromChildSizeChange(int i, int i2) {
        int _getLargeur = _getLargeur();
        int i3 = _getLargeur + i;
        int _getHauteur = _getHauteur();
        if (setTailleChamp(i3, _getHauteur + i2, 0)) {
            makeRoom(_getLargeur() - _getLargeur, _getHauteur() - _getHauteur);
        }
    }

    public int adjustChildHeightChange(fc fcVar, int i) {
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int b;
        int _getHauteur = _getHauteur();
        View scrollableView;
        int i3;
        if (i < 0) {
            scrollableView = getScrollableView();
            if (scrollableView instanceof C1105c) {
                b = ((C1105c) scrollableView).mo3354b();
                if (b > 0) {
                    try {
                        if (b > Math.abs(i)) {
                            return i;
                        }
                        i3 = i + b;
                    } catch (WDException e) {
                        throw e;
                    }
                }
                i3 = i;
            } else {
                b = 0;
                i3 = i;
            }
            try {
                int i4 = this.Lb == -1 ? 0 : this.Lb;
                if (_getHauteur + i3 < i4) {
                    i3 = i4 - _getHauteur;
                }
                if (i3 > 0) {
                    i3 = 0;
                }
                i2 = b;
                b = i3;
            } catch (WDException e2) {
                throw e2;
            }
        }
        scrollableView = getScrollableView();
        try {
            if (scrollableView instanceof C1105c) {
                if ((((C1105c) scrollableView).mo3361f() & 1) > 0) {
                    return i;
                }
            }
            try {
                i3 = this.Z == -1 ? 0 : this.Z;
                i3 = _getHauteur + i > i3 ? i3 - _getHauteur : i;
                b = i3 < 0 ? 0 : i3;
            } catch (WDException e22) {
                throw e22;
            }
        } catch (WDException e222) {
            throw e222;
        } catch (WDException e2222) {
            throw e2222;
        }
        gc gcVar = (gc) getChampParent(gc.class);
        if (gcVar != null) {
            b = gcVar.adjustChildHeightChange(this, b);
        }
        return b - i2;
    }

    public int adjustChildWidthChange(fc fcVar, int i) {
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int e;
        int _getLargeur = _getLargeur();
        View scrollableView;
        int i3;
        if (i < 0) {
            scrollableView = getScrollableView();
            if (scrollableView instanceof C1105c) {
                e = ((C1105c) scrollableView).mo3360e();
                if (e > 0) {
                    try {
                        if (e > Math.abs(i)) {
                            return i;
                        }
                        i3 = i + e;
                    } catch (WDException e2) {
                        throw e2;
                    }
                }
                i3 = i;
            } else {
                e = 0;
                i3 = i;
            }
            try {
                int i4 = this.I == -1 ? 0 : this.I;
                if (_getLargeur + i3 < i4) {
                    i3 = i4 - _getLargeur;
                }
                if (i3 > 0) {
                    i3 = 0;
                }
                i2 = e;
                e = i3;
            } catch (WDException e22) {
                throw e22;
            }
        }
        scrollableView = getScrollableView();
        try {
            if (scrollableView instanceof C1105c) {
                if ((((C1105c) scrollableView).mo3361f() & 2) > 0) {
                    return i;
                }
            }
            try {
                i3 = this.hb == -1 ? 0 : this.hb;
                i3 = _getLargeur + i > i3 ? i3 - _getLargeur : i;
                e = i3 < 0 ? 0 : i3;
            } catch (WDException e222) {
                throw e222;
            }
        } catch (WDException e2222) {
            throw e2222;
        } catch (WDException e22222) {
            throw e22222;
        }
        gc gcVar = (gc) getChampParent(gc.class);
        if (gcVar != null) {
            e = gcVar.adjustChildWidthChange(this, e);
        }
        return e - i2;
    }

    protected void appliquerAgencement(int i) {
    }

    protected void appliquerCadreExterieur(C1110m c1110m) {
        try {
            this.kc = c1110m;
            if (!isChampListe()) {
                if (!(this instanceof C0516d)) {
                    try {
                        if (!(this instanceof C1225d)) {
                            this.L = C1031a.m7461e(c1110m.mo3387l());
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    protected void appliquerCadreInterne(C1110m c1110m) {
    }

    protected void appliquerCouleurFond(int i) {
        try {
            if (this.kc != null) {
                this.kc.mo3385d(C1031a.m7467k(i));
                repeindreConteneur();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected void appliquerCouleurFondTransparent() {
        try {
            if (this.kc != null) {
                this.kc.mo3385d(0);
                repeindreConteneur();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected void appliquerCouleurLibelleInverseEnSelection() {
    }

    public void appliquerVisibilite(boolean z) {
        int i = 4;
        boolean z2 = false;
        if (z) {
            i = 0;
        }
        if (WDAppManager.m2548G()) {
            IWDChampWidget iWDChampWidget = (IWDChampWidget) checkType(IWDChampWidget.class);
            if (iWDChampWidget != null) {
                try {
                    iWDChampWidget.getRemoteViews().setInt(iWDChampWidget.getViewId(), xc[4], i);
                    return;
                } catch (WDException e) {
                    throw e;
                }
            }
            return;
        }
        try {
            if (getCompConteneur().getVisibility() == 0) {
                z2 = true;
            }
            if (z2 != z) {
                try {
                    getCompConteneur().setVisibility(i);
                    if (this.Jb != null) {
                        for (C0530v onVisibilityChanged : this.Jb) {
                            onVisibilityChanged.onVisibilityChanged(this, z);
                        }
                    }
                } catch (WDException e2) {
                    throw e2;
                }
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    protected int calculerEtatInterne(int i) {
        switch (i) {
            case 1:
                return 1;
            case 4:
                return 3;
            default:
                return getCompPrincipal().isPressed() ? 2 : getCompPrincipal().hasFocus() ? 4 : 1;
        }
    }

    protected boolean canScroll(int i, int i2) {
        return this.Vb;
    }

    public gc cloneChampForZR(boolean z, boolean z2) {
        if (z2 && z) {
            try {
                if (this.oc != null) {
                    C0691a.m2856a(xc[1]);
                    return this.oc;
                }
            } catch (WDException e) {
                throw e;
            }
        }
        boolean isFenetreCree = this.l.isFenetreCree();
        if (this.l == null) {
            C0691a.m2856a(xc[2]);
            this.l.setFenetreCree(isFenetreCree);
            return null;
        }
        gc createChampForColumn;
        this.l.setFenetreCree(false);
        if (this.Zb != null) {
            createChampForColumn = this.Zb.createChampForColumn();
            if (z) {
                try {
                    createChampForColumn.N |= 8;
                } catch (WDException e2) {
                    throw e2;
                } catch (WDException e22) {
                    throw e22;
                } catch (Throwable th) {
                    this.l.setFenetreCree(isFenetreCree);
                }
            }
            this.Zb.initColumnForClone(createChampForColumn);
        } else {
            gc newInstance = newInstance();
            if (newInstance == null) {
                this.l.setFenetreCree(isFenetreCree);
                return null;
            }
            if (z) {
                newInstance.N |= 8;
            }
            newInstance.initialiserObjet();
            createChampForColumn = newInstance;
        }
        createChampForColumn.setPere(getPere());
        createChampForColumn.postInit();
        if (this.Zb == null) {
            createChampForColumn.setTailleChamp(_getLargeur(), _getHauteur(), 1);
            createChampForColumn.setPositionChamp(_getX(), _getY(), 1);
        }
        this.l.setFenetreCree(isFenetreCree);
        if (createChampForColumn == null || !z2) {
            return createChampForColumn;
        }
        if (z) {
            try {
                this.oc = createChampForColumn;
            } catch (WDException e222) {
                throw e222;
            }
        }
        createChampForColumn.wc = this;
        return createChampForColumn;
    }

    protected int computePreferredHeight() {
        int measureContentHeight = measureContentHeight();
        View compPrincipal = getCompPrincipal();
        View compConteneur = getCompConteneur();
        return compConteneur != compPrincipal ? measureContentHeight + (compConteneur.getHeight() - compPrincipal.getHeight()) : measureContentHeight;
    }

    protected int computePreferredWidth() {
        int measureContentWidth = measureContentWidth();
        View compPrincipal = getCompPrincipal();
        View compConteneur = getCompConteneur();
        return compConteneur != compPrincipal ? measureContentWidth + (compConteneur.getWidth() - compPrincipal.getWidth()) : measureContentWidth;
    }

    public final void creerMenuContextuel(Menu menu) {
        try {
            if (menu.size() > 0) {
                if (!(this instanceof C0504y)) {
                    menu.clear();
                    if (menu instanceof ContextMenu) {
                        ((ContextMenu) menu).clearHeader();
                        CharSequence titreMenu = this.dc.getTitreMenu();
                        try {
                            if (!C0808l.m4053k(titreMenu)) {
                                ((ContextMenu) menu).setHeaderTitle(titreMenu);
                            }
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                }
                return;
            }
            if (this.mc) {
                WDFenetre wDFenetre = this instanceof WDFenetre ? (WDFenetre) this : (WDFenetre) this.l;
                if (wDFenetre != null) {
                    try {
                        wDFenetre.creerMenu(menu, (C0497c) this.dc);
                    } catch (WDException e2) {
                        throw e2;
                    }
                }
            }
        } catch (WDException e22) {
            throw e22;
        } catch (WDException e222) {
            throw e222;
        }
    }

    protected void declageAltitude(int i) {
        try {
            if (isFenetreCree()) {
                WDErreurManager.m2883a(C0745b.m3222b(xc[3], new String[0]));
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void demandeMAJAffichage() {
        initialiserAction();
    }

    protected final void dessinerContourCadreExterieur(Canvas canvas, int i) {
        try {
            if (this.kc != null) {
                int lineHeight;
                View compConteneur = getCompConteneur();
                View compLibelle = getCompLibelle();
                if (i != 1) {
                    try {
                        if (this.S && compLibelle != null) {
                            if (this.kc instanceof C1120j) {
                                i = 2;
                            }
                            switch (i) {
                                case 0:
                                    lineHeight = compLibelle == compConteneur ? compLibelle.getLineHeight() : compLibelle.getBottom();
                                    this.kc.mo3388a(canvas, 0, lineHeight, compConteneur.getWidth(), compConteneur.getHeight() - lineHeight);
                                    return;
                                case 2:
                                    canvas.save();
                                    int ceil = ((int) Math.ceil((double) compLibelle.getPaint().measureText(compLibelle.getText().toString()))) + 3;
                                    int lineHeight2;
                                    int ceil2;
                                    if (compLibelle == compConteneur) {
                                        lineHeight2 = compLibelle.getLineHeight();
                                        ceil2 = ((int) Math.ceil(((double) lineHeight2) / 2.0d)) - compLibelle.getExtendedPaddingTop();
                                        canvas.clipRect((float) compLibelle.getPaddingLeft(), 0.0f, (float) (compLibelle.getPaddingLeft() + ceil), (float) lineHeight2, Op.DIFFERENCE);
                                        lineHeight = ceil2;
                                    } else {
                                        ceil2 = compLibelle.getHeight() / 2;
                                        lineHeight2 = compLibelle.getLeft() + 2;
                                        canvas.clipRect((float) lineHeight2, (float) compLibelle.getTop(), (float) (ceil + lineHeight2), (float) compLibelle.getBottom(), Op.DIFFERENCE);
                                        lineHeight = ceil2;
                                    }
                                    this.kc.mo3388a(canvas, 0, lineHeight, compConteneur.getWidth(), compConteneur.getHeight() - lineHeight);
                                    canvas.restore();
                                    return;
                                default:
                                    this.kc.mo3369a(canvas, compConteneur);
                                    return;
                            }
                        }
                    } catch (WDException e) {
                        throw e;
                    } catch (WDException e2) {
                        throw e2;
                    }
                }
                if (this.kc instanceof C1120j) {
                    lineHeight = compConteneur.getHeight() / 2;
                    this.kc.mo3388a(canvas, 0, lineHeight, compConteneur.getWidth(), lineHeight);
                    return;
                }
                this.kc.mo3369a(canvas, compConteneur);
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    public void destroy() {
        View compConteneur = getCompConteneur();
        if (compConteneur != null) {
            ViewParent parent = compConteneur.getParent();
            try {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(compConteneur);
                }
            } catch (WDException e) {
                throw e;
            }
        }
        super.destroy();
    }

    public final void doParallax(int i, int i2) {
        if (i2 != 0) {
            int _getY;
            double d;
            int i3;
            int i4;
            View compConteneur;
            int top;
            if (this.ec != 0) {
                _getY = _getY();
                d = this.Wb + (((double) (this.ec * i2)) / 1000.0d);
                if (d != 0.0d) {
                    i3 = (int) d;
                    this.Wb = d - ((double) i3);
                    setPositionChamp(_getX(), _getY + i3, 0);
                    if (this.hc != 0) {
                        _getY = getCompConteneur().getLayoutParams().height;
                        d = this.uc + (((double) (this.hc * i2)) / 1000.0d);
                        if (d != 0.0d) {
                            i4 = (int) d;
                            this.uc = d - ((double) i4);
                            _getY = (_getY - i4) + this.Xb;
                            if (_getY >= 0) {
                                i4 += _getY;
                                this.Xb = _getY;
                                _getY = 0;
                            } else {
                                this.Xb = 0;
                            }
                            setTailleChamp(_getLargeur(), _getY, 0);
                            if (i4 == 0 || i3 != 0) {
                                compConteneur = getCompConteneur();
                                top = compConteneur.getTop() + i3;
                                i3 = (i3 + compConteneur.getBottom()) - i4;
                                if (i3 < top) {
                                    i3 = top;
                                }
                                compConteneur.layout(compConteneur.getLeft(), top, compConteneur.getRight(), i3);
                                compConteneur.requestLayout();
                            }
                            return;
                        }
                    }
                    i4 = 0;
                    if (i4 == 0) {
                    }
                    compConteneur = getCompConteneur();
                    top = compConteneur.getTop() + i3;
                    i3 = (i3 + compConteneur.getBottom()) - i4;
                    if (i3 < top) {
                        i3 = top;
                    }
                    compConteneur.layout(compConteneur.getLeft(), top, compConteneur.getRight(), i3);
                    compConteneur.requestLayout();
                }
            }
            i3 = 0;
            if (this.hc != 0) {
                _getY = getCompConteneur().getLayoutParams().height;
                d = this.uc + (((double) (this.hc * i2)) / 1000.0d);
                if (d != 0.0d) {
                    i4 = (int) d;
                    this.uc = d - ((double) i4);
                    _getY = (_getY - i4) + this.Xb;
                    if (_getY >= 0) {
                        this.Xb = 0;
                    } else {
                        i4 += _getY;
                        this.Xb = _getY;
                        _getY = 0;
                    }
                    setTailleChamp(_getLargeur(), _getY, 0);
                    if (i4 == 0) {
                    }
                    compConteneur = getCompConteneur();
                    top = compConteneur.getTop() + i3;
                    i3 = (i3 + compConteneur.getBottom()) - i4;
                    if (i3 < top) {
                        i3 = top;
                    }
                    compConteneur.layout(compConteneur.getLeft(), top, compConteneur.getRight(), i3);
                    compConteneur.requestLayout();
                }
            }
            i4 = 0;
            if (i4 == 0) {
            }
            compConteneur = getCompConteneur();
            top = compConteneur.getTop() + i3;
            i3 = (i3 + compConteneur.getBottom()) - i4;
            if (i3 < top) {
                i3 = top;
            }
            compConteneur.layout(compConteneur.getLeft(), top, compConteneur.getRight(), i3);
            compConteneur.requestLayout();
        }
    }

    public final void enableAnchorAfterLayout() {
        Handler c = C0938m.m6816c();
        try {
            if (this.qc == null) {
                this.qc = new qc(this);
            } else {
                c.removeCallbacks(this.qc);
            }
            c.post(this.qc);
        } catch (WDException e) {
            throw e;
        }
    }

    public final void executePCodeTouch(MotionEvent motionEvent) {
        sauverEvtTouch(MotionEvent.obtain(motionEvent));
        Runnable runnable = null;
        switch (motionEvent.getAction() & 255) {
            case 0:
                runnable = new sc(this);
                break;
            case 1:
                runnable = new C1230m(this);
                break;
            case 2:
                if (this.Vb) {
                    runnable = new hb(this);
                    break;
                }
                break;
            case 5:
                if (isPCodeMultitouch()) {
                    runnable = new pc(this);
                    break;
                }
                break;
            case 6:
                if (isPCodeMultitouch()) {
                    runnable = new C1208i(this);
                    break;
                }
                break;
        }
        if (runnable != null) {
            try {
                C0938m.m6814b(runnable);
            } catch (WDException e) {
                throw e;
            }
        }
    }

    protected WDObjet executerPCode(int i) {
        switch (i) {
            case C0607n.Jn /*234*/:
                try {
                    demandeMAJAffichage();
                    return null;
                } catch (WDException e) {
                    throw e;
                }
            default:
                return super.executerPCode(i);
        }
    }

    protected View findViewInterceptMoveMotionEvent() {
        try {
            if (this.Vb) {
                return getCompPrincipal();
            }
            gc gcVar = (gc) getChampParent(gc.class);
            if (gcVar == null) {
                return null;
            }
            try {
                return gcVar.findViewInterceptMoveMotionEvent();
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    protected int getAltitudeMaxFils() {
        try {
            return getCompConteneur() instanceof ViewGroup ? ((ViewGroup) getCompConteneur()).getChildCount() : 0;
        } catch (WDException e) {
            throw e;
        }
    }

    public WDObjet getAutoriseMasquageActionBar() {
        try {
            return this instanceof C0512g ? new WDBooleen(((C0512g) this).isActionBarVisiblityControlEnabled()) : super.getAutoriseMasquageActionBar();
        } catch (WDException e) {
            throw e;
        }
    }

    public final int getBackgroundColorBGR() {
        return this.L;
    }

    public final gc getChampSourceClone() {
        return this.wc;
    }

    public final gc getCloneForEdition() {
        return this.oc;
    }

    public abstract View getCompConteneur();

    public TextView getCompLibelle() {
        return null;
    }

    public abstract View getCompPrincipal();

    public WDObjet getCouleurTexteAutomatique() {
        try {
            return this instanceof C0504y ? new WDEntier4(((C0504y) this).getConteneurManager().mo3420a()) : super.getCouleurTexteAutomatique();
        } catch (WDException e) {
            throw e;
        }
    }

    public int getEtatInterne() {
        return calculerEtatInterne(this.d);
    }

    protected int getHauteurParent() {
        ViewParent parent = getCompConteneur().getParent();
        if (parent != null) {
            try {
                if (parent instanceof View) {
                    return C1503b.m10449c((View) parent);
                }
            } catch (WDException e) {
                throw e;
            }
        }
        return 0;
    }

    protected int getLargeurParent() {
        ViewParent parent = getCompConteneur().getParent();
        if (parent != null) {
            try {
                if (parent instanceof View) {
                    return C1503b.m10442b((View) parent);
                }
            } catch (WDException e) {
                throw e;
            }
        }
        return 0;
    }

    public final MotionEvent getLastMotionEvent() {
        return this.tc;
    }

    public void getLocationInWindow(int[] iArr) {
        int i;
        int i2;
        WDFenetre wDFenetre = (WDFenetre) getFenetreMere();
        if (wDFenetre != null) {
            wDFenetre.getCompConteneur().getLocationInWindow(iArr);
            i = iArr[0];
            i2 = iArr[1];
        } else {
            i2 = 0;
            i = 0;
        }
        getCompPrincipal().getLocationInWindow(iArr);
        iArr[0] = iArr[0] - i;
        iArr[1] = iArr[1] - i2;
    }

    public WDChaine getMenuContextuel() {
        WDChaine wDChaine = new WDChaine();
        try {
            if (this.mc) {
                try {
                    if (this.dc != null) {
                        wDChaine.setValeur(this.dc.getNomMenu());
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
            wDChaine.setValeur(xc[0]);
            return wDChaine;
        } catch (WDException e2) {
            throw e2;
        }
    }

    @TargetApi(11)
    public WDObjet getOpacite() {
        try {
            return !kb.m3965a(C0657a.HONEYCOMB) ? new WDEntier4(100) : new WDEntier4(((double) getCompConteneur().getAlpha()) * 100.0d);
        } catch (WDException e) {
            throw e;
        }
    }

    public WDBooleen getPoliceBarree() {
        View compPrincipal = getCompPrincipal();
        return compPrincipal instanceof TextView ? new WDBooleen(((TextView) compPrincipal).getPaint().isStrikeThruText()) : new WDBooleen(false);
    }

    public C1397c getPoliceChamp() {
        return C1399b.m9944i();
    }

    public WDBooleen getPoliceGras() {
        View compPrincipal = getCompPrincipal();
        if (!(compPrincipal instanceof TextView)) {
            return new WDBooleen(false);
        }
        TextView textView = (TextView) compPrincipal;
        Typeface typeface = textView.getTypeface();
        TextPaint paint = textView.getPaint();
        try {
            boolean z = typeface.isBold() || (paint != null && paint.isFakeBoldText());
            return new WDBooleen(z);
        } catch (WDException e) {
            throw e;
        }
    }

    public WDBooleen getPoliceItalique() {
        View compPrincipal = getCompPrincipal();
        if (!(compPrincipal instanceof TextView)) {
            return new WDBooleen(false);
        }
        TextView textView = (TextView) compPrincipal;
        Typeface typeface = textView.getTypeface();
        TextPaint paint = textView.getPaint();
        try {
            boolean z = typeface.isItalic() || !(paint == null || paint.getTextSkewX() == 0.0f);
            return new WDBooleen(z);
        } catch (WDException e) {
            throw e;
        }
    }

    public WDBooleen getPoliceSoulignee() {
        View compPrincipal = getCompPrincipal();
        return compPrincipal instanceof TextView ? new WDBooleen(((TextView) compPrincipal).getPaint().isUnderlineText()) : new WDBooleen(false);
    }

    public WDEntier4 getPoliceTaille() {
        View compPrincipal = getCompPrincipal();
        try {
            return compPrincipal instanceof TextView ? new WDEntier4(C1400d.m9964a(C1511l.m10526c(((TextView) compPrincipal).getTextSize(), 1), this)) : super.getPoliceTaille();
        } catch (WDException e) {
            throw e;
        }
    }

    public int getScrollPosition(boolean z) {
        View scrollableView = getScrollableView();
        try {
            if (scrollableView instanceof C1105c) {
                return z ? ((C1105c) scrollableView).mo3349a() : ((C1105c) scrollableView).mo3356c();
            } else {
                if (scrollableView == null) {
                    return -1;
                }
                if (!z) {
                    return scrollableView.getScrollX();
                }
                try {
                    return scrollableView.getScrollY();
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

    public View getScrollableView() {
        return null;
    }

    public int getSourisPosX() {
        try {
            return this.tc != null ? (int) this.tc.getX() : -1;
        } catch (WDException e) {
            throw e;
        }
    }

    public int getSourisPosY() {
        try {
            return this.tc != null ? (int) this.tc.getY() : -1;
        } catch (WDException e) {
            throw e;
        }
    }

    public C1278a getTableColumn() {
        return this.Zb;
    }

    public WDEntier4 getTauxParallaxeHauteur() {
        return new WDEntier4(this.hc);
    }

    public WDEntier4 getTauxParallaxeY() {
        return new WDEntier4(this.ec);
    }

    public Object getUIComp() {
        return getCompPrincipal();
    }

    public void handleScroll(MotionEvent motionEvent) {
        try {
            switch (motionEvent.getAction() & 255) {
                case 0:
                    if (isInterceptTouchEventForScroll()) {
                        requestDisallowInterceptTouchEvent(true);
                        this.N |= 16;
                        return;
                    }
                    this.N &= -17;
                    return;
                case 1:
                    try {
                        if ((this.N & 16) == 16) {
                            requestDisallowInterceptTouchEvent(false);
                        }
                        this.N &= -17;
                        return;
                    } catch (WDException e) {
                        throw e;
                    }
                case 2:
                    try {
                        if ((this.N & 16) == 16) {
                            int action = this.tc != null ? this.tc.getAction() & 255 : -1;
                            if (action == 0 || action == 2) {
                                requestDisallowInterceptTouchEvent(canScroll((int) (this.tc.getX() - motionEvent.getX()), (int) (this.tc.getY() - motionEvent.getY())));
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (WDException e2) {
                        throw e2;
                    } catch (WDException e22) {
                        throw e22;
                    }
                default:
                    return;
            }
        } catch (WDException e222) {
            throw e222;
        } catch (WDException e2222) {
            throw e2222;
        }
        throw e2222;
    }

    public void initialiserObjet() {
        try {
            super.initialiserObjet();
            if (isChampFocusable()) {
                getCompPrincipal().setOnFocusChangeListener(new eb(this));
            }
            activerEcouteurTouch();
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean isActionBarVisiblityControlEnabled() {
        try {
            return (this.N & 512) == 0;
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean isAffiche() {
        try {
            if (this.l != null) {
                if (this.l.estOuverteEtAffichee()) {
                    try {
                        if (getCompConteneur().isShown()) {
                            return true;
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
            return false;
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    public boolean isBloqueTouchEvent() {
        WDFenetre wDFenetre = (WDFenetre) getFenetreMere();
        if (wDFenetre == null) {
            return false;
        }
        try {
            return wDFenetre.isBloqueTouchEvent();
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean isChampEditableDansZR() {
        return false;
    }

    public abstract boolean isChampFocusable();

    protected boolean isInterceptTouchEventForScroll() {
        return this.Vb;
    }

    protected boolean isMaterialDesign() {
        WDFenetre wDFenetre = (WDFenetre) getFenetreMere();
        if (wDFenetre != null) {
            try {
                if (wDFenetre.isMaterialDesign()) {
                    return true;
                }
            } catch (WDException e) {
                throw e;
            }
        }
        return false;
    }

    protected final boolean isPCodeMultitouch() {
        return this.pc;
    }

    public boolean isVisibleExt() {
        try {
            if (_isVisible()) {
                if (getCompConteneur().getVisibility() == 0) {
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

    public void majEtatInterneChamp(int i) {
    }

    public final void makeRoom(int i, int i2) {
        gc gcVar = (gc) getParentOfType(gc.class);
        if (gcVar != null) {
            boolean isAncrageActif = isAncrageActif();
            try {
                setAncrageActif(false);
                int _getLargeur = _getLargeur();
                int i3 = i2;
                gcVar.parcourirChamp(new C1135c(this, i3, _getLocalY(), _getHauteur(), i, _getLocalX(), _getLargeur), false);
                gcVar.adaptSizeFromChildSizeChange(i, i2);
            } finally {
                setAncrageActif(isAncrageActif);
            }
        }
    }

    protected int measureContentHeight() {
        int i = 0;
        View compPrincipal = getCompPrincipal();
        int b = C1503b.m10442b(compPrincipal);
        if (b > 0) {
            try {
                compPrincipal.measure(MeasureSpec.makeMeasureSpec(b, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(0, 0));
                i = compPrincipal.getMeasuredHeight();
            } finally {
                compPrincipal.requestLayout();
            }
        }
        return i;
    }

    protected int measureContentWidth() {
        int i = 0;
        View compPrincipal = getCompPrincipal();
        int c = C1503b.m10449c(compPrincipal);
        if (c > 0) {
            try {
                compPrincipal.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(c, Integer.MIN_VALUE));
                i = compPrincipal.getMeasuredWidth();
            } finally {
                compPrincipal.requestLayout();
            }
        }
        return i;
    }

    protected gc newInstance() {
        Object pere = getPere();
        try {
            return (gc) C0735q.m3114a(getClass(), pere.getClass(), pere);
        } catch (Exception e) {
            C0691a.m2863b(xc[5] + getName(), e);
            return null;
        }
    }

    public void onCreateWindow() {
        wrapSizeToContent();
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        C0938m.m6814b(new zb(this));
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public boolean onLongClick(View view) {
        C0938m.m6814b(new rb(this));
        if (this.dc != null) {
            try {
                if (this.mc) {
                    if (this.dc.isModeActionBar()) {
                        return this.dc.afficherCommeUneActionBar(this);
                    }
                }
            } catch (WDException e) {
                throw e;
            } catch (WDException e2) {
                throw e2;
            }
        }
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        onLongClick(null);
    }

    public void onModifChamp() {
        try {
            if (this.wc != null) {
                this.wc.onModifChamp();
            } else {
                super.onModifChamp();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        try {
            if (isBloqueTouchEvent()) {
                return true;
            }
            try {
                handleScroll(motionEvent);
                executePCodeTouch(motionEvent);
                if (this.bc != null) {
                    this.bc.onTouchEvent(motionEvent);
                }
                return false;
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void prendreFocus() throws fr.pcsoft.wdjava.core.erreur.WDException {
        /*
        r2 = this;
        r0 = fr.pcsoft.wdjava.core.application.WDAppManager.m2548G();	 Catch:{ WDException -> 0x0007 }
        if (r0 == 0) goto L_0x0009;
    L_0x0006:
        return;
    L_0x0007:
        r0 = move-exception;
        throw r0;
    L_0x0009:
        r0 = r2.getCompPrincipal();
        r1 = r0.hasFocus();	 Catch:{ WDException -> 0x0034 }
        if (r1 != 0) goto L_0x0006;
    L_0x0013:
        r1 = r0.isEnabled();	 Catch:{ WDException -> 0x0036 }
        if (r1 == 0) goto L_0x0025;
    L_0x0019:
        r1 = r2.l;	 Catch:{ WDException -> 0x0038 }
        if (r1 == 0) goto L_0x003c;
    L_0x001d:
        r1 = r2.l;	 Catch:{ WDException -> 0x003a }
        r1 = r1.getFinOuverture();	 Catch:{ WDException -> 0x003a }
        if (r1 != 0) goto L_0x003c;
    L_0x0025:
        r0 = r2.Y;	 Catch:{ WDException -> 0x0032 }
        r1 = -1;
        if (r0 == r1) goto L_0x0006;
    L_0x002a:
        r0 = r2.l;	 Catch:{ WDException -> 0x0032 }
        r1 = r2.Y;	 Catch:{ WDException -> 0x0032 }
        r0.setIndiceChampCourant(r1);	 Catch:{ WDException -> 0x0032 }
        goto L_0x0006;
    L_0x0032:
        r0 = move-exception;
        throw r0;
    L_0x0034:
        r0 = move-exception;
        throw r0;
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0032 }
    L_0x003c:
        fr.pcsoft.wdjava.ui.utils.C1503b.m10450d(r0);
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.gc.prendreFocus():void");
    }

    public void release() {
        View compPrincipal = getCompPrincipal();
        if (compPrincipal != null) {
            try {
                compPrincipal.setOnTouchListener(null);
                compPrincipal.setOnLongClickListener(null);
                compPrincipal.setTag(null);
            } catch (WDException e) {
                throw e;
            }
        }
        try {
            super.release();
            if (this.dc != null) {
                this.dc = null;
            }
            try {
                if (this.oc != null) {
                    this.oc.release();
                    this.oc = null;
                }
                try {
                    this.wc = null;
                    if (this.kc != null) {
                        this.kc.mo3386h();
                        this.kc = null;
                    }
                    try {
                        if (this.bc != null) {
                            this.bc.setOnDoubleTapListener(null);
                            this.bc = null;
                        }
                        try {
                            this.tc = null;
                            this.Zb = null;
                            if (this.sc != null) {
                                this.sc.m2261c();
                                this.sc = null;
                            }
                            try {
                                this.ic = null;
                                if (this.qc != null) {
                                    C0938m.m6816c().removeCallbacks(this.qc);
                                    this.qc = null;
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
    }

    public void repeindreChamp() {
        if (isAffiche()) {
            View compPrincipal = getCompPrincipal();
            if (compPrincipal != null) {
                try {
                    compPrincipal.invalidate();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
    }

    public void repeindreChamp(int i, int i2, int i3, int i4) {
        if (isAffiche()) {
            View compPrincipal = getCompPrincipal();
            if (compPrincipal != null) {
                try {
                    compPrincipal.invalidate(i, i2, i + i3, i2 + i4);
                } catch (WDException e) {
                    throw e;
                }
            }
        }
    }

    public void repeindreConteneur() {
        if (isAffiche()) {
            View compConteneur = getCompConteneur();
            if (compConteneur != null) {
                try {
                    compConteneur.invalidate();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
    }

    protected final void requestDisallowInterceptTouchEvent(boolean z) {
        View scrollableView = getScrollableView();
        if (scrollableView == null) {
            scrollableView = getCompPrincipal();
        }
        ViewParent parent = scrollableView.getParent();
        if (parent != null) {
            try {
                parent.requestDisallowInterceptTouchEvent(z);
            } catch (WDException e) {
                throw e;
            }
        }
    }

    protected boolean restauteurInfoChamp(sb sbVar) {
        boolean restauteurInfoChamp = super.restauteurInfoChamp(sbVar);
        if (restauteurInfoChamp) {
            try {
                getCompPrincipal().invalidate();
            } catch (WDException e) {
                throw e;
            }
        }
        return restauteurInfoChamp;
    }

    protected boolean sauverEvtTouch(MotionEvent motionEvent) {
        try {
            switch (motionEvent.getAction() & 255) {
                case 0:
                case 1:
                case 2:
                    this.tc = motionEvent;
                    return true;
                default:
                    return false;
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void setAgencement(int i) {
        this.N |= 128;
        try {
            Object obj;
            if (!isSuperChamp()) {
                if (!isOnglet()) {
                    obj = null;
                    if (obj != null) {
                        appliquerAgencement(i);
                    }
                    if (((db) checkType(db.class)) != null) {
                        parcourirObjetAPCode(new C1207h(this, i), false);
                    }
                    if (obj == null) {
                        appliquerAgencement(i);
                    }
                    if (this.ic == null) {
                        this.ic = new C1281u(this);
                    }
                    C0938m.m6816c().post(this.ic);
                }
            }
            obj = 1;
            if (obj != null) {
                appliquerAgencement(i);
            }
            if (((db) checkType(db.class)) != null) {
                parcourirObjetAPCode(new C1207h(this, i), false);
            }
            if (obj == null) {
                appliquerAgencement(i);
            }
            try {
                if (this.ic == null) {
                    this.ic = new C1281u(this);
                }
                C0938m.m6816c().post(this.ic);
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        } catch (WDException e222) {
            throw e222;
        } catch (WDException e2222) {
            throw e2222;
        } catch (Throwable th) {
            try {
                if (this.ic == null) {
                    this.ic = new C1281u(this);
                }
                C0938m.m6816c().post(this.ic);
            } catch (WDException e22222) {
                throw e22222;
            }
        }
    }

    public void setAutoriseMasquageActionBar(boolean z) {
        try {
            if (!(this instanceof C0512g)) {
                super.setAutoriseMasquageActionBar(z);
            } else if (z == isActionBarVisiblityControlEnabled()) {
            } else {
                if (z) {
                    try {
                        ((WDFenetre) this.l).requestActionBarVisibilityControlOnScroll((C0512g) this);
                        return;
                    } catch (WDException e) {
                        throw e;
                    }
                }
                ((WDFenetre) this.l).stopActionBarVisibilityControlOnScroll((C0512g) this);
            }
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    protected void setCadreExterieur(C1110m c1110m) {
        appliquerCadreExterieur(c1110m);
    }

    protected void setCadreInterne(C1110m c1110m) {
        appliquerCadreInterne(c1110m);
    }

    protected void setCallbackPCodeDemandeMAJAffichage(String str) {
        try {
            if (this.sc == null) {
                this.sc = WDCallback.m2240a(str, this.cc);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void setCouleurTexteAutomatique(int i) {
        try {
            if (this instanceof C0504y) {
                ((C0504y) this).getConteneurManager().mo3421a(i);
                if (isFenetreCree()) {
                    parcourirChamp(new C1282z(this), true);
                    return;
                }
                return;
            }
            super.setCouleurTexteAutomatique(i);
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void setEtatInterne(int i) {
        try {
            getCompPrincipal().setPressed(i == 2);
        } catch (WDException e) {
            throw e;
        }
    }

    public void setLettreAppel(int i) {
        if (i != 0 && i != 65535) {
            try {
                if (this.l != null) {
                    ((WDFenetre) this.l).ajouterLettreAppel(65535 & i, i >> 24, this);
                }
            } catch (WDException e) {
                throw e;
            }
        }
    }

    public void setMenuContextuel(WDObjet wDObjet) {
        if (wDObjet != null) {
            try {
                if (wDObjet.isMenuContextuel()) {
                    this.dc = (C1467b) wDObjet;
                    this.mc = true;
                    if (this.dc.isModeActionBar()) {
                        try {
                            if (WDProjet.getInstance().isVersionCompatible(C0657a.HONEYCOMB.getNumero())) {
                                activerEcouteurLongPress();
                                return;
                            }
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                    getCompPrincipal().setOnCreateContextMenuListener(new C1146f(this));
                    return;
                }
                try {
                    if (wDObjet.getString().equals(xc[0])) {
                        this.dc = null;
                        this.mc = false;
                        return;
                    }
                    this.dc = null;
                    this.mc = true;
                } catch (WDException e2) {
                    throw e2;
                }
            } catch (WDException e22) {
                throw e22;
            } catch (WDException e222) {
                throw e222;
            }
        }
    }

    public void setMenuContextuelSysteme() {
        this.dc = null;
        this.mc = true;
    }

    @TargetApi(11)
    public void setOpacite(int i) {
        try {
            if (kb.m3965a(C0657a.HONEYCOMB)) {
                if (i > 100) {
                    i = 100;
                } else if (i < 0) {
                    i = 0;
                }
                getCompConteneur().setAlpha((float) (((double) i) / 100.0d));
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected final void setPCodeMultitouch(boolean z) {
        this.pc = z;
    }

    protected void setParamAnimationChamp(int i, int i2, int i3) {
    }

    public void setPere(db dbVar) {
        super.setPere(dbVar);
        gc gcVar = (gc) ((WDObjet) dbVar).checkType(gc.class);
        if (gcVar != null) {
            try {
                if ((gcVar.N & 1) != 0) {
                    appliquerCouleurLibelleInverseEnSelection();
                }
            } catch (WDException e) {
                throw e;
            }
        }
        bb bbVar = (bb) getChampParent(bb.class);
        if (bbVar != null) {
            try {
                if (this.v == null) {
                    this.v = new rc(this, bbVar);
                }
            } catch (WDException e2) {
                throw e2;
            }
        }
    }

    public void setPoliceBarree(boolean z) {
        View compPrincipal = getCompPrincipal();
        if (compPrincipal instanceof TextView) {
            ((TextView) compPrincipal).getPaint().setStrikeThruText(z);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPoliceGras(boolean r7) {
        /*
        r6 = this;
        r3 = 1;
        r2 = 0;
        r0 = r6.getCompPrincipal();
        r1 = r0 instanceof android.widget.TextView;
        if (r1 == 0) goto L_0x0034;
    L_0x000a:
        r0 = (android.widget.TextView) r0;
        r4 = r0.getTypeface();
        r1 = r0.getPaint();
        r5 = r4.isItalic();	 Catch:{ WDException -> 0x0035 }
        if (r5 != 0) goto L_0x0025;
    L_0x001a:
        if (r1 == 0) goto L_0x003b;
    L_0x001c:
        r1 = r1.getTextSkewX();	 Catch:{ WDException -> 0x0039 }
        r5 = 0;
        r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r1 == 0) goto L_0x003b;
    L_0x0025:
        r1 = r3;
    L_0x0026:
        if (r7 == 0) goto L_0x003d;
    L_0x0028:
        if (r1 == 0) goto L_0x002b;
    L_0x002a:
        r2 = 2;
    L_0x002b:
        r1 = r3 + r2;
        r2 = android.graphics.Typeface.create(r4, r1);
        r0.setTypeface(r2, r1);
    L_0x0034:
        return;
    L_0x0035:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0037 }
    L_0x0037:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0039 }
    L_0x0039:
        r0 = move-exception;
        throw r0;
    L_0x003b:
        r1 = r2;
        goto L_0x0026;
    L_0x003d:
        r3 = r2;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.gc.setPoliceGras(boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPoliceItalique(boolean r7) {
        /*
        r6 = this;
        r3 = 1;
        r2 = 0;
        r0 = r6.getCompPrincipal();
        r1 = r0 instanceof android.widget.TextView;
        if (r1 == 0) goto L_0x0031;
    L_0x000a:
        r0 = (android.widget.TextView) r0;
        r4 = r0.getTypeface();
        r1 = r0.getPaint();
        r5 = r4.isBold();	 Catch:{ WDException -> 0x0032 }
        if (r5 != 0) goto L_0x0022;
    L_0x001a:
        if (r1 == 0) goto L_0x0038;
    L_0x001c:
        r1 = r1.isFakeBoldText();	 Catch:{ WDException -> 0x0036 }
        if (r1 == 0) goto L_0x0038;
    L_0x0022:
        r1 = r3;
    L_0x0023:
        if (r1 == 0) goto L_0x003a;
    L_0x0025:
        if (r7 == 0) goto L_0x0028;
    L_0x0027:
        r2 = 2;
    L_0x0028:
        r1 = r3 + r2;
        r2 = android.graphics.Typeface.create(r4, r1);
        r0.setTypeface(r2, r1);
    L_0x0031:
        return;
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0036 }
    L_0x0036:
        r0 = move-exception;
        throw r0;
    L_0x0038:
        r1 = r2;
        goto L_0x0023;
    L_0x003a:
        r3 = r2;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.gc.setPoliceItalique(boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPoliceNom(java.lang.String r8) {
        /*
        r7 = this;
        r3 = 1;
        r2 = 0;
        r0 = r7.getCompPrincipal();
        r1 = r0 instanceof android.widget.TextView;
        if (r1 == 0) goto L_0x0045;
    L_0x000a:
        r0 = (android.widget.TextView) r0;
        r4 = r0.getTypeface();
        r5 = r0.getPaint();
        r1 = r4.isItalic();	 Catch:{ WDException -> 0x0046 }
        if (r1 != 0) goto L_0x0025;
    L_0x001a:
        if (r5 == 0) goto L_0x004c;
    L_0x001c:
        r1 = r5.getTextSkewX();	 Catch:{ WDException -> 0x004a }
        r6 = 0;
        r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r1 == 0) goto L_0x004c;
    L_0x0025:
        r1 = r3;
    L_0x0026:
        r4 = r4.isBold();	 Catch:{ WDException -> 0x004e }
        if (r4 != 0) goto L_0x0034;
    L_0x002c:
        if (r5 == 0) goto L_0x0054;
    L_0x002e:
        r4 = r5.isFakeBoldText();	 Catch:{ WDException -> 0x0052 }
        if (r4 == 0) goto L_0x0054;
    L_0x0034:
        r4 = r3;
    L_0x0035:
        if (r4 == 0) goto L_0x0056;
    L_0x0037:
        if (r1 == 0) goto L_0x003a;
    L_0x0039:
        r2 = 2;
    L_0x003a:
        r1 = r3 + r2;
        r2 = fr.pcsoft.wdjava.ui.p079e.C1399b.m9943a(r8, r1);
        if (r2 == 0) goto L_0x0045;
    L_0x0042:
        r0.setTypeface(r2, r1);	 Catch:{ WDException -> 0x0058 }
    L_0x0045:
        return;
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r1 = r2;
        goto L_0x0026;
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        throw r0;
    L_0x0054:
        r4 = r2;
        goto L_0x0035;
    L_0x0056:
        r3 = r2;
        goto L_0x0037;
    L_0x0058:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.gc.setPoliceNom(java.lang.String):void");
    }

    public void setPoliceSoulignee(boolean z) {
        View compPrincipal = getCompPrincipal();
        if (compPrincipal instanceof TextView) {
            ((TextView) compPrincipal).getPaint().setUnderlineText(z);
        }
    }

    public void setPoliceTaille(int i) {
        View compPrincipal = getCompPrincipal();
        try {
            if (compPrincipal instanceof TextView) {
                ((TextView) compPrincipal).setTextSize(1, C1400d.m9963a(i, this));
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean setPositionChamp(int i, int i2, int i3) {
        try {
            if (WDAppManager.m2548G()) {
                return false;
            }
            boolean positionChamp = super.setPositionChamp(i, i2, i3);
            try {
                if (this.oc == null) {
                    return positionChamp;
                }
                if (this.oc._getX() == _getX()) {
                    try {
                        if (this.oc._getY() == _getY()) {
                            return positionChamp;
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
                this.oc.setPositionChamp(_getX(), _getY(), i3);
                return positionChamp;
            } catch (WDException e2) {
                throw e2;
            } catch (WDException e22) {
                throw e22;
            }
        } catch (WDException e222) {
            throw e222;
        }
    }

    public boolean setPositionRelatif(int i, int i2) {
        return C1503b.m10439a(getCompConteneur(), i, i2);
    }

    public int setScrollPosition(boolean z, int i) {
        View scrollableView = getScrollableView();
        try {
            if (scrollableView instanceof C1105c) {
                if (z) {
                    ((C1105c) scrollableView).mo3355b(i);
                    return ((C1105c) scrollableView).mo3349a();
                }
                ((C1105c) scrollableView).mo3350a(i);
                return ((C1105c) scrollableView).mo3356c();
            } else if (scrollableView == null) {
                return -1;
            } else {
                if (z) {
                    try {
                        scrollableView.scrollTo(scrollableView.getScrollX(), i);
                        return scrollableView.getScrollY();
                    } catch (WDException e) {
                        throw e;
                    }
                }
                scrollableView.scrollTo(i, scrollableView.getScrollY());
                return scrollableView.getScrollX();
            }
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean setTailleChamp(int r8, int r9, int r10) {
        /*
        r7 = this;
        r3 = 1;
        r2 = 0;
        r1 = fr.pcsoft.wdjava.core.application.WDAppManager.m2548G();	 Catch:{ WDException -> 0x0009 }
        if (r1 == 0) goto L_0x000b;
    L_0x0008:
        return r2;
    L_0x0009:
        r1 = move-exception;
        throw r1;
    L_0x000b:
        r1 = r7._getLargeur();
        r4 = r7._getHauteur();
        r5 = r10 & 2;
        if (r5 != 0) goto L_0x001b;
    L_0x0017:
        r5 = r10 & 1;
        if (r5 == 0) goto L_0x002d;
    L_0x001b:
        r5 = r7.I;	 Catch:{ WDException -> 0x005f }
        if (r8 >= r5) goto L_0x0061;
    L_0x001f:
        r8 = r7.I;
    L_0x0021:
        r5 = r7.Lb;
        if (r9 >= r5) goto L_0x0027;
    L_0x0025:
        r9 = r7.Lb;
    L_0x0027:
        r5 = r7.Z;
        if (r9 <= r5) goto L_0x002d;
    L_0x002b:
        r9 = r7.Z;
    L_0x002d:
        r5 = r7.m1340a(r1, r4, r8, r9);
        if (r5 == 0) goto L_0x00ad;
    L_0x0033:
        r5 = r8 - r1;
        r4 = r9 - r4;
        r1 = r10 & 4;
        if (r1 <= 0) goto L_0x0045;
    L_0x003b:
        r1 = r7.U;	 Catch:{ WDException -> 0x0068 }
        r1 = r1 + r5;
        r7.U = r1;	 Catch:{ WDException -> 0x0068 }
        r1 = r7.p;	 Catch:{ WDException -> 0x0068 }
        r1 = r1 + r4;
        r7.p = r1;	 Catch:{ WDException -> 0x0068 }
    L_0x0045:
        r1 = r7.Jb;
        if (r1 == 0) goto L_0x006a;
    L_0x0049:
        r1 = r7.Jb;
        r6 = r1.iterator();
    L_0x004f:
        r1 = r6.hasNext();
        if (r1 == 0) goto L_0x006a;
    L_0x0055:
        r1 = r6.next();
        r1 = (fr.pcsoft.wdjava.ui.champs.C0530v) r1;
        r1.onSizeChanged(r7, r5, r4, r10);
        goto L_0x004f;
    L_0x005f:
        r1 = move-exception;
        throw r1;
    L_0x0061:
        r5 = r7.hb;
        if (r8 <= r5) goto L_0x0021;
    L_0x0065:
        r8 = r7.hb;
        goto L_0x0021;
    L_0x0068:
        r1 = move-exception;
        throw r1;
    L_0x006a:
        r1 = r10 & 2;
        if (r1 != 0) goto L_0x00ac;
    L_0x006e:
        r1 = r7.Kb;	 Catch:{ WDException -> 0x00db }
        r6 = 7;
        r1 = fr.pcsoft.wdjava.core.C0727l.m3092b(r1, r6);	 Catch:{ WDException -> 0x00db }
        if (r1 == 0) goto L_0x00df;
    L_0x0077:
        if (r5 == 0) goto L_0x00df;
    L_0x0079:
        r1 = r3;
    L_0x007a:
        r5 = r7.Kb;	 Catch:{ WDException -> 0x00e1 }
        r6 = 8;
        r5 = fr.pcsoft.wdjava.core.C0727l.m3092b(r5, r6);	 Catch:{ WDException -> 0x00e1 }
        if (r5 == 0) goto L_0x00e5;
    L_0x0084:
        if (r4 == 0) goto L_0x00e5;
    L_0x0086:
        r4 = r3;
    L_0x0087:
        if (r1 != 0) goto L_0x008b;
    L_0x0089:
        if (r4 == 0) goto L_0x00ac;
    L_0x008b:
        r2 = r7.getPere();
        r5 = r2 instanceof fr.pcsoft.wdjava.ui.champs.gc;	 Catch:{ WDException -> 0x00e7 }
        if (r5 == 0) goto L_0x00f1;
    L_0x0093:
        if (r1 == 0) goto L_0x009f;
    L_0x0095:
        r0 = r2;
        r0 = (fr.pcsoft.wdjava.ui.champs.gc) r0;	 Catch:{ WDException -> 0x00eb }
        r1 = r0;
        r1 = r1.canHandleHeightAnchoredToContentChildren();	 Catch:{ WDException -> 0x00eb }
        if (r1 != 0) goto L_0x00a9;
    L_0x009f:
        if (r4 == 0) goto L_0x00f1;
    L_0x00a1:
        r2 = (fr.pcsoft.wdjava.ui.champs.gc) r2;	 Catch:{ WDException -> 0x00ef }
        r1 = r2.canHandleWidthAnchoredToContentChildren();	 Catch:{ WDException -> 0x00ef }
        if (r1 == 0) goto L_0x00f1;
    L_0x00a9:
        r7.wrapSizeToContent();	 Catch:{ WDException -> 0x00ef }
    L_0x00ac:
        r2 = r3;
    L_0x00ad:
        r1 = r7.oc;	 Catch:{ WDException -> 0x00fe }
        if (r1 == 0) goto L_0x0008;
    L_0x00b1:
        r1 = r7.oc;	 Catch:{ WDException -> 0x0100 }
        r1 = r1._getLargeur();	 Catch:{ WDException -> 0x0100 }
        r3 = r7._getLargeur();	 Catch:{ WDException -> 0x0100 }
        if (r1 != r3) goto L_0x00c9;
    L_0x00bd:
        r1 = r7.oc;	 Catch:{ WDException -> 0x00d9 }
        r1 = r1._getHauteur();	 Catch:{ WDException -> 0x00d9 }
        r3 = r7._getHauteur();	 Catch:{ WDException -> 0x00d9 }
        if (r1 == r3) goto L_0x0008;
    L_0x00c9:
        r1 = r7.oc;	 Catch:{ WDException -> 0x00d9 }
        r3 = r7._getLargeur();	 Catch:{ WDException -> 0x00d9 }
        r4 = r7._getHauteur();	 Catch:{ WDException -> 0x00d9 }
        r5 = 0;
        r1.setTailleChamp(r3, r4, r5);	 Catch:{ WDException -> 0x00d9 }
        goto L_0x0008;
    L_0x00d9:
        r1 = move-exception;
        throw r1;
    L_0x00db:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x00dd }
    L_0x00dd:
        r1 = move-exception;
        throw r1;
    L_0x00df:
        r1 = r2;
        goto L_0x007a;
    L_0x00e1:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x00e3 }
    L_0x00e3:
        r1 = move-exception;
        throw r1;
    L_0x00e5:
        r4 = r2;
        goto L_0x0087;
    L_0x00e7:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x00e9 }
    L_0x00e9:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x00eb }
    L_0x00eb:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x00ed }
    L_0x00ed:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x00ef }
    L_0x00ef:
        r1 = move-exception;
        throw r1;
    L_0x00f1:
        r1 = r7.getCompPrincipal();
        r2 = new fr.pcsoft.wdjava.ui.champs.n;
        r2.<init>(r7);
        r1.post(r2);
        goto L_0x00ac;
    L_0x00fe:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x0100 }
    L_0x0100:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x00d9 }
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.gc.setTailleChamp(int, int, int):boolean");
    }

    protected void setTauxParallaxe(int i, int i2) {
        this.ec = i;
        this.hc = i2;
    }

    public void setTauxParallaxeHauteur(int i) {
        this.hc = i;
    }

    public void setTauxParallaxeY(int i) {
        this.ec = i;
    }

    public final void showContextMenu() {
        try {
            if (this.dc == null) {
                return;
            }
            if (this.dc.isModeActionBar()) {
                this.dc.afficherCommeUneActionBar(this);
            } else {
                getCompPrincipal().showContextMenu();
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void terminerInitialisation() {
        super.terminerInitialisation();
        View compPrincipal = getCompPrincipal();
        if (compPrincipal != null) {
            try {
                compPrincipal.setTag(this);
            } catch (WDException e) {
                throw e;
            }
        }
    }

    public void transfererFocus() {
        try {
            if (getCompPrincipal().hasFocus()) {
                C1439b.m10105d().m10107e();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void updateLabelTextColor() {
        if ((this.N & 1024) > 0) {
            C0504y c0504y = (C0504y) getChampParent(C0504y.class);
            if (c0504y != null) {
                int automaticTextColorWL;
                int b;
                TextView compLibelle;
                if (c0504y instanceof fb) {
                    C0524x c0524x = (C0524x) ((fb) c0504y).getChampFenetreInterne();
                    if (c0524x != null) {
                        automaticTextColorWL = c0524x.getAutomaticTextColorWL();
                        if (automaticTextColorWL != C0607n.Kw) {
                            automaticTextColorWL = C1031a.m7467k(automaticTextColorWL);
                        }
                        b = automaticTextColorWL != C0607n.Kw ? c0504y.getConteneurManager().mo3423b() : automaticTextColorWL;
                        compLibelle = getCompLibelle();
                        if (compLibelle != null) {
                            try {
                                C1503b.m10432a(compLibelle, b, b);
                            } catch (WDException e) {
                                throw e;
                            }
                        }
                    }
                }
                automaticTextColorWL = C0607n.Kw;
                if (automaticTextColorWL != C0607n.Kw) {
                }
                compLibelle = getCompLibelle();
                if (compLibelle != null) {
                    C1503b.m10432a(compLibelle, b, b);
                }
            }
        }
    }

    public void updateLayout() {
        int i;
        int i2 = 0;
        View compConteneur = getCompConteneur();
        LayoutParams layoutParams = compConteneur.getLayoutParams();
        if (layoutParams != null) {
            try {
                if (layoutParams instanceof ib) {
                    i = ((ib) layoutParams).x;
                    i2 = ((ib) layoutParams).y;
                    compConteneur.measure(layoutParams.width + 1073741824, layoutParams.height + 1073741824);
                    compConteneur.layout(i, i2, layoutParams.width + i, layoutParams.height + i2);
                }
            } catch (WDException e) {
                throw e;
            }
        }
        i = 0;
        compConteneur.measure(layoutParams.width + 1073741824, layoutParams.height + 1073741824);
        compConteneur.layout(i, i2, layoutParams.width + i, layoutParams.height + i2);
    }

    public void updateUIChamp() {
        repeindreChamp();
    }

    public final void updateUI_WL(WDObjet... wDObjetArr) {
        try {
            if (this.sc != null) {
                if (this.sc.m2260b() != wDObjetArr.length) {
                    this.sc.m2261c();
                    this.sc = null;
                }
            }
            try {
                this.cc = wDObjetArr.length;
                appelPCode(C0607n.Jn);
                if (this.sc != null) {
                    appelPCodeAvecParametres(C0607n.Jn, this.sc, wDObjetArr);
                }
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    public void wrapSizeToContent() {
        boolean b = C0727l.m3092b(this.Kb, 7);
        boolean b2 = C0727l.m3092b(this.Kb, 8);
        if (b || b2) {
            int i = this.Eb;
            int i2 = this.Tb;
            if (b) {
                try {
                    this.Tb = computePreferredHeight();
                } catch (WDException e) {
                    throw e;
                }
            }
            this.Eb = computePreferredWidth();
            try {
                if (i != this.Eb || i2 != this.Tb) {
                    Object obj;
                    if (this.Jb != null) {
                        obj = 1;
                        for (C0530v onPreferredSizeChanged : this.Jb) {
                            obj = onPreferredSizeChanged.onPreferredSizeChanged(this, this.Eb - i, this.Tb - i2) ? null : obj;
                        }
                    } else {
                        obj = 1;
                    }
                    if (obj != null) {
                        int i3;
                        int i4;
                        if (b) {
                            try {
                                i3 = this.Tb;
                            } catch (WDException e2) {
                                throw e2;
                            }
                        }
                        i3 = _getHauteur();
                        if (b2) {
                            try {
                                i4 = this.Eb;
                            } catch (WDException e22) {
                                throw e22;
                            }
                        }
                        i4 = _getLargeur();
                        setTailleChamp(i4, i3, 2);
                    }
                }
            } catch (WDException e222) {
                throw e222;
            }
        }
    }
}
