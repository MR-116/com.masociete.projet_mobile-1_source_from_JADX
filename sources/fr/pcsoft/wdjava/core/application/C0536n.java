package fr.pcsoft.wdjava.core.application;

import fr.pcsoft.wdjava.core.C0505p;
import fr.pcsoft.wdjava.core.C0507r;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p035c.C0667i;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.service.C0747a;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.ec;
import fr.pcsoft.wdjava.database.hf.bb;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0537e;
import fr.pcsoft.wdjava.p060p.C1013b;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.fenetre.C1155i;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: fr.pcsoft.wdjava.core.application.n */
public abstract class C0536n implements C0505p, C0507r {
    /* renamed from: C */
    public static final int f993C = 180;
    /* renamed from: E */
    public static final boolean f994E = (C0651k.m2644a(C0638a.SYSTEM, C0536n.m1550z(C0536n.m1551z("\u0012,\u000e{'\u001e7")), "").indexOf(C0536n.m1550z(C0536n.m1551z("Kk"))) >= 0);
    /* renamed from: G */
    public static final int f995G = 142;
    /* renamed from: J */
    public static final int f996J = 160;
    /* renamed from: K */
    private static final String[] f997K = new String[]{C0536n.m1550z(C0536n.m1551z("^\u0019eT\u0010)\reE\u001c3\u001coT\u001b(\u001a")), C0536n.m1550z(C0536n.m1551z("\u001b-")), C0536n.m1550z(C0536n.m1551z("\u00110C{9\u0018")), C0536n.m1550z(C0536n.m1551z(";\r")), C0536n.m1550z(C0536n.m1551z("5\u0017\u001aw8G\fs")), C0536n.m1550z(C0536n.m1551z(";:Rw0\t*Ru\u0019xUt0]9Et¿\t-E:;\u00121\u0000h¼\u001b¶R;\u001e¶E:6\u00122Mu\u0012*V'\t:\u0000~4\u0013,\u0000v0]/Ru?\u0018+")), C0536n.m1550z(C0536n.m1551z("7\u0015\u000fW\u0018R\u001ea[\u0014")), C0536n.m1550z(C0536n.m1551z("8-R \u000fDo'\u001c1T:9\u001cF'\u0010:To'\u0018,\u0000~0\u000eR&\u000e0Uh6\u0018,\u0000~ ]/Ru?\u0018+")), C0536n.m1550z(C0536n.m1551z("-\u001cO~0]1Otu\u000e*Pj:\u000f+É4")), C0536n.m1550z(C0536n.m1551z("42Pu&\u000e6Bv0];E:6\u0015>R}0\u000fLu\u001b6Cr<\u0018-\u0000M\u00110\u001a:")), C0536n.m1550z(C0536n.m1551z("1:\u0000t:\u0010=Ru\u0019:\u0000v4\u00138Uu\u0018+\u0000~r\u001c3Pr4\u001f:T:;\u0018Cu'\u000f:Sj:\u0013;\u0000j4\u000eq")), C0536n.m1550z(C0536n.m1551z("1:\u0000y=\u001c-S!]>Si:\u001e6É:µ]3A:9\u001c1Go0],Pó6\u00149Ió0]1\u0007&\tP{&],Uj%\u0012-Tó{")), C0536n.m1550z(C0536n.m1551z("^\u001elJ\u001d<\u001deN\n3\u0010nE\u0006(\u000fpU\u0007)\u001a"))};
    /* renamed from: b */
    public static final boolean f998b;
    /* renamed from: f */
    public static final boolean f999f = f1000j.startsWith(C0536n.m1550z(C0536n.m1551z("\n6N~:\n,")));
    /* renamed from: j */
    public static final String f1000j = System.getProperty(C0536n.m1550z(C0536n.m1551z("\u0012,\u000et4\u0010:"))).toLowerCase();
    /* renamed from: m */
    private static int f1001m = 0;
    /* renamed from: n */
    public static final int f1002n = 170;
    /* renamed from: o */
    public static final boolean f1003o;
    /* renamed from: t */
    private static String[] f1004t = null;
    /* renamed from: v */
    private static int f1005v = 1;
    /* renamed from: y */
    public static final int f1006y = 150;
    /* renamed from: A */
    private int[] f1007A = new int[]{5};
    /* renamed from: B */
    private String f1008B = Charset.defaultCharset().name();
    /* renamed from: D */
    private boolean f1009D = false;
    /* renamed from: F */
    private boolean f1010F = false;
    /* renamed from: H */
    private String f1011H = "";
    /* renamed from: I */
    private ArrayList<C0535j> f1012I = null;
    /* renamed from: a */
    private String[] f1013a = null;
    /* renamed from: c */
    protected boolean f1014c = false;
    /* renamed from: d */
    private HashMap<String, WeakReference<C0508h>> f1015d = null;
    /* renamed from: e */
    private ArrayList<C0508h> f1016e = new ArrayList(5);
    /* renamed from: g */
    protected String f1017g = "";
    /* renamed from: h */
    private String f1018h = "";
    /* renamed from: i */
    private int[] f1019i = new int[]{0};
    /* renamed from: k */
    private String f1020k = null;
    /* renamed from: l */
    private boolean f1021l = false;
    /* renamed from: p */
    private int[] f1022p = null;
    /* renamed from: q */
    protected final LinkedHashMap<String, C0508h> f1023q = new LinkedHashMap();
    /* renamed from: r */
    private boolean f1024r = true;
    /* renamed from: s */
    private HashMap f1025s = null;
    /* renamed from: u */
    private final HashMap f1026u = new HashMap();
    /* renamed from: w */
    private int f1027w = 0;
    /* renamed from: x */
    private HashMap<String, C0537e> f1028x;
    /* renamed from: z */
    private volatile int f1029z = 0;

    static {
        boolean z = !f999f && f1000j.startsWith(C0536n.m1550z(C0536n.m1551z("\u0010>C")));
        f998b = z;
        z = (f999f || f998b) ? false : true;
        f1003o = z;
    }

    public static final int getIndiceLangueCourante() {
        return f1005v;
    }

    public static final boolean isFrameworkUS() {
        String a = C0651k.m2644a(C0638a.BUILD, f997K[2], f997K[3]);
        return (a == null || a.equalsIgnoreCase(f997K[1])) ? false : true;
    }

    /* renamed from: z */
    private static String m1550z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 125;
                    break;
                case 1:
                    i2 = 95;
                    break;
                case 2:
                    i2 = 32;
                    break;
                case 3:
                    i2 = 26;
                    break;
                default:
                    i2 = 85;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1551z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 85);
        }
        return toCharArray;
    }

    protected void activationApplication() {
    }

    public WDObjet afficherDialogue(int i, String... strArr) {
        return WDObjet.NULL;
    }

    public WDObjet afficherSaisie(int i, WDObjet wDObjet, String... strArr) {
        return WDObjet.NULL;
    }

    public void ajouterAliasFenetre(String str, C0508h c0508h) {
        String toLowerCase = str.toLowerCase();
        if (this.f1015d == null) {
            this.f1015d = new HashMap();
        }
        this.f1015d.put(toLowerCase, new WeakReference(c0508h));
    }

    public final void ajouterEcouteurProjet(C0535j c0535j) {
        if (this.f1012I == null) {
            this.f1012I = new ArrayList(5);
        }
        this.f1012I.add(c0535j);
    }

    public void ajouterFenetre(String str, C0508h c0508h) {
        if (c0508h.getNomFenetre().compareTo(str) != 0) {
            c0508h.setNomFenetre(str);
        }
        this.f1023q.put(str.toLowerCase(), c0508h);
    }

    public void ajouterFenetreInterne(String str) {
        if (this.f1025s == null) {
            this.f1025s = new HashMap();
        }
        this.f1025s.put(C0808l.m4057o(str.toLowerCase()), str);
    }

    public void ajouterRequeteWDR(C0537e c0537e) {
        if (this.f1028x == null) {
            this.f1028x = new HashMap();
        }
        this.f1028x.put(C0808l.m4057o(c0537e.getNomLogique().toLowerCase()), c0537e);
    }

    public void ajouterVariableGlobale(String str, WDObjet wDObjet) {
        this.f1026u.put(C0808l.m4016a(str, 20, 0), wDObjet);
    }

    public boolean aliasFenetreExiste(String str) {
        return this.f1015d != null ? this.f1015d.containsKey(str) : false;
    }

    public void appelPCode(int i) {
        WDContexte contexte = WDAppelContexte.getContexte();
        contexte.m2715c(i, null);
        switch (i) {
            case C0607n.Tv /*220*/:
                activationApplication();
                break;
            case C0607n.Qt /*221*/:
                desactivationApplication();
                break;
            default:
                try {
                    C0691a.m2856a(f997K[8]);
                    break;
                } catch (Throwable th) {
                    contexte.m2736x();
                }
        }
        contexte.m2736x();
    }

    public final void checkFinApplication(WDException wDException) {
        if (getNbFenetreOuverte() == 0 && isApplicationChargee()) {
            C0747a serviceLocal = getServiceLocal(false);
            if (serviceLocal != null && serviceLocal.mo2615b()) {
                return;
            }
            if (wDException != null) {
                throw wDException;
            }
            fermerProjet();
        }
    }

    public WDObjet chercherVariableGlobale(String str) {
        return (WDObjet) this.f1026u.get(C0808l.m4016a(str, 20, 0));
    }

    protected void declarerRessources() {
    }

    public final void decrementerNbFenetreOuverte() {
        this.f1027w--;
    }

    protected void desactivationApplication() {
    }

    public void ferme(String str) {
        C0508h fenetre = getFenetre(str, true);
        if (fenetre != null) {
            fenetre.ferme(true, true, null);
            return;
        }
        WDErreurManager.m2883a(C0745b.m3222b(f997K[0], str));
    }

    public void fermerProjet() {
        WDAppelContexte.getContexte().m2715c(C0607n.Tl, null);
        terminerApplication();
    }

    protected void fermerRessources() {
        WDAppelContexte.m2681b().m2785a();
        if (this.f1012I != null) {
            Iterator it = this.f1012I.iterator();
            while (it.hasNext()) {
                ((C0535j) it.next()).onFermetureProjet();
            }
        }
    }

    public final void fermerToutesFenetres(boolean z, C0508h c0508h) {
        for (int size = this.f1016e.size(); size > 0; size--) {
            C0508h c0508h2 = (C0508h) this.f1016e.get(size - 1);
            if (c0508h2 != null) {
                try {
                    if (c0508h2.estOuverte() && c0508h2 != c0508h) {
                        try {
                            c0508h2.ferme(true, z, null);
                        } catch (C0667i e) {
                        }
                    }
                } catch (C0667i e2) {
                    throw e2;
                }
            }
        }
    }

    public String getAdresseEmail() {
        return "";
    }

    public final String getCharset() {
        return this.f1008B;
    }

    public int getDelaiAvantFermeture() {
        return this.f1029z;
    }

    public final C0508h getDerniereFenetreOuverte() {
        return this.f1016e.size() > 0 ? (C0508h) this.f1016e.get(this.f1016e.size() - 1) : null;
    }

    public abstract String getErrorLogFilePath();

    public C0508h getFenetre(String str) {
        return (C0508h) this.f1023q.get(str.toLowerCase());
    }

    public C0508h getFenetre(String str, boolean z) {
        String toLowerCase = str.toLowerCase();
        C0508h c0508h = (C0508h) this.f1023q.get(toLowerCase);
        return (c0508h == null && z) ? getFenetreFromAlias(toLowerCase) : c0508h;
    }

    public C0508h getFenetreFromAlias(String str) {
        if (this.f1015d != null) {
            WeakReference weakReference = (WeakReference) this.f1015d.get(str.toLowerCase());
            if (weakReference != null) {
                return (C0508h) weakReference.get();
            }
        }
        return null;
    }

    public String getFichierWDM() {
        return "";
    }

    public String getFormatMasqueDate() {
        return f997K[6];
    }

    public String getFormatMasqueDureeRelative(int i) {
        return null;
    }

    public String getFormatMasqueHeure() {
        return f997K[4];
    }

    public String getJourSemaine() {
        return null;
    }

    public synchronized int getLangueCourante() {
        int i;
        i = (f1005v <= 0 || f1005v > this.f1007A.length) ? this.f1007A[0] : this.f1007A[f1005v - 1];
        return i;
    }

    public Iterator getLstFenetre() {
        return this.f1023q == null ? null : this.f1023q.values().iterator();
    }

    public final Iterator<C0508h> getLstFenetreOuvertes() {
        return this.f1016e == null ? null : this.f1016e.iterator();
    }

    public Iterator getLstRequete() {
        return this.f1028x == null ? null : this.f1028x.values().iterator();
    }

    public String getMoisAnnee() {
        return null;
    }

    public int getNbFenetreOuverte() {
        return this.f1027w;
    }

    public final String getNom() {
        return this.f1017g;
    }

    public String getNomAnalyseProjet() {
        return this.f1018h;
    }

    public String[] getNomCollectionProcedure() {
        return this.f1013a;
    }

    public final String getNomConfiguration() {
        return this.f1011H;
    }

    public String getNomLogiqueFenetreInterne(String str) {
        if (this.f1025s == null) {
            return null;
        }
        return (String) this.f1025s.get(C0808l.m4057o(str.toLowerCase()));
    }

    public String getNomSociete() {
        return "";
    }

    public int getNombreDecimaleMonetaire() {
        return -1;
    }

    public synchronized int getNouvelIdentifiant() {
        int i;
        i = f1001m + 1;
        f1001m = i;
        return i;
    }

    public final int[] getPaletteCouleurGabarit() {
        return this.f1022p;
    }

    public String getParametreLigneCommande(int i) {
        String str = "";
        return (f1004t == null || i <= 0 || i > f1004t.length) ? str : f1004t[i - 1];
    }

    public String getParametreLigneCommande(String str, String str2) {
        String toLowerCase = str.toLowerCase();
        if (f1004t == null || toLowerCase == null) {
            return str2;
        }
        for (String str3 : f1004t) {
            if (str3 != null) {
                String toLowerCase2 = str3.toLowerCase();
                if (toLowerCase2.indexOf("-" + toLowerCase + "=") == 0 || toLowerCase2.indexOf("/" + toLowerCase + "=") == 0) {
                    return str3.substring(str3.indexOf("=") + 1, str3.length());
                }
            }
        }
        return str2;
    }

    public String getParametresLigneCommande() {
        return f1004t != null ? C0808l.m4024a(f1004t, " ") : "";
    }

    public abstract String getRepertoireApplication();

    public abstract String getRepertoireExecution();

    public C0537e getRequeteWDR(String str) {
        return this.f1028x != null ? (C0537e) this.f1028x.get(C0808l.m4057o(str.toLowerCase())) : null;
    }

    public String getSeparateurDecimale() {
        return null;
    }

    public String getSeparateurDecimaleMonetaire() {
        return null;
    }

    public String getSeparateurMillier() {
        return null;
    }

    public String getSeparateurMillierMonetaire() {
        return null;
    }

    public abstract C0747a getServiceLocal(boolean z);

    public String getSymboleMonetaire() {
        return null;
    }

    public final String getTitreSuivant() {
        String str = this.f1020k;
        razTitreSuivant();
        return str;
    }

    public String getUniteTailleFichier() {
        return null;
    }

    public abstract String getVersionApplication();

    public abstract String getVersionOS();

    public final boolean hasCrashed() {
        return this.f1009D;
    }

    public void incrementerNbFenetreOuverte() {
        this.f1027w++;
    }

    public void initClasses() {
    }

    public void initCollections() {
    }

    public void initProjet() {
    }

    public void initialiserProjet(String str, String str2, String[] strArr) {
        this.f1017g = str;
        this.f1011H = str2;
        f1004t = strArr;
    }

    public void initialiserProjet(String str, String[] strArr) {
        initialiserProjet(str, str, strArr);
    }

    public boolean isAffectationTableauParCopie() {
        return false;
    }

    public boolean isApplicationChargee() {
        return this.f1014c;
    }

    public boolean isAssistanceAutoHFActive() {
        return true;
    }

    public abstract boolean isContextePartage();

    public boolean isCreationAutoFichierDonnees() {
        return this.f1010F;
    }

    public final boolean isFenetreOuverte(C0508h c0508h) {
        return this.f1016e != null && this.f1016e.indexOf(c0508h) >= 0;
    }

    public boolean isIgnoreErreurCertificatHTTPS() {
        return true;
    }

    public boolean isModeAnsi() {
        return false;
    }

    public abstract boolean isModeApplet();

    public boolean isModeGestionFichierMultiUtilisateur() {
        return this.f1024r;
    }

    public final boolean isMultiThread() {
        return this.f1021l;
    }

    public boolean isUniteAffichageLogique() {
        return false;
    }

    public abstract boolean isVersionCompatible(int i);

    protected abstract void killProcess();

    public final void notifCreationThreadWLSecondaire() {
        this.f1021l = true;
    }

    public void notifFermetureFenetre(C0508h c0508h) {
        C0691a.m2860a(this.f1016e.remove(c0508h), f997K[5]);
    }

    public void notifOuvertureFenetre(C0508h c0508h) {
        this.f1016e.add(c0508h);
    }

    public final void notifSaturationMemoire() {
        if (this.f1012I != null) {
            Iterator it = this.f1012I.iterator();
            while (it.hasNext()) {
                ((C0535j) it.next()).onLowMemory();
            }
        }
    }

    protected final void onChangementLangue() {
        String fichierWDM = getFichierWDM();
        if (!C0808l.m4053k(fichierWDM)) {
            try {
                C0745b.m3225d(fichierWDM);
            } catch (Exception e) {
                C0691a.m2857a(f997K[9] + fichierWDM, e);
            }
        }
    }

    public final void onCrashed() {
        this.f1009D = true;
    }

    public WDObjet ouvre(C1155i c1155i, String str) {
        C0508h fenetre = getFenetre(str);
        if (fenetre != null) {
            if (c1155i != C1155i.FILLE) {
                if (c1155i == C1155i.MODALE) {
                    fenetre.ouvre(C1155i.MODALE, null);
                } else {
                    fenetre.ouvre(C1155i.NON_MODALE, null);
                }
            }
            return fenetre.getValeurRenvoyee();
        }
        WDErreurManager.m2883a(C0745b.m3222b(f997K[0], str));
        return null;
    }

    public WDObjet ouvre(C1155i c1155i, String str, WDObjet[] wDObjetArr) {
        C0508h fenetre = getFenetre(str);
        if (fenetre != null) {
            if (c1155i != C1155i.FILLE) {
                if (c1155i == C1155i.MODALE) {
                    fenetre.ouvre(C1155i.MODALE, wDObjetArr);
                } else {
                    fenetre.ouvre(C1155i.NON_MODALE, wDObjetArr);
                }
            }
            return fenetre.getValeurRenvoyee();
        }
        WDErreurManager.m2883a(C0745b.m3222b(f997K[0], str));
        return null;
    }

    public abstract InputStream ouvrirFluxAnalyseProjet();

    public final void razTitreSuivant() {
        this.f1020k = null;
    }

    public void runAutoProc() {
    }

    public void setApplicationChargee(boolean z) {
        this.f1014c = z;
    }

    public final void setCharset(String str) throws C1013b {
        try {
            if (Charset.isSupported(str)) {
                this.f1008B = str;
                if (this.f1012I != null) {
                    Iterator it = this.f1012I.iterator();
                    while (it.hasNext()) {
                        ((C0535j) it.next()).onCharsetChanged(str);
                    }
                    return;
                }
                return;
            }
            throw new C1013b(C0745b.m3222b(f997K[12], new String[0]));
        } catch (C1013b e) {
            throw e;
        }
    }

    public void setCreationAutomatiqueFichierDonnees(boolean z) {
        this.f1010F = z;
    }

    public void setDelaiAvantFermeture(int i) {
        this.f1029z = i;
    }

    public synchronized void setLangueCourante(int i) {
        int length = this.f1007A.length;
        int i2 = 0;
        while (i2 < length) {
            try {
                if (this.f1007A[i2] == i) {
                    f1005v = i2 + 1;
                    if (!isModeAnsi()) {
                        try {
                            setCharset(ec.m3882f(this.f1019i[i2]));
                        } catch (Exception e) {
                            C0691a.m2857a(f997K[11], e);
                        }
                    }
                    if (WDProjet.getInstance().isApplicationChargee()) {
                        onChangementLangue();
                    }
                } else {
                    i2++;
                }
            } catch (C1013b e2) {
                throw e2;
            } catch (C1013b e22) {
                throw e22;
            } catch (C1013b e222) {
                throw e222;
            } catch (C1013b e2222) {
                throw e2222;
            }
        }
        switch (i) {
            case 2:
            case 4:
            case 10:
            case 30:
                i2 = 3;
                break;
            case 9:
                i2 = 5;
                break;
            case 15:
                i2 = 14;
                break;
            case 22:
                i2 = 23;
                break;
            case 45:
                i2 = 7;
                break;
            default:
                i2 = i;
                break;
        }
        if (i2 != i) {
            setLangueCourante(i2);
        } else if (i != 3) {
            setLangueCourante(3);
        }
        return;
    }

    public void setLangueProjet(int[] iArr, int[] iArr2, int i, boolean z) {
        int i2 = 0;
        C0691a.m2860a(iArr.length == iArr2.length, f997K[10]);
        this.f1007A = new int[iArr.length];
        this.f1019i = new int[iArr2.length];
        while (i2 < iArr.length) {
            this.f1007A[i2] = ec.m3878c(iArr[i2]);
            this.f1019i[i2] = iArr2[i2] == 1 ? C0607n.bx : iArr2[i2];
            i2++;
        }
        setLangueCourante(z ? ec.m3875b(Locale.getDefault()) : ec.m3878c(i));
    }

    public void setModeGestionFichier(boolean z) {
        this.f1024r = z;
    }

    public void setNomAnalyseProjet(String str) {
        this.f1018h = str;
        bb bbVar = (bb) WDAppelContexte.getContexte(bb.class);
        if (bbVar != null && !bbVar.mo3087c()) {
            bbVar.mo3086b();
        }
    }

    public void setNomCollectionProcedure(String[] strArr) {
        this.f1013a = strArr;
    }

    public final void setPaletteCouleurGabarit(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = C1031a.m7467k(iArr[i]);
        }
        this.f1022p = iArr;
    }

    public final void setTitreSuivant(String str) {
        this.f1020k = str;
        if (this.f1012I != null) {
            Iterator it = this.f1012I.iterator();
            while (it.hasNext()) {
                ((C0535j) it.next()).onChangementTitre(this.f1020k);
            }
        }
    }

    public void supprimerAliasFenetre(String str) {
        if (this.f1015d != null) {
            this.f1015d.remove(str.toLowerCase());
        }
    }

    public final void supprimerEcouteurProjet(C0535j c0535j) {
        if (this.f1012I != null) {
            this.f1012I.remove(c0535j);
        }
    }

    public void terminerApplication() {
        setApplicationChargee(false);
        WDAppelContexte.getContexte().m2727n();
        fermerToutesFenetres(false, null);
        try {
            fermerRessources();
        } catch (Exception e) {
            C0691a.m2857a(f997K[7], e);
        }
        try {
            if (isModeApplet()) {
                if (f998b) {
                    return;
                }
            }
            killProcess();
        } catch (Exception e2) {
            throw e2;
        } catch (Exception e22) {
            throw e22;
        }
    }
}
