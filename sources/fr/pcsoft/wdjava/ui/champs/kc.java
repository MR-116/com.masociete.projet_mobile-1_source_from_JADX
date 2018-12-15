package fr.pcsoft.wdjava.ui.champs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import fr.pcsoft.wdjava.api.WDAPIListe;
import fr.pcsoft.wdjava.core.C0723g;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p047f.C0713b;
import fr.pcsoft.wdjava.core.p047f.C0715d;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.cb;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.database.hf.C0849z;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p064a.C1034d;
import fr.pcsoft.wdjava.ui.p073d.p074a.C1319a;
import fr.pcsoft.wdjava.ui.p073d.p075b.C1320c;
import fr.pcsoft.wdjava.ui.p079e.C1399b;
import fr.pcsoft.wdjava.ui.p079e.C1400d;
import fr.pcsoft.wdjava.ui.style.C1498d;
import fr.pcsoft.wdjava.ui.utils.C1299d;
import fr.pcsoft.wdjava.ui.utils.C1511l;

@C0723g(a = {WDAPIListe.class})
public abstract class kc extends jc {
    protected static final int ed = 48;
    private static final String[] kd = new String[]{m8656z(m8657z("je\u000e\u0012F\u001cr\u0003\bE\u0016e\u001f\bF\n\u0015\u000eJ\u001d\u001f\bB\u0004p\u0003\fJ\f")), m8656z(m8657z("\fR.%v;\u0000\u000b\f#:U.`o,\u0000.!yiD{5m,\u00000)p=E|&j*H5%qg")), m8656z(m8657z("jl\u0015\u0013W\f\n\tG\f")), m8656z(m8657z("jv\u001d\fF\u001cr\u0003\u0016B\u0005i\u0018\u0005\\\nh\u001d\rS\u0016\u0012")), m8656z(m8657z("ji\u0012\u0004J\ne\u0003\tM\u001fa\u0010\tG\f\u001f\bB\u0004p")), m8656z(m8657z("\u001ed\u001f/n+O\u001a)`!I92B*C93G R9#w")), m8656z(m8657z("D*")), m8656z(m8657z("\fC4%`iD9`onI23f;T5/miD{5miI(%niD=.piL9``!A10#%I/4f")), m8656z(m8657z("jc\u0013\rA\u0006\u0012\u000f\\\u001ae\u0010\u0005@\u001di\u0013\u000e\\\bn\u0018\u0012L\u0000d"))};
    protected C1498d ad;
    protected C0713b bd;
    protected ArrayAdapter<bc> cd;
    protected AdapterView dd;
    protected int fd;
    protected OnItemClickListener gd;
    protected int hd;
    protected boolean id;
    protected String jd;

    public kc() {
        this.dd = null;
        this.cd = null;
        this.fd = 0;
        this.id = false;
        this.hd = 0;
        this.ad = new C1498d();
        this.gd = null;
        this.bd = null;
        this.dd = creerComposantPrincipal();
        this.cd = creerModele();
        this.dd.setAdapter(this.cd);
        ((ViewGroup) getCompConteneur()).addView(this.dd);
    }

    /* renamed from: a */
    private int m8651a(String str, boolean z, int i, boolean z2) {
        int i2 = 1;
        C1320c c1320c = (C1320c) getBindingManager(C1320c.class);
        if (c1320c != null) {
            try {
                if (c1320c.mo3616b() == C0715d.DIRECT_ACCESS) {
                    if (!z) {
                        i2 = 0;
                    }
                    return c1320c.mo3665a(null, str, i2, i);
                }
                this.Zc.mo3627g();
            } catch (WDException e) {
                throw e;
            } catch (WDException e2) {
                throw e2;
            }
        }
        bc bcVar;
        String d;
        if (z) {
            int _getOccurrence = _getOccurrence();
            while (i < _getOccurrence) {
                bcVar = (bc) this.cd.getItem(i);
                if (z2) {
                    try {
                        d = bcVar.m8265d();
                    } catch (WDException e22) {
                        throw e22;
                    }
                }
                d = bcVar.m8259a(true);
                try {
                    if (d.compareToIgnoreCase(str) == 0) {
                        return i + 1;
                    }
                    i++;
                } catch (WDException e222) {
                    throw e222;
                }
            }
        }
        String o = C0808l.m4057o(str.toLowerCase());
        int _getOccurrence2 = _getOccurrence();
        while (i < _getOccurrence2) {
            bcVar = (bc) this.cd.getItem(i);
            if (z2) {
                try {
                    d = bcVar.m8265d();
                } catch (WDException e2222) {
                    throw e2222;
                }
            }
            d = bcVar.m8259a(true);
            try {
                if (C0808l.m4057o(d.toLowerCase()).startsWith(o)) {
                    return i + 1;
                }
                i++;
            } catch (WDException e22222) {
                throw e22222;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private final void m8652a(int i, boolean z) {
        try {
            if (this.ad == null) {
                return;
            }
            if (this.ad.mo3799a(i, z)) {
                repaintInUIThread();
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    private void m8653a(String str) {
        bc creerItem = creerItem(str);
        int calculerIndiceAjoutItem = calculerIndiceAjoutItem(creerItem);
        try {
            _insererItem(creerItem, calculerIndiceAjoutItem);
            if (isMemoire()) {
                if (calculerIndiceAjoutItem != this.fd - 1) {
                    try {
                        if (!(this.fd == 0 && calculerIndiceAjoutItem == 0)) {
                            return;
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
                try {
                    positionnerSurIndice(calculerIndiceAjoutItem);
                } catch (WDException e2) {
                    throw e2;
                }
            }
        } catch (WDException e22) {
            throw e22;
        } catch (WDException e222) {
            throw e222;
        }
    }

    /* renamed from: a */
    private final boolean m8654a(int i) {
        try {
            return this.ad != null ? this.ad.mo3803b(i) : false;
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: c */
    private void m8655c() {
        this.cd.sort(new bb());
    }

    /* renamed from: z */
    private static String m8656z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 73;
                    break;
                case 1:
                    i2 = 32;
                    break;
                case 2:
                    i2 = 92;
                    break;
                case 3:
                    i2 = 64;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8657z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 3);
        }
        return toCharArray;
    }

    protected int _getHauteurLigne() {
        Integer num = (Integer) this.ad.mo3797a(10);
        return num == null ? 48 : num.intValue();
    }

    public int _getOccurrence() {
        try {
            return this.Zc != null ? this.Zc.mo3616b() != C0715d.DIRECT_ACCESS ? Math.max(this.Zc.mo3626f(), this.cd.getCount()) : this.Zc.mo3626f() : this.cd.getCount();
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    protected boolean _insererItem(bc bcVar, int i) {
        int _getOccurrence = _getOccurrence();
        if (i > _getOccurrence) {
            i = _getOccurrence;
        } else if (i < 0) {
            i = 0;
        }
        try {
            this.cd.insert(bcVar, i);
            bcVar.mo3393a(i, true);
            majSelectionApresInsertion(convertirIndiceModeleVersVue(i));
            if (!isMemoire()) {
                return true;
            }
            if (_getOccurrence() != 1) {
                return true;
            }
            this.Vc.mo3489c(0, 0);
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (Exception e2) {
            C0691a.m2863b(kd[7], e2);
            return false;
        }
    }

    public bc _modifierItem(int i, String str) {
        String[] valeurGLien = valeurGLien(str);
        String str2 = valeurGLien[0];
        String str3 = valeurGLien[1];
        if (i < 0) {
            i = 0;
        }
        if (isIndiceValide(i + 1)) {
            bc bcVar = (bc) this.cd.getItem(i);
            bcVar.setValeur(str3);
            bcVar.setValeurMemorisee(str2);
            this.dd.invalidate();
            return bcVar;
        }
        try {
            if (isVide()) {
                WDErreurManager.m2883a(C0745b.m3222b(kd[2], new String[0]) + "\n" + C0745b.m3222b(kd[4], getName(), String.valueOf(i + 1)));
            } else {
                WDErreurManager.m2883a(C0745b.m3222b(kd[3], String.valueOf(i), getName(), "1", String.valueOf(_getOccurrence())));
            }
            return null;
        } catch (WDException e) {
            throw e;
        }
    }

    protected void _setContenu(String str) {
        try {
            if (this.Zc == null) {
                if (str == null) {
                    try {
                        str = "";
                    } catch (WDException e) {
                        throw e;
                    }
                }
                supprimerTout();
                if (!str.equals("")) {
                    String[] m = C0808l.m4055m(C0808l.m4049g(str));
                    int length = m.length;
                    int i = 0;
                    while (i < length) {
                        try {
                            m8653a(m[i]);
                            i++;
                        } catch (WDException e2) {
                            throw e2;
                        }
                    }
                }
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    public jb addBindingItem(int i) {
        boolean z = this.Wc;
        this.Wc = true;
        try {
            bc bcVar = (bc) createBindingItem();
            _insererItem(bcVar, i);
            return bcVar;
        } finally {
            this.Wc = z;
        }
    }

    public boolean ajouterElement(String str) {
        bc creerItem = creerItem(str);
        return _insererItem(creerItem, calculerIndiceAjoutItem(creerItem));
    }

    protected void appliquerCouleur(int i) {
        this.ad.mo3802b(2, C1031a.m7469m(i));
    }

    protected void appliquerCouleurFond(int i) {
        this.ad.mo3802b(3, C1031a.m7469m(i));
    }

    protected void appliquerCouleurFondTransparent() {
        this.ad.mo3802b(3, C1034d.m7495u());
    }

    protected void appliquerTransparent() {
        this.ad.mo3802b(2, C1034d.m7495u());
    }

    protected int calculerIndiceAjoutItem(bc bcVar) {
        int i = 0;
        int _getOccurrence = _getOccurrence();
        if (this.id) {
            while (i < _getOccurrence) {
                try {
                    if (bcVar.m8259a(false).compareToIgnoreCase(((bc) this.cd.getItem(i)).toString()) <= 0) {
                        return i;
                    }
                    i++;
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return _getOccurrence;
    }

    protected int calculerIndiceInsertionItem() {
        int _getOccurrence = _getOccurrence();
        if (isMultiselection()) {
            return _getOccurrence;
        }
        int indiceElementCourant = getIndiceElementCourant();
        return indiceElementCourant != -1 ? indiceElementCourant - 1 : _getOccurrence;
    }

    public int chercherElement(String str, boolean z, int i) {
        boolean z2 = false;
        try {
            if (this.Zc != null) {
                if (this.Zc.mo3616b() != C0715d.MEMORY) {
                    z2 = true;
                }
                try {
                    if (isCombo() && getClass().getSuperclass().getSimpleName().equals(kd[5])) {
                        z2 = true;
                    }
                } catch (WDException e) {
                    throw e;
                }
            } else if (getGLienActive()) {
                z2 = true;
            }
            try {
                return !isIndiceValide(i) ? -1 : m8651a(str, z, C0725i.m3011a(i), z2);
            } catch (WDException e2) {
                throw e2;
            }
        } catch (WDException e22) {
            throw e22;
        } catch (WDException e222) {
            throw e222;
        }
    }

    public gc cloneChampForZR(boolean z, boolean z2) {
        kc kcVar = (kc) super.cloneChampForZR(z, z2);
        if (kcVar != null) {
            try {
                kcVar.dd.setAdapter(this.dd.getAdapter());
                kcVar.cd = this.cd;
            } catch (WDException e) {
                throw e;
            }
        }
        return kcVar;
    }

    protected int convertirIndiceModeleVersVue(int i) {
        try {
            return this.Zc != null ? this.Zc.mo3616b() == C0715d.DIRECT_ACCESS ? i + getFirstVisibleElement() : i : i;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    protected int convertirIndiceVueVersModele(int i) {
        try {
            return this.Zc != null ? this.Zc.mo3616b() == C0715d.DIRECT_ACCESS ? i - getFirstVisibleElement() : i : i;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public jb createBindingItem() {
        String str = null;
        try {
            if (this.Zc == null) {
                return null;
            }
            if (this.Zc instanceof C1320c) {
                C0849z q = ((C1320c) this.Zc).mo3649q();
                try {
                    return new cc(this, q != null ? ((WDObjet) q).getString() : "", (C1320c) this.Zc);
                } catch (WDException e) {
                    throw e;
                }
            } else if (!(this.Zc instanceof C1319a)) {
                return null;
            } else {
                WDObjet a = this.Zc.mo3607a(this.bd);
                try {
                    WDObjet a2 = this.Xc != null ? this.Zc.mo3607a(this.Xc) : null;
                    try {
                        String string = a.getString();
                        if (a2 != null) {
                            str = a2.getString();
                        }
                        return new bc(this, string, str);
                    } catch (WDException e2) {
                        throw e2;
                    }
                } catch (WDException e22) {
                    throw e22;
                }
            }
        } catch (WDException e222) {
            throw e222;
        }
    }

    protected abstract AdapterView creerComposantPrincipal();

    protected bc creerItem(String str) {
        String[] valeurGLien = valeurGLien(str);
        return new bc(this, valeurGLien[1], valeurGLien[0]);
    }

    protected ArrayAdapter<bc> creerModele() {
        try {
            return new C1144d(this, C1056i.m7562a(), isCombo() ? 17367048 : 0);
        } catch (WDException e) {
            throw e;
        }
    }

    protected abstract C1145e creerRenderer(Context context);

    public void deplacerLigne(int i, int i2, boolean z) {
        int[] e = this.Vc.mo3493e();
        bc bcVar = (bc) this.cd.getItem(i);
        if (i < i2) {
            try {
                _insererItem(bcVar, i2 + 1);
                supprimerElementA(i + 1, false);
            } catch (WDException e2) {
                throw e2;
            }
        }
        supprimerElementA(i + 1, false);
        _insererItem(bcVar, i2);
        int length = e.length;
        int i3 = 0;
        while (i3 < length) {
            try {
                if (e[i3] == i) {
                    this.Vc.mo3487b(i2, i2);
                    if (z) {
                        try {
                            if (!isCombo()) {
                                setFirstVisibleElement(i2);
                            }
                        } catch (WDException e22) {
                            throw e22;
                        }
                    }
                    continue;
                }
                i3++;
            } catch (WDException e222) {
                throw e222;
            } catch (WDException e2222) {
                throw e2222;
            }
        }
    }

    public void echangerLigne(int i, int i2, boolean z) {
        int[] e = this.Vc.mo3493e();
        bc bcVar = (bc) this.cd.getItem(i2);
        this.cd.insert((bc) this.cd.getItem(i), i);
        this.cd.remove(this.cd.getItem(i + 1));
        this.cd.insert(bcVar, i2);
        this.cd.remove(this.cd.getItem(i2 + 1));
        int length = e.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = e[i3] == i ? i2 : e[i3] == i2 ? i : e[i3];
            try {
                this.Vc.mo3487b(i4, i4);
                if (z) {
                    if (!isCombo()) {
                        setFirstVisibleElement(i4);
                    }
                }
                i3++;
            } catch (WDException e2) {
                throw e2;
            } catch (WDException e22) {
                throw e22;
            }
        }
    }

    public WDObjet get(int i) {
        C1320c c1320c = (C1320c) getBindingManager(C1320c.class);
        if (c1320c != null) {
            try {
                if (c1320c.mo3616b() == C0715d.MEMORY) {
                    if (i > getItemCount()) {
                        c1320c.mo3627g();
                    }
                }
                return (bc) c1320c.mo3608a(C0725i.m3011a(i));
            } catch (WDException e) {
                throw e;
            } catch (WDException e2) {
                throw e2;
            }
        }
        try {
            if (isVide()) {
                WDErreurManager.m2883a(C0745b.m3222b(kd[2], new String[0]) + "\n" + C0745b.m3222b(kd[4], getName(), String.valueOf(i)));
            }
            if (isIndiceValide(i)) {
                bc bcVar = (bc) this.cd.getItem(i - 1);
                bcVar.mo3393a(i - 1, false);
                return bcVar;
            }
            WDErreurManager.m2883a(C0745b.m3222b(kd[3], String.valueOf(i), getName(), "1", String.valueOf(_getOccurrence())));
            return null;
        } catch (WDException e22) {
            throw e22;
        }
    }

    public WDEntier4 getCadrageHorizontal() {
        return new WDEntier4(this.hd);
    }

    public View getCompPrincipal() {
        return this.dd;
    }

    public WDObjet getContenu() {
        StringBuffer stringBuffer = new StringBuffer();
        int count = this.cd.getCount();
        for (int i = 0; i < count; i++) {
            if (i > 0) {
                try {
                    stringBuffer.append(kd[6]);
                } catch (WDException e) {
                    throw e;
                }
            }
            stringBuffer.append(((bc) this.cd.getItem(i)).getString());
        }
        return new WDChaine(stringBuffer.toString());
    }

    public WDChaine getContenuInitial() {
        try {
            return this.jd != null ? new WDChaine(this.jd.toString()) : new WDChaine();
        } catch (WDException e) {
            throw e;
        }
    }

    public int getElementHeight() {
        return _getHauteurLigne();
    }

    public int getFirstVisibleElement() {
        return this.dd.getFirstVisiblePosition();
    }

    public WDEntier4 getHauteurLigne() {
        return new WDEntier4((double) C1511l.m10515a((float) _getHauteurLigne(), 1, getDisplayUnit()));
    }

    public jb getItemAt(int i) {
        if (i < 0) {
            return null;
        }
        try {
            return i < getItemCount() ? (bc) this.cd.getItem(i) : null;
        } catch (WDException e) {
            throw e;
        }
    }

    public int getItemCount() {
        try {
            if (this.Zc != null) {
                if (this.Zc.mo3616b() == C0715d.DIRECT_ACCESS) {
                    return ((C1144d) this.dd.getAdapter()).m8318a();
                }
            }
            return this.cd.getCount();
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public int getLastVisibleElement() {
        return this.dd.getLastVisiblePosition();
    }

    public int getMaxItemCountPerRow() {
        return 1;
    }

    public int getMaxVisibleRowCount() {
        int childCount = this.dd.getChildCount();
        if (childCount > 0) {
            try {
                if (this.dd.getFirstVisiblePosition() != 0) {
                    return (int) Math.ceil(((double) childCount) / ((double) getMaxItemCountPerRow()));
                }
            } catch (WDException e) {
                throw e;
            }
        }
        return (int) Math.ceil(((double) _getHauteur()) / ((double) getElementHeight()));
    }

    public int getNbElement() {
        return _getOccurrence();
    }

    public int getNbLigneAffichee() {
        return (getLastVisibleElement() - getFirstVisibleElement()) + 1;
    }

    public int getNbLigneVisible(boolean z) {
        return getNbLigneAffichee();
    }

    protected int getNbTotalElement() {
        return _getOccurrence();
    }

    public WDEntier4 getOccurrence() {
        return new WDEntier4(_getOccurrence());
    }

    public WDBooleen getPoliceBarree() {
        return new WDBooleen(m8654a(8));
    }

    public WDBooleen getPoliceGras() {
        return new WDBooleen(m8654a(1));
    }

    public WDBooleen getPoliceItalique() {
        return new WDBooleen(m8654a(2));
    }

    public WDBooleen getPoliceSoulignee() {
        return new WDBooleen(m8654a(4));
    }

    public WDEntier4 getPoliceTaille() {
        if (this.ad != null) {
            C1399b c1399b = (C1399b) this.ad.mo3797a(4);
            if (c1399b != null) {
                try {
                    return new WDEntier4(C1400d.m9964a((float) c1399b.mo3760a(), (gc) this));
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return new WDEntier4();
    }

    public EWDPropriete getProprietePourAttributAuto() {
        return EWDPropriete.PROP_VALEUR;
    }

    public WDChaine getRubriqueAffichee() {
        try {
            if (!(this.Zc instanceof C1319a)) {
                return super.getRubriqueAffichee();
            }
            return new WDChaine(this.bd != null ? this.bd.mo2604d() : "");
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public WDBooleen getTriee() {
        return new WDBooleen(this.id);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fr.pcsoft.wdjava.core.WDObjet getValeur() {
        /*
        r3 = this;
        r2 = -1;
        r0 = r3.Zc;	 Catch:{ WDException -> 0x002c }
        if (r0 == 0) goto L_0x0038;
    L_0x0005:
        r0 = r3.Zc;	 Catch:{ WDException -> 0x002e }
        r0 = r0.mo3628h();	 Catch:{ WDException -> 0x002e }
        if (r0 == 0) goto L_0x0038;
    L_0x000d:
        r0 = r3.isValeurEnAjustement();	 Catch:{ WDException -> 0x002e }
        if (r0 != 0) goto L_0x0038;
    L_0x0013:
        r0 = r3.getIndiceElementCourant();
        if (r0 <= 0) goto L_0x0032;
    L_0x0019:
        r1 = r3.Zc;
        r0 = fr.pcsoft.wdjava.core.C0725i.m3011a(r0);
        r0 = r1.mo3608a(r0);
        r0 = (fr.pcsoft.wdjava.core.WDObjet) r0;
        if (r0 == 0) goto L_0x0032;
    L_0x0027:
        r0 = r0.getValeurMemorisee();	 Catch:{ WDException -> 0x0030 }
    L_0x002b:
        return r0;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;
    L_0x0030:
        r0 = move-exception;
        throw r0;
    L_0x0032:
        r0 = new fr.pcsoft.wdjava.core.types.WDChaine;
        r0.<init>();
        goto L_0x002b;
    L_0x0038:
        r1 = r3.getIndiceElementCourant();
        if (r1 == r2) goto L_0x0073;
    L_0x003e:
        r0 = r3.Gc;	 Catch:{ WDException -> 0x0065 }
        if (r0 != 0) goto L_0x0056;
    L_0x0042:
        r0 = r3.N;	 Catch:{ WDException -> 0x0067 }
        r0 = r0 & 8;
        r2 = 8;
        if (r0 != r2) goto L_0x006d;
    L_0x004a:
        r0 = r3.wc;	 Catch:{ WDException -> 0x0069 }
        if (r0 == 0) goto L_0x006d;
    L_0x004e:
        r0 = r3.wc;	 Catch:{ WDException -> 0x006b }
        r0 = (fr.pcsoft.wdjava.ui.champs.kc) r0;	 Catch:{ WDException -> 0x006b }
        r0 = r0.Dc;	 Catch:{ WDException -> 0x006b }
        if (r0 == 0) goto L_0x006d;
    L_0x0056:
        r0 = r3.cd;	 Catch:{ WDException -> 0x006b }
        r1 = r1 + -1;
        r0 = r0.getItem(r1);	 Catch:{ WDException -> 0x006b }
        r0 = (fr.pcsoft.wdjava.ui.champs.bc) r0;	 Catch:{ WDException -> 0x006b }
        r0 = r0.getValeur();	 Catch:{ WDException -> 0x006b }
        goto L_0x002b;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;
    L_0x006d:
        r0 = new fr.pcsoft.wdjava.core.types.WDEntier4;
        r0.<init>(r1);
        goto L_0x002b;
    L_0x0073:
        r0 = new fr.pcsoft.wdjava.core.types.WDEntier4;
        r0.<init>(r2);
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.kc.getValeur():fr.pcsoft.wdjava.core.WDObjet");
    }

    public cb getValeurAffichee() {
        int indiceElementCourant;
        if (this.Zc != null) {
            indiceElementCourant = getIndiceElementCourant();
            if (indiceElementCourant > 0) {
                WDObjet wDObjet = (WDObjet) this.Zc.mo3608a(C0725i.m3011a(indiceElementCourant));
                if (wDObjet != null) {
                    try {
                        return wDObjet.getValeurAffichee();
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
            return new WDChaine();
        }
        indiceElementCourant = getIndiceElementCourant();
        if (indiceElementCourant != -1) {
            return ((bc) this.cd.getItem(indiceElementCourant - 1)).getValeurAffichee();
        }
        try {
            return new WDChaine("");
        } catch (WDException e2) {
            throw e2;
        }
    }

    public WDObjet getValeurInitiale() {
        return new WDEntier4(this.fd);
    }

    public WDObjet getValeurMemorisee() {
        int indiceElementCourant;
        if (this.Zc != null) {
            indiceElementCourant = getIndiceElementCourant();
            if (indiceElementCourant > 0) {
                WDObjet wDObjet = (WDObjet) this.Zc.mo3608a(C0725i.m3011a(indiceElementCourant));
                if (wDObjet != null) {
                    try {
                        return wDObjet.getValeurMemorisee();
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
            return new WDChaine();
        }
        indiceElementCourant = getIndiceElementCourant();
        if (indiceElementCourant != -1) {
            return ((bc) this.cd.getItem(indiceElementCourant - 1)).getValeurMemorisee();
        }
        try {
            return new WDChaine("");
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void initLiaisonsBinding() {
        try {
            super.initLiaisonsBinding();
            if (this.bd != null) {
                this.bd.m2970e();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean insererElement(String str) {
        return _insererItem(creerItem(str), calculerIndiceInsertionItem());
    }

    public boolean insererElement(String str, int i) {
        return _insererItem(creerItem(str), i - 1);
    }

    public void invalidateDrawCache() {
    }

    public boolean isChampEditableDansZR() {
        return true;
    }

    public boolean isChampFocusable() {
        return true;
    }

    public boolean isChangeSourcePositionOnSelection() {
        return false;
    }

    public boolean isSauverValeurEnFinEditionZR() {
        return true;
    }

    protected boolean isScrollerHorizontalVisible() {
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isSelectionSurValeurMemorisee() {
        /*
        r1 = this;
        r0 = super.isSelectionSurValeurMemorisee();	 Catch:{ WDException -> 0x0014 }
        if (r0 != 0) goto L_0x0012;
    L_0x0006:
        r0 = r1.Zc;	 Catch:{ WDException -> 0x0016 }
        if (r0 == 0) goto L_0x001a;
    L_0x000a:
        r0 = r1.Zc;	 Catch:{ WDException -> 0x0018 }
        r0 = r0.mo3628h();	 Catch:{ WDException -> 0x0018 }
        if (r0 == 0) goto L_0x001a;
    L_0x0012:
        r0 = 1;
    L_0x0013:
        return r0;
    L_0x0014:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0016 }
    L_0x0016:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0018 }
    L_0x0018:
        r0 = move-exception;
        throw r0;
    L_0x001a:
        r0 = 0;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.kc.isSelectionSurValeurMemorisee():boolean");
    }

    public void listeAffiche(int i) {
        try {
            if (this.Zc != null) {
                this.Zc.mo3617b(C0725i.m3011a(i));
            } else {
                super.listeAffiche(i);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void listeAffiche(String str) {
        try {
            if (this.Zc != null) {
                this.Zc.mo3612a(str);
            } else {
                super.listeAffiche(str);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void modifierElement(String str) {
        int indiceElementCourant = getIndiceElementCourant();
        if (indiceElementCourant != -1) {
            try {
                _modifierItem(indiceElementCourant - 1, str);
            } catch (WDException e) {
                throw e;
            }
        }
    }

    public void modifierElement(String str, int i) throws WDException {
        if (i == -1) {
            try {
                modifierElement(str);
                return;
            } catch (WDException e) {
                throw e;
            }
        }
        _modifierItem(i - 1, str);
    }

    public void notifModificationModele(int i, int i2) {
        try {
            if (this.cd != null) {
                this.cd.notifyDataSetChanged();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void notifyDataSetChanged() {
        this.cd.notifyDataSetChanged();
    }

    public void onItemClick(int i) {
        gc cloneForEdition = getCloneForEdition();
        if (cloneForEdition != null) {
            try {
                ((kc) cloneForEdition).onItemClick(i);
                return;
            } catch (WDException e) {
                throw e;
            }
        }
        super.onItemClick(i);
    }

    protected void positionnerSurIndice(int i) {
        setSelectionParProgrammation(true);
        try {
            if (isIndiceValide(C0725i.m3069e(i))) {
                setFirstVisibleElement(i);
                this.Vc.mo3489c(i, i);
            } else {
                int i2 = this.Yc;
                try {
                    this.Vc.mo3486b();
                    if (isCombo() && i <= 0) {
                        try {
                            if (WDAppelContexte.getContexte().m2726l() != null && i2 >= 0) {
                                WDErreurManager.m2883a(C0745b.m3222b(kd[8], new String[0]));
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
            setSelectionParProgrammation(false);
        } catch (WDException e222) {
            throw e222;
        } catch (Throwable th) {
            setSelectionParProgrammation(false);
        }
    }

    protected void postInit() {
        try {
            super.postInit();
            if (this.Zc != null) {
                try {
                    this.Zc.mo3629i();
                } catch (WDException e) {
                    WDException wDException = e;
                    String str = "";
                    if (wDException.getSystemMessage() != null) {
                        str = wDException.getSystemMessage();
                    }
                    String[] strArr = new String[2];
                    strArr[0] = C0745b.m3222b(kd[0], getName(), wDException.getMessage());
                    strArr[1] = str;
                    WDErreurManager.m2886a(strArr);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    public void raz(boolean z) {
        int i = 0;
        if (z) {
            try {
                if (isMemoire()) {
                    this.cd.clear();
                    if (this.jd != null) {
                        _setContenu(this.jd);
                    }
                }
            } catch (WDException e) {
                throw e;
            } catch (WDException e2) {
                throw e2;
            }
        }
        if (!isMemoire()) {
            int i2 = -1;
            try {
                if (this.fd <= 0) {
                    try {
                        if (this.fd == 0 && _getOccurrence() > 0) {
                            i2 = 0;
                        }
                    } catch (WDException e22) {
                        throw e22;
                    }
                } else if (this.fd <= _getOccurrence()) {
                    i2 = this.fd - 1;
                }
                if (i2 >= 0) {
                    this.Ic = true;
                    try {
                        getPosition(i2 + 1);
                        ajouterSelection(new int[]{i2 + 1});
                    } catch (Exception e3) {
                        C0691a.m2863b(kd[1], e3);
                    } finally {
                        this.Ic = false;
                    }
                }
            } catch (WDException e222) {
                throw e222;
            }
        } else if (!z) {
            if (this.fd != 0) {
                i = this.fd - 1;
            }
            positionnerSurIndice(i);
        }
    }

    public void release() {
        try {
            super.release();
            if (this.dd != null) {
                if (this.dd instanceof C1299d) {
                    ((C1299d) this.dd).m9159b();
                }
            }
            try {
                this.dd = null;
                this.cd = null;
                this.jd = null;
                if (this.ad != null) {
                    this.ad.mo3804a();
                    this.ad = null;
                }
                try {
                    this.gd = null;
                    if (this.bd != null) {
                        this.bd.mo2601b();
                        this.bd = null;
                    }
                } catch (WDException e) {
                    throw e;
                }
            } catch (WDException e2) {
                throw e2;
            }
        } catch (WDException e22) {
            throw e22;
        } catch (WDException e222) {
            throw e222;
        }
    }

    public void removeAllBindingItem() {
        supprimerTout();
    }

    public void removeBindingItemAt(int i) {
        boolean z = this.Wc;
        this.Wc = true;
        try {
            ((bc) getItemAt(i)).mo3393a(-1, false);
            this.cd.remove(this.cd.getItem(i));
        } finally {
            this.Wc = z;
        }
    }

    public boolean restaurerValeur() {
        try {
            if (this.Zc != null) {
                if (!this.e) {
                    try {
                        if (getItemCount() > 0) {
                            positionnerSurIndice(0);
                            return false;
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
            return super.restaurerValeur();
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    public void setCadrageHorizontal(int i) {
        this.hd = i;
        repeindreChamp();
    }

    public void setContenu(WDObjet wDObjet) {
        _setContenu(wDObjet.getString());
    }

    public void setContenuInitial(String str) {
        try {
            this.jd = str;
            if (isFenetreCree()) {
                _setContenu(str);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void setFirstVisibleElement(int i) {
        this.dd.setSelection(i);
    }

    public void setHauteurLigne(int i) {
        if (i >= 1) {
            this.ad.mo3802b(10, new Integer(C1511l.m10532d((float) i, getDisplayUnit())));
            repeindreChamp();
        }
    }

    public void setItemStoredValue(int i, WDObjet wDObjet) {
        bc bcVar = (bc) getItemAt(i);
        if (bcVar != null) {
            try {
                bcVar.setValeurMemorisee(wDObjet.getString());
            } catch (WDException e) {
                throw e;
            }
        }
    }

    protected void setModeAscenseur(int i, int i2) {
    }

    protected void setPersistant(boolean z) {
        this.e = z;
    }

    public void setPoliceBarree(boolean z) {
        m8652a(8, z);
    }

    public void setPoliceGras(boolean z) {
        m8652a(1, z);
    }

    public void setPoliceItalique(boolean z) {
        m8652a(2, z);
    }

    public void setPoliceSoulignee(boolean z) {
        m8652a(4, z);
    }

    public void setPoliceTaille(int i) {
        if (this.ad != null) {
            C1399b c1399b = (C1399b) this.ad.mo3797a(4);
            if (c1399b != null) {
                try {
                    this.ad.mo3802b(4, c1399b.m9950a(C1400d.m9963a(i, (gc) this)));
                    repeindreChamp();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
    }

    public void setRubriqueAffichee(String str) {
        try {
            if (this.Zc instanceof C1319a) {
                if (this.bd != null) {
                    this.bd.mo2601b();
                    this.bd = null;
                }
                try {
                    if (C0808l.m4053k(str)) {
                        this.bd = new C0713b(str);
                        this.bd.m2970e();
                        return;
                    }
                    return;
                } catch (WDException e) {
                    throw e;
                }
            }
            super.setRubriqueAffichee(str);
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    protected final void setSourceRemplissage(String str, String str2, String str3) {
        try {
            super.setSourceRemplissage(str, str3);
            if (!C0808l.m4053k(str2)) {
                this.bd = new C0713b(str2);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected void setStyleElement(int i, int i2, C1399b c1399b, int i3) {
        try {
            if (isChangementAgencementEnCours()) {
                this.ad.mo3802b(4, c1399b);
                repeindreChamp();
                return;
            }
            setCouleur(i);
            setCouleurFond(i2);
            setHauteurLigne(i3);
            this.ad.mo3802b(4, c1399b);
        } catch (WDException e) {
            throw e;
        }
    }

    public void setTriee(boolean z) {
        try {
            if (this.Zc == null) {
                try {
                    this.id = z;
                    if (z && !isVide()) {
                        setSelectionParProgrammation(true);
                        try {
                            m8655c();
                        } finally {
                            setSelectionParProgrammation(false);
                        }
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        try {
            int i;
            if (this.Zc == null || this.Zc.mo3616b() != C0715d.DIRECT_ACCESS) {
                i = wDObjet.getInt();
                if (isSelectionSurValeurMemorisee()) {
                    i = m8651a(wDObjet.getString(), true, 0, true);
                    if (i < 0) {
                        try {
                            if (isCombo()) {
                                return;
                            }
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                }
                try {
                    if (isCombo()) {
                        if (isVide()) {
                            setValeurInterne(-1);
                            return;
                        }
                        i = Math.min(i, this.dd.getCount());
                    }
                } catch (WDException e2) {
                    throw e2;
                } catch (WDException e22) {
                    throw e22;
                }
                i = C0725i.m3011a(i);
                try {
                    if (this.Zc != null) {
                        if (this.Zc.mo3616b() == C0715d.MEMORY) {
                            try {
                                if (i >= getItemCount()) {
                                    this.Zc.mo3627g();
                                }
                            } catch (WDException e222) {
                                throw e222;
                            }
                        }
                    }
                    positionnerSurIndice(i);
                } catch (WDException e2222) {
                    throw e2222;
                } catch (WDException e22222) {
                    throw e22222;
                }
            } else {
                this.Ic = true;
                try {
                    if (this.Zc.mo3628h()) {
                        this.Zc.mo3615a(wDObjet);
                    } else {
                        i = C0725i.m3011a(wDObjet.getInt());
                        this.Zc.mo3611a(i, true, false);
                        if (i >= 0) {
                            if (i < getNbElement()) {
                                setValeurInterne(i);
                            }
                        }
                        setValeurInterne(-1);
                    }
                    this.Ic = false;
                } catch (WDException e222222) {
                    throw e222222;
                } catch (WDException e2222222) {
                    throw e2222222;
                } catch (Throwable th) {
                    this.Ic = false;
                }
            }
        } catch (WDException e22222222) {
            throw e22222222;
        }
    }

    public void setValeurInitiale(int i) {
        this.fd = i;
    }

    public void setValeurInitiale(WDObjet wDObjet) {
        setValeurInitiale(wDObjet.getInt());
    }

    public void supprimerElementA(int i, boolean z) throws WDException {
        try {
            if (isIndiceValide(i)) {
                int a = C0725i.m3011a(i);
                this.cd.remove(this.cd.getItem(a));
                majSelectionApresSuppression(convertirIndiceModeleVersVue(a));
            } else if (isVide()) {
                WDErreurManager.m2883a(C0745b.m3222b(kd[2], new String[0]) + "\n" + C0745b.m3222b(kd[4], getName(), String.valueOf(i)));
            } else {
                WDErreurManager.m2883a(C0745b.m3222b(kd[3], String.valueOf(i), getName(), "1", String.valueOf(_getOccurrence())));
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void supprimerTout() {
        this.cd.clear();
        this.Vc.mo3486b();
    }

    public void terminerInitialisation() {
        try {
            super.terminerInitialisation();
            if (!C0808l.m4053k(this.jd)) {
                _setContenu(this.jd);
            }
        } catch (WDException e) {
            throw e;
        }
    }
}
