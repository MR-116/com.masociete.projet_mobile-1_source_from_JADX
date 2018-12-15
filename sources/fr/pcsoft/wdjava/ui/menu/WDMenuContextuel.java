package fr.pcsoft.wdjava.ui.menu;

import fr.pcsoft.wdjava.api.WDAPIMenu;
import fr.pcsoft.wdjava.core.C0723g;
import fr.pcsoft.wdjava.ui.actionbar.C1037b;
import fr.pcsoft.wdjava.ui.champs.gc;

@C0723g(a = {WDAPIMenu.class})
public abstract class WDMenuContextuel extends C0499g implements C1467b {
    /* renamed from: t */
    private String f4474t = null;
    /* renamed from: u */
    private C1037b f4475u = null;

    public boolean afficherCommeUneActionBar(gc gcVar) {
        return this.f4475u == null ? C1037b.m7531a(gcVar, this) : false;
    }

    public int getNbSousOptions() {
        return 0;
    }

    public String getNomMenu() {
        return getName();
    }

    public String getTitreMenu() {
        return this.f4474t;
    }

    public boolean isMenuContextuel() {
        return true;
    }

    public boolean isModeActionBar() {
        return false;
    }

    public void release() {
        super.release();
        this.f4475u = null;
    }

    public final void setContextuelActionBar(C1037b c1037b) {
        this.f4475u = c1037b;
    }

    protected void setTitreMenu(String str) {
        this.f4474t = str;
    }
}
