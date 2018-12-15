package fr.pcsoft.wdjava.ui.champs.zr;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.cb;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.jb;
import fr.pcsoft.wdjava.ui.champs.table.colonne.C1278a;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p064a.C1034d;
import fr.pcsoft.wdjava.ui.style.C1496b;
import fr.pcsoft.wdjava.ui.style.C1498d;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ec extends C0489p implements jb {
    /* renamed from: e */
    private static final int f3854e = 8;
    /* renamed from: f */
    public static final int f3855f = 4;
    /* renamed from: k */
    public static final int f3856k = 2;
    /* renamed from: o */
    private static final int f3857o = 1;
    /* renamed from: z */
    private static final String[] f3858z = new String[]{m9098z(m9099z("5*\u00182p\u0019d\u0018>3\u0010-\u001d2`\u0013*\\?v\\6\t+g\t6\u0019{z\u00122\u001d7z\u0018!R")), m9098z(m9099z("_\u00074\u001a^,\u001b/\u0014F/\u001b9\u0017V1\u00012\u000f")), m9098z(m9099z("_\b5\u001c]9\u001b&\t")), m9098z(m9099z("_\u0001.\tL>\u00050\u001aJ=\u00039\u0004_5\u00032\u001eL5\n=\u0018G5\u0002"))};
    /* renamed from: d */
    private Map<C1278a, Integer> f3859d = null;
    /* renamed from: g */
    protected lc f3860g;
    /* renamed from: h */
    private int f3861h = -1;
    /* renamed from: i */
    private int f3862i = 0;
    /* renamed from: j */
    private C1296g[] f3863j = null;
    /* renamed from: l */
    private WDObjet[] f3864l = null;
    /* renamed from: m */
    private C1496b f3865m = null;
    /* renamed from: n */
    private int f3866n;

    public ec(lc lcVar, WDObjet[] wDObjetArr) {
        int i = 0;
        this.f3860g = lcVar;
        while (i < wDObjetArr.length) {
            try {
                if (wDObjetArr[i] != null) {
                    wDObjetArr[i] = wDObjetArr[i].getClone();
                }
                i++;
            } catch (WDException e) {
                throw e;
            } catch (WDException e2) {
                throw e2;
            }
        }
        this.f3864l = wDObjetArr;
        m9108b(1, true);
        m9108b(8, this.f3860g.isSwipeEnabled());
    }

    /* renamed from: z */
    private static String m9098z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = C0607n.Hn;
                    break;
                case 1:
                    i2 = 68;
                    break;
                case 2:
                    i2 = C0607n.Hn;
                    break;
                case 3:
                    i2 = 91;
                    break;
                default:
                    i2 = 19;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9099z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 19);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final int m9100a(C1278a c1278a) {
        try {
            if (this.f3859d == null) {
                return 0;
            }
            int intValue;
            Integer num = (Integer) this.f3859d.get(c1278a);
            if (num != null) {
                try {
                    intValue = num.intValue();
                } catch (WDException e) {
                    throw e;
                }
            }
            intValue = 0;
            return intValue;
        } catch (WDException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public void m9101a(int i, WDObjet wDObjet) {
        if (wDObjet != null) {
            wDObjet = wDObjet.getClone();
        }
        if (i >= 0) {
            try {
                if (i < this.f3864l.length) {
                    this.f3864l[i] = wDObjet;
                    if (this.f3860g.isEditingCell(this.f3861h)) {
                    }
                    if (!this.f3860g.isDessinZREnCours()) {
                        this.f3860g.notifModificationModele(this.f3861h, this.f3861h);
                    }
                }
            } catch (WDException e) {
                throw e;
            }
        }
        if (i >= this.f3864l.length) {
            Object obj = new WDObjet[(i + 1)];
            System.arraycopy(this.f3864l, 0, obj, 0, this.f3864l.length);
            this.f3864l = obj;
            this.f3864l[i] = wDObjet;
        }
        try {
            if (this.f3860g.isEditingCell(this.f3861h)) {
                if (!this.f3860g.isDessinZREnCours()) {
                    this.f3860g.notifModificationModele(this.f3861h, this.f3861h);
                }
            }
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    public final void m9102a(int i, C1296g c1296g) {
        int nbLiaisonsRupture = this.f3860g.getNbLiaisonsRupture();
        if (i >= nbLiaisonsRupture) {
            try {
                C0691a.m2856a(f3858z[0]);
                return;
            } catch (WDException e) {
                throw e;
            }
        }
        try {
            if (this.f3863j == null) {
                this.f3863j = new C1296g[nbLiaisonsRupture];
            }
            this.f3863j[i] = c1296g;
        } catch (WDException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public void m9103a(int i, Object obj) {
        try {
            if (this.f3865m == null) {
                this.f3865m = new C1498d();
            }
            this.f3865m.mo3802b(i, obj);
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public void mo3393a(int i, boolean z) {
        if (z && i >= 0) {
            try {
                i = this.f3860g.convertirIndiceModeleVersVue(i);
            } catch (WDException e) {
                throw e;
            }
        }
        this.f3861h = i;
    }

    /* renamed from: a */
    public final void m9105a(C1278a c1278a, int i) {
        try {
            if (this.f3859d == null) {
                this.f3859d = new HashMap();
            }
            this.f3859d.put(c1278a, Integer.valueOf(i));
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: b */
    public int mo3394b() {
        return this.f3861h;
    }

    /* renamed from: b */
    public WDObjet m9107b(int i) {
        if (i >= 0) {
            try {
                if (i < this.f3864l.length) {
                    return this.f3864l[i];
                }
            } catch (WDException e) {
                throw e;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void m9108b(int i, boolean z) {
        if (z) {
            try {
                this.f3866n |= i;
                return;
            } catch (WDException e) {
                throw e;
            }
        }
        this.f3866n &= i ^ -1;
    }

    /* renamed from: c */
    public final int m9109c() {
        return this.f3862i;
    }

    /* renamed from: c */
    public final boolean m9110c(int i) {
        try {
            if (this.f3863j == null) {
                return false;
            }
            try {
                return this.f3863j[i] != null ? this.f3863j[i].f3879e : false;
            } catch (WDException e) {
                throw e;
            } catch (WDException e2) {
                throw e2;
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    /* renamed from: d */
    public boolean m9111d() {
        return m9116f(1);
    }

    /* renamed from: d */
    public final boolean m9112d(int i) {
        try {
            if (this.f3863j == null) {
                return false;
            }
            try {
                return this.f3863j[i] != null ? this.f3863j[i].f3878d : false;
            } catch (WDException e) {
                throw e;
            } catch (WDException e2) {
                throw e2;
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    /* renamed from: e */
    public C1034d m9113e() {
        return (C1034d) m9123k(3);
    }

    /* renamed from: e */
    public final void m9114e(int i) {
        m9119h(i).f3878d = true;
    }

    /* renamed from: f */
    public final boolean m9115f() {
        return m9116f(8);
    }

    /* renamed from: f */
    public final boolean m9116f(int i) {
        try {
            return (this.f3866n & i) > 0;
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: g */
    public C1034d m9117g() {
        return (C1034d) m9123k(2);
    }

    /* renamed from: g */
    public final void m9118g(int i) {
        m9119h(i).f3879e = true;
    }

    public WDObjet get(String str) {
        C0489p fils = this.f3860g.getFils(str);
        if (fils != null) {
            try {
                if (fils.isChamp()) {
                    return new cc(this.f3860g, (gc) fils, this.f3861h);
                }
                try {
                    if (fils instanceof C1278a) {
                        return ((C1278a) fils).getProxy(this.f3861h);
                    }
                } catch (WDException e) {
                    throw e;
                }
            } catch (WDException e2) {
                throw e2;
            }
        }
        WDAttributZR attributByName = this.f3860g.getAttributByName(str);
        if (attributByName != null) {
            try {
                attributByName = attributByName;
                attributByName.getClass();
                return new dc(attributByName, this.f3861h);
            } catch (WDException e22) {
                throw e22;
            }
        }
        WDObjet ruptureByName = this.f3860g.getRuptureByName(str);
        if (ruptureByName != null) {
            return ruptureByName;
        }
        WDErreurManager.m2883a(C0745b.m3222b(f3858z[1], new String[0]));
        return null;
    }

    public WDBooleen getBalayageActif() {
        return new WDBooleen(m9115f());
    }

    public WDEntier4 getCouleur() {
        C1034d g = m9117g();
        if (g == null) {
            return this.f3860g.getCouleur();
        }
        try {
            return new WDEntier4(g.mo3317d());
        } catch (WDException e) {
            throw e;
        }
    }

    public WDEntier4 getCouleurFond() {
        C1034d e = m9113e();
        if (e == null) {
            return this.f3860g.getCouleur();
        }
        try {
            return new WDEntier4(e.mo3317d());
        } catch (WDException e2) {
            throw e2;
        }
    }

    public WDEntier4 getEtat() {
        return new WDEntier4(m9109c());
    }

    public WDEntier4 getHauteur() {
        Integer num = (Integer) m9123k(10);
        if (num == null) {
            return this.f3860g.getHauteurLigne();
        }
        try {
            return new WDEntier4((double) C1511l.m10515a((float) num.intValue(), 1, this.f3860g.getDisplayUnit()));
        } catch (WDException e) {
            throw e;
        }
    }

    public String getName() {
        return this.f3860g.getName() + "[" + (this.f3861h + 1) + "]";
    }

    public String getNomType() {
        return C0745b.m3220a(f3858z[2], new String[0]);
    }

    public WDBooleen getSelectionnee() {
        return new WDBooleen(this.f3860g.isPositionSelectionnee(C0725i.m3069e(this.f3861h)));
    }

    public WDObjet getValeur() {
        return new WDChaine(this.f3860g.getValeurItem(this));
    }

    public cb getValeurAffichee() {
        return (cb) getValeur();
    }

    public WDBooleen getVisible() {
        return new WDBooleen(m9111d());
    }

    /* renamed from: h */
    public final C1296g m9119h(int i) {
        int nbLiaisonsRupture = this.f3860g.getNbLiaisonsRupture();
        if (i >= nbLiaisonsRupture) {
            try {
                C0691a.m2856a(f3858z[0]);
                return new C1296g();
            } catch (WDException e) {
                throw e;
            }
        }
        try {
            if (this.f3863j == null) {
                this.f3863j = new C1296g[nbLiaisonsRupture];
            }
            C1296g c1296g = this.f3863j[i];
            if (c1296g != null) {
                return c1296g;
            }
            c1296g = new C1296g();
            this.f3863j[i] = c1296g;
            return c1296g;
        } catch (WDException e2) {
            throw e2;
        }
    }

    /* renamed from: h */
    public final void m9120h() {
        this.f3863j = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: i */
    public final boolean m9121i(int r5) {
        /*
        r4 = this;
        r0 = 1;
        r1 = 0;
        r2 = r4.f3863j;	 Catch:{ WDException -> 0x0007 }
        if (r2 != 0) goto L_0x0009;
    L_0x0006:
        return r1;
    L_0x0007:
        r0 = move-exception;
        throw r0;
    L_0x0009:
        r2 = -1;
        if (r5 != r2) goto L_0x002b;
    L_0x000c:
        r2 = r1;
    L_0x000d:
        r3 = r4.f3863j;	 Catch:{ WDException -> 0x0022 }
        r3 = r3.length;	 Catch:{ WDException -> 0x0022 }
        if (r2 >= r3) goto L_0x0006;
    L_0x0012:
        r3 = r4.f3863j;	 Catch:{ WDException -> 0x0024 }
        r3 = r3[r2];	 Catch:{ WDException -> 0x0024 }
        if (r3 == 0) goto L_0x0028;
    L_0x0018:
        r3 = r4.f3863j;	 Catch:{ WDException -> 0x0026 }
        r3 = r3[r2];	 Catch:{ WDException -> 0x0026 }
        r3 = r3.f3876b;	 Catch:{ WDException -> 0x0026 }
        if (r3 == 0) goto L_0x0028;
    L_0x0020:
        r1 = r0;
        goto L_0x0006;
    L_0x0022:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0024 }
    L_0x0024:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0026 }
    L_0x0026:
        r0 = move-exception;
        throw r0;
    L_0x0028:
        r2 = r2 + 1;
        goto L_0x000d;
    L_0x002b:
        r2 = r4.f3863j;	 Catch:{ WDException -> 0x003b }
        r2 = r2[r5];	 Catch:{ WDException -> 0x003b }
        if (r2 == 0) goto L_0x003f;
    L_0x0031:
        r2 = r4.f3863j;	 Catch:{ WDException -> 0x003d }
        r2 = r2[r5];	 Catch:{ WDException -> 0x003d }
        r2 = r2.f3876b;	 Catch:{ WDException -> 0x003d }
        if (r2 == 0) goto L_0x003f;
    L_0x0039:
        r1 = r0;
        goto L_0x0006;
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;
    L_0x003f:
        r0 = r1;
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.zr.ec.i(int):boolean");
    }

    /* renamed from: j */
    public final int m9122j(int i) {
        try {
            if (this.f3863j != null) {
                if (i < this.f3863j.length) {
                    try {
                        if (this.f3863j[i] != null) {
                            return this.f3863j[i].f3877c;
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
            return -1;
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    /* renamed from: k */
    public Object m9123k(int i) {
        try {
            return this.f3865m != null ? this.f3865m.mo3801b(i, false) : null;
        } catch (WDException e) {
            throw e;
        }
    }

    public void release() {
        super.release();
        if (this.f3864l != null) {
            int length = this.f3864l.length;
            int i = 0;
            while (i < length) {
                try {
                    this.f3864l[i] = null;
                    i++;
                } catch (WDException e) {
                    throw e;
                }
            }
            this.f3864l = null;
        }
        try {
            if (this.f3865m != null) {
                this.f3865m.mo3804a();
                this.f3865m = null;
            }
            try {
                if (this.f3859d != null) {
                    this.f3859d.clear();
                    this.f3859d = null;
                }
            } catch (WDException e2) {
                throw e2;
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    public void setBalayageActif(boolean z) {
        if (z) {
            try {
                if (!this.f3860g.isSwipeEnabled()) {
                    WDErreurManager.m2883a(C0745b.m3222b(f3858z[3], this.f3860g.getName()));
                }
            } catch (WDException e) {
                throw e;
            }
        }
        m9108b(8, z);
    }

    public void setCouleur(int i) {
        m9103a(2, C1031a.m7469m(i));
        this.f3860g.redessinerCellule(this.f3861h, true);
    }

    public void setCouleurFond(int i) {
        m9103a(3, C1031a.m7469m(i));
        this.f3860g.redessinerCellule(this.f3861h, false);
    }

    public void setEtat(int i) {
        this.f3862i = i;
        Iterator lstFils = this.f3860g.getLstFils();
        while (lstFils.hasNext()) {
            try {
                new cc(this.f3860g, (gc) lstFils.next(), this.f3861h).setEtat(i);
            } catch (WDException e) {
                throw e;
            }
        }
    }

    public void setHauteur(int i) {
        m9103a(10, new Integer(Math.max(0, C1511l.m10532d((float) i, this.f3860g.getDisplayUnit()))));
        this.f3860g.updateContenu();
    }

    public void setSelectionnee(boolean z) {
        if (z) {
            try {
                this.f3860g.ajouterSelection(new int[]{C0725i.m3069e(this.f3861h)});
                return;
            } catch (WDException e) {
                return;
            }
        }
        this.f3860g.supprimerSelection(new int[]{C0725i.m3069e(this.f3861h)});
    }

    public void setValeur(WDObjet wDObjet) {
        this.f3864l = this.f3860g.construireValeurItem(wDObjet.getString());
        this.f3860g.notifModificationModele(this.f3861h, this.f3861h);
    }

    public void setVisible(boolean z) {
        m9108b(1, z);
        this.f3860g.updateContenu(true);
    }
}
