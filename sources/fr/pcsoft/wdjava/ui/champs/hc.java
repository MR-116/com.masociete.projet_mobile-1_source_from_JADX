package fr.pcsoft.wdjava.ui.champs;

import android.graphics.Path;
import android.text.method.HideReturnsTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.C1471o;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.cadre.C1110m;
import fr.pcsoft.wdjava.ui.cadre.C1113c;
import fr.pcsoft.wdjava.ui.champs.table.colonne.C1278a;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p064a.C1035e;
import fr.pcsoft.wdjava.ui.p079e.C1399b;
import fr.pcsoft.wdjava.ui.p080h.C1424g;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import fr.pcsoft.wdjava.ui.utils.C1511l;

public abstract class hc extends gc {
    private TextView Ac = null;
    protected ViewGroup Bc;
    private int xc = 1;
    private String yc = "";
    private boolean zc = false;

    public hc() {
        m1343a();
    }

    protected hc(C1278a c1278a) {
        super(c1278a);
        m1343a();
    }

    /* renamed from: a */
    private final void m1343a() {
        createConteneur();
    }

    protected void appliquerCadreExterieur(C1110m c1110m) {
        int i;
        super.appliquerCadreExterieur(c1110m);
        if (c1110m instanceof C1113c) {
            int s = ((C1113c) c1110m).m8143s();
            if (s > 0) {
                View compPrincipal = getCompPrincipal();
                LayoutParams layoutParams = compPrincipal.getLayoutParams();
                if (layoutParams != null && (layoutParams instanceof ib)) {
                    int i2 = ((ib) layoutParams).x;
                    int i3 = ((ib) layoutParams).y;
                    int i4 = ((ib) layoutParams).width;
                    i = ((ib) layoutParams).height;
                    if (i2 == 0 && i3 == 0 && i4 == _getLargeur() && i == _getHauteur()) {
                        C1503b.m10426a(compPrincipal, i2 + s, i3 + s, i4 - (s * 2), i - (s * 2));
                    }
                }
            }
        }
        if (!this.S) {
            i = c1110m.mo3382b();
            if (i > 0) {
                LayoutParams layoutParams2 = getCompPrincipal().getLayoutParams();
                if (layoutParams2 instanceof ib) {
                    ib ibVar = (ib) layoutParams2;
                    ibVar.x += i;
                    ibVar.y += i;
                    ibVar.width -= i * 2;
                    ibVar.height -= i * 2;
                }
            }
        }
    }

    protected void appliquerCouleurLibelleInverseEnSelection() {
        if (this.zc) {
            this.Ac.setTextColor(C1035e.m7509a(this.Ac));
        }
    }

    public gc cloneChampForZR(boolean z, boolean z2) {
        return (hc) super.cloneChampForZR(z, z2);
    }

    protected void createConteneur() {
        if (this.Zb == null) {
            this.Bc = new C1248q(this, C1056i.m7562a());
            this.Ac = new TextView(C1056i.m7562a());
            this.Ac.setTextColor(-16777216);
            this.Ac.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            this.Ac.setIncludeFontPadding(C1471o.m10303a());
            this.Bc.addView(this.Ac);
        }
    }

    protected Path getBorderClipPath() {
        return null;
    }

    public View getCompConteneur() {
        return this.Zb != null ? getCompPrincipal() : this.Bc;
    }

    public TextView getCompLibelle() {
        return this.Ac;
    }

    public WDChaine getLibelle() {
        return new WDChaine(this.yc);
    }

    public void release() {
        super.release();
        this.Ac = null;
        this.yc = null;
        this.Bc = null;
    }

    public void setEtat(int i) {
        boolean z = true;
        super.setEtat(i);
        switch (i) {
            case 0:
            case 1:
            case 4:
                this.d = i;
                getCompPrincipal().setEnabled(i != 4);
                if (this.Ac != null) {
                    TextView textView = this.Ac;
                    if (i == 4) {
                        z = false;
                    }
                    C1503b.m10433a(textView, z);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void setLibelle(String str) {
        this.yc = str;
        StringBuffer stringBuffer = new StringBuffer();
        C0808l.m4009a(str, stringBuffer);
        C1424g.m10031a(this.Ac, stringBuffer.toString());
    }

    protected void setPresenceLibelle(boolean z) {
        super.setPresenceLibelle(z);
        this.Ac.setVisibility(this.S ? 0 : 4);
    }

    public void setRectCompPrincipal(int i, int i2, int i3, int i4) {
        C1503b.m10426a(getCompPrincipal(), C1511l.m10532d((float) i, 2), C1511l.m10532d((float) i2, 2), C1511l.m10532d((float) i3, 2), C1511l.m10532d((float) i4, 2));
    }

    public void setRectLibelle(int i, int i2, int i3, int i4) {
        C1503b.m10426a(this.Ac, C1511l.m10532d((float) i, 2), C1511l.m10532d((float) i2, 2), C1511l.m10532d((float) i3, 2), C1511l.m10532d((float) i4, 2));
    }

    protected void setStyleLibelle(int i, C1399b c1399b, int i2, int i3, int i4) {
        int i5 = 0;
        if (isChangementAgencementEnCours()) {
            c1399b.m9954a(this.Ac);
        } else {
            this.xc = i2;
            if (i == C0607n.Kw) {
                this.N &= 1024;
            } else {
                this.zc = i == C0607n.xv;
                int k = C1031a.m7467k(i);
                C1503b.m10432a(this.Ac, k, k);
            }
            c1399b.m9954a(this.Ac);
            if (i2 == 4) {
                C1503b.m10446b(this.Ac, 0);
            } else if (i2 == -2) {
                C1503b.m10446b(this.Ac, 1);
                if (this.Ac != null) {
                    getCompPrincipal().getViewTreeObserver().addOnPreDrawListener(new yc(this));
                }
            }
            switch (this.xc) {
                case -2:
                case 0:
                case 3:
                case 4:
                    i5 = 3;
                    break;
                case 2:
                    i5 = 7;
                    break;
            }
            if (i5 != 0) {
                LayoutParams layoutParams = this.Ac.getLayoutParams();
                if (layoutParams instanceof ib) {
                    C1503b.m10439a(this.Ac, ((ib) layoutParams).x + 7, ((ib) layoutParams).y);
                }
            }
        }
        if (i3 != 0) {
            C1503b.m10447b(this.Ac, i3, C1031a.m7467k(i4));
        }
    }
}
