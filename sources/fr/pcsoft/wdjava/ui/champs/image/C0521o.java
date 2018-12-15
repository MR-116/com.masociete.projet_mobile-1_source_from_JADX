package fr.pcsoft.wdjava.ui.champs.image;

import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.db;
import fr.pcsoft.wdjava.ui.champs.dc;
import fr.pcsoft.wdjava.ui.champs.hc;
import fr.pcsoft.wdjava.ui.champs.table.colonne.C1278a;
import fr.pcsoft.wdjava.ui.champs.zr.bb;
import fr.pcsoft.wdjava.ui.dessin.C1333c;
import fr.pcsoft.wdjava.ui.dessin.C1367h;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1336b;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1348m;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1353s;
import fr.pcsoft.wdjava.ui.p065b.C1094e;
import fr.pcsoft.wdjava.ui.utils.C1508i;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import java.util.Iterator;

/* renamed from: fr.pcsoft.wdjava.ui.champs.image.o */
public abstract class C0521o extends hc implements C0520c {
    public static final int Cc = 4;
    public static final int Hc = 8;
    protected static final int Kc = 8;
    protected static final int Qc = 4;
    protected static final int Sc = 256;
    protected static final int Tc = 4;
    public static final int Uc = 2;
    protected static final int Wc = 2;
    protected static final int Xc = 64;
    public static final int Zc = 1;
    protected static final int ad = 32;
    protected static final int cd = 1;
    protected static final int dd = 1;
    protected static final int fd = 2;
    protected static final int gd = 128;
    public static final int id = 8;
    protected static final int kd = 16;
    private static final String[] nd = new String[]{C0521o.m1451z(C0521o.m1452z("g\u0010eJ/\u0001\u0006eD,\u0001")), C0521o.m1451z(C0521o.m1452z("g\u000fiG-\u0011\u000bwB&\u0012\u0018dB,\u0001\u0006xY'\u0014\u000baN<\u0001\u0006\u001a")), C0521o.m1451z(C0521o.m1452z("g\tgG!\u0007\u001cwB<\u0005\u0015aZ=\u0001")), C0521o.m1451z(C0521o.m1452z("g\tgG!\u0007\u001cwI)\u0016\u000bmN")), C0521o.m1451z(C0521o.m1452z("g\u0001wB%\u0005\u001em")), C0521o.m1451z(C0521o.m1452z("g\u000fiG-\u0011\u000bw[:\u000b\tzB-\u0010\u001cwX=\u0014\u0006\u0018")), C0521o.m1451z(C0521o.m1452z("g\u0010eJ/\u0001")), C0521o.m1451z(C0521o.m1452z("g\u0015iY/\u0001\fzT!\t\u0018oN")), C0521o.m1451z(C0521o.m1452z("g\tgG!\u0007\u001cwE'\t")), C0521o.m1451z(C0521o.m1452z("g\tgG!\u0007\u001cwL:\u0005\n")), C0521o.m1451z(C0521o.m1452z("g\u0017}F7\u0010\u0018j")), C0521o.m1451z(C0521o.m1452z("g\tgG!\u0007\u001cw_)\r\u0015dN")), C0521o.m1451z(C0521o.m1452z("g\u0000wB%\u0005\u001em")), C0521o.m1451z(C0521o.m1452z("\u0007<\bh\t7yLd\u00010yÂ\u001a!y\\y\t--Á+\f%7[+\u0004!*\bh\u0004%*[n\u001bd?Ag\u0004!*\u0006")), C0521o.m1451z(C0521o.m1452z("g\u0011i^<\u0001\fzT!\t\u0018oN")), C0521o.m1451z(C0521o.m1452z("g\tgG!\u0007\u001cwX'\u0011\u0015aL&\u0001\u001c"))};
    protected int Dc = 0;
    protected int Ec = 0;
    protected int Fc = 0;
    protected int Gc = -1;
    protected int Ic = 0;
    protected int Jc = 0;
    protected int Lc = 0;
    private String Mc = "";
    protected C1367h Nc = null;
    protected int Oc = -1;
    protected int Pc = 0;
    protected int Rc = 0;
    protected int Vc = 0;
    protected int Yc = 0;
    protected int bd = 0;
    protected int ed = 0;
    protected String hd = "";
    protected int jd = 0;
    protected int ld = 0;
    protected int md = 1;

    protected C0521o(C1278a c1278a) {
        super(c1278a);
    }

    /* renamed from: a */
    private void m1438a(int i) throws WDException {
        this.Oc = i;
        int i2 = this.ed;
        if (i == -1) {
            i = i2;
        } else if (i < 0) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(nd[5], getNom().getString(), C0745b.m3219a(nd[14])));
            } catch (WDException e) {
                throw e;
            }
        }
        int min = Math.min(i, i2);
        this.Jc = min;
        this.ed = Math.min(i2 - Math.min(this.Vc, i2), min);
        repeindreChamp();
    }

    /* renamed from: a */
    private void m1439a(boolean z) {
        double min = Math.min(((double) getLargeurCompDessin()) / ((double) this.Pc), ((double) getHauteurCompDessin()) / ((double) this.ed));
        if (z) {
            min = Math.min(min, 1.0d);
        }
        int largeurCompDessin = getLargeurCompDessin() / 2;
        int hauteurCompDessin = getHauteurCompDessin() / 2;
        this.Dc = (int) (((double) this.Pc) * min);
        this.Rc = (int) (min * ((double) this.ed));
        this.Ic = largeurCompDessin - (this.Dc / 2);
        this.Lc = hauteurCompDessin - (this.Rc / 2);
    }

    /* renamed from: b */
    private void m1440b() {
        try {
            if (((this.Fc & 983040) & 65536) == 65536) {
                this.Lc = (getHauteurCompDessin() / 2) - (this.Rc / 2);
            } else {
                try {
                    if (((this.Fc & 983040) & 131072) == 131072) {
                        this.Lc = getHauteurCompDessin() - this.Rc;
                    } else {
                        this.Lc = 0;
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
            try {
                if (((this.Fc & 983040) & 262144) == 262144) {
                    this.Ic = (getLargeurCompDessin() / 2) - (this.Dc / 2);
                    return;
                }
                try {
                    if (((this.Fc & 983040) & 524288) == 524288) {
                        this.Ic = getLargeurCompDessin() - this.Dc;
                    } else {
                        this.Ic = 0;
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

    /* renamed from: b */
    private void m1441b(int i) throws WDException {
        if (i < 0) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(nd[5], getNom().getString(), C0745b.m3219a(nd[4])));
            } catch (WDException e) {
                throw e;
            }
        }
        this.Pc = Math.min(this.Pc - Math.min(i, this.Pc), this.jd);
        repeindreChamp();
    }

    /* renamed from: b */
    private void m1442b(boolean z) {
        double min = Math.min(((double) getLargeurCompDessin()) / ((double) this.Pc), ((double) getHauteurCompDessin()) / ((double) this.ed));
        if (z) {
            min = Math.min(min, 1.0d);
        }
        this.Dc = (int) (((double) this.Pc) * min);
        this.Rc = (int) (min * ((double) this.ed));
        m1440b();
    }

    /* renamed from: c */
    private void m1443c() {
        this.Ic = 0;
        this.Lc = 0;
        this.Dc = this.Pc;
        this.Rc = this.ed;
    }

    /* renamed from: c */
    private void m1444c(int i) throws WDException {
        this.Gc = i;
        int i2 = this.Pc;
        if (i == -1) {
            i = i2;
        }
        if (i < 0) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(nd[5], getNom().getString(), C0745b.m3219a(nd[7])));
            } catch (WDException e) {
                throw e;
            }
        }
        int min = Math.min(i, i2);
        this.jd = min;
        this.Pc = Math.min(i2 - Math.min(this.ld, i2), min);
        repeindreChamp();
    }

    /* renamed from: d */
    private void m1445d() {
        this.Dc = this.Pc;
        this.Rc = this.ed;
        m1440b();
    }

    /* renamed from: d */
    private void m1446d(int i) throws WDException {
        if (i < 0) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(nd[5], getNom().getString(), C0745b.m3219a(nd[12])));
            } catch (WDException e) {
                throw e;
            }
        }
        this.ed = Math.min(this.ed - Math.min(this.ed, i), this.Jc);
        repeindreChamp();
    }

    /* renamed from: e */
    private void m1447e() {
        double max = Math.max(((double) getLargeurCompDessin()) / ((double) this.Pc), ((double) getHauteurCompDessin()) / ((double) this.ed));
        this.Dc = (int) (((double) this.Pc) * max);
        this.Rc = (int) (max * ((double) this.ed));
        m1440b();
    }

    /* renamed from: f */
    private void m1448f() {
        int hauteurCompDessin = getHauteurCompDessin() / 2;
        this.Ic = (getLargeurCompDessin() / 2) - (this.Pc / 2);
        this.Lc = hauteurCompDessin - (this.ed / 2);
        this.Dc = this.Pc;
        this.Rc = this.ed;
    }

    /* renamed from: g */
    private void m1449g() {
        this.Ic = 0;
        this.Lc = 0;
        this.Dc = getLargeurCompDessin();
        this.Rc = getHauteurCompDessin();
    }

    /* renamed from: h */
    private void m1450h() {
        double max = Math.max(((double) getLargeurCompDessin()) / ((double) this.Pc), ((double) getHauteurCompDessin()) / ((double) this.ed));
        int largeurCompDessin = getLargeurCompDessin() / 2;
        int hauteurCompDessin = getHauteurCompDessin() / 2;
        this.Dc = (int) (((double) this.Pc) * max);
        this.Rc = (int) (max * ((double) this.ed));
        this.Ic = largeurCompDessin - (this.Dc / 2);
        this.Lc = hauteurCompDessin - (this.Rc / 2);
    }

    /* renamed from: z */
    private static String m1451z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 68;
                    break;
                case 1:
                    i2 = 89;
                    break;
                case 2:
                    i2 = 40;
                    break;
                case 3:
                    i2 = 11;
                    break;
                default:
                    i2 = 104;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1452z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 104);
        }
        return toCharArray;
    }

    protected void appliquerModeAffichage() {
        try {
            if (!isImageAffichee()) {
                return;
            }
            if (this.bd != 0) {
                try {
                    switch (this.bd) {
                        case 5:
                            m1442b(false);
                            return;
                        case 7:
                            m1447e();
                            return;
                        case 8:
                            m1450h();
                            return;
                        case 9:
                            m1442b(true);
                            return;
                        case 10:
                            m1439a(true);
                            return;
                        case 67:
                            m1448f();
                            return;
                        case 69:
                            m1449g();
                            return;
                        case 72:
                            m1439a(false);
                            return;
                        case 77:
                            m1443c();
                            return;
                        case 78:
                            m1445d();
                            return;
                        default:
                            WDErreurManager.m2883a(C0745b.m3222b(nd[1], C0745b.m3219a(nd[0])));
                            return;
                    }
                } catch (WDException e) {
                    throw e;
                }
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    public boolean appliquerRedimensionnement(int i, int i2, int i3) {
        C1353s creerCopieImage;
        int d = C1511l.m10532d((float) i, getDisplayUnit());
        int d2 = C1511l.m10532d((float) i2, getDisplayUnit());
        if (i3 != 4) {
            creerCopieImage = creerCopieImage(8, d, d2, 0, 0);
        } else {
            C1353s creerCopieImage2 = creerCopieImage(0, 0, 0, 0, 0);
            creerCopieImage = C1353s.m9718a(C1508i.m10477a(creerCopieImage2.m9725f(), d, d2, 4, true));
            creerCopieImage2.mo3730a();
        }
        try {
            if (this.Nc != null) {
                this.Nc.m9772a(creerCopieImage);
            } else {
                this.Nc = new C1367h(this, creerCopieImage);
            }
            repeindreChamp();
            return true;
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean appliquerRotation(double d, int i, int i2, int i3) {
        C1511l.m10532d((float) i, getDisplayUnit());
        C1511l.m10532d((float) i2, getDisplayUnit());
        C1353s creerCopieImage = creerCopieImage(4, (int) d, 0, 0, 0);
        try {
            if (this.Nc != null) {
                this.Nc.m9772a(creerCopieImage);
            } else {
                this.Nc = new C1367h(this, creerCopieImage);
            }
            repeindreChamp();
            return true;
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean appliquerSymetrieHorizontale() {
        C1353s creerCopieImage = creerCopieImage(1, 0, 0, 0, 0);
        try {
            if (this.Nc != null) {
                this.Nc.m9772a(creerCopieImage);
            } else {
                this.Nc = new C1367h(this, creerCopieImage);
            }
            repeindreChamp();
            return true;
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean appliquerSymetrieVerticale() {
        C1353s creerCopieImage = creerCopieImage(2, 0, 0, 0, 0);
        try {
            if (this.Nc != null) {
                this.Nc.m9772a(creerCopieImage);
            } else {
                this.Nc = new C1367h(this, creerCopieImage);
            }
            repeindreChamp();
            return true;
        } catch (WDException e) {
            throw e;
        }
    }

    public void associerAttribut(dc dcVar) {
        super.associerAttribut(dcVar);
        EWDPropriete proprieteAssocie = dcVar.getProprieteAssocie();
        if (proprieteAssocie != null) {
            try {
                if (!proprieteAssocie.equals(EWDPropriete.PROP_VALEUR)) {
                    return;
                }
                if (getChampParent(bb.class) != null) {
                    this.Ec |= 8;
                }
            } catch (WDException e) {
                throw e;
            } catch (WDException e2) {
                throw e2;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void calculerDimensionInitiale() {
        /*
        r3 = this;
        r0 = r3.getLargeurOriginaleImage();
        r1 = r3.getHauteurOriginaleImage();
        r2 = r3.Gc;	 Catch:{ WDException -> 0x0021 }
        if (r2 <= 0) goto L_0x0010;
    L_0x000c:
        r2 = r3.Gc;	 Catch:{ WDException -> 0x0023 }
        if (r2 <= r0) goto L_0x0014;
    L_0x0010:
        r3.Pc = r0;	 Catch:{ WDException -> 0x0023 }
        r3.jd = r0;	 Catch:{ WDException -> 0x0023 }
    L_0x0014:
        r0 = r3.Oc;	 Catch:{ WDException -> 0x0025 }
        if (r0 <= 0) goto L_0x001c;
    L_0x0018:
        r0 = r3.Oc;	 Catch:{ WDException -> 0x0027 }
        if (r0 <= r1) goto L_0x0020;
    L_0x001c:
        r3.ed = r1;	 Catch:{ WDException -> 0x0027 }
        r3.Jc = r1;	 Catch:{ WDException -> 0x0027 }
    L_0x0020:
        return;
    L_0x0021:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0023 }
    L_0x0023:
        r0 = move-exception;
        throw r0;
    L_0x0025:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0027 }
    L_0x0027:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.image.o.calculerDimensionInitiale():void");
    }

    public void convertirPositionDansImage(int[] iArr) {
        try {
            if (isImageAffichee()) {
                iArr[0] = iArr[0] - this.Ic;
                iArr[1] = iArr[1] - this.Lc;
                return;
            }
            iArr[0] = -1;
            iArr[1] = -1;
        } catch (WDException e) {
            throw e;
        }
    }

    protected abstract C1353s creerCopieImage(int i, int i2, int i3, int i4, int i5);

    protected C1367h creerImageMemoire(boolean z) {
        return new C1367h(this, creerCopieImage(0, 0, 0, 0, z ? 1 : 0));
    }

    public boolean estNavigable(boolean z) {
        return false;
    }

    public String getCheminImage() {
        return this.hd;
    }

    protected abstract int getHauteurCompDessin();

    public WDEntier4 getHauteurImage() {
        return new WDEntier4((double) C1511l.m10515a((float) this.Oc, 1, getDisplayUnit()));
    }

    protected abstract int getHauteurOriginaleImage();

    public C1367h getImageMemoire(int i) {
        boolean z = true;
        boolean z2 = (i & 1) != 1;
        try {
            if (this.Nc == null || z2) {
                if (this.Nc != null) {
                    this.Nc.mo2348d();
                    this.Nc = null;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i & 2) != 2) {
                    z = false;
                }
                try {
                    this.Nc = creerImageMemoire(z);
                    if (z2) {
                        repeindreChamp();
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
            return this.Nc;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public WDEntier4 getImageMode() {
        return new WDEntier4(this.bd);
    }

    public C1336b getImagePeintre(int i, boolean z) {
        switch (i) {
            case 0:
                break;
            case 1:
                return new C1348m(creerCopieImage(0, 0, 0, 0, 2).m9725f());
            case 2:
                return new C1348m(creerCopieImage(0, 0, 0, 0, 5).m9725f());
            case 3:
                C0691a.m2860a(false, nd[13]);
                return null;
            default:
                try {
                    if (!isImageAffichee()) {
                        if (this.Nc == null) {
                            return null;
                        }
                    }
                } catch (WDException e) {
                    throw e;
                } catch (WDException e2) {
                    throw e2;
                }
                break;
        }
        try {
            return this.Nc != null ? this.Nc.m9794h().m9720a(z) : new C1348m(creerCopieImage(0, 0, 0, 0, 1).m9725f());
        } catch (WDException e22) {
            throw e22;
        }
    }

    protected abstract int getLargeurCompDessin();

    public WDEntier4 getLargeurImage() {
        return new WDEntier4((double) C1511l.m10515a((float) this.Gc, 1, getDisplayUnit()));
    }

    protected abstract int getLargeurOriginaleImage();

    public String getNomType() {
        return C0745b.m3220a(nd[6], new String[0]);
    }

    public WDEntier4 getNumTab() {
        erreurAppelPropriete(C0745b.m3219a(nd[10]));
        return null;
    }

    public WDBooleen getPoliceBarree() {
        erreurAppelPropriete(C0745b.m3219a(nd[3]));
        return null;
    }

    public WDBooleen getPoliceGras() {
        erreurAppelPropriete(C0745b.m3219a(nd[9]));
        return null;
    }

    public WDBooleen getPoliceItalique() {
        erreurAppelPropriete(C0745b.m3219a(nd[2]));
        return null;
    }

    public WDChaine getPoliceNom() {
        erreurAppelPropriete(C0745b.m3219a(nd[8]));
        return null;
    }

    public WDBooleen getPoliceSoulignee() {
        erreurAppelPropriete(C0745b.m3219a(nd[15]));
        return null;
    }

    public WDEntier4 getPoliceTaille() {
        erreurAppelPropriete(C0745b.m3219a(nd[11]));
        return null;
    }

    public int getTypeVar() {
        return 30;
    }

    public WDObjet getValeur() {
        try {
            return this.Nc != null ? new WDChaine() : new WDChaine(C1094e.m7941a(this.hd));
        } catch (WDException e) {
            throw e;
        }
    }

    public WDObjet getValeurInitiale() {
        return new WDChaine(this.Mc);
    }

    public WDEntier4 getXImage() {
        return new WDEntier4((double) C1511l.m10515a((float) this.ld, 1, getDisplayUnit()));
    }

    public WDEntier4 getYImage() {
        return new WDEntier4((double) C1511l.m10515a((float) this.Vc, 1, getDisplayUnit()));
    }

    protected void initParam(boolean z) {
        try {
            if (isImageAffichee()) {
                calculerDimensionInitiale();
                setImageMode(this.bd);
                if (z) {
                    setTransparence(this.md);
                    setSymetrie(this.Yc);
                }
            }
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public boolean isAvecImageMemoire() {
        try {
            return this.Nc != null;
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean isChampImage() {
        return true;
    }

    public boolean isClicable() {
        try {
            return (this.Ec & 1) == 1;
        } catch (WDException e) {
            throw e;
        }
    }

    public abstract boolean isImageAffichee();

    protected final boolean isOrientationExif() {
        try {
            return (this.Ec & 2) == 2;
        } catch (WDException e) {
            throw e;
        }
    }

    public void libererImageMemoire() {
        try {
            if (this.Nc != null) {
                this.Nc.mo2348d();
                this.Nc = null;
                repeindreChamp();
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void majAffichage() {
        repeindreChamp();
    }

    public void majAffichage(int i, int i2, int i3, int i4) {
        repeindreChamp(i, i2, i3, i4);
    }

    protected abstract void onImageChanged();

    public void raz(boolean z) {
        setValeur(getValeurInitiale());
    }

    public void release() {
        try {
            super.release();
            if (this.Nc != null) {
                this.Nc.mo2348d();
                this.Nc = null;
            }
            this.hd = null;
            this.Mc = null;
        } catch (WDException e) {
            throw e;
        }
    }

    public void screenToSource(String str) {
        try {
            if (isImageAffichee()) {
                if (C0808l.m4053k(this.hd)) {
                    try {
                        if (!isAvecImageMemoire()) {
                            return;
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
            super.screenToSource(str);
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    public void setHauteurImage(int i) {
        try {
            this.Oc = C1511l.m10532d((float) i, getDisplayUnit());
            if (isImageAffichee()) {
                m1438a(i);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void setImageMode(int i) {
        this.bd = i;
    }

    public void setLargeurImage(int i) {
        try {
            this.Gc = C1511l.m10532d((float) i, getDisplayUnit());
            if (isImageAffichee()) {
                m1444c(i);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void setMemoImage(C1333c c1333c) {
        setImagePeintre(c1333c.mo3677i());
    }

    public void setNumTab(int i) {
        erreurAppelPropriete(C0745b.m3219a(nd[10]));
    }

    protected void setOrientationExif(boolean z) {
        if (z) {
            try {
                this.Ec |= 2;
                return;
            } catch (WDException e) {
                throw e;
            }
        }
        this.Ec &= -3;
    }

    public void setPere(db dbVar) {
        try {
            super.setPere(dbVar);
            if ((dbVar instanceof bb) && this.z != null) {
                Iterator it = this.z.iterator();
                while (it.hasNext()) {
                    EWDPropriete proprieteAssocie = ((dc) it.next()).getProprieteAssocie();
                    if (proprieteAssocie != null) {
                        try {
                            if (proprieteAssocie.equals(EWDPropriete.PROP_VALEUR)) {
                                this.Ec |= 8;
                                return;
                            }
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                }
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public void setPoliceBarree(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(nd[3]));
    }

    public void setPoliceGras(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(nd[9]));
    }

    public void setPoliceItalique(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(nd[2]));
    }

    public void setPoliceNom(String str) {
        erreurAppelPropriete(C0745b.m3219a(nd[8]));
    }

    public void setPoliceSoulignee(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(nd[15]));
    }

    public void setPoliceTaille(int i) {
        erreurAppelPropriete(C0745b.m3219a(nd[11]));
    }

    public void setPositionImage(int i) {
        try {
            this.Fc = i;
            if (((this.Fc & 65535) & 10) == 10) {
                setImageMode(10);
            } else {
                try {
                    if (((this.Fc & 65535) & 9) == 9) {
                        setImageMode(9);
                    } else {
                        try {
                            if (((this.Fc & 65535) & 8) == 8) {
                                setImageMode(8);
                            } else {
                                try {
                                    if (((this.Fc & 65535) & 7) == 7) {
                                        setImageMode(7);
                                    } else {
                                        try {
                                            if (((this.Fc & 65535) & 6) == 6) {
                                                setImageMode(72);
                                            } else {
                                                try {
                                                    if (((this.Fc & 65535) & 5) == 5) {
                                                        setImageMode(5);
                                                    } else {
                                                        try {
                                                            if (((this.Fc & 65535) & 4) == 4) {
                                                                setImageMode(77);
                                                            } else {
                                                                try {
                                                                    if (((this.Fc & 65535) & 3) == 3) {
                                                                        setImageMode(69);
                                                                    } else {
                                                                        try {
                                                                            if (((this.Fc & 65535) & 2) == 2) {
                                                                                setImageMode(67);
                                                                            } else {
                                                                                setImageMode(78);
                                                                            }
                                                                        } catch (WDException e) {
                                                                            throw e;
                                                                        }
                                                                    }
                                                                } catch (WDException e2) {
                                                                    throw e2;
                                                                }
                                                            }
                                                        } catch (WDException e22) {
                                                            throw e22;
                                                        }
                                                    }
                                                } catch (WDException e222) {
                                                    throw e222;
                                                }
                                            }
                                        } catch (WDException e2222) {
                                            throw e2222;
                                        }
                                    }
                                } catch (WDException e22222) {
                                    throw e22222;
                                }
                            }
                        } catch (WDException e222222) {
                            throw e222222;
                        }
                    }
                } catch (WDException e2222222) {
                    throw e2222222;
                }
            }
            appliquerModeAffichage();
        } catch (WDException e22222222) {
            throw e22222222;
        }
    }

    public void setSymetrie(int i) {
        this.Yc = i;
    }

    public boolean setTailleChamp(int i, int i2, int i3) {
        boolean tailleChamp = super.setTailleChamp(i, i2, i3);
        if (tailleChamp) {
            try {
                updateTailleChamp();
            } catch (WDException e) {
                throw e;
            }
        }
        return tailleChamp;
    }

    public void setTransparence(int i) {
        this.md = i;
    }

    public void setValeur(WDObjet wDObjet) {
        try {
            if (wDObjet.isMemoBinaire()) {
                setValeur(wDObjet.getDonneeBinaire());
                return;
            }
            C1333c c1333c = (C1333c) wDObjet.checkType(C1333c.class);
            if (c1333c != null) {
                try {
                    setMemoImage(c1333c);
                    return;
                } catch (WDException e) {
                    throw e;
                }
            }
            setValeur(wDObjet.getString());
        } catch (WDException e2) {
            throw e2;
        }
    }

    public abstract void setValeur(C1353s c1353s);

    public abstract void setValeur(byte[] bArr);

    public void setValeurInitiale(WDObjet wDObjet) {
        setValeurInitiale(wDObjet.getString());
    }

    public void setValeurInitiale(String str) {
        this.Mc = str;
    }

    public void setXImage(int i) {
        try {
            this.ld = C1511l.m10532d((float) i, getDisplayUnit());
            if (isImageAffichee()) {
                m1441b(i);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void setYImage(int i) {
        try {
            this.Vc = C1511l.m10532d((float) i, getDisplayUnit());
            if (isImageAffichee()) {
                m1446d(i);
            }
        } catch (WDException e) {
            throw e;
        }
    }

    public void setZoneClicage(boolean z) {
        if (z) {
            try {
                this.Ec |= 1;
                return;
            } catch (WDException e) {
                throw e;
            }
        }
        this.Ec &= -2;
    }

    public void terminerInitialisation() {
        super.terminerInitialisation();
        setValeur(this.Mc);
    }

    protected boolean updateImageMemoire(boolean z) {
        if (this.Nc == null) {
            return false;
        }
        C1353s creerCopieImage;
        if (z) {
            C1367h c1367h = this.Nc;
            this.Nc = null;
            creerCopieImage = creerCopieImage(0, 0, 0, 0, 0);
            this.Nc = c1367h;
        } else {
            creerCopieImage = creerCopieImage(0, 0, 0, 0, 0);
        }
        this.Nc.m9772a(creerCopieImage);
        return true;
    }

    protected abstract void updateTailleChamp();
}
