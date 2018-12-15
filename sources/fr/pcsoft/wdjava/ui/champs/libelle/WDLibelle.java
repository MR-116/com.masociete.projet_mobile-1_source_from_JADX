package fr.pcsoft.wdjava.ui.champs.libelle;

import android.animation.ObjectAnimator;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.ui.C1471o;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.champs.table.colonne.C1278a;
import fr.pcsoft.wdjava.ui.champs.zr.bb;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p064a.C1035e;
import fr.pcsoft.wdjava.ui.p069g.C1409j;
import fr.pcsoft.wdjava.ui.p079e.C1399b;
import fr.pcsoft.wdjava.ui.p080h.C1424g;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import fr.pcsoft.wdjava.ui.utils.C1511l;

public class WDLibelle extends C0523c {
    private static int Gc;
    private static final String Jc = m1475z(m1476z("\u0004\u0005^"));
    private static final String[] Lc;
    private ObjectAnimator Fc = null;
    private TextView Hc = null;
    private boolean Ic = true;
    private int Kc = 1;

    static {
        int i = 0;
        r1 = new String[2];
        r1[0] = m1475z(m1476z("XD\u0004gVCD\u001e^"));
        r1[1] = m1475z(m1476z("kE\u0019kC^B\u001fh\u0002DD\u001e&Q_[\u0000iP^Â\u0015("));
        Lc = r1;
        if (C1471o.m10303a()) {
            i = C1511l.f4644r;
        }
        Gc = i;
    }

    public WDLibelle() {
        m1470a();
    }

    public WDLibelle(C1278a c1278a) {
        super(c1278a);
        m1470a();
    }

    /* renamed from: a */
    private final void m1470a() {
        this.Hc = new C1226a(this, C1056i.m7562a());
        this.Hc.setIncludeFontPadding(C1471o.m10303a());
    }

    /* renamed from: a */
    private void m1471a(boolean z) {
        this.Ic = z;
        this.Hc.setSingleLine(!z);
    }

    /* renamed from: b */
    private void m1472b() {
        int c;
        int a;
        int m;
        int i = 0;
        if (this.kc != null) {
            c = this.kc.mo3374c();
            a = this.kc.mo3364a();
            m = this.kc.mo3380m();
            i = this.kc.mo3377g();
        } else {
            m = 0;
            a = 0;
            c = 0;
        }
        if (this.Kc == 2 && r3 < 5) {
            c = 5;
        }
        this.Hc.setPadding(c, m, a, i);
    }

    /* renamed from: c */
    private final void m1473c() {
        C1424g.m10031a(this.Hc, this.Ec);
        wrapSizeToContent();
    }

    /* renamed from: d */
    private final void m1474d() {
        if (this.Hc.getEllipsize() != null) {
            if (kb.m3965a(C0657a.MARSHMALLOW)) {
                bb bbVar = (bb) getChampParent(bb.class);
                if (bbVar != null && bbVar.getRenderingMode().isDoubleBufferedRendering()) {
                    return;
                }
            }
            if (_getHauteur() < this.Hc.getLineHeight() * 2) {
                if (isMultiligne()) {
                    m1471a(false);
                }
            } else if (!isMultiligne()) {
                m1471a(true);
            }
        }
    }

    /* renamed from: z */
    private static String m1475z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 42;
                    break;
                case 1:
                    i2 = 43;
                    break;
                case 2:
                    i2 = 112;
                    break;
                case 3:
                    i2 = 6;
                    break;
                default:
                    i2 = 34;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1476z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 34);
        }
        return toCharArray;
    }

    protected void appliquerCouleur(int i) {
        if (isFenetreCree() || i != C0607n.Kw) {
            int k = C1031a.m7467k(i);
            C1503b.m10432a(this.Hc, k, k);
            return;
        }
        this.N |= 1024;
    }

    protected void appliquerCouleurLibelleInverseEnSelection() {
        if (this.cb != C0607n.xv) {
            return;
        }
        if (this.kc == null || C1031a.m7448a(this.kc.mo3387l()) == 0) {
            this.Hc.setTextColor(C1035e.m7509a(this.Hc));
        }
    }

    protected void appliquerTransparent() {
        C1503b.m10432a(this.Hc, 0, 0);
    }

    public WDEntier4 getCadrageHorizontal() {
        return new WDEntier4(C1503b.m10421a(this.Hc));
    }

    public WDEntier4 getCadrageVertical() {
        return new WDEntier4(C1503b.m10443b(this.Hc));
    }

    public View getCompConteneur() {
        return getCompLibelle();
    }

    public final TextView getCompLibelle() {
        return this.Hc;
    }

    public View getCompPrincipal() {
        return getCompLibelle();
    }

    public WDEntier4 getEllipse() {
        TruncateAt ellipsize = this.Hc.getEllipsize();
        if (ellipsize != null) {
            if (ellipsize.equals(TruncateAt.MIDDLE)) {
                return new WDEntier4(16384);
            }
            if (ellipsize.equals(TruncateAt.END)) {
                return new WDEntier4(32768);
            }
        }
        return new WDEntier4(0);
    }

    public WDObjet getRetraitBas() {
        return new WDEntier4(this.kc != null ? (double) C1511l.m10515a((float) this.kc.mo3377g(), 1, getDisplayUnit()) : 0.0d);
    }

    public WDObjet getRetraitDroit() {
        return new WDEntier4(this.kc != null ? (double) C1511l.m10515a((float) this.kc.mo3364a(), 1, getDisplayUnit()) : 0.0d);
    }

    public WDObjet getRetraitGauche() {
        return new WDEntier4(this.kc != null ? (double) C1511l.m10515a((float) this.kc.mo3374c(), 1, getDisplayUnit()) : 0.0d);
    }

    public WDObjet getRetraitHaut() {
        return new WDEntier4(this.kc != null ? (double) C1511l.m10515a((float) this.kc.mo3380m(), 1, getDisplayUnit()) : 0.0d);
    }

    public String getTexteAffiche() {
        return this.Hc.getText().toString();
    }

    public boolean isMultiligne() {
        return this.Ic;
    }

    protected int measureContentHeight() {
        return C0808l.m4053k(this.Ec) ? 0 : super.measureContentHeight();
    }

    protected int measureContentWidth() {
        return C0808l.m4053k(this.Ec) ? 0 : super.measureContentWidth();
    }

    public void release() {
        super.release();
        this.Hc = null;
    }

    public void setCadrageHorizontal(int i) {
        C1503b.m10431a(this.Hc, i);
    }

    public void setCadrageVertical(int i) {
        C1503b.m10446b(this.Hc, i);
    }

    public void setEllipse(int i) {
        switch (i) {
            case 16384:
                m1471a(false);
                this.Hc.setEllipsize(TruncateAt.MIDDLE);
                return;
            case 32768:
                this.Hc.setEllipsize(TruncateAt.END);
                return;
            default:
                this.Hc.setEllipsize(null);
                return;
        }
    }

    public void setEtat(int i) {
        super.setEtat(i);
        switch (i) {
            case 0:
            case 1:
                C1503b.m10433a(this.Hc, true);
                break;
            case 4:
                C1503b.m10433a(this.Hc, false);
                break;
            default:
                return;
        }
        this.d = i;
    }

    public void setLibelle(String str) {
        if (!isReleased()) {
            String str2 = this.Ec;
            super.setLibelle(str);
            if (this.Fc == null || !this.Hc.isShown() || C0808l.m4053k(str) || this.Ec.equals(str2)) {
                m1473c();
            } else {
                this.Fc.start();
            }
        }
    }

    protected void setParamAnimationChamp(int i, int i2, int i3) {
        if (i == 34) {
            if (i3 == 0) {
                i3 = C1409j.f4188e;
            }
            switch (i2) {
                case 30:
                case 31:
                    setCadrageVertical(1);
                    int i4 = i2 == 30 ? 180 : -180;
                    this.Fc = ObjectAnimator.ofFloat(this.Hc, Lc[0], new float[]{(float) null, (float) i4});
                    this.Fc.setEvaluator(new C1227b(this));
                    this.Fc.setDuration((long) i3);
                    this.Fc.setInterpolator(new AccelerateDecelerateInterpolator());
                    this.Hc.addOnLayoutChangeListener(new C1228d(this));
                    return;
                default:
                    C0691a.m2856a(Lc[1]);
                    return;
            }
        }
    }

    public void setRetraitBas(int i) {
        int d = C1511l.m10532d((float) i, getDisplayUnit());
        if (this.kc != null) {
            this.kc.mo3365a(this.kc.mo3374c(), this.kc.mo3380m(), this.kc.mo3364a(), d);
            m1472b();
        }
    }

    public void setRetraitDroit(int i) {
        int d = C1511l.m10532d((float) i, getDisplayUnit());
        if (this.kc != null) {
            this.kc.mo3365a(this.kc.mo3374c(), this.kc.mo3380m(), d, this.kc.mo3377g());
            m1472b();
        }
    }

    public void setRetraitGauche(int i) {
        int d = C1511l.m10532d((float) i, getDisplayUnit());
        if (this.kc != null) {
            this.kc.mo3365a(d, this.kc.mo3380m(), this.kc.mo3364a(), this.kc.mo3377g());
            m1472b();
        }
    }

    public void setRetraitHaut(int i) {
        int d = C1511l.m10532d((float) i, getDisplayUnit());
        if (this.kc != null) {
            this.kc.mo3365a(this.kc.mo3374c(), d, this.kc.mo3364a(), this.kc.mo3377g());
            m1472b();
        }
    }

    protected void setStyleLibelle(int i, int i2, C1399b c1399b, int i3, int i4, int i5) {
        if (isChangementAgencementEnCours()) {
            c1399b.m9954a(this.Hc);
        } else {
            setCouleur(i);
            c1399b.m9954a(this.Hc);
            this.Kc = i3;
        }
        if (i4 != 0) {
            C1503b.m10447b(this.Hc, i4, C1031a.m7467k(i5));
        }
    }

    public void terminerInitialisation() {
        super.terminerInitialisation();
        m1472b();
    }
}
