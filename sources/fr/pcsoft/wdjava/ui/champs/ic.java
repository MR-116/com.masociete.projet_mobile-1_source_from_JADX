package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.parcours.IWDParcours;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.p080h.C1426i;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class ic extends hc implements wc {
    public static final int Cc = 31988;
    public static final int Ec = 31986;
    public static final int Hc = 31000;
    public static final int Jc = 1;
    public static final int Kc = 31984;
    public static final int Mc = 31978;
    public static final int Nc = 31980;
    public static final int Oc = 31989;
    public static final int Pc = 31987;
    public static final int Qc = 31981;
    public static final int Rc = 31982;
    public static final int Sc = 31985;
    public static final int Tc = 31979;
    public static final int Uc = 31983;
    private static final String[] Vc = new String[]{m1488z(m1489z("2\u001eA,eP\u0013J$wX\u0013X dX\u0019K>dX\u000eZ$wW\u0014M)aT\u000f")), m1488z(m1489z("2\u001c^1m]\u0002H.fR\tG.f")), m1488z(m1489z("2\u0011G2|T\u0002O'nX\u001eF$")), m1488z(m1489z("2\u000bO-mD\u000fQ7i]\u0014J$")), m1488z(m1489z("2\rO3i\\\u0002G/~P\u0011G%m")), m1488z(m1489z("2\u0014@%aR\u0018Q(fG\u001cB(lT\u0002M)i\\\r")), m1488z(m1489z("2\u0013A>{T\u0011K\"|X\u0012@>kY\u001cC1")), m1488z(m1489z("2\u0011G2|T\u0002X(lT")), m1488z(m1489z("2\u001eA/{E\u001c@5mN\u0011G&fT\u0002]$dT\u001eZ(g_\u0013K$wX\u0013Z$zU\u0014Z$")), m1488z(m1489z("e9^\u0000Ot\u000e{\b^p3z\u0004")), m1488z(m1489z("e9^\u0013M|4k\u0013")), m1488z(m1489z("e9^\u0013Mr8j\u0004Fe")), m1488z(m1489z("e9]\u0014Ag<`\u0015")), m1488z(m1489z("e9J\u0004Z4k\u0013")), m1488z(m1489z("e9^\u0000Ot\r|\u0004Kt9k\u000f\\t"))};
    protected boolean Dc = false;
    private boolean Fc = true;
    protected boolean Gc = false;
    protected boolean Ic = false;
    private LinkedList Lc = null;

    /* renamed from: a */
    private int m1486a(WDObjet wDObjet, int i) throws bd {
        try {
            if (wDObjet.isNumerique()) {
                return checkIndice(wDObjet.getInt(), false);
            }
            String string = wDObjet.getString();
            return !string.equals(Vc[10]) ? string.equals(Vc[13]) ? getNbElement() - 1 : string.equals(Vc[11]) ? Math.max(0, i - 1) : string.equals(Vc[12]) ? Math.min(getNbElement() - 1, i + 1) : string.equals(Vc[9]) ? Math.min(getNbElement() - 1, (getNbLigneVisible(isScrollerHorizontalVisible()) + i) - 1) : string.equals(Vc[14]) ? Math.max(0, (i - getNbLigneVisible(false)) + 1) : i - 1 : 0;
        } catch (bd e) {
            throw e;
        }
    }

    /* renamed from: b */
    private IWDParcours m1487b() {
        try {
            return isParcoursPourToutEnCours() ? (IWDParcours) this.Lc.getFirst() : null;
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: z */
    private static String m1488z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 17;
                    break;
                case 1:
                    i2 = 93;
                    break;
                case 2:
                    i2 = 14;
                    break;
                case 3:
                    i2 = 97;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1489z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 40);
        }
        return toCharArray;
    }

    public boolean ajouterElements(String str) {
        boolean z = true;
        setSelectionParProgrammation(true);
        try {
            String[] m = C0808l.m4055m(str);
            for (String ajouterElement : m) {
                if (!ajouterElement(ajouterElement)) {
                    z = false;
                }
            }
            setSelectionParProgrammation(false);
            return z;
        } catch (WDException e) {
            throw e;
        } catch (Throwable th) {
            setSelectionParProgrammation(false);
        }
    }

    public abstract void ajouterSelection();

    public abstract void ajouterSelection(int[] iArr) throws WDException;

    protected int checkIndice(int i, boolean z) throws bd {
        if (i == -1) {
            try {
                if (isMultiselection() && !z) {
                    WDErreurManager.m2883a(C0745b.m3222b(Vc[8], getName()));
                }
                i = getIndiceElementCourant();
                if (i < 0) {
                    try {
                        throw new bd(C0745b.m3222b(Vc[6], getName()));
                    } catch (bd e) {
                        throw e;
                    }
                }
            } catch (bd e2) {
                throw e2;
            } catch (bd e22) {
                throw e22;
            }
        }
        int nbElement = getNbElement();
        if (i < 1 || i > nbElement) {
            if (nbElement == 0) {
                try {
                    WDErreurManager.m2883a(C0745b.m3222b(Vc[7], new String[0]) + "\n" + C0745b.m3222b(Vc[5], getName(), String.valueOf(i)));
                } catch (bd e222) {
                    throw e222;
                }
            }
            WDErreurManager.m2883a(C0745b.m3222b(Vc[4], "2", String.valueOf(i)) + "\n" + C0745b.m3222b(Vc[3], "1", String.valueOf(nbElement)));
        }
        return i - 1;
    }

    public abstract int chercherElement(String str, boolean z, int i);

    public IWDParcours depileParcours() {
        try {
            return (this.Lc == null || this.Lc.isEmpty()) ? null : (IWDParcours) this.Lc.removeFirst();
        } catch (WDException e) {
            throw e;
        }
    }

    public int deplacerLigne(int i, WDObjet wDObjet, boolean z) throws bd {
        int checkIndice = checkIndice(i, false);
        int a = m1486a(wDObjet, checkIndice);
        try {
            setSelectionParProgrammation(true);
            deplacerLigne(checkIndice, a, z);
            return a;
        } finally {
            setSelectionParProgrammation(false);
        }
    }

    public int echangerLigne(int i, WDObjet wDObjet, boolean z) throws bd {
        int checkIndice = checkIndice(i, false);
        int a = m1486a(wDObjet, checkIndice);
        try {
            setSelectionParProgrammation(true);
            echangerLigne(checkIndice, a, z);
            return a;
        } finally {
            setSelectionParProgrammation(false);
        }
    }

    public void empileParcours(IWDParcours iWDParcours) {
        try {
            if (this.Lc == null) {
                this.Lc = new LinkedList();
            }
            this.Lc.addFirst(iWDParcours);
        } catch (WDException e) {
            throw e;
        }
    }

    public abstract int getElementSelectionne();

    public abstract int getElementSelectionne(int i);

    public boolean getGLienActive() {
        return this.Fc;
    }

    public abstract int getIndiceElementCourant();

    public int getLigneParcoursPourTout() {
        IWDParcours b = m1487b();
        if (b == null) {
            return -1;
        }
        try {
            return ((WDObjet) b.getElementCourant()).getInt();
        } catch (WDException e) {
            throw e;
        }
    }

    public WDBooleen getMemoire() {
        return new WDBooleen(isMemoire());
    }

    public abstract int getNbElementSelectionne();

    public abstract int getNbLigneAffichee();

    public abstract int getNbLigneVisible(boolean z);

    public abstract int getPosition();

    public abstract void getPosition(int i) throws WDException;

    public int getRowCount() {
        return (int) Math.ceil(((double) getItemCount()) / ((double) getMaxItemCountPerRow()));
    }

    public int getRowCount(int i) {
        return (int) Math.ceil(((double) (getItemCount() + i)) / ((double) getMaxItemCountPerRow()));
    }

    public WDEntier4 getTypeRemplissage() {
        return new WDEntier4(0);
    }

    public WDBooleen getVide() {
        return new WDBooleen(isVide());
    }

    public void initLiaisonsBinding() {
    }

    public boolean isChampListe() {
        return true;
    }

    public boolean isChangeSourcePositionOnSelection() {
        return false;
    }

    protected final boolean isIndiceValide(int i) {
        if (i > 0) {
            try {
                if (i <= getNbElement()) {
                    return true;
                }
            } catch (WDException e) {
                throw e;
            }
        }
        return false;
    }

    public boolean isMemoire() {
        return true;
    }

    protected abstract boolean isMultiselection();

    public boolean isParcoursPourToutEnCours() {
        try {
            if (this.Lc != null) {
                if (this.Lc.size() > 0) {
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

    public abstract boolean isPositionSelectionnee(int i);

    protected abstract boolean isScrollerHorizontalVisible();

    public final boolean isSelectionParProgrammation() {
        return this.Ic;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isSelectionSurValeurMemorisee() {
        /*
        r1 = this;
        r0 = r1.Gc;	 Catch:{ WDException -> 0x0010 }
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r0 = r1.Dc;	 Catch:{ WDException -> 0x0012 }
        if (r0 == 0) goto L_0x0016;
    L_0x0008:
        r0 = r1.getGLienActive();	 Catch:{ WDException -> 0x0014 }
        if (r0 == 0) goto L_0x0016;
    L_0x000e:
        r0 = 1;
    L_0x000f:
        return r0;
    L_0x0010:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0012 }
    L_0x0012:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0014 }
    L_0x0014:
        r0 = move-exception;
        throw r0;
    L_0x0016:
        r0 = 0;
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.ic.isSelectionSurValeurMemorisee():boolean");
    }

    public boolean isValeurEnAjustement() {
        return isParcoursPourToutEnCours();
    }

    public boolean isVertical() {
        return true;
    }

    public final boolean isVide() {
        try {
            return getNbElement() == 0;
        } catch (WDException e) {
            throw e;
        }
    }

    public void listeAffiche(int i) {
        WDErreurManager.m2883a(C0745b.m3222b(Vc[1], C0745b.m3221b(Vc[2])) + "\n" + C0745b.m3222b(Vc[0], getNom().getString(), getNomType()));
    }

    public void listeAffiche(String str) {
        WDErreurManager.m2883a(C0745b.m3222b(Vc[1], C0745b.m3221b(Vc[2])) + "\n" + C0745b.m3222b(Vc[0], getNom().getString(), getNomType()));
    }

    public abstract void notifModificationModele(int i, int i2);

    public void release() {
        super.release();
        if (this.Lc != null) {
            Iterator it = this.Lc.iterator();
            while (it.hasNext()) {
                IWDParcours iWDParcours = (IWDParcours) it.next();
                if (iWDParcours != null) {
                    try {
                        iWDParcours.release();
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
            this.Lc.clear();
            this.Lc = null;
        }
    }

    public boolean setGLienActive(boolean z) {
        boolean z2 = this.Fc;
        this.Fc = z;
        return z2;
    }

    public void setRetourneValeurProgrammation(boolean z) {
        this.Gc = z;
    }

    public final void setSelectionParProgrammation(boolean z) {
        this.Ic = z;
    }

    public abstract void supprimerSelection();

    public abstract void supprimerSelection(int[] iArr) throws WDException;

    public String[] valeurGLien(String str) {
        try {
            if (C0808l.m4053k(str)) {
                return new String[]{null, ""};
            }
            String[] a = C1426i.m10038a(str);
            if (a != null) {
                try {
                    this.Dc = true;
                    return a;
                } catch (WDException e) {
                    throw e;
                }
            }
            return new String[]{null, str};
        } catch (WDException e2) {
            throw e2;
        }
    }
}
