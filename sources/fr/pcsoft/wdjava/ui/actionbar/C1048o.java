package fr.pcsoft.wdjava.ui.actionbar;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.menu.C0495i;

@TargetApi(11)
/* renamed from: fr.pcsoft.wdjava.ui.actionbar.o */
public class C1048o extends WDAbstractActionBar {
    /* renamed from: z */
    private static final String[] f3003z = new String[]{C1048o.m7536z(C1048o.m7537z("PpI\u001f_5wDZPt3S_`cÈ\b]azN\u0014\u001cqv\u0001\u0016\u001bTpU\u0013S{3c\u001bN5wDZPt3G\u001fRÿgS\u001f\u0012")), C1048o.m7536z(C1048o.m7537z("60`9h\\\\o%~TA~>ySRt6h60"))};

    public C1048o(WDFenetre wDFenetre) {
        boolean z = true;
        this.k = f3003z[1];
        this.n = wDFenetre.getActivite().getActionBar();
        if (this.n == null) {
            z = false;
        }
        C0691a.m2860a(z, f3003z[0]);
    }

    /* renamed from: z */
    private static String m7536z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 21;
                    break;
                case 1:
                    i2 = 19;
                    break;
                case 2:
                    i2 = 33;
                    break;
                case 3:
                    i2 = 122;
                    break;
                default:
                    i2 = 60;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7537z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 60);
        }
        return toCharArray;
    }

    public void enableHideOnContentScroll() {
    }

    public int getBackgroundColor() {
        return 0;
    }

    public int getHideOffset() {
        return 0;
    }

    public View getView() {
        return null;
    }

    public void hide() {
    }

    public boolean isActionBarDefaut() {
        return true;
    }

    public boolean isShown() {
        return true;
    }

    public void onCreateMenu(Menu menu) {
    }

    public void onItemVisibilityChanged(C0495i c0495i, MenuItem menuItem, int i, boolean z) {
    }

    public boolean setHideOffset(int i) {
        return false;
    }

    public void show() {
    }

    public void transformDrawable(Drawable drawable) {
    }
}
