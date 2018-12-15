package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import fr.pcsoft.wdjava.core.C0505p;
import fr.pcsoft.wdjava.core.C0507r;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.C0727l;
import fr.pcsoft.wdjava.core.WDIndirection;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.poo.C0735q;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.p032m.C0503o;
import fr.pcsoft.wdjava.p032m.C0933a;
import fr.pcsoft.wdjava.p032m.C0934b;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.C0504y;
import fr.pcsoft.wdjava.ui.champs.C0546j;
import fr.pcsoft.wdjava.ui.champs.C1153s;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.mc;
import fr.pcsoft.wdjava.ui.champs.xc;
import fr.pcsoft.wdjava.ui.menu.C1467b;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class hb extends mc implements C0504y, C0505p, fb, C0507r, C0503o {
    private static final String[] Fc = new String[]{m1544z(m1545z("hEla-RA~b;\u0001Ly.=IIni;S\bpo~GMrä*SM<g0UMn`;\u0001Ks|,D[la0EIrz~@]<`1L\b")), m1544z(m1545z("fXH\u0017")), m1544z(m1545z("hEla-RA~b;\u0001Ly.3NLuh7DZ<b?\u0001Zõh·SMrm;\u0001Ly.2@\bzk0D\\nk~HFhk,OM<j?O[<b;\u0001oKJ\u000e\u0001Li..SGvk*\u000f")), m1544z(m1545z("LXQ")), m1544z(m1545z("fX^")), m1544z(m1545z("\u0002nY@\u001buzYQ\u0017o|Y\\\u0010d")), m1544z(m1545z("mI<b7R\\y.:D[<z,DIx}~MIrm·R\bxk.TAo.2@\bzk0Ë\\nk~HFhk,OM<j;WZ}g*\u0001Âh|;\u0001^uj;\u000f")), m1544z(m1545z("dZnk+S\bx)7O[ho0BA}z7NF<jyTFy.=MIo};\u0001Ly.8DFyz,D\bu`*DZrkp")), m1544z(m1545z("\u0002mN\\\u0001ojC^\u001fsiQQ\u001d`dPL\u001fbc")), m1544z(m1545z("\u0002x_A\u001adwXK\u0012biNO\nhgRQ\u0019mg^O\u0012d")), m1544z(m1545z("GXQ"))};
    public boolean Ac = false;
    private HashMap Bc = new HashMap();
    private boolean Cc = false;
    protected C1153s Dc = null;
    protected LinkedList<C0525y> Ec = null;
    private C0934b xc = null;
    private int yc = 0;
    protected gc zc = null;

    public hb() {
        initConteneurManager();
    }

    /* renamed from: a */
    private static final void m1543a(hb hbVar, String str) {
        try {
            WDProjet instance = WDProjet.getInstance();
            Field field = C0735q.m3130e(Fc[4] + C0725i.m3031a(instance.getNom(), false)).getField(Fc[3] + C0725i.m3031a(str, false));
            if (field.get(instance) != hbVar) {
                field.set(instance, hbVar);
            }
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            C0691a.m2863b(Fc[2], e2);
        }
    }

    public static final Class getClasseGenFenetreInterne(String str) {
        Class cls = null;
        if (str.indexOf(46) > 0) {
            try {
                cls = Class.forName(str);
            } catch (Exception e) {
                C0691a.m2857a(Fc[0] + str, e);
            }
        } else {
            String str2;
            if (str.startsWith(Fc[1])) {
                str2 = str;
            } else {
                str2 = WDProjet.getInstance().getNomLogiqueFenetreInterne(str);
                if (str2 != null) {
                    str2 = Fc[1] + C0725i.m3031a(str2, false);
                } else {
                    Object obj = cls;
                }
            }
            if (str2 != null) {
                try {
                    cls = C0735q.m3130e(str2);
                } catch (ClassNotFoundException e2) {
                }
            }
        }
        return cls;
    }

    public static final WDFenetreInterne load(String str, C0508h c0508h, gc gcVar) {
        WDFenetreInterne wDFenetreInterne;
        Class classeGenFenetreInterne = getClasseGenFenetreInterne(str);
        if (classeGenFenetreInterne != null) {
            try {
                wDFenetreInterne = (WDFenetreInterne) classeGenFenetreInterne.newInstance();
            } catch (Exception e) {
                C0691a.m2863b(Fc[7], e);
            }
            if (wDFenetreInterne != null) {
                try {
                    wDFenetreInterne.setFenetre(c0508h);
                    if (gcVar != null) {
                        wDFenetreInterne.setChampFenetreInterne(gcVar);
                    }
                    boolean isFenetreCree = c0508h.isFenetreCree();
                    try {
                        c0508h.setFenetreCree(false);
                        wDFenetreInterne.initialiserObjet();
                        m1543a(wDFenetreInterne, wDFenetreInterne.getName());
                    } finally {
                        c0508h.setFenetreCree(isFenetreCree);
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
            return wDFenetreInterne;
        }
        wDFenetreInterne = null;
        if (wDFenetreInterne != null) {
            wDFenetreInterne.setFenetre(c0508h);
            if (gcVar != null) {
                wDFenetreInterne.setChampFenetreInterne(gcVar);
            }
            boolean isFenetreCree2 = c0508h.isFenetreCree();
            c0508h.setFenetreCree(false);
            wDFenetreInterne.initialiserObjet();
            m1543a(wDFenetreInterne, wDFenetreInterne.getName());
        }
        return wDFenetreInterne;
    }

    /* renamed from: z */
    private static String m1544z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 33;
                    break;
                case 1:
                    i2 = 40;
                    break;
                case 2:
                    i2 = 28;
                    break;
                case 3:
                    i2 = 14;
                    break;
                default:
                    i2 = 94;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1545z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 94);
        }
        return toCharArray;
    }

    public final void addListener(C0525y c0525y) {
        if (this.Ec == null) {
            this.Ec = new LinkedList();
        }
        this.Ec.add(c0525y);
    }

    public void ajouter(String str, C0489p c0489p) {
        this.Dc.m8353a(str, c0489p);
    }

    public void ajouterMenuContextuel(C1467b c1467b) {
        if (c1467b != null) {
            ajouter(c1467b.getNomMenu(), (C0489p) c1467b);
        }
    }

    public void ajouterVariableGlobale(String str, WDObjet wDObjet) {
        this.Bc.put(str.toLowerCase(), wDObjet);
    }

    public void appliquerAncrage(int i, int i2, int i3, int i4, int i5) {
        this.Dc.mo3525a(i, i2, i3, i4, i5);
    }

    public void buildFullName(StringBuilder stringBuilder, boolean z) {
        if (!(this.zc == null || z)) {
            this.zc.buildFullName(stringBuilder, z);
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.append('.');
        }
        stringBuilder.append(getName());
    }

    public boolean canHandleHeightAnchoredToContentChildren() {
        return this.zc != null && C0727l.m3092b(this.zc.getAnchorOptions(), 7);
    }

    public boolean canHandleWidthAnchoredToContentChildren() {
        return this.zc != null && C0727l.m3092b(this.zc.getAnchorOptions(), 8);
    }

    public <T> T checkType(Class<T> cls) {
        if (this.zc == null) {
            return super.checkType(cls);
        }
        int flags = this.zc.getFlags();
        try {
            this.zc.setFlags(flags | 64);
            T checkType = super.checkType(cls);
            return checkType;
        } finally {
            this.zc.setFlags(flags);
        }
    }

    public WDObjet chercherVariableGlobale(String str) {
        return (WDObjet) this.Bc.get(str.toLowerCase());
    }

    protected void creerChamps() {
    }

    public void declarerGlobale(WDObjet[] wDObjetArr) {
    }

    public void enregistrerThread(C0933a c0933a) {
        if (this.xc == null) {
            this.xc = new C0934b();
        }
        this.xc.add(c0933a);
    }

    protected void erreurPassageParametreFenetre(int i, int i2) {
        String str = Fc[8];
        r1 = new String[3];
        r1[0] = C0745b.m3224c(Fc[9], getName());
        r1[1] = String.valueOf(i2);
        r1[2] = String.valueOf(i);
        WDErreurManager.m2883a(C0745b.m3222b(str, r1));
    }

    public final void execDeclarationGlobales(WDObjet... wDObjetArr) {
        WDAppelContexte.getContexte().m2715c(C0607n.Jg, this);
        try {
            declarerGlobale(wDObjetArr);
            if (this.Ec != null) {
                for (int size = this.Ec.size() - 1; size >= 0; size--) {
                    ((C0525y) this.Ec.get(size)).onLoad(this);
                }
            }
            this.Ac = true;
        } finally {
            WDAppelContexte.getContexte().m2736x();
        }
    }

    public void finInit() {
        this.Dc.m8366h();
        super.finInit();
        if (this.Ec != null) {
            for (int size = this.Ec.size() - 1; size >= 0; size--) {
                ((C0525y) this.Ec.get(size)).onFinInit(this);
            }
        }
    }

    public C0489p getChampFenetreInterne() {
        return this.zc;
    }

    public xc getConteneurManager() {
        return this.Dc;
    }

    public WDObjet getElement(String str) {
        WDObjet filsDirect = getFilsDirect(str);
        return filsDirect != null ? filsDirect : super.getElement(str);
    }

    public C0489p getFils(String str) {
        return this.Dc.m8344a(str, true);
    }

    public C0489p getFilsDirect(String str) {
        return this.Dc.m8344a(str, false);
    }

    public Iterator getLstFils() {
        return this.Dc.m8369k();
    }

    public String getNomType() {
        return C0745b.m3220a(Fc[5], new String[0]);
    }

    public WDObjet getPlan() {
        return new WDEntier4(getPlanActif());
    }

    public final int getPlanActif() {
        return this.yc;
    }

    public WDObjet getValeur() {
        return this.zc != null ? this.zc.getValeur() : new WDChaine();
    }

    public WDBooleen getVisible() {
        return this.zc != null ? this.zc.getVisible() : super.getVisible();
    }

    public void init() {
        this.Dc.m8365g();
        super.init();
    }

    protected abstract void initConteneurManager();

    public void initialiserObjet() {
        super.initialiserObjet();
        creerChamps();
    }

    public WDObjet invoquerMethode(String str, WDObjet... wDObjetArr) {
        String a = C0725i.m3031a(str, true);
        if (!str.startsWith(Fc[10])) {
            a = Fc[10] + a;
        }
        try {
            return C0735q.m3113a((WDObjet) this, a, wDObjetArr);
        } catch (Throwable e) {
            WDErreurManager.m2888b(e);
            return null;
        }
    }

    public boolean isConteneur() {
        return true;
    }

    public boolean isFenetreCree() {
        return getChampFenetreInterne() != null ? getChampFenetreInterne().isFenetreCree() : false;
    }

    public boolean isKeepAlive() {
        return this.Cc;
    }

    public final boolean isLoaded() {
        return this.Ac;
    }

    public void majOrdreNavigation(C0508h c0508h) {
        this.Dc.m8349a(c0508h);
    }

    public void majPlan(int i) {
        super.majPlan(i);
        this.Dc.m8356b(i);
    }

    public final void onDechargement() {
        if (this.xc != null && !this.xc.isEmpty()) {
            this.xc.m6800a(3000);
        }
    }

    public void parcourirChamp(C0546j c0546j, boolean z) {
        this.Dc.m8350a(c0546j, z);
    }

    public void parcourirObjetAPCode(C0546j c0546j, boolean z) {
        this.Dc.m8358b(c0546j, z);
    }

    protected void postInit() {
        runAutoProc();
        this.Dc.m8362d();
        super.postInit();
    }

    public void raz(boolean z) {
        super.raz(z);
        this.Dc.m8354a(z);
    }

    public void release() {
        if (this.Ec != null) {
            for (int size = this.Ec.size() - 1; size >= 0; size--) {
                ((C0525y) this.Ec.get(size)).onRelease(this);
            }
        }
        super.release();
        WDIndirection.razDerniereRecherche();
        if (this.Bc != null) {
            this.Bc.clear();
            this.Bc = null;
        }
        this.zc = null;
        if (this.Dc != null) {
            this.Dc.m8368j();
            this.Dc = null;
        }
        if (this.Ec != null) {
            this.Ec.clear();
            this.Ec = null;
        }
        if (this.xc != null) {
            C0691a.m2860a(this.xc.isEmpty(), Fc[6]);
            this.xc.m6799a();
            this.xc = null;
        }
    }

    public final void removeListener(C0525y c0525y) {
        if (this.Ec != null) {
            this.Ec.remove(c0525y);
        }
    }

    public void removeObjAPCode(C0489p c0489p) {
        this.Dc.m8351a(c0489p);
    }

    public boolean restaurerValeur() {
        boolean restaurerValeur = super.restaurerValeur();
        this.Dc.m8364f();
        return restaurerValeur;
    }

    public void runAutoProc() {
    }

    public void sauverValeur() {
        super.sauverValeur();
        if (this.Dc != null) {
            this.Dc.m8367i();
        }
    }

    public void screenToSource(String str) {
        super.screenToSource(str);
        this.Dc.m8352a(str);
    }

    public void setChampFenetreInterne(gc gcVar) {
        this.zc = gcVar;
    }

    public void setKeepAlive(boolean z) {
        this.Cc = z;
    }

    public void setPlan(int i) {
        this.yc = i;
        parcourirChamp(new cb(this, i), false);
    }

    public void setPlan(String str) {
        setPlan(C0725i.m3064d(str));
    }

    public boolean setPositionChamp(int i, int i2, int i3) {
        int _getX = _getX();
        int _getY = _getY();
        if (!super.setPositionChamp(i, i2, i3)) {
            return false;
        }
        this.Dc.m8357b(i - _getX, i2 - _getY, i3);
        return true;
    }

    public boolean setTailleChamp(int i, int i2, int i3) {
        this.Dc.m8347a((i3 & 2) > 0 ? i - this.U : i - _getLargeur(), (i3 & 2) > 0 ? i2 - this.p : i2 - _getHauteur(), i3);
        return super.setTailleChamp(i, i2, i3);
    }

    public void setTailleUtile(int i, int i2) {
        if (this.zc != null) {
            this.zc.setTailleUtile(i, i2);
        }
    }

    public void setValeur(WDObjet wDObjet) {
        if (this.zc != null) {
            this.zc.setValeur(wDObjet);
        }
    }

    public void setVisible(boolean z) {
        if (this.zc != null) {
            this.zc.setVisible(z);
        }
    }

    public void sourceToScreen(String str) {
        super.sourceToScreen(str);
        this.Dc.m8361c(str);
    }

    public void supprimerThread(C0933a c0933a) {
        if (this.xc != null) {
            this.xc.remove(c0933a);
        }
    }
}
