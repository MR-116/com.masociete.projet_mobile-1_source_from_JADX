package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0613b;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.hb;
import fr.pcsoft.wdjava.core.utils.zb;
import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.Date;

public class WDDate extends cb implements hb {
    /* renamed from: B */
    private static final String[] f1565B = new String[]{m2506z(m2507z("\u0017\b")), m2506z(m2507z("\u0007o\u0001A!qk\u001fD*rx\fD af\u0010_+tk\tH0a")), m2506z(m2507z("\u0007{\u000f_*af\u0010_+tk\tH0a")), m2506z(m2507z("\u0007s\u000fX6")), m2506z(m2507z("\u0007}\u0001Y!{p\u000e[%hp\u0004H;\u0017")), m2506z(m2507z("@X4h")), m2506z(m2507z("\u0007|\u0012_!qk\u001fK+vt\u0001Y;`x\u0014H")), m2506z(m2507z("\u0007x\u000eC!af\tC2eu\tI!")), m2506z(m2507z("\u0007}\u0001Y!{p\u000e[%hp\u0004H")), m2506z(m2507z("\u0007s\u000fX6{p\u000e[%hp\u0004H")), m2506z(m2507z("\u0007t\u000fD7{p\u000e[%hp\u0004H")), m2506z(m2507z("\u001d\u0000y4")), m2506z(m2507z("\u0007x\u000eC!a")), m2506z(m2507z("p@0hDMW#b\tTX4d\u0006H\\`}\u000bQK`a\u0005\u0004Z/`\u0014EK!d\u0017KW")), m2506z(m2507z("\u0007t\u000fD7")), m2506z(m2507z("\u0015\u000b")), m2506z(m2507z("\u0007}\u0001Y!")), m2506z(m2507z("\u0007v\u0010H6em\tB*{p\u000eY!v}\tY!"))};
    public static final C0613b<WDDate> CREATOR = new C0774d();
    /* renamed from: A */
    private String f1566A = null;
    /* renamed from: w */
    private byte f1567w = (byte) 0;
    /* renamed from: x */
    private int f1568x;
    /* renamed from: y */
    private int f1569y;
    /* renamed from: z */
    private int f1570z;

    public WDDate() {
        m2504v();
    }

    public WDDate(double d) {
        setValeur(d);
    }

    public WDDate(int i) {
        setValeur(C0725i.m3070e(C0725i.m3067d(i)));
    }

    public WDDate(int i, int i2, int i3) {
        this.f1569y = i;
        this.f1570z = i2;
        this.f1568x = i3;
    }

    public WDDate(WDObjet wDObjet) {
        setValeur(wDObjet);
    }

    public WDDate(String str) {
        setValeur(str);
    }

    public WDDate(boolean z) {
        setValeur(z);
    }

    /* renamed from: a */
    private void m2495a(int i, int i2, int i3) {
        f.clear();
        f.set(1, i);
        f.set(2, Math.max(0, i2 - 1));
        if (i3 > f.getActualMaximum(5)) {
            i3 = f.getActualMaximum(5);
        }
        f.set(5, Math.max(1, i3));
        m2512a(f);
    }

    /* renamed from: c */
    private int m2496c() {
        try {
            if (this.f1567w == (byte) 99) {
                this.f1567w = m2505w();
            }
            return this.f1567w;
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    /* renamed from: c */
    private void m2497c(Calendar calendar) {
        calendar.clear();
        calendar.set(this.f1569y, this.f1570z - 1, this.f1568x);
    }

    /* renamed from: d */
    private void m2498d(int i) {
        if (i < 0) {
            try {
                m2524i(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2513a(false);
        int i2 = this.f1570z - i;
        if (i2 < 1) {
            try {
                m2502k();
                f.add(2, -i);
                m2503o();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setMois(i2);
    }

    /* renamed from: f */
    private void m2499f(int i) {
        if (i < 0) {
            try {
                m2501h(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2513a(false);
        int i2 = this.f1569y - i;
        if (i2 < 1) {
            try {
                m2502k();
                f.add(1, -i);
                m2503o();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setAnnee(i2);
    }

    /* renamed from: g */
    private void m2500g(int i) {
        if (i < 0) {
            try {
                m2516c(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2513a(false);
        int i2 = this.f1568x - i;
        if (i2 < 1) {
            try {
                m2502k();
                f.add(6, -i);
                m2503o();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setJour(i2);
    }

    /* renamed from: h */
    private void m2501h(int i) {
        if (i < 0) {
            try {
                m2499f(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2513a(false);
        int i2 = this.f1569y + i;
        if (i2 > 9999) {
            try {
                m2502k();
                f.add(1, i);
                m2503o();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setAnnee(i2);
    }

    /* renamed from: k */
    private void m2502k() {
        m2497c(f);
    }

    /* renamed from: o */
    private void m2503o() {
        m2512a(f);
    }

    /* renamed from: v */
    private void m2504v() {
        try {
            if (hb.f2069b != null) {
                setValeur(hb.f2069b);
            } else {
                setValeur(C0725i.m3070e(new Date()));
            }
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: w */
    private byte m2505w() {
        /*
        r4 = this;
        r2 = 8;
        r0 = 1;
        r1 = r4.f1566A;
        if (r1 == 0) goto L_0x001e;
    L_0x0007:
        r1 = r4.f1566A;
        r1 = r1.length();
        r1 = java.lang.Math.min(r1, r2);
        if (r1 < r2) goto L_0x001b;
    L_0x0013:
        r1 = r4.f1566A;	 Catch:{ InvalidParameterException -> 0x001c }
        r1 = fr.pcsoft.wdjava.core.utils.C0808l.m4044c(r1);	 Catch:{ InvalidParameterException -> 0x001c }
        if (r1 != 0) goto L_0x001e;
    L_0x001b:
        return r0;
    L_0x001c:
        r0 = move-exception;
        throw r0;
    L_0x001e:
        r1 = r4.f1569y;	 Catch:{ InvalidParameterException -> 0x002a }
        if (r1 < r0) goto L_0x0028;
    L_0x0022:
        r1 = r4.f1569y;	 Catch:{ InvalidParameterException -> 0x002c }
        r2 = 9999; // 0x270f float:1.4012E-41 double:4.94E-320;
        if (r1 <= r2) goto L_0x002e;
    L_0x0028:
        r0 = 4;
        goto L_0x001b;
    L_0x002a:
        r0 = move-exception;
        throw r0;	 Catch:{ InvalidParameterException -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        throw r0;
    L_0x002e:
        r1 = r4.f1570z;	 Catch:{ InvalidParameterException -> 0x003a }
        if (r1 < r0) goto L_0x0038;
    L_0x0032:
        r1 = r4.f1570z;	 Catch:{ InvalidParameterException -> 0x003c }
        r2 = 12;
        if (r1 <= r2) goto L_0x003e;
    L_0x0038:
        r0 = 2;
        goto L_0x001b;
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ InvalidParameterException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;
    L_0x003e:
        r1 = r4.f1568x;	 Catch:{ InvalidParameterException -> 0x0071 }
        if (r1 < r0) goto L_0x0048;
    L_0x0042:
        r0 = r4.f1568x;	 Catch:{ InvalidParameterException -> 0x0073 }
        r1 = 28;
        if (r0 <= r1) goto L_0x0079;
    L_0x0048:
        r0 = f;	 Catch:{ InvalidParameterException -> 0x0075 }
        r0.clear();	 Catch:{ InvalidParameterException -> 0x0075 }
        r0 = f;	 Catch:{ InvalidParameterException -> 0x0075 }
        r1 = r4.f1569y;	 Catch:{ InvalidParameterException -> 0x0075 }
        r2 = r4.f1570z;	 Catch:{ InvalidParameterException -> 0x0075 }
        r2 = r2 + -1;
        r3 = 1;
        r0.set(r1, r2, r3);	 Catch:{ InvalidParameterException -> 0x0075 }
        r0 = r4.f1568x;	 Catch:{ InvalidParameterException -> 0x0075 }
        r1 = f;	 Catch:{ InvalidParameterException -> 0x0075 }
        r2 = 5;
        r1 = r1.getActualMinimum(r2);	 Catch:{ InvalidParameterException -> 0x0075 }
        if (r0 < r1) goto L_0x006f;
    L_0x0064:
        r0 = r4.f1568x;	 Catch:{ InvalidParameterException -> 0x0077 }
        r1 = f;	 Catch:{ InvalidParameterException -> 0x0077 }
        r2 = 5;
        r1 = r1.getActualMaximum(r2);	 Catch:{ InvalidParameterException -> 0x0077 }
        if (r0 <= r1) goto L_0x0079;
    L_0x006f:
        r0 = 3;
        goto L_0x001b;
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ InvalidParameterException -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        throw r0;	 Catch:{ InvalidParameterException -> 0x0075 }
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ InvalidParameterException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        r0 = 0;
        r4.f1566A = r0;
        r0 = 0;
        goto L_0x001b;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.types.WDDate.w():byte");
    }

    /* renamed from: z */
    private static String m2506z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 36;
                    break;
                case 1:
                    i2 = 57;
                    break;
                case 2:
                    i2 = 64;
                    break;
                case 3:
                    i2 = 13;
                    break;
                default:
                    i2 = 100;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2507z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 100);
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
                case 24:
                case 28:
                case 30:
                    return (double) getString().compareTo(valeur.getString());
                case 26:
                    return (double) getString().compareTo(((WDDateHeure) valeur).m2348c());
                default:
                    throw new InvalidParameterException(f1565B[13]);
            }
        } catch (InvalidParameterException e) {
            throw e;
        }
        throw e;
    }

    /* renamed from: a */
    public long mo2496a() {
        return m2514b(f);
    }

    /* renamed from: a */
    public void m2510a(int i) {
        this.f1569y = i;
        this.f1567w = (byte) 99;
    }

    /* renamed from: a */
    public void m2511a(zb zbVar) {
        this.f1569y = zbVar.m4199a();
        this.f1570z = zbVar.m4204c();
        this.f1568x = zbVar.m4207e();
        this.f1566A = null;
        this.f1567w = (byte) 0;
    }

    /* renamed from: a */
    public final void m2512a(Calendar calendar) {
        this.f1569y = calendar.get(1);
        this.f1570z = calendar.get(2) + 1;
        this.f1568x = calendar.get(5);
        this.f1566A = null;
        this.f1567w = (byte) 0;
    }

    /* renamed from: a */
    public void m2513a(boolean z) throws WDException {
        try {
            if (m2496c() <= 0) {
                return;
            }
            if (z) {
                try {
                    switch (this.f1567w) {
                        case (byte) 1:
                            WDErreurManager.m2883a(C0745b.m3222b(f1565B[6], new String[0]));
                            return;
                        case (byte) 2:
                            WDErreurManager.m2883a(C0745b.m3222b(f1565B[10], new String[0]));
                            return;
                        case (byte) 3:
                            f.clear();
                            f.set(this.f1569y, this.f1570z - 1, 1);
                            WDErreurManager.m2883a(C0745b.m3222b(f1565B[9], String.valueOf(f.getActualMinimum(5)), String.valueOf(f.getActualMaximum(5))));
                            return;
                        case (byte) 4:
                            WDErreurManager.m2883a(C0745b.m3222b(f1565B[7], new String[0]));
                            return;
                        default:
                            return;
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
            WDErreurManager.m2883a(C0745b.m3222b(f1565B[8], new String[0]));
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    /* renamed from: b */
    public long m2514b(Calendar calendar) {
        m2497c(calendar);
        return calendar.getTimeInMillis();
    }

    /* renamed from: b */
    public void m2515b(int i) {
        this.f1570z = i;
        this.f1567w = (byte) 99;
    }

    /* renamed from: c */
    public void m2516c(int i) {
        if (i < 0) {
            try {
                m2500g(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2513a(false);
        int i2 = this.f1568x + i;
        if (i2 > 28) {
            try {
                m2502k();
                f.add(6, i);
                m2503o();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setJour(i2);
    }

    /* renamed from: d */
    public String m2517d() {
        f.clear();
        f.set(this.f1569y, hb.m3937j(this.f1570z), this.f1568x);
        return hb.m3903a(hb.m3936i(f.get(7)));
    }

    /* renamed from: e */
    public int m2518e() {
        m2502k();
        return f.get(6);
    }

    /* renamed from: e */
    public void m2519e(int i) {
        this.f1568x = i;
        this.f1567w = (byte) 99;
    }

    /* renamed from: f */
    public boolean m2520f() {
        try {
            boolean z = m2496c() == 0;
            if (!z) {
                return z;
            }
            try {
                if (this.f1569y != 1582) {
                    return z;
                }
                if (this.f1570z != 10) {
                    return z;
                }
                try {
                    return (this.f1568x < 5 || this.f1568x > 14) ? z : false;
                } catch (InvalidParameterException e) {
                    throw e;
                }
            } catch (InvalidParameterException e2) {
                throw e2;
            } catch (InvalidParameterException e22) {
                throw e22;
            }
        } catch (InvalidParameterException e222) {
            throw e222;
        }
    }

    /* renamed from: g */
    public int m2521g() {
        f.clear();
        f.set(this.f1569y, hb.m3937j(this.f1570z), this.f1568x);
        return hb.m3936i(f.get(7));
    }

    public WDEntier4 getAnnee() {
        return new WDEntier4(this.f1569y);
    }

    public byte getByte() {
        return (byte) getInt();
    }

    public String getDate() {
        return getString();
    }

    public String getDateHeure() {
        WDDateHeure wDDateHeure = new WDDateHeure();
        wDDateHeure.setPartieDate(this);
        return wDDateHeure.getString();
    }

    public int getInt() {
        try {
            if (m2496c() > 0) {
                WDErreurManager.m2883a(C0745b.m3222b(f1565B[4], new String[0]));
            }
            return C0725i.m3012a(this.f1569y, this.f1570z, this.f1568x);
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public Object getJSONValue() {
        return C0725i.m3026a(this);
    }

    public WDEntier4 getJour() {
        return new WDEntier4(this.f1568x);
    }

    public long getLong() {
        return (long) getInt();
    }

    public WDEntier4 getMois() {
        return new WDEntier4(this.f1570z);
    }

    public String getNomType() {
        return C0745b.m3220a(f1565B[16], new String[0]);
    }

    public short getShort() {
        return (short) getInt();
    }

    public String getString() {
        try {
            return this.f1566A != null ? this.f1566A : new StringBuffer(8).append(m2528n()).append(m2535x()).append(m2526l()).toString();
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public int getTypeVar() {
        return 24;
    }

    public String getTypeXMLPourSerialisation() {
        return f1565B[5];
    }

    public String getValeurXMLPourSerialisation() {
        return C0725i.m3026a(this);
    }

    /* renamed from: h */
    public String m2522h() {
        return hb.m3934g(this.f1570z);
    }

    /* renamed from: i */
    public int m2523i() {
        f.clear();
        f.setMinimalDaysInFirstWeek(4);
        f.set(this.f1569y, this.f1570z - 1, this.f1568x);
        int i = f.get(3);
        try {
            if (this.f1570z == 1 && (i == 53 || i == 52)) {
                return 0;
            }
            try {
                return (this.f1570z == 12 && i == 1) ? 53 : i;
            } catch (InvalidParameterException e) {
                throw e;
            }
        } catch (InvalidParameterException e2) {
            throw e2;
        } catch (InvalidParameterException e22) {
            throw e22;
        }
    }

    /* renamed from: i */
    public void m2524i(int i) {
        if (i < 0) {
            try {
                m2498d(Math.abs(i));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        m2513a(false);
        int i2 = this.f1570z + i;
        if (i2 > 12) {
            try {
                m2502k();
                f.add(2, i);
                m2503o();
                return;
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
        setMois(i2);
    }

    public boolean isDate() {
        return true;
    }

    public boolean isNull() {
        try {
            if (m2496c() > 0) {
                WDErreurManager.m2883a(C0745b.m3222b(f1565B[4], new String[0]));
            }
            try {
                if (this.f1569y != hb.f1513r) {
                    return false;
                }
                if (this.f1570z != 12) {
                    return false;
                }
                try {
                    return this.f1568x == 31;
                } catch (InvalidParameterException e) {
                    throw e;
                }
            } catch (InvalidParameterException e2) {
                throw e2;
            } catch (InvalidParameterException e22) {
                throw e22;
            }
        } catch (InvalidParameterException e222) {
            throw e222;
        }
    }

    public boolean isVarTemps() {
        return true;
    }

    /* renamed from: j */
    public Object m2525j() {
        try {
            return m2496c() > 0 ? "" : new StringBuffer(10).append(m2528n()).append("-").append(m2535x()).append("-").append(m2526l()).toString();
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    /* renamed from: l */
    public String m2526l() {
        return C0725i.m3024a(this.f1568x, 2);
    }

    /* renamed from: m */
    public boolean m2527m() {
        return f.isLeapYear(this.f1569y);
    }

    /* renamed from: n */
    public String m2528n() {
        return C0725i.m3024a(this.f1569y, 4);
    }

    public cb opDec() {
        m2500g(1);
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
            switch (C0792t.f2027a[eWDPropriete.ordinal()]) {
                case 1:
                    m2499f(i);
                    return;
                case 2:
                    m2498d(i);
                    return;
                case 3:
                    m2500g(i);
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
        m2516c(1);
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
            switch (C0792t.f2027a[eWDPropriete.ordinal()]) {
                case 1:
                    m2501h(i);
                    return;
                case 2:
                    m2524i(i);
                    return;
                case 3:
                    m2516c(i);
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
            case 24:
                return new WDDuree(((long) (getInt() - valeur.getInt())) * hb.f2079l);
            case 27:
                try {
                    WDDate wDDate = (WDDate) clone();
                    wDDate.m2500g(((WDDuree) valeur).m2408h());
                    return wDDate;
                } catch (CloneNotSupportedException e) {
                    return this;
                }
            default:
                WDErreurManager.m2883a(C0745b.m3222b(f1565B[17], "-", C0745b.m3220a(f1565B[16], new String[0]), valeur.getNomType()));
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
            WDDate wDDate = (WDDate) clone();
            wDDate.m2516c(wDDuree.m2408h());
            return wDDate;
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

    /* renamed from: p */
    public final int m2529p() {
        return this.f1570z;
    }

    /* renamed from: q */
    public final int m2530q() {
        return this.f1569y;
    }

    /* renamed from: r */
    public final int m2531r() {
        return this.f1568x;
    }

    public void razVariable() {
        m2504v();
    }

    public void release() {
        this.f1566A = null;
    }

    /* renamed from: s */
    public String m2532s() {
        f.clear();
        f.set(this.f1569y, hb.m3937j(this.f1570z), this.f1568x);
        return hb.m3922c(hb.m3936i(f.get(7)));
    }

    public void setAnnee(int i) {
        if (i < 1 || i > 9999) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1565B[1], "" + i, C0745b.m3219a(f1565B[12])) + "\n" + C0745b.m3222b(f1565B[2], C0745b.m3219a(f1565B[12]), "1", f1565B[11]));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        try {
            if (m2496c() > 0) {
                m2495a(i, this.f1570z, this.f1568x);
                return;
            }
            try {
                if (this.f1570z == 2) {
                    if (this.f1568x == 29) {
                        m2495a(i, this.f1570z, this.f1568x);
                        return;
                    }
                }
                this.f1569y = i;
            } catch (InvalidParameterException e2) {
                throw e2;
            } catch (InvalidParameterException e22) {
                throw e22;
            }
        } catch (InvalidParameterException e222) {
            throw e222;
        }
    }

    public void setJSONValue(String str) {
        C0725i.m3016a(str, this);
    }

    public void setJour(int i) {
        if (i < 1 || i > 31) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1565B[1], "" + i, C0745b.m3219a(f1565B[3])) + "\n" + C0745b.m3222b(f1565B[2], C0745b.m3219a(f1565B[3]), "1", f1565B[0]));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        try {
            if (m2496c() > 0) {
                m2495a(this.f1569y, this.f1570z, i);
            } else if (i > 28) {
                try {
                    m2495a(this.f1569y, this.f1570z, i);
                } catch (InvalidParameterException e2) {
                    throw e2;
                }
            } else {
                this.f1568x = i;
            }
        } catch (InvalidParameterException e22) {
            throw e22;
        }
    }

    public void setMois(int i) {
        if (i < 1 || i > 12) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1565B[1], "" + i, C0745b.m3219a(f1565B[14])) + "\n" + C0745b.m3222b(f1565B[2], C0745b.m3219a(f1565B[14]), "1", f1565B[15]));
                return;
            } catch (InvalidParameterException e) {
                throw e;
            }
        }
        try {
            if (m2496c() > 0) {
                m2495a(this.f1569y, i, this.f1568x);
                return;
            }
            try {
                if (this.f1568x > 28) {
                    m2495a(this.f1569y, i, this.f1568x);
                } else {
                    this.f1570z = i;
                }
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        } catch (InvalidParameterException e22) {
            throw e22;
        }
    }

    public void setValeur(int i) {
        try {
            setValeur(C0725i.m3070e(C0725i.m3067d(i)));
            if (!m2520f()) {
                WDErreurManager.m2883a(C0745b.m3222b(f1565B[4], new String[0]));
            }
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public void setValeur(long j) {
        setValeur((int) j);
    }

    public void setValeur(WDObjet wDObjet) {
        try {
            setValeur(wDObjet.getValeur().getDate());
            if (!wDObjet.isNumerique()) {
                return;
            }
            if (!m2520f()) {
                WDErreurManager.m2883a(C0745b.m3222b(f1565B[4], new String[0]));
            }
        } catch (InvalidParameterException e) {
            throw e;
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    public void setValeur(String str) {
        try {
            this.f1566A = str.substring(0, Math.min(8, str.length()));
            switch (str.length()) {
                case 0:
                case 1:
                case 2:
                case 3:
                    this.f1569y = 0;
                    this.f1570z = 0;
                    this.f1568x = 0;
                    break;
                case 4:
                case 5:
                    this.f1569y = C0725i.m3064d(str.substring(0, 4));
                    this.f1570z = 0;
                    this.f1568x = 0;
                    break;
                case 6:
                case 7:
                    this.f1569y = C0725i.m3064d(str.substring(0, 4));
                    this.f1570z = C0725i.m3064d(str.substring(4, 6));
                    this.f1568x = 0;
                    break;
                default:
                    this.f1569y = C0725i.m3064d(str.substring(0, 4));
                    this.f1570z = C0725i.m3064d(str.substring(4, 6));
                    this.f1568x = C0725i.m3064d(str.substring(6, 8));
                    break;
            }
            this.f1567w = m2505w();
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    public void setValeurXMLDeserialisation(String str) {
        C0725i.m3016a(str, this);
    }

    /* renamed from: t */
    public Object m2533t() {
        try {
            return m2496c() > 0 ? "" : new java.sql.Date(mo2496a());
        } catch (InvalidParameterException e) {
            throw e;
        }
    }

    /* renamed from: u */
    public String m2534u() {
        return hb.m3938k(this.f1570z);
    }

    /* renamed from: x */
    public String m2535x() {
        return C0725i.m3024a(this.f1570z, 2);
    }
}
