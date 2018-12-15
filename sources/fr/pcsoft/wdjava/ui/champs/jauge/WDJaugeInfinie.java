package fr.pcsoft.wdjava.ui.champs.jauge;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.champs.hc;
import fr.pcsoft.wdjava.ui.champs.zr.bb;
import fr.pcsoft.wdjava.ui.p065b.C1093d;
import fr.pcsoft.wdjava.ui.utils.C1515p;

public abstract class WDJaugeInfinie extends hc {
    public static final int Dc = 1;
    public static final int Ec = 0;
    public static final int Fc = 2;
    private static final String[] Gc = new String[]{m8606z(m8607z("F\u0006I,#+\u0006I>4$\u000eI40:q")), m8606z(m8607z("$\u0004J$!1\u0003X(-+\u001dE/6 \u0010H(6 \u001d>")), m8606z(m8607z("F\u0016U1'")), m8606z(m8607z("F\bM4% \u001dE/$,\fE$")), m8606z(m8607z("F\fC>4$\u000eI40")), m8606z(m8607z("F\u0006I,#+\u0006I>4$\u000eI40:p"))};
    private ProgressBar Cc = m8605a(C1056i.m7562a());

    public WDJaugeInfinie() {
        ((ViewGroup) getCompConteneur()).addView(this.Cc);
    }

    /* renamed from: a */
    private ProgressBar m8605a(Context context) {
        ProgressBar progressBar;
        switch (getTypeJauge()) {
            case 0:
                progressBar = new ProgressBar(context, null, 16842872);
                break;
            case 2:
                progressBar = new ProgressBar(context);
                break;
            default:
                progressBar = new ProgressBar(context, null, 16842871);
                break;
        }
        progressBar.setIndeterminate(true);
        return progressBar;
    }

    /* renamed from: z */
    private static String m8606z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 101;
                    break;
                case 1:
                    i2 = 66;
                    break;
                case 2:
                    i2 = 12;
                    break;
                case 3:
                    i2 = 97;
                    break;
                default:
                    i2 = 98;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8607z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 98);
        }
        return toCharArray;
    }

    protected void appliquerCouleur(int i) {
    }

    protected void appliquerTransparent() {
    }

    public void appliquerVisibilite(boolean z) {
        super.appliquerVisibilite(z);
        if (z && isFenetreCree() && getChampParent(bb.class) == null) {
            C1515p.m10541a();
        }
    }

    public View getCompPrincipal() {
        return this.Cc;
    }

    public String getNomType() {
        return C0745b.m3220a(Gc[3], new String[0]);
    }

    protected abstract int getTypeJauge();

    public WDObjet getValeur() {
        String[] strArr = new String[2];
        strArr[0] = C0745b.m3222b(Gc[5], getNomType());
        strArr[1] = C0745b.m3222b(Gc[4], getNomType());
        WDErreurManager.m2886a(strArr);
        return null;
    }

    public boolean isChampFocusable() {
        return false;
    }

    public boolean isEvaluable() {
        return false;
    }

    public void release() {
        super.release();
        this.Cc = null;
    }

    protected final void setStyleJauge(String str) {
        if (getTypeJauge() == 2) {
            Drawable a = C1093d.m7924a(str);
            if (a != null) {
                this.Cc.setIndeterminateDrawable(a);
            }
        }
    }

    public void setValeur(WDObjet wDObjet) {
        r0 = new String[3];
        r0[0] = C0745b.m3222b(Gc[0], getNomType());
        r0[1] = C0745b.m3222b(Gc[2], getName(), getNomType());
        r0[2] = C0745b.m3222b(Gc[1], new String[0]);
        WDErreurManager.m2886a(r0);
    }
}
