package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import java.math.BigDecimal;

public abstract class cb extends WDObjet {
    /* renamed from: z */
    private static final String[] f1247z = new String[]{m1751z(m1752z("\u000b\u0017:\u000bG}\u00007\u001cZ|\u0000)\u001aVa\u001d&\u0006A`\u0013!\u0017Gw`")), m1751z(m1752z("\u000b\u0004)\u000bKi\u0010$\u001c]{\u001d=\n]m\u001e-\u0014Gf\u0006")), m1751z(m1752z("\u000b\u0017&\rKm\u0000")), m1751z(m1752z("\u000b\u0011'\u0017Tm\u0000;\u0010Mf\r!\u0014Rg\u0001;\u0010@d\u0017")), m1751z(m1752z("\u000b\u001c=\u0014Gz\u001b9\fG")), m1751z(m1752z("\u0016o")), m1751z(m1752z("\u000b\u001d8\u001cPi\u0006!\u0016Lw\u001b&\rGz\u0016!\rG")), m1751z(m1752z("\u000b\u0017&\rKm\u00007a")), m1751z(m1752z("\u000b\u0016=\u000bGm")), m1751z(m1752z("\u000b\u0017&\rKm\u00007h")), m1751z(m1752z("\u000b\u0017&\rKm\u00007k")), m1751z(m1752z("\u000b\u0016)\rGw\u001a-\fPm")), m1751z(m1752z("\u000b\u001d8\u001cPi\u0006-\fPw\u0016-\u001a]a\u001c<\u001cPl\u001b<")), m1751z(m1752z("\u0014l")), m1751z(m1752z("\u000b\u001f'\u0017G|\u0013!\u000bG")), m1751z(m1752z("\u000b\u001a-\fPm")), m1751z(m1752z("\u000b\u0016)\rG")), m1751z(m1752z("\u000b\u0017:\u000bG}\u00007\u001cZ|\u0000)\u001aVa\u001d&\u0006A`\u0013!\u0017G")), m1751z(m1752z("\u000b\u0002:\u0016Am\u0016=\u000bG")), m1751z(m1752z("\u000b\u0004)\u000bKi\u0010$\u001c]f\u001d&\u0006Mj\u0018-\r")), m1751z(m1752z("\u000b\u0000-\u001cN")), m1751z(m1752z("\u000b\u001d8\u001cPi\u0006-\fPw\u001b&\u001a]a\u001c<\u001cPl\u001b<")), m1751z(m1752z("\u000b\u0011'\u0014Ri\u0000)\u0010Qg\u001c7\u0017Wd\u001e7\u0010L|\u0017:\u001dK|\u0017")), m1751z(m1752z("\u000b\u0010'\u0016Nm\u0017&")), m1751z(m1752z("\u0014o"))};

    public cb(WDObjet wDObjet) {
        setValeur(wDObjet);
    }

    /* renamed from: z */
    private static String m1751z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 40;
                    break;
                case 1:
                    i2 = 82;
                    break;
                case 2:
                    i2 = 104;
                    break;
                case 3:
                    i2 = 89;
                    break;
                default:
                    i2 = 2;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1752z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 2);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected abstract double mo2354a(WDObjet wDObjet);

    /* renamed from: a */
    protected WDChaine mo2544a(String str) {
        try {
            return WDProjet.getInstance().isModeAnsi() ? new WDChaineA(str) : new WDChaineU(str);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: a */
    protected WDChaine mo2545a(byte[] bArr) {
        try {
            return WDProjet.getInstance().isModeAnsi() ? new WDChaineA(bArr) : new WDChaineU(bArr);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: b */
    public boolean m1756b() {
        return false;
    }

    public WDObjet extraireChaine(int i) {
        if (i >= 1) {
            try {
                if (i <= getNbCaractere()) {
                    int i2 = i - 1;
                    if (!isMemoBinaire()) {
                        return mo2544a(getString().substring(i2, i2 + 1));
                    }
                    return mo2545a(new byte[]{getDonneeBinaire()[i2]});
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return mo2544a("");
    }

    public WDObjet extraireChaine(int i, WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[17], new String[0]));
        return null;
    }

    public WDObjet extraireDebutChaine(int i) {
        int nbCaractere = getNbCaractere();
        if (i < 1) {
            try {
                return mo2544a("");
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i >= nbCaractere) {
            try {
                return new WDChaine((WDObjet) this);
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else if (!isMemoBinaire()) {
            return mo2544a(getString().substring(0, i));
        } else {
            byte[] bArr = new byte[i];
            System.arraycopy(getDonneeBinaire(), 0, bArr, 0, i);
            return mo2545a(bArr);
        }
    }

    public WDObjet extraireDebutChaine(int i, WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[0], new String[0]));
        return null;
    }

    public WDObjet extraireFinChaine(int i) {
        int nbCaractere = getNbCaractere();
        if (i < 1 || i > nbCaractere) {
            try {
                return mo2544a("");
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int i2 = i - 1;
        if (!isMemoBinaire()) {
            return mo2544a(getString().substring(i2, nbCaractere));
        }
        byte[] bArr = new byte[(nbCaractere - i2)];
        System.arraycopy(getDonneeBinaire(), i2, bArr, 0, bArr.length);
        return mo2545a(bArr);
    }

    public WDObjet extraireFinChaine(int i, WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[0], new String[0]));
        return null;
    }

    public WDObjet extrairePartieChaine(int i, int i2) {
        return extraireSousChaine(i, (i + i2) - 1);
    }

    public WDObjet extrairePartieChaine(int i, int i2, WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[0], new String[0]));
        return null;
    }

    public WDObjet extraireSousChaine(int i, int i2) {
        int nbCaractere = getNbCaractere();
        if (i < 1 || i > nbCaractere || i2 < i || i2 < 1) {
            try {
                return mo2544a("");
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int i3 = i - 1;
        if (i2 > nbCaractere) {
            i2 = nbCaractere;
        }
        if (!isMemoBinaire()) {
            return mo2544a(getString().substring(i3, i2));
        }
        byte[] bArr = new byte[(i2 - i3)];
        System.arraycopy(getDonneeBinaire(), i3, bArr, 0, bArr.length);
        return mo2545a(bArr);
    }

    public WDObjet extraireSousChaine(int i, int i2, WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[0], new String[0]));
        return null;
    }

    public BigDecimal getBigDecimal() {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[3], getNomType(), C0745b.m3220a(f1247z[4], new String[0])));
        return null;
    }

    public boolean getBoolean() {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[3], getNomType(), C0745b.m3220a(f1247z[23], new String[0])));
        return false;
    }

    public byte getByte() {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[3], getNomType(), C0745b.m3220a(f1247z[9], new String[0])));
        return (byte) 0;
    }

    public BigDecimal getCurrency() {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[3], getNomType(), C0745b.m3220a(f1247z[14], new String[0])));
        return null;
    }

    public String getDate() {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[3], getNomType(), C0745b.m3220a(f1247z[16], new String[0])));
        return null;
    }

    public String getDateHeure() {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[3], getNomType(), C0745b.m3220a(f1247z[11], new String[0])));
        return null;
    }

    public byte[] getDonneeBinaire() {
        return C0725i.m3075f(getString());
    }

    public double getDouble() {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[3], getNomType(), C0745b.m3220a(f1247z[20], new String[0])));
        return 0.0d;
    }

    public long getDuree() {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[3], getNomType(), C0745b.m3220a(f1247z[8], new String[0])));
        return 0;
    }

    public WDObjet getElement(String str) {
        return getElement(str, true);
    }

    public WDObjet getElement(String str, boolean z) {
        if (z) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1247z[1], new String[0]));
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return null;
    }

    public String getHeure() {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[3], getNomType(), C0745b.m3220a(f1247z[15], new String[0])));
        return null;
    }

    public int getInt() {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[3], getNomType(), C0745b.m3220a(f1247z[2], new String[0])));
        return 0;
    }

    public long getLong() {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[3], getNomType(), C0745b.m3220a(f1247z[7], new String[0])));
        return 0;
    }

    public WDObjet getMembre(String str) {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[19], new String[0]));
        return null;
    }

    public WDProcedure getProcedure() {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[3], getNomType(), C0745b.m3220a(f1247z[18], new String[0])));
        return null;
    }

    public short getShort() {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[3], getNomType(), C0745b.m3220a(f1247z[10], new String[0])));
        return (short) 0;
    }

    public WDObjet getValeur() {
        return this;
    }

    public WDBooleen getVide() {
        return new WDBooleen(false);
    }

    public boolean hasProperty(String str) {
        return false;
    }

    public boolean isAllloue() {
        return true;
    }

    public boolean isEvaluable() {
        return true;
    }

    public boolean isNull() {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[22], getNomType()));
        return false;
    }

    public boolean isReleased() {
        return false;
    }

    public boolean isUnicode() {
        try {
            return getTypeVar() == 16;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public boolean opCommencePar(WDObjet wDObjet) {
        return wDObjet == null ? false : getString().startsWith(wDObjet.getString());
    }

    public cb opDec() {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[12], new String[0]));
        return null;
    }

    public boolean opDiff(WDObjet wDObjet) {
        try {
            return mo2354a(wDObjet) != 0.0d;
        } catch (IllegalArgumentException e) {
            WDErreurManager.m2883a(C0745b.m3222b(f1247z[6], f1247z[13], getNomType(), wDObjet.getValeur().getNomType()));
            return false;
        }
    }

    public cb opDiv(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[6], "/", getNomType(), wDObjet.getValeur().getNomType()));
        return null;
    }

    public boolean opEgal(WDObjet wDObjet) {
        try {
            return mo2354a(wDObjet) == 0.0d;
        } catch (IllegalArgumentException e) {
            WDErreurManager.m2883a(C0745b.m3222b(f1247z[6], "=", getNomType(), wDObjet.getValeur().getNomType()));
            return false;
        }
    }

    public boolean opEgalSouple(WDObjet wDObjet) {
        if (wDObjet == null) {
            return false;
        }
        try {
            return C0808l.m4042c(getString(), wDObjet.getString(), 21) == 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public boolean opEgalTresSouple(WDObjet wDObjet) {
        if (wDObjet == null) {
            return false;
        }
        try {
            return C0808l.m4042c(getString(), wDObjet.getString(), 23) == 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public cb opInc() {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[21], new String[0]));
        return null;
    }

    public boolean opInf(WDObjet wDObjet) {
        try {
            return mo2354a(wDObjet) < 0.0d;
        } catch (IllegalArgumentException e) {
            WDErreurManager.m2883a(C0745b.m3222b(f1247z[6], "<", getNomType(), wDObjet.getValeur().getNomType()));
            return false;
        }
    }

    public boolean opInfEgal(WDObjet wDObjet) {
        try {
            return mo2354a(wDObjet) <= 0.0d;
        } catch (IllegalArgumentException e) {
            WDErreurManager.m2883a(C0745b.m3222b(f1247z[6], f1247z[24], getNomType(), wDObjet.getValeur().getNomType()));
            return false;
        }
    }

    public cb opMoins(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[6], "-", getNomType(), wDObjet.getValeur().getNomType()));
        return null;
    }

    public cb opMult(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1247z[6], C0607n.Vc, getNomType(), wDObjet.getValeur().getNomType()));
        return null;
    }

    public boolean opSup(WDObjet wDObjet) {
        try {
            return mo2354a(wDObjet) > 0.0d;
        } catch (IllegalArgumentException e) {
            WDErreurManager.m2883a(C0745b.m3222b(f1247z[6], ">", getNomType(), wDObjet.getValeur().getNomType()));
            return false;
        }
    }

    public boolean opSupEgal(WDObjet wDObjet) {
        try {
            return mo2354a(wDObjet) >= 0.0d;
        } catch (IllegalArgumentException e) {
            WDErreurManager.m2883a(C0745b.m3222b(f1247z[6], f1247z[5], getNomType(), wDObjet.getValeur().getNomType()));
            return false;
        }
    }
}
