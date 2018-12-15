package fr.pcsoft.wdjava.ui.menu;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.ui.C0490q;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p064a.C1034d;
import fr.pcsoft.wdjava.ui.p064a.C1035e;
import fr.pcsoft.wdjava.ui.p079e.C1399b;

/* renamed from: fr.pcsoft.wdjava.ui.menu.g */
public abstract class C0499g extends C0490q implements C0498d {
    /* renamed from: z */
    private static final String[] f891z = new String[]{C0499g.m1328z(C0499g.m1329z("6\u0007t3d]\bv<xV\u0006w#i[\fd8fW\u0005~")), C0499g.m1328z(C0499g.m1329z("6\u0004~\"r")), C0499g.m1328z(C0499g.m1329z("6\u001db<b")), C0499g.m1328z(C0499g.m1329z("T\u000f})dA\bo%h[\u0016r\"sP\u001b%sP\u0016\t")), C0499g.m1328z(C0499g.m1329z("6\r~!f[\r~3qT\u0005~9uJz"))};
    /* renamed from: m */
    private C1399b f892m = C1399b.m9944i();
    /* renamed from: n */
    private C1034d f893n = C1035e.m7515y();
    /* renamed from: o */
    private C1034d f894o = C1035e.m7505C();
    /* renamed from: p */
    private C1399b f895p = C1399b.m9944i();
    /* renamed from: q */
    protected C1034d f896q = C1035e.m7506D();
    /* renamed from: r */
    private int f897r = 0;
    /* renamed from: s */
    private C1034d f898s = C1035e.m7513w();

    /* renamed from: z */
    private static String m1328z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 21;
                    break;
                case 1:
                    i2 = 73;
                    break;
                case 2:
                    i2 = 59;
                    break;
                case 3:
                    i2 = 108;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1329z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 39);
        }
        return toCharArray;
    }

    public void ajouterMenu(C0495i c0495i) {
        try {
            if (this.l != null) {
                ((WDFenetre) this.l).ajouterOptionMenu(c0495i);
            }
            this.f897r = Math.max(this.f897r, c0495i.getNumeroOptionMenu());
        } catch (WDException e) {
            throw e;
        }
    }

    public C1034d getCouleurFondRepos() {
        return this.f896q;
    }

    public C1034d getCouleurFondSurvol() {
        return this.f893n;
    }

    public C1034d getCouleurRepos() {
        return this.f894o;
    }

    public C1034d getCouleurSurvol() {
        return this.f898s;
    }

    public String getNomType() {
        return C0745b.m3220a(f891z[1], new String[0]);
    }

    public int getNumeroOptionMenuMax() {
        return this.f897r;
    }

    public C1399b getPoliceRepos() {
        return this.f892m;
    }

    public C1399b getPoliceSurvol() {
        return this.f895p;
    }

    public WDObjet getValeur() {
        return new WDEntier4(0);
    }

    protected boolean isGroupable() {
        return false;
    }

    public boolean isThemeXPActif() {
        return false;
    }

    public void notifAjoutOptionMenu(C0495i c0495i) {
        this.f897r = Math.max(this.f897r, c0495i.getNumeroOptionMenu());
    }

    public void prendreFocus() throws WDException {
        WDErreurManager.m2883a(C0745b.m3222b(f891z[0], getNom().getString(), getNomType()));
    }

    public void release() {
        super.release();
        this.f894o = null;
        this.f898s = null;
        this.f896q = null;
        this.f893n = null;
        this.f892m = null;
        this.f895p = null;
    }

    protected void setStyleOptionRepos(int i, int i2, C1399b c1399b) {
        if (i == C0607n.Kw) {
            try {
                this.f894o = C1035e.m7505C();
            } catch (WDException e) {
                throw e;
            }
        }
        this.f894o = C1031a.m7469m(i);
        if (i2 == C0607n.Kw) {
            try {
                this.f896q = C1035e.m7506D();
            } catch (WDException e2) {
                throw e2;
            }
        }
        this.f896q = C1031a.m7469m(i2);
        this.f892m = c1399b;
    }

    protected void setStyleOptionSurvol(int i, int i2, C1399b c1399b) {
        if (i == C0607n.Kw) {
            try {
                this.f898s = C1035e.m7513w();
            } catch (WDException e) {
                throw e;
            }
        }
        this.f898s = C1031a.m7469m(i);
        if (i2 == C0607n.Kw) {
            try {
                this.f893n = C1035e.m7515y();
            } catch (WDException e2) {
                throw e2;
            }
        }
        this.f893n = C1031a.m7469m(i2);
        this.f895p = c1399b;
    }

    public void setValeur(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f891z[4], getNomType()) + "\n" + C0745b.m3222b(f891z[2], getNom().getString(), getNomType()) + " " + C0745b.m3222b(f891z[3], new String[0]));
    }
}
