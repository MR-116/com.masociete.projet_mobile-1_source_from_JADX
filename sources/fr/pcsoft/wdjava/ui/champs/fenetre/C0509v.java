package fr.pcsoft.wdjava.ui.champs.fenetre;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p035c.C0660a;
import fr.pcsoft.wdjava.core.p035c.C0662c;
import fr.pcsoft.wdjava.core.p035c.C0666h;
import fr.pcsoft.wdjava.core.p035c.C0667i;
import fr.pcsoft.wdjava.core.poo.C0735q;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.WDVoid;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.p032m.C0933a;
import fr.pcsoft.wdjava.p032m.C0934b;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.tlm.C1029b;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.C0546j;
import fr.pcsoft.wdjava.ui.champs.C1153s;
import fr.pcsoft.wdjava.ui.champs.db;
import fr.pcsoft.wdjava.ui.champs.fc;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.fb;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.saisie.C0516d;
import fr.pcsoft.wdjava.ui.champs.xc;
import fr.pcsoft.wdjava.ui.champs.zr.bb;
import fr.pcsoft.wdjava.ui.menu.C0494e;
import fr.pcsoft.wdjava.ui.menu.C0495i;
import fr.pcsoft.wdjava.ui.menu.C0497c;
import fr.pcsoft.wdjava.ui.menu.C0498d;
import fr.pcsoft.wdjava.ui.menu.C1467b;
import fr.pcsoft.wdjava.ui.p082k.C1439b;
import fr.pcsoft.wdjava.ui.utils.C1502a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetre.v */
public abstract class C0509v extends gc implements C0508h {
    protected static final int Fc = 2;
    protected static final int Hc = 4;
    private static final String Kc = C0509v.m1407z(C0509v.m1408z("L\u001f^kXJ\f_"));
    public static final WDVoid OUVERTURE = new C1170w();
    protected static final int Pc = 3;
    private static final String Zc = C0509v.m1407z(C0509v.m1408z("L\u001f^kXJ\u0012_"));
    protected static final int jd = 0;
    protected static final int kd = 1;
    private static final String[] ld;
    public static final WDObjet mWD_NO_CONTEXT_MENU = null;
    protected static final int zc = 5;
    protected ArrayList Ac = new ArrayList();
    protected ArrayList<C1162n> Bc = null;
    protected C0498d Cc;
    protected WDObjet Dc = new WDChaine("");
    private String Ec = "";
    protected boolean Gc = false;
    protected ArrayList<gc> Ic = null;
    private String Jc = null;
    protected WDObjet[] Lc = null;
    protected C1153s Mc = null;
    protected String Nc = "";
    protected LinkedList<C0495i> Oc;
    private int Qc = 0;
    protected int Rc = 1;
    protected C1029b Sc = null;
    protected int Tc = -1;
    protected gc Uc = null;
    private String Vc = "";
    protected int[] Wc = null;
    protected C0934b Xc = null;
    protected boolean Yc = false;
    private boolean ad = false;
    protected ArrayList bd = new ArrayList();
    protected ArrayList<fb> cd = null;
    protected C1155i dd = C1155i.FILLE;
    protected ArrayList ed = null;
    private int fd = 0;
    protected boolean gd = false;
    protected boolean hd = false;
    protected String id = "";
    protected HashMap xc = null;
    protected int yc = 0;

    static {
        r0 = new String[12];
        r0[0] = C0509v.m1407z(C0509v.m1408z("\u001d;hMnp<eOpl?w@r2v]p}5"));
        r0[1] = C0509v.m1407z(C0509v.m1408z("\u001d.yPu{!~Z}}?h^ew1t@vr1x^}{"));
        r0[2] = C0509v.m1407z(C0509v.m1408z("\u001d8Qtj,"));
        r0[3] = C0509v.m1407z(C0509v.m1408z("\u001d?vKxj+~Z"));
        r0[4] = C0509v.m1407z(C0509v.m1408z("S)~@"));
        r0[5] = C0509v.m1407z(C0509v.m1408z("y)~O"));
        r0[6] = C0509v.m1407z(C0509v.m1408z("w\u0013JpBM\u0017XsT\u001e\u001a_?\\Q\u001aSyX[\f\u001asP\u001e\fÓyØL\u001bT|T\u001e\u001a_?]_^\\z_[\nHz\u0011Z\u001fTl\u0011R\u001b\u001aXfz.\u001a{D\u001e\u000eHp[[\n\u0014"));
        r0[7] = C0509v.m1407z(C0509v.m1408z("\u001d7wO~m-s]}{!uJgl7h@w{0Kc{"));
        r0[8] = C0509v.m1407z(C0509v.m1408z("\u001d8Qtj,@xp=uQk;"));
        r0[9] = C0509v.m1407z(C0509v.m1408z("\u001d9hPdn;"));
        r0[10] = C0509v.m1407z(C0509v.m1408z("\u001d0oRnj?x"));
        r0[11] = C0509v.m1407z(C0509v.m1408z("r\u001f\u001asXM\n_?U[\r\u001akC[\u001f^l\u0011R\u001fT|ØM^^zAK\u0017I?]_^\\z_Ô\nHz\u0011Z\u001bLmPW\n\u001aõEL\u001b\u001aiXZ\u001b\u0014"));
        ld = r0;
    }

    /* renamed from: a */
    private C0509v m1401a() {
        try {
            C0509v c0509v = (C0509v) getClass().newInstance();
            c0509v.setNom(getName());
            modifierReferenceFenetre(c0509v, getName());
            return c0509v;
        } catch (Exception e) {
            WDErreurManager.m2883a(C0745b.m3222b(ld[7], getNom().getString()));
            return null;
        }
    }

    /* renamed from: a */
    private final C0489p m1402a(String str, boolean z) {
        C0489p a = this.Mc.m8344a(str, z);
        if (a == null) {
            try {
                if (this.cd != null && this.cd.size() > 0) {
                    fb fenetreInterne = getFenetreInterne(str);
                    if (fenetreInterne != null) {
                        return (C0489p) fenetreInterne;
                    }
                }
            } catch (WDException e) {
                throw e;
            }
        }
        return a;
    }

    /* renamed from: a */
    private final void m1403a(gc gcVar) {
        try {
            if (this.bd == null) {
                return;
            }
            if (this.bd.remove(gcVar) && gcVar._getNumTab() == this.Rc) {
                this.Rc = 0;
                int size = this.bd.size();
                for (int i = 0; i < size; i++) {
                    gc gcVar2 = (gc) this.bd.get(i);
                    if (gcVar2 != null) {
                        try {
                            this.Rc = Math.max(this.Rc, gcVar2._getNumTab());
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                }
            }
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final void m1404a(fr.pcsoft.wdjava.core.WDObjet[] r2, fr.pcsoft.wdjava.ui.champs.fenetre.C1155i r3) {
        /*
        r1 = this;
        if (r2 == 0) goto L_0x000d;
    L_0x0002:
        r0 = fr.pcsoft.wdjava.ui.champs.fenetre.C1155i.FILLE;	 Catch:{ WDException -> 0x0010 }
        if (r3 == r0) goto L_0x000a;
    L_0x0006:
        r0 = fr.pcsoft.wdjava.ui.champs.fenetre.C1155i.NON_MODALE;	 Catch:{ WDException -> 0x0012 }
        if (r3 != r0) goto L_0x000d;
    L_0x000a:
        fr.pcsoft.wdjava.core.application.WDParametre.traiterParametreTraitementNonBloquant(r2);	 Catch:{ WDException -> 0x0012 }
    L_0x000d:
        r1.Lc = r2;
        return;
    L_0x0010:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0012 }
    L_0x0012:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.fenetre.v.a(fr.pcsoft.wdjava.core.WDObjet[], fr.pcsoft.wdjava.ui.champs.fenetre.i):void");
    }

    /* renamed from: b */
    private final void m1405b(gc gcVar) {
        try {
            if (this.Ac != null) {
                this.Ac.remove(gcVar);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: b */
    private void m1406b(WDObjet[] wDObjetArr, C1155i c1155i) {
        m1404a(wDObjetArr, c1155i);
    }

    public static final C0508h ouvrirFenetre(WDObjet wDObjet, C1155i c1155i, WDObjet[] wDObjetArr) {
        int i = -1;
        boolean z = false;
        try {
            if (!C0938m.m6815b()) {
                return (C0508h) C0938m.m6807a(new C1161m(wDObjet, c1155i, wDObjetArr));
            }
            if (wDObjet.isFenetre()) {
                return ((C0508h) wDObjet).ouvre(c1155i, wDObjetArr);
            }
            boolean z2;
            String str = "";
            String str2 = "";
            String string = wDObjet.getValeur().getString();
            int indexOf = string.indexOf(5);
            int indexOf2 = string.indexOf(1);
            boolean z3 = indexOf != -1 ? true : z;
            if (indexOf2 == -1) {
                z2 = z;
            } else if (indexOf2 < indexOf || indexOf == -1) {
                indexOf = indexOf2;
                z2 = true;
            } else {
                z2 = true;
            }
            if (indexOf != -1) {
                string = string.substring(z, indexOf);
            }
            try {
                int i2;
                String str3;
                C0508h a;
                if (string.indexOf(44) == -1 && string.indexOf(61) == -1) {
                    indexOf = -1;
                    i2 = -1;
                    str3 = str;
                    str = string;
                } else {
                    String[] split = string.split(",");
                    if (split != null) {
                        try {
                            if (split.length > 0) {
                                str2 = split[z].trim();
                                if (str2.indexOf(61) != -1) {
                                    String[] split2 = str2.split("=");
                                    if (split2 != null) {
                                        try {
                                            if (split2.length > 1) {
                                                str = split2[z].trim();
                                                str2 = split2[1].trim();
                                            }
                                        } catch (NumberFormatException e) {
                                            throw e;
                                        }
                                    }
                                }
                                if (split.length > 1) {
                                    try {
                                        i = Integer.parseInt(split[1].trim());
                                    } catch (NumberFormatException e2) {
                                        i = z;
                                    }
                                    if (split.length > 2) {
                                        try {
                                            i2 = Integer.parseInt(split[2].trim());
                                        } catch (NumberFormatException e3) {
                                        }
                                    }
                                    indexOf = i;
                                    str3 = str;
                                    str = str2;
                                }
                            }
                        } catch (NumberFormatException e4) {
                            throw e4;
                        }
                    }
                    i2 = -1;
                    indexOf = i;
                    str3 = str;
                    str = str2;
                }
                try {
                    a = C1502a.m10415a(new WDChaine(str), false, false);
                } catch (C0666h e5) {
                    WDErreurManager.m2883a(e5.getMessage());
                    a = null;
                }
                return string.equalsIgnoreCase(str) ? a.ouvre(c1155i, wDObjetArr) : a.ouvre(c1155i, str3, i2, indexOf, z3, z2, wDObjetArr);
            } catch (NumberFormatException e42) {
                throw e42;
            }
        } catch (NumberFormatException e422) {
            throw e422;
        }
    }

    /* renamed from: z */
    private static String m1407z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 62;
                    break;
                case 1:
                    i2 = 126;
                    break;
                case 2:
                    i2 = 58;
                    break;
                case 3:
                    i2 = 31;
                    break;
                default:
                    i2 = 49;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1408z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 49);
        }
        return toCharArray;
    }

    public String _getAlias() {
        return this.Nc;
    }

    public final String _getFichierParcouru() {
        return this.Vc;
    }

    public String _getRubriqueParcourue() {
        return this.Ec;
    }

    public final void abandonne() {
        try {
            if (this.Uc != null) {
                if (!WDAppelContexte.getContexte().m2704a(18, this.Uc)) {
                    this.Uc.appelPCode(18);
                    return;
                }
            }
            ferme(true, true, null);
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public abstract void afficherJauge(String str, int i, int i2);

    public abstract void afficherPremierPlan();

    public void ajouter(String str, C0489p c0489p) {
        this.Mc.m8353a(str, c0489p);
    }

    public void ajouterChampNavigable(gc gcVar) {
        this.Ac.add(gcVar);
    }

    public void ajouterChampNumTable(fc fcVar) {
        try {
            this.bd.add(fcVar);
            if (fcVar._getNumTab() > this.Rc) {
                this.Rc = fcVar._getNumTab();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public final void ajouterEcouteurFenetre(C1162n c1162n) {
        try {
            if (this.Bc == null) {
                this.Bc = new ArrayList();
            }
            this.Bc.add(c1162n);
        } catch (WDException e) {
            throw e;
        }
    }

    public void ajouterFenetreFille(C0509v c0509v) {
        if (c0509v != null) {
            try {
                if (this.ed == null) {
                    this.ed = new ArrayList();
                }
                this.ed.add(new WeakReference(c0509v));
                c0509v.setFenetre(this);
            } catch (WDException e) {
                throw e;
            }
        }
    }

    public void ajouterFenetreInterne(fb fbVar) {
        try {
            if (this.cd == null) {
                this.cd = new ArrayList(3);
            }
            this.cd.add(fbVar);
        } catch (WDException e) {
            throw e;
        }
    }

    public void ajouterMenuContextuel(C1467b c1467b) {
        if (c1467b != null) {
            try {
                ajouter(c1467b.getNomMenu(), (C0489p) c1467b);
            } catch (WDException e) {
                throw e;
            }
        }
    }

    public void ajouterMenuPrincipal(C0498d c0498d) {
        this.Cc = c0498d;
        ajouter(this.Cc.getName(), (C0489p) this.Cc);
    }

    public void ajouterOptionMenu(C0495i c0495i) {
        try {
            if (this.Oc == null) {
                this.Oc = new LinkedList();
            }
            if (c0495i != null) {
                try {
                    this.fd = Math.max(this.fd, ((WDObjet) c0495i).getValeur().getInt());
                    this.Oc.add(c0495i);
                    if (this.Mc.m8344a(c0495i.getNomOptionMenu(), false) == null) {
                        ajouter(c0495i.getNomOptionMenu(), (C0489p) c0495i);
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void ajouterVariableGlobale(String str, WDObjet wDObjet) {
        try {
            if (this.xc == null) {
                this.xc = new HashMap();
            }
            this.xc.put(C0808l.m4016a(str, 20, 0), wDObjet);
        } catch (WDException e) {
            throw e;
        }
    }

    public void appliquerAncrage(int i, int i2, int i3, int i4, int i5) {
        try {
            if (this.Mc != null) {
                this.Mc.mo3525a(i, i2, i3, i4, i5);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected abstract void appliquerTitreFenetre(String str);

    /* renamed from: b */
    void m1409b() {
        try {
            if (this.cd != null && this.cd.size() > 0) {
                Iterator it = this.cd.iterator();
                while (it.hasNext()) {
                    try {
                        ((fb) it.next()).execDeclarationGlobales(new WDObjet[0]);
                    } catch (WDException e) {
                        ferme(false, false, e);
                    } catch (C0660a e2) {
                        e2.m2666b();
                        e2.m2665a();
                    }
                }
            }
        } catch (WDException e3) {
            throw e3;
        }
    }

    public abstract boolean captureEcran();

    public abstract void changerCouleurJauge(int i);

    public C0495i chercherOptionMenu(int i) {
        if (this.Oc != null) {
            Iterator it = this.Oc.iterator();
            while (it.hasNext()) {
                C0495i c0495i = (C0495i) it.next();
                try {
                    if (c0495i.getNumeroOptionMenu() == i) {
                        return c0495i;
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return null;
    }

    public WDObjet chercherVariableGlobale(String str) {
        try {
            return this.xc != null ? (WDObjet) this.xc.get(C0808l.m4016a(str, 20, 0)) : null;
        } catch (WDException e) {
            throw e;
        }
    }

    public void clonerChamp(String str, int i, int i2) {
    }

    protected void creerChamps() {
    }

    protected void creerFenetre(C1155i c1155i) {
        try {
            this.Mc = new C1154g(this);
            this.c = false;
            this.id = "";
            this.gd = false;
            this.Yc = false;
            this.ad = false;
            this.hd = false;
            this.Dc = new WDChaine("");
            this.yc = 2;
            if (this.Ac == null) {
                this.Ac = new ArrayList();
            }
            try {
                if (this.bd == null) {
                    this.bd = new ArrayList();
                }
                try {
                    this.Tc = -1;
                    this.Rc = 1;
                    this.Vc = "";
                    this.Ec = "";
                    this.fd = 0;
                    this.dd = c1155i;
                    this.Eb = 0;
                    this.Tb = 0;
                    this.Sb = 0;
                    this.R = 0;
                    this.U = 0;
                    this.p = 0;
                    if (this.dd != C1155i.FILLE) {
                        this.l = null;
                    }
                    creerChamps();
                } catch (WDException e) {
                    throw e;
                }
            } catch (WDException e2) {
                throw e2;
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    public void declarerGlobale(WDObjet[] wDObjetArr) {
    }

    public void destroy() {
    }

    public void enregistrerChampPourNotifOuverture(gc gcVar) {
        try {
            if (this.Ic == null) {
                this.Ic = new ArrayList();
            }
            this.Ic.add(gcVar);
        } catch (WDException e) {
            throw e;
        }
    }

    public void enregistrerThread(C0933a c0933a) {
        try {
            if (this.Xc == null) {
                this.Xc = new C0934b();
            }
            this.Xc.add(c0933a);
        } catch (WDException e) {
            throw e;
        }
    }

    public void erreurPassageParametreFenetre(int i, int i2) {
        String str = ld[0];
        r1 = new String[3];
        r1[0] = C0745b.m3224c(ld[1], getName());
        r1[1] = String.valueOf(i2);
        r1[2] = String.valueOf(i);
        WDErreurManager.m2883a(C0745b.m3222b(str, r1));
    }

    public boolean estOuverteEtAffichee() {
        return this.Gc;
    }

    protected WDObjet executerPCode(int i) {
        switch (i) {
            case C0607n.Mv /*1138*/:
                try {
                    fermetureFenetreFille();
                    return null;
                } catch (WDException e) {
                    throw e;
                }
            default:
                return super.executerPCode(i);
        }
    }

    public boolean ferme(boolean z, boolean z2, WDException wDException) {
        C0509v c0509v = (C0509v) getFenetreMere();
        if (z) {
            if (z2) {
                WDContexte contexte;
                C0508h d;
                try {
                    if (this.cd != null) {
                        int size = this.cd.size();
                        fb[] fbVarArr = (fb[]) this.cd.toArray(new fb[size]);
                        for (int i = 0; i < size; i++) {
                            fb fbVar = fbVarArr[i];
                            if (!fbVar.isReleased()) {
                                ((C0489p) fbVar).appelPCode(2);
                            }
                        }
                    }
                    appelPCode(2);
                    if (c0509v != null && this.dd == C1155i.FILLE) {
                        contexte = WDAppelContexte.getContexte();
                        d = contexte.m2718d();
                        contexte.m2697a((C0508h) this);
                        c0509v.appelPCode(C0607n.Mv);
                        contexte.m2697a(d);
                    }
                } catch (C0667i e) {
                    contexte.m2697a(d);
                } catch (C0667i e2) {
                    throw e2;
                } catch (C0667i e22) {
                    throw e22;
                } catch (C0660a e3) {
                    return false;
                } catch (Throwable th) {
                    contexte.m2697a(d);
                }
            }
            sauverValeur();
        }
        WDProjet instance = WDProjet.getInstance();
        try {
            instance.notifFermetureFenetre(this);
            if (c0509v != null) {
                c0509v.supprimerFenetreFille(this);
            }
            Iterator lstFenetreOuvertes = instance.getLstFenetreOuvertes();
            while (lstFenetreOuvertes.hasNext()) {
                c0509v = (C0509v) lstFenetreOuvertes.next();
                try {
                    if (c0509v.getClass() == getClass()) {
                        modifierReferenceFenetre(c0509v, getName());
                        break;
                    }
                } catch (C0667i e222) {
                    throw e222;
                }
            }
            try {
                fermerFenetreFille(z);
                if (this.Nc != null) {
                    if (!this.Nc.equals("")) {
                        instance.supprimerAliasFenetre(this.Nc);
                    }
                }
                try {
                    if (this.Xc != null) {
                        if (!this.Xc.isEmpty()) {
                            this.Xc.m6800a(3000);
                        }
                    }
                    if (this.Bc != null) {
                        int size2 = this.Bc.size() - 1;
                        while (size2 >= 0) {
                            try {
                                if (size2 < this.Bc.size()) {
                                    C1162n c1162n = (C1162n) this.Bc.get(size2);
                                    if (c1162n != null) {
                                        try {
                                            c1162n.mo3567a(this);
                                        } catch (C0667i e2222) {
                                            throw e2222;
                                        }
                                    }
                                    continue;
                                }
                                size2--;
                            } catch (C0667i e22222) {
                                throw e22222;
                            }
                        }
                    }
                    instance.decrementerNbFenetreOuverte();
                    return true;
                } catch (C0667i e222222) {
                    throw e222222;
                } catch (C0667i e2222222) {
                    throw e2222222;
                }
            } catch (C0667i e22222222) {
                throw e22222222;
            } catch (C0667i e222222222) {
                throw e222222222;
            }
        } catch (C0667i e2222222222) {
            throw e2222222222;
        }
    }

    protected void fermerFenetreFille(boolean z) {
        try {
            if (this.ed != null && this.ed.size() > 0) {
                C0508h d = WDAppelContexte.getContexte().m2718d();
                for (int size = this.ed.size() - 1; size >= 0; size--) {
                    C0508h c0508h;
                    WeakReference weakReference = (WeakReference) this.ed.get(size);
                    if (weakReference != null) {
                        try {
                            c0508h = (C0509v) weakReference.get();
                        } catch (C0667i e) {
                            throw e;
                        }
                    }
                    Object obj = null;
                    if (c0508h != null) {
                        try {
                            if (c0508h.estOuverte() && (d == null || d != c0508h)) {
                                try {
                                    c0508h.ferme(z, true, null);
                                } catch (C0667i e2) {
                                }
                            }
                        } catch (C0667i e3) {
                            throw e3;
                        } catch (C0667i e32) {
                            try {
                                throw e32;
                            } catch (WDException e4) {
                                throw e4;
                            }
                        }
                    }
                }
                this.ed.clear();
                this.ed = null;
            }
        } catch (C0667i e322) {
            throw e322;
        }
    }

    public void fermetureFenetreFille() {
        initialiserAction();
    }

    public void finInit() {
        super.finInit();
        runAutoProc();
    }

    protected void focusInitial() {
        C0489p premierChamp;
        if (this.Tc == -1) {
            premierChamp = getPremierChamp();
            if (premierChamp != null) {
                try {
                    if (premierChamp instanceof C0516d) {
                        premierChamp.prendreFocus();
                    } else {
                        return;
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        gc gcVar = (gc) getChampNavigable(this.Tc);
        if (gcVar != null) {
            try {
                if (gcVar.estNavigable(true)) {
                    gcVar.prendreFocus();
                }
            } catch (WDException e2) {
                throw e2;
            }
        }
        if (premierChamp != null) {
            try {
                C1439b.m10105d().m10102a(premierChamp);
            } catch (WDException e22) {
                throw e22;
            }
        }
    }

    public WDChaine getAlias() {
        return new WDChaine(this.Nc);
    }

    public WDObjet getAltitude() {
        erreurAppelPropriete(C0745b.m3219a(ld[3]));
        return null;
    }

    public final gc getBoutonAbandon() {
        return this.Uc;
    }

    public C0489p getChampNavigable(int i) {
        try {
            if (this.Ac != null && i >= 0) {
                try {
                    if (i < this.Ac.size()) {
                        return (gc) this.Ac.get(i);
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
            return null;
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    public gc getChampNavigablePrecedent() {
        try {
            if (getNbChampNavigable() == 0) {
                return null;
            }
            setIndiceChampCourant(getIndiceChampCourant() - 1);
            if (getIndiceChampCourant() < 0) {
                setIndiceChampCourant(getNbChampNavigable() - 1);
            }
            int indiceChampCourant = getIndiceChampCourant();
            gc gcVar = (gc) getChampNavigable(indiceChampCourant);
            int i = -1;
            while (i != indiceChampCourant) {
                try {
                    if (gcVar.estNavigable(true)) {
                        return gcVar;
                    }
                    setIndiceChampCourant(getIndiceChampCourant() - 1);
                    if (getIndiceChampCourant() < 0) {
                        setIndiceChampCourant(getNbChampNavigable() - 1);
                    }
                    i = getIndiceChampCourant();
                    gcVar = (gc) getChampNavigable(i);
                } catch (WDException e) {
                    throw e;
                } catch (WDException e2) {
                    throw e2;
                }
            }
            return gcVar;
        } catch (WDException e22) {
            throw e22;
        } catch (WDException e222) {
            throw e222;
        }
    }

    public gc getChampNavigableSuivant() {
        try {
            if (getNbChampNavigable() == 0) {
                return null;
            }
            setIndiceChampCourant(getIndiceChampCourant() + 1);
            if (getIndiceChampCourant() >= getNbChampNavigable()) {
                setIndiceChampCourant(0);
            }
            int indiceChampCourant = getIndiceChampCourant();
            gc gcVar = (gc) getChampNavigable(indiceChampCourant);
            int i = -1;
            while (i != indiceChampCourant) {
                try {
                    if (gcVar.estNavigable(true)) {
                        return gcVar;
                    }
                    setIndiceChampCourant(getIndiceChampCourant() + 1);
                    if (getIndiceChampCourant() >= getNbChampNavigable()) {
                        setIndiceChampCourant(0);
                    }
                    i = getIndiceChampCourant();
                    gcVar = (gc) getChampNavigable(i);
                } catch (WDException e) {
                    throw e;
                } catch (WDException e2) {
                    throw e2;
                }
            }
            return gcVar;
        } catch (WDException e22) {
            throw e22;
        } catch (WDException e222) {
            throw e222;
        }
    }

    public final String getChampPrecedent() {
        return this.Jc;
    }

    public xc getConteneurManager() {
        return this.Mc;
    }

    public WDObjet getElement(String str) {
        WDObjet a = this.Mc.m8344a(str, false);
        return a != null ? a : super.getElement(str);
    }

    public fb getFenetreCoulissanteDroite() {
        return null;
    }

    public fb getFenetreCoulissanteGauche() {
        return null;
    }

    public fb getFenetreInterne(String str) {
        if (this.cd != null) {
            int size = this.cd.size() - 1;
            while (size >= 0) {
                fb fbVar = (fb) this.cd.get(size);
                try {
                    if (((C0489p) fbVar).getName().equalsIgnoreCase(str)) {
                        return fbVar;
                    }
                    size--;
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return null;
    }

    public WDChaine getFichierParcouru() {
        return new WDChaine(this.Vc);
    }

    public C0489p getFils(String str) {
        return m1402a(str, true);
    }

    public C0489p getFilsDirect(String str) {
        return m1402a(str, false);
    }

    public boolean getFinOuverture() {
        return this.gd;
    }

    public WDChaine getGroupe() {
        erreurAppelPropriete(C0745b.m3219a(ld[9]));
        return null;
    }

    public int getIndiceChampCourant() {
        return this.Tc;
    }

    public Iterator getIterateurOptionMenu() {
        try {
            return this.Oc != null ? this.Oc.iterator() : null;
        } catch (WDException e) {
            throw e;
        }
    }

    public WDChaine getLibelle() {
        return getTitre();
    }

    public Iterator getLstFils() {
        return this.Mc.m8369k();
    }

    public C0495i[] getLstOptionMenu() {
        if (this.Oc == null) {
            return null;
        }
        return (C0495i[]) this.Oc.toArray(new C0495i[this.Oc.size()]);
    }

    public int getMaxNumTab() {
        return this.Rc;
    }

    public final C0497c getMenuPrincipal() {
        return this.Cc;
    }

    public C0489p getMonParent() {
        return this;
    }

    public final C1029b getMonitor() {
        return this.Sc;
    }

    public int getNbChampNavigable() {
        return this.Ac.size();
    }

    public WDChaine getNomComplet() {
        return getNom();
    }

    public String getNomFenetre() {
        return getName();
    }

    public String getNomType() {
        return C0745b.m3220a(ld[2], new String[0]);
    }

    public WDEntier4 getNumTab() {
        erreurAppelPropriete(C0745b.m3219a(ld[10]));
        return null;
    }

    public final int getNumeroMaxOptionMenu() {
        return this.fd;
    }

    public C0495i[] getOptionsMenu(String str, C0494e c0494e) {
        if (this.Oc == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        Iterator it = this.Oc.iterator();
        while (it.hasNext()) {
            C0495i c0495i = (C0495i) it.next();
            try {
                if (c0495i.getName().equalsIgnoreCase(str)) {
                    if (c0494e != null) {
                        try {
                            if (c0495i.getConteneurMenu() != c0494e) {
                                try {
                                    if (c0495i.getOptionMenuParente() != c0494e) {
                                    }
                                } catch (WDException e) {
                                    throw e;
                                }
                            }
                        } catch (WDException e2) {
                            throw e2;
                        }
                    }
                    arrayList.add(c0495i);
                }
            } catch (WDException e22) {
                throw e22;
            } catch (WDException e222) {
                throw e222;
            }
        }
        C0495i[] c0495iArr = new C0495i[arrayList.size()];
        arrayList.toArray(c0495iArr);
        return c0495iArr;
    }

    public db getPere() {
        return null;
    }

    public WDObjet getPlan() {
        return new WDEntier4(getPlanActif());
    }

    public int getPlanActif() {
        return this.Qc;
    }

    public abstract gc getPremierChamp();

    public WDChaine getRubriqueParcourue() {
        return new WDChaine(this.Ec);
    }

    public WDChaine getTitre() {
        try {
            if (isFenetreCree()) {
                return new WDChaine(getTitreFenetre());
            }
            WDErreurManager.m2883a(C0745b.m3222b(ld[8], getNom().getString()));
            return null;
        } catch (WDException e) {
            throw e;
        }
    }

    public final String getTitreFenetre() {
        return this.id;
    }

    public WDObjet getValeur() {
        return getTitre();
    }

    public WDObjet getValeurRenvoyee() {
        return this.Dc;
    }

    public C0509v getWDFenetreThis() {
        return this;
    }

    public abstract void iconise();

    public void initChamp() {
        initFenetreInterne();
        this.Mc.m8365g();
    }

    protected void initFenetreInterne() {
        try {
            if (this.cd != null && this.cd.size() > 0) {
                Iterator it = this.cd.iterator();
                while (it.hasNext()) {
                    fb fbVar = (fb) it.next();
                    try {
                        if (!fbVar.isExecPCodeInit()) {
                            ((C0489p) fbVar).appelPCode(14);
                            ((C0489p) fbVar).appelPCode(C0607n.Xu);
                            ((C0489p) fbVar).appelPCode(35);
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void initialiserObjet() {
    }

    public abstract boolean isAvecBarreDeTitre();

    public boolean isConteneur() {
        return true;
    }

    public boolean isEvaluable() {
        try {
            if (super.isEvaluable()) {
                if (isFenetreCree()) {
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

    public boolean isFenetre() {
        return true;
    }

    public final boolean isFenetreCree() {
        return this.Yc;
    }

    public boolean isFenetreCreeExt() {
        return this.ad;
    }

    public boolean isInitialisee() {
        return this.hd;
    }

    public abstract boolean isMaximisee();

    public void majNumTab(int i, int i2) {
        Iterator it = this.bd.iterator();
        while (it.hasNext()) {
            gc gcVar = (gc) it.next();
            try {
                if (gcVar._getNumTab() <= i2) {
                    if (gcVar._getNumTab() > i) {
                        gcVar._setNumTab(gcVar._getNumTab() - 1);
                    }
                }
                try {
                    if (gcVar._getNumTab() < i2) {
                        continue;
                    } else if (gcVar._getNumTab() < i) {
                        gcVar._setNumTab(gcVar._getNumTab() + 1);
                    }
                } catch (WDException e) {
                    throw e;
                } catch (WDException e2) {
                    throw e2;
                }
            } catch (WDException e22) {
                throw e22;
            } catch (WDException e222) {
                throw e222;
            }
        }
    }

    public void majOrdreNavigation(C0508h c0508h) {
        try {
            if (this.Ac != null) {
                if (!this.Ac.isEmpty()) {
                    this.Ac.clear();
                }
            }
            this.Mc.m8349a(c0508h);
            trierChampParOrdreNavigation();
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void majPlan(int i) {
    }

    public abstract void masquerJauge();

    public abstract void maximise();

    public boolean modifAliasFenetre(String str, boolean z) {
        WDProjet instance = WDProjet.getInstance();
        if (z) {
            try {
                if (instance.aliasFenetreExiste(str)) {
                    return false;
                }
            } catch (WDException e) {
                throw e;
            }
        }
        try {
            if (this.Nc != null) {
                if (!this.Nc.equals("")) {
                    instance.supprimerAliasFenetre(this.Nc);
                }
            }
            try {
                this.Nc = str;
                if (str != null) {
                    if (!str.equals("")) {
                        instance.ajouterAliasFenetre(str, this);
                    }
                }
                return true;
            } catch (WDException e2) {
                throw e2;
            } catch (WDException e22) {
                throw e22;
            }
        } catch (WDException e222) {
            throw e222;
        } catch (WDException e2222) {
            throw e2222;
        }
    }

    public void modification() {
        onModifChamp();
        super.modification();
    }

    public void modifierReferenceFenetre(C0509v c0509v, String str) {
        try {
            WDProjet instance = WDProjet.getInstance();
            Field field = C0735q.m3130e(ld[5] + C0725i.m3031a(instance.getNom(), false)).getField(ld[4] + C0725i.m3031a(str, false));
            if (field.get(instance) != c0509v) {
                field.set(instance, c0509v);
                instance.ajouterFenetre(c0509v.getName(), c0509v);
            }
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            C0691a.m2863b(ld[6], e2);
        }
    }

    public void notifSuppressionChamp(gc gcVar) {
        try {
            m1405b(gcVar);
            m1403a(gcVar);
            if (this.Uc == gcVar) {
                this.Uc = null;
            }
            try {
                if (this.Ic != null) {
                    this.Ic.remove(gcVar);
                }
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public final void onAffichageFenetreInterne(fb fbVar) {
        try {
            if (this.cd == null) {
                return;
            }
            if (this.cd.remove(fbVar)) {
                this.cd.add(fbVar);
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void onCreateWindow() {
        parcourirChamp(new C1173y(this), true);
        m1409b();
        WDAppelContexte.getContexte().m2715c(C0607n.Jg, this);
        try {
            declarerGlobale(this.Lc);
        } catch (WDException e) {
            ferme(false, false, e);
        } catch (C0660a e2) {
            e2.m2666b();
            e2.m2665a();
        } finally {
            WDAppelContexte.getContexte().m2736x();
        }
    }

    public void ouvertureFenetre() {
        this.Gc = true;
        if (this.Ic != null) {
            Iterator it = this.Ic.iterator();
            while (it.hasNext()) {
                ((gc) it.next())._notifOuvertureFenetre();
            }
        }
    }

    public C0508h ouvre(C1155i c1155i, WDObjet[] wDObjetArr) {
        C0508h a;
        try {
            C0509v c0509v;
            C1155i c1155i2;
            if (this.Yc) {
                if (!(isReleased() || c1155i == C1155i.UTILISE)) {
                    a = m1401a();
                    a.m1406b(wDObjetArr, c1155i);
                    if (c1155i == C1155i.FILLE) {
                        c0509v = (C0509v) WDAppelContexte.getContexte().m2722h();
                        if (c0509v != null) {
                            try {
                                c0509v.ajouterFenetreFille(a);
                            } catch (WDException e) {
                                throw e;
                            }
                        }
                    }
                    if (c1155i != C1155i.UTILISE) {
                        c1155i2 = C1155i.NON_MODALE;
                        WDProjet.getInstance().incrementerNbFenetreOuverte();
                        try {
                            WDProjet.getInstance().fermerToutesFenetres(false, null);
                            modifierReferenceFenetre(a, getName());
                        } finally {
                            a = WDProjet.getInstance();
                            a.decrementerNbFenetreOuverte();
                        }
                    } else {
                        c1155i2 = c1155i;
                    }
                    a.ouvre(c1155i2);
                    if (c1155i == C1155i.UTILISE) {
                        if (WDAppelContexte.getContexte().m2719e()) {
                            throw new C0662c();
                        }
                    }
                    return a;
                }
            }
            Object obj = this;
            a.m1406b(wDObjetArr, c1155i);
            if (c1155i == C1155i.FILLE) {
                c0509v = (C0509v) WDAppelContexte.getContexte().m2722h();
                if (c0509v != null) {
                    c0509v.ajouterFenetreFille(a);
                }
            }
            if (c1155i != C1155i.UTILISE) {
                c1155i2 = c1155i;
            } else {
                c1155i2 = C1155i.NON_MODALE;
                WDProjet.getInstance().incrementerNbFenetreOuverte();
                WDProjet.getInstance().fermerToutesFenetres(false, null);
                modifierReferenceFenetre(a, getName());
            }
            try {
                a.ouvre(c1155i2);
                if (c1155i == C1155i.UTILISE) {
                    if (WDAppelContexte.getContexte().m2719e()) {
                        throw new C0662c();
                    }
                }
                return a;
            } catch (WDException e2) {
                throw e2;
            } catch (WDException e22) {
                throw e22;
            }
        } catch (WDException e222) {
            throw e222;
        } catch (WDException e2222) {
            throw e2222;
        }
    }

    public C0509v ouvre(C1155i c1155i, String str, int i, int i2, boolean z, boolean z2, WDObjet[] wDObjetArr) {
        C1155i c1155i2;
        C0509v a = estOuverte() ? m1401a() : this;
        a.m1406b(wDObjetArr, c1155i);
        if (c1155i == C1155i.UTILISE) {
            C1155i c1155i3 = C1155i.NON_MODALE;
            WDProjet.getInstance().incrementerNbFenetreOuverte();
            try {
                WDProjet.getInstance().fermerToutesFenetres(false, null);
                modifierReferenceFenetre(a, getName());
                c1155i2 = c1155i3;
            } finally {
                a = WDProjet.getInstance();
                a.decrementerNbFenetreOuverte();
            }
        } else {
            c1155i2 = c1155i;
        }
        if (c1155i2 == C1155i.FILLE) {
            C0509v c0509v = (C0509v) WDAppelContexte.getContexte().m2722h();
            if (c0509v != null) {
                try {
                    c0509v.ajouterFenetreFille(a);
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        int[] iArr = new int[4];
        if (i == -1 || i2 == -1) {
            iArr[0] = this.db;
            iArr[1] = this.B;
            iArr[2] = this.yc;
        } else {
            try {
                iArr[0] = i;
                iArr[1] = i2;
                iArr[2] = 0;
            } catch (WDException e2) {
                throw e2;
            }
        }
        if (!z) {
            try {
                iArr[3] = 1;
            } catch (WDException e22) {
                throw e22;
            }
        }
        try {
            a.setOptionOuverture(iArr);
            a.setAlias(str);
            a.ouvre(c1155i2);
            if (c1155i == C1155i.UTILISE) {
                if (WDAppelContexte.getContexte().m2719e()) {
                    throw new C0662c();
                }
            }
            return a;
        } catch (WDException e222) {
            throw e222;
        } catch (WDException e2222) {
            throw e2222;
        }
    }

    public void ouvre(C1155i c1155i) {
        WDProjet.getInstance().notifOuvertureFenetre(this);
        creerFenetre(c1155i);
        initialiserObjet();
        String titreSuivant = WDProjet.getInstance().getTitreSuivant();
        if (titreSuivant != null) {
            try {
                setTitre(titreSuivant);
            } catch (WDException e) {
                throw e;
            }
        }
        try {
            if (this.Wc != null) {
                setXInitial(this.Wc[0]);
                setYInitial(this.Wc[1]);
                this.yc = this.Wc[2];
                this.Wc = null;
            }
            this.Yc = true;
            this.ad = true;
            majOrdreNavigation(this);
            WDProjet.getInstance().incrementerNbFenetreOuverte();
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void parcourirChamp(C0546j c0546j, boolean z) {
        this.Mc.m8350a(c0546j, z);
    }

    public void parcourirObjetAPCode(C0546j c0546j, boolean z) {
        this.Mc.m8358b(c0546j, z);
    }

    public void raz(boolean z) {
        this.Mc.m8354a(z);
    }

    public void release() {
        try {
            super.release();
            this.id = null;
            this.Nc = null;
            if (this.ed != null) {
                this.ed.clear();
                this.ed = null;
            }
            try {
                this.Lc = null;
                this.Nc = "";
                this.Uc = null;
                if (this.Ac != null) {
                    this.Ac.clear();
                    this.Ac = null;
                }
                try {
                    if (this.bd != null) {
                        this.bd.clear();
                        this.bd = null;
                    }
                    try {
                        this.Jc = null;
                        this.Wc = null;
                        if (this.xc != null) {
                            this.xc.clear();
                            this.xc = null;
                        }
                        try {
                            if (this.Ic != null) {
                                this.Ic.clear();
                                this.Ic = null;
                            }
                            try {
                                if (this.Bc != null) {
                                    this.Bc.clear();
                                    this.Bc = null;
                                }
                                try {
                                    if (this.cd != null) {
                                        while (!this.cd.isEmpty()) {
                                            fb fbVar = (fb) this.cd.remove(0);
                                            if (fbVar != null) {
                                                try {
                                                    fbVar.release();
                                                } catch (WDException e) {
                                                    throw e;
                                                }
                                            }
                                        }
                                        this.cd = null;
                                    }
                                    try {
                                        if (this.Xc != null) {
                                            C0691a.m2860a(this.Xc.isEmpty(), ld[11]);
                                            this.Xc.m6799a();
                                            this.Xc = null;
                                        }
                                        try {
                                            this.Vc = null;
                                            this.Ec = null;
                                            this.Cc = null;
                                            if (this.Oc != null) {
                                                this.Oc.clear();
                                                this.Oc = null;
                                            }
                                            try {
                                                if (this.Mc != null) {
                                                    this.Mc.m8368j();
                                                    this.Mc = null;
                                                }
                                                try {
                                                    if (this.Sc != null) {
                                                        this.Sc.mo3309f();
                                                        this.Sc = null;
                                                    }
                                                } catch (WDException e2) {
                                                    throw e2;
                                                }
                                            } catch (WDException e22) {
                                                throw e22;
                                            }
                                        } catch (WDException e222) {
                                            throw e222;
                                        }
                                    } catch (WDException e2222) {
                                        throw e2222;
                                    }
                                } catch (WDException e22222) {
                                    throw e22222;
                                }
                            } catch (WDException e222222) {
                                throw e222222;
                            }
                        } catch (WDException e2222222) {
                            throw e2222222;
                        }
                    } catch (WDException e22222222) {
                        throw e22222222;
                    }
                } catch (WDException e222222222) {
                    throw e222222222;
                }
            } catch (WDException e2222222222) {
                throw e2222222222;
            }
        } catch (WDException e22222222222) {
            throw e22222222222;
        }
    }

    public void removeObjAPCode(C0489p c0489p) {
        this.Mc.m8351a(c0489p);
    }

    public abstract void restaure();

    public boolean restaurerValeur() {
        return this.Mc.m8364f();
    }

    public void runAutoProc() {
    }

    public void sauverValeur() {
        try {
            if (this.Mc != null) {
                this.Mc.m8367i();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void screenToSource(String str) {
        verifierOuverte();
        C0489p o = WDAppelContexte.getContexte().m2728o();
        if (o != null) {
            try {
                fb fenetreInterne = o instanceof fb ? (fb) o : o.getFenetreInterne();
                if (fenetreInterne != null) {
                    try {
                        if (o.getParentOfType(bb.class) != null) {
                            fenetreInterne.screenToSource(str);
                            return;
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
            } catch (WDException e2) {
                throw e2;
            }
        }
        this.Mc.m8352a(str);
    }

    public void setAlias(String str) {
        modifAliasFenetre(str, false);
    }

    public void setAltitude(int i) {
        erreurAppelPropriete(C0745b.m3219a(ld[3]));
    }

    public void setBoutonAbandon(gc gcVar) {
        if (gcVar != null) {
            try {
                this.Uc = gcVar;
            } catch (WDException e) {
                throw e;
            }
        }
    }

    public final void setChampPrecedent(String str) {
        this.Jc = str;
    }

    public void setFenetreCree(boolean z) {
        this.Yc = z;
    }

    public void setFichierParcouru(String str) {
        this.Vc = str;
    }

    public void setFinOuverture(boolean z) {
        this.gd = z;
    }

    public void setGroupe(WDObjet wDObjet) {
        erreurAppelPropriete(C0745b.m3219a(ld[9]));
    }

    public void setIndiceChampCourant(int i) {
        this.Tc = i;
    }

    public void setLibelle(String str) {
        setTitre(str);
    }

    public void setNomFenetre(String str) {
        setNom(str);
    }

    public void setNumTab(int i) {
        erreurAppelPropriete(C0745b.m3219a(ld[10]));
    }

    public void setOptionOuverture(int[] iArr) {
        this.Wc = iArr;
    }

    protected void setPersistant(boolean z) {
        this.e = z;
    }

    public void setPlan(int i) {
        try {
            if (this.Qc != i) {
                C0489p b = C1439b.m10105d().m10104b();
                try {
                    this.Qc = i;
                    parcourirChamp(new C1150e(this, i), false);
                    if (isFenetreCree()) {
                        if (b != null) {
                            try {
                                if (b.getFenetreMere() == this) {
                                    try {
                                        if (!b.isChamp() || ((gc) b).isAffiche()) {
                                            return;
                                        }
                                    } catch (WDException e) {
                                        throw e;
                                    }
                                }
                            } catch (WDException e2) {
                                throw e2;
                            }
                        }
                        gc premierChamp = getPremierChamp();
                        if (premierChamp != null) {
                            try {
                                premierChamp.prendreFocus();
                            } catch (WDException e22) {
                                throw e22;
                            }
                        }
                    }
                } catch (WDException e222) {
                    throw e222;
                } catch (WDException e2222) {
                    throw e2222;
                }
            }
        } catch (WDException e22222) {
            throw e22222;
        }
    }

    public void setPlan(String str) {
        super.setPlan(C0725i.m3064d(str));
    }

    public boolean setPositionChamp(int i, int i2, int i3) {
        return false;
    }

    protected void setPositionFenetre(int i) {
        this.yc = i;
    }

    public void setRubriqueParcourue(String str) {
        this.Ec = str;
    }

    public void setTitre(String str) {
        try {
            this.id = str;
            appliquerTitreFenetre(this.id);
            if (!isAvecBarreDeTitre() && isFenetreCree()) {
                WDObjet a = this.Mc.m8344a(Kc, true);
                if (a == null) {
                    a = this.Mc.m8344a(Zc, true);
                }
                if (a != null) {
                    try {
                        if (a.isLibelle()) {
                            a.setLibelle(str);
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        setValeur(wDObjet.getString());
    }

    public void setValeur(String str) {
        setTitre(str);
    }

    public void setValeurRenvoyee(WDObjet wDObjet) {
        this.Dc = wDObjet.getClone();
    }

    public void sourceToScreen(String str) {
        verifierOuverte();
        C0489p o = WDAppelContexte.getContexte().m2728o();
        if (o != null) {
            try {
                fb fenetreInterne = o instanceof fb ? (fb) o : o.getFenetreInterne();
                if (fenetreInterne != null) {
                    try {
                        if (o.getParentOfType(bb.class) != null) {
                            fenetreInterne.sourceToScreen(str);
                            return;
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
            } catch (WDException e2) {
                throw e2;
            }
        }
        this.Mc.m8361c(str);
    }

    public final void supprimerEcouteurFenetre(C1162n c1162n) {
        try {
            if (this.Bc != null) {
                this.Bc.remove(c1162n);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected void supprimerFenetreFille(C0509v c0509v) {
        if (this.ed != null) {
            Iterator it = this.ed.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference != null) {
                    try {
                        if (weakReference.get() == c0509v) {
                            it.remove();
                            return;
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
        }
    }

    public void supprimerFenetreInterne(fb fbVar) {
        try {
            if (this.cd != null) {
                this.cd.remove(fbVar);
                fbVar.release();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void supprimerOptionMenu(C0495i c0495i) {
        try {
            if (this.Oc != null) {
                this.Oc.remove(new Integer(c0495i.getNumeroOptionMenu()));
            }
            this.Mc.m8359b(c0495i.getNomOptionMenu());
        } catch (WDException e) {
            throw e;
        }
    }

    public void supprimerThread(C0933a c0933a) {
        try {
            if (this.Xc != null) {
                this.Xc.remove(c0933a);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void trierChampParOrdreNavigation() {
        Collections.sort(this.bd, new fr.pcsoft.wdjava.ui.champs.bb());
    }

    public void verifierOuverte() {
        try {
            if (!estOuverte()) {
                WDErreurManager.m2883a(C0745b.m3222b(ld[8], getNom().getString()));
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void viderListeChampNavigable() {
        this.Ac.clear();
    }
}
