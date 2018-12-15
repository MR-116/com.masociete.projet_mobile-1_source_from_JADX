package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.core.C0505p;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.C0727l;
import fr.pcsoft.wdjava.core.C0822v;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p047f.C0712l;
import fr.pcsoft.wdjava.core.p047f.C0713b;
import fr.pcsoft.wdjava.core.poo.C0735q;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.hb;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.p055g.C0908g;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.C0490q;
import fr.pcsoft.wdjava.ui.cadre.C1110m;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0509v;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.modelechamp.C1231a;
import fr.pcsoft.wdjava.ui.champs.onglet.C1246j;
import fr.pcsoft.wdjava.ui.champs.onglet.C1247p;
import fr.pcsoft.wdjava.ui.champs.p068a.C1123a;
import fr.pcsoft.wdjava.ui.champs.zml.C0532f;
import fr.pcsoft.wdjava.ui.champs.zr.bb;
import fr.pcsoft.wdjava.ui.p079e.C1397c;
import fr.pcsoft.wdjava.ui.p079e.C1399b;
import fr.pcsoft.wdjava.ui.p079e.C1400d;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import fr.pcsoft.wdjava.ui.utils.C1515p;
import fr.pcsoft.wdjava.ui.utils.C1518t;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class fc extends C0490q implements ab, nb {
    /* renamed from: A */
    protected static int f916A = 0;
    public static final int Bb = 2048;
    /* renamed from: D */
    public static final int f917D = 1;
    public static final int Db = 4;
    /* renamed from: E */
    public static final int f918E = 0;
    /* renamed from: F */
    public static final int f919F = 5;
    /* renamed from: G */
    public static final int f920G = 8;
    public static final int Gb = 4;
    /* renamed from: H */
    public static final int f921H = 1;
    public static final int Hb = 128;
    /* renamed from: K */
    public static final int f922K = 64;
    /* renamed from: M */
    public static final int f923M = 7;
    public static final int Nb = 256;
    /* renamed from: O */
    public static final int f924O = 1024;
    public static final int Ob = 32;
    public static final int Pb = 1;
    public static final int Qb = 512;
    public static final int Rb = 32077;
    private static final String[] Vb = new String[]{m1338z(m1339z("4D;MWLâ;@\u0018EnoF\u0012\u0001o A\u0003\u0001{#]\u0004\u0001n;Z\u0012\u0001~;A\u001bHx¦M")), m1338z(m1339z("\u001b@y(M\u0002S")), m1338z(m1339z("\u001f@~;M\u0002S")), m1338z(m1339z("\u001fDb(@\u0003")), m1338z(m1339z("\u0000Ho;@")), m1338z(m1339z(">L{ [\u0004Hi#MWE,&F\u001eUb.D\u001eRn=\b\u001b@+#A\u0016Hx F[\u0001g*\b\u0014Ne;M\u000fUno`1\u0001ehIWQj<\bUâoK\u0005Èâa")), m1338z(m1339z(">L{ [\u0004Hi#MWEnoK\u001bNe*ZWMnoK\u001f@f?\b\u0013D+#\u000f\u0018Ol#M\u0003\r+&DWO,.X\u0007@y;A\u0012OoÈW@~,]\u0019\u0001} D\u0012U%")), m1338z(m1339z(">L{ [\u0004Hi#MWEnoK\u001bNe*ZWMnoK\u001f@f?\b")), m1338z(m1339z("TbC\u000ee'~N\u0017a$uJ\u0001|")), m1338z(m1339z("\u001avO\u0010")), m1338z(m1339z("TqY\u0000x%hN\u001bm(mN\f|\"sN\u0010{2tG\n")), m1338z(m1339z("TwB\u001ca5mN\u0010a9h_\u0006i;")), m1338z(m1339z("6Gm*K\u0003@&G\u0019\u0001oh]\u0019D+?Z\u0018Qy&Á\u0003È+!G\u0019\u0001l¦ZD%")), m1338z(m1339z("%Èh:XSj;A\u0018O++\u000f\u0002OnoX\u0005N{=AUâoF\u0018O+(Á\u0005Èna"))};
    /* renamed from: X */
    public static final int f925X = 3;
    public static final int ab = 15;
    public static final int fb = 2;
    public static final int gb = 6;
    public static final int ib = 2;
    protected static final int jb = 65535;
    protected static final int kb = 16;
    public static final int mb = 8;
    /* renamed from: o */
    public static final int f926o = 16;
    /* renamed from: q */
    public static final int f927q = 2;
    /* renamed from: r */
    public static final int f928r = 4;
    public static final int tb = 16;
    /* renamed from: u */
    public static final int f929u = 4;
    protected static final int vb = 64;
    public static final int wb = 8;
    /* renamed from: x */
    public static final int f930x = 8;
    public static final int xb = 2;
    /* renamed from: y */
    protected static final int f931y = 32;
    public static final int yb = 1;
    protected static int zb = 0;
    protected gc Ab = null;
    /* renamed from: B */
    protected int f932B = 0;
    /* renamed from: C */
    protected C0712l f933C = null;
    protected int Cb = 1;
    protected int Eb = 0;
    private boolean Fb = false;
    /* renamed from: I */
    protected int f934I = 0;
    protected int Ib = 0;
    /* renamed from: J */
    protected int f935J = 0;
    protected List<C0530v> Jb = null;
    protected int Kb = 0;
    /* renamed from: L */
    protected int f936L = 0;
    protected int Lb = 0;
    protected boolean Mb = false;
    /* renamed from: N */
    protected int f937N = 0;
    /* renamed from: P */
    protected double f938P = 0.0d;
    /* renamed from: Q */
    protected int f939Q = 0;
    /* renamed from: R */
    protected int f940R = 0;
    /* renamed from: S */
    protected boolean f941S = true;
    protected int Sb = 0;
    /* renamed from: T */
    protected int f942T = 0;
    protected int Tb = 0;
    /* renamed from: U */
    protected int f943U = 0;
    protected int Ub = -1;
    /* renamed from: V */
    protected double f944V = 0.0d;
    /* renamed from: W */
    private String f945W = null;
    /* renamed from: Y */
    protected int f946Y = -1;
    /* renamed from: Z */
    protected int f947Z = Integer.MAX_VALUE;
    protected int bb = 0;
    protected int cb = 0;
    protected int db = 0;
    protected double eb = 0.0d;
    protected int hb = Integer.MAX_VALUE;
    protected int lb = 0;
    /* renamed from: m */
    protected double f948m = 0.0d;
    /* renamed from: n */
    protected boolean f949n = true;
    protected int nb = 0;
    protected int ob = 0;
    /* renamed from: p */
    protected int f950p = 0;
    private int pb = -1;
    protected boolean qb = true;
    private boolean rb = false;
    /* renamed from: s */
    private String f951s = null;
    protected sb sb = null;
    /* renamed from: t */
    protected int f952t = 0;
    protected BitSet ub = null;
    /* renamed from: v */
    protected C0822v f953v = null;
    /* renamed from: w */
    private int f954w = 0;
    /* renamed from: z */
    protected ArrayList<dc> f955z = null;

    /* renamed from: a */
    private final float m1337a(double d) {
        float abs = (float) Math.abs(d);
        return getDisplayUnitWL() == 1 ? abs * 2.0f : abs;
    }

    public static final void desactiveFAA(int i) {
        f916A |= i;
    }

    public static final void desactiveFAATousChamps(int i) {
        zb |= i;
    }

    /* renamed from: z */
    private static String m1338z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 119;
                    break;
                case 1:
                    i2 = 33;
                    break;
                case 2:
                    i2 = 11;
                    break;
                case 3:
                    i2 = 79;
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
    private static char[] m1339z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 40);
        }
        return toCharArray;
    }

    public abstract int _getAltitude();

    public int _getEtat() {
        return this.d;
    }

    public abstract int _getHauteur();

    public final int _getHauteurInitiale() {
        return this.f939Q;
    }

    public int _getHauteurMax() {
        try {
            return this.f947Z == -1 ? _getHauteurInitiale() : this.f947Z;
        } catch (WDException e) {
            throw e;
        }
    }

    public int _getHauteurMin() {
        try {
            return this.Lb == -1 ? _getHauteurInitiale() : this.Lb;
        } catch (WDException e) {
            throw e;
        }
    }

    public abstract int _getHauteurUtile();

    public abstract int _getLargeur();

    public final int _getLargeurInitiale() {
        return this.f942T;
    }

    public int _getLargeurMax() {
        try {
            return this.hb == -1 ? _getLargeurInitiale() : this.hb;
        } catch (WDException e) {
            throw e;
        }
    }

    public int _getLargeurMin() {
        try {
            return this.f934I == -1 ? _getLargeurInitiale() : this.f934I;
        } catch (WDException e) {
            throw e;
        }
    }

    public abstract int _getLargeurUtile();

    public abstract int _getLocalX();

    public abstract int _getLocalY();

    public int _getNumTab() {
        return this.pb;
    }

    public final int _getX() {
        return this.nb;
    }

    public final int _getY() {
        return this.bb;
    }

    public final boolean _isVisible() {
        return this.qb;
    }

    public void _notifDebutRepaintParent() {
        this.Fb = true;
        int etatInterne = getEtatInterne();
        try {
            if (this.d != 4 && etatInterne != 1) {
                this.sb = sauverInfoChamp();
                setEtatInterne(1);
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void _notifFinRepaintParent() {
        try {
            if (this.sb != null) {
                restauteurInfoChamp(this.sb);
                this.sb = null;
            }
            this.Fb = false;
        } catch (WDException e) {
            throw e;
        }
    }

    public void _notifOuvertureFenetre() {
    }

    public void _setNumTab(int i) {
        this.pb = i;
    }

    public void activerEcoute() {
    }

    public void activerEcouteurChamp() {
    }

    public void activerEcouteurClavier() {
    }

    public void activerEcouteurClic() {
    }

    public void activerEcouteurFocus() {
    }

    public void activerEcouteurMouvement() {
    }

    public void activerEcouteurRoulette() {
    }

    public void adapterHauteurPourZML(C0532f c0532f, int i) {
        int _getHauteur = _getHauteur();
        if (i <= _getHauteur) {
            i = Math.max(i, _getHauteurInitiale());
        }
        if (i != _getHauteur) {
            boolean isAncrageActif = isAncrageActif();
            try {
                setAncrageActif(false);
                setTailleChamp(_getLargeur(), i, 0);
            } finally {
                setAncrageActif(isAncrageActif);
            }
        }
    }

    public void addChampListener(C0530v c0530v) {
        try {
            if (this.Jb == null) {
                this.Jb = new LinkedList();
            }
            this.Jb.add(c0530v);
        } catch (WDException e) {
            throw e;
        }
    }

    public final void addFlag(int i) {
        this.f937N |= i;
    }

    public void affecterPropriete(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        boolean z = false;
        if (eWDPropriete != null) {
            try {
                if (eWDPropriete != EWDPropriete.PROP_UNDEF) {
                    z = true;
                }
            } catch (WDException e) {
                throw e;
            }
        }
        try {
            C0691a.m2860a(z, Vb[12]);
            if (eWDPropriete == null) {
                return;
            }
            if (eWDPropriete != EWDPropriete.PROP_UNDEF) {
                setProp(eWDPropriete, wDObjet, false);
            }
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean ancrer(int r26, int r27, int r28, int r29, int r30) {
        /*
        r25 = this;
        r4 = r25.isAncrageActif();	 Catch:{ WDException -> 0x0008 }
        if (r4 != 0) goto L_0x000a;
    L_0x0006:
        r4 = 0;
    L_0x0007:
        return r4;
    L_0x0008:
        r4 = move-exception;
        throw r4;
    L_0x000a:
        r9 = 0;
        r0 = r25;
        r4 = r0.Kb;
        r5 = 6;
        r16 = fr.pcsoft.wdjava.core.C0727l.m3092b(r4, r5);
        r4 = r30 & 16;
        if (r4 <= 0) goto L_0x01fd;
    L_0x0018:
        r4 = 1;
        r5 = r4;
    L_0x001a:
        r10 = r25._getHauteur();
        r12 = r25._getLargeur();
        r0 = r25;
        r6 = r0.nb;
        r0 = r25;
        r4 = r0.bb;
        r0 = r25;
        r7 = r0.Kb;
        r8 = 0;
        r7 = fr.pcsoft.wdjava.core.C0727l.m3092b(r7, r8);
        if (r7 != 0) goto L_0x0037;
    L_0x0035:
        if (r29 == 0) goto L_0x02d5;
    L_0x0037:
        if (r5 != 0) goto L_0x0044;
    L_0x0039:
        r0 = r25;
        r8 = r0.Kb;	 Catch:{ WDException -> 0x0201 }
        r11 = 4;
        r8 = fr.pcsoft.wdjava.core.C0727l.m3092b(r8, r11);	 Catch:{ WDException -> 0x0201 }
        if (r8 != 0) goto L_0x02d5;
    L_0x0044:
        r0 = r25;
        r14 = r0.f938P;
        if (r7 == 0) goto L_0x0063;
    L_0x004a:
        if (r27 == 0) goto L_0x0063;
    L_0x004c:
        r0 = r27;
        r0 = (double) r0;
        r18 = r0;
        r0 = r25;
        r4 = r0.lb;
        r0 = (double) r4;
        r20 = r0;
        r18 = r18 * r20;
        r20 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r18 = r18 / r20;
        r14 = r14 + r18;
    L_0x0063:
        r4 = (int) r14;
        r0 = (double) r4;
        r18 = r0;
        r18 = r14 - r18;
        r0 = r18;
        r2 = r25;
        r2.f938P = r0;	 Catch:{ WDException -> 0x0203 }
        r4 = r30 & 4;
        if (r4 <= 0) goto L_0x0205;
    L_0x0073:
        r0 = r25;
        r4 = r0.f940R;	 Catch:{ WDException -> 0x0203 }
    L_0x0077:
        r7 = (int) r14;
        r7 = r7 + r29;
        r4 = r4 + r7;
        r0 = r25;
        r7 = r0.bb;
        r29 = r4 - r7;
        r8 = r29;
    L_0x0083:
        r0 = r25;
        r7 = r0.Kb;
        r11 = 2;
        r11 = fr.pcsoft.wdjava.core.C0727l.m3092b(r7, r11);
        if (r11 != 0) goto L_0x0090;
    L_0x008e:
        if (r28 == 0) goto L_0x02d1;
    L_0x0090:
        if (r5 != 0) goto L_0x009d;
    L_0x0092:
        r0 = r25;
        r7 = r0.Kb;	 Catch:{ WDException -> 0x020b }
        r13 = 5;
        r7 = fr.pcsoft.wdjava.core.C0727l.m3092b(r7, r13);	 Catch:{ WDException -> 0x020b }
        if (r7 != 0) goto L_0x02d1;
    L_0x009d:
        r0 = r25;
        r6 = r0.eb;
        if (r11 == 0) goto L_0x02ce;
    L_0x00a3:
        if (r26 == 0) goto L_0x02ce;
    L_0x00a5:
        r0 = r26;
        r14 = (double) r0;
        r0 = r25;
        r11 = r0.f952t;
        r0 = (double) r11;
        r18 = r0;
        r14 = r14 * r18;
        r18 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r14 = r14 / r18;
        r6 = r6 + r14;
        r14 = r6;
    L_0x00ba:
        r6 = (int) r14;
        r6 = (double) r6;
        r6 = r14 - r6;
        r0 = r25;
        r0.eb = r6;	 Catch:{ WDException -> 0x020d }
        r6 = r30 & 1;
        if (r6 <= 0) goto L_0x020f;
    L_0x00c6:
        r0 = r25;
        r6 = r0.Sb;	 Catch:{ WDException -> 0x020d }
    L_0x00ca:
        r7 = (int) r14;
        r7 = r7 + r28;
        r6 = r6 + r7;
        r0 = r25;
        r7 = r0.nb;
        r28 = r6 - r7;
        r7 = r28;
    L_0x00d6:
        if (r16 == 0) goto L_0x00e4;
    L_0x00d8:
        r0 = r25;
        r11 = r0.nb;	 Catch:{ WDException -> 0x0215 }
        if (r6 != r11) goto L_0x00e4;
    L_0x00de:
        r0 = r25;
        r11 = r0.bb;	 Catch:{ WDException -> 0x0215 }
        if (r4 == r11) goto L_0x02cb;
    L_0x00e4:
        r11 = 1;
        r0 = r25;
        r4 = r0.setPositionChamp(r6, r4, r11);
        r4 = r4 | r9;
        r6 = r4;
    L_0x00ed:
        r0 = r25;
        r4 = r0.Kb;
        r9 = 1;
        r4 = fr.pcsoft.wdjava.core.C0727l.m3092b(r4, r9);
        r0 = r25;
        r9 = r0.ob;
        r0 = r25;
        r11 = r0.Kb;	 Catch:{ WDException -> 0x0217 }
        r13 = 7;
        r11 = fr.pcsoft.wdjava.core.C0727l.m3092b(r11, r13);	 Catch:{ WDException -> 0x0217 }
        if (r11 == 0) goto L_0x02c7;
    L_0x0105:
        r4 = r25.getPere();	 Catch:{ WDException -> 0x0217 }
        r4 = (fr.pcsoft.wdjava.ui.champs.gc) r4;	 Catch:{ WDException -> 0x0217 }
        r4 = r4.canHandleHeightAnchoredToContentChildren();	 Catch:{ WDException -> 0x0217 }
        if (r4 == 0) goto L_0x0219;
    L_0x0111:
        r11 = 1;
        if (r9 != 0) goto L_0x02c3;
    L_0x0114:
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r14 = r11;
    L_0x0117:
        if (r14 == 0) goto L_0x02c0;
    L_0x0119:
        if (r5 != 0) goto L_0x0126;
    L_0x011b:
        r0 = r25;
        r9 = r0.Kb;	 Catch:{ WDException -> 0x021e }
        r11 = 4;
        r9 = fr.pcsoft.wdjava.core.C0727l.m3092b(r9, r11);	 Catch:{ WDException -> 0x021e }
        if (r9 != 0) goto L_0x02c0;
    L_0x0126:
        r9 = r30 & 8;
        if (r9 <= 0) goto L_0x0220;
    L_0x012a:
        r0 = r27;
        r0 = (double) r0;
        r18 = r0;
        r0 = (double) r4;
        r20 = r0;
        r18 = r18 * r20;
        r20 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r18 = r18 / r20;
        r18 = java.lang.Math.floor(r18);
        r0 = r18;
        r4 = (int) r0;
        r0 = r25;
        r9 = r0.f950p;
        r4 = r4 + r9;
        if (r4 >= 0) goto L_0x014a;
    L_0x0149:
        r4 = 0;
    L_0x014a:
        r9 = r4;
    L_0x014b:
        r0 = r25;
        r4 = r0.Kb;
        r11 = 3;
        r4 = fr.pcsoft.wdjava.core.C0727l.m3092b(r4, r11);
        r0 = r25;
        r11 = r0.f935J;
        r0 = r25;
        r13 = r0.Kb;	 Catch:{ WDException -> 0x025f }
        r15 = 8;
        r13 = fr.pcsoft.wdjava.core.C0727l.m3092b(r13, r15);	 Catch:{ WDException -> 0x025f }
        if (r13 == 0) goto L_0x02b6;
    L_0x0164:
        r4 = r25.getPere();	 Catch:{ WDException -> 0x025f }
        r4 = (fr.pcsoft.wdjava.ui.champs.gc) r4;	 Catch:{ WDException -> 0x025f }
        r4 = r4.canHandleWidthAnchoredToContentChildren();	 Catch:{ WDException -> 0x025f }
        if (r4 == 0) goto L_0x0261;
    L_0x0170:
        r13 = 1;
        if (r11 != 0) goto L_0x02b2;
    L_0x0173:
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r11 = r13;
    L_0x0176:
        if (r11 == 0) goto L_0x02af;
    L_0x0178:
        if (r5 != 0) goto L_0x0185;
    L_0x017a:
        r0 = r25;
        r5 = r0.Kb;	 Catch:{ WDException -> 0x0269 }
        r13 = 5;
        r5 = fr.pcsoft.wdjava.core.C0727l.m3092b(r5, r13);	 Catch:{ WDException -> 0x0269 }
        if (r5 != 0) goto L_0x02af;
    L_0x0185:
        r5 = r30 & 2;
        if (r5 <= 0) goto L_0x026b;
    L_0x0189:
        r0 = r26;
        r0 = (double) r0;
        r18 = r0;
        r4 = (double) r4;
        r4 = r4 * r18;
        r18 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r4 = r4 / r18;
        r4 = java.lang.Math.floor(r4);
        r4 = (int) r4;
        r0 = r25;
        r5 = r0.f943U;
        r4 = r4 + r5;
        if (r4 >= 0) goto L_0x01a5;
    L_0x01a4:
        r4 = 0;
    L_0x01a5:
        if (r16 == 0) goto L_0x01af;
    L_0x01a7:
        if (r4 != r12) goto L_0x01ab;
    L_0x01a9:
        if (r9 == r10) goto L_0x02ac;
    L_0x01ab:
        if (r11 != 0) goto L_0x01af;
    L_0x01ad:
        if (r14 == 0) goto L_0x02ac;
    L_0x01af:
        r5 = 1;
        r0 = r25;
        r5 = r0.setTailleChamp(r4, r9, r5);
        r6 = r6 | r5;
        r11 = r6;
    L_0x01b8:
        if (r16 != 0) goto L_0x01bc;
    L_0x01ba:
        if (r11 == 0) goto L_0x01ec;
    L_0x01bc:
        r5 = r25.getPere();	 Catch:{ WDException -> 0x02a0 }
        r0 = r25;
        r6 = r0.l;	 Catch:{ WDException -> 0x02a0 }
        if (r5 == r6) goto L_0x01c9;
    L_0x01c6:
        r25.positionner();	 Catch:{ WDException -> 0x02a0 }
    L_0x01c9:
        r5 = r25.isConteneur();	 Catch:{ WDException -> 0x02a2 }
        if (r5 == 0) goto L_0x01ec;
    L_0x01cf:
        r5 = r30 & 2;
        if (r5 <= 0) goto L_0x02a4;
    L_0x01d3:
        r0 = r25;
        r5 = r0.f943U;
        r5 = r4 - r5;
    L_0x01d9:
        r4 = r30 & 8;
        if (r4 <= 0) goto L_0x02a8;
    L_0x01dd:
        r0 = r25;
        r4 = r0.f950p;
        r6 = r9 - r4;
    L_0x01e3:
        r4 = r25;
        r4 = (fr.pcsoft.wdjava.ui.champs.C0504y) r4;
        r9 = r30;
        r4.appliquerAncrage(r5, r6, r7, r8, r9);
    L_0x01ec:
        r0 = r25;
        r4 = r0.Kb;
        r5 = 6;
        r6 = 1;
        r4 = fr.pcsoft.wdjava.core.C0727l.m3090a(r4, r5, r6);
        r0 = r25;
        r0.Kb = r4;
        r4 = r11;
        goto L_0x0007;
    L_0x01fd:
        r4 = 0;
        r5 = r4;
        goto L_0x001a;
    L_0x0201:
        r4 = move-exception;
        throw r4;
    L_0x0203:
        r4 = move-exception;
        throw r4;
    L_0x0205:
        r0 = r25;
        r4 = r0.bb;
        goto L_0x0077;
    L_0x020b:
        r4 = move-exception;
        throw r4;
    L_0x020d:
        r4 = move-exception;
        throw r4;
    L_0x020f:
        r0 = r25;
        r6 = r0.nb;
        goto L_0x00ca;
    L_0x0215:
        r4 = move-exception;
        throw r4;
    L_0x0217:
        r4 = move-exception;
        throw r4;
    L_0x0219:
        r4 = 0;
        r14 = r4;
        r4 = r9;
        goto L_0x0117;
    L_0x021e:
        r4 = move-exception;
        throw r4;
    L_0x0220:
        r0 = r25;
        r0 = r0.f944V;
        r18 = r0;
        r0 = r27;
        r0 = (double) r0;
        r20 = r0;
        r0 = (double) r4;
        r22 = r0;
        r20 = r20 * r22;
        r22 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r20 = r20 / r22;
        r18 = r18 + r20;
        r0 = r18;
        r4 = (int) r0;
        r0 = (double) r4;
        r20 = r0;
        r18 = r18 - r20;
        r0 = r18;
        r2 = r25;
        r2.f944V = r0;
        r4 = r4 + r10;
        if (r4 >= 0) goto L_0x02bd;
    L_0x024a:
        r0 = r25;
        r0 = r0.f944V;
        r18 = r0;
        r0 = (double) r4;
        r20 = r0;
        r18 = r18 + r20;
        r0 = r18;
        r2 = r25;
        r2.f944V = r0;
        r4 = 0;
        r9 = r4;
        goto L_0x014b;
    L_0x025f:
        r4 = move-exception;
        throw r4;
    L_0x0261:
        r4 = 0;
        r24 = r11;
        r11 = r4;
        r4 = r24;
        goto L_0x0176;
    L_0x0269:
        r4 = move-exception;
        throw r4;
    L_0x026b:
        r0 = r25;
        r0 = r0.f948m;
        r18 = r0;
        r0 = r26;
        r0 = (double) r0;
        r20 = r0;
        r4 = (double) r4;
        r4 = r4 * r20;
        r20 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r4 = r4 / r20;
        r4 = r4 + r18;
        r13 = (int) r4;
        r0 = (double) r13;
        r18 = r0;
        r4 = r4 - r18;
        r0 = r25;
        r0.f948m = r4;
        r4 = r12 + r13;
        if (r4 >= 0) goto L_0x01a5;
    L_0x0290:
        r0 = r25;
        r0 = r0.f948m;
        r18 = r0;
        r4 = (double) r4;
        r4 = r4 + r18;
        r0 = r25;
        r0.f948m = r4;
        r4 = 0;
        goto L_0x01a5;
    L_0x02a0:
        r4 = move-exception;
        throw r4;
    L_0x02a2:
        r4 = move-exception;
        throw r4;
    L_0x02a4:
        r5 = r4 - r12;
        goto L_0x01d9;
    L_0x02a8:
        r6 = r9 - r10;
        goto L_0x01e3;
    L_0x02ac:
        r11 = r6;
        goto L_0x01b8;
    L_0x02af:
        r4 = r12;
        goto L_0x01a5;
    L_0x02b2:
        r4 = r11;
        r11 = r13;
        goto L_0x0176;
    L_0x02b6:
        r24 = r11;
        r11 = r4;
        r4 = r24;
        goto L_0x0176;
    L_0x02bd:
        r9 = r4;
        goto L_0x014b;
    L_0x02c0:
        r9 = r10;
        goto L_0x014b;
    L_0x02c3:
        r4 = r9;
        r14 = r11;
        goto L_0x0117;
    L_0x02c7:
        r14 = r4;
        r4 = r9;
        goto L_0x0117;
    L_0x02cb:
        r6 = r9;
        goto L_0x00ed;
    L_0x02ce:
        r14 = r6;
        goto L_0x00ba;
    L_0x02d1:
        r7 = r28;
        goto L_0x00d6;
    L_0x02d5:
        r8 = r29;
        goto L_0x0083;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.fc.ancrer(int, int, int, int, int):boolean");
    }

    public WDObjet appelPCode(int i) {
        try {
            return (this.f937N & 64) == 64 ? null : super.appelPCode(i);
        } catch (WDException e) {
            throw e;
        }
    }

    protected abstract void appliquerCouleur(int i);

    protected abstract void appliquerCouleurFond(int i);

    protected abstract void appliquerCouleurFondTransparent();

    protected abstract void appliquerTransparent();

    public abstract void appliquerVisibilite(boolean z);

    public void associerAttribut(dc dcVar) {
        try {
            if (this.f955z == null) {
                this.f955z = new ArrayList();
            }
            this.f955z.add(dcVar);
        } catch (WDException e) {
            throw e;
        }
    }

    protected abstract int calculerEtatInterne(int i);

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean canBecomeVisible() {
        /*
        r2 = this;
        r0 = r2.qb;	 Catch:{ WDException -> 0x003c }
        if (r0 == 0) goto L_0x004c;
    L_0x0004:
        r0 = r2.isWithPlan();	 Catch:{ WDException -> 0x003e }
        if (r0 == 0) goto L_0x003a;
    L_0x000a:
        r0 = r2.f937N;	 Catch:{ WDException -> 0x0040 }
        r0 = r0 & 32;
        r1 = 32;
        if (r0 == r1) goto L_0x003a;
    L_0x0012:
        r0 = r2.f;	 Catch:{ WDException -> 0x0042 }
        if (r0 != 0) goto L_0x0028;
    L_0x0016:
        r0 = r2.l;	 Catch:{ WDException -> 0x0044 }
        if (r0 == 0) goto L_0x0028;
    L_0x001a:
        r0 = r2.ub;	 Catch:{ WDException -> 0x0046 }
        r1 = r2.l;	 Catch:{ WDException -> 0x0046 }
        r1 = r1.getPlanActif();	 Catch:{ WDException -> 0x0046 }
        r0 = r0.get(r1);	 Catch:{ WDException -> 0x0046 }
        if (r0 != 0) goto L_0x003a;
    L_0x0028:
        r0 = r2.f;	 Catch:{ WDException -> 0x0048 }
        if (r0 == 0) goto L_0x004c;
    L_0x002c:
        r0 = r2.ub;	 Catch:{ WDException -> 0x004a }
        r1 = r2.f;	 Catch:{ WDException -> 0x004a }
        r1 = r1.getPlanActif();	 Catch:{ WDException -> 0x004a }
        r0 = r0.get(r1);	 Catch:{ WDException -> 0x004a }
        if (r0 == 0) goto L_0x004c;
    L_0x003a:
        r0 = 1;
    L_0x003b:
        return r0;
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r0 = 0;
        goto L_0x003b;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.fc.canBecomeVisible():boolean");
    }

    public boolean canHandleHeightAnchoredToContentChildren() {
        return false;
    }

    public boolean canHandleWidthAnchoredToContentChildren() {
        return false;
    }

    public final boolean checkCommonPlans(fc fcVar) {
        try {
            if (isWithPlan()) {
                if (fcVar.isWithPlan()) {
                    return this.ub.intersects(fcVar.ub);
                }
            }
            return true;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public int checkDeplacementHorizontalSplitter(C1123a c1123a, int i) {
        throw new RuntimeException(Vb[0]);
    }

    public int checkDeplacementVerticalSplitter(C1123a c1123a, int i) {
        throw new RuntimeException(Vb[0]);
    }

    public <T> T checkType(Class<T> cls) {
        this.f937N |= 64;
        try {
            T checkType = super.checkType(cls);
            if (checkType == null) {
                if (dc.class.isAssignableFrom(cls)) {
                    dc premierAttribut = getPremierAttribut();
                    if (premierAttribut != null) {
                        checkType = premierAttribut.checkType(cls);
                        this.f937N &= -65;
                        return checkType;
                    }
                }
            }
            this.f937N &= -65;
            return checkType;
        } catch (WDException e) {
            throw e;
        } catch (Throwable th) {
            this.f937N &= -65;
        }
    }

    public void clonerChamp(String str, int i, int i2) {
        try {
            if (this.l != null) {
                C0489p c0489p = null;
                Object pere = getPere();
                if (pere != null) {
                    try {
                        C0504y c0504y;
                        C0504y c0504y2;
                        C0504y c0504y3;
                        if (pere instanceof WDFenetre) {
                            c0504y3 = (C0504y) pere;
                            c0504y = c0504y3;
                            c0489p = (gc) C0735q.m3114a(getClass(), this.l.getClass(), this.l);
                            c0504y2 = c0504y3;
                        } else if (pere instanceof C1246j) {
                            Object obj = (C1246j) pere;
                            if (obj != null) {
                                c0489p = (gc) C0735q.m3114a(getClass(), obj.getClass(), obj);
                            }
                            c0504y = (C0504y) pere;
                        } else if (pere instanceof C0504y) {
                            C0489p c0489p2 = (gc) C0735q.m3114a(getClass(), pere.getClass(), pere);
                            c0504y3 = (C0504y) pere;
                            c0504y = c0504y3;
                            c0489p = c0489p2;
                            c0504y2 = c0504y3;
                        } else {
                            return;
                        }
                        if (c0489p != null) {
                            try {
                                c0489p.N |= 4;
                                if (c0504y.getFilsDirect(str) != null) {
                                    throw new IllegalArgumentException(C0745b.m3222b(Vb[8], str));
                                }
                                C0509v c0509v = (C0509v) getFenetreMere();
                                boolean isFenetreCree = c0509v.isFenetreCree();
                                try {
                                    c0509v.setFenetreCree(false);
                                    c0489p.initialiserObjet();
                                    c0489p.setNom(str);
                                    if (c0504y instanceof C1246j) {
                                        C1247p voletFromChamp = ((C1246j) c0504y).getVoletFromChamp(this);
                                        if (voletFromChamp == null) {
                                            try {
                                                C0691a.m2856a(Vb[6]);
                                                return;
                                            } catch (Exception e) {
                                                throw e;
                                            }
                                        }
                                        voletFromChamp.ajouterFils(str, c0489p);
                                    } else {
                                        c0504y.ajouter(str, c0489p);
                                    }
                                    try {
                                        c0489p._setNumTab(c0509v.getMaxNumTab() + 1);
                                        c0509v.ajouterChampNumTable(c0489p);
                                        c0504y.majOrdreNavigation(c0509v);
                                        if (!(i == -1 && i2 == -1)) {
                                            if (i == -1) {
                                                i = c0489p._getX();
                                            }
                                            if (i2 == -1) {
                                                i2 = c0489p._getY();
                                            }
                                            c0489p.setPositionChamp(i, i2, 0);
                                        }
                                        try {
                                            c0504y2.appliquerAncrage(0, 0, 0, 0, 0);
                                            if (c0489p instanceof C1231a) {
                                                ((C1231a) c0489p).executerDeclarationGlobales();
                                            }
                                            c0489p.appelPCode(14);
                                            c0489p.appelPCode(C0607n.Xu);
                                            c0489p.appelPCode(35);
                                        } catch (Exception e2) {
                                            throw e2;
                                        }
                                    } catch (Exception e22) {
                                        throw e22;
                                    } catch (Exception e222) {
                                        throw e222;
                                    }
                                } finally {
                                    c0509v.setFenetreCree(isFenetreCree);
                                }
                            } catch (Exception e2222) {
                                throw e2222;
                            }
                        }
                    } catch (Exception e22222) {
                        C0691a.m2863b(Vb[7] + getName(), e22222);
                    }
                }
            }
        } catch (Exception e222222) {
            throw e222222;
        }
    }

    public boolean coller() {
        return false;
    }

    public final int computeRequiredParentSizeChangeToReachPreferredHeight(boolean z) {
        int preferredHeight = getPreferredHeight();
        if (z) {
            try {
                preferredHeight -= this.f950p;
            } catch (WDException e) {
                throw e;
            }
        }
        preferredHeight -= _getHauteur();
        if (preferredHeight == 0) {
            return 0;
        }
        try {
            int i = this.ob != 0 ? this.ob : 1000;
            if (!z) {
                preferredHeight -= (int) this.f944V;
            }
            return (int) Math.ceil(((double) preferredHeight) / (((double) i) / 1000.0d));
        } catch (WDException e2) {
            throw e2;
        }
    }

    public final int computeRequiredParentSizeChangeToReachPreferredWidth(boolean z) {
        int preferredWidth = getPreferredWidth();
        if (z) {
            try {
                preferredWidth -= this.f943U;
            } catch (WDException e) {
                throw e;
            }
        }
        preferredWidth -= _getLargeur();
        if (preferredWidth == 0) {
            return 0;
        }
        try {
            int i = this.f935J != 0 ? this.f935J : 1000;
            if (!z) {
                preferredWidth -= (int) this.f948m;
            }
            return (int) Math.ceil(((double) preferredWidth) / (((double) i) / 1000.0d));
        } catch (WDException e2) {
            throw e2;
        }
    }

    public WDObjet convertStringToValue(String str) {
        return new WDChaine(str);
    }

    public boolean copier() {
        return false;
    }

    public boolean couper() {
        return false;
    }

    protected sb creerInfoChamp() {
        return new C1129w();
    }

    public C1399b creerPolice_GEN(String str, double d, int i) {
        return C1400d.m9965a(str, m1337a(d), i);
    }

    public C1397c creerPolice_GEN(String str, double d, int i, int i2) {
        return C1400d.m9967a(str, m1337a(d), i, i2);
    }

    protected final C1518t creerRect_GEN(int i, int i2, int i3, int i4) {
        return new C1518t(i, i2, i + i3, i2 + i4);
    }

    protected abstract void declageAltitude(int i);

    public void entreeChamp() {
        try {
            if (this.Ab != null) {
                this.Ab.appelPCode(15);
            }
            super.entreeChamp();
        } catch (WDException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean estNavigable(boolean r3) {
        /*
        r2 = this;
        if (r3 == 0) goto L_0x0020;
    L_0x0002:
        r0 = r2.d;	 Catch:{ WDException -> 0x0018 }
        r1 = 4;
        if (r0 == r1) goto L_0x0016;
    L_0x0007:
        r0 = r2.d;	 Catch:{ WDException -> 0x001a }
        r1 = 1;
        if (r0 == r1) goto L_0x0016;
    L_0x000c:
        r0 = r2.qb;	 Catch:{ WDException -> 0x001c }
        if (r0 == 0) goto L_0x0016;
    L_0x0010:
        r0 = r2.isAffiche();	 Catch:{ WDException -> 0x001e }
        if (r0 != 0) goto L_0x0020;
    L_0x0016:
        r0 = 0;
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x001a }
    L_0x001a:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x001c }
    L_0x001c:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        throw r0;
    L_0x0020:
        r0 = r2.Mb;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.fc.estNavigable(boolean):boolean");
    }

    public void fixeValeurDefautAttributZR() {
        try {
            if (this.f955z != null && this.f955z.size() > 0) {
                Iterator it = this.f955z.iterator();
                while (it.hasNext()) {
                    dc dcVar = (dc) it.next();
                    try {
                        if (dcVar.isAttributZR()) {
                            if (dcVar.getChampAssocie() == this) {
                                dcVar.setValeurDefautAttribut(getValeurPropriete(dcVar.getProprieteAssocie()));
                            }
                        }
                    } catch (WDException e) {
                        throw e;
                    } catch (WDException e2) {
                        throw e2;
                    }
                }
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    public void focusObtenu() {
        C0509v c0509v = (C0509v) getFenetreMere();
        try {
            if (this.f946Y != -1 && c0509v != null) {
                c0509v.setIndiceChampCourant(this.f946Y);
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public WDObjet getAltitude() {
        return new WDEntier4(_getAltitude());
    }

    public int getAltitudeInitial() {
        return this.Ub;
    }

    protected abstract int getAltitudeMaxFils();

    public final int getAnchorOptions() {
        return this.Kb;
    }

    public WDEntier4 getAncrage() {
        return new WDEntier4(this.f954w);
    }

    public WDObjet getAncrageAuContenu() {
        try {
            if (C0727l.m3092b(this.Kb, 7)) {
                return new WDEntier4(1);
            }
            try {
                return C0727l.m3092b(this.Kb, 8) ? new WDEntier4(2) : new WDEntier4(0);
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public dc getAttribut(EWDPropriete eWDPropriete) {
        if (this.f955z != null) {
            Iterator it = this.f955z.iterator();
            while (it.hasNext()) {
                dc dcVar = (dc) it.next();
                try {
                    if (dcVar.getProprieteAssocie() == eWDPropriete) {
                        return dcVar;
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return null;
    }

    public final dc getAttributAt(int i) {
        return (dc) this.f955z.get(i);
    }

    public final <T extends nb> T getChampParent(Class<T> cls) {
        for (C0489p c0489p = (C0489p) getPere(); c0489p != null; c0489p = (C0489p) c0489p.getPere()) {
            nb nbVar = (nb) c0489p.checkType(cls);
            if (nbVar != null) {
                return nbVar;
            }
        }
        return null;
    }

    public WDEntier4 getColonne() {
        return new WDEntier4((double) C1511l.m10515a((float) _getX(), 1, getDisplayUnit()));
    }

    public int getColonneAbsolu() {
        int _getLocalX = _getLocalX();
        WDObjet wDObjet = (C0489p) getPere();
        while (wDObjet != null) {
            try {
                if (wDObjet.isChamp()) {
                    if (wDObjet.isZoneRepetee()) {
                        break;
                    }
                    try {
                        if (wDObjet.isColonne()) {
                            break;
                        }
                        int i;
                        fc fcVar;
                        if (wDObjet.isOnglet()) {
                            C1247p voletFromChamp = ((C1246j) wDObjet).getVoletFromChamp(this);
                            if (voletFromChamp != null) {
                                i = voletFromChamp.getPositionVolet()[0] + _getLocalX;
                                fcVar = (fc) wDObjet;
                                _getLocalX = fcVar._getLocalX() + i;
                                this = fcVar;
                                wDObjet = (C0489p) fcVar.getPere();
                            }
                        }
                        i = _getLocalX;
                        fcVar = (fc) wDObjet;
                        _getLocalX = fcVar._getLocalX() + i;
                        this = fcVar;
                        wDObjet = (C0489p) fcVar.getPere();
                    } catch (WDException e) {
                        throw e;
                    }
                }
                break;
            } catch (WDException e2) {
                throw e2;
            } catch (WDException e22) {
                throw e22;
            }
        }
        return _getLocalX;
    }

    public WDEntier4 getCouleur() {
        return new WDEntier4(this.cb);
    }

    public WDEntier4 getCouleurFond() {
        return new WDEntier4(this.f936L);
    }

    public int getDeplacementHorizontalAscendantMaxSplitter(C1123a c1123a, int i) {
        int _getLocalX = _getLocalX();
        int _getLargeur = _getLargeur();
        boolean b = C0727l.m3092b(this.Kb, 2);
        boolean b2 = C0727l.m3092b(this.Kb, 3);
        int min = b ? Math.min(i, (int) (((double) _getLocalX) / (((double) this.f952t) / 1000.0d))) : i;
        if (b2) {
            min = Math.min(min, (int) (((double) _getLargeur) / (((double) this.f935J) / 1000.0d)));
        }
        return (b || b2) ? min : Math.min(min, ((gc) c1123a)._getLocalX() - (_getLocalX + _getLargeur));
    }

    public int getDeplacementHorizontalDescendantMaxSplitter(C1123a c1123a, int i) {
        int _getLocalX = _getLocalX();
        int _getLargeur = _getLargeur();
        boolean b = C0727l.m3092b(this.Kb, 3);
        try {
            int min = (isAncrageHorizontalParSplitterInterdit() || b) ? i : Math.min(i, (int) (((double) Math.max(0, getLargeurParent() - (_getLocalX + _getLargeur))) / (((double) this.f952t) / 1000.0d)));
            if (b) {
                min = Math.min(min, (int) (((double) _getLargeur) / (((double) this.f935J) / 1000.0d)));
            }
            try {
                return (!isAncrageHorizontalParSplitterInterdit() || b) ? min : Math.min(min, _getLocalX - (((gc) c1123a)._getLocalX() + ((gc) c1123a)._getLargeur()));
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public int getDeplacementVerticalAscendantMaxSplitter(C1123a c1123a, int i) {
        int _getLocalY = _getLocalY();
        int _getHauteur = _getHauteur();
        boolean b = C0727l.m3092b(this.Kb, 0);
        boolean b2 = C0727l.m3092b(this.Kb, 1);
        int min = b ? Math.min(i, (int) (((double) _getLocalY) / (((double) this.lb) / 1000.0d))) : i;
        if (b2) {
            min = Math.min(min, (int) (((double) _getHauteur) / (((double) this.ob) / 1000.0d)));
        }
        return (b || b2) ? min : Math.min(min, ((gc) c1123a)._getLocalY() - (_getLocalY + _getHauteur));
    }

    public int getDeplacementVerticalDescendantMaxSplitter(C1123a c1123a, int i) {
        int _getLocalY = _getLocalY();
        int _getHauteur = _getHauteur();
        boolean b = C0727l.m3092b(this.Kb, 1);
        try {
            int min = (isAncrageVerticalParSplitterInterdit() || b) ? i : Math.min(i, (int) (((double) Math.max(0, getHauteurParent() - (_getLocalY + _getHauteur))) / (((double) this.lb) / 1000.0d)));
            if (b) {
                min = Math.min(min, (int) (((double) _getHauteur) / (((double) this.ob) / 1000.0d)));
            }
            try {
                return (!isAncrageVerticalParSplitterInterdit() || b) ? min : Math.min(min, _getLocalY - (((gc) c1123a)._getLocalY() + ((gc) c1123a)._getHauteur()));
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public final int getDisplayUnit() {
        try {
            return !isFenetreCree() ? 2 : getDisplayUnitWL();
        } catch (WDException e) {
            throw e;
        }
    }

    public final int getDisplayUnitWL() {
        return this.Cb;
    }

    public WDObjet getElement(String str) {
        C0532f c0532f = (C0532f) getChampParent(C0532f.class);
        if (c0532f != null) {
            try {
                return ((fc) c0532f).getElement(str);
            } catch (WDException e) {
                throw e;
            }
        }
        bb bbVar = (bb) getChampParent(bb.class);
        if (bbVar != null) {
            try {
                return ((fc) bbVar).getElement(str);
            } catch (WDException e2) {
                throw e2;
            }
        }
        if (this instanceof C0505p) {
            WDObjet chercherVariableGlobale = ((C0505p) this).chercherVariableGlobale(str);
            if (chercherVariableGlobale != null) {
                return chercherVariableGlobale;
            }
        }
        try {
            if (this instanceof db) {
                try {
                    return C0735q.m3112a((WDObjet) this, str, Vb[9]);
                } catch (WDException e3) {
                }
            }
            return super.getElement(str);
        } catch (IllegalArgumentException e4) {
            throw e4;
        }
    }

    public WDEntier4 getEtat() {
        return new WDEntier4(_getEtat());
    }

    public WDEntier4 getEtatInitial() {
        return new WDEntier4(this.Ib);
    }

    public final int getFirstPlan() {
        int i = 0;
        try {
            if (this.ub != null) {
                i = this.ub.nextSetBit(0);
            }
            return i;
        } catch (WDException e) {
            throw e;
        }
    }

    public final int getFlags() {
        return this.f937N;
    }

    public WDEntier4 getHauteur() {
        return new WDEntier4((double) C1511l.m10515a((float) _getHauteur(), 1, getDisplayUnit()));
    }

    public WDEntier4 getHauteurInitiale() {
        return new WDEntier4((double) C1511l.m10515a((float) _getHauteurInitiale(), 1, getDisplayUnit()));
    }

    public WDEntier4 getHauteurMax() {
        return new WDEntier4((double) C1511l.m10515a((float) _getHauteurMax(), 1, getDisplayUnit()));
    }

    public WDEntier4 getHauteurMin() {
        return new WDEntier4((double) C1511l.m10515a((float) _getHauteurMin(), 1, getDisplayUnit()));
    }

    protected abstract int getHauteurParent();

    public Iterator<dc> getIterateurAttributs() {
        try {
            return this.f955z != null ? this.f955z.iterator() : null;
        } catch (WDException e) {
            throw e;
        }
    }

    public WDEntier4 getLargeur() {
        return new WDEntier4((double) C1511l.m10515a((float) _getLargeur(), 1, getDisplayUnit()));
    }

    public WDEntier4 getLargeurInitiale() {
        return new WDEntier4((double) C1511l.m10515a((float) _getLargeurInitiale(), 1, getDisplayUnit()));
    }

    public WDEntier4 getLargeurMax() {
        return new WDEntier4((double) C1511l.m10515a((float) _getLargeurMax(), 1, getDisplayUnit()));
    }

    public WDEntier4 getLargeurMin() {
        return new WDEntier4((double) C1511l.m10515a((float) _getLargeurMin(), 1, getDisplayUnit()));
    }

    protected abstract int getLargeurParent();

    public C0712l getLiaisonDataBinding() {
        return this.f933C;
    }

    public WDEntier4 getLigne() {
        return new WDEntier4((double) C1511l.m10515a((float) _getY(), 1, getDisplayUnit()));
    }

    public int getLigneAbsolu() {
        int _getLocalY = _getLocalY();
        WDObjet wDObjet = (C0489p) getPere();
        while (wDObjet != null) {
            try {
                if (wDObjet.isChamp()) {
                    if (wDObjet.isZoneRepetee()) {
                        break;
                    }
                    try {
                        if (wDObjet.isColonne()) {
                            break;
                        }
                        int i;
                        fc fcVar;
                        if (wDObjet.isOnglet()) {
                            C1247p voletFromChamp = ((C1246j) wDObjet).getVoletFromChamp(this);
                            if (voletFromChamp != null) {
                                i = voletFromChamp.getPositionVolet()[1] + _getLocalY;
                                fcVar = (fc) wDObjet;
                                _getLocalY = fcVar._getLocalY() + i;
                                this = fcVar;
                                wDObjet = (C0489p) fcVar.getPere();
                            }
                        }
                        i = _getLocalY;
                        fcVar = (fc) wDObjet;
                        _getLocalY = fcVar._getLocalY() + i;
                        this = fcVar;
                        wDObjet = (C0489p) fcVar.getPere();
                    } catch (WDException e) {
                        throw e;
                    }
                }
                break;
            } catch (WDException e2) {
                throw e2;
            } catch (WDException e22) {
                throw e22;
            }
        }
        return _getLocalY;
    }

    public WDBooleen getModifie() {
        return new WDBooleen(this.rb);
    }

    public C0489p getMonParent() {
        try {
            return this.Ab != null ? this.Ab : (C0489p) getFenetreMere();
        } catch (WDException e) {
            throw e;
        }
    }

    public final int getNbAttributs() {
        try {
            return this.f955z != null ? this.f955z.size() : 0;
        } catch (WDException e) {
            throw e;
        }
    }

    public WDChaine getNote() {
        try {
            return this.f945W == null ? new WDChaine() : new WDChaine(this.f945W);
        } catch (WDException e) {
            throw e;
        }
    }

    public WDEntier4 getNumTab() {
        return new WDEntier4(_getNumTab());
    }

    public int getOrdreNavigation() {
        return this.f946Y;
    }

    public WDObjet getPlan() {
        try {
            int cardinality = this.ub != null ? this.ub.cardinality() : 0;
            switch (cardinality) {
                case 0:
                    try {
                        return new WDEntier4(0);
                    } catch (WDException e) {
                        throw e;
                    }
                case 1:
                    return new WDEntier4(this.ub.nextSetBit(0));
                default:
                    StringBuilder stringBuilder = new StringBuilder((cardinality * 2) - 1);
                    cardinality = this.ub.nextSetBit(0);
                    stringBuilder.append(cardinality);
                    while (true) {
                        cardinality = this.ub.nextSetBit(cardinality + 1);
                        if (cardinality == -1) {
                            return new WDChaine(stringBuilder.toString());
                        }
                        try {
                            stringBuilder.append(',');
                            stringBuilder.append(cardinality);
                        } catch (WDException e2) {
                            throw e2;
                        }
                    }
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    public abstract C1397c getPoliceChamp();

    public int getPreferredHeight() {
        return this.Tb;
    }

    public int getPreferredWidth() {
        return this.Eb;
    }

    public dc getPremierAttribut() {
        try {
            if (this.f955z != null) {
                if (!this.f955z.isEmpty()) {
                    return (dc) this.f955z.get(0);
                }
            }
            return null;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public WDChaine getPropLiaisonFichier() {
        try {
            return this.f933C == null ? new WDChaine() : new WDChaine(this.f933C.mo2604d());
        } catch (WDException e) {
            throw e;
        }
    }

    public EWDPropriete getProprietePourAttributAuto() {
        try {
            return this.f933C != null ? EWDPropriete.PROP_VALEUR : null;
        } catch (WDException e) {
            throw e;
        }
    }

    public gc getSuperChamp() {
        return this.Ab;
    }

    public WDEntier4 getTauxAncrageBas() {
        return new WDEntier4(this.lb);
    }

    public WDEntier4 getTauxAncrageDroite() {
        return new WDEntier4(this.f952t);
    }

    public WDEntier4 getTauxAncrageHauteur() {
        return new WDEntier4(this.ob);
    }

    public WDEntier4 getTauxAncrageLargeur() {
        return new WDEntier4(this.f935J);
    }

    public WDChaine getTitreNote() {
        try {
            return this.f951s == null ? new WDChaine() : new WDChaine(this.f951s);
        } catch (WDException e) {
            throw e;
        }
    }

    public final int getTypeChamp() {
        return this.b;
    }

    public WDObjet getValeurPropriete(EWDPropriete eWDPropriete) {
        boolean z;
        WDObjet wDObjet = null;
        if (eWDPropriete != null) {
            try {
                if (eWDPropriete != EWDPropriete.PROP_UNDEF) {
                    z = true;
                    C0691a.m2860a(z, Vb[13]);
                    if (!(eWDPropriete == null || eWDPropriete == EWDPropriete.PROP_UNDEF)) {
                        wDObjet = getProp(eWDPropriete);
                    }
                    return wDObjet == null ? wDObjet : new WDChaine();
                }
            } catch (WDException e) {
                throw e;
            }
        }
        z = false;
        try {
            C0691a.m2860a(z, Vb[13]);
            wDObjet = getProp(eWDPropriete);
            if (wDObjet == null) {
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public WDBooleen getVisible() {
        return new WDBooleen(_isVisible());
    }

    public WDBooleen getVisibleInitial() {
        return new WDBooleen(this.f949n);
    }

    public WDEntier4 getX() {
        return getColonne();
    }

    public WDEntier4 getXInitial() {
        int _getX;
        int i = this.db;
        C0489p c0489p = (C0489p) getPere();
        if (c0489p != null) {
            try {
                if (c0489p.isChamp()) {
                    if (!c0489p.isFenetre()) {
                        try {
                            if (!(c0489p.isZoneRepetee() || c0489p.isColonne())) {
                                _getX = (((gc) c0489p)._getX() - ((gc) c0489p).getXInitial().getInt()) + i;
                                return new WDEntier4((double) C1511l.m10515a((float) _getX, 1, getDisplayUnit()));
                            }
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                }
            } catch (WDException e2) {
                throw e2;
            } catch (WDException e22) {
                throw e22;
            }
        }
        _getX = i;
        return new WDEntier4((double) C1511l.m10515a((float) _getX, 1, getDisplayUnit()));
    }

    public WDEntier4 getY() {
        return getLigne();
    }

    public WDEntier4 getYInitial() {
        int i = this.f932B;
        C0489p c0489p = (C0489p) getPere();
        while (c0489p != null) {
            try {
                if (c0489p.isChamp()) {
                    if (c0489p.isFenetre()) {
                        break;
                    }
                    try {
                        if (c0489p.isZoneRepetee() || c0489p.isColonne()) {
                            break;
                        }
                        i += ((gc) c0489p)._getY() - ((gc) c0489p).getYInitial().getInt();
                        c0489p = (C0489p) c0489p.getPere();
                    } catch (WDException e) {
                        throw e;
                    }
                }
                break;
            } catch (WDException e2) {
                throw e2;
            } catch (WDException e22) {
                throw e22;
            }
        }
        return new WDEntier4((double) C1511l.m10515a((float) i, 1, getDisplayUnit()));
    }

    public abstract boolean isAffiche();

    public final boolean isAncrageActif() {
        try {
            return (this.f937N & 2) == 0;
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean isAncrageHorizontalParSplitterInterdit() {
        try {
            if (!C0727l.m3092b(this.Kb, 3)) {
                if (C0727l.m3092b(this.Kb, 2)) {
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

    public boolean isAncrageVerticalParSplitterInterdit() {
        try {
            if (!C0727l.m3092b(this.Kb, 1)) {
                if (C0727l.m3092b(this.Kb, 0)) {
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

    public boolean isChamp() {
        return true;
    }

    protected final boolean isChangementAgencementEnCours() {
        try {
            return (this.f937N & 128) == 128;
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean isConteneur() {
        return false;
    }

    public final boolean isExecPCodeInit() {
        try {
            return (this.f937N & 2048) > 0;
        } catch (WDException e) {
            throw e;
        }
    }

    public final boolean isFAAActive(int i) {
        try {
            if ((zb & i) == 0) {
                if ((f916A & i) == 0) {
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

    protected boolean isGroupable() {
        return true;
    }

    public boolean isNeedAttributAuto() {
        EWDPropriete proprietePourAttributAuto = getProprietePourAttributAuto();
        if (proprietePourAttributAuto == null) {
            return false;
        }
        try {
            if (this.f955z != null) {
                if (!this.f955z.isEmpty()) {
                    Iterator it = this.f955z.iterator();
                    while (it.hasNext()) {
                        try {
                            if (proprietePourAttributAuto == ((dc) it.next()).getProprieteAssocie()) {
                                return false;
                            }
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                    return true;
                }
            }
            return true;
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    public boolean isPersistant() {
        return this.e;
    }

    public boolean isRepaintParentEnCours() {
        return this.Fb;
    }

    public boolean isSauverValeurEnFinEditionZR() {
        return false;
    }

    public abstract boolean isVisibleExt();

    public final boolean isWithPlan() {
        try {
            return this.ub != null ? this.ub.nextSetBit(0) > 0 : false;
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void jouerAnimation(String str, int i, int i2, int i3) {
        if (i3 >= 10 && i3 <= hb.f2073f) {
            EWDPropriete eWDPropriete;
            String toLowerCase = str.toLowerCase();
            EWDPropriete eWDPropriete2 = EWDPropriete.PROP_UNDEF;
            if (toLowerCase.equals("x")) {
                eWDPropriete = EWDPropriete.PROP_COLONNE;
            } else if (toLowerCase.equals("y")) {
                eWDPropriete = EWDPropriete.PROP_LIGNE;
            } else {
                try {
                    if (toLowerCase.equals(Vb[1]) || toLowerCase.equals(Vb[4])) {
                        eWDPropriete = EWDPropriete.PROP_LARGEUR;
                    } else {
                        try {
                            if (toLowerCase.equals(Vb[2]) || toLowerCase.equals(Vb[3])) {
                                eWDPropriete = EWDPropriete.PROP_HAUTEUR;
                            } else {
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
            long currentTimeMillis = System.currentTimeMillis();
            int i4 = 0;
            while (true) {
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis2 > ((long) i3)) {
                    try {
                        affecterPropriete(eWDPropriete, new WDEntier4(i2));
                        return;
                    } catch (WDException e22) {
                        throw e22;
                    }
                }
                float min = Math.min(1.0f, ((float) currentTimeMillis2) / ((float) i3));
                int i5 = (int) (((1.0f - min) * ((float) i)) + (((float) i2) * min));
                if (i5 != i4) {
                    try {
                        affecterPropriete(eWDPropriete, new WDEntier4(i5));
                    } catch (WDException e222) {
                        throw e222;
                    }
                }
                C1515p.m10541a();
                i4 = i5;
            }
        }
    }

    public abstract void majEtatInterneChamp(int i);

    public void majPlan(int i) {
        try {
            if ((this.f937N & 32) != 32) {
                try {
                    if (!isWithPlan()) {
                        return;
                    }
                    if (this.ub.get(i)) {
                        try {
                            if (this.qb) {
                                appliquerVisibilite(true);
                                return;
                            }
                            return;
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                    appliquerVisibilite(false);
                } catch (WDException e2) {
                    throw e2;
                } catch (WDException e22) {
                    throw e22;
                }
            }
        } catch (WDException e222) {
            throw e222;
        }
    }

    public void onModifChamp() {
        try {
            setModifie(true);
            if (this.Ab != null) {
                this.Ab.onModifChamp();
                this.Ab.appelPCode(17);
            }
            try {
                if (this.f955z != null && this.f955z.size() > 0) {
                    ((dc) this.f955z.get(0)).notifModifChamp();
                }
                if (this.Jb != null) {
                    for (C0530v onModification : this.Jb) {
                        onModification.onModification(this);
                    }
                }
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean positionner() {
        /*
        r5 = this;
        r3 = r5.nb;
        r2 = r5.bb;
        r0 = r5.getPere();
        r0 = (fr.pcsoft.wdjava.ui.C0489p) r0;
        r1 = r0;
        r4 = r5;
    L_0x000c:
        if (r1 == 0) goto L_0x0056;
    L_0x000e:
        r0 = r1.isChamp();	 Catch:{ WDException -> 0x0048 }
        if (r0 == 0) goto L_0x0056;
    L_0x0014:
        r0 = r1.isOnglet();	 Catch:{ WDException -> 0x0048 }
        if (r0 == 0) goto L_0x004a;
    L_0x001a:
        r0 = r1;
        r0 = (fr.pcsoft.wdjava.ui.champs.onglet.C1246j) r0;
        r0 = r0.getVoletFromChamp(r4);
        if (r0 == 0) goto L_0x005f;
    L_0x0023:
        r0 = r0.getPositionVolet();
        r4 = 0;
        r4 = r0[r4];
        r3 = r3 - r4;
        r4 = 1;
        r0 = r0[r4];
        r0 = r2 - r0;
        r2 = r3;
    L_0x0031:
        r1 = (fr.pcsoft.wdjava.ui.champs.fc) r1;
        r3 = r1._getLocalX();
        r3 = r2 - r3;
        r2 = r1._getLocalY();
        r2 = r0 - r2;
        r0 = r1.getPere();
        r0 = (fr.pcsoft.wdjava.ui.C0489p) r0;
        r4 = r1;
        r1 = r0;
        goto L_0x000c;
    L_0x0048:
        r0 = move-exception;
        throw r0;
    L_0x004a:
        r0 = r1.isSuperChamp();	 Catch:{ WDException -> 0x005b }
        if (r0 != 0) goto L_0x005f;
    L_0x0050:
        r0 = r1.isFenetre();	 Catch:{ WDException -> 0x005d }
        if (r0 == 0) goto L_0x0056;
    L_0x0056:
        r0 = r5.setPositionRelatif(r3, r2);
        return r0;
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x005d }
    L_0x005d:
        r0 = move-exception;
        throw r0;
    L_0x005f:
        r0 = r2;
        r2 = r3;
        goto L_0x0031;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.fc.positionner():boolean");
    }

    protected void postInit() {
        this.f937N |= 2048;
        super.postInit();
    }

    public void raz(boolean z) {
    }

    public void release() {
        WDFenetre wDFenetre = (WDFenetre) getFenetreMere();
        if (wDFenetre != null) {
            try {
                if (wDFenetre.estOuverteEtAffichee()) {
                    wDFenetre.notifSuppressionChamp((gc) this);
                }
            } catch (WDException e) {
                throw e;
            }
        }
        try {
            super.release();
            this.f945W = null;
            this.f951s = null;
            if (this.f933C != null) {
                this.f933C.mo2601b();
                this.f933C = null;
            }
            try {
                this.Ab = null;
                if (this.f955z != null) {
                    this.f955z.clear();
                    this.f955z = null;
                }
                try {
                    this.sb = null;
                    if (this.Jb != null) {
                        this.Jb.clear();
                        this.Jb = null;
                    }
                    this.f953v = null;
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

    public final void removeFlag(int i) {
        this.f937N &= i ^ -1;
    }

    public void repaintInUIThread() {
        try {
            if (C0938m.m6815b()) {
                repeindreChamp();
            } else {
                C0938m.m6810a(new C1249r(this));
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public abstract void repeindreChamp();

    public abstract void repeindreChamp(int i, int i2, int i3, int i4);

    public abstract void repeindreConteneur();

    public boolean restaurerValeur() {
        if (isPersistant()) {
            String b = C0908g.m6432a().mo3203b(this);
            if (b != null) {
                try {
                    if (!b.equals("")) {
                        setValeur(b);
                        return true;
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return false;
    }

    protected boolean restauteurInfoChamp(sb sbVar) {
        if (sbVar == null) {
            return false;
        }
        try {
            setEtatInterne(sbVar.mo3405d());
            return true;
        } catch (WDException e) {
            throw e;
        }
    }

    protected sb sauverInfoChamp() {
        sb creerInfoChamp = creerInfoChamp();
        creerInfoChamp.mo3399a(getEtatInterne());
        return creerInfoChamp;
    }

    public void sauverValeur() {
        try {
            if (isPersistant()) {
                C0908g.m6432a().mo3195a(this, getValeur().getString());
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected final void savePlans(int[] iArr) {
        if (iArr == null) {
            try {
                this.ub = null;
                return;
            } catch (WDException e) {
                throw e;
            }
        }
        try {
            if (this.ub != null) {
                this.ub.clear();
            } else {
                this.ub = new BitSet();
            }
            for (int i : iArr) {
                if (i == 0) {
                    try {
                        this.ub = null;
                        return;
                    } catch (WDException e2) {
                        throw e2;
                    }
                }
                this.ub.set(i);
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    public void screenToSource(String str) {
        try {
            if (this.f933C == null) {
                return;
            }
            if (this.f933C.mo2603c()) {
                try {
                    if (!C0808l.m4053k(str)) {
                        if (!this.f933C.mo2600a(str)) {
                            return;
                        }
                    }
                    this.f933C.mo2602b(this);
                } catch (WDException e) {
                    throw e;
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

    public void setAltitude(int i) {
        int max = Math.max(i, 1);
        try {
            if (this.Ub == -1) {
                this.Ub = max;
                return;
            }
            try {
                if (getPere() != null) {
                    declageAltitude(max);
                }
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void setAncrage(int i) {
        boolean z = true;
        try {
            this.f954w = i & 15;
            try {
                this.Kb = C0727l.m3090a(this.Kb, 0, (this.f954w & 1) != 0);
                try {
                    this.Kb = C0727l.m3090a(this.Kb, 1, (this.f954w & 2) != 0);
                    try {
                        this.Kb = C0727l.m3090a(this.Kb, 2, (this.f954w & 4) != 0);
                        int i2 = this.Kb;
                        if ((this.f954w & 8) == 0) {
                            z = false;
                        }
                        this.Kb = C0727l.m3090a(i2, 3, z);
                    } catch (WDException e) {
                        throw e;
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
    }

    public final void setAncrageActif(boolean z) {
        if (z) {
            try {
                this.f937N &= -3;
                return;
            } catch (WDException e) {
                throw e;
            }
        }
        this.f937N |= 2;
    }

    public void setAncrageAuContenu(int i) {
        boolean z = true;
        try {
            try {
                this.Kb = C0727l.m3090a(this.Kb, 7, i == 1);
                int i2 = this.Kb;
                if (i != 2) {
                    z = false;
                }
                this.Kb = C0727l.m3090a(i2, 8, z);
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void setAncrageHorizontalParSplitter(boolean z) {
        this.Kb = C0727l.m3090a(this.Kb, 5, z);
    }

    protected final void setAncrageInitial(int i, int i2, int i3, int i4, int i5, int i6) {
        setAncrage(i);
        setTauxAncrage(i2, i3, i4, i5);
        setAncrageAuContenu(i6);
    }

    public void setAncrageVerticalParSplitter(boolean z) {
        this.Kb = C0727l.m3090a(this.Kb, 4, z);
    }

    protected abstract void setCadreExterieur(C1110m c1110m);

    protected void setCadreExterieur(C1110m c1110m, int i, int i2, int i3, int i4) {
        c1110m.mo3365a(C1511l.m10532d((float) i, getDisplayUnit()), C1511l.m10532d((float) i2, getDisplayUnit()), C1511l.m10532d((float) i3, getDisplayUnit()), C1511l.m10532d((float) i4, getDisplayUnit()));
        setCadreExterieur(c1110m);
    }

    protected abstract void setCadreInterne(C1110m c1110m);

    public void setColonne(int i) {
        setPositionChamp(C1511l.m10532d((float) i, getDisplayUnit()), _getY(), 8);
    }

    public void setCouleur(int i) {
        try {
            this.cb = i;
            if (i != -1) {
                appliquerCouleur(i);
            } else {
                appliquerTransparent();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void setCouleurFond(int i) {
        try {
            this.f936L = i;
            if (i == -1 || i == -16777216) {
                appliquerCouleurFondTransparent();
            } else {
                appliquerCouleurFond(i);
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void setEtat(int i) {
        if (i == 2) {
            try {
                this.d = i;
                setVisible(false);
            } catch (WDException e) {
                throw e;
            }
        } else if (i == 16384) {
            try {
                setEtat(0);
                setVisible(true);
            } catch (WDException e2) {
                throw e2;
            }
        }
    }

    public void setEtatInitial(int i) {
        this.Ib = i;
        setEtat(i);
    }

    public abstract void setEtatInterne(int i);

    public void setFenetre(C0508h c0508h) {
        int i = 2;
        try {
            super.setFenetre(c0508h);
            if (this.f != null) {
                if (!this.f.isUniteAffichageLogique()) {
                    i = 1;
                }
                this.Cb = i;
                return;
            }
            try {
                if (!c0508h.isUniteAffichageLogique()) {
                    i = 1;
                }
                this.Cb = i;
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    public final void setFlags(int i) {
        this.f937N = i;
    }

    public void setHauteur(int i) {
        setTailleChamp(_getLargeur(), C1511l.m10532d((float) i, getDisplayUnit()), 4);
    }

    public void setHauteurInitiale(int i) {
        setTailleInitiale(this.f942T, C1511l.m10532d((float) i, getDisplayUnit()));
    }

    public void setHauteurMax(int i) {
        setTailleMax(this.hb, C1511l.m10532d((float) i, getDisplayUnit()));
    }

    public void setHauteurMin(int i) {
        setTailleMin(this.f934I, C1511l.m10532d((float) i, getDisplayUnit()));
    }

    public void setLargeur(int i) {
        setTailleChamp(C1511l.m10532d((float) i, getDisplayUnit()), _getHauteur(), 4);
    }

    public void setLargeurInitiale(int i) {
        setTailleInitiale(C1511l.m10532d((float) i, getDisplayUnit()), this.f939Q);
    }

    public void setLargeurMax(int i) {
        setTailleMax(C1511l.m10532d((float) i, getDisplayUnit()), this.f947Z);
    }

    public void setLargeurMin(int i) {
        setTailleMin(C1511l.m10532d((float) i, getDisplayUnit()), this.Lb);
    }

    public void setLiaisonFichier(String str, String str2) {
        try {
            this.f933C = ((fr.pcsoft.wdjava.database.hf.bb) WDAppelContexte.m2679a(fr.pcsoft.wdjava.database.hf.bb.class)).mo3081a(str, str2);
        } catch (Exception e) {
            C0691a.m2857a(Vb[5], e);
        }
    }

    public void setLiaisonFichier(String str, String str2, String str3, String str4, String str5) {
        try {
            this.f933C = ((fr.pcsoft.wdjava.database.hf.bb) WDAppelContexte.m2679a(fr.pcsoft.wdjava.database.hf.bb.class)).mo3082a(str, str2, str3, str4, str5);
        } catch (Exception e) {
            C0691a.m2857a(Vb[5], e);
        }
    }

    public void setLiaisonFichier(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        try {
            this.f933C = ((fr.pcsoft.wdjava.database.hf.bb) WDAppelContexte.m2679a(fr.pcsoft.wdjava.database.hf.bb.class)).mo3083a(str, str2, str3, str4, str5, str6, str7, str8);
        } catch (Exception e) {
            C0691a.m2857a(Vb[5], e);
        }
    }

    public void setLiaisonVariable(String str) {
        this.f933C = new C0713b(str);
    }

    protected void setLibelleHAlign(int i) {
    }

    protected void setLibelleVAlign(int i) {
    }

    public void setLigne(int i) {
        setPositionChamp(_getX(), C1511l.m10532d((float) i, getDisplayUnit()), 8);
    }

    public abstract void setMenuContextuelSysteme();

    public void setModifie(boolean z) {
        this.rb = z;
    }

    protected void setNavigable(boolean z) {
        this.Mb = z;
    }

    public void setNote(String str) {
        this.f945W = str;
    }

    protected final void setNote(String str, String str2) {
        this.f945W = str2;
        this.f951s = str;
    }

    public void setNumTab(int i) {
        C0509v c0509v = (C0509v) getFenetreMere();
        try {
            if (this.pb == -1) {
                this.pb = i;
                c0509v.ajouterChampNumTable(this);
                return;
            }
            if (i > c0509v.getMaxNumTab()) {
                i = c0509v.getMaxNumTab();
            }
            c0509v.majNumTab(this.pb, i);
            this.pb = i;
            c0509v.viderListeChampNavigable();
            c0509v.majOrdreNavigation(c0509v);
        } catch (WDException e) {
            throw e;
        }
    }

    public void setOrdreNavigation(int i) {
        this.f946Y = i;
    }

    public void setPlan(int i) {
        int[] iArr;
        if (i > 0) {
            try {
                iArr = new int[]{i};
            } catch (WDException e) {
                throw e;
            }
        }
        iArr = null;
        setPlans(iArr);
    }

    public void setPlan(String str) {
        int i = 0;
        try {
            if (C0808l.m4053k(str)) {
                setPlans(null);
                return;
            }
            String[] j = C0808l.m4052j(str);
            int[] iArr = new int[j.length];
            int length = j.length;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                iArr[i2] = C0725i.m3064d(j[i]);
                i++;
                i2 = i3;
            }
            setPlans(iArr);
        } catch (WDException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void setPlans(int[] r3) {
        /*
        r2 = this;
        r2.savePlans(r3);	 Catch:{ WDException -> 0x000c }
        r0 = r2.f937N;	 Catch:{ WDException -> 0x000c }
        r0 = r0 & 32;
        r1 = 32;
        if (r0 != r1) goto L_0x000e;
    L_0x000b:
        return;
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r0 = r2.isWithPlan();	 Catch:{ WDException -> 0x0047 }
        if (r0 == 0) goto L_0x003c;
    L_0x0014:
        r0 = r2.f;	 Catch:{ WDException -> 0x0049 }
        if (r0 == 0) goto L_0x0026;
    L_0x0018:
        r0 = r2.ub;	 Catch:{ WDException -> 0x004b }
        r1 = r2.f;	 Catch:{ WDException -> 0x004b }
        r1 = r1.getPlanActif();	 Catch:{ WDException -> 0x004b }
        r0 = r0.get(r1);	 Catch:{ WDException -> 0x004b }
        if (r0 != 0) goto L_0x003c;
    L_0x0026:
        r0 = r2.f;	 Catch:{ WDException -> 0x004d }
        if (r0 != 0) goto L_0x0053;
    L_0x002a:
        r0 = r2.l;	 Catch:{ WDException -> 0x004f }
        if (r0 == 0) goto L_0x0053;
    L_0x002e:
        r0 = r2.ub;	 Catch:{ WDException -> 0x0051 }
        r1 = r2.l;	 Catch:{ WDException -> 0x0051 }
        r1 = r1.getPlanActif();	 Catch:{ WDException -> 0x0051 }
        r0 = r0.get(r1);	 Catch:{ WDException -> 0x0051 }
        if (r0 == 0) goto L_0x0053;
    L_0x003c:
        r0 = r2.qb;	 Catch:{ WDException -> 0x0045 }
        if (r0 == 0) goto L_0x000b;
    L_0x0040:
        r0 = 1;
        r2.appliquerVisibilite(r0);	 Catch:{ WDException -> 0x0045 }
        goto L_0x000b;
    L_0x0045:
        r0 = move-exception;
        throw r0;
    L_0x0047:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x004b }
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0045 }
    L_0x0053:
        r0 = 0;
        r2.appliquerVisibilite(r0);
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.fc.setPlans(int[]):void");
    }

    public boolean setPositionChamp(int i, int i2, int i3) {
        int i4 = this.nb;
        int i5 = this.bb;
        this.nb = i;
        this.bb = i2;
        if (!positionner()) {
            return false;
        }
        int i6 = i - i4;
        i5 = i2 - i5;
        if ((i3 & 4) > 0) {
            try {
                this.Sb += i6;
                this.f940R += i5;
            } catch (WDException e) {
                throw e;
            }
        }
        if (this.Jb != null) {
            for (C0530v onPositionChanged : this.Jb) {
                onPositionChanged.onPositionChanged(this, i6, i5, i3);
            }
        }
        return true;
    }

    public void setPositionInitiale(int i, int i2) {
        try {
            if (isFenetreCree()) {
                this.db = i;
                this.f932B = i2;
            } else {
                this.db = C1511l.m10532d((float) i, 2);
                this.f932B = C1511l.m10532d((float) i2, 2);
                setPositionChamp(this.db, this.f932B, 0);
            }
            this.Sb = this.db;
            this.f940R = this.f932B;
        } catch (WDException e) {
            throw e;
        }
    }

    public abstract boolean setPositionRelatif(int i, int i2);

    protected void setPresenceLibelle(boolean z) {
        this.f941S = z;
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        setProp(eWDPropriete, wDObjet, true);
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet, boolean z) {
        try {
            super.setProp(eWDPropriete, wDObjet);
            if (this.f953v != null) {
                this.f953v.mo3506a(eWDPropriete, wDObjet, z);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, boolean z) {
        try {
            super.setProp(eWDPropriete, z);
            if (this.f953v != null) {
                this.f953v.m4217a(eWDPropriete, z, true);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected void setPropDouble(EWDPropriete eWDPropriete, double d) {
        try {
            super.setPropDouble(eWDPropriete, d);
            if (this.f953v != null) {
                this.f953v.m4212a(eWDPropriete, d, true);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected void setPropInt(EWDPropriete eWDPropriete, int i) {
        try {
            super.setPropInt(eWDPropriete, i);
            if (this.f953v != null) {
                this.f953v.m4213a(eWDPropriete, i, true);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void setPropLiaisonFichier(String str) {
        try {
            if (!C0808l.m4053k(str)) {
                try {
                    if (str.charAt(0) == ':') {
                        this.f933C = new C0713b(str);
                    } else {
                        this.f933C = ((fr.pcsoft.wdjava.database.hf.bb) WDAppelContexte.m2679a(fr.pcsoft.wdjava.database.hf.bb.class)).mo3080a(str);
                    }
                    try {
                        if (this.f955z != null && this.f955z.size() > 0) {
                            EWDPropriete proprietePourAttributAuto = getProprietePourAttributAuto();
                            Iterator it = this.f955z.iterator();
                            while (it.hasNext()) {
                                dc dcVar = (dc) it.next();
                                try {
                                    if (dcVar.getProprieteAssocie() == proprietePourAttributAuto) {
                                        dcVar.setLiaisonDataBinding(this.f933C);
                                    }
                                } catch (WDException e) {
                                    throw e;
                                }
                            }
                        }
                    } catch (WDException e2) {
                        throw e2;
                    }
                } catch (WDException e22) {
                    throw e22;
                }
            } else if (this.f933C != null) {
                this.f933C.mo2601b();
                this.f933C = null;
            }
        } catch (WDException e222) {
            throw e222;
        } catch (WDException e2222) {
            throw e2222;
        }
    }

    protected void setPropLong(EWDPropriete eWDPropriete, long j) {
        try {
            super.setPropLong(eWDPropriete, j);
            if (this.f953v != null) {
                this.f953v.m4214a(eWDPropriete, j, true);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    protected void setPropString(EWDPropriete eWDPropriete, String str) {
        try {
            super.setPropString(eWDPropriete, str);
            if (this.f953v != null) {
                this.f953v.m4216a(eWDPropriete, str, true);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void setSuperChamp(gc gcVar) {
        this.Ab = gcVar;
    }

    public abstract boolean setTailleChamp(int i, int i2, int i3);

    public void setTailleInitiale(int i, int i2) {
        try {
            if (isFenetreCree()) {
                this.f942T = i;
                this.f939Q = i2;
            } else {
                this.f942T = C1511l.m10532d((float) i, 2);
                this.f939Q = C1511l.m10532d((float) i2, 2);
                setTailleChamp(this.f942T, this.f939Q, 0);
            }
            int i3 = this.f942T;
            this.f943U = i3;
            this.Eb = i3;
            i3 = this.f939Q;
            this.f950p = i3;
            this.Tb = i3;
        } catch (WDException e) {
            throw e;
        }
    }

    protected void setTailleMax(int i, int i2) {
        try {
            if (isFenetreCree()) {
                this.hb = i;
                this.f947Z = i2;
                return;
            }
            if (i != -1) {
                i = C1511l.m10532d((float) i, 2);
            }
            try {
                this.hb = i;
                if (i2 != -1) {
                    i2 = C1511l.m10532d((float) i2, 2);
                }
                this.f947Z = i2;
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    protected void setTailleMin(int i, int i2) {
        try {
            if (isFenetreCree()) {
                this.f934I = i;
                this.Lb = i2;
                return;
            }
            if (i != -1) {
                i = C1511l.m10532d((float) i, 2);
            }
            try {
                this.f934I = i;
                if (i2 != -1) {
                    i2 = C1511l.m10532d((float) i2, 2);
                }
                this.Lb = i2;
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    public void setTailleUtile(int i, int i2) {
    }

    protected void setTauxAncrage(int i, int i2, int i3, int i4) {
        this.f935J = i;
        this.ob = i2;
        this.lb = i4;
        this.f952t = i3;
    }

    public void setTauxAncrageBas(int i) {
        setTauxAncrage(this.f935J, this.ob, this.f952t, i);
    }

    public void setTauxAncrageDroite(int i) {
        setTauxAncrage(this.f935J, this.ob, i, this.lb);
    }

    public void setTauxAncrageHauteur(int i) {
        setTauxAncrage(this.f935J, i, this.f952t, this.lb);
    }

    public void setTauxAncrageLargeur(int i) {
        setTauxAncrage(i, this.ob, this.f952t, this.lb);
    }

    public void setTitreNote(String str) {
        this.f951s = str;
    }

    public void setVisible(boolean z) {
        this.qb = z;
        setVisibleInternal(z);
    }

    public void setVisibleInitial(boolean z) {
        try {
            if (isFenetreCree()) {
                WDErreurManager.m2883a(C0745b.m3222b(Vb[10], C0745b.m3219a(Vb[11])));
            }
            setVisible(z);
            this.f949n = z;
        } catch (WDException e) {
            throw e;
        }
    }

    protected void setVisibleInternal(boolean z) {
        if (z) {
            try {
                if (canBecomeVisible()) {
                    appliquerVisibilite(true);
                    return;
                }
                return;
            } catch (WDException e) {
                throw e;
            }
        }
        appliquerVisibilite(false);
    }

    public void setX(int i) {
        setColonne(i);
    }

    public void setXInitial(int i) {
        setPositionInitiale(C1511l.m10532d((float) i, getDisplayUnit()), this.f932B);
    }

    public void setY(int i) {
        setLigne(i);
    }

    public void setYInitial(int i) {
        setPositionInitiale(this.db, C1511l.m10532d((float) i, getDisplayUnit()));
    }

    public void sortieChamp() {
        try {
            if (this.Ab != null) {
                this.Ab.appelPCode(16);
            }
            super.sortieChamp();
        } catch (WDException e) {
            throw e;
        }
    }

    public void sourceToScreen(String str) {
        try {
            if (this.f933C == null) {
                return;
            }
            if (this.f933C.mo2603c()) {
                try {
                    if (!C0808l.m4053k(str)) {
                        if (!this.f933C.mo2600a(str)) {
                            return;
                        }
                    }
                    this.f933C.mo2598a((WDObjet) this);
                } catch (WDException e) {
                    throw e;
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

    public abstract void updateLayout();

    public abstract void updateUIChamp();
}
