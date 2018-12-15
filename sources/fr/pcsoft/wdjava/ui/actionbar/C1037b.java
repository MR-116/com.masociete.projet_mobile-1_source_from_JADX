package fr.pcsoft.wdjava.ui.actionbar;

import android.app.Activity;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.menu.WDMenuContextuel;

/* renamed from: fr.pcsoft.wdjava.ui.actionbar.b */
public class C1037b implements Callback {
    /* renamed from: a */
    private WDMenuContextuel f2998a;
    /* renamed from: b */
    private gc f2999b;

    private C1037b(gc gcVar, WDMenuContextuel wDMenuContextuel) {
        this.f2999b = gcVar;
        this.f2998a = wDMenuContextuel;
    }

    /* renamed from: a */
    private void m7530a() {
        this.f2999b = null;
        this.f2998a = null;
    }

    /* renamed from: a */
    public static final boolean m7531a(gc gcVar, WDMenuContextuel wDMenuContextuel) {
        WDFenetre wDFenetre = (WDFenetre) gcVar.checkType(WDFenetre.class);
        if (wDFenetre == null) {
            wDFenetre = (WDFenetre) gcVar.getFenetreMere();
        }
        if (wDFenetre != null) {
            Activity activite = wDFenetre.getActivite();
            if (activite != null) {
                Object c1037b = new C1037b(gcVar, wDMenuContextuel);
                ActionMode startActionMode = activite.startActionMode(c1037b);
                CharSequence titreMenu = wDMenuContextuel.getTitreMenu();
                if (!(startActionMode == null || C0808l.m4053k(titreMenu))) {
                    startActionMode.setTitle(titreMenu);
                }
                wDMenuContextuel.setContextuelActionBar(c1037b);
                return true;
            }
        }
        return false;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        actionMode.finish();
        return true;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.f2999b.creerMenuContextuel(menu);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        if (this.f2998a != null) {
            this.f2998a.setContextuelActionBar(null);
        }
        m7530a();
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }
}
