package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0613b;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0800d;
import fr.pcsoft.wdjava.core.utils.hb;
import java.security.InvalidParameterException;

public class WDDuree extends cb implements hb {
    /* renamed from: C */
    private static final String[] f1533C = new String[]{m2397z(m2398z("y'`B\u001c\t*fZ\n\n\"{Ke")), m2397z(m2398z("\u000e\u001aYqu3\rJ{8*\u0002]}76\u0006\td:/\u0011\tx4z\u0000Fy%;\u0011H}&5\r")), m2397z(m2398z("y'|F\u0010\u001f")), m2397z(m2398z(">\u0016[u!3\fG")), m2397z(m2398z("y,yQ\u0007\u001b7`[\u001b\u0005*g@\u0010\b'`@\u0010")), m2397z(m2398z("q)a\\\u0018\u00170zX\u0019\u0016"))};
    public static final C0613b<WDDuree> CREATOR = new gb();
    /* renamed from: A */
    private byte f1534A = (byte) 0;
    /* renamed from: B */
    private byte f1535B = (byte) 1;
    /* renamed from: w */
    private byte f1536w = (byte) 0;
    /* renamed from: x */
    private byte f1537x = (byte) 0;
    /* renamed from: y */
    private int f1538y = 0;
    /* renamed from: z */
    private short f1539z = (short) 0;

    public WDDuree(double d) {
        setValeur((long) d);
    }

    public WDDuree(int i) {
        setValeur(i);
    }

    public WDDuree(int i, int i2, int i3, int i4, int i5, int i6) {
        setValeur((((((((long) i) * hb.f2079l) + (((long) i2) * 3600000)) + (((long) i3) * 60000)) + (((long) i4) * 1000)) + ((long) i5)) * ((long) i6));
    }

    public WDDuree(long j) {
        setValeur(j);
    }

    public WDDuree(WDObjet wDObjet) {
        setValeur(wDObjet);
    }

    public WDDuree(String str) {
        setValeur(str);
    }

    /* renamed from: a */
    private void m2387a(int i) {
        m2388b(-i);
    }

    /* renamed from: b */
    private void m2388b(int i) {
        setValeur(getDuree() + ((long) i));
    }

    /* renamed from: c */
    private void m2389c(int i) {
        m2395j(-i);
    }

    /* renamed from: d */
    private void m2390d(int i) {
        m2391e(-i);
    }

    /* renamed from: e */
    private void m2391e(int i) {
        setValeur(getDuree() + ((long) (hb.f2077j * i)));
    }

    /* renamed from: f */
    private void m2392f(int i) {
        m2393h(-i);
    }

    /* renamed from: h */
    private void m2393h(int i) {
        setValeur(getDuree() + ((long) (hb.f2073f * i)));
    }

    /* renamed from: i */
    private void m2394i(int i) {
        m2396k(-i);
    }

    /* renamed from: j */
    private void m2395j(int i) {
        setValeur(getDuree() + (((long) i) * hb.f2079l));
    }

    /* renamed from: k */
    private void m2396k(int i) {
        setValeur(getDuree() + ((long) (i * 1000)));
    }

    /* renamed from: z */
    private static String m2397z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 90;
                    break;
                case 1:
                    i2 = 99;
                    break;
                case 2:
                    i2 = 41;
                    break;
                case 3:
                    i2 = 20;
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
    private static char[] m2398z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 85);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public double mo2354a(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        try {
            switch (valeur.getTypeVar()) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 27:
                    return (double) ((int) (getDuree() - valeur.getDuree()));
                case 16:
                case 19:
                case 28:
                case 30:
                    return (double) getString().compareTo(valeur.getString());
                default:
                    throw new InvalidParameterException(f1533C[1]);
            }
        } catch (InvalidParameterException e) {
            throw e;
        }
        throw e;
    }

    /* renamed from: a */
    public final double m2400a(C0782g c0782g) {
        long j = hb.f2079l;
        long j2 = (((((((long) this.f1538y) * hb.f2079l) + (((long) this.f1537x) * 3600000)) + (((long) this.f1536w) * 60000)) + (((long) this.f1534A) * 1000)) + ((long) this.f1539z)) * ((long) this.f1535B);
        switch (C0796x.f2029b[c0782g.ordinal()]) {
            case 1:
                break;
            case 2:
                j = 3600000;
                break;
            case 3:
                j = 60000;
                break;
            case 4:
                j = 1000;
                break;
            case 5:
                j = 10;
                break;
            case 6:
                j = 1;
                break;
            default:
                j = 1;
                break;
        }
        return ((double) j2) / ((double) j);
    }

    /* renamed from: a */
    public long mo2496a() {
        return (long) m2400a(C0782g.MILLISECOND);
    }

    /* renamed from: c */
    public final int m2402c() {
        return this.f1534A * this.f1535B;
    }

    /* renamed from: d */
    public boolean m2403d() {
        try {
            return this.f1535B < (byte) 0;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    /* renamed from: e */
    public final int m2404e() {
        return this.f1537x * this.f1535B;
    }

    /* renamed from: f */
    public final int m2405f() {
        return m2406g() / 100;
    }

    /* renamed from: g */
    public final int m2406g() {
        return this.f1539z * this.f1535B;
    }

    /* renamed from: g */
    public void m2407g(int i) {
        setValeur((((long) this.f1538y) * hb.f2079l) + (((((((long) i) * 3600000) + (((long) this.f1536w) * 60000)) + (((long) this.f1534A) * 1000)) + ((long) this.f1539z)) * ((long) this.f1535B)));
    }

    public byte getByte() {
        return (byte) getInt();
    }

    public double getDouble() {
        return (double) getDuree();
    }

    public long getDuree() {
        return (long) m2400a(C0782g.MILLISECOND);
    }

    public WDReel getEnHeures() {
        return new WDReel(m2400a(C0782g.HOUR));
    }

    public WDReel getEnJours() {
        return new WDReel(m2400a(C0782g.DAY));
    }

    public WDReel getEnMillisecondes() {
        return new WDReel(m2400a(C0782g.MILLISECOND));
    }

    public WDReel getEnMinutes() {
        return new WDReel(m2400a(C0782g.MINUTE));
    }

    public WDReel getEnSecondes() {
        return new WDReel(m2400a(C0782g.SECOND));
    }

    public int getInt() {
        return (int) getDuree();
    }

    public Object getJSONValue() {
        return Long.valueOf(getLong());
    }

    public WDEntier4 getJour() {
        return new WDEntier4(m2408h());
    }

    public long getLong() {
        return getDuree();
    }

    public WDEntier4 getMilliSeconde() {
        return new WDEntier4(m2406g());
    }

    public WDEntier4 getMinute() {
        return new WDEntier4(m2409i());
    }

    public String getNomType() {
        return C0745b.m3220a(f1533C[2], new String[0]);
    }

    public WDEntier4 getSeconde() {
        return new WDEntier4(m2402c());
    }

    public short getShort() {
        return (short) getInt();
    }

    public String getString() {
        StringBuffer stringBuffer = new StringBuffer(11);
        try {
            if (this.f1535B < (byte) 0) {
                stringBuffer.append('-');
            }
            stringBuffer.append(this.f1538y);
            stringBuffer.append(C0725i.m3024a(this.f1537x, 2));
            stringBuffer.append(C0725i.m3024a(this.f1536w, 2));
            stringBuffer.append(C0725i.m3024a(this.f1534A, 2));
            stringBuffer.append(C0725i.m3024a(this.f1539z, 3));
            return stringBuffer.toString();
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public WDEntier4 getTHeure() {
        return new WDEntier4(m2404e());
    }

    public int getTypeVar() {
        return 27;
    }

    public String getTypeXMLPourSerialisation() {
        return f1533C[3];
    }

    /* renamed from: h */
    public final int m2408h() {
        return this.f1538y * this.f1535B;
    }

    /* renamed from: i */
    public final int m2409i() {
        return this.f1536w * this.f1535B;
    }

    public boolean isDuree() {
        return true;
    }

    public boolean isVarTemps() {
        return true;
    }

    /* renamed from: j */
    public final int m2410j() {
        return m2406g() / 10;
    }

    public void opDecProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        if (wDObjet != null) {
            try {
                int i = wDObjet.getInt();
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        i = 1;
        try {
            switch (C0796x.f2028a[eWDPropriete.ordinal()]) {
                case 1:
                    m2389c(i);
                    return;
                case 2:
                    m2390d(i);
                    return;
                case 3:
                    m2392f(i);
                    return;
                case 4:
                    m2394i(i);
                    return;
                case 5:
                    m2387a(i);
                    return;
                default:
                    super.opDecProp(eWDPropriete, wDObjet);
                    return;
            }
        } catch (InvalidParameterException e2) {
            throw e2;
        }
        throw e2;
    }

    public boolean opDiff(double d) {
        try {
            return !C0800d.m3856a(getDouble(), d);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opDiff(int i) {
        try {
            return getDuree() != ((long) i);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opDiff(long j) {
        try {
            return getDuree() != j;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opDiff(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        try {
            return valeur.isReel() ? !C0800d.m3856a(getDouble(), valeur.getDouble()) : super.opDiff(valeur);
        } catch (InvalidParameterException e) {
            throw e;
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    public cb opDiv(double d) {
        if (d != 0.0d) {
            return new WDDuree(getDouble() / d);
        }
        try {
            WDErreurManager.m2883a(C0745b.m3222b(f1533C[0], new String[0]));
            return null;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public cb opDiv(int i) {
        if (i != 0) {
            return new WDDuree(getDouble() / ((double) i));
        }
        try {
            WDErreurManager.m2883a(C0745b.m3222b(f1533C[0], new String[0]));
            return null;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public cb opDiv(long j) {
        if (j != 0) {
            return new WDDuree(getDouble() / ((double) j));
        }
        try {
            WDErreurManager.m2883a(C0745b.m3222b(f1533C[0], new String[0]));
            return null;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public cb opDiv(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        switch (valeur.getTypeVar()) {
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
            case 27:
                double d = valeur.getDouble();
                if (d != 0.0d) {
                    return new WDDuree(getDouble() / d);
                }
                try {
                    WDErreurManager.m2883a(C0745b.m3222b(f1533C[0], new String[0]));
                    return null;
                } catch (InvalidParameterException e) {
                    throw e;
                }
            default:
                WDErreurManager.m2883a(C0745b.m3222b(f1533C[4], "/", getNomType(), valeur.getNomType()));
                return null;
        }
    }

    public boolean opEgal(double d) {
        return C0800d.m3856a(getDouble(), d);
    }

    public boolean opEgal(int i) {
        try {
            return getDuree() == ((long) i);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opEgal(long j) {
        try {
            return getDuree() == j;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opEgal(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        try {
            return valeur.isReel() ? C0800d.m3856a(getDouble(), valeur.getDouble()) : super.opEgal(valeur);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public void opIncProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        if (wDObjet != null) {
            try {
                int i = wDObjet.getInt();
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        i = 1;
        try {
            switch (C0796x.f2028a[eWDPropriete.ordinal()]) {
                case 1:
                    m2395j(i);
                    return;
                case 2:
                    m2391e(i);
                    return;
                case 3:
                    m2393h(i);
                    return;
                case 4:
                    m2396k(i);
                    return;
                case 5:
                    m2388b(i);
                    return;
                default:
                    super.opIncProp(eWDPropriete, wDObjet);
                    return;
            }
        } catch (InvalidParameterException e2) {
            throw e2;
        }
        throw e2;
    }

    public boolean opInf(double d) {
        try {
            return ((double) getDuree()) < d;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opInf(int i) {
        try {
            return getDuree() < ((long) i);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opInf(long j) {
        try {
            return getDuree() < j;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opInfEgal(double d) {
        try {
            return ((double) getDuree()) <= d;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opInfEgal(int i) {
        try {
            return getDuree() <= ((long) i);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opInfEgal(long j) {
        try {
            return getDuree() <= j;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public cb opMoins(double d) {
        return new WDDuree(getDouble() - d);
    }

    public cb opMoins(int i) {
        return new WDDuree(getDuree() - ((long) i));
    }

    public cb opMoins(long j) {
        return new WDDuree(getDuree() - j);
    }

    public cb opMoins(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        try {
            switch (valeur.getTypeVar()) {
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
                case 27:
                    return new WDDuree(getDuree() - valeur.getDuree());
                default:
                    WDErreurManager.m2883a(C0745b.m3222b(f1533C[4], "-", getNomType(), valeur.getNomType()));
                    return null;
            }
        } catch (InvalidParameterException e) {
            throw e;
        }
        throw e;
    }

    public cb opMult(double d) {
        return new WDDuree(getDouble() * d);
    }

    public cb opMult(int i) {
        return new WDDuree(getDuree() * ((long) i));
    }

    public cb opMult(long j) {
        return new WDDuree(getDuree() * j);
    }

    public cb opMult(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        try {
            switch (valeur.getTypeVar()) {
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
                case 27:
                    return new WDDuree(getDuree() * valeur.getDuree());
                default:
                    WDErreurManager.m2883a(C0745b.m3222b(f1533C[4], C0607n.Vc, getNomType(), valeur.getNomType()));
                    return null;
            }
        } catch (InvalidParameterException e) {
            throw e;
        }
        throw e;
    }

    public cb opPlus(double d) {
        return new WDDuree(getDouble() + d);
    }

    public cb opPlus(int i) {
        return new WDDuree(getDuree() + ((long) i));
    }

    public cb opPlus(long j) {
        return new WDDuree(getDuree() + j);
    }

    public cb opPlus(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        try {
            switch (valeur.getTypeVar()) {
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
                case 27:
                    return new WDDuree(getDuree() + valeur.getDuree());
                case 16:
                    return new WDChaineU(getString() + valeur.getString());
                case 19:
                    return new WDChaineA(getString() + valeur.getString());
                case 24:
                case 25:
                case 26:
                    return valeur.opPlus((WDObjet) this);
                case 28:
                case 30:
                    return new WDChaine(getString() + valeur.getString());
                default:
                    WDErreurManager.m2883a(C0745b.m3222b(f1533C[4], C0607n.dm, getNomType(), valeur.getNomType()));
                    return null;
            }
        } catch (InvalidParameterException e) {
            throw e;
        }
        throw e;
    }

    public boolean opSup(double d) {
        try {
            return ((double) getDuree()) > d;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opSup(int i) {
        try {
            return getDuree() > ((long) i);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opSup(long j) {
        try {
            return getDuree() > j;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opSupEgal(double d) {
        try {
            return ((double) getDuree()) >= d;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opSupEgal(int i) {
        try {
            return getDuree() >= ((long) i);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opSupEgal(long j) {
        try {
            return getDuree() >= j;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public void razVariable() {
        this.f1538y = 0;
        this.f1537x = (byte) 0;
        this.f1536w = (byte) 0;
        this.f1534A = (byte) 0;
        this.f1539z = (short) 0;
        this.f1535B = (byte) 1;
    }

    public void release() {
    }

    public void setEnHeures(double d) {
        setValeur((long) (3600000.0d * d));
    }

    public void setEnJours(double d) {
        setValeur((long) (8.64E7d * d));
    }

    public void setEnMillisecondes(long j) {
        setValeur(j);
    }

    public void setEnMinutes(double d) {
        setValeur((long) (60000.0d * d));
    }

    public void setEnSecondes(double d) {
        setValeur((long) (1000.0d * d));
    }

    public void setJSONValue(String str) {
        setValeur(C0725i.m3055c(str));
    }

    public void setJour(int i) {
        setValeur((((long) i) * hb.f2079l) + (((((((long) this.f1537x) * 3600000) + (((long) this.f1536w) * 60000)) + (((long) this.f1534A) * 1000)) + ((long) this.f1539z)) * ((long) this.f1535B)));
    }

    public void setMilliSeconde(int i) {
        setValeur((((long) this.f1538y) * hb.f2079l) + (((((((long) this.f1537x) * 3600000) + (((long) this.f1536w) * 60000)) + (((long) this.f1534A) * 1000)) + ((long) i)) * ((long) this.f1535B)));
    }

    public void setMinute(int i) {
        setValeur((((long) this.f1538y) * hb.f2079l) + (((((((long) this.f1537x) * 3600000) + (((long) i) * 60000)) + (((long) this.f1534A) * 1000)) + ((long) this.f1539z)) * ((long) this.f1535B)));
    }

    public void setSeconde(int i) {
        setValeur((((long) this.f1538y) * hb.f2079l) + (((((((long) this.f1537x) * 3600000) + (((long) this.f1536w) * 60000)) + (((long) i) * 1000)) + ((long) this.f1539z)) * ((long) this.f1535B)));
    }

    public void setTHeure(int i) {
        m2407g(i);
    }

    public void setValeur(int i) {
        setValeur((long) i);
    }

    public void setValeur(long j) {
        if (j < 0) {
            this.f1535B = (byte) -1;
            j *= -1;
        } else {
            this.f1535B = (byte) 1;
        }
        long j2 = j % hb.f2079l;
        this.f1538y = (int) Math.floor((double) (j / hb.f2079l));
        long j3 = j2 % 3600000;
        this.f1537x = (byte) ((int) Math.floor((double) (j2 / 3600000)));
        j2 = j3 % 60000;
        this.f1536w = (byte) ((int) Math.floor((double) (j3 / 60000)));
        j3 = j2 % 1000;
        this.f1534A = (byte) ((int) Math.floor((double) (j2 / 1000)));
        this.f1539z = (short) ((int) j3);
    }

    public void setValeur(WDObjet wDObjet) {
        WDDuree wDDuree = (WDDuree) wDObjet.checkType(WDDuree.class);
        if (wDDuree != null) {
            try {
                this.f1538y = wDDuree.f1538y;
                this.f1537x = wDDuree.f1537x;
                this.f1536w = wDDuree.f1536w;
                this.f1534A = wDDuree.f1534A;
                this.f1539z = wDDuree.f1539z;
                this.f1535B = wDDuree.f1535B;
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        setValeur(wDObjet.getDuree());
    }

    public void setValeur(String str) {
        setValeur(C0725i.m3044b(str, f1533C[5]));
    }
}
