package fr.pcsoft.wdjava.ui.champs.zr;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p047f.C0712l;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.C0809m;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.cadre.C1110m;
import fr.pcsoft.wdjava.ui.champs.C0546j;
import fr.pcsoft.wdjava.ui.champs.bd;
import fr.pcsoft.wdjava.ui.champs.db;
import fr.pcsoft.wdjava.ui.champs.dc;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.jb;
import fr.pcsoft.wdjava.ui.champs.jc;
import fr.pcsoft.wdjava.ui.champs.nb;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public abstract class lc extends jc implements db, bb {
    protected static final byte ad = (byte) 0;
    public static final byte bd = (byte) 3;
    protected static final byte fd = (byte) 2;
    public static final byte md = (byte) 1;
    protected static final byte od = (byte) 3;
    protected static final byte td = (byte) 1;
    public static final byte wd = (byte) 0;
    private static final String[] xd = new String[]{m1499z(m1500z("B\n 0T4\u000e>*P-\u0015%9N\"\u0014 1A>n")), m1499z(m1500z("B\u0010(/E$\u000375U$")), m1499z(m1500z("B\u0015/8X\"\u0019>5_7\u001d-5U$\u0003\"4P,\f")), m1499z(m1500z("B\u001d1,T-\u0003.,T3\u001d59D3\u0003\".^\"\u0014$(")), m1499z(m1500z("$?\t\u0019rA8\u0004\\}F5\u000f\u000ft\u0013(\b\u0013A8F\tA5\u0015\u0019|A8\u0000\u0012bA0\u0000\\k\u000e2\u0004\\c,\bø\u0004|I\f~\u00125\u0015\u0015~\u000f|\b\u0012g\u00000\b\u0018tHr")), m1499z(m1500z("39\u0012\u0019e")), m1499z(m1500z("B\u0006.2T>\u000e$,T5\u0019$")), m1499z(m1500z("B\u001f.2B4\u001059C>\u0018.?N1\u001d3=\\")), m1499z(m1500z("B\f .P,\u0003(2G \u0010(8T")), m1499z(m1500z("$?\t\u0019rA8\u0004\\}\u0000|\f\u0013u\b:\b\u001fp\u00155\u000e\u00121\u0005{\u0014\u00121\b(\u0004\u00111\u0005=\u000f\u000f1\r=A\u0006~\u000f9A\u000eø\u0011µ\u0015tO")), m1499z(m1500z("6\u0018>=E5\u0003 )E.\u0003")), m1499z(m1500z("B\u001f)=\\1\u000323D2\u0003$0T,\u0019/("))};
    protected int cd = -1;
    private boolean dd = false;
    protected ArrayList<pb> ed = null;
    protected boolean gd = false;
    protected boolean hd = false;
    protected int id = -1;
    protected boolean jd = false;
    protected int kd = 100;
    protected boolean ld = false;
    protected HashMap<String, WDAttributZR> nd = new LinkedHashMap();
    protected int pd = 1;
    protected int[] qd = null;
    protected byte rd = (byte) 0;
    protected HashMap sd = new LinkedHashMap();
    protected ub ud = null;
    protected HashMap<String, WDRuptureZR> vd = null;

    /* renamed from: a */
    private int m1492a(ec ecVar) {
        return _insererItem(ecVar, _getOccurrence(), isSortedProgrammatically(), false);
    }

    /* renamed from: a */
    private final int m1493a(pb pbVar, int i) {
        int nbElement = getNbElement();
        if (i == nbElement - 1) {
            return i;
        }
        while (i < nbElement) {
            try {
                if (pbVar.mo3573b((ec) this.ud.mo3593b(i), i, true)) {
                    return i;
                }
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        return nbElement - 1;
    }

    /* renamed from: a */
    private ec m1494a(String str) {
        return new ec(this, construireValeurItem(str));
    }

    /* renamed from: a */
    private void m1495a(int i, int i2) {
        try {
            if (((ec) this.ud.mo3593b(convertirIndiceVueVersModele(i2))).m9121i(i)) {
                basculerEnroulementRupture(i, i2);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: a */
    private WDObjet[] m1496a(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        WDObjet[] wDObjetArr = new WDObjet[length];
        int i = 0;
        while (i < length) {
            try {
                if (objArr[i] instanceof WDObjet) {
                    wDObjetArr[i] = (WDObjet) objArr[i];
                } else {
                    wDObjetArr[i] = new WDChaine(objArr[i].toString());
                }
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        return wDObjetArr;
    }

    /* renamed from: b */
    private void m1497b(int i, int i2) {
        try {
            if (!((ec) this.ud.mo3593b(convertirIndiceVueVersModele(i2))).m9121i(i)) {
                basculerEnroulementRupture(i, i2);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* renamed from: c */
    private int m1498c() {
        int i = 0;
        for (WDAttributZR wDAttributZR : this.nd.values()) {
            int i2;
            if (wDAttributZR != null) {
                try {
                    if (wDAttributZR.isAttributAuto()) {
                        i2 = i + 1;
                        i = i2;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw e;
                }
            }
            i2 = i;
            i = i2;
        }
        return i;
    }

    /* renamed from: z */
    private static String m1499z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 97;
                    break;
                case 1:
                    i2 = 92;
                    break;
                case 2:
                    i2 = 97;
                    break;
                case 3:
                    i2 = C0607n.Hn;
                    break;
                default:
                    i2 = 17;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1500z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 17);
        }
        return toCharArray;
    }

    public int _getOccurrence() {
        return getItemCount();
    }

    protected int _insererItem(ec ecVar, int i, boolean z, boolean z2) {
        int max;
        setSelectionParProgrammation(true);
        int _getOccurrence = _getOccurrence();
        if (i >= _getOccurrence) {
            try {
                max = (!isSaisieEnCascadeAutorisee() || this.ud.mo3583e() <= 0) ? _getOccurrence : Math.max(0, _getOccurrence - 1);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        max = i < 0 ? 0 : i;
        try {
            this.ud.mo3578a(ecVar, max, false);
            ecVar.mo3393a(max, true);
            if (max < _getOccurrence) {
                updateIndiceItem(max + 1);
            }
        } catch (Exception e2) {
            C0691a.m2863b(xd[4], e2);
            max = -1;
        }
        if (z) {
            try {
                if (this.ud.mo3580a(this.qd)) {
                    max = this.ud.mo3587a((Object) ecVar);
                }
            } catch (ArrayIndexOutOfBoundsException e3) {
                throw e3;
            }
        }
        setSelectionParProgrammation(false);
        return max;
    }

    protected boolean _modifierItem(ec ecVar, int i) {
        boolean isSelectionParProgrammation = isSelectionParProgrammation();
        setSelectionParProgrammation(true);
        try {
            int _getOccurrence = _getOccurrence();
            if (i >= 0 && i < _getOccurrence) {
                try {
                    this.qd = null;
                    this.ud.mo3591a(ecVar, i, true);
                    ecVar.mo3393a(i, true);
                    setSelectionParProgrammation(isSelectionParProgrammation);
                    return true;
                } catch (Exception e) {
                    C0691a.m2863b(xd[9], e);
                }
            } else if (_getOccurrence() == 0) {
                WDErreurManager.m2883a(C0745b.m3222b(xd[1], new String[0]) + "\n" + C0745b.m3222b(xd[2], getNom().getString(), "" + i));
            } else {
                WDErreurManager.m2883a(C0745b.m3222b(xd[0], "" + i, getNom().getString(), "1", String.valueOf(_getOccurrence())));
            }
            setSelectionParProgrammation(isSelectionParProgrammation);
            return false;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        } catch (Throwable th) {
            setSelectionParProgrammation(isSelectionParProgrammation);
        }
    }

    protected void _supprimerItem(int i) {
        this.ud.mo3577a(i, false);
        updateIndiceItem(i);
    }

    public void _tableAffiche(int i) {
        listeAffiche(i);
    }

    public void _tableAffiche(String str) {
        listeAffiche(str);
    }

    public WDBooleen _tableAjoute(String str) {
        return new WDBooleen(ajouterElement(str));
    }

    public WDEntier4 _tableAjouteLigne(Object[] objArr) {
        return new WDEntier4(ajouterElement(m1496a(objArr)));
    }

    public WDEntier4 _tableDeplaceLigne(int i, WDObjet wDObjet, int i2) throws bd {
        switch (i2) {
            case Integer.MIN_VALUE:
                return new WDEntier4(echangerLigne(i, wDObjet, false) + 1);
            case -2147418112:
                return new WDEntier4(echangerLigne(i, wDObjet, true) + 1);
            case 0:
                try {
                    return new WDEntier4(deplacerLigne(i, wDObjet, false) + 1);
                } catch (bd e) {
                    throw e;
                }
            case 65536:
                return new WDEntier4(deplacerLigne(i, wDObjet, true) + 1);
            default:
                WDErreurManager.m2883a(C0745b.m3222b(xd[8], "4", String.valueOf(i2)) + "\n" + C0745b.m3222b(xd[7], new String[0]));
                return new WDEntier4(-1);
        }
    }

    public void _tableEnregistre() {
    }

    public WDBooleen _tableInsere(String str, int i) {
        return new WDBooleen(insererElement(str, i));
    }

    public void _tableInsereLigne(int i, Object[] objArr) {
        insererElement(m1496a(objArr), i);
    }

    public void _tableModifie(String str, int i) {
        modifierElement(str, i);
    }

    public void _tableModifieLigne(int i, Object[] objArr) {
        modifierElement(m1496a(objArr), i);
    }

    public WDEntier4 _tableOccurrence(int i) {
        switch (i) {
            case 1:
                return new WDEntier4(getNbElement());
            case 2:
                return new WDEntier4(Math.max(0, getNbAttribut() - m1498c()));
            case 3:
                try {
                    return new WDEntier4(getNbLigneVisible(true));
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw e;
                }
            case 4:
                return new WDEntier4(getNbLigneAffichee());
            default:
                return new WDEntier4(-1);
        }
    }

    public WDEntier4 _tablePosition() {
        return new WDEntier4(getPosition());
    }

    public void _tablePosition(int i) {
        getPosition(i);
    }

    public WDEntier4 _tableSelect() {
        return new WDEntier4(getElementSelectionne());
    }

    public WDEntier4 _tableSelect(int i) {
        return new WDEntier4(getElementSelectionne(i));
    }

    public void _tableSelectMoins() {
        supprimerSelection();
    }

    public void _tableSelectMoins(int[] iArr) {
        supprimerSelection(iArr);
    }

    public WDEntier4 _tableSelectOccurrence() {
        return new WDEntier4(getNbElementSelectionne());
    }

    public void _tableSelectPlus() {
        ajouterSelection();
    }

    public void _tableSelectPlus(int[] iArr) {
        ajouterSelection(iArr);
    }

    public void _tableSupprime(int i, boolean z) {
        supprimerElementA(i, z);
    }

    public void _tableSupprimeTout() {
        supprimerTout();
    }

    public void activerEcouteurAffichageLigne() {
        this.dd = true;
    }

    public void affecterAttributVersPropChamp(ec ecVar, gc gcVar) {
        if (ecVar != null) {
            for (WDAttributZR wDAttributZR : this.nd.values()) {
                gc champAssocie = wDAttributZR.getChampAssocie();
                if (gcVar == null || gcVar == champAssocie) {
                    try {
                        wDAttributZR.affecterValeurChampAssocie(champAssocie, ecVar.m9107b(wDAttributZR.getIndiceAttribut()));
                    } catch (ArrayIndexOutOfBoundsException e) {
                        throw e;
                    }
                }
            }
        }
    }

    public void affecterPropChampVersAttribut(ec ecVar) {
        if (ecVar != null) {
            for (WDAttributZR wDAttributZR : this.nd.values()) {
                if (wDAttributZR != null) {
                    try {
                        if (wDAttributZR.getProprieteAssocie() == EWDPropriete.PROP_VALEUR) {
                            gc champAssocie = wDAttributZR.getChampAssocie();
                            if (champAssocie != null) {
                                try {
                                    if (champAssocie.isSauverValeurEnFinEditionZR()) {
                                        ecVar.m9101a(wDAttributZR.getIndiceAttribut(), champAssocie.getValeurPropriete(wDAttributZR.getProprieteAssocie()));
                                    }
                                } catch (ArrayIndexOutOfBoundsException e) {
                                    throw e;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        throw e2;
                    }
                }
            }
        }
    }

    public void ajouterAttributZR(WDAttributZR wDAttributZR) {
        wDAttributZR.setZoneRepetee(this);
        wDAttributZR.setIndiceAttribut(this.nd.size());
        this.nd.put(wDAttributZR.getName().toLowerCase(), wDAttributZR);
    }

    protected void ajouterCelluleVirtuelle() {
        this.ud.mo3579a(creerItem(new WDObjet[this.nd.size()]), true);
    }

    public void ajouterChamp(String str, gc gcVar) {
        this.sd.put(str.toLowerCase(), gcVar);
        initChampPourAffichageDansZR(gcVar);
        gcVar.fixeValeurDefautAttributZR();
    }

    public int ajouterElement(WDObjet[] wDObjetArr) {
        return m1492a(creerItem(wDObjetArr)) + 1;
    }

    public boolean ajouterElement(String str) {
        try {
            return _insererItem(m1494a(str), _getOccurrence(), isSortedProgrammatically(), false) >= 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    protected boolean basculerEnroulementRupture(int i, int i2) {
        try {
            pb pbVar = this.ed != null ? (pb) this.ed.get(i) : null;
            if (pbVar == null) {
                return false;
            }
            try {
                if (i2 != getIndiceHautRupture(pbVar, i2)) {
                    return false;
                }
                ec ecVar = (ec) this.ud.mo3593b(i2);
                int nbElement = getNbElement();
                C1296g h = ecVar.m9119h(i);
                try {
                    h.f3877c = i2;
                    h.f3875a = i2;
                    h.f3876b = !h.f3876b;
                    while (true) {
                        i2++;
                        if (i2 >= nbElement) {
                            break;
                        }
                        ecVar = (ec) this.ud.mo3593b(i2);
                        try {
                            if (pbVar.mo3572a(ecVar, i2, true)) {
                                break;
                            }
                            h.f3875a = i2;
                            ecVar.m9102a(i, h);
                        } catch (ArrayIndexOutOfBoundsException e) {
                            throw e;
                        }
                    }
                    updateContenu(true);
                    return true;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw e2;
                }
            } catch (ArrayIndexOutOfBoundsException e22) {
                throw e22;
            }
        } catch (ArrayIndexOutOfBoundsException e222) {
            throw e222;
        }
    }

    protected int calculerIndiceInsertionItem() {
        if (isMultiselection()) {
            return _getOccurrence();
        }
        int indiceElementCourant = getIndiceElementCourant();
        return indiceElementCourant == -1 ? _getOccurrence() : indiceElementCourant - 1;
    }

    public void cancelSwipe() {
    }

    public int chercherElement(String str, boolean z, int i) {
        return -1;
    }

    public int chercherElementSurAttribut(WDAttributZR wDAttributZR, String str, int i, int i2) {
        int[] iArr;
        if (wDAttributZR == null) {
            C0809m c0809m = new C0809m(getNbAttribut());
            for (dc dcVar : this.nd.values()) {
                gc champAssocie = dcVar.getChampAssocie();
                if (champAssocie != null) {
                    try {
                        if (champAssocie._isVisible()) {
                            EWDPropriete proprieteAssocie = dcVar.getProprieteAssocie();
                            try {
                                if (proprieteAssocie != EWDPropriete.PROP_VALEUR) {
                                    if (proprieteAssocie != EWDPropriete.PROP_LIBELLE) {
                                    }
                                }
                                c0809m.m4076a(dcVar.getIndiceAttribut());
                            } catch (ArrayIndexOutOfBoundsException e) {
                                throw e;
                            } catch (ArrayIndexOutOfBoundsException e2) {
                                throw e2;
                            }
                        }
                        continue;
                    } catch (ArrayIndexOutOfBoundsException e22) {
                        throw e22;
                    }
                }
            }
            try {
                if (c0809m.m4086i() == 0) {
                    return -1;
                }
                int[] d = c0809m.m4081d();
                if (i == -1) {
                    i = 2;
                }
                iArr = d;
            } catch (ArrayIndexOutOfBoundsException e222) {
                throw e222;
            }
        }
        d = new int[]{wDAttributZR.getIndiceAttribut()};
        if (i == -1) {
            i = 1;
            iArr = d;
        } else {
            iArr = d;
        }
        int a = ((C1311t) getModeleDonnees()).m9221a(iArr, str, i, i2 - 1);
        return a >= 0 ? a + 1 : a;
    }

    public WDObjet[] construireValeurItem(String str) {
        String[] a = C0808l.m4028a(str);
        int length = a.length;
        WDObjet[] wDObjetArr = new WDObjet[getNbAttribut()];
        int i = 0;
        for (dc dcVar : this.nd.values()) {
            if (i < length) {
                WDObjet convertStringToValue;
                gc champAssocie = dcVar.getChampAssocie();
                if (champAssocie != null) {
                    try {
                        if (dcVar.getProprieteAssocie() == EWDPropriete.PROP_VALEUR) {
                            convertStringToValue = champAssocie.convertStringToValue(a[i]);
                            wDObjetArr[i] = convertStringToValue;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        throw e;
                    }
                }
                convertStringToValue = new WDChaine(a[i]);
                wDObjetArr[i] = convertStringToValue;
            } else {
                wDObjetArr[i] = null;
            }
            i++;
        }
        return wDObjetArr;
    }

    protected int convertirIndiceModeleVersVue(int i) {
        return i;
    }

    public int convertirIndiceVueVersModele(int i) {
        return i;
    }

    public WDAttributZR creerAttribut(String str, EWDPropriete eWDPropriete, gc gcVar) {
        WDAttributZR wDAttributZR = new WDAttributZR();
        try {
            wDAttributZR.setNom(str);
            wDAttributZR.setProprieteAssocie(eWDPropriete);
            wDAttributZR.setChampAssocie(gcVar);
            ajouterAttributZR(wDAttributZR);
            if (wDAttributZR.getChampAssocie() != null) {
                wDAttributZR.setValeurDefautAttribut(wDAttributZR.getChampAssocie().getValeurPropriete(wDAttributZR.getProprieteAssocie()));
            }
            return wDAttributZR;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    public void creerAttributAuto() {
        for (gc creerAttributAuto : this.sd.values()) {
            try {
                creerAttributAuto(creerAttributAuto);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
    }

    public final void creerAttributAuto(gc gcVar) {
        if (gcVar.isNeedAttributAuto()) {
            WDAttributZR creerAttribut = creerAttribut(xd[10] + gcVar.getName() + String.valueOf(gcVar.getProprietePourAttributAuto().ordinal()), gcVar.getProprietePourAttributAuto(), gcVar);
            C0712l liaisonDataBinding = gcVar.getLiaisonDataBinding();
            if (liaisonDataBinding != null) {
                try {
                    creerAttribut.setLiaisonDataBinding(liaisonDataBinding);
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw e;
                }
            }
        }
    }

    protected ec creerItem(WDObjet[] wDObjetArr) {
        int length = wDObjetArr.length;
        int nbAttribut = getNbAttribut();
        if (length == nbAttribut) {
            try {
                return new ec(this, wDObjetArr);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        Object obj = new WDObjet[nbAttribut];
        if (length > nbAttribut) {
            try {
                System.arraycopy(wDObjetArr, 0, obj, 0, nbAttribut);
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw e2;
            }
        }
        System.arraycopy(wDObjetArr, 0, obj, 0, length);
        while (length < nbAttribut) {
            try {
                obj[length] = null;
                length++;
            } catch (ArrayIndexOutOfBoundsException e22) {
                throw e22;
            }
        }
        return new ec(this, obj);
    }

    protected pb creerLiaisonRupture(WDRuptureZR wDRuptureZR, WDRuptureZR wDRuptureZR2, String str) {
        WDAttributZR attributByName = getAttributByName(str);
        if (attributByName == null) {
            return null;
        }
        try {
            return new qb(this, wDRuptureZR, wDRuptureZR2, attributByName);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    protected abstract ub creerModeleDonnees();

    protected void declarerLiaisonRupture(WDRuptureZR wDRuptureZR, WDRuptureZR wDRuptureZR2, String str) {
        pb creerLiaisonRupture = creerLiaisonRupture(wDRuptureZR, wDRuptureZR2, str);
        if (creerLiaisonRupture != null) {
            try {
                if (this.ed == null) {
                    this.ed = new ArrayList(3);
                }
                try {
                    this.ed.add(creerLiaisonRupture);
                    if (this.vd == null) {
                        this.vd = new LinkedHashMap();
                    }
                    this.vd.put(wDRuptureZR.getName().toLowerCase(), wDRuptureZR);
                    this.vd.put(wDRuptureZR2.getName().toLowerCase(), wDRuptureZR2);
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw e2;
            }
        }
    }

    public void deplacerLigne(int i, int i2, boolean z) {
        this.ud.mo3597c(i, i2);
        updateIndiceItem(Math.min(i, i2));
    }

    public void deroulerRupure(int i, WDRuptureZR wDRuptureZR) {
        int a = C0725i.m3011a(i);
        if (wDRuptureZR != null) {
            try {
                int indiceLiaisonRupture = getIndiceLiaisonRupture(wDRuptureZR);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        indiceLiaisonRupture = 0;
        if (a == -1) {
            a = getIndiceElementCourant() - 1;
        }
        if (a >= 0) {
            try {
                if (a < _getOccurrence()) {
                    m1495a(indiceLiaisonRupture, a);
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw e2;
            }
        }
    }

    public void deroulerTout() {
        try {
            if (isAvecRupture()) {
                int _getOccurrence = _getOccurrence();
                for (int i = 0; i < _getOccurrence; i++) {
                    ((ec) this.ud.mo3593b(i)).m9120h();
                }
                updateContenu();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    public void echangerLigne(int i, int i2, boolean z) {
        this.ud.mo3594b(i, i2);
        updateIndiceItem(Math.min(i, i2));
    }

    public void enroulerDeroulerRupure(int i, WDRuptureZR wDRuptureZR) {
        if (wDRuptureZR != null) {
            try {
                int indiceLiaisonRupture = getIndiceLiaisonRupture(wDRuptureZR);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        indiceLiaisonRupture = 0;
        if (i == -1) {
            i = getIndiceElementCourant() - 1;
        }
        if (i >= 0) {
            try {
                if (i < _getOccurrence()) {
                    basculerEnroulementRupture(indiceLiaisonRupture, i);
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw e2;
            }
        }
    }

    public void enroulerRupure(int i, WDRuptureZR wDRuptureZR) {
        int a = C0725i.m3011a(i);
        if (wDRuptureZR != null) {
            try {
                int indiceLiaisonRupture = getIndiceLiaisonRupture(wDRuptureZR);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        indiceLiaisonRupture = 0;
        if (a == -1) {
            a = getIndiceElementCourant() - 1;
        }
        if (a >= 0) {
            try {
                if (a < _getOccurrence()) {
                    m1497b(indiceLiaisonRupture, a);
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw e2;
            }
        }
    }

    public void enroulerTout() {
        try {
            if (isAvecRupture()) {
                Iterator it = this.ed.iterator();
                int i = 0;
                while (it.hasNext()) {
                    pb pbVar = (pb) it.next();
                    int _getOccurrence = _getOccurrence();
                    int i2;
                    for (int i3 = 0; i3 < _getOccurrence; i3 = i2 + 1) {
                        ec ecVar = (ec) this.ud.mo3593b(i3);
                        if (ecVar == null) {
                            break;
                        }
                        C1296g h = ecVar.m9119h(i);
                        h.f3876b = true;
                        h.f3877c = i3;
                        h.f3875a = m1493a(pbVar, i3);
                        ecVar.m9102a(i, h);
                        i2 = i3;
                        for (i3++; i3 <= h.f3875a; i3++) {
                            ((ec) this.ud.mo3593b(i3)).m9102a(i, h);
                            i2++;
                        }
                    }
                    i++;
                }
                updateContenu(true);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    public WDObjet get(int i) {
        int _getOccurrence = _getOccurrence();
        if (_getOccurrence <= 0) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(xd[1], new String[0]) + "\n" + C0745b.m3222b(xd[2], getName(), String.valueOf(i)));
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        if (i - 1 < 0 || i - 1 >= _getOccurrence) {
            WDErreurManager.m2883a(C0745b.m3222b(xd[3], getName()) + "\n" + C0745b.m3222b(xd[0], String.valueOf(i), getName(), "1", String.valueOf(_getOccurrence)));
            return null;
        }
        ec ecVar = (ec) this.ud.mo3593b(i - 1);
        ecVar.mo3393a(i - 1, false);
        return ecVar;
    }

    public WDAttributZR getAttributByIndex(int i) {
        if (i >= 0) {
            for (WDAttributZR wDAttributZR : this.nd.values()) {
                try {
                    if (wDAttributZR.getIndiceAttribut() == i) {
                        return wDAttributZR;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw e;
                }
            }
        }
        return null;
    }

    public WDAttributZR getAttributByName(String str) {
        return (WDAttributZR) this.nd.get(str.toLowerCase());
    }

    public final Iterator<gc> getChampIterator() {
        try {
            return this.sd != null ? this.sd.values().iterator() : null;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    public final ub getDataModel() {
        return this.ud;
    }

    public WDObjet getElement(String str) {
        int indiceElementCourant = getIndiceElementCourant();
        WDObjet wDObjet;
        if (indiceElementCourant > 0) {
            ec ecVar = (ec) get(indiceElementCourant);
            if (ecVar != null) {
                wDObjet = ecVar.get(str);
                if (wDObjet != null) {
                    try {
                        if (!(wDObjet instanceof cc)) {
                            return wDObjet;
                        }
                        ((cc) wDObjet).m9045a(false);
                        return wDObjet;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        throw e;
                    }
                }
            }
        }
        wDObjet = getFils(str);
        if (wDObjet != null) {
            return wDObjet;
        }
        WDErreurManager.m2883a(C0745b.m3222b(xd[11], new String[0]));
        return null;
    }

    public C0489p getFils(String str) {
        C0489p filsDirect = getFilsDirect(str);
        if (filsDirect == null) {
            String toLowerCase = str.toLowerCase();
            for (gc fils : this.sd.values()) {
                filsDirect = fils.getFils(toLowerCase);
                if (filsDirect != null) {
                    break;
                }
            }
            if (filsDirect == null) {
                try {
                    if (isAvecRupture()) {
                        for (WDRuptureZR fils2 : this.vd.values()) {
                            filsDirect = fils2.getFils(toLowerCase);
                            if (filsDirect != null) {
                                break;
                            }
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw e;
                }
            }
        }
        return filsDirect;
    }

    public C0489p getFilsDirect(String str) {
        String toLowerCase = str.toLowerCase();
        C0489p c0489p = (C0489p) this.sd.get(toLowerCase);
        if (c0489p == null) {
            c0489p = (C0489p) this.nd.get(toLowerCase);
            if (c0489p == null) {
                try {
                    if (isAvecRupture()) {
                        c0489p = (C0489p) this.vd.get(toLowerCase);
                        if (c0489p == null) {
                            for (WDRuptureZR filsDirect : this.vd.values()) {
                                c0489p = filsDirect.getFilsDirect(toLowerCase);
                                if (c0489p != null) {
                                    break;
                                }
                            }
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw e;
                }
            }
        }
        return c0489p;
    }

    public int getIndiceElementCourant() {
        try {
            if (this.jd) {
                if (this.id >= 0) {
                    return convertirIndiceModeleVersVue(this.id) + 1;
                }
            }
            return super.getIndiceElementCourant();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    protected final int getIndiceHautRupture(pb pbVar, int i) {
        if (i == 0) {
            return i;
        }
        while (i > 0) {
            try {
                if (pbVar.mo3572a((ec) this.ud.mo3593b(i), i, true)) {
                    return i;
                }
                i--;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        return 0;
    }

    protected int getIndiceLiaisonRupture(WDRuptureZR wDRuptureZR) {
        if (isAvecRupture()) {
            Iterator it = this.ed.iterator();
            int i = 0;
            while (it.hasNext()) {
                pb pbVar = (pb) it.next();
                try {
                    if (pbVar.m9182c() == wDRuptureZR) {
                        return i;
                    }
                    if (pbVar.m9180b() == wDRuptureZR) {
                        return i;
                    }
                    i++;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw e2;
                }
            }
        }
        return -1;
    }

    public final int getIndiceRupture(WDRuptureZR wDRuptureZR, int i) {
        if (i == -1) {
            i = getIndiceElementCourant();
        }
        try {
            if (!isIndiceValide(i)) {
                return 0;
            }
            pb liaisonRupture = getLiaisonRupture(wDRuptureZR);
            if (liaisonRupture == null) {
                return -1;
            }
            try {
                return liaisonRupture.m9182c() == wDRuptureZR ? getIndiceHautRupture(liaisonRupture, i - 1) + 1 : m1493a(liaisonRupture, i - 1) + 1;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    public abstract String getInfoChampXY(int i, int i2, boolean z);

    public abstract int getInfoLigneXY(int i, int i2, boolean z);

    public jb getItemAt(int i) {
        return (jb) this.ud.mo3593b(i);
    }

    public int getItemCount() {
        return this.ud.mo3586a();
    }

    public ec getItemCourant() {
        try {
            if (isDessinZREnCours()) {
                if (this.id >= 0) {
                    return (ec) this.ud.mo3593b(this.id);
                }
            }
            int indiceElementCourant = getIndiceElementCourant();
            return indiceElementCourant > 0 ? (ec) get(indiceElementCourant) : null;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    public WDEntier4 getLargeurColonne() {
        return new WDEntier4((double) C1511l.m10515a((float) getLargeurColonneZR(), 1, getDisplayUnit()));
    }

    protected abstract int getLargeurColonneZR();

    public pb getLiaisonRupture(WDRuptureZR wDRuptureZR) {
        int indiceLiaisonRupture = getIndiceLiaisonRupture(wDRuptureZR);
        if (indiceLiaisonRupture < 0) {
            return null;
        }
        try {
            return (pb) this.ed.get(indiceLiaisonRupture);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    public pb getLiaisonRuptureAt(int i) {
        if (i >= 0) {
            try {
                if (i < getNbLiaisonsRupture()) {
                    return (pb) this.ed.get(i);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        return null;
    }

    public Iterator getLstFils() {
        return this.sd.values().iterator();
    }

    public int getMaxItemCountPerRow() {
        return getNbColonneZR();
    }

    public Object getModeleDonnees() {
        return this.ud;
    }

    public int getNbAttribut() {
        return this.nd.size();
    }

    protected abstract int getNbColonneZR();

    public int getNbElement() {
        return this.ud.mo3582d();
    }

    public final int getNbLiaisonsRupture() {
        try {
            return this.ed != null ? this.ed.size() : 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    protected int getNbTotalElement() {
        return getNbElement();
    }

    public String getNomType() {
        return C0745b.m3220a(xd[6], new String[0]);
    }

    public WDEntier4 getNombreColonne() {
        return new WDEntier4(getNbColonneZR());
    }

    public WDEntier4 getOccurrence() {
        return new WDEntier4(getNbElement());
    }

    public WDRuptureZR getRuptureByName(String str) {
        try {
            return this.vd == null ? null : (WDRuptureZR) this.vd.get(str.toLowerCase());
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    public final Iterator<WDRuptureZR> getRuptureIterator() {
        try {
            return this.vd != null ? this.vd.values().iterator() : null;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    public WDObjet getValeur() {
        return new WDEntier4(getIndiceElementCourant());
    }

    public WDObjet getValeurInitiale() {
        return new WDEntier4(this.cd);
    }

    public String getValeurItem(ec ecVar) {
        StringBuffer stringBuffer = new StringBuffer();
        if (ecVar != null) {
            int i = 0;
            for (WDAttributZR wDAttributZR : this.nd.values()) {
                if (i > 0) {
                    try {
                        stringBuffer.append(C0607n.Gc);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        throw e;
                    }
                }
                WDObjet b = ecVar.m9107b(wDAttributZR.getIndiceAttribut());
                stringBuffer.append((b == null ? wDAttributZR.getValeurDefautAttribut() : b).getString());
                i++;
            }
        }
        return stringBuffer.toString();
    }

    public void init() {
        if (this.vd != null) {
            for (WDRuptureZR appelPCode : this.vd.values()) {
                try {
                    appelPCode.appelPCode(14);
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw e;
                }
            }
        }
        for (gc appelPCode2 : this.sd.values()) {
            appelPCode2.appelPCode(14);
        }
        try {
            if (isMemoire()) {
                if (isSaisieEnCascadeAutorisee()) {
                    try {
                        if (_getOccurrence() == 0) {
                            ajouterCelluleVirtuelle();
                        }
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        throw e2;
                    }
                }
            }
            super.init();
        } catch (ArrayIndexOutOfBoundsException e22) {
            throw e22;
        } catch (ArrayIndexOutOfBoundsException e222) {
            throw e222;
        }
    }

    public final void initChampPourAffichageDansZR(gc gcVar) {
        gcVar.setPere(this);
        gcVar.majPlan(gcVar.getFirstPlan());
        gcVar.addFlag(32);
    }

    public int insererElement(WDObjet[] wDObjetArr, int i) {
        return _insererItem(creerItem(wDObjetArr), i == -1 ? calculerIndiceInsertionItem() : i - 1, isSortedProgrammatically(), false);
    }

    public boolean insererElement(String str) {
        return insererElement(str, -1);
    }

    public boolean insererElement(String str, int i) {
        try {
            return _insererItem(m1494a(str), i == -1 ? calculerIndiceInsertionItem() : i + -1, isSortedProgrammatically(), false) >= 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    protected final boolean isAvecBtnEnrouleDeroule() {
        return this.gd;
    }

    protected final boolean isAvecRupture() {
        try {
            if (this.ed != null) {
                if (!this.ed.isEmpty()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    protected final boolean isDessinZREnCours() {
        return this.jd;
    }

    public boolean isEditable() {
        try {
            switch (this.d) {
                case 1:
                case 4:
                case 5:
                    return false;
                default:
                    return true;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    public abstract boolean isEditingCell(int i);

    public boolean isLoadingViewVisible() {
        return false;
    }

    public final boolean isPCodeAffichageLigne() {
        return this.dd;
    }

    protected final boolean isPropNeedUpdateLayout(EWDPropriete eWDPropriete) {
        try {
            switch (wb.f3922a[eWDPropriete.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return true;
                default:
                    return false;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    protected boolean isSaisieEnCascadeAutorisee() {
        try {
            if (this.hd) {
                if (isEditable()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    protected final boolean isSorted() {
        try {
            if (this.qd != null) {
                if (this.qd.length > 0) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    protected boolean isSortedProgrammatically() {
        return isSorted();
    }

    public abstract boolean isSwipeEnabled();

    public boolean isValeurEnAjustement() {
        try {
            if (!super.isValeurEnAjustement()) {
                if (!this.jd) {
                    return false;
                }
            }
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    public boolean isZoneRepetee() {
        return true;
    }

    public void listeAffiche(int i) {
        getPosition(i);
    }

    public void listeAffiche(String str) {
        try {
            if (str.equals(xd[5])) {
                appelPCode(14);
            }
            repeindreChamp();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    public void majPlan(int i) {
        super.majPlan(i);
        for (gc majPlan : this.sd.values()) {
            majPlan.majPlan(i);
        }
        if (isAvecRupture()) {
            for (WDRuptureZR majPlan2 : this.vd.values()) {
                majPlan2.majPlan(i);
            }
        }
    }

    public void modifierElement(String str) {
        modifierElement(str, -1);
    }

    public void modifierElement(String str, int i) throws WDException {
        int indiceElementCourant;
        ec a = m1494a(str);
        if (i == -1) {
            indiceElementCourant = getIndiceElementCourant() - 1;
            if (indiceElementCourant < 0) {
                return;
            }
        }
        indiceElementCourant = i - 1;
        _modifierItem(a, indiceElementCourant);
    }

    public void modifierElement(WDObjet[] wDObjetArr, int i) {
        int indiceElementCourant;
        ec creerItem = creerItem(wDObjetArr);
        if (i == -1) {
            indiceElementCourant = getIndiceElementCourant() - 1;
            if (indiceElementCourant < 0) {
                return;
            }
        }
        indiceElementCourant = i - 1;
        _modifierItem(creerItem, indiceElementCourant);
    }

    public void notifFinFocus(gc gcVar) {
    }

    public void notifModifChamp(gc gcVar) {
        onModifChamp();
        appelPCode(17);
    }

    public void notifModifValeurAttribut(WDAttributZR wDAttributZR, int i, WDObjet wDObjet) {
    }

    public void onChampPropertyValueChanged(gc gcVar, EWDPropriete eWDPropriete, WDObjet wDObjet) {
    }

    public void parcourirChamp(C0546j c0546j, boolean z) {
        for (nb nbVar : this.sd.values()) {
            try {
                c0546j.mo2352a(nbVar);
                if (z) {
                    nbVar.parcourirChamp(c0546j, z);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        if (isAvecRupture()) {
            for (WDRuptureZR parcourirChamp : this.vd.values()) {
                parcourirChamp.parcourirChamp(c0546j, z);
            }
        }
    }

    public void parcourirObjetAPCode(C0546j c0546j, boolean z) {
        for (C0489p c0489p : this.sd.values()) {
            try {
                c0546j.mo2353a(c0489p);
                if (z) {
                    c0489p.parcourirObjetAPCode(c0546j, z);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        if (isAvecRupture()) {
            for (WDRuptureZR parcourirObjetAPCode : this.vd.values()) {
                parcourirObjetAPCode.parcourirObjetAPCode(c0546j, z);
            }
        }
    }

    protected void postInit() {
        super.postInit();
        for (gc appelPCode : this.sd.values()) {
            appelPCode.appelPCode(C0607n.Xu);
        }
        if (this.vd != null) {
            for (WDRuptureZR appelPCode2 : this.vd.values()) {
                try {
                    appelPCode2.appelPCode(C0607n.Xu);
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw e;
                }
            }
        }
    }

    public void raz(boolean z) {
        if (z) {
            try {
                supprimerTout();
                setValeur(-1);
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        setValeur(this.cd);
    }

    public abstract void redessinerCellule(int i, boolean z);

    public void release() {
        Iterator it;
        super.release();
        if (this.sd != null) {
            for (gc gcVar : this.sd.values()) {
                if (gcVar != null) {
                    try {
                        gcVar.release();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        throw e;
                    }
                }
            }
            this.sd.clear();
            this.sd = null;
        }
        if (this.nd != null) {
            for (dc dcVar : this.nd.values()) {
                if (dcVar != null) {
                    try {
                        dcVar.release();
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        throw e2;
                    }
                }
            }
            this.nd.clear();
            this.nd = null;
        }
        try {
            this.qd = null;
            if (this.ud != null) {
                this.ud.mo3598f();
                this.ud = null;
            }
            if (this.vd != null) {
                for (WDRuptureZR wDRuptureZR : this.vd.values()) {
                    if (wDRuptureZR != null) {
                        try {
                            wDRuptureZR.release();
                        } catch (ArrayIndexOutOfBoundsException e22) {
                            throw e22;
                        }
                    }
                }
                this.vd.clear();
                this.vd = null;
            }
            if (this.ed != null) {
                it = this.ed.iterator();
                while (it.hasNext()) {
                    pb pbVar = (pb) it.next();
                    if (pbVar != null) {
                        try {
                            pbVar.mo3571a();
                        } catch (ArrayIndexOutOfBoundsException e222) {
                            throw e222;
                        }
                    }
                }
                this.ed.clear();
                this.ed = null;
            }
        } catch (ArrayIndexOutOfBoundsException e2222) {
            throw e2222;
        }
    }

    public void removeObjAPCode(C0489p c0489p) {
        try {
            if (this.sd != null) {
                this.sd.remove(c0489p.getName().toLowerCase());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    public void repeindreChamp() {
        try {
            if (!isDessinZREnCours()) {
                super.repeindreChamp();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    protected final void setBtnEnrouleDeroule(boolean z) {
        this.gd = z;
    }

    protected abstract void setCadreCelluleSelection(C1110m c1110m);

    protected final void setCellulePaintEnCours(int i) {
        this.id = i;
    }

    protected void setDessinerLigneVide(boolean z) {
        this.ld = z;
    }

    protected void setEnregistrementSortieLigne(boolean z) {
    }

    public void setItemStoredValue(int i, WDObjet wDObjet) {
        ec ecVar = (ec) getItemAt(i);
        if (ecVar != null) {
            try {
                ecVar.setValeurMemorisee(wDObjet.getString());
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
    }

    public void setLargeurColonne(int i) {
        this.kd = C1511l.m10532d((float) i, getDisplayUnit());
    }

    public void setLoadingViewVisible(boolean z) {
    }

    public void setNombreColonne(int i) {
        this.pd = i;
    }

    protected void setParamAffichage(int i, int i2, int i3, int i4) {
        try {
            if (isChangementAgencementEnCours()) {
                setHauteurLigne(i4);
                return;
            }
            if (i == 2) {
                i = i2 == 1 ? 0 : 1;
            }
            this.rd = (byte) i;
            setNombreColonne(i2);
            setLargeurColonne(i3);
            setHauteurLigne(i4);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    protected void setSaisieEnCascade(boolean z) {
        this.hd = z;
    }

    public void setValeur(WDObjet wDObjet) {
        setValeur(wDObjet.getInt());
    }

    public void setValeurInitiale(int i) {
        this.cd = i;
    }

    public void setValeurInitiale(WDObjet wDObjet) {
        try {
            if (wDObjet.isChaine()) {
                if (wDObjet.getString().equals("")) {
                    this.cd = 1;
                    return;
                }
            }
            setValeurInitiale(wDObjet.getInt());
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    public void supprimerElementA(int i, boolean z) throws WDException {
        if (i == -1) {
            try {
                supprimerElementSelectionne(z);
                return;
            } catch (WDException e) {
                throw e;
            }
        }
        int _getOccurrence = _getOccurrence();
        if (i - 1 < 0 || i - 1 >= _getOccurrence) {
            try {
                if (_getOccurrence() == 0) {
                    WDErreurManager.m2883a(C0745b.m3222b(xd[1], new String[0]) + "\n" + C0745b.m3222b(xd[2], getNom().getString(), "" + i));
                    return;
                }
                WDErreurManager.m2883a(C0745b.m3222b(xd[0], "" + i, getNom().getString(), "1", String.valueOf(_getOccurrence())));
                return;
            } catch (WDException e2) {
                throw e2;
            }
        }
        setSelectionParProgrammation(true);
        _supprimerItem(i - 1);
        setSelectionParProgrammation(false);
    }

    public void supprimerTout() {
        try {
            this.ud.mo3581b();
            if (isSaisieEnCascadeAutorisee()) {
                ajouterCelluleVirtuelle();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    public boolean trierZR(int[] iArr, boolean z, boolean z2) {
        int i;
        int abs;
        if (iArr != null) {
            int size = this.nd.size();
            for (int abs2 : iArr) {
                abs2 = Math.abs(abs2);
                if ((abs2 & 4096) > 0) {
                    abs2 &= -4097;
                }
                if (abs2 <= 0 || abs2 > size) {
                    return false;
                }
            }
            this.qd = iArr;
        } else if (z2) {
            this.qd = new int[this.nd.size()];
            i = 0;
            for (WDAttributZR wDAttributZR : this.nd.values()) {
                abs2 = C0725i.m3069e(wDAttributZR.getIndiceAttribut());
                try {
                    int i2 = wDAttributZR.isTriNumerique() ? abs2 + 4096 : abs2;
                    if (!z) {
                        i2 *= -1;
                    }
                    this.qd[i] = i2;
                    i++;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw e;
                }
            }
        } else {
            try {
                this.qd = null;
                return true;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw e2;
            }
        }
        boolean a = this.ud.mo3580a(this.qd);
        if (!a) {
            return a;
        }
        try {
            updateIndiceItem(0);
            return a;
        } catch (ArrayIndexOutOfBoundsException e22) {
            throw e22;
        }
    }

    public abstract void updateContenu();

    public abstract void updateContenu(boolean z);

    protected final void updateIndiceItem(int i) {
        int a = this.ud.mo3586a();
        while (i < a) {
            ec ecVar = (ec) this.ud.mo3593b(i);
            if (ecVar != null) {
                ecVar.mo3393a(i, true);
                i++;
            } else {
                return;
            }
        }
    }
}
