package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0613b;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0800d;
import java.math.BigDecimal;
import java.security.InvalidParameterException;

public class WDBooleen extends cb implements C0548s {
    public static final C0613b<WDBooleen> CREATOR = new C0795w();
    /* renamed from: z */
    private static final String[] f1531z = new String[]{m2383z(m2384z("iZ3\nm\u000bA*\u0000q\u0015\\-\u001bz\u0018Q*\u001bz")), m2383z(m2384z("(z\f#Z+{")), m2383z(m2384z("iW,\u0000s\u000fP-")), m2383z(m2384z("\u001el\u0013*\u001f#{\u0000 R:t\u0017&]&pC?P?gC#^jv\f\"O+g\u0002&L%{"))};
    /* renamed from: a */
    boolean f1532a;

    public WDBooleen() {
        this.f1532a = false;
    }

    public WDBooleen(double d) {
        this(d != 0.0d);
    }

    public WDBooleen(int i) {
        this(i != 0);
    }

    public WDBooleen(WDObjet wDObjet) {
        setValeur(wDObjet);
    }

    public WDBooleen(String str) {
        setValeur(str);
    }

    public WDBooleen(boolean z) {
        this.f1532a = z;
    }

    /* renamed from: z */
    private static String m2383z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 74;
                    break;
                case 1:
                    i2 = 21;
                    break;
                case 2:
                    i2 = 99;
                    break;
                case 3:
                    i2 = 79;
                    break;
                default:
                    i2 = 63;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2384z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 63);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected double mo2354a(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        try {
            switch (valeur.getTypeVar()) {
                case 1:
                case 6:
                case 7:
                case 8:
                    return (double) (getInt() - valeur.getInt());
                case 9:
                    return (double) ((int) (getLong() - valeur.getLong()));
                case 10:
                case 12:
                case 13:
                    return (double) ((int) (getDouble() - valeur.getDouble()));
                case 16:
                case 19:
                    return (double) getString().compareTo(valeur.getString());
                default:
                    throw new InvalidParameterException(f1531z[3]);
            }
        } catch (InvalidParameterException e) {
            throw e;
        }
        throw e;
    }

    /* renamed from: a */
    public boolean mo2355a() {
        return false;
    }

    public BigDecimal getBigDecimal() {
        try {
            return this.f1532a ? BigDecimal.ONE : BigDecimal.ZERO;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean getBoolean() {
        return this.f1532a;
    }

    public byte getByte() {
        return (byte) getInt();
    }

    public BigDecimal getCurrency() {
        return getBigDecimal();
    }

    public byte[] getDonneeBinaire() {
        int i = 1;
        try {
            byte[] bArr = new byte[1];
            if (!this.f1532a) {
                i = 0;
            }
            bArr[0] = (byte) i;
            return bArr;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public double getDouble() {
        try {
            return this.f1532a ? 1.0d : 0.0d;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public int getInt() {
        try {
            return this.f1532a ? 1 : 0;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public Object getJSONValue() {
        return Boolean.valueOf(this.f1532a);
    }

    public long getLong() {
        try {
            return this.f1532a ? 1 : 0;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public String getNomType() {
        return C0745b.m3220a(f1531z[2], new String[0]);
    }

    public short getShort() {
        return (short) getInt();
    }

    public String getString() {
        try {
            return this.f1532a ? "1" : "0";
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public int getTypeVar() {
        return 1;
    }

    public String getTypeXMLPourSerialisation() {
        return f1531z[1];
    }

    public boolean isBooleen() {
        return true;
    }

    public boolean isNull() {
        try {
            return !this.f1532a;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opDiff(int i) {
        try {
            return getInt() != i;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opDiff(WDObjet wDObjet) {
        try {
            return wDObjet.isReel() ? !C0800d.m3856a(getDouble(), wDObjet.getDouble()) : super.opDiff(wDObjet);
        } catch (InvalidParameterException e) {
            throw e;
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    public boolean opDiff(boolean z) {
        try {
            return this.f1532a != z;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opEgal(int i) {
        try {
            return getInt() == i;
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

    public boolean opEgal(boolean z) {
        try {
            return this.f1532a == z;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opInf(int i) {
        try {
            return getInt() < i;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opInfEgal(int i) {
        try {
            return getInt() <= i;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public cb opMult(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        try {
            switch (valeur.getTypeVar()) {
                case 1:
                case 6:
                case 7:
                case 8:
                    return new WDEntier4(valeur.getInt() * getInt());
                case 9:
                    return new WDEntier8(getLong() * valeur.getLong());
                case 10:
                    return new WDMonetaire(getBigDecimal().multiply(valeur.getBigDecimal()));
                case 12:
                    return new WDReel(getDouble() * valeur.getDouble());
                case 13:
                    return new WDNumerique(valeur.getBigDecimal().multiply(getBigDecimal()));
                default:
                    WDErreurManager.m2883a(C0745b.m3222b(f1531z[0], C0607n.Vc, getNomType(), valeur.getNomType()));
                    return null;
            }
        } catch (InvalidParameterException e) {
            throw e;
        }
        throw e;
    }

    public cb opPlus(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        try {
            switch (valeur.getTypeVar()) {
                case 1:
                case 6:
                case 7:
                case 8:
                    return new WDEntier4(valeur.getInt() + getInt());
                case 9:
                    return new WDEntier8(getLong() + valeur.getLong());
                case 16:
                    return new WDChaineU(getString() + valeur.getString());
                case 19:
                case 24:
                case 25:
                    return new WDChaineA(getString() + valeur.getString());
                default:
                    WDErreurManager.m2883a(C0745b.m3222b(f1531z[0], C0607n.dm, getNomType(), valeur.getNomType()));
                    return null;
            }
        } catch (InvalidParameterException e) {
            throw e;
        }
        throw e;
    }

    public boolean opSup(int i) {
        try {
            return getInt() > i;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opSupEgal(int i) {
        try {
            return getInt() >= i;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public void razVariable() {
        this.f1532a = false;
    }

    public void release() {
    }

    public void setValeur(double d) {
        this.f1532a = d != 0.0d;
    }

    public void setValeur(int i) {
        this.f1532a = i != 0;
    }

    public void setValeur(WDObjet wDObjet) {
        try {
            this.f1532a = wDObjet.getValeur().getInt() != 0;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public void setValeur(String str) {
        setValeur(C0725i.m3072e(str));
    }

    public void setValeur(boolean z) {
        this.f1532a = z;
    }
}
