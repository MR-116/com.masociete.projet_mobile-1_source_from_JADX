package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0613b;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import java.math.BigDecimal;
import java.security.InvalidParameterException;

public class WDNumerique extends cb implements C0548s {
    public static final C0613b<WDNumerique> CREATOR = new C0785j();
    /* renamed from: z */
    private static final String[] f1562z = new String[]{m2489z(m2490z("]fEy8?}\\s$!`[h/,m\\h/")), m2489z(m2490z("]m\\j#-`Zr5.hGcZ")), m2489z(m2490z("]jZr<;{Fu%0v\\q:1zFu(2l")), m2489z(m2490z("]mTh/!aPi8;")), m2489z(m2490z("]mTh/")), m2489z(m2490z("3FqI\u0006\u0011")), m2489z(m2490z("\u000eJf\u0006\u000e\u001bJ|Q\u000b\u0012")), m2489z(m2490z("*PeYJ\u0017GvS\u0007\u000eHaU\b\u0012L5L\u0005\u000b[5P\u000b^JzQ\u001a\u001f[tU\u0019\u0011G")), m2489z(m2490z("]g@q/,`Di/")), m2489z(m2490z("]aPi8;"))};
    /* renamed from: a */
    private BigDecimal f1563a;
    /* renamed from: b */
    private int f1564b;

    public WDNumerique() {
        this.f1564b = -1;
        this.f1563a = BigDecimal.ZERO;
    }

    public WDNumerique(double d) {
        this();
        setValeur(d);
    }

    public WDNumerique(int i) {
        this();
        setValeur(i);
    }

    public WDNumerique(int i, int i2) {
        this();
        this.f1564b = Math.max(0, i2);
        this.f1563a = this.f1563a.setScale(this.f1564b, mo2558c());
    }

    public WDNumerique(int i, int i2, double d) {
        this();
        this.f1564b = Math.max(0, i2);
        this.f1563a = this.f1563a.setScale(this.f1564b, mo2558c());
        setValeur(d);
    }

    public WDNumerique(int i, int i2, int i3) {
        this();
        this.f1564b = Math.max(0, i2);
        this.f1563a = this.f1563a.setScale(this.f1564b, mo2558c());
        setValeur(i3);
    }

    public WDNumerique(int i, int i2, WDObjet wDObjet) {
        this();
        this.f1564b = Math.max(0, i2);
        this.f1563a = this.f1563a.setScale(this.f1564b, mo2558c());
        setValeur(wDObjet);
    }

    public WDNumerique(int i, int i2, String str) {
        this();
        this.f1564b = Math.max(0, i2);
        this.f1563a = this.f1563a.setScale(this.f1564b, mo2558c());
        setValeur(str);
    }

    public WDNumerique(int i, int i2, BigDecimal bigDecimal) {
        this();
        this.f1564b = Math.max(0, i2);
        this.f1563a = this.f1563a.setScale(this.f1564b, mo2558c());
        setValeur(bigDecimal);
    }

    public WDNumerique(WDObjet wDObjet) {
        this();
        setValeur(wDObjet);
    }

    public WDNumerique(String str) {
        this();
        setValeur(str);
    }

    public WDNumerique(BigDecimal bigDecimal) {
        this();
        setValeur(bigDecimal);
    }

    /* renamed from: z */
    private static String m2489z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 126;
                    break;
                case 1:
                    i2 = 41;
                    break;
                case 2:
                    i2 = 21;
                    break;
                case 3:
                    i2 = 60;
                    break;
                default:
                    i2 = 106;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2490z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 106);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected double mo2354a(WDObjet wDObjet) {
        C0548s c0548s = (C0548s) wDObjet.checkType(C0548s.class);
        if (c0548s != null) {
            BigDecimal bigDecimal = c0548s.getBigDecimal();
            try {
                if (this.f1564b >= 0 && bigDecimal.scale() != this.f1564b) {
                    bigDecimal = bigDecimal.setScale(this.f1564b, mo2558c());
                }
                return (double) this.f1563a.compareTo(bigDecimal);
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        WDChaine wDChaine = (WDChaine) wDObjet.checkType(WDChaine.class);
        if (wDChaine != null) {
            try {
                return (double) getString().compareTo(wDChaine.getString());
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        throw new InvalidParameterException(f1562z[7]);
    }

    /* renamed from: a */
    public WDNumerique mo2557a(BigDecimal bigDecimal) {
        return new WDNumerique(bigDecimal);
    }

    /* renamed from: a */
    public boolean mo2355a() {
        return true;
    }

    /* renamed from: c */
    protected int mo2558c() {
        return 5;
    }

    public BigDecimal getBigDecimal() {
        return this.f1563a;
    }

    public boolean getBoolean() {
        try {
            return getInt() != 0;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public byte getByte() {
        return this.f1563a.byteValue();
    }

    public BigDecimal getCurrency() {
        return getBigDecimal();
    }

    public String getDate() {
        WDErreurManager.m2883a(C0745b.m3222b(f1562z[2], getNomType(), C0745b.m3220a(f1562z[4], new String[0])));
        return null;
    }

    public String getDateHeure() {
        WDErreurManager.m2883a(C0745b.m3222b(f1562z[2], getNomType(), C0745b.m3220a(f1562z[3], new String[0])));
        return null;
    }

    public double getDouble() {
        return this.f1563a.doubleValue();
    }

    public long getDuree() {
        return this.f1563a.longValue();
    }

    public String getHeure() {
        WDErreurManager.m2883a(C0745b.m3222b(f1562z[2], getNomType(), C0745b.m3220a(f1562z[9], new String[0])));
        return null;
    }

    public int getInt() {
        return this.f1563a.intValue();
    }

    public Object getJSONValue() {
        return this.f1563a;
    }

    public long getLong() {
        return this.f1563a.longValue();
    }

    public String getNomType() {
        return C0745b.m3220a(f1562z[8], new String[0]);
    }

    public short getShort() {
        return this.f1563a.shortValueExact();
    }

    public String getString() {
        String bigDecimal = this.f1563a.toString();
        try {
            if (bigDecimal.indexOf(".") == -1) {
                return bigDecimal;
            }
            while (bigDecimal.endsWith("0")) {
                bigDecimal = bigDecimal.substring(0, bigDecimal.length() - 1);
            }
            return bigDecimal.endsWith(".") ? bigDecimal.substring(0, bigDecimal.length() - 1) : bigDecimal;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public int getTypeVar() {
        return 13;
    }

    public String getTypeXMLPourSerialisation() {
        return f1562z[6];
    }

    public boolean isNull() {
        return opEgal(0);
    }

    public cb opDec() {
        this.f1563a = this.f1563a.subtract(BigDecimal.ONE);
        return this;
    }

    public cb opDiv(WDObjet wDObjet) {
        C0548s c0548s = (C0548s) wDObjet.checkType(C0548s.class);
        if (c0548s != null) {
            try {
                if (c0548s.getDouble() == 0.0d) {
                    WDErreurManager.m2883a(C0745b.m3222b(f1562z[1], new String[0]));
                    return null;
                }
                BigDecimal bigDecimal = wDObjet.getBigDecimal();
                return mo2557a(this.f1563a.divide(bigDecimal, Math.max(this.f1563a.scale(), bigDecimal.scale()), mo2558c()));
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f1562z[0], "/", getNomType(), wDObjet.getNomType()));
        return null;
    }

    public cb opInc() {
        this.f1563a = this.f1563a.add(BigDecimal.ONE);
        return this;
    }

    public cb opMod(WDObjet wDObjet) {
        C0548s c0548s = (C0548s) wDObjet.checkType(C0548s.class);
        if (c0548s != null) {
            try {
                if (c0548s.getDouble() != 0.0d) {
                    return new WDEntier4(getInt() % wDObjet.getInt());
                }
                WDErreurManager.m2883a(C0745b.m3222b(f1562z[1], new String[0]));
                return null;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f1562z[0], f1562z[5], getNomType(), wDObjet.getNomType()));
        return null;
    }

    public cb opMoins(WDObjet wDObjet) {
        C0548s c0548s = (C0548s) wDObjet.checkType(C0548s.class);
        if (c0548s != null) {
            try {
                return mo2557a(this.f1563a.subtract(c0548s.getBigDecimal()));
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f1562z[0], "-", getNomType(), wDObjet.getNomType()));
        return null;
    }

    public cb opMoinsUnaire() {
        return mo2557a(this.f1563a.negate());
    }

    public cb opMult(WDObjet wDObjet) {
        C0548s c0548s = (C0548s) wDObjet.checkType(C0548s.class);
        if (c0548s != null) {
            try {
                return mo2557a(this.f1563a.multiply(c0548s.getBigDecimal()));
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f1562z[0], C0607n.Vc, getNomType(), wDObjet.getNomType()));
        return null;
    }

    public cb opPlus(WDObjet wDObjet) {
        C0548s c0548s = (C0548s) wDObjet.checkType(C0548s.class);
        if (c0548s == null) {
            return new WDChaine(getString() + wDObjet.getString());
        }
        try {
            return mo2557a(this.f1563a.add(c0548s.getBigDecimal()));
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public void razVariable() {
        setValeur(0);
    }

    public void release() {
        this.f1563a = null;
    }

    public void setValeur(double d) {
        setValeur(BigDecimal.valueOf(d));
    }

    public void setValeur(int i) {
        switch (i) {
            case 0:
                try {
                    setValeur(BigDecimal.ZERO);
                    return;
                } catch (InvalidParameterException e) {
                    throw e;
                }
            case 1:
                setValeur(BigDecimal.ONE);
                return;
            case 10:
                setValeur(BigDecimal.TEN);
                return;
            default:
                setValeur(new BigDecimal(i));
                return;
        }
    }

    public void setValeur(long j) {
        setValeur(BigDecimal.valueOf(j));
    }

    public void setValeur(WDObjet wDObjet) {
        setValeur(wDObjet.getBigDecimal());
    }

    public void setValeur(String str) {
        setValeur(C0725i.m3080i(str));
    }

    public final void setValeur(BigDecimal bigDecimal) {
        try {
            if (this.f1564b >= 0) {
                if (bigDecimal.scale() != this.f1564b) {
                    this.f1563a = bigDecimal.setScale(this.f1564b, mo2558c());
                    return;
                }
            }
            this.f1563a = bigDecimal;
        } catch (InvalidParameterException e) {
            throw e;
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    public void setValeur(boolean z) {
        BigDecimal bigDecimal;
        if (z) {
            try {
                bigDecimal = BigDecimal.ONE;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        bigDecimal = BigDecimal.ZERO;
        setValeur(bigDecimal);
    }
}
