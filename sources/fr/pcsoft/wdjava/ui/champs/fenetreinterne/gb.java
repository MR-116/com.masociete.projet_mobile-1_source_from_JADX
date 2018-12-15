package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDParametre;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.poo.C0735q;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.C0546j;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0509v;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.hc;
import fr.pcsoft.wdjava.ui.champs.zr.bb;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import java.util.Iterator;

public abstract class gb extends hc implements C0524x, C0525y {
    private static final String[] Gc = new String[]{m1477z(m1478z("\u0010\u00120=kg\u0002<8`l\t 8{e\u0018")), m1477z(m1478z("\u0010\u001e:6cc\u000242`v\t 2qz\u0013&2|}\u0018")), m1477z(m1478z("\u0010\u0018>2cv\u0013&(g}\u001e=9`f")), m1477z(m1478z("E\n6(")), m1477z(m1478z("^\n6(")), m1477z(m1478z("U\n6(")), m1477z(m1478z("\u0010\r 8mv\u0019'%kl\u0014<4a}\u0013'2"))};
    private int Cc = C0607n.Kw;
    private WDObjet Dc = new WDChaine();
    protected WDFenetreInterne Ec = null;
    private WDObjet Fc = new WDChaine("");

    public gb() {
        creerComposant();
    }

    /* renamed from: z */
    private static String m1477z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 51;
                    break;
                case 1:
                    i2 = 93;
                    break;
                case 2:
                    i2 = 114;
                    break;
                case 3:
                    i2 = 119;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1478z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 46);
        }
        return toCharArray;
    }

    public abstract boolean afficherFenetreInternePrecedente();

    public abstract boolean afficherFenetreInterneSuivante();

    public abstract int ajouterFenetreInterne(String str, WDObjet... wDObjetArr);

    public boolean ancrer(int i, int i2, int i3, int i4, int i5) {
        return super.ancrer(i, i2, i3, i4, i5);
    }

    public void apresChargement() {
        initialiserAction();
    }

    public void avantDechargement() {
        initialiserAction();
    }

    protected final WDFenetreInterne chargerFenetreInterne(String str, WDObjet[] wDObjetArr) {
        WDFenetre wDFenetre = (WDFenetre) getFenetreMere();
        WDFenetreInterne load = hb.load(str, wDFenetre, this);
        if (load != null) {
            try {
                if (isWithPlan()) {
                    load.majPlan(getFirstPlan());
                }
                try {
                    installerFenetreInterne(load);
                    load.appliquerAncrage(0, 0, 0, 0, 0);
                    if (!isAvecAscenseurAuto() || isFenetreCree()) {
                        int _getLargeur = _getLargeur() - load._getLargeurInitiale();
                        int _getHauteur = _getHauteur() - load._getHauteurInitiale();
                        if (isAvecAscenseurAuto()) {
                            _getLargeur = Math.max(0, _getLargeur);
                            _getHauteur = Math.max(0, _getHauteur);
                        }
                        load.appliquerAncrage(_getLargeur, _getHauteur, 0, 0, 0);
                    }
                    wDFenetre.ajouterFenetreInterne(load);
                    if (wDFenetre.isFenetreCreeExt()) {
                        WDFenetreInterne wDFenetreInterne = this.Ec;
                        try {
                            registerFenetreInterne(load);
                            initialiserFenetreInterne(load, wDObjetArr);
                            if (wDFenetreInterne != null) {
                                try {
                                    if (this.Ec != wDFenetreInterne) {
                                        this.Ec = wDFenetreInterne;
                                    }
                                } catch (WDException e) {
                                    throw e;
                                }
                            }
                        } catch (Throwable th) {
                            if (wDFenetreInterne != null) {
                                try {
                                    if (this.Ec != wDFenetreInterne) {
                                        this.Ec = wDFenetreInterne;
                                    }
                                } catch (WDException e2) {
                                    throw e2;
                                }
                            }
                        }
                    }
                } catch (WDException e22) {
                    throw e22;
                }
            } catch (WDException e222) {
                throw e222;
            }
        }
        return load;
    }

    protected abstract void creerComposant();

    protected void dechargerFenetreInterne(WDFenetreInterne wDFenetreInterne) {
        desinstallerFenetreInterne(wDFenetreInterne);
        if (!wDFenetreInterne.isKeepAlive()) {
            appelPCode(C0607n.aw);
            wDFenetreInterne.appelPCode(2);
            wDFenetreInterne.sauverValeur();
            wDFenetreInterne.onDechargement();
            C0509v c0509v = (C0509v) getFenetreMere();
            if (c0509v != null) {
                try {
                    c0509v.supprimerFenetreInterne(wDFenetreInterne);
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        wDFenetreInterne.setChampFenetreInterne(null);
    }

    protected abstract void desinstallerFenetreInterne(WDFenetreInterne wDFenetreInterne);

    protected WDObjet executerPCode(int i) {
        switch (i) {
            case C0607n.hu /*175*/:
                try {
                    apresChargement();
                    return null;
                } catch (WDException e) {
                    throw e;
                }
            case C0607n.aw /*176*/:
                avantDechargement();
                return null;
            default:
                return super.executerPCode(i);
        }
    }

    public void finInit() {
        try {
            super.finInit();
            if (!isFenetreInterneChargee()) {
                return;
            }
            if (this.l.estOuverteEtAffichee()) {
                this.Ec.appelPCode(35);
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public int getAutomaticTextColorWL() {
        return this.Cc;
    }

    public WDObjet getCouleurTexteAutomatique() {
        return new WDEntier4(getAutomaticTextColorWL());
    }

    public WDObjet getElement(String str) {
        WDObjet wDObjet = null;
        try {
            if (isFenetreInterneChargee()) {
                if (!str.startsWith(Gc[3])) {
                    try {
                        wDObjet = C0735q.m3112a(this.Ec, str, Gc[4]);
                    } catch (WDException e) {
                    }
                }
                if (wDObjet == null) {
                    try {
                        if (!str.startsWith(Gc[4])) {
                            try {
                                wDObjet = C0735q.m3112a(this.Ec, str, Gc[3]);
                            } catch (WDException e2) {
                            }
                        }
                    } catch (WDException e3) {
                        throw e3;
                    }
                }
            }
            if (wDObjet == null) {
                try {
                    WDErreurManager.m2883a(C0745b.m3222b(Gc[2], str));
                } catch (WDException e32) {
                    throw e32;
                }
            }
            return wDObjet;
        } catch (WDException e322) {
            throw e322;
        }
    }

    public final fb getFenetreInterneChargee() {
        return this.Ec;
    }

    public WDChaine getFenetreSource() {
        String str = "";
        if (isFenetreInterneChargee()) {
            str = this.Ec.getName();
        }
        return new WDChaine(str);
    }

    public C0489p getFils(String str) {
        if (!isFenetreInterneChargee()) {
            return super.getFils(str);
        }
        C0489p fils = this.Ec.getFils(str);
        if (fils != null) {
            return fils;
        }
        try {
            return C0808l.m4042c(this.Ec.getName(), str, 20) == 0 ? this.Ec : fils;
        } catch (WDException e) {
            throw e;
        }
    }

    public C0489p getFilsDirect(String str) {
        try {
            return isFenetreInterneChargee() ? this.Ec.getFilsDirect(str) : null;
        } catch (WDException e) {
            throw e;
        }
    }

    public WDEntier4 getHauteurUtile() {
        return new WDEntier4((double) C1511l.m10515a((float) _getHauteurUtile(), 1, getDisplayUnit()));
    }

    public WDEntier4 getLargeurUtile() {
        return new WDEntier4((double) C1511l.m10515a((float) _getLargeurUtile(), 1, getDisplayUnit()));
    }

    public Iterator getLstFils() {
        try {
            return isFenetreInterneChargee() ? this.Ec.getLstFils() : null;
        } catch (WDException e) {
            throw e;
        }
    }

    public abstract int getNbFenetreInterne();

    public String getNomType() {
        return C0745b.m3220a(Gc[1], new String[0]);
    }

    public WDObjet getPlan() {
        try {
            return isFenetreInterneChargee() ? this.Ec.getPlan() : super.getPlan();
        } catch (WDException e) {
            throw e;
        }
    }

    public abstract int getPositionFenetreInterne();

    public WDObjet getValeur() {
        try {
            if (isFenetreInterneChargee()) {
                if ((this.N & 64) == 0) {
                    try {
                        if (!WDAppelContexte.getContexte().m2714b((int) C0607n.Tf, this.Ec)) {
                            try {
                                if (!WDAppelContexte.getContexte().m2714b((int) C0607n.Bt, this.Ec)) {
                                    this.Ec.appelPCode(C0607n.Tf);
                                }
                            } catch (WDException e) {
                                throw e;
                            }
                        }
                    } catch (WDException e2) {
                        throw e2;
                    }
                }
            }
            return this.Dc;
        } catch (WDException e22) {
            throw e22;
        } catch (WDException e222) {
            throw e222;
        }
    }

    public WDObjet getValeurInitiale() {
        return this.Fc;
    }

    public void init() {
        try {
            super.init();
            if (!isFenetreInterneChargee()) {
                return;
            }
            if (this.l.estOuverteEtAffichee()) {
                this.Ec.appelPCode(14);
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    protected void initialiserFenetreInterne(WDFenetreInterne wDFenetreInterne, WDObjet[] wDObjetArr) {
        wDFenetreInterne.addListener(this);
        wDFenetreInterne.execDeclarationGlobales(wDObjetArr);
        wDFenetreInterne.parcourirChamp(new C1179f(this), true);
        WDFenetreInterne wDFenetreInterne2 = (WDFenetreInterne) getFenetreInterne();
        if (wDFenetreInterne2 != null) {
            try {
                if (!wDFenetreInterne2.isLoaded()) {
                    return;
                }
            } catch (WDException e) {
                throw e;
            }
        }
        wDFenetreInterne.appelPCode(14);
        wDFenetreInterne.appelPCode(C0607n.Xu);
        wDFenetreInterne.appelPCode(35);
        wDFenetreInterne.restaurerValeur();
    }

    public abstract boolean insererFenetreInterne(String str, int i, WDObjet... wDObjetArr);

    protected abstract void installerFenetreInterne(WDFenetreInterne wDFenetreInterne);

    public WDObjet invoquerMethode(String str, WDObjet... wDObjetArr) {
        try {
            if (isFenetreInterneChargee()) {
                return this.Ec.invoquerMethode(str, wDObjetArr);
            }
            if (str.startsWith(Gc[5])) {
                str = str.substring(Gc[5].length());
            }
            WDErreurManager.m2883a(C0745b.m3222b(Gc[6], str));
            return null;
        } catch (WDException e) {
            throw e;
        }
    }

    protected boolean isAvecAscenseurAuto() {
        return false;
    }

    protected boolean isCanScrollHorizontally() {
        return isAvecAscenseurAuto();
    }

    public boolean isChampFenetreInterne() {
        return true;
    }

    protected final boolean isFenetreInterneChargee() {
        try {
            if (this.Ec != null) {
                if (!this.Ec.isReleased()) {
                    return true;
                }
            }
            return false;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void majOrdreNavigation(C0508h c0508h) {
        try {
            super.majOrdreNavigation(c0508h);
            if (isFenetreInterneChargee()) {
                this.Ec.majOrdreNavigation(c0508h);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public abstract void majParcoursAuto(String str);

    public void onChangementFenetreInterne(WDFenetreInterne wDFenetreInterne) {
        registerFenetreInterne(wDFenetreInterne);
        WDFenetre wDFenetre = (WDFenetre) getFenetreMere();
        if (wDFenetre != null) {
            try {
                if (isFenetreCree()) {
                    wDFenetre.onAffichageFenetreInterne(wDFenetreInterne);
                    if (!(getPere() instanceof bb)) {
                        wDFenetre.majOrdreNavigation(wDFenetre);
                    }
                }
            } catch (WDException e) {
                throw e;
            } catch (WDException e2) {
                throw e2;
            }
        }
    }

    public void onFinInit(fb fbVar) {
        appelPCode(C0607n.hu);
    }

    public void onLoad(fb fbVar) {
    }

    public void onRelease(fb fbVar) {
    }

    public void parcourirChamp(C0546j c0546j, boolean z) {
        try {
            if (isFenetreInterneChargee()) {
                this.Ec.parcourirChamp(c0546j, z);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void parcourirObjetAPCode(C0546j c0546j, boolean z) {
        try {
            if (isFenetreInterneChargee()) {
                this.Ec.parcourirObjetAPCode(c0546j, z);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected void postInit() {
        try {
            super.postInit();
            if (!isFenetreInterneChargee()) {
                return;
            }
            if (this.l.estOuverteEtAffichee()) {
                this.Ec.appelPCode(C0607n.Xu);
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void raz(boolean z) {
        try {
            if (isFenetreInterneChargee()) {
                this.Ec.raz(z);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected boolean registerFenetreInterne(WDFenetreInterne wDFenetreInterne) {
        try {
            if (this.Ec == wDFenetreInterne) {
                return false;
            }
            this.Ec = wDFenetreInterne;
            if (this.Ec != null) {
                this.Ec.setPere(this);
            }
            return true;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void release() {
        try {
            if (!(this.Ec == null || this.Ec.isReleased())) {
                C0509v c0509v = (C0509v) getFenetreMere();
                if (c0509v != null) {
                    try {
                        c0509v.supprimerFenetreInterne(this.Ec);
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
            super.release();
            this.Fc = null;
            this.Dc = null;
            this.Ec = null;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void removeObjAPCode(C0489p c0489p) {
        try {
            if (isFenetreInterneChargee()) {
                this.Ec.removeObjAPCode(c0489p);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean restaurerValeur() {
        return isFenetreInterneChargee() ? this.Ec.restaurerValeur() : false;
    }

    public void sauverValeur() {
        try {
            if (isFenetreInterneChargee()) {
                this.Ec.sauverValeur();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void screenToSource(String str) {
        try {
            if (isFenetreInterneChargee()) {
                this.Ec.screenToSource(str);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void setCouleurTexteAutomatique(int i) {
        try {
            if (i != this.Cc) {
                this.Cc = i;
                if (isFenetreCree()) {
                    parcourirChamp(new ib(this), true);
                }
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void setFI(WDFenetreInterne wDFenetreInterne) {
        C0489p c0489p = null;
        try {
            if (wDFenetreInterne != this.Ec) {
                if (wDFenetreInterne != null) {
                    try {
                        c0489p = wDFenetreInterne.getChampFenetreInterne();
                    } catch (WDException e) {
                        throw e;
                    }
                }
                if (c0489p != null) {
                    try {
                        ((gb) c0489p).dechargerFenetreInterne(wDFenetreInterne);
                    } catch (WDException e2) {
                        throw e2;
                    }
                }
                try {
                    if (this.Ec != null) {
                        dechargerFenetreInterne(this.Ec);
                        this.Ec = null;
                    }
                    if (wDFenetreInterne != null) {
                        wDFenetreInterne.setChampFenetreInterne(this);
                        installerFenetreInterne(wDFenetreInterne);
                        wDFenetreInterne.appliquerAncrage(Math.max(0, _getLargeur() - wDFenetreInterne._getLargeurInitiale()), Math.max(0, _getHauteur() - wDFenetreInterne._getHauteurInitiale()), 0, 0, 15);
                        onChangementFenetreInterne(wDFenetreInterne);
                    }
                } catch (WDException e22) {
                    throw e22;
                }
            }
        } catch (WDException e222) {
            throw e222;
        }
    }

    public void setFenetreInterne(String str) {
        WDFenetreInterne wDFenetreInterne = (WDFenetreInterne) getFenetreInterne();
        try {
            if (((WDFenetre) getFenetreMere()).isFenetreCreeExt() && wDFenetreInterne != null) {
                try {
                    if (!wDFenetreInterne.isLoaded()) {
                        wDFenetreInterne.addListener(new lb(this, str));
                        return;
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
            setFenetreInterne(str, null);
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    public void setFenetreInterne(String str, WDObjet[] wDObjetArr) {
        WDFenetreInterne wDFenetreInterne = null;
        try {
            if (this.Ec != null) {
                dechargerFenetreInterne(this.Ec);
                this.Ec = null;
            }
            if (str != null) {
                try {
                    if (!str.equals("")) {
                        WDParametre.traiterParametreTraitementNonBloquant(wDObjetArr);
                        wDFenetreInterne = chargerFenetreInterne(str, wDObjetArr);
                        if (wDFenetreInterne == null) {
                            try {
                                setLibelle(C0745b.m3222b(Gc[0], str));
                            } catch (WDException e) {
                                throw e;
                            }
                        }
                    }
                } catch (WDException e2) {
                    throw e2;
                }
            }
            onChangementFenetreInterne(wDFenetreInterne);
        } catch (WDException e22) {
            throw e22;
        }
    }

    public void setHauteurUtile(int i) {
        setTailleUtile(_getLargeurUtile(), C1511l.m10532d((float) i, getDisplayUnit()));
    }

    public void setLargeurUtile(int i) {
        setTailleUtile(C1511l.m10532d((float) i, getDisplayUnit()), _getHauteurUtile());
    }

    protected abstract void setNbFenetreAvantRecyclage(int i);

    protected void setPlans(int[] iArr) {
        int i = 0;
        try {
            if (isFenetreCree()) {
                try {
                    if (isFenetreInterneChargee()) {
                        WDFenetreInterne wDFenetreInterne = this.Ec;
                        if (iArr != null) {
                            i = iArr[0];
                        }
                        wDFenetreInterne.setPlan(i);
                        return;
                    }
                    return;
                } catch (WDException e) {
                    throw e;
                } catch (WDException e2) {
                    throw e2;
                }
            }
            super.setPlans(iArr);
        } catch (WDException e22) {
            throw e22;
        }
    }

    public abstract void setPositionFenetreInterne(int i, boolean z, boolean z2);

    public void setValeur(WDObjet wDObjet) {
        try {
            this.Dc.setValeur(wDObjet);
            if (!isFenetreInterneChargee()) {
                return;
            }
            if (!WDAppelContexte.getContexte().m2714b((int) C0607n.Tf, this.Ec)) {
                try {
                    if (!WDAppelContexte.getContexte().m2714b((int) C0607n.Bt, this.Ec)) {
                        this.Ec.appelPCode(C0607n.Bt);
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    public void setValeurInitiale(WDObjet wDObjet) {
        this.Fc.setValeur(wDObjet);
        setValeur(wDObjet);
    }

    public void sourceToScreen(String str) {
        try {
            if (isFenetreInterneChargee()) {
                this.Ec.sourceToScreen(str);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public abstract boolean supprimerFenetreInterne(int i);

    public abstract void supprimerTout();
}
