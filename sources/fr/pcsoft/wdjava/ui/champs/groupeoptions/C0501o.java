package fr.pcsoft.wdjava.ui.champs.groupeoptions;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.TextView;
import fr.pcsoft.wdjava.api.WDAPIGroupeOption;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0723g;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.cadre.C1110m;
import fr.pcsoft.wdjava.ui.champs.C1151p;
import fr.pcsoft.wdjava.ui.champs.hc;
import fr.pcsoft.wdjava.ui.champs.ib;
import fr.pcsoft.wdjava.ui.champs.table.colonne.C1278a;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p064a.C1035e;
import fr.pcsoft.wdjava.ui.p065b.C1093d;
import fr.pcsoft.wdjava.ui.p069g.C1409j;
import fr.pcsoft.wdjava.ui.p069g.C1410k;
import fr.pcsoft.wdjava.ui.p081j.C1437c;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import fr.pcsoft.wdjava.ui.utils.C1521w;
import java.lang.reflect.Constructor;

@C0723g(a = {WDAPIGroupeOption.class})
/* renamed from: fr.pcsoft.wdjava.ui.champs.groupeoptions.o */
public abstract class C0501o extends hc {
    protected static final int Dc = 256;
    private static final int Rc = C1511l.f4635i;
    private static final String[] Uc = new String[]{C0501o.m1348z(C0501o.m1349z("?n>\u00079Ij \u001d=Pq;\u000e#_p>\u0006,")), C0501o.m1348z(C0501o.m1349z("?}-\u0019#Om/\u001b.Yk,\u00023Rg0\u001b(Uw1")), C0501o.m1348z(C0501o.m1349z("?q1\u000f5_} \u00022Jy3\u00028Y")), C0501o.m1348z(C0501o.m1349z("?n>\u00079Ij \u001d=Pq;\u000e#_p>\u0006,C\n"))};
    protected boolean Cc;
    private boolean Ec;
    private String Fc;
    private boolean Gc;
    protected OnFocusChangeListener Hc;
    private int Ic;
    protected int Jc;
    private boolean Kc;
    private boolean Lc;
    protected C1409j Mc;
    protected boolean Nc;
    protected C1409j Oc;
    protected C0500n[] Pc;
    protected C1110m Qc;
    protected ViewGroup Sc;
    private boolean Tc;

    public C0501o() {
        this.Pc = new C0500n[256];
        this.Sc = null;
        this.Ic = 1;
        this.Gc = false;
        this.Ec = false;
        this.Kc = false;
        this.Fc = "";
        this.Jc = 0;
        this.Cc = false;
        this.Nc = false;
        this.Hc = null;
        this.Qc = null;
        this.Oc = null;
        this.Mc = null;
        this.Lc = false;
        this.Tc = false;
        m1347f();
    }

    public C0501o(C1278a c1278a) {
        super(c1278a);
        this.Pc = new C0500n[256];
        this.Sc = null;
        this.Ic = 1;
        this.Gc = false;
        this.Ec = false;
        this.Kc = false;
        this.Fc = "";
        this.Jc = 0;
        this.Cc = false;
        this.Nc = false;
        this.Hc = null;
        this.Qc = null;
        this.Oc = null;
        this.Mc = null;
        this.Lc = false;
        this.Tc = false;
        m1347f();
    }

    /* renamed from: a */
    private int m1344a(int i, int i2) {
        return (int) Math.ceil(((double) i) / ((double) i2));
    }

    /* renamed from: a */
    private void m1345a(int i) {
        try {
            Object obj;
            int i2;
            Drawable a;
            if (!C0808l.m4053k(this.Fc)) {
                if (!C1437c.m10098a(this.Fc, getFenetreMere())) {
                    obj = null;
                    i2 = 0;
                    while (i2 < this.Jc) {
                        try {
                            if (i != -1 || i2 == i) {
                                if (obj != null) {
                                    try {
                                        a = C0808l.m4053k(this.Fc) ? C1093d.m7924a(this.Fc) : null;
                                    } catch (WDException e) {
                                        throw e;
                                    }
                                }
                                a = null;
                                this.Tc = a == null;
                                this.Pc[i2].m1335a(a);
                            }
                            i2++;
                        } catch (WDException e2) {
                            throw e2;
                        } catch (WDException e22) {
                            throw e22;
                        }
                    }
                }
            }
            obj = 1;
            i2 = 0;
            while (i2 < this.Jc) {
                if (i != -1) {
                }
                if (obj != null) {
                    a = null;
                } else {
                    if (C0808l.m4053k(this.Fc)) {
                    }
                    a = C0808l.m4053k(this.Fc) ? C1093d.m7924a(this.Fc) : null;
                }
                if (a == null) {
                }
                this.Tc = a == null;
                this.Pc[i2].m1335a(a);
                i2++;
            }
        } catch (WDException e222) {
            throw e222;
        } catch (WDException e2222) {
            throw e2222;
        }
    }

    /* renamed from: e */
    private boolean m1346e() {
        int i = 0;
        while (i < this.Jc) {
            View composant = this.Pc[i].getComposant();
            try {
                if (!this.Pc[i].isSelectionnee()) {
                    if (!this.Pc[i].isCaseACocher()) {
                        continue;
                        i++;
                    }
                }
                try {
                    if (composant.isEnabled()) {
                        try {
                            if (composant.isFocusable()) {
                                C1503b.m10450d(composant);
                                return true;
                            }
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                    continue;
                    i++;
                } catch (WDException e2) {
                    throw e2;
                }
            } catch (WDException e22) {
                throw e22;
            } catch (WDException e222) {
                throw e222;
            }
        }
        return false;
    }

    /* renamed from: f */
    private final void m1347f() {
        try {
            this.Sc = creerConteneur();
            this.Sc.setOnFocusChangeListener(new C1202k(this));
            if (this.Zb == null) {
                ((ViewGroup) getCompConteneur()).addView(this.Sc);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: z */
    private static String m1348z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 28;
                    break;
                case 1:
                    i2 = 56;
                    break;
                case 2:
                    i2 = C0607n.bx;
                    break;
                case 3:
                    i2 = 75;
                    break;
                default:
                    i2 = C0607n.Hn;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1349z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.Hn);
        }
        return toCharArray;
    }

    public final int _getOccurrence() {
        return this.Jc;
    }

    public final int addOptionDynamically(String str) {
        return insertOptionDynamically(str, this.Jc);
    }

    public boolean ajouterOption(C0500n c0500n) {
        try {
            return insertOption(c0500n, this.Jc) >= 0;
        } catch (WDException e) {
            throw e;
        }
    }

    protected void appliquerCadreInterne(C1110m c1110m) {
        this.Qc = c1110m;
    }

    protected void appliquerCouleur(int i) {
        if (this.Jc > 0) {
            int i2 = 0;
            while (i2 < this.Jc) {
                try {
                    this.Pc[i2].setCouleur(i);
                    i2++;
                } catch (WDException e) {
                    throw e;
                }
            }
        }
    }

    protected void appliquerCouleurLibelleInverseEnSelection() {
        for (int i = 0; i < this.Jc; i++) {
            TextView composant = this.Pc[i].getComposant();
            composant.setTextColor(C1035e.m7509a(composant));
        }
    }

    protected void appliquerTransparent() {
    }

    /* renamed from: b */
    final C1409j m1350b() {
        return this.Oc;
    }

    /* renamed from: c */
    final C1409j m1351c() {
        return this.Mc;
    }

    protected abstract ViewGroup creerConteneur();

    /* renamed from: d */
    final boolean m1352d() {
        try {
            if (this.Oc == null) {
                if (this.Mc == null) {
                    return false;
                }
            }
            return true;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public WDObjet get(int i) {
        if (i > 0) {
            try {
                if (i <= this.Jc) {
                    return this.Pc[i - 1];
                }
            } catch (WDException e) {
                throw e;
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(Uc[3], String.valueOf(i), getName(), "1", String.valueOf(this.Jc)));
        return null;
    }

    public View getCompPrincipal() {
        return this.Sc;
    }

    public OnFocusChangeListener getEcouteurFocusOption() {
        try {
            if (this.Hc == null) {
                this.Hc = new C1201j(this);
            }
            return this.Hc;
        } catch (WDException e) {
            throw e;
        }
    }

    public WDChaine getImage() {
        return new WDChaine(this.Fc);
    }

    public WDEntier4 getNombreColonne() {
        return new WDEntier4(this.Ic);
    }

    public WDEntier4 getNombreOption() {
        return new WDEntier4(_getOccurrence());
    }

    public WDEntier4 getOccurrence() {
        return new WDEntier4(_getOccurrence());
    }

    public EWDPropriete getProprietePourAttributAuto() {
        return EWDPropriete.PROP_VALEUR;
    }

    public boolean hasFocus() {
        return this.Nc;
    }

    protected int insertOption(C0500n c0500n, int i) {
        try {
            if (this.Ic == 256) {
                return -1;
            }
            if (i < 0) {
                i = 0;
            }
            int i2 = i > this.Jc ? this.Jc : i;
            try {
                c0500n.m1336a(this);
                c0500n.setFenetre(getFenetreMere());
                c0500n.initialiserObjet();
                if (this.d == 4) {
                    c0500n.griserOption();
                }
                int i3 = this.Jc;
                while (i3 >= i2 + 1) {
                    try {
                        this.Pc[i3] = this.Pc[i3 - 1];
                        i3--;
                    } catch (WDException e) {
                        throw e;
                    }
                }
                try {
                    this.Pc[i2] = c0500n;
                    this.Jc++;
                    this.cb = C1031a.m7461e(c0500n.getComposant().getTextColors().getDefaultColor());
                    this.Sc.addView(c0500n.getComposant());
                    if (!this.Sc.isLongClickable()) {
                        return i2;
                    }
                    c0500n.getComposant().setOnLongClickListener(this);
                    return i2;
                } catch (WDException e2) {
                    throw e2;
                }
            } catch (WDException e22) {
                throw e22;
            }
        } catch (WDException e222) {
            throw e222;
        }
    }

    public final int insertOptionDynamically(String str, int i) {
        int insertOption;
        try {
            if (this.Pc.length == 0) {
                return -1;
            }
            try {
                Constructor declaredConstructor = this.Pc[0].getClass().getDeclaredConstructor(new Class[]{getClass()});
                declaredConstructor.setAccessible(true);
                C0500n c0500n = (C0500n) declaredConstructor.newInstance(new Object[]{this});
                boolean isFenetreCree = this.l.isFenetreCree();
                try {
                    this.l.setFenetreCree(false);
                    insertOption = insertOption(c0500n, i);
                    if (insertOption >= 0) {
                        try {
                            c0500n.setLibelle(str);
                            m1345a(insertOption);
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    positionnerOptions();
                    return insertOption;
                } finally {
                    insertOption = this.l;
                    insertOption.setFenetreCree(isFenetreCree);
                }
            } catch (Exception e2) {
                return -1;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public boolean isChampEditableDansZR() {
        return true;
    }

    public boolean isChampFocusable() {
        return true;
    }

    public boolean isCocheADroite() {
        return this.Lc;
    }

    public final boolean isHauteurOptionAuto() {
        return this.Kc;
    }

    public final boolean isLibelleMultiligne() {
        return this.Ec;
    }

    public boolean isSauverValeurEnFinEditionZR() {
        return true;
    }

    public final boolean isUseCustomImageForOptions() {
        return this.Tc;
    }

    public void notifPerteFocus() {
        this.Nc = false;
    }

    public void notifPriseFocusOption() {
        this.Nc = true;
    }

    public void positionnerOptions() {
        positionnerOptions(null);
    }

    public void positionnerOptions(int[] iArr) {
        try {
            if (this.Jc > 0) {
                int a = m1344a(this.Jc, this.Ic);
                int i = this.Jc % this.Ic != 0 ? this.Jc % this.Ic : this.Ic;
                int i2 = 0;
                int i3 = 0;
                int[] iArr2 = new int[a];
                int[] iArr3 = new int[this.Ic];
                C1521w[] c1521wArr = new C1521w[this.Jc];
                int i4 = ((ib) this.Sc.getLayoutParams()).width;
                int i5 = 0;
                while (i5 < this.Jc) {
                    C0500n c0500n = this.Pc[i5];
                    C1521w c1521w = new C1521w(0, 0);
                    try {
                        if (this.Gc) {
                            if (this.Ic > 1) {
                                if (iArr != null) {
                                    try {
                                        c1521w.f4666a = Math.min(c0500n.getComposant().getMeasuredWidth(), iArr[i3]);
                                        c0500n.getComposant().measure(c1521w.f4666a + 1073741824, -2);
                                        c1521w.f4666a = c0500n.getComposant().getMeasuredWidth();
                                        c1521w.f4667b = c0500n.getComposant().getMeasuredHeight();
                                    } catch (WDException e) {
                                        throw e;
                                    }
                                }
                                c0500n.getComposant().measure(-2, -2);
                                c1521w.f4666a = c0500n.getComposant().getMeasuredWidth() + 2;
                                c1521w.f4667b = c0500n.getComposant().getMeasuredHeight();
                                c1521wArr[i5] = c1521w;
                                if (i2 == a - 1 && i3 + 1 > i) {
                                    i2 = 0;
                                    i3++;
                                }
                                iArr2[i2] = Math.max(c1521w.f4667b, iArr2[i2]);
                                iArr3[i3] = Math.max(c1521w.f4666a, iArr3[i3]);
                                if (i2 != a - 1) {
                                    i2 = 0;
                                    i3++;
                                } else {
                                    i2++;
                                }
                                i5++;
                            }
                        }
                        c1521w.f4666a = i4 / Math.min(this.Ic, this.Jc);
                        c0500n.getComposant().measure(c1521w.f4666a + 1073741824, -2);
                        c1521w.f4666a = c0500n.getComposant().getMeasuredWidth();
                        c1521w.f4667b = c0500n.getComposant().getMeasuredHeight();
                        try {
                            c1521wArr[i5] = c1521w;
                            i2 = 0;
                            i3++;
                            iArr2[i2] = Math.max(c1521w.f4667b, iArr2[i2]);
                            iArr3[i3] = Math.max(c1521w.f4666a, iArr3[i3]);
                            if (i2 != a - 1) {
                                i2++;
                            } else {
                                i2 = 0;
                                i3++;
                            }
                            i5++;
                        } catch (WDException e2) {
                            throw e2;
                        }
                    } catch (WDException e22) {
                        throw e22;
                    } catch (WDException e222) {
                        throw e222;
                    }
                }
                try {
                    int i6;
                    if (this.Ic > 1) {
                        if (this.Gc && iArr == null) {
                            i3 = 0;
                            for (int i62 : iArr3) {
                                i3 += i62;
                            }
                            if (i3 > i4) {
                                i5 = 0;
                                while (i5 < i2) {
                                    try {
                                        iArr3[i5] = (int) Math.floor((((double) iArr3[i5]) / ((double) i3)) * ((double) i4));
                                        i5++;
                                    } catch (WDException e2222) {
                                        throw e2222;
                                    }
                                }
                                positionnerOptions(iArr3);
                                return;
                            }
                        }
                    }
                    int i7 = ((ib) this.Sc.getLayoutParams()).height;
                    i5 = 0;
                    if (a > 1) {
                        i3 = 0;
                        for (i5 = 0; i5 < a; i5++) {
                            i3 += iArr2[i5];
                        }
                        i5 = ((i7 - (Rc * 2)) - i3) / (a - 1);
                    }
                    i3 = 0;
                    try {
                        int i8;
                        int i9;
                        C0500n c0500n2;
                        C1521w c1521w2;
                        if (this.Ic > 1 && this.Gc) {
                            i2 = 0;
                            for (i3 = 0; i3 < this.Ic; i3++) {
                                i2 += iArr3[i3];
                            }
                            i3 = this.Jc > 1 ? Math.max((i4 - i2) / (Math.min(this.Ic, this.Jc) - 1), 0) : Math.max(i4 - i2, 0);
                        }
                        if (a == 1) {
                            try {
                                if (iArr2[0] + Rc > i7) {
                                    i2 = (i7 - iArr2[0]) / 2;
                                    i8 = 0;
                                    i9 = 0;
                                    i7 = 0;
                                    i62 = i2;
                                    while (i4 < this.Jc) {
                                        c0500n2 = this.Pc[i4];
                                        c1521w2 = c1521wArr[i4];
                                        if (i8 == a - 1 && i9 + 1 > i) {
                                            i7 += iArr3[i9] + i3;
                                            i8 = 0;
                                            i9++;
                                            i62 = i2;
                                        }
                                        try {
                                            if (this.Gc) {
                                                if (this.Ic > 1 && a == 1) {
                                                    try {
                                                        if (i9 < this.Jc - 1) {
                                                            c1521w2.f4666a += i3;
                                                        }
                                                    } catch (WDException e22222) {
                                                        throw e22222;
                                                    }
                                                }
                                            }
                                            try {
                                                if (this.Sc instanceof C1151p) {
                                                    c0500n2.getComposant().layout(i7, i62, c1521w2.f4666a + i7, c1521w2.f4667b + i62);
                                                } else {
                                                    C1503b.m10426a(c0500n2.getComposant(), i7, i62, c1521w2.f4666a, c1521w2.f4667b);
                                                }
                                                if (i8 != a - 1) {
                                                    i7 += iArr3[i9] + i3;
                                                    i8 = 0;
                                                    i9++;
                                                    i62 = i2;
                                                } else {
                                                    i62 += iArr2[i8] + i5;
                                                    i8++;
                                                }
                                            } catch (WDException e222222) {
                                                throw e222222;
                                            }
                                        } catch (WDException e2222222) {
                                            throw e2222222;
                                        } catch (WDException e22222222) {
                                            try {
                                                throw e22222222;
                                            } catch (WDException e222222222) {
                                                throw e222222222;
                                            }
                                        }
                                    }
                                }
                            } catch (WDException e2222222222) {
                                throw e2222222222;
                            }
                        }
                        i2 = Rc;
                        i8 = 0;
                        i9 = 0;
                        i7 = 0;
                        i62 = i2;
                        for (i4 = 0; i4 < this.Jc; i4++) {
                            c0500n2 = this.Pc[i4];
                            c1521w2 = c1521wArr[i4];
                            i7 += iArr3[i9] + i3;
                            i8 = 0;
                            i9++;
                            i62 = i2;
                            if (this.Gc) {
                                if (i9 < this.Jc - 1) {
                                    c1521w2.f4666a += i3;
                                }
                            }
                            if (this.Sc instanceof C1151p) {
                                c0500n2.getComposant().layout(i7, i62, c1521w2.f4666a + i7, c1521w2.f4667b + i62);
                            } else {
                                C1503b.m10426a(c0500n2.getComposant(), i7, i62, c1521w2.f4666a, c1521w2.f4667b);
                            }
                            if (i8 != a - 1) {
                                i62 += iArr2[i8] + i5;
                                i8++;
                            } else {
                                i7 += iArr3[i9] + i3;
                                i8 = 0;
                                i9++;
                                i62 = i2;
                            }
                        }
                    } catch (WDException e22222222222) {
                        throw e22222222222;
                    }
                } catch (WDException e222222222222) {
                    throw e222222222222;
                } catch (WDException e2222222222222) {
                    throw e2222222222222;
                }
            }
        } catch (WDException e22222222222222) {
            throw e22222222222222;
        }
    }

    public void prendreFocus() throws WDException {
        m1346e();
    }

    public void release() {
        super.release();
        if (this.Pc != null) {
            for (int i = 0; i < this.Jc; i++) {
                C0500n c0500n = this.Pc[i];
                if (c0500n != null) {
                    try {
                        c0500n.release();
                        this.Pc[i] = null;
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
            this.Pc = null;
        }
        try {
            this.Sc = null;
            this.Hc = null;
            if (this.Qc != null) {
                this.Qc.mo3386h();
                this.Qc = null;
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void removeOptionDynamically(int r8) {
        /*
        r7 = this;
        r6 = 1;
        if (r8 < 0) goto L_0x0007;
    L_0x0003:
        r0 = r7.Jc;	 Catch:{ WDException -> 0x0088 }
        if (r8 < r0) goto L_0x004b;
    L_0x0007:
        r0 = 2;
        r0 = new java.lang.String[r0];	 Catch:{ WDException -> 0x0088 }
        r1 = 0;
        r2 = Uc;	 Catch:{ WDException -> 0x0088 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ WDException -> 0x0088 }
        r3 = 1;
        r3 = new java.lang.String[r3];	 Catch:{ WDException -> 0x0088 }
        r4 = 0;
        r5 = fr.pcsoft.wdjava.core.C0725i.m3069e(r8);	 Catch:{ WDException -> 0x0088 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ WDException -> 0x0088 }
        r3[r4] = r5;	 Catch:{ WDException -> 0x0088 }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);	 Catch:{ WDException -> 0x0088 }
        r0[r1] = r2;	 Catch:{ WDException -> 0x0088 }
        r1 = 1;
        r2 = Uc;	 Catch:{ WDException -> 0x0088 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ WDException -> 0x0088 }
        r3 = 3;
        r3 = new java.lang.String[r3];	 Catch:{ WDException -> 0x0088 }
        r4 = 0;
        r5 = r7.getName();	 Catch:{ WDException -> 0x0088 }
        r3[r4] = r5;	 Catch:{ WDException -> 0x0088 }
        r4 = 1;
        r5 = "1";
        r3[r4] = r5;	 Catch:{ WDException -> 0x0088 }
        r4 = 2;
        r5 = r7.Jc;	 Catch:{ WDException -> 0x0088 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ WDException -> 0x0088 }
        r3[r4] = r5;	 Catch:{ WDException -> 0x0088 }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);	 Catch:{ WDException -> 0x0088 }
        r0[r1] = r2;	 Catch:{ WDException -> 0x0088 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2886a(r0);	 Catch:{ WDException -> 0x0088 }
    L_0x004b:
        r0 = r7.Jc;	 Catch:{ WDException -> 0x008a }
        if (r0 > r6) goto L_0x0065;
    L_0x004f:
        r0 = Uc;	 Catch:{ WDException -> 0x008a }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ WDException -> 0x008a }
        r1 = 1;
        r1 = new java.lang.String[r1];	 Catch:{ WDException -> 0x008a }
        r2 = 0;
        r3 = r7.getNomType();	 Catch:{ WDException -> 0x008a }
        r1[r2] = r3;	 Catch:{ WDException -> 0x008a }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);	 Catch:{ WDException -> 0x008a }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ WDException -> 0x008a }
    L_0x0065:
        r0 = r7.Pc;
        r0 = r0[r8];
        r1 = r7.Sc;
        r2 = r0.getComposant();
        r1.removeView(r2);
        r0.release();
    L_0x0075:
        r0 = r7.Jc;	 Catch:{ WDException -> 0x008c }
        r0 = r0 + -2;
        if (r8 > r0) goto L_0x008e;
    L_0x007b:
        r0 = r7.Pc;	 Catch:{ WDException -> 0x008c }
        r1 = r7.Pc;	 Catch:{ WDException -> 0x008c }
        r2 = r8 + 1;
        r1 = r1[r2];	 Catch:{ WDException -> 0x008c }
        r0[r8] = r1;	 Catch:{ WDException -> 0x008c }
        r8 = r8 + 1;
        goto L_0x0075;
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r0 = move-exception;
        throw r0;
    L_0x008c:
        r0 = move-exception;
        throw r0;
    L_0x008e:
        r0 = r7.Pc;
        r1 = r7.Jc;
        r1 = r1 + -1;
        r2 = 0;
        r0[r1] = r2;
        r0 = r7.Jc;
        r0 = r0 + -1;
        r7.Jc = r0;
        r7.positionnerOptions();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.groupeoptions.o.removeOptionDynamically(int):void");
    }

    public boolean restaurerValeur() {
        boolean restaurerValeur = super.restaurerValeur();
        if (restaurerValeur) {
            try {
                appelPCode(17);
            } catch (WDException e) {
                throw e;
            }
        }
        return restaurerValeur;
    }

    public void selectionnerOptionSuivante() {
        int i = 0;
        while (i < this.Jc) {
            try {
                if (this.Pc[i].getComposant().isShown() && this.Pc[i].getComposant().isEnabled()) {
                    boolean z = this.Cc;
                    this.Cc = true;
                    try {
                        this.Pc[i].getComposant().setChecked(true);
                        return;
                    } finally {
                        this.Cc = z;
                    }
                } else {
                    i++;
                }
            } catch (WDException e) {
                throw e;
            } catch (WDException e2) {
                throw e2;
            }
        }
    }

    public void setEtat(int i) {
        int i2 = 0;
        super.setEtat(i);
        if (this.d == 4) {
            while (i2 < this.Jc) {
                try {
                    this.Pc[i2].griserOption();
                    i2++;
                } catch (WDException e) {
                    throw e;
                }
            }
            return;
        }
        while (i2 < this.Jc) {
            try {
                this.Pc[i2].degriserOption();
                i2++;
            } catch (WDException e2) {
                throw e2;
            }
        }
    }

    public void setImage(String str) {
        try {
            this.Fc = str;
            if (isFenetreCree()) {
                m1345a(-1);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void setImageCoche(String str, int i) {
        setImage(str);
    }

    public void setLibelle(String str) {
        try {
            if (!isFenetreCree() || str.indexOf(C0607n.Gc) < 0) {
                super.setLibelle(str);
                return;
            }
            String[] a = C0808l.m4028a(str);
            int min = Math.min(a.length, this.Pc.length);
            int i = 0;
            while (i < min) {
                String str2 = a[i];
                try {
                    if (!C0808l.m4053k(str2)) {
                        this.Pc[i].setLibelle(str2);
                    }
                    i++;
                } catch (WDException e) {
                    throw e;
                }
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void setNombreColonne(int i) {
        int i2 = this.Ic;
        try {
            this.Ic = Math.max(1, i);
            if (!isFenetreCree()) {
                return;
            }
            if (this.Ic != i2) {
                positionnerOptions(null);
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    protected void setParamAnimationChamp(int i, int i2, int i3) {
        switch (i) {
            case 18:
                try {
                    if (this.Oc != null) {
                        this.Oc.mo3771b();
                        this.Oc = null;
                    }
                    if (i2 != 0) {
                        try {
                            this.Oc = new C1410k(i2, i3);
                            return;
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                    return;
                } catch (WDException e2) {
                    throw e2;
                }
            case 19:
                try {
                    if (this.Mc != null) {
                        this.Mc.mo3771b();
                        this.Mc = null;
                    }
                    if (i2 != 0 && i3 > 0) {
                        try {
                            this.Mc = new C1410k(i2, i3);
                            return;
                        } catch (WDException e22) {
                            throw e22;
                        }
                    }
                    return;
                } catch (WDException e222) {
                    throw e222;
                }
            default:
                return;
        }
    }

    protected final void setParamOptions(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.Ec = z;
        this.Gc = z2;
        setNombreColonne(i);
        this.Kc = z3;
        this.Lc = z4;
    }

    protected void setPersistant(boolean z) {
        this.e = z;
    }

    public boolean setTailleChamp(int i, int i2, int i3) {
        boolean tailleChamp = super.setTailleChamp(i, i2, i3);
        if (tailleChamp && i > 0 && i2 > 0) {
            try {
                C0938m.m6816c().post(new C1197g(this));
            } catch (WDException e) {
                throw e;
            }
        }
        return tailleChamp;
    }

    public void terminerInitialisation() {
        super.terminerInitialisation();
        m1345a(-1);
    }
}
