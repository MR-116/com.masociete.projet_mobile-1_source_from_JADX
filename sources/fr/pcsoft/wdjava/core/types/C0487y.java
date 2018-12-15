package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import java.math.BigDecimal;

/* renamed from: fr.pcsoft.wdjava.core.types.y */
public abstract class C0487y extends WDObjet {
    /* renamed from: z */
    private static final String[] f805z = new String[]{C0487y.m1296z(C0487y.m1297z("ncA/p\u0019oG3p")), C0487y.m1296z(C0487y.m1297z("nmA/c\b|](z\u0003qG,e\u0002}](w\u0001k")), C0487y.m1296z(C0487y.m1297z("na^$g\fzG.{\u0012g@5p\u001fjG5p")), C0487y.m1296z(C0487y.m1297z("n`[,p\u001fg_4p")), C0487y.m1296z(C0487y.m1297z("3P")), C0487y.m1296z(C0487y.m1297z("nmF |\u0003k")), C0487y.m1296z(C0487y.m1297z("nl['s\b|")), C0487y.m1296z(C0487y.m1297z("nlA.y\bk@")), C0487y.m1296z(C0487y.m1297z("nfK4g\b")), C0487y.m1296z(C0487y.m1297z("nk@5|\b|")), C0487y.m1296z(C0487y.m1297z("n|K$y")), C0487y.m1296z(C0487y.m1297z("na^$g\fzK4g\u0012jK\"j\u0004`Z$g\tgZ")), C0487y.m1296z(C0487y.m1297z("s\u0013")), C0487y.m1296z(C0487y.m1297z("nxO3|\flB$j\u0003a@>z\u000fdK5")), C0487y.m1296z(C0487y.m1297z("3\u0013")), C0487y.m1296z(C0487y.m1297z("\u0016\u0013")), C0487y.m1296z(C0487y.m1297z("na^$g\fzK4g\u0012g@\"j\u0004`Z$g\tgZ")), C0487y.m1296z(C0487y.m1297z("q\u0010")), C0487y.m1296z(C0487y.m1297z("njO5p")), C0487y.m1296z(C0487y.m1297z("njO5p\u0012fK4g\b")), C0487y.m1296z(C0487y.m1297z("nj[3p\b")), C0487y.m1296z(C0487y.m1297z("q\u0013")), C0487y.m1296z(C0487y.m1297z("n~\\.v\bj[3p")), C0487y.m1296z(C0487y.m1297z("nk@5|\b|QY"))};

    /* renamed from: z */
    private static String m1296z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 77;
                    break;
                case 1:
                    i2 = 46;
                    break;
                case 2:
                    i2 = 14;
                    break;
                case 3:
                    i2 = 97;
                    break;
                default:
                    i2 = 53;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1297z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 53);
        }
        return toCharArray;
    }

    public <T> T checkType(Class<T> cls) {
        T checkType = super.checkType(cls);
        if (checkType != null) {
            return checkType;
        }
        try {
            if (!isEvaluable()) {
                return checkType;
            }
            try {
                WDObjet valeur = getValeur();
                return valeur != this ? valeur.checkType(cls) : checkType;
            } catch (WDException e) {
                return null;
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    public WDObjet extraireChaine(int i) {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.extraireChaine(i);
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return super.extraireChaine(i);
    }

    public WDObjet extraireChaine(int i, WDObjet wDObjet) {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.extraireChaine(i, wDObjet);
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return super.extraireChaine(i, wDObjet);
    }

    public WDObjet extraireDebutChaine(int i) {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.extraireDebutChaine(i);
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return super.extraireDebutChaine(i);
    }

    public WDObjet extraireDebutChaine(int i, WDObjet wDObjet) {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.extraireDebutChaine(i, wDObjet);
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return super.extraireDebutChaine(i, wDObjet);
    }

    public WDObjet extraireFinChaine(int i) {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.extraireFinChaine(i);
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return super.extraireFinChaine(i);
    }

    public WDObjet extraireFinChaine(int i, WDObjet wDObjet) {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.extraireFinChaine(i, wDObjet);
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return super.extraireFinChaine(i, wDObjet);
    }

    public WDObjet extrairePartieChaine(int i, int i2) {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.extrairePartieChaine(i, i2);
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return super.extrairePartieChaine(i, i2);
    }

    public WDObjet extrairePartieChaine(int i, int i2, WDObjet wDObjet) {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.extrairePartieChaine(i, i2, wDObjet);
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return super.extrairePartieChaine(i, i2, wDObjet);
    }

    public WDObjet extraireSousChaine(int i, int i2) {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.extraireSousChaine(i, i2);
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return super.extraireSousChaine(i, i2);
    }

    public WDObjet extraireSousChaine(int i, int i2, WDObjet wDObjet) {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.extraireSousChaine(i, i2, wDObjet);
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return super.extraireSousChaine(i, i2, wDObjet);
    }

    public BigDecimal getBigDecimal() {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.getBigDecimal();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f805z[1], getNomType(), C0745b.m3220a(f805z[3], new String[0])));
        return null;
    }

    public boolean getBoolean() {
        boolean z = false;
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    z = valeur.getBoolean();
                    return z;
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f805z[1], getNomType(), C0745b.m3220a(f805z[7], new String[0])));
        return z;
    }

    public byte getByte() {
        byte b = (byte) 0;
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    b = valeur.getByte();
                    return b;
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f805z[1], getNomType(), C0745b.m3220a(f805z[9], new String[0])));
        return b;
    }

    public WDObjet getClone() {
        return super.getClone();
    }

    public BigDecimal getCurrency() {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.getCurrency();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f805z[1], getNomType(), C0745b.m3220a(f805z[0], new String[0])));
        return null;
    }

    public String getDate() {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.getDate();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f805z[1], getNomType(), C0745b.m3220a(f805z[18], new String[0])));
        return "";
    }

    public String getDateHeure() {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.getDateHeure();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f805z[1], getNomType(), C0745b.m3220a(f805z[19], new String[0])));
        return "";
    }

    public byte[] getDonneeBinaire() {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.getDonneeBinaire();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f805z[1], getNomType(), C0745b.m3220a(f805z[6], new String[0])));
        return null;
    }

    public double getDouble() {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.getDouble();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f805z[1], getNomType(), C0745b.m3220a(f805z[10], new String[0])));
        return 0.0d;
    }

    public long getDuree() {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.getDuree();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f805z[1], getNomType(), C0745b.m3220a(f805z[20], new String[0])));
        return 0;
    }

    public String getHeure() {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.getHeure();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f805z[1], getNomType(), C0745b.m3220a(f805z[8], new String[0])));
        return "";
    }

    public int getInt() {
        int i = 0;
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    i = valeur.getInt();
                    return i;
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f805z[1], getNomType(), C0745b.m3220a(f805z[9], new String[0])));
        return i;
    }

    public Object getJSONValue() {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.getJSONValue();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f805z[1], getNomType(), C0745b.m3220a(f805z[5], new String[0])));
        return null;
    }

    public long getLong() {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.getLong();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f805z[1], getNomType(), C0745b.m3220a(f805z[23], new String[0])));
        return 0;
    }

    public WDObjet getMembre(String str) {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.getMembre(str);
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f805z[13], new String[0]));
        return null;
    }

    public WDProcedure getProcedure() {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.getProcedure();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f805z[1], getNomType(), C0745b.m3220a(f805z[22], new String[0])));
        return null;
    }

    public short getShort() {
        short s = (short) 0;
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    s = valeur.getShort();
                    return s;
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f805z[1], getNomType(), C0745b.m3220a(f805z[9], new String[0])));
        return s;
    }

    public String getString() {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.getString();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f805z[1], getNomType(), C0745b.m3220a(f805z[5], new String[0])));
        return "";
    }

    public boolean hasProperty(String str) {
        return false;
    }

    public boolean isAllloue() {
        return true;
    }

    public boolean isMemoBinaire() {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.isMemoBinaire();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return false;
    }

    public boolean isNull() {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.isNull();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return super.isNull();
    }

    public boolean isNumerique() {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.checkType(C0548s.class) != null;
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        try {
            return checkType(C0548s.class) != null;
        } catch (WDException e2) {
            throw e2;
        }
    }

    public boolean isReleased() {
        return false;
    }

    public boolean isUnicode() {
        try {
            return getValeur().getTypeVar() == 16;
        } catch (WDException e) {
            throw e;
        }
    }

    public boolean isValeurNull() {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.isValeurNull();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return super.isValeurNull();
    }

    public boolean opCommencePar(WDObjet wDObjet) {
        WDObjet valeur;
        boolean z = false;
        if (isEvaluable()) {
            valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    z = valeur.opCommencePar(wDObjet);
                    return z;
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        valeur = wDObjet.getValeur();
        WDErreurManager.m2883a(C0745b.m3222b(f805z[2], f805z[15], getNomType(), valeur.getNomType()));
        return z;
    }

    public cb opDec() {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                valeur = valeur.opDec();
                setValeur(valeur);
                return valeur;
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f805z[11], new String[0]));
        return null;
    }

    public boolean opDiff(WDObjet wDObjet) {
        WDObjet valeur;
        boolean z = false;
        if (isEvaluable()) {
            valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    z = valeur.opDiff(wDObjet);
                    return z;
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        valeur = wDObjet.getValeur();
        WDErreurManager.m2883a(C0745b.m3222b(f805z[2], f805z[17], getNomType(), valeur.getNomType()));
        return z;
    }

    public cb opDiv(WDObjet wDObjet) {
        WDObjet valeur;
        if (isEvaluable()) {
            valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.opDiv(wDObjet);
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        valeur = wDObjet.getValeur();
        WDErreurManager.m2883a(C0745b.m3222b(f805z[2], "/", getNomType(), valeur.getNomType()));
        return null;
    }

    public boolean opEgal(WDObjet wDObjet) {
        WDObjet valeur;
        boolean z = false;
        if (isEvaluable()) {
            valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    z = valeur.opEgal(wDObjet);
                    return z;
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        valeur = wDObjet.getValeur();
        WDErreurManager.m2883a(C0745b.m3222b(f805z[2], "=", getNomType(), valeur.getNomType()));
        return z;
    }

    public boolean opEgalSouple(WDObjet wDObjet) {
        WDObjet valeur;
        boolean z = false;
        if (isEvaluable()) {
            valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    z = valeur.opEgalSouple(wDObjet);
                    return z;
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        valeur = wDObjet.getValeur();
        WDErreurManager.m2883a(C0745b.m3222b(f805z[2], f805z[14], getNomType(), valeur.getNomType()));
        return z;
    }

    public boolean opEgalTresSouple(WDObjet wDObjet) {
        WDObjet valeur;
        boolean z = false;
        if (isEvaluable()) {
            valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    z = valeur.opEgalTresSouple(wDObjet);
                    return z;
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        valeur = wDObjet.getValeur();
        WDErreurManager.m2883a(C0745b.m3222b(f805z[2], f805z[4], getNomType(), valeur.getNomType()));
        return z;
    }

    public cb opInc() {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                valeur = valeur.opInc();
                setValeur(valeur);
                return valeur;
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f805z[16], new String[0]));
        return null;
    }

    public boolean opInf(WDObjet wDObjet) {
        WDObjet valeur;
        boolean z = false;
        if (isEvaluable()) {
            valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    z = valeur.opInf(wDObjet);
                    return z;
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        valeur = wDObjet.getValeur();
        WDErreurManager.m2883a(C0745b.m3222b(f805z[2], "<", getNomType(), valeur.getNomType()));
        return z;
    }

    public boolean opInfEgal(WDObjet wDObjet) {
        WDObjet valeur;
        boolean z = false;
        if (isEvaluable()) {
            valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    z = valeur.opInfEgal(wDObjet);
                    return z;
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        valeur = wDObjet.getValeur();
        WDErreurManager.m2883a(C0745b.m3222b(f805z[2], f805z[21], getNomType(), valeur.getNomType()));
        return z;
    }

    public cb opMod(WDObjet wDObjet) {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.opMod(wDObjet);
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return super.opPuissance(wDObjet);
    }

    public cb opMoins(WDObjet wDObjet) {
        WDObjet valeur;
        if (isEvaluable()) {
            valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.opMoins(wDObjet);
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        valeur = wDObjet.getValeur();
        WDErreurManager.m2883a(C0745b.m3222b(f805z[2], "-", getNomType(), valeur.getNomType()));
        return null;
    }

    public cb opMoinsUnaire() {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.opMoinsUnaire();
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return super.opMoinsUnaire();
    }

    public cb opMult(WDObjet wDObjet) {
        WDObjet valeur;
        if (isEvaluable()) {
            valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.opMult(wDObjet);
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        valeur = wDObjet.getValeur();
        WDErreurManager.m2883a(C0745b.m3222b(f805z[2], C0607n.Vc, getNomType(), valeur.getNomType()));
        return null;
    }

    public cb opPlus(WDObjet wDObjet) {
        WDObjet valeur;
        if (isEvaluable()) {
            valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.opPlus(wDObjet);
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        valeur = wDObjet.getValeur();
        WDErreurManager.m2883a(C0745b.m3222b(f805z[2], C0607n.dm, getNomType(), valeur.getNomType()));
        return null;
    }

    public cb opPuissance(WDObjet wDObjet) {
        if (isEvaluable()) {
            WDObjet valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    return valeur.opPuissance(wDObjet);
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        return super.opPuissance(wDObjet);
    }

    public boolean opSup(WDObjet wDObjet) {
        WDObjet valeur;
        boolean z = false;
        if (isEvaluable()) {
            valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    z = valeur.opSup(wDObjet);
                    return z;
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        valeur = wDObjet.getValeur();
        WDErreurManager.m2883a(C0745b.m3222b(f805z[2], ">", getNomType(), valeur.getNomType()));
        return z;
    }

    public boolean opSupEgal(WDObjet wDObjet) {
        WDObjet valeur;
        boolean z = false;
        if (isEvaluable()) {
            valeur = getValeur();
            if (!(valeur == null || valeur == this)) {
                try {
                    z = valeur.opSupEgal(wDObjet);
                    return z;
                } catch (WDException e) {
                    throw e;
                }
            }
        }
        valeur = wDObjet.getValeur();
        WDErreurManager.m2883a(C0745b.m3222b(f805z[2], f805z[12], getNomType(), valeur.getNomType()));
        return z;
    }
}
