package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0613b;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0800d;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidParameterException;

public class WDReel extends cb implements C0548s {
    public static final C0613b<WDReel> CREATOR = new C0752c();
    /* renamed from: z */
    private static final String[] f1542z = new String[]{m2413z(m2414z("`yC|Ya")), m2413z(m2414z("'RH|W_yPjTWdA\u0005")), m2413z(m2414z("'Ds[y")), m2413z(m2414z("'Yf[gEBQ{[_xJpVRJp")), m2413z(m2414z("IyRkYk")), m2413z(m2414z("PoF{\u0015mxUqXtwBwWhs\u0016nZqd\u0016rT$uYsEedWwFkx"))};
    /* renamed from: a */
    double f1543a;

    public WDReel() {
        this.f1543a = 0.0d;
    }

    public WDReel(double d) {
        this.f1543a = d;
    }

    public WDReel(int i) {
        this.f1543a = (double) i;
    }

    public WDReel(long j) {
        this.f1543a = (double) j;
    }

    public WDReel(WDObjet wDObjet) {
        setValeur(wDObjet);
    }

    public WDReel(String str) {
        setValeur(str);
    }

    public WDReel(boolean z) {
        setValeur(z);
    }

    /* renamed from: z */
    private static String m2413z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 4;
                    break;
                case 1:
                    i2 = 22;
                    break;
                case 2:
                    i2 = 54;
                    break;
                case 3:
                    i2 = 30;
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
    private static char[] m2414z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 53);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected double mo2354a(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        try {
            switch (valeur.getTypeVar()) {
                case 1:
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
                    return this.f1543a - valeur.getDouble();
                case 16:
                case 19:
                case 28:
                case 30:
                    return (double) getString().compareTo(valeur.getString());
                default:
                    throw new InvalidParameterException(f1542z[5]);
            }
        } catch (InvalidParameterException e) {
            throw e;
        }
        throw e;
    }

    /* renamed from: a */
    public boolean mo2355a() {
        return true;
    }

    public BigDecimal getBigDecimal() {
        try {
            if (!Double.isNaN(this.f1543a)) {
                if (!Double.isInfinite(this.f1543a)) {
                    return BigDecimal.valueOf(this.f1543a);
                }
            }
            return BigDecimal.ZERO;
        } catch (InvalidParameterException e) {
            throw e;
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    public boolean getBoolean() {
        try {
            return this.f1543a != 0.0d;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public byte getByte() {
        return (byte) getInt();
    }

    public BigDecimal getCurrency() {
        return getBigDecimal();
    }

    public byte[] getDonneeBinaire() {
        byte[] bArr = new byte[8];
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).putDouble(this.f1543a);
        return bArr;
    }

    public double getDouble() {
        return this.f1543a;
    }

    public long getDuree() {
        return (long) this.f1543a;
    }

    public int getInt() {
        return (int) this.f1543a;
    }

    public Object getJSONValue() {
        return Double.valueOf(this.f1543a);
    }

    public long getLong() {
        return (long) this.f1543a;
    }

    public String getNomType() {
        return C0745b.m3220a(f1542z[2], new String[0]);
    }

    public short getShort() {
        return (short) getInt();
    }

    public String getString() {
        return C0725i.m3023a(this.f1543a, 15);
    }

    public int getTypeVar() {
        return 12;
    }

    public String getTypeXMLPourSerialisation() {
        return f1542z[0];
    }

    public boolean isNull() {
        try {
            return this.f1543a == 0.0d;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean isReel() {
        return true;
    }

    public cb opDec() {
        this.f1543a -= 1.0d;
        return this;
    }

    public boolean opDiff(double d) {
        try {
            return !C0800d.m3856a(this.f1543a, d);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opDiff(int i) {
        try {
            return !C0800d.m3856a(this.f1543a, (double) i);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opDiff(long j) {
        try {
            return !C0800d.m3856a(this.f1543a, (double) j);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opDiff(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        try {
            switch (valeur.getTypeVar()) {
                case 1:
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
                    try {
                        return !C0800d.m3856a(getDouble(), valeur.getDouble());
                    } catch (InvalidParameterException e) {
                        throw e;
                    }
                case 16:
                case 19:
                case 28:
                case 30:
                    return getString().compareTo(valeur.getString()) != 0;
                default:
                    WDErreurManager.m2883a(C0745b.m3222b(f1542z[3], "=", C0745b.m3220a(f1542z[2], new String[0]), valeur.getNomType()));
                    return false;
            }
        } catch (InvalidParameterException e2) {
            throw e2;
        } catch (InvalidParameterException e22) {
            throw e22;
        }
        throw e22;
    }

    public cb opDiv(double d) {
        if (d != 0.0d) {
            return new WDReel(this.f1543a / d);
        }
        try {
            WDErreurManager.m2883a(C0745b.m3222b(f1542z[1], new String[0]));
            return null;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public cb opDiv(int i) {
        if (i != 0) {
            return new WDReel(this.f1543a / ((double) i));
        }
        try {
            WDErreurManager.m2883a(C0745b.m3222b(f1542z[1], new String[0]));
            return null;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public cb opDiv(long j) {
        if (j != 0) {
            return new WDReel(this.f1543a / ((double) j));
        }
        try {
            WDErreurManager.m2883a(C0745b.m3222b(f1542z[1], new String[0]));
            return null;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public cb opDiv(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        double d = valeur.getDouble();
        if (d == 0.0d) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1542z[1], new String[0]));
                return null;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        try {
            switch (valeur.getTypeVar()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 12:
                    return new WDReel(this.f1543a / d);
                case 10:
                    return new WDMonetaire(this.f1543a / d);
                case 13:
                    return new WDNumerique(this.f1543a / d);
                default:
                    WDErreurManager.m2883a(C0745b.m3222b(f1542z[3], "/", getNomType(), valeur.getNomType()));
                    return null;
            }
        } catch (InvalidParameterException e2) {
            throw e2;
        }
        throw e2;
    }

    public boolean opEgal(double d) {
        return C0800d.m3856a(this.f1543a, d);
    }

    public boolean opEgal(int i) {
        return C0800d.m3856a(this.f1543a, (double) i);
    }

    public boolean opEgal(long j) {
        return C0800d.m3856a(this.f1543a, (double) j);
    }

    public boolean opEgal(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        try {
            switch (valeur.getTypeVar()) {
                case 1:
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
                    return C0800d.m3856a(getDouble(), valeur.getDouble());
                case 16:
                case 19:
                case 28:
                case 30:
                    return getString().compareTo(valeur.getString()) == 0;
                default:
                    WDErreurManager.m2883a(C0745b.m3222b(f1542z[3], "=", C0745b.m3220a(f1542z[2], new String[0]), valeur.getNomType()));
                    return false;
            }
        } catch (InvalidParameterException e) {
            throw e;
        } catch (InvalidParameterException e2) {
            throw e2;
        }
        throw e2;
    }

    public cb opInc() {
        this.f1543a += 1.0d;
        return this;
    }

    public boolean opInf(double d) {
        try {
            return this.f1543a < d;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opInf(int i) {
        try {
            return this.f1543a < ((double) i);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opInf(long j) {
        try {
            return this.f1543a < ((double) j);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opInfEgal(double d) {
        try {
            return this.f1543a <= d;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opInfEgal(int i) {
        try {
            return this.f1543a <= ((double) i);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opInfEgal(long j) {
        try {
            return this.f1543a <= ((double) j);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public cb opMod(WDObjet wDObjet) {
        cb cbVar = null;
        WDObjet valeur = wDObjet.getValeur();
        try {
            if (valeur.getDouble() == 0.0d) {
                WDErreurManager.m2883a(C0745b.m3222b(f1542z[1], new String[0]));
            } else {
                try {
                    switch (valeur.getTypeVar()) {
                        case 1:
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
                            cbVar = new WDEntier8(this.f1543a % ((double) valeur.getLong()));
                            break;
                        default:
                            WDErreurManager.m2883a(C0745b.m3222b(f1542z[3], f1542z[4], getNomType(), valeur.getNomType()));
                            break;
                    }
                } catch (InvalidParameterException e) {
                    throw e;
                }
            }
            return cbVar;
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    public cb opMoins(double d) {
        return new WDReel(this.f1543a - d);
    }

    public cb opMoins(int i) {
        return new WDReel(this.f1543a - ((double) i));
    }

    public cb opMoins(long j) {
        return new WDReel(this.f1543a - ((double) j));
    }

    public cb opMoins(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        try {
            switch (valeur.getTypeVar()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 12:
                case 27:
                    return new WDReel(this.f1543a - valeur.getDouble());
                case 10:
                    return new WDMonetaire(getBigDecimal().subtract(valeur.getBigDecimal()));
                case 13:
                    return new WDNumerique(getBigDecimal().subtract(valeur.getBigDecimal()));
                default:
                    WDErreurManager.m2883a(C0745b.m3222b(f1542z[3], "-", getNomType(), valeur.getNomType()));
                    return null;
            }
        } catch (InvalidParameterException e) {
            throw e;
        }
        throw e;
    }

    public cb opMoinsUnaire() {
        return new WDReel(-this.f1543a);
    }

    public cb opMult(double d) {
        return new WDReel(this.f1543a * d);
    }

    public cb opMult(int i) {
        return new WDReel(this.f1543a * ((double) i));
    }

    public cb opMult(long j) {
        return new WDReel(this.f1543a * ((double) j));
    }

    public cb opMult(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        try {
            switch (valeur.getTypeVar()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 12:
                case 27:
                    return new WDReel(this.f1543a * valeur.getDouble());
                case 10:
                    return new WDMonetaire(getBigDecimal().multiply(valeur.getBigDecimal()));
                case 13:
                    return new WDNumerique(getBigDecimal().multiply(valeur.getBigDecimal()));
                default:
                    WDErreurManager.m2883a(C0745b.m3222b(f1542z[3], C0607n.Vc, getNomType(), valeur.getNomType()));
                    return null;
            }
        } catch (InvalidParameterException e) {
            throw e;
        }
        throw e;
    }

    public cb opPlus(double d) {
        return new WDReel(this.f1543a + d);
    }

    public cb opPlus(int i) {
        return new WDReel(this.f1543a + ((double) i));
    }

    public cb opPlus(long j) {
        return new WDReel(this.f1543a + ((double) j));
    }

    public cb opPlus(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        try {
            switch (valeur.getTypeVar()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 12:
                case 27:
                    return new WDReel(getDouble() + valeur.getDouble());
                case 10:
                    return new WDMonetaire(getBigDecimal().add(valeur.getBigDecimal()));
                case 13:
                    return new WDNumerique(getBigDecimal().add(valeur.getBigDecimal()));
                case 16:
                    return new WDChaineU(getString() + valeur.getString());
                case 19:
                case 24:
                case 25:
                    return new WDChaineA(getString() + valeur.getString());
                case 28:
                case 30:
                    return new WDChaine(getString() + valeur.getString());
                default:
                    WDErreurManager.m2883a(C0745b.m3222b(f1542z[3], C0607n.dm, getNomType(), valeur.getNomType()));
                    return null;
            }
        } catch (InvalidParameterException e) {
            throw e;
        }
        throw e;
    }

    public cb opPlus(String str) {
        return new WDChaine(getString() + str);
    }

    public boolean opSup(double d) {
        try {
            return this.f1543a > d;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opSup(int i) {
        try {
            return this.f1543a > ((double) i);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opSup(long j) {
        try {
            return this.f1543a > ((double) j);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opSupEgal(double d) {
        try {
            return this.f1543a >= d;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opSupEgal(int i) {
        try {
            return this.f1543a >= ((double) i);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opSupEgal(long j) {
        try {
            return this.f1543a >= ((double) j);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public void razVariable() {
        this.f1543a = 0.0d;
    }

    public void release() {
    }

    public void setValeur(double d) {
        this.f1543a = d;
    }

    public void setValeur(int i) {
        this.f1543a = (double) i;
    }

    public void setValeur(long j) {
        this.f1543a = (double) j;
    }

    public void setValeur(WDObjet wDObjet) {
        this.f1543a = wDObjet.getValeur().getDouble();
    }

    public void setValeur(String str) {
        setValeur(C0725i.m3084m(str));
    }
}
