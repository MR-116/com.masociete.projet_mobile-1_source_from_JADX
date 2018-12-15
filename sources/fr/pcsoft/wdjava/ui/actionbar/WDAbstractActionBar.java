package fr.pcsoft.wdjava.ui.actionbar;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.content.Context;
import android.util.TypedValue;
import android.view.MenuItem;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.ui.C0490q;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.menu.C0495i;

@TargetApi(11)
public abstract class WDAbstractActionBar extends C0490q implements C0491d {
    /* renamed from: z */
    private static final String[] f825z = new String[]{m1302z(m1303z("Th\u0012vE8i\u001dpI4o\u0007pO?b\u001dcO#n\rlS5f\u0010}B8i\u001dcO#n\u0014g")), m1302z(m1303z("Ti\r}Z6k\u0007w^")), m1302z(m1303z("Tf\u0001vE8i\u001d`M%")), m1302z(m1303z("Ts\u001brI")), m1302z(m1303z("6a\u0004gO#f\u0016kC9x\u000blX2u\u0006kX2xp")), m1302z(m1303z("Tc\u0007oM9c\u0007}Z6k\u0007w^(\u0014"))};
    /* renamed from: m */
    protected C0511c f826m = null;
    /* renamed from: n */
    protected ActionBar f827n = null;

    /* renamed from: z */
    private static String m1302z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 119;
                    break;
                case 1:
                    i2 = 39;
                    break;
                case 2:
                    i2 = 66;
                    break;
                case 3:
                    i2 = 34;
                    break;
                default:
                    i2 = 12;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1303z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 12);
        }
        return toCharArray;
    }

    public int getActionHome() {
        return 0;
    }

    public int getHauteurBarre() {
        if (this.f827n == null) {
            return 0;
        }
        int height = this.f827n.getHeight();
        if (height == 0) {
            TypedValue typedValue = new TypedValue();
            Context a = C1056i.m7562a();
            if (a == null) {
                a = WDAppManager.m2544C();
            }
            if (a.getTheme().resolveAttribute(16843499, typedValue, true)) {
                return TypedValue.complexToDimensionPixelSize(typedValue.data, a.getResources().getDisplayMetrics());
            }
        }
        return height;
    }

    public String getNomType() {
        return C0745b.m3220a(f825z[2], new String[0]);
    }

    public WDObjet getValeur() {
        String[] strArr = new String[2];
        strArr[0] = C0745b.m3222b(f825z[5], getNomType());
        strArr[1] = C0745b.m3222b(f825z[3], getNom().getString(), getNomType()) + " " + C0745b.m3222b(f825z[4], new String[0]);
        WDErreurManager.m2886a(strArr);
        return null;
    }

    public boolean isEvaluable() {
        return false;
    }

    protected boolean isGroupable() {
        return false;
    }

    public boolean isSearchBarVisible() {
        return false;
    }

    public boolean isSearchHistoryEnabled() {
        return false;
    }

    public void onInitOptionMenu(C0495i c0495i, MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    public void release() {
        this.f827n = null;
        this.f826m = null;
    }

    public void setActionBarListener(C0511c c0511c) {
        this.f826m = c0511c;
    }

    public void setDisplayHomeAsUpEnabled(boolean z) {
        this.f827n.setDisplayHomeAsUpEnabled(z);
    }

    public void setSearchBarVisible(boolean z, String str) {
        WDErreurManager.m2883a(C0745b.m3222b(f825z[0], new String[0]));
    }

    public void setValeur(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f825z[1], getNomType()));
    }
}
