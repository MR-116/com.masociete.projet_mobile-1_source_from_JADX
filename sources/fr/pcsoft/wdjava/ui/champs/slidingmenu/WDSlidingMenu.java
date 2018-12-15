package fr.pcsoft.wdjava.ui.champs.slidingmenu;

import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.champs.C1151p;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.WDChampFenetreInterne;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.WDFenetreInterne;
import fr.pcsoft.wdjava.ui.champs.slidingmenu.p070a.C1270l;
import fr.pcsoft.wdjava.ui.champs.slidingmenu.p071b.C1275a;
import fr.pcsoft.wdjava.ui.p033c.C0510b;
import fr.pcsoft.wdjava.ui.p033c.C1108e;
import fr.pcsoft.wdjava.ui.p079e.C1399b;

public class WDSlidingMenu extends WDChampFenetreInterne implements C0526d {
    private int Hc = 0;
    private int Ic = 80;
    private boolean Jc = false;

    protected void appliquerCouleurLibelleInverseEnSelection() {
    }

    protected void createConteneur() {
    }

    public C1269c createLayout(int i, WDFenetre wDFenetre) {
        C1269c c1270l;
        switch (i) {
            case 1:
                c1270l = new C1270l(wDFenetre);
                c1270l.m8851c(1.0f);
                return c1270l;
            case 2:
                c1270l = new C1270l(wDFenetre);
                c1270l.m8851c(0.0f);
                return c1270l;
            default:
                return new C1275a(wDFenetre);
        }
    }

    protected void creerComposant() {
        if (isAvecAscenseurAuto()) {
            this.Gc = new C1108e(C1056i.m7562a());
            ((C1108e) this.Gc).mo3351a((C0510b) this);
        } else {
            this.Gc = new C1151p(C1056i.m7562a());
        }
        this.Bc = this.Gc;
    }

    public final int getPosition() {
        return this.Hc;
    }

    public final int getWidthRatio() {
        return this.Ic;
    }

    protected void installerFenetreInterne(WDFenetreInterne wDFenetreInterne) {
        if (this.Gc.getLayoutParams() == null) {
            setTailleChamp(wDFenetreInterne._getLargeurInitiale(), wDFenetreInterne._getHauteurInitiale(), 0);
        }
        super.installerFenetreInterne(wDFenetreInterne);
    }

    public boolean isActionBarVisiblityControlEnabled() {
        return false;
    }

    protected boolean isAvecAscenseurAuto() {
        return true;
    }

    protected boolean isCanScrollHorizontally() {
        return false;
    }

    public final boolean isDisplayedWithGesture() {
        return this.Jc;
    }

    public int onLayout(int i, int i2) {
        int i3 = 0;
        if (this.Ic > 0) {
            i3 = (this.Ic * i) / 100;
        } else if (this.Ec != null) {
            i3 = this.Ec._getLargeurInitiale();
        }
        setMenuSize(i3, i2);
        return i3;
    }

    public void setLibelle(String str) {
    }

    public final void setMenuSize(int i, int i2) {
        setTailleChamp(i, i2, 0);
    }

    protected final void setParamSlidingMenu(int i, boolean z, int i2) {
        this.Ic = i;
        this.Jc = z;
        this.Hc = i2;
    }

    protected void setPresenceLibelle(boolean z) {
    }

    public void setRectLibelle(int i, int i2, int i3, int i4) {
    }

    protected void setStyleLibelle(int i, C1399b c1399b, int i2, int i3, int i4) {
    }
}
