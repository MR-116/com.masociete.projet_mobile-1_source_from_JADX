package fr.pcsoft.wdjava.ui.actionbar;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.FragmentTransaction;
import android.graphics.drawable.Drawable;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.activite.C1056i;

public class WDVoletActionBar extends C0489p implements TabListener {
    /* renamed from: z */
    private static final String[] f2992z = new String[]{m7519z(m7520z("v\u0013D6\u001b\u0013V!\u0014\u001b\\%\nd")), m7519z(m7520z("v\u0003cY2")), m7519z(m7520z("\u0014\u0011|L4\u0001\u0016n@8\u001b\bsG#\u0010\u0005~@#\u0010\b\b")), m7519z(m7520z("v\u0001uE2\u0001\b{J#\u001c\u0018tV5\u0014\u0005")), m7519z(m7520z("v\u0019uV!\u0014\u001b\\%")), m7519z(m7520z("v\u0013D6\u001b\u0013V!\u0014\u001b\\%\ne"))};
    /* renamed from: d */
    private String f2993d = "";
    /* renamed from: e */
    private String f2994e = null;
    /* renamed from: f */
    private WDActionBar f2995f = null;
    /* renamed from: g */
    private String f2996g = null;
    /* renamed from: h */
    private Tab f2997h = null;

    public WDVoletActionBar() {
        ActionBar actionBar = C1056i.m7562a().getActionBar();
        if (actionBar.getNavigationMode() == 2) {
            this.f2997h = actionBar.newTab();
        }
    }

    /* renamed from: a */
    private final void m7518a() {
        if (this.f2995f != null) {
            Drawable a = this.f2995f.m1316a(this.f2996g);
            if (this.f2997h != null) {
                this.f2997h.setIcon(a);
            }
        }
    }

    /* renamed from: z */
    private static String m7519z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 85;
                    break;
                case 1:
                    i2 = 87;
                    break;
                case 2:
                    i2 = 58;
                    break;
                case 3:
                    i2 = 9;
                    break;
                default:
                    i2 = 119;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7520z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 119);
        }
        return toCharArray;
    }

    /* renamed from: a */
    final void m7521a(WDActionBar wDActionBar) {
        this.f2995f = wDActionBar;
        m7518a();
    }

    /* renamed from: b */
    final Tab m7522b() {
        return this.f2997h;
    }

    /* renamed from: c */
    final String m7523c() {
        return this.f2994e;
    }

    public WDChaine getImage() {
        return new WDChaine(this.f2996g);
    }

    public WDChaine getLibelle() {
        return new WDChaine(toString());
    }

    public String getName() {
        return "";
    }

    public String getNomType() {
        return C0745b.m3220a(f2992z[3], new String[0]);
    }

    public WDObjet getValeur() {
        String[] strArr = new String[2];
        strArr[0] = C0745b.m3222b(f2992z[5], getNomType());
        strArr[1] = C0745b.m3222b(f2992z[4], getNomType());
        WDErreurManager.m2886a(strArr);
        return null;
    }

    public boolean isEvaluable() {
        return false;
    }

    public void onTabReselected(Tab tab, FragmentTransaction fragmentTransaction) {
    }

    public void onTabSelected(Tab tab, FragmentTransaction fragmentTransaction) {
        if (this.f2995f != null) {
            this.f2995f.m1317a(this);
        }
    }

    public void onTabUnselected(Tab tab, FragmentTransaction fragmentTransaction) {
    }

    protected void setFenetreInterne(String str) {
        this.f2994e = str;
    }

    public void setImage(String str) {
        this.f2996g = str;
        if (isFenetreCree()) {
            m7518a();
        }
    }

    public void setLibelle(String str) {
        this.f2993d = str;
        if (this.f2997h != null) {
            this.f2997h.setText(str);
            int position = this.f2997h.getPosition();
            if (isFenetreCree()) {
                ActionBar actionBar = C1056i.m7562a().getActionBar();
                actionBar.removeTabAt(position);
                actionBar.addTab(this.f2997h, position, actionBar.getSelectedNavigationIndex() == position);
            }
        }
    }

    public void setValeur(WDObjet wDObjet) {
        String[] strArr = new String[2];
        strArr[0] = C0745b.m3222b(f2992z[0], getNomType());
        strArr[1] = C0745b.m3222b(f2992z[1], getName(), getNomType()) + " " + C0745b.m3222b(f2992z[2], new String[0]);
        WDErreurManager.m2886a(strArr);
    }

    public String toString() {
        return this.f2993d;
    }
}
