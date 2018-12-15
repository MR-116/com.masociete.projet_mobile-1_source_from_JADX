package fr.pcsoft.wdjava.database.hf.requete.parsing;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.database.hf.C0855h;
import fr.pcsoft.wdjava.database.hf.WDHF_Contexte;
import fr.pcsoft.wdjava.database.hf.db;
import fr.pcsoft.wdjava.database.hf.eb;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class WDDescRequeteWDR implements C0537e, C0538a {
    private static final String uc = m1554z(m1555z("D\u0005\u0010\u001fq2\u0014\u0001\u0015|8\u0012\r\u000bg\"\u0014\r\u0005{*\u0010\u0007\ta.\u0002\u0004\u001f"));
    private Requete sc = null;
    private boolean tc = false;

    public static abstract class Element {
        public abstract String getAlias();

        public abstract String getCodeSQL(C0867b c0867b) throws WDInvalidSQLException;

        public abstract String getOption(EWDOptionRequete eWDOptionRequete);

        public abstract boolean isNumerique();

        public abstract void release();
    }

    protected static abstract class Clause extends Element {
        /* renamed from: a */
        private LinkedList<Element> f2292a = null;

        protected Clause() {
        }

        public final void ajouterElement(Element element) {
            if (this.f2292a == null) {
                this.f2292a = new LinkedList();
            }
            this.f2292a.add(element);
        }

        public String getAlias() {
            return null;
        }

        public final Element getElementAt(int i) {
            return (i < 0 || i >= getNbElement()) ? null : (Element) this.f2292a.get(i);
        }

        public final int getNbElement() {
            return this.f2292a != null ? this.f2292a.size() : 0;
        }

        public final String getNomOuAliasPremierFichier() {
            if (getNbElement() > 0) {
                Element elementAt = getElementAt(0);
                if (elementAt != null && (elementAt instanceof Item)) {
                    String alias = ((Item) elementAt).getAlias();
                    return C0808l.m4053k(alias) ? ((Item) elementAt).getNom() : alias;
                }
            }
            return null;
        }

        public String getOption(EWDOptionRequete eWDOptionRequete) {
            return null;
        }

        public boolean isNumerique() {
            return false;
        }

        public void release() {
            if (this.f2292a != null) {
                Iterator it = this.f2292a.iterator();
                while (it.hasNext()) {
                    ((Element) it.next()).release();
                }
                this.f2292a.clear();
                this.f2292a = null;
            }
        }
    }

    protected static class Delete extends Clause {
        public String getCodeSQL(C0867b c0867b) throws WDInvalidSQLException {
            return c0867b.m6110a(this);
        }
    }

    protected static class Expression extends Element {
        /* renamed from: a */
        private String f2293a = "";
        /* renamed from: b */
        private HashMap<EWDOptionRequete, String> f2294b = null;
        /* renamed from: c */
        private int f2295c = 0;
        /* renamed from: d */
        private String f2296d = "";
        /* renamed from: e */
        private LinkedList<Element> f2297e = null;
        /* renamed from: f */
        private String f2298f = "";

        public Expression(int i, String str, String str2) {
            this.f2295c = i;
            this.f2293a = str;
            this.f2296d = str2;
        }

        public final void ajouterElement(Element element) {
            if (this.f2297e == null) {
                this.f2297e = new LinkedList();
            }
            this.f2297e.add(element);
        }

        public final void ajouterOption(EWDOptionRequete eWDOptionRequete, String str) {
            if (this.f2294b == null) {
                this.f2294b = new HashMap();
            }
            this.f2294b.put(eWDOptionRequete, str);
        }

        public String getAlias() {
            return this.f2298f;
        }

        public String getCodeSQL(C0867b c0867b) throws WDInvalidSQLException {
            return c0867b.m6111a(this);
        }

        public final Element getElementAt(int i) {
            return (i < 0 || i >= getNbElement()) ? null : (Element) this.f2297e.get(i);
        }

        public final String getExpression() {
            return this.f2296d;
        }

        public final int getNbElement() {
            return this.f2297e != null ? this.f2297e.size() : 0;
        }

        public final String getOperateurOuFonction() {
            return this.f2293a;
        }

        public String getOption(EWDOptionRequete eWDOptionRequete) {
            return this.f2294b != null ? (String) this.f2294b.get(eWDOptionRequete) : null;
        }

        public final int getTypeOperateurOuFonction() {
            return this.f2295c;
        }

        public final boolean isFonctionChaine() {
            return (this.f2295c >= 42 && this.f2295c <= 46) || ((this.f2295c >= 75 && this.f2295c <= 96) || ((this.f2295c >= 50 && this.f2295c <= 57) || this.f2295c == 108 || this.f2295c == C0538a.Lb));
        }

        public final boolean isNumerique() {
            switch (this.f2295c) {
                case 0:
                    if (this.f2297e == null) {
                        return false;
                    }
                    Iterator it = this.f2297e.iterator();
                    while (it.hasNext()) {
                        if (!((Element) it.next()).isNumerique()) {
                            return false;
                        }
                    }
                    return true;
                case 2:
                case 4:
                case 5:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 54:
                case 55:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 77:
                case 78:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                    return true;
                case C0538a.Nb /*135*/:
                    return C0855h.m5973b(C0725i.m3064d(getOption(EWDOptionRequete.TYPE_CAST)));
                default:
                    return false;
            }
        }

        public void release() {
            this.f2293a = null;
            this.f2296d = null;
            this.f2298f = null;
            if (this.f2294b != null) {
                this.f2294b.clear();
                this.f2294b = null;
            }
            if (this.f2297e != null) {
                Iterator it = this.f2297e.iterator();
                while (it.hasNext()) {
                    ((Element) it.next()).release();
                }
                this.f2297e.clear();
                this.f2297e = null;
            }
        }

        public final void setAlias(String str) {
            this.f2298f = str;
        }
    }

    public static abstract class Item extends Element {
        /* renamed from: a */
        private String f2299a = "";
        /* renamed from: b */
        private String f2300b = "";
        /* renamed from: c */
        private HashMap<EWDOptionRequete, String> f2301c = null;

        public final void ajouterOption(EWDOptionRequete eWDOptionRequete, String str) {
            if (this.f2301c == null) {
                this.f2301c = new HashMap();
            }
            this.f2301c.put(eWDOptionRequete, str);
        }

        public String getAlias() {
            return this.f2299a;
        }

        public final String getNom() {
            return this.f2300b;
        }

        public String getOption(EWDOptionRequete eWDOptionRequete) {
            return this.f2301c != null ? (String) this.f2301c.get(eWDOptionRequete) : null;
        }

        public void release() {
            this.f2300b = null;
            this.f2299a = null;
            if (this.f2301c != null) {
                this.f2301c.clear();
                this.f2301c = null;
            }
        }

        public final void setAlias(String str) {
            this.f2299a = str;
        }

        public final void setNom(String str) {
            this.f2300b = str;
        }
    }

    protected static class Fichier extends Item {
        public String getCodeSQL(C0867b c0867b) throws WDInvalidSQLException {
            return c0867b.m6112a(this);
        }

        public boolean isNumerique() {
            return false;
        }
    }

    protected static class From extends Clause {
        public String getCodeSQL(C0867b c0867b) throws WDInvalidSQLException {
            return c0867b.m6113a(this);
        }
    }

    protected static class GroupBy extends Clause {
        public String getCodeSQL(C0867b c0867b) throws WDInvalidSQLException {
            return c0867b.m6114a(this);
        }
    }

    protected static class Having extends Clause {
        public String getCodeSQL(C0867b c0867b) throws WDInvalidSQLException {
            return c0867b.m6115a(this);
        }
    }

    protected static class Insert extends Clause {
        public String getCodeSQL(C0867b c0867b) throws WDInvalidSQLException {
            return c0867b.m6116a(this);
        }
    }

    protected static class Jointure extends Element {
        /* renamed from: a */
        public static final int f2302a = 2;
        /* renamed from: d */
        public static final int f2303d = 3;
        /* renamed from: g */
        public static final int f2304g = 0;
        /* renamed from: h */
        public static final int f2305h = 1;
        /* renamed from: b */
        private Element f2306b = null;
        /* renamed from: c */
        private boolean f2307c = false;
        /* renamed from: e */
        private int f2308e = 0;
        /* renamed from: f */
        private Element f2309f = null;
        /* renamed from: i */
        private boolean f2310i = false;
        /* renamed from: j */
        private Element f2311j = null;

        public String getAlias() {
            return null;
        }

        public String getCodeSQL(C0867b c0867b) throws WDInvalidSQLException {
            return c0867b.m6117a(this);
        }

        public final Element getConditionON() {
            return this.f2311j;
        }

        public String getOption(EWDOptionRequete eWDOptionRequete) {
            return null;
        }

        public final Element getPartieDroite() {
            return this.f2306b;
        }

        public final Element getPartieGauche() {
            return this.f2309f;
        }

        public final int getType() {
            return this.f2308e;
        }

        public boolean isNumerique() {
            return false;
        }

        public final boolean isTableDroite() {
            return this.f2310i;
        }

        public final boolean isTableGauche() {
            return this.f2307c;
        }

        public void release() {
            if (this.f2309f != null) {
                this.f2309f.release();
                this.f2309f = null;
            }
            if (this.f2306b != null) {
                this.f2306b.release();
                this.f2306b = null;
            }
            if (this.f2311j != null) {
                this.f2311j.release();
                this.f2311j = null;
            }
        }

        public final void setConditionON(Element element) {
            this.f2311j = element;
        }

        public final void setPartieDroite(Element element, boolean z) {
            this.f2306b = element;
            this.f2310i = z;
        }

        public final void setPartieGauche(Element element, boolean z) {
            this.f2309f = element;
            this.f2307c = z;
        }

        public final void setType(int i) {
            this.f2308e = i;
        }
    }

    protected static class Limit extends Clause {
        /* renamed from: d */
        public static final int f2312d = 4;
        /* renamed from: e */
        public static final int f2313e = 0;
        /* renamed from: g */
        public static final int f2314g = 1;
        /* renamed from: i */
        public static final int f2315i = 3;
        /* renamed from: k */
        public static final int f2316k = 2;
        /* renamed from: b */
        private Parametre f2317b = null;
        /* renamed from: c */
        private Parametre f2318c = null;
        /* renamed from: f */
        private int f2319f = 0;
        /* renamed from: h */
        private int f2320h = 0;
        /* renamed from: j */
        private int f2321j;

        public String getCodeSQL(C0867b c0867b) throws WDInvalidSQLException {
            return c0867b.mo3180a(this);
        }

        public final int getNbEnregs() {
            return this.f2319f;
        }

        public final int getOffset() {
            return this.f2320h;
        }

        public final Parametre getParamNbEnregs() {
            return this.f2318c;
        }

        public final Parametre getParamOffset() {
            return this.f2317b;
        }

        public final int getType() {
            return this.f2321j;
        }

        public void release() {
            super.release();
            if (this.f2318c != null) {
                this.f2318c.release();
                this.f2318c = null;
            }
            if (this.f2317b != null) {
                this.f2317b.release();
                this.f2317b = null;
            }
        }

        public final void setNbEnregs(int i) {
            this.f2319f = i;
        }

        public final void setNbEnregs(Parametre parametre) {
            this.f2318c = parametre;
        }

        public final void setOffset(int i) {
            this.f2320h = i;
        }

        public final void setOffset(Parametre parametre) {
            this.f2317b = parametre;
        }

        public final void setType(int i) {
            this.f2321j = i;
        }
    }

    protected static class Literal extends Element {
        /* renamed from: a */
        private String f2322a = null;
        /* renamed from: b */
        private int f2323b = WDChaine.m2421c();
        /* renamed from: c */
        private String f2324c = "";

        public String getAlias() {
            return this.f2322a;
        }

        public String getCodeSQL(C0867b c0867b) throws WDInvalidSQLException {
            return this.f2324c;
        }

        public String getOption(EWDOptionRequete eWDOptionRequete) {
            return null;
        }

        public final String getValeur() {
            return this.f2324c;
        }

        public boolean isNumerique() {
            switch (this.f2323b) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                case 14:
                    return true;
                default:
                    return false;
            }
        }

        public void release() {
            this.f2324c = null;
        }

        public void setAlias(String str) {
            this.f2322a = str;
        }

        public final void setTypeWL(int i) {
            this.f2323b = i;
        }

        public final void setValeur(String str) {
            this.f2324c = str;
        }
    }

    public static class OrderBy extends Clause {
        /* renamed from: b */
        private int f2325b = -1;
        /* renamed from: c */
        private int f2326c = -1;

        public /* bridge */ /* synthetic */ String getAlias() {
            return super.getAlias();
        }

        public String getCodeSQL(C0867b c0867b) throws WDInvalidSQLException {
            return c0867b.m6119a(this);
        }

        public /* bridge */ /* synthetic */ String getOption(EWDOptionRequete eWDOptionRequete) {
            return super.getOption(eWDOptionRequete);
        }

        public final int getPositionDebut() {
            return this.f2326c;
        }

        public final int getPositionFin() {
            return this.f2325b;
        }

        public /* bridge */ /* synthetic */ boolean isNumerique() {
            return super.isNumerique();
        }

        public /* bridge */ /* synthetic */ void release() {
            super.release();
        }

        public final void setPositionDebut(int i) {
            this.f2326c = i;
        }

        public final void setPositionFin(int i) {
            this.f2325b = i;
        }
    }

    protected static class Parametre extends Element {
        /* renamed from: a */
        private String f2327a = "";
        /* renamed from: b */
        private HashMap<EWDOptionRequete, String> f2328b = null;

        public final void ajouterOption(EWDOptionRequete eWDOptionRequete, String str) {
            if (this.f2328b == null) {
                this.f2328b = new HashMap();
            }
            this.f2328b.put(eWDOptionRequete, str);
        }

        public String getAlias() {
            return null;
        }

        public String getCodeSQL(C0867b c0867b) throws WDInvalidSQLException {
            return c0867b.m6120a(this);
        }

        public final String getNom() {
            return this.f2327a;
        }

        public String getOption(EWDOptionRequete eWDOptionRequete) {
            return this.f2328b != null ? (String) this.f2328b.get(eWDOptionRequete) : null;
        }

        public boolean isNumerique() {
            return false;
        }

        public void release() {
            this.f2327a = null;
        }

        public final void setNom(String str) {
            this.f2327a = str;
        }
    }

    public static class Requete extends Item {
        /* renamed from: d */
        public static final int f2329d = 6;
        /* renamed from: e */
        public static final int f2330e = 4;
        /* renamed from: h */
        public static final int f2331h = 7;
        /* renamed from: j */
        public static final int f2332j = 1;
        /* renamed from: k */
        public static final int f2333k = 3;
        /* renamed from: m */
        public static final int f2334m = 1;
        /* renamed from: n */
        public static final int f2335n = 4;
        /* renamed from: o */
        public static final int f2336o = 0;
        /* renamed from: p */
        public static final int f2337p = 2;
        /* renamed from: r */
        public static final int f2338r = 3;
        /* renamed from: s */
        public static final int f2339s = 5;
        /* renamed from: t */
        public static final int f2340t = 2;
        /* renamed from: z */
        private static final String f2341z = m6098z(m6099z("*x)P\u0006\f4!K\u0003\bx!A\u0010"));
        /* renamed from: f */
        private LinkedList<Requete> f2342f = null;
        /* renamed from: g */
        private Element f2343g;
        /* renamed from: i */
        private HashMap<Class<Clause>, Clause> f2344i = new HashMap();
        /* renamed from: l */
        private boolean f2345l = false;
        /* renamed from: q */
        private int f2346q = 1;
        /* renamed from: u */
        private String f2347u = "";

        public Requete(int i) {
            this.f2346q = i;
        }

        /* renamed from: z */
        private static String m6098z(char[] cArr) {
            int length = cArr.length;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case 0:
                        i2 = 105;
                        break;
                    case 1:
                        i2 = 20;
                        break;
                    case 2:
                        i2 = 72;
                        break;
                    case 3:
                        i2 = 37;
                        break;
                    default:
                        i2 = 117;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            return new String(cArr).intern();
        }

        /* renamed from: z */
        private static char[] m6099z(String str) {
            char[] toCharArray = str.toCharArray();
            if (toCharArray.length < 2) {
                toCharArray[0] = (char) (toCharArray[0] ^ 117);
            }
            return toCharArray;
        }

        public final void ajouterClause(Element element) {
            Object update;
            if (element instanceof Clause) {
                Clause clause = (Clause) element;
            } else {
                switch (this.f2346q) {
                    case 3:
                        update = new Update();
                        break;
                    case 4:
                        update = new Insert();
                        break;
                    case 5:
                        update = new Delete();
                        break;
                    default:
                        C0691a.m2856a(f2341z);
                        return;
                }
                update.ajouterElement(element);
            }
            this.f2344i.put(update.getClass(), update);
        }

        public final void ajouterRequeteUnion(Requete requete) {
            ajouterRequeteUnion(requete, false);
        }

        public final void ajouterRequeteUnion(Requete requete, boolean z) {
            if (this.f2342f == null) {
                this.f2342f = new LinkedList();
            }
            requete.f2345l = z;
            this.f2342f.add(requete);
        }

        public <T extends Clause> T getClause(Class<T> cls) {
            return (Clause) this.f2344i.get(cls);
        }

        public String getCodeSQL(C0867b c0867b) throws WDInvalidSQLException {
            return c0867b.m6121a(this, null);
        }

        public final int getNbRequetesUnion() {
            return this.f2342f != null ? this.f2342f.size() : 0;
        }

        public final Element getOperande() {
            return this.f2343g;
        }

        public final Requete getRequeteUnionAt(int i) {
            return (i < 0 || i >= getNbRequetesUnion()) ? null : (Requete) this.f2342f.get(i);
        }

        public final int getType() {
            return this.f2346q;
        }

        public boolean isNumerique() {
            return false;
        }

        public final boolean isUnionAvecDoublons() {
            return this.f2345l;
        }

        public void release() {
            Iterator it;
            super.release();
            if (this.f2344i != null) {
                for (Clause release : this.f2344i.values()) {
                    release.release();
                }
                this.f2344i.clear();
                this.f2344i = null;
            }
            if (this.f2342f != null) {
                it = this.f2342f.iterator();
                while (it.hasNext()) {
                    ((Requete) it.next()).release();
                }
                this.f2342f.clear();
                this.f2342f = null;
            }
            this.f2347u = null;
        }

        public final void setCodeOriginal(String str) {
            this.f2347u = str;
        }

        public final void setOperande(Element element) {
            this.f2343g = element;
        }
    }

    protected static class Rubrique extends Item {
        /* renamed from: d */
        public static final int f2348d = 0;
        /* renamed from: f */
        public static final int f2349f = 1;
        /* renamed from: e */
        private String f2350e = "";
        /* renamed from: g */
        private String f2351g = "";

        public final String getAliasFichier() {
            return this.f2351g;
        }

        public String getCodeSQL(C0867b c0867b) throws WDInvalidSQLException {
            return c0867b.m6122a(this);
        }

        public final String getNomFichier() {
            return this.f2350e;
        }

        public final eb getRubriqueAnalyse() {
            db e = WDHF_Contexte.getInstance().m5015e(getNomFichier());
            if (e == null) {
                return null;
            }
            String nom = getNom();
            int indexOf = nom.indexOf(46);
            if (indexOf >= 0) {
                nom = nom.substring(indexOf + 1);
            }
            return (eb) e.mo2721b(nom);
        }

        public boolean isNumerique() {
            eb rubriqueAnalyse = getRubriqueAnalyse();
            return rubriqueAnalyse != null ? rubriqueAnalyse.isNumerique() : false;
        }

        public void release() {
            super.release();
            this.f2350e = null;
            this.f2351g = null;
        }

        public final void setAliasFichier(String str) {
            this.f2351g = str;
        }

        public final void setNomFichier(String str) {
            this.f2350e = str;
        }
    }

    protected static class Select extends Clause {
        /* renamed from: b */
        public static final int f2352b = 0;
        /* renamed from: d */
        public static final int f2353d = 1;
        /* renamed from: c */
        private int f2354c = 1;

        public String getCodeSQL(C0867b c0867b) throws WDInvalidSQLException {
            return c0867b.m6123a(this);
        }

        public final int getType() {
            return this.f2354c;
        }

        public final void setType(int i) {
            this.f2354c = i;
        }
    }

    protected static class Set extends Clause {
        public String getCodeSQL(C0867b c0867b) throws WDInvalidSQLException {
            return c0867b.m6124a(this);
        }
    }

    protected static class Update extends Clause {
        public String getCodeSQL(C0867b c0867b) throws WDInvalidSQLException {
            return c0867b.m6125a(this);
        }
    }

    protected static class Where extends Clause {
        public String getCodeSQL(C0867b c0867b) throws WDInvalidSQLException {
            return c0867b.m6126a(this);
        }
    }

    /* renamed from: z */
    private static String m1554z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 103;
                    break;
                case 1:
                    i2 = 64;
                    break;
                case 2:
                    i2 = 72;
                    break;
                case 3:
                    i2 = 90;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1555z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 50);
        }
        return toCharArray;
    }

    public final synchronized java.lang.String genererCodeSQL(fr.pcsoft.wdjava.database.hf.C0833j r8, java.util.Map<java.lang.String, fr.pcsoft.wdjava.core.WDObjet> r9) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR.genererCodeSQL(fr.pcsoft.wdjava.database.hf.j, java.util.Map):java.lang.String. bs: [B:8:0x000b, B:28:0x002b, B:42:0x0058, B:50:0x0062]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/70807318.run(Unknown Source)
*/
        /*
        r7 = this;
        r1 = 0;
        monitor-enter(r7);
        r2 = 0;
        r0 = r7.tc;	 Catch:{ WDInvalidSQLException -> 0x0031, all -> 0x006a }
        if (r0 == 0) goto L_0x0015;	 Catch:{ WDInvalidSQLException -> 0x0031, all -> 0x006a }
    L_0x0007:
        r0 = "";	 Catch:{ WDInvalidSQLException -> 0x0031, all -> 0x006a }
        if (r1 == 0) goto L_0x000e;
    L_0x000b:
        r2.m6129b();	 Catch:{ WDInvalidSQLException -> 0x0010 }
    L_0x000e:
        monitor-exit(r7);
        return r0;
    L_0x0010:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0012 }
    L_0x0012:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
    L_0x0015:
        r0 = r7.sc;	 Catch:{ WDInvalidSQLException -> 0x0031, all -> 0x006a }
        if (r0 != 0) goto L_0x001f;	 Catch:{ WDInvalidSQLException -> 0x0031, all -> 0x006a }
    L_0x0019:
        r0 = r7.initArbre();	 Catch:{ WDInvalidSQLException -> 0x0031, all -> 0x006a }
        r7.sc = r0;	 Catch:{ WDInvalidSQLException -> 0x0031, all -> 0x006a }
    L_0x001f:
        r2 = r8.mo3163e();	 Catch:{ WDInvalidSQLException -> 0x0031, all -> 0x006a }
        r0 = r7.sc;	 Catch:{ WDInvalidSQLException -> 0x006d }
        r0 = r2.m6121a(r0, r9);	 Catch:{ WDInvalidSQLException -> 0x006d }
        if (r2 == 0) goto L_0x000e;
    L_0x002b:
        r2.m6129b();	 Catch:{ WDInvalidSQLException -> 0x002f }
        goto L_0x000e;
    L_0x002f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0012 }
    L_0x0031:
        r0 = move-exception;
        r2 = r1;
    L_0x0033:
        r3 = 1;
        r7.tc = r3;	 Catch:{ WDInvalidSQLException -> 0x005d }
        r3 = r0.m6100k();	 Catch:{ WDInvalidSQLException -> 0x005d }
        if (r3 == 0) goto L_0x0056;	 Catch:{ WDInvalidSQLException -> 0x005d }
    L_0x003c:
        r3 = uc;	 Catch:{ WDInvalidSQLException -> 0x005d }
        r4 = 2;	 Catch:{ WDInvalidSQLException -> 0x005d }
        r4 = new java.lang.String[r4];	 Catch:{ WDInvalidSQLException -> 0x005d }
        r5 = 0;	 Catch:{ WDInvalidSQLException -> 0x005d }
        r6 = r7.getNomLogique();	 Catch:{ WDInvalidSQLException -> 0x005d }
        r4[r5] = r6;	 Catch:{ WDInvalidSQLException -> 0x005d }
        r5 = 1;	 Catch:{ WDInvalidSQLException -> 0x005d }
        r0 = r0.getMessage();	 Catch:{ WDInvalidSQLException -> 0x005d }
        r4[r5] = r0;	 Catch:{ WDInvalidSQLException -> 0x005d }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r3, r4);	 Catch:{ WDInvalidSQLException -> 0x005d }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ WDInvalidSQLException -> 0x005d }
    L_0x0056:
        if (r2 == 0) goto L_0x005b;
    L_0x0058:
        r2.m6129b();	 Catch:{ WDInvalidSQLException -> 0x0066 }
    L_0x005b:
        r0 = r1;
        goto L_0x000e;
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x005f }
    L_0x005f:
        r0 = move-exception;
    L_0x0060:
        if (r2 == 0) goto L_0x0065;
    L_0x0062:
        r2.m6129b();	 Catch:{ WDInvalidSQLException -> 0x0068 }
    L_0x0065:
        throw r0;	 Catch:{ all -> 0x0012 }
    L_0x0066:
        r0 = move-exception;	 Catch:{ all -> 0x0012 }
        throw r0;	 Catch:{ all -> 0x0012 }
    L_0x0068:
        r0 = move-exception;	 Catch:{ all -> 0x0012 }
        throw r0;	 Catch:{ all -> 0x0012 }
    L_0x006a:
        r0 = move-exception;
        r2 = r1;
        goto L_0x0060;
    L_0x006d:
        r0 = move-exception;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR.genererCodeSQL(fr.pcsoft.wdjava.database.hf.j, java.util.Map):java.lang.String");
    }

    public abstract String getAliasFichier(int i);

    public abstract String getCodeSQLOriginal();

    public abstract String getNomFichier(int i);

    public abstract String getNomLogique();

    public Requete getRacineArbreSQL() {
        return this.tc ? null : this.sc;
    }

    public abstract Requete initArbre() throws WDInvalidSQLException;

    public void release() {
        if (this.sc != null) {
            this.sc.release();
            this.sc = null;
        }
    }

    public String toString() {
        return getNomLogique();
    }
}
