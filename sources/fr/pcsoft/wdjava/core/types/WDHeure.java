package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0613b;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.hb;
import java.security.InvalidParameterException;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

public class WDHeure extends cb implements hb {
    public static final C0613b<WDHeure> CREATOR = new C0786k();
    /* renamed from: D */
    private static final String[] f1554D = new String[]{m2461z(m2462z("?\u000e")), m2461z(m2462z(".\u000e")), m2461z(m2462z("\n*=\\")), m2461z(m2462z("Ns")), m2461z(m2462z("*: \\a\u0017-3V,\u000e\"$P#\u0012&pI.\u000b1pU ^ ?T1\u001f11P2\u0011-")), m2461z(m2462z("]\u000b\u0015l\u0013;\u001c\u0019w\u0017?\u000f\u0019}\u0004")), m2461z(m2462z("]\u0006\u001em\b;\u0011\u000f\u0001")), m2461z(m2462z("]\u0000\u001fw\u0017;\u0011\u0003p\u000e0\u001c\u0019t\u00111\u0010\u0003p\u00032\u0006")), m2461z(m2462z("]\u000b\u0015l\u0013;")), m2461z(m2462z("Kz")), m2461z(m2462z("]\u000e\u0019w\u0014*\u0006")), m2461z(m2462z("]\u0001\u001fk\u000f;\u001c\u0000k\u000e.\u0011\u0019|\u0015;")), m2461z(m2462z("]\u0015\u0011u\u0004+\u0011\u000fp\u000f(\u0002\u001cp\u0005;\u001c\u0000k\u000e.\u0011\u0019|\u0015;")), m2461z(m2462z("]\u000e\u0019u\r7\u0010\u0015z\u000e0\u0007\u0015")), m2461z(m2462z("Gzi")), m2461z(m2462z("]\f\u0000|\u0013?\u0017\u0019v\u000f!\n\u001em\u0004,\u0007\u0019m\u0004")), m2461z(m2462z("Lp")), m2461z(m2462z("]\u0010\u0015z\u000e0\u0007\u0015"))};
    /* renamed from: A */
    private int f1555A;
    /* renamed from: B */
    private int f1556B;
    /* renamed from: C */
    private int f1557C;
    /* renamed from: w */
    private byte f1558w = (byte) 0;
    /* renamed from: x */
    private byte f1559x = (byte) 0;
    /* renamed from: y */
    private int f1560y;
    /* renamed from: z */
    private String f1561z = null;

    public WDHeure() {
        m2450d();
    }

    public WDHeure(double d) {
        setValeur(d);
    }

    public WDHeure(int i) {
        m2448a((long) (i * 10));
    }

    public WDHeure(int i, int i2, int i3) {
        this.f1560y = i;
        this.f1555A = i2;
        this.f1556B = i3;
    }

    public WDHeure(long j, boolean z) {
        if (z) {
            m2448a(j);
        } else {
            m2448a(10 * j);
        }
    }

    public WDHeure(WDObjet wDObjet) {
        setValeur(wDObjet);
    }

    public WDHeure(String str) {
        setValeur(str);
    }

    public WDHeure(boolean z) {
        setValeur(z);
    }

    /* renamed from: a */
    private void m2447a(int i, int i2, int i3, int i4) {
        f.clear();
        f.set(11, i);
        f.set(12, i2);
        f.set(13, i3);
        f.set(14, i4);
        m2468a(f);
    }

    /* renamed from: a */
    private void m2448a(long j) {
        if (j < 0) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1554D[5], new String[0]));
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        long j2 = j % hb.f2079l;
        long j3 = j2 % 3600000;
        this.f1560y = (byte) ((int) Math.floor((double) (j2 / 3600000)));
        j2 = j3 % 60000;
        this.f1555A = (byte) ((int) Math.floor((double) (j3 / 60000)));
        j3 = j2 % 1000;
        this.f1556B = (byte) ((int) Math.floor((double) (j2 / 1000)));
        this.f1557C = (short) ((int) j3);
        this.f1561z = null;
        this.f1559x = (byte) 0;
    }

    /* renamed from: b */
    private void m2449b(int i) {
        if (i < 0) {
            try {
                m2452e(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2470c();
        int i2 = this.f1557C - i;
        if (i2 < 0) {
            try {
                m2454g();
                f.add(14, -i);
                m2458p();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setMilliSeconde(i2);
    }

    /* renamed from: d */
    private void m2450d() {
        try {
            if (hb.f2068a != null) {
                setValeur(hb.f2068a);
            } else {
                setValeur(C0725i.m3073f(new Date()));
            }
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    /* renamed from: d */
    private void m2451d(int i) {
        if (i < 0) {
            try {
                m2453f(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2470c();
        int i2 = this.f1555A + i;
        if (i2 > 59) {
            try {
                m2454g();
                f.add(12, i);
                m2458p();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setMinute(i2);
    }

    /* renamed from: e */
    private void m2452e(int i) {
        if (i < 0) {
            try {
                m2449b(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2470c();
        int i2 = this.f1557C + i;
        if (i2 > C0607n.Qv) {
            try {
                m2454g();
                f.add(14, i);
                m2458p();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setMilliSeconde(i2);
    }

    /* renamed from: f */
    private void m2453f(int i) {
        if (i < 0) {
            try {
                m2451d(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2470c();
        int i2 = this.f1555A - i;
        if (i2 < 0) {
            try {
                m2454g();
                f.add(12, -i);
                m2458p();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setMinute(i2);
    }

    /* renamed from: g */
    private void m2454g() {
        f.clear();
        f.set(11, this.f1560y);
        f.set(12, this.f1555A);
        f.set(13, this.f1556B);
        f.set(14, this.f1557C);
    }

    /* renamed from: i */
    private void m2455i(int i) {
        if (i < 0) {
            try {
                m2456k(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2470c();
        int i2 = this.f1556B + i;
        if (i2 > 59) {
            try {
                m2454g();
                f.add(13, i);
                m2458p();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setSeconde(i2);
    }

    /* renamed from: k */
    private void m2456k(int i) {
        if (i < 0) {
            try {
                m2455i(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2470c();
        int i2 = this.f1556B - i;
        if (i2 < 0) {
            try {
                m2454g();
                f.add(13, -i);
                m2458p();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setSeconde(i2);
    }

    /* renamed from: l */
    private void m2457l(int i) {
        if (i < 0) {
            try {
                m2479j(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2470c();
        int i2 = this.f1560y - i;
        if (i2 < 0) {
            try {
                m2454g();
                f.add(11, -i);
                m2458p();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        m2483m(i2);
    }

    /* renamed from: p */
    private void m2458p() {
        m2468a(f);
    }

    /* renamed from: q */
    private byte m2459q() {
        try {
            if (this.f1561z != null) {
                if (!C0808l.m4044c(this.f1561z)) {
                    return (byte) 1;
                }
            }
            try {
                if (this.f1560y >= 0) {
                    if (this.f1560y <= 23) {
                        try {
                            if (this.f1555A >= 0) {
                                if (this.f1555A <= 59) {
                                    try {
                                        if (this.f1556B < 0) {
                                            return (byte) 4;
                                        }
                                        if (this.f1556B > 59) {
                                            return (byte) 4;
                                        }
                                        try {
                                            if (this.f1557C < 0) {
                                                return (byte) 4;
                                            }
                                            if (this.f1557C > C0607n.Qv) {
                                                return (byte) 4;
                                            }
                                            this.f1561z = null;
                                            return (byte) 0;
                                        } catch (InvalidParameterException e) {
                                            throw e;
                                        } catch (InvalidParameterException e2) {
                                            throw e2;
                                        }
                                    } catch (InvalidParameterException e22) {
                                        throw e22;
                                    } catch (InvalidParameterException e222) {
                                        throw e222;
                                    }
                                }
                            }
                            return (byte) 3;
                        } catch (InvalidParameterException e2222) {
                            throw e2222;
                        } catch (InvalidParameterException e22222) {
                            throw e22222;
                        }
                    }
                }
                return (byte) 2;
            } catch (InvalidParameterException e222222) {
                throw e222222;
            } catch (InvalidParameterException e2222222) {
                throw e2222222;
            }
        } catch (InvalidParameterException e22222222) {
            throw e22222222;
        } catch (InvalidParameterException e222222222) {
            throw e222222222;
        }
    }

    /* renamed from: s */
    private int m2460s() {
        try {
            if (this.f1559x == (byte) 99) {
                this.f1559x = m2459q();
            }
            return this.f1559x;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    /* renamed from: z */
    private static String m2461z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 126;
                    break;
                case 1:
                    i2 = 67;
                    break;
                case 2:
                    i2 = 80;
                    break;
                case 3:
                    i2 = 57;
                    break;
                default:
                    i2 = 65;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2462z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 65);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public double mo2354a(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        try {
            switch (valeur.getTypeVar()) {
                case 16:
                case 19:
                case 25:
                case 28:
                case 30:
                    return (double) getString().compareTo(valeur.getString());
                case 26:
                    return (double) getString().compareTo(((WDDateHeure) valeur).m2361m());
                default:
                    throw new InvalidParameterException(f1554D[4]);
            }
        } catch (InvalidParameterException e) {
            throw e;
        }
        throw e;
    }

    /* renamed from: a */
    public long mo2496a() {
        m2454g();
        return f.getTimeInMillis();
    }

    /* renamed from: a */
    public void m2465a(int i) {
        this.f1557C = i;
        this.f1559x = (byte) 99;
    }

    /* renamed from: a */
    public void m2466a(WDEntier4 wDEntier4) {
        setValeur(wDEntier4.getInt());
    }

    /* renamed from: a */
    public void m2467a(WDEntier8 wDEntier8) {
        setValeur((WDObjet) wDEntier8);
    }

    /* renamed from: a */
    public final void m2468a(Calendar calendar) {
        this.f1560y = calendar.get(11);
        this.f1555A = calendar.get(12);
        this.f1556B = calendar.get(13);
        this.f1557C = calendar.get(14);
        this.f1561z = null;
        this.f1559x = (byte) 0;
    }

    /* renamed from: b */
    public void m2469b(String str) {
        try {
            if (str.equals(f1554D[0])) {
                this.f1558w = (byte) 1;
                return;
            }
            try {
                if (str.equals(f1554D[1])) {
                    this.f1558w = (byte) 2;
                } else {
                    this.f1558w = (byte) 0;
                }
            } catch (InvalidParameterException e) {
                throw e;
            }
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    /* renamed from: c */
    public void m2470c() throws WDException {
        try {
            if (m2460s() > 0) {
                WDErreurManager.m2883a(C0745b.m3222b(f1554D[5], new String[0]));
            }
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: c */
    public void m2471c(int i) {
        this.f1555A = i;
        this.f1559x = (byte) 99;
    }

    /* renamed from: e */
    public String m2472e() {
        return C0725i.m3024a(this.f1556B, 2);
    }

    /* renamed from: f */
    public final int m2473f() {
        return this.f1560y;
    }

    /* renamed from: g */
    public void m2474g(int i) {
        this.f1556B = i;
        this.f1559x = (byte) 99;
    }

    public byte getByte() {
        return (byte) getInt();
    }

    public String getDateHeure() {
        WDDateHeure wDDateHeure = new WDDateHeure();
        wDDateHeure.setPartieHeure(this);
        return wDDateHeure.getString();
    }

    public String getHeure() {
        return getString();
    }

    public int getInt() {
        return (((this.f1560y * 360000) + (this.f1555A * 6000)) + (this.f1556B * 100)) + (this.f1557C / 10);
    }

    public Object getJSONValue() {
        return C0725i.m3028a(this);
    }

    public long getLong() {
        return (long) getInt();
    }

    public WDEntier4 getMilliSeconde() {
        return new WDEntier4(this.f1557C);
    }

    public WDEntier4 getMinute() {
        return new WDEntier4(this.f1555A);
    }

    public String getNomType() {
        return C0745b.m3220a(f1554D[8], new String[0]);
    }

    public WDEntier4 getSeconde() {
        return new WDEntier4(this.f1556B);
    }

    public short getShort() {
        return (short) getInt();
    }

    public String getString() {
        try {
            return this.f1561z != null ? this.f1561z : new StringBuffer(9).append(m2481l()).append(m2485o()).append(m2472e()).append(m2482m()).toString();
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public WDEntier4 getTHeure() {
        return new WDEntier4(this.f1560y);
    }

    public int getTypeVar() {
        return 25;
    }

    public String getTypeXMLPourSerialisation() {
        return f1554D[2];
    }

    public String getValeurXMLPourSerialisation() {
        return C0725i.m3028a(this);
    }

    /* renamed from: h */
    public String m2475h() {
        try {
            switch (this.f1558w) {
                case (byte) 1:
                    return f1554D[0];
                case (byte) 2:
                    return f1554D[1];
                default:
                    return "";
            }
        } catch (InvalidParameterException e) {
            throw e;
        }
        throw e;
    }

    /* renamed from: h */
    public void m2476h(int i) {
        this.f1560y = i;
        this.f1559x = (byte) 99;
    }

    /* renamed from: i */
    public final int m2477i() {
        return this.f1556B;
    }

    public boolean isHeure() {
        return true;
    }

    public boolean isVarTemps() {
        return true;
    }

    /* renamed from: j */
    public Object m2478j() {
        try {
            return m2460s() > 0 ? "" : new Time(mo2496a());
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    /* renamed from: j */
    public void m2479j(int i) {
        if (i < 0) {
            try {
                m2457l(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2470c();
        int i2 = this.f1560y + i;
        if (i2 > 23) {
            try {
                m2454g();
                f.add(11, i);
                m2458p();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        m2483m(i2);
    }

    /* renamed from: k */
    public boolean m2480k() {
        try {
            return m2460s() == 0;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    /* renamed from: l */
    public String m2481l() {
        return C0725i.m3024a(this.f1560y, 2);
    }

    /* renamed from: m */
    public String m2482m() {
        return C0725i.m3024a(this.f1557C, 3);
    }

    /* renamed from: m */
    public void m2483m(int i) {
        if (i < 0 || i > 23) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1554D[12], "" + i, C0745b.m3219a(f1554D[8])) + "\n" + C0745b.m3222b(f1554D[11], C0745b.m3219a(f1554D[8]), "0", f1554D[16]));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        try {
            if (m2460s() > 0) {
                m2447a(i, this.f1555A, this.f1556B, this.f1557C);
            } else {
                this.f1560y = i;
            }
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    /* renamed from: n */
    public final int m2484n() {
        return this.f1555A;
    }

    /* renamed from: o */
    public String m2485o() {
        return C0725i.m3024a(this.f1555A, 2);
    }

    public cb opDec() {
        m2449b(10);
        return this;
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
            switch (C0789n.f2026a[eWDPropriete.ordinal()]) {
                case 1:
                    m2457l(i);
                    return;
                case 2:
                    m2453f(i);
                    return;
                case 3:
                    m2456k(i);
                    return;
                case 4:
                    m2449b(i);
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

    public boolean opDiff(String str) {
        try {
            return getString().compareTo(str) != 0;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opEgal(String str) {
        try {
            return getString().compareTo(str) == 0;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public cb opInc() {
        m2452e(10);
        return this;
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
            switch (C0789n.f2026a[eWDPropriete.ordinal()]) {
                case 1:
                    m2479j(i);
                    return;
                case 2:
                    m2451d(i);
                    return;
                case 3:
                    m2455i(i);
                    return;
                case 4:
                    m2452e(i);
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

    public boolean opInf(String str) {
        try {
            return getString().compareTo(str) < 0;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opInfEgal(String str) {
        try {
            return getString().compareTo(str) <= 0;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public cb opMoins(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        switch (valeur.getTypeVar()) {
            case 25:
                return new WDDuree(m2486r() - ((WDHeure) valeur).m2486r());
            case 27:
                try {
                    WDHeure wDHeure = (WDHeure) clone();
                    wDHeure.m2449b(((WDDuree) valeur).getInt());
                    return wDHeure;
                } catch (CloneNotSupportedException e) {
                    return this;
                }
            default:
                WDErreurManager.m2883a(C0745b.m3222b(f1554D[15], "-", C0745b.m3220a(f1554D[8], new String[0]), valeur.getNomType()));
                return null;
        }
    }

    public cb opPlus(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        WDDuree wDDuree = (WDDuree) valeur.checkType(WDDuree.class);
        if (wDDuree == null) {
            return new WDChaine(getString() + valeur.getString());
        }
        try {
            WDHeure wDHeure = (WDHeure) clone();
            wDHeure.m2479j(wDDuree.m2404e());
            wDHeure.m2451d(wDDuree.m2409i());
            wDHeure.m2455i(wDDuree.m2402c());
            wDHeure.m2452e(wDDuree.m2406g());
            return wDHeure;
        } catch (CloneNotSupportedException e) {
            return this;
        }
    }

    public cb opPlus(String str) {
        return new WDChaine(getString() + str);
    }

    public boolean opSup(String str) {
        try {
            return getString().compareTo(str) > 0;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public boolean opSupEgal(String str) {
        try {
            return getString().compareTo(str) >= 0;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    /* renamed from: r */
    public long m2486r() {
        return (long) ((((this.f1560y * hb.f2077j) + (this.f1555A * hb.f2073f)) + (this.f1556B * 1000)) + this.f1557C);
    }

    public void razVariable() {
        m2450d();
    }

    public void release() {
        this.f1561z = null;
    }

    public void setJSONValue(String str) {
        C0725i.m3021a(str, this);
    }

    public void setMilliSeconde(int i) {
        if (i < 0 || i > C0607n.Qv) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1554D[12], "" + i, C0745b.m3219a(f1554D[13])) + "\n" + C0745b.m3222b(f1554D[11], C0745b.m3219a(f1554D[13]), "0", f1554D[14]));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        try {
            if (m2460s() > 0) {
                m2447a(this.f1560y, this.f1555A, this.f1556B, i);
            } else {
                this.f1557C = i;
            }
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    public void setMinute(int i) {
        if (i < 0 || i > 59) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1554D[12], "" + i, C0745b.m3219a(f1554D[10])) + "\n" + C0745b.m3222b(f1554D[11], C0745b.m3219a(f1554D[10]), "0", f1554D[9]));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        try {
            if (m2460s() > 0) {
                m2447a(this.f1560y, i, this.f1556B, this.f1557C);
            } else {
                this.f1555A = i;
            }
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    public void setSeconde(int i) {
        if (i < 0 || i > 59) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1554D[12], "" + i, C0745b.m3219a(f1554D[17])) + "\n" + C0745b.m3222b(f1554D[11], C0745b.m3219a(f1554D[17]), "0", f1554D[9]));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        try {
            if (m2460s() > 0) {
                m2447a(this.f1560y, this.f1555A, i, this.f1557C);
            } else {
                this.f1556B = i;
            }
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    public void setTHeure(int i) {
        m2483m(i);
    }

    public void setValeur(int i) {
        m2448a((long) (i * 10));
    }

    public void setValeur(long j) {
        WDErreurManager.m2883a(C0745b.m3222b(f1554D[7], C0745b.m3220a(f1554D[6], new String[0]), C0745b.m3220a(f1554D[8], new String[0])));
    }

    public void setValeur(WDObjet wDObjet) {
        try {
            if (wDObjet.isEntier()) {
                if (!(wDObjet instanceof WDEntier8)) {
                    m2448a((long) (wDObjet.getInt() * 10));
                    return;
                }
            }
            setValeur(wDObjet.getValeur().getHeure());
        } catch (InvalidParameterException e) {
            throw e;
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    public void setValeur(String str) {
        try {
            this.f1561z = str.substring(0, Math.min(9, str.length()));
            switch (str.length()) {
                case 0:
                    this.f1560y = 0;
                    this.f1555A = 0;
                    this.f1556B = 0;
                    this.f1557C = 0;
                    break;
                case 1:
                    this.f1560y = C0725i.m3064d(this.f1561z.substring(0, 1) + "0");
                    this.f1555A = 0;
                    this.f1556B = 0;
                    this.f1557C = 0;
                    break;
                case 2:
                    this.f1560y = C0725i.m3064d(this.f1561z.substring(0, 2));
                    this.f1555A = 0;
                    this.f1556B = 0;
                    this.f1557C = 0;
                    break;
                case 3:
                    this.f1560y = C0725i.m3064d(this.f1561z.substring(0, 2));
                    this.f1555A = C0725i.m3064d(this.f1561z.substring(2, 3) + "0");
                    this.f1556B = 0;
                    this.f1557C = 0;
                    break;
                case 4:
                    this.f1560y = C0725i.m3064d(this.f1561z.substring(0, 2));
                    this.f1555A = C0725i.m3064d(this.f1561z.substring(2, 4));
                    this.f1556B = 0;
                    this.f1557C = 0;
                    break;
                case 5:
                    this.f1560y = C0725i.m3064d(this.f1561z.substring(0, 2));
                    this.f1555A = C0725i.m3064d(this.f1561z.substring(2, 4));
                    this.f1556B = C0725i.m3064d(this.f1561z.substring(4, 5) + "0");
                    this.f1557C = 0;
                    break;
                case 6:
                    this.f1560y = C0725i.m3064d(this.f1561z.substring(0, 2));
                    this.f1555A = C0725i.m3064d(this.f1561z.substring(2, 4));
                    this.f1556B = C0725i.m3064d(this.f1561z.substring(4, 6));
                    this.f1557C = 0;
                    break;
                case 7:
                    this.f1560y = C0725i.m3064d(this.f1561z.substring(0, 2));
                    this.f1555A = C0725i.m3064d(this.f1561z.substring(2, 4));
                    this.f1556B = C0725i.m3064d(this.f1561z.substring(4, 6));
                    this.f1557C = C0725i.m3064d(this.f1561z.substring(6, 7) + f1554D[3]);
                    break;
                case 8:
                    this.f1560y = C0725i.m3064d(this.f1561z.substring(0, 2));
                    this.f1555A = C0725i.m3064d(this.f1561z.substring(2, 4));
                    this.f1556B = C0725i.m3064d(this.f1561z.substring(4, 6));
                    this.f1557C = C0725i.m3064d(this.f1561z.substring(6, 8) + "0");
                    break;
                default:
                    this.f1560y = C0725i.m3064d(this.f1561z.substring(0, 2));
                    this.f1555A = C0725i.m3064d(this.f1561z.substring(2, 4));
                    this.f1556B = C0725i.m3064d(this.f1561z.substring(4, 6));
                    this.f1557C = C0725i.m3064d(this.f1561z.substring(6, 9));
                    break;
            }
            this.f1559x = m2459q();
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public void setValeurXMLDeserialisation(String str) {
        C0725i.m3021a(str, this);
    }

    /* renamed from: t */
    public Object m2487t() {
        try {
            return m2460s() > 0 ? "" : new StringBuffer(12).append(m2481l()).append(":").append(m2485o()).append(":").append(m2472e()).append(".").append(m2482m()).toString();
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    /* renamed from: u */
    public final int m2488u() {
        return this.f1557C;
    }
}
