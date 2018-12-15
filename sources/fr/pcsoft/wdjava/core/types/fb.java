package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0800d;
import java.math.BigDecimal;
import java.security.InvalidParameterException;

public abstract class fb extends cb implements C0548s {
    /* renamed from: z */
    private static final String[] f1248z = new String[]{m1758z(m1759z("q)Da\t\u0001$By\u001f\u0002,_hp")), m1758z(m1759z("\u001f\u0002iB,=")), m1758z(m1759z("q\"]r\u0012\u00139Dx\u000e\r$Cc\u0005\u0000)Dc\u0005")), m1758z(m1759z("\u0006\u0014}R`;\u0003nX-\"\fy^\">\b-G/'\u001f-[!r\u000ebZ03\u001fl^3=\u0003"))};

    /* renamed from: z */
    private static String m1758z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 82;
                    break;
                case 1:
                    i2 = 109;
                    break;
                case 2:
                    i2 = 13;
                    break;
                case 3:
                    i2 = 55;
                    break;
                default:
                    i2 = 64;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1759z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 64);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected final double mo2354a(WDObjet wDObjet) {
        cb cbVar = (cb) wDObjet.checkType(cb.class);
        if (cbVar != null) {
            try {
                switch (cbVar.getTypeVar()) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                    case 13:
                    case 27:
                        return ((double) getLong()) - cbVar.getDouble();
                    case 5:
                    case 9:
                        return (double) (getLong() - cbVar.getLong());
                    case 16:
                    case 19:
                    case 28:
                    case 30:
                        return (double) getString().compareTo(cbVar.getString());
                }
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        throw new InvalidParameterException(f1248z[3]);
    }

    /* renamed from: a */
    public boolean mo2355a() {
        return false;
    }

    public final BigDecimal getBigDecimal() {
        long j = getLong();
        switch ((int) j) {
            case 0:
                try {
                    return BigDecimal.ZERO;
                } catch (InvalidParameterException e) {
                    throw e;
                }
            case 1:
                return BigDecimal.ONE;
            case 10:
                return BigDecimal.TEN;
            default:
                return new BigDecimal(j);
        }
    }

    public final boolean getBoolean() {
        try {
            return getLong() != 0;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public BigDecimal getCurrency() {
        return getBigDecimal();
    }

    public final long getDuree() {
        return getLong();
    }

    public boolean isEntier() {
        return true;
    }

    public boolean isNull() {
        return opEgal(0);
    }

    public cb opDecalageBinaireDroite(int i) {
        return new WDEntier4(getInt() >> i);
    }

    public cb opDecalageBinaireGauche(int i) {
        return new WDEntier4(getInt() << i);
    }

    public final boolean opDiff(double d) {
        try {
            return !C0800d.m3856a(getDouble(), d);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final boolean opDiff(int i) {
        try {
            return getLong() != ((long) i);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final boolean opDiff(long j) {
        try {
            return getLong() != j;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final boolean opDiff(WDObjet wDObjet) {
        WDReel wDReel = (WDReel) wDObjet.checkType(WDReel.class);
        if (wDReel == null) {
            return super.opDiff(wDObjet);
        }
        try {
            return !C0800d.m3856a(getDouble(), wDReel.getDouble());
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final cb opDiv(double d) {
        if (d != 0.0d) {
            return new WDReel(getDouble() / d);
        }
        try {
            WDErreurManager.m2883a(C0745b.m3222b(f1248z[0], new String[0]));
            return null;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final cb opDiv(int i) {
        if (i != 0) {
            return new WDReel(getDouble() / ((double) i));
        }
        try {
            WDErreurManager.m2883a(C0745b.m3222b(f1248z[0], new String[0]));
            return null;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final cb opDiv(long j) {
        if (j != 0) {
            return new WDReel(getDouble() / ((double) j));
        }
        try {
            WDErreurManager.m2883a(C0745b.m3222b(f1248z[0], new String[0]));
            return null;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final cb opDiv(WDObjet wDObjet) {
        cb cbVar = (cb) wDObjet.checkType(cb.class);
        if (cbVar != null) {
            double d = cbVar.getDouble();
            if (d == 0.0d) {
                try {
                    WDErreurManager.m2883a(C0745b.m3222b(f1248z[0], new String[0]));
                    return null;
                } catch (InvalidParameterException e) {
                    throw e;
                }
            }
            try {
                switch (cbVar.getTypeVar()) {
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
                        return new WDReel(getDouble() / d);
                    case 10:
                        return new WDMonetaire(((double) getLong()) / d);
                    case 13:
                        return new WDNumerique(((double) getLong()) / d);
                    default:
                        return null;
                }
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f1248z[2], "/", getNomType(), wDObjet.getNomType()));
        return null;
    }

    public final boolean opEgal(double d) {
        return C0800d.m3856a(getDouble(), d);
    }

    public final boolean opEgal(int i) {
        try {
            return getLong() == ((long) i);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final boolean opEgal(long j) {
        try {
            return getLong() == j;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final boolean opEgal(WDObjet wDObjet) {
        WDReel wDReel = (WDReel) wDObjet.checkType(WDReel.class);
        if (wDReel == null) {
            return super.opEgal(wDObjet);
        }
        try {
            return C0800d.m3856a(getDouble(), wDReel.getDouble());
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public cb opEtBinaire(double d) {
        return new WDEntier4(((long) getInt()) & ((long) d));
    }

    public cb opEtBinaire(int i) {
        return new WDEntier4(getInt() & i);
    }

    public cb opEtBinaire(long j) {
        return new WDEntier8(((long) getInt()) & j);
    }

    public cb opEtBinaire(WDObjet wDObjet) {
        WDEntier8 wDEntier8 = (WDEntier8) wDObjet.checkType(WDEntier8.class);
        if (wDEntier8 == null) {
            return new WDEntier4(getInt() & wDObjet.getInt());
        }
        try {
            return new WDEntier8(getLong() & wDEntier8.getLong());
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public cb opEtBinaire(String str) {
        return opEtBinaire(C0725i.m3022a(C0725i.m3055c(str)));
    }

    public cb opEtBinaire(boolean z) {
        try {
            return new WDEntier4((z ? 1 : 0) & getInt());
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final boolean opInf(double d) {
        try {
            return ((double) getLong()) < d;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final boolean opInf(int i) {
        try {
            return getLong() < ((long) i);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final boolean opInf(long j) {
        try {
            return getLong() < j;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final boolean opInfEgal(double d) {
        try {
            return ((double) getLong()) <= d;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final boolean opInfEgal(int i) {
        try {
            return getLong() <= ((long) i);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final boolean opInfEgal(long j) {
        try {
            return getLong() <= j;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final cb opMod(WDObjet wDObjet) {
        cb cbVar = (cb) wDObjet.checkType(cb.class);
        if (cbVar != null) {
            if (cbVar.getDouble() == 0.0d) {
                try {
                    WDErreurManager.m2883a(C0745b.m3222b(f1248z[0], new String[0]));
                    return null;
                } catch (InvalidParameterException e) {
                    throw e;
                }
            }
            try {
                switch (cbVar.getTypeVar()) {
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
                        return new WDEntier8(getLong() % cbVar.getLong());
                }
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f1248z[2], f1248z[1], getNomType(), wDObjet.getNomType()));
        return null;
    }

    public final cb opMoins(double d) {
        return new WDReel(((double) getLong()) - d);
    }

    public final cb opMoins(int i) {
        return opMoins((long) i);
    }

    public final cb opMoins(long j) {
        return C0725i.m3022a(getLong() - j);
    }

    public final cb opMoins(WDObjet wDObjet) {
        cb cbVar = (cb) wDObjet.checkType(cb.class);
        if (cbVar != null) {
            try {
                switch (cbVar.getTypeVar()) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 27:
                        return opMoins(cbVar.getLong());
                    case 10:
                        return new WDMonetaire(getBigDecimal().subtract(cbVar.getBigDecimal()));
                    case 12:
                        return new WDReel(((double) getLong()) - cbVar.getDouble());
                    case 13:
                        return new WDNumerique(getBigDecimal().subtract(cbVar.getBigDecimal()));
                }
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f1248z[2], "-", getNomType(), wDObjet.getNomType()));
        return null;
    }

    public final cb opMult(double d) {
        return new WDReel(((double) getLong()) * d);
    }

    public final cb opMult(int i) {
        return opMult((long) i);
    }

    public final cb opMult(long j) {
        return C0725i.m3022a(getLong() * j);
    }

    public final cb opMult(WDObjet wDObjet) {
        cb cbVar = (cb) wDObjet.checkType(cb.class);
        if (cbVar != null) {
            try {
                switch (cbVar.getTypeVar()) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 27:
                        return opMult(cbVar.getLong());
                    case 10:
                        return new WDMonetaire(getBigDecimal().multiply(cbVar.getBigDecimal()));
                    case 12:
                        return new WDReel(((double) getLong()) * cbVar.getDouble());
                    case 13:
                        return new WDNumerique(getBigDecimal().multiply(cbVar.getBigDecimal()));
                }
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f1248z[2], C0607n.Vc, getNomType(), wDObjet.getNomType()));
        return null;
    }

    public cb opNonBinaire() {
        return new WDEntier4(getInt() ^ -1);
    }

    public cb opOuBinaire(double d) {
        return new WDEntier4(getLong() | ((long) d));
    }

    public cb opOuBinaire(int i) {
        return new WDEntier4(getLong() | ((long) i));
    }

    public cb opOuBinaire(long j) {
        return new WDEntier8(((long) getInt()) | j);
    }

    public cb opOuBinaire(WDObjet wDObjet) {
        WDEntier8 wDEntier8 = (WDEntier8) wDObjet.checkType(WDEntier8.class);
        if (wDEntier8 == null) {
            return new WDEntier4(getInt() | wDObjet.getInt());
        }
        try {
            return new WDEntier8(getLong() | wDEntier8.getLong());
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public cb opOuBinaire(String str) {
        return opOuBinaire(C0725i.m3022a(C0725i.m3055c(str)));
    }

    public cb opOuBinaire(boolean z) {
        try {
            return new WDEntier4((z ? 1 : 0) | getInt());
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public cb opOuExclusifBinaire(double d) {
        return new WDEntier4(((long) getInt()) ^ ((long) d));
    }

    public cb opOuExclusifBinaire(int i) {
        return new WDEntier4(getInt() ^ i);
    }

    public cb opOuExclusifBinaire(long j) {
        return new WDEntier8(((long) getInt()) ^ j);
    }

    public cb opOuExclusifBinaire(WDObjet wDObjet) {
        WDEntier8 wDEntier8 = (WDEntier8) wDObjet.checkType(WDEntier8.class);
        if (wDEntier8 == null) {
            return new WDEntier4(getInt() ^ wDObjet.getInt());
        }
        try {
            return new WDEntier8(getLong() ^ wDEntier8.getLong());
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public cb opOuExclusifBinaire(String str) {
        return opOuExclusifBinaire(C0725i.m3022a(C0725i.m3055c(str)));
    }

    public cb opOuExclusifBinaire(boolean z) {
        try {
            return new WDEntier4((z ? 1 : 0) ^ getInt());
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final cb opPlus(double d) {
        return new WDReel(((double) getLong()) + d);
    }

    public final cb opPlus(int i) {
        return opPlus((long) i);
    }

    public final cb opPlus(long j) {
        return C0725i.m3022a(getLong() + j);
    }

    public final cb opPlus(WDObjet wDObjet) {
        cb cbVar = (cb) wDObjet.checkType(cb.class);
        if (cbVar != null) {
            try {
                switch (cbVar.getTypeVar()) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 27:
                        return opPlus(cbVar.getLong());
                    case 10:
                        return new WDMonetaire(getBigDecimal().add(cbVar.getBigDecimal()));
                    case 12:
                        return new WDReel(((double) getLong()) + cbVar.getDouble());
                    case 13:
                        return new WDNumerique(getBigDecimal().add(cbVar.getBigDecimal()));
                    case 16:
                        return new WDChaineU(getString() + cbVar.getString());
                    case 19:
                    case 24:
                    case 25:
                        return new WDChaineA(getString() + cbVar.getString());
                    case 28:
                    case 30:
                        return opPlus(cbVar.getString());
                }
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f1248z[2], C0607n.dm, getNomType(), wDObjet.getNomType()));
        return null;
    }

    public final cb opPlus(String str) {
        return mo2544a(getString() + str);
    }

    public final boolean opSup(double d) {
        try {
            return ((double) getLong()) > d;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final boolean opSup(int i) {
        try {
            return getLong() > ((long) i);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final boolean opSup(long j) {
        try {
            return getLong() > j;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final boolean opSupEgal(double d) {
        try {
            return ((double) getLong()) >= d;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final boolean opSupEgal(int i) {
        try {
            return getLong() >= ((long) i);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public final boolean opSupEgal(long j) {
        try {
            return getLong() >= j;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public void release() {
    }
}
