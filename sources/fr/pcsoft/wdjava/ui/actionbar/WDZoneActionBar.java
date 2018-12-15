package fr.pcsoft.wdjava.ui.actionbar;

import fr.pcsoft.wdjava.ui.champs.fenetreinterne.WDChampFenetreInterneExt;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.pb;

public class WDZoneActionBar extends WDChampFenetreInterneExt {
    private boolean Pc = false;
    private boolean Qc = true;
    private WDActionBar Rc = null;

    public final boolean isAnimationOnTabChanged() {
        return this.Pc;
    }

    public final boolean isSwipeEnbaled() {
        return this.Qc;
    }

    protected void onPageAffichee(pb pbVar, boolean z) {
        super.onPageAffichee(pbVar, z);
        if (z && this.Rc != null) {
            this.Rc.setSelectedTab(pbVar.m8506b(), true);
        }
    }

    public void release() {
        super.release();
        this.Rc = null;
    }

    public final void setActionBar(WDActionBar wDActionBar) {
        this.Rc = wDActionBar;
    }

    protected void setParamAnimationChamp(int i, int i2, int i3) {
        if (i == 22) {
            this.Pc = i2 != 0;
        }
    }
}
